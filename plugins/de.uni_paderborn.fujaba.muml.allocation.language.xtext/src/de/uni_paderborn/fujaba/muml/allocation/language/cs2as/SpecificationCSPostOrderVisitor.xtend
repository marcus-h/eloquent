package de.uni_paderborn.fujaba.muml.allocation.language.cs2as

import de.uni_paderborn.fujaba.muml.allocation.language.cs.ConstraintCS
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSPostOrderVisitor
import java.util.Collections
import java.util.List
import org.eclipse.jdt.annotation.NonNull
import org.eclipse.ocl.examples.pivot.ExpressionInOCL
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil
import org.eclipse.ocl.examples.xtext.base.cs2as.BasicContinuation
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2PivotConversion
import org.eclipse.ocl.examples.xtext.base.cs2as.Continuation
import org.eclipse.ocl.examples.xtext.base.cs2as.Dependency
import org.eclipse.ocl.examples.xtext.base.cs2as.SingleContinuation

class SpecificationCSPostOrderVisitor extends LanguageSpecificationCSPostOrderVisitor {
	
	new(CS2PivotConversion context) {
		super(context)
	}
	
	protected static class PreContextCSCompletion extends SingleContinuation<ConstraintCS> {
		private static final String MISSING_ContextCSCompletion = "Expected an instance of type ContextCSCompletion in %s"
		
		new(CS2PivotConversion context,	ConstraintCS csElement) {
			super(context, null, null, csElement, Collections.<Dependency>emptyList)
		}

		override public BasicContinuation<?> execute() {
			/* Before the ContextCSCompletion (returned by visitContextCS) can be executed, we
			 * have to refresh the context variable first.
			 */
			val ExpressionInOCL expressionInOCL = PivotUtil.getPivot(
				typeof(ExpressionInOCL),
				csElement.getExpression()
			)
			context.refreshContextVariable(expressionInOCL)
			null
		}
		
		override public void addTo(@NonNull List<BasicContinuation<?>> simpleContinuations) {
			val BasicContinuation<?> elm = simpleContinuations.findFirst[it instanceof ContextCSCompletion]
			if (elm == null) {
				// should never happen, because visitContextCS is supposed to return
				// a ContextCSCompletion in this situation
				throw new IllegalStateException(
					String.format(MISSING_ContextCSCompletion,simpleContinuations)
				)
			}
			// we have to be executed _before_ the ContextCSCompletion
			simpleContinuations.add(simpleContinuations.indexOf(elm), this)
		}
	}
	
	override public Continuation<?> visitConstraintCS(@NonNull ConstraintCS csElement) {
		// this should not return a Continuation (it should
		// end up with a call to visitNamedElement)
		super.visitConstraintCS(csElement)
		new SpecificationCSPostOrderVisitor.PreContextCSCompletion(context, csElement)
	}
	
}
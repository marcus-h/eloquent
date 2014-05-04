/**
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: de.uni_paderborn.fujaba.muml.allocation.language/model/LanguageSpecificationCS.genmodel
 *
 * Do not edit it.
 */
package	de.uni_paderborn.fujaba.muml.allocation.language.cs.util;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2as.EssentialOCLCSLeft2RightVisitor;
import org.eclipse.ocl.examples.pivot.Element;

/**
 * An AbstractLanguageSpecificationCSLeft2RightVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractLanguageSpecificationCSLeft2RightVisitor
	extends EssentialOCLCSLeft2RightVisitor
	implements LanguageSpecificationCSVisitor<Element>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractLanguageSpecificationCSLeft2RightVisitor(@NonNull CS2PivotConversion context) {
		super(context);
	}

	public @Nullable Element visitComponentResourceTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS csElement) {
		return visitInstanceTupleDescriptorCS(csElement);
	}

	public @Nullable Element visitConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ConstraintCS csElement) {
		return visitNamedElementCS(csElement);
	}

	public @Nullable Element visitInstanceTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.InstanceTupleDescriptorCS csElement) {
		return visitTupleDescriptorCS(csElement);
	}

	public @Nullable Element visitLocationConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	public @Nullable Element visitLocationTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationTupleDescriptorCS csElement) {
		return visitInstanceTupleDescriptorCS(csElement);
	}

	public @Nullable Element visitMeasureFunction(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.MeasureFunction csElement) {
		return visitModelElementCS(csElement);
	}

	public @Nullable Element visitQoSDimensionCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS csElement) {
		return visitNamedElementCS(csElement);
	}

	public @Nullable Element visitRequiredHardwareResourceInstanceConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	public @Nullable Element visitResourceConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ResourceConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	public @Nullable Element visitServiceCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ServiceCS csElement) {
		return visitNamedElementCS(csElement);
	}

	public @Nullable Element visitSpecificationCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS csElement) {
		return visitNamedElementCS(csElement);
	}

	public @Nullable Element visitTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.TupleDescriptorCS csElement) {
		return visitModelElementCS(csElement);
	}

	public @Nullable Element visitValueTupleDescriptor(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ValueTupleDescriptor csElement) {
		return visitTupleDescriptorCS(csElement);
	}
}

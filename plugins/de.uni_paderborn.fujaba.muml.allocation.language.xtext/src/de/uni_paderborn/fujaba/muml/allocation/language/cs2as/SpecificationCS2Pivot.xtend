package de.uni_paderborn.fujaba.muml.allocation.language.cs2as

import org.eclipse.ocl.examples.xtext.essentialocl.cs2as.EssentialOCLCS2Pivot
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.ocl.examples.pivot.resource.ASResource
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager
import org.eclipse.jdt.annotation.NonNull
import org.eclipse.ocl.examples.xtext.base.cs2as.Continuation
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2PivotConversion
import de.uni_paderborn.fujaba.muml.allocation.language.cs.util.LanguageSpecificationCSVisitor
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSContainmentVisitor
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSLeft2RightVisitor
import org.eclipse.ocl.examples.pivot.Element
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSPostOrderVisitor
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSPreOrderVisitor

class SpecificationCS2Pivot extends EssentialOCLCS2Pivot {
	
	new(Map<? extends Resource, ? extends ASResource> cs2asResourceMap, MetaModelManager metaModelManager) {
		super(cs2asResourceMap, metaModelManager)
	}
	
	@NonNull
	override protected LanguageSpecificationCSVisitor<Continuation<?>> createContainmentVisitor(@NonNull CS2PivotConversion converter) {
		new LanguageSpecificationCSContainmentVisitor(converter);
	}

	@NonNull
	override protected LanguageSpecificationCSVisitor<Element> createLeft2RightVisitor(@NonNull CS2PivotConversion converter) {
		new LanguageSpecificationCSLeft2RightVisitor(converter);
	}

	@NonNull
	override protected LanguageSpecificationCSVisitor<Continuation<?>> createPostOrderVisitor(@NonNull CS2PivotConversion converter) {
		new LanguageSpecificationCSPostOrderVisitor(converter);
	}

	@NonNull
	override protected LanguageSpecificationCSVisitor<Continuation<?>> createPreOrderVisitor(@NonNull CS2PivotConversion converter) {
		new LanguageSpecificationCSPreOrderVisitor(converter);
	}
	
}
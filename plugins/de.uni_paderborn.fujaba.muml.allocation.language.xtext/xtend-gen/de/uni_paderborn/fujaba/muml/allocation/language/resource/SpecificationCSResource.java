package de.uni_paderborn.fujaba.muml.allocation.language.resource;

import de.uni_paderborn.fujaba.muml.allocation.language.cs2as.SpecificationCS2Pivot;
import de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OclcontextPackage;
import de.uni_paderborn.fujaba.muml.allocation.language.typing.TypesUtil;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.xtext.base.cs2as.CS2AS;
import org.eclipse.ocl.xtext.completeocl.utilities.CompleteOCLCSResource;

@SuppressWarnings("all")
public class SpecificationCSResource extends CompleteOCLCSResource {
  private final static EClass contextClass = OclcontextPackage.Literals.OCL_CONTEXT;
  
  @NonNull
  @Override
  public CS2AS createCS2AS(@NonNull final EnvironmentFactoryInternal environmentFactory, @NonNull final ASResource asResource) {
    SpecificationCS2Pivot _xblockexpression = null;
    {
      TypesUtil.getType(environmentFactory, SpecificationCSResource.contextClass);
      _xblockexpression = new SpecificationCS2Pivot(environmentFactory, this, asResource, SpecificationCSResource.contextClass);
    }
    return _xblockexpression;
  }
}

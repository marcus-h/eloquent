package de.uni_paderborn.fujaba.muml.allocation.language.build;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.eclipse.m2m.qvt.oml.util.Utils;
import org.eclipse.ocl.examples.build.utilities.PredefinedQVToTransformationExecutor;

public class CS2ASEcore extends PredefinedQVToTransformationExecutor {
	private static final String TRANSFORMATION_URI = "platform:/resource/de.uni_paderborn.fujaba.muml.allocation.language/transforms/CS2ASTransformation.qvto";
	private static final String oclCS2PivotClassMap = "oclCS2PivotClassMap";
	
	private String csModelURI;
	private String pivotModelURI;
	
	public void setCsModelURI(String csModelURI) {
		this.csModelURI = csModelURI;
	}

	public void setPivotModelURI(String pivotModelURI) {
		this.pivotModelURI = pivotModelURI;
	}
	
	public void setasModelURI(String asModelURI) {
		setOut(asModelURI);
	}
	
	@Override
	protected String getPredefinedTransformationURI() {
		return TRANSFORMATION_URI;
	}
	
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		addIn(csModelURI);
		addIn(pivotModelURI);
		super.invokeInternal(ctx, monitor, issues);
	}

	@Override
	protected void initializeConfigurationProperties(ExecutionContextImpl context) {
		Dictionary<String, String> dict = Utils.<String, String>createDictionary();
		dict.put("ModelElementCS", "Element");
		dict.put("NamedElementCS", "NamedElement");
		dict.put("ContextCS", "ExpressionInOCL");
		context.setConfigProperty(oclCS2PivotClassMap, dict);
	}
}

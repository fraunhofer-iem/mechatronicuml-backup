package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.part;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	public static final String ID = "de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom"; //$NON-NLS-1$
	private static Activator instance;
	
	private TransformationExecutor transformationExecutor;
	

	public Activator() {
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;

		// Create transformation executor
		getTransformationExecutor();
	}

	public TransformationExecutor getTransformationExecutor() {
		if (transformationExecutor == null) {
			URI transformationURI = URI
					.createPlatformPluginURI(
							"/de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom/transforms/instances.qvto",
							true);
			// create executor and execution context
			transformationExecutor = new TransformationExecutor(
					transformationURI);
			transformationExecutor.loadTransformation();
		}
		return transformationExecutor;
	}

	public void stop(BundleContext context) throws Exception {
		instance = null;
		transformationExecutor = null;
		super.stop(context);
	}

	public static Activator getInstance() {
		return instance;
	}

	
}

package de.uni_paderborn.fujaba.muml.component.diagram.custom.part;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	public static final String ID = "de.uni_paderborn.fujaba.muml.component.diagram.custom"; //$NON-NLS-1$
	
	public static final String PART_TRANSFORMATION = "/de.uni_paderborn.fujaba.muml.component.diagram.custom/transforms/part.qvto";
	
	public static final String EMBED_TRANSFORMATION = "/de.uni_paderborn.fujaba.muml.component.diagram.custom/transforms/EmbedAsParts.qvto";
	
	private static Activator instance;
	
	private Map<String, TransformationExecutor> transformationExecutors = new HashMap<String, TransformationExecutor>();

	public Activator() {
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;

		// Create transformation executor
		getTransformationExecutor(PART_TRANSFORMATION);
		getTransformationExecutor(EMBED_TRANSFORMATION);
	}

	public TransformationExecutor getTransformationExecutor(String transformationPath) {
		return getTransformationExecutor(transformationPath, false);
	}

	
	public TransformationExecutor getTransformationExecutor(String transformationPath, boolean reload) {
		TransformationExecutor transformationExecutor = transformationExecutors.get(transformationPath);
		
		if (reload) {
			transformationExecutor = null;
		}
		if (transformationExecutor == null) {
			URI transformationURI = URI.createPlatformPluginURI(
					transformationPath, true);

			// create executor and execution context
			transformationExecutor = new TransformationExecutor(
					transformationURI);
			transformationExecutor.loadTransformation();
			
			transformationExecutors.put(transformationPath, transformationExecutor);
		}
		return transformationExecutor;
	}

	public void stop(BundleContext context) throws Exception {
		instance = null;
		transformationExecutors.clear();
		super.stop(context);
	}

	public static Activator getInstance() {
		return instance;
	}

	
}

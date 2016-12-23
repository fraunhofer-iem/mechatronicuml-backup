package org.muml.pim.pattern.diagram.custom.part;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	public static final String ID = "org.muml.pim.pattern.diagram.custom"; //$NON-NLS-1$

	public static final String CREATE_ROLE_RTSC = "/org.muml.pim.coordinationprotocol.diagram.custom/transforms/CreateRoleRTSC.qvto";

	public static final String TRANSFORM_PATTERN_TO_PROTOCOTOL_STEP1="/org.muml.pim.pattern.diagram.custom/transforms/TransformPatternToProtocolStep1.qvto";
	public static final String TRANSFORM_PROTOCOL_TO_PATTERN="/org.muml.pim.pattern.diagram.custom/transforms/TransformProtocolToPattern.qvto";

	public static final String TRANSFORM_PATTERN_TO_PROTOCOL_VERIFICATION="/org.muml.pim.pattern.diagram.custom/transforms/TransformPatternToProtocolNewModel.qvto";

	private static Activator instance;

	private Map<String, TransformationExecutor> transformationExecutors = new HashMap<String, TransformationExecutor>();

	public Activator() {
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;

		// Create transformation executor

		getTransformationExecutor(TRANSFORM_PATTERN_TO_PROTOCOTOL_STEP1);
		getTransformationExecutor(CREATE_ROLE_RTSC);
		getTransformationExecutor(TRANSFORM_PROTOCOL_TO_PATTERN);
		getTransformationExecutor(TRANSFORM_PATTERN_TO_PROTOCOL_VERIFICATION);
	}

	public TransformationExecutor getTransformationExecutor(
			String transformationPath) {
		return getTransformationExecutor(transformationPath, false);
	}

	public TransformationExecutor getTransformationExecutor(
			String transformationPath, boolean reload) {
		TransformationExecutor transformationExecutor = transformationExecutors
				.get(transformationPath);

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

			transformationExecutors.put(transformationPath,
					transformationExecutor);
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

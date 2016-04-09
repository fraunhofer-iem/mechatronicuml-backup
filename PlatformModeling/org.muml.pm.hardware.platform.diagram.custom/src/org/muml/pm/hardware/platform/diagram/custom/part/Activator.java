package org.muml.pm.hardware.platform.diagram.custom.part;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.muml.core.common.edit.commands.ExecuteQvtoTransformationCommand;
import org.muml.pm.hardware.hwplatform.PlatformPart;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID


	public static final String UPDATE_HWPORTPART_TRANSFORMATION = "/org.muml.pm.hardware.platform.diagram.custom/transforms/updateHWPortParts.qvto";

	// The shared instance

	private static Activator instance;

	private Map<String, TransformationExecutor> transformationExecutors = new HashMap<String, TransformationExecutor>();

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;

		// Create transformation executor
		getTransformationExecutor(UPDATE_HWPORTPART_TRANSFORMATION);

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
			URI transformationURI = URI.createPlatformPluginURI(transformationPath, true);

			// create executor and execution context
			transformationExecutor = new TransformationExecutor(transformationURI);
			transformationExecutor.loadTransformation();

			transformationExecutors.put(transformationPath, transformationExecutor);
		}
		return transformationExecutor;
	}

	public static void updateHWPortParts(EditingDomain editingDomain, PlatformPart platformPart) {
		ModelExtent inputExtent = new BasicModelExtent(Arrays.asList(new EObject[] { platformPart }));

		List<ModelExtent> modelExtents = Arrays.asList(new ModelExtent[] { inputExtent });
		TransformationExecutor transformationExecutor = Activator.getInstance()
				.getTransformationExecutor(Activator.UPDATE_HWPORTPART_TRANSFORMATION, false);
		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(transformationExecutor,
				modelExtents);
		editingDomain.getCommandStack().execute(command);

		if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
			command.undo();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		instance = null;
		transformationExecutors.clear();
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getInstance() {
		return instance;
	}

}

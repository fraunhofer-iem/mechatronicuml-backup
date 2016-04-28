package org.muml.pm.hardware.resourceinstance.diagram.custom.part;

import java.util.ArrayList;
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
import org.muml.mumlcore.modelinstance.RootNode;
import org.muml.pm.hardware.hwresource.Resource;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID

	public static final String CREATEINSTANCE_TRANSFORMATION = "/org.muml.pm.hardware.resourceinstance.diagram.custom/transforms/SynchInstances.qvto";

	// The shared instance
	private static Activator plugin;

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
		plugin = this;

		this.getTransformationExecutor(Activator.CREATEINSTANCE_TRANSFORMATION);
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

	public static void createInstance(EditingDomain editingDomain,
			ResourceInstance resourceInstance) {
		ModelExtent inputExtent = new BasicModelExtent(
				Arrays.asList(new EObject[] { resourceInstance }));

		List<ModelExtent> modelExtents = Arrays
				.asList(new ModelExtent[] { inputExtent });

		TransformationExecutor transformationExecutor = Activator.getDefault()
				.getTransformationExecutor(
						Activator.CREATEINSTANCE_TRANSFORMATION, false);

		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents);
		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}

		if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
			editingDomain.getCommandStack().undo();
		}
	}

	public static void createInstance(EditingDomain editingDomain,
			List<Resource> resources, RootNode rootNode) {
		List<EObject> inputElements = new ArrayList<EObject>();
		inputElements.addAll(resources);
		inputElements.add(rootNode);
		
		ModelExtent inputExtent = new BasicModelExtent(inputElements);
		
		List<ModelExtent> modelExtents = Arrays.asList(new ModelExtent[] {
				inputExtent});

		TransformationExecutor transformationExecutor = Activator.getDefault()
				.getTransformationExecutor(
						Activator.CREATEINSTANCE_TRANSFORMATION, true);

		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents);
		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}

		if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
			editingDomain.getCommandStack().undo();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		transformationExecutors = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}

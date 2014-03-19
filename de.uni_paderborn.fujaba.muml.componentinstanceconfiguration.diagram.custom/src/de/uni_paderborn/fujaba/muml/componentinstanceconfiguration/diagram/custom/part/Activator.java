package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.part;

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
import org.osgi.framework.BundleContext;

import de.uni_paderborn.fujaba.common.edit.commands.ExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;

public class Activator extends AbstractUIPlugin {

	public static final String ID = "de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom"; //$NON-NLS-1$

	public static final String CREATE_INSTANCE_TRANSFORMATION = "/de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom/transforms/instances.qvto";

	public static final String UPDATE_INSTANCE_TRANSFORMATION = "/de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom/transforms/updateInstance.qvto";

	private static Activator instance;

	private Map<String, TransformationExecutor> transformationExecutors = new HashMap<String, TransformationExecutor>();

	public Activator() {
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;

		// Create transformation executors
		getTransformationExecutor(CREATE_INSTANCE_TRANSFORMATION);
		getTransformationExecutor(UPDATE_INSTANCE_TRANSFORMATION);
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

	public static void createComponentInstance(EditingDomain editingDomain,
			ComponentInstance componentInstance) {
		ModelExtent inputExtent = new BasicModelExtent(
				Arrays.asList(new EObject[] { componentInstance }));

		List<ModelExtent> modelExtents = Arrays
				.asList(new ModelExtent[] { inputExtent });


		TransformationExecutor transformationExecutor = Activator.getInstance()
				.getTransformationExecutor(Activator.CREATE_INSTANCE_TRANSFORMATION, false);		
		
		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents);
		editingDomain.getCommandStack().execute(command);

		if (!command.hasChanged()) {
			editingDomain.getCommandStack().undo();
		}
	}

	public static void updateComponentInstance(EditingDomain editingDomain,
			ComponentInstance componentInstance) {
		ModelExtent inputExtent = new BasicModelExtent(
				Arrays.asList(new EObject[] { componentInstance }));

		List<ModelExtent> modelExtents = Arrays
				.asList(new ModelExtent[] { inputExtent });


		TransformationExecutor transformationExecutor = Activator.getInstance()
				.getTransformationExecutor(Activator.UPDATE_INSTANCE_TRANSFORMATION, false);		
		
		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents);
		if(command.canExecute()){
			editingDomain.getCommandStack().execute(command);
		}

		if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
			editingDomain.getCommandStack().undo();
		}
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

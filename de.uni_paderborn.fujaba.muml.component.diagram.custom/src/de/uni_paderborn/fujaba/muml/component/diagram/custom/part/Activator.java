package de.uni_paderborn.fujaba.muml.component.diagram.custom.part;

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

import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.commands.ExecuteQvtoTransformationCommand;

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

	public static StructuredComponent createStructuredComponentWithEmbeddedParts(EditingDomain editingDomain, List<Component> components) {
		ModelExtent inputExtent = new BasicModelExtent(components);

		ModelExtent outputExtent = new BasicModelExtent();

		List<ModelExtent> modelExtents = Arrays.asList(new ModelExtent[] {
				inputExtent, outputExtent });

		ExecuteQvtoTransformationCommand createCommand = new ExecuteQvtoTransformationCommand(
				Activator.EMBED_TRANSFORMATION, modelExtents);

		editingDomain.getCommandStack().execute(createCommand);

		// Get created object from output extent
		EObject createdObject = null;
		if (!outputExtent.getContents().isEmpty()) {
			createdObject = outputExtent.getContents().get(0);
		}
		
		// Return StructuredComponent
		if (createdObject instanceof StructuredComponent) {
			return (StructuredComponent) createdObject;
		}
		return null;
	}
	
	public static void updateComponentPart(EditingDomain editingDomain, ComponentPart componentPart) {
		ModelExtent inputExtent = new BasicModelExtent(Arrays.asList(new EObject[] { componentPart }));
		
		List<ModelExtent> modelExtents = Arrays.asList(new ModelExtent[] { inputExtent });
		
		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				Activator.PART_TRANSFORMATION,
				modelExtents);
		if(command.canExecute()){
		editingDomain.getCommandStack().execute(command);
		}
		
		if (!command.hasChanged()) {
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

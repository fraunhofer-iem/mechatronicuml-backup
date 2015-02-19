package de.uni_paderborn.fujaba.muml.component.diagram.custom.part;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.uni_paderborn.fujaba.common.edit.commands.ExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.component.StructuredComponent;

public class Activator extends AbstractUIPlugin {

	public static final String ID = "de.uni_paderborn.fujaba.muml.component.diagram.custom"; //$NON-NLS-1$

	public static final String COPYTOPORT_TRANSFORMATION = "/de.uni_paderborn.fujaba.muml.component.diagram.custom/transforms/CopyRolePropertiesToPort.qvto";

	public static final String PART_TRANSFORMATION = "/de.uni_paderborn.fujaba.muml.component.diagram.custom/transforms/part.qvto";
	
	public static final String PROTOCOL_TRANSFORMATION = "/de.uni_paderborn.fujaba.muml.component.diagram.custom/transforms/protocol.qvto";
	
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
		getTransformationExecutor(PROTOCOL_TRANSFORMATION);
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

		TransformationExecutor transformationExecutor = Activator.getInstance()
						.getTransformationExecutor(Activator.EMBED_TRANSFORMATION, false);		

		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents);

		if(command.canExecute()){
			editingDomain.getCommandStack().execute(command);
		}

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

		TransformationExecutor transformationExecutor = Activator.getInstance()
						.getTransformationExecutor(Activator.PART_TRANSFORMATION, false);		

		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor,
				modelExtents);
		if(command.canExecute()){
			editingDomain.getCommandStack().execute(command);
		}
		
		if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
		//	editingDomain.getCommandStack().undo();
				command.undo();
				}
	}
	
	public static void updateCoordinationProtocolParts(EditingDomain editingDomain, StructuredComponent component) {
		ModelExtent inputExtent = new BasicModelExtent(Arrays.asList(new EObject[] { component }));
		
		List<ModelExtent> modelExtents = Arrays.asList(new ModelExtent[] { inputExtent });
		
		TransformationExecutor transformationExecutor = Activator.getInstance()
				.getTransformationExecutor(Activator.PROTOCOL_TRANSFORMATION, false);		

		
		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor,
				modelExtents);
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

package org.muml.pim.component.diagram.custom.part;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.muml.core.common.edit.commands.ExecuteQvtoTransformationCommand;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.component.CoordinationProtocolPart;
import org.muml.pim.component.StructuredComponent;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {



	public static final String COPYTOPORT_TRANSFORMATION = "/org.muml.pim.component.diagram.custom/transforms/CopyRolePropertiesToPort.qvto";

	public static final String PART_TRANSFORMATION = "/org.muml.pim.component.diagram.custom/transforms/part.qvto";
	
	public static final String PROTOCOL_TRANSFORMATION = "/org.muml.pim.component.diagram.custom/transforms/protocol.qvto";
	
	
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
	
	public static void updateCoordinationProtocolParts(final EditingDomain editingDomain, final StructuredComponent component) {
		ModelExtent inputExtent = new BasicModelExtent(Arrays.asList(new EObject[] { component }));
		
		List<ModelExtent> modelExtents = Arrays.asList(new ModelExtent[] { inputExtent });
		
		TransformationExecutor transformationExecutor = Activator.getInstance()
				.getTransformationExecutor(Activator.PROTOCOL_TRANSFORMATION, false);		

		
		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor,
				modelExtents) {
			// Workaround for #1453
			protected void doExecute() {
				List<CoordinationProtocolPart> before = new ArrayList<CoordinationProtocolPart>(component.getCoordinationProtocolParts());
				super.doExecute();
				List<CoordinationProtocolPart> after = new ArrayList<CoordinationProtocolPart>(component.getCoordinationProtocolParts());
				
				// execute DeleteCommand on removed parts
				before.removeAll(after);
				DeleteCommand.create(editingDomain, before).execute();
			}
		};
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

package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.swt.widgets.Shell;

import de.uni_paderborn.fujaba.common.edit.commands.ExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.common.edit.commands.StoringExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.modelinstance.ui.batch.BatchDiagramCreationWizard;
import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.behavior.Variable;
import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;

public class PatternToProtocolTransformation {
	
	
	public static void saveInput(CoordinationPattern selectedPattern, RootNode rootNode, ArrayList<ParameterBinding> bindings, EditingDomain editingDomain)
	{
		
		EObject[] input = new EObject[bindings.size()+2];
		input[0]= rootNode;
		input[1]=selectedPattern;	
		for(int i=0; i< bindings.size();i++)
		{
			input[i+2] = bindings.get(i);
		}
		final EObject[] in = input;
		editingDomain.getCommandStack().execute(new ChangeCommand(selectedPattern) {

			@Override
			protected void doExecute() {

				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = resourceSet.createResource(URI.createPlatformResourceURI("Test/input.xmi", true));
				Collection<EObject> c = Arrays.asList(in);
				resource.getContents().addAll(c);
				try {
					resource.save(Collections.emptyMap());
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		});
	}
	
	
	public static CoordinationPattern transformProtocolToPattern(CoordinationProtocol protocol, Variable[] variables,  EditingDomain editingDomain)
	{
		EObject[] input = new EObject[variables.length+2];
		RootNode rootNode = (RootNode)protocol.eContainer().eContainer();
		input[0]= rootNode;
		input[1]=protocol;	
		for(int i=0; i< variables.length;i++)
		{
			input[i+2] = variables[i];
		}

		ModelExtent outputExtent =  new BasicModelExtent();
		
		
		final TransformationExecutor transformationExecutor = Activator.getInstance().getTransformationExecutor(Activator.TRANSFORM_PROTOCOL_TO_PATTERN,false);
		StoringExecuteQvtoTransformationCommand command = new StoringExecuteQvtoTransformationCommand(
				transformationExecutor,new BasicModelExtent(Arrays
						.asList(input)), outputExtent);

		if (command.canExecute())
			editingDomain.getCommandStack().execute(command);

		CoordinationPattern pattern = (CoordinationPattern)outputExtent.getContents().get(0);
		return pattern;
		
	}

	public static CoordinationProtocol transformPatternToProtocol(CoordinationPattern selectedPattern, RootNode rootNode, ArrayList<ParameterBinding> bindings, EditingDomain editingDomain) {
		
		// create the input for the transformation. It consists of the rootNode, the 
		// selectedPattern and the ParameterBindings
		EObject[] input = new EObject[bindings.size()+2];
		input[0]= rootNode;
		input[1]=selectedPattern;	
		for(int i=0; i< bindings.size();i++)
		{
			input[i+2] = bindings.get(i);
		}
		// get the protocol category and get the number of protocols within this
		// category			
		
		ModelExtent outputExtent =  new BasicModelExtent();
	
		// Load QVTO script PatternToProtocol
		final TransformationExecutor transformationExecutor = Activator
				.getInstance().getTransformationExecutor(
						Activator.TRANSFORM_PATTERN_TO_PROTOCOTOL_STEP1, false);

		StoringExecuteQvtoTransformationCommand command = new StoringExecuteQvtoTransformationCommand(
				transformationExecutor, new BasicModelExtent(Arrays
						.asList(input)),outputExtent);

		if (command.canExecute())
			editingDomain.getCommandStack().execute(command);

		// check whether a new protocol was added to the protocol category. If
		// not, do not create any diagrams
		CoordinationProtocol newProtocol = (CoordinationProtocol)outputExtent.getContents().get(0);
				
		return newProtocol;		
	}	
	

	public static CoordinationProtocol transformPatternToProtocolVerification(CoordinationPattern selectedPattern, RootNode rootNode, ArrayList<ParameterBinding> bindings, EditingDomain editingDomain) {
		
		// create the input for the transformation. It consists of the rootNode, the 
		// selectedPattern and the ParameterBindings
		EObject[] input = new EObject[bindings.size()+2];
		input[0]= rootNode;
		input[1]=selectedPattern;	
		for(int i=0; i< bindings.size();i++)
		{
			input[i+2] = bindings.get(i);
		}
		// get the protocol category and get the number of protocols within this
		// category			
		
		ModelExtent outputExtent =  new BasicModelExtent();
	
		// Load QVTO script PatternToProtocol
		final TransformationExecutor transformationExecutor = Activator
				.getInstance().getTransformationExecutor(
						Activator.TRANSFORM_PATTERN_TO_PROTOCOL_VERIFICATION, false);

		List<ModelExtent> modelExtents = new ArrayList<ModelExtent>();
		modelExtents.add(new BasicModelExtent(Arrays
						.asList(input)));
		modelExtents.add(outputExtent);
		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents);

		if (command.canExecute())
			editingDomain.getCommandStack().execute(command);

		// check whether a new protocol was added to the protocol category. If
		// not, do not create any diagrams
		CoordinationProtocol newProtocol = null;
		RootNode root = (RootNode) outputExtent.getContents().get(0);		
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI("dummy:/dummy_protocol.muml"));
		resource.getContents().add(root);
		for(ModelElementCategory cat : root.getCategories()) {
			if(cat.getKey().contains("protocol")) {
				newProtocol = (CoordinationProtocol) cat.getModelElements().get(0);
			}
		}
		return newProtocol;		
	}	
	
	
//	public static void TransformPatternToProtocolStep2(CoordinationPattern selectedPattern, CoordinationProtocol createdProtocol, RootNode rootNode, EditingDomain editingDomain)
//	{
//		EObject[] input = new EObject[3];
//		input[0] = selectedPattern;
//		input[1] = createdProtocol;
//		
//		// second step of the transformation: copy all constraint
//		// repositories
//		final List<ModelExtent> modelExtents2 = Arrays
//				.asList(new ModelExtent[] { new BasicModelExtent(Arrays
//						.asList(selectedPattern)) , new BasicModelExtent(Arrays.asList(createdProtocol))});
//
//		// Load QVTO script PatternToProtocol
//		final TransformationExecutor transformationExecutor2 = Activator
//				.getInstance().getTransformationExecutor(
//						Activator.TRANSFORM_PATTERN_TO_PROTOCOTOL_STEP2,
//						false);
//
//		ExecuteQvtoTransformationCommand command2 = new ExecuteQvtoTransformationCommand(
//				transformationExecutor2, modelExtents2);
//
//		if (command2.canExecute())
//			editingDomain.getCommandStack().execute(command2);
//	}
//	
	
	public static void createDiagrams(Shell shell, AbstractCoordinationSpecification newCoordinationSpecification )
	{
		final Resource resource = newCoordinationSpecification.eResource();
		// steps to create the diagram files start here
				String finalReportMessage = "Created Diagram of "+newCoordinationSpecification.eClass().getName() + " "
						+ newCoordinationSpecification.getName()
						+ " and the corresponding realtimestatecharts!";

				// set the elements whose diagrams should be created
				final Collection<EObject> elements = new ArrayList<EObject>();
				elements.add(newCoordinationSpecification);
				for (Role role : newCoordinationSpecification.getRoles()) {
					RealtimeStatechart rtsc = (RealtimeStatechart) role.getBehavior();
					if (rtsc != null)
						elements.add(rtsc);
				}
		ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);

		// run diagram creation
		try {
			dialog.run(true, false, new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {

					BatchDiagramCreationWizard wizard = new BatchDiagramCreationWizard();
					IFile file = getFile(resource);
					IStructuredSelection selection = new StructuredSelection(
							file);
					wizard.init(null, selection);
					wizard.createDiagrams(elements, monitor);
				}
			});
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		MessageDialog.openInformation(shell, "Transformation Report",
				finalReportMessage);
	}
	private static IFile getFile(Resource resource) {

		if (resource != null) {
			org.eclipse.emf.common.util.URI uri = resource.getURI();
			uri = resource.getResourceSet().getURIConverter().normalize(uri);
			String scheme = uri.scheme();
			if ("platform".equals(scheme) && uri.segmentCount() > 1
					&& "resource".equals(uri.segment(0))) {
				StringBuffer platformResourcePath = new StringBuffer();
				for (int j = 1, size = uri.segmentCount(); j < size; ++j) {
					platformResourcePath.append('/');
					platformResourcePath.append(uri.segment(j));
				}
				return ResourcesPlugin.getWorkspace().getRoot()
						.getFile(new Path(platformResourcePath.toString()));
			}
		}
		return null;
	}
	// Example Code for saving the input before executing the transformation. Important for debugging
	/*
	  final EObject[] in = input;
	editingDomain.getCommandStack().execute(new ChangeCommand(thePattern) {

		@Override
		protected void doExecute() {

			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.createResource(URI.createPlatformResourceURI("Test/input.xmi", true));
			Collection<EObject> c = Arrays.asList(in);
			resource.getContents().addAll(c);
			try {
				resource.save(Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	});
	 */
}

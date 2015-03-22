package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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
import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.utilities.batch.BatchDiagramCreationWizard;

public class PatternToProtocolTransformation {

	public static CoordinationProtocol TransformPatternToProtocolStep1 (CoordinationPattern selectedPattern, RootNode rootNode, ArrayList<ParameterBinding> bindings, EditingDomain editingDomain)
	{
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
		ModelElementCategory protocolCategory = null;
		for (ModelElementCategory cat : rootNode.getCategories()) {
			if (cat.getKey().contains("protocol")) {
				protocolCategory = cat;
				break;
			}
		}
		int nrOfProtocolsBeforeTranslation = protocolCategory.getModelElements().size();
		
		
		final List<ModelExtent> modelExtents = Arrays
				.asList(new ModelExtent[] { new BasicModelExtent(Arrays
						.asList(input)) });

		// Load QVTO script PatternToProtocol
		final TransformationExecutor transformationExecutor = Activator
				.getInstance().getTransformationExecutor(
						Activator.TRANSFORM_PATTERN_TO_PROTOCOTOL_STEP1, false);

		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents);

		if (command.canExecute())
			editingDomain.getCommandStack().execute(command);

		// check whether a new protocol was added to the protocol category. If
		// not, do not create any diagrams
		int nrOfProtocolsAfterTranslation = protocolCategory.getModelElements()
				.size();
		if (!(nrOfProtocolsBeforeTranslation < nrOfProtocolsAfterTranslation))
			return null;

		CoordinationProtocol newProtocol = (CoordinationProtocol) protocolCategory
				.getModelElements().get(nrOfProtocolsAfterTranslation - 1);
		return newProtocol;
		
	}
	
	
	
	public static void TransformPatternToProtocolStep2(CoordinationPattern selectedPattern, CoordinationProtocol createdProtocol, RootNode rootNode, EditingDomain editingDomain)
	{
		EObject[] input = new EObject[3];
		input[0] = selectedPattern;
		input[1] = createdProtocol;
		input[2] = rootNode;
		// second step of the transformation: copy all constraint
		// repositories
		final List<ModelExtent> modelExtents2 = Arrays
				.asList(new ModelExtent[] { new BasicModelExtent(Arrays
						.asList(input)) });

		// Load QVTO script PatternToProtocol
		final TransformationExecutor transformationExecutor2 = Activator
				.getInstance().getTransformationExecutor(
						Activator.TRANSFORM_PATTERN_TO_PROTOCOTOL_STEP2,
						false);

		ExecuteQvtoTransformationCommand command2 = new ExecuteQvtoTransformationCommand(
				transformationExecutor2, modelExtents2);

		if (command2.canExecute())
			editingDomain.getCommandStack().execute(command2);
	}
	
	
	public static void createDiagrams(Shell shell, CoordinationProtocol newProtocol )
	{
		final Resource resource = newProtocol.eResource();
		// steps to create the diagram files start here
				String finalReportMessage = "Created Diagram of the Coordination Protocol: "
						+ newProtocol.getName()
						+ " and the corresponding realtimestatecharts!";

				// set the elements whose diagrams should be created
				final Collection<EObject> elements = new ArrayList<EObject>();
				elements.add(newProtocol);
				for (Role role : newProtocol.getRoles()) {
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
	/* Example Code for saving the input before executing the transformation. Important for debugging
	 * final EObject[] in = input;
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
	});*/
}

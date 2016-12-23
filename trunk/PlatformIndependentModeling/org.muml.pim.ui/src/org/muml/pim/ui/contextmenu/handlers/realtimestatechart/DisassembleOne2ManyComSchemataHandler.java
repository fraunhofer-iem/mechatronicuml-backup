package org.muml.pim.ui.contextmenu.handlers.realtimestatechart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.core.common.edit.commands.ExecuteQvtoTransformationCommand;
import org.muml.pim.component.Component;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.ui.Activator;


public class DisassembleOne2ManyComSchemataHandler extends AbstractHandler {

	
	
	

	// janas transformation
	// private static String dissambleTransformation=
	// "/org.muml.onetomanyprotocols.synthesis/transforms/SynthesisApproach.qvto";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		EditingDomain editingDomain = null;

		ISelection selection = HandlerUtil.getCurrentSelection(event);

		List<RealtimeStatechart> objects = new ArrayList<RealtimeStatechart>();

		org.eclipse.emf.ecore.resource.Resource ecoreResource = null;
		for (Object selectedElement : ((IStructuredSelection) selection)
				.toArray()) {
			EObject object = null;
			if (selectedElement instanceof IAdaptable) {
				IAdaptable adaptable = (IAdaptable) selectedElement;
				selectedElement = adaptable.getAdapter(EObject.class);
			}
			if (selectedElement instanceof EObject) {
				object = (EObject) selectedElement;
			}
			if (object != null
					&& RealtimestatechartPackage.Literals.REALTIME_STATECHART
							.isSuperTypeOf(object.eClass())) {
				if (ecoreResource == null) {
					ecoreResource = object.eResource();
				} else if (ecoreResource != object.eResource()) {
					continue;
				}
				objects.add((RealtimeStatechart) object);
			}
		}

		if (!objects.isEmpty() && editingDomain == null) {
			editingDomain = AdapterFactoryEditingDomain
					.getEditingDomainFor(objects.get(0));
			for (RealtimeStatechart rtsc : objects) {
				
				if(!rtsc.isUsesOneToManyCommunicationSchemata()) {
					ErrorDialog dialog = new ErrorDialog(
							window.getShell(),
							"ERROR when disassembling the RTSC",
							null,
							new org.eclipse.core.runtime.Status(IStatus.ERROR,
									Activator.ID,
									"You cannot disassemble a RTSC that does not use Schemata!"),
							IStatus.ERROR);
					dialog.open();
					return null;
					
				}
				Diagnostic diagnostic = Diagnostician.INSTANCE.validate(rtsc);
				IStatus status = BasicDiagnostic.toIStatus(diagnostic);
				if(!status.isOK()){					
					ErrorDialog dialog = new ErrorDialog(
							window.getShell(),
							"ERROR when disassembling the RTSC",
							null,
							new org.eclipse.core.runtime.Status(IStatus.ERROR,
									Activator.ID,
									"The disassembling RTSC has validation errors!"),
							IStatus.ERROR);
					dialog.open();
					return null;
				}
				
				disassembleOne2ManyComSchemata(rtsc, window.getShell(),
						editingDomain);
			}
		}

		return null;
	}

	public void showDisassembleWizard() {
		
	}
	
	public static void disassembleOne2ManyComSchemata(
			final RealtimeStatechart rtsc, final Shell shell,
			final EditingDomain editingDomain) {	
		ModelExtent inputExtent = new BasicModelExtent(
				Arrays.asList(new EObject[] { rtsc }));

		final List<ModelExtent> modelExtents = Arrays
				.asList(new ModelExtent[] { inputExtent });

		// Load QVTO script
		String transformationKind = "";
		if(rtsc.getBehavioralElement() instanceof Component) {
			transformationKind = Messages.disassembleComponentTransformation;
		}else if(rtsc.getBehavioralElement() instanceof DiscreteInteractionEndpoint) {
			transformationKind = Messages.disassemblePortOrRoleTransformation;
		} else {
			ErrorDialog dialog = new ErrorDialog(
					shell,
					"ERROR when checking the containment of the Realtimestatechart",
					null,
					new org.eclipse.core.runtime.Status(IStatus.ERROR,
							org.muml.pim.ui.Activator.ID,
							"It is not possible to disassemble non-root realtime statecharts of a DiscreteInteractionEndpoint or Component or a realtime statechart not contained in a DiscreteInteractionEndpoint or Component"),
					IStatus.ERROR);
			dialog.open();
			return;
		}
		final TransformationExecutor transformationExecutor = Activator
				.getInstance()
				.getTransformationExecutor(
						transformationKind,
						false);	
		
		
		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents) {
			protected void doExecute() {
				super.doExecute();
				DeleteCommand.create(editingDomain, rtsc).execute();
			}
		};
		
		
		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}

		if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
			editingDomain.getCommandStack().undo();
		}

		MessageDialog dialog = new MessageDialog(shell, "Disassemble One2Many Schemata Transformation Results", null, "The disassembling was successful. Please delete all diagrams of the disassembled RealtimeStatechart and create new diagrams for the created RealtimeStatechart", MessageDialog.INFORMATION , new String[]{"Ok"}, 0);
		dialog.open();
	}

}

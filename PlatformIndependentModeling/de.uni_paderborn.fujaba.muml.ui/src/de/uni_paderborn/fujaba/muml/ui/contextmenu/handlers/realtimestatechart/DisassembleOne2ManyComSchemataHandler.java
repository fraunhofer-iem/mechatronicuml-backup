package de.uni_paderborn.fujaba.muml.ui.contextmenu.handlers.realtimestatechart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.common.edit.commands.ExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;

public class DisassembleOne2ManyComSchemataHandler extends AbstractHandler {

	private static String disassembleComponentTransformation = "/de.uni_paderborn.fujaba.muml.ui/transforms/realtimestatechart/DisassembleComponentWrapper.qvto";
	private static String disassemblePortOrRoleTransformation = "/de.uni_paderborn.fujaba.muml.ui/transforms/realtimestatechart/DisassambleDiscreteInteractionEndpointWrapper.qvto";
	
	private static Map<String, TransformationExecutor> transformationExecutors = new HashMap<String, TransformationExecutor>();

	// janas transformation
	// private static String dissambleTransformation=
	// "/de.uni_paderborn.fujaba.muml.onetomanyprotocols.synthesis/transforms/SynthesisApproach.qvto";

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

		final Resource resource = rtsc.eResource();
		// Load QVTO script
		String transformationKind = "";
		if(rtsc.getBehavioralElement() instanceof Component) {
			transformationKind = disassembleComponentTransformation;
		}else if(rtsc.getBehavioralElement() instanceof DiscreteInteractionEndpoint) {
			transformationKind = disassemblePortOrRoleTransformation;
		} else {
			ErrorDialog dialog = new ErrorDialog(
					shell,
					"ERROR when checking the containment of the Realtimestatechart",
					null,
					new org.eclipse.core.runtime.Status(IStatus.ERROR,
							de.uni_paderborn.fujaba.muml.ui.Activator.ID,
							"It is not possible to disassemble non-root realtime statecharts of a DiscreteInteractionEndpoint or Component or a realtime statechart not contained in a DiscreteInteractionEndpoint or Component"),
					IStatus.ERROR);
			dialog.open();
			return;
		}
			
		
		final TransformationExecutor transformationExecutor = getTransformationExecutor(
				transformationKind, true);

		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents);

		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}
		// save

		if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
			editingDomain.getCommandStack().undo();
		}
		
		try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	private static TransformationExecutor getTransformationExecutor(
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
}

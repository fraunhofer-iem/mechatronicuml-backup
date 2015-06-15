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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.common.edit.commands.ExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;

public class DisassembleOne2ManyComSchemataHandler extends AbstractHandler {

	private static String disassembleTransformation = "/de.uni_paderborn.fujaba.muml.onetomanycommunicationschemata.synthesis/transforms/DissassembleOneToManySchematasInComponentBehavior.qvto";
	
	// janas transformation
	// private static String dissambleTransformation=
	// "/de.uni_paderborn.fujaba.muml.onetomanyprotocols.synthesis/transforms/SynthesisApproach.qvto";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
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

	public static void disassembleOne2ManyComSchemata(
			final RealtimeStatechart rtsc, final Shell shell,
			final EditingDomain editingDomain) {
		if (!rtsc.isUsesOneToManyCommunicationSchemata()) {
			MessageDialog
					.openInformation(shell, "No Schemata used!",
							"There are no One-To-Many Communication Schemata to transform!");
			return;
		}
		ModelExtent inputExtent = new BasicModelExtent(
				Arrays.asList(new EObject[] { rtsc }));

		final List<ModelExtent> modelExtents = Arrays
				.asList(new ModelExtent[] { inputExtent });

		// Load QVTO script
		final TransformationExecutor transformationExecutor = getTransformationExecutor(
				disassembleTransformation, false);

		ExecuteQvtoTransformationCommand command = new ExecuteQvtoTransformationCommand(
				transformationExecutor, modelExtents);

		if (command.canExecute()) {
			editingDomain.getCommandStack().execute(command);
		}
		// save

		if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
			editingDomain.getCommandStack().undo();
		}
		final Resource resource = rtsc.eResource();
		try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static Map<String, TransformationExecutor> transformationExecutors = new HashMap<String, TransformationExecutor>();

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

package de.uni_paderborn.fujaba.muml.verification.refinement.testautomata;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.common.Messages;
import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.ModelinstanceFactory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.modelinstance.ui.FujabaNewwizardPlugin;
import de.uni_paderborn.fujaba.modelinstance.ui.diagrams.DiagramEditorUtil;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;

public class RtscTestExporter {

	private RealtimeStatechart testAutomaton;
	private IWorkbenchPart part = PlatformUI.getWorkbench()
			.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
	private ModelinstanceFactory modelInstanceFactory;
	private URI fujabaURI;

	public RtscTestExporter(URI fujabaURI, RealtimeStatechart testAutomaton) {
		modelInstanceFactory = ModelinstanceFactory.eINSTANCE;
		this.fujabaURI = fujabaURI;
		this.testAutomaton = testAutomaton;
		this.testAutomaton.setName("testAutomaton");

	}

	// TODO clean up
	public Resource addModelToFujabaFile() {

		URI fileURI = fujabaURI.trimSegments(1).appendSegment(
				"testAutomaton.realtimestatechart_diagram");
		EditingDomain editingDomain = ((DiagramDocumentEditor) part)
				.getEditingDomain();
		final Resource diagramResource = editingDomain.getResourceSet()
				.createResource(fileURI);
		final Resource modelResource = editingDomain.getResourceSet()
				.getResource(fujabaURI, true);

		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				(TransactionalEditingDomain) editingDomain,
				Messages.DiagramEditorUtil_CreateDiagramCommandLabel, null,
				Collections.EMPTY_LIST) {

			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				// Diagram diagram = ViewService
				// .createDiagram(
				// testAutomaton,
				// "Realtimestatechart",
				// de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				//

				// if (diagram != null) {
				// diagram.setName("testAutomaton.realtimestatechart_diagram");
				HashSet<RealtimeStatechart> toRemove = new HashSet<RealtimeStatechart>();
				for (EObject o : modelResource.getContents()) {
					if (o instanceof RootNode)
						for (ModelElementCategory cat : ((RootNode) o)
								.getCategories()) {
							if (cat.getName().equals("realtimestatechart")) {
								for (ExtendableElement curRtsc : cat
										.getModelElements()) {
									if (((RealtimeStatechart) curRtsc)
											.getName() != null
											&& ((RealtimeStatechart) curRtsc)
													.getName().equals(
															testAutomaton
																	.getName()))
										toRemove.add((RealtimeStatechart) curRtsc);
								}
								if (!toRemove.isEmpty())
									cat.getModelElements().removeAll(toRemove);
								cat.getModelElements().add(testAutomaton);
							break;
							}
						}
				}

				// diagramResource.getContents().add(diagram);

				// }

				try {
					Map<?, ?> saveOptions = DiagramEditorUtil.getSaveOptions();
					((DiagramDocumentEditor) part)
							.doSave(new NullProgressMonitor());
					modelResource.save(saveOptions);
					// diagramResource.save(saveOptions);
				} catch (IOException e) {
					FujabaNewwizardPlugin.getDefault().logError(
							"Unable to store modelResource resource", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}

		};
		try {
			// create category
			boolean rtscCategoryExists = false;

			for (EObject o : modelResource.getContents()) {
				if (o instanceof RootNode) {
					for (ModelElementCategory curCat : ((RootNode) o)
							.getCategories()) {
						if (curCat.getName().equals("realtimestatechart"))
							rtscCategoryExists = true;
					}
					if (!rtscCategoryExists) {
						ModelElementCategory rtscCategory = modelInstanceFactory
								.createModelElementCategory();
						rtscCategory.setName("realtimestatechart");
						rtscCategory
								.setKey("de.uni_paderborn.fujaba.muml.realtimestatechart.category");
						((RootNode) o).getCategories().add(rtscCategory);
					}
					break;
				}
			}

			OperationHistoryFactory.getOperationHistory().execute(command,
					null, null);
		} catch (ExecutionException e) {
			e.printStackTrace();
			FujabaNewwizardPlugin.getDefault().logError(
					"Unable to create model and diagramResource", e); //$NON-NLS-1$
		}
		DiagramEditorUtil.setCharset(WorkspaceSynchronizer
				.getFile(modelResource));
		DiagramEditorUtil.setCharset(WorkspaceSynchronizer
				.getFile(diagramResource));
		return diagramResource;

	}

}

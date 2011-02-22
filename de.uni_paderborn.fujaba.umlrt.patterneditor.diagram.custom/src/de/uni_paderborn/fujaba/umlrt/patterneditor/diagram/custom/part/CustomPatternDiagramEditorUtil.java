package de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.custom.part;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;

import de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternFactory;
import de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram;
import de.uni_paderborn.fujaba.umlrt.patterneditor.PatterneditorFactory;

public class CustomPatternDiagramEditorUtil {

	/**
	 * This method should be called within a workspace modify operation since it
	 * creates resources.
	 */
	public static Resource createDiagram(URI diagramURI, URI modelURI,
			IProgressMonitor progressMonitor) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		progressMonitor
				.beginTask(
						de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.Messages.PatternDiagramEditorUtil_CreateDiagramProgressTask,
						3);
		final Resource diagramResource = editingDomain.getResourceSet()
				.createResource(diagramURI);
		final Resource modelResource = editingDomain.getResourceSet()
				.createResource(modelURI);
		final String diagramName = diagramURI.lastSegment();
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.Messages.PatternDiagramEditorUtil_CreateDiagramCommandLabel,
				Collections.EMPTY_LIST) {
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram model = createInitialModel();
				attachModelToResource(model, modelResource);

				Diagram diagram = ViewService
						.createDiagram(
								model,
								de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.PatternDiagramEditPart.MODEL_ID,
								de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(diagramName);
					diagram.setElement(model);
				}

				try {
					modelResource
							.save(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternDiagramEditorUtil
									.getSaveOptions());
					diagramResource
							.save(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternDiagramEditorUtil
									.getSaveOptions());
				} catch (IOException e) {

					de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternDiagramEditorPlugin
							.getInstance()
							.logError(
									"Unable to store model and diagram resources", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}

		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternDiagramEditorPlugin
					.getInstance().logError(
							"Unable to create model and diagram", e); //$NON-NLS-1$
		}
		de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternDiagramEditorUtil
				.setCharset(WorkspaceSynchronizer.getFile(modelResource));
		de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternDiagramEditorUtil
				.setCharset(WorkspaceSynchronizer.getFile(diagramResource));
		return diagramResource;
	}

	/**
	 * Create a new instance of domain element associated with canvas.
	 */
	private static PatternDiagram createInitialModel() {
		PatternDiagram patternDiagram = PatterneditorFactory.eINSTANCE
				.createPatternDiagram();

		CoordinationPattern coordinationPattern = PatternFactory.eINSTANCE
				.createCoordinationPattern();
	
		patternDiagram.setCoordinationPattern(coordinationPattern);

		return patternDiagram;
	}

	/**
	 * Store model element in the resource.
	 */
	private static void attachModelToResource(
			de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram model,
			Resource resource) {
		resource.getContents().add(model);
	}

}

package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.part;

import org.eclipse.core.runtime.IProgressMonitor;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditor;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.ValidateAction;

public class CustomStructuredcomponentDiagramEditor extends
		StructuredcomponentDiagramEditor {

	/**
	 * Saves the diagram. Extended to also validate the diagram.
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		ValidateAction.runValidation(getDiagramEditPart(), getDiagramEditPart()
				.getDiagramView());
		super.doSave(progressMonitor);
	}

}

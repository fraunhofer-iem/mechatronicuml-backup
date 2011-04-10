package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.custom.part;

import org.eclipse.core.runtime.IProgressMonitor;

import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditor;
import de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ValidateAction;

/**
 * A customized DiagramEditor class, which automatically validates the diagram
 * after saving it.
 * 
 * @author bingo
 * 
 */
public class CustomComponentinstanceconfigurationDiagramEditor extends
		ComponentinstanceconfigurationDiagramEditor {

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

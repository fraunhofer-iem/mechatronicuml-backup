package de.uni_paderborn.fujaba.umlrt.componentInstanceConfigurationEditor.diagram.custom.part;

import org.eclipse.core.runtime.IProgressMonitor;

import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ComponentInstanceConfigurationDiagramEditor;
import de.uni_paderborn.fujaba.umlrt.componentInstanceConfiguration.diagram.part.ValidateAction;

public class CustomComponentInstanceConfigurationDiagramEditor extends
		ComponentInstanceConfigurationDiagramEditor {

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

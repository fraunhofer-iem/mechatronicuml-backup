package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.part;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.PaletteService;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditor;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.ValidateAction;

/**
 * A customized DiagramEditor class, which automatically validates the diagram
 * after saving it.
 * 
 * @author braund
 * 
 */
public class CustomRealtimeStatechartEditor extends
		RealtimeStatechartDiagramEditor {

	/**
	 * Saves the diagram. Extended to also validate the diagram.
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		ValidateAction.runValidation(getDiagramEditPart(), getDiagramEditPart()
				.getDiagramView());
		super.doSave(progressMonitor);
	}

	/**
	 * For customization of the generated palatte
	 */
	protected PaletteRoot createPaletteRoot(PaletteRoot existingPaletteRoot) {
		
	    PaletteRoot paletteRoot;
		if (existingPaletteRoot == null) {
			paletteRoot = PaletteService.getInstance().createPalette(this,
				getDefaultPaletteContent());
		} else {
			PaletteService.getInstance().updatePalette(existingPaletteRoot,
				this, getDefaultPaletteContent());
			paletteRoot = existingPaletteRoot;
		}
        applyCustomizationsToPalette(paletteRoot);
		
		new CustomRealtimeStatechartPaletteFactory()
				.fillPalette(paletteRoot);
		return paletteRoot;
	}
}

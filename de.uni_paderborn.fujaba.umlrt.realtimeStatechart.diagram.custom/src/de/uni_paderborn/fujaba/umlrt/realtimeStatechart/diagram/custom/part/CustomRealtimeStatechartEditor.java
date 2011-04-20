package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.custom.part;

import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.PaletteService;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditor;

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

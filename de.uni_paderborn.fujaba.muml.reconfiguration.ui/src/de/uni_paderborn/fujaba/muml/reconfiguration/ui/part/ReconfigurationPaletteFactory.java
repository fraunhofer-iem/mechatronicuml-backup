package de.uni_paderborn.fujaba.muml.reconfiguration.ui.part;

import org.eclipse.gef.Tool;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.PaletteFactory;
import org.eclipse.gmf.runtime.diagram.ui.tools.CreationTool;

import de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ReconfigurationElementTypes;

/**
 * @generated
 */
public class ReconfigurationPaletteFactory extends PaletteFactory.Adapter {

	public Tool createTool(String toolId) {
        if (toolId.equals("de.uni_paderborn.fujaba.muml.reconfiguration.ui.ReconfigurableStructuredComponentTool")){
            return new CreationTool(ReconfigurationElementTypes.ReconfigurableStructuredComponent_2076);

        }
        return null;
	}
	
	
}

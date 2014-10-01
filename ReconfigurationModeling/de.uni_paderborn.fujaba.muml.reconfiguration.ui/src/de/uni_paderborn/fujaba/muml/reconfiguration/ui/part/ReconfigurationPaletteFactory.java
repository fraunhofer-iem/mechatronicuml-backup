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
        if (toolId.equals("de.uni_paderborn.fujaba.muml.reconfiguration.ui.ReconfigurableAtomicComponentTool")){
            return new CreationTool(ReconfigurationElementTypes.ReconfigurableAtomicComponent_2078);

        }
        if (toolId.equals("de.uni_paderborn.fujaba.muml.reconfiguration.ui.ReconfigurationMessagePortTool")){
            return new CreationTool(ReconfigurationElementTypes.ReconfigurationMessagePort_3076);

        }
        if (toolId.equals("de.uni_paderborn.fujaba.muml.reconfiguration.ui.ReconfigurationExecutionPortTool")){
            return new CreationTool(ReconfigurationElementTypes.ReconfigurationExecutionPort_3077);

        }
        if (toolId.equals("de.uni_paderborn.fujaba.muml.reconfiguration.ui.FadingComponentTool")){
            return new CreationTool(ReconfigurationElementTypes.FadingComponent_2079);

        }
        if (toolId.equals("de.uni_paderborn.fujaba.muml.reconfiguration.ui.BroadcastPortTool")){
            return new CreationTool(ReconfigurationElementTypes.BroadcastPort_3078);

        }
        return null;
	}
	
	
}

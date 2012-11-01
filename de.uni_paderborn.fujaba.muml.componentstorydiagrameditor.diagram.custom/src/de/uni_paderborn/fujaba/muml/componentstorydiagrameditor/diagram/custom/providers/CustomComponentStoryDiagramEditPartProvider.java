package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts.CustomComponentStoryDiagramEditPartFactory;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramEditPartProvider;

public class CustomComponentStoryDiagramEditPartProvider extends ComponentStoryDiagramEditPartProvider{

	public CustomComponentStoryDiagramEditPartProvider() {
		setFactory(new CustomComponentStoryDiagramEditPartFactory());
		setAllowCaching(true);
	}
}

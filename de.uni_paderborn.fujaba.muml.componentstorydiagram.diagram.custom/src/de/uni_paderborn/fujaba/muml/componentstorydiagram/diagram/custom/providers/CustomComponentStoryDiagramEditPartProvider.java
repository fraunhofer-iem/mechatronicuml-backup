package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts.CustomComponentStoryDiagramEditPartFactory;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramEditPartProvider;

public class CustomComponentStoryDiagramEditPartProvider extends ComponentStoryDiagramEditPartProvider{

	public CustomComponentStoryDiagramEditPartProvider() {
		setFactory(new CustomComponentStoryDiagramEditPartFactory());
		setAllowCaching(true);
	}
}

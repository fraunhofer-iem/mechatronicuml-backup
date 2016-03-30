package org.muml.reconfiguration.componentstorydiagram.diagram.custom.providers;

import org.muml.reconfiguration.componentstorydiagram.diagram.custom.edit.parts.CustomComponentStoryDiagramEditPartFactory;
import org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramEditPartProvider;

public class CustomComponentStoryDiagramEditPartProvider extends ComponentStoryDiagramEditPartProvider{

	public CustomComponentStoryDiagramEditPartProvider() {
		setFactory(new CustomComponentStoryDiagramEditPartFactory());
		setAllowCaching(true);
	}
}

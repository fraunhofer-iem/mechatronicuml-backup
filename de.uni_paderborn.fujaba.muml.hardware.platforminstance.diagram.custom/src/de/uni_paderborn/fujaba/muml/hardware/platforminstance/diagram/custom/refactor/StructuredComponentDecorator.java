package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.refactor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.swt.graphics.Image;

import de.uni_paderborn.fujaba.muml.hardware.common.refactor.AbstractHierarchicalElementDecorator;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance;
import de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance;

public class StructuredComponentDecorator extends
		AbstractHierarchicalElementDecorator<HWPlatformInstance> {

	public StructuredComponentDecorator(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget);
	}

	@Override
	protected Image getDecorationImageElement(HWPlatformInstance element) {		
		return StatechartImages.SUB_STATECHART_PICTOGRAM.image();
	}

	
	protected Class<HWPlatformInstance> getTClass() {
		return HWPlatformInstance.class;
	}


	@Override
	protected EObject getEmbeddedElement(HWPlatformInstance element) {
		return element.getEmbeddedHPIC();
	}


	

	

}

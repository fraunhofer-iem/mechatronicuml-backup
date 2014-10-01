package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.refactor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.notation.BooleanValueStyle;
import org.eclipse.swt.graphics.Image;

import com.google.common.collect.Lists;

import de.uni_paderborn.fujaba.muml.hardware.common.refactor.AbstractExtractSubdiagramRefactoring;
import de.uni_paderborn.fujaba.muml.hardware.common.refactor.AbstractHierarchicalElementDecorator;
import de.uni_paderborn.fujaba.muml.hardware.common.refactor.DiagramPartitioningUtil;
import de.uni_paderborn.fujaba.muml.hardware.common.refactor.GMFNotationUtil;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance;
import de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance;

public class HWPlatformInstaceDecorator extends
		AbstractHierarchicalElementDecorator<HWPlatformInstance> {

	public HWPlatformInstaceDecorator(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget);
	}

	@Override
	protected Image getDecorationImageElement(HWPlatformInstance element) {
		IGraphicalEditPart adapter = (IGraphicalEditPart) getDecoratorTarget()
				.getAdapter(IGraphicalEditPart.class);
		BooleanValueStyle style = GMFNotationUtil
				.getBooleanValueStyle(adapter.getNotationView(),
						DiagramPartitioningUtil.INLINE_STYLE);
		if (style == null || style.isBooleanValue()) {
			return HWPlatformInstanceImages.COLLAPSE_PICTOGRAM.image();

		} else {
			return HWPlatformInstanceImages.EXPAND_PICTOGRAM.image();
		}
	}

	protected Class<HWPlatformInstance> getTClass() {
		return HWPlatformInstance.class;
	}

	@Override
	protected EObject getEmbeddedElement(HWPlatformInstance element) {
		return element.getEmbeddedHPIC();
	}

	@Override
	protected AbstractExtractSubdiagramRefactoring<HWPlatformInstance> getExtractClass() {
		// TODO Auto-generated method stub
		IGraphicalEditPart adapter = (IGraphicalEditPart) getDecoratorTarget()
				.getAdapter(IGraphicalEditPart.class);
		HWPICExtractSubdiagram extract = new HWPICExtractSubdiagram();
		extract.setContextObjects(Lists.newArrayList(adapter
				.getNotationView()));
		return extract;
	}

}

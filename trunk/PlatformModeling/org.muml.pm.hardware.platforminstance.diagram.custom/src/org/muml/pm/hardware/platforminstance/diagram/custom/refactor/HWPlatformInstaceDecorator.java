package org.muml.pm.hardware.platforminstance.diagram.custom.refactor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.notation.BooleanValueStyle;
import org.eclipse.swt.graphics.Image;
import org.muml.pm.hardware.common.refactor.AbstractExtractSubdiagramRefactoring;
import org.muml.pm.hardware.common.refactor.AbstractHierarchicalElementDecorator;
import org.muml.pm.hardware.common.refactor.DiagramPartitioningUtil;
import org.muml.pm.hardware.common.refactor.GMFNotationUtil;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance;

import com.google.common.collect.Lists;

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

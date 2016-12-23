package org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.componentinstanceconfiguration.diagram.custom.part.Activator;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.InstancePackage;

/**
 * A customized EditPart for ComponentInstances. A customized Figure will be
 * used, which underlines the text.
 * 
 * @author bingo
 * 
 */
public class CustomAtomicComponentInstance2EditPart extends
		AtomicComponentInstance2EditPart {

	public CustomAtomicComponentInstance2EditPart(View view) {
		super(view);
	}

	@Override
	protected IFigure createNodeShape() {
		return primaryShape = new CustomComponentFigure();
	}

	@Override
	protected NodeFigure createNodePlate() {
		NodeFigure plate = super.createNodePlate();
		plate.setMinimumSize(new Dimension(0, 0));
		return plate;
	}

	@Override
	public void handleNotificationEvent(final Notification notification) {
		Object feature = notification.getFeature();
		if (InstancePackage.Literals.COMPONENT_INSTANCE__COMPONENT_TYPE
				.equals(feature)) {
			executeTransformation();

		}

		super.handleNotificationEvent(notification);
	}

	private void executeTransformation() {

		EditingDomain editingDomain = getEditingDomain();
		if (editingDomain != null) {
			ComponentInstance componentInstance = (ComponentInstance) getNotationView()
					.getElement();
			Activator.createComponentInstance(editingDomain, componentInstance);
		}

	}

	public class CustomComponentFigure extends ComponentFigure {
		public CustomComponentFigure() {
			super();
			this.getFigureComponentNameFigure().setTextUnderline(true);
		}
	}

}

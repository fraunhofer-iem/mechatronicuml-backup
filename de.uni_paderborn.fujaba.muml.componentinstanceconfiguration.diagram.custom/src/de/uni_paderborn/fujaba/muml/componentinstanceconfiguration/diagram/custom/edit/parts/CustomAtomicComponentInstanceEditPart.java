package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.edit.commands.CreateInstancesCommand;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;

/**
 * A customized EditPart for ComponentInstances. A customized Figure will be
 * used, which underlines the text.
 * 
 * @author bingo
 * 
 */
public class CustomAtomicComponentInstanceEditPart extends
		AtomicComponentInstanceEditPart {

	public CustomAtomicComponentInstanceEditPart(View view) {
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
			EditingDomain editingDomain = getEditingDomain();
			if (editingDomain != null) {
				ComponentInstance componentInstance = (ComponentInstance) getNotationView()
						.getElement();
				CreateInstancesCommand command = new CreateInstancesCommand(
						componentInstance);
				editingDomain.getCommandStack().execute(command);
			}
		}

		super.handleNotificationEvent(notification);
	}

	public class CustomComponentFigure extends ComponentFigure {
		public CustomComponentFigure() {
			super();
			this.getFigureComponentNameFigure().setTextUnderline(true);
		}
	}

}

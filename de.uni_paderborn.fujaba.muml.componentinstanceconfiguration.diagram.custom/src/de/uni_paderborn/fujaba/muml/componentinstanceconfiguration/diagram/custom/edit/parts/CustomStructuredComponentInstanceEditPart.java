package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.edit.parts;

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.edit.commands.CreateInstancesCommand;
import de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;

/**
 * A customized EditPart for ComponentInstances. A customized Figure will be
 * used, which underlines the text.
 * 
 * @author bingo
 * 
 */
public class CustomStructuredComponentInstanceEditPart extends
		StructuredComponentInstanceEditPart {

	public CustomStructuredComponentInstanceEditPart(View view) {
		super(view);
	}

	@Override
	protected IFigure createNodeShape() {
		return primaryShape = new CustomComponentFigure();
	}

	@Override
	public void handleNotificationEvent(final Notification notification) {
		Object feature = notification.getFeature();
		if (InstancePackage.Literals.STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC
				.equals(feature)) {
			// ((CanonicalEditPolicy)getParent().getEditPolicy(EditPolicyRoles.CANONICAL_ROLE)).refresh();
			List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
					.getRegisteredEditPolicies(this.getDiagramView()
							.getElement());
			for (Iterator<CanonicalEditPolicy> it = editPolicies.iterator(); it
					.hasNext();) {
				CanonicalEditPolicy nextEditPolicy = it.next();
				nextEditPolicy.refresh();
			}
		} else if (InstancePackage.Literals.COMPONENT_INSTANCE__COMPONENT_TYPE
				.equals(feature)) {
			EditingDomain editingDomain = getEditingDomain();
			if (editingDomain != null) {
				ComponentInstance componentInstance = (ComponentInstance) getNotationView()
						.getElement();
				CreateInstancesCommand command = new CreateInstancesCommand(
						componentInstance);
				editingDomain.getCommandStack().execute(command);
				
				// refresh connections
				View view = getNotationView();
				while (view != null) {
					List<CanonicalEditPolicy> editPolicies = CanonicalEditPolicy
							.getRegisteredEditPolicies(view.getElement());
					for (Iterator<CanonicalEditPolicy> it = editPolicies.iterator(); it
							.hasNext();) {
						CanonicalEditPolicy nextEditPolicy = it.next();
						nextEditPolicy.refresh();
					}
					view = (View) view.eContainer();
				}
			}
		}

		super.handleNotificationEvent(notification);
	}

	@Override
	protected NodeFigure createNodePlate() {
		NodeFigure plate = super.createNodePlate();
		plate.setMinimumSize(new Dimension(0, 0));
		return plate;
	}

	public class CustomComponentFigure extends StructuredComponentFigure {
		public CustomComponentFigure() {
			super();
			this.getFigureComponentNameFigure().setTextUnderline(true);
		}
	}

}

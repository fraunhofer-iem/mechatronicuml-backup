package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.valuetype.NaturalNumber;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.policies.CustomComponentPartItemSemanticEditPolicy;
import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart;

/**
 * A customized EditPart for ComponentParts. A customized Figure will be used,
 * which allows displaying the ComponentPart as multi Part.
 * 
 * @author bingo
 * 
 */
public class CustomComponentPartEditPart extends ComponentPartEditPart {

	public CustomComponentPartEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.SEMANTIC_ROLE);
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CustomComponentPartItemSemanticEditPolicy());
	}
	
	@Override
	protected IFigure createNodeShape() {
		return primaryShape = new CustomComponentMultiFigure();
	}

	/**
	 * Called whenever the EditPart is going to be activated. Initializes
	 * objects.
	 */
	@Override
	public void activate() {
		updateCardinality();
		super.activate();
	}

	/**
	 * Updates the visual representation of this ComponentPart according to
	 * model changes.
	 */
	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		Object feature = notification.getFeature();
		if (ComponentPackage.Literals.COMPONENT_PART__CARDINALITY
				.equals(feature)) {
			updateCardinality();
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * Updates the PartFigure to visualize a multi-part, if necessary.
	 */
	public void updateCardinality() {
		CustomComponentMultiFigure figure = (CustomComponentMultiFigure) primaryShape;
		ComponentPart componentPart = (ComponentPart) getNotationView()
				.getElement();
		if (figure != null) {
			boolean isMulti = false;
			if (componentPart != null && componentPart.getCardinality() != null) {
				NaturalNumber upperBound = componentPart.getCardinality()
						.getUpperBound();
				if (upperBound != null
						&& (upperBound.isInfinity() || upperBound.getValue() > 1)) {
					isMulti = true;
				}
			}
			figure.setPartMulti(isMulti);
		}
	}

	public class CustomComponentMultiFigure extends ComponentMultiFigure {
		public CustomComponentMultiFigure() {
			super();
			// this.getFigureComponentNameFigure().setTextUnderline(true);
			setPartMulti(false);
		}

		public void setPartMulti(boolean isMulti) {
			// Calculate new Margin for top and right.
			int marginTop = 0;
			int marginRight = 0;
			if (isMulti) {
				marginTop = 8;
				marginRight = 3;
			}

			// Calculate new preferred size, which is the original size
			// minus the margin.
			if (getParent() != null) {
				Dimension preferredSize = getParent().getPreferredSize()
						.getCopy();
				preferredSize.expand(-marginRight, -marginTop);

				// Set the new margin and the new preferred size.
				RectangleFigure innerRectContainer = getFigureInnerRectContainer();
				innerRectContainer.setBorder(new MarginBorder(marginTop, 0, 0, marginRight));
				innerRectContainer.setPreferredSize(preferredSize);
			}
		}
	}

}

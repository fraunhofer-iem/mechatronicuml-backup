package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.model.component.impl.ComponentPartImpl;
import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart;

public class CustomComponentPartEditPart extends ComponentPartEditPart {

	public CustomComponentPartEditPart(View view) {
		super(view);
	}

	@Override
	protected IFigure createNodeShape() {
		return primaryShape = new CustomComponentMultiFigure();
	}
	

	/**
	 * Called whenever the EditPart is going to be activated. Initializes
	 * objects.
	 */
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
		if (feature instanceof EReference) {
			EReference reference = (EReference) feature;
			if (reference.getContainerClass() == ComponentPart.class) {
				int featureID = notification.getFeatureID(ComponentPartImpl.class);
				if (featureID == ComponentPackage.COMPONENT_PART__CARDINALITY) {
					updateCardinality();
				}
			}
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * Updates the PartFigure to visualize a multi-part, if necessary.
	 */
	public void updateCardinality() {
		CustomComponentMultiFigure figure = (CustomComponentMultiFigure) primaryShape;
		ComponentPart componentPart = (ComponentPart) getNotationView().getElement();
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
			this.getFigureComponentNameFigure().setTextUnderline(true);
			setPartMulti(false);
		}

		public void setPartMulti(boolean isMulti) {
			// Calculate new Margin for bottom, right.
			int marginBottomRight = 0;
			if (isMulti) {
				marginBottomRight = 3;
			}

			// Calculate new preferred size, which is the original size
			// minus the margin.
			if (getParent() != null) {
				Dimension preferredSize = getParent().getPreferredSize()
						.getCopy();
				preferredSize.expand(-marginBottomRight, -marginBottomRight);

				// Set the new margin and the new preferred size.
				RectangleFigure innerRectContainer = getFigureInnerRectContainer();
				innerRectContainer.setBorder(new MarginBorder(0, 0,
						marginBottomRight, marginBottomRight));
				innerRectContainer.setPreferredSize(preferredSize);
			}
		}
	}

}

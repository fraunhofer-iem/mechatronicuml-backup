package org.muml.pim.component.diagram.custom.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.widgets.Display;
import org.muml.pim.component.Component;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.component.Port;
import org.muml.pim.component.StructuredComponent;
import org.muml.pim.component.diagram.custom.part.Activator;
import org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pim.valuetype.NaturalNumber;
import org.muml.pim.valuetype.ValuetypePackage;

/**
 * A customized EditPart for ComponentParts. A customized Figure will be used,
 * which allows displaying the ComponentPart as multi Part.
 * 
 * @author bingo
 * 
 */
public class CustomComponentPartEditPart extends ComponentPartEditPart {

	protected List<String> portListenerNames = new ArrayList<String>();

	public CustomComponentPartEditPart(View view) {
		super(view);
	}

	@Override
	protected IFigure createNodeShape() {
		IFigure figure = super.createNodeShape();
		setPartMulti((ComponentMultiFigure) figure, false);
		return figure;
	}

	// Note: The following is the unchanged default implementation, can be
	// uncommented to change it.
	// @Override
	// public EditPolicy getPrimaryDragEditPolicy() {
	// EditPolicy policy = getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
	// return policy != null ? policy : new ResizableShapeEditPolicy() {
	// protected Command getMoveCommand(ChangeBoundsRequest request) {
	// ChangeBoundsRequest req = new ChangeBoundsRequest(REQ_MOVE_CHILDREN);
	// req.setEditParts(getHost());
	//
	// req.setMoveDelta(request.getMoveDelta());
	// req.setSizeDelta(request.getSizeDelta());
	// req.setLocation(request.getLocation());
	// req.setExtendedData(request.getExtendedData());
	// Command cmd = getHost().getParent().getCommand(req);
	// if (cmd instanceof ICommandProxy) {
	// System.out.println(((ICommandProxy)cmd).getICommand());
	// } else {
	// System.out.println(cmd);
	// }
	// return cmd;
	// }
	// };
	// }

	/**
	 * Called whenever the EditPart is going to be activated. Initializes
	 * objects.
	 */
	@Override
	public void activate() {
		super.activate();
		updateCardinality();

		Display.getCurrent().asyncExec(new Runnable() {
			@Override
			public void run() {
				executeTransformation();
				updateCardinality();
			}
		});
	}

	@Override
	protected void addSemanticListeners() {
		super.addSemanticListeners();

		ComponentPart componentPart = (ComponentPart) resolveSemanticElement();
		Component componentType = componentPart.getComponentType();
		if (componentType != null) {
			addListenerFilter("ComponentType", this, componentType);//$NON-NLS-1$
			int id = 0;
			for (Port port : componentType.getPorts()) {
				String listenerName = "Port" + id;
				portListenerNames.add(listenerName);
				addListenerFilter(listenerName, this, port);
				id++;
			}
		}
		Cardinality cardinality = componentPart.getCardinality();

		if (cardinality != null) {
			addListenerFilter("Cardinality", this, cardinality);//$NON-NLS-1

			NaturalNumber upperBound = cardinality.getUpperBound();
			if (upperBound != null) {
				addListenerFilter("Cardinality.upperBound", this, upperBound);
			}
		}
	}

	@Override
	protected void removeSemanticListeners() {
		super.removeSemanticListeners();
		removeListenerFilter("ComponentType"); //$NON-NLS-1$
		removeListenerFilter("Cardinality"); //$NON-NLS-1$
		removeListenerFilter("Cardinality.upperBound"); //$NON-NLS-1$

		// remove port listeners
		for (String listenerName : portListenerNames) {
			removeListenerFilter(listenerName);
		}
	}

	/**
	 * Updates the visual representation of this ComponentPart according to
	 * model changes.
	 */
	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		EStructuralFeature feature = (EStructuralFeature) notification
				.getFeature();

		if (ComponentPackage.Literals.COMPONENT_PART__CARDINALITY
				.equals(feature)
				|| ValuetypePackage.Literals.CARDINALITY.equals(feature
						.getEContainingClass())
				|| ValuetypePackage.Literals.NATURAL_NUMBER.equals(feature
						.getEContainingClass())) {
			updateCardinality();

			// Remove and recreate listeners
			reactivateSemanticModel();

		} else if (ComponentPackage.Literals.COMPONENT_PART__COMPONENT_TYPE
				.equals(feature)) {

			// Remove and recreate listeners
			reactivateSemanticModel();

			executeTransformation();
		} else if (ComponentPackage.Literals.COMPONENT__PORTS == feature
				|| ComponentPackage.Literals.DISCRETE_PORT__REFINED_ROLE == feature) {
			executeTransformation();
		}
		super.handleNotificationEvent(notification);
	}

	private void executeTransformation() {
		executePortPartTransformation();
		executeCoordinationProtocolPartTransformation();
		Display.getCurrent().asyncExec(new Runnable() {

			@Override
			public void run() {
				EObject element = getDiagramView().getElement();
				if (element != null) {
					for (CanonicalEditPolicy policy : CanonicalEditPolicy.getRegisteredEditPolicies(element)) {
						policy.refresh();
					}
				}
			}
			
		});
	}

	private void executePortPartTransformation() {
		EditingDomain editingDomain = getEditingDomain();
		if (editingDomain != null) {
			ComponentPart componentPart = (ComponentPart) getNotationView()
					.getElement();
			Activator.updateComponentPart(editingDomain, componentPart);
		}
	}

	private void executeCoordinationProtocolPartTransformation() {
		EditingDomain editingDomain = getEditingDomain();
		if (editingDomain != null) {
			ComponentPart componentPart = (ComponentPart) getNotationView()
					.getElement();
			StructuredComponent component = componentPart.getParentComponent();
			Activator.updateCoordinationProtocolParts(editingDomain, component);
		}
	}

	/**
	 * Updates the PartFigure to visualize a multi-part, if necessary.
	 */
	public void updateCardinality() {
		ComponentMultiFigure figure = (ComponentMultiFigure) primaryShape;
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
			setPartMulti(figure, isMulti);
		}
	}

	public static void setPartMulti(ComponentMultiFigure figure, boolean isMulti) {
		// Calculate new Margin for top and right.
		int marginTop = 0;
		int marginRight = 0;
		if (isMulti) {
			marginTop = 8;
			marginRight = 3;
		}

		// Calculate new preferred size, which is the original size
		// minus the margin.
		if (figure.getParent() != null) {
			Dimension preferredSize = figure.getParent().getPreferredSize()
					.getCopy();
			preferredSize.expand(-marginRight, -marginTop);

			// Set the new margin and the new preferred size.
			RectangleFigure innerRectContainer = figure
					.getFigureInnerRectContainer();
			innerRectContainer.setBorder(new MarginBorder(marginTop, 0, 0,
					marginRight));
			innerRectContainer.setPreferredSize(preferredSize);
		}
	}

}

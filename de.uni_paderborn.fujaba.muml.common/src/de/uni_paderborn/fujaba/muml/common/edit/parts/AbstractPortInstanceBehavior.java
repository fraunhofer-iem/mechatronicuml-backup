package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;

import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

public abstract class AbstractPortInstanceBehavior extends AbstractBasePortBehavior {

	/**
	 * The model object. It will be set, while the EditPart is active (between
	 * calls to activate() and deactivate()).
	 */
	private PortInstance portInstance;

	public AbstractPortInstanceBehavior(GraphicalEditPart editPart) {
		super(editPart);
	}

	@Override
	public void activate() {
		EObject element = editPart.getNotationView().getElement();
		if (element instanceof PortInstance) {
			portInstance = (PortInstance) editPart.getNotationView().getElement();
		}

		EditPart parentEditPart = editPart.getParent();
		IFigure figure = null;
		if (parentEditPart instanceof GraphicalEditPart) {
			figure = ((GraphicalEditPart) parentEditPart).getFigure();
		}
		if (figure instanceof BorderedNodeFigure) {
			BorderedNodeFigure bnf = (BorderedNodeFigure) figure;
			IFigure portContainerFigure = bnf.getBorderItemContainer();
			addPortContainerLayoutListener(portContainerFigure);
		}

		super.activate();
	}

	public PortInstance getPortInstance() {
		return portInstance;
	}

	/**
	 * Called whenever the EditPart is going to be deactivated. Cleans up
	 * objects.
	 */
	@Override
	public void deactivate() {
		portInstance = null;

		EditPart parentEditPart = editPart.getParent();
		IFigure figure = null;
		if (parentEditPart instanceof GraphicalEditPart) {
			figure = ((GraphicalEditPart) parentEditPart).getFigure();
		}
		if (figure instanceof BorderedNodeFigure) {
			BorderedNodeFigure bnf = (BorderedNodeFigure) figure;
			IFigure portContainerFigure = bnf.getBorderItemContainer();
			removePortContainerLayoutListener(portContainerFigure);
		}

		super.deactivate();
	}

	@Override
	public boolean isMultiPort() {
		return false;
	}

}

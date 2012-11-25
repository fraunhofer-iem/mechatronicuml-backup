package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;

import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

public abstract class AbstractPortInstanceBehavior extends AbstractPortBehavior {

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

		GraphicalEditPart parentEditPart = (GraphicalEditPart) editPart.getParent();
		if (parentEditPart.getFigure() instanceof BorderedNodeFigure) {
			BorderedNodeFigure bnf = (BorderedNodeFigure) parentEditPart.getFigure();
			IFigure portContainerFigure = bnf.getBorderItemContainer();
			addLayoutListener(portContainerFigure);
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
			removeContainerLayoutListener(portContainerFigure);
		}

		super.deactivate();
	}

	@Override
	public boolean isMulti() {
		return false;
	}
	
	@Override
	public boolean isMandatory() {
		return true;
	}

}

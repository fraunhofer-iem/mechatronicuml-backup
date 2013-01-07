package de.uni_paderborn.fujaba.muml.common.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
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
			portInstance = (PortInstance) editPart.getNotationView()
					.getElement();
		}

		IFigure portContainerFigure = getPortContainerFigure();
		if (portContainerFigure != null) {
			addLayoutListener(portContainerFigure);
		}

		super.activate();
	}

	/**
	 * Called whenever the EditPart is going to be deactivated. Cleans up
	 * objects.
	 */
	@Override
	public void deactivate() {
		portInstance = null;

		IFigure portContainerFigure = getPortContainerFigure();
		if (portContainerFigure != null) {
			removeLayoutListener(portContainerFigure);
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

	public PortInstance getPortInstance() {
		return portInstance;
	}

}

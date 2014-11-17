package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable;

public class CustomMultiPortVariableEditPart extends MultiPortVariableEditPart {

	/**
	 * Constructs this EditPart.
	 * 
	 * @param view
	 *            The graphical model.
	 */
	public CustomMultiPortVariableEditPart(View view) {
		super(view);

	}

	/**
	 * Updates the visual representation of this Port according to model
	 * changes.
	 */
	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		super.handleNotificationEvent(notification);
		if (ComponentstorypatternPackage.Literals.PORT_VARIABLE__PORT_TYPE
				.equals(notification.getFeature())) {
			updateSinglePortVariableTypes();
		}
	}

	private void updateSinglePortVariableTypes() {
		MultiPortVariable multiPortVariable = (MultiPortVariable) getNotationView()
				.getElement();
		if (multiPortVariable != null)
			for (SinglePortVariable singlePortVariable : multiPortVariable
					.getSubPortVariables()) {
				singlePortVariable.setDataType(multiPortVariable.getPortType());
			}
	}

}

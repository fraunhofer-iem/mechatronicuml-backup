package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.common.edit.parts.MultiPortVariableBehavior;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariable2EditPart;

public class CustomMultiPortVariable2EditPart extends
		MultiPortVariable2EditPart {

	/**
	 * All behavior is delegated, to reduce duplicate code.
	 */
	private MultiPortVariableBehavior delegation;

	/**
	 * Constructs this EditPart.
	 * 
	 * @param view
	 *            The graphical model.
	 */
	public CustomMultiPortVariable2EditPart(View view) {
		super(view);
	}
	
	/**
	 * Gets the PortBehavior object or lazily creates it. It will never return
	 * null.
	 * 
	 * @return The PortBehavior object.
	 */
	private MultiPortVariableBehavior getDelegation() {
		if (delegation == null) {
			delegation = new MultiPortVariableBehavior(this);
		}
		return delegation;
	}

	/**
	 * Updates the visual representation of this Port according to model
	 * changes.
	 */
	@Override
	protected final void handleNotificationEvent(final Notification notification) {
		getDelegation().handleNotificationEvent(notification);
		super.handleNotificationEvent(notification);
	}

	/**
	 * Initializes this EditPart, when it is activated.
	 */
	@Override
	public void activate() {
		getDelegation().activate();
		super.activate();
	}

	/**
	 * Cleanup this EditPart.
	 */
	@Override
	public void deactivate() {
		getDelegation().deactivate();
		super.deactivate();
	}
}

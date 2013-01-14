package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.common.edit.parts.MultiPortVariableBehavior;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.util.CsdmUtility;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariableEditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;

public class CustomMultiPortVariableEditPart extends MultiPortVariableEditPart {

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
	public CustomMultiPortVariableEditPart(View view) {
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
		
		if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR
				.equals(notification.getFeature())) {
			CsdmUtility.adaptColor(this);
		} else if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS
				.equals(notification.getFeature())) {
			//updateOptional();
			//updateNegative();
		}
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

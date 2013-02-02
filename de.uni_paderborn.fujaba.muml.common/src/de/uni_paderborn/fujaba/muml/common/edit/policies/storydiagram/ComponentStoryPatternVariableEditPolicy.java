package de.uni_paderborn.fujaba.muml.common.edit.policies.storydiagram;

import org.eclipse.emf.common.notify.Notification;
import org.storydriven.storydiagrams.patterns.BindingSemantics;

import de.uni_paderborn.fujaba.muml.common.edit.policies.NotifyingGraphicalEditPolicy;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;

/**
 * This edit policy updates the visualization of a
 * ComponentStoryPatternVariable.
 * 
 * The binding semantics decides if the figure is shown as optional (dashed) or
 * negative (strike-through).
 * 
 * Strike-through is implemented by adding a figure to the edit parts
 * content-pane, which looks like an X. For this to work okay, it is necessary
 * that the content-pane's root figure has a stack layout assigned.
 * 
 * Dashed outlines are implemented by setting the line style of the outline to
 * dashed.
 */
public class ComponentStoryPatternVariableEditPolicy extends
		NotifyingGraphicalEditPolicy {

	/**
	 * Convenience method, is designed to be overriden by subclasses.
	 * 
	 * @return The ComponentStoryPatternVariable.
	 */
	protected ComponentStoryPatternVariable getComponentStoryPatternVariable() {
		return (ComponentStoryPatternVariable) getSemanticElement();
	}

	@Override
	public void activate() {
		super.activate();
		// Initially show the correct visualization.
		updateBindingSemantics((BindingSemantics) getSemanticElement()
				.eGet(ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS));
	}

	/**
	 * Update visualization on model changes.
	 */
	@Override
	public void handleNotificationEvent(Notification notification) {
		if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS
				.equals(notification.getFeature())) {
			updateBindingSemantics((BindingSemantics) notification
					.getNewValue());
		}

		super.handleNotificationEvent(notification);
	}

	/**
	 * Update visualization.
	 * 
	 * @param bindingSemantics
	 *            The current value of binding semantics.
	 */
	protected void updateBindingSemantics(BindingSemantics bindingSemantics) {

	}
}

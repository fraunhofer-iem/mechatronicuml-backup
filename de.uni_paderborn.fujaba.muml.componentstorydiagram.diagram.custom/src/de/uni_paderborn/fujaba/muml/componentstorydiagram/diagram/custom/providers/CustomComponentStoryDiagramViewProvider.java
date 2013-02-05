package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramViewProvider;

public class CustomComponentStoryDiagramViewProvider extends
		ComponentStoryDiagramViewProvider {
	/**
	 * Add line type style so that dashes work
	 * 
	 * <p>
	 * 
	 * TODO: do this in gmfgen / postreconcile transformation
	 * 
	 * @see ComponentStoryPatternVariableEditPolicy
	 */
	@Override
	public Node createSinglePortVariable_3017(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = super.createSinglePortVariable_3017(domainElement,
				containerView, index, persisted, preferencesHint);
		node.createStyle(NotationPackage.Literals.LINE_TYPE_STYLE);
		return node;
	}

	/**
	 * Add line type style so that dashes work
	 * 
	 * <p>
	 * 
	 * TODO: do this in gmfgen / postreconcile transformation
	 * 
	 * @see ComponentStoryPatternVariableEditPolicy
	 */
	@Override
	public Node createSinglePortVariable_3018(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = super.createSinglePortVariable_3018(domainElement,
				containerView, index, persisted, preferencesHint);
		node.createStyle(NotationPackage.Literals.LINE_TYPE_STYLE);
		return node;
	}

	/**
	 * Add line type style so that dashes work
	 * 
	 * <p>
	 * 
	 * TODO: do this in gmfgen / postreconcile transformation
	 * 
	 * @see ComponentStoryPatternVariableEditPolicy
	 */
	@Override
	public Node createSinglePortVariable_3020(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = super.createSinglePortVariable_3020(domainElement,
				containerView, index, persisted, preferencesHint);
		node.createStyle(NotationPackage.Literals.LINE_TYPE_STYLE);
		return node;
	}

}

package org.muml.testlanguage.diagram.providers;

import org.muml.testlanguage.diagram.part.TestLanguageDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = TestLanguageDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			TestLanguageDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}

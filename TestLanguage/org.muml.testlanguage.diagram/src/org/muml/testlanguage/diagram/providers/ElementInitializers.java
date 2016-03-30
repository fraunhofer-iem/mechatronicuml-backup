package org.muml.testlanguage.diagram.providers;

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
		ElementInitializers cached = org.muml.testlanguage.diagram.part.TestLanguageDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			org.muml.testlanguage.diagram.part.TestLanguageDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}

package pattern.diagram.providers;

import pattern.diagram.part.Pattern2DiagramEditorPlugin;

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
		ElementInitializers cached = Pattern2DiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			Pattern2DiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}

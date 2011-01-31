package patterneditor.diagram.providers;

import patterneditor.diagram.part.PatternDiagramEditorPlugin;

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
		ElementInitializers cached = PatternDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			PatternDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}

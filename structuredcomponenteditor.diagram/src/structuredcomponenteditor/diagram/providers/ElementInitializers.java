package structuredcomponenteditor.diagram.providers;

import structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin;

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
		ElementInitializers cached = StructuredcomponentDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			StructuredcomponentDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}

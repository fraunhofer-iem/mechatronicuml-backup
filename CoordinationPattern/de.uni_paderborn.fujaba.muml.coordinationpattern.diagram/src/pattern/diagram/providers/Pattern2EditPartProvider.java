package pattern.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import pattern.diagram.edit.parts.ModelElementCategoryEditPart;
import pattern.diagram.edit.parts.Pattern2EditPartFactory;
import pattern.diagram.part.Pattern2VisualIDRegistry;

/**
 * @generated
 */
public class Pattern2EditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public Pattern2EditPartProvider() {
		super(new Pattern2EditPartFactory(),
				Pattern2VisualIDRegistry.TYPED_INSTANCE,
				ModelElementCategoryEditPart.MODEL_ID);
	}

}

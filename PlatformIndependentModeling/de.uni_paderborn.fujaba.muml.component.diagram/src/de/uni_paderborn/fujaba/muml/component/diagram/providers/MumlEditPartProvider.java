package de.uni_paderborn.fujaba.muml.component.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class MumlEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public MumlEditPartProvider() {
		super(
				new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.MumlEditPartFactory(),
				de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry.TYPED_INSTANCE,
				de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID);
	}
}

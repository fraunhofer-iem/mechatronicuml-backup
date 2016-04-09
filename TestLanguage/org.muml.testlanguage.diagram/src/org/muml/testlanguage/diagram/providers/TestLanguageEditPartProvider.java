package org.muml.testlanguage.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.muml.testlanguage.diagram.edit.parts.TestCaseEditPart;
import org.muml.testlanguage.diagram.edit.parts.TestLanguageEditPartFactory;
import org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry;

/**
 * @generated
 */
public class TestLanguageEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public TestLanguageEditPartProvider() {
		super(new TestLanguageEditPartFactory(), TestLanguageVisualIDRegistry.TYPED_INSTANCE,
				TestCaseEditPart.MODEL_ID);
	}

}

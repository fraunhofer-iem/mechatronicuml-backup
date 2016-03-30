package org.muml.testlanguage.diagram.custom.providers;

import org.muml.testlanguage.diagram.custom.edit.parts.TestLanguageEditPartFactoryOverride;
import org.muml.testlanguage.diagram.providers.TestLanguageEditPartProvider;

public class TestLanguageEditPartProviderOverride extends
		TestLanguageEditPartProvider {

	public TestLanguageEditPartProviderOverride() {
		super();
		this.setFactory(new TestLanguageEditPartFactoryOverride());
	}
	
}

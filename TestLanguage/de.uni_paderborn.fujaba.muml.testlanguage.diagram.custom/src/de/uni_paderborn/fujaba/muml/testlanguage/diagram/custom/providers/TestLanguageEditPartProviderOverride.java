package de.uni_paderborn.fujaba.muml.testlanguage.diagram.custom.providers;

import de.uni_paderborn.fujaba.muml.testlanguage.diagram.custom.edit.parts.TestLanguageEditPartFactoryOverride;
import de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageEditPartProvider;

public class TestLanguageEditPartProviderOverride extends
		TestLanguageEditPartProvider {

	public TestLanguageEditPartProviderOverride() {
		super();
		this.setFactory(new TestLanguageEditPartFactoryOverride());
	}
	
}

package org.muml.pim.actionlanguage.xtext.ui.popup.actions;

import org.muml.pim.actionlanguage.xtext.common.LanguageResource;
import org.muml.pim.actionlanguage.xtext.storage.IModelStorage;
import org.muml.pim.actionlanguage.xtext.storage.SynchronizationStorage;
import org.muml.pim.actionlanguage.xtext.ui.internal.ActionLanguageActivator;

public class OpenEditorSynchronization extends OpenEditorBase {
	private static final String languageName = "de.uni_paderborn.fujaba.muml.ActionLanguage";

	@Override
	protected IModelStorage getStorage() {
		LanguageResource.setInjector(ActionLanguageActivator.getInstance().getInjector(languageName));
		return new SynchronizationStorage(getModel());
	}

}

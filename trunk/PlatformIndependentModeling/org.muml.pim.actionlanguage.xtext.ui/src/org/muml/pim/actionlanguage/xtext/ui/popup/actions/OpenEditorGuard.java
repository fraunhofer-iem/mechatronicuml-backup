package org.muml.pim.actionlanguage.xtext.ui.popup.actions;

import org.muml.pim.actionlanguage.xtext.common.LanguageResource;
import org.muml.pim.actionlanguage.xtext.storage.GuardStorage;
import org.muml.pim.actionlanguage.xtext.storage.IModelStorage;
import org.muml.pim.actionlanguage.xtext.ui.internal.ActionLanguageActivator;


public class OpenEditorGuard extends OpenEditorBase {
	private static final String languageName = "org.muml.pim.actionlanguage";

	@Override
	protected IModelStorage getStorage() {
		//ActionLanguageResource.setInjector(GuardLanguageUiModule.getInjector());
		LanguageResource.setInjector(ActionLanguageActivator.getInstance().getInjector(languageName));
		return new GuardStorage(getModel());
	}

}

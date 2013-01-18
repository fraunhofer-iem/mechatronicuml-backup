package de.uni_paderborn.fujaba.muml.ui.popup.actions;

import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.storage.GuardStorage;
import de.uni_paderborn.fujaba.muml.storage.IModelStorage;
import de.uni_paderborn.fujaba.muml.ui.internal.ActionLanguageActivator;


public class OpenEditorGuard extends OpenEditorBase {
	private static final String languageName = "de.uni_paderborn.fujaba.muml.ActionLanguage";

	@Override
	protected IModelStorage getStorage() {
		//ActionLanguageResource.setInjector(GuardLanguageUiModule.getInjector());
		LanguageResource.setInjector(ActionLanguageActivator.getInstance().getInjector(languageName));
		return new GuardStorage(getModel());
	}

}

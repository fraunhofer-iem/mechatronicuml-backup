package de.uni_paderborn.fujaba.muml.ui.popup.actions;

import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.storage.IModelStorage;
import de.uni_paderborn.fujaba.muml.storage.SynchronizationStorage;
import de.uni_paderborn.fujaba.muml.ui.internal.ActionLanguageActivator;

public class OpenEditorSynchronization extends OpenEditorBase {
	private static final String languageName = "de.uni_paderborn.fujaba.muml.ActionLanguage";

	@Override
	protected IModelStorage getStorage() {
		LanguageResource.setInjector(ActionLanguageActivator.getInstance().getInjector(languageName));
		return new SynchronizationStorage(getModel());
	}

}

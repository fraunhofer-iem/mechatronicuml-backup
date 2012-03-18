package de.uni_paderborn.fujaba.muml.ui.popup.actions;

import de.uni_paderborn.fujaba.muml.ui.GuardStorage;
import de.uni_paderborn.fujaba.muml.ui.IModelStorage;

public class OpenEditorGuard extends OpenEditorBase {

	@Override
	protected IModelStorage getStorage() {
		return new GuardStorage(getModel());
	}

}

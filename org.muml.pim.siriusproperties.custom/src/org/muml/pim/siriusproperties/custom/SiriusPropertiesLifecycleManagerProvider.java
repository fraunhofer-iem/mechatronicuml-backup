package org.muml.pim.siriusproperties.custom;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

public class SiriusPropertiesLifecycleManagerProvider implements IEEFLifecycleManagerProvider {
	/**
	 * The identifier of the control description supported.
	 */
	private static final String ACTIONLANGUAGE_XTEXTEDITOR_ID = "org.muml.pim.actionlanguage.xtexteditor."; //$NON-NLS-1$

	@Override
	public boolean canHandle(EEFControlDescription controlDescription) {
		// only support custom widgets with the proper identifier
		if (controlDescription instanceof EEFCustomWidgetDescription) {
			String identifier = controlDescription.getIdentifier();
			if (identifier!=null) {
				if (identifier.startsWith(ACTIONLANGUAGE_XTEXTEDITOR_ID)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public IEEFLifecycleManager getLifecycleManager(EEFControlDescription controlDescription, IVariableManager variableManager,
			IInterpreter interpreter, EditingContextAdapter contextAdapter) {
		String identifier = controlDescription.getIdentifier();
		if (identifier!=null) {
			if (identifier.startsWith(ACTIONLANGUAGE_XTEXTEDITOR_ID)) {
				String featureName = identifier.substring(ACTIONLANGUAGE_XTEXTEDITOR_ID.length());
				return new org.muml.pim.siriusproperties.custom.embeddedxtexteditor.XtextPartialViewerLifecycleManager((EEFCustomWidgetDescription) controlDescription, variableManager, interpreter, contextAdapter, featureName);
			}
		}
		throw new IllegalArgumentException();
	}
}


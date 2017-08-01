package org.muml.core.siriusproperties.custom;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.muml.core.siriusproperties.custom.embeddedxtexteditor.EmbeddedXtextEditorLifecycleManager;

public class SiriusPropertiesLifecycleManagerProvider implements IEEFLifecycleManagerProvider {
	/**
	 * The identifier of the control description supported.
	 */
	private static final String EMBEDDED_XTEXT_ID = "org.muml.core.siriusproperties.custom.embeddedxtexteditor"; //$NON-NLS-1$

	@Override
	public boolean canHandle(EEFControlDescription controlDescription) {
		// only support custom widgets with the proper identifier
		if (controlDescription instanceof EEFCustomWidgetDescription) {
			return EMBEDDED_XTEXT_ID.equals(controlDescription.getIdentifier());
		}
		return false;
	}

	@Override
	public IEEFLifecycleManager getLifecycleManager(EEFControlDescription controlDescription, IVariableManager variableManager,
			IInterpreter interpreter, EditingContextAdapter contextAdapter) {
		if (controlDescription instanceof EEFCustomWidgetDescription) {
			if (EMBEDDED_XTEXT_ID.equals(controlDescription.getIdentifier())) {
				return new EmbeddedXtextEditorLifecycleManager((EEFCustomWidgetDescription) controlDescription, variableManager, interpreter, contextAdapter);
			}
		}
		throw new IllegalArgumentException();
	}
}


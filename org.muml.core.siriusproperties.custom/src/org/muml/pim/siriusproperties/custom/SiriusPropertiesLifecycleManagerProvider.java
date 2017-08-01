package org.muml.pim.siriusproperties.custom;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.muml.pim.actionlanguage.xtext.ui.internal.ActionLanguageActivator;

import com.google.inject.Injector;

public class SiriusPropertiesLifecycleManagerProvider implements IEEFLifecycleManagerProvider {
	/**
	 * The identifier of the control description supported.
	 */
	private static final String ACTIONLANGUAGE_XTEXTEDITOR_ID = "org.muml.pim.actionlanguage.xtexteditor"; //$NON-NLS-1$

	@Override
	public boolean canHandle(EEFControlDescription controlDescription) {
		// only support custom widgets with the proper identifier
		if (controlDescription instanceof EEFCustomWidgetDescription) {
			return ACTIONLANGUAGE_XTEXTEDITOR_ID.equals(controlDescription.getIdentifier());
		}
		return false;
	}

	@Override
	public IEEFLifecycleManager getLifecycleManager(EEFControlDescription controlDescription, IVariableManager variableManager,
			IInterpreter interpreter, EditingContextAdapter contextAdapter) {
		if (controlDescription instanceof EEFCustomWidgetDescription) {
			if (ACTIONLANGUAGE_XTEXTEDITOR_ID.equals(controlDescription.getIdentifier())) {
				return new org.muml.pim.siriusproperties.custom.embeddedxtexteditor.XtextPartialViewerLifecycleManager((EEFCustomWidgetDescription) controlDescription, variableManager, interpreter, contextAdapter);
			}
		}
		throw new IllegalArgumentException();
	}
}


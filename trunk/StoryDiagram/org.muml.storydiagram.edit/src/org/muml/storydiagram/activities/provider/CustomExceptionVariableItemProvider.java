package org.muml.storydiagram.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.activities.provider.ExceptionVariableItemProvider;

public class CustomExceptionVariableItemProvider extends ExceptionVariableItemProvider {
	public CustomExceptionVariableItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/ExceptionVariable.png"); //$NON-NLS-1$
	}
}

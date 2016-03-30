package org.muml.storydiagram.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.activities.provider.OperationExtensionItemProvider;

public class CustomOperationExtensionItemProvider extends OperationExtensionItemProvider {
	public CustomOperationExtensionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/OperationExtension.png"); //$NON-NLS-1$
	}
}

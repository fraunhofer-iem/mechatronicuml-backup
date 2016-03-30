package org.muml.storydiagram.activities.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.activities.provider.StatementNodeItemProvider;

public class CustomStatementNodeItemProvider extends StatementNodeItemProvider {
	public CustomStatementNodeItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/StatementNode.png"); //$NON-NLS-1$
	}
}

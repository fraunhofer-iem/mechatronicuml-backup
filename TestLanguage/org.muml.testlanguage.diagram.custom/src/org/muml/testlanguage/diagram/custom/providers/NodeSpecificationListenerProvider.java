package org.muml.testlanguage.diagram.custom.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;

public interface NodeSpecificationListenerProvider {

	void installListenerFilter(String filterId, NotificationListener listener,
			EObject element);

	void uninstallListenerFilter(String filterId);

	EObject resolveSemanticElement();
}

package org.muml.core.modelinstance.ui.diagrams.pages;

import org.eclipse.emf.ecore.resource.Resource;

public interface IResourceChangedListener {
	void resourceChanged(Resource newResource);
}

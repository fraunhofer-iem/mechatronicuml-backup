package de.uni_paderborn.fujaba.modelinstance.ui.diagrams.pages;

import org.eclipse.emf.ecore.resource.Resource;

public interface IResourceChangedListener {
	void resourceChanged(Resource newResource);
}

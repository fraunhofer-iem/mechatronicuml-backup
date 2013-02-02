package de.uni_paderborn.fujaba.newwizard.diagrams.pages;

import org.eclipse.emf.ecore.resource.Resource;

public interface IResourceChangedListener {
	void resourceChanged(Resource newResource);
}

package de.uni_paderborn.fujaba.export.listeners;

import org.eclipse.emf.ecore.resource.Resource;

public interface ResourceChangeListener {

	
	public void handleResourceChange(Resource newResource);
}

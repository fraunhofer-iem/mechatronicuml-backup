package org.muml.storydiagram.resourcesetsynchronizer;

import org.eclipse.emf.ecore.resource.Resource;

public interface IResourceFilter
{
	public boolean synchronizeResource(Resource resource);
}

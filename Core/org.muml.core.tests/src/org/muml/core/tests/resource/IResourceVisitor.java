package org.muml.core.tests.resource;

import org.eclipse.emf.ecore.EObject;

/**
 * Interface for visitors that can be used to visit genmodel elements.
 * 
 * @author ingo
 * 
 */
public interface IResourceVisitor {
	/**
	 * Visits this element.
	 * 
	 * @param element
	 *            The element to visit.
	 * @return <code>true</code>, if children of the <code>element</code>
	 *         should be visited, too.
	 */
	boolean visit(EObject element);
}
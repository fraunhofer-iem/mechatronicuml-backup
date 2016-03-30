package org.muml.core.tests;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.muml.core.tests.resource.ILabelProvider;
import org.muml.core.tests.resource.IResourceVisitor;

public class TraverseTest {

	private static ILabelProvider labelProvider = new ILabelProvider() {
		@Override
		public String getLabel(EObject element) {
			if (element != null) {
				return element.eClass().getName();
			}
			return "null";
		}
	};

	public static void setLabelProvider(ILabelProvider labelProvider) {
		TraverseTest.labelProvider = labelProvider;
	}

	public static String getLabel(EObject element) {
		if (labelProvider != null) {
			return labelProvider.getLabel(element);
		}
		return "ERROR: no label provider set!";
	}

	/**
	 * Traverses the containment hierarchy starting the the specified
	 * <code>element</code> and visits all found elements using the
	 * <code>visitor</code>.
	 * 
	 * @param element
	 *            The start element.
	 * @param visitor
	 *            The visitor to accept.
	 */
	protected void accept(EObject element, IResourceVisitor visitor) {
		if (element == null) {
			return;
		}
		if (visitor.visit(element)) {
			for (EObject child : getContents(element)) {
				accept(child, visitor);
			}
		}
	}

	/**
	 * Method that gets an objects contents (contained children). Can be
	 * overridden to get only specific children.
	 * 
	 * @param element
	 *            The element to get children for.
	 * @return The children.
	 */
	protected Collection<EObject> getContents(EObject element) {
		return element.eContents();
	}

	/**
	 * Auxiliary method to get the root element of the resource.
	 * 
	 * @param resource
	 *            The resource to get the root element from.
	 * 
	 * @return The root element, or
	 *         <code>null</null> if there is something wrong with the resource.
	 */
	protected static EPackage getRootElement(Resource resource) {
		EList<EObject> contents = resource.getContents();
		if (contents.size() == 1) {
			EObject root = contents.get(0);
			if (root instanceof EPackage) {
				return (EPackage) root;
			}
		}
		return null;
	}

}

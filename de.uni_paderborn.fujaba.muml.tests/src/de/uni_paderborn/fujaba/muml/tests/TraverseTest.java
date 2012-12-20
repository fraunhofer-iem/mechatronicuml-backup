package de.uni_paderborn.fujaba.muml.tests;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.muml.tests.resource.ILabelProvider;
import de.uni_paderborn.fujaba.muml.tests.resource.IResourceVisitor;

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
	
	protected static Resource loadResource(ResourceSet resourceSet, String projectName, String resourcePath) {
		Resource resource = null;
		URI uri = URI.createPlatformResourceURI(projectName
				+ resourcePath, true);
		assertNotNull(uri);

		// Find out absolute path of project
		StringBuffer absoluteProjectPath = new StringBuffer();
		absoluteProjectPath.append(new File("").getAbsoluteFile()
				.getParentFile());
		absoluteProjectPath.append('/');
		absoluteProjectPath.append(projectName);
		// no idea why, but this is necessary two times :)
		absoluteProjectPath.append('/');
		absoluteProjectPath.append(projectName);

		// Register platform mapping for project
		EcorePlugin.getPlatformResourceMap().put(projectName,
				URI.createFileURI(absoluteProjectPath.toString()));

		// Load resource
		resource = resourceSet.getResource(uri, true);
		assertNotNull(resource);

		// Resolve all referenced models
		EcoreUtil.resolveAll(resourceSet);
		
		return resource;
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
	protected static void accept(EObject element, IResourceVisitor visitor) {
		if (element == null) {
			return;
		}
		if (visitor.visit(element)) {
			for (EObject child : element.eContents()) {
				accept(child, visitor);
			}
		}
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

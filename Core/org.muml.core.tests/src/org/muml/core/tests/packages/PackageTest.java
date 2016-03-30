package org.muml.core.tests.packages;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.muml.core.tests.TraverseTest;
import org.muml.core.tests.resource.IResourceVisitor;
import org.muml.core.tests.resource.ProblemCollector;

public abstract class PackageTest extends TraverseTest {

//	public static Resource loadEcoreResource(String ecoreModelProject,
//			String ecoreModelPath) throws Exception {
//		// Initialize new ResourceSet
//		ResourceSet resourceSet = new ResourceSetImpl();
//
//		Map<String, Object> extensionToFactoryMap = resourceSet
//				.getResourceFactoryRegistry().getExtensionToFactoryMap();
//		extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl());
//		extensionToFactoryMap.put("genmodel", new EcoreResourceFactoryImpl());
//		extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
//				new XMIResourceFactoryImpl());
//
//		// Register Packages
//		EcorePackage.eINSTANCE.eClass();
//		GenModelPackage.eINSTANCE.eClass();
//
//		// Load resource
//		return TestUtilities.loadResource(resourceSet, ecoreModelProject,
//				ecoreModelPath);
//	}

	@SuppressWarnings("unchecked")
	protected Collection<EObject> getContents(EObject element) {
		return (Collection<EObject>) ((Collection<?>) ((EPackage) element)
				.getESubpackages());
	}

	public void testPluginXml(EPackage _package, final Collection<String> uris, final String name) throws Exception {
		final ProblemCollector problems = new ProblemCollector();
		accept(_package, new IResourceVisitor() {

			@Override
			public boolean visit(EObject element) {
				EPackage _package = (EPackage) element;
				String nsUri = _package.getNsURI();
				if (uris.contains(nsUri)) {
					while (uris.remove(nsUri)); // Remove all occurrences
				} else if (isRequiredPackage(_package)) {
					for (EObject contents : _package.eContents()) {
						if (contents instanceof EPackage) {
							return true; // Do not care about hierarchical packages; just the leafs of the package hierarchy.
						}
					}
					problems.add("MISSING: "
							+ name
							+ " does not have an extension for package with nsUri: "
							+ nsUri);
				}

				return true;
			}

		});
		for (String nsUri : uris) {
			problems.add("INVALID: " +  name
					+ " contains invalid package nsURI: " + nsUri);
		}
		problems.fail();
	}

	protected boolean isRequiredPackage(EPackage _package) {
		return !_package.getEClassifiers().isEmpty();
	}

}

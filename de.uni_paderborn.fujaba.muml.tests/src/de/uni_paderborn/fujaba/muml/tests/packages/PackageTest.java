package de.uni_paderborn.fujaba.muml.tests.packages;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.uni_paderborn.fujaba.muml.tests.TestUtilities;
import de.uni_paderborn.fujaba.muml.tests.TraverseTest;
import de.uni_paderborn.fujaba.muml.tests.resource.IResourceVisitor;
import de.uni_paderborn.fujaba.muml.tests.resource.ProblemCollector;

public abstract class PackageTest extends TraverseTest {

	public static Resource loadEcoreResource(String ecoreModelProject,
			String ecoreModelPath) {
		// Initialize new ResourceSet
		ResourceSet resourceSet = new ResourceSetImpl();

		Map<String, Object> extensionToFactoryMap = resourceSet
				.getResourceFactoryRegistry().getExtensionToFactoryMap();
		extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl());
		extensionToFactoryMap.put("genmodel", new EcoreResourceFactoryImpl());
		extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		// Register Packages
		EcorePackage.eINSTANCE.eClass();
		GenModelPackage.eINSTANCE.eClass();

		// Load resource
		return TestUtilities.loadResource(resourceSet, ecoreModelProject,
				ecoreModelPath);
	}

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
					uris.remove(nsUri);
				} else if (isRequiredPackage(_package)) {
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

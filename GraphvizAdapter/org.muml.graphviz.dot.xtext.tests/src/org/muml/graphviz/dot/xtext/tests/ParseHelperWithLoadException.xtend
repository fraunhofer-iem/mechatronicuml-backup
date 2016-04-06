package org.muml.graphviz.dot.xtext.tests

import com.google.inject.Inject
import java.io.InputStream
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.resource.IResourceFactory
import org.eclipse.emf.ecore.EObject

class ParseHelperWithLoadException<T extends EObject> extends ParseHelper<T> {
	@Inject
	private IResourceFactory resourceFactory;
	
	@SuppressWarnings("unchecked")
	public override T parse(InputStream in, URI uriToUse, Map<?, ?> options, ResourceSet resourceSet) {
		val resource = resourceFactory.createResource(uriToUse)
		resourceSet.getResources().add(resource)
		resource.load(in, options) // do not catch IOException... let xtend handle it
		if (!resource.errors.isEmpty) {
			throw new IllegalStateException("load error: " + resource.errors)
		}
		val root = (if (resource.getContents().isEmpty())  null else resource.getContents().get(0)) as T
		return root
	}
}
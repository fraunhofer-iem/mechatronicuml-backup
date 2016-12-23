package org.muml.graphviz.dot.xtext.tests

import com.google.inject.Inject
import com.google.inject.Provider
import java.io.ByteArrayOutputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.resource.XtextResourceSet

class SerializeHelper {
	
	@Inject
	var Provider<XtextResourceSet> resourceSetProvider
	var String fileExtension
	
	@Inject
	def void setFileExtensionProvider(FileExtensionProvider extensionProvider) {
		fileExtension = extensionProvider.primaryFileExtension
	}
	
	protected def Resource getResource() {
		val ResourceSet resSet = resourceSetProvider.get
		resSet.createResource(
			URI.createURI("dummy." + fileExtension)
		)
	}
	
	def String serialize(EObject object) {
		val ByteArrayOutputStream out = new ByteArrayOutputStream
		val Resource resource = getResource
		resource.contents.add(object)
		resource.save(out, null)
		out.toString
	}	
	
}
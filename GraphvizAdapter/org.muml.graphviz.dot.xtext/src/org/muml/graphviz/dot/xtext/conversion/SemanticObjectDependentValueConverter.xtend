package org.muml.graphviz.dot.xtext.conversion

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

/**
 * Just a convenience class for value converters that require a
 * specific semantic object
 */
abstract class SemanticObjectDependentValueConverter<T> implements IValueConverter<String> {
	// might be null in between
	@Accessors // @Nullable
	EObject semanticObject
	
	private Class<?> clazz
	
	private static final String nullSemanticObject
			= "semanticObject must not be null"
	private static final String invalidSemanticObject
			= "expected semanticObject of type %s (got: %s)"
	
	new(Class<?> clazz) {
		this.clazz = clazz
	}
	
	/**
	 * Make sure that object is not null and qualifies as a semantic
	 * object (that is, it has the expected type)
	 */
	protected def void assertValidSemanticObject(EObject object) {
		if (object == null) {
			throw new IllegalStateException(nullSemanticObject)
		}
		if (!clazz.isAssignableFrom(object.getClass)) {
			throw new IllegalStateException(
				String.format(invalidSemanticObject, clazz.name,
					object.getClass.name
				)
			)
		}
	}
	
	def T getSemanticObject() {
		assertValidSemanticObject(semanticObject)
		semanticObject as T
	}
	
	protected def <T> T findActualSemanticObjectFor(INode node) {
		val EObject object = NodeModelUtils.findActualSemanticObjectFor(node)
		assertValidSemanticObject(object)
		object as T
	} 
}
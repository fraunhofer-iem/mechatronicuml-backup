package org.muml.graphviz.dot.xtext.conversion

import com.google.inject.Inject
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.common.notify.impl.AdapterImpl
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import org.muml.graphviz.dot.DotGraph
import org.muml.graphviz.dot.DotPackage

class DotGraphIDValueConverter extends SemanticObjectDependentValueConverter<DotGraph> {
	@Inject
	DotIDValueConverter dotIDValueConverter
	
	new() {
		super(typeof(DotGraph))
	}
	
	override def String toValue(String string, INode node) throws ValueConverterException {
		val DotGraph graph = findActualSemanticObjectFor(node)
		val id = dotIDValueConverter.toValue(string, node)
		val res = id.replaceFirst("^(?:cluster)+", "")
		graph.eAdapters.add(
			new SetClusterAttributeOnIdSetAdapter(
				id.startsWith("cluster"), res
			)
		)
		res		
	}
	
	override def String toString(String value) {
		val DotGraph graph = getSemanticObject
		var value1 = value
		if (graph.isCluster) {
			// XXX: we should check if value is quoted etc...
			value1 = "cluster" + value
		}
		dotIDValueConverter.toString(value1)
	}
	
	/*
	 * hmm a bit over-engineered...
	 */
	private static class SetClusterAttributeOnIdSetAdapter extends AdapterImpl {
		boolean isCluster
		// @NonNull
		String expectedId
		
		new(boolean isCluster, String expectedId) {
			if (expectedId == null) {
				throw new IllegalArgumentException(
					"expectedId must not be null"
				)
			}
			this.isCluster = isCluster
			this.expectedId = expectedId
		}
		
		override def void notifyChanged(Notification msg) {
			// even though we have these checks we cannot be
			// 100% sure that this is our "expected" notification
			// but well... for our usecases this is sufficient
			if (!(msg.notifier instanceof DotGraph)) {
				throw new IllegalStateException(
					"expected a notifier of type DotGraph"
				)
			}
			msg.getFeature()
			if (msg.eventType == Notification.SET
				&& msg.feature == DotPackage.eINSTANCE.dotGraph_Id) {
				(msg.notifier as EObject).eAdapters.remove(this)
				if (!expectedId.equals(msg.newValue)) {
					throw new IllegalStateException("expectedId newValue mismatch")
				}
				(msg.notifier as DotGraph).cluster = isCluster
			}
		}
	}
	
}
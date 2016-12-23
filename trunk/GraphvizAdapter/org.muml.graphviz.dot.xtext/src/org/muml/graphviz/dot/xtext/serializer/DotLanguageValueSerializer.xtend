package org.muml.graphviz.dot.xtext.serializer

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor
import org.eclipse.xtext.serializer.tokens.ValueSerializer
import org.muml.graphviz.dot.xtext.service.DotLanguageValueConverterService

class DotLanguageValueSerializer extends ValueSerializer {
	
	@Inject
	private DotLanguageValueConverterService converter
	
	override def String serializeAssignedValue(EObject context, RuleCall ruleCall, Object value, INode node, Acceptor errors) {
		converter.semanticObject = context
		try {
			super.serializeAssignedValue(context, ruleCall, value, node,
				errors
			)
		} finally {
			converter.semanticObject = null
		}
	}
}
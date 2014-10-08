package de.uni_paderborn.fujaba.graphviz.dot.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uni_paderborn.fujaba.graphviz.dot.DotEdge;
import de.uni_paderborn.fujaba.graphviz.dot.DotGraph;
import de.uni_paderborn.fujaba.graphviz.dot.DotNode;
import de.uni_paderborn.fujaba.graphviz.dot.DotPackage;
import de.uni_paderborn.fujaba.graphviz.dot.Setting;
import de.uni_paderborn.fujaba.graphviz.dot.xtext.services.DotLanguageGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractDotLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DotLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DotPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DotPackage.DOT_EDGE:
				if(context == grammarAccess.getDotEdgeRule()) {
					sequence_DotEdge(context, (DotEdge) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.DOT_GRAPH:
				if(context == grammarAccess.getDotGraphRule()) {
					sequence_DotGraph(context, (DotGraph) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.DOT_NODE:
				if(context == grammarAccess.getDotNodeRule()) {
					sequence_DotNode(context, (DotNode) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.SETTING:
				if(context == grammarAccess.getSettingRule()) {
					sequence_Setting(context, (Setting) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (source=[DotNode|DotID] target=[DotNode|DotID] (settings+=Setting settings+=Setting*)?)
	 */
	protected void sequence_DotEdge(EObject context, DotEdge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((directedGraph?='digraph'? id=DotID?) | id=DotID?) 
	 *         (
	 *             (graphSettings+=Setting graphSettings+=Setting*) | 
	 *             (nodeSettings+=Setting nodeSettings+=Setting*) | 
	 *             (edgeSettings+=Setting edgeSettings+=Setting*) | 
	 *             subgraphs+=DotGraph | 
	 *             nodes+=DotNode | 
	 *             edges+=DotEdge
	 *         )*
	 *     )
	 */
	protected void sequence_DotGraph(EObject context, DotGraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=DotID (settings+=Setting settings+=Setting*)?)
	 */
	protected void sequence_DotNode(EObject context, DotNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attribute=DotID value=DotID)
	 */
	protected void sequence_Setting(EObject context, Setting semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DotPackage.Literals.SETTING__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotPackage.Literals.SETTING__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, DotPackage.Literals.SETTING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotPackage.Literals.SETTING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSettingAccess().getAttributeDotIDParserRuleCall_0_0(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getSettingAccess().getValueDotIDParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
}

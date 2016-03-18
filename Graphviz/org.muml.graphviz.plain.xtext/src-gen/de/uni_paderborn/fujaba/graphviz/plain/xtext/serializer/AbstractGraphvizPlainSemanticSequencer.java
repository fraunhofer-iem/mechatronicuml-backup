package de.uni_paderborn.fujaba.graphviz.plain.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uni_paderborn.fujaba.graphviz.plain.PlainEdge;
import de.uni_paderborn.fujaba.graphviz.plain.PlainGraph;
import de.uni_paderborn.fujaba.graphviz.plain.PlainNode;
import de.uni_paderborn.fujaba.graphviz.plain.PlainPackage;
import de.uni_paderborn.fujaba.graphviz.plain.xtext.services.GraphvizPlainGrammarAccess;
import de.uni_paderborn.fujaba.graphviz.util.Point;
import de.uni_paderborn.fujaba.graphviz.util.UtilPackage;
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
public abstract class AbstractGraphvizPlainSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GraphvizPlainGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PlainPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PlainPackage.PLAIN_EDGE:
				if(context == grammarAccess.getEdgeRule()) {
					sequence_Edge(context, (PlainEdge) semanticObject); 
					return; 
				}
				else break;
			case PlainPackage.PLAIN_GRAPH:
				if(context == grammarAccess.getGraphRule()) {
					sequence_Graph(context, (PlainGraph) semanticObject); 
					return; 
				}
				else break;
			case PlainPackage.PLAIN_NODE:
				if(context == grammarAccess.getNodeRule()) {
					sequence_Node(context, (PlainNode) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == UtilPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UtilPackage.POINT:
				if(context == grammarAccess.getPointRule()) {
					sequence_Point(context, (Point) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (source=[PlainNode|Identifier] target=[PlainNode|Identifier] splinePoints+=Point*)
	 */
	protected void sequence_Edge(EObject context, PlainEdge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (scale=Number width=Number height=Number nodes+=Node* edges+=Edge*)
	 */
	protected void sequence_Graph(EObject context, PlainGraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier position=Point width=Number height=Number)
	 */
	protected void sequence_Node(EObject context, PlainNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x=Number y=Number)
	 */
	protected void sequence_Point(EObject context, Point semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, UtilPackage.Literals.POINT__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UtilPackage.Literals.POINT__X));
			if(transientValues.isValueTransient(semanticObject, UtilPackage.Literals.POINT__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UtilPackage.Literals.POINT__Y));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPointAccess().getXNumberParserRuleCall_0_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPointAccess().getYNumberParserRuleCall_1_0(), semanticObject.getY());
		feeder.finish();
	}
}

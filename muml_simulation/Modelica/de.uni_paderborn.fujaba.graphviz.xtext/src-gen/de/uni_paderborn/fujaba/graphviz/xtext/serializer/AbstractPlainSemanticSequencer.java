package de.uni_paderborn.fujaba.graphviz.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uni_paderborn.fujaba.graphviz.graphviz.output.Edge;
import de.uni_paderborn.fujaba.graphviz.graphviz.output.Graph;
import de.uni_paderborn.fujaba.graphviz.graphviz.output.Node;
import de.uni_paderborn.fujaba.graphviz.graphviz.output.OutputPackage;
import de.uni_paderborn.fujaba.graphviz.graphviz.output.Point;
import de.uni_paderborn.fujaba.graphviz.xtext.services.PlainGrammarAccess;
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
public abstract class AbstractPlainSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PlainGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == OutputPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case OutputPackage.EDGE:
				if(context == grammarAccess.getEdgeRule()) {
					sequence_Edge(context, (Edge) semanticObject); 
					return; 
				}
				else break;
			case OutputPackage.GRAPH:
				if(context == grammarAccess.getGraphRule()) {
					sequence_Graph(context, (Graph) semanticObject); 
					return; 
				}
				else break;
			case OutputPackage.NODE:
				if(context == grammarAccess.getNodeRule()) {
					sequence_Node(context, (Node) semanticObject); 
					return; 
				}
				else break;
			case OutputPackage.POINT:
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
	 *     (source=[Node|Identifier] target=[Node|Identifier] splinePoints+=Point*)
	 */
	protected void sequence_Edge(EObject context, Edge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (scale=Number width=Number height=Number nodes+=Node* edges+=Edge*)
	 */
	protected void sequence_Graph(EObject context, Graph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier position=Point width=Number height=Number)
	 */
	protected void sequence_Node(EObject context, Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x=Number y=Number)
	 */
	protected void sequence_Point(EObject context, Point semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, OutputPackage.Literals.POINT__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OutputPackage.Literals.POINT__X));
			if(transientValues.isValueTransient(semanticObject, OutputPackage.Literals.POINT__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OutputPackage.Literals.POINT__Y));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPointAccess().getXNumberParserRuleCall_0_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPointAccess().getYNumberParserRuleCall_1_0(), semanticObject.getY());
		feeder.finish();
	}
}

package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.computation;

import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.reconfigurationverification.fotctl.Constant;
import org.muml.reconfigurationverification.fotctl.ConstantSymbolDecl;
import org.muml.reconfigurationverification.fotctl.EdgeLabelPredicate;
import org.muml.reconfigurationverification.fotctl.FoTCTLFormula;
import org.muml.reconfigurationverification.fotctl.NodeLabelPredicate;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.AtomicPropositionMapping;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.LabelingFactory;
import org.muml.reconfigurationverification.tctl.AtomicFormula;
import org.muml.reconfigurationverification.tctl.Term;

/**
 * Computes the mu-function which assigns atomic propositions to all states of a Gt-Automaton. 
 *
 */
public class MuComputation {
	
	private QuantifierSearch qs;

	public void init(HashSet<ConstantSymbolDecl> constSymbols)
	{
		qs = new QuantifierSearch();
		qs.setConstSyms(constSymbols);
	}
	
	public HashSet<AtomicPropositionMapping> computeMu(GtAutomaton automaton, FoTCTLFormula formula)
	{
		// Create a hash map representing mu mapping graphs on a set of atomic
		// formulae represented by strings.
		HashSet<AtomicPropositionMapping> mu = new HashSet<AtomicPropositionMapping>();
		
		qs.recurse(formula.getFormula());
		
		// Get all atomic formulae of the given FO-TCTL formula.
		AtomicFormularCollector afc = new AtomicFormularCollector();
		// Wrap formula with negation such that no problems with quantified
		// formula as root formlae arise.
		HashSet<AtomicFormula> afs = afc.getAtomicFormulae(formula);
		
		// Compute mapping for each of the graphs seperately.
		Iterator<ReachabilityGraphState> graphs = automaton.getStates().iterator();
		while (graphs.hasNext()) {
			GtStepGraph graph = (GtStepGraph) graphs.next();
			AtomicPropositionMapping locationMu = computeMuForLocation(graph, afs);
			mu.add(locationMu);
			// add labeling to extension list of the step graph
			graph.getExtensions().add(locationMu);
		}
		return mu;
	}
	
	public AtomicPropositionMapping computeMuForLocation(GtStepGraph graph, HashSet<AtomicFormula> afs) {
		
		AtomicPropositionMapping apm = LabelingFactory.eINSTANCE.createAtomicPropositionMapping();
		apm.setStepGraph(graph);

		// For each atomic formula check if it is true.
		Iterator<AtomicFormula> afsIter = afs.iterator();
		while (afsIter.hasNext()) {
			AtomicFormula af = afsIter.next();
			// Check whether we have a node or an edge predicate.
			if (af instanceof NodeLabelPredicate) {
				
				// We have a node label predicate.
				NodeLabelPredicate castedPred = (NodeLabelPredicate) af;
				// Its name is the label for which the node is to be checked.
				String label = castedPred.getDeclaration().getName();
				
				// Get the constant symbol corresponding to a node identifier.
				// Attention: We make the assumption here that there might only
				// occur constant symbols as the arguments of a predicate.
				// TODO 
				Term term = castedPred.getTerm();
				
				// Get the constant symbol.
				String termName = ((Constant) term).getName();
				
				// Get the node with the corresponding id.
				EObject node = graph.getObjectIdentifier().getEObject(termName);
				
				// Check if node has the desired label. If yes add a string
				// representation of the term to the hash set.
				if (node != null) {
					if (hasLabel(node, label)) {
						apm.getPropositions().add(label + "_" + termName);
					}
				}
			}
			// It must be an edge predicate.
			else {
				EdgeLabelPredicate castedPred = (EdgeLabelPredicate) af;
				String label = castedPred.getDeclaration().getName();
				String term1Name = ((Constant) castedPred.getTerm()).getName();
				String term2Name = ((Constant) castedPred.getSecondTerm()).getName();
				EObject n1 = graph.getObjectIdentifier().getEObject(term1Name);
				EObject n2 = graph.getObjectIdentifier().getEObject(term1Name);
				if (n1 != null && n2 != null) {
					if (connectedByEdgeWithLabel(n1, n2, label)) {
						apm.getPropositions().add(label + "_" + term1Name + "_" + term2Name);
					}
				}
			}
		}
		return apm;
	}

	protected boolean connectedByEdgeWithLabel(EObject n1, EObject n2,
			String label) {
		EReference eReference;
		boolean connected = false;
		// look for an EReference from n1 to n2 with name == label
		for(Iterator<EReference> eReferenceIterator = n1.eClass().getEReferences().iterator(); eReferenceIterator.hasNext();)
		{
			eReference = eReferenceIterator.next();
			if(eReference.getName().equals(label))
				connected = n1.eGet(eReference) != null && n1.eGet(eReference).equals(n2);
		}
		if(connected)
			return true;
		// if that does not exist
		// look for an EReference from n2 to n1 with name == label
		for(Iterator<EReference> eReferenceIterator = n2.eClass().getEReferences().iterator(); eReferenceIterator.hasNext();)
		{
			eReference = eReferenceIterator.next();
			if(eReference.getName().equals(label))
				return n2.eGet(eReference) != null && n2.eGet(eReference).equals(n1);
		}
		// else: 
		return false;
	}

	protected boolean hasLabel(EObject node, String label) {		
		return node.eClass().getName().contains(label);
	}
	
//	private Node getNodeWithId(GtStepGraph graph, String id) {
//		// Get the node with the corresponding id.
//		Iterator nodeIter = graph.getContains().iterator();
//		Node node = null;
//		while (nodeIter.hasNext()) {
//			node = (Node) nodeIter.next();
//			if (node.getId().equals(id)) return node;
//		}
//		return null;
//	}
}

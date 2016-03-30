package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.computation;

import java.util.HashSet;

import org.muml.reconfigurationverification.fotctl.FoTCTLFormula;
import org.muml.reconfigurationverification.tctl.AtomicFormula;

public class AtomicFormularCollector extends FormulaRecursion {
	
	HashSet<AtomicFormula> af = new HashSet<AtomicFormula>();
	
	public HashSet<AtomicFormula> getAtomicFormulae(FoTCTLFormula form) {
		recurse(form.getFormula());
		return af;
	}

	@Override
	protected void postAtomicFormula(AtomicFormula formulaDef) {
		af.add(formulaDef);
	}


}

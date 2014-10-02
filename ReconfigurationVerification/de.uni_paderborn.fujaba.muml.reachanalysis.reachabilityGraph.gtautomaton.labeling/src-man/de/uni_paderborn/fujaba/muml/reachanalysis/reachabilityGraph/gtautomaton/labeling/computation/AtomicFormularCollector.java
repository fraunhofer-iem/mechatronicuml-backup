package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling.computation;

import java.util.HashSet;

import de.uni_paderborn.fujaba.muml.verification.fotctl.FoTCTLFormula;
import de.uni_paderborn.fujaba.muml.verification.tctl.AtomicFormula;

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

package de.uni_paderborn.fujaba.muml.model.gen.c.helper;

import de.uni_paderborn.fujaba.muml.psm.codegen.RefinedStructuredResourceInstance;

public class RoutingLabel {
	int distance;
	RefinedStructuredResourceInstance predecessor;
	
	
	public RoutingLabel(){
		this.distance = Integer.MAX_VALUE;
		this.predecessor = null;
	}
	
	
}

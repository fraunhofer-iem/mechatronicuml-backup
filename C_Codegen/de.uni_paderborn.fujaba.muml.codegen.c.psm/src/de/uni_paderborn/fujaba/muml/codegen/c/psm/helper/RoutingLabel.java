package de.uni_paderborn.fujaba.muml.codegen.c.psm.helper;

import de.uni_paderborn.fujaba.muml.psm.codegen.RefinedStructuredResourceInstance;

public class RoutingLabel {
	int distance;
	RefinedStructuredResourceInstance predecessor;
	
	
	public RoutingLabel(){
		this.distance = Integer.MAX_VALUE;
		this.predecessor = null;
	}
	
	
}

package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.commands;

import de.uni_paderborn.fujaba.muml.realtimestatechart.EntryPoint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.ExitPoint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex;


public class TransitionContainmentUtil {
	// OCL-Query by Christopher Gerking:
	//query Transition :: getStatechart() : RealtimeStatechart {
	////var rtsc : RealtimeStatechart;
	////if(self.source.oclIsKindOf(State))
	////then rtsc := self.source.oclAsType(State).parentStatechart
	////else {
	////////if(self.target.oclIsKindOf(State))
	////////then rtsc := self.target.oclAsType(State).parentStatechart
	////////else {
	////////////if(self.source.oclIsKindOf(ExitPoint))
	////////////then rtsc := self.source.oclAsType(ExitPoint).state.parentStatechart
	////////////else {
	////////////////if(self.target.oclIsKindOf(EntryPoint))
	////////////////then rtsc := self.target.oclAsType(EntryPoint).state.parentStatechart
	////////////////else assert fatal (false) with log('Cannot assign a statechart to this transition.')
	////////////////endif
	////////////}
	////////////endif
	////////}
	////////endif
	////}
	////endif;
	////return rtsc;
	//}
	public static RealtimeStatechart getStatechart(Vertex source, Vertex target) {
		// Source
		if (source instanceof ExitPoint) {
			source = ((ExitPoint) source).getState(); // getState() could return null, but the next instanceof will take care of that.
		}
		if (source instanceof State) { // Checking for instanceof also does the null check
			return ((State)source).getParentStatechart();
		}
		
		// Target
		if (target instanceof EntryPoint) {
			target = ((EntryPoint) target).getState(); // getState() could return null, but the next instanceof will take care of that.
		}
		if (target instanceof State) { // Checking for instanceof also does the null check
			return ((State)target).getParentStatechart();
		}
		
		return null;
	}
}

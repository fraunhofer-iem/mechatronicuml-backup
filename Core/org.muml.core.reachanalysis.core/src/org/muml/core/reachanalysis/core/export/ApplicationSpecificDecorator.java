package org.muml.core.reachanalysis.core.export;

import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;

/**
 * This class can be used for modifying the standard GraphViz output to
 * include application specific labels and highlighting.
 * 
 * @author Christian
 *
 */
public abstract class ApplicationSpecificDecorator {

	/**
	 * Returns the background color for the node given as a parameter. By default,
	 * all nodes are filled with a light grey background color. By overriding this
	 * method, a particular color may be set for nodes based on their contents.
	 * @param state
	 * @return
	 */
	public GraphVizColors getNodeColor(ReachabilityGraphState state){
		return GraphVizColors.LIGHT_GREY;
	}
	
}

package org.muml.storydiagram.reachanalysis.sdm.export;

import org.muml.core.reachanalysis.core.export.ApplicationSpecificDecorator;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;

/**
 * This class can be used for defining user-defined, application specific state
 * and transition labels in the GraphViz-Export of the SDM reachability graph.
 * Subclasses are expected to override at least of the methods provided in this
 * class. 
 * @author Christian
 *
 */
public abstract class ApplicationSpecificGraphDecorator extends ApplicationSpecificDecorator{

	/**
	 * Returns the user-defined, application specific label for the StepGraph
	 * given as a parameter.
	 * @param step
	 * @return
	 */
	public String getApplicationSpecificStateLabel(StepGraph step){
		return "";
	}
	
	/**
	 * Returns the user-defined, application specific label for the SDMTransition
	 * given as a parameter.
	 * @param trans
	 * @return
	 */
	public String getApplicationSpecificTransitionLabel(SDMTransition trans){
		return "";
	}
	
}

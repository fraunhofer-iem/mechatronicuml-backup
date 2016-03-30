package org.muml.core.reachanalysis.core.export;

import org.eclipse.core.runtime.IPath;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;

/**
 * The class ReachabilityGraphExporter is an interface to be implemented by all algorithms
 * that export a reachability graph into another format. It may be used, e.g., to export
 * the reachability graph to a layout tool in order to visualize the reachable states or
 * to export the reachability graph to another tool for further analyses. 
 * @author Christian
 *
 */
public interface ReachabilityGraphExporter {

	/**
	 * The export function performs the actual export operation on the 
	 * reachability graph given as a parameter.
	 * @param reachGraph
	 */
	public void export(ReachabilityGraph reachGraph);
	
	/**
	 * The export function performs the actual export operation on the 
	 * reachability graph given as a parameter, storing the exported file under the specified target path.
	 * @param reachGraph
	 * @param targetPath
	 */
	public void export(ReachabilityGraph reachGraph, IPath targetPath);
	
}

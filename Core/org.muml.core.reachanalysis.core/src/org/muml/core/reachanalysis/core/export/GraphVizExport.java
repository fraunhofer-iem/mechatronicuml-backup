package org.muml.core.reachanalysis.core.export;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;

public abstract class GraphVizExport implements ReachabilityGraphExporter {

	protected FileWriter writer;
	
	private HashMap<ReachabilityGraphState,Integer> stateIds;
	
	/**
	 * The file type that will be used by GraphViz for exporting the file.
	 */
	private GraphVizExportFileTypes type = GraphVizExportFileTypes.PDF;
	
	/** 
	 * The default background color for nodes of the reachability graph.
	 */
	private final GraphVizColors defaultNodeColor = GraphVizColors.LIGHT_GREY;
	
	/**
	 * The decorator enable to customize the GraphViz output in subclasses.
	 */
	private ApplicationSpecificDecorator decorator = null;
	
	/**
	 * Empty Default constructor
	 */
	public GraphVizExport(){
		
	}
	
	/**
	 * Constructor the initializes the GraphVizExport with a decorator.
	 * @param theDecorator
	 */
	public GraphVizExport(ApplicationSpecificDecorator theDecorator){
		this();
		decorator = theDecorator;
	}
	
	
	@Override
	public void export(ReachabilityGraph reachGraph) {
		
		//get object which represents the workspace  
	    IWorkspace workspace = ResourcesPlugin.getWorkspace();
	    
	    IPath targetPath = workspace.getRoot().getLocation().append("ReachabilityGraphs");
		
		export(reachGraph, targetPath);
				
	}
	
	@Override
	public void export(ReachabilityGraph reachGraph, IPath targetPath) {
		
		try {
		    		    
		    // create directory if it does not exist
		    File directory = targetPath.toFile();
		    directory.mkdir();
		    
		    //create dot file
		    File dotFile = targetPath.append("reachabilityGraph.dot").toFile();
			writer = new FileWriter(dotFile);

			//write reachability graph to dot file
			writer.write("digraph \"ReachabilityGraph\"{\n");
			writer.write("ratio=auto;\n");
			// writer.write("rankdir=LR\n");
			writer.write("splines=true;\n");
			writer.write("fontsize=10.0;\n");
			writer.write("node [shape=rectangle, style=\"rounded, filled\", penwidth=1]\n");

			//initialize state map
			stateIds = new HashMap<ReachabilityGraphState, Integer>();
			
			exportStates(reachGraph);
			
			exportTransitions(reachGraph);
			
			writer.write("}\n");
			writer.close();	 
			
			//create output file
			String out = targetPath.toString() + ("/reachabilityGraph_" + getDateSuffixString() + "." + type.toString());
			generateGraphFile(dotFile, out);

		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	
	/**
	 * Generate the rendered graph using the dot file provided as an input.
	 * @param dotFile
	 * @param output
	 * @return
	 */
	private boolean generateGraphFile(File dotFile, String outputFile){


		if (dotFile != null){

			//call GraphViz on the dotFile
			Runtime rt = Runtime.getRuntime();
			String[] args = {"dot", "-T"+type.toString(), dotFile.getAbsolutePath(), "-o", outputFile};
			
			try {	
				Process p = rt.exec(args);

				p.waitFor();
			} catch (InterruptedException e2) {
				//do nothing
			} catch (java.io.IOException e) { 
				return false; 
			}

			//delete dotfile
			if (dotFile.delete() == false) 
				System.err.println("Warning: " + dotFile.getAbsolutePath() + " could not be deleted!");
		}

		return true;
	}

	/**
	 * Exports the states of the reachability graph.
	 * @param reachGraph
	 * @throws IOException
	 */
	protected void exportStates(ReachabilityGraph reachGraph) throws IOException{
		for (ReachabilityGraphState state : reachGraph.getStates()) {
			stateIds.put(state, stateIds.size());
			
			GraphVizColors nodeColor = null;
			if(decorator != null){
				nodeColor = decorator.getNodeColor(state);
			} else {
				nodeColor = defaultNodeColor;
			}

			writer.write("\t\"" +stateIds.get(state) + "\"[fillcolor=" + nodeColor.toString() + ",label=");
			
			//get label for the state
			writer.write(getStateLabel(state));
			
			writer.write("];\n");
				
		}
	}
	
	/**
	 * Returns the label which is displayed for a state of the reachability graph.
	 * @return
	 */
	protected String getStateLabel(ReachabilityGraphState state){
		return "s" + stateIds.get(state);
	}
	
	/**
	 * Exports the transitions of the reachability graph.
	 * @param reachGraph
	 * @throws IOException
	 */
	protected void exportTransitions(ReachabilityGraph reachGraph) throws IOException{
		EList<ReachabilityGraphTransition> transitions = reachGraph.getTransitions();
		for (ReachabilityGraphTransition transition : transitions) {
			writer.write("\"" + stateIds.get(transition.getSource()) + "\"->\""
					+ stateIds.get(transition.getTarget()) + "\"[label=\""
					+ getTransitionLabel(transition) + "\"");

			writer.write("]\n");
		}
		
	}

	/**
	 * Returns the label which is displayed for a transition of the reachability graph.
	 * @return
	 */
	protected String getTransitionLabel(ReachabilityGraphTransition transition){
		return " ";
	}
	
	/**
	 * Helper function that assembles the current time stamp for suffixing the filename with it.
	 * The format is YYYYMMDD_HHMMSS
	 * @return
	 */
	private String getDateSuffixString(){
		//initialize
		StringBuffer result = new StringBuffer();
		GregorianCalendar cal = new GregorianCalendar();		
		
		//date part
		result.append(cal.get(Calendar.YEAR));
		
		int month = cal.get(Calendar.MONTH) + 1;
		if(month < 10){
			result.append('0');
		}
		result.append(month);
		
		if(cal.get(Calendar.DAY_OF_MONTH) < 10){
			result.append('0');
		}
		result.append(cal.get(Calendar.DAY_OF_MONTH));
		
		//delimiter
		result.append('_');
		
		//time part
		if(cal.get(Calendar.HOUR_OF_DAY) < 10){
			result.append('0');
		}
		result.append(cal.get(Calendar.HOUR_OF_DAY));
		
		if(cal.get(Calendar.MINUTE) < 10){
			result.append('0');
		}
		result.append(cal.get(Calendar.MINUTE));
		
		if(cal.get(Calendar.SECOND) < 10){
			result.append('0');
		}
		result.append(cal.get(Calendar.SECOND));
		
		return result.toString();
	}

	/**
	 * Returns the file type that is used for the GraphViz export. Default is PDF.
	 * @return
	 */
	public GraphVizExportFileTypes getType() {
		return type;
	}

	/**
	 * Sets the file type that is used for the GraphViz export. Default is PDF.
	 * @param type
	 */
	public void setType(GraphVizExportFileTypes type) {
		this.type = type;
	}

	/**
	 * Returns the application specific decorator that enables to customize the GraphViz
	 * output.
	 * @return
	 */
	public ApplicationSpecificDecorator getDecorator() {
		return decorator;
	}

	/**
	 * Sets the application specific decorator that enables to customize the GraphViz
	 * output.
	 * @return
	 */
	public void setDecorator(ApplicationSpecificDecorator decorator) {
		this.decorator = decorator;
	}
}

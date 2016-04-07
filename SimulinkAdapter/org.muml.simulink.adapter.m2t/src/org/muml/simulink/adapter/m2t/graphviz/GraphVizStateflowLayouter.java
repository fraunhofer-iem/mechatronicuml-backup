package org.muml.simulink.adapter.m2t.graphviz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.StateflowMachine;

/**
 * 
 * It is important to use the -y dot command line argument. It sets the origin
 * to the upper left corner as it is expected in Stateflow.
 */
public class GraphVizStateflowLayouter 
{	
	final boolean useFile = true;
	
	private Log logger = LogFactory.getLog(this.getClass());
	
	/**
	 * Layouting is done in-place
	 * @param machine
	 */
	public void layout(StateflowMachine machine)
	{
		GraphVizWriter writer = new GraphVizWriter();
		GraphVizReader reader = new GraphVizReader();
		
		for(Chart chart: machine.getCharts())
		{
			this.logger.info("Creating layout for chart " + chart.getName());
			try 
			{
				if(this.useFile)
					this.graphVizFile(writer, reader, chart);
				else
					this.graphVizProcess(writer, reader, chart);
				
			}
			catch (Exception e) 
			{
				this.logger.error("Failed to layout chart "+ chart.getName(), e);
			}		
		}
	}
	
	public void graphVizFile(GraphVizWriter writer, GraphVizReader reader, Chart chart) throws IOException, GraphVizReaderException
	{
		File inputFile = File.createTempFile("StateFlowGraphIn", ".dot");
		inputFile.deleteOnExit();
		File outputFile = File.createTempFile("StateFlowGraphOut", ".dot");
		outputFile.deleteOnExit();
		
		writer.write(new PrintWriter(inputFile), chart);		
		String cmd = "fdp -Tdot -y -o"+ outputFile.getAbsolutePath() + " " + inputFile.getAbsolutePath();
		this.logger.info("Running graphviz: " + cmd);
		Process proc = Runtime.getRuntime().exec(cmd);
		int retVal = 0;
		try {
			BufferedReader procReader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String line = null;
			while((line = procReader.readLine()) != null)
				this.logger.debug(line);			
			retVal = proc.waitFor();
		} catch (InterruptedException e) {
			this.logger.warn("InterruptedException", e);
		}
		
		if(retVal == 0)
			reader.read(new BufferedReader(new FileReader(outputFile)), chart);
		else
		{
			this.logger.warn("Could not layout charts: Graphviz returned " + proc.exitValue());
			BufferedReader error = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
			while(error.ready())
				this.logger.warn(error.readLine());
		}
	}
	
	public void graphVizProcess(GraphVizWriter writer, GraphVizReader reader, Chart chart) throws IOException, GraphVizReaderException
	{
		Process p = Runtime.getRuntime().exec("fdp -Tdot -y");			
		writer.write(new PrintWriter(new OutputStreamWriter(p.getOutputStream())), chart);
		reader.read(new BufferedReader(new InputStreamReader(p.getInputStream())), chart);
	}
}

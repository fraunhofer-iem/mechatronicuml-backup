package org.muml.simulink.adapter.m2t.graphviz;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.muml.simulink.Element;
import org.muml.simulink.Parameter;
import org.muml.simulink.SimulinkFactory;
import org.muml.simulink.stateflow.Action;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.History;
import org.muml.simulink.stateflow.Junction;
import org.muml.simulink.stateflow.Node;
import org.muml.simulink.stateflow.State;
import org.muml.simulink.stateflow.Transition;

public class GraphVizReader 
{
	
	//"At present, most device-independent units are either inches or points, which we take as 72 points per inch."
	final static float POINTS_PER_INCH = 72;
	
	final static float FONT_SIZE = 8;
	
	final static String KEYWORD_DIGRAPH = "digraph";
	final static String KEYWORD_GRAPH = "graph";
	final static String KEYWORD_NODE= "node";
	final static String KEYWORD_EDGE = "edge";
	final static String KEYWORD_STOP = "stop";	
	final static String KEYWORD_SUBGRAPH = "subgraph";
	
	final static String ORIENTATION_TOP 	= "1 0 -1";
	final static String ORIENTATION_RIGHT 	= "2 1 0";
	final static String ORIENTATION_BOTTOM 	= "3 0 1";
	final static String ORIENTATION_LEFT 	= "4 -1 0";
	
	final static String ORIENTATION_TOP_INSIDE 		= "1 0 1";
	final static String ORIENTATION_RIGHT_INSIDE 	= "2 -1 0";
		
	protected final static Pattern BOUNDINGBOX_PATTERN = Pattern.compile("bb=\"(-?\\d+(\\.\\d+)?),(-?\\d+(\\.\\d+)?),(-?\\d+(\\.\\d+)?),(-?\\d+(\\.\\d+)?)\"");
	
	//Example: pos="28,67"
	protected final static Pattern POSITION_PATTERN = Pattern.compile(".*pos=\"(\\d+(\\.\\d+)?),(\\d+(\\.\\d+)?)\".*");
	
	//Example: height="0.5"
	protected final static Pattern HEIGHT_PATTERN = Pattern.compile(".*height=\"?(\\d+(\\.\\d+)?)\"?.*");
	
	//Example: width="0.75"
	protected final static Pattern WIDTH_PATTERN = Pattern.compile(".*width=\"?(\\d+(\\.\\d+)?)\"?.*");

	//Example: pos="e,104,71.587 104,36.169 104,43.869 104,53.026 104,61.583"
	protected final static Pattern POSITIONSPLINE_PATTERN = Pattern.compile("pos=\"((e,(\\d+(\\.\\d+)?,\\d+(\\.\\d+)?))?(( ?\\d+(\\.\\d+)?,\\d+(\\.\\d+)?)+))\"");
	
	//Example: id=0
	protected final static Pattern ID_PATTERN = Pattern.compile("id=(\\d+)");

	//Example: lp="124,63"
	protected final static Pattern LP_PATTERN = Pattern.compile("lp=\"(\\d+(\\.\\d+)?),(\\d+(\\.\\d+)?)\"");
	
	
	//To compute the orientation for the state intersections, we
	// need the positions of the states in a handy format
	private HashMap<Element, Position> elementPositions;
	
	private Scanner scanner = null;
	
	protected Chart currentChart = null;
	protected double currentChartHeight = 0;
	
	public void read(BufferedReader reader, Chart chart) throws IOException, GraphVizReaderException
	{
		this.elementPositions = new HashMap<Element,Position>();
		
		while(!reader.ready());
		
		this.currentChart = chart;
		
		//Read file, do unfolding
		// "As another aid for readability, dot allows single logical lines to span multiple physical lines using the standard C convention of a backslash immediately preceding a newline character."
		// http://www.graphviz.org/doc/info/lang.html
		StringBuffer buffer = new StringBuffer();
		while(reader.ready())
		{
			String nextLine = reader.readLine();
			if(nextLine == null)
				break;
			buffer.append(nextLine);
			if(!nextLine.endsWith("\\"))
				buffer.append("\n");
		}			
		reader.close();

		
		this.scanner = new Scanner(buffer.toString());		
		
		if(scanner.hasNext(KEYWORD_DIGRAPH))
			this.parseGraph();
		else
			throw new GraphVizReaderException("Expected keyword " + KEYWORD_DIGRAPH + " found " + scanner.next());
		
		
	}
	
	
	/**
	 * Syntax:
	 * digraph Chart {
	 * 	node [label="\N"];
	 * 	graph [bb="0,86,110,0"];
	 *  ...
	 * }
	 * @throws GraphVizReaderException 
	 */
	protected void parseGraph() throws GraphVizReaderException
	{
		scanner.skip(KEYWORD_DIGRAPH);
		@SuppressWarnings("unused")
		String name = scanner.next();
		scanner.nextLine();
		scanner.nextLine(); //skip node line
		
		if(!scanner.hasNext(KEYWORD_GRAPH))
			throw new GraphVizReaderException("Expected keyword " + KEYWORD_GRAPH + " found " + scanner.next());
		
		String boundingBox = scanner.findInLine(BOUNDINGBOX_PATTERN);
		
		Matcher bbMatcher = BOUNDINGBOX_PATTERN.matcher(boundingBox);
		if(!bbMatcher.matches())
			throw new GraphVizReaderException("Expected bounding box for graph. Found " + boundingBox);
		
		Position position = new Position();
		position.fromBoundingBox(bbMatcher);

		//finish line
		scanner.nextLine();
		
		while(scanner.hasNext())
		{
			//Next line starts a subgraph
			if(scanner.hasNext(KEYWORD_SUBGRAPH))				
				this.parseSubgraph();
			else if(scanner.hasNext("}"))
				scanner.nextLine();
			else
				this.parseNodeOrEdge();
		}
	}
	
	/**
	 * Nodes and edges both start with the name of the (source) node. We
	 * have to look one token ahead to distinguish if it is a node or an edge.
	 */
	protected void parseNodeOrEdge() throws GraphVizReaderException
	{
		final String nodeName = this.scanner.next().replace("\"", "");
		if(scanner.hasNext("->"))
			this.parseEdge(nodeName);
		else
			this.parseNode(nodeName);		
	}
	
	protected String getCompleteLogicalLine(){
		StringBuffer buffer = new StringBuffer();
		
		//get remaining information from the current line
		while(this.scanner.hasNext()){
			buffer.append(this.scanner.next());
		}
		
		//continue extracting more lines until a line contains a ";" -> this finishes the logical line
		while(true){
			String line = this.scanner.nextLine();
			buffer.append(line);
			//check for ";"
			if(line.contains(";")){
				break;
			}
		}
		
		return buffer.toString();
	}
	

	/**
	 * Syntax: 
	 * 	State [label=State, shape=box, pos="82.238,19.359", width="0.75", height="0.5"];
	 * 
	 * => in the latest version of GraphViz, these labels are scattered among several lines in the file
	 */
	protected void parseNode(String name) throws GraphVizReaderException
	{
		String line = getCompleteLogicalLine();
		
		//We do not layout init states
		if(name.endsWith(GraphVizWriter.INIT_STATE_NAME))
		{
			this.scanner.nextLine();
			return;
		}
			
		//Set position for elements
		Element element = this.getElementByIdPath(name, this.currentChart);	
		
		Position pos = new Position(element);
		
		//Position
		Matcher posMatcher = POSITION_PATTERN.matcher(line);	
		if(!posMatcher.matches())
			throw new GraphVizReaderException("Could not find position for " + name + " in: " + line);
		
		pos.x = Float.parseFloat(posMatcher.group(1));
		pos.y = Float.parseFloat(posMatcher.group(3));		
		
		//Width
		Matcher widthMatcher = WIDTH_PATTERN.matcher(line);
		if(!widthMatcher.matches())
			throw new GraphVizReaderException("Could not find width for " + name + " in: " + line);
				
		pos.width = Float.parseFloat(widthMatcher.group(1)) * POINTS_PER_INCH;
		
		//Height
		Matcher heightMatcher = HEIGHT_PATTERN.matcher(line);
		if(!heightMatcher.matches())
			throw new GraphVizReaderException("Could not find height for " + name + " in: " + line);	
		
		pos.height =  Float.parseFloat(heightMatcher.group(1)) * POINTS_PER_INCH;				
				
		//Adjust position
		if(!(element instanceof Junction || element instanceof History))
		{
			//GraphViz gives position as center. 
			//Stateflow position of a state is top left.
			pos.x = pos.x - (pos.width/2);
			pos.y = pos.y - (pos.height/2);
		}
		//For a junction, stateflow expects the position to be the center

		this.setParameter(element, "position", pos.toString());
		this.elementPositions.put(element, pos);

		this.scanner.nextLine();//finish logical line
	}
	
	/**
	 * Syntax: 
	 * 	StateA -> StateB [id=0, pos="e,104,71.587 104,36.169 104,43.869 104,53.026 104,61.583"];
	 * @throws GraphVizReaderException 
	 */
	protected void parseEdge(String sourceName) throws GraphVizReaderException
	{		
		scanner.skip(" ->");
		final String targetName = this.scanner.next();
		final boolean isInitTransition = sourceName.endsWith(GraphVizWriter.INIT_STATE_NAME);
		int transitionId = -1;
		
		if(!isInitTransition)
		{
			//Get transition by id
			String idAttribute = this.scanner.findInLine(ID_PATTERN);
			if(idAttribute == null && !isInitTransition )
				throw new GraphVizReaderException("Could not find id for " + sourceName + " -> " + targetName);
			
			Matcher idMatcher = ID_PATTERN.matcher(idAttribute);
			if(!idMatcher.matches() && !isInitTransition)
				throw new GraphVizReaderException("Invalid id for " + sourceName + " -> " + targetName + ". Found " + idAttribute);
			
			transitionId = Integer.parseInt(idMatcher.group(1));
		}

		//Get position
		String posAttribute = this.scanner.findInLine(POSITIONSPLINE_PATTERN);
		if(posAttribute == null)
			throw new GraphVizReaderException("Could not find pos for " + sourceName + " -> " + targetName);
		
		Matcher posMatcher = POSITIONSPLINE_PATTERN.matcher(posAttribute);
		if(!posMatcher.matches())
			throw new GraphVizReaderException("Invalid pos for " + sourceName + " -> " + targetName + ". Found " + posAttribute);
		//TODO: Refactor
		String[] sourceCoordinates = posMatcher.group(6).trim().split(" ")[0].split(",");
		String[] targetCoorfinates = posMatcher.group(3).split(",");
					
		
		float sourceX = Float.parseFloat(sourceCoordinates[0]);
		float sourceY = Float.parseFloat(sourceCoordinates[1]);
		float targetX = Float.parseFloat(targetCoorfinates[0]);
		float targetY = Float.parseFloat(targetCoorfinates[1]);
		
		final Node target = (Node) this.getElementByIdPath(targetName, this.currentChart);
		
		//Check of transition from init
		if(isInitTransition)
		{
			this.setParameter(target, "init_src_pos", this.getOrientation(targetX, targetY, this.elementPositions.get(target)) + " 0 " + sourceX + " " + sourceY + "0 0");
			this.setParameter(target, "init_dst_pos", this.getOrientation(sourceX, sourceY, this.elementPositions.get(target)) + " 0 " + targetX + " " + targetY + "0 0");
			this.setParameter(target, "init_datalimits", "["+ Math.min(sourceX, targetX) + " " + Math.max(sourceX, targetX) + " " + Math.min(sourceY, targetY) + " " + Math.max(sourceY, targetY) +  "]");
			this.setParameter(target, "init_midpoint", "[" + (sourceX+targetX)/2 + " " + (sourceY+targetY)/2  + "]");
			this.scanner.nextLine();
			return;
		}
		
		final Node source = (Node) this.getElementByIdPath(sourceName, this.currentChart);
				
		
		Transition transition = source.getOutgoing().get(transitionId);
		if(transition == null)
			throw new GraphVizReaderException("Could not find transition " + sourceName + " -> " + targetName + " in the model.");
					
		
		//Label position
		String lpAttribute = this.scanner.findInLine(LP_PATTERN);
		if(lpAttribute != null)
		{
			Matcher lpMatcher = LP_PATTERN.matcher(lpAttribute);
			if(!lpMatcher.matches())
				throw new GraphVizReaderException("Invalid lp for " + sourceName + " -> " + targetName + ". Found " + lpAttribute);	
					
			float lpX = Float.parseFloat(lpMatcher.group(1));
			float lpY = Float.parseFloat(lpMatcher.group(3));
			Position lp = new Position();
			lp.height = FONT_SIZE;
			lp.width = this.computeTransitionLabelWidth(transition);
			//GraphViz gives the center of the label as position. Stateflow needs upper left corner
			lp.x = lpX - (lp.width/2);
			lp.y = lpY - (lp.height/2);
			
			this.setParameter(transition, "labelPosition", lp.toString());
		
		}
		
		this.scanner.nextLine();
		
		String sourceOrientation = this.getOrientation(sourceX, sourceY, this.elementPositions.get(source));
		String targetOrientation = this.getOrientation(targetX, targetY, this.elementPositions.get(target));
		
		//Special treatment for "self" transitions
		// They need to go through the node
		if(source == target)
		{
			sourceOrientation = ORIENTATION_TOP_INSIDE;
			targetOrientation = ORIENTATION_RIGHT_INSIDE;
			Position parentPosition = this.elementPositions.get(target);
			sourceX = parentPosition.x + (parentPosition.width / 2);
			sourceY = parentPosition.y;
			targetX = parentPosition.x + parentPosition.width;
			targetY = parentPosition.y + (parentPosition.height/2);
		}
		
		//Set parameters		
		this.setParameter(transition, "src.intersection", "["+sourceOrientation+" 0 "+sourceX+" "+sourceY+" 0 0]");
		this.setParameter(transition, "dst.intersection", "["+targetOrientation+" 0 "+targetX+" "+targetY+" 0 0]");
		this.setParameter(transition, "midPoint", "["+(sourceX+targetX)/2+" "+(sourceY+targetY)/2+"]");
		this.setParameter(transition, "dataLimits", "["+ Math.min(sourceX, targetX) + " " + Math.max(sourceX, targetX) + " " + Math.min(sourceY, targetY) + " " + Math.max(sourceY, targetY) +  "]");
	}
	
	/**
	 * Syntax:
	 * 	subgraph cluster0 {
	 *	graph [label=State,
	 *		bb="64,86,160,8"];
	 *	...
	 *	}
	 * @throws GraphVizReaderException 
	 */
	protected void parseSubgraph() throws GraphVizReaderException
	{
		scanner.next(KEYWORD_SUBGRAPH);
		String name = scanner.next().replace("cluster", "");
		scanner.nextLine();
		final State state = (State) this.getElementByIdPath(name, this.currentChart);
		
		scanner.nextLine(); //skip graph line

		String boundingBox = null;
		
		while(boundingBox == null) {
		boundingBox = scanner.findInLine(BOUNDINGBOX_PATTERN);
		if(boundingBox == null)
		scanner.nextLine();
		}
		if(boundingBox == null)
			throw new GraphVizReaderException("Could not find bounding box for " + name + " in: " + scanner.nextLine().trim());
		
		Matcher bbMatcher = BOUNDINGBOX_PATTERN.matcher(boundingBox);
		if(!bbMatcher.matches())
			throw new GraphVizReaderException("Expected bounding box for subgraph "+name+". Found " + boundingBox);
		
		Position position = new Position(state);
		position.fromBoundingBox(bbMatcher);
		
		this.setParameter(state, "position", position.toString());
		this.elementPositions.put(state, position);
		
		scanner.nextLine();
	}
	
	/**
	 * 
	 * @param name 0/3/2
	 */
	protected Element getElementByIdPath(String name, State root)
	{		
		String[] ids = name.replace("\"", "").replace(GraphVizWriter.STATE_PREFIX, "").split("/");
		
		if(ids.length == 1)
		{
			if(ids[0].startsWith(GraphVizWriter.EMF_PREFIX))
			{
				int id = Integer.parseInt(ids[0].replace(GraphVizWriter.EMF_PREFIX, ""));
				return root.getEmbeddedFunctions().get(id);				
			}
			else
			{
				int id = Integer.parseInt(ids[0]);
				return root.getNodes().get(id);
			}
		}
		int id = Integer.parseInt(ids[0]);
		return this.getElementByIdPath(name.replaceFirst(ids[0] + "/", ""), (State) root.getNodes().get(id));
		
	}

	
	
	protected void setParameter(Element element, String name, String value)
	{
		if(element.getParameter(name) != null)
		{
			for(Parameter param: element.getParameters())
			{
				if(name.equals(param.getName()))
				{
					param.setValue(value);
					break;
				}
			}			
		}
		else
		{
			Parameter param = SimulinkFactory.eINSTANCE.createParameter();
			param.setName(name);
			param.setValue(value);
			param.setType(String.class);
			element.getParameters().add(param);		
		}
	}
	
	protected float computeTransitionLabelWidth(Transition transition)
	{
		float width = 0;
		if(transition.getEvent() != null)
			width += transition.getEvent().getName().length();
		if(transition.getGuard() != null)
			for(Action action: transition.getGuard())
				width += action.getExpression().length();
		if(transition.getAction() != null)
			for(Action action: transition.getAction())
				width += action.getExpression().length();
		
		width = (float) (width * FONT_SIZE);
		return width;
	}
	
	/**
	 * Calculates the orientation of (x,y) relative to rectangle p
	 */
	protected String getOrientation(float x, float y, Position p)
	{
		if(y < p.y)
			return ORIENTATION_TOP;
		if(y > p.y+p.height)
			return ORIENTATION_BOTTOM;
		if(x < p.x)
			return ORIENTATION_LEFT;
		
		return ORIENTATION_RIGHT;
		
	}

	
	class Position
	{
		public float x = 0;
		public float y = 0;
		public float width = 0;
		public float height = 0;
		public Element element = null;
		public Position(float x, float y, float width, float height, Element element)
		{
			this.x = x; 
			this.y = y; 
			this.width = width;
			this.height = height;
			this.element = element;
		}
		
		public Position(Element element)
		{
			this.element = element;
		}
		
		public Position ()
		{
			
		}
		
		@Override
		public String toString()
		{
			if(this.element instanceof Junction || this.element instanceof History)
				return "[" + this.x + " " + this.y + " 7]";
			return "[" + this.x + " " + this.y + " " + this.width + " " + this.height + "]";
		}
		
		public void fromBoundingBox(Matcher bbMatcher)
		{
			this.x =  Float.parseFloat(bbMatcher.group(1));
			this.y =  Float.parseFloat(bbMatcher.group(7));
			this.width =  Float.parseFloat(bbMatcher.group(5)) - this.x;
			this.height =  Float.parseFloat(bbMatcher.group(3)) - this.y;			
			
		}
	}	
}

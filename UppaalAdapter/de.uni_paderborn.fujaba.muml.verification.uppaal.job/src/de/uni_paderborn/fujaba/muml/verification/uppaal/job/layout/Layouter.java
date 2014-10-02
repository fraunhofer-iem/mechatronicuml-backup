package de.uni_paderborn.fujaba.muml.verification.uppaal.job.layout;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import de.uni_paderborn.fujaba.graphviz.blackbox.GraphvizPlainLayouter;
import de.uni_paderborn.fujaba.graphviz.dot.DotEdge;
import de.uni_paderborn.fujaba.graphviz.dot.DotFactory;
import de.uni_paderborn.fujaba.graphviz.dot.DotGraph;
import de.uni_paderborn.fujaba.graphviz.dot.DotNode;
import de.uni_paderborn.fujaba.graphviz.dot.DotPackage;
import de.uni_paderborn.fujaba.graphviz.plain.PlainEdge;
import de.uni_paderborn.fujaba.graphviz.plain.PlainGraph;
import de.uni_paderborn.fujaba.graphviz.plain.PlainNode;
import de.uni_paderborn.uppaal.templates.Edge;
import de.uni_paderborn.uppaal.templates.Location;
import de.uni_paderborn.uppaal.templates.Template;
import de.uni_paderborn.uppaal.visuals.Point;
import de.uni_paderborn.uppaal.visuals.VisualsFactory;
import de.uni_paderborn.uppaal.visuals.VisualsPackage;

public class Layouter {
	
	public void layoutTemplate(Template template) {
		VisualsFactory factory = VisualsPackage.eINSTANCE.getVisualsFactory();
		
		Map<String, Location> locations = new HashMap<String, Location>();
		for (Location loc : template.getLocation()) 
			locations.put(loc.getName(), loc);
		Set<Edge> unsplinedEdges = new HashSet<Edge>(template.getEdge());

		//Create graph and run layouter
		DotGraph graph = createDotGraph(template);
		PlainGraph resultGraph = runLayouter(graph);
		
		//Interpret results for nodes
		for (PlainNode node : resultGraph.getNodes()) {
			Point pt = factory.createPoint();
			pt.setX(graphvizCoordToUppaalCoord(node.getPosition().getX()));
			pt.setY(graphvizCoordToUppaalCoord(node.getPosition().getY()));
			locations.get(node.getName()).setPosition(pt);
		}
		
		//Interpret results for edges
		for (PlainEdge edge : resultGraph.getEdges()) {
			Edge edgeToRemove = null;
			//Find fitting Uppaal edge to put spline points
			for (Edge uppaalEdge : unsplinedEdges) {
				if (uppaalEdge.getSource() != locations.get(edge.getSource().getName()) || uppaalEdge.getTarget() != locations.get(edge.getTarget().getName()))
					continue;
				for (de.uni_paderborn.fujaba.graphviz.util.Point pt : edge.getSplinePoints()) {
					Point uppaalPoint = factory.createPoint();
					uppaalPoint.setX(graphvizCoordToUppaalCoord(pt.getX()));
					uppaalPoint.setY(graphvizCoordToUppaalCoord(pt.getY()));
					uppaalEdge.getBendPoint().add(uppaalPoint);
				}
				edgeToRemove = uppaalEdge;
				break;
			}
			
			if (edgeToRemove != null)
				unsplinedEdges.remove(edgeToRemove);
		}
	}
	
	private int graphvizCoordToUppaalCoord(double val) {
		return (int)(val*120);
	}
	
	private DotGraph createDotGraph(Template template) {
		DotFactory factory = DotPackage.eINSTANCE.getDotFactory();
		DotGraph result = factory.createDotGraph();
		result.setDirectedGraph(true);
		
		HashMap<Location, DotNode> locTrace = new HashMap<Location, DotNode>();
		for (Location loc : template.getLocation()) {
			DotNode node = factory.createDotNode();
			node.setName(loc.getName());
			
			locTrace.put(loc, node);
			result.getNodes().add(node);
		}
		
		for (Edge edge : template.getEdge()) {
			DotEdge dotEdge = factory.createDotEdge();
			dotEdge.setSource(locTrace.get(edge.getSource()));
			dotEdge.setTarget(locTrace.get(edge.getTarget()));
			
			result.getEdges().add(dotEdge);
		}
		
		return result;
	}
	
	private PlainGraph runLayouter(DotGraph graph) {
		GraphvizPlainLayouter layouter = new GraphvizPlainLayouter();
		return layouter.layout(graph);
	}
}


package de.uni_paderborn.fujaba.muml.model.gen.modelica.rtsc.layout;

import java.text.NumberFormat;
import java.util.Locale;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EcoreFactory;
import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.muml.model.gen.graphviz.layout.IAnnotator;
import de.uni_paderborn.fujaba.muml.model.gen.graphviz.layout.IGraphData;
import de.uni_paderborn.fujaba.muml.model.gen.graphviz.layout.IPoint;
import de.uni_paderborn.fujaba.muml.model.gen.modelica.rtsc.layout.ModelicaGraphDataProvider.ModelicaGraphData;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;


public class ModelicaAnnotator implements IAnnotator<Node, Edge> {
	public interface IAnnotator {

	}

	private static final double INCH_MM = 25.4;
	
	private static final String ANNOTATION_SOURCE = "MODELICA_CODEGEN";
	// rtsc details
	private static final String RTSC_SCALE = "scale";
	private static final String RTSC_WIDTH = "width";
	private static final String RTSC_HEIGHT = "height";
	// node details
	private static final String NODE_X_LEFT = "xleft";
	private static final String NODE_Y_LEFT = "yleft";
	private static final String NODE_X_RIGHT = "xright";
	private static final String NODE_Y_RIGHT = "yright";
	// transition details
	private static final String TRANSITION_POLY_SOURCE = "source_points";
	private static final String TRANSITION_POLY_TARGET = "target_points";
	// root rtsc details
	private static final String RTSC_POLY_MESSAGE_DELEGATION = "message_delegation_points";
	private static final String RTSC_POLY_MAILBOX_DELEGATION = "mailbox_delegation_points";
	
	private static String formatDouble(double num) {
		NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.ROOT);
		return numberFormat.format(num);
	}
	
	private static double transformInchToMM(double inch) {
		return inch * INCH_MM;
	}
	
	/*public String getStateAnnotation(State state) throws IOException, InterruptedException {
		IGraphData graphData = layouter.getGraphData(state.getStatechart());
		INode node = graphData.getNode(state.getName());
		if (node == null) {
			throw new RuntimeException("state not found: " + state.getName());
		}
		return getNodeAnnotation(node);
	}
		
	public String getNodeAnnotation(INode node) {
		IPoint position = node.getPosition();
		double xsize = node.getXsize();
		double ysize = node.getYsize();
		double xleft = transformInchToMM(position.getX() - xsize * 0.5);
		double yleft = transformInchToMM(position.getY() - ysize * 0.5);
		double xright = transformInchToMM(position.getX() + xsize * 0.5);
		double yright = transformInchToMM(position.getY() + ysize * 0.5);
		return String.format("annotation (Placement(transformation(extent={{%s, %s},{%s, %s}})))",
				formatDouble(xleft), formatDouble(yleft),
				formatDouble(xright), formatDouble(yright));
	}
	
	public String getTransitionDeclAnnotation(Transition transition) {
		IGraphData graphData = layouter.getGraphData(transition.getStatechart());
		String transitionName = Naming.getTransitionName(transition);
		INode node = graphData.getNode(transitionName);
		if (node == null) {
			throw new RuntimeException("state not found: " + transitionName);
		}
		return getNodeAnnotation(node);
	}
	
	public String getDiagramAnnotation(RealtimeStatechart rtsc) {
		IGraphData graphData = layouter.getGraphData(rtsc);
		double width = transformInchToMM(graphData.getWidth());
		double height = transformInchToMM(graphData.getHeight());
		return String.format("annotation (Diagram(coordinateSystem(extent = {{0, 0}, {%s, %s}})))",
				formatDouble(width + 20), formatDouble(height + 20));
	}
	
	public String getTransitionConnAnnotation(Transition transition, boolean isSource) {
		IGraphData graphData = layouter.getGraphData(transition.getStatechart());
		INode source;
		INode target;
		if (isSource) {
			source = graphData.getNode(transition.getSource().getName());
			target = graphData.getNode(Naming.getTransitionName(transition));
		} else {
			source = graphData.getNode(Naming.getTransitionName(transition));
			target = graphData.getNode(transition.getTarget().getName());
		}
		IEdge edge = graphData.getEdge(source, target);
		if (edge == null) {
			throw new RuntimeException("edge not found: " + source.getName() + "->" + target.getName());
		}
		StringBuilder builder = new StringBuilder();
		for (IPoint point : edge.getPoints()) {
			builder.append("{");
			builder.append(formatDouble(transformInchToMM(point.getX())));
			builder.append(",");
			builder.append(formatDouble(transformInchToMM(point.getY())));
			builder.append("},");
		}
		if (builder.length() > 0) {
			builder.deleteCharAt(builder.length() - 1);
		}
		return String.format("annotation (Line(points={%s}, color={0,0,0}, smooth=Smooth.None))", builder.toString());
	}'*/
	
	private EAnnotation addAnnotation(ExtendableElement element, String source) {
		EAnnotation annotation = element.getAnnotation(source);
		if (annotation != null) {
			return annotation;
		}
		annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.setSource(source);
		element.getAnnotations().add(annotation);
		return annotation;
	}

	@Override
	public void annotate(IGraphData<Node, Edge> graphData, double scale, double width,
			double height) {
		RealtimeStatechart rtsc = ((ModelicaGraphData) graphData).getStatechart(); 
		EAnnotation annotation = addAnnotation(rtsc, ANNOTATION_SOURCE);
		annotation.getDetails().put(RTSC_SCALE, formatDouble(scale));
		annotation.getDetails().put(RTSC_WIDTH, formatDouble(transformInchToMM(width) + 20));
		annotation.getDetails().put(RTSC_HEIGHT, formatDouble(transformInchToMM(height) + 20));
	}
	
	private static void annotatePseudoNode(PseudoNode node, IPoint position, double xsize, double ysize) {
		node.setPosition(position);
		node.setXsize(xsize);
		node.setYsize(ysize);
	}
	
	private static void addNodeDetails(EAnnotation annotation, IPoint position, double xsize, double ysize) {
		addNodeDetails(annotation, position, xsize, ysize, "");
	}
	
	private static void addNodeDetails(EAnnotation annotation, IPoint position, double xsize, double ysize, String prefix) {
		annotation.getDetails().put(prefix + NODE_X_LEFT, formatDouble(transformInchToMM(position.getX() - xsize * 0.5)));
		annotation.getDetails().put(prefix + NODE_Y_LEFT, formatDouble(transformInchToMM(position.getY()) - ysize * 0.5));
		annotation.getDetails().put(prefix + NODE_X_RIGHT, formatDouble(transformInchToMM(position.getX() + xsize * 0.5)));
		annotation.getDetails().put(prefix + NODE_Y_RIGHT, formatDouble(transformInchToMM(position.getY() + ysize * 0.5)));
	}

	@Override
	public void annotate(Node node, IPoint position, double xsize, double ysize) {
		if (node instanceof PseudoNode) {
			annotatePseudoNode((PseudoNode) node, position, xsize, ysize);
			return;
		}
		EAnnotation annotation = addAnnotation(node.getVertex(), ANNOTATION_SOURCE);
		addNodeDetails(annotation, position, xsize, ysize);
	}
	
	private static void addPolylineDetails(EAnnotation annotation, String key, IPoint[] points) {
		StringBuilder builder = new StringBuilder();
		for (IPoint point : points) {
			builder.append("{");
			builder.append(formatDouble(transformInchToMM(point.getX())));
			builder.append(",");
			builder.append(formatDouble(transformInchToMM(point.getY())));
			builder.append("},");
		}
		if (builder.length() > 0) {
			builder.deleteCharAt(builder.length() - 1);
		}
		annotation.getDetails().put(key, builder.toString());
	}

	@Override
	public void annotate(Edge edge, IPoint[] points) {
		if (edge.getEdgeType() == EdgeType.MESSAGE) {
			EAnnotation annotation = addAnnotation(edge.getExtendableElement(), ANNOTATION_SOURCE);
			PseudoNode node = (PseudoNode) edge.getTarget();
			addNodeDetails(annotation, node.getPosition(), node.getXsize(), node.getYsize(), node.getId() + "_");
			node = (PseudoNode) edge.getSource();
			addNodeDetails(annotation, node.getPosition(), node.getXsize(), node.getYsize(), node.getId() + "_");
			addPolylineDetails(annotation, node.getId() + "_" + RTSC_POLY_MESSAGE_DELEGATION, points);
			return;
		} else if (edge.getEdgeType() == EdgeType.MAILBOX) {
			EAnnotation annotation = addAnnotation(edge.getExtendableElement(), ANNOTATION_SOURCE);
			PseudoNode node = (PseudoNode) edge.getSource();
			addNodeDetails(annotation, node.getPosition(), node.getXsize(), node.getYsize(), node.getId() + "_");
			node = (PseudoNode) edge.getTarget();
			addNodeDetails(annotation, node.getPosition(), node.getXsize(), node.getYsize(), node.getId() + "_");
			addPolylineDetails(annotation, node.getId() + "_" + RTSC_POLY_MAILBOX_DELEGATION, points);
			return;
		} else if (edge.getEdgeType() == EdgeType.PSEUDO) {
			return;
		}
		if (!(edge.getSource() instanceof PseudoNode)) {
			EAnnotation annotation = addAnnotation(edge.getExtendableElement(), ANNOTATION_SOURCE);
			addPolylineDetails(annotation, TRANSITION_POLY_SOURCE, points);
			return;
		}
		PseudoNode node = (PseudoNode) edge.getSource();
		EAnnotation annotation = addAnnotation(edge.getExtendableElement(), ANNOTATION_SOURCE);
		addNodeDetails(annotation, node.getPosition(), node.getXsize(), node.getYsize());
		addPolylineDetails(annotation, TRANSITION_POLY_TARGET, points);
	}

}

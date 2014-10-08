package de.uni_paderborn.fujaba.modelica.graphviz.layout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


class Point implements IPoint {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
}

public class GraphvizWrapper<V extends INode, E extends IEdge> implements ILayouter<V, E> {
	
	private static final String DOT_BINARY = "dot";
	private static final String GRAPH = "graph";
	private static final String NODE = "node";
	private static final String EDGE = "edge";
	private static final String STOP = "stop";
	
	private IGraphData<V, E> graphData;
	private IAnnotator<V, E> annotator;
	
	private static String getPortName(EdgePort edgePort) {
		switch (edgePort) {
		case NORTH:
			return "n";
		case EAST:
			return "e";
		case SOUTH:
			return "s";
		case WEST:
			return "w";
		default:
			throw new IllegalArgumentException("unexpected edgePortHint: " + edgePort);
		}
	}
		
	private void printEdge(IEdge edge, PrintWriter writer) {
		String source = Naming.getQuotedName(edge.getSource().getId());
		String target = Naming.getQuotedName(edge.getTarget().getId());
		writer.print("\t" + source + " -> " + target);
		String opts = "";
		if (edge.getHeadPort() != null) {
			opts = "headport=" + getPortName(edge.getHeadPort());
		}
		if (edge.getTailPort() != null) {
			opts += (!opts.equals("") ? "," : "") + "tailport=" + getPortName(edge.getTailPort());
		}
		if (!opts.equals("")) {
			writer.print(" [" + opts + "]");
		}
		writer.println();
	}
	
	private void writeDot(OutputStream out) {
		PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out))) {
			public void print(String str) {
				System.out.print(str);
				super.print(str);
			}
			
			public void println(String str) {
				System.out.println(str);
				super.println(str);
			}
		};
		writer.println("digraph test {");
		writer.println("\tsplines = polyline");
		writer.println("\tnode [shape=box]");
		writer.println("\tedge [samehead=\"\",headport=n,tailport=s,arrowhead=none]");
		for (IEdge edge : graphData.getEdges()) {
			printEdge(edge, writer);
		}
		writer.println("}");
		writer.flush();
		writer.close();
	}
	
	private void runDot() throws InterruptedException, IOException {
		//ProcessBuilder pb = new ProcessBuilder(DOT_BINARY, "-Tpng", path, "-o", "./test.png");
		ProcessBuilder pb = new ProcessBuilder(DOT_BINARY, "-Tplain");
		Process process = pb.start();
		writeDot(process.getOutputStream());
		// stream should be already closed in writeDot
		//process.getOutputStream().flush();
		process.getOutputStream().close();
		process.waitFor();
		parsePlain(process.getInputStream());
	}
	
	private void parsePlain(InputStream in) throws IOException  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String data = reader.readLine();
		while (data != null) {
			if (data.startsWith(GRAPH)) {
				parseGraphLine(data);
			} else if (data.startsWith(NODE)) {
				parseNodeLine(data);
			} else if (data.startsWith(EDGE)) {
				parseEdgeLine(data);
			} else if (data.startsWith(STOP)) {
				break;
			} else {
				throw new IllegalArgumentException("illegal stream content");
			}
			data = reader.readLine();
		}
	}
	
	private String[] splitLine(String line, int expectedElms, String type) {
		String[] elms = line.split(" ");
		if (elms.length != expectedElms) {
			throw new IllegalArgumentException(type + ": expected " + expectedElms + " elements");
		}
		return elms;
	}
	
	private void parseGraphLine(String data) {
		String[] elms = splitLine(data, 4, GRAPH);
		annotator.annotate(graphData, Double.parseDouble(elms[1]),
				Double.parseDouble(elms[2]), Double.parseDouble(elms[3]));
	}

	private void parseNodeLine(String data) {
		String[] elms = splitLine(data, 11, NODE);
		String id = Naming.getUnquotedName(elms[1]);
		V node = graphData.getNode(id);
		IPoint position = new Point(Double.parseDouble(elms[2]),
				Double.parseDouble(elms[3]));
		annotator.annotate(node, position, Double.parseDouble(elms[4]),
				Double.parseDouble(elms[5]));
	}
	
	private void parseEdgeLine(String data) {
		String[] elms = data.split(" ");
		if (elms.length < 4) {
			throw new IllegalArgumentException(EDGE + ": expected at least 4 elements");
		}
		int n = Integer.parseInt(elms[3]);
		if (elms.length < 4 + 2 * n + 2) {
			throw new IllegalArgumentException(EDGE + ": expected at least " + (4 + 2 * n + 2) + " elements");
		}
		IPoint[] points = new Point[n];
		for (int i = 0, j = 0; i < 2 * n; i += 2, j++) {
			points[j] = new Point(Double.parseDouble(elms[4 + i]),
					Double.parseDouble(elms[5 + i]));
		}
		V source = graphData.getNode(Naming.getUnquotedName(elms[1]));
		V target = graphData.getNode(Naming.getUnquotedName(elms[2]));
		E edge = graphData.getEdge(source, target);
		annotator.annotate(edge, points);
	}
	
	public void setGraphData(IGraphDataProvider<V, E> graphDataProvider) {
		graphData = graphDataProvider.getGraphData();
	}
	
	public void setAnnotator(IAnnotator<V, E> annotator) {
		this.annotator = annotator;
	}

	@Override
	public void layout(IGraphDataProvider<V, E> graphDataProvider, IAnnotator<V, E> annotator) {
		setGraphData(graphDataProvider);
		setAnnotator(annotator);
		try {
			runDot();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

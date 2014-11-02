package de.uni_paderborn.fujaba.muml.model.gen.c.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.WeightedGraph;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Pseudograph;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;
import de.uni_paderborn.fujaba.muml.psm.codegen.CodGenAllocation;
import de.uni_paderborn.fujaba.muml.psm.codegen.RefinedStructuredResourceInstance;

public class Routing {

	private static HashMap<EObject, Boolean> donePorts;

	public static RefinedStructuredResourceInstance getNextHopECU(
			RefinedStructuredResourceInstance startECU,
			RefinedStructuredResourceInstance targetECU,
			CodGenAllocation codegenModel) {
		donePorts = new HashMap<EObject, Boolean>();
		Pseudograph<EObject, DefaultWeightedEdge> graph = createPDMGraph(codegenModel
				.getHpic());
		DijkstraShortestPath<EObject, DefaultWeightedEdge> dijkstra = new DijkstraShortestPath<EObject, DefaultWeightedEdge>(
				graph, startECU, targetECU);

		GraphPath<EObject, DefaultWeightedEdge> path = dijkstra.getPath();
		if (path == null) {
			return null;
		}
		Graph<EObject, DefaultWeightedEdge> graphOfPath = path.getGraph();
		if (path.getEdgeList().isEmpty()) {

			return null;

		}
		EObject target = null;
		EObject source = null;
		for (DefaultWeightedEdge edge : path.getEdgeList()) {
			target = graphOfPath.getEdgeTarget(edge);
			source = graphOfPath.getEdgeSource(edge);
			if (target != null
					&& (target instanceof RefinedStructuredResourceInstance)
					&& target != startECU) {
				return (RefinedStructuredResourceInstance) target;
			}
			if (source != null
					&& (source instanceof RefinedStructuredResourceInstance)
					&& source != startECU) {
				return (RefinedStructuredResourceInstance) source;
			}
		}

		return null;
	}

	public static HWPortInstance getNetworkInterface(
			RefinedStructuredResourceInstance startECU,
			RefinedStructuredResourceInstance targetECU,
			CodGenAllocation codegenModel) {
		donePorts = new HashMap<EObject, Boolean>();
		Pseudograph<EObject, DefaultWeightedEdge> graph = createPDMGraph(codegenModel
				.getHpic());
		DijkstraShortestPath<EObject, DefaultWeightedEdge> dijkstra = new DijkstraShortestPath<EObject, DefaultWeightedEdge>(
				graph, startECU, targetECU);
		GraphPath<EObject, DefaultWeightedEdge> path = dijkstra.getPath();
		if (path == null) {
			return null;
		}
		Graph<EObject, DefaultWeightedEdge> graphOfPath = path.getGraph();
		if (path.getEdgeList().isEmpty()) {
			return null;
		}
		for (DefaultWeightedEdge edge : path.getEdgeList()) {
			EObject target = graphOfPath.getEdgeTarget(edge);
			if (target instanceof HWPortInstance) {
				return (HWPortInstance) target;
			}
		}

		return null;
	}

	private static Pseudograph<EObject, DefaultWeightedEdge> createPDMGraph(
			HWPlatformInstanceConfiguration rootHardwarePlatformInstanceConfiguration) {
		List<RefinedStructuredResourceInstance> allRefinedStructuredResourceInstance = collectRefinedStructuredResourceInstance(rootHardwarePlatformInstanceConfiguration);
		Pseudograph<EObject, DefaultWeightedEdge> graph = new Pseudograph<EObject, DefaultWeightedEdge>(
				DefaultWeightedEdge.class);

		// add all ECUs and their Ports to the graph
		for (RefinedStructuredResourceInstance rsi : allRefinedStructuredResourceInstance) {
			graph.addVertex(rsi);
			for (HWPort port : rsi.getHwports()) {
				if (port instanceof HWPortInstance
						&& ((HWPortInstance) port).isIsNetworkInterface()) {
					graph.addVertex(port);
					DefaultWeightedEdge edge = graph.addEdge(rsi, port);
					graph.setEdgeWeight(edge, 1);
				}

			}

		}

		// add all connections to the graph
		for (RefinedStructuredResourceInstance rsi : allRefinedStructuredResourceInstance) {
			for (HWPort port : rsi.getHwports()) {
				if (port instanceof HWPortInstance
						&& ((HWPortInstance) port).isIsNetworkInterface()) {
					addAllConnections(graph, (HWPortInstance) port);
				}

			}

		}

		return graph;
	}

	private static List<RefinedStructuredResourceInstance> collectRefinedStructuredResourceInstance(
			HWPlatformInstanceConfiguration rootHarHwPlatformInstanceConfiguration) {
		List<RefinedStructuredResourceInstance> allRefinedStructuredResourceInstance = new ArrayList<RefinedStructuredResourceInstance>();
		for (ResourceInstance rsi : rootHarHwPlatformInstanceConfiguration
				.getResources()) {
			if (rsi instanceof RefinedStructuredResourceInstance) {
				allRefinedStructuredResourceInstance
						.add((RefinedStructuredResourceInstance) rsi);
			}
		}
		for (HWPlatformInstance hpi : rootHarHwPlatformInstanceConfiguration
				.getHwplatformInstances()) {
			allRefinedStructuredResourceInstance
					.addAll(collectRefinedStructuredResourceInstance(hpi
							.getEmbeddedHPIC()));
		}

		return allRefinedStructuredResourceInstance;
	}

	private static Double getEdgeWeight(ConnectorInstance connector) {
		if (connector instanceof DelegationInstance)
			return (double) 1;
		if (connector instanceof LinkInstance)
			return (double) 1
					+ (1 / ((LinkInstance) connector).getBandwidth().getInBpS());
		if (connector instanceof BusConnectorInstance)
			return (double) 1
					+ (1 / ((BusConnectorInstance) connector)
							.getConnectedBusInstance().get(0).getBandwidth()
							.getInBpS());
		return (double) 1;
	}

	private static void addAllConnections(
			Pseudograph<EObject, DefaultWeightedEdge> graph,
			ConnectorEndpointInstance endpoint) {
		if (donePorts.containsKey(endpoint)) {
			return;
		} else {
			donePorts.put(endpoint, true);
		}
		for (ConnectorInstance connector : endpoint.getConnectorInstances()) {
			// add target Nodes
			for (ConnectorEndpointInstance point : connector
					.getConnectorEndpointInstances()) {
				if (!graph.containsVertex(point)) {
					graph.addVertex(point);
				}
				DefaultWeightedEdge edge = graph.addEdge(endpoint, point);
				graph.setEdgeWeight(edge, getEdgeWeight(connector));
				addAllConnections(graph, point);
			}

		}
	}

}

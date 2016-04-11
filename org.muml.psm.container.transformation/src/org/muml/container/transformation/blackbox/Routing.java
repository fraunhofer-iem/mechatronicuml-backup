package org.muml.container.transformation.blackbox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Pseudograph;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pim.connector.ConnectorInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPortInstance;
import org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance;
import org.muml.pm.hardware.hwplatforminstance.NetworkingHardwareInstance;
import org.muml.pm.hardware.hwresource.CommunicationKind;
import org.muml.pm.hardware.hwresourceinstance.HWPort;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;

public class Routing {

	private static HashMap<EObject, Boolean> donePorts;

	public static StructuredResourceInstance getNextHopECU(StructuredResourceInstance startECU,
			StructuredResourceInstance targetECU, HWPlatformInstanceConfiguration rootHWPlatformInstanceConfiguration) {
		donePorts = new HashMap<EObject, Boolean>();
		Pseudograph<EObject, DefaultWeightedEdge> graph = createPDMGraph(rootHWPlatformInstanceConfiguration);
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
			if (target != null && (target instanceof StructuredResourceInstance) && target != startECU) {
				return (StructuredResourceInstance) target;
			}
			if (source != null && (source instanceof StructuredResourceInstance) && source != startECU) {
				return (StructuredResourceInstance) source;
			}
		}

		return null;
	}

	public static HWPortInstance getNetworkInterface(StructuredResourceInstance startECU,
			StructuredResourceInstance targetECU, HWPlatformInstanceConfiguration rootHWPlatformInstanceConfiguration) {
		donePorts = new HashMap<EObject, Boolean>();
		Pseudograph<EObject, DefaultWeightedEdge> graph = createPDMGraph(rootHWPlatformInstanceConfiguration);
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
		List<StructuredResourceInstance> allRefinedStructuredResourceInstance = collectRefinedStructuredResourceInstance(
				rootHardwarePlatformInstanceConfiguration);
		List<NetworkingHardwareInstance> allNetworkingHardware = collectNetworkingHardwareInstance(rootHardwarePlatformInstanceConfiguration);
		Pseudograph<EObject, DefaultWeightedEdge> graph = new Pseudograph<EObject, DefaultWeightedEdge>(
				DefaultWeightedEdge.class);

		// add all ECUs and their Ports to the graph
		for (StructuredResourceInstance rsi : allRefinedStructuredResourceInstance) {
			graph.addVertex(rsi);
			for (HWPort port : rsi.getHwports()) {
				if (port instanceof HWPortInstance && ((HWPortInstance) port).isIsNetworkInterface()) {
					graph.addVertex(port);
					DefaultWeightedEdge edge = graph.addEdge(rsi, port);
					graph.setEdgeWeight(edge, 1);
				}

			}

		}
		
		//add all network bridg and busse to the graph
		for(NetworkingHardwareInstance nwHardaware: allNetworkingHardware){
			if(nwHardaware instanceof ConnectorEndpointInstance){
				graph.addVertex(nwHardaware);
			}
		}

		// add all connections to the graph
		for (StructuredResourceInstance rsi : allRefinedStructuredResourceInstance) {
			for (HWPort port : rsi.getHwports()) {
				if (port instanceof HWPortInstance && ((HWPortInstance) port).isIsNetworkInterface()) {
					addAllConnections(graph, (HWPortInstance) port);
				}

			}

		}
		for(NetworkingHardwareInstance nwHardaware: allNetworkingHardware){
			if(nwHardaware instanceof ConnectorEndpointInstance){
				addAllConnections(graph, (ConnectorEndpointInstance) nwHardaware);
			}
		}
		
		

		return graph;
	}

	private static List<StructuredResourceInstance> collectRefinedStructuredResourceInstance(
			HWPlatformInstanceConfiguration rootHarHwPlatformInstanceConfiguration) {
		List<StructuredResourceInstance> allRefinedStructuredResourceInstance = new ArrayList<StructuredResourceInstance>();
		for (ResourceInstance rsi : rootHarHwPlatformInstanceConfiguration.getResources()) {
			if (rsi instanceof StructuredResourceInstance) {
				allRefinedStructuredResourceInstance.add((StructuredResourceInstance) rsi);
			}
		}
		for (HWPlatformInstance hpi : rootHarHwPlatformInstanceConfiguration.getHwplatformInstances()) {
			allRefinedStructuredResourceInstance
					.addAll(collectRefinedStructuredResourceInstance(hpi.getEmbeddedHPIC()));
		}

		return allRefinedStructuredResourceInstance;
	}

	private static List<NetworkingHardwareInstance> collectNetworkingHardwareInstance(
			HWPlatformInstanceConfiguration rootHarHwPlatformInstanceConfiguration) {
		List<NetworkingHardwareInstance> allNWHardwareInstance = new ArrayList<NetworkingHardwareInstance>();
		for (NetworkingHardwareInstance rsi : rootHarHwPlatformInstanceConfiguration.getNetworkingHardwareInstances()) {
			if (rsi instanceof NetworkingHardwareInstance) {
				allNWHardwareInstance.add((NetworkingHardwareInstance) rsi);
			}
		}
		for (HWPlatformInstance hpi : rootHarHwPlatformInstanceConfiguration.getHwplatformInstances()) {
			allNWHardwareInstance.addAll(collectNetworkingHardwareInstance(hpi.getEmbeddedHPIC()));
		}

		return allNWHardwareInstance;
	}

	private static Double getEdgeWeight(ConnectorInstance connector) {
		if (connector instanceof NetworkConnectorInstance) {
			NetworkConnectorInstance networkConnector = (NetworkConnectorInstance) connector;
			if (networkConnector.getConnectorKind() == CommunicationKind.DELEGATION) {
				return (double) 0;
			}
			// FIXME: return appropriate bandwidth as weight
			// return (double) 1 + (1 / ((NetworkConnectorInstance)
			// connector).getBandwidth().getInBpS());
			return (double) 1;
		}
		return (double) 1;
	}

	private static void addAllConnections(Pseudograph<EObject, DefaultWeightedEdge> graph,
			ConnectorEndpointInstance endpoint) {
		if (donePorts.containsKey(endpoint)) {
			return;
		} else {
			donePorts.put(endpoint, true);
		}
		for (ConnectorInstance connector : endpoint.getConnectorInstances()) {
			// add target Nodes
			for (ConnectorEndpointInstance point : connector.getConnectorEndpointInstances()) {
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

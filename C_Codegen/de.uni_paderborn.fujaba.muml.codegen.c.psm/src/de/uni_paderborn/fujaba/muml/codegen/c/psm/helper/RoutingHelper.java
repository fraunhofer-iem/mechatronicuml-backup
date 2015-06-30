package de.uni_paderborn.fujaba.muml.codegen.c.psm.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ActuatorInstanceImpl;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.SensorInstanceImpl;
import de.uni_paderborn.fujaba.muml.psm.codegen.CodeGenAllocation;
import de.uni_paderborn.fujaba.muml.psm.codegen.RefinedStructuredResourceInstance;

/**
 * This class provides method for the Acceleo transformation to determine
 * objects, which are needed for the routing decisions: The nextHopECU and the
 * network interface, which can be used to send a message to a nextHopECU.
 * 
 * @author geismann
 *
 */
public class RoutingHelper {
	/**
	 * determines an ecu which is the next hop to reach target_ecu startin on
	 * my_euc
	 * 
	 * @param codegen
	 *            codegen the codegen model (which is the root model for the
	 *            generation)
	 * @param my_ecu
	 *            the starting of the routing
	 * @param target_ecu
	 *            the target of the routing
	 * @return the 'nextHopECU', which can be used to reach target_ecu
	 */
	public static RefinedStructuredResourceInstance getNextHopEcu(
			CodeGenAllocation codegen,
			RefinedStructuredResourceInstance my_ecu,
			RefinedStructuredResourceInstance target_ecu) {
		// create routing table
		HashMap<RefinedStructuredResourceInstance, RoutingLabel> routingTable = genRoutingTable(
				codegen, my_ecu);
		RefinedStructuredResourceInstance result;
		// make sure that target is reachable
		if (routingTable.containsKey(target_ecu)) {
			// if target_ecu is NOT a direct neighbor of start ecu
			if (!((routingTable.get(target_ecu).predecessor) == my_ecu)) {
				result = routingTable.get(target_ecu).predecessor;
				// determine the nextHopECU on the shortest path to targetECU
				while (!(result == my_ecu)) {
					result = routingTable.get(result).predecessor;
				}
				// if target_eu is direct neighbor of start ecu
			} else {
				result = target_ecu;
			}
			// return nextHopECU
			return result;
		}
		// if target is not reachable, return null for error handling
		return null;
	}

	/**
	 * generates a routing table for a given ECU based on the PDM regarding the
	 * shortest path. shortest path means here lowest number of hops to the
	 * target node. for this we are using the well known algorithm of Dijkstra
	 * 
	 * @param codegen
	 *            the codegen model (which is the root model for the generation)
	 * @param ecu
	 *            the ECU for which the routing table is generated
	 * @return the routing table
	 */
	public static HashMap<RefinedStructuredResourceInstance, RoutingLabel> genRoutingTable(
			CodeGenAllocation codegen, RefinedStructuredResourceInstance ecu) {

		// <ecuid, <target ecuid, nextHopEcus[]>>
		HashMap<RefinedStructuredResourceInstance, RoutingLabel> routingTable = new HashMap<RefinedStructuredResourceInstance, RoutingLabel>();

		// initial state (only self- and direct connections)
		for (ResourceInstance ri : codegen.getHpic().getHwplatformInstances()
				.get(0).getEmbeddedHPIC().getResources()) {
			// ignore sensors and actuators
			if (!(ri instanceof ActuatorInstanceImpl)
					&& !(ri instanceof SensorInstanceImpl)) {
				RefinedStructuredResourceInstance rsri = (RefinedStructuredResourceInstance) ri;
				// initialize all nodes
				routingTable.put(rsri, new RoutingLabel());
			}
		}

		// dijkstras algorithm to find the shortest path to every node
		List<RefinedStructuredResourceInstance> settledECUs = new ArrayList<RefinedStructuredResourceInstance>();
		List<RefinedStructuredResourceInstance> unsettledECUs = new ArrayList<RefinedStructuredResourceInstance>();

		// start node
		unsettledECUs.add(ecu);
		routingTable.get(ecu).distance = 0;
		routingTable.get(ecu).predecessor = ecu;

		// start algorithm to find shortest paths
		while (!(unsettledECUs.isEmpty())) {
			RefinedStructuredResourceInstance foo = unsettledECUs.get(0);
			unsettledECUs.remove(foo);
			settledECUs.add(foo);
			for (ResourceInstance neighborECU : getAllDirectReachableNeighbors(
					foo, codegen)) {
				if (!(settledECUs.contains(neighborECU))) {
					int newDistance = routingTable.get(foo).distance + 1;
					if (newDistance < routingTable.get(neighborECU).distance) {
						routingTable.get(neighborECU).distance = newDistance;
						routingTable.get(neighborECU).predecessor = foo;
						unsettledECUs
								.add((RefinedStructuredResourceInstance) neighborECU);
					}
				}
			}
		}
		// returns hash map of nodes and dijkstra information
		return routingTable;
	}

	/**
	 * Computes all direct neighbors of a given ECU
	 * 
	 * @param ecu
	 *            the ECU for which we want to determine all direct neighbors
	 * @param codegen
	 *            the codegen model (which is the root model for the generation)
	 * @return a list of all direct neighbors of the given ECU
	 */
	private static ArrayList<ResourceInstance> getAllDirectReachableNeighbors(
			ResourceInstance ecu, CodeGenAllocation codegen) {
		ArrayList<ResourceInstance> directReachableNeighbors = new ArrayList<ResourceInstance>();
		EList<HWPortInstance> ports = (EList<HWPortInstance>) (EList<?>) ecu
				.getHwports();
		for (HWPortInstance port : ports) {
			if (!port.isIsNetworkInterface()) {
				continue;
			}
			List<HWPortInstance> reachablePortInstances = traverse(port);
			for (HWPortInstance reachablePort : reachablePortInstances) {
				if (reachablePort.getParentResourceInstance() != ecu) {
					directReachableNeighbors.add(reachablePort
							.getParentResourceInstance());
				}

			}

		}
		return directReachableNeighbors;
	}

	/**
	 * Computes the network interface for a given ECU. Usually, this ECU should
	 * be a direct neighbor of my_ecu
	 * 
	 * @param codgen
	 *            the codegen model instance
	 * @param my_ecu
	 *            the starting ECU for which the network interface is generated
	 * @param nextHopEcu
	 *            the ECU, which we want to reach via the generated network
	 *            interface
	 * @result the network interface used to send messages from 'my_ecu' to
	 *         'nextHopEcu'
	 */
	public static HWPortInstance getNetworkInterface(CodeGenAllocation codegen,
			RefinedStructuredResourceInstance my_ecu,
			RefinedStructuredResourceInstance nextHopEcu) {

		if (my_ecu == nextHopEcu) {
			// this case will not happen (see InternalLogic.mtl)
			// we could implement it here, but for that, we have to create a new
			// (anonymous) HWPortInstance and set the values...
			// implementing it in the Acceleo-Transformation is much shorter ;)
			return null;
		}

		// if this method is accidently called without a 'nextHopECU' but an
		// arbitrary ECU of the whole model
		if (!(getAllDirectReachableNeighbors(my_ecu, codegen)
				.contains(nextHopEcu))) {
			// get the nextHopECU
			nextHopEcu = getNextHopEcu(codegen, my_ecu, nextHopEcu);
		}
		EList<HWPortInstance> ports = (EList<HWPortInstance>) (EList<?>) my_ecu
				.getHwports();
		for (HWPortInstance port : ports) {
			if (!port.isIsNetworkInterface()) {
				continue;
			}
			List<HWPortInstance> reachablePortInstances = traverse(port);
			for (HWPortInstance reachablePort : reachablePortInstances) {
				if (reachablePort.getParentResourceInstance() == nextHopEcu) {
					return reachablePort;
				}

			}

		}

		return null;
	}

	
	/**
	 * This function computes for a given HWPortInstance all reachable (via Deligations or Busses) HWPortInstances
	 * Thus this functions works as a closure 
	 * @param endpoint
	 * @return
	 */
	public static List<HWPortInstance> traverse(
			ConnectorEndpointInstance endpoint) {
		List<HWPortInstance> results = new ArrayList<HWPortInstance>();
		if (endpoint instanceof HWPortInstance) {
			results.add((HWPortInstance) endpoint);
		}
		for (ConnectorInstance connector : endpoint.getConnectorInstances()) {
			for (ConnectorEndpointInstance subendpoint : connector
					.getConnectorEndpointInstances()) {
				if (subendpoint == endpoint) {
					continue;
				}

				results.addAll(traverse(subendpoint));

			}
		}

		return results;

	}
}
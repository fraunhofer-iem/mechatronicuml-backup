package org.muml.graphviz.plain.xtext.tests

import com.google.inject.Inject
import org.muml.graphviz.plain.PlainGraph
import org.muml.graphviz.plain.PlainNode
import org.muml.graphviz.plain.xtext.GraphvizPlainInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(GraphvizPlainInjectorProvider))
class GraphvizPlainTest {
	// FIXME: use ParseHelperWithLoadException from the dot.xtext.tests plugin
	@Inject
	ParseHelper<PlainGraph> parser

	@Test 
	def void parseGraphLine() {
		//println("test");
  		val graph = parser.parse(
  			"graph 2.34 2 1.0 stop"
  		)
  		assertEquals(2.34, graph.scale, 0)
  		assertEquals(2, graph.width, 0)
  		assertEquals(1.0, graph.height, 0)
  	}
  	
  	@Test
  	def void parseSingleNode() {
  		val graph = parser.parse(
  			'''
  			graph 2 3 1
  			node foo 1.23 4.567 2 4 label style shape color fillcolor
  			stop
  			'''
  		)
  		assertEquals(1, graph.nodes.size)
  		val node = graph.nodes.get(0)
  		assertEquals("foo", node.name)
  		assertEquals(1.23, node.position.x, 0)
  		assertEquals(4.567, node.position.y, 0)
  		assertEquals(2, node.width, 0)
  		assertEquals(4, node.height, 0)
  	}
  	
  	@Test
  	def void parseNodeNegativeCoords() {
  		val graph = parser.parse(
  			'''
  			graph 2 3 1
  			node foo -1.23 -4 2 4 label style shape color fillcolor
  			stop
  			'''
  		)
  		assertEquals(1, graph.nodes.size)
  		val node = graph.nodes.get(0)
  		assertEquals("foo", node.name)
  		assertEquals(-1.23, node.position.x, 0)
  		assertEquals(-4, node.position.y, 0)
  	}
  	
  	@Test
  	def void parseEdge() {
  		val graph = parser.parse(
  			'''
  			graph 2 3 1
  			node foo 1 2 3 4 label style shape color fillcolor
  			node bar 1 2 3 4 label style shape color fillcolor
  			edge foo bar 2 1.0 2.0 3.0 5 style color
  			stop
  			'''
  		)
  		assertEquals(2, graph.nodes.size)
  		assertEquals(1, graph.edges.size)
  		val edge = graph.edges.get(0)
  		assertEquals("foo", edge.source.name)
  		assertEquals("bar", edge.target.name)
  		assertEquals(2, edge.splinePoints.size)
  		assertEquals(1.0, edge.splinePoints.get(0).x, 0)
  		assertEquals(2.0, edge.splinePoints.get(0).y, 0)
  		// 2nd spline point
  		assertEquals(3.0, edge.splinePoints.get(1).x, 0)
  		assertEquals(5, edge.splinePoints.get(1).y, 0)
  		// check if the common.Edge class supports generics
  		// in a correct way
  		assertNotNull(edge.source.position)
  		assertNotNull(edge.target.position)
  	}
  	
  	@Test
  	def void multiEdges() {
  		val graph = parser.parse(
  			'''
			graph 1 1.4444 2.9444
			node init 0.72222 2.4722 1 0.5 init solid rect black lightgrey
			node warx 0.72222 0.47222 1 0.5 warx solid rect black lightgrey
			node transitionNode_init_warx 0.72222 1.4722 1 0.5 transitionNode_init_warx solid rect black lightgrey
			edge init transitionNode_init_warx 4 0.72222 2.2222 0.59722 2.2222 0.59722 1.7222 0.72222 1.7222 solid black
			edge init transitionNode_init_warx 4 0.72222 2.2222 0.84722 2.2222 0.84722 1.7222 0.72222 1.7222 solid black
			edge transitionNode_init_warx warx 4 0.72222 1.2222 0.59722 1.2222 0.59722 0.72222 0.72222 0.72222 solid black
			edge transitionNode_init_warx warx 4 0.72222 1.2222 0.84722 1.2222 0.84722 0.72222 0.72222 0.72222 solid black
			stop
  			'''
  		);
  		assertEquals(3, graph.nodes.size);
  		assertEquals(4, graph.edges.size);
  	}
  	
  	@Test
  	def void parseCon() {
  		val graph = parser.parse(
  			'''
			graph 1 2.9722 7.9444
			node init 2.1111 7.4722 1 0.5 init solid rect black lightgrey
			node fx 1.9722 5.4722 1 0.5 fx solid rect black lightgrey
			node zx 1.9722 1.4722 1 0.5 zx solid rect black lightgrey
			node q 1.9722 3.4722 1 0.5 q solid rect black lightgrey
			node transitionNode_init_fx 1.9722 6.4722 1 0.5 transitionNode_init_fx solid rect black lightgrey
			node transitionNode_fx_zx 0.72222 3.4722 1 0.5 transitionNode_fx_zx solid rect black lightgrey
			node transitionNode_zx_init 2.1111 0.47222 1 0.5 transitionNode_zx_init solid rect black lightgrey
			node transitionNode_fx_q 1.9722 4.4722 1 0.5 transitionNode_fx_q solid rect black lightgrey
			node transitionNode_q_zx 1.9722 2.4722 1 0.5 transitionNode_q_zx solid rect black lightgrey
			edge init transitionNode_init_fx 4 2.1111 7.2222 2.1111 6.9916 1.9722 6.9529 1.9722 6.7222 solid black
			edge fx transitionNode_fx_zx 7 1.9722 5.2222 1.9722 4.8665 1.5837 4.9879 1.3472 4.7222 0.99875 4.3307 0.72222 4.2463 0.72222 3.7222 solid black
			edge fx transitionNode_fx_q 4 1.9722 5.2222 1.9722 5 1.9722 4.9444 1.9722 4.7222 solid black
			edge zx transitionNode_zx_init 4 1.9722 1.2222 1.9722 0.99159 2.1111 0.95286 2.1111 0.72222 solid black
			edge q transitionNode_q_zx 4 1.9722 3.2222 1.9722 3 1.9722 2.9444 1.9722 2.7222 solid black
			edge transitionNode_init_fx fx 4 1.9722 6.2222 1.9722 6 1.9722 5.9444 1.9722 5.7222 solid black
			edge transitionNode_fx_zx zx 7 0.72222 3.2222 0.72222 2.6981 0.99875 2.6137 1.3472 2.2222 1.5837 1.9565 1.9722 2.078 1.9722 1.7222 solid black
			edge transitionNode_zx_init init 16 2.1111 0.20833 2.1111 -0.013975 2.4517 0.067249 2.6111 0.22222 3.3248 0.91611 2.7361 1.463 2.7361 2.4583 2.7361 5.4722 2.7361 5.4722 2.7361 5.4722 2.7361 6.4738 3.3193 7.014 2.6111 7.7222 2.4537 7.8796 2.1111 7.9726 2.1111 7.75 solid black
			edge transitionNode_fx_q q 4 1.9722 4.2222 1.9722 4 1.9722 3.9444 1.9722 3.7222 solid black
			edge transitionNode_q_zx zx 4 1.9722 2.2222 1.9722 2 1.9722 1.9444 1.9722 1.7222 solid black
			stop
  			'''
  		);
  		assertNotNull(graph);
  		assertTrue(graph.nodes.size > 0);
  		assertTrue(graph.edges.size > 0);
  	}
  	
  	@Test
  	def void parseNodesWithWhiteSpace() {
  		val graph = parser.parse(
  			'''
			graph 1 1 0.5
			node "PositionTransmission sender" 0.5 0.25 1 0.5 "PositionTransmission sender" solid rect black lightgrey
			stop
  		'''
  		);
  		assertNotNull(graph);
  		assertEquals(1, graph.nodes.size());
  		assertEquals("\"PositionTransmission sender\"", (graph.nodes.get(0) as PlainNode).name);
  	}
}
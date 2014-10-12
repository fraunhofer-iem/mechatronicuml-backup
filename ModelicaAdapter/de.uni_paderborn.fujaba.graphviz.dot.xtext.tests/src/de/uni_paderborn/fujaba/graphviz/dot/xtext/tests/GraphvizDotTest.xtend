package de.uni_paderborn.fujaba.graphviz.dot.xtext.tests

import com.google.inject.Inject
import de.uni_paderborn.fujaba.graphviz.dot.DotEdge
import de.uni_paderborn.fujaba.graphviz.dot.DotGraph
import de.uni_paderborn.fujaba.graphviz.dot.DotNode
import de.uni_paderborn.fujaba.graphviz.dot.xtext.DotLanguageInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(DotLanguageInjectorProvider))
class GraphvizDotTest {
	@Inject
	ParseHelperWithLoadException<DotGraph> parser

	@Test 
	def void parseSimpleDot() {
  		val graph = parser.parse(
  			'''
			digraph test {
				node [label="\N"];
				graph [bb="0,0,126,112"];
				foo [pos="27,93", width="0.75", height="0.52778"];
				p1 [pos="27,19", width="0.75", height="0.52778"];
				p2 [pos="99,93", width="0.75", height="0.52778"];
				bar [pos="99,19", width="0.75", height="0.52778"];
				foo -> p1 [pos="27,73.943 27,62.98 27,49.245 27,38.249"];
				p2 -> bar [pos="99,73.943 99,62.98 99,49.245 99,38.249"];
			}
  			'''
  		)
  		assertTrue(graph.directedGraph)
  		assertEquals("test", graph.id)
  		assertEquals(1, graph.graphSettings.size)
  		assertEquals(1, graph.nodeSettings.size)
  		assertEquals(0, graph.edgeSettings.size)
  		assertEquals(4, graph.nodes.size)
  		assertEquals(2, graph.edges.size)
  		assertEquals(0, graph.subgraphs.size)
  		assertTrue(graph.nodes.get(0) instanceof DotNode)
  		assertTrue(graph.edges.get(0) instanceof DotEdge)
  		// check graph's bb setting
  		assertEquals("bb", graph.graphSettings.get(0).attribute)
  		assertEquals("0,0,126,112", graph.graphSettings.get(0).value)
  		// check foo node
  		var node = graph.nodes.get(0)
  		assertEquals("foo", node.name)
  		assertEquals(3, node.settings.size)
  		assertEquals("pos", node.settings.get(0).attribute)
  		assertEquals("27,93", node.settings.get(0).value)
  		assertEquals("width", node.settings.get(1).attribute)
  		assertEquals("0.75", node.settings.get(1).value)
  		assertEquals("height", node.settings.get(2).attribute)
  		assertEquals("0.52778", node.settings.get(2).value)
  		// check node p2
  		node = graph.nodes.get(2)
  		assertEquals("p2", node.name)
  		assertEquals(3, node.settings.size)
  		assertEquals("width", node.settings.get(1).attribute)
  		// check second edge
  		val edge = graph.edges.get(1)
  		assertEquals("p2", edge.source.name)
  		assertEquals("bar", edge.target.name)
  		assertEquals(1, edge.settings.size)
  		assertEquals("pos", edge.settings.get(0).attribute)
  	}
  	
  	@Test
  	def void parseSubgraph() {
  		val graph = parser.parse(
  			'''
			graph {
				graph [margin=0, splines=polyline, pad=0];
				node [label="\N", width="0.5!", height="0.5!", fixedsize=true, shape=rect];
				graph [bb="0,0,182,140"];
				subgraph cluster_Y {
					graph [bb="8,80,114,132"];
					yp1 [width="0.5", height="0.5", pos="88,106"];
					yp2 [width="0.5", height="0.5", pos="34,106"];
				}
				subgraph cluster_R {
					graph [bb="8,8,114,60"];
					rp1 [width="0.5", height="0.5", pos="88,34"];
					rp2 [width="0.5", height="0.5", pos="34,34"];
				}
				subgraph cluster_Z {
					graph [bb="122,80,174,132"];
					"z p" [width="0.5", height="0.5", pos="148,106"];
				}
				yp1 -- rp1 [pos="88,87.831 88,77 88,63.288 88,52.413"];
				yp2 -- rp2 [pos="34,87.831 34,77 34,63.288 34,52.413"];
			}

  			'''
  		)
  		assertFalse(graph.directedGraph)
  		assertEquals("", graph.id)
  		assertNotEquals(null, graph.id)
  		assertEquals(4, graph.graphSettings.size)
  		assertEquals(5, graph.nodeSettings.size)
  		assertTrue(graph.edgeSettings.isEmpty)
  		assertTrue(graph.nodes.isEmpty)
  		assertEquals(2, graph.edges.size)
  		assertEquals(3, graph.subgraphs.size)
  		// check graph settings
  		assertEquals("splines", graph.graphSettings.get(1).attribute)
  		assertEquals("bb", graph.graphSettings.get(3).attribute)
  		// check first graph edge
  		val edge = graph.edges.get(0)
  		assertEquals("yp1", edge.source.name)
  		assertEquals("rp1", edge.target.name)
  		assertEquals(1, edge.settings.size)
  		assertEquals("88,87.831 88,77 88,63.288 88,52.413", edge.settings.get(0).value)
  		// check second subgraph
  		val subgraph = graph.subgraphs.get(1)
  		// cluster_ is not part of the subgraph's id
  		assertEquals("cluster_R", subgraph.id)
  		assertEquals(2, subgraph.nodes.size)
  		assertTrue(subgraph.edges.isEmpty)
  		assertEquals("rp1", subgraph.nodes.get(0).name)
  		assertEquals("rp2", subgraph.nodes.get(1).name)
  		assertEquals("34,34", subgraph.nodes.get(1).settings.get(2).value)
  	}
  	
  	@Test
  	def void parseDifferentIDs() {
  		// if no exception is raised, everything is ok
  		parser.parse(
  			'''
			digraph test {
				f94oo;
				"p1 bar"
				42
				84foobar9
			}
  			'''
  		)
  	}
  	
  	@Test
  	def void parseDoubleInSetting() {
  		parser.parse(
  			'''
			graph {
				graph [bb="0,0,268,124", margin=0, pad=0, splines=polyline];
				node [fixedsize=true, label="\N", shape=rect, width="1!"];
				subgraph cluster_overtaker {
					graph [bb="8,80,260,116"];
					overtaker_overtaker1_acceptOvertaking_inputDelegationPort [height=0.5, pos="224,98", width=1];
				}
			}
  			'''
  		)
  	}
}
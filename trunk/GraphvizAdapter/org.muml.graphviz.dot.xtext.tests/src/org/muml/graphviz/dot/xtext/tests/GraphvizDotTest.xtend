package org.muml.graphviz.dot.xtext.tests

import com.google.inject.Inject
import org.muml.graphviz.dot.DirectedDotEdge
import org.muml.graphviz.dot.DotGraph
import org.muml.graphviz.dot.DotNode
import org.muml.graphviz.dot.UndirectedDotEdge
import org.muml.graphviz.dot.xtext.DotLanguageInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.muml.graphviz.dot.DotFactory
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.ecore.EObject

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(DotLanguageInjectorProvider))
class GraphvizDotTest {
	@Inject
	ParseHelperWithLoadException<DotGraph> parser
	
	@Inject
	SerializeHelper serializer
	
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
  		assertTrue(graph.edges.get(0) instanceof DirectedDotEdge)
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
				subgraph clusterY {
					graph [bb="8,80,114,132"];
					yp1 [width="0.5", height="0.5", pos="88,106"];
					yp2 [width="0.5", height="0.5", pos="34,106"];
				}
				subgraph cluster_R {
					graph [bb="8,8,114,60"];
					rp1 [width="0.5", height="0.5", pos="88,34"];
					rp2 [width="0.5", height="0.5", pos="34,34"];
				}
				subgraph kluster_Z {
					graph [bb="122,80,174,132"];
					"z p" [width="0.5", height="0.5", pos="148,106"];
				}
				subgraph cluster_cluster_foo {
					graph [bb="222,280,274,232"];
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
  		assertEquals(4, graph.subgraphs.size)
  		// check graph settings
  		assertEquals("splines", graph.graphSettings.get(1).attribute)
  		assertEquals("bb", graph.graphSettings.get(3).attribute)
  		// check first graph edge
  		val edge = graph.edges.get(0)
  		assertTrue(edge instanceof UndirectedDotEdge)
  		assertEquals("yp1", edge.source.name)
  		assertEquals("rp1", edge.target.name)
  		assertEquals(1, edge.settings.size)
  		assertEquals("88,87.831 88,77 88,63.288 88,52.413", edge.settings.get(0).value)
  		// check first subgraph
  		var subgraph = graph.subgraphs.get(0)
  		// cluster_ is not part of the subgraph's id, but the subgraph is a cluster
  		assertEquals("Y", subgraph.id)
  		assertTrue(subgraph.isCluster)
  		// check second subgraph
  		subgraph = graph.subgraphs.get(1)
  		// cluster_ is not part of the subgraph's id, but the subgraph is a cluster
  		assertEquals("_R", subgraph.id)
  		assertTrue(subgraph.isCluster)
  		assertEquals(2, subgraph.nodes.size)
  		assertTrue(subgraph.edges.isEmpty)
  		assertEquals("rp1", subgraph.nodes.get(0).name)
  		assertEquals("rp2", subgraph.nodes.get(1).name)
  		assertEquals("34,34", subgraph.nodes.get(1).settings.get(2).value)
  		// check third subgraph
  		subgraph = graph.subgraphs.get(2)
  		assertEquals("kluster_Z", subgraph.id)
  		assertFalse(subgraph.isCluster)
  		// check fourth subgraph
  		subgraph = graph.subgraphs.get(3)
  		assertEquals("_cluster_foo", subgraph.id)
  		assertTrue(subgraph.isCluster)
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
  	
  	@Test
  	def void serializeDirectedDotGraph() {
  		val graph = DotFactory.eINSTANCE.createDotGraph
  		graph.directedGraph = true
  		// create node
  		var node = DotFactory.eINSTANCE.createDotNode
  		node.name = "foo bar"
  		graph.nodes += node
  		// create node
  		node = DotFactory.eINSTANCE.createDotNode
  		node.name = "42"
  		graph.nodes += node
  		// create directed edge
  		var DirectedDotEdge edge edge = DotFactory.eINSTANCE
  			.createDirectedDotEdge
  		edge.source = graph.nodes.get(0)
  		edge.target = graph.nodes.get(1) 
  		graph.edges += edge
  		// create node
  		node = DotFactory.eINSTANCE.createDotNode
  		node.name = "9foo"
  		graph.nodes += node
  		// create node
  		node = DotFactory.eINSTANCE.createDotNode
  		node.name = "-2.7183"
  		graph.nodes += node
  		// create edge
  		edge = DotFactory.eINSTANCE.createDirectedDotEdge
  		edge.source = graph.nodes.get(2)
  		edge.target = graph.nodes.get(3)
  		graph.edges += edge
  		serializer.serialize(graph)
  		assertEquals(
  			'''
			digraph {
				"foo bar"
				42
				9foo
				-2.7183
				"foo bar" -> 42
				9foo -> -2.7183
			}'''.toString,
			serializer.serialize(graph)
  		)
  	}
  	
  	@Test
  	def void serializeUndirectedDotGraph() {
  		val graph = DotFactory.eINSTANCE.createDotGraph
  		graph.directedGraph = false
  		// create graph setting
  		var setting = DotFactory.eINSTANCE.createSetting
  		setting.attribute = "splines"
  		setting.value = "polyline"
  		graph.graphSettings += setting
  		// create graph setting
  		setting = DotFactory.eINSTANCE.createSetting
  		setting.attribute = "margin"
  		setting.value = "0"
  		graph.graphSettings += setting
  		// create node setting
  		setting = DotFactory.eINSTANCE.createSetting
  		setting.attribute = "width"
  		setting.value = "1!"
  		graph.nodeSettings += setting
  		// create edge setting
  		setting = DotFactory.eINSTANCE.createSetting
  		setting.attribute = "arrowhead"
  		setting.value = "diamond"
  		graph.edgeSettings += setting
  		// create node
  		var node = DotFactory.eINSTANCE.createDotNode
  		node.name = "42 foobar"
  		graph.nodes += node
  		// create node
  		node = DotFactory.eINSTANCE.createDotNode
  		node.name = "xyz"
  		graph.nodes += node
  		// create edge
  		var UndirectedDotEdge edge = DotFactory.eINSTANCE
  			.createUndirectedDotEdge
  		edge.source = graph.nodes.get(0)
  		edge.target = graph.nodes.get(1)
  		graph.edges += edge
  		assertEquals(
  			'''
  			graph {
  				graph [ splines = polyline ];
  				graph [ margin = 0 ];
  				node [ width = "1!" ];
  				edge [ arrowhead = diamond ];
  				"42 foobar"
  				xyz
  				"42 foobar" -- xyz
  			}'''.toString,
  			serializer.serialize(graph)
  		)
  	}
  	
  	@Test
  	def void validSubgraphSerialization() {
  		var graph = DotFactory.eINSTANCE.createDotGraph
  		graph.id = "foobar"
  		graph.directedGraph = false
  		// first subgraph (cluster)
  		var subgraph = DotFactory.eINSTANCE.createDotGraph
  		subgraph.id = "foo"
  		subgraph.cluster = true
  		var node = DotFactory.eINSTANCE.createDotNode
  		node.name = "clusterfooNode"
  		subgraph.nodes += node
  		graph.subgraphs += subgraph
  		// second subgraph (no cluster)
  		subgraph = DotFactory.eINSTANCE.createDotGraph
  		subgraph.id = "bar"
  		subgraph.cluster = false
  		node = DotFactory.eINSTANCE.createDotNode
  		node.name = "cluster_barNode"
  		subgraph.nodes += node
  		graph.subgraphs += subgraph
  		// third subgraph (cluster)
  		subgraph = DotFactory.eINSTANCE.createDotGraph
  		subgraph.id = "baz"
  		subgraph.cluster = true
  		node = DotFactory.eINSTANCE.createDotNode
  		node.name = "bazNode"
  		subgraph.nodes += node
  		graph.subgraphs += subgraph
  		// fourth subgraph (no cluster)
  		subgraph = DotFactory.eINSTANCE.createDotGraph
  		subgraph.id = "_cluster_crusty"
  		subgraph.cluster = false
  		node = DotFactory.eINSTANCE.createDotNode
  		node.name = "clustercrustyNode"
  		subgraph.nodes += node
  		graph.subgraphs += subgraph
  		assertValidDotGraph(graph)
  		// expected serialization
  		val expected = '''
  		graph foobar {
  			subgraph clusterfoo {
  				clusterfooNode
  			}
  			subgraph bar {
  				cluster_barNode
  			}
  			subgraph clusterbaz {
  				bazNode
  			}
  			subgraph _cluster_crusty {
  				clustercrustyNode
  			}
  		}'''
  		assertEquals(expected, serializer.serialize(graph))
  		// check if we stick to the xtext contract: parsing expected
  		// should yield the same graph
  		graph = parser.parse(expected)
  		assertEquals(4, graph.subgraphs.size)
  		subgraph = graph.subgraphs.get(0)
  		assertEquals("foo", subgraph.id)
  		assertTrue(subgraph.isCluster)
  		assertEquals("clusterfooNode", subgraph.nodes.get(0).name)
  		subgraph = graph.subgraphs.get(1)
  		assertEquals("bar", subgraph.id)
  		assertFalse(subgraph.isCluster)
  		assertEquals("cluster_barNode", subgraph.nodes.get(0).name)
  		subgraph = graph.subgraphs.get(2)
  		assertEquals("baz", subgraph.id)
  		assertTrue(subgraph.isCluster)
  		assertEquals("bazNode", subgraph.nodes.get(0).name)
  		subgraph = graph.subgraphs.get(3)
  		assertEquals("_cluster_crusty", subgraph.id)
  		assertFalse(subgraph.isCluster)
  		assertEquals("clustercrustyNode", subgraph.nodes.get(0).name)
  	}
  	
  	@Test
  	def void invalidSubGraphSerialization() {
  		var graph = DotFactory.eINSTANCE.createDotGraph
  		graph.id = "foobar"
  		graph.directedGraph = false
  		// first subgraph (with illegal id)
  		var subgraph = DotFactory.eINSTANCE.createDotGraph
  		subgraph.id = "cluster_cluster_foo"
  		subgraph.cluster = true
  		var node = DotFactory.eINSTANCE.createDotNode
  		node.name = "foo"
  		subgraph.nodes += node
  		graph.subgraphs += subgraph
  		assertInvalidDotGraph(graph)
  		// expected serialization
  		val expected = '''
		graph foobar {
			subgraph clustercluster_cluster_foo {
				foo
			}
		}'''
  		assertEquals(expected, serializer.serialize(graph))
  		// here the xtext contract broke
  		// (parsing of the serialization yields a different graph)
  		graph = parser.parse(expected)
  		subgraph = graph.subgraphs.get(0)
  		assertEquals("_cluster_foo", subgraph.id)
  		// there are a bit more grammar <-> valid metamodel discrepancies
	  	// (e.g., the metamodel supports no nodes in a subgraph etc.
	  	// (will be fixed/documented later))
  	}
  	
  	@Test
  	def void emptyGraphSerialization() {
  		val graph = DotFactory.eINSTANCE.createDotGraph
  		val expected = '''
  		graph {
  		}'''
  		assertEquals(expected, serializer.serialize(graph))
  	}
  	
  	@Test
  	def void emptySubgraphSerialization() {
  		val graph = DotFactory.eINSTANCE.createDotGraph
  		graph.id = "foobar"
  		graph.directedGraph = true
  		val subgraph = DotFactory.eINSTANCE.createDotGraph
  		subgraph.id = "bar"
  		graph.subgraphs += subgraph
  		assertValidDotGraph(graph)
  		// expected serialization
  		val expected = '''
  		digraph foobar {
  			subgraph bar {
  			}
  		}'''
  		assertEquals(expected, serializer.serialize(graph))
  	}
  	
  	def static void assertValidDotGraph(DotGraph graph) {
  		assertEquals(Diagnostic.OK, validate(graph).severity)
  	}
  	
  	def static void assertInvalidDotGraph(DotGraph graph) {
  		assertEquals(Diagnostic.ERROR, validate(graph).severity)
  	}
  	
  	def static Diagnostic validate(EObject object) {
  		Diagnostician.INSTANCE.validate(object)	
  	}
}
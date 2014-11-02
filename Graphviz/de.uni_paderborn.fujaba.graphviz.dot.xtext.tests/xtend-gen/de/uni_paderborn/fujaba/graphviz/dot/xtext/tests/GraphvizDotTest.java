package de.uni_paderborn.fujaba.graphviz.dot.xtext.tests;

import com.google.inject.Inject;
import de.uni_paderborn.fujaba.graphviz.dot.DotEdge;
import de.uni_paderborn.fujaba.graphviz.dot.DotGraph;
import de.uni_paderborn.fujaba.graphviz.dot.DotNode;
import de.uni_paderborn.fujaba.graphviz.dot.Setting;
import de.uni_paderborn.fujaba.graphviz.dot.xtext.DotLanguageInjectorProvider;
import de.uni_paderborn.fujaba.graphviz.dot.xtext.tests.ParseHelperWithLoadException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(DotLanguageInjectorProvider.class)
@SuppressWarnings("all")
public class GraphvizDotTest {
  @Inject
  private ParseHelperWithLoadException<DotGraph> parser;
  
  @Test
  public void parseSimpleDot() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("digraph test {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node [label=\"\\N\"];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("graph [bb=\"0,0,126,112\"];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("foo [pos=\"27,93\", width=\"0.75\", height=\"0.52778\"];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("p1 [pos=\"27,19\", width=\"0.75\", height=\"0.52778\"];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("p2 [pos=\"99,93\", width=\"0.75\", height=\"0.52778\"];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("bar [pos=\"99,19\", width=\"0.75\", height=\"0.52778\"];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("foo -> p1 [pos=\"27,73.943 27,62.98 27,49.245 27,38.249\"];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("p2 -> bar [pos=\"99,73.943 99,62.98 99,49.245 99,38.249\"];");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final DotGraph graph = this.parser.parse(_builder);
      boolean _isDirectedGraph = graph.isDirectedGraph();
      Assert.assertTrue(_isDirectedGraph);
      String _id = graph.getId();
      Assert.assertEquals("test", _id);
      EList<Setting> _graphSettings = graph.getGraphSettings();
      int _size = _graphSettings.size();
      Assert.assertEquals(1, _size);
      EList<Setting> _nodeSettings = graph.getNodeSettings();
      int _size_1 = _nodeSettings.size();
      Assert.assertEquals(1, _size_1);
      EList<Setting> _edgeSettings = graph.getEdgeSettings();
      int _size_2 = _edgeSettings.size();
      Assert.assertEquals(0, _size_2);
      EList<DotNode> _nodes = graph.getNodes();
      int _size_3 = _nodes.size();
      Assert.assertEquals(4, _size_3);
      EList<DotEdge> _edges = graph.getEdges();
      int _size_4 = _edges.size();
      Assert.assertEquals(2, _size_4);
      EList<DotGraph> _subgraphs = graph.getSubgraphs();
      int _size_5 = _subgraphs.size();
      Assert.assertEquals(0, _size_5);
      EList<DotNode> _nodes_1 = graph.getNodes();
      DotNode _get = _nodes_1.get(0);
      Assert.assertTrue((_get instanceof DotNode));
      EList<DotEdge> _edges_1 = graph.getEdges();
      DotEdge _get_1 = _edges_1.get(0);
      Assert.assertTrue((_get_1 instanceof DotEdge));
      EList<Setting> _graphSettings_1 = graph.getGraphSettings();
      Setting _get_2 = _graphSettings_1.get(0);
      String _attribute = _get_2.getAttribute();
      Assert.assertEquals("bb", _attribute);
      EList<Setting> _graphSettings_2 = graph.getGraphSettings();
      Setting _get_3 = _graphSettings_2.get(0);
      String _value = _get_3.getValue();
      Assert.assertEquals("0,0,126,112", _value);
      EList<DotNode> _nodes_2 = graph.getNodes();
      DotNode node = _nodes_2.get(0);
      String _name = node.getName();
      Assert.assertEquals("foo", _name);
      EList<Setting> _settings = node.getSettings();
      int _size_6 = _settings.size();
      Assert.assertEquals(3, _size_6);
      EList<Setting> _settings_1 = node.getSettings();
      Setting _get_4 = _settings_1.get(0);
      String _attribute_1 = _get_4.getAttribute();
      Assert.assertEquals("pos", _attribute_1);
      EList<Setting> _settings_2 = node.getSettings();
      Setting _get_5 = _settings_2.get(0);
      String _value_1 = _get_5.getValue();
      Assert.assertEquals("27,93", _value_1);
      EList<Setting> _settings_3 = node.getSettings();
      Setting _get_6 = _settings_3.get(1);
      String _attribute_2 = _get_6.getAttribute();
      Assert.assertEquals("width", _attribute_2);
      EList<Setting> _settings_4 = node.getSettings();
      Setting _get_7 = _settings_4.get(1);
      String _value_2 = _get_7.getValue();
      Assert.assertEquals("0.75", _value_2);
      EList<Setting> _settings_5 = node.getSettings();
      Setting _get_8 = _settings_5.get(2);
      String _attribute_3 = _get_8.getAttribute();
      Assert.assertEquals("height", _attribute_3);
      EList<Setting> _settings_6 = node.getSettings();
      Setting _get_9 = _settings_6.get(2);
      String _value_3 = _get_9.getValue();
      Assert.assertEquals("0.52778", _value_3);
      EList<DotNode> _nodes_3 = graph.getNodes();
      DotNode _get_10 = _nodes_3.get(2);
      node = _get_10;
      String _name_1 = node.getName();
      Assert.assertEquals("p2", _name_1);
      EList<Setting> _settings_7 = node.getSettings();
      int _size_7 = _settings_7.size();
      Assert.assertEquals(3, _size_7);
      EList<Setting> _settings_8 = node.getSettings();
      Setting _get_11 = _settings_8.get(1);
      String _attribute_4 = _get_11.getAttribute();
      Assert.assertEquals("width", _attribute_4);
      EList<DotEdge> _edges_2 = graph.getEdges();
      final DotEdge edge = _edges_2.get(1);
      DotNode _source = edge.getSource();
      String _name_2 = _source.getName();
      Assert.assertEquals("p2", _name_2);
      DotNode _target = edge.getTarget();
      String _name_3 = _target.getName();
      Assert.assertEquals("bar", _name_3);
      EList<Setting> _settings_9 = edge.getSettings();
      int _size_8 = _settings_9.size();
      Assert.assertEquals(1, _size_8);
      EList<Setting> _settings_10 = edge.getSettings();
      Setting _get_12 = _settings_10.get(0);
      String _attribute_5 = _get_12.getAttribute();
      Assert.assertEquals("pos", _attribute_5);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseSubgraph() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("graph {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("graph [margin=0, splines=polyline, pad=0];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node [label=\"\\N\", width=\"0.5!\", height=\"0.5!\", fixedsize=true, shape=rect];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("graph [bb=\"0,0,182,140\"];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("subgraph cluster_Y {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("graph [bb=\"8,80,114,132\"];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("yp1 [width=\"0.5\", height=\"0.5\", pos=\"88,106\"];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("yp2 [width=\"0.5\", height=\"0.5\", pos=\"34,106\"];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("subgraph cluster_R {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("graph [bb=\"8,8,114,60\"];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("rp1 [width=\"0.5\", height=\"0.5\", pos=\"88,34\"];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("rp2 [width=\"0.5\", height=\"0.5\", pos=\"34,34\"];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("subgraph cluster_Z {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("graph [bb=\"122,80,174,132\"];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("\"z p\" [width=\"0.5\", height=\"0.5\", pos=\"148,106\"];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("yp1 -- rp1 [pos=\"88,87.831 88,77 88,63.288 88,52.413\"];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("yp2 -- rp2 [pos=\"34,87.831 34,77 34,63.288 34,52.413\"];");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final DotGraph graph = this.parser.parse(_builder);
      boolean _isDirectedGraph = graph.isDirectedGraph();
      Assert.assertFalse(_isDirectedGraph);
      String _id = graph.getId();
      Assert.assertEquals("", _id);
      String _id_1 = graph.getId();
      Assert.assertNotEquals(null, _id_1);
      EList<Setting> _graphSettings = graph.getGraphSettings();
      int _size = _graphSettings.size();
      Assert.assertEquals(4, _size);
      EList<Setting> _nodeSettings = graph.getNodeSettings();
      int _size_1 = _nodeSettings.size();
      Assert.assertEquals(5, _size_1);
      EList<Setting> _edgeSettings = graph.getEdgeSettings();
      boolean _isEmpty = _edgeSettings.isEmpty();
      Assert.assertTrue(_isEmpty);
      EList<DotNode> _nodes = graph.getNodes();
      boolean _isEmpty_1 = _nodes.isEmpty();
      Assert.assertTrue(_isEmpty_1);
      EList<DotEdge> _edges = graph.getEdges();
      int _size_2 = _edges.size();
      Assert.assertEquals(2, _size_2);
      EList<DotGraph> _subgraphs = graph.getSubgraphs();
      int _size_3 = _subgraphs.size();
      Assert.assertEquals(3, _size_3);
      EList<Setting> _graphSettings_1 = graph.getGraphSettings();
      Setting _get = _graphSettings_1.get(1);
      String _attribute = _get.getAttribute();
      Assert.assertEquals("splines", _attribute);
      EList<Setting> _graphSettings_2 = graph.getGraphSettings();
      Setting _get_1 = _graphSettings_2.get(3);
      String _attribute_1 = _get_1.getAttribute();
      Assert.assertEquals("bb", _attribute_1);
      EList<DotEdge> _edges_1 = graph.getEdges();
      final DotEdge edge = _edges_1.get(0);
      DotNode _source = edge.getSource();
      String _name = _source.getName();
      Assert.assertEquals("yp1", _name);
      DotNode _target = edge.getTarget();
      String _name_1 = _target.getName();
      Assert.assertEquals("rp1", _name_1);
      EList<Setting> _settings = edge.getSettings();
      int _size_4 = _settings.size();
      Assert.assertEquals(1, _size_4);
      EList<Setting> _settings_1 = edge.getSettings();
      Setting _get_2 = _settings_1.get(0);
      String _value = _get_2.getValue();
      Assert.assertEquals("88,87.831 88,77 88,63.288 88,52.413", _value);
      EList<DotGraph> _subgraphs_1 = graph.getSubgraphs();
      final DotGraph subgraph = _subgraphs_1.get(1);
      String _id_2 = subgraph.getId();
      Assert.assertEquals("cluster_R", _id_2);
      EList<DotNode> _nodes_1 = subgraph.getNodes();
      int _size_5 = _nodes_1.size();
      Assert.assertEquals(2, _size_5);
      EList<DotEdge> _edges_2 = subgraph.getEdges();
      boolean _isEmpty_2 = _edges_2.isEmpty();
      Assert.assertTrue(_isEmpty_2);
      EList<DotNode> _nodes_2 = subgraph.getNodes();
      DotNode _get_3 = _nodes_2.get(0);
      String _name_2 = _get_3.getName();
      Assert.assertEquals("rp1", _name_2);
      EList<DotNode> _nodes_3 = subgraph.getNodes();
      DotNode _get_4 = _nodes_3.get(1);
      String _name_3 = _get_4.getName();
      Assert.assertEquals("rp2", _name_3);
      EList<DotNode> _nodes_4 = subgraph.getNodes();
      DotNode _get_5 = _nodes_4.get(1);
      EList<Setting> _settings_2 = _get_5.getSettings();
      Setting _get_6 = _settings_2.get(2);
      String _value_1 = _get_6.getValue();
      Assert.assertEquals("34,34", _value_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseDifferentIDs() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("digraph test {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("f94oo;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"p1 bar\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("42");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("84foobar9");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this.parser.parse(_builder);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseDoubleInSetting() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("graph {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("graph [bb=\"0,0,268,124\", margin=0, pad=0, splines=polyline];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("node [fixedsize=true, label=\"\\N\", shape=rect, width=\"1!\"];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("subgraph cluster_overtaker {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("graph [bb=\"8,80,260,116\"];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("overtaker_overtaker1_acceptOvertaking_inputDelegationPort [height=0.5, pos=\"224,98\", width=1];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this.parser.parse(_builder);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

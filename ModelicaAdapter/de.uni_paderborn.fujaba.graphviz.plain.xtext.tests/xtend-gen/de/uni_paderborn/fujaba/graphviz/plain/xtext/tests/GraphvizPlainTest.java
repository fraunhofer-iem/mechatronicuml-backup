package de.uni_paderborn.fujaba.graphviz.plain.xtext.tests;

import com.google.inject.Inject;
import de.uni_paderborn.fujaba.graphviz.plain.PlainEdge;
import de.uni_paderborn.fujaba.graphviz.plain.PlainGraph;
import de.uni_paderborn.fujaba.graphviz.plain.PlainNode;
import de.uni_paderborn.fujaba.graphviz.plain.xtext.GraphvizPlainInjectorProvider;
import de.uni_paderborn.fujaba.graphviz.util.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(GraphvizPlainInjectorProvider.class)
@SuppressWarnings("all")
public class GraphvizPlainTest {
  @Inject
  private ParseHelper<PlainGraph> parser;
  
  @Test
  public void parseGraphLine() {
    try {
      final PlainGraph graph = this.parser.parse(
        "graph 2.34 2 1.0 stop");
      double _scale = graph.getScale();
      Assert.assertEquals(2.34, _scale, 0);
      double _width = graph.getWidth();
      Assert.assertEquals(2, _width, 0);
      double _height = graph.getHeight();
      Assert.assertEquals(1.0, _height, 0);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseSingleNode() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("graph 2 3 1");
      _builder.newLine();
      _builder.append("node foo 1.23 4.567 2 4 label style shape color fillcolor");
      _builder.newLine();
      _builder.append("stop");
      _builder.newLine();
      final PlainGraph graph = this.parser.parse(_builder);
      EList<PlainNode> _nodes = graph.getNodes();
      int _size = _nodes.size();
      Assert.assertEquals(1, _size);
      EList<PlainNode> _nodes_1 = graph.getNodes();
      final PlainNode node = _nodes_1.get(0);
      String _name = node.getName();
      Assert.assertEquals("foo", _name);
      Point _position = node.getPosition();
      double _x = _position.getX();
      Assert.assertEquals(1.23, _x, 0);
      Point _position_1 = node.getPosition();
      double _y = _position_1.getY();
      Assert.assertEquals(4.567, _y, 0);
      double _width = node.getWidth();
      Assert.assertEquals(2, _width, 0);
      double _height = node.getHeight();
      Assert.assertEquals(4, _height, 0);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseNodeNegativeCoords() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("graph 2 3 1");
      _builder.newLine();
      _builder.append("node foo -1.23 -4 2 4 label style shape color fillcolor");
      _builder.newLine();
      _builder.append("stop");
      _builder.newLine();
      final PlainGraph graph = this.parser.parse(_builder);
      EList<PlainNode> _nodes = graph.getNodes();
      int _size = _nodes.size();
      Assert.assertEquals(1, _size);
      EList<PlainNode> _nodes_1 = graph.getNodes();
      final PlainNode node = _nodes_1.get(0);
      String _name = node.getName();
      Assert.assertEquals("foo", _name);
      double _minus = (-1.23);
      Point _position = node.getPosition();
      double _x = _position.getX();
      Assert.assertEquals(_minus, _x, 0);
      int _minus_1 = (-4);
      Point _position_1 = node.getPosition();
      double _y = _position_1.getY();
      Assert.assertEquals(_minus_1, _y, 0);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseEdge() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("graph 2 3 1");
      _builder.newLine();
      _builder.append("node foo 1 2 3 4 label style shape color fillcolor");
      _builder.newLine();
      _builder.append("node bar 1 2 3 4 label style shape color fillcolor");
      _builder.newLine();
      _builder.append("edge foo bar 2 1.0 2.0 3.0 5 style color");
      _builder.newLine();
      _builder.append("stop");
      _builder.newLine();
      final PlainGraph graph = this.parser.parse(_builder);
      EList<PlainNode> _nodes = graph.getNodes();
      int _size = _nodes.size();
      Assert.assertEquals(2, _size);
      EList<PlainEdge> _edges = graph.getEdges();
      int _size_1 = _edges.size();
      Assert.assertEquals(1, _size_1);
      EList<PlainEdge> _edges_1 = graph.getEdges();
      final PlainEdge edge = _edges_1.get(0);
      PlainNode _source = edge.getSource();
      String _name = _source.getName();
      Assert.assertEquals("foo", _name);
      PlainNode _target = edge.getTarget();
      String _name_1 = _target.getName();
      Assert.assertEquals("bar", _name_1);
      EList<Point> _splinePoints = edge.getSplinePoints();
      int _size_2 = _splinePoints.size();
      Assert.assertEquals(2, _size_2);
      EList<Point> _splinePoints_1 = edge.getSplinePoints();
      Point _get = _splinePoints_1.get(0);
      double _x = _get.getX();
      Assert.assertEquals(1.0, _x, 0);
      EList<Point> _splinePoints_2 = edge.getSplinePoints();
      Point _get_1 = _splinePoints_2.get(0);
      double _y = _get_1.getY();
      Assert.assertEquals(2.0, _y, 0);
      EList<Point> _splinePoints_3 = edge.getSplinePoints();
      Point _get_2 = _splinePoints_3.get(1);
      double _x_1 = _get_2.getX();
      Assert.assertEquals(3.0, _x_1, 0);
      EList<Point> _splinePoints_4 = edge.getSplinePoints();
      Point _get_3 = _splinePoints_4.get(1);
      double _y_1 = _get_3.getY();
      Assert.assertEquals(5, _y_1, 0);
      PlainNode _source_1 = edge.getSource();
      Point _position = _source_1.getPosition();
      Assert.assertNotNull(_position);
      PlainNode _target_1 = edge.getTarget();
      Point _position_1 = _target_1.getPosition();
      Assert.assertNotNull(_position_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void multiEdges() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("graph 1 1.4444 2.9444");
      _builder.newLine();
      _builder.append("node init 0.72222 2.4722 1 0.5 init solid rect black lightgrey");
      _builder.newLine();
      _builder.append("node warx 0.72222 0.47222 1 0.5 warx solid rect black lightgrey");
      _builder.newLine();
      _builder.append("node transitionNode_init_warx 0.72222 1.4722 1 0.5 transitionNode_init_warx solid rect black lightgrey");
      _builder.newLine();
      _builder.append("edge init transitionNode_init_warx 4 0.72222 2.2222 0.59722 2.2222 0.59722 1.7222 0.72222 1.7222 solid black");
      _builder.newLine();
      _builder.append("edge init transitionNode_init_warx 4 0.72222 2.2222 0.84722 2.2222 0.84722 1.7222 0.72222 1.7222 solid black");
      _builder.newLine();
      _builder.append("edge transitionNode_init_warx warx 4 0.72222 1.2222 0.59722 1.2222 0.59722 0.72222 0.72222 0.72222 solid black");
      _builder.newLine();
      _builder.append("edge transitionNode_init_warx warx 4 0.72222 1.2222 0.84722 1.2222 0.84722 0.72222 0.72222 0.72222 solid black");
      _builder.newLine();
      _builder.append("stop");
      _builder.newLine();
      final PlainGraph graph = this.parser.parse(_builder);
      EList<PlainNode> _nodes = graph.getNodes();
      int _size = _nodes.size();
      Assert.assertEquals(3, _size);
      EList<PlainEdge> _edges = graph.getEdges();
      int _size_1 = _edges.size();
      Assert.assertEquals(4, _size_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseCon() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("graph 1 2.9722 7.9444");
      _builder.newLine();
      _builder.append("node init 2.1111 7.4722 1 0.5 init solid rect black lightgrey");
      _builder.newLine();
      _builder.append("node fx 1.9722 5.4722 1 0.5 fx solid rect black lightgrey");
      _builder.newLine();
      _builder.append("node zx 1.9722 1.4722 1 0.5 zx solid rect black lightgrey");
      _builder.newLine();
      _builder.append("node q 1.9722 3.4722 1 0.5 q solid rect black lightgrey");
      _builder.newLine();
      _builder.append("node transitionNode_init_fx 1.9722 6.4722 1 0.5 transitionNode_init_fx solid rect black lightgrey");
      _builder.newLine();
      _builder.append("node transitionNode_fx_zx 0.72222 3.4722 1 0.5 transitionNode_fx_zx solid rect black lightgrey");
      _builder.newLine();
      _builder.append("node transitionNode_zx_init 2.1111 0.47222 1 0.5 transitionNode_zx_init solid rect black lightgrey");
      _builder.newLine();
      _builder.append("node transitionNode_fx_q 1.9722 4.4722 1 0.5 transitionNode_fx_q solid rect black lightgrey");
      _builder.newLine();
      _builder.append("node transitionNode_q_zx 1.9722 2.4722 1 0.5 transitionNode_q_zx solid rect black lightgrey");
      _builder.newLine();
      _builder.append("edge init transitionNode_init_fx 4 2.1111 7.2222 2.1111 6.9916 1.9722 6.9529 1.9722 6.7222 solid black");
      _builder.newLine();
      _builder.append("edge fx transitionNode_fx_zx 7 1.9722 5.2222 1.9722 4.8665 1.5837 4.9879 1.3472 4.7222 0.99875 4.3307 0.72222 4.2463 0.72222 3.7222 solid black");
      _builder.newLine();
      _builder.append("edge fx transitionNode_fx_q 4 1.9722 5.2222 1.9722 5 1.9722 4.9444 1.9722 4.7222 solid black");
      _builder.newLine();
      _builder.append("edge zx transitionNode_zx_init 4 1.9722 1.2222 1.9722 0.99159 2.1111 0.95286 2.1111 0.72222 solid black");
      _builder.newLine();
      _builder.append("edge q transitionNode_q_zx 4 1.9722 3.2222 1.9722 3 1.9722 2.9444 1.9722 2.7222 solid black");
      _builder.newLine();
      _builder.append("edge transitionNode_init_fx fx 4 1.9722 6.2222 1.9722 6 1.9722 5.9444 1.9722 5.7222 solid black");
      _builder.newLine();
      _builder.append("edge transitionNode_fx_zx zx 7 0.72222 3.2222 0.72222 2.6981 0.99875 2.6137 1.3472 2.2222 1.5837 1.9565 1.9722 2.078 1.9722 1.7222 solid black");
      _builder.newLine();
      _builder.append("edge transitionNode_zx_init init 16 2.1111 0.20833 2.1111 -0.013975 2.4517 0.067249 2.6111 0.22222 3.3248 0.91611 2.7361 1.463 2.7361 2.4583 2.7361 5.4722 2.7361 5.4722 2.7361 5.4722 2.7361 6.4738 3.3193 7.014 2.6111 7.7222 2.4537 7.8796 2.1111 7.9726 2.1111 7.75 solid black");
      _builder.newLine();
      _builder.append("edge transitionNode_fx_q q 4 1.9722 4.2222 1.9722 4 1.9722 3.9444 1.9722 3.7222 solid black");
      _builder.newLine();
      _builder.append("edge transitionNode_q_zx zx 4 1.9722 2.2222 1.9722 2 1.9722 1.9444 1.9722 1.7222 solid black");
      _builder.newLine();
      _builder.append("stop");
      _builder.newLine();
      final PlainGraph graph = this.parser.parse(_builder);
      Assert.assertNotNull(graph);
      EList<PlainNode> _nodes = graph.getNodes();
      int _size = _nodes.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
      EList<PlainEdge> _edges = graph.getEdges();
      int _size_1 = _edges.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      Assert.assertTrue(_greaterThan_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseNodesWithWhiteSpace() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("graph 1 1 0.5");
      _builder.newLine();
      _builder.append("node \"PositionTransmission sender\" 0.5 0.25 1 0.5 \"PositionTransmission sender\" solid rect black lightgrey");
      _builder.newLine();
      _builder.append("stop");
      _builder.newLine();
      final PlainGraph graph = this.parser.parse(_builder);
      Assert.assertNotNull(graph);
      EList<PlainNode> _nodes = graph.getNodes();
      int _size = _nodes.size();
      Assert.assertEquals(1, _size);
      EList<PlainNode> _nodes_1 = graph.getNodes();
      PlainNode _get = _nodes_1.get(0);
      String _name = ((PlainNode) _get).getName();
      Assert.assertEquals("\"PositionTransmission sender\"", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

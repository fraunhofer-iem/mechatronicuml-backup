package de.uni_paderborn.fujaba.modelica.m2t.rtsc.layout;

import de.uni_paderborn.fujaba.muml.model.gen.graphviz.layout.GraphvizWrapper;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;

public class RealtimeStatechartLayouter {
	public int layout(RealtimeStatechart rtsc) {
		ModelicaGraphDataProvider graphDataProvider = new ModelicaGraphDataProvider(rtsc);
		ModelicaAnnotator annotator = new ModelicaAnnotator();
		GraphvizWrapper<Node, Edge> graphviz = new GraphvizWrapper<Node, Edge>();
		graphviz.layout(graphDataProvider, annotator);
		return 0;
		/*ResourceSet resSet = new ResourceSetImpl();

	    // Create a resource
	    Resource resource = resSet.createResource(URI
	        .createURI("test.fujaba"));
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    resource.getContents().add(rtsc);

	    // Now save the content.
	    try {
	      resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
		return 0;*/
	}
}

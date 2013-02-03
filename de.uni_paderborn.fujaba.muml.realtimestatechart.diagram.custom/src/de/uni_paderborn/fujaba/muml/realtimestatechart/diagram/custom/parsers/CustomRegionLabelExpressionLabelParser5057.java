package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.parsers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.parsers.RegionLabelExpressionLabelParser5057;

public class CustomRegionLabelExpressionLabelParser5057 extends RegionLabelExpressionLabelParser5057 {

	@Override
	public List<EObject> getSemanticElementsBeingParsed(EObject element) {
		List<EObject> elements = new ArrayList<EObject>(super.getSemanticElementsBeingParsed(element));
		
		// react on changes of realtimestatechart
		Region region = (Region) element;
		RealtimeStatechart statechart = region.getStatechart();
		if (statechart != null) {
			elements.add(statechart);
		}
		return elements;
	}

}

package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import java.util.Comparator;

import org.eclipse.gmf.runtime.notation.SortingDirection;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateCompoundCompartmentEditPart;

public class CustomStateCompoundCompartmentEditPart extends
		StateCompoundCompartmentEditPart {

	public CustomStateCompoundCompartmentEditPart(View view) {
		super(view);
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Comparator getComparator(String name, SortingDirection direction) {
		// TODO Auto-generated method stub
		return super.getComparator(name, direction);
	}
	
	

}

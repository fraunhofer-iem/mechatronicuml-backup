package org.muml.pim.realtimestatechart.diagram.custom.edit.parts;

import java.util.Comparator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.SortingDirection;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.realtimestatechart.DoEvent;
import org.muml.pim.realtimestatechart.EntryEvent;
import org.muml.pim.realtimestatechart.ExitEvent;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateActionCompartmentEditPart;

public class CustomStateActionCompartmentEditPart extends
		StateActionCompartmentEditPart {

	public static final String DEFAULT_SORTING_KEY = "default_sorting_key";

	public CustomStateActionCompartmentEditPart(View view) {
		super(view);
	}

	@Override
	protected Comparator<Shape> getComparator(String name,
			SortingDirection direction) {
		if (DEFAULT_SORTING_KEY.equals(name)) {
			return new StateCompartmentComparator(direction);
		}
		return null;
	}

	public class StateCompartmentComparator implements Comparator<Shape> {

		private final SortingDirection direction;
		
		private final Class<?> order[] = { EntryEvent.class, DoEvent.class, ExitEvent.class };

		public StateCompartmentComparator(SortingDirection direction) {
			this.direction = direction;
		}

		@Override
		public int compare(Shape s1, Shape s2) {
			EObject o1 = s1.getElement();
			EObject o2 = s2.getElement();
			int value1 = Integer.MAX_VALUE;
			int value2 = Integer.MAX_VALUE;
			if (o1 != null) {
				value1 = getValue(o1);
			}
			if (o2 != null) {
				value2 = getValue(o2);
			}
			int result = value1 - value2;
			if (direction.getValue() == SortingDirection.DESCENDING) {
				result = -result;
			}
			return result;

		}

		private int getValue(EObject object) {
			int counter = 1;
			for (Class<?> clazz : order) {
				if (clazz.isAssignableFrom(object.getClass())) {
					return counter;
				}
				counter++;
			}
			return counter;
		}

	}

}

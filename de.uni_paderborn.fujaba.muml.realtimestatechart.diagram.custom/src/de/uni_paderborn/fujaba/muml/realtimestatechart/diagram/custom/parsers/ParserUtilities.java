package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.parsers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.expressions.Expression;

public class ParserUtilities {
	private ParserUtilities() {
		// no instantiation
	}

	@SuppressWarnings("unchecked")
	public static List<EObject> deduceAllElements(EObject semanticElement, Collection<EReference> references) {
		// deduce semantic elements
		List<EObject> elements = new ArrayList<EObject>();
		elements.add(semanticElement); // start with the parser element

		// deduce other elements
		List<EObject> foundElements;
		List<EObject> lastElements = new ArrayList<EObject>(elements);
		do {
			foundElements = new ArrayList<EObject>();
			for (EObject element : lastElements) {
				for (EReference reference : references) {
					if (reference.getEContainingClass().isSuperTypeOf(element.eClass())) {
						Object value = element.eGet(reference);
						if (value instanceof Collection) {
							foundElements.addAll((Collection<EObject>) value);
						} else if (value instanceof EObject) {
							foundElements.add((EObject) value);
						} else if (value != null) {
							throw new UnsupportedOperationException(
									"Invalid reference value");
						}
					}
				}
				// Watch complete expression hierarchy
				if (element instanceof Expression) {
					foundElements.addAll(element.eContents());
				}
			}
			elements.addAll(foundElements);
			lastElements = foundElements;
		} while (!foundElements.isEmpty());

		return elements;
	}
	
	
}

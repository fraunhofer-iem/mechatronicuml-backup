package org.muml.pim.realtimestatechart.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.expressions.Expression;
import org.muml.pim.actionlanguage.xtext.common.LanguageResource;
import org.muml.pim.valuetype.TimeValue;
import org.muml.pim.valuetype.impl.TimeValueImpl;

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
	

	public static String serializeTimeValue(TimeValue timeValue, EObject container) {
		return serializeExpression(timeValue.getValue(), container) + " "
				+ TimeValueImpl.getUnitRepresentation(timeValue.getUnit());
	}

	public static String serializeExpression(Expression expression, EObject container) {
		String text = LanguageResource.serializeEObjectSafe(expression,
				container);

		if (text != null && text.length() > 0) {
			// remove some from the beginning...
			char c = text.charAt(0);
			while (c == '{' || c == '\t' || c == ' ' || c == '\n') {
				text = text.substring(1);
				c = text.charAt(0);
			}
			return text;
		}
		return "";
	}

	
	
}

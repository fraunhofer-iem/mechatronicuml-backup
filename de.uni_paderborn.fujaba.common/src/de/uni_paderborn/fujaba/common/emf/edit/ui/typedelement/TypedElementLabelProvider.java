package de.uni_paderborn.fujaba.common.emf.edit.ui.typedelement;

import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.jface.viewers.LabelProvider;

/**
 * A text provider, which generates a text for a single TypedElement (for
 * example "p1 : EString").
 * 
 * @author bingo
 * 
 */
public class TypedElementLabelProvider extends LabelProvider {

	@Override
	public String getText(Object element) {
		ETypedElement typedElement = (ETypedElement) element;

		StringBuffer buffer = new StringBuffer();
		if (typedElement.getName() != null) {
			buffer.append(typedElement.getName());
		}

		buffer.append(" : ");

		if (typedElement.getEType() != null) {
			buffer.append(typedElement.getEType().getName());
		}

		return buffer.toString();
	}
}

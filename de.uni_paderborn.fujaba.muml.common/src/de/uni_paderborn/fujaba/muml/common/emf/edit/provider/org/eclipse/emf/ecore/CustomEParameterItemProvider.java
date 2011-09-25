package de.uni_paderborn.fujaba.muml.common.emf.edit.provider.org.eclipse.emf.ecore;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.provider.EParameterItemProvider;

public class CustomEParameterItemProvider extends EParameterItemProvider {

	public CustomEParameterItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * Overridden to add the cardinality.
	 */
	@Override
	public String getText(Object object) {
		ETypedElement eTypedElement = (ETypedElement) object;
		StringBuffer result = new StringBuffer(super.getText(object));

		if (eTypedElement.getEType() != null && eTypedElement.isMany()) {
			result.append("[");

			// Commented out the following. It was necessary for a syntax like
			// EInt[1..2], which is not desired currently.

			// result.append(getCardinalityString(eParameter.getLowerBound()));
			// if (eParameter.getLowerBound() != eParameter.getUpperBound()) {
			// result.append("..");
			// result.append(getCardinalityString(eParameter.getUpperBound()));
			// }
			
			// Instead we just display the upper bound.
			result.append(getCardinalityString(eTypedElement.getUpperBound()));
			
			result.append("]");
		}
 
		return result.toString();
	}

	private String getCardinalityString(int bound) {
		if (bound == -1) {
			return "*";
		} else {
			return Integer.toString(bound);
		}
	}
}

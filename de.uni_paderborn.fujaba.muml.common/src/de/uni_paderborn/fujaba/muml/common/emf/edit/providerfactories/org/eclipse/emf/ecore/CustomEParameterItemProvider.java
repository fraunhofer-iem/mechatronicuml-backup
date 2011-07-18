package de.uni_paderborn.fujaba.muml.common.emf.edit.providerfactories.org.eclipse.emf.ecore;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EParameter;
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
		EParameter eParameter = (EParameter) object;
		StringBuffer result = new StringBuffer(super.getText(object));
		
		if (eParameter.getEType() != null) {
			result.append("[");
			result.append(getCardinalityString(eParameter.getLowerBound()));
			if (eParameter.getLowerBound() != eParameter.getUpperBound()) {
				result.append("..");
				result.append(getCardinalityString(eParameter.getUpperBound()));
			}
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

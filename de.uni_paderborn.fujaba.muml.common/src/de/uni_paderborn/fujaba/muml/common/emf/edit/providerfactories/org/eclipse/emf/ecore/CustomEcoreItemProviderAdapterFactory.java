package de.uni_paderborn.fujaba.muml.common.emf.edit.providerfactories.org.eclipse.emf.ecore;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;

public class CustomEcoreItemProviderAdapterFactory extends
		EcoreItemProviderAdapterFactory {

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.ecore.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEAttributeAdapter() {
		if (eAttributeItemProvider == null) {
			eAttributeItemProvider = new CustomEAttributeItemProvider(this);
		}

		return eAttributeItemProvider;
	}


	/**
	 * This creates an adapter for a {@link org.eclipse.emf.ecore.EParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEParameterAdapter() {
		if (eParameterItemProvider == null) {
			eParameterItemProvider = new CustomEParameterItemProvider(this);
		}

		return eParameterItemProvider;
	}
}

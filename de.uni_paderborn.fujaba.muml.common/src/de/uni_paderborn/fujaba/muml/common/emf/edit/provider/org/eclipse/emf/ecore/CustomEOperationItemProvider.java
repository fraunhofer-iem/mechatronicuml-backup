package de.uni_paderborn.fujaba.muml.common.emf.edit.provider.org.eclipse.emf.ecore;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.provider.EOperationItemProvider;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class CustomEOperationItemProvider extends EOperationItemProvider {

	public CustomEOperationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEParametersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}
	
	
	/**
	 * This adds a property descriptor for the EParameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EOperation_eParameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EOperation_eParameters_feature", "_UI_EOperation_type"),
				 EcorePackage.Literals.EOPERATION__EPARAMETERS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}


	
}

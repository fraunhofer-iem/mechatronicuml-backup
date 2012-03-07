/**
 * Generated with Acceleo
 */
package org.eclipse.emf.ecore.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;


/**
 * 
 * 
 */
public class EcoreEEFAdapterFactory extends EcoreAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.ecore.util.EcoreAdapterFactory#createEAttributeAdapter()
	 * 
	 */
	public Adapter createEAttributeAdapter() {
		return new EAttributePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.ecore.util.EcoreAdapterFactory#createEAnnotationAdapter()
	 * 
	 */
	public Adapter createEAnnotationAdapter() {
		return new EAnnotationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.ecore.util.EcoreAdapterFactory#createEClassAdapter()
	 * 
	 */
	public Adapter createEClassAdapter() {
		return new EClassPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.ecore.util.EcoreAdapterFactory#createEDataTypeAdapter()
	 * 
	 */
	public Adapter createEDataTypeAdapter() {
		return new EDataTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.ecore.util.EcoreAdapterFactory#createEEnumAdapter()
	 * 
	 */
	public Adapter createEEnumAdapter() {
		return new EEnumPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.ecore.util.EcoreAdapterFactory#createEEnumLiteralAdapter()
	 * 
	 */
	public Adapter createEEnumLiteralAdapter() {
		return new EEnumLiteralPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.ecore.util.EcoreAdapterFactory#createEFactoryAdapter()
	 * 
	 */
	public Adapter createEFactoryAdapter() {
		return new EFactoryPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.ecore.util.EcoreAdapterFactory#createEOperationAdapter()
	 * 
	 */
	public Adapter createEOperationAdapter() {
		return new EOperationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.ecore.util.EcoreAdapterFactory#createEPackageAdapter()
	 * 
	 */
	public Adapter createEPackageAdapter() {
		return new EPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.ecore.util.EcoreAdapterFactory#createEParameterAdapter()
	 * 
	 */
	public Adapter createEParameterAdapter() {
		return new EParameterPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.ecore.util.EcoreAdapterFactory#createEReferenceAdapter()
	 * 
	 */
	public Adapter createEReferenceAdapter() {
		return new EReferencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.ecore.util.EcoreAdapterFactory#createEGenericTypeAdapter()
	 * 
	 */
	public Adapter createEGenericTypeAdapter() {
		return new EGenericTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.ecore.util.EcoreAdapterFactory#createETypeParameterAdapter()
	 * 
	 */
	public Adapter createETypeParameterAdapter() {
		return new ETypeParameterPropertiesEditionProvider();
	}

}

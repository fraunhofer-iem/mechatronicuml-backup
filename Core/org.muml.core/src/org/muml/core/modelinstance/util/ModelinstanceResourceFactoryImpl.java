/**
 */
package org.muml.core.modelinstance.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.muml.core.modelinstance.util.ModelinstanceResourceImpl
 * @generated
 */
public class ModelinstanceResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelinstanceResourceFactoryImpl() {
		super();
	}
	
	/**
	 * @generated NOT
	 */
	protected boolean useUUIDs() {
		return true;
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new ModelinstanceResourceImpl(uri);
		return result;
	}

} //ModelinstanceResourceFactoryImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.msglib;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.simulink.msglib.MsglibPackage
 * @generated
 */
public interface MsglibFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MsglibFactory eINSTANCE = org.muml.simulink.msglib.impl.MsglibFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Communication Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Switch</em>'.
	 * @generated
	 */
	CommunicationSwitch createCommunicationSwitch();

	/**
	 * Returns a new object of class '<em>Link Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Layer</em>'.
	 * @generated
	 */
	LinkLayer createLinkLayer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MsglibPackage getMsglibPackage();

} //MsglibFactory

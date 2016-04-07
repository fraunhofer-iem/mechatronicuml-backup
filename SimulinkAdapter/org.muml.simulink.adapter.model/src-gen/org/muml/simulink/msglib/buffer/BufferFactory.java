/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.msglib.buffer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.simulink.msglib.buffer.BufferPackage
 * @generated
 */
public interface BufferFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BufferFactory eINSTANCE = org.muml.simulink.msglib.buffer.impl.BufferFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Enqueue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enqueue</em>'.
	 * @generated
	 */
	Enqueue createEnqueue();

	/**
	 * Returns a new object of class '<em>Dequeue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dequeue</em>'.
	 * @generated
	 */
	Dequeue createDequeue();

	/**
	 * Returns a new object of class '<em>Check Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Queue</em>'.
	 * @generated
	 */
	CheckQueue createCheckQueue();

	/**
	 * Returns a new object of class '<em>Shared Enqueue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Enqueue</em>'.
	 * @generated
	 */
	SharedEnqueue createSharedEnqueue();

	/**
	 * Returns a new object of class '<em>Shared Dequeue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Dequeue</em>'.
	 * @generated
	 */
	SharedDequeue createSharedDequeue();

	/**
	 * Returns a new object of class '<em>Shared Check Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Check Queue</em>'.
	 * @generated
	 */
	SharedCheckQueue createSharedCheckQueue();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	BufferFunction createBufferFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BufferPackage getBufferPackage();

} //BufferFactory

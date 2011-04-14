/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.realtimeStatechart;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechartPackage
 * @generated
 */
public interface RealtimeStatechartFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RealtimeStatechartFactory eINSTANCE = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.impl.RealtimeStatechartFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realtime Statechart</em>'.
	 * @generated
	 */
	RealtimeStatechart createRealtimeStatechart();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RealtimeStatechartPackage getRealtimeStatechartPackage();

} //RealtimeStatechartFactory

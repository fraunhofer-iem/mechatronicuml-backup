/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.impl;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimeStatechartFactoryImpl extends EFactoryImpl implements RealtimeStatechartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RealtimeStatechartFactory init() {
		try {
			RealtimeStatechartFactory theRealtimeStatechartFactory = (RealtimeStatechartFactory)EPackage.Registry.INSTANCE.getEFactory("http://statechart"); 
			if (theRealtimeStatechartFactory != null) {
				return theRealtimeStatechartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RealtimeStatechartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechartFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RealtimeStatechartPackage.REALTIME_STATECHART: return createRealtimeStatechart();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart createRealtimeStatechart() {
		RealtimeStatechartImpl realtimeStatechart = new RealtimeStatechartImpl();
		return realtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechartPackage getRealtimeStatechartPackage() {
		return (RealtimeStatechartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RealtimeStatechartPackage getPackage() {
		return RealtimeStatechartPackage.eINSTANCE;
	}

} //RealtimeStatechartFactoryImpl

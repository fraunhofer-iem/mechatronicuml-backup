/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.tsdm.tsdmhelper.impl;

import de.uni_paderborn.fujaba.muml.reachanalysis.tsdm.tsdmhelper.*;

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
public class TsdmhelperFactoryImpl extends EFactoryImpl implements TsdmhelperFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TsdmhelperFactory init() {
		try {
			TsdmhelperFactory theTsdmhelperFactory = (TsdmhelperFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/reachAnalysis/tsdm/helper/0.1.0"); 
			if (theTsdmhelperFactory != null) {
				return theTsdmhelperFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TsdmhelperFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TsdmhelperFactoryImpl() {
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
			case TsdmhelperPackage.BOUND_CLOCK_INSTANCES: return createBoundClockInstances();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundClockInstances createBoundClockInstances() {
		BoundClockInstancesImpl boundClockInstances = new BoundClockInstancesImpl();
		return boundClockInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TsdmhelperPackage getTsdmhelperPackage() {
		return (TsdmhelperPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TsdmhelperPackage getPackage() {
		return TsdmhelperPackage.eINSTANCE;
	}

} //TsdmhelperFactoryImpl

/**
 */
package org.muml.reconfigurationverification.timedstorychart.transform.helper.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HelperFactoryImpl extends EFactoryImpl implements HelperFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HelperFactory init() {
		try {
			HelperFactory theHelperFactory = (HelperFactory)EPackage.Registry.INSTANCE.getEFactory(HelperPackage.eNS_URI);
			if (theHelperFactory != null) {
				return theHelperFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HelperFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperFactoryImpl() {
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
			case HelperPackage.TSC_TRANSFORMATION_INPUT: return createTSCTransformationInput();
			case HelperPackage.TSC_TRANSFORMATION_OUTPUT: return createTSCTransformationOutput();
			case HelperPackage.TRANSITION_TUPLE: return createTransitionTuple();
			case HelperPackage.PRE_TRANSFORMATION_HELPER: return createPreTransformationHelper();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSCTransformationInput createTSCTransformationInput() {
		TSCTransformationInputImpl tscTransformationInput = new TSCTransformationInputImpl();
		return tscTransformationInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSCTransformationOutput createTSCTransformationOutput() {
		TSCTransformationOutputImpl tscTransformationOutput = new TSCTransformationOutputImpl();
		return tscTransformationOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionTuple createTransitionTuple() {
		TransitionTupleImpl transitionTuple = new TransitionTupleImpl();
		return transitionTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreTransformationHelper createPreTransformationHelper() {
		PreTransformationHelperImpl preTransformationHelper = new PreTransformationHelperImpl();
		return preTransformationHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperPackage getHelperPackage() {
		return (HelperPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HelperPackage getPackage() {
		return HelperPackage.eINSTANCE;
	}

} //HelperFactoryImpl

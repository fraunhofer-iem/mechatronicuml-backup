/**
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WrapperFactoryImpl extends EFactoryImpl implements WrapperFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WrapperFactory init() {
		try {
			WrapperFactory theWrapperFactory = (WrapperFactory)EPackage.Registry.INSTANCE.getEFactory(WrapperPackage.eNS_URI);
			if (theWrapperFactory != null) {
				return theWrapperFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WrapperFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapperFactoryImpl() {
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
			case WrapperPackage.BOOL_WRAPPER: return createBoolWrapper();
			case WrapperPackage.INT_WRAPPER: return createIntWrapper();
			case WrapperPackage.LONG_WRAPPER: return createLongWrapper();
			case WrapperPackage.STRING_WRAPPER: return createStringWrapper();
			case WrapperPackage.DOUBLE_WRAPPER: return createDoubleWrapper();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolWrapper createBoolWrapper() {
		BoolWrapperImpl boolWrapper = new BoolWrapperImpl();
		return boolWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntWrapper createIntWrapper() {
		IntWrapperImpl intWrapper = new IntWrapperImpl();
		return intWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongWrapper createLongWrapper() {
		LongWrapperImpl longWrapper = new LongWrapperImpl();
		return longWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringWrapper createStringWrapper() {
		StringWrapperImpl stringWrapper = new StringWrapperImpl();
		return stringWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleWrapper createDoubleWrapper() {
		DoubleWrapperImpl doubleWrapper = new DoubleWrapperImpl();
		return doubleWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapperPackage getWrapperPackage() {
		return (WrapperPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WrapperPackage getPackage() {
		return WrapperPackage.eINSTANCE;
	}

} //WrapperFactoryImpl

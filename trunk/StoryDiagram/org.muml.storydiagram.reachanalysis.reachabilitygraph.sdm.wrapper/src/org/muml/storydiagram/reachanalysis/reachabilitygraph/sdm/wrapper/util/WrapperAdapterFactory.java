/**
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.WrapperPackage
 * @generated
 */
public class WrapperAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WrapperPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapperAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WrapperPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WrapperSwitch<Adapter> modelSwitch =
		new WrapperSwitch<Adapter>() {
			@Override
			public Adapter caseBoolWrapper(BoolWrapper object) {
				return createBoolWrapperAdapter();
			}
			@Override
			public Adapter caseIntWrapper(IntWrapper object) {
				return createIntWrapperAdapter();
			}
			@Override
			public Adapter caseLongWrapper(LongWrapper object) {
				return createLongWrapperAdapter();
			}
			@Override
			public Adapter caseStringWrapper(StringWrapper object) {
				return createStringWrapperAdapter();
			}
			@Override
			public Adapter caseDoubleWrapper(DoubleWrapper object) {
				return createDoubleWrapperAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.BoolWrapper <em>Bool Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.BoolWrapper
	 * @generated
	 */
	public Adapter createBoolWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.IntWrapper <em>Int Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.IntWrapper
	 * @generated
	 */
	public Adapter createIntWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.LongWrapper <em>Long Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.LongWrapper
	 * @generated
	 */
	public Adapter createLongWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.StringWrapper <em>String Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.StringWrapper
	 * @generated
	 */
	public Adapter createStringWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.DoubleWrapper <em>Double Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.DoubleWrapper
	 * @generated
	 */
	public Adapter createDoubleWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WrapperAdapterFactory

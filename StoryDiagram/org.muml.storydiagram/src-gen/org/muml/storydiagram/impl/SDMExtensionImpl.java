/**
 */
package org.muml.storydiagram.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.muml.storydiagram.SDMExtension;
import org.muml.storydiagram.StorydiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SDM Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SDMExtensionImpl extends MinimalEObjectImpl.Container implements SDMExtension {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SDMExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorydiagramPackage.Literals.SDM_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement getModelBase() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelBase(EModelElement modelBase) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StorydiagramPackage.SDM_EXTENSION___GET_MODEL_BASE:
				return getModelBase();
			case StorydiagramPackage.SDM_EXTENSION___SET_MODEL_BASE__EMODELELEMENT:
				setModelBase((EModelElement)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SDMExtensionImpl

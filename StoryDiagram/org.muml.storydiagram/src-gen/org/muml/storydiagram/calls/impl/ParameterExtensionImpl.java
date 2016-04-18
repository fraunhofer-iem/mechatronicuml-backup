/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.calls.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EParameter;
import org.muml.storydiagram.SDMExtension;
import org.muml.storydiagram.StorydiagramPackage;
import org.muml.storydiagram.calls.CallsPackage;
import org.muml.storydiagram.calls.ParameterExtension;
import org.muml.storydiagram.impl.VariableImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Parameter Extension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.calls.impl.ParameterExtensionImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterExtensionImpl extends VariableImpl implements
		ParameterExtension {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallsPackage.Literals.PARAMETER_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EParameter getParameter() {
		// TODO: implement this method to return the 'Parameter' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallsPackage.PARAMETER_EXTENSION__PARAMETER:
				return getParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CallsPackage.PARAMETER_EXTENSION__PARAMETER:
				return getParameter() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == SDMExtension.class) {
			switch (baseOperationID) {
				case StorydiagramPackage.SDM_EXTENSION___GET_MODEL_BASE: return CallsPackage.PARAMETER_EXTENSION___GET_MODEL_BASE;
				case StorydiagramPackage.SDM_EXTENSION___SET_MODEL_BASE__EMODELELEMENT: return CallsPackage.PARAMETER_EXTENSION___SET_MODEL_BASE__EMODELELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CallsPackage.PARAMETER_EXTENSION___GET_MODEL_BASE:
				return getModelBase();
			case CallsPackage.PARAMETER_EXTENSION___SET_MODEL_BASE__EMODELELEMENT:
				setModelBase((EModelElement)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public String getVariableName() {
		ENamedElement namedElement = getParameter();
		return namedElement == null ? null : namedElement.getName();
	}

} // ParameterExtensionImpl

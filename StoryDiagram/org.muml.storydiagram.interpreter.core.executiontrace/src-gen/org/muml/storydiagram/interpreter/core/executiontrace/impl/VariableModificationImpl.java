/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.VariableModification;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Variable Modification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableModificationImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableModificationImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.impl.VariableModificationImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VariableModificationImpl<ClassifierType> extends ExecutionImpl implements VariableModification<ClassifierType>
{
	/**
	 * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String	VARIABLE_NAME_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected String				variableName			= VARIABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected ClassifierType		classifier;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String	VALUE_EDEFAULT			= null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String				value					= VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableModificationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ExecutiontracePackage.Literals.VARIABLE_MODIFICATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVariableName()
	{
		return variableName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableName(String newVariableName)
	{
		String oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.VARIABLE_MODIFICATION__VARIABLE_NAME, oldVariableName, variableName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public ClassifierType getClassifier()
	{
		if (classifier != null && ((EObject)classifier).eIsProxy()) {
			InternalEObject oldClassifier = (InternalEObject)classifier;
			classifier = (ClassifierType)eResolveProxy(oldClassifier);
			if (classifier != oldClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutiontracePackage.VARIABLE_MODIFICATION__CLASSIFIER, oldClassifier, classifier));
			}
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierType basicGetClassifier()
	{
		return classifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassifier(ClassifierType newClassifier)
	{
		ClassifierType oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.VARIABLE_MODIFICATION__CLASSIFIER, oldClassifier, classifier));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue()
	{
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue)
	{
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutiontracePackage.VARIABLE_MODIFICATION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ExecutiontracePackage.VARIABLE_MODIFICATION__VARIABLE_NAME:
				return getVariableName();
			case ExecutiontracePackage.VARIABLE_MODIFICATION__CLASSIFIER:
				if (resolve) return getClassifier();
				return basicGetClassifier();
			case ExecutiontracePackage.VARIABLE_MODIFICATION__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case ExecutiontracePackage.VARIABLE_MODIFICATION__VARIABLE_NAME:
				setVariableName((String)newValue);
				return;
			case ExecutiontracePackage.VARIABLE_MODIFICATION__CLASSIFIER:
				setClassifier((ClassifierType)newValue);
				return;
			case ExecutiontracePackage.VARIABLE_MODIFICATION__VALUE:
				setValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case ExecutiontracePackage.VARIABLE_MODIFICATION__VARIABLE_NAME:
				setVariableName(VARIABLE_NAME_EDEFAULT);
				return;
			case ExecutiontracePackage.VARIABLE_MODIFICATION__CLASSIFIER:
				setClassifier((ClassifierType)null);
				return;
			case ExecutiontracePackage.VARIABLE_MODIFICATION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case ExecutiontracePackage.VARIABLE_MODIFICATION__VARIABLE_NAME:
				return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
			case ExecutiontracePackage.VARIABLE_MODIFICATION__CLASSIFIER:
				return classifier != null;
			case ExecutiontracePackage.VARIABLE_MODIFICATION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (variableName: ");
		result.append(variableName);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} // VariableModificationImpl

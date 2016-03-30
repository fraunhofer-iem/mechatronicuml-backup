/**
 */
package org.muml.testlanguage.specification.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.testlanguage.specification.AssertBool;
import org.muml.testlanguage.specification.NodeSpecification;
import org.muml.testlanguage.specification.PortType;
import org.muml.testlanguage.specification.SpecificationPackage;
import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Assert Bool</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.muml.testlanguage.specification.impl.AssertBoolImpl#isAssertion
 * <em>Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertBoolImpl extends NodeSpecificationImpl implements AssertBool {
	/**
	 * The default value of the '{@link #isAssertion() <em>Assertion</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isAssertion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASSERTION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAssertion() <em>Assertion</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isAssertion()
	 * @generated
	 * @ordered
	 */
	protected boolean assertion = ASSERTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssertBoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.ASSERT_BOOL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isAssertion() {
		return assertion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAssertion(boolean newAssertion) {
		boolean oldAssertion = assertion;
		assertion = newAssertion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SpecificationPackage.ASSERT_BOOL__ASSERTION, oldAssertion,
					assertion));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initialize() {
		this.setLabel("Assert Bool");
		this.addPortSpecification(PortType.IN, "bool", false,
				java.lang.Boolean.class);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void execute(final Map<String, Object> inputs,
			final Map<String, Object> outputs) throws ExecutionException,
			Exception {
		// Get the boolean value.
		boolean bool = ((Boolean) inputs.get("bool")).booleanValue();

		// Throw an exception if it does not match the assertion.
		if (bool != this.assertion) {
			throw new ExecutionException("Expected "
					+ Boolean.toString(this.assertion) + ", but got "
					+ Boolean.toString(bool));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpecificationPackage.ASSERT_BOOL__ASSERTION:
			return isAssertion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SpecificationPackage.ASSERT_BOOL__ASSERTION:
			setAssertion((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SpecificationPackage.ASSERT_BOOL__ASSERTION:
			setAssertion(ASSERTION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SpecificationPackage.ASSERT_BOOL__ASSERTION:
			return assertion != ASSERTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NodeSpecification.class) {
			switch (baseOperationID) {
			case SpecificationPackage.NODE_SPECIFICATION___INITIALIZE:
				return SpecificationPackage.ASSERT_BOOL___INITIALIZE;
			case SpecificationPackage.NODE_SPECIFICATION___EXECUTE__MAP_MAP:
				return SpecificationPackage.ASSERT_BOOL___EXECUTE__MAP_MAP;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case SpecificationPackage.ASSERT_BOOL___INITIALIZE:
			initialize();
			return null;
		case SpecificationPackage.ASSERT_BOOL___EXECUTE__MAP_MAP:
			try {
				execute((Map<String, Object>) arguments.get(0),
						(Map<String, Object>) arguments.get(1));
				return null;
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (assertion: ");
		result.append(assertion);
		result.append(')');
		return result.toString();
	}

} // AssertBoolImpl

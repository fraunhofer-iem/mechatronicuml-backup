/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.simulink.DataType;
import org.muml.simulink.PortBlock;
import org.muml.simulink.SimulinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.impl.PortBlockImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.muml.simulink.impl.PortBlockImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.muml.simulink.impl.PortBlockImpl#getInitialCondition <em>Initial Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortBlockImpl extends BlockImpl implements PortBlock {
	/**
	 * The default value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final String DIMENSIONS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected String dimensions = DIMENSIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DataType TYPE_EDEFAULT = DataType.INHERIT;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialCondition() <em>Initial Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_CONDITION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInitialCondition() <em>Initial Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCondition()
	 * @generated
	 * @ordered
	 */
	protected String initialCondition = INITIAL_CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.PORT_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(String newDimensions) {
		String oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.PORT_BLOCK__DIMENSIONS, oldDimensions, dimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataType newType) {
		DataType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.PORT_BLOCK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialCondition() {
		return initialCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialCondition(String newInitialCondition) {
		String oldInitialCondition = initialCondition;
		initialCondition = newInitialCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.PORT_BLOCK__INITIAL_CONDITION, oldInitialCondition, initialCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulinkPackage.PORT_BLOCK__DIMENSIONS:
				return getDimensions();
			case SimulinkPackage.PORT_BLOCK__TYPE:
				return getType();
			case SimulinkPackage.PORT_BLOCK__INITIAL_CONDITION:
				return getInitialCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimulinkPackage.PORT_BLOCK__DIMENSIONS:
				setDimensions((String)newValue);
				return;
			case SimulinkPackage.PORT_BLOCK__TYPE:
				setType((DataType)newValue);
				return;
			case SimulinkPackage.PORT_BLOCK__INITIAL_CONDITION:
				setInitialCondition((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimulinkPackage.PORT_BLOCK__DIMENSIONS:
				setDimensions(DIMENSIONS_EDEFAULT);
				return;
			case SimulinkPackage.PORT_BLOCK__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SimulinkPackage.PORT_BLOCK__INITIAL_CONDITION:
				setInitialCondition(INITIAL_CONDITION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimulinkPackage.PORT_BLOCK__DIMENSIONS:
				return DIMENSIONS_EDEFAULT == null ? dimensions != null : !DIMENSIONS_EDEFAULT.equals(dimensions);
			case SimulinkPackage.PORT_BLOCK__TYPE:
				return type != TYPE_EDEFAULT;
			case SimulinkPackage.PORT_BLOCK__INITIAL_CONDITION:
				return INITIAL_CONDITION_EDEFAULT == null ? initialCondition != null : !INITIAL_CONDITION_EDEFAULT.equals(initialCondition);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dimensions: ");
		result.append(dimensions);
		result.append(", type: ");
		result.append(type);
		result.append(", initialCondition: ");
		result.append(initialCondition);
		result.append(')');
		return result.toString();
	}

} //PortBlockImpl

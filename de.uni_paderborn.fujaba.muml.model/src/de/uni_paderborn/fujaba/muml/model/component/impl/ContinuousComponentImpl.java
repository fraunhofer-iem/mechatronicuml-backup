/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousComponent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuous Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ContinuousComponentImpl#getXMLFileName <em>XML File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuousComponentImpl extends ComponentImpl implements ContinuousComponent {
	/**
	 * The default value of the '{@link #getXMLFileName() <em>XML File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXMLFileName() <em>XML File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLFileName()
	 * @generated
	 * @ordered
	 */
	protected String xMLFileName = XML_FILE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.CONTINUOUS_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXMLFileName() {
		return xMLFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMLFileName(String newXMLFileName) {
		String oldXMLFileName = xMLFileName;
		xMLFileName = newXMLFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.CONTINUOUS_COMPONENT__XML_FILE_NAME, oldXMLFileName, xMLFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.CONTINUOUS_COMPONENT__XML_FILE_NAME:
				return getXMLFileName();
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
			case ComponentPackage.CONTINUOUS_COMPONENT__XML_FILE_NAME:
				setXMLFileName((String)newValue);
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
			case ComponentPackage.CONTINUOUS_COMPONENT__XML_FILE_NAME:
				setXMLFileName(XML_FILE_NAME_EDEFAULT);
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
			case ComponentPackage.CONTINUOUS_COMPONENT__XML_FILE_NAME:
				return XML_FILE_NAME_EDEFAULT == null ? xMLFileName != null : !XML_FILE_NAME_EDEFAULT.equals(xMLFileName);
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
		result.append(" (xMLFileName: ");
		result.append(xMLFileName);
		result.append(')');
		return result.toString();
	}

} //ContinuousComponentImpl

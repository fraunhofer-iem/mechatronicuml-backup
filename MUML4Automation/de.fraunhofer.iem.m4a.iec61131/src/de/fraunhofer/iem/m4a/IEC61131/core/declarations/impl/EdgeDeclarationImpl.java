/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeType;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.NamedVariableDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.NamedVariable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.EdgeDeclarationImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.EdgeDeclarationImpl#getEdgeType <em>Edge Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgeDeclarationImpl extends MinimalEObjectImpl.Container implements EdgeDeclaration {
	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected NamedVariable variableName;

	/**
	 * The default value of the '{@link #getEdgeType() <em>Edge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeType()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeType EDGE_TYPE_EDEFAULT = EdgeType.REDGE;

	/**
	 * The cached value of the '{@link #getEdgeType() <em>Edge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeType()
	 * @generated
	 * @ordered
	 */
	protected EdgeType edgeType = EDGE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.EDGE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedVariable getVariableName() {
		return variableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableName(NamedVariable newVariableName, NotificationChain msgs) {
		NamedVariable oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.EDGE_DECLARATION__VARIABLE_NAME, oldVariableName, newVariableName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(NamedVariable newVariableName) {
		if (newVariableName != variableName) {
			NotificationChain msgs = null;
			if (variableName != null)
				msgs = ((InternalEObject)variableName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.EDGE_DECLARATION__VARIABLE_NAME, null, msgs);
			if (newVariableName != null)
				msgs = ((InternalEObject)newVariableName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.EDGE_DECLARATION__VARIABLE_NAME, null, msgs);
			msgs = basicSetVariableName(newVariableName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.EDGE_DECLARATION__VARIABLE_NAME, newVariableName, newVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeType getEdgeType() {
		return edgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeType(EdgeType newEdgeType) {
		EdgeType oldEdgeType = edgeType;
		edgeType = newEdgeType == null ? EDGE_TYPE_EDEFAULT : newEdgeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.EDGE_DECLARATION__EDGE_TYPE, oldEdgeType, edgeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationsPackage.EDGE_DECLARATION__VARIABLE_NAME:
				return basicSetVariableName(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationsPackage.EDGE_DECLARATION__VARIABLE_NAME:
				return getVariableName();
			case DeclarationsPackage.EDGE_DECLARATION__EDGE_TYPE:
				return getEdgeType();
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
			case DeclarationsPackage.EDGE_DECLARATION__VARIABLE_NAME:
				setVariableName((NamedVariable)newValue);
				return;
			case DeclarationsPackage.EDGE_DECLARATION__EDGE_TYPE:
				setEdgeType((EdgeType)newValue);
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
			case DeclarationsPackage.EDGE_DECLARATION__VARIABLE_NAME:
				setVariableName((NamedVariable)null);
				return;
			case DeclarationsPackage.EDGE_DECLARATION__EDGE_TYPE:
				setEdgeType(EDGE_TYPE_EDEFAULT);
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
			case DeclarationsPackage.EDGE_DECLARATION__VARIABLE_NAME:
				return variableName != null;
			case DeclarationsPackage.EDGE_DECLARATION__EDGE_TYPE:
				return edgeType != EDGE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedVariableDeclaration.class) {
			switch (derivedFeatureID) {
				case DeclarationsPackage.EDGE_DECLARATION__VARIABLE_NAME: return DeclarationsPackage.NAMED_VARIABLE_DECLARATION__VARIABLE_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedVariableDeclaration.class) {
			switch (baseFeatureID) {
				case DeclarationsPackage.NAMED_VARIABLE_DECLARATION__VARIABLE_NAME: return DeclarationsPackage.EDGE_DECLARATION__VARIABLE_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (edgeType: ");
		result.append(edgeType);
		result.append(')');
		return result.toString();
	}

} //EdgeDeclarationImpl

/**
 */
package coordination.impl;

import coordination.CoordinationPackage;
import coordination.CoordinationSpecification;
import coordination.Role;
import coordination.RoleConnector;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link coordination.impl.CoordinationSpecificationImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link coordination.impl.CoordinationSpecificationImpl#getRoleConnectors <em>Role Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinationSpecificationImpl extends NamedElementImpl implements CoordinationSpecification {
	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getRoleConnectors() <em>Role Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleConnector> roleConnectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoordinationPackage.Literals.COORDINATION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, CoordinationPackage.COORDINATION_SPECIFICATION__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleConnector> getRoleConnectors() {
		if (roleConnectors == null) {
			roleConnectors = new EObjectContainmentEList<RoleConnector>(RoleConnector.class, this, CoordinationPackage.COORDINATION_SPECIFICATION__ROLE_CONNECTORS);
		}
		return roleConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoordinationPackage.COORDINATION_SPECIFICATION__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case CoordinationPackage.COORDINATION_SPECIFICATION__ROLE_CONNECTORS:
				return ((InternalEList<?>)getRoleConnectors()).basicRemove(otherEnd, msgs);
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
			case CoordinationPackage.COORDINATION_SPECIFICATION__ROLES:
				return getRoles();
			case CoordinationPackage.COORDINATION_SPECIFICATION__ROLE_CONNECTORS:
				return getRoleConnectors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoordinationPackage.COORDINATION_SPECIFICATION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case CoordinationPackage.COORDINATION_SPECIFICATION__ROLE_CONNECTORS:
				getRoleConnectors().clear();
				getRoleConnectors().addAll((Collection<? extends RoleConnector>)newValue);
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
			case CoordinationPackage.COORDINATION_SPECIFICATION__ROLES:
				getRoles().clear();
				return;
			case CoordinationPackage.COORDINATION_SPECIFICATION__ROLE_CONNECTORS:
				getRoleConnectors().clear();
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
			case CoordinationPackage.COORDINATION_SPECIFICATION__ROLES:
				return roles != null && !roles.isEmpty();
			case CoordinationPackage.COORDINATION_SPECIFICATION__ROLE_CONNECTORS:
				return roleConnectors != null && !roleConnectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoordinationSpecificationImpl

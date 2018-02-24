/**
 */
package component.impl;

import component.ComponentPackage;
import component.ComponentPart;
import component.StructuredComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link component.impl.StructuredComponentImpl#getComponentParts <em>Component Parts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredComponentImpl extends ComponentImpl implements StructuredComponent {
	/**
	 * The cached value of the '{@link #getComponentParts() <em>Component Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentParts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPart> componentParts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.STRUCTURED_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentPart> getComponentParts() {
		if (componentParts == null) {
			componentParts = new EObjectContainmentEList<ComponentPart>(ComponentPart.class, this, ComponentPackage.STRUCTURED_COMPONENT__COMPONENT_PARTS);
		}
		return componentParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.STRUCTURED_COMPONENT__COMPONENT_PARTS:
				return ((InternalEList<?>)getComponentParts()).basicRemove(otherEnd, msgs);
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
			case ComponentPackage.STRUCTURED_COMPONENT__COMPONENT_PARTS:
				return getComponentParts();
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
			case ComponentPackage.STRUCTURED_COMPONENT__COMPONENT_PARTS:
				getComponentParts().clear();
				getComponentParts().addAll((Collection<? extends ComponentPart>)newValue);
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
			case ComponentPackage.STRUCTURED_COMPONENT__COMPONENT_PARTS:
				getComponentParts().clear();
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
			case ComponentPackage.STRUCTURED_COMPONENT__COMPONENT_PARTS:
				return componentParts != null && !componentParts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructuredComponentImpl

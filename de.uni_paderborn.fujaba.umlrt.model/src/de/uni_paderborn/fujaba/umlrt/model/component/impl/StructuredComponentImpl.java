/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType;
import de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Structured Component</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.StructuredComponentImpl#getEmbeddedParts <em>Embedded Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.StructuredComponentImpl#getConnectors <em>Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredComponentImpl extends ComponentImpl implements
		StructuredComponent {
	/**
	 * The cached value of the '{@link #getEmbeddedParts() <em>Embedded Parts</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getEmbeddedParts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPart> embeddedParts;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorType> connectors;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.STRUCTURED_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentPart> getEmbeddedParts() {
		if (embeddedParts == null) {
			embeddedParts = new EObjectContainmentWithInverseEList<ComponentPart>(ComponentPart.class, this, ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS, ComponentPackage.COMPONENT_PART__PARENT_COMPONENT);
		}
		return embeddedParts;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentWithInverseEList<ConnectorType>(ConnectorType.class, this, ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS, ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmbeddedParts()).basicAdd(otherEnd, msgs);
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectors()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS:
				return ((InternalEList<?>)getEmbeddedParts()).basicRemove(otherEnd, msgs);
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS:
				return getEmbeddedParts();
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				return getConnectors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS:
				getEmbeddedParts().clear();
				getEmbeddedParts().addAll((Collection<? extends ComponentPart>)newValue);
				return;
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends ConnectorType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS:
				getEmbeddedParts().clear();
				return;
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				getConnectors().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS:
				return embeddedParts != null && !embeddedParts.isEmpty();
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	


} // StructuredComponentImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.component.CoordinationProtocolOccurrence;
import de.uni_paderborn.fujaba.muml.component.PortConnector;
import de.uni_paderborn.fujaba.muml.component.StructuredComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.StructuredComponentImpl#getEmbeddedComponentParts <em>Embedded Component Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.StructuredComponentImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.StructuredComponentImpl#getAllStructuredComponents <em>All Structured Components</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.StructuredComponentImpl#getAllAtomicComponents <em>All Atomic Components</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.StructuredComponentImpl#getCoordinationProtocolOccurences <em>Coordination Protocol Occurences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StructuredComponentImpl extends ComponentImpl implements StructuredComponent {
	/**
	 * The cached value of the '{@link #getEmbeddedComponentParts() <em>Embedded Component Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedComponentParts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPart> embeddedComponentParts;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<PortConnector> connectors;

	/**
	 * The cached setting delegate for the '{@link #getAllStructuredComponents() <em>All Structured Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllStructuredComponents()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_STRUCTURED_COMPONENTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAllAtomicComponents() <em>All Atomic Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAtomicComponents()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_ATOMIC_COMPONENTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getCoordinationProtocolOccurences() <em>Coordination Protocol Occurences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationProtocolOccurences()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinationProtocolOccurrence> coordinationProtocolOccurences;

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
	public EList<ComponentPart> getEmbeddedComponentParts() {
		if (embeddedComponentParts == null) {
			embeddedComponentParts = new EObjectContainmentWithInverseEList<ComponentPart>(ComponentPart.class, this, ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_COMPONENT_PARTS, ComponentPackage.COMPONENT_PART__PARENT_COMPONENT);
		}
		return embeddedComponentParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortConnector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentWithInverseEList<PortConnector>(PortConnector.class, this, ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS, ComponentPackage.PORT_CONNECTOR__PARENT_COMPONENT);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StructuredComponent> getAllStructuredComponents() {
		return (EList<StructuredComponent>)ALL_STRUCTURED_COMPONENTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllStructuredComponents() {
		return ALL_STRUCTURED_COMPONENTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AtomicComponent> getAllAtomicComponents() {
		return (EList<AtomicComponent>)ALL_ATOMIC_COMPONENTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllAtomicComponents() {
		return ALL_ATOMIC_COMPONENTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CoordinationProtocolOccurrence> getCoordinationProtocolOccurences() {
		if (coordinationProtocolOccurences == null) {
			coordinationProtocolOccurences = new EObjectContainmentEList<CoordinationProtocolOccurrence>(CoordinationProtocolOccurrence.class, this, ComponentPackage.STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_OCCURENCES);
		}
		return coordinationProtocolOccurences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_COMPONENT_PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmbeddedComponentParts()).basicAdd(otherEnd, msgs);
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectors()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_COMPONENT_PARTS:
				return ((InternalEList<?>)getEmbeddedComponentParts()).basicRemove(otherEnd, msgs);
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case ComponentPackage.STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS:
				return ((InternalEList<?>)getAllStructuredComponents()).basicRemove(otherEnd, msgs);
			case ComponentPackage.STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS:
				return ((InternalEList<?>)getAllAtomicComponents()).basicRemove(otherEnd, msgs);
			case ComponentPackage.STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_OCCURENCES:
				return ((InternalEList<?>)getCoordinationProtocolOccurences()).basicRemove(otherEnd, msgs);
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
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_COMPONENT_PARTS:
				return getEmbeddedComponentParts();
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				return getConnectors();
			case ComponentPackage.STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS:
				return getAllStructuredComponents();
			case ComponentPackage.STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS:
				return getAllAtomicComponents();
			case ComponentPackage.STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_OCCURENCES:
				return getCoordinationProtocolOccurences();
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
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_COMPONENT_PARTS:
				getEmbeddedComponentParts().clear();
				getEmbeddedComponentParts().addAll((Collection<? extends ComponentPart>)newValue);
				return;
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends PortConnector>)newValue);
				return;
			case ComponentPackage.STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_OCCURENCES:
				getCoordinationProtocolOccurences().clear();
				getCoordinationProtocolOccurences().addAll((Collection<? extends CoordinationProtocolOccurrence>)newValue);
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
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_COMPONENT_PARTS:
				getEmbeddedComponentParts().clear();
				return;
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				getConnectors().clear();
				return;
			case ComponentPackage.STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_OCCURENCES:
				getCoordinationProtocolOccurences().clear();
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
			case ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_COMPONENT_PARTS:
				return embeddedComponentParts != null && !embeddedComponentParts.isEmpty();
			case ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case ComponentPackage.STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS:
				return isSetAllStructuredComponents();
			case ComponentPackage.STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS:
				return isSetAllAtomicComponents();
			case ComponentPackage.STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_OCCURENCES:
				return coordinationProtocolOccurences != null && !coordinationProtocolOccurences.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ComponentPackage.STRUCTURED_COMPONENT___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "Structured_Component_" + getName();
	}

} //StructuredComponentImpl

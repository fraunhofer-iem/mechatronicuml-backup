/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.StructuredComponentDiagram;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.StructuredcomponenteditorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Component Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.impl.StructuredComponentDiagramImpl#getStructuredComponent <em>Structured Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredComponentDiagramImpl extends EObjectImpl implements StructuredComponentDiagram {
	/**
	 * The cached value of the '{@link #getStructuredComponent() <em>Structured Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredComponent()
	 * @generated
	 * @ordered
	 */
	protected StructuredComponent structuredComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredComponentDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredcomponenteditorPackage.Literals.STRUCTURED_COMPONENT_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredComponent getStructuredComponent() {
		return structuredComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredComponent(StructuredComponent newStructuredComponent, NotificationChain msgs) {
		StructuredComponent oldStructuredComponent = structuredComponent;
		structuredComponent = newStructuredComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredcomponenteditorPackage.STRUCTURED_COMPONENT_DIAGRAM__STRUCTURED_COMPONENT, oldStructuredComponent, newStructuredComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredComponent(StructuredComponent newStructuredComponent) {
		if (newStructuredComponent != structuredComponent) {
			NotificationChain msgs = null;
			if (structuredComponent != null)
				msgs = ((InternalEObject)structuredComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuredcomponenteditorPackage.STRUCTURED_COMPONENT_DIAGRAM__STRUCTURED_COMPONENT, null, msgs);
			if (newStructuredComponent != null)
				msgs = ((InternalEObject)newStructuredComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuredcomponenteditorPackage.STRUCTURED_COMPONENT_DIAGRAM__STRUCTURED_COMPONENT, null, msgs);
			msgs = basicSetStructuredComponent(newStructuredComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredcomponenteditorPackage.STRUCTURED_COMPONENT_DIAGRAM__STRUCTURED_COMPONENT, newStructuredComponent, newStructuredComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredcomponenteditorPackage.STRUCTURED_COMPONENT_DIAGRAM__STRUCTURED_COMPONENT:
				return basicSetStructuredComponent(null, msgs);
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
			case StructuredcomponenteditorPackage.STRUCTURED_COMPONENT_DIAGRAM__STRUCTURED_COMPONENT:
				return getStructuredComponent();
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
			case StructuredcomponenteditorPackage.STRUCTURED_COMPONENT_DIAGRAM__STRUCTURED_COMPONENT:
				setStructuredComponent((StructuredComponent)newValue);
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
			case StructuredcomponenteditorPackage.STRUCTURED_COMPONENT_DIAGRAM__STRUCTURED_COMPONENT:
				setStructuredComponent((StructuredComponent)null);
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
			case StructuredcomponenteditorPackage.STRUCTURED_COMPONENT_DIAGRAM__STRUCTURED_COMPONENT:
				return structuredComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //StructuredComponentDiagramImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.mumlcore.expressions.impl.ExpressionImpl;
import org.muml.pim.actionlanguage.ActionlanguagePackage;
import org.muml.pim.actionlanguage.ElementAccessorExpression;
import org.muml.pim.actionlanguage.TypedNamedElementExpression;
import org.muml.pim.behavior.TypedNamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Named Element Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.impl.TypedNamedElementExpressionImpl#getTypedNamedElement <em>Typed Named Element</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.impl.TypedNamedElementExpressionImpl#getElementAccessors <em>Element Accessors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypedNamedElementExpressionImpl extends ExpressionImpl implements TypedNamedElementExpression {
	/**
	 * The cached value of the '{@link #getTypedNamedElement() <em>Typed Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedNamedElement()
	 * @generated
	 * @ordered
	 */
	protected TypedNamedElement typedNamedElement;

	/**
	 * The cached value of the '{@link #getElementAccessors() <em>Element Accessors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementAccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementAccessorExpression> elementAccessors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedNamedElementExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionlanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedNamedElement getTypedNamedElement() {
		if (typedNamedElement != null && typedNamedElement.eIsProxy()) {
			InternalEObject oldTypedNamedElement = (InternalEObject)typedNamedElement;
			typedNamedElement = (TypedNamedElement)eResolveProxy(oldTypedNamedElement);
			if (typedNamedElement != oldTypedNamedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionlanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT, oldTypedNamedElement, typedNamedElement));
			}
		}
		return typedNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedNamedElement basicGetTypedNamedElement() {
		return typedNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedNamedElement(TypedNamedElement newTypedNamedElement) {
		TypedNamedElement oldTypedNamedElement = typedNamedElement;
		typedNamedElement = newTypedNamedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT, oldTypedNamedElement, typedNamedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementAccessorExpression> getElementAccessors() {
		if (elementAccessors == null) {
			elementAccessors = new EObjectContainmentEList<ElementAccessorExpression>(ElementAccessorExpression.class, this, ActionlanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__ELEMENT_ACCESSORS);
		}
		return elementAccessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionlanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__ELEMENT_ACCESSORS:
				return ((InternalEList<?>)getElementAccessors()).basicRemove(otherEnd, msgs);
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
			case ActionlanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT:
				if (resolve) return getTypedNamedElement();
				return basicGetTypedNamedElement();
			case ActionlanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__ELEMENT_ACCESSORS:
				return getElementAccessors();
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
			case ActionlanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT:
				setTypedNamedElement((TypedNamedElement)newValue);
				return;
			case ActionlanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__ELEMENT_ACCESSORS:
				getElementAccessors().clear();
				getElementAccessors().addAll((Collection<? extends ElementAccessorExpression>)newValue);
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
			case ActionlanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT:
				setTypedNamedElement((TypedNamedElement)null);
				return;
			case ActionlanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__ELEMENT_ACCESSORS:
				getElementAccessors().clear();
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
			case ActionlanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT:
				return typedNamedElement != null;
			case ActionlanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__ELEMENT_ACCESSORS:
				return elementAccessors != null && !elementAccessors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypedNamedElementExpressionImpl

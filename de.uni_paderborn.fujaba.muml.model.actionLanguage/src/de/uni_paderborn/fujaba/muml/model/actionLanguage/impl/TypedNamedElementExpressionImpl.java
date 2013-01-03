/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.expressions.impl.ExpressionImpl;

import de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.TypedNamedElementExpression;
import de.uni_paderborn.fujaba.muml.model.behavior.TypedNamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Named Element Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.TypedNamedElementExpressionImpl#getTypedNamedElement <em>Typed Named Element</em>}</li>
 * </ul>
 * </p>
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
		return ActionLanguagePackage.Literals.TYPED_NAMED_ELEMENT_EXPRESSION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT, oldTypedNamedElement, typedNamedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT, oldTypedNamedElement, typedNamedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT:
				if (resolve) return getTypedNamedElement();
				return basicGetTypedNamedElement();
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
			case ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT:
				setTypedNamedElement((TypedNamedElement)newValue);
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
			case ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT:
				setTypedNamedElement((TypedNamedElement)null);
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
			case ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT:
				return typedNamedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //TypedNamedElementExpressionImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.expressions.Expression;
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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.TypedNamedElementExpressionImpl#getIndices <em>Indices</em>}</li>
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
	 * The cached value of the '{@link #getIndices() <em>Indices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndices()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> indices;

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
	public EList<Expression> getIndices() {
		if (indices == null) {
			indices = new EObjectContainmentEList<Expression>(Expression.class, this, ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES);
		}
		return indices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES:
				return ((InternalEList<?>)getIndices()).basicRemove(otherEnd, msgs);
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
			case ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT:
				if (resolve) return getTypedNamedElement();
				return basicGetTypedNamedElement();
			case ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES:
				return getIndices();
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
			case ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT:
				setTypedNamedElement((TypedNamedElement)newValue);
				return;
			case ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES:
				getIndices().clear();
				getIndices().addAll((Collection<? extends Expression>)newValue);
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
			case ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES:
				getIndices().clear();
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
			case ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION__INDICES:
				return indices != null && !indices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypedNamedElementExpressionImpl

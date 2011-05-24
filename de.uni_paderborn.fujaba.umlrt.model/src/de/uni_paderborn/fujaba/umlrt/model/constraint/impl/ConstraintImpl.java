/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.constraint.impl;

import de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint;
import de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.umlrt.model.constraint.Correctness;

import de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintImpl#getCorrectness <em>Correctness</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintImpl#isBackground <em>Background</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintImpl#isInternalConstraint <em>Internal Constraint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintImpl#isExtendAutomatically <em>Extend Automatically</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.ConstraintImpl#getConstrainableElement <em>Constrainable Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintImpl extends EObjectImpl implements Constraint {
	/**
	 * The default value of the '{@link #getCorrectness() <em>Correctness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectness()
	 * @generated
	 * @ordered
	 */
	protected static final Correctness CORRECTNESS_EDEFAULT = Correctness.UNKNOWN;

	/**
	 * The cached value of the '{@link #getCorrectness() <em>Correctness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectness()
	 * @generated
	 * @ordered
	 */
	protected Correctness correctness = CORRECTNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBackground()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BACKGROUND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBackground()
	 * @generated
	 * @ordered
	 */
	protected boolean background = BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #isInternalConstraint() <em>Internal Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInternalConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERNAL_CONSTRAINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInternalConstraint() <em>Internal Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInternalConstraint()
	 * @generated
	 * @ordered
	 */
	protected boolean internalConstraint = INTERNAL_CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #isExtendAutomatically() <em>Extend Automatically</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtendAutomatically()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTEND_AUTOMATICALLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExtendAutomatically() <em>Extend Automatically</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtendAutomatically()
	 * @generated
	 * @ordered
	 */
	protected boolean extendAutomatically = EXTEND_AUTOMATICALLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstrainableElement() <em>Constrainable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainableElement()
	 * @generated
	 * @ordered
	 */
	protected ConstrainableElement constrainableElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correctness getCorrectness() {
		return correctness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrectness(Correctness newCorrectness) {
		Correctness oldCorrectness = correctness;
		correctness = newCorrectness == null ? CORRECTNESS_EDEFAULT : newCorrectness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.CONSTRAINT__CORRECTNESS, oldCorrectness, correctness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(boolean newBackground) {
		boolean oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.CONSTRAINT__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInternalConstraint() {
		return internalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalConstraint(boolean newInternalConstraint) {
		boolean oldInternalConstraint = internalConstraint;
		internalConstraint = newInternalConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.CONSTRAINT__INTERNAL_CONSTRAINT, oldInternalConstraint, internalConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExtendAutomatically() {
		return extendAutomatically;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendAutomatically(boolean newExtendAutomatically) {
		boolean oldExtendAutomatically = extendAutomatically;
		extendAutomatically = newExtendAutomatically;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.CONSTRAINT__EXTEND_AUTOMATICALLY, oldExtendAutomatically, extendAutomatically));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainableElement getConstrainableElement() {
		if (constrainableElement != null && constrainableElement.eIsProxy()) {
			InternalEObject oldConstrainableElement = (InternalEObject)constrainableElement;
			constrainableElement = (ConstrainableElement)eResolveProxy(oldConstrainableElement);
			if (constrainableElement != oldConstrainableElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT, oldConstrainableElement, constrainableElement));
			}
		}
		return constrainableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainableElement basicGetConstrainableElement() {
		return constrainableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstrainableElement(ConstrainableElement newConstrainableElement, NotificationChain msgs) {
		ConstrainableElement oldConstrainableElement = constrainableElement;
		constrainableElement = newConstrainableElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT, oldConstrainableElement, newConstrainableElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainableElement(ConstrainableElement newConstrainableElement) {
		if (newConstrainableElement != constrainableElement) {
			NotificationChain msgs = null;
			if (constrainableElement != null)
				msgs = ((InternalEObject)constrainableElement).eInverseRemove(this, CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT, ConstrainableElement.class, msgs);
			if (newConstrainableElement != null)
				msgs = ((InternalEObject)newConstrainableElement).eInverseAdd(this, CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT, ConstrainableElement.class, msgs);
			msgs = basicSetConstrainableElement(newConstrainableElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT, newConstrainableElement, newConstrainableElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextAsComment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCorrect() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorrectnessAsString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT:
				if (constrainableElement != null)
					msgs = ((InternalEObject)constrainableElement).eInverseRemove(this, CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT, ConstrainableElement.class, msgs);
				return basicSetConstrainableElement((ConstrainableElement)otherEnd, msgs);
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
			case ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT:
				return basicSetConstrainableElement(null, msgs);
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
			case ConstraintPackage.CONSTRAINT__CORRECTNESS:
				return getCorrectness();
			case ConstraintPackage.CONSTRAINT__BACKGROUND:
				return isBackground();
			case ConstraintPackage.CONSTRAINT__INTERNAL_CONSTRAINT:
				return isInternalConstraint();
			case ConstraintPackage.CONSTRAINT__EXTEND_AUTOMATICALLY:
				return isExtendAutomatically();
			case ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT:
				if (resolve) return getConstrainableElement();
				return basicGetConstrainableElement();
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
			case ConstraintPackage.CONSTRAINT__CORRECTNESS:
				setCorrectness((Correctness)newValue);
				return;
			case ConstraintPackage.CONSTRAINT__BACKGROUND:
				setBackground((Boolean)newValue);
				return;
			case ConstraintPackage.CONSTRAINT__INTERNAL_CONSTRAINT:
				setInternalConstraint((Boolean)newValue);
				return;
			case ConstraintPackage.CONSTRAINT__EXTEND_AUTOMATICALLY:
				setExtendAutomatically((Boolean)newValue);
				return;
			case ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT:
				setConstrainableElement((ConstrainableElement)newValue);
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
			case ConstraintPackage.CONSTRAINT__CORRECTNESS:
				setCorrectness(CORRECTNESS_EDEFAULT);
				return;
			case ConstraintPackage.CONSTRAINT__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case ConstraintPackage.CONSTRAINT__INTERNAL_CONSTRAINT:
				setInternalConstraint(INTERNAL_CONSTRAINT_EDEFAULT);
				return;
			case ConstraintPackage.CONSTRAINT__EXTEND_AUTOMATICALLY:
				setExtendAutomatically(EXTEND_AUTOMATICALLY_EDEFAULT);
				return;
			case ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT:
				setConstrainableElement((ConstrainableElement)null);
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
			case ConstraintPackage.CONSTRAINT__CORRECTNESS:
				return correctness != CORRECTNESS_EDEFAULT;
			case ConstraintPackage.CONSTRAINT__BACKGROUND:
				return background != BACKGROUND_EDEFAULT;
			case ConstraintPackage.CONSTRAINT__INTERNAL_CONSTRAINT:
				return internalConstraint != INTERNAL_CONSTRAINT_EDEFAULT;
			case ConstraintPackage.CONSTRAINT__EXTEND_AUTOMATICALLY:
				return extendAutomatically != EXTEND_AUTOMATICALLY_EDEFAULT;
			case ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT:
				return constrainableElement != null;
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
			case ConstraintPackage.CONSTRAINT___GET_TEXT_AS_COMMENT:
				return getTextAsComment();
			case ConstraintPackage.CONSTRAINT___IS_CORRECT:
				return isCorrect();
			case ConstraintPackage.CONSTRAINT___GET_CORRECTNESS_AS_STRING:
				return getCorrectnessAsString();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (correctness: ");
		result.append(correctness);
		result.append(", background: ");
		result.append(background);
		result.append(", internalConstraint: ");
		result.append(internalConstraint);
		result.append(", extendAutomatically: ");
		result.append(extendAutomatically);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl

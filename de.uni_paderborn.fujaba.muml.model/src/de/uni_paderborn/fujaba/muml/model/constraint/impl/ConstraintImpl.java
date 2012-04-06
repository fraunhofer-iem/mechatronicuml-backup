/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.constraint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.core.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.model.constraint.Constraint;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.model.constraint.Correctness;
import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintImpl#getCorrectness <em>Correctness</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintImpl#isBackground <em>Background</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintImpl#getConstrainableElement <em>Constrainable Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintImpl extends ExtendableElementImpl implements Constraint {
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
	public ConstrainableElement getConstrainableElement() {
		if (eContainerFeatureID() != ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT) return null;
		return (ConstrainableElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstrainableElement(ConstrainableElement newConstrainableElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConstrainableElement, ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainableElement(ConstrainableElement newConstrainableElement) {
		if (newConstrainableElement != eInternalContainer() || (eContainerFeatureID() != ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT && newConstrainableElement != null)) {
			if (EcoreUtil.isAncestor(this, newConstrainableElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT:
				return eInternalContainer().eInverseRemove(this, CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT, ConstrainableElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT:
				return getConstrainableElement();
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
			case ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT:
				return getConstrainableElement() != null;
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl

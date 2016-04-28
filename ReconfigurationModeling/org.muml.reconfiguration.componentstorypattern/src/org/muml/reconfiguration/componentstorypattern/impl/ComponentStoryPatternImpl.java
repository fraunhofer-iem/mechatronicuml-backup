/**
 */
package org.muml.reconfiguration.componentstorypattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.mumlcore.CommentableElement;
import org.muml.mumlcore.CorePackage;
import org.muml.mumlcore.impl.NamedElementImpl;
import org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern;
import org.muml.reconfiguration.componentstorypattern.ComponentVariable;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Story Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.ComponentStoryPatternImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.ComponentStoryPatternImpl#getThisVariable <em>This Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentStoryPatternImpl extends NamedElementImpl implements ComponentStoryPattern {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = "\"no comment provided\"";

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThisVariable() <em>This Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThisVariable()
	 * @generated
	 * @ordered
	 */
	protected ComponentVariable thisVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentStoryPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentVariable getThisVariable() {
		return thisVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThisVariable(ComponentVariable newThisVariable, NotificationChain msgs) {
		ComponentVariable oldThisVariable = thisVariable;
		thisVariable = newThisVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__THIS_VARIABLE, oldThisVariable, newThisVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThisVariable(ComponentVariable newThisVariable) {
		if (newThisVariable != thisVariable) {
			NotificationChain msgs = null;
			if (thisVariable != null)
				msgs = ((InternalEObject)thisVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__THIS_VARIABLE, null, msgs);
			if (newThisVariable != null)
				msgs = ((InternalEObject)newThisVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__THIS_VARIABLE, null, msgs);
			msgs = basicSetThisVariable(newThisVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__THIS_VARIABLE, newThisVariable, newThisVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__THIS_VARIABLE:
				return basicSetThisVariable(null, msgs);
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
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__COMMENT:
				return getComment();
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__THIS_VARIABLE:
				return getThisVariable();
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
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__COMMENT:
				setComment((String)newValue);
				return;
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__THIS_VARIABLE:
				setThisVariable((ComponentVariable)newValue);
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
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__THIS_VARIABLE:
				setThisVariable((ComponentVariable)null);
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
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__THIS_VARIABLE:
				return thisVariable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return ComponentstorypatternPackage.COMPONENT_STORY_PATTERN__COMMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //ComponentStoryPatternImpl

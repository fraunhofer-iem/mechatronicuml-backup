/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.FadingFunction;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fading Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl.FadingFunctionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl.FadingFunctionImpl#getFromPort <em>From Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl.FadingFunctionImpl#getToPort <em>To Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FadingFunctionImpl extends NamedElementImpl implements FadingFunction {
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
	 * The cached value of the '{@link #getFromPort() <em>From Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPort()
	 * @generated
	 * @ordered
	 */
	protected PortVariable fromPort;

	/**
	 * The cached value of the '{@link #getToPort() <em>To Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPort()
	 * @generated
	 * @ordered
	 */
	protected PortVariable toPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FadingFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.FADING_FUNCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.FADING_FUNCTION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortVariable getFromPort() {
		if (fromPort != null && fromPort.eIsProxy()) {
			InternalEObject oldFromPort = (InternalEObject)fromPort;
			fromPort = (PortVariable)eResolveProxy(oldFromPort);
			if (fromPort != oldFromPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorypatternPackage.FADING_FUNCTION__FROM_PORT, oldFromPort, fromPort));
			}
		}
		return fromPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortVariable basicGetFromPort() {
		return fromPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromPort(PortVariable newFromPort) {
		PortVariable oldFromPort = fromPort;
		fromPort = newFromPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.FADING_FUNCTION__FROM_PORT, oldFromPort, fromPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortVariable getToPort() {
		if (toPort != null && toPort.eIsProxy()) {
			InternalEObject oldToPort = (InternalEObject)toPort;
			toPort = (PortVariable)eResolveProxy(oldToPort);
			if (toPort != oldToPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorypatternPackage.FADING_FUNCTION__TO_PORT, oldToPort, toPort));
			}
		}
		return toPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortVariable basicGetToPort() {
		return toPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToPort(PortVariable newToPort) {
		PortVariable oldToPort = toPort;
		toPort = newToPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.FADING_FUNCTION__TO_PORT, oldToPort, toPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentstorypatternPackage.FADING_FUNCTION__COMMENT:
				return getComment();
			case ComponentstorypatternPackage.FADING_FUNCTION__FROM_PORT:
				if (resolve) return getFromPort();
				return basicGetFromPort();
			case ComponentstorypatternPackage.FADING_FUNCTION__TO_PORT:
				if (resolve) return getToPort();
				return basicGetToPort();
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
			case ComponentstorypatternPackage.FADING_FUNCTION__COMMENT:
				setComment((String)newValue);
				return;
			case ComponentstorypatternPackage.FADING_FUNCTION__FROM_PORT:
				setFromPort((PortVariable)newValue);
				return;
			case ComponentstorypatternPackage.FADING_FUNCTION__TO_PORT:
				setToPort((PortVariable)newValue);
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
			case ComponentstorypatternPackage.FADING_FUNCTION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ComponentstorypatternPackage.FADING_FUNCTION__FROM_PORT:
				setFromPort((PortVariable)null);
				return;
			case ComponentstorypatternPackage.FADING_FUNCTION__TO_PORT:
				setToPort((PortVariable)null);
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
			case ComponentstorypatternPackage.FADING_FUNCTION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ComponentstorypatternPackage.FADING_FUNCTION__FROM_PORT:
				return fromPort != null;
			case ComponentstorypatternPackage.FADING_FUNCTION__TO_PORT:
				return toPort != null;
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
				case ComponentstorypatternPackage.FADING_FUNCTION__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return ComponentstorypatternPackage.FADING_FUNCTION__COMMENT;
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

} //FadingFunctionImpl

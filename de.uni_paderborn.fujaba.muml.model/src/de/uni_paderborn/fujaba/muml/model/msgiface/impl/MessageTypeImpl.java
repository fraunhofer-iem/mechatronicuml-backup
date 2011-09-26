/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.msgiface.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.calls.Callable;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.msgiface.impl.MessageTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.msgiface.impl.MessageTypeImpl#getInParameters <em>In Parameter</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.msgiface.impl.MessageTypeImpl#getOutParameters <em>Out Parameter</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.msgiface.impl.MessageTypeImpl#getContainedParameters <em>Contained Parameters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.msgiface.impl.MessageTypeImpl#getTest <em>Test</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.msgiface.impl.MessageTypeImpl#getMessageInterface <em>Message Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageTypeImpl extends NamedElementImpl implements MessageType {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

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
	 * The cached value of the '{@link #getInParameters() <em>In Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> inParameters;

	/**
	 * The cached value of the '{@link #getOutParameters() <em>Out Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> outParameters;

	/**
	 * The cached value of the '{@link #getContainedParameters() <em>Contained Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> containedParameters;

	/**
	 * The default value of the '{@link #getTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected String test = TEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsgifacePackage.Literals.MESSAGE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MsgifacePackage.MESSAGE_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EParameter> getInParameters() {
		if (inParameters == null) {
			inParameters = new EObjectResolvingEList<EParameter>(EParameter.class, this, MsgifacePackage.MESSAGE_TYPE__IN_PARAMETER);
		}
		return inParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EParameter> getOutParameters() {
		if (outParameters == null) {
			outParameters = new EObjectResolvingEList<EParameter>(EParameter.class, this, MsgifacePackage.MESSAGE_TYPE__OUT_PARAMETER);
		}
		return outParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EParameter> getContainedParameters() {
		if (containedParameters == null) {
			containedParameters = new EObjectContainmentEList.Resolving<EParameter>(EParameter.class, this, MsgifacePackage.MESSAGE_TYPE__CONTAINED_PARAMETERS);
		}
		return containedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTest() {
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest(String newTest) {
		String oldTest = test;
		test = newTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgifacePackage.MESSAGE_TYPE__TEST, oldTest, test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getMessageInterface() {
		if (eContainerFeatureID() != MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE) return null;
		return (MessageInterface)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageInterface(MessageInterface newMessageInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMessageInterface, MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageInterface(MessageInterface newMessageInterface) {
		if (newMessageInterface != eInternalContainer() || (eContainerFeatureID() != MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE && newMessageInterface != null)) {
			if (EcoreUtil.isAncestor(this, newMessageInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMessageInterface != null)
				msgs = ((InternalEObject)newMessageInterface).eInverseAdd(this, MsgifacePackage.MESSAGE_INTERFACE__MESSAGE_TYPES, MessageInterface.class, msgs);
			msgs = basicSetMessageInterface(newMessageInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE, newMessageInterface, newMessageInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMessageInterface((MessageInterface)otherEnd, msgs);
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
			case MsgifacePackage.MESSAGE_TYPE__CONTAINED_PARAMETERS:
				return ((InternalEList<?>)getContainedParameters()).basicRemove(otherEnd, msgs);
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE:
				return basicSetMessageInterface(null, msgs);
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
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE:
				return eInternalContainer().eInverseRemove(this, MsgifacePackage.MESSAGE_INTERFACE__MESSAGE_TYPES, MessageInterface.class, msgs);
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
			case MsgifacePackage.MESSAGE_TYPE__COMMENT:
				return getComment();
			case MsgifacePackage.MESSAGE_TYPE__IN_PARAMETER:
				return getInParameters();
			case MsgifacePackage.MESSAGE_TYPE__OUT_PARAMETER:
				return getOutParameters();
			case MsgifacePackage.MESSAGE_TYPE__CONTAINED_PARAMETERS:
				return getContainedParameters();
			case MsgifacePackage.MESSAGE_TYPE__TEST:
				return getTest();
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE:
				return getMessageInterface();
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
			case MsgifacePackage.MESSAGE_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case MsgifacePackage.MESSAGE_TYPE__IN_PARAMETER:
				getInParameters().clear();
				getInParameters().addAll((Collection<? extends EParameter>)newValue);
				return;
			case MsgifacePackage.MESSAGE_TYPE__OUT_PARAMETER:
				getOutParameters().clear();
				getOutParameters().addAll((Collection<? extends EParameter>)newValue);
				return;
			case MsgifacePackage.MESSAGE_TYPE__CONTAINED_PARAMETERS:
				getContainedParameters().clear();
				getContainedParameters().addAll((Collection<? extends EParameter>)newValue);
				return;
			case MsgifacePackage.MESSAGE_TYPE__TEST:
				setTest((String)newValue);
				return;
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE:
				setMessageInterface((MessageInterface)newValue);
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
			case MsgifacePackage.MESSAGE_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case MsgifacePackage.MESSAGE_TYPE__IN_PARAMETER:
				getInParameters().clear();
				return;
			case MsgifacePackage.MESSAGE_TYPE__OUT_PARAMETER:
				getOutParameters().clear();
				return;
			case MsgifacePackage.MESSAGE_TYPE__CONTAINED_PARAMETERS:
				getContainedParameters().clear();
				return;
			case MsgifacePackage.MESSAGE_TYPE__TEST:
				setTest(TEST_EDEFAULT);
				return;
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE:
				setMessageInterface((MessageInterface)null);
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
			case MsgifacePackage.MESSAGE_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case MsgifacePackage.MESSAGE_TYPE__IN_PARAMETER:
				return inParameters != null && !inParameters.isEmpty();
			case MsgifacePackage.MESSAGE_TYPE__OUT_PARAMETER:
				return outParameters != null && !outParameters.isEmpty();
			case MsgifacePackage.MESSAGE_TYPE__CONTAINED_PARAMETERS:
				return containedParameters != null && !containedParameters.isEmpty();
			case MsgifacePackage.MESSAGE_TYPE__TEST:
				return TEST_EDEFAULT == null ? test != null : !TEST_EDEFAULT.equals(test);
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE:
				return getMessageInterface() != null;
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
				case MsgifacePackage.MESSAGE_TYPE__COMMENT: return SDMPackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Callable.class) {
			switch (derivedFeatureID) {
				case MsgifacePackage.MESSAGE_TYPE__IN_PARAMETER: return CallsPackage.CALLABLE__IN_PARAMETER;
				case MsgifacePackage.MESSAGE_TYPE__OUT_PARAMETER: return CallsPackage.CALLABLE__OUT_PARAMETER;
				case MsgifacePackage.MESSAGE_TYPE__CONTAINED_PARAMETERS: return CallsPackage.CALLABLE__CONTAINED_PARAMETERS;
				case MsgifacePackage.MESSAGE_TYPE__TEST: return CallsPackage.CALLABLE__TEST;
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
				case SDMPackage.COMMENTABLE_ELEMENT__COMMENT: return MsgifacePackage.MESSAGE_TYPE__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Callable.class) {
			switch (baseFeatureID) {
				case CallsPackage.CALLABLE__IN_PARAMETER: return MsgifacePackage.MESSAGE_TYPE__IN_PARAMETER;
				case CallsPackage.CALLABLE__OUT_PARAMETER: return MsgifacePackage.MESSAGE_TYPE__OUT_PARAMETER;
				case CallsPackage.CALLABLE__CONTAINED_PARAMETERS: return MsgifacePackage.MESSAGE_TYPE__CONTAINED_PARAMETERS;
				case CallsPackage.CALLABLE__TEST: return MsgifacePackage.MESSAGE_TYPE__TEST;
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
		result.append(", test: ");
		result.append(test);
		result.append(')');
		return result.toString();
	}

} //MessageTypeImpl

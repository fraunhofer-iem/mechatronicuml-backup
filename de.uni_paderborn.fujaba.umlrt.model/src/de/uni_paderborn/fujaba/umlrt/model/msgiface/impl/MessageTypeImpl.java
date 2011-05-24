/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.msgiface.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.impl.CallableImpl;

import de.uni_paderborn.fujaba.umlrt.model.adapter.DerivedAttributeAdapter;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MessageTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MessageTypeImpl#getMessageInterface <em>Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MessageTypeImpl#getMessageTypeExpr <em>Message Type Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageTypeImpl extends CallableImpl implements MessageType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getMessageTypeExpr() <em>Message Type Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTypeExpr()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MESSAGE_TYPE_EXPR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)MsgifacePackage.Literals.MESSAGE_TYPE__MESSAGE_TYPE_EXPR).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected MessageTypeImpl() {
		super();
		
		DerivedAttributeAdapter messageTypeExprAdapter1 = new DerivedAttributeAdapter(this, MsgifacePackage.Literals.MESSAGE_TYPE__MESSAGE_TYPE_EXPR, false);

		DerivedAttributeAdapter messageTypeExprAdapter2 = new DerivedAttributeAdapter(this, MsgifacePackage.Literals.MESSAGE_TYPE__MESSAGE_TYPE_EXPR, false);
		messageTypeExprAdapter2.addLocalDependency(CallsPackage.Literals.CALLABLE__CONTAINED_PARAMETERS);

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgifacePackage.MESSAGE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageTypeExpr() {
		return (String)MESSAGE_TYPE_EXPR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessageTypeExpr() {
		return MESSAGE_TYPE_EXPR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toMyString() {
		String value ="null";
		boolean firstTime = true;
		if(name!=null) {
		value = name ;
		if(containedParameters!=null){
			value = value+"(";
			java.util.Iterator<EParameter> iter = containedParameters.iterator();
			while(iter.hasNext()){
				EParameter tmp = iter.next();
				if(tmp.getName()!=null && tmp.getEType()!=null && 
					tmp.getEType().getInstanceTypeName()!=null){				
						if(firstTime){
							firstTime=false;
							value = value + tmp.getName() + ":" + tmp.getEType().getName();
						}else{
							value = value +", "+ tmp.getName() + ":" + tmp.getEType().getName() ;
						}	
					}
				}
			value = value + ")";
			}else{
				value = value+"()";
			}
		}
		return value;
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
			case MsgifacePackage.MESSAGE_TYPE__NAME:
				return getName();
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE:
				return getMessageInterface();
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_TYPE_EXPR:
				return getMessageTypeExpr();
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
			case MsgifacePackage.MESSAGE_TYPE__NAME:
				setName((String)newValue);
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
			case MsgifacePackage.MESSAGE_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case MsgifacePackage.MESSAGE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE:
				return getMessageInterface() != null;
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_TYPE_EXPR:
				return isSetMessageTypeExpr();
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case MsgifacePackage.MESSAGE_TYPE__NAME: return SDMPackage.NAMED_ELEMENT__NAME;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case SDMPackage.NAMED_ELEMENT__NAME: return MsgifacePackage.MESSAGE_TYPE__NAME;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MsgifacePackage.MESSAGE_TYPE___TO_MY_STRING:
				return toMyString();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public EList<EParameter> getInParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EParameter> getOutParameters() {
		// TODO Auto-generated method stub
		return null;
	}

} //MessageTypeImpl

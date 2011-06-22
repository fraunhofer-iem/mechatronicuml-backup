/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.constraint.Constraint;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl#getReferencingComponentParts <em>Referencing Component Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl#getMustImplementReceiverInterfaces <em>Must Implement Receiver Interfaces</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl#getMustImplementSenderInterfaces <em>Must Implement Sender Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentImpl extends NamedElementImpl implements Component {
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
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass;

	/**
	 * The cached value of the '{@link #getReferencingComponentParts() <em>Referencing Component Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingComponentParts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPart> referencingComponentParts;

	/**
	 * The cached value of the '{@link #getMustImplementReceiverInterfaces() <em>Must Implement Receiver Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustImplementReceiverInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageInterface> mustImplementReceiverInterfaces;

	/**
	 * The cached value of the '{@link #getMustImplementSenderInterfaces() <em>Must Implement Sender Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustImplementSenderInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageInterface> mustImplementSenderInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, ComponentPackage.COMPONENT__CONSTRAINT, ConstraintPackage.CONSTRAINT__CONSTRAINABLE_ELEMENT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentWithInverseEList<Port>(Port.class, this, ComponentPackage.COMPONENT__PORTS, ComponentPackage.PORT__COMPONENT);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		if (eClass != null && eClass.eIsProxy()) {
			InternalEObject oldEClass = (InternalEObject)eClass;
			eClass = (EClass)eResolveProxy(oldEClass);
			if (eClass != oldEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.COMPONENT__ECLASS, oldEClass, eClass));
			}
		}
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(EClass newEClass) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT__ECLASS, oldEClass, eClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentPart> getReferencingComponentParts() {
		if (referencingComponentParts == null) {
			referencingComponentParts = new EObjectWithInverseResolvingEList<ComponentPart>(ComponentPart.class, this, ComponentPackage.COMPONENT__REFERENCING_COMPONENT_PARTS, ComponentPackage.COMPONENT_PART__COMPONENT_TYPE);
		}
		return referencingComponentParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageInterface> getMustImplementReceiverInterfaces() {
		if (mustImplementReceiverInterfaces == null) {
			mustImplementReceiverInterfaces = new EObjectResolvingEList<MessageInterface>(MessageInterface.class, this, ComponentPackage.COMPONENT__MUST_IMPLEMENT_RECEIVER_INTERFACES);
		}
		return mustImplementReceiverInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageInterface> getMustImplementSenderInterfaces() {
		if (mustImplementSenderInterfaces == null) {
			mustImplementSenderInterfaces = new EObjectResolvingEList<MessageInterface>(MessageInterface.class, this, ComponentPackage.COMPONENT__MUST_IMPLEMENT_SENDER_INTERFACES);
		}
		return mustImplementSenderInterfaces;
	}

	//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	public ComponentInstance createInstance() {
//		ComponentInstance componentInstance = InstanceFactory.eINSTANCE.createComponentInstance();
//		componentInstance.setComponentType(this);
//		return componentInstance;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.COMPONENT__CONSTRAINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraint()).basicAdd(otherEnd, msgs);
			case ComponentPackage.COMPONENT__PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPorts()).basicAdd(otherEnd, msgs);
			case ComponentPackage.COMPONENT__REFERENCING_COMPONENT_PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencingComponentParts()).basicAdd(otherEnd, msgs);
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
			case ComponentPackage.COMPONENT__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case ComponentPackage.COMPONENT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case ComponentPackage.COMPONENT__REFERENCING_COMPONENT_PARTS:
				return ((InternalEList<?>)getReferencingComponentParts()).basicRemove(otherEnd, msgs);
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
			case ComponentPackage.COMPONENT__COMMENT:
				return getComment();
			case ComponentPackage.COMPONENT__CONSTRAINT:
				return getConstraint();
			case ComponentPackage.COMPONENT__PORTS:
				return getPorts();
			case ComponentPackage.COMPONENT__ECLASS:
				if (resolve) return getEClass();
				return basicGetEClass();
			case ComponentPackage.COMPONENT__REFERENCING_COMPONENT_PARTS:
				return getReferencingComponentParts();
			case ComponentPackage.COMPONENT__MUST_IMPLEMENT_RECEIVER_INTERFACES:
				return getMustImplementReceiverInterfaces();
			case ComponentPackage.COMPONENT__MUST_IMPLEMENT_SENDER_INTERFACES:
				return getMustImplementSenderInterfaces();
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
			case ComponentPackage.COMPONENT__COMMENT:
				setComment((String)newValue);
				return;
			case ComponentPackage.COMPONENT__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ComponentPackage.COMPONENT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case ComponentPackage.COMPONENT__ECLASS:
				setEClass((EClass)newValue);
				return;
			case ComponentPackage.COMPONENT__REFERENCING_COMPONENT_PARTS:
				getReferencingComponentParts().clear();
				getReferencingComponentParts().addAll((Collection<? extends ComponentPart>)newValue);
				return;
			case ComponentPackage.COMPONENT__MUST_IMPLEMENT_RECEIVER_INTERFACES:
				getMustImplementReceiverInterfaces().clear();
				getMustImplementReceiverInterfaces().addAll((Collection<? extends MessageInterface>)newValue);
				return;
			case ComponentPackage.COMPONENT__MUST_IMPLEMENT_SENDER_INTERFACES:
				getMustImplementSenderInterfaces().clear();
				getMustImplementSenderInterfaces().addAll((Collection<? extends MessageInterface>)newValue);
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
			case ComponentPackage.COMPONENT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT__CONSTRAINT:
				getConstraint().clear();
				return;
			case ComponentPackage.COMPONENT__PORTS:
				getPorts().clear();
				return;
			case ComponentPackage.COMPONENT__ECLASS:
				setEClass((EClass)null);
				return;
			case ComponentPackage.COMPONENT__REFERENCING_COMPONENT_PARTS:
				getReferencingComponentParts().clear();
				return;
			case ComponentPackage.COMPONENT__MUST_IMPLEMENT_RECEIVER_INTERFACES:
				getMustImplementReceiverInterfaces().clear();
				return;
			case ComponentPackage.COMPONENT__MUST_IMPLEMENT_SENDER_INTERFACES:
				getMustImplementSenderInterfaces().clear();
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
			case ComponentPackage.COMPONENT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ComponentPackage.COMPONENT__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case ComponentPackage.COMPONENT__PORTS:
				return ports != null && !ports.isEmpty();
			case ComponentPackage.COMPONENT__ECLASS:
				return eClass != null;
			case ComponentPackage.COMPONENT__REFERENCING_COMPONENT_PARTS:
				return referencingComponentParts != null && !referencingComponentParts.isEmpty();
			case ComponentPackage.COMPONENT__MUST_IMPLEMENT_RECEIVER_INTERFACES:
				return mustImplementReceiverInterfaces != null && !mustImplementReceiverInterfaces.isEmpty();
			case ComponentPackage.COMPONENT__MUST_IMPLEMENT_SENDER_INTERFACES:
				return mustImplementSenderInterfaces != null && !mustImplementSenderInterfaces.isEmpty();
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
				case ComponentPackage.COMPONENT__COMMENT: return SDMPackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConstrainableElement.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.COMPONENT__CONSTRAINT: return CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT;
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
				case SDMPackage.COMMENTABLE_ELEMENT__COMMENT: return ComponentPackage.COMPONENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConstrainableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT: return ComponentPackage.COMPONENT__CONSTRAINT;
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

} //ComponentImpl

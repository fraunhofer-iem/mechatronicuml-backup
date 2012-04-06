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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.ComponentKind;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.constraint.Constraint;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl#getReferencingComponentParts <em>Referencing Component Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl#getComponentType <em>Component Type</em>}</li>
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
	 * The cached value of the '{@link #getReferencingComponentParts() <em>Referencing Component Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingComponentParts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPart> referencingComponentParts;

	/**
	 * The default value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentKind COMPONENT_TYPE_EDEFAULT = ComponentKind.SOFTWARE_COMPONENT;

	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected ComponentKind componentType = COMPONENT_TYPE_EDEFAULT;

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
	public ComponentKind getComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(ComponentKind newComponentType) {
		ComponentKind oldComponentType = componentType;
		componentType = newComponentType == null ? COMPONENT_TYPE_EDEFAULT : newComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT__COMPONENT_TYPE, oldComponentType, componentType));
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
			case ComponentPackage.COMPONENT__REFERENCING_COMPONENT_PARTS:
				return getReferencingComponentParts();
			case ComponentPackage.COMPONENT__COMPONENT_TYPE:
				return getComponentType();
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
			case ComponentPackage.COMPONENT__REFERENCING_COMPONENT_PARTS:
				getReferencingComponentParts().clear();
				getReferencingComponentParts().addAll((Collection<? extends ComponentPart>)newValue);
				return;
			case ComponentPackage.COMPONENT__COMPONENT_TYPE:
				setComponentType((ComponentKind)newValue);
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
			case ComponentPackage.COMPONENT__REFERENCING_COMPONENT_PARTS:
				getReferencingComponentParts().clear();
				return;
			case ComponentPackage.COMPONENT__COMPONENT_TYPE:
				setComponentType(COMPONENT_TYPE_EDEFAULT);
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
			case ComponentPackage.COMPONENT__REFERENCING_COMPONENT_PARTS:
				return referencingComponentParts != null && !referencingComponentParts.isEmpty();
			case ComponentPackage.COMPONENT__COMPONENT_TYPE:
				return componentType != COMPONENT_TYPE_EDEFAULT;
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
				case ComponentPackage.COMPONENT__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConstrainableElement.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.COMPONENT__CONSTRAINT: return de.uni_paderborn.fujaba.muml.model.core.CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return ComponentPackage.COMPONENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConstrainableElement.class) {
			switch (baseFeatureID) {
				case de.uni_paderborn.fujaba.muml.model.core.CorePackage.CONSTRAINABLE_ELEMENT__CONSTRAINT: return ComponentPackage.COMPONENT__CONSTRAINT;
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
		result.append(", componentType: ");
		result.append(componentType);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl

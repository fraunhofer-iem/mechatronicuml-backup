/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.patterns.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.util.CoreUtil;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AttributeAssignment;
import org.muml.storydiagram.patterns.BindingOperator;
import org.muml.storydiagram.patterns.BindingSemantics;
import org.muml.storydiagram.patterns.LinkConstraint;
import org.muml.storydiagram.patterns.ObjectVariable;
import org.muml.storydiagram.patterns.PatternsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.patterns.impl.ObjectVariableImpl#getOutgoingLink <em>Outgoing Link</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.ObjectVariableImpl#getLinkOrderConstraint <em>Link Order Constraint</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.ObjectVariableImpl#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.ObjectVariableImpl#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.ObjectVariableImpl#getAttributeAssignments <em>Attribute Assignments</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.ObjectVariableImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectVariableImpl extends AbstractVariableImpl implements
		ObjectVariable {
	/**
	 * The cached value of the '{@link #getOutgoingLink() <em>Outgoing Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingLink()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractLinkVariable> outgoingLink;
	/**
	 * The cached value of the '{@link #getLinkOrderConstraint() <em>Link Order Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkOrderConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkConstraint> linkOrderConstraint;
	/**
	 * The default value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBindingSemantics()
	 * @generated
	 * @ordered
	 */
	protected static final BindingSemantics BINDING_SEMANTICS_EDEFAULT = BindingSemantics.MANDATORY;
	/**
	 * The cached value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBindingSemantics()
	 * @generated
	 * @ordered
	 */
	protected BindingSemantics bindingSemantics = BINDING_SEMANTICS_EDEFAULT;
	/**
	 * The default value of the '{@link #getBindingOperator() <em>Binding Operator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBindingOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BindingOperator BINDING_OPERATOR_EDEFAULT = BindingOperator.CHECK_ONLY;
	/**
	 * The cached value of the '{@link #getBindingOperator() <em>Binding Operator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBindingOperator()
	 * @generated
	 * @ordered
	 */
	protected BindingOperator bindingOperator = BINDING_OPERATOR_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAttributeAssignments() <em>Attribute Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeAssignment> attributeAssignments;
	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected EClass classifier;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.OBJECT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractLinkVariable> getOutgoingLink() {
		if (outgoingLink == null) {
			outgoingLink = new EObjectWithInverseResolvingEList<AbstractLinkVariable>(AbstractLinkVariable.class, this, PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK, PatternsPackage.ABSTRACT_LINK_VARIABLE__SOURCE);
		}
		return outgoingLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkConstraint> getLinkOrderConstraint() {
		if (linkOrderConstraint == null) {
			linkOrderConstraint = new EObjectContainmentWithInverseEList<LinkConstraint>(LinkConstraint.class, this, PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT, PatternsPackage.LINK_CONSTRAINT__REFERENCING_OBJECT);
		}
		return linkOrderConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BindingSemantics getBindingSemantics() {
		return bindingSemantics;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingSemantics(BindingSemantics newBindingSemantics) {
		BindingSemantics oldBindingSemantics = bindingSemantics;
		bindingSemantics = newBindingSemantics == null ? BINDING_SEMANTICS_EDEFAULT : newBindingSemantics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS, oldBindingSemantics, bindingSemantics));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BindingOperator getBindingOperator() {
		return bindingOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingOperator(BindingOperator newBindingOperator) {
		BindingOperator oldBindingOperator = bindingOperator;
		bindingOperator = newBindingOperator == null ? BINDING_OPERATOR_EDEFAULT : newBindingOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR, oldBindingOperator, bindingOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeAssignment> getAttributeAssignments() {
		if (attributeAssignments == null) {
			attributeAssignments = new EObjectContainmentWithInverseEList<AttributeAssignment>(AttributeAssignment.class, this, PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENTS, PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE);
		}
		return attributeAssignments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		if (classifier != null && classifier.eIsProxy()) {
			InternalEObject oldClassifier = (InternalEObject)classifier;
			classifier = (EClass)eResolveProxy(oldClassifier);
			if (classifier != oldClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.OBJECT_VARIABLE__CLASSIFIER, oldClassifier, classifier));
			}
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setClassifier(EClass newClassifier) {
		EClass oldClassifier = this.classifier;
		this.classifier = newClassifier;
		NotificationChain msgs = updateGenericType(newClassifier, null);
		CoreUtil.dispatch(msgs,
				eNotificationRequired() ? new ENotificationImpl(this,
						Notification.SET,
						PatternsPackage.OBJECT_VARIABLE__CLASSIFIER,
						oldClassifier, this.classifier) : null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingLink()).basicAdd(otherEnd, msgs);
			case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinkOrderConstraint()).basicAdd(otherEnd, msgs);
			case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributeAssignments()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
				return ((InternalEList<?>)getOutgoingLink()).basicRemove(otherEnd, msgs);
			case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
				return ((InternalEList<?>)getLinkOrderConstraint()).basicRemove(otherEnd, msgs);
			case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENTS:
				return ((InternalEList<?>)getAttributeAssignments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
				return getOutgoingLink();
			case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
				return getLinkOrderConstraint();
			case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
				return getBindingSemantics();
			case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
				return getBindingOperator();
			case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENTS:
				return getAttributeAssignments();
			case PatternsPackage.OBJECT_VARIABLE__CLASSIFIER:
				if (resolve) return getClassifier();
				return basicGetClassifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
				getOutgoingLink().clear();
				getOutgoingLink().addAll((Collection<? extends AbstractLinkVariable>)newValue);
				return;
			case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
				getLinkOrderConstraint().clear();
				getLinkOrderConstraint().addAll((Collection<? extends LinkConstraint>)newValue);
				return;
			case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
				setBindingSemantics((BindingSemantics)newValue);
				return;
			case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
				setBindingOperator((BindingOperator)newValue);
				return;
			case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENTS:
				getAttributeAssignments().clear();
				getAttributeAssignments().addAll((Collection<? extends AttributeAssignment>)newValue);
				return;
			case PatternsPackage.OBJECT_VARIABLE__CLASSIFIER:
				setClassifier((EClass)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
				getOutgoingLink().clear();
				return;
			case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
				getLinkOrderConstraint().clear();
				return;
			case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
				setBindingSemantics(BINDING_SEMANTICS_EDEFAULT);
				return;
			case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
				setBindingOperator(BINDING_OPERATOR_EDEFAULT);
				return;
			case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENTS:
				getAttributeAssignments().clear();
				return;
			case PatternsPackage.OBJECT_VARIABLE__CLASSIFIER:
				setClassifier((EClass)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
				return outgoingLink != null && !outgoingLink.isEmpty();
			case PatternsPackage.OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT:
				return linkOrderConstraint != null && !linkOrderConstraint.isEmpty();
			case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
				return bindingSemantics != BINDING_SEMANTICS_EDEFAULT;
			case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
				return bindingOperator != BINDING_OPERATOR_EDEFAULT;
			case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENTS:
				return attributeAssignments != null && !attributeAssignments.isEmpty();
			case PatternsPackage.OBJECT_VARIABLE__CLASSIFIER:
				return classifier != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bindingSemantics: ");
		result.append(bindingSemantics);
		result.append(", bindingOperator: ");
		result.append(bindingOperator);
		result.append(')');
		return result.toString();
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected NotificationChain basicSetType(EClassifier newType,
			NotificationChain msgs) {
		EClass oldClassifier = this.classifier;
		this.classifier = (EClass) newType;
		if (eNotificationRequired()) {
			return CoreUtil.chain(msgs, new ENotificationImpl(this,
					Notification.SET,
					PatternsPackage.OBJECT_VARIABLE__CLASSIFIER, oldClassifier,
					this.classifier));
		}
		return msgs;
	}
} // ObjectVariableImpl

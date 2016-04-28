/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.mumlcore.CommentableElement;
import org.muml.mumlcore.CorePackage;
import org.muml.mumlcore.impl.NamedElementImpl;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.StructuredNode;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Activity Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.impl.ActivityNodeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.ActivityNodeImpl#getOutgoings <em>Outgoings</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.ActivityNodeImpl#getOwningActivity <em>Owning Activity</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.ActivityNodeImpl#getOwningActivityNode <em>Owning Activity Node</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.ActivityNodeImpl#getIncomings <em>Incomings</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityNodeImpl extends NamedElementImpl implements
		ActivityNode {
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
	 * The cached value of the '{@link #getOutgoings() <em>Outgoings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoings()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> outgoings;

	/**
	 * The cached value of the '{@link #getIncomings() <em>Incomings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomings()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> incomings;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.ACTIVITY_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_NODE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getOutgoings() {
		if (outgoings == null) {
			outgoings = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, ActivitiesPackage.ACTIVITY_NODE__OUTGOINGS, ActivitiesPackage.ACTIVITY_EDGE__SOURCE);
		}
		return outgoings;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredNode getOwningActivityNode() {
		if (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE) return null;
		return (StructuredNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningActivityNode(
			StructuredNode newOwningActivityNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningActivityNode, ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningActivityNode(StructuredNode newOwningActivityNode) {
		if (newOwningActivityNode != eInternalContainer() || (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE && newOwningActivityNode != null)) {
			if (EcoreUtil.isAncestor(this, newOwningActivityNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningActivityNode != null)
				msgs = ((InternalEObject)newOwningActivityNode).eInverseAdd(this, ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODES, StructuredNode.class, msgs);
			msgs = basicSetOwningActivityNode(newOwningActivityNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE, newOwningActivityNode, newOwningActivityNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getIncomings() {
		if (incomings == null) {
			incomings = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, ActivitiesPackage.ACTIVITY_NODE__INCOMINGS, ActivitiesPackage.ACTIVITY_EDGE__TARGET);
		}
		return incomings;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getOwningActivity() {
		if (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY) return null;
		return (Activity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningActivity(Activity newOwningActivity,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningActivity, ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningActivity(Activity newOwningActivity) {
		if (newOwningActivity != eInternalContainer() || (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY && newOwningActivity != null)) {
			if (EcoreUtil.isAncestor(this, newOwningActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningActivity != null)
				msgs = ((InternalEObject)newOwningActivity).eInverseAdd(this, ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODES, Activity.class, msgs);
			msgs = basicSetOwningActivity(newOwningActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY, newOwningActivity, newOwningActivity));
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
			case ActivitiesPackage.ACTIVITY_NODE__OUTGOINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoings()).basicAdd(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningActivity((Activity)otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningActivityNode((StructuredNode)otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY_NODE__INCOMINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomings()).basicAdd(otherEnd, msgs);
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
			case ActivitiesPackage.ACTIVITY_NODE__OUTGOINGS:
				return ((InternalEList<?>)getOutgoings()).basicRemove(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY:
				return basicSetOwningActivity(null, msgs);
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE:
				return basicSetOwningActivityNode(null, msgs);
			case ActivitiesPackage.ACTIVITY_NODE__INCOMINGS:
				return ((InternalEList<?>)getIncomings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY:
				return eInternalContainer().eInverseRemove(this, ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODES, Activity.class, msgs);
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE:
				return eInternalContainer().eInverseRemove(this, ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODES, StructuredNode.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitiesPackage.ACTIVITY_NODE__COMMENT:
				return getComment();
			case ActivitiesPackage.ACTIVITY_NODE__OUTGOINGS:
				return getOutgoings();
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY:
				return getOwningActivity();
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE:
				return getOwningActivityNode();
			case ActivitiesPackage.ACTIVITY_NODE__INCOMINGS:
				return getIncomings();
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
			case ActivitiesPackage.ACTIVITY_NODE__COMMENT:
				setComment((String)newValue);
				return;
			case ActivitiesPackage.ACTIVITY_NODE__OUTGOINGS:
				getOutgoings().clear();
				getOutgoings().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY:
				setOwningActivity((Activity)newValue);
				return;
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE:
				setOwningActivityNode((StructuredNode)newValue);
				return;
			case ActivitiesPackage.ACTIVITY_NODE__INCOMINGS:
				getIncomings().clear();
				getIncomings().addAll((Collection<? extends ActivityEdge>)newValue);
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
			case ActivitiesPackage.ACTIVITY_NODE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ActivitiesPackage.ACTIVITY_NODE__OUTGOINGS:
				getOutgoings().clear();
				return;
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY:
				setOwningActivity((Activity)null);
				return;
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE:
				setOwningActivityNode((StructuredNode)null);
				return;
			case ActivitiesPackage.ACTIVITY_NODE__INCOMINGS:
				getIncomings().clear();
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
			case ActivitiesPackage.ACTIVITY_NODE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ActivitiesPackage.ACTIVITY_NODE__OUTGOINGS:
				return outgoings != null && !outgoings.isEmpty();
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY:
				return getOwningActivity() != null;
			case ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE:
				return getOwningActivityNode() != null;
			case ActivitiesPackage.ACTIVITY_NODE__INCOMINGS:
				return incomings != null && !incomings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case ActivitiesPackage.ACTIVITY_NODE__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return ActivitiesPackage.ACTIVITY_NODE__COMMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

} // ActivityNodeImpl

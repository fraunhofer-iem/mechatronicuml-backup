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
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.mumlcore.CorePackage;
import org.muml.mumlcore.NamedElement;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.MatchingStoryNode;
import org.muml.storydiagram.activities.OperationExtension;
import org.muml.storydiagram.calls.impl.CallableImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Activity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.ActivityImpl#getOwningOperation <em>Owning Operation</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.ActivityImpl#getOwnedActivityEdges <em>Owned Activity Edges</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.ActivityImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.ActivityImpl#getOwnedActivityNodes <em>Owned Activity Nodes</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.ActivityImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends CallableImpl implements Activity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedActivityEdges() <em>Owned Activity Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActivityEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> ownedActivityEdges;

	private static final String ACTIVITY_ANNOTATION_URI = "http://ns.storydriven.org/sdm/activities/activity";

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected MatchingStoryNode precondition;

	/**
	 * The cached value of the '{@link #getOwnedActivityNodes() <em>Owned Activity Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActivityNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> ownedActivityNodes;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<EAnnotation> annotations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OperationExtension getOwningOperation() {
		if (eContainerFeatureID() != ActivitiesPackage.ACTIVITY__OWNING_OPERATION) return null;
		return (OperationExtension)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EOperation basicGetOwningOperation() {
		EAnnotation annotation = getOwningOperationAnnotation();
		if (annotation != null) {
			EModelElement modelElement = annotation.getEModelElement();
			if (modelElement instanceof EOperation) {
				return (EOperation) modelElement;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningOperation(
			OperationExtension newOwningOperation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningOperation, ActivitiesPackage.ACTIVITY__OWNING_OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningOperation(OperationExtension newOwningOperation) {
		if (newOwningOperation != eInternalContainer() || (eContainerFeatureID() != ActivitiesPackage.ACTIVITY__OWNING_OPERATION && newOwningOperation != null)) {
			if (EcoreUtil.isAncestor(this, newOwningOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningOperation != null)
				msgs = ((InternalEObject)newOwningOperation).eInverseAdd(this, ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY, OperationExtension.class, msgs);
			msgs = basicSetOwningOperation(newOwningOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY__OWNING_OPERATION, newOwningOperation, newOwningOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getOwnedActivityEdges() {
		if (ownedActivityEdges == null) {
			ownedActivityEdges = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this, ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGES, ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY);
		}
		return ownedActivityEdges;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingStoryNode getPrecondition() {
		if (precondition != null && precondition.eIsProxy()) {
			InternalEObject oldPrecondition = (InternalEObject)precondition;
			precondition = (MatchingStoryNode)eResolveProxy(oldPrecondition);
			if (precondition != oldPrecondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.ACTIVITY__PRECONDITION, oldPrecondition, precondition));
			}
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingStoryNode basicGetPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(MatchingStoryNode newPrecondition) {
		MatchingStoryNode oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY__PRECONDITION, oldPrecondition, precondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getOwnedActivityNodes() {
		if (ownedActivityNodes == null) {
			ownedActivityNodes = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODES, ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY);
		}
		return ownedActivityNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<EAnnotation>(EAnnotation.class, this, ActivitiesPackage.ACTIVITY__ANNOTATIONS);
		}
		return annotations;
	}

	protected EAnnotation getOwningOperationAnnotation() {
		if (eContainmentFeature() == EcorePackage.Literals.EANNOTATION__CONTENTS) {
			EAnnotation annotation = (EAnnotation) eContainer();
			if (ACTIVITY_ANNOTATION_URI.equals(annotation.getSource())) {
				return annotation;
			}
		}
		return null;
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
			case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningOperation((OperationExtension)otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedActivityEdges()).basicAdd(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedActivityNodes()).basicAdd(otherEnd, msgs);
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
			case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
				return basicSetOwningOperation(null, msgs);
			case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGES:
				return ((InternalEList<?>)getOwnedActivityEdges()).basicRemove(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODES:
				return ((InternalEList<?>)getOwnedActivityNodes()).basicRemove(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
			case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
				return eInternalContainer().eInverseRemove(this, ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY, OperationExtension.class, msgs);
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
			case ActivitiesPackage.ACTIVITY__NAME:
				return getName();
			case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
				return getOwningOperation();
			case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGES:
				return getOwnedActivityEdges();
			case ActivitiesPackage.ACTIVITY__PRECONDITION:
				if (resolve) return getPrecondition();
				return basicGetPrecondition();
			case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODES:
				return getOwnedActivityNodes();
			case ActivitiesPackage.ACTIVITY__ANNOTATIONS:
				return getAnnotations();
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
			case ActivitiesPackage.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
				setOwningOperation((OperationExtension)newValue);
				return;
			case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGES:
				getOwnedActivityEdges().clear();
				getOwnedActivityEdges().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivitiesPackage.ACTIVITY__PRECONDITION:
				setPrecondition((MatchingStoryNode)newValue);
				return;
			case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODES:
				getOwnedActivityNodes().clear();
				getOwnedActivityNodes().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case ActivitiesPackage.ACTIVITY__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends EAnnotation>)newValue);
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
			case ActivitiesPackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
				setOwningOperation((OperationExtension)null);
				return;
			case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGES:
				getOwnedActivityEdges().clear();
				return;
			case ActivitiesPackage.ACTIVITY__PRECONDITION:
				setPrecondition((MatchingStoryNode)null);
				return;
			case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODES:
				getOwnedActivityNodes().clear();
				return;
			case ActivitiesPackage.ACTIVITY__ANNOTATIONS:
				getAnnotations().clear();
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
			case ActivitiesPackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
				return getOwningOperation() != null;
			case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGES:
				return ownedActivityEdges != null && !ownedActivityEdges.isEmpty();
			case ActivitiesPackage.ACTIVITY__PRECONDITION:
				return precondition != null;
			case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODES:
				return ownedActivityNodes != null && !ownedActivityNodes.isEmpty();
			case ActivitiesPackage.ACTIVITY__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case ActivitiesPackage.ACTIVITY__NAME: return CorePackage.NAMED_ELEMENT__NAME;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ELEMENT__NAME: return ActivitiesPackage.ACTIVITY__NAME;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // ActivityImpl

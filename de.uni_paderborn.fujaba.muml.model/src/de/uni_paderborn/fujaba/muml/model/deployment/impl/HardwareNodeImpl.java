/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.deployment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;
import org.storydriven.core.impl.NamedElementImpl;
import de.uni_paderborn.fujaba.muml.model.deployment.Deployment;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwareNodeKind;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwareNodeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwareNodeImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwareNodeImpl#getHardwarePorts <em>Hardware Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwareNodeImpl#getDeployedInstances <em>Deployed Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwareNodeImpl#getHardwareNodeKind <em>Hardware Node Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareNodeImpl extends NamedElementImpl implements HardwareNode {
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
	 * The cached value of the '{@link #getHardwarePorts() <em>Hardware Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwarePorts()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePort> hardwarePorts;

	/**
	 * The cached value of the '{@link #getDeployedInstances() <em>Deployed Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> deployedInstances;

	/**
	 * The default value of the '{@link #getHardwareNodeKind() <em>Hardware Node Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareNodeKind()
	 * @generated
	 * @ordered
	 */
	protected static final HardwareNodeKind HARDWARE_NODE_KIND_EDEFAULT = HardwareNodeKind.COMPUTATIONAL_RESOURCE;

	/**
	 * The cached value of the '{@link #getHardwareNodeKind() <em>Hardware Node Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareNodeKind()
	 * @generated
	 * @ordered
	 */
	protected HardwareNodeKind hardwareNodeKind = HARDWARE_NODE_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.HARDWARE_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HARDWARE_NODE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment() {
		if (eContainerFeatureID() != DeploymentPackage.HARDWARE_NODE__DEPLOYMENT) return null;
		return (Deployment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployment(Deployment newDeployment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDeployment, DeploymentPackage.HARDWARE_NODE__DEPLOYMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployment(Deployment newDeployment) {
		if (newDeployment != eInternalContainer() || (eContainerFeatureID() != DeploymentPackage.HARDWARE_NODE__DEPLOYMENT && newDeployment != null)) {
			if (EcoreUtil.isAncestor(this, newDeployment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeployment != null)
				msgs = ((InternalEObject)newDeployment).eInverseAdd(this, DeploymentPackage.DEPLOYMENT__HARDWARE_NODES, Deployment.class, msgs);
			msgs = basicSetDeployment(newDeployment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HARDWARE_NODE__DEPLOYMENT, newDeployment, newDeployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwarePort> getHardwarePorts() {
		if (hardwarePorts == null) {
			hardwarePorts = new EObjectContainmentWithInverseEList<HardwarePort>(HardwarePort.class, this, DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS, DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE);
		}
		return hardwarePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getDeployedInstances() {
		if (deployedInstances == null) {
			deployedInstances = new EObjectResolvingEList<ComponentInstance>(ComponentInstance.class, this, DeploymentPackage.HARDWARE_NODE__DEPLOYED_INSTANCES);
		}
		return deployedInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareNodeKind getHardwareNodeKind() {
		return hardwareNodeKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareNodeKind(HardwareNodeKind newHardwareNodeKind) {
		HardwareNodeKind oldHardwareNodeKind = hardwareNodeKind;
		hardwareNodeKind = newHardwareNodeKind == null ? HARDWARE_NODE_KIND_EDEFAULT : newHardwareNodeKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HARDWARE_NODE__HARDWARE_NODE_KIND, oldHardwareNodeKind, hardwareNodeKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentPackage.HARDWARE_NODE__DEPLOYMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeployment((Deployment)otherEnd, msgs);
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHardwarePorts()).basicAdd(otherEnd, msgs);
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
			case DeploymentPackage.HARDWARE_NODE__DEPLOYMENT:
				return basicSetDeployment(null, msgs);
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				return ((InternalEList<?>)getHardwarePorts()).basicRemove(otherEnd, msgs);
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
			case DeploymentPackage.HARDWARE_NODE__DEPLOYMENT:
				return eInternalContainer().eInverseRemove(this, DeploymentPackage.DEPLOYMENT__HARDWARE_NODES, Deployment.class, msgs);
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
			case DeploymentPackage.HARDWARE_NODE__COMMENT:
				return getComment();
			case DeploymentPackage.HARDWARE_NODE__DEPLOYMENT:
				return getDeployment();
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				return getHardwarePorts();
			case DeploymentPackage.HARDWARE_NODE__DEPLOYED_INSTANCES:
				return getDeployedInstances();
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_NODE_KIND:
				return getHardwareNodeKind();
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
			case DeploymentPackage.HARDWARE_NODE__COMMENT:
				setComment((String)newValue);
				return;
			case DeploymentPackage.HARDWARE_NODE__DEPLOYMENT:
				setDeployment((Deployment)newValue);
				return;
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				getHardwarePorts().clear();
				getHardwarePorts().addAll((Collection<? extends HardwarePort>)newValue);
				return;
			case DeploymentPackage.HARDWARE_NODE__DEPLOYED_INSTANCES:
				getDeployedInstances().clear();
				getDeployedInstances().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_NODE_KIND:
				setHardwareNodeKind((HardwareNodeKind)newValue);
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
			case DeploymentPackage.HARDWARE_NODE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case DeploymentPackage.HARDWARE_NODE__DEPLOYMENT:
				setDeployment((Deployment)null);
				return;
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				getHardwarePorts().clear();
				return;
			case DeploymentPackage.HARDWARE_NODE__DEPLOYED_INSTANCES:
				getDeployedInstances().clear();
				return;
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_NODE_KIND:
				setHardwareNodeKind(HARDWARE_NODE_KIND_EDEFAULT);
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
			case DeploymentPackage.HARDWARE_NODE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case DeploymentPackage.HARDWARE_NODE__DEPLOYMENT:
				return getDeployment() != null;
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				return hardwarePorts != null && !hardwarePorts.isEmpty();
			case DeploymentPackage.HARDWARE_NODE__DEPLOYED_INSTANCES:
				return deployedInstances != null && !deployedInstances.isEmpty();
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_NODE_KIND:
				return hardwareNodeKind != HARDWARE_NODE_KIND_EDEFAULT;
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
				case DeploymentPackage.HARDWARE_NODE__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return DeploymentPackage.HARDWARE_NODE__COMMENT;
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
		result.append(", hardwareNodeKind: ");
		result.append(hardwareNodeKind);
		result.append(')');
		return result.toString();
	}

} //HardwareNodeImpl

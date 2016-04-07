/**
 */
package org.muml.testlanguage.impl;

import java.lang.reflect.InvocationTargetException;
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
import org.muml.testlanguage.Input;
import org.muml.testlanguage.Node;
import org.muml.testlanguage.Output;
import org.muml.testlanguage.TestLanguagePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Output</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.muml.testlanguage.impl.OutputImpl#getTargets <em>Targets</em>}
 * </li>
 * <li>{@link org.muml.testlanguage.impl.OutputImpl#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputImpl extends PortImpl implements Output {
	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> targets;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestLanguagePackage.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Input> getTargets() {
		if (targets == null) {
			targets = new EObjectWithInverseResolvingEList<Input>(Input.class, this,
					TestLanguagePackage.OUTPUT__TARGETS, TestLanguagePackage.INPUT__SOURCE);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node getNode() {
		if (eContainerFeatureID() != TestLanguagePackage.OUTPUT__NODE)
			return null;
		return (Node) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetNode(Node newNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newNode, TestLanguagePackage.OUTPUT__NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNode(Node newNode) {
		if (newNode != eInternalContainer()
				|| (eContainerFeatureID() != TestLanguagePackage.OUTPUT__NODE && newNode != null)) {
			if (EcoreUtil.isAncestor(this, newNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNode != null)
				msgs = ((InternalEObject) newNode).eInverseAdd(this, TestLanguagePackage.NODE__OUTPUTS, Node.class,
						msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestLanguagePackage.OUTPUT__NODE, newNode, newNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object getData() {
		if (this.getNode().getOutputCache() == null) {
			return null;
		}

		return this.getNode().getOutputCache().get(this.getName());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TestLanguagePackage.OUTPUT__TARGETS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTargets()).basicAdd(otherEnd, msgs);
		case TestLanguagePackage.OUTPUT__NODE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetNode((Node) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TestLanguagePackage.OUTPUT__TARGETS:
			return ((InternalEList<?>) getTargets()).basicRemove(otherEnd, msgs);
		case TestLanguagePackage.OUTPUT__NODE:
			return basicSetNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case TestLanguagePackage.OUTPUT__NODE:
			return eInternalContainer().eInverseRemove(this, TestLanguagePackage.NODE__OUTPUTS, Node.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TestLanguagePackage.OUTPUT__TARGETS:
			return getTargets();
		case TestLanguagePackage.OUTPUT__NODE:
			return getNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TestLanguagePackage.OUTPUT__TARGETS:
			getTargets().clear();
			getTargets().addAll((Collection<? extends Input>) newValue);
			return;
		case TestLanguagePackage.OUTPUT__NODE:
			setNode((Node) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TestLanguagePackage.OUTPUT__TARGETS:
			getTargets().clear();
			return;
		case TestLanguagePackage.OUTPUT__NODE:
			setNode((Node) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TestLanguagePackage.OUTPUT__TARGETS:
			return targets != null && !targets.isEmpty();
		case TestLanguagePackage.OUTPUT__NODE:
			return getNode() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TestLanguagePackage.OUTPUT___GET_DATA:
			return getData();
		}
		return super.eInvoke(operationID, arguments);
	}

} // OutputImpl

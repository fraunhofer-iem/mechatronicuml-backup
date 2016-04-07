/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.simulink.Block;
import org.muml.simulink.InPortBlock;
import org.muml.simulink.Line;
import org.muml.simulink.OutPortBlock;
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.SubSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.impl.BlockImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.muml.simulink.impl.BlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.simulink.impl.BlockImpl#getOutPorts <em>Out Ports</em>}</li>
 *   <li>{@link org.muml.simulink.impl.BlockImpl#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link org.muml.simulink.impl.BlockImpl#getIncomingLines <em>Incoming Lines</em>}</li>
 *   <li>{@link org.muml.simulink.impl.BlockImpl#getOutgoingLines <em>Outgoing Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BlockImpl extends ElementImpl implements Block {
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
	 * The cached value of the '{@link #getOutPorts() <em>Out Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<OutPortBlock> outPorts;

	/**
	 * The cached value of the '{@link #getInPorts() <em>In Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<InPortBlock> inPorts;

	/**
	 * The cached value of the '{@link #getIncomingLines() <em>Incoming Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> incomingLines;

	/**
	 * The cached value of the '{@link #getOutgoingLines() <em>Outgoing Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> outgoingLines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem getParent() {
		if (eContainerFeatureID() != SimulinkPackage.BLOCK__PARENT) return null;
		return (SubSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(SubSystem newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, SimulinkPackage.BLOCK__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(SubSystem newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != SimulinkPackage.BLOCK__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, SimulinkPackage.SUB_SYSTEM__BLOCKS, SubSystem.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.BLOCK__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.BLOCK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutPortBlock> getOutPorts() {
		if (outPorts == null) {
			outPorts = new EObjectContainmentWithInverseEList<OutPortBlock>(OutPortBlock.class, this, SimulinkPackage.BLOCK__OUT_PORTS, SimulinkPackage.OUT_PORT_BLOCK__BLOCK);
		}
		return outPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InPortBlock> getInPorts() {
		if (inPorts == null) {
			inPorts = new EObjectContainmentWithInverseEList<InPortBlock>(InPortBlock.class, this, SimulinkPackage.BLOCK__IN_PORTS, SimulinkPackage.IN_PORT_BLOCK__BLOCK);
		}
		return inPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getIncomingLines() {
		if (incomingLines == null) {
			incomingLines = new EObjectWithInverseResolvingEList<Line>(Line.class, this, SimulinkPackage.BLOCK__INCOMING_LINES, SimulinkPackage.LINE__TARGET_BLOCK);
		}
		return incomingLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getOutgoingLines() {
		if (outgoingLines == null) {
			outgoingLines = new EObjectWithInverseResolvingEList<Line>(Line.class, this, SimulinkPackage.BLOCK__OUTGOING_LINES, SimulinkPackage.LINE__SOURCE_BLOCK);
		}
		return outgoingLines;
	}

	/**
	 * The cached invocation delegate for the '{@link #getFullyQualifiedName() <em>Get Fully Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_FULLY_QUALIFIED_NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)SimulinkPackage.Literals.BLOCK___GET_FULLY_QUALIFIED_NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullyQualifiedName() {
		try {
			return (String)GET_FULLY_QUALIFIED_NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
			case SimulinkPackage.BLOCK__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((SubSystem)otherEnd, msgs);
			case SimulinkPackage.BLOCK__OUT_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutPorts()).basicAdd(otherEnd, msgs);
			case SimulinkPackage.BLOCK__IN_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInPorts()).basicAdd(otherEnd, msgs);
			case SimulinkPackage.BLOCK__INCOMING_LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLines()).basicAdd(otherEnd, msgs);
			case SimulinkPackage.BLOCK__OUTGOING_LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingLines()).basicAdd(otherEnd, msgs);
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
			case SimulinkPackage.BLOCK__PARENT:
				return basicSetParent(null, msgs);
			case SimulinkPackage.BLOCK__OUT_PORTS:
				return ((InternalEList<?>)getOutPorts()).basicRemove(otherEnd, msgs);
			case SimulinkPackage.BLOCK__IN_PORTS:
				return ((InternalEList<?>)getInPorts()).basicRemove(otherEnd, msgs);
			case SimulinkPackage.BLOCK__INCOMING_LINES:
				return ((InternalEList<?>)getIncomingLines()).basicRemove(otherEnd, msgs);
			case SimulinkPackage.BLOCK__OUTGOING_LINES:
				return ((InternalEList<?>)getOutgoingLines()).basicRemove(otherEnd, msgs);
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
			case SimulinkPackage.BLOCK__PARENT:
				return eInternalContainer().eInverseRemove(this, SimulinkPackage.SUB_SYSTEM__BLOCKS, SubSystem.class, msgs);
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
			case SimulinkPackage.BLOCK__PARENT:
				return getParent();
			case SimulinkPackage.BLOCK__NAME:
				return getName();
			case SimulinkPackage.BLOCK__OUT_PORTS:
				return getOutPorts();
			case SimulinkPackage.BLOCK__IN_PORTS:
				return getInPorts();
			case SimulinkPackage.BLOCK__INCOMING_LINES:
				return getIncomingLines();
			case SimulinkPackage.BLOCK__OUTGOING_LINES:
				return getOutgoingLines();
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
			case SimulinkPackage.BLOCK__PARENT:
				setParent((SubSystem)newValue);
				return;
			case SimulinkPackage.BLOCK__NAME:
				setName((String)newValue);
				return;
			case SimulinkPackage.BLOCK__INCOMING_LINES:
				getIncomingLines().clear();
				getIncomingLines().addAll((Collection<? extends Line>)newValue);
				return;
			case SimulinkPackage.BLOCK__OUTGOING_LINES:
				getOutgoingLines().clear();
				getOutgoingLines().addAll((Collection<? extends Line>)newValue);
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
			case SimulinkPackage.BLOCK__PARENT:
				setParent((SubSystem)null);
				return;
			case SimulinkPackage.BLOCK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimulinkPackage.BLOCK__INCOMING_LINES:
				getIncomingLines().clear();
				return;
			case SimulinkPackage.BLOCK__OUTGOING_LINES:
				getOutgoingLines().clear();
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
			case SimulinkPackage.BLOCK__PARENT:
				return getParent() != null;
			case SimulinkPackage.BLOCK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimulinkPackage.BLOCK__OUT_PORTS:
				return outPorts != null && !outPorts.isEmpty();
			case SimulinkPackage.BLOCK__IN_PORTS:
				return inPorts != null && !inPorts.isEmpty();
			case SimulinkPackage.BLOCK__INCOMING_LINES:
				return incomingLines != null && !incomingLines.isEmpty();
			case SimulinkPackage.BLOCK__OUTGOING_LINES:
				return outgoingLines != null && !outgoingLines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SimulinkPackage.BLOCK___GET_FULLY_QUALIFIED_NAME:
				return getFullyQualifiedName();
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

} //BlockImpl

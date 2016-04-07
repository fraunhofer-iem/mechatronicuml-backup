/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.simulink.Block;
import org.muml.simulink.Bus;
import org.muml.simulink.InPortBlock;
import org.muml.simulink.Line;
import org.muml.simulink.OutPortBlock;
import org.muml.simulink.SimulinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.impl.LineImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.muml.simulink.impl.LineImpl#getTargetPort <em>Target Port</em>}</li>
 *   <li>{@link org.muml.simulink.impl.LineImpl#getSourceBlock <em>Source Block</em>}</li>
 *   <li>{@link org.muml.simulink.impl.LineImpl#getTargetBlock <em>Target Block</em>}</li>
 *   <li>{@link org.muml.simulink.impl.LineImpl#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineImpl extends ElementImpl implements Line {
	/**
	 * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
	protected OutPortBlock sourcePort;

	/**
	 * The cached value of the '{@link #getTargetPort() <em>Target Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPort()
	 * @generated
	 * @ordered
	 */
	protected InPortBlock targetPort;

	/**
	 * The cached value of the '{@link #getSourceBlock() <em>Source Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceBlock()
	 * @generated
	 * @ordered
	 */
	protected Block sourceBlock;

	/**
	 * The cached value of the '{@link #getTargetBlock() <em>Target Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetBlock()
	 * @generated
	 * @ordered
	 */
	protected Block targetBlock;

	/**
	 * The cached value of the '{@link #getBus() <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus()
	 * @generated
	 * @ordered
	 */
	protected Bus bus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock getSourcePort() {
		if (sourcePort != null && ((EObject)sourcePort).eIsProxy()) {
			InternalEObject oldSourcePort = (InternalEObject)sourcePort;
			sourcePort = (OutPortBlock)eResolveProxy(oldSourcePort);
			if (sourcePort != oldSourcePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulinkPackage.LINE__SOURCE_PORT, oldSourcePort, sourcePort));
			}
		}
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock basicGetSourcePort() {
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePort(OutPortBlock newSourcePort) {
		OutPortBlock oldSourcePort = sourcePort;
		sourcePort = newSourcePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.LINE__SOURCE_PORT, oldSourcePort, sourcePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock getTargetPort() {
		if (targetPort != null && ((EObject)targetPort).eIsProxy()) {
			InternalEObject oldTargetPort = (InternalEObject)targetPort;
			targetPort = (InPortBlock)eResolveProxy(oldTargetPort);
			if (targetPort != oldTargetPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulinkPackage.LINE__TARGET_PORT, oldTargetPort, targetPort));
			}
		}
		return targetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock basicGetTargetPort() {
		return targetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPort(InPortBlock newTargetPort) {
		InPortBlock oldTargetPort = targetPort;
		targetPort = newTargetPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.LINE__TARGET_PORT, oldTargetPort, targetPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getSourceBlock() {
		if (sourceBlock != null && ((EObject)sourceBlock).eIsProxy()) {
			InternalEObject oldSourceBlock = (InternalEObject)sourceBlock;
			sourceBlock = (Block)eResolveProxy(oldSourceBlock);
			if (sourceBlock != oldSourceBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulinkPackage.LINE__SOURCE_BLOCK, oldSourceBlock, sourceBlock));
			}
		}
		return sourceBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetSourceBlock() {
		return sourceBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceBlock(Block newSourceBlock, NotificationChain msgs) {
		Block oldSourceBlock = sourceBlock;
		sourceBlock = newSourceBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimulinkPackage.LINE__SOURCE_BLOCK, oldSourceBlock, newSourceBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceBlock(Block newSourceBlock) {
		if (newSourceBlock != sourceBlock) {
			NotificationChain msgs = null;
			if (sourceBlock != null)
				msgs = ((InternalEObject)sourceBlock).eInverseRemove(this, SimulinkPackage.BLOCK__OUTGOING_LINES, Block.class, msgs);
			if (newSourceBlock != null)
				msgs = ((InternalEObject)newSourceBlock).eInverseAdd(this, SimulinkPackage.BLOCK__OUTGOING_LINES, Block.class, msgs);
			msgs = basicSetSourceBlock(newSourceBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.LINE__SOURCE_BLOCK, newSourceBlock, newSourceBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getTargetBlock() {
		if (targetBlock != null && ((EObject)targetBlock).eIsProxy()) {
			InternalEObject oldTargetBlock = (InternalEObject)targetBlock;
			targetBlock = (Block)eResolveProxy(oldTargetBlock);
			if (targetBlock != oldTargetBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulinkPackage.LINE__TARGET_BLOCK, oldTargetBlock, targetBlock));
			}
		}
		return targetBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetTargetBlock() {
		return targetBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetBlock(Block newTargetBlock, NotificationChain msgs) {
		Block oldTargetBlock = targetBlock;
		targetBlock = newTargetBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimulinkPackage.LINE__TARGET_BLOCK, oldTargetBlock, newTargetBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetBlock(Block newTargetBlock) {
		if (newTargetBlock != targetBlock) {
			NotificationChain msgs = null;
			if (targetBlock != null)
				msgs = ((InternalEObject)targetBlock).eInverseRemove(this, SimulinkPackage.BLOCK__INCOMING_LINES, Block.class, msgs);
			if (newTargetBlock != null)
				msgs = ((InternalEObject)newTargetBlock).eInverseAdd(this, SimulinkPackage.BLOCK__INCOMING_LINES, Block.class, msgs);
			msgs = basicSetTargetBlock(newTargetBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.LINE__TARGET_BLOCK, newTargetBlock, newTargetBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus getBus() {
		if (bus != null && ((EObject)bus).eIsProxy()) {
			InternalEObject oldBus = (InternalEObject)bus;
			bus = (Bus)eResolveProxy(oldBus);
			if (bus != oldBus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulinkPackage.LINE__BUS, oldBus, bus));
			}
		}
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus basicGetBus() {
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBus(Bus newBus) {
		Bus oldBus = bus;
		bus = newBus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.LINE__BUS, oldBus, bus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimulinkPackage.LINE__SOURCE_BLOCK:
				if (sourceBlock != null)
					msgs = ((InternalEObject)sourceBlock).eInverseRemove(this, SimulinkPackage.BLOCK__OUTGOING_LINES, Block.class, msgs);
				return basicSetSourceBlock((Block)otherEnd, msgs);
			case SimulinkPackage.LINE__TARGET_BLOCK:
				if (targetBlock != null)
					msgs = ((InternalEObject)targetBlock).eInverseRemove(this, SimulinkPackage.BLOCK__INCOMING_LINES, Block.class, msgs);
				return basicSetTargetBlock((Block)otherEnd, msgs);
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
			case SimulinkPackage.LINE__SOURCE_BLOCK:
				return basicSetSourceBlock(null, msgs);
			case SimulinkPackage.LINE__TARGET_BLOCK:
				return basicSetTargetBlock(null, msgs);
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
			case SimulinkPackage.LINE__SOURCE_PORT:
				if (resolve) return getSourcePort();
				return basicGetSourcePort();
			case SimulinkPackage.LINE__TARGET_PORT:
				if (resolve) return getTargetPort();
				return basicGetTargetPort();
			case SimulinkPackage.LINE__SOURCE_BLOCK:
				if (resolve) return getSourceBlock();
				return basicGetSourceBlock();
			case SimulinkPackage.LINE__TARGET_BLOCK:
				if (resolve) return getTargetBlock();
				return basicGetTargetBlock();
			case SimulinkPackage.LINE__BUS:
				if (resolve) return getBus();
				return basicGetBus();
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
			case SimulinkPackage.LINE__SOURCE_PORT:
				setSourcePort((OutPortBlock)newValue);
				return;
			case SimulinkPackage.LINE__TARGET_PORT:
				setTargetPort((InPortBlock)newValue);
				return;
			case SimulinkPackage.LINE__SOURCE_BLOCK:
				setSourceBlock((Block)newValue);
				return;
			case SimulinkPackage.LINE__TARGET_BLOCK:
				setTargetBlock((Block)newValue);
				return;
			case SimulinkPackage.LINE__BUS:
				setBus((Bus)newValue);
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
			case SimulinkPackage.LINE__SOURCE_PORT:
				setSourcePort((OutPortBlock)null);
				return;
			case SimulinkPackage.LINE__TARGET_PORT:
				setTargetPort((InPortBlock)null);
				return;
			case SimulinkPackage.LINE__SOURCE_BLOCK:
				setSourceBlock((Block)null);
				return;
			case SimulinkPackage.LINE__TARGET_BLOCK:
				setTargetBlock((Block)null);
				return;
			case SimulinkPackage.LINE__BUS:
				setBus((Bus)null);
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
			case SimulinkPackage.LINE__SOURCE_PORT:
				return sourcePort != null;
			case SimulinkPackage.LINE__TARGET_PORT:
				return targetPort != null;
			case SimulinkPackage.LINE__SOURCE_BLOCK:
				return sourceBlock != null;
			case SimulinkPackage.LINE__TARGET_BLOCK:
				return targetBlock != null;
			case SimulinkPackage.LINE__BUS:
				return bus != null;
		}
		return super.eIsSet(featureID);
	}

} //LineImpl

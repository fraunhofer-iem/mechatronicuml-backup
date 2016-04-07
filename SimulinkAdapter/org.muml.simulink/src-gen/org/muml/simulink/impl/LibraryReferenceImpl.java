/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.simulink.Block;
import org.muml.simulink.InPortBlock;
import org.muml.simulink.LibraryReference;
import org.muml.simulink.OutPortBlock;
import org.muml.simulink.SimulinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.impl.LibraryReferenceImpl#getSourceBlock <em>Source Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryReferenceImpl extends BlockImpl implements LibraryReference {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.LIBRARY_REFERENCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulinkPackage.LIBRARY_REFERENCE__SOURCE_BLOCK, oldSourceBlock, sourceBlock));
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
	public void setSourceBlock(Block newSourceBlock) {
		Block oldSourceBlock = sourceBlock;
		sourceBlock = newSourceBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.LIBRARY_REFERENCE__SOURCE_BLOCK, oldSourceBlock, sourceBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulinkPackage.LIBRARY_REFERENCE__SOURCE_BLOCK:
				if (resolve) return getSourceBlock();
				return basicGetSourceBlock();
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
			case SimulinkPackage.LIBRARY_REFERENCE__SOURCE_BLOCK:
				setSourceBlock((Block)newValue);
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
			case SimulinkPackage.LIBRARY_REFERENCE__SOURCE_BLOCK:
				setSourceBlock((Block)null);
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
			case SimulinkPackage.LIBRARY_REFERENCE__SOURCE_BLOCK:
				return sourceBlock != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * A LibraryReferenc does not have own OutPorts, it returns the
	 * OutPorts from its source block.
	 * @see Block#getOutPorts()
	 * @generated not
	 */
	@Override
	public EList<OutPortBlock> getOutPorts() {
		return this.sourceBlock.getOutPorts();
	}
	
	/**
	 * A LibraryReferenc does not have own InPorts, it returns the
	 * InPorts from its source block.
	 * @see Block#getInPorts()
	 * @generated not
	 */
	@Override
	public EList<InPortBlock> getInPorts() {
		return this.sourceBlock.getInPorts();
	}	

} //LibraryReferenceImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.simulink.Block;
import org.muml.simulink.Line;
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.SubSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.impl.SubSystemImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link org.muml.simulink.impl.SubSystemImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.muml.simulink.impl.SubSystemImpl#getSubSystems <em>Sub Systems</em>}</li>
 *   <li>{@link org.muml.simulink.impl.SubSystemImpl#getAllBlocks <em>All Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubSystemImpl extends BlockImpl implements SubSystem {
	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> lines;

	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> blocks;

	/**
	 * The cached setting delegate for the '{@link #getSubSystems() <em>Sub Systems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSystems()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SUB_SYSTEMS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SimulinkPackage.Literals.SUB_SYSTEM__SUB_SYSTEMS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAllBlocks() <em>All Blocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllBlocks()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_BLOCKS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SimulinkPackage.Literals.SUB_SYSTEM__ALL_BLOCKS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.SUB_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLines() {
		if (lines == null) {
			lines = new EObjectContainmentEList<Line>(Line.class, this, SimulinkPackage.SUB_SYSTEM__LINES);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getBlocks() {
		if (blocks == null) {
			blocks = new EObjectContainmentWithInverseEList<Block>(Block.class, this, SimulinkPackage.SUB_SYSTEM__BLOCKS, SimulinkPackage.BLOCK__PARENT);
		}
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SubSystem> getSubSystems() {
		return (EList<SubSystem>)SUB_SYSTEMS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Block> getAllBlocks() {
		return (EList<Block>)ALL_BLOCKS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBlockByName(final String name) {
		if(name.isEmpty())
			return this;
		int firstSlash = name.indexOf("/");
		
		if(firstSlash != -1) {
			final String rootName = name.substring(0, firstSlash);
			final String childName = name.substring(firstSlash+1);
			Block root = this.getBlockByName(rootName);
			if(root instanceof SubSystem)
				return ((SubSystem)root).getBlockByName(childName);
		}
		else
			for(Block block: this.getAllBlocks())
				if(name.equals(block.getName()))
					return block;
		return null;
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
			case SimulinkPackage.SUB_SYSTEM__BLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBlocks()).basicAdd(otherEnd, msgs);
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
			case SimulinkPackage.SUB_SYSTEM__LINES:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
			case SimulinkPackage.SUB_SYSTEM__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
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
			case SimulinkPackage.SUB_SYSTEM__LINES:
				return getLines();
			case SimulinkPackage.SUB_SYSTEM__BLOCKS:
				return getBlocks();
			case SimulinkPackage.SUB_SYSTEM__SUB_SYSTEMS:
				return getSubSystems();
			case SimulinkPackage.SUB_SYSTEM__ALL_BLOCKS:
				return getAllBlocks();
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
			case SimulinkPackage.SUB_SYSTEM__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends Line>)newValue);
				return;
			case SimulinkPackage.SUB_SYSTEM__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends Block>)newValue);
				return;
			case SimulinkPackage.SUB_SYSTEM__ALL_BLOCKS:
				getAllBlocks().clear();
				getAllBlocks().addAll((Collection<? extends Block>)newValue);
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
			case SimulinkPackage.SUB_SYSTEM__LINES:
				getLines().clear();
				return;
			case SimulinkPackage.SUB_SYSTEM__BLOCKS:
				getBlocks().clear();
				return;
			case SimulinkPackage.SUB_SYSTEM__ALL_BLOCKS:
				getAllBlocks().clear();
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
			case SimulinkPackage.SUB_SYSTEM__LINES:
				return lines != null && !lines.isEmpty();
			case SimulinkPackage.SUB_SYSTEM__BLOCKS:
				return blocks != null && !blocks.isEmpty();
			case SimulinkPackage.SUB_SYSTEM__SUB_SYSTEMS:
				return SUB_SYSTEMS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SimulinkPackage.SUB_SYSTEM__ALL_BLOCKS:
				return ALL_BLOCKS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case SimulinkPackage.SUB_SYSTEM___GET_BLOCK_BY_NAME__STRING:
				return getBlockByName((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SubSystemImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.simulink.Line;
import org.muml.simulink.adapter.corrmodel.AssemblyInst2Line;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Inst2 Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.AssemblyInst2LineImpl#getAssemblyInst <em>Assembly Inst</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.AssemblyInst2LineImpl#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyInst2LineImpl extends AbstractContainerCorrespondenceNodeImpl implements AssemblyInst2Line {
	/**
	 * The cached value of the '{@link #getAssemblyInst() <em>Assembly Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyInst()
	 * @generated
	 * @ordered
	 */
	protected AssemblyConnectorInstance assemblyInst;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> line;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyInst2LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fujaba2simulinkPackage.Literals.ASSEMBLY_INST2_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnectorInstance getAssemblyInst() {
		if (assemblyInst != null && assemblyInst.eIsProxy()) {
			InternalEObject oldAssemblyInst = (InternalEObject)assemblyInst;
			assemblyInst = (AssemblyConnectorInstance)eResolveProxy(oldAssemblyInst);
			if (assemblyInst != oldAssemblyInst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.ASSEMBLY_INST2_LINE__ASSEMBLY_INST, oldAssemblyInst, assemblyInst));
			}
		}
		return assemblyInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnectorInstance basicGetAssemblyInst() {
		return assemblyInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyInst(AssemblyConnectorInstance newAssemblyInst) {
		AssemblyConnectorInstance oldAssemblyInst = assemblyInst;
		assemblyInst = newAssemblyInst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.ASSEMBLY_INST2_LINE__ASSEMBLY_INST, oldAssemblyInst, assemblyInst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLine() {
		if (line == null) {
			line = new EObjectResolvingEList<Line>(Line.class, this, Fujaba2simulinkPackage.ASSEMBLY_INST2_LINE__LINE);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Fujaba2simulinkPackage.ASSEMBLY_INST2_LINE__ASSEMBLY_INST:
				if (resolve) return getAssemblyInst();
				return basicGetAssemblyInst();
			case Fujaba2simulinkPackage.ASSEMBLY_INST2_LINE__LINE:
				return getLine();
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
			case Fujaba2simulinkPackage.ASSEMBLY_INST2_LINE__ASSEMBLY_INST:
				setAssemblyInst((AssemblyConnectorInstance)newValue);
				return;
			case Fujaba2simulinkPackage.ASSEMBLY_INST2_LINE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends Line>)newValue);
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
			case Fujaba2simulinkPackage.ASSEMBLY_INST2_LINE__ASSEMBLY_INST:
				setAssemblyInst((AssemblyConnectorInstance)null);
				return;
			case Fujaba2simulinkPackage.ASSEMBLY_INST2_LINE__LINE:
				getLine().clear();
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
			case Fujaba2simulinkPackage.ASSEMBLY_INST2_LINE__ASSEMBLY_INST:
				return assemblyInst != null;
			case Fujaba2simulinkPackage.ASSEMBLY_INST2_LINE__LINE:
				return line != null && !line.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssemblyInst2LineImpl

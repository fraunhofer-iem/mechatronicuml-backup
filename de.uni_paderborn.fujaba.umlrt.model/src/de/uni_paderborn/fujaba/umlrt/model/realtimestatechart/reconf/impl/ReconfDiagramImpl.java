/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortReconf;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfDiagramImpl#getPortInstanceReconfs <em>Port Instance Reconfs</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfDiagramImpl#getDelegationReconfs <em>Delegation Reconfs</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfDiagramImpl#getPortReconfs <em>Port Reconfs</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfDiagramImpl#getAssemblyReconfs <em>Assembly Reconfs</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfDiagramImpl#getUMLComplexRealtimeState <em>UML Complex Realtime State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReconfDiagramImpl extends EObjectImpl implements ReconfDiagram {
	/**
	 * The cached value of the '{@link #getPortInstanceReconfs() <em>Port Instance Reconfs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInstanceReconfs()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstanceReconf> portInstanceReconfs;

	/**
	 * The cached value of the '{@link #getDelegationReconfs() <em>Delegation Reconfs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationReconfs()
	 * @generated
	 * @ordered
	 */
	protected EList<DelegationReconf> delegationReconfs;

	/**
	 * The cached value of the '{@link #getPortReconfs() <em>Port Reconfs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortReconfs()
	 * @generated
	 * @ordered
	 */
	protected EList<PortReconf> portReconfs;

	/**
	 * The cached value of the '{@link #getAssemblyReconfs() <em>Assembly Reconfs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyReconfs()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyReconf> assemblyReconfs;

	/**
	 * The cached value of the '{@link #getUMLComplexRealtimeState() <em>UML Complex Realtime State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLComplexRealtimeState()
	 * @generated
	 * @ordered
	 */
	protected State uMLComplexRealtimeState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfPackage.Literals.RECONF_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortInstanceReconf> getPortInstanceReconfs() {
		if (portInstanceReconfs == null) {
			portInstanceReconfs = new EObjectResolvingEList<PortInstanceReconf>(PortInstanceReconf.class, this, ReconfPackage.RECONF_DIAGRAM__PORT_INSTANCE_RECONFS);
		}
		return portInstanceReconfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelegationReconf> getDelegationReconfs() {
		if (delegationReconfs == null) {
			delegationReconfs = new EObjectResolvingEList<DelegationReconf>(DelegationReconf.class, this, ReconfPackage.RECONF_DIAGRAM__DELEGATION_RECONFS);
		}
		return delegationReconfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortReconf> getPortReconfs() {
		if (portReconfs == null) {
			portReconfs = new EObjectResolvingEList<PortReconf>(PortReconf.class, this, ReconfPackage.RECONF_DIAGRAM__PORT_RECONFS);
		}
		return portReconfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyReconf> getAssemblyReconfs() {
		if (assemblyReconfs == null) {
			assemblyReconfs = new EObjectResolvingEList<AssemblyReconf>(AssemblyReconf.class, this, ReconfPackage.RECONF_DIAGRAM__ASSEMBLY_RECONFS);
		}
		return assemblyReconfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getUMLComplexRealtimeState() {
		if (uMLComplexRealtimeState != null && uMLComplexRealtimeState.eIsProxy()) {
			InternalEObject oldUMLComplexRealtimeState = (InternalEObject)uMLComplexRealtimeState;
			uMLComplexRealtimeState = (State)eResolveProxy(oldUMLComplexRealtimeState);
			if (uMLComplexRealtimeState != oldUMLComplexRealtimeState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.RECONF_DIAGRAM__UML_COMPLEX_REALTIME_STATE, oldUMLComplexRealtimeState, uMLComplexRealtimeState));
			}
		}
		return uMLComplexRealtimeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetUMLComplexRealtimeState() {
		return uMLComplexRealtimeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLComplexRealtimeState(State newUMLComplexRealtimeState) {
		State oldUMLComplexRealtimeState = uMLComplexRealtimeState;
		uMLComplexRealtimeState = newUMLComplexRealtimeState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.RECONF_DIAGRAM__UML_COMPLEX_REALTIME_STATE, oldUMLComplexRealtimeState, uMLComplexRealtimeState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstanceReconf> iteratorOfComponentInstanceReconf() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReconfPackage.RECONF_DIAGRAM__PORT_INSTANCE_RECONFS:
				return getPortInstanceReconfs();
			case ReconfPackage.RECONF_DIAGRAM__DELEGATION_RECONFS:
				return getDelegationReconfs();
			case ReconfPackage.RECONF_DIAGRAM__PORT_RECONFS:
				return getPortReconfs();
			case ReconfPackage.RECONF_DIAGRAM__ASSEMBLY_RECONFS:
				return getAssemblyReconfs();
			case ReconfPackage.RECONF_DIAGRAM__UML_COMPLEX_REALTIME_STATE:
				if (resolve) return getUMLComplexRealtimeState();
				return basicGetUMLComplexRealtimeState();
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
			case ReconfPackage.RECONF_DIAGRAM__PORT_INSTANCE_RECONFS:
				getPortInstanceReconfs().clear();
				getPortInstanceReconfs().addAll((Collection<? extends PortInstanceReconf>)newValue);
				return;
			case ReconfPackage.RECONF_DIAGRAM__DELEGATION_RECONFS:
				getDelegationReconfs().clear();
				getDelegationReconfs().addAll((Collection<? extends DelegationReconf>)newValue);
				return;
			case ReconfPackage.RECONF_DIAGRAM__PORT_RECONFS:
				getPortReconfs().clear();
				getPortReconfs().addAll((Collection<? extends PortReconf>)newValue);
				return;
			case ReconfPackage.RECONF_DIAGRAM__ASSEMBLY_RECONFS:
				getAssemblyReconfs().clear();
				getAssemblyReconfs().addAll((Collection<? extends AssemblyReconf>)newValue);
				return;
			case ReconfPackage.RECONF_DIAGRAM__UML_COMPLEX_REALTIME_STATE:
				setUMLComplexRealtimeState((State)newValue);
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
			case ReconfPackage.RECONF_DIAGRAM__PORT_INSTANCE_RECONFS:
				getPortInstanceReconfs().clear();
				return;
			case ReconfPackage.RECONF_DIAGRAM__DELEGATION_RECONFS:
				getDelegationReconfs().clear();
				return;
			case ReconfPackage.RECONF_DIAGRAM__PORT_RECONFS:
				getPortReconfs().clear();
				return;
			case ReconfPackage.RECONF_DIAGRAM__ASSEMBLY_RECONFS:
				getAssemblyReconfs().clear();
				return;
			case ReconfPackage.RECONF_DIAGRAM__UML_COMPLEX_REALTIME_STATE:
				setUMLComplexRealtimeState((State)null);
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
			case ReconfPackage.RECONF_DIAGRAM__PORT_INSTANCE_RECONFS:
				return portInstanceReconfs != null && !portInstanceReconfs.isEmpty();
			case ReconfPackage.RECONF_DIAGRAM__DELEGATION_RECONFS:
				return delegationReconfs != null && !delegationReconfs.isEmpty();
			case ReconfPackage.RECONF_DIAGRAM__PORT_RECONFS:
				return portReconfs != null && !portReconfs.isEmpty();
			case ReconfPackage.RECONF_DIAGRAM__ASSEMBLY_RECONFS:
				return assemblyReconfs != null && !assemblyReconfs.isEmpty();
			case ReconfPackage.RECONF_DIAGRAM__UML_COMPLEX_REALTIME_STATE:
				return uMLComplexRealtimeState != null;
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
			case ReconfPackage.RECONF_DIAGRAM___ITERATOR_OF_COMPONENT_INSTANCE_RECONF:
				return iteratorOfComponentInstanceReconf();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReconfDiagramImpl

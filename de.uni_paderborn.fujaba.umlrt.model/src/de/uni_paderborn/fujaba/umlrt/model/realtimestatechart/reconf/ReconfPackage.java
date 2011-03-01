/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfFactory
 * @model kind="package"
 * @generated
 */
public interface ReconfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reconf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/uni_paderborn/fujaba/umlrt/emf/model/realtimestatechart.reconf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reconf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReconfPackage eINSTANCE = de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.AssemblyReconfImpl <em>Assembly Reconf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.AssemblyReconfImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl#getAssemblyReconf()
	 * @generated
	 */
	int ASSEMBLY_RECONF = 0;

	/**
	 * The feature id for the '<em><b>Connector Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_RECONF__CONNECTOR_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Req Port Instance Reconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_RECONF__REQ_PORT_INSTANCE_RECONF = 1;

	/**
	 * The feature id for the '<em><b>Prov Port Instance Reconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_RECONF__PROV_PORT_INSTANCE_RECONF = 2;

	/**
	 * The feature id for the '<em><b>Reconf Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_RECONF__RECONF_DIAGRAM = 3;

	/**
	 * The number of structural features of the '<em>Assembly Reconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_RECONF_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Assembly Reconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_RECONF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ComponentInstanceReconfImpl <em>Component Instance Reconf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ComponentInstanceReconfImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl#getComponentInstanceReconf()
	 * @generated
	 */
	int COMPONENT_INSTANCE_RECONF = 1;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_RECONF__COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Reconf Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_RECONF__RECONF_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>State To Be Activated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_RECONF__STATE_TO_BE_ACTIVATED = 2;

	/**
	 * The number of structural features of the '<em>Component Instance Reconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_RECONF_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get CName</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_RECONF___GET_CNAME = 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_RECONF___GET_NAME = 1;

	/**
	 * The number of operations of the '<em>Component Instance Reconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_RECONF_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.DelegationReconfImpl <em>Delegation Reconf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.DelegationReconfImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl#getDelegationReconf()
	 * @generated
	 */
	int DELEGATION_RECONF = 2;

	/**
	 * The feature id for the '<em><b>Port Reconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_RECONF__PORT_RECONF = 0;

	/**
	 * The feature id for the '<em><b>Port Instance Reconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_RECONF__PORT_INSTANCE_RECONF = 1;

	/**
	 * The feature id for the '<em><b>Reconf Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_RECONF__RECONF_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_RECONF__NAME = 3;

	/**
	 * The number of structural features of the '<em>Delegation Reconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_RECONF_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Delegation Reconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_RECONF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.PortInstanceReconfImpl <em>Port Instance Reconf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.PortInstanceReconfImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl#getPortInstanceReconf()
	 * @generated
	 */
	int PORT_INSTANCE_RECONF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_RECONF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Component Instance Reconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_RECONF__COMPONENT_INSTANCE_RECONF = 1;

	/**
	 * The feature id for the '<em><b>Port By Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_RECONF__PORT_BY_COMPONENT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Reconf Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_RECONF__RECONF_DIAGRAM = 3;

	/**
	 * The number of structural features of the '<em>Port Instance Reconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_RECONF_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Port Instance Reconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_RECONF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.PortReconfImpl <em>Port Reconf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.PortReconfImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl#getPortReconf()
	 * @generated
	 */
	int PORT_RECONF = 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RECONF__PORT = 0;

	/**
	 * The feature id for the '<em><b>Reconf Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RECONF__RECONF_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RECONF__NAME = 2;

	/**
	 * The number of structural features of the '<em>Port Reconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RECONF_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Port Reconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RECONF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfDiagramImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl#getReconfDiagram()
	 * @generated
	 */
	int RECONF_DIAGRAM = 5;

	/**
	 * The feature id for the '<em><b>Port Instance Reconfs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONF_DIAGRAM__PORT_INSTANCE_RECONFS = 0;

	/**
	 * The feature id for the '<em><b>Delegation Reconfs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONF_DIAGRAM__DELEGATION_RECONFS = 1;

	/**
	 * The feature id for the '<em><b>Port Reconfs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONF_DIAGRAM__PORT_RECONFS = 2;

	/**
	 * The feature id for the '<em><b>Assembly Reconfs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONF_DIAGRAM__ASSEMBLY_RECONFS = 3;

	/**
	 * The feature id for the '<em><b>UML Complex Realtime State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONF_DIAGRAM__UML_COMPLEX_REALTIME_STATE = 4;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONF_DIAGRAM_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Iterator Of Component Instance Reconf</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONF_DIAGRAM___ITERATOR_OF_COMPONENT_INSTANCE_RECONF = 0;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONF_DIAGRAM_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf <em>Assembly Reconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Reconf</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf
	 * @generated
	 */
	EClass getAssemblyReconf();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getConnectorInstance <em>Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector Instance</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getConnectorInstance()
	 * @see #getAssemblyReconf()
	 * @generated
	 */
	EReference getAssemblyReconf_ConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getReqPortInstanceReconf <em>Req Port Instance Reconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Req Port Instance Reconf</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getReqPortInstanceReconf()
	 * @see #getAssemblyReconf()
	 * @generated
	 */
	EReference getAssemblyReconf_ReqPortInstanceReconf();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getProvPortInstanceReconf <em>Prov Port Instance Reconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prov Port Instance Reconf</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getProvPortInstanceReconf()
	 * @see #getAssemblyReconf()
	 * @generated
	 */
	EReference getAssemblyReconf_ProvPortInstanceReconf();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getReconfDiagram <em>Reconf Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconf Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getReconfDiagram()
	 * @see #getAssemblyReconf()
	 * @generated
	 */
	EReference getAssemblyReconf_ReconfDiagram();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf <em>Component Instance Reconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance Reconf</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf
	 * @generated
	 */
	EClass getComponentInstanceReconf();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf#getComponentInstance()
	 * @see #getComponentInstanceReconf()
	 * @generated
	 */
	EReference getComponentInstanceReconf_ComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf#getReconfDiagram <em>Reconf Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconf Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf#getReconfDiagram()
	 * @see #getComponentInstanceReconf()
	 * @generated
	 */
	EReference getComponentInstanceReconf_ReconfDiagram();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf#getStateToBeActivated <em>State To Be Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State To Be Activated</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf#getStateToBeActivated()
	 * @see #getComponentInstanceReconf()
	 * @generated
	 */
	EReference getComponentInstanceReconf_StateToBeActivated();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf#getCName() <em>Get CName</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get CName</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf#getCName()
	 * @generated
	 */
	EOperation getComponentInstanceReconf__GetCName();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf#getName()
	 * @generated
	 */
	EOperation getComponentInstanceReconf__GetName();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf <em>Delegation Reconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Reconf</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf
	 * @generated
	 */
	EClass getDelegationReconf();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getPortReconf <em>Port Reconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Reconf</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getPortReconf()
	 * @see #getDelegationReconf()
	 * @generated
	 */
	EReference getDelegationReconf_PortReconf();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getPortInstanceReconf <em>Port Instance Reconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Instance Reconf</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getPortInstanceReconf()
	 * @see #getDelegationReconf()
	 * @generated
	 */
	EReference getDelegationReconf_PortInstanceReconf();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getReconfDiagram <em>Reconf Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconf Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getReconfDiagram()
	 * @see #getDelegationReconf()
	 * @generated
	 */
	EReference getDelegationReconf_ReconfDiagram();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getName()
	 * @see #getDelegationReconf()
	 * @generated
	 */
	EAttribute getDelegationReconf_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf <em>Port Instance Reconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Instance Reconf</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf
	 * @generated
	 */
	EClass getPortInstanceReconf();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getName()
	 * @see #getPortInstanceReconf()
	 * @generated
	 */
	EAttribute getPortInstanceReconf_Name();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getComponentInstanceReconf <em>Component Instance Reconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance Reconf</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getComponentInstanceReconf()
	 * @see #getPortInstanceReconf()
	 * @generated
	 */
	EReference getPortInstanceReconf_ComponentInstanceReconf();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getPortByComponentInstance <em>Port By Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port By Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getPortByComponentInstance()
	 * @see #getPortInstanceReconf()
	 * @generated
	 */
	EReference getPortInstanceReconf_PortByComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getReconfDiagram <em>Reconf Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconf Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getReconfDiagram()
	 * @see #getPortInstanceReconf()
	 * @generated
	 */
	EReference getPortInstanceReconf_ReconfDiagram();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortReconf <em>Port Reconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Reconf</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortReconf
	 * @generated
	 */
	EClass getPortReconf();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortReconf#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortReconf#getPort()
	 * @see #getPortReconf()
	 * @generated
	 */
	EReference getPortReconf_Port();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortReconf#getReconfDiagram <em>Reconf Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconf Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortReconf#getReconfDiagram()
	 * @see #getPortReconf()
	 * @generated
	 */
	EReference getPortReconf_ReconfDiagram();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortReconf#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortReconf#getName()
	 * @see #getPortReconf()
	 * @generated
	 */
	EAttribute getPortReconf_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram
	 * @generated
	 */
	EClass getReconfDiagram();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getPortInstanceReconfs <em>Port Instance Reconfs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Instance Reconfs</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getPortInstanceReconfs()
	 * @see #getReconfDiagram()
	 * @generated
	 */
	EReference getReconfDiagram_PortInstanceReconfs();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getDelegationReconfs <em>Delegation Reconfs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegation Reconfs</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getDelegationReconfs()
	 * @see #getReconfDiagram()
	 * @generated
	 */
	EReference getReconfDiagram_DelegationReconfs();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getPortReconfs <em>Port Reconfs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Reconfs</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getPortReconfs()
	 * @see #getReconfDiagram()
	 * @generated
	 */
	EReference getReconfDiagram_PortReconfs();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getAssemblyReconfs <em>Assembly Reconfs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assembly Reconfs</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getAssemblyReconfs()
	 * @see #getReconfDiagram()
	 * @generated
	 */
	EReference getReconfDiagram_AssemblyReconfs();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getUMLComplexRealtimeState <em>UML Complex Realtime State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>UML Complex Realtime State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getUMLComplexRealtimeState()
	 * @see #getReconfDiagram()
	 * @generated
	 */
	EReference getReconfDiagram_UMLComplexRealtimeState();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#iteratorOfComponentInstanceReconf() <em>Iterator Of Component Instance Reconf</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iterator Of Component Instance Reconf</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#iteratorOfComponentInstanceReconf()
	 * @generated
	 */
	EOperation getReconfDiagram__IteratorOfComponentInstanceReconf();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReconfFactory getReconfFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.AssemblyReconfImpl <em>Assembly Reconf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.AssemblyReconfImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl#getAssemblyReconf()
		 * @generated
		 */
		EClass ASSEMBLY_RECONF = eINSTANCE.getAssemblyReconf();

		/**
		 * The meta object literal for the '<em><b>Connector Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_RECONF__CONNECTOR_INSTANCE = eINSTANCE.getAssemblyReconf_ConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Req Port Instance Reconf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_RECONF__REQ_PORT_INSTANCE_RECONF = eINSTANCE.getAssemblyReconf_ReqPortInstanceReconf();

		/**
		 * The meta object literal for the '<em><b>Prov Port Instance Reconf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_RECONF__PROV_PORT_INSTANCE_RECONF = eINSTANCE.getAssemblyReconf_ProvPortInstanceReconf();

		/**
		 * The meta object literal for the '<em><b>Reconf Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_RECONF__RECONF_DIAGRAM = eINSTANCE.getAssemblyReconf_ReconfDiagram();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ComponentInstanceReconfImpl <em>Component Instance Reconf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ComponentInstanceReconfImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl#getComponentInstanceReconf()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE_RECONF = eINSTANCE.getComponentInstanceReconf();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_RECONF__COMPONENT_INSTANCE = eINSTANCE.getComponentInstanceReconf_ComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Reconf Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_RECONF__RECONF_DIAGRAM = eINSTANCE.getComponentInstanceReconf_ReconfDiagram();

		/**
		 * The meta object literal for the '<em><b>State To Be Activated</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_RECONF__STATE_TO_BE_ACTIVATED = eINSTANCE.getComponentInstanceReconf_StateToBeActivated();

		/**
		 * The meta object literal for the '<em><b>Get CName</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT_INSTANCE_RECONF___GET_CNAME = eINSTANCE.getComponentInstanceReconf__GetCName();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT_INSTANCE_RECONF___GET_NAME = eINSTANCE.getComponentInstanceReconf__GetName();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.DelegationReconfImpl <em>Delegation Reconf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.DelegationReconfImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl#getDelegationReconf()
		 * @generated
		 */
		EClass DELEGATION_RECONF = eINSTANCE.getDelegationReconf();

		/**
		 * The meta object literal for the '<em><b>Port Reconf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_RECONF__PORT_RECONF = eINSTANCE.getDelegationReconf_PortReconf();

		/**
		 * The meta object literal for the '<em><b>Port Instance Reconf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_RECONF__PORT_INSTANCE_RECONF = eINSTANCE.getDelegationReconf_PortInstanceReconf();

		/**
		 * The meta object literal for the '<em><b>Reconf Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_RECONF__RECONF_DIAGRAM = eINSTANCE.getDelegationReconf_ReconfDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION_RECONF__NAME = eINSTANCE.getDelegationReconf_Name();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.PortInstanceReconfImpl <em>Port Instance Reconf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.PortInstanceReconfImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl#getPortInstanceReconf()
		 * @generated
		 */
		EClass PORT_INSTANCE_RECONF = eINSTANCE.getPortInstanceReconf();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_INSTANCE_RECONF__NAME = eINSTANCE.getPortInstanceReconf_Name();

		/**
		 * The meta object literal for the '<em><b>Component Instance Reconf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE_RECONF__COMPONENT_INSTANCE_RECONF = eINSTANCE.getPortInstanceReconf_ComponentInstanceReconf();

		/**
		 * The meta object literal for the '<em><b>Port By Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE_RECONF__PORT_BY_COMPONENT_INSTANCE = eINSTANCE.getPortInstanceReconf_PortByComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Reconf Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE_RECONF__RECONF_DIAGRAM = eINSTANCE.getPortInstanceReconf_ReconfDiagram();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.PortReconfImpl <em>Port Reconf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.PortReconfImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl#getPortReconf()
		 * @generated
		 */
		EClass PORT_RECONF = eINSTANCE.getPortReconf();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_RECONF__PORT = eINSTANCE.getPortReconf_Port();

		/**
		 * The meta object literal for the '<em><b>Reconf Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_RECONF__RECONF_DIAGRAM = eINSTANCE.getPortReconf_ReconfDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_RECONF__NAME = eINSTANCE.getPortReconf_Name();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfDiagramImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ReconfPackageImpl#getReconfDiagram()
		 * @generated
		 */
		EClass RECONF_DIAGRAM = eINSTANCE.getReconfDiagram();

		/**
		 * The meta object literal for the '<em><b>Port Instance Reconfs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONF_DIAGRAM__PORT_INSTANCE_RECONFS = eINSTANCE.getReconfDiagram_PortInstanceReconfs();

		/**
		 * The meta object literal for the '<em><b>Delegation Reconfs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONF_DIAGRAM__DELEGATION_RECONFS = eINSTANCE.getReconfDiagram_DelegationReconfs();

		/**
		 * The meta object literal for the '<em><b>Port Reconfs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONF_DIAGRAM__PORT_RECONFS = eINSTANCE.getReconfDiagram_PortReconfs();

		/**
		 * The meta object literal for the '<em><b>Assembly Reconfs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONF_DIAGRAM__ASSEMBLY_RECONFS = eINSTANCE.getReconfDiagram_AssemblyReconfs();

		/**
		 * The meta object literal for the '<em><b>UML Complex Realtime State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONF_DIAGRAM__UML_COMPLEX_REALTIME_STATE = eINSTANCE.getReconfDiagram_UMLComplexRealtimeState();

		/**
		 * The meta object literal for the '<em><b>Iterator Of Component Instance Reconf</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECONF_DIAGRAM___ITERATOR_OF_COMPONENT_INSTANCE_RECONF = eINSTANCE.getReconfDiagram__IteratorOfComponentInstanceReconf();

	}

} //ReconfPackage

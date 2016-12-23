/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkFactory
 * @model kind="package"
 * @generated
 */
public interface Fujaba2simulinkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "corrmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/simulink/adapter/corrmodel/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fujaba2simulink";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fujaba2simulinkPackage eINSTANCE = org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl <em>Abstract Container Correspondence Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl
	 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getAbstractContainerCorrespondenceNode()
	 * @generated
	 */
	int ABSTRACT_CONTAINER_CORRESPONDENCE_NODE = 0;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP = 0;

	/**
	 * The number of structural features of the '<em>Abstract Container Correspondence Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.impl.RootNode2SimulinkContainerImpl <em>Root Node2 Simulink Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.impl.RootNode2SimulinkContainerImpl
	 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getRootNode2SimulinkContainer()
	 * @generated
	 */
	int ROOT_NODE2_SIMULINK_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE2_SIMULINK_CONTAINER__CHILD_CORRESP = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Root Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE2_SIMULINK_CONTAINER__ROOT_NODE = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Simulink Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE2_SIMULINK_CONTAINER__SIMULINK_CONTAINER = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Packet Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE2_SIMULINK_CONTAINER__PACKET_BUS = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bus Of Busses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE2_SIMULINK_CONTAINER__BUS_OF_BUSSES = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cic2ss</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE2_SIMULINK_CONTAINER__CIC2SS = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Atom Comp Lib</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE2_SIMULINK_CONTAINER__ATOM_COMP_LIB = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Root Node2 Simulink Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_NODE2_SIMULINK_CONTAINER_FEATURE_COUNT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.impl.ModElCat2SimLibImpl <em>Mod El Cat2 Sim Lib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.impl.ModElCat2SimLibImpl
	 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getModElCat2SimLib()
	 * @generated
	 */
	int MOD_EL_CAT2_SIM_LIB = 2;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_EL_CAT2_SIM_LIB__CHILD_CORRESP = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Mod El Cat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_EL_CAT2_SIM_LIB__MOD_EL_CAT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sim Lib</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_EL_CAT2_SIM_LIB__SIM_LIB = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mod El Cat2 Sim Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_EL_CAT2_SIM_LIB_FEATURE_COUNT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.impl.CompInstConfig2SubSysImpl <em>Comp Inst Config2 Sub Sys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.impl.CompInstConfig2SubSysImpl
	 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getCompInstConfig2SubSys()
	 * @generated
	 */
	int COMP_INST_CONFIG2_SUB_SYS = 3;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST_CONFIG2_SUB_SYS__CHILD_CORRESP = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Inst Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST_CONFIG2_SUB_SYS__INST_CONFIG = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Sys</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST_CONFIG2_SUB_SYS__SUB_SYS = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST_CONFIG2_SUB_SYS__COMMUNICATION_SWITCH = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bus Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST_CONFIG2_SUB_SYS__BUS_CREATOR = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bus Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST_CONFIG2_SUB_SYS__BUS_SELECTOR = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bus Creator Out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST_CONFIG2_SUB_SYS__BUS_CREATOR_OUT_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bus Selector In Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST_CONFIG2_SUB_SYS__BUS_SELECTOR_IN_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bus Of Busses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST_CONFIG2_SUB_SYS__BUS_OF_BUSSES = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CS in Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST_CONFIG2_SUB_SYS__CS_IN_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>CS out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST_CONFIG2_SUB_SYS__CS_OUT_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Comp Inst Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST_CONFIG2_SUB_SYS__COMP_INST_NAME = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Comp Inst Config2 Sub Sys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST_CONFIG2_SUB_SYS_FEATURE_COUNT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl <em>Inst Config2 Sim Mod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl
	 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getInstConfig2SimMod()
	 * @generated
	 */
	int INST_CONFIG2_SIM_MOD = 4;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONFIG2_SIM_MOD__CHILD_CORRESP = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Inst Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONFIG2_SIM_MOD__INST_CONFIG = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Sys</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONFIG2_SIM_MOD__SUB_SYS = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONFIG2_SIM_MOD__COMMUNICATION_SWITCH = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bus Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONFIG2_SIM_MOD__BUS_CREATOR = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bus Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONFIG2_SIM_MOD__BUS_SELECTOR = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bus Creator Out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONFIG2_SIM_MOD__BUS_CREATOR_OUT_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bus Selector In Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONFIG2_SIM_MOD__BUS_SELECTOR_IN_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bus Of Busses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONFIG2_SIM_MOD__BUS_OF_BUSSES = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CS in Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONFIG2_SIM_MOD__CS_IN_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>CS out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONFIG2_SIM_MOD__CS_OUT_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Comp Inst Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONFIG2_SIM_MOD__COMP_INST_NAME = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Model Element Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONFIG2_SIM_MOD__MODEL_ELEMENT_CATEGORY = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Inst Config2 Sim Mod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONFIG2_SIM_MOD_FEATURE_COUNT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.impl.AtomComp2AtomSysImpl <em>Atom Comp2 Atom Sys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.impl.AtomComp2AtomSysImpl
	 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getAtomComp2AtomSys()
	 * @generated
	 */
	int ATOM_COMP2_ATOM_SYS = 5;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_COMP2_ATOM_SYS__CHILD_CORRESP = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Clock Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_COMP2_ATOM_SYS__CLOCK_SIGNAL = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_COMP2_ATOM_SYS__CHART = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_COMP2_ATOM_SYS__COMP = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sys</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_COMP2_ATOM_SYS__SYS = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Atom Comp2 Atom Sys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_COMP2_ATOM_SYS_FEATURE_COUNT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl <em>Struct Comp2 Sub Sys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl
	 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getStructComp2SubSys()
	 * @generated
	 */
	int STRUCT_COMP2_SUB_SYS = 6;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS__CHILD_CORRESP = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Inst Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS__INST_CONFIG = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Sys</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS__SUB_SYS = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS__COMMUNICATION_SWITCH = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bus Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS__BUS_CREATOR = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bus Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS__BUS_SELECTOR = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bus Creator Out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS__BUS_CREATOR_OUT_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bus Selector In Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS__BUS_SELECTOR_IN_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bus Of Busses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS__BUS_OF_BUSSES = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CS in Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS__CS_IN_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>CS out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS__CS_OUT_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Comp Inst Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS__COMP_INST_NAME = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS__COMPONENT_INSTANCE = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Library Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS__LIBRARY_REFERENCE = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS__COMP = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Struct Comp2 Sub Sys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_COMP2_SUB_SYS_FEATURE_COUNT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.impl.CompInst2LibRefImpl <em>Comp Inst2 Lib Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.impl.CompInst2LibRefImpl
	 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getCompInst2LibRef()
	 * @generated
	 */
	int COMP_INST2_LIB_REF = 7;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST2_LIB_REF__CHILD_CORRESP = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Comp Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST2_LIB_REF__COMP_INST = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lib Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST2_LIB_REF__LIB_REF = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comp Inst2 Lib Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INST2_LIB_REF_FEATURE_COUNT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl <em>Port2 Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl
	 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getPort2Ports()
	 * @generated
	 */
	int PORT2_PORTS = 8;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__CHILD_CORRESP = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__IN_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__OUT_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Help in Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__HELP_IN_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Help out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__HELP_OUT_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Port Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__PORT_INST = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Multi Port Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__MULTI_PORT_INST = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comp Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__COMP_INST = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sc Read In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__SC_READ_IN = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sc Read Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__SC_READ_OUT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sc Write In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__SC_WRITE_IN = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Sc Write Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__SC_WRITE_OUT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Sc help Read In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__SC_HELP_READ_IN = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Sc help Read Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__SC_HELP_READ_OUT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Sc help Write In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__SC_HELP_WRITE_IN = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sc help Write Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__SC_HELP_WRITE_OUT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Mi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__MI = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Net address in Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__NET_ADDRESS_IN_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Receiver net address in Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__RECEIVER_NET_ADDRESS_IN_PORT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__CONSTANT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__PORT_TYPE = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Line From Read Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__LINE_FROM_READ_OUT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Line To Read In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__LINE_TO_READ_IN = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Link Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS__LINK_LAYER = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Port2 Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT2_PORTS_FEATURE_COUNT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.impl.AssemblyInst2LineImpl <em>Assembly Inst2 Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.impl.AssemblyInst2LineImpl
	 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getAssemblyInst2Line()
	 * @generated
	 */
	int ASSEMBLY_INST2_LINE = 9;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INST2_LINE__CHILD_CORRESP = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Assembly Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INST2_LINE__ASSEMBLY_INST = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INST2_LINE__LINE = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assembly Inst2 Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INST2_LINE_FEATURE_COUNT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.simulink.adapter.corrmodel.impl.Del2LineImpl <em>Del2 Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.simulink.adapter.corrmodel.impl.Del2LineImpl
	 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getDel2Line()
	 * @generated
	 */
	int DEL2_LINE = 10;

	/**
	 * The feature id for the '<em><b>Child Corresp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL2_LINE__CHILD_CORRESP = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP;

	/**
	 * The feature id for the '<em><b>Delegation Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL2_LINE__DELEGATION_INSTANCE = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL2_LINE__LINE = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Del2 Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL2_LINE_FEATURE_COUNT = ABSTRACT_CONTAINER_CORRESPONDENCE_NODE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode <em>Abstract Container Correspondence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Container Correspondence Node</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode
	 * @generated
	 */
	EClass getAbstractContainerCorrespondenceNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode#getChildCorresp <em>Child Corresp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Corresp</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode#getChildCorresp()
	 * @see #getAbstractContainerCorrespondenceNode()
	 * @generated
	 */
	EReference getAbstractContainerCorrespondenceNode_ChildCorresp();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer <em>Root Node2 Simulink Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Node2 Simulink Container</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer
	 * @generated
	 */
	EClass getRootNode2SimulinkContainer();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer#getRootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Node</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer#getRootNode()
	 * @see #getRootNode2SimulinkContainer()
	 * @generated
	 */
	EReference getRootNode2SimulinkContainer_RootNode();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer#getSimulinkContainer <em>Simulink Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simulink Container</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer#getSimulinkContainer()
	 * @see #getRootNode2SimulinkContainer()
	 * @generated
	 */
	EReference getRootNode2SimulinkContainer_SimulinkContainer();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer#getPacketBus <em>Packet Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Packet Bus</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer#getPacketBus()
	 * @see #getRootNode2SimulinkContainer()
	 * @generated
	 */
	EReference getRootNode2SimulinkContainer_PacketBus();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer#getBusOfBusses <em>Bus Of Busses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus Of Busses</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer#getBusOfBusses()
	 * @see #getRootNode2SimulinkContainer()
	 * @generated
	 */
	EReference getRootNode2SimulinkContainer_BusOfBusses();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer#getCic2ss <em>Cic2ss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cic2ss</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer#getCic2ss()
	 * @see #getRootNode2SimulinkContainer()
	 * @generated
	 */
	EReference getRootNode2SimulinkContainer_Cic2ss();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer#getAtomCompLib <em>Atom Comp Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atom Comp Lib</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer#getAtomCompLib()
	 * @see #getRootNode2SimulinkContainer()
	 * @generated
	 */
	EReference getRootNode2SimulinkContainer_AtomCompLib();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.ModElCat2SimLib <em>Mod El Cat2 Sim Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mod El Cat2 Sim Lib</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.ModElCat2SimLib
	 * @generated
	 */
	EClass getModElCat2SimLib();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.ModElCat2SimLib#getModElCat <em>Mod El Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mod El Cat</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.ModElCat2SimLib#getModElCat()
	 * @see #getModElCat2SimLib()
	 * @generated
	 */
	EReference getModElCat2SimLib_ModElCat();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.simulink.adapter.corrmodel.ModElCat2SimLib#getSimLib <em>Sim Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sim Lib</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.ModElCat2SimLib#getSimLib()
	 * @see #getModElCat2SimLib()
	 * @generated
	 */
	EReference getModElCat2SimLib_SimLib();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys <em>Comp Inst Config2 Sub Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Inst Config2 Sub Sys</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys
	 * @generated
	 */
	EClass getCompInstConfig2SubSys();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getInstConfig <em>Inst Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inst Config</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getInstConfig()
	 * @see #getCompInstConfig2SubSys()
	 * @generated
	 */
	EReference getCompInstConfig2SubSys_InstConfig();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getSubSys <em>Sub Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Sys</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getSubSys()
	 * @see #getCompInstConfig2SubSys()
	 * @generated
	 */
	EReference getCompInstConfig2SubSys_SubSys();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCommunicationSwitch <em>Communication Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Switch</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCommunicationSwitch()
	 * @see #getCompInstConfig2SubSys()
	 * @generated
	 */
	EReference getCompInstConfig2SubSys_CommunicationSwitch();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusCreator <em>Bus Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus Creator</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusCreator()
	 * @see #getCompInstConfig2SubSys()
	 * @generated
	 */
	EReference getCompInstConfig2SubSys_BusCreator();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusSelector <em>Bus Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus Selector</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusSelector()
	 * @see #getCompInstConfig2SubSys()
	 * @generated
	 */
	EReference getCompInstConfig2SubSys_BusSelector();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusCreatorOutPort <em>Bus Creator Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus Creator Out Port</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusCreatorOutPort()
	 * @see #getCompInstConfig2SubSys()
	 * @generated
	 */
	EReference getCompInstConfig2SubSys_BusCreatorOutPort();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusSelectorInPort <em>Bus Selector In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus Selector In Port</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusSelectorInPort()
	 * @see #getCompInstConfig2SubSys()
	 * @generated
	 */
	EReference getCompInstConfig2SubSys_BusSelectorInPort();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusOfBusses <em>Bus Of Busses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus Of Busses</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusOfBusses()
	 * @see #getCompInstConfig2SubSys()
	 * @generated
	 */
	EReference getCompInstConfig2SubSys_BusOfBusses();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCS_inPort <em>CS in Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CS in Port</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCS_inPort()
	 * @see #getCompInstConfig2SubSys()
	 * @generated
	 */
	EReference getCompInstConfig2SubSys_CS_inPort();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCS_outPort <em>CS out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CS out Port</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCS_outPort()
	 * @see #getCompInstConfig2SubSys()
	 * @generated
	 */
	EReference getCompInstConfig2SubSys_CS_outPort();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCompInstName <em>Comp Inst Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comp Inst Name</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCompInstName()
	 * @see #getCompInstConfig2SubSys()
	 * @generated
	 */
	EAttribute getCompInstConfig2SubSys_CompInstName();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.InstConfig2SimMod <em>Inst Config2 Sim Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inst Config2 Sim Mod</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.InstConfig2SimMod
	 * @generated
	 */
	EClass getInstConfig2SimMod();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.InstConfig2SimMod#getModelElementCategory <em>Model Element Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element Category</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.InstConfig2SimMod#getModelElementCategory()
	 * @see #getInstConfig2SimMod()
	 * @generated
	 */
	EReference getInstConfig2SimMod_ModelElementCategory();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys <em>Atom Comp2 Atom Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom Comp2 Atom Sys</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys
	 * @generated
	 */
	EClass getAtomComp2AtomSys();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getClockSignal <em>Clock Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock Signal</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getClockSignal()
	 * @see #getAtomComp2AtomSys()
	 * @generated
	 */
	EReference getAtomComp2AtomSys_ClockSignal();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getChart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chart</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getChart()
	 * @see #getAtomComp2AtomSys()
	 * @generated
	 */
	EReference getAtomComp2AtomSys_Chart();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getComp <em>Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comp</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getComp()
	 * @see #getAtomComp2AtomSys()
	 * @generated
	 */
	EReference getAtomComp2AtomSys_Comp();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getSys <em>Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sys</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getSys()
	 * @see #getAtomComp2AtomSys()
	 * @generated
	 */
	EReference getAtomComp2AtomSys_Sys();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.StructComp2SubSys <em>Struct Comp2 Sub Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Comp2 Sub Sys</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.StructComp2SubSys
	 * @generated
	 */
	EClass getStructComp2SubSys();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.StructComp2SubSys#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.StructComp2SubSys#getComponentInstance()
	 * @see #getStructComp2SubSys()
	 * @generated
	 */
	EReference getStructComp2SubSys_ComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.StructComp2SubSys#getLibraryReference <em>Library Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Library Reference</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.StructComp2SubSys#getLibraryReference()
	 * @see #getStructComp2SubSys()
	 * @generated
	 */
	EReference getStructComp2SubSys_LibraryReference();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.StructComp2SubSys#getComp <em>Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comp</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.StructComp2SubSys#getComp()
	 * @see #getStructComp2SubSys()
	 * @generated
	 */
	EReference getStructComp2SubSys_Comp();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.CompInst2LibRef <em>Comp Inst2 Lib Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Inst2 Lib Ref</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.CompInst2LibRef
	 * @generated
	 */
	EClass getCompInst2LibRef();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.CompInst2LibRef#getCompInst <em>Comp Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comp Inst</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.CompInst2LibRef#getCompInst()
	 * @see #getCompInst2LibRef()
	 * @generated
	 */
	EReference getCompInst2LibRef_CompInst();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.CompInst2LibRef#getLibRef <em>Lib Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lib Ref</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.CompInst2LibRef#getLibRef()
	 * @see #getCompInst2LibRef()
	 * @generated
	 */
	EReference getCompInst2LibRef_LibRef();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.Port2Ports <em>Port2 Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port2 Ports</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports
	 * @generated
	 */
	EClass getPort2Ports();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Port</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getInPort()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_InPort();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Port</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getOutPort()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_OutPort();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getPort()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_Port();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getHelp_inPort <em>Help in Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Help in Port</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getHelp_inPort()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_Help_inPort();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getHelp_outPort <em>Help out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Help out Port</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getHelp_outPort()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_Help_outPort();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getPortInst <em>Port Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Inst</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getPortInst()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_PortInst();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getMultiPortInst <em>Multi Port Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multi Port Inst</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getMultiPortInst()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_MultiPortInst();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getCompInst <em>Comp Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comp Inst</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getCompInst()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_CompInst();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_ReadIn <em>Sc Read In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Read In</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_ReadIn()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_Sc_ReadIn();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_ReadOut <em>Sc Read Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Read Out</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_ReadOut()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_Sc_ReadOut();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_WriteIn <em>Sc Write In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Write In</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_WriteIn()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_Sc_WriteIn();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_WriteOut <em>Sc Write Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc Write Out</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_WriteOut()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_Sc_WriteOut();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_ReadIn <em>Sc help Read In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc help Read In</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_ReadIn()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_Sc_help_ReadIn();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_ReadOut <em>Sc help Read Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc help Read Out</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_ReadOut()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_Sc_help_ReadOut();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_WriteIn <em>Sc help Write In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc help Write In</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_WriteIn()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_Sc_help_WriteIn();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_WriteOut <em>Sc help Write Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sc help Write Out</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_WriteOut()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_Sc_help_WriteOut();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getMi <em>Mi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mi</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getMi()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_Mi();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getNet_address_inPort <em>Net address in Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Net address in Port</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getNet_address_inPort()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_Net_address_inPort();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getReceiver_net_address_inPort <em>Receiver net address in Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver net address in Port</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getReceiver_net_address_inPort()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_Receiver_net_address_inPort();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constant</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getConstant()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_Constant();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getPortType()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_PortType();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getLineFromReadOut <em>Line From Read Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line From Read Out</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getLineFromReadOut()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_LineFromReadOut();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getLineToReadIn <em>Line To Read In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line To Read In</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getLineToReadIn()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_LineToReadIn();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getLinkLayer <em>Link Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Layer</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Port2Ports#getLinkLayer()
	 * @see #getPort2Ports()
	 * @generated
	 */
	EReference getPort2Ports_LinkLayer();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.AssemblyInst2Line <em>Assembly Inst2 Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Inst2 Line</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.AssemblyInst2Line
	 * @generated
	 */
	EClass getAssemblyInst2Line();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.AssemblyInst2Line#getAssemblyInst <em>Assembly Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Inst</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.AssemblyInst2Line#getAssemblyInst()
	 * @see #getAssemblyInst2Line()
	 * @generated
	 */
	EReference getAssemblyInst2Line_AssemblyInst();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.simulink.adapter.corrmodel.AssemblyInst2Line#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.AssemblyInst2Line#getLine()
	 * @see #getAssemblyInst2Line()
	 * @generated
	 */
	EReference getAssemblyInst2Line_Line();

	/**
	 * Returns the meta object for class '{@link org.muml.simulink.adapter.corrmodel.Del2Line <em>Del2 Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Del2 Line</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Del2Line
	 * @generated
	 */
	EClass getDel2Line();

	/**
	 * Returns the meta object for the reference '{@link org.muml.simulink.adapter.corrmodel.Del2Line#getDelegationInstance <em>Delegation Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegation Instance</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Del2Line#getDelegationInstance()
	 * @see #getDel2Line()
	 * @generated
	 */
	EReference getDel2Line_DelegationInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.simulink.adapter.corrmodel.Del2Line#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.muml.simulink.adapter.corrmodel.Del2Line#getLine()
	 * @see #getDel2Line()
	 * @generated
	 */
	EReference getDel2Line_Line();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Fujaba2simulinkFactory getFujaba2simulinkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl <em>Abstract Container Correspondence Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl
		 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getAbstractContainerCorrespondenceNode()
		 * @generated
		 */
		EClass ABSTRACT_CONTAINER_CORRESPONDENCE_NODE = eINSTANCE.getAbstractContainerCorrespondenceNode();

		/**
		 * The meta object literal for the '<em><b>Child Corresp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP = eINSTANCE.getAbstractContainerCorrespondenceNode_ChildCorresp();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.impl.RootNode2SimulinkContainerImpl <em>Root Node2 Simulink Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.impl.RootNode2SimulinkContainerImpl
		 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getRootNode2SimulinkContainer()
		 * @generated
		 */
		EClass ROOT_NODE2_SIMULINK_CONTAINER = eINSTANCE.getRootNode2SimulinkContainer();

		/**
		 * The meta object literal for the '<em><b>Root Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_NODE2_SIMULINK_CONTAINER__ROOT_NODE = eINSTANCE.getRootNode2SimulinkContainer_RootNode();

		/**
		 * The meta object literal for the '<em><b>Simulink Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_NODE2_SIMULINK_CONTAINER__SIMULINK_CONTAINER = eINSTANCE.getRootNode2SimulinkContainer_SimulinkContainer();

		/**
		 * The meta object literal for the '<em><b>Packet Bus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_NODE2_SIMULINK_CONTAINER__PACKET_BUS = eINSTANCE.getRootNode2SimulinkContainer_PacketBus();

		/**
		 * The meta object literal for the '<em><b>Bus Of Busses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_NODE2_SIMULINK_CONTAINER__BUS_OF_BUSSES = eINSTANCE.getRootNode2SimulinkContainer_BusOfBusses();

		/**
		 * The meta object literal for the '<em><b>Cic2ss</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_NODE2_SIMULINK_CONTAINER__CIC2SS = eINSTANCE.getRootNode2SimulinkContainer_Cic2ss();

		/**
		 * The meta object literal for the '<em><b>Atom Comp Lib</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_NODE2_SIMULINK_CONTAINER__ATOM_COMP_LIB = eINSTANCE.getRootNode2SimulinkContainer_AtomCompLib();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.impl.ModElCat2SimLibImpl <em>Mod El Cat2 Sim Lib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.impl.ModElCat2SimLibImpl
		 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getModElCat2SimLib()
		 * @generated
		 */
		EClass MOD_EL_CAT2_SIM_LIB = eINSTANCE.getModElCat2SimLib();

		/**
		 * The meta object literal for the '<em><b>Mod El Cat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOD_EL_CAT2_SIM_LIB__MOD_EL_CAT = eINSTANCE.getModElCat2SimLib_ModElCat();

		/**
		 * The meta object literal for the '<em><b>Sim Lib</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOD_EL_CAT2_SIM_LIB__SIM_LIB = eINSTANCE.getModElCat2SimLib_SimLib();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.impl.CompInstConfig2SubSysImpl <em>Comp Inst Config2 Sub Sys</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.impl.CompInstConfig2SubSysImpl
		 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getCompInstConfig2SubSys()
		 * @generated
		 */
		EClass COMP_INST_CONFIG2_SUB_SYS = eINSTANCE.getCompInstConfig2SubSys();

		/**
		 * The meta object literal for the '<em><b>Inst Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_INST_CONFIG2_SUB_SYS__INST_CONFIG = eINSTANCE.getCompInstConfig2SubSys_InstConfig();

		/**
		 * The meta object literal for the '<em><b>Sub Sys</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_INST_CONFIG2_SUB_SYS__SUB_SYS = eINSTANCE.getCompInstConfig2SubSys_SubSys();

		/**
		 * The meta object literal for the '<em><b>Communication Switch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_INST_CONFIG2_SUB_SYS__COMMUNICATION_SWITCH = eINSTANCE.getCompInstConfig2SubSys_CommunicationSwitch();

		/**
		 * The meta object literal for the '<em><b>Bus Creator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_INST_CONFIG2_SUB_SYS__BUS_CREATOR = eINSTANCE.getCompInstConfig2SubSys_BusCreator();

		/**
		 * The meta object literal for the '<em><b>Bus Selector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_INST_CONFIG2_SUB_SYS__BUS_SELECTOR = eINSTANCE.getCompInstConfig2SubSys_BusSelector();

		/**
		 * The meta object literal for the '<em><b>Bus Creator Out Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_INST_CONFIG2_SUB_SYS__BUS_CREATOR_OUT_PORT = eINSTANCE.getCompInstConfig2SubSys_BusCreatorOutPort();

		/**
		 * The meta object literal for the '<em><b>Bus Selector In Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_INST_CONFIG2_SUB_SYS__BUS_SELECTOR_IN_PORT = eINSTANCE.getCompInstConfig2SubSys_BusSelectorInPort();

		/**
		 * The meta object literal for the '<em><b>Bus Of Busses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_INST_CONFIG2_SUB_SYS__BUS_OF_BUSSES = eINSTANCE.getCompInstConfig2SubSys_BusOfBusses();

		/**
		 * The meta object literal for the '<em><b>CS in Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_INST_CONFIG2_SUB_SYS__CS_IN_PORT = eINSTANCE.getCompInstConfig2SubSys_CS_inPort();

		/**
		 * The meta object literal for the '<em><b>CS out Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_INST_CONFIG2_SUB_SYS__CS_OUT_PORT = eINSTANCE.getCompInstConfig2SubSys_CS_outPort();

		/**
		 * The meta object literal for the '<em><b>Comp Inst Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMP_INST_CONFIG2_SUB_SYS__COMP_INST_NAME = eINSTANCE.getCompInstConfig2SubSys_CompInstName();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl <em>Inst Config2 Sim Mod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl
		 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getInstConfig2SimMod()
		 * @generated
		 */
		EClass INST_CONFIG2_SIM_MOD = eINSTANCE.getInstConfig2SimMod();

		/**
		 * The meta object literal for the '<em><b>Model Element Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INST_CONFIG2_SIM_MOD__MODEL_ELEMENT_CATEGORY = eINSTANCE.getInstConfig2SimMod_ModelElementCategory();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.impl.AtomComp2AtomSysImpl <em>Atom Comp2 Atom Sys</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.impl.AtomComp2AtomSysImpl
		 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getAtomComp2AtomSys()
		 * @generated
		 */
		EClass ATOM_COMP2_ATOM_SYS = eINSTANCE.getAtomComp2AtomSys();

		/**
		 * The meta object literal for the '<em><b>Clock Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM_COMP2_ATOM_SYS__CLOCK_SIGNAL = eINSTANCE.getAtomComp2AtomSys_ClockSignal();

		/**
		 * The meta object literal for the '<em><b>Chart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM_COMP2_ATOM_SYS__CHART = eINSTANCE.getAtomComp2AtomSys_Chart();

		/**
		 * The meta object literal for the '<em><b>Comp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM_COMP2_ATOM_SYS__COMP = eINSTANCE.getAtomComp2AtomSys_Comp();

		/**
		 * The meta object literal for the '<em><b>Sys</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM_COMP2_ATOM_SYS__SYS = eINSTANCE.getAtomComp2AtomSys_Sys();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl <em>Struct Comp2 Sub Sys</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl
		 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getStructComp2SubSys()
		 * @generated
		 */
		EClass STRUCT_COMP2_SUB_SYS = eINSTANCE.getStructComp2SubSys();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_COMP2_SUB_SYS__COMPONENT_INSTANCE = eINSTANCE.getStructComp2SubSys_ComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Library Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_COMP2_SUB_SYS__LIBRARY_REFERENCE = eINSTANCE.getStructComp2SubSys_LibraryReference();

		/**
		 * The meta object literal for the '<em><b>Comp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_COMP2_SUB_SYS__COMP = eINSTANCE.getStructComp2SubSys_Comp();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.impl.CompInst2LibRefImpl <em>Comp Inst2 Lib Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.impl.CompInst2LibRefImpl
		 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getCompInst2LibRef()
		 * @generated
		 */
		EClass COMP_INST2_LIB_REF = eINSTANCE.getCompInst2LibRef();

		/**
		 * The meta object literal for the '<em><b>Comp Inst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_INST2_LIB_REF__COMP_INST = eINSTANCE.getCompInst2LibRef_CompInst();

		/**
		 * The meta object literal for the '<em><b>Lib Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_INST2_LIB_REF__LIB_REF = eINSTANCE.getCompInst2LibRef_LibRef();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl <em>Port2 Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl
		 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getPort2Ports()
		 * @generated
		 */
		EClass PORT2_PORTS = eINSTANCE.getPort2Ports();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__IN_PORT = eINSTANCE.getPort2Ports_InPort();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__OUT_PORT = eINSTANCE.getPort2Ports_OutPort();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__PORT = eINSTANCE.getPort2Ports_Port();

		/**
		 * The meta object literal for the '<em><b>Help in Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__HELP_IN_PORT = eINSTANCE.getPort2Ports_Help_inPort();

		/**
		 * The meta object literal for the '<em><b>Help out Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__HELP_OUT_PORT = eINSTANCE.getPort2Ports_Help_outPort();

		/**
		 * The meta object literal for the '<em><b>Port Inst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__PORT_INST = eINSTANCE.getPort2Ports_PortInst();

		/**
		 * The meta object literal for the '<em><b>Multi Port Inst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__MULTI_PORT_INST = eINSTANCE.getPort2Ports_MultiPortInst();

		/**
		 * The meta object literal for the '<em><b>Comp Inst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__COMP_INST = eINSTANCE.getPort2Ports_CompInst();

		/**
		 * The meta object literal for the '<em><b>Sc Read In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__SC_READ_IN = eINSTANCE.getPort2Ports_Sc_ReadIn();

		/**
		 * The meta object literal for the '<em><b>Sc Read Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__SC_READ_OUT = eINSTANCE.getPort2Ports_Sc_ReadOut();

		/**
		 * The meta object literal for the '<em><b>Sc Write In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__SC_WRITE_IN = eINSTANCE.getPort2Ports_Sc_WriteIn();

		/**
		 * The meta object literal for the '<em><b>Sc Write Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__SC_WRITE_OUT = eINSTANCE.getPort2Ports_Sc_WriteOut();

		/**
		 * The meta object literal for the '<em><b>Sc help Read In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__SC_HELP_READ_IN = eINSTANCE.getPort2Ports_Sc_help_ReadIn();

		/**
		 * The meta object literal for the '<em><b>Sc help Read Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__SC_HELP_READ_OUT = eINSTANCE.getPort2Ports_Sc_help_ReadOut();

		/**
		 * The meta object literal for the '<em><b>Sc help Write In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__SC_HELP_WRITE_IN = eINSTANCE.getPort2Ports_Sc_help_WriteIn();

		/**
		 * The meta object literal for the '<em><b>Sc help Write Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__SC_HELP_WRITE_OUT = eINSTANCE.getPort2Ports_Sc_help_WriteOut();

		/**
		 * The meta object literal for the '<em><b>Mi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__MI = eINSTANCE.getPort2Ports_Mi();

		/**
		 * The meta object literal for the '<em><b>Net address in Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__NET_ADDRESS_IN_PORT = eINSTANCE.getPort2Ports_Net_address_inPort();

		/**
		 * The meta object literal for the '<em><b>Receiver net address in Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__RECEIVER_NET_ADDRESS_IN_PORT = eINSTANCE.getPort2Ports_Receiver_net_address_inPort();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__CONSTANT = eINSTANCE.getPort2Ports_Constant();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__PORT_TYPE = eINSTANCE.getPort2Ports_PortType();

		/**
		 * The meta object literal for the '<em><b>Line From Read Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__LINE_FROM_READ_OUT = eINSTANCE.getPort2Ports_LineFromReadOut();

		/**
		 * The meta object literal for the '<em><b>Line To Read In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__LINE_TO_READ_IN = eINSTANCE.getPort2Ports_LineToReadIn();

		/**
		 * The meta object literal for the '<em><b>Link Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT2_PORTS__LINK_LAYER = eINSTANCE.getPort2Ports_LinkLayer();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.impl.AssemblyInst2LineImpl <em>Assembly Inst2 Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.impl.AssemblyInst2LineImpl
		 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getAssemblyInst2Line()
		 * @generated
		 */
		EClass ASSEMBLY_INST2_LINE = eINSTANCE.getAssemblyInst2Line();

		/**
		 * The meta object literal for the '<em><b>Assembly Inst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_INST2_LINE__ASSEMBLY_INST = eINSTANCE.getAssemblyInst2Line_AssemblyInst();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_INST2_LINE__LINE = eINSTANCE.getAssemblyInst2Line_Line();

		/**
		 * The meta object literal for the '{@link org.muml.simulink.adapter.corrmodel.impl.Del2LineImpl <em>Del2 Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.simulink.adapter.corrmodel.impl.Del2LineImpl
		 * @see org.muml.simulink.adapter.corrmodel.impl.Fujaba2simulinkPackageImpl#getDel2Line()
		 * @generated
		 */
		EClass DEL2_LINE = eINSTANCE.getDel2Line();

		/**
		 * The meta object literal for the '<em><b>Delegation Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEL2_LINE__DELEGATION_INSTANCE = eINSTANCE.getDel2Line_DelegationInstance();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEL2_LINE__LINE = eINSTANCE.getDel2Line_Line();

	}

} //Fujaba2simulinkPackage

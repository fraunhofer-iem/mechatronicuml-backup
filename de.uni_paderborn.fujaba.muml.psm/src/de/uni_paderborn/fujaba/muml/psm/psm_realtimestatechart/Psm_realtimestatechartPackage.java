/**
 */
package de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart;

import de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The package extends the realtimestatechart-package of muml. Here a statechart with parameters is introduced.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.Psm_realtimestatechartFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface Psm_realtimestatechartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "psm_realtimestatechart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/psm/realtimestatechart/0.4.0/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "psm_realtimestatechart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Psm_realtimestatechartPackage eINSTANCE = de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.impl.Psm_realtimestatechartPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.impl.ParameterizedRealtimeStatechartImpl <em>Parameterized Realtime Statechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.impl.ParameterizedRealtimeStatechartImpl
	 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.impl.Psm_realtimestatechartPackageImpl#getParameterizedRealtimeStatechart()
	 * @generated
	 */
	int PARAMETERIZED_REALTIME_STATECHART = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__ANNOTATION = RealtimestatechartPackage.REALTIME_STATECHART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__EXTENSION = RealtimestatechartPackage.REALTIME_STATECHART__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__NAME = RealtimestatechartPackage.REALTIME_STATECHART__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__COMMENT = RealtimestatechartPackage.REALTIME_STATECHART__COMMENT;

	/**
	 * The feature id for the '<em><b>Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__BEHAVIORAL_ELEMENT = RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__OPERATIONS = RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__VARIABLES = RealtimestatechartPackage.REALTIME_STATECHART__VARIABLES;

	/**
	 * The feature id for the '<em><b>Parent Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__PARENT_REGION = RealtimestatechartPackage.REALTIME_STATECHART__PARENT_REGION;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__TRANSITIONS = RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__STATES = RealtimestatechartPackage.REALTIME_STATECHART__STATES;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__CLOCKS = RealtimestatechartPackage.REALTIME_STATECHART__CLOCKS;

	/**
	 * The feature id for the '<em><b>Flat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__FLAT = RealtimestatechartPackage.REALTIME_STATECHART__FLAT;

	/**
	 * The feature id for the '<em><b>Available Clocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__AVAILABLE_CLOCKS = RealtimestatechartPackage.REALTIME_STATECHART__AVAILABLE_CLOCKS;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__EMBEDDED = RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDED;

	/**
	 * The feature id for the '<em><b>All Available Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__ALL_AVAILABLE_VARIABLES = RealtimestatechartPackage.REALTIME_STATECHART__ALL_AVAILABLE_VARIABLES;

	/**
	 * The feature id for the '<em><b>All Available Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__ALL_AVAILABLE_OPERATIONS = RealtimestatechartPackage.REALTIME_STATECHART__ALL_AVAILABLE_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Used Operation Repositories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__USED_OPERATION_REPOSITORIES = RealtimestatechartPackage.REALTIME_STATECHART__USED_OPERATION_REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Uses One To Many Communication Schemata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA = RealtimestatechartPackage.REALTIME_STATECHART__USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA;

	/**
	 * The feature id for the '<em><b>Sub Role Specific Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES = RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES;

	/**
	 * The feature id for the '<em><b>Sub Role Specific Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS = RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS;

	/**
	 * The feature id for the '<em><b>Sub Role Specific Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS = RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__PARAMETERS = RealtimestatechartPackage.REALTIME_STATECHART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART__ALL_PARAMETERS = RealtimestatechartPackage.REALTIME_STATECHART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameterized Realtime Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART_FEATURE_COUNT = RealtimestatechartPackage.REALTIME_STATECHART_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___ECLASS = RealtimestatechartPackage.REALTIME_STATECHART___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___EIS_PROXY = RealtimestatechartPackage.REALTIME_STATECHART___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___ERESOURCE = RealtimestatechartPackage.REALTIME_STATECHART___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___ECONTAINER = RealtimestatechartPackage.REALTIME_STATECHART___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___ECONTAINING_FEATURE = RealtimestatechartPackage.REALTIME_STATECHART___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___ECONTAINMENT_FEATURE = RealtimestatechartPackage.REALTIME_STATECHART___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___ECONTENTS = RealtimestatechartPackage.REALTIME_STATECHART___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___EALL_CONTENTS = RealtimestatechartPackage.REALTIME_STATECHART___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___ECROSS_REFERENCES = RealtimestatechartPackage.REALTIME_STATECHART___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE = RealtimestatechartPackage.REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE_BOOLEAN = RealtimestatechartPackage.REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___ESET__ESTRUCTURALFEATURE_OBJECT = RealtimestatechartPackage.REALTIME_STATECHART___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___EIS_SET__ESTRUCTURALFEATURE = RealtimestatechartPackage.REALTIME_STATECHART___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___EUNSET__ESTRUCTURALFEATURE = RealtimestatechartPackage.REALTIME_STATECHART___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___EINVOKE__EOPERATION_ELIST = RealtimestatechartPackage.REALTIME_STATECHART___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___GET_EXTENSION__ECLASS = RealtimestatechartPackage.REALTIME_STATECHART___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___PROVIDE_EXTENSION__ECLASS = RealtimestatechartPackage.REALTIME_STATECHART___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___GET_ANNOTATION__STRING = RealtimestatechartPackage.REALTIME_STATECHART___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___PROVIDE_ANNOTATION__STRING = RealtimestatechartPackage.REALTIME_STATECHART___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Super Statechart Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___IS_SUPER_STATECHART_OF__REALTIMESTATECHART = RealtimestatechartPackage.REALTIME_STATECHART___IS_SUPER_STATECHART_OF__REALTIMESTATECHART;

	/**
	 * The operation id for the '<em>Get Highest Parent Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___GET_HIGHEST_PARENT_STATECHART = RealtimestatechartPackage.REALTIME_STATECHART___GET_HIGHEST_PARENT_STATECHART;

	/**
	 * The operation id for the '<em>Get Port Or Role Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART___GET_PORT_OR_ROLE_STATECHART = RealtimestatechartPackage.REALTIME_STATECHART___GET_PORT_OR_ROLE_STATECHART;

	/**
	 * The number of operations of the '<em>Parameterized Realtime Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_REALTIME_STATECHART_OPERATION_COUNT = RealtimestatechartPackage.REALTIME_STATECHART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.impl.APICallImpl <em>API Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.impl.APICallImpl
	 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.impl.Psm_realtimestatechartPackageImpl#getAPICall()
	 * @generated
	 */
	int API_CALL = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL__ANNOTATION = ActionlanguagePackage.OPERATION_CALL__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL__EXTENSION = ActionlanguagePackage.OPERATION_CALL__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL__COMMENT = ActionlanguagePackage.OPERATION_CALL__COMMENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL__OPERATION = ActionlanguagePackage.OPERATION_CALL__OPERATION;

	/**
	 * The feature id for the '<em><b>Parameter Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL__PARAMETER_BINDING = ActionlanguagePackage.OPERATION_CALL__PARAMETER_BINDING;

	/**
	 * The feature id for the '<em><b>Api Call Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL__API_CALL_SIGNATURE = ActionlanguagePackage.OPERATION_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>API Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_FEATURE_COUNT = ActionlanguagePackage.OPERATION_CALL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___ECLASS = ActionlanguagePackage.OPERATION_CALL___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___EIS_PROXY = ActionlanguagePackage.OPERATION_CALL___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___ERESOURCE = ActionlanguagePackage.OPERATION_CALL___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___ECONTAINER = ActionlanguagePackage.OPERATION_CALL___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___ECONTAINING_FEATURE = ActionlanguagePackage.OPERATION_CALL___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___ECONTAINMENT_FEATURE = ActionlanguagePackage.OPERATION_CALL___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___ECONTENTS = ActionlanguagePackage.OPERATION_CALL___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___EALL_CONTENTS = ActionlanguagePackage.OPERATION_CALL___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___ECROSS_REFERENCES = ActionlanguagePackage.OPERATION_CALL___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___EGET__ESTRUCTURALFEATURE = ActionlanguagePackage.OPERATION_CALL___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___EGET__ESTRUCTURALFEATURE_BOOLEAN = ActionlanguagePackage.OPERATION_CALL___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___ESET__ESTRUCTURALFEATURE_OBJECT = ActionlanguagePackage.OPERATION_CALL___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___EIS_SET__ESTRUCTURALFEATURE = ActionlanguagePackage.OPERATION_CALL___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___EUNSET__ESTRUCTURALFEATURE = ActionlanguagePackage.OPERATION_CALL___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___EINVOKE__EOPERATION_ELIST = ActionlanguagePackage.OPERATION_CALL___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___GET_EXTENSION__ECLASS = ActionlanguagePackage.OPERATION_CALL___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___PROVIDE_EXTENSION__ECLASS = ActionlanguagePackage.OPERATION_CALL___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___GET_ANNOTATION__STRING = ActionlanguagePackage.OPERATION_CALL___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL___PROVIDE_ANNOTATION__STRING = ActionlanguagePackage.OPERATION_CALL___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>API Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_OPERATION_COUNT = ActionlanguagePackage.OPERATION_CALL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.ParameterizedRealtimeStatechart <em>Parameterized Realtime Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterized Realtime Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.ParameterizedRealtimeStatechart
	 * @generated
	 */
	EClass getParameterizedRealtimeStatechart();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.ParameterizedRealtimeStatechart#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.ParameterizedRealtimeStatechart#getParameters()
	 * @see #getParameterizedRealtimeStatechart()
	 * @generated
	 */
	EReference getParameterizedRealtimeStatechart_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.ParameterizedRealtimeStatechart#getAllParameters <em>All Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Parameters</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.ParameterizedRealtimeStatechart#getAllParameters()
	 * @see #getParameterizedRealtimeStatechart()
	 * @generated
	 */
	EReference getParameterizedRealtimeStatechart_AllParameters();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.APICall <em>API Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Call</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.APICall
	 * @generated
	 */
	EClass getAPICall();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.APICall#getApiCallSignature <em>Api Call Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Api Call Signature</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.APICall#getApiCallSignature()
	 * @see #getAPICall()
	 * @generated
	 */
	EReference getAPICall_ApiCallSignature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Psm_realtimestatechartFactory getPsm_realtimestatechartFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.impl.ParameterizedRealtimeStatechartImpl <em>Parameterized Realtime Statechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.impl.ParameterizedRealtimeStatechartImpl
		 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.impl.Psm_realtimestatechartPackageImpl#getParameterizedRealtimeStatechart()
		 * @generated
		 */
		EClass PARAMETERIZED_REALTIME_STATECHART = eINSTANCE.getParameterizedRealtimeStatechart();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_REALTIME_STATECHART__PARAMETERS = eINSTANCE.getParameterizedRealtimeStatechart_Parameters();

		/**
		 * The meta object literal for the '<em><b>All Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_REALTIME_STATECHART__ALL_PARAMETERS = eINSTANCE.getParameterizedRealtimeStatechart_AllParameters();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.impl.APICallImpl <em>API Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.impl.APICallImpl
		 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.impl.Psm_realtimestatechartPackageImpl#getAPICall()
		 * @generated
		 */
		EClass API_CALL = eINSTANCE.getAPICall();

		/**
		 * The meta object literal for the '<em><b>Api Call Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_CALL__API_CALL_SIGNATURE = eINSTANCE.getAPICall_ApiCallSignature();

	}

} //Psm_realtimestatechartPackage

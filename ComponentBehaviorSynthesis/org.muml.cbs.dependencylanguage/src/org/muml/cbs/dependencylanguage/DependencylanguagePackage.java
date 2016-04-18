/**
 */
package org.muml.cbs.dependencylanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.muml.core.CorePackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;

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
 * This package provides a the possiblity to describe dependencies between multiple RTCSs.
 * The dependencies can be appended to AtomicComponent through the SynthesizableBehavior.
 * 
 * @author Sebastian Goschin
 * <!-- end-model-doc -->
 * @see org.muml.cbs.dependencylanguage.DependencylanguageFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import actionlanguage='/resource/org.muml.pim.actionlanguage/model/actionlanguage.ecore#/' core='/resource/org.muml.core/model/core.ecore#/' ecore='http://www.eclipse.org/emf/2002/Ecore#/' behavior='/resource/org.muml.pim/model/pim.ecore#//behavior' component='/resource/org.muml.pim/model/pim.ecore#//component' expr='/resource/org.muml.core/model/core.ecore#//expressions' realtimestatechart='/resource/org.muml.pim/model/pim.ecore#//realtimestatechart' valueType='/resource/org.muml.pim/model/pim.ecore#//valuetype' sdcec='/resource/org.muml.core/model/core.ecore#//expressions/common'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface DependencylanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dependencylanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/cbs/dependencylanguage/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dependencylanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DependencylanguagePackage eINSTANCE = org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.SynthesizableBehaviorImpl <em>Synthesizable Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.SynthesizableBehaviorImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getSynthesizableBehavior()
	 * @generated
	 */
	int SYNTHESIZABLE_BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZABLE_BEHAVIOR__EXTENSIONS = CorePackage.EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZABLE_BEHAVIOR__BASE = CorePackage.EXTENSION__BASE;

	/**
	 * The feature id for the '<em><b>Model Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZABLE_BEHAVIOR__MODEL_BASE = CorePackage.EXTENSION__MODEL_BASE;

	/**
	 * The feature id for the '<em><b>Owning Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZABLE_BEHAVIOR__OWNING_ANNOTATION = CorePackage.EXTENSION__OWNING_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZABLE_BEHAVIOR__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZABLE_BEHAVIOR__BEHAVIOR = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependency Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZABLE_BEHAVIOR__DEPENDENCY_MODEL = CorePackage.EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZABLE_BEHAVIOR__NAME = CorePackage.EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Synthesizable Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZABLE_BEHAVIOR_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZABLE_BEHAVIOR___GET_EXTENSION__ECLASS = CorePackage.EXTENSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Synthesizable Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZABLE_BEHAVIOR_OPERATION_COUNT = CorePackage.EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.DependencyModelImpl <em>Dependency Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.DependencyModelImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getDependencyModel()
	 * @generated
	 */
	int DEPENDENCY_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_MODEL__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_MODEL__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_MODEL__DEPENDENCIES = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dependency Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_MODEL_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_MODEL___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Dependency Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_MODEL_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.DependencyImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.SynchronizationImpl <em>Synchronization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.SynchronizationImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getSynchronization()
	 * @generated
	 */
	int SYNCHRONIZATION = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__EXTENSIONS = DEPENDENCY__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__COMMENT = DEPENDENCY__COMMENT;

	/**
	 * The feature id for the '<em><b>Sending Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__SENDING_EVENTS = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiving Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__RECEIVING_EVENTS = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Channel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__CHANNEL_NAME = DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Selector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__SELECTOR_TYPE = DEPENDENCY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>General Selector Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION = DEPENDENCY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___GET_EXTENSION__ECLASS = DEPENDENCY___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.ForbiddenStateCombinationImpl <em>Forbidden State Combination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.ForbiddenStateCombinationImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getForbiddenStateCombination()
	 * @generated
	 */
	int FORBIDDEN_STATE_COMBINATION = 4;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_STATE_COMBINATION__EXTENSIONS = DEPENDENCY__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_STATE_COMBINATION__COMMENT = DEPENDENCY__COMMENT;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_STATE_COMBINATION__STATES = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forbidden State Combination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_STATE_COMBINATION_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_STATE_COMBINATION___GET_EXTENSION__ECLASS = DEPENDENCY___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Forbidden State Combination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_STATE_COMBINATION_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.ClockMergeImpl <em>Clock Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.ClockMergeImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getClockMerge()
	 * @generated
	 */
	int CLOCK_MERGE = 5;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MERGE__EXTENSIONS = DEPENDENCY__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MERGE__COMMENT = DEPENDENCY__COMMENT;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MERGE__CLOCKS = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clock Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MERGE__CLOCK_NAME = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clock Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MERGE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MERGE___GET_EXTENSION__ECLASS = DEPENDENCY___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Clock Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MERGE_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.DataMergeImpl <em>Data Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.DataMergeImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getDataMerge()
	 * @generated
	 */
	int DATA_MERGE = 6;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MERGE__EXTENSIONS = DEPENDENCY__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MERGE__COMMENT = DEPENDENCY__COMMENT;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MERGE__VARIABLES = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MERGE__VARIABLE_NAME = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MERGE__PORT = DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MERGE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MERGE___GET_EXTENSION__ECLASS = DEPENDENCY___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Data Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MERGE_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.ConditionalDependencyImpl <em>Conditional Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.ConditionalDependencyImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getConditionalDependency()
	 * @generated
	 */
	int CONDITIONAL_DEPENDENCY = 7;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DEPENDENCY__EXTENSIONS = DEPENDENCY__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DEPENDENCY__COMMENT = DEPENDENCY__COMMENT;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DEPENDENCY__EVENT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DEPENDENCY__CONDITION = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DEPENDENCY__EFFECTS = DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DEPENDENCY___GET_EXTENSION__ECLASS = DEPENDENCY___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Conditional Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.EffectImpl <em>Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.EffectImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getEffect()
	 * @generated
	 */
	int EFFECT = 8;

	/**
	 * The number of structural features of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT___ECLASS = EcorePackage.EOBJECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT___EIS_PROXY = EcorePackage.EOBJECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT___ERESOURCE = EcorePackage.EOBJECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT___ECONTAINER = EcorePackage.EOBJECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT___ECONTAINING_FEATURE = EcorePackage.EOBJECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT___ECONTAINMENT_FEATURE = EcorePackage.EOBJECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT___ECONTENTS = EcorePackage.EOBJECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT___EALL_CONTENTS = EcorePackage.EOBJECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT___ECROSS_REFERENCES = EcorePackage.EOBJECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT___EGET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT___ESET__ESTRUCTURALFEATURE_OBJECT = EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT___EIS_SET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT___EUNSET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT___EINVOKE__EOPERATION_ELIST = EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_OPERATION_COUNT = EcorePackage.EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.EnableDisableEffectImpl <em>Enable Disable Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.EnableDisableEffectImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getEnableDisableEffect()
	 * @generated
	 */
	int ENABLE_DISABLE_EFFECT = 9;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT__EVENT = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT__IS_ENABLE = EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enable Disable Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT___ECLASS = EFFECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT___EIS_PROXY = EFFECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT___ERESOURCE = EFFECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT___ECONTAINER = EFFECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT___ECONTAINING_FEATURE = EFFECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT___ECONTAINMENT_FEATURE = EFFECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT___ECONTENTS = EFFECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT___EALL_CONTENTS = EFFECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT___ECROSS_REFERENCES = EFFECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT___EGET__ESTRUCTURALFEATURE = EFFECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EFFECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT___ESET__ESTRUCTURALFEATURE_OBJECT = EFFECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT___EIS_SET__ESTRUCTURALFEATURE = EFFECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT___EUNSET__ESTRUCTURALFEATURE = EFFECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT___EINVOKE__EOPERATION_ELIST = EFFECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Enable Disable Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_DISABLE_EFFECT_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.ClockResetEffectImpl <em>Clock Reset Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.ClockResetEffectImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getClockResetEffect()
	 * @generated
	 */
	int CLOCK_RESET_EFFECT = 10;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT__CLOCKS = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock Reset Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT___ECLASS = EFFECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT___EIS_PROXY = EFFECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT___ERESOURCE = EFFECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT___ECONTAINER = EFFECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT___ECONTAINING_FEATURE = EFFECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT___ECONTAINMENT_FEATURE = EFFECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT___ECONTENTS = EFFECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT___EALL_CONTENTS = EFFECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT___ECROSS_REFERENCES = EFFECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT___EGET__ESTRUCTURALFEATURE = EFFECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EFFECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT___ESET__ESTRUCTURALFEATURE_OBJECT = EFFECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT___EIS_SET__ESTRUCTURALFEATURE = EFFECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT___EUNSET__ESTRUCTURALFEATURE = EFFECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT___EINVOKE__EOPERATION_ELIST = EFFECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Clock Reset Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_EFFECT_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.DataAssignmentEffectImpl <em>Data Assignment Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.DataAssignmentEffectImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getDataAssignmentEffect()
	 * @generated
	 */
	int DATA_ASSIGNMENT_EFFECT = 11;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT__EXTENSIONS = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT__COMMENT = EFFECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assign Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT__ASSIGN_OPERATOR = EFFECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rhs assign Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT__RHS_ASSIGN_EXPRESSION = EFFECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Increment Decrement Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT__INCREMENT_DECREMENT_OPERATOR = EFFECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lhs typed Named Element Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION = EFFECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT__DIRECTION = EFFECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Data Assignment Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___ECLASS = EFFECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___EIS_PROXY = EFFECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___ERESOURCE = EFFECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___ECONTAINER = EFFECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___ECONTAINING_FEATURE = EFFECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___ECONTAINMENT_FEATURE = EFFECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___ECONTENTS = EFFECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___EALL_CONTENTS = EFFECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___ECROSS_REFERENCES = EFFECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___EGET__ESTRUCTURALFEATURE = EFFECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EFFECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___ESET__ESTRUCTURALFEATURE_OBJECT = EFFECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___EIS_SET__ESTRUCTURALFEATURE = EFFECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___EUNSET__ESTRUCTURALFEATURE = EFFECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___EINVOKE__EOPERATION_ELIST = EFFECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT___GET_EXTENSION__ECLASS = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Assignment Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSIGNMENT_EFFECT_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.BoundedActiveStateImpl <em>Bounded Active State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.BoundedActiveStateImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getBoundedActiveState()
	 * @generated
	 */
	int BOUNDED_ACTIVE_STATE = 12;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_ACTIVE_STATE__EXTENSIONS = DEPENDENCY__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_ACTIVE_STATE__COMMENT = DEPENDENCY__COMMENT;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_ACTIVE_STATE__STATES = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_ACTIVE_STATE__CONSTRAINT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded Active State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_ACTIVE_STATE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_ACTIVE_STATE___GET_EXTENSION__ECLASS = DEPENDENCY___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Bounded Active State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_ACTIVE_STATE_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.ConditionImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 13;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___ECLASS = EcorePackage.EOBJECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___EIS_PROXY = EcorePackage.EOBJECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___ERESOURCE = EcorePackage.EOBJECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___ECONTAINER = EcorePackage.EOBJECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___ECONTAINING_FEATURE = EcorePackage.EOBJECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___ECONTAINMENT_FEATURE = EcorePackage.EOBJECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___ECONTENTS = EcorePackage.EOBJECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___EALL_CONTENTS = EcorePackage.EOBJECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___ECROSS_REFERENCES = EcorePackage.EOBJECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___EGET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT = EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___EIS_SET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___EUNSET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___EINVOKE__EOPERATION_ELIST = EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = EcorePackage.EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.StateStatusConditionImpl <em>State Status Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.StateStatusConditionImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getStateStatusCondition()
	 * @generated
	 */
	int STATE_STATUS_CONDITION = 14;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION__STATES = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION__KIND = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION___ECLASS = CONDITION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION___EIS_PROXY = CONDITION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION___ERESOURCE = CONDITION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION___ECONTAINER = CONDITION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION___ECONTAINING_FEATURE = CONDITION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION___ECONTAINMENT_FEATURE = CONDITION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION___ECONTENTS = CONDITION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION___EALL_CONTENTS = CONDITION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION___ECROSS_REFERENCES = CONDITION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION___EGET__ESTRUCTURALFEATURE = CONDITION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT = CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION___EIS_SET__ESTRUCTURALFEATURE = CONDITION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION___EUNSET__ESTRUCTURALFEATURE = CONDITION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION___EINVOKE__EOPERATION_ELIST = CONDITION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>State Status Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STATUS_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.EventConstrainedIntervalConditionImpl <em>Event Constrained Interval Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.EventConstrainedIntervalConditionImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getEventConstrainedIntervalCondition()
	 * @generated
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION = 15;

	/**
	 * The feature id for the '<em><b>From Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION__INITIAL_ENABLED = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Until Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enabled Infite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION__ENABLED_INFITE = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Event Constrained Interval Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION___ECLASS = CONDITION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION___EIS_PROXY = CONDITION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION___ERESOURCE = CONDITION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION___ECONTAINER = CONDITION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION___ECONTAINING_FEATURE = CONDITION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION___ECONTAINMENT_FEATURE = CONDITION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION___ECONTENTS = CONDITION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION___EALL_CONTENTS = CONDITION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION___ECROSS_REFERENCES = CONDITION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION___EGET__ESTRUCTURALFEATURE = CONDITION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT = CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION___EIS_SET__ESTRUCTURALFEATURE = CONDITION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION___EUNSET__ESTRUCTURALFEATURE = CONDITION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION___EINVOKE__EOPERATION_ELIST = CONDITION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Event Constrained Interval Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINED_INTERVAL_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.ClockConditionImpl <em>Clock Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.ClockConditionImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getClockCondition()
	 * @generated
	 */
	int CLOCK_CONDITION = 16;

	/**
	 * The number of structural features of the '<em>Clock Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION___ECLASS = CONDITION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION___EIS_PROXY = CONDITION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION___ERESOURCE = CONDITION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION___ECONTAINER = CONDITION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION___ECONTAINING_FEATURE = CONDITION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION___ECONTAINMENT_FEATURE = CONDITION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION___ECONTENTS = CONDITION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION___EALL_CONTENTS = CONDITION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION___ECROSS_REFERENCES = CONDITION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION___EGET__ESTRUCTURALFEATURE = CONDITION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT = CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION___EIS_SET__ESTRUCTURALFEATURE = CONDITION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION___EUNSET__ESTRUCTURALFEATURE = CONDITION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION___EINVOKE__EOPERATION_ELIST = CONDITION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Clock Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.AuxiliaryClockConditionImpl <em>Auxiliary Clock Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.AuxiliaryClockConditionImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getAuxiliaryClockCondition()
	 * @generated
	 */
	int AUXILIARY_CLOCK_CONDITION = 17;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION__EVENT = CLOCK_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION__BOUND = CLOCK_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION__OPERATOR = CLOCK_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Auxiliary Clock Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION_FEATURE_COUNT = CLOCK_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION___ECLASS = CLOCK_CONDITION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION___EIS_PROXY = CLOCK_CONDITION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION___ERESOURCE = CLOCK_CONDITION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION___ECONTAINER = CLOCK_CONDITION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION___ECONTAINING_FEATURE = CLOCK_CONDITION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION___ECONTAINMENT_FEATURE = CLOCK_CONDITION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION___ECONTENTS = CLOCK_CONDITION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION___EALL_CONTENTS = CLOCK_CONDITION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION___ECROSS_REFERENCES = CLOCK_CONDITION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION___EGET__ESTRUCTURALFEATURE = CLOCK_CONDITION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CLOCK_CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT = CLOCK_CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION___EIS_SET__ESTRUCTURALFEATURE = CLOCK_CONDITION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION___EUNSET__ESTRUCTURALFEATURE = CLOCK_CONDITION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION___EINVOKE__EOPERATION_ELIST = CLOCK_CONDITION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Auxiliary Clock Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CLOCK_CONDITION_OPERATION_COUNT = CLOCK_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.HybridClockConditionImpl <em>Hybrid Clock Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.HybridClockConditionImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getHybridClockCondition()
	 * @generated
	 */
	int HYBRID_CLOCK_CONDITION = 18;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION__CONDITION = CLOCK_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION__BOUND = CLOCK_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION__OPERATOR = CLOCK_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hybrid Clock Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION_FEATURE_COUNT = CLOCK_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION___ECLASS = CLOCK_CONDITION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION___EIS_PROXY = CLOCK_CONDITION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION___ERESOURCE = CLOCK_CONDITION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION___ECONTAINER = CLOCK_CONDITION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION___ECONTAINING_FEATURE = CLOCK_CONDITION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION___ECONTAINMENT_FEATURE = CLOCK_CONDITION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION___ECONTENTS = CLOCK_CONDITION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION___EALL_CONTENTS = CLOCK_CONDITION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION___ECROSS_REFERENCES = CLOCK_CONDITION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION___EGET__ESTRUCTURALFEATURE = CLOCK_CONDITION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CLOCK_CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT = CLOCK_CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION___EIS_SET__ESTRUCTURALFEATURE = CLOCK_CONDITION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION___EUNSET__ESTRUCTURALFEATURE = CLOCK_CONDITION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION___EINVOKE__EOPERATION_ELIST = CLOCK_CONDITION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Hybrid Clock Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_CLOCK_CONDITION_OPERATION_COUNT = CLOCK_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.BasicClockConditionImpl <em>Basic Clock Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.BasicClockConditionImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getBasicClockCondition()
	 * @generated
	 */
	int BASIC_CLOCK_CONDITION = 19;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION__EXTENSIONS = RealtimestatechartPackage.CLOCK_CONSTRAINT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION__BOUND = RealtimestatechartPackage.CLOCK_CONSTRAINT__BOUND;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION__CLOCK = RealtimestatechartPackage.CLOCK_CONSTRAINT__CLOCK;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION__OPERATOR = RealtimestatechartPackage.CLOCK_CONSTRAINT__OPERATOR;

	/**
	 * The number of structural features of the '<em>Basic Clock Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION_FEATURE_COUNT = RealtimestatechartPackage.CLOCK_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___GET_EXTENSION__ECLASS = RealtimestatechartPackage.CLOCK_CONSTRAINT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___ECLASS = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___EIS_PROXY = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___ERESOURCE = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___ECONTAINER = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___ECONTAINING_FEATURE = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___ECONTAINMENT_FEATURE = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___ECONTENTS = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___EALL_CONTENTS = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___ECROSS_REFERENCES = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___EGET__ESTRUCTURALFEATURE = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___EIS_SET__ESTRUCTURALFEATURE = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___EUNSET__ESTRUCTURALFEATURE = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION___EINVOKE__EOPERATION_ELIST = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Basic Clock Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOCK_CONDITION_OPERATION_COUNT = RealtimestatechartPackage.CLOCK_CONSTRAINT_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.DataConditionImpl <em>Data Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.DataConditionImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getDataCondition()
	 * @generated
	 */
	int DATA_CONDITION = 20;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION__EXPRESSION = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION___ECLASS = CONDITION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION___EIS_PROXY = CONDITION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION___ERESOURCE = CONDITION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION___ECONTAINER = CONDITION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION___ECONTAINING_FEATURE = CONDITION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION___ECONTAINMENT_FEATURE = CONDITION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION___ECONTENTS = CONDITION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION___EALL_CONTENTS = CONDITION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION___ECROSS_REFERENCES = CONDITION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION___EGET__ESTRUCTURALFEATURE = CONDITION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT = CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION___EIS_SET__ESTRUCTURALFEATURE = CONDITION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION___EUNSET__ESTRUCTURALFEATURE = CONDITION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION___EINVOKE__EOPERATION_ELIST = CONDITION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Data Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.CompositionConditionImpl <em>Composition Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.CompositionConditionImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getCompositionCondition()
	 * @generated
	 */
	int COMPOSITION_CONDITION = 21;

	/**
	 * The feature id for the '<em><b>Left Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION__LEFT_CONDITION = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION__KIND = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION__RIGHT_CONDITION = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composition Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION___ECLASS = CONDITION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION___EIS_PROXY = CONDITION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION___ERESOURCE = CONDITION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION___ECONTAINER = CONDITION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION___ECONTAINING_FEATURE = CONDITION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION___ECONTAINMENT_FEATURE = CONDITION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION___ECONTENTS = CONDITION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION___EALL_CONTENTS = CONDITION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION___ECROSS_REFERENCES = CONDITION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION___EGET__ESTRUCTURALFEATURE = CONDITION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT = CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION___EIS_SET__ESTRUCTURALFEATURE = CONDITION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION___EUNSET__ESTRUCTURALFEATURE = CONDITION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION___EINVOKE__EOPERATION_ELIST = CONDITION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Composition Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.EventImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 22;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ECLASS = EcorePackage.EOBJECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___EIS_PROXY = EcorePackage.EOBJECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ERESOURCE = EcorePackage.EOBJECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ECONTAINER = EcorePackage.EOBJECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ECONTAINING_FEATURE = EcorePackage.EOBJECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ECONTAINMENT_FEATURE = EcorePackage.EOBJECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ECONTENTS = EcorePackage.EOBJECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___EALL_CONTENTS = EcorePackage.EOBJECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ECROSS_REFERENCES = EcorePackage.EOBJECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___EGET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ESET__ESTRUCTURALFEATURE_OBJECT = EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___EIS_SET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___EUNSET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___EINVOKE__EOPERATION_ELIST = EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = EcorePackage.EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.SimpleEventImpl <em>Simple Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.SimpleEventImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getSimpleEvent()
	 * @generated
	 */
	int SIMPLE_EVENT = 23;

	/**
	 * The number of structural features of the '<em>Simple Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT___ECLASS = EVENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT___EIS_PROXY = EVENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT___ERESOURCE = EVENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT___ECONTAINER = EVENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT___ECONTAINING_FEATURE = EVENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT___ECONTAINMENT_FEATURE = EVENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT___ECONTENTS = EVENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT___EALL_CONTENTS = EVENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT___ECROSS_REFERENCES = EVENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT___EGET__ESTRUCTURALFEATURE = EVENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT___ESET__ESTRUCTURALFEATURE_OBJECT = EVENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT___EIS_SET__ESTRUCTURALFEATURE = EVENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT___EUNSET__ESTRUCTURALFEATURE = EVENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT___EINVOKE__EOPERATION_ELIST = EVENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Simple Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.CompositionEventImpl <em>Composition Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.CompositionEventImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getCompositionEvent()
	 * @generated
	 */
	int COMPOSITION_EVENT = 24;

	/**
	 * The feature id for the '<em><b>Left Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT__LEFT_EVENT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT__KIND = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT__RIGHT_EVENT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT___ECLASS = EVENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT___EIS_PROXY = EVENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT___ERESOURCE = EVENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT___ECONTAINER = EVENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT___ECONTAINING_FEATURE = EVENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT___ECONTAINMENT_FEATURE = EVENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT___ECONTENTS = EVENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT___EALL_CONTENTS = EVENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT___ECROSS_REFERENCES = EVENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT___EGET__ESTRUCTURALFEATURE = EVENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT___ESET__ESTRUCTURALFEATURE_OBJECT = EVENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT___EIS_SET__ESTRUCTURALFEATURE = EVENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT___EUNSET__ESTRUCTURALFEATURE = EVENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT___EINVOKE__EOPERATION_ELIST = EVENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Composition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.CountedEventImpl <em>Counted Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.CountedEventImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getCountedEvent()
	 * @generated
	 */
	int COUNTED_EVENT = 25;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT__EVENT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT__COUNTER = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Counted Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT___ECLASS = EVENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT___EIS_PROXY = EVENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT___ERESOURCE = EVENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT___ECONTAINER = EVENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT___ECONTAINING_FEATURE = EVENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT___ECONTAINMENT_FEATURE = EVENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT___ECONTENTS = EVENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT___EALL_CONTENTS = EVENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT___ECROSS_REFERENCES = EVENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT___EGET__ESTRUCTURALFEATURE = EVENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT___ESET__ESTRUCTURALFEATURE_OBJECT = EVENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT___EIS_SET__ESTRUCTURALFEATURE = EVENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT___EUNSET__ESTRUCTURALFEATURE = EVENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT___EINVOKE__EOPERATION_ELIST = EVENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Counted Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTED_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.DelayedEventImpl <em>Delayed Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.DelayedEventImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getDelayedEvent()
	 * @generated
	 */
	int DELAYED_EVENT = 26;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT__DELAY = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT__EVENT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delayed Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT___ECLASS = EVENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT___EIS_PROXY = EVENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT___ERESOURCE = EVENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT___ECONTAINER = EVENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT___ECONTAINING_FEATURE = EVENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT___ECONTAINMENT_FEATURE = EVENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT___ECONTENTS = EVENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT___EALL_CONTENTS = EVENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT___ECROSS_REFERENCES = EVENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT___EGET__ESTRUCTURALFEATURE = EVENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT___ESET__ESTRUCTURALFEATURE_OBJECT = EVENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT___EIS_SET__ESTRUCTURALFEATURE = EVENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT___EUNSET__ESTRUCTURALFEATURE = EVENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT___EINVOKE__EOPERATION_ELIST = EVENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Delayed Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.SynchronizationEventImpl <em>Synchronization Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.SynchronizationEventImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getSynchronizationEvent()
	 * @generated
	 */
	int SYNCHRONIZATION_EVENT = 27;

	/**
	 * The feature id for the '<em><b>Selector Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT__EVENT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronization Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT___ECLASS = EVENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT___EIS_PROXY = EVENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT___ERESOURCE = EVENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT___ECONTAINER = EVENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT___ECONTAINING_FEATURE = EVENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT___ECONTAINMENT_FEATURE = EVENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT___ECONTENTS = EVENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT___EALL_CONTENTS = EVENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT___ECROSS_REFERENCES = EVENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT___EGET__ESTRUCTURALFEATURE = EVENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT___ESET__ESTRUCTURALFEATURE_OBJECT = EVENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT___EIS_SET__ESTRUCTURALFEATURE = EVENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT___EUNSET__ESTRUCTURALFEATURE = EVENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT___EINVOKE__EOPERATION_ELIST = EVENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Synchronization Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.TransitionEventImpl <em>Transition Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.TransitionEventImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getTransitionEvent()
	 * @generated
	 */
	int TRANSITION_EVENT = 28;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT__TRANSITION = SIMPLE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT_FEATURE_COUNT = SIMPLE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT___ECLASS = SIMPLE_EVENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT___EIS_PROXY = SIMPLE_EVENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT___ERESOURCE = SIMPLE_EVENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT___ECONTAINER = SIMPLE_EVENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT___ECONTAINING_FEATURE = SIMPLE_EVENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT___ECONTAINMENT_FEATURE = SIMPLE_EVENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT___ECONTENTS = SIMPLE_EVENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT___EALL_CONTENTS = SIMPLE_EVENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT___ECROSS_REFERENCES = SIMPLE_EVENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT___EGET__ESTRUCTURALFEATURE = SIMPLE_EVENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = SIMPLE_EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT___ESET__ESTRUCTURALFEATURE_OBJECT = SIMPLE_EVENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT___EIS_SET__ESTRUCTURALFEATURE = SIMPLE_EVENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT___EUNSET__ESTRUCTURALFEATURE = SIMPLE_EVENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT___EINVOKE__EOPERATION_ELIST = SIMPLE_EVENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Transition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT_OPERATION_COUNT = SIMPLE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.StateEventImpl <em>State Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.StateEventImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getStateEvent()
	 * @generated
	 */
	int STATE_EVENT = 29;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT__STATE = SIMPLE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT__KIND = SIMPLE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT_FEATURE_COUNT = SIMPLE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT___ECLASS = SIMPLE_EVENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT___EIS_PROXY = SIMPLE_EVENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT___ERESOURCE = SIMPLE_EVENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT___ECONTAINER = SIMPLE_EVENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT___ECONTAINING_FEATURE = SIMPLE_EVENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT___ECONTAINMENT_FEATURE = SIMPLE_EVENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT___ECONTENTS = SIMPLE_EVENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT___EALL_CONTENTS = SIMPLE_EVENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT___ECROSS_REFERENCES = SIMPLE_EVENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT___EGET__ESTRUCTURALFEATURE = SIMPLE_EVENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = SIMPLE_EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT___ESET__ESTRUCTURALFEATURE_OBJECT = SIMPLE_EVENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT___EIS_SET__ESTRUCTURALFEATURE = SIMPLE_EVENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT___EUNSET__ESTRUCTURALFEATURE = SIMPLE_EVENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT___EINVOKE__EOPERATION_ELIST = SIMPLE_EVENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>State Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT_OPERATION_COUNT = SIMPLE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.StateCombinationEventImpl <em>State Combination Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.StateCombinationEventImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getStateCombinationEvent()
	 * @generated
	 */
	int STATE_COMBINATION_EVENT = 30;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT__STATES = SIMPLE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT__KIND = SIMPLE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Combination Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT_FEATURE_COUNT = SIMPLE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT___ECLASS = SIMPLE_EVENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT___EIS_PROXY = SIMPLE_EVENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT___ERESOURCE = SIMPLE_EVENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT___ECONTAINER = SIMPLE_EVENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT___ECONTAINING_FEATURE = SIMPLE_EVENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT___ECONTAINMENT_FEATURE = SIMPLE_EVENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT___ECONTENTS = SIMPLE_EVENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT___EALL_CONTENTS = SIMPLE_EVENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT___ECROSS_REFERENCES = SIMPLE_EVENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT___EGET__ESTRUCTURALFEATURE = SIMPLE_EVENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = SIMPLE_EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT___ESET__ESTRUCTURALFEATURE_OBJECT = SIMPLE_EVENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT___EIS_SET__ESTRUCTURALFEATURE = SIMPLE_EVENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT___EUNSET__ESTRUCTURALFEATURE = SIMPLE_EVENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT___EINVOKE__EOPERATION_ELIST = SIMPLE_EVENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>State Combination Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COMBINATION_EVENT_OPERATION_COUNT = SIMPLE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.MessageEventImpl <em>Message Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.MessageEventImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getMessageEvent()
	 * @generated
	 */
	int MESSAGE_EVENT = 31;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__KIND = SIMPLE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__TYPE = SIMPLE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__PORT = SIMPLE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_FEATURE_COUNT = SIMPLE_EVENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___ECLASS = SIMPLE_EVENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___EIS_PROXY = SIMPLE_EVENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___ERESOURCE = SIMPLE_EVENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___ECONTAINER = SIMPLE_EVENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___ECONTAINING_FEATURE = SIMPLE_EVENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___ECONTAINMENT_FEATURE = SIMPLE_EVENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___ECONTENTS = SIMPLE_EVENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___EALL_CONTENTS = SIMPLE_EVENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___ECROSS_REFERENCES = SIMPLE_EVENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___EGET__ESTRUCTURALFEATURE = SIMPLE_EVENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = SIMPLE_EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___ESET__ESTRUCTURALFEATURE_OBJECT = SIMPLE_EVENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___EIS_SET__ESTRUCTURALFEATURE = SIMPLE_EVENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___EUNSET__ESTRUCTURALFEATURE = SIMPLE_EVENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___EINVOKE__EOPERATION_ELIST = SIMPLE_EVENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_OPERATION_COUNT = SIMPLE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.impl.TriggerMessageImpl <em>Trigger Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.impl.TriggerMessageImpl
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getTriggerMessage()
	 * @generated
	 */
	int TRIGGER_MESSAGE = 32;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE__EXTENSIONS = DEPENDENCY__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE__COMMENT = DEPENDENCY__COMMENT;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE__EFFECTS = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE__MESSAGE_EVENT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trigger Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE___GET_EXTENSION__ECLASS = DEPENDENCY___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Trigger Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.AssignmentDirection <em>Assignment Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.AssignmentDirection
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getAssignmentDirection()
	 * @generated
	 */
	int ASSIGNMENT_DIRECTION = 33;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.StateStatusKind <em>State Status Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.StateStatusKind
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getStateStatusKind()
	 * @generated
	 */
	int STATE_STATUS_KIND = 34;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.StateEventKind <em>State Event Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.StateEventKind
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getStateEventKind()
	 * @generated
	 */
	int STATE_EVENT_KIND = 35;

	/**
	 * The meta object id for the '{@link org.muml.cbs.dependencylanguage.MessageEventKind <em>Message Event Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.cbs.dependencylanguage.MessageEventKind
	 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getMessageEventKind()
	 * @generated
	 */
	int MESSAGE_EVENT_KIND = 36;


	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.SynthesizableBehavior <em>Synthesizable Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synthesizable Behavior</em>'.
	 * @see org.muml.cbs.dependencylanguage.SynthesizableBehavior
	 * @generated
	 */
	EClass getSynthesizableBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.SynthesizableBehavior#getDependencyModel <em>Dependency Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependency Model</em>'.
	 * @see org.muml.cbs.dependencylanguage.SynthesizableBehavior#getDependencyModel()
	 * @see #getSynthesizableBehavior()
	 * @generated
	 */
	EReference getSynthesizableBehavior_DependencyModel();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.SynthesizableBehavior#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.cbs.dependencylanguage.SynthesizableBehavior#getName()
	 * @see #getSynthesizableBehavior()
	 * @generated
	 */
	EAttribute getSynthesizableBehavior_Name();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.DependencyModel <em>Dependency Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Model</em>'.
	 * @see org.muml.cbs.dependencylanguage.DependencyModel
	 * @generated
	 */
	EClass getDependencyModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.cbs.dependencylanguage.DependencyModel#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see org.muml.cbs.dependencylanguage.DependencyModel#getDependencies()
	 * @see #getDependencyModel()
	 * @generated
	 */
	EReference getDependencyModel_Dependencies();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see org.muml.cbs.dependencylanguage.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization</em>'.
	 * @see org.muml.cbs.dependencylanguage.Synchronization
	 * @generated
	 */
	EClass getSynchronization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.cbs.dependencylanguage.Synchronization#getSendingEvents <em>Sending Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sending Events</em>'.
	 * @see org.muml.cbs.dependencylanguage.Synchronization#getSendingEvents()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_SendingEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.cbs.dependencylanguage.Synchronization#getReceivingEvents <em>Receiving Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receiving Events</em>'.
	 * @see org.muml.cbs.dependencylanguage.Synchronization#getReceivingEvents()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_ReceivingEvents();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.Synchronization#getChannelName <em>Channel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Name</em>'.
	 * @see org.muml.cbs.dependencylanguage.Synchronization#getChannelName()
	 * @see #getSynchronization()
	 * @generated
	 */
	EAttribute getSynchronization_ChannelName();

	/**
	 * Returns the meta object for the reference '{@link org.muml.cbs.dependencylanguage.Synchronization#getSelectorType <em>Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selector Type</em>'.
	 * @see org.muml.cbs.dependencylanguage.Synchronization#getSelectorType()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_SelectorType();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.Synchronization#getGeneralSelectorExpression <em>General Selector Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Selector Expression</em>'.
	 * @see org.muml.cbs.dependencylanguage.Synchronization#getGeneralSelectorExpression()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_GeneralSelectorExpression();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.ForbiddenStateCombination <em>Forbidden State Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forbidden State Combination</em>'.
	 * @see org.muml.cbs.dependencylanguage.ForbiddenStateCombination
	 * @generated
	 */
	EClass getForbiddenStateCombination();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.cbs.dependencylanguage.ForbiddenStateCombination#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see org.muml.cbs.dependencylanguage.ForbiddenStateCombination#getStates()
	 * @see #getForbiddenStateCombination()
	 * @generated
	 */
	EReference getForbiddenStateCombination_States();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.ClockMerge <em>Clock Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Merge</em>'.
	 * @see org.muml.cbs.dependencylanguage.ClockMerge
	 * @generated
	 */
	EClass getClockMerge();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.cbs.dependencylanguage.ClockMerge#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clocks</em>'.
	 * @see org.muml.cbs.dependencylanguage.ClockMerge#getClocks()
	 * @see #getClockMerge()
	 * @generated
	 */
	EReference getClockMerge_Clocks();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.ClockMerge#getClockName <em>Clock Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Name</em>'.
	 * @see org.muml.cbs.dependencylanguage.ClockMerge#getClockName()
	 * @see #getClockMerge()
	 * @generated
	 */
	EAttribute getClockMerge_ClockName();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.DataMerge <em>Data Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Merge</em>'.
	 * @see org.muml.cbs.dependencylanguage.DataMerge
	 * @generated
	 */
	EClass getDataMerge();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.cbs.dependencylanguage.DataMerge#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see org.muml.cbs.dependencylanguage.DataMerge#getVariables()
	 * @see #getDataMerge()
	 * @generated
	 */
	EReference getDataMerge_Variables();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.DataMerge#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see org.muml.cbs.dependencylanguage.DataMerge#getVariableName()
	 * @see #getDataMerge()
	 * @generated
	 */
	EAttribute getDataMerge_VariableName();

	/**
	 * Returns the meta object for the reference '{@link org.muml.cbs.dependencylanguage.DataMerge#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.muml.cbs.dependencylanguage.DataMerge#getPort()
	 * @see #getDataMerge()
	 * @generated
	 */
	EReference getDataMerge_Port();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.ConditionalDependency <em>Conditional Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Dependency</em>'.
	 * @see org.muml.cbs.dependencylanguage.ConditionalDependency
	 * @generated
	 */
	EClass getConditionalDependency();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.ConditionalDependency#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.ConditionalDependency#getEvent()
	 * @see #getConditionalDependency()
	 * @generated
	 */
	EReference getConditionalDependency_Event();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.ConditionalDependency#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.muml.cbs.dependencylanguage.ConditionalDependency#getCondition()
	 * @see #getConditionalDependency()
	 * @generated
	 */
	EReference getConditionalDependency_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.cbs.dependencylanguage.ConditionalDependency#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see org.muml.cbs.dependencylanguage.ConditionalDependency#getEffects()
	 * @see #getConditionalDependency()
	 * @generated
	 */
	EReference getConditionalDependency_Effects();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect</em>'.
	 * @see org.muml.cbs.dependencylanguage.Effect
	 * @generated
	 */
	EClass getEffect();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.EnableDisableEffect <em>Enable Disable Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enable Disable Effect</em>'.
	 * @see org.muml.cbs.dependencylanguage.EnableDisableEffect
	 * @generated
	 */
	EClass getEnableDisableEffect();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.EnableDisableEffect#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.EnableDisableEffect#getEvent()
	 * @see #getEnableDisableEffect()
	 * @generated
	 */
	EReference getEnableDisableEffect_Event();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.EnableDisableEffect#isIsEnable <em>Is Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Enable</em>'.
	 * @see org.muml.cbs.dependencylanguage.EnableDisableEffect#isIsEnable()
	 * @see #getEnableDisableEffect()
	 * @generated
	 */
	EAttribute getEnableDisableEffect_IsEnable();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.ClockResetEffect <em>Clock Reset Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Reset Effect</em>'.
	 * @see org.muml.cbs.dependencylanguage.ClockResetEffect
	 * @generated
	 */
	EClass getClockResetEffect();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.cbs.dependencylanguage.ClockResetEffect#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clocks</em>'.
	 * @see org.muml.cbs.dependencylanguage.ClockResetEffect#getClocks()
	 * @see #getClockResetEffect()
	 * @generated
	 */
	EReference getClockResetEffect_Clocks();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.DataAssignmentEffect <em>Data Assignment Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Assignment Effect</em>'.
	 * @see org.muml.cbs.dependencylanguage.DataAssignmentEffect
	 * @generated
	 */
	EClass getDataAssignmentEffect();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.DataAssignmentEffect#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.muml.cbs.dependencylanguage.DataAssignmentEffect#getDirection()
	 * @see #getDataAssignmentEffect()
	 * @generated
	 */
	EAttribute getDataAssignmentEffect_Direction();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.BoundedActiveState <em>Bounded Active State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Active State</em>'.
	 * @see org.muml.cbs.dependencylanguage.BoundedActiveState
	 * @generated
	 */
	EClass getBoundedActiveState();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.cbs.dependencylanguage.BoundedActiveState#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see org.muml.cbs.dependencylanguage.BoundedActiveState#getStates()
	 * @see #getBoundedActiveState()
	 * @generated
	 */
	EReference getBoundedActiveState_States();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.BoundedActiveState#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see org.muml.cbs.dependencylanguage.BoundedActiveState#getConstraint()
	 * @see #getBoundedActiveState()
	 * @generated
	 */
	EReference getBoundedActiveState_Constraint();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.muml.cbs.dependencylanguage.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.StateStatusCondition <em>State Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Status Condition</em>'.
	 * @see org.muml.cbs.dependencylanguage.StateStatusCondition
	 * @generated
	 */
	EClass getStateStatusCondition();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.cbs.dependencylanguage.StateStatusCondition#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see org.muml.cbs.dependencylanguage.StateStatusCondition#getStates()
	 * @see #getStateStatusCondition()
	 * @generated
	 */
	EReference getStateStatusCondition_States();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.StateStatusCondition#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.muml.cbs.dependencylanguage.StateStatusCondition#getKind()
	 * @see #getStateStatusCondition()
	 * @generated
	 */
	EAttribute getStateStatusCondition_Kind();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition <em>Event Constrained Interval Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Constrained Interval Condition</em>'.
	 * @see org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition
	 * @generated
	 */
	EClass getEventConstrainedIntervalCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#getFromEvent <em>From Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#getFromEvent()
	 * @see #getEventConstrainedIntervalCondition()
	 * @generated
	 */
	EReference getEventConstrainedIntervalCondition_FromEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#isInitialEnabled <em>Initial Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Enabled</em>'.
	 * @see org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#isInitialEnabled()
	 * @see #getEventConstrainedIntervalCondition()
	 * @generated
	 */
	EAttribute getEventConstrainedIntervalCondition_InitialEnabled();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#getUntilEvent <em>Until Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#getUntilEvent()
	 * @see #getEventConstrainedIntervalCondition()
	 * @generated
	 */
	EReference getEventConstrainedIntervalCondition_UntilEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#isEnabledInfite <em>Enabled Infite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled Infite</em>'.
	 * @see org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#isEnabledInfite()
	 * @see #getEventConstrainedIntervalCondition()
	 * @generated
	 */
	EAttribute getEventConstrainedIntervalCondition_EnabledInfite();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.ClockCondition <em>Clock Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Condition</em>'.
	 * @see org.muml.cbs.dependencylanguage.ClockCondition
	 * @generated
	 */
	EClass getClockCondition();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.AuxiliaryClockCondition <em>Auxiliary Clock Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary Clock Condition</em>'.
	 * @see org.muml.cbs.dependencylanguage.AuxiliaryClockCondition
	 * @generated
	 */
	EClass getAuxiliaryClockCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.AuxiliaryClockCondition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.AuxiliaryClockCondition#getEvent()
	 * @see #getAuxiliaryClockCondition()
	 * @generated
	 */
	EReference getAuxiliaryClockCondition_Event();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.AuxiliaryClockCondition#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound</em>'.
	 * @see org.muml.cbs.dependencylanguage.AuxiliaryClockCondition#getBound()
	 * @see #getAuxiliaryClockCondition()
	 * @generated
	 */
	EReference getAuxiliaryClockCondition_Bound();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.AuxiliaryClockCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.muml.cbs.dependencylanguage.AuxiliaryClockCondition#getOperator()
	 * @see #getAuxiliaryClockCondition()
	 * @generated
	 */
	EAttribute getAuxiliaryClockCondition_Operator();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.HybridClockCondition <em>Hybrid Clock Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Clock Condition</em>'.
	 * @see org.muml.cbs.dependencylanguage.HybridClockCondition
	 * @generated
	 */
	EClass getHybridClockCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.HybridClockCondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.muml.cbs.dependencylanguage.HybridClockCondition#getCondition()
	 * @see #getHybridClockCondition()
	 * @generated
	 */
	EReference getHybridClockCondition_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.HybridClockCondition#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound</em>'.
	 * @see org.muml.cbs.dependencylanguage.HybridClockCondition#getBound()
	 * @see #getHybridClockCondition()
	 * @generated
	 */
	EReference getHybridClockCondition_Bound();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.HybridClockCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.muml.cbs.dependencylanguage.HybridClockCondition#getOperator()
	 * @see #getHybridClockCondition()
	 * @generated
	 */
	EAttribute getHybridClockCondition_Operator();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.BasicClockCondition <em>Basic Clock Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Clock Condition</em>'.
	 * @see org.muml.cbs.dependencylanguage.BasicClockCondition
	 * @generated
	 */
	EClass getBasicClockCondition();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.DataCondition <em>Data Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Condition</em>'.
	 * @see org.muml.cbs.dependencylanguage.DataCondition
	 * @generated
	 */
	EClass getDataCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.DataCondition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.muml.cbs.dependencylanguage.DataCondition#getExpression()
	 * @see #getDataCondition()
	 * @generated
	 */
	EReference getDataCondition_Expression();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.CompositionCondition <em>Composition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Condition</em>'.
	 * @see org.muml.cbs.dependencylanguage.CompositionCondition
	 * @generated
	 */
	EClass getCompositionCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.CompositionCondition#getLeftCondition <em>Left Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Condition</em>'.
	 * @see org.muml.cbs.dependencylanguage.CompositionCondition#getLeftCondition()
	 * @see #getCompositionCondition()
	 * @generated
	 */
	EReference getCompositionCondition_LeftCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.CompositionCondition#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.muml.cbs.dependencylanguage.CompositionCondition#getKind()
	 * @see #getCompositionCondition()
	 * @generated
	 */
	EAttribute getCompositionCondition_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.CompositionCondition#getRightCondition <em>Right Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Condition</em>'.
	 * @see org.muml.cbs.dependencylanguage.CompositionCondition#getRightCondition()
	 * @see #getCompositionCondition()
	 * @generated
	 */
	EReference getCompositionCondition_RightCondition();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.SimpleEvent <em>Simple Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.SimpleEvent
	 * @generated
	 */
	EClass getSimpleEvent();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.CompositionEvent <em>Composition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.CompositionEvent
	 * @generated
	 */
	EClass getCompositionEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.CompositionEvent#getLeftEvent <em>Left Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.CompositionEvent#getLeftEvent()
	 * @see #getCompositionEvent()
	 * @generated
	 */
	EReference getCompositionEvent_LeftEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.CompositionEvent#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.muml.cbs.dependencylanguage.CompositionEvent#getKind()
	 * @see #getCompositionEvent()
	 * @generated
	 */
	EAttribute getCompositionEvent_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.CompositionEvent#getRightEvent <em>Right Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.CompositionEvent#getRightEvent()
	 * @see #getCompositionEvent()
	 * @generated
	 */
	EReference getCompositionEvent_RightEvent();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.CountedEvent <em>Counted Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counted Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.CountedEvent
	 * @generated
	 */
	EClass getCountedEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.CountedEvent#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.CountedEvent#getEvent()
	 * @see #getCountedEvent()
	 * @generated
	 */
	EReference getCountedEvent_Event();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.CountedEvent#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see org.muml.cbs.dependencylanguage.CountedEvent#getCounter()
	 * @see #getCountedEvent()
	 * @generated
	 */
	EAttribute getCountedEvent_Counter();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.DelayedEvent <em>Delayed Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delayed Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.DelayedEvent
	 * @generated
	 */
	EClass getDelayedEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.DelayedEvent#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delay</em>'.
	 * @see org.muml.cbs.dependencylanguage.DelayedEvent#getDelay()
	 * @see #getDelayedEvent()
	 * @generated
	 */
	EReference getDelayedEvent_Delay();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.DelayedEvent#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.DelayedEvent#getEvent()
	 * @see #getDelayedEvent()
	 * @generated
	 */
	EReference getDelayedEvent_Event();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.SynchronizationEvent <em>Synchronization Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.SynchronizationEvent
	 * @generated
	 */
	EClass getSynchronizationEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.SynchronizationEvent#getSelectorExpression <em>Selector Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector Expression</em>'.
	 * @see org.muml.cbs.dependencylanguage.SynchronizationEvent#getSelectorExpression()
	 * @see #getSynchronizationEvent()
	 * @generated
	 */
	EReference getSynchronizationEvent_SelectorExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.SynchronizationEvent#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.SynchronizationEvent#getEvent()
	 * @see #getSynchronizationEvent()
	 * @generated
	 */
	EReference getSynchronizationEvent_Event();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.TransitionEvent <em>Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.TransitionEvent
	 * @generated
	 */
	EClass getTransitionEvent();

	/**
	 * Returns the meta object for the reference '{@link org.muml.cbs.dependencylanguage.TransitionEvent#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see org.muml.cbs.dependencylanguage.TransitionEvent#getTransition()
	 * @see #getTransitionEvent()
	 * @generated
	 */
	EReference getTransitionEvent_Transition();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.StateEvent <em>State Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.StateEvent
	 * @generated
	 */
	EClass getStateEvent();

	/**
	 * Returns the meta object for the reference '{@link org.muml.cbs.dependencylanguage.StateEvent#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.muml.cbs.dependencylanguage.StateEvent#getState()
	 * @see #getStateEvent()
	 * @generated
	 */
	EReference getStateEvent_State();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.StateEvent#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.muml.cbs.dependencylanguage.StateEvent#getKind()
	 * @see #getStateEvent()
	 * @generated
	 */
	EAttribute getStateEvent_Kind();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.StateCombinationEvent <em>State Combination Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Combination Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.StateCombinationEvent
	 * @generated
	 */
	EClass getStateCombinationEvent();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.cbs.dependencylanguage.StateCombinationEvent#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see org.muml.cbs.dependencylanguage.StateCombinationEvent#getStates()
	 * @see #getStateCombinationEvent()
	 * @generated
	 */
	EReference getStateCombinationEvent_States();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.StateCombinationEvent#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.muml.cbs.dependencylanguage.StateCombinationEvent#getKind()
	 * @see #getStateCombinationEvent()
	 * @generated
	 */
	EAttribute getStateCombinationEvent_Kind();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.MessageEvent
	 * @generated
	 */
	EClass getMessageEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.cbs.dependencylanguage.MessageEvent#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.muml.cbs.dependencylanguage.MessageEvent#getKind()
	 * @see #getMessageEvent()
	 * @generated
	 */
	EAttribute getMessageEvent_Kind();

	/**
	 * Returns the meta object for the reference '{@link org.muml.cbs.dependencylanguage.MessageEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.muml.cbs.dependencylanguage.MessageEvent#getType()
	 * @see #getMessageEvent()
	 * @generated
	 */
	EReference getMessageEvent_Type();

	/**
	 * Returns the meta object for the reference '{@link org.muml.cbs.dependencylanguage.MessageEvent#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.muml.cbs.dependencylanguage.MessageEvent#getPort()
	 * @see #getMessageEvent()
	 * @generated
	 */
	EReference getMessageEvent_Port();

	/**
	 * Returns the meta object for class '{@link org.muml.cbs.dependencylanguage.TriggerMessage <em>Trigger Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Message</em>'.
	 * @see org.muml.cbs.dependencylanguage.TriggerMessage
	 * @generated
	 */
	EClass getTriggerMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.cbs.dependencylanguage.TriggerMessage#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see org.muml.cbs.dependencylanguage.TriggerMessage#getEffects()
	 * @see #getTriggerMessage()
	 * @generated
	 */
	EReference getTriggerMessage_Effects();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.cbs.dependencylanguage.TriggerMessage#getMessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Event</em>'.
	 * @see org.muml.cbs.dependencylanguage.TriggerMessage#getMessageEvent()
	 * @see #getTriggerMessage()
	 * @generated
	 */
	EReference getTriggerMessage_MessageEvent();

	/**
	 * Returns the meta object for enum '{@link org.muml.cbs.dependencylanguage.AssignmentDirection <em>Assignment Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assignment Direction</em>'.
	 * @see org.muml.cbs.dependencylanguage.AssignmentDirection
	 * @generated
	 */
	EEnum getAssignmentDirection();

	/**
	 * Returns the meta object for enum '{@link org.muml.cbs.dependencylanguage.StateStatusKind <em>State Status Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Status Kind</em>'.
	 * @see org.muml.cbs.dependencylanguage.StateStatusKind
	 * @generated
	 */
	EEnum getStateStatusKind();

	/**
	 * Returns the meta object for enum '{@link org.muml.cbs.dependencylanguage.StateEventKind <em>State Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Event Kind</em>'.
	 * @see org.muml.cbs.dependencylanguage.StateEventKind
	 * @generated
	 */
	EEnum getStateEventKind();

	/**
	 * Returns the meta object for enum '{@link org.muml.cbs.dependencylanguage.MessageEventKind <em>Message Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Event Kind</em>'.
	 * @see org.muml.cbs.dependencylanguage.MessageEventKind
	 * @generated
	 */
	EEnum getMessageEventKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DependencylanguageFactory getDependencylanguageFactory();

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
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.SynthesizableBehaviorImpl <em>Synthesizable Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.SynthesizableBehaviorImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getSynthesizableBehavior()
		 * @generated
		 */
		EClass SYNTHESIZABLE_BEHAVIOR = eINSTANCE.getSynthesizableBehavior();

		/**
		 * The meta object literal for the '<em><b>Dependency Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNTHESIZABLE_BEHAVIOR__DEPENDENCY_MODEL = eINSTANCE.getSynthesizableBehavior_DependencyModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTHESIZABLE_BEHAVIOR__NAME = eINSTANCE.getSynthesizableBehavior_Name();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.DependencyModelImpl <em>Dependency Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.DependencyModelImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getDependencyModel()
		 * @generated
		 */
		EClass DEPENDENCY_MODEL = eINSTANCE.getDependencyModel();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_MODEL__DEPENDENCIES = eINSTANCE.getDependencyModel_Dependencies();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.DependencyImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.SynchronizationImpl <em>Synchronization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.SynchronizationImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getSynchronization()
		 * @generated
		 */
		EClass SYNCHRONIZATION = eINSTANCE.getSynchronization();

		/**
		 * The meta object literal for the '<em><b>Sending Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION__SENDING_EVENTS = eINSTANCE.getSynchronization_SendingEvents();

		/**
		 * The meta object literal for the '<em><b>Receiving Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION__RECEIVING_EVENTS = eINSTANCE.getSynchronization_ReceivingEvents();

		/**
		 * The meta object literal for the '<em><b>Channel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONIZATION__CHANNEL_NAME = eINSTANCE.getSynchronization_ChannelName();

		/**
		 * The meta object literal for the '<em><b>Selector Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION__SELECTOR_TYPE = eINSTANCE.getSynchronization_SelectorType();

		/**
		 * The meta object literal for the '<em><b>General Selector Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION = eINSTANCE.getSynchronization_GeneralSelectorExpression();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.ForbiddenStateCombinationImpl <em>Forbidden State Combination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.ForbiddenStateCombinationImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getForbiddenStateCombination()
		 * @generated
		 */
		EClass FORBIDDEN_STATE_COMBINATION = eINSTANCE.getForbiddenStateCombination();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORBIDDEN_STATE_COMBINATION__STATES = eINSTANCE.getForbiddenStateCombination_States();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.ClockMergeImpl <em>Clock Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.ClockMergeImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getClockMerge()
		 * @generated
		 */
		EClass CLOCK_MERGE = eINSTANCE.getClockMerge();

		/**
		 * The meta object literal for the '<em><b>Clocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_MERGE__CLOCKS = eINSTANCE.getClockMerge_Clocks();

		/**
		 * The meta object literal for the '<em><b>Clock Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK_MERGE__CLOCK_NAME = eINSTANCE.getClockMerge_ClockName();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.DataMergeImpl <em>Data Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.DataMergeImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getDataMerge()
		 * @generated
		 */
		EClass DATA_MERGE = eINSTANCE.getDataMerge();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MERGE__VARIABLES = eINSTANCE.getDataMerge_Variables();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MERGE__VARIABLE_NAME = eINSTANCE.getDataMerge_VariableName();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MERGE__PORT = eINSTANCE.getDataMerge_Port();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.ConditionalDependencyImpl <em>Conditional Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.ConditionalDependencyImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getConditionalDependency()
		 * @generated
		 */
		EClass CONDITIONAL_DEPENDENCY = eINSTANCE.getConditionalDependency();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_DEPENDENCY__EVENT = eINSTANCE.getConditionalDependency_Event();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_DEPENDENCY__CONDITION = eINSTANCE.getConditionalDependency_Condition();

		/**
		 * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_DEPENDENCY__EFFECTS = eINSTANCE.getConditionalDependency_Effects();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.EffectImpl <em>Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.EffectImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getEffect()
		 * @generated
		 */
		EClass EFFECT = eINSTANCE.getEffect();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.EnableDisableEffectImpl <em>Enable Disable Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.EnableDisableEffectImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getEnableDisableEffect()
		 * @generated
		 */
		EClass ENABLE_DISABLE_EFFECT = eINSTANCE.getEnableDisableEffect();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENABLE_DISABLE_EFFECT__EVENT = eINSTANCE.getEnableDisableEffect_Event();

		/**
		 * The meta object literal for the '<em><b>Is Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_DISABLE_EFFECT__IS_ENABLE = eINSTANCE.getEnableDisableEffect_IsEnable();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.ClockResetEffectImpl <em>Clock Reset Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.ClockResetEffectImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getClockResetEffect()
		 * @generated
		 */
		EClass CLOCK_RESET_EFFECT = eINSTANCE.getClockResetEffect();

		/**
		 * The meta object literal for the '<em><b>Clocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_RESET_EFFECT__CLOCKS = eINSTANCE.getClockResetEffect_Clocks();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.DataAssignmentEffectImpl <em>Data Assignment Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.DataAssignmentEffectImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getDataAssignmentEffect()
		 * @generated
		 */
		EClass DATA_ASSIGNMENT_EFFECT = eINSTANCE.getDataAssignmentEffect();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ASSIGNMENT_EFFECT__DIRECTION = eINSTANCE.getDataAssignmentEffect_Direction();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.BoundedActiveStateImpl <em>Bounded Active State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.BoundedActiveStateImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getBoundedActiveState()
		 * @generated
		 */
		EClass BOUNDED_ACTIVE_STATE = eINSTANCE.getBoundedActiveState();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_ACTIVE_STATE__STATES = eINSTANCE.getBoundedActiveState_States();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_ACTIVE_STATE__CONSTRAINT = eINSTANCE.getBoundedActiveState_Constraint();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.ConditionImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.StateStatusConditionImpl <em>State Status Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.StateStatusConditionImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getStateStatusCondition()
		 * @generated
		 */
		EClass STATE_STATUS_CONDITION = eINSTANCE.getStateStatusCondition();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_STATUS_CONDITION__STATES = eINSTANCE.getStateStatusCondition_States();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_STATUS_CONDITION__KIND = eINSTANCE.getStateStatusCondition_Kind();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.EventConstrainedIntervalConditionImpl <em>Event Constrained Interval Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.EventConstrainedIntervalConditionImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getEventConstrainedIntervalCondition()
		 * @generated
		 */
		EClass EVENT_CONSTRAINED_INTERVAL_CONDITION = eINSTANCE.getEventConstrainedIntervalCondition();

		/**
		 * The meta object literal for the '<em><b>From Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT = eINSTANCE.getEventConstrainedIntervalCondition_FromEvent();

		/**
		 * The meta object literal for the '<em><b>Initial Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_CONSTRAINED_INTERVAL_CONDITION__INITIAL_ENABLED = eINSTANCE.getEventConstrainedIntervalCondition_InitialEnabled();

		/**
		 * The meta object literal for the '<em><b>Until Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT = eINSTANCE.getEventConstrainedIntervalCondition_UntilEvent();

		/**
		 * The meta object literal for the '<em><b>Enabled Infite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_CONSTRAINED_INTERVAL_CONDITION__ENABLED_INFITE = eINSTANCE.getEventConstrainedIntervalCondition_EnabledInfite();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.ClockConditionImpl <em>Clock Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.ClockConditionImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getClockCondition()
		 * @generated
		 */
		EClass CLOCK_CONDITION = eINSTANCE.getClockCondition();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.AuxiliaryClockConditionImpl <em>Auxiliary Clock Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.AuxiliaryClockConditionImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getAuxiliaryClockCondition()
		 * @generated
		 */
		EClass AUXILIARY_CLOCK_CONDITION = eINSTANCE.getAuxiliaryClockCondition();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_CLOCK_CONDITION__EVENT = eINSTANCE.getAuxiliaryClockCondition_Event();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_CLOCK_CONDITION__BOUND = eINSTANCE.getAuxiliaryClockCondition_Bound();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_CLOCK_CONDITION__OPERATOR = eINSTANCE.getAuxiliaryClockCondition_Operator();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.HybridClockConditionImpl <em>Hybrid Clock Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.HybridClockConditionImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getHybridClockCondition()
		 * @generated
		 */
		EClass HYBRID_CLOCK_CONDITION = eINSTANCE.getHybridClockCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_CLOCK_CONDITION__CONDITION = eINSTANCE.getHybridClockCondition_Condition();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_CLOCK_CONDITION__BOUND = eINSTANCE.getHybridClockCondition_Bound();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYBRID_CLOCK_CONDITION__OPERATOR = eINSTANCE.getHybridClockCondition_Operator();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.BasicClockConditionImpl <em>Basic Clock Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.BasicClockConditionImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getBasicClockCondition()
		 * @generated
		 */
		EClass BASIC_CLOCK_CONDITION = eINSTANCE.getBasicClockCondition();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.DataConditionImpl <em>Data Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.DataConditionImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getDataCondition()
		 * @generated
		 */
		EClass DATA_CONDITION = eINSTANCE.getDataCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONDITION__EXPRESSION = eINSTANCE.getDataCondition_Expression();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.CompositionConditionImpl <em>Composition Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.CompositionConditionImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getCompositionCondition()
		 * @generated
		 */
		EClass COMPOSITION_CONDITION = eINSTANCE.getCompositionCondition();

		/**
		 * The meta object literal for the '<em><b>Left Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_CONDITION__LEFT_CONDITION = eINSTANCE.getCompositionCondition_LeftCondition();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION_CONDITION__KIND = eINSTANCE.getCompositionCondition_Kind();

		/**
		 * The meta object literal for the '<em><b>Right Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_CONDITION__RIGHT_CONDITION = eINSTANCE.getCompositionCondition_RightCondition();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.EventImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.SimpleEventImpl <em>Simple Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.SimpleEventImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getSimpleEvent()
		 * @generated
		 */
		EClass SIMPLE_EVENT = eINSTANCE.getSimpleEvent();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.CompositionEventImpl <em>Composition Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.CompositionEventImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getCompositionEvent()
		 * @generated
		 */
		EClass COMPOSITION_EVENT = eINSTANCE.getCompositionEvent();

		/**
		 * The meta object literal for the '<em><b>Left Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_EVENT__LEFT_EVENT = eINSTANCE.getCompositionEvent_LeftEvent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION_EVENT__KIND = eINSTANCE.getCompositionEvent_Kind();

		/**
		 * The meta object literal for the '<em><b>Right Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_EVENT__RIGHT_EVENT = eINSTANCE.getCompositionEvent_RightEvent();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.CountedEventImpl <em>Counted Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.CountedEventImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getCountedEvent()
		 * @generated
		 */
		EClass COUNTED_EVENT = eINSTANCE.getCountedEvent();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTED_EVENT__EVENT = eINSTANCE.getCountedEvent_Event();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTED_EVENT__COUNTER = eINSTANCE.getCountedEvent_Counter();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.DelayedEventImpl <em>Delayed Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.DelayedEventImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getDelayedEvent()
		 * @generated
		 */
		EClass DELAYED_EVENT = eINSTANCE.getDelayedEvent();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAYED_EVENT__DELAY = eINSTANCE.getDelayedEvent_Delay();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAYED_EVENT__EVENT = eINSTANCE.getDelayedEvent_Event();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.SynchronizationEventImpl <em>Synchronization Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.SynchronizationEventImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getSynchronizationEvent()
		 * @generated
		 */
		EClass SYNCHRONIZATION_EVENT = eINSTANCE.getSynchronizationEvent();

		/**
		 * The meta object literal for the '<em><b>Selector Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION = eINSTANCE.getSynchronizationEvent_SelectorExpression();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION_EVENT__EVENT = eINSTANCE.getSynchronizationEvent_Event();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.TransitionEventImpl <em>Transition Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.TransitionEventImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getTransitionEvent()
		 * @generated
		 */
		EClass TRANSITION_EVENT = eINSTANCE.getTransitionEvent();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_EVENT__TRANSITION = eINSTANCE.getTransitionEvent_Transition();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.StateEventImpl <em>State Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.StateEventImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getStateEvent()
		 * @generated
		 */
		EClass STATE_EVENT = eINSTANCE.getStateEvent();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_EVENT__STATE = eINSTANCE.getStateEvent_State();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_EVENT__KIND = eINSTANCE.getStateEvent_Kind();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.StateCombinationEventImpl <em>State Combination Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.StateCombinationEventImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getStateCombinationEvent()
		 * @generated
		 */
		EClass STATE_COMBINATION_EVENT = eINSTANCE.getStateCombinationEvent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_COMBINATION_EVENT__STATES = eINSTANCE.getStateCombinationEvent_States();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_COMBINATION_EVENT__KIND = eINSTANCE.getStateCombinationEvent_Kind();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.MessageEventImpl <em>Message Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.MessageEventImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getMessageEvent()
		 * @generated
		 */
		EClass MESSAGE_EVENT = eINSTANCE.getMessageEvent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_EVENT__KIND = eINSTANCE.getMessageEvent_Kind();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_EVENT__TYPE = eINSTANCE.getMessageEvent_Type();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_EVENT__PORT = eINSTANCE.getMessageEvent_Port();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.impl.TriggerMessageImpl <em>Trigger Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.impl.TriggerMessageImpl
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getTriggerMessage()
		 * @generated
		 */
		EClass TRIGGER_MESSAGE = eINSTANCE.getTriggerMessage();

		/**
		 * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_MESSAGE__EFFECTS = eINSTANCE.getTriggerMessage_Effects();

		/**
		 * The meta object literal for the '<em><b>Message Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_MESSAGE__MESSAGE_EVENT = eINSTANCE.getTriggerMessage_MessageEvent();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.AssignmentDirection <em>Assignment Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.AssignmentDirection
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getAssignmentDirection()
		 * @generated
		 */
		EEnum ASSIGNMENT_DIRECTION = eINSTANCE.getAssignmentDirection();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.StateStatusKind <em>State Status Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.StateStatusKind
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getStateStatusKind()
		 * @generated
		 */
		EEnum STATE_STATUS_KIND = eINSTANCE.getStateStatusKind();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.StateEventKind <em>State Event Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.StateEventKind
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getStateEventKind()
		 * @generated
		 */
		EEnum STATE_EVENT_KIND = eINSTANCE.getStateEventKind();

		/**
		 * The meta object literal for the '{@link org.muml.cbs.dependencylanguage.MessageEventKind <em>Message Event Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.cbs.dependencylanguage.MessageEventKind
		 * @see org.muml.cbs.dependencylanguage.impl.DependencylanguagePackageImpl#getMessageEventKind()
		 * @generated
		 */
		EEnum MESSAGE_EVENT_KIND = eINSTANCE.getMessageEventKind();

	}

} //DependencylanguagePackage

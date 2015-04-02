/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.variables;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * contains 3 different kinds of variables
 * <!-- end-model-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesFactory
 * @model kind="package"
 * @generated
 */
public interface VariablesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "variables";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iem.fraunhofer.de/m4a/iec61131/1.0/core/variables";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "variables";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariablesPackage eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.Variable <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.Variable
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.NonGlobalVariable <em>Non Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.NonGlobalVariable
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getNonGlobalVariable()
	 * @generated
	 */
	int NON_GLOBAL_VARIABLE = 9;

	/**
	 * The number of structural features of the '<em>Non Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_GLOBAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Non Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_GLOBAL_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.SymbolicVariableImpl <em>Symbolic Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.SymbolicVariableImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getSymbolicVariable()
	 * @generated
	 */
	int SYMBOLIC_VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Symbolic Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_VARIABLE_FEATURE_COUNT = NON_GLOBAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Symbolic Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_VARIABLE_OPERATION_COUNT = NON_GLOBAL_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.DirectVariableImpl <em>Direct Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.DirectVariableImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getDirectVariable()
	 * @generated
	 */
	int DIRECT_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_VARIABLE__IDENTIFIER = NON_GLOBAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_VARIABLE__DIRECTION = NON_GLOBAL_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_VARIABLE__TYPE = NON_GLOBAL_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_VARIABLE__RESOURCE_REF = NON_GLOBAL_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_VARIABLE__VALUE = NON_GLOBAL_VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Direct Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_VARIABLE_FEATURE_COUNT = NON_GLOBAL_VARIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Direct Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_VARIABLE_OPERATION_COUNT = NON_GLOBAL_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.NamedVariableImpl <em>Named Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.NamedVariableImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getNamedVariable()
	 * @generated
	 */
	int NAMED_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VARIABLE__IDENTIFIER = SYMBOLIC_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VARIABLE_FEATURE_COUNT = SYMBOLIC_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VARIABLE_OPERATION_COUNT = SYMBOLIC_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.MultiElementVariableImpl <em>Multi Element Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.MultiElementVariableImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getMultiElementVariable()
	 * @generated
	 */
	int MULTI_ELEMENT_VARIABLE = 4;

	/**
	 * The number of structural features of the '<em>Multi Element Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ELEMENT_VARIABLE_FEATURE_COUNT = SYMBOLIC_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Element Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ELEMENT_VARIABLE_OPERATION_COUNT = SYMBOLIC_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.StructuredVariableImpl <em>Structured Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.StructuredVariableImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getStructuredVariable()
	 * @generated
	 */
	int STRUCTURED_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Record Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_VARIABLE__RECORD_VARIABLE = MULTI_ELEMENT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_VARIABLE__FIELD_SELECTOR = MULTI_ELEMENT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structured Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_VARIABLE_FEATURE_COUNT = MULTI_ELEMENT_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Structured Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_VARIABLE_OPERATION_COUNT = MULTI_ELEMENT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.ArrayVariableImpl <em>Array Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.ArrayVariableImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getArrayVariable()
	 * @generated
	 */
	int ARRAY_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Subscripted Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE__SUBSCRIPTED_VARIABLE = MULTI_ELEMENT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscript</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE__SUBSCRIPT = MULTI_ELEMENT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE_FEATURE_COUNT = MULTI_ELEMENT_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VARIABLE_OPERATION_COUNT = MULTI_ELEMENT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.FieldSelectorImpl <em>Field Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.FieldSelectorImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getFieldSelector()
	 * @generated
	 */
	int FIELD_SELECTOR = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SELECTOR__IDENTIFIER = LiteralsPackage.NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Field Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SELECTOR_FEATURE_COUNT = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Field Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SELECTOR_OPERATION_COUNT = LiteralsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.GlobalVarImpl <em>Global Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.GlobalVarImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getGlobalVar()
	 * @generated
	 */
	int GLOBAL_VAR = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR__IDENTIFIER = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Global Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.FBNameImpl <em>FB Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.FBNameImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getFBName()
	 * @generated
	 */
	int FB_NAME = 10;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_NAME__IDENTIFIER = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FB Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_NAME_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FB Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_NAME_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.LocationPrefix <em>Location Prefix</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.LocationPrefix
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getLocationPrefix()
	 * @generated
	 */
	int LOCATION_PREFIX = 11;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.SizePrefix <em>Size Prefix</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.SizePrefix
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getSizePrefix()
	 * @generated
	 */
	int SIZE_PREFIX = 12;


	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.SymbolicVariable <em>Symbolic Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbolic Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.SymbolicVariable
	 * @generated
	 */
	EClass getSymbolicVariable();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.DirectVariable <em>Direct Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.DirectVariable
	 * @generated
	 */
	EClass getDirectVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.DirectVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.DirectVariable#getValue()
	 * @see #getDirectVariable()
	 * @generated
	 */
	EReference getDirectVariable_Value();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.NamedVariable <em>Named Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.NamedVariable
	 * @generated
	 */
	EClass getNamedVariable();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.MultiElementVariable <em>Multi Element Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Element Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.MultiElementVariable
	 * @generated
	 */
	EClass getMultiElementVariable();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.StructuredVariable <em>Structured Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.StructuredVariable
	 * @generated
	 */
	EClass getStructuredVariable();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.StructuredVariable#getRecordVariable <em>Record Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.StructuredVariable#getRecordVariable()
	 * @see #getStructuredVariable()
	 * @generated
	 */
	EReference getStructuredVariable_RecordVariable();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.StructuredVariable#getFieldSelector <em>Field Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field Selector</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.StructuredVariable#getFieldSelector()
	 * @see #getStructuredVariable()
	 * @generated
	 */
	EReference getStructuredVariable_FieldSelector();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.ArrayVariable <em>Array Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.ArrayVariable
	 * @generated
	 */
	EClass getArrayVariable();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.ArrayVariable#getSubscriptedVariable <em>Subscripted Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscripted Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.ArrayVariable#getSubscriptedVariable()
	 * @see #getArrayVariable()
	 * @generated
	 */
	EReference getArrayVariable_SubscriptedVariable();

	/**
	 * Returns the meta object for the reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.ArrayVariable#getSubscript <em>Subscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscript</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.ArrayVariable#getSubscript()
	 * @see #getArrayVariable()
	 * @generated
	 */
	EReference getArrayVariable_Subscript();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.FieldSelector <em>Field Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Selector</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.FieldSelector
	 * @generated
	 */
	EClass getFieldSelector();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.GlobalVar <em>Global Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Var</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.GlobalVar
	 * @generated
	 */
	EClass getGlobalVar();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.NonGlobalVariable <em>Non Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Global Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.NonGlobalVariable
	 * @generated
	 */
	EClass getNonGlobalVariable();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.FBName <em>FB Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FB Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.FBName
	 * @generated
	 */
	EClass getFBName();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.LocationPrefix <em>Location Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location Prefix</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.LocationPrefix
	 * @generated
	 */
	EEnum getLocationPrefix();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.SizePrefix <em>Size Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size Prefix</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.SizePrefix
	 * @generated
	 */
	EEnum getSizePrefix();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VariablesFactory getVariablesFactory();

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
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.Variable <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.Variable
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.SymbolicVariableImpl <em>Symbolic Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.SymbolicVariableImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getSymbolicVariable()
		 * @generated
		 */
		EClass SYMBOLIC_VARIABLE = eINSTANCE.getSymbolicVariable();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.DirectVariableImpl <em>Direct Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.DirectVariableImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getDirectVariable()
		 * @generated
		 */
		EClass DIRECT_VARIABLE = eINSTANCE.getDirectVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_VARIABLE__VALUE = eINSTANCE.getDirectVariable_Value();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.NamedVariableImpl <em>Named Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.NamedVariableImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getNamedVariable()
		 * @generated
		 */
		EClass NAMED_VARIABLE = eINSTANCE.getNamedVariable();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.MultiElementVariableImpl <em>Multi Element Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.MultiElementVariableImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getMultiElementVariable()
		 * @generated
		 */
		EClass MULTI_ELEMENT_VARIABLE = eINSTANCE.getMultiElementVariable();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.StructuredVariableImpl <em>Structured Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.StructuredVariableImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getStructuredVariable()
		 * @generated
		 */
		EClass STRUCTURED_VARIABLE = eINSTANCE.getStructuredVariable();

		/**
		 * The meta object literal for the '<em><b>Record Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_VARIABLE__RECORD_VARIABLE = eINSTANCE.getStructuredVariable_RecordVariable();

		/**
		 * The meta object literal for the '<em><b>Field Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_VARIABLE__FIELD_SELECTOR = eINSTANCE.getStructuredVariable_FieldSelector();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.ArrayVariableImpl <em>Array Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.ArrayVariableImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getArrayVariable()
		 * @generated
		 */
		EClass ARRAY_VARIABLE = eINSTANCE.getArrayVariable();

		/**
		 * The meta object literal for the '<em><b>Subscripted Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_VARIABLE__SUBSCRIPTED_VARIABLE = eINSTANCE.getArrayVariable_SubscriptedVariable();

		/**
		 * The meta object literal for the '<em><b>Subscript</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_VARIABLE__SUBSCRIPT = eINSTANCE.getArrayVariable_Subscript();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.FieldSelectorImpl <em>Field Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.FieldSelectorImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getFieldSelector()
		 * @generated
		 */
		EClass FIELD_SELECTOR = eINSTANCE.getFieldSelector();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.GlobalVarImpl <em>Global Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.GlobalVarImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getGlobalVar()
		 * @generated
		 */
		EClass GLOBAL_VAR = eINSTANCE.getGlobalVar();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.NonGlobalVariable <em>Non Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.NonGlobalVariable
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getNonGlobalVariable()
		 * @generated
		 */
		EClass NON_GLOBAL_VARIABLE = eINSTANCE.getNonGlobalVariable();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.FBNameImpl <em>FB Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.FBNameImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getFBName()
		 * @generated
		 */
		EClass FB_NAME = eINSTANCE.getFBName();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.LocationPrefix <em>Location Prefix</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.LocationPrefix
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getLocationPrefix()
		 * @generated
		 */
		EEnum LOCATION_PREFIX = eINSTANCE.getLocationPrefix();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.SizePrefix <em>Size Prefix</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.SizePrefix
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl#getSizePrefix()
		 * @generated
		 */
		EEnum SIZE_PREFIX = eINSTANCE.getSizePrefix();

	}

} //VariablesPackage

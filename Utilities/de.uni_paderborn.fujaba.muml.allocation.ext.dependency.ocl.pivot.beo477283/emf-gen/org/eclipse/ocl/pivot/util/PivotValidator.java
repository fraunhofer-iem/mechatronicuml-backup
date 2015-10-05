/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.pivot.Annotation;
import org.eclipse.ocl.pivot.AnyType;
import org.eclipse.ocl.pivot.AssociationClass;
import org.eclipse.ocl.pivot.AssociationClassCallExp;
import org.eclipse.ocl.pivot.AssociativityKind;
import org.eclipse.ocl.pivot.BagType;
import org.eclipse.ocl.pivot.Behavior;
import org.eclipse.ocl.pivot.BooleanLiteralExp;
import org.eclipse.ocl.pivot.CallExp;
import org.eclipse.ocl.pivot.CallOperationAction;
import org.eclipse.ocl.pivot.CollectionItem;
import org.eclipse.ocl.pivot.CollectionKind;
import org.eclipse.ocl.pivot.CollectionLiteralExp;
import org.eclipse.ocl.pivot.CollectionLiteralPart;
import org.eclipse.ocl.pivot.CollectionRange;
import org.eclipse.ocl.pivot.CollectionType;
import org.eclipse.ocl.pivot.Comment;
import org.eclipse.ocl.pivot.CompleteClass;
import org.eclipse.ocl.pivot.CompleteEnvironment;
import org.eclipse.ocl.pivot.CompleteModel;
import org.eclipse.ocl.pivot.CompletePackage;
import org.eclipse.ocl.pivot.ConnectionPointReference;
import org.eclipse.ocl.pivot.Constraint;
import org.eclipse.ocl.pivot.ShadowExp;
import org.eclipse.ocl.pivot.ShadowPart;
import org.eclipse.ocl.pivot.DataType;
import org.eclipse.ocl.pivot.Detail;
import org.eclipse.ocl.pivot.DynamicBehavior;
import org.eclipse.ocl.pivot.DynamicElement;
import org.eclipse.ocl.pivot.DynamicProperty;
import org.eclipse.ocl.pivot.DynamicType;
import org.eclipse.ocl.pivot.DynamicValueSpecification;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.ElementExtension;
import org.eclipse.ocl.pivot.EnumLiteralExp;
import org.eclipse.ocl.pivot.Enumeration;
import org.eclipse.ocl.pivot.EnumerationLiteral;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.Feature;
import org.eclipse.ocl.pivot.FeatureCallExp;
import org.eclipse.ocl.pivot.FinalState;
import org.eclipse.ocl.pivot.IfExp;
import org.eclipse.ocl.pivot.Import;
import org.eclipse.ocl.pivot.InstanceSpecification;
import org.eclipse.ocl.pivot.IntegerLiteralExp;
import org.eclipse.ocl.pivot.InvalidLiteralExp;
import org.eclipse.ocl.pivot.InvalidType;
import org.eclipse.ocl.pivot.IterateExp;
import org.eclipse.ocl.pivot.Iteration;
import org.eclipse.ocl.pivot.IteratorExp;
import org.eclipse.ocl.pivot.LambdaType;
import org.eclipse.ocl.pivot.LanguageExpression;
import org.eclipse.ocl.pivot.LetExp;
import org.eclipse.ocl.pivot.Library;
import org.eclipse.ocl.pivot.LiteralExp;
import org.eclipse.ocl.pivot.LoopExp;
import org.eclipse.ocl.pivot.MapLiteralExp;
import org.eclipse.ocl.pivot.MapLiteralPart;
import org.eclipse.ocl.pivot.MapType;
import org.eclipse.ocl.pivot.MessageExp;
import org.eclipse.ocl.pivot.MessageType;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.NamedElement;
import org.eclipse.ocl.pivot.Namespace;
import org.eclipse.ocl.pivot.NavigationCallExp;
import org.eclipse.ocl.pivot.NullLiteralExp;
import org.eclipse.ocl.pivot.NumericLiteralExp;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.OppositePropertyCallExp;
import org.eclipse.ocl.pivot.OrderedSetType;
import org.eclipse.ocl.pivot.OrphanCompletePackage;
import org.eclipse.ocl.pivot.Parameter;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.Precedence;
import org.eclipse.ocl.pivot.PrimitiveCompletePackage;
import org.eclipse.ocl.pivot.PrimitiveLiteralExp;
import org.eclipse.ocl.pivot.PrimitiveType;
import org.eclipse.ocl.pivot.Profile;
import org.eclipse.ocl.pivot.ProfileApplication;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.PropertyCallExp;
import org.eclipse.ocl.pivot.Pseudostate;
import org.eclipse.ocl.pivot.PseudostateKind;
import org.eclipse.ocl.pivot.RealLiteralExp;
import org.eclipse.ocl.pivot.ReferringElement;
import org.eclipse.ocl.pivot.Region;
import org.eclipse.ocl.pivot.SelfType;
import org.eclipse.ocl.pivot.SendSignalAction;
import org.eclipse.ocl.pivot.SequenceType;
import org.eclipse.ocl.pivot.SetType;
import org.eclipse.ocl.pivot.Signal;
import org.eclipse.ocl.pivot.Slot;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.State;
import org.eclipse.ocl.pivot.StateExp;
import org.eclipse.ocl.pivot.StateMachine;
import org.eclipse.ocl.pivot.Stereotype;
import org.eclipse.ocl.pivot.StringLiteralExp;
import org.eclipse.ocl.pivot.TemplateBinding;
import org.eclipse.ocl.pivot.TemplateParameter;
import org.eclipse.ocl.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.pivot.TemplateSignature;
import org.eclipse.ocl.pivot.TemplateableElement;
import org.eclipse.ocl.pivot.Transition;
import org.eclipse.ocl.pivot.TransitionKind;
import org.eclipse.ocl.pivot.Trigger;
import org.eclipse.ocl.pivot.TupleLiteralExp;
import org.eclipse.ocl.pivot.TupleLiteralPart;
import org.eclipse.ocl.pivot.TupleType;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.TypeExp;
import org.eclipse.ocl.pivot.StereotypeExtender;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.pivot.UnspecifiedValueExp;
import org.eclipse.ocl.pivot.ValueSpecification;
import org.eclipse.ocl.pivot.Variable;
import org.eclipse.ocl.pivot.VariableDeclaration;
import org.eclipse.ocl.pivot.VariableExp;
import org.eclipse.ocl.pivot.Vertex;
import org.eclipse.ocl.pivot.VoidType;
import org.eclipse.ocl.pivot.WildcardType;
import org.eclipse.ocl.pivot.library.LibraryFeature;
import org.eclipse.ocl.pivot.utilities.MorePivotable;
import org.eclipse.ocl.pivot.utilities.Nameable;
import org.eclipse.ocl.pivot.utilities.Pivotable;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.pivot.PivotPackage
 * @generated
 */
@SuppressWarnings("cast")
public class PivotValidator
		extends EObjectValidator {

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PivotValidator INSTANCE = new PivotValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.ocl.pivot"; //$NON-NLS-1$

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is Boolean' of 'Boolean Literal Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BOOLEAN_LITERAL_EXP__VALIDATE_TYPE_IS_BOOLEAN = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is Not Invalid' of 'Call Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CALL_EXP__VALIDATE_TYPE_IS_NOT_INVALID = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unique Invariant Name' of 'Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLASS__VALIDATE_UNIQUE_INVARIANT_NAME = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is Item Type' of 'Collection Item'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COLLECTION_ITEM__VALIDATE_TYPE_IS_ITEM_TYPE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Bag Kind Is Bag' of 'Collection Literal Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COLLECTION_LITERAL_EXP__VALIDATE_BAG_KIND_IS_BAG = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Collection Kind Is Concrete' of 'Collection Literal Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COLLECTION_LITERAL_EXP__VALIDATE_COLLECTION_KIND_IS_CONCRETE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ordered Set Kind Is Ordered Set' of 'Collection Literal Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COLLECTION_LITERAL_EXP__VALIDATE_ORDERED_SET_KIND_IS_ORDERED_SET = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sequence Kind Is Sequence' of 'Collection Literal Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COLLECTION_LITERAL_EXP__VALIDATE_SEQUENCE_KIND_IS_SEQUENCE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Set Kind Is Set' of 'Collection Literal Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COLLECTION_LITERAL_EXP__VALIDATE_SET_KIND_IS_SET = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is Not Invalid' of 'Collection Literal Part'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COLLECTION_LITERAL_PART__VALIDATE_TYPE_IS_NOT_INVALID = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unique Name' of 'Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSTRAINT__VALIDATE_UNIQUE_NAME = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is Enumeration Type' of 'Enum Literal Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENUM_LITERAL_EXP__VALIDATE_TYPE_IS_ENUMERATION_TYPE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is Not Invalid' of 'Feature'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FEATURE__VALIDATE_TYPE_IS_NOT_INVALID = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Type Is Boolean' of 'If Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IF_EXP__VALIDATE_CONDITION_TYPE_IS_BOOLEAN = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is Not Invalid' of 'If Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IF_EXP__VALIDATE_TYPE_IS_NOT_INVALID = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is Integer' of 'Integer Literal Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTEGER_LITERAL_EXP__VALIDATE_TYPE_IS_INTEGER = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Type Conforms To Result Type' of 'Iterate Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATE_EXP__VALIDATE_BODY_TYPE_CONFORMS_TO_RESULT_TYPE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate One Initializer' of 'Iterate Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATE_EXP__VALIDATE_ONE_INITIALIZER = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Safe Iterator Is Required' of 'Iterate Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATE_EXP__VALIDATE_SAFE_ITERATOR_IS_REQUIRED = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Safe Source Can Be Null' of 'Iterate Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATE_EXP__VALIDATE_SAFE_SOURCE_CAN_BE_NULL = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is Result Type' of 'Iterate Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATE_EXP__VALIDATE_TYPE_IS_RESULT_TYPE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unsafe Source Can Not Be Null' of 'Iterate Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATE_EXP__VALIDATE_UNSAFE_SOURCE_CAN_NOT_BE_NULL = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Any Body Type Is Boolean' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_ANY_BODY_TYPE_IS_BOOLEAN = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Any Has One Iterator' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_ANY_HAS_ONE_ITERATOR = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Any Type Is Source Element Type' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_ANY_TYPE_IS_SOURCE_ELEMENT_TYPE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Closure Body Type Is Conformantto Iterator Type' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_CLOSURE_BODY_TYPE_IS_CONFORMANTTO_ITERATOR_TYPE = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Closure Element Type Is Source Element Type' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_CLOSURE_ELEMENT_TYPE_IS_SOURCE_ELEMENT_TYPE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Closure Has One Iterator' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_CLOSURE_HAS_ONE_ITERATOR = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Closure Source Element Type Is Body Element Type' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_CLOSURE_SOURCE_ELEMENT_TYPE_IS_BODY_ELEMENT_TYPE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Closure Type Is Unique Collection' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_CLOSURE_TYPE_IS_UNIQUE_COLLECTION = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Collect Element Type Is Flattened Body Type' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_COLLECT_ELEMENT_TYPE_IS_FLATTENED_BODY_TYPE = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Collect Type Is Unordered' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_COLLECT_TYPE_IS_UNORDERED = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Iterator Type Is Source Element Type' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_ITERATOR_TYPE_IS_SOURCE_ELEMENT_TYPE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Safe Iterator Is Required' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_SAFE_ITERATOR_IS_REQUIRED = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Safe Source Can Be Null' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_SAFE_SOURCE_CAN_BE_NULL = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sorted By Element Type Is Source Element Type' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_SORTED_BY_ELEMENT_TYPE_IS_SOURCE_ELEMENT_TYPE = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sorted By Is Ordered If Source Is Ordered' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_SORTED_BY_IS_ORDERED_IF_SOURCE_IS_ORDERED = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sorted By Iterator Type Is Comparable' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_SORTED_BY_ITERATOR_TYPE_IS_COMPARABLE = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unsafe Source Can Not Be Null' of 'Iterator Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITERATOR_EXP__VALIDATE_UNSAFE_SOURCE_CAN_NOT_BE_NULL = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is In Type' of 'Let Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LET_EXP__VALIDATE_TYPE_IS_IN_TYPE = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is Not Invalid' of 'Let Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LET_EXP__VALIDATE_TYPE_IS_NOT_INVALID = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate No Initializers' of 'Loop Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOOP_EXP__VALIDATE_NO_INITIALIZERS = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Source Is Collection' of 'Loop Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOOP_EXP__VALIDATE_SOURCE_IS_COLLECTION = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate One Call Or One Send' of 'Message Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE_EXP__VALIDATE_ONE_CALL_OR_ONE_SEND = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Target Is Not ACollection' of 'Message Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE_EXP__VALIDATE_TARGET_IS_NOT_ACOLLECTION = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Compatible Return' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__VALIDATE_COMPATIBLE_RETURN = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Loadable Implementation' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__VALIDATE_LOADABLE_IMPLEMENTATION = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unique Postcondition Name' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__VALIDATE_UNIQUE_POSTCONDITION_NAME = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unique Precondition Name' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__VALIDATE_UNIQUE_PRECONDITION_NAME = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Argument Count' of 'Operation Call Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION_CALL_EXP__VALIDATE_ARGUMENT_COUNT = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Argument Type Is Conformant' of 'Operation Call Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION_CALL_EXP__VALIDATE_ARGUMENT_TYPE_IS_CONFORMANT = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Safe Source Can Be Null' of 'Operation Call Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION_CALL_EXP__VALIDATE_SAFE_SOURCE_CAN_BE_NULL = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Compatible Default Expression' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__VALIDATE_COMPATIBLE_DEFAULT_EXPRESSION = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Compatible Result Type' of 'Property Call Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY_CALL_EXP__VALIDATE_COMPATIBLE_RESULT_TYPE = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Non Static Source Type Is Conformant' of 'Property Call Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY_CALL_EXP__VALIDATE_NON_STATIC_SOURCE_TYPE_IS_CONFORMANT = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Safe Source Can Be Null' of 'Property Call Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY_CALL_EXP__VALIDATE_SAFE_SOURCE_CAN_BE_NULL = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unsafe Source Can Not Be Null' of 'Property Call Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY_CALL_EXP__VALIDATE_UNSAFE_SOURCE_CAN_NOT_BE_NULL = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is Not Invalid' of 'Shadow Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SHADOW_EXP__VALIDATE_TYPE_IS_NOT_INVALID = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is Not Invalid' of 'Shadow Part'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SHADOW_PART__VALIDATE_TYPE_IS_NOT_INVALID = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is Not Invalid' of 'State Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATE_EXP__VALIDATE_TYPE_IS_NOT_INVALID = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Compatible Initialiser Type' of 'Variable'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VARIABLE__VALIDATE_COMPATIBLE_INITIALISER_TYPE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is Not Invalid' of 'Variable Declaration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VARIABLE_DECLARATION__VALIDATE_TYPE_IS_NOT_INVALID = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Is Not Invalid' of 'Variable Exp'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VARIABLE_EXP__VALIDATE_TYPE_IS_NOT_INVALID = 63;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 63;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PivotValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PivotPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID)
		{
			case PivotPackage.ANNOTATION:
				return validateAnnotation((Annotation)value, diagnostics, context);
			case PivotPackage.ANY_TYPE:
				return validateAnyType((AnyType)value, diagnostics, context);
			case PivotPackage.ASSOCIATION_CLASS:
				return validateAssociationClass((AssociationClass)value, diagnostics, context);
			case PivotPackage.ASSOCIATION_CLASS_CALL_EXP:
				return validateAssociationClassCallExp((AssociationClassCallExp)value, diagnostics, context);
			case PivotPackage.BAG_TYPE:
				return validateBagType((BagType)value, diagnostics, context);
			case PivotPackage.BEHAVIOR:
				return validateBehavior((Behavior)value, diagnostics, context);
			case PivotPackage.BOOLEAN_LITERAL_EXP:
				return validateBooleanLiteralExp((BooleanLiteralExp)value, diagnostics, context);
			case PivotPackage.CALL_EXP:
				return validateCallExp((CallExp)value, diagnostics, context);
			case PivotPackage.CALL_OPERATION_ACTION:
				return validateCallOperationAction((CallOperationAction)value, diagnostics, context);
			case PivotPackage.CLASS:
				return validateClass((org.eclipse.ocl.pivot.Class)value, diagnostics, context);
			case PivotPackage.COLLECTION_ITEM:
				return validateCollectionItem((CollectionItem)value, diagnostics, context);
			case PivotPackage.COLLECTION_LITERAL_EXP:
				return validateCollectionLiteralExp((CollectionLiteralExp)value, diagnostics, context);
			case PivotPackage.COLLECTION_LITERAL_PART:
				return validateCollectionLiteralPart((CollectionLiteralPart)value, diagnostics, context);
			case PivotPackage.COLLECTION_RANGE:
				return validateCollectionRange((CollectionRange)value, diagnostics, context);
			case PivotPackage.COLLECTION_TYPE:
				return validateCollectionType((CollectionType)value, diagnostics, context);
			case PivotPackage.COMMENT:
				return validateComment((Comment)value, diagnostics, context);
			case PivotPackage.COMPLETE_CLASS:
				return validateCompleteClass((CompleteClass)value, diagnostics, context);
			case PivotPackage.COMPLETE_ENVIRONMENT:
				return validateCompleteEnvironment((CompleteEnvironment)value, diagnostics, context);
			case PivotPackage.COMPLETE_MODEL:
				return validateCompleteModel((CompleteModel)value, diagnostics, context);
			case PivotPackage.COMPLETE_PACKAGE:
				return validateCompletePackage((CompletePackage)value, diagnostics, context);
			case PivotPackage.CONNECTION_POINT_REFERENCE:
				return validateConnectionPointReference((ConnectionPointReference)value, diagnostics, context);
			case PivotPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case PivotPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case PivotPackage.DETAIL:
				return validateDetail((Detail)value, diagnostics, context);
			case PivotPackage.DYNAMIC_BEHAVIOR:
				return validateDynamicBehavior((DynamicBehavior)value, diagnostics, context);
			case PivotPackage.DYNAMIC_ELEMENT:
				return validateDynamicElement((DynamicElement)value, diagnostics, context);
			case PivotPackage.DYNAMIC_PROPERTY:
				return validateDynamicProperty((DynamicProperty)value, diagnostics, context);
			case PivotPackage.DYNAMIC_TYPE:
				return validateDynamicType((DynamicType)value, diagnostics, context);
			case PivotPackage.DYNAMIC_VALUE_SPECIFICATION:
				return validateDynamicValueSpecification((DynamicValueSpecification)value, diagnostics, context);
			case PivotPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case PivotPackage.ELEMENT_EXTENSION:
				return validateElementExtension((ElementExtension)value, diagnostics, context);
			case PivotPackage.ENUM_LITERAL_EXP:
				return validateEnumLiteralExp((EnumLiteralExp)value, diagnostics, context);
			case PivotPackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case PivotPackage.ENUMERATION_LITERAL:
				return validateEnumerationLiteral((EnumerationLiteral)value, diagnostics, context);
			case PivotPackage.EXPRESSION_IN_OCL:
				return validateExpressionInOCL((ExpressionInOCL)value, diagnostics, context);
			case PivotPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case PivotPackage.FEATURE_CALL_EXP:
				return validateFeatureCallExp((FeatureCallExp)value, diagnostics, context);
			case PivotPackage.FINAL_STATE:
				return validateFinalState((FinalState)value, diagnostics, context);
			case PivotPackage.IF_EXP:
				return validateIfExp((IfExp)value, diagnostics, context);
			case PivotPackage.IMPORT:
				return validateImport((Import)value, diagnostics, context);
			case PivotPackage.INSTANCE_SPECIFICATION:
				return validateInstanceSpecification((InstanceSpecification)value, diagnostics, context);
			case PivotPackage.INTEGER_LITERAL_EXP:
				return validateIntegerLiteralExp((IntegerLiteralExp)value, diagnostics, context);
			case PivotPackage.INVALID_LITERAL_EXP:
				return validateInvalidLiteralExp((InvalidLiteralExp)value, diagnostics, context);
			case PivotPackage.INVALID_TYPE:
				return validateInvalidType((InvalidType)value, diagnostics, context);
			case PivotPackage.ITERATE_EXP:
				return validateIterateExp((IterateExp)value, diagnostics, context);
			case PivotPackage.ITERATION:
				return validateIteration((Iteration)value, diagnostics, context);
			case PivotPackage.ITERATOR_EXP:
				return validateIteratorExp((IteratorExp)value, diagnostics, context);
			case PivotPackage.LAMBDA_TYPE:
				return validateLambdaType((LambdaType)value, diagnostics, context);
			case PivotPackage.LANGUAGE_EXPRESSION:
				return validateLanguageExpression((LanguageExpression)value, diagnostics, context);
			case PivotPackage.LET_EXP:
				return validateLetExp((LetExp)value, diagnostics, context);
			case PivotPackage.LIBRARY:
				return validateLibrary((Library)value, diagnostics, context);
			case PivotPackage.LITERAL_EXP:
				return validateLiteralExp((LiteralExp)value, diagnostics, context);
			case PivotPackage.LOOP_EXP:
				return validateLoopExp((LoopExp)value, diagnostics, context);
			case PivotPackage.MAP_LITERAL_EXP:
				return validateMapLiteralExp((MapLiteralExp)value, diagnostics, context);
			case PivotPackage.MAP_LITERAL_PART:
				return validateMapLiteralPart((MapLiteralPart)value, diagnostics, context);
			case PivotPackage.MAP_TYPE:
				return validateMapType((MapType)value, diagnostics, context);
			case PivotPackage.MESSAGE_EXP:
				return validateMessageExp((MessageExp)value, diagnostics, context);
			case PivotPackage.MESSAGE_TYPE:
				return validateMessageType((MessageType)value, diagnostics, context);
			case PivotPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case PivotPackage.MORE_PIVOTABLE:
				return validateMorePivotable((MorePivotable)value, diagnostics, context);
			case PivotPackage.NAMEABLE:
				return validateNameable((Nameable)value, diagnostics, context);
			case PivotPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case PivotPackage.NAMESPACE:
				return validateNamespace((Namespace)value, diagnostics, context);
			case PivotPackage.NAVIGATION_CALL_EXP:
				return validateNavigationCallExp((NavigationCallExp)value, diagnostics, context);
			case PivotPackage.NULL_LITERAL_EXP:
				return validateNullLiteralExp((NullLiteralExp)value, diagnostics, context);
			case PivotPackage.NUMERIC_LITERAL_EXP:
				return validateNumericLiteralExp((NumericLiteralExp)value, diagnostics, context);
			case PivotPackage.OCL_EXPRESSION:
				return validateOCLExpression((OCLExpression)value, diagnostics, context);
			case PivotPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case PivotPackage.OPERATION_CALL_EXP:
				return validateOperationCallExp((OperationCallExp)value, diagnostics, context);
			case PivotPackage.OPPOSITE_PROPERTY_CALL_EXP:
				return validateOppositePropertyCallExp((OppositePropertyCallExp)value, diagnostics, context);
			case PivotPackage.ORDERED_SET_TYPE:
				return validateOrderedSetType((OrderedSetType)value, diagnostics, context);
			case PivotPackage.ORPHAN_COMPLETE_PACKAGE:
				return validateOrphanCompletePackage((OrphanCompletePackage)value, diagnostics, context);
			case PivotPackage.PACKAGE:
				return validatePackage((org.eclipse.ocl.pivot.Package)value, diagnostics, context);
			case PivotPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case PivotPackage.PIVOTABLE:
				return validatePivotable((Pivotable)value, diagnostics, context);
			case PivotPackage.PRECEDENCE:
				return validatePrecedence((Precedence)value, diagnostics, context);
			case PivotPackage.PRIMITIVE_COMPLETE_PACKAGE:
				return validatePrimitiveCompletePackage((PrimitiveCompletePackage)value, diagnostics, context);
			case PivotPackage.PRIMITIVE_LITERAL_EXP:
				return validatePrimitiveLiteralExp((PrimitiveLiteralExp)value, diagnostics, context);
			case PivotPackage.PRIMITIVE_TYPE:
				return validatePrimitiveType((PrimitiveType)value, diagnostics, context);
			case PivotPackage.PROFILE:
				return validateProfile((Profile)value, diagnostics, context);
			case PivotPackage.PROFILE_APPLICATION:
				return validateProfileApplication((ProfileApplication)value, diagnostics, context);
			case PivotPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case PivotPackage.PROPERTY_CALL_EXP:
				return validatePropertyCallExp((PropertyCallExp)value, diagnostics, context);
			case PivotPackage.PSEUDOSTATE:
				return validatePseudostate((Pseudostate)value, diagnostics, context);
			case PivotPackage.REAL_LITERAL_EXP:
				return validateRealLiteralExp((RealLiteralExp)value, diagnostics, context);
			case PivotPackage.REFERRING_ELEMENT:
				return validateReferringElement((ReferringElement)value, diagnostics, context);
			case PivotPackage.REGION:
				return validateRegion((Region)value, diagnostics, context);
			case PivotPackage.SELF_TYPE:
				return validateSelfType((SelfType)value, diagnostics, context);
			case PivotPackage.SEND_SIGNAL_ACTION:
				return validateSendSignalAction((SendSignalAction)value, diagnostics, context);
			case PivotPackage.SEQUENCE_TYPE:
				return validateSequenceType((SequenceType)value, diagnostics, context);
			case PivotPackage.SET_TYPE:
				return validateSetType((SetType)value, diagnostics, context);
			case PivotPackage.SHADOW_EXP:
				return validateShadowExp((ShadowExp)value, diagnostics, context);
			case PivotPackage.SHADOW_PART:
				return validateShadowPart((ShadowPart)value, diagnostics, context);
			case PivotPackage.SIGNAL:
				return validateSignal((Signal)value, diagnostics, context);
			case PivotPackage.SLOT:
				return validateSlot((Slot)value, diagnostics, context);
			case PivotPackage.STANDARD_LIBRARY:
				return validateStandardLibrary((StandardLibrary)value, diagnostics, context);
			case PivotPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case PivotPackage.STATE_EXP:
				return validateStateExp((StateExp)value, diagnostics, context);
			case PivotPackage.STATE_MACHINE:
				return validateStateMachine((StateMachine)value, diagnostics, context);
			case PivotPackage.STEREOTYPE:
				return validateStereotype((Stereotype)value, diagnostics, context);
			case PivotPackage.STEREOTYPE_EXTENDER:
				return validateStereotypeExtender((StereotypeExtender)value, diagnostics, context);
			case PivotPackage.STRING_LITERAL_EXP:
				return validateStringLiteralExp((StringLiteralExp)value, diagnostics, context);
			case PivotPackage.TEMPLATE_BINDING:
				return validateTemplateBinding((TemplateBinding)value, diagnostics, context);
			case PivotPackage.TEMPLATE_PARAMETER:
				return validateTemplateParameter((TemplateParameter)value, diagnostics, context);
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION:
				return validateTemplateParameterSubstitution((TemplateParameterSubstitution)value, diagnostics, context);
			case PivotPackage.TEMPLATE_SIGNATURE:
				return validateTemplateSignature((TemplateSignature)value, diagnostics, context);
			case PivotPackage.TEMPLATEABLE_ELEMENT:
				return validateTemplateableElement((TemplateableElement)value, diagnostics, context);
			case PivotPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case PivotPackage.TRIGGER:
				return validateTrigger((Trigger)value, diagnostics, context);
			case PivotPackage.TUPLE_LITERAL_EXP:
				return validateTupleLiteralExp((TupleLiteralExp)value, diagnostics, context);
			case PivotPackage.TUPLE_LITERAL_PART:
				return validateTupleLiteralPart((TupleLiteralPart)value, diagnostics, context);
			case PivotPackage.TUPLE_TYPE:
				return validateTupleType((TupleType)value, diagnostics, context);
			case PivotPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case PivotPackage.TYPE_EXP:
				return validateTypeExp((TypeExp)value, diagnostics, context);
			case PivotPackage.TYPED_ELEMENT:
				return validateTypedElement((TypedElement)value, diagnostics, context);
			case PivotPackage.UNLIMITED_NATURAL_LITERAL_EXP:
				return validateUnlimitedNaturalLiteralExp((UnlimitedNaturalLiteralExp)value, diagnostics, context);
			case PivotPackage.UNSPECIFIED_VALUE_EXP:
				return validateUnspecifiedValueExp((UnspecifiedValueExp)value, diagnostics, context);
			case PivotPackage.VALUE_SPECIFICATION:
				return validateValueSpecification((ValueSpecification)value, diagnostics, context);
			case PivotPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case PivotPackage.VARIABLE_DECLARATION:
				return validateVariableDeclaration((VariableDeclaration)value, diagnostics, context);
			case PivotPackage.VARIABLE_EXP:
				return validateVariableExp((VariableExp)value, diagnostics, context);
			case PivotPackage.VERTEX:
				return validateVertex((Vertex)value, diagnostics, context);
			case PivotPackage.VISITABLE:
				return validateVisitable((Visitable)value, diagnostics, context);
			case PivotPackage.VOID_TYPE:
				return validateVoidType((VoidType)value, diagnostics, context);
			case PivotPackage.WILDCARD_TYPE:
				return validateWildcardType((WildcardType)value, diagnostics, context);
			case PivotPackage.ASSOCIATIVITY_KIND:
				return validateAssociativityKind((AssociativityKind)value, diagnostics, context);
			case PivotPackage.COLLECTION_KIND:
				return validateCollectionKind((CollectionKind)value, diagnostics, context);
			case PivotPackage.PSEUDOSTATE_KIND:
				return validatePseudostateKind((PseudostateKind)value, diagnostics, context);
			case PivotPackage.TRANSITION_KIND:
				return validateTransitionKind((TransitionKind)value, diagnostics, context);
			case PivotPackage.BOOLEAN:
				return validateBoolean((Boolean)value, diagnostics, context);
			case PivotPackage.INTEGER:
				return validateInteger((Number)value, diagnostics, context);
			case PivotPackage.LIBRARY_FEATURE:
				return validateLibraryFeature((LibraryFeature)value, diagnostics, context);
			case PivotPackage.OBJECT:
				return validateObject(value, diagnostics, context);
			case PivotPackage.REAL:
				return validateReal((Number)value, diagnostics, context);
			case PivotPackage.STRING:
				return validateString((String)value, diagnostics, context);
			case PivotPackage.THROWABLE:
				return validateThrowable((Throwable)value, diagnostics, context);
			case PivotPackage.UNLIMITED_NATURAL:
				return validateUnlimitedNatural((Number)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyType(AnyType anyType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anyType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(anyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anyType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(anyType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespace(Namespace namespace,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namespace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementExtension(ElementExtension elementExtension, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(elementExtension, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(elementExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elementExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elementExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(elementExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(elementExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(elementExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(elementExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(elementExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(elementExtension, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(org.eclipse.ocl.pivot.Class class_,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(class_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(class_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateUniqueInvariantName constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_validateUniqueInvariantName(org.eclipse.ocl.pivot.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return class_.validateUniqueInvariantName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(property, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_validateTypeIsNotInvalid(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_validateCompatibleDefaultExpression(property, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCompatibleDefaultExpression constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_validateCompatibleDefaultExpression(Property property, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return property.validateCompatibleDefaultExpression(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedElement(TypedElement typedElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlimitedNaturalLiteralExp(
			UnlimitedNaturalLiteralExp unlimitedNaturalLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unlimitedNaturalLiteralExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrecedence(Precedence precedence,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(precedence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveCompletePackage(PrimitiveCompletePackage primitiveCompletePackage, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(primitiveCompletePackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateParameter(
			TemplateParameter templateParameter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(templateParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateSignature(
			TemplateSignature templateSignature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(templateSignature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateableElement(
			TemplateableElement templateableElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(templateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrigger(Trigger trigger, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(trigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateBinding(TemplateBinding templateBinding,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(templateBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateParameterSubstitution(
			TemplateParameterSubstitution templateParameterSubstitution,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(templateParameterSubstitution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationClass(AssociationClass associationClass,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(associationClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(associationClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_validateTypeIsNotInvalid(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_validateCompatibleReturn(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_validateLoadableImplementation(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_validateUniquePostconditionName(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_validateUniquePreconditionName(operation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCompatibleReturn constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_validateCompatibleReturn(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return operation.validateCompatibleReturn(diagnostics, context);
	}

	/**
	 * Validates the validateLoadableImplementation constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_validateLoadableImplementation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return operation.validateLoadableImplementation(diagnostics, context);
	}

	/**
	 * Validates the validateUniquePreconditionName constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_validateUniquePreconditionName(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return operation.validateUniquePreconditionName(diagnostics, context);
	}

	/**
	 * Validates the validateUniquePostconditionName constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_validateUniquePostconditionName(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return operation.validateUniquePostconditionName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableDeclaration_validateTypeIsNotInvalid(parameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePivotable(Pivotable pivotable, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint((EObject)pivotable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOppositePropertyCallExp(OppositePropertyCallExp oppositePropertyCallExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(oppositePropertyCallExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oppositePropertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oppositePropertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oppositePropertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oppositePropertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oppositePropertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oppositePropertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oppositePropertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oppositePropertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallExp_validateTypeIsNotInvalid(oppositePropertyCallExp, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompleteClass(CompleteClass completeClass, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(completeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompleteEnvironment(CompleteEnvironment completeEnvironment, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(completeEnvironment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompleteModel(CompleteModel completeModel, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(completeModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompletePackage(CompletePackage completePackage, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(completePackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointReference(ConnectionPointReference connectionPointReference, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(connectionPointReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_validateUniqueName(constraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateUniqueName constraint of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint_validateUniqueName(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return constraint.validateUniqueName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage(
			org.eclipse.ocl.pivot.Package package_,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(package_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationClassCallExp(
			AssociationClassCallExp associationClassCallExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(associationClassCallExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(associationClassCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(associationClassCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(associationClassCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(associationClassCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(associationClassCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(associationClassCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(associationClassCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(associationClassCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallExp_validateTypeIsNotInvalid(associationClassCallExp, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigationCallExp(
			NavigationCallExp navigationCallExp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(navigationCallExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(navigationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navigationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navigationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(navigationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(navigationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(navigationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(navigationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navigationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallExp_validateTypeIsNotInvalid(navigationCallExp, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureCallExp(FeatureCallExp featureCallExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(featureCallExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(featureCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(featureCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(featureCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(featureCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(featureCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(featureCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(featureCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(featureCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallExp_validateTypeIsNotInvalid(featureCallExp, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(finalState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallExp(CallExp callExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallExp_validateTypeIsNotInvalid(callExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTypeIsNotInvalid constraint of '<em>Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallExp_validateTypeIsNotInvalid(CallExp callExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return callExp.validateTypeIsNotInvalid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallOperationAction(
			CallOperationAction callOperationAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callOperationAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBagType(BagType bagType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bagType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bagType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bagType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bagType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bagType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bagType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bagType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bagType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bagType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(bagType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(behavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(behavior, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionType(CollectionType collectionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collectionType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(collectionType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(dataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetail(Detail detail, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicBehavior(DynamicBehavior dynamicBehavior, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(dynamicBehavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dynamicBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynamicBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynamicBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dynamicBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynamicBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dynamicBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dynamicBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dynamicBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(dynamicBehavior, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicElement(DynamicElement dynamicElement, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(dynamicElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicProperty(DynamicProperty dynamicProperty, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(dynamicProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicType(DynamicType dynamicType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(dynamicType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dynamicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynamicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynamicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dynamicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynamicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dynamicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dynamicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dynamicType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(dynamicType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicValueSpecification(DynamicValueSpecification dynamicValueSpecification, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(dynamicValueSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanLiteralExp(
			BooleanLiteralExp booleanLiteralExp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booleanLiteralExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(booleanLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(booleanLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(booleanLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(booleanLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(booleanLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(booleanLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(booleanLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(booleanLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateBooleanLiteralExp_validateTypeIsBoolean(booleanLiteralExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTypeIsBoolean constraint of '<em>Boolean Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanLiteralExp_validateTypeIsBoolean(BooleanLiteralExp booleanLiteralExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return booleanLiteralExp.validateTypeIsBoolean(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveLiteralExp(
			PrimitiveLiteralExp primitiveLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primitiveLiteralExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralExp(LiteralExp literalExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionItem(CollectionItem collectionItem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collectionItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionLiteralPart_validateTypeIsNotInvalid(collectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionItem_validateTypeIsItemType(collectionItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTypeIsItemType constraint of '<em>Collection Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionItem_validateTypeIsItemType(CollectionItem collectionItem, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return collectionItem.validateTypeIsItemType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionLiteralPart(
			CollectionLiteralPart collectionLiteralPart,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collectionLiteralPart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collectionLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collectionLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collectionLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionLiteralPart_validateTypeIsNotInvalid(collectionLiteralPart, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTypeIsNotInvalid constraint of '<em>Collection Literal Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionLiteralPart_validateTypeIsNotInvalid(CollectionLiteralPart collectionLiteralPart, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return collectionLiteralPart.validateTypeIsNotInvalid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionLiteralExp(
			CollectionLiteralExp collectionLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collectionLiteralExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collectionLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collectionLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collectionLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionLiteralExp_validateBagKindIsBag(collectionLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionLiteralExp_validateCollectionKindIsConcrete(collectionLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionLiteralExp_validateOrderedSetKindIsOrderedSet(collectionLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionLiteralExp_validateSequenceKindIsSequence(collectionLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionLiteralExp_validateSetKindIsSet(collectionLiteralExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateBagKindIsBag constraint of '<em>Collection Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionLiteralExp_validateBagKindIsBag(CollectionLiteralExp collectionLiteralExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return collectionLiteralExp.validateBagKindIsBag(diagnostics, context);
	}

	/**
	 * Validates the validateSequenceKindIsSequence constraint of '<em>Collection Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionLiteralExp_validateSequenceKindIsSequence(CollectionLiteralExp collectionLiteralExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return collectionLiteralExp.validateSequenceKindIsSequence(diagnostics, context);
	}

	/**
	 * Validates the validateOrderedSetKindIsOrderedSet constraint of '<em>Collection Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionLiteralExp_validateOrderedSetKindIsOrderedSet(CollectionLiteralExp collectionLiteralExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return collectionLiteralExp.validateOrderedSetKindIsOrderedSet(diagnostics, context);
	}

	/**
	 * Validates the validateSetKindIsSet constraint of '<em>Collection Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionLiteralExp_validateSetKindIsSet(CollectionLiteralExp collectionLiteralExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return collectionLiteralExp.validateSetKindIsSet(diagnostics, context);
	}

	/**
	 * Validates the validateCollectionKindIsConcrete constraint of '<em>Collection Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionLiteralExp_validateCollectionKindIsConcrete(CollectionLiteralExp collectionLiteralExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return collectionLiteralExp.validateCollectionKindIsConcrete(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionRange(CollectionRange collectionRange,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collectionRange, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collectionRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collectionRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collectionRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionLiteralPart_validateTypeIsNotInvalid(collectionRange, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumLiteralExp(EnumLiteralExp enumLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumLiteralExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumLiteralExp_validateTypeIsEnumerationType(enumLiteralExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTypeIsEnumerationType constraint of '<em>Enum Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumLiteralExp_validateTypeIsEnumerationType(EnumLiteralExp enumLiteralExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return enumLiteralExp.validateTypeIsEnumerationType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteral(
			EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionInOCL(ExpressionInOCL expressionInOCL, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(expressionInOCL, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumeration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(enumeration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(feature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_validateTypeIsNotInvalid(feature, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTypeIsNotInvalid constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature_validateTypeIsNotInvalid(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return feature.validateTypeIsNotInvalid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableDeclaration_validateTypeIsNotInvalid(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariable_validateCompatibleInitialiserType(variable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCompatibleInitialiserType constraint of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable_validateCompatibleInitialiserType(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return variable.validateCompatibleInitialiserType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableDeclaration(
			VariableDeclaration variableDeclaration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variableDeclaration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableDeclaration_validateTypeIsNotInvalid(variableDeclaration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTypeIsNotInvalid constraint of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableDeclaration_validateTypeIsNotInvalid(VariableDeclaration variableDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return variableDeclaration.validateTypeIsNotInvalid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfExp(IfExp ifExp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ifExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ifExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ifExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ifExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ifExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ifExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ifExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ifExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ifExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIfExp_validateConditionTypeIsBoolean(ifExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIfExp_validateTypeIsNotInvalid(ifExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConditionTypeIsBoolean constraint of '<em>If Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfExp_validateConditionTypeIsBoolean(IfExp ifExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return ifExp.validateConditionTypeIsBoolean(diagnostics, context);
	}

	/**
	 * Validates the validateTypeIsNotInvalid constraint of '<em>If Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfExp_validateTypeIsNotInvalid(IfExp ifExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return ifExp.validateTypeIsNotInvalid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImport(Import import_, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(import_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSpecification(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(instanceSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerLiteralExp(
			IntegerLiteralExp integerLiteralExp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integerLiteralExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integerLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integerLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integerLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integerLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integerLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integerLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integerLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integerLiteralExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIntegerLiteralExp_validateTypeIsInteger(integerLiteralExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTypeIsInteger constraint of '<em>Integer Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerLiteralExp_validateTypeIsInteger(IntegerLiteralExp integerLiteralExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return integerLiteralExp.validateTypeIsInteger(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericLiteralExp(
			NumericLiteralExp numericLiteralExp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericLiteralExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLExpression(OCLExpression oclExpression, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(oclExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvalidLiteralExp(
			InvalidLiteralExp invalidLiteralExp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(invalidLiteralExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvalidType(InvalidType invalidType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(invalidType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(invalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(invalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(invalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(invalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(invalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(invalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(invalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(invalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(invalidType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIterateExp(IterateExp iterateExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(iterateExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallExp_validateTypeIsNotInvalid(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopExp_validateNoInitializers(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopExp_validateSourceIsCollection(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIterateExp_validateBodyTypeConformsToResultType(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIterateExp_validateOneInitializer(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIterateExp_validateSafeIteratorIsRequired(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIterateExp_validateSafeSourceCanBeNull(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIterateExp_validateTypeIsResultType(iterateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIterateExp_validateUnsafeSourceCanNotBeNull(iterateExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateOneInitializer constraint of '<em>Iterate Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIterateExp_validateOneInitializer(IterateExp iterateExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iterateExp.validateOneInitializer(diagnostics, context);
	}

	/**
	 * Validates the validateSafeIteratorIsRequired constraint of '<em>Iterate Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIterateExp_validateSafeIteratorIsRequired(IterateExp iterateExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iterateExp.validateSafeIteratorIsRequired(diagnostics, context);
	}

	/**
	 * Validates the validateSafeSourceCanBeNull constraint of '<em>Iterate Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIterateExp_validateSafeSourceCanBeNull(IterateExp iterateExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iterateExp.validateSafeSourceCanBeNull(diagnostics, context);
	}

	/**
	 * Validates the validateBodyTypeConformsToResultType constraint of '<em>Iterate Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIterateExp_validateBodyTypeConformsToResultType(IterateExp iterateExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iterateExp.validateBodyTypeConformsToResultType(diagnostics, context);
	}

	/**
	 * Validates the validateTypeIsResultType constraint of '<em>Iterate Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIterateExp_validateTypeIsResultType(IterateExp iterateExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iterateExp.validateTypeIsResultType(diagnostics, context);
	}

	/**
	 * Validates the validateUnsafeSourceCanNotBeNull constraint of '<em>Iterate Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIterateExp_validateUnsafeSourceCanNotBeNull(IterateExp iterateExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iterateExp.validateUnsafeSourceCanNotBeNull(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteration(Iteration iteration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(iteration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(iteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(iteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(iteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(iteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(iteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(iteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(iteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(iteration, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_validateTypeIsNotInvalid(iteration, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_validateCompatibleReturn(iteration, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_validateLoadableImplementation(iteration, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_validateUniquePostconditionName(iteration, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_validateUniquePreconditionName(iteration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(iteratorExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallExp_validateTypeIsNotInvalid(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopExp_validateNoInitializers(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopExp_validateSourceIsCollection(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateAnyBodyTypeIsBoolean(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateAnyHasOneIterator(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateAnyTypeIsSourceElementType(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateClosureBodyTypeIsConformanttoIteratorType(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateClosureElementTypeIsSourceElementType(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateClosureHasOneIterator(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateClosureSourceElementTypeIsBodyElementType(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateClosureTypeIsUniqueCollection(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateCollectElementTypeIsFlattenedBodyType(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateCollectTypeIsUnordered(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateIteratorTypeIsSourceElementType(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateSafeIteratorIsRequired(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateSafeSourceCanBeNull(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateSortedByElementTypeIsSourceElementType(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateSortedByIsOrderedIfSourceIsOrdered(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateSortedByIteratorTypeIsComparable(iteratorExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateIteratorExp_validateUnsafeSourceCanNotBeNull(iteratorExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateClosureBodyTypeIsConformanttoIteratorType constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateClosureBodyTypeIsConformanttoIteratorType(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateClosureBodyTypeIsConformanttoIteratorType(diagnostics, context);
	}

	/**
	 * Validates the validateSortedByIteratorTypeIsComparable constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateSortedByIteratorTypeIsComparable(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateSortedByIteratorTypeIsComparable(diagnostics, context);
	}

	/**
	 * Validates the validateUnsafeSourceCanNotBeNull constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateUnsafeSourceCanNotBeNull(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateUnsafeSourceCanNotBeNull(diagnostics, context);
	}

	/**
	 * Validates the validateIteratorTypeIsSourceElementType constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateIteratorTypeIsSourceElementType(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateIteratorTypeIsSourceElementType(diagnostics, context);
	}

	/**
	 * Validates the validateSafeIteratorIsRequired constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateSafeIteratorIsRequired(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateSafeIteratorIsRequired(diagnostics, context);
	}

	/**
	 * Validates the validateSafeSourceCanBeNull constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateSafeSourceCanBeNull(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateSafeSourceCanBeNull(diagnostics, context);
	}

	/**
	 * Validates the validateSortedByElementTypeIsSourceElementType constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateSortedByElementTypeIsSourceElementType(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateSortedByElementTypeIsSourceElementType(diagnostics, context);
	}

	/**
	 * Validates the validateSortedByIsOrderedIfSourceIsOrdered constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateSortedByIsOrderedIfSourceIsOrdered(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateSortedByIsOrderedIfSourceIsOrdered(diagnostics, context);
	}

	/**
	 * Validates the validateCollectTypeIsUnordered constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateCollectTypeIsUnordered(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateCollectTypeIsUnordered(diagnostics, context);
	}

	/**
	 * Validates the validateClosureElementTypeIsSourceElementType constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateClosureElementTypeIsSourceElementType(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateClosureElementTypeIsSourceElementType(diagnostics, context);
	}

	/**
	 * Validates the validateClosureSourceElementTypeIsBodyElementType constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateClosureSourceElementTypeIsBodyElementType(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateClosureSourceElementTypeIsBodyElementType(diagnostics, context);
	}

	/**
	 * Validates the validateClosureTypeIsUniqueCollection constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateClosureTypeIsUniqueCollection(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateClosureTypeIsUniqueCollection(diagnostics, context);
	}

	/**
	 * Validates the validateCollectElementTypeIsFlattenedBodyType constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateCollectElementTypeIsFlattenedBodyType(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateCollectElementTypeIsFlattenedBodyType(diagnostics, context);
	}

	/**
	 * Validates the validateClosureHasOneIterator constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateClosureHasOneIterator(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateClosureHasOneIterator(diagnostics, context);
	}

	/**
	 * Validates the validateAnyBodyTypeIsBoolean constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateAnyBodyTypeIsBoolean(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateAnyBodyTypeIsBoolean(diagnostics, context);
	}

	/**
	 * Validates the validateAnyTypeIsSourceElementType constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateAnyTypeIsSourceElementType(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateAnyTypeIsSourceElementType(diagnostics, context);
	}

	/**
	 * Validates the validateAnyHasOneIterator constraint of '<em>Iterator Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteratorExp_validateAnyHasOneIterator(IteratorExp iteratorExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return iteratorExp.validateAnyHasOneIterator(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLambdaType(LambdaType lambdaType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(lambdaType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lambdaType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lambdaType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lambdaType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lambdaType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lambdaType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lambdaType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lambdaType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lambdaType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(lambdaType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageExpression(LanguageExpression languageExpression, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(languageExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopExp(LoopExp loopExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loopExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loopExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loopExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loopExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loopExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loopExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loopExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loopExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loopExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallExp_validateTypeIsNotInvalid(loopExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopExp_validateNoInitializers(loopExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopExp_validateSourceIsCollection(loopExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNoInitializers constraint of '<em>Loop Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopExp_validateNoInitializers(LoopExp loopExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return loopExp.validateNoInitializers(diagnostics, context);
	}

	/**
	 * Validates the validateSourceIsCollection constraint of '<em>Loop Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopExp_validateSourceIsCollection(LoopExp loopExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return loopExp.validateSourceIsCollection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapLiteralExp(MapLiteralExp mapLiteralExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(mapLiteralExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapLiteralPart(MapLiteralPart mapLiteralPart, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(mapLiteralPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapType(MapType mapType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(mapType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mapType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mapType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mapType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mapType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mapType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mapType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mapType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mapType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(mapType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLetExp(LetExp letExp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(letExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(letExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(letExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(letExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(letExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(letExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(letExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(letExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(letExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateLetExp_validateTypeIsInType(letExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateLetExp_validateTypeIsNotInvalid(letExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTypeIsInType constraint of '<em>Let Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLetExp_validateTypeIsInType(LetExp letExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return letExp.validateTypeIsInType(diagnostics, context);
	}

	/**
	 * Validates the validateTypeIsNotInvalid constraint of '<em>Let Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLetExp_validateTypeIsNotInvalid(LetExp letExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return letExp.validateTypeIsNotInvalid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibrary(Library library, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(library, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageExp(MessageExp messageExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageExp_validateOneCallOrOneSend(messageExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageExp_validateTargetIsNotACollection(messageExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTargetIsNotACollection constraint of '<em>Message Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageExp_validateTargetIsNotACollection(MessageExp messageExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return messageExp.validateTargetIsNotACollection(diagnostics, context);
	}

	/**
	 * Validates the validateOneCallOrOneSend constraint of '<em>Message Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageExp_validateOneCallOrOneSend(MessageExp messageExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return messageExp.validateOneCallOrOneSend(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageType(MessageType messageType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(messageType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMorePivotable(MorePivotable morePivotable, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint((EObject)morePivotable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameable(Nameable nameable, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint((EObject)nameable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal(Signal signal, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(signal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(signal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlot(Slot slot, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(slot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardLibrary(StandardLibrary standardLibrary, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(standardLibrary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullLiteralExp(NullLiteralExp nullLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nullLiteralExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationCallExp(OperationCallExp operationCallExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationCallExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallExp_validateTypeIsNotInvalid(operationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationCallExp_validateArgumentCount(operationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationCallExp_validateArgumentTypeIsConformant(operationCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationCallExp_validateSafeSourceCanBeNull(operationCallExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateArgumentTypeIsConformant constraint of '<em>Operation Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationCallExp_validateArgumentTypeIsConformant(OperationCallExp operationCallExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return operationCallExp.validateArgumentTypeIsConformant(diagnostics, context);
	}

	/**
	 * Validates the validateSafeSourceCanBeNull constraint of '<em>Operation Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationCallExp_validateSafeSourceCanBeNull(OperationCallExp operationCallExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return operationCallExp.validateSafeSourceCanBeNull(diagnostics, context);
	}

	/**
	 * Validates the validateArgumentCount constraint of '<em>Operation Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationCallExp_validateArgumentCount(OperationCallExp operationCallExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return operationCallExp.validateArgumentCount(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderedSetType(OrderedSetType orderedSetType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(orderedSetType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(orderedSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(orderedSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(orderedSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(orderedSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(orderedSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(orderedSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(orderedSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(orderedSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(orderedSetType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrphanCompletePackage(OrphanCompletePackage orphanCompletePackage, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(orphanCompletePackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveType(PrimitiveType primitiveType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(primitiveType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(primitiveType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfile(Profile profile, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(profile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileApplication(ProfileApplication profileApplication, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(profileApplication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyCallExp(PropertyCallExp propertyCallExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(propertyCallExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(propertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(propertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(propertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallExp_validateTypeIsNotInvalid(propertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyCallExp_validateCompatibleResultType(propertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyCallExp_validateNonStaticSourceTypeIsConformant(propertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyCallExp_validateSafeSourceCanBeNull(propertyCallExp, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyCallExp_validateUnsafeSourceCanNotBeNull(propertyCallExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNonStaticSourceTypeIsConformant constraint of '<em>Property Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyCallExp_validateNonStaticSourceTypeIsConformant(PropertyCallExp propertyCallExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return propertyCallExp.validateNonStaticSourceTypeIsConformant(diagnostics, context);
	}

	/**
	 * Validates the validateSafeSourceCanBeNull constraint of '<em>Property Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyCallExp_validateSafeSourceCanBeNull(PropertyCallExp propertyCallExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return propertyCallExp.validateSafeSourceCanBeNull(diagnostics, context);
	}

	/**
	 * Validates the validateUnsafeSourceCanNotBeNull constraint of '<em>Property Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyCallExp_validateUnsafeSourceCanNotBeNull(PropertyCallExp propertyCallExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return propertyCallExp.validateUnsafeSourceCanNotBeNull(diagnostics, context);
	}

	/**
	 * Validates the validateCompatibleResultType constraint of '<em>Property Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyCallExp_validateCompatibleResultType(PropertyCallExp propertyCallExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return propertyCallExp.validateCompatibleResultType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(pseudostate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealLiteralExp(RealLiteralExp realLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realLiteralExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferringElement(ReferringElement referringElement, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(referringElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion(Region region, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(region, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfType(SelfType selfType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(selfType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selfType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selfType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selfType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selfType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selfType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selfType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selfType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selfType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(selfType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendSignalAction(SendSignalAction sendSignalAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sendSignalAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceType(SequenceType sequenceType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sequenceType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sequenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sequenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sequenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sequenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sequenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sequenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sequenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sequenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(sequenceType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetType(SetType setType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(setType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(setType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(setType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(setType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(setType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(setType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(setType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(setType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(setType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(setType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShadowExp(ShadowExp shadowExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(shadowExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(shadowExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(shadowExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(shadowExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(shadowExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(shadowExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(shadowExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(shadowExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(shadowExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateShadowExp_validateTypeIsNotInvalid(shadowExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTypeIsNotInvalid constraint of '<em>Shadow Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShadowExp_validateTypeIsNotInvalid(ShadowExp shadowExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return shadowExp.validateTypeIsNotInvalid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShadowPart(ShadowPart shadowPart, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(shadowPart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(shadowPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(shadowPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(shadowPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(shadowPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(shadowPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(shadowPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(shadowPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(shadowPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateShadowPart_validateTypeIsNotInvalid(shadowPart, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTypeIsNotInvalid constraint of '<em>Shadow Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShadowPart_validateTypeIsNotInvalid(ShadowPart shadowPart, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return shadowPart.validateTypeIsNotInvalid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(state, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateExp(StateExp stateExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stateExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateExp_validateTypeIsNotInvalid(stateExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTypeIsNotInvalid constraint of '<em>State Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateExp_validateTypeIsNotInvalid(StateExp stateExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return stateExp.validateTypeIsNotInvalid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(stateMachine, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(stateMachine, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotype(Stereotype stereotype, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(stereotype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(stereotype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotypeExtender(StereotypeExtender stereotypeExtender, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(stereotypeExtender, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringLiteralExp(StringLiteralExp stringLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringLiteralExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTupleLiteralExp(TupleLiteralExp tupleLiteralExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tupleLiteralExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTupleLiteralPart(TupleLiteralPart tupleLiteralPart,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tupleLiteralPart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tupleLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tupleLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tupleLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tupleLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tupleLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tupleLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tupleLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tupleLiteralPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableDeclaration_validateTypeIsNotInvalid(tupleLiteralPart, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTupleType(TupleType tupleType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tupleType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tupleType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tupleType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tupleType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tupleType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tupleType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tupleType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tupleType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tupleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(tupleType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeExp(TypeExp typeExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnspecifiedValueExp(
			UnspecifiedValueExp unspecifiedValueExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unspecifiedValueExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecification(
			ValueSpecification valueSpecification, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableExp(VariableExp variableExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variableExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variableExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variableExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variableExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variableExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variableExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableExp_validateTypeIsNotInvalid(variableExp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTypeIsNotInvalid constraint of '<em>Variable Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableExp_validateTypeIsNotInvalid(VariableExp variableExp, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return variableExp.validateTypeIsNotInvalid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVertex(Vertex vertex, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(vertex, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisitable(Visitable visitable,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)visitable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoidType(VoidType voidType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(voidType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(voidType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWildcardType(WildcardType wildcardType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(wildcardType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wildcardType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wildcardType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wildcardType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wildcardType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wildcardType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wildcardType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wildcardType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wildcardType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_validateUniqueInvariantName(wildcardType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociativityKind(
			AssociativityKind associativityKind, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionKind(CollectionKind collectionKind,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostateKind(PseudostateKind pseudostateKind, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionKind(TransitionKind transitionKind, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(boolean boolean_,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(Number integer, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryFeature(LibraryFeature libraryFeature, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject(Object object, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReal(Number real, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(String string, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThrowable(Throwable throwable,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlimitedNatural(Number unlimitedNatural, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PivotPlugin.INSTANCE;
	}

} //PivotValidator

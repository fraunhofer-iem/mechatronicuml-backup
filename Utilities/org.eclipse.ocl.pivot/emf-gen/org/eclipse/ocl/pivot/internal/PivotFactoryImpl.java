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
package org.eclipse.ocl.pivot.internal;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.ocl.pivot.Annotation;
import org.eclipse.ocl.pivot.AnyType;
import org.eclipse.ocl.pivot.AssociationClass;
import org.eclipse.ocl.pivot.AssociationClassCallExp;
import org.eclipse.ocl.pivot.AssociativityKind;
import org.eclipse.ocl.pivot.BagType;
import org.eclipse.ocl.pivot.BooleanLiteralExp;
import org.eclipse.ocl.pivot.CallOperationAction;
import org.eclipse.ocl.pivot.CollectionItem;
import org.eclipse.ocl.pivot.CollectionKind;
import org.eclipse.ocl.pivot.CollectionLiteralExp;
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
import org.eclipse.ocl.pivot.ElementExtension;
import org.eclipse.ocl.pivot.EnumLiteralExp;
import org.eclipse.ocl.pivot.Enumeration;
import org.eclipse.ocl.pivot.EnumerationLiteral;
import org.eclipse.ocl.pivot.ExpressionInOCL;
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
import org.eclipse.ocl.pivot.LetExp;
import org.eclipse.ocl.pivot.Library;
import org.eclipse.ocl.pivot.MapLiteralExp;
import org.eclipse.ocl.pivot.MapLiteralPart;
import org.eclipse.ocl.pivot.MapType;
import org.eclipse.ocl.pivot.MessageExp;
import org.eclipse.ocl.pivot.MessageType;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.NullLiteralExp;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.OppositePropertyCallExp;
import org.eclipse.ocl.pivot.OrderedSetType;
import org.eclipse.ocl.pivot.OrphanCompletePackage;
import org.eclipse.ocl.pivot.Parameter;
import org.eclipse.ocl.pivot.PivotFactory;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.Precedence;
import org.eclipse.ocl.pivot.PrimitiveCompletePackage;
import org.eclipse.ocl.pivot.PrimitiveType;
import org.eclipse.ocl.pivot.Profile;
import org.eclipse.ocl.pivot.ProfileApplication;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.PropertyCallExp;
import org.eclipse.ocl.pivot.Pseudostate;
import org.eclipse.ocl.pivot.PseudostateKind;
import org.eclipse.ocl.pivot.RealLiteralExp;
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
import org.eclipse.ocl.pivot.Transition;
import org.eclipse.ocl.pivot.TransitionKind;
import org.eclipse.ocl.pivot.Trigger;
import org.eclipse.ocl.pivot.TupleLiteralExp;
import org.eclipse.ocl.pivot.TupleLiteralPart;
import org.eclipse.ocl.pivot.TupleType;
import org.eclipse.ocl.pivot.TypeExp;
import org.eclipse.ocl.pivot.StereotypeExtender;
import org.eclipse.ocl.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.pivot.UnspecifiedValueExp;
import org.eclipse.ocl.pivot.Variable;
import org.eclipse.ocl.pivot.VariableExp;
import org.eclipse.ocl.pivot.VoidType;
import org.eclipse.ocl.pivot.WildcardType;
import org.eclipse.ocl.pivot.library.LibraryFeature;
import org.eclipse.ocl.pivot.utilities.StringUtil;
import org.eclipse.ocl.pivot.values.Unlimited;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PivotFactoryImpl
		extends EFactoryImpl
		implements PivotFactory {

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PivotFactory init() {
		try
		{
			PivotFactory thePivotFactory = (PivotFactory)EPackage.Registry.INSTANCE.getEFactory(PivotPackage.eNS_URI);
			if (thePivotFactory != null)
			{
				return thePivotFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PivotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PivotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID())
		{
			case PivotPackage.ANNOTATION: return createAnnotation();
			case PivotPackage.ANY_TYPE: return createAnyType();
			case PivotPackage.ASSOCIATION_CLASS: return createAssociationClass();
			case PivotPackage.ASSOCIATION_CLASS_CALL_EXP: return createAssociationClassCallExp();
			case PivotPackage.BAG_TYPE: return createBagType();
			case PivotPackage.BOOLEAN_LITERAL_EXP: return createBooleanLiteralExp();
			case PivotPackage.CALL_OPERATION_ACTION: return createCallOperationAction();
			case PivotPackage.CLASS: return createClass();
			case PivotPackage.COLLECTION_ITEM: return createCollectionItem();
			case PivotPackage.COLLECTION_LITERAL_EXP: return createCollectionLiteralExp();
			case PivotPackage.COLLECTION_RANGE: return createCollectionRange();
			case PivotPackage.COLLECTION_TYPE: return createCollectionType();
			case PivotPackage.COMMENT: return createComment();
			case PivotPackage.COMPLETE_CLASS: return createCompleteClass();
			case PivotPackage.COMPLETE_ENVIRONMENT: return createCompleteEnvironment();
			case PivotPackage.COMPLETE_MODEL: return createCompleteModel();
			case PivotPackage.COMPLETE_PACKAGE: return createCompletePackage();
			case PivotPackage.CONNECTION_POINT_REFERENCE: return createConnectionPointReference();
			case PivotPackage.CONSTRAINT: return createConstraint();
			case PivotPackage.DATA_TYPE: return createDataType();
			case PivotPackage.DETAIL: return createDetail();
			case PivotPackage.DYNAMIC_BEHAVIOR: return createDynamicBehavior();
			case PivotPackage.DYNAMIC_ELEMENT: return createDynamicElement();
			case PivotPackage.DYNAMIC_PROPERTY: return createDynamicProperty();
			case PivotPackage.DYNAMIC_TYPE: return createDynamicType();
			case PivotPackage.DYNAMIC_VALUE_SPECIFICATION: return createDynamicValueSpecification();
			case PivotPackage.ELEMENT_EXTENSION: return createElementExtension();
			case PivotPackage.ENUM_LITERAL_EXP: return createEnumLiteralExp();
			case PivotPackage.ENUMERATION: return createEnumeration();
			case PivotPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case PivotPackage.EXPRESSION_IN_OCL: return createExpressionInOCL();
			case PivotPackage.FINAL_STATE: return createFinalState();
			case PivotPackage.IF_EXP: return createIfExp();
			case PivotPackage.IMPORT: return createImport();
			case PivotPackage.INSTANCE_SPECIFICATION: return createInstanceSpecification();
			case PivotPackage.INTEGER_LITERAL_EXP: return createIntegerLiteralExp();
			case PivotPackage.INVALID_LITERAL_EXP: return createInvalidLiteralExp();
			case PivotPackage.INVALID_TYPE: return createInvalidType();
			case PivotPackage.ITERATE_EXP: return createIterateExp();
			case PivotPackage.ITERATION: return createIteration();
			case PivotPackage.ITERATOR_EXP: return createIteratorExp();
			case PivotPackage.LAMBDA_TYPE: return createLambdaType();
			case PivotPackage.LET_EXP: return createLetExp();
			case PivotPackage.LIBRARY: return createLibrary();
			case PivotPackage.MAP_LITERAL_EXP: return createMapLiteralExp();
			case PivotPackage.MAP_LITERAL_PART: return createMapLiteralPart();
			case PivotPackage.MAP_TYPE: return createMapType();
			case PivotPackage.MESSAGE_EXP: return createMessageExp();
			case PivotPackage.MESSAGE_TYPE: return createMessageType();
			case PivotPackage.MODEL: return createModel();
			case PivotPackage.NULL_LITERAL_EXP: return createNullLiteralExp();
			case PivotPackage.OPERATION: return createOperation();
			case PivotPackage.OPERATION_CALL_EXP: return createOperationCallExp();
			case PivotPackage.OPPOSITE_PROPERTY_CALL_EXP: return createOppositePropertyCallExp();
			case PivotPackage.ORDERED_SET_TYPE: return createOrderedSetType();
			case PivotPackage.ORPHAN_COMPLETE_PACKAGE: return createOrphanCompletePackage();
			case PivotPackage.PACKAGE: return createPackage();
			case PivotPackage.PARAMETER: return createParameter();
			case PivotPackage.PRECEDENCE: return createPrecedence();
			case PivotPackage.PRIMITIVE_COMPLETE_PACKAGE: return createPrimitiveCompletePackage();
			case PivotPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case PivotPackage.PROFILE: return createProfile();
			case PivotPackage.PROFILE_APPLICATION: return createProfileApplication();
			case PivotPackage.PROPERTY: return createProperty();
			case PivotPackage.PROPERTY_CALL_EXP: return createPropertyCallExp();
			case PivotPackage.PSEUDOSTATE: return createPseudostate();
			case PivotPackage.REAL_LITERAL_EXP: return createRealLiteralExp();
			case PivotPackage.REGION: return createRegion();
			case PivotPackage.SELF_TYPE: return createSelfType();
			case PivotPackage.SEND_SIGNAL_ACTION: return createSendSignalAction();
			case PivotPackage.SEQUENCE_TYPE: return createSequenceType();
			case PivotPackage.SET_TYPE: return createSetType();
			case PivotPackage.SHADOW_EXP: return createShadowExp();
			case PivotPackage.SHADOW_PART: return createShadowPart();
			case PivotPackage.SIGNAL: return createSignal();
			case PivotPackage.SLOT: return createSlot();
			case PivotPackage.STANDARD_LIBRARY: return createStandardLibrary();
			case PivotPackage.STATE: return createState();
			case PivotPackage.STATE_EXP: return createStateExp();
			case PivotPackage.STATE_MACHINE: return createStateMachine();
			case PivotPackage.STEREOTYPE: return createStereotype();
			case PivotPackage.STEREOTYPE_EXTENDER: return createStereotypeExtender();
			case PivotPackage.STRING_LITERAL_EXP: return createStringLiteralExp();
			case PivotPackage.TEMPLATE_BINDING: return createTemplateBinding();
			case PivotPackage.TEMPLATE_PARAMETER: return createTemplateParameter();
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION: return createTemplateParameterSubstitution();
			case PivotPackage.TEMPLATE_SIGNATURE: return createTemplateSignature();
			case PivotPackage.TRANSITION: return createTransition();
			case PivotPackage.TRIGGER: return createTrigger();
			case PivotPackage.TUPLE_LITERAL_EXP: return createTupleLiteralExp();
			case PivotPackage.TUPLE_LITERAL_PART: return createTupleLiteralPart();
			case PivotPackage.TUPLE_TYPE: return createTupleType();
			case PivotPackage.TYPE_EXP: return createTypeExp();
			case PivotPackage.UNLIMITED_NATURAL_LITERAL_EXP: return createUnlimitedNaturalLiteralExp();
			case PivotPackage.UNSPECIFIED_VALUE_EXP: return createUnspecifiedValueExp();
			case PivotPackage.VARIABLE: return createVariable();
			case PivotPackage.VARIABLE_EXP: return createVariableExp();
			case PivotPackage.VOID_TYPE: return createVoidType();
			case PivotPackage.WILDCARD_TYPE: return createWildcardType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID())
		{
			case PivotPackage.ASSOCIATIVITY_KIND:
				return createAssociativityKindFromString(eDataType, initialValue);
			case PivotPackage.COLLECTION_KIND:
				return createCollectionKindFromString(eDataType, initialValue);
			case PivotPackage.PSEUDOSTATE_KIND:
				return createPseudostateKindFromString(eDataType, initialValue);
			case PivotPackage.TRANSITION_KIND:
				return createTransitionKindFromString(eDataType, initialValue);
			case PivotPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case PivotPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case PivotPackage.LIBRARY_FEATURE:
				return createLibraryFeatureFromString(eDataType, initialValue);
			case PivotPackage.OBJECT:
				return createObjectFromString(eDataType, initialValue);
			case PivotPackage.REAL:
				return createRealFromString(eDataType, initialValue);
			case PivotPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case PivotPackage.THROWABLE:
				return createThrowableFromString(eDataType, initialValue);
			case PivotPackage.UNLIMITED_NATURAL:
				return createUnlimitedNaturalFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID())
		{
			case PivotPackage.ASSOCIATIVITY_KIND:
				return convertAssociativityKindToString(eDataType, instanceValue);
			case PivotPackage.COLLECTION_KIND:
				return convertCollectionKindToString(eDataType, instanceValue);
			case PivotPackage.PSEUDOSTATE_KIND:
				return convertPseudostateKindToString(eDataType, instanceValue);
			case PivotPackage.TRANSITION_KIND:
				return convertTransitionKindToString(eDataType, instanceValue);
			case PivotPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case PivotPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case PivotPackage.LIBRARY_FEATURE:
				return convertLibraryFeatureToString(eDataType, instanceValue);
			case PivotPackage.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			case PivotPackage.REAL:
				return convertRealToString(eDataType, instanceValue);
			case PivotPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case PivotPackage.THROWABLE:
				return convertThrowableToString(eDataType, instanceValue);
			case PivotPackage.UNLIMITED_NATURAL:
				return convertUnlimitedNaturalToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.ocl.pivot.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateBinding createTemplateBinding() {
		TemplateBindingImpl templateBinding = new TemplateBindingImpl();
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateSignature createTemplateSignature() {
		TemplateSignatureImpl templateSignature = new TemplateSignatureImpl();
		return templateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition()
	{
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trigger createTrigger()
	{
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateParameter createTemplateParameter() {
		TemplateParameterImpl templateParameter = new TemplateParameterImpl();
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateParameterSubstitution createTemplateParameterSubstitution() {
		TemplateParameterSubstitutionImpl templateParameterSubstitution = new TemplateParameterSubstitutionImpl();
		return templateParameterSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.ocl.pivot.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Precedence createPrecedence() {
		PrecedenceImpl precedence = new PrecedenceImpl();
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveCompletePackage createPrimitiveCompletePackage()
	{
		PrimitiveCompletePackageImpl primitiveCompletePackage = new PrimitiveCompletePackageImpl();
		return primitiveCompletePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationClass createAssociationClass() {
		AssociationClassImpl associationClass = new AssociationClassImpl();
		return associationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OppositePropertyCallExp createOppositePropertyCallExp()
	{
		OppositePropertyCallExpImpl oppositePropertyCallExp = new OppositePropertyCallExpImpl();
		return oppositePropertyCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompleteClass createCompleteClass()
	{
		CompleteClassImpl completeClass = new CompleteClassImpl();
		return completeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompleteEnvironment createCompleteEnvironment()
	{
		CompleteEnvironmentImpl completeEnvironment = new CompleteEnvironmentImpl();
		return completeEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompleteModel createCompleteModel()
	{
		CompleteModelImpl completeModel = new CompleteModelImpl();
		return completeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompletePackage createCompletePackage()
	{
		CompletePackageImpl completePackage = new CompletePackageImpl();
		return completePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionPointReference createConnectionPointReference()
	{
		ConnectionPointReferenceImpl connectionPointReference = new ConnectionPointReferenceImpl();
		return connectionPointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Detail createDetail() {
		DetailImpl detail = new DetailImpl();
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicBehavior createDynamicBehavior()
	{
		DynamicBehaviorImpl dynamicBehavior = new DynamicBehaviorImpl();
		return dynamicBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicElement createDynamicElement()
	{
		DynamicElementImpl dynamicElement = new DynamicElementImpl();
		return dynamicElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicProperty createDynamicProperty()
	{
		DynamicPropertyImpl dynamicProperty = new DynamicPropertyImpl();
		return dynamicProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicType createDynamicType()
	{
		DynamicTypeImpl dynamicType = new DynamicTypeImpl();
		return dynamicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicValueSpecification createDynamicValueSpecification()
	{
		DynamicValueSpecificationImpl dynamicValueSpecification = new DynamicValueSpecificationImpl();
		return dynamicValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementExtension createElementExtension()
	{
		ElementExtensionImpl elementExtension = new ElementExtensionImpl();
		return elementExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnyType createAnyType() {
		AnyTypeImpl anyType = new AnyTypeImpl();
		return anyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationClassCallExp createAssociationClassCallExp() {
		AssociationClassCallExpImpl associationClassCallExp = new AssociationClassCallExpImpl();
		return associationClassCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BagType createBagType() {
		BagTypeImpl bagType = new BagTypeImpl();
		return bagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanLiteralExp createBooleanLiteralExp() {
		BooleanLiteralExpImpl booleanLiteralExp = new BooleanLiteralExpImpl();
		return booleanLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallOperationAction createCallOperationAction() {
		CallOperationActionImpl callOperationAction = new CallOperationActionImpl();
		return callOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionItem createCollectionItem() {
		CollectionItemImpl collectionItem = new CollectionItemImpl();
		return collectionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionLiteralExp createCollectionLiteralExp() {
		CollectionLiteralExpImpl collectionLiteralExp = new CollectionLiteralExpImpl();
		return collectionLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionRange createCollectionRange() {
		CollectionRangeImpl collectionRange = new CollectionRangeImpl();
		return collectionRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumLiteralExp createEnumLiteralExp() {
		EnumLiteralExpImpl enumLiteralExp = new EnumLiteralExpImpl();
		return enumLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionInOCL createExpressionInOCL()
	{
		ExpressionInOCLImpl expressionInOCL = new ExpressionInOCLImpl();
		return expressionInOCL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalState createFinalState()
	{
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfExp createIfExp() {
		IfExpImpl ifExp = new IfExpImpl();
		return ifExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport()
	{
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceSpecification createInstanceSpecification()
	{
		InstanceSpecificationImpl instanceSpecification = new InstanceSpecificationImpl();
		return instanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerLiteralExp createIntegerLiteralExp() {
		IntegerLiteralExpImpl integerLiteralExp = new IntegerLiteralExpImpl();
		return integerLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvalidLiteralExp createInvalidLiteralExp() {
		InvalidLiteralExpImpl invalidLiteralExp = new InvalidLiteralExpImpl();
		return invalidLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvalidType createInvalidType() {
		InvalidTypeImpl invalidType = new InvalidTypeImpl();
		return invalidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IterateExp createIterateExp()
	{
		IterateExpImpl iterateExp = new IterateExpImpl();
		return iterateExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Iteration createIteration()
	{
		IterationImpl iteration = new IterationImpl();
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IteratorExp createIteratorExp()
	{
		IteratorExpImpl iteratorExp = new IteratorExpImpl();
		return iteratorExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaType createLambdaType()
	{
		LambdaTypeImpl lambdaType = new LambdaTypeImpl();
		return lambdaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LetExp createLetExp() {
		LetExpImpl letExp = new LetExpImpl();
		return letExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Library createLibrary()
	{
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapLiteralExp createMapLiteralExp()
	{
		MapLiteralExpImpl mapLiteralExp = new MapLiteralExpImpl();
		return mapLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapLiteralPart createMapLiteralPart()
	{
		MapLiteralPartImpl mapLiteralPart = new MapLiteralPartImpl();
		return mapLiteralPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapType createMapType()
	{
		MapTypeImpl mapType = new MapTypeImpl();
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageExp createMessageExp() {
		MessageExpImpl messageExp = new MessageExpImpl();
		return messageExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SendSignalAction createSendSignalAction() {
		SendSignalActionImpl sendSignalAction = new SendSignalActionImpl();
		return sendSignalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Slot createSlot()
	{
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardLibrary createStandardLibrary()
	{
		StandardLibraryImpl standardLibrary = new StandardLibraryImpl();
		return standardLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageType createMessageType() {
		MessageTypeImpl messageType = new MessageTypeImpl();
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel()
	{
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullLiteralExp createNullLiteralExp() {
		NullLiteralExpImpl nullLiteralExp = new NullLiteralExpImpl();
		return nullLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationCallExp createOperationCallExp() {
		OperationCallExpImpl operationCallExp = new OperationCallExpImpl();
		return operationCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderedSetType createOrderedSetType() {
		OrderedSetTypeImpl orderedSetType = new OrderedSetTypeImpl();
		return orderedSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrphanCompletePackage createOrphanCompletePackage()
	{
		OrphanCompletePackageImpl orphanCompletePackage = new OrphanCompletePackageImpl();
		return orphanCompletePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Profile createProfile()
	{
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfileApplication createProfileApplication()
	{
		ProfileApplicationImpl profileApplication = new ProfileApplicationImpl();
		return profileApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyCallExp createPropertyCallExp() {
		PropertyCallExpImpl propertyCallExp = new PropertyCallExpImpl();
		return propertyCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pseudostate createPseudostate()
	{
		PseudostateImpl pseudostate = new PseudostateImpl();
		return pseudostate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealLiteralExp createRealLiteralExp() {
		RealLiteralExpImpl realLiteralExp = new RealLiteralExpImpl();
		return realLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region createRegion()
	{
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelfType createSelfType()
	{
		SelfTypeImpl selfType = new SelfTypeImpl();
		return selfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetType createSetType() {
		SetTypeImpl setType = new SetTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShadowExp createShadowExp()
	{
		ShadowExpImpl shadowExp = new ShadowExpImpl();
		return shadowExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShadowPart createShadowPart()
	{
		ShadowPartImpl shadowPart = new ShadowPartImpl();
		return shadowPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateExp createStateExp() {
		StateExpImpl stateExp = new StateExpImpl();
		return stateExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachine createStateMachine()
	{
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stereotype createStereotype()
	{
		StereotypeImpl stereotype = new StereotypeImpl();
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StereotypeExtender createStereotypeExtender()
	{
		StereotypeExtenderImpl stereotypeExtender = new StereotypeExtenderImpl();
		return stereotypeExtender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteralExp createStringLiteralExp() {
		StringLiteralExpImpl stringLiteralExp = new StringLiteralExpImpl();
		return stringLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TupleLiteralExp createTupleLiteralExp() {
		TupleLiteralExpImpl tupleLiteralExp = new TupleLiteralExpImpl();
		return tupleLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TupleLiteralPart createTupleLiteralPart() {
		TupleLiteralPartImpl tupleLiteralPart = new TupleLiteralPartImpl();
		return tupleLiteralPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TupleType createTupleType() {
		TupleTypeImpl tupleType = new TupleTypeImpl();
		return tupleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeExp createTypeExp() {
		TypeExpImpl typeExp = new TypeExpImpl();
		return typeExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnlimitedNaturalLiteralExp createUnlimitedNaturalLiteralExp() {
		UnlimitedNaturalLiteralExpImpl unlimitedNaturalLiteralExp = new UnlimitedNaturalLiteralExpImpl();
		return unlimitedNaturalLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnspecifiedValueExp createUnspecifiedValueExp() {
		UnspecifiedValueExpImpl unspecifiedValueExp = new UnspecifiedValueExpImpl();
		return unspecifiedValueExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableExp createVariableExp() {
		VariableExpImpl variableExp = new VariableExpImpl();
		return variableExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VoidType createVoidType() {
		VoidTypeImpl voidType = new VoidTypeImpl();
		return voidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WildcardType createWildcardType()
	{
		WildcardTypeImpl wildcardType = new WildcardTypeImpl();
		return wildcardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociativityKind createAssociativityKindFromString(
			EDataType eDataType, String initialValue) {
		AssociativityKind result = AssociativityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssociativityKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind createCollectionKindFromString(EDataType eDataType,
			String initialValue) {
		CollectionKind result = CollectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudostateKind createPseudostateKindFromString(EDataType eDataType, String initialValue)
	{
		PseudostateKind result = PseudostateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPseudostateKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionKind createTransitionKindFromString(EDataType eDataType, String initialValue)
	{
		TransitionKind result = TransitionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitionKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType,
			String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer createIntFromString(EDataType eDataType, String initialValue)
	{
		return Integer.valueOf(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertIntToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Number createIntegerFromString(EDataType eDataType, String aValue) {
		try {
			assert aValue != null;
			return StringUtil.createNumberFromString(aValue);
		}
		catch (NumberFormatException e) {
//			return throwInvalidValueException(e, EvaluatorMessages.InvalidInteger, aValue);
		}
		return (Number)super.createFromString(eDataType, aValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertIntegerToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryFeature createLibraryFeatureFromString(EDataType eDataType, String initialValue)
	{
		return (LibraryFeature)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLibraryFeatureToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObjectFromString(EDataType eDataType, String initialValue)
	{
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Number createRealFromString(EDataType eDataType, String aValue) {
		if ("*".equals(aValue)) {
			return Unlimited.INSTANCE;
		}
		try {
			return new BigDecimal(aValue);
		}
		catch (NumberFormatException e) {
//			return throwInvalidValueException(e, EvaluatorMessages.InvalidInteger, aValue);
		}
		return (Number)super.createFromString(eDataType, aValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertRealToString(EDataType eDataType, Object instanceValue) {
		return instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType,
			String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throwable createThrowableFromString(EDataType eDataType,
			String initialValue) {
		return (Throwable)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThrowableToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Number createUnlimitedNaturalFromString(EDataType eDataType, String aValue) {
		try {
			assert aValue != null;
			return StringUtil.createNumberFromString(aValue);
		}
		catch (NumberFormatException e) {
//			return throwInvalidValueException(e, EvaluatorMessages.InvalidInteger, aValue);
		}
		return (Number)super.createFromString(eDataType, aValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertUnlimitedNaturalToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PivotPackage getPivotPackage() {
		return (PivotPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PivotPackage getPackage() {
		return PivotPackage.eINSTANCE;
	}

} //PivotFactoryImpl

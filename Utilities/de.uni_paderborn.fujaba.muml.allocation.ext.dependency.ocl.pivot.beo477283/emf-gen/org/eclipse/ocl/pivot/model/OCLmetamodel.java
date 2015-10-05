/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************
 * This code is 100% auto-generated
 * from: /org.eclipse.ocl.pivot/model/Pivot.ecore
 * by: org.eclipse.ocl.examples.build.xtend.GenerateOCLmetamodel.xtend
 * and: org.eclipse.ocl.examples.build.GeneratePivotMetamodel.mwe2
 *
 * Do not edit it.
 *******************************************************************************/
package	org.eclipse.ocl.pivot.model;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.*;
import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.Package;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.internal.complete.StandardLibraryInternal;
import org.eclipse.ocl.pivot.internal.resource.ASResourceImpl;
import org.eclipse.ocl.pivot.internal.resource.OCLASResourceFactory;
import org.eclipse.ocl.pivot.internal.utilities.AbstractContents;
import org.eclipse.ocl.pivot.library.LibraryFeature;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibPackage;
import org.eclipse.ocl.pivot.PivotPackage;

/**
 * This is the pivot representation of the http://www.eclipse.org/ocl/2015/Pivot metamodel
 * auto-generated from /org.eclipse.ocl.pivot/model/Pivot.ecore.
 * It facilitates efficient model loading without the overheads of model reading.
 */
@SuppressWarnings({"nls", "unused"})
public class OCLmetamodel extends ASResourceImpl
{
	/**
	 *	The static package-of-types pivot model of the Pivot Metamodel.
	 */
	private static OCLmetamodel INSTANCE = null;

	/**
	 *	The URI of this Metamodel.
	 */
	public static final @NonNull String PIVOT_URI = "http://www.eclipse.org/ocl/2015/Pivot";

	public static @NonNull Package create(@NonNull StandardLibraryInternal standardLibrary, @NonNull String name, @Nullable String nsPrefix, @NonNull String nsURI) {
		OCLmetamodel resource = new OCLmetamodel(ClassUtil.nonNullEMF(URI.createURI(PIVOT_URI)));
		Contents contents = new Contents(standardLibrary.getPackage(), name, nsPrefix, nsURI);
		Model model = contents.getModel();
		resource.getContents().add(model);
		@SuppressWarnings("null")@NonNull Package pkge = model.getOwnedPackages().get(0);
		return pkge;
	}

	/**
	 * Return the default http://www.eclipse.org/ocl/2015/Pivot metamodel Resource using the default OCL Standard Library. 
	 *  This static definition auto-generated from /org.eclipse.ocl.pivot/model/Pivot.ecore
	 *  is used as the default when no overriding copy is registered. 
	 */
	public static @NonNull OCLmetamodel getDefault() {
		OCLmetamodel metamodel = INSTANCE;
		if (metamodel == null) {
			metamodel = INSTANCE = new OCLmetamodel(ClassUtil.nonNullEMF(URI.createURI(PIVOT_URI)));
			Contents contents = new Contents(OCLstdlib.getDefaultPackage(), "pivot", "pivot", PIVOT_URI);
			metamodel.getContents().add(contents.getModel());
		}
		return metamodel;
	}

	/**
	 * Return the default http://www.eclipse.org/ocl/2015/Pivot metamodel Model using the default OCL Standard Library. 
	 *  This static definition auto-generated from /org.eclipse.ocl.pivot/model/Pivot.ecore
	 *  is used as the default when no overriding copy is registered. 
	 */
	public static @NonNull Model getDefaultModel() {
		Model model = (Model)(getDefault().getContents().get(0));
		assert model != null;
		return model;
	}

	protected OCLmetamodel(@NonNull URI uri) {
		super(uri, OCLASResourceFactory.getInstance());
	}

	protected static class LibraryContents extends AbstractContents
	{
		protected final @NonNull Package standardLibrary;

		protected LibraryContents(@NonNull Package standardLibrary) {
			this.standardLibrary = standardLibrary;
		}
	}

	private static class Contents extends LibraryContents
	{
		private final @NonNull Model root;
		private final @NonNull Package pivot;
		private final @NonNull Package orphanage;

		protected Contents(@NonNull Package standardLibrary, @NonNull String name, @Nullable String nsPrefix, @NonNull String nsURI) {
			super(standardLibrary);
			root = createModel("http://www.eclipse.org/ocl/2015/Pivot");
			pivot = createPackage("pivot", "pivot", "http://www.eclipse.org/ocl/2015/Pivot", IdManager.METAMODEL);
			orphanage = createPackage("$$", "orphanage", "http://www.eclipse.org/ocl/2015/Orphanage", null);
			installPackages();
			installClassTypes();
			installEnumerations();
			installCollectionTypes();
			installOperations();
			installProperties();
			installTemplateBindings();
			installComments();
		}
		
		public @NonNull Model getModel() {
			return root;
		}
		
		private final @NonNull Package _ocl = standardLibrary;
		private final @NonNull BagType _Bag = getBagType(_ocl, "Bag");
		private final @NonNull PrimitiveType _Boolean = getPrimitiveType(_ocl, "Boolean");
		private final @NonNull CollectionType _Collection = getCollectionType(_ocl, "Collection");
		private final @NonNull PrimitiveType _Integer = getPrimitiveType(_ocl, "Integer");
		private final @NonNull AnyType _OclAny = getAnyType(_ocl, "OclAny");
		private final @NonNull Class _OclElement = getClass(_ocl, "OclElement");
		private final @NonNull CollectionType _OrderedCollection = getCollectionType(_ocl, "OrderedCollection");
		private final @NonNull OrderedSetType _OrderedSet = getOrderedSetType(_ocl, "OrderedSet");
		private final @NonNull PrimitiveType _Real = getPrimitiveType(_ocl, "Real");
		private final @NonNull SequenceType _Sequence = getSequenceType(_ocl, "Sequence");
		private final @NonNull SetType _Set = getSetType(_ocl, "Set");
		private final @NonNull PrimitiveType _String = getPrimitiveType(_ocl, "String");
		private final @NonNull CollectionType _UniqueCollection = getCollectionType(_ocl, "UniqueCollection");
		private final @NonNull PrimitiveType _UnlimitedNatural = getPrimitiveType(_ocl, "UnlimitedNatural");
		private final @NonNull TemplateParameter _Bag_T = getTemplateParameter(_Bag, 0);
		private final @NonNull TemplateParameter _Collection_T = getTemplateParameter(_Collection, 0);
		private final @NonNull TemplateParameter _OrderedCollection_T = getTemplateParameter(_OrderedCollection, 0);
		private final @NonNull TemplateParameter _OrderedSet_T = getTemplateParameter(_OrderedSet, 0);
		private final @NonNull TemplateParameter _Sequence_T = getTemplateParameter(_Sequence, 0);
		private final @NonNull TemplateParameter _Set_T = getTemplateParameter(_Set, 0);
		private final @NonNull TemplateParameter _UniqueCollection_T = getTemplateParameter(_UniqueCollection, 0);
		
		private void installPackages() {
			root.getOwnedPackages().add(pivot);
			root.getOwnedPackages().add(orphanage);
			root.getOwnedImports().add(createImport(null, _ocl));
		}
		
		private final @NonNull Class _Annotation = createClass(PivotPackage.Literals.ANNOTATION);
		private final @NonNull Class _AnyType = createClass(PivotPackage.Literals.ANY_TYPE);
		private final @NonNull Class _AssociationClass = createClass(PivotPackage.Literals.ASSOCIATION_CLASS);
		private final @NonNull Class _AssociationClassCallExp = createClass(PivotPackage.Literals.ASSOCIATION_CLASS_CALL_EXP);
		private final @NonNull Class _BagType = createClass(PivotPackage.Literals.BAG_TYPE);
		private final @NonNull Class _Behavior = createClass(PivotPackage.Literals.BEHAVIOR);
		private final @NonNull Class _BooleanLiteralExp = createClass(PivotPackage.Literals.BOOLEAN_LITERAL_EXP);
		private final @NonNull Class _CallExp = createClass(PivotPackage.Literals.CALL_EXP);
		private final @NonNull Class _CallOperationAction = createClass(PivotPackage.Literals.CALL_OPERATION_ACTION);
		private final @NonNull Class _Class = createClass(PivotPackage.Literals.CLASS);
		private final @NonNull Class _CollectionItem = createClass(PivotPackage.Literals.COLLECTION_ITEM);
		private final @NonNull Class _CollectionLiteralExp = createClass(PivotPackage.Literals.COLLECTION_LITERAL_EXP);
		private final @NonNull Class _CollectionLiteralPart = createClass(PivotPackage.Literals.COLLECTION_LITERAL_PART);
		private final @NonNull Class _CollectionRange = createClass(PivotPackage.Literals.COLLECTION_RANGE);
		private final @NonNull Class _CollectionType = createClass(PivotPackage.Literals.COLLECTION_TYPE);
		private final @NonNull Class _Comment = createClass(PivotPackage.Literals.COMMENT);
		private final @NonNull Class _CompleteClass = createClass(PivotPackage.Literals.COMPLETE_CLASS);
		private final @NonNull Class _CompleteEnvironment = createClass(PivotPackage.Literals.COMPLETE_ENVIRONMENT);
		private final @NonNull Class _CompleteModel = createClass(PivotPackage.Literals.COMPLETE_MODEL);
		private final @NonNull Class _CompletePackage = createClass(PivotPackage.Literals.COMPLETE_PACKAGE);
		private final @NonNull Class _ConnectionPointReference = createClass(PivotPackage.Literals.CONNECTION_POINT_REFERENCE);
		private final @NonNull Class _Constraint = createClass(PivotPackage.Literals.CONSTRAINT);
		private final @NonNull Class _DataType = createClass(PivotPackage.Literals.DATA_TYPE);
		private final @NonNull Class _Detail = createClass(PivotPackage.Literals.DETAIL);
		private final @NonNull Class _DynamicBehavior = createClass(PivotPackage.Literals.DYNAMIC_BEHAVIOR);
		private final @NonNull Class _DynamicElement = createClass(PivotPackage.Literals.DYNAMIC_ELEMENT);
		private final @NonNull Class _DynamicProperty = createClass(PivotPackage.Literals.DYNAMIC_PROPERTY);
		private final @NonNull Class _DynamicType = createClass(PivotPackage.Literals.DYNAMIC_TYPE);
		private final @NonNull Class _DynamicValueSpecification = createClass(PivotPackage.Literals.DYNAMIC_VALUE_SPECIFICATION);
		private final @NonNull Class _Element = createClass(PivotPackage.Literals.ELEMENT);
		private final @NonNull Class _ElementExtension = createClass(PivotPackage.Literals.ELEMENT_EXTENSION);
		private final @NonNull Class _EnumLiteralExp = createClass(PivotPackage.Literals.ENUM_LITERAL_EXP);
		private final @NonNull Class _Enumeration = createClass(PivotPackage.Literals.ENUMERATION);
		private final @NonNull Class _EnumerationLiteral = createClass(PivotPackage.Literals.ENUMERATION_LITERAL);
		private final @NonNull Class _ExpressionInOCL = createClass(PivotPackage.Literals.EXPRESSION_IN_OCL);
		private final @NonNull Class _Feature = createClass(PivotPackage.Literals.FEATURE);
		private final @NonNull Class _FeatureCallExp = createClass(PivotPackage.Literals.FEATURE_CALL_EXP);
		private final @NonNull Class _FinalState = createClass(PivotPackage.Literals.FINAL_STATE);
		private final @NonNull Class _IfExp = createClass(PivotPackage.Literals.IF_EXP);
		private final @NonNull Class _Import = createClass(PivotPackage.Literals.IMPORT);
		private final @NonNull Class _InstanceSpecification = createClass(PivotPackage.Literals.INSTANCE_SPECIFICATION);
		private final @NonNull Class _IntegerLiteralExp = createClass(PivotPackage.Literals.INTEGER_LITERAL_EXP);
		private final @NonNull Class _InvalidLiteralExp = createClass(PivotPackage.Literals.INVALID_LITERAL_EXP);
		private final @NonNull Class _InvalidType = createClass(PivotPackage.Literals.INVALID_TYPE);
		private final @NonNull Class _IterateExp = createClass(PivotPackage.Literals.ITERATE_EXP);
		private final @NonNull Class _Iteration = createClass(PivotPackage.Literals.ITERATION);
		private final @NonNull Class _IteratorExp = createClass(PivotPackage.Literals.ITERATOR_EXP);
		private final @NonNull Class _LambdaType = createClass(PivotPackage.Literals.LAMBDA_TYPE);
		private final @NonNull Class _LanguageExpression = createClass(PivotPackage.Literals.LANGUAGE_EXPRESSION);
		private final @NonNull Class _LetExp = createClass(PivotPackage.Literals.LET_EXP);
		private final @NonNull Class _Library = createClass(PivotPackage.Literals.LIBRARY);
		private final @NonNull DataType _LibraryFeature = createDataType(PivotPackage.Literals.LIBRARY_FEATURE);
		private final @NonNull Class _LiteralExp = createClass(PivotPackage.Literals.LITERAL_EXP);
		private final @NonNull Class _LoopExp = createClass(PivotPackage.Literals.LOOP_EXP);
		private final @NonNull Class _MapLiteralExp = createClass(PivotPackage.Literals.MAP_LITERAL_EXP);
		private final @NonNull Class _MapLiteralPart = createClass(PivotPackage.Literals.MAP_LITERAL_PART);
		private final @NonNull Class _MapType = createClass(PivotPackage.Literals.MAP_TYPE);
		private final @NonNull Class _MessageExp = createClass(PivotPackage.Literals.MESSAGE_EXP);
		private final @NonNull Class _MessageType = createClass(PivotPackage.Literals.MESSAGE_TYPE);
		private final @NonNull Class _Model = createClass(PivotPackage.Literals.MODEL);
		private final @NonNull Class _MorePivotable = createClass(PivotPackage.Literals.MORE_PIVOTABLE);
		private final @NonNull Class _Nameable = createClass(PivotPackage.Literals.NAMEABLE);
		private final @NonNull Class _NamedElement = createClass(PivotPackage.Literals.NAMED_ELEMENT);
		private final @NonNull Class _Namespace = createClass(PivotPackage.Literals.NAMESPACE);
		private final @NonNull Class _NavigationCallExp = createClass(PivotPackage.Literals.NAVIGATION_CALL_EXP);
		private final @NonNull Class _NullLiteralExp = createClass(PivotPackage.Literals.NULL_LITERAL_EXP);
		private final @NonNull Class _NumericLiteralExp = createClass(PivotPackage.Literals.NUMERIC_LITERAL_EXP);
		private final @NonNull Class _OCLExpression = createClass(PivotPackage.Literals.OCL_EXPRESSION);
		private final @NonNull DataType _Object = createDataType(PivotPackage.Literals.OBJECT);
		private final @NonNull Class _Operation = createClass(PivotPackage.Literals.OPERATION);
		private final @NonNull Class _OperationCallExp = createClass(PivotPackage.Literals.OPERATION_CALL_EXP);
		private final @NonNull Class _OppositePropertyCallExp = createClass(PivotPackage.Literals.OPPOSITE_PROPERTY_CALL_EXP);
		private final @NonNull Class _OrderedSetType = createClass(PivotPackage.Literals.ORDERED_SET_TYPE);
		private final @NonNull Class _OrphanCompletePackage = createClass(PivotPackage.Literals.ORPHAN_COMPLETE_PACKAGE);
		private final @NonNull Class _Package = createClass(PivotPackage.Literals.PACKAGE);
		private final @NonNull Class _Parameter = createClass(PivotPackage.Literals.PARAMETER);
		private final @NonNull Class _Pivotable = createClass(PivotPackage.Literals.PIVOTABLE);
		private final @NonNull Class _Precedence = createClass(PivotPackage.Literals.PRECEDENCE);
		private final @NonNull Class _PrimitiveCompletePackage = createClass(PivotPackage.Literals.PRIMITIVE_COMPLETE_PACKAGE);
		private final @NonNull Class _PrimitiveLiteralExp = createClass(PivotPackage.Literals.PRIMITIVE_LITERAL_EXP);
		private final @NonNull Class _PrimitiveType = createClass(PivotPackage.Literals.PRIMITIVE_TYPE);
		private final @NonNull Class _Profile = createClass(PivotPackage.Literals.PROFILE);
		private final @NonNull Class _ProfileApplication = createClass(PivotPackage.Literals.PROFILE_APPLICATION);
		private final @NonNull Class _Property = createClass(PivotPackage.Literals.PROPERTY);
		private final @NonNull Class _PropertyCallExp = createClass(PivotPackage.Literals.PROPERTY_CALL_EXP);
		private final @NonNull Class _Pseudostate = createClass(PivotPackage.Literals.PSEUDOSTATE);
		private final @NonNull Class _RealLiteralExp = createClass(PivotPackage.Literals.REAL_LITERAL_EXP);
		private final @NonNull Class _ReferringElement = createClass(PivotPackage.Literals.REFERRING_ELEMENT);
		private final @NonNull Class _Region = createClass(PivotPackage.Literals.REGION);
		private final @NonNull Class _SelfType = createClass(PivotPackage.Literals.SELF_TYPE);
		private final @NonNull Class _SendSignalAction = createClass(PivotPackage.Literals.SEND_SIGNAL_ACTION);
		private final @NonNull Class _SequenceType = createClass(PivotPackage.Literals.SEQUENCE_TYPE);
		private final @NonNull Class _SetType = createClass(PivotPackage.Literals.SET_TYPE);
		private final @NonNull Class _ShadowExp = createClass(PivotPackage.Literals.SHADOW_EXP);
		private final @NonNull Class _ShadowPart = createClass(PivotPackage.Literals.SHADOW_PART);
		private final @NonNull Class _Signal = createClass(PivotPackage.Literals.SIGNAL);
		private final @NonNull Class _Slot = createClass(PivotPackage.Literals.SLOT);
		private final @NonNull Class _StandardLibrary = createClass(PivotPackage.Literals.STANDARD_LIBRARY);
		private final @NonNull Class _State = createClass(PivotPackage.Literals.STATE);
		private final @NonNull Class _StateExp = createClass(PivotPackage.Literals.STATE_EXP);
		private final @NonNull Class _StateMachine = createClass(PivotPackage.Literals.STATE_MACHINE);
		private final @NonNull Class _Stereotype = createClass(PivotPackage.Literals.STEREOTYPE);
		private final @NonNull Class _StereotypeExtender = createClass(PivotPackage.Literals.STEREOTYPE_EXTENDER);
		private final @NonNull Class _StringLiteralExp = createClass(PivotPackage.Literals.STRING_LITERAL_EXP);
		private final @NonNull Class _TemplateBinding = createClass(PivotPackage.Literals.TEMPLATE_BINDING);
		private final @NonNull Class _TemplateParameter = createClass(PivotPackage.Literals.TEMPLATE_PARAMETER);
		private final @NonNull Class _TemplateParameterSubstitution = createClass(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION);
		private final @NonNull Class _TemplateSignature = createClass(PivotPackage.Literals.TEMPLATE_SIGNATURE);
		private final @NonNull Class _TemplateableElement = createClass(PivotPackage.Literals.TEMPLATEABLE_ELEMENT);
		private final @NonNull DataType _Throwable = createDataType(PivotPackage.Literals.THROWABLE);
		private final @NonNull Class _Transition = createClass(PivotPackage.Literals.TRANSITION);
		private final @NonNull Class _Trigger = createClass(PivotPackage.Literals.TRIGGER);
		private final @NonNull Class _TupleLiteralExp = createClass(PivotPackage.Literals.TUPLE_LITERAL_EXP);
		private final @NonNull Class _TupleLiteralPart = createClass(PivotPackage.Literals.TUPLE_LITERAL_PART);
		private final @NonNull Class _TupleType = createClass(PivotPackage.Literals.TUPLE_TYPE);
		private final @NonNull Class _Type = createClass(PivotPackage.Literals.TYPE);
		private final @NonNull Class _TypeExp = createClass(PivotPackage.Literals.TYPE_EXP);
		private final @NonNull Class _TypedElement = createClass(PivotPackage.Literals.TYPED_ELEMENT);
		private final @NonNull Class _UnlimitedNaturalLiteralExp = createClass(PivotPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP);
		private final @NonNull Class _UnspecifiedValueExp = createClass(PivotPackage.Literals.UNSPECIFIED_VALUE_EXP);
		private final @NonNull Class _ValueSpecification = createClass(PivotPackage.Literals.VALUE_SPECIFICATION);
		private final @NonNull Class _Variable = createClass(PivotPackage.Literals.VARIABLE);
		private final @NonNull Class _VariableDeclaration = createClass(PivotPackage.Literals.VARIABLE_DECLARATION);
		private final @NonNull Class _VariableExp = createClass(PivotPackage.Literals.VARIABLE_EXP);
		private final @NonNull Class _Vertex = createClass(PivotPackage.Literals.VERTEX);
		private final @NonNull Class _Visitable = createClass(PivotPackage.Literals.VISITABLE);
		private final @NonNull Class _VoidType = createClass(PivotPackage.Literals.VOID_TYPE);
		private final @NonNull Class _WildcardType = createClass(PivotPackage.Literals.WILDCARD_TYPE);
		
		private final @NonNull Enumeration _AssociativityKind = createEnumeration(PivotPackage.Literals.ASSOCIATIVITY_KIND);
		private final @NonNull EnumerationLiteral el__AssociativityKind_left = createEnumerationLiteral(PivotPackage.Literals.ASSOCIATIVITY_KIND.getEEnumLiteral(AssociativityKind.LEFT_VALUE));
		private final @NonNull EnumerationLiteral el__AssociativityKind_right = createEnumerationLiteral(PivotPackage.Literals.ASSOCIATIVITY_KIND.getEEnumLiteral(AssociativityKind.RIGHT_VALUE));
		private final @NonNull Enumeration _CollectionKind = createEnumeration(PivotPackage.Literals.COLLECTION_KIND);
		private final @NonNull EnumerationLiteral el__CollectionKind_Collection = createEnumerationLiteral(PivotPackage.Literals.COLLECTION_KIND.getEEnumLiteral(CollectionKind.COLLECTION_VALUE));
		private final @NonNull EnumerationLiteral el__CollectionKind_Set = createEnumerationLiteral(PivotPackage.Literals.COLLECTION_KIND.getEEnumLiteral(CollectionKind.SET_VALUE));
		private final @NonNull EnumerationLiteral el__CollectionKind_OrderedSet = createEnumerationLiteral(PivotPackage.Literals.COLLECTION_KIND.getEEnumLiteral(CollectionKind.ORDERED_SET_VALUE));
		private final @NonNull EnumerationLiteral el__CollectionKind_Bag = createEnumerationLiteral(PivotPackage.Literals.COLLECTION_KIND.getEEnumLiteral(CollectionKind.BAG_VALUE));
		private final @NonNull EnumerationLiteral el__CollectionKind_Sequence = createEnumerationLiteral(PivotPackage.Literals.COLLECTION_KIND.getEEnumLiteral(CollectionKind.SEQUENCE_VALUE));
		private final @NonNull Enumeration _PseudostateKind = createEnumeration(PivotPackage.Literals.PSEUDOSTATE_KIND);
		private final @NonNull EnumerationLiteral el__PseudostateKind_initial = createEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral(PseudostateKind.INITIAL_VALUE));
		private final @NonNull EnumerationLiteral el__PseudostateKind_deepHistory = createEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral(PseudostateKind.DEEP_HISTORY_VALUE));
		private final @NonNull EnumerationLiteral el__PseudostateKind_shallowHistory = createEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral(PseudostateKind.SHALLOW_HISTORY_VALUE));
		private final @NonNull EnumerationLiteral el__PseudostateKind_join = createEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral(PseudostateKind.JOIN_VALUE));
		private final @NonNull EnumerationLiteral el__PseudostateKind_fork = createEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral(PseudostateKind.FORK_VALUE));
		private final @NonNull EnumerationLiteral el__PseudostateKind_junction = createEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral(PseudostateKind.JUNCTION_VALUE));
		private final @NonNull EnumerationLiteral el__PseudostateKind_choice = createEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral(PseudostateKind.CHOICE_VALUE));
		private final @NonNull EnumerationLiteral el__PseudostateKind_entryPoint = createEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral(PseudostateKind.ENTRY_POINT_VALUE));
		private final @NonNull EnumerationLiteral el__PseudostateKind_exitPoint = createEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral(PseudostateKind.EXIT_POINT_VALUE));
		private final @NonNull EnumerationLiteral el__PseudostateKind_terminate = createEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral(PseudostateKind.TERMINATE_VALUE));
		private final @NonNull Enumeration _TransitionKind = createEnumeration(PivotPackage.Literals.TRANSITION_KIND);
		private final @NonNull EnumerationLiteral el__TransitionKind_internal = createEnumerationLiteral(PivotPackage.Literals.TRANSITION_KIND.getEEnumLiteral(TransitionKind.INTERNAL_VALUE));
		private final @NonNull EnumerationLiteral el__TransitionKind_local = createEnumerationLiteral(PivotPackage.Literals.TRANSITION_KIND.getEEnumLiteral(TransitionKind.LOCAL_VALUE));
		private final @NonNull EnumerationLiteral el__TransitionKind_external = createEnumerationLiteral(PivotPackage.Literals.TRANSITION_KIND.getEEnumLiteral(TransitionKind.EXTERNAL_VALUE));
		
		private final @NonNull BagType _Bag_Annotation = createBagType(_Bag, _Annotation);
		private final @NonNull BagType _Bag_AssociationClassCallExp = createBagType(_Bag, _AssociationClassCallExp);
		private final @NonNull BagType _Bag_CallOperationAction = createBagType(_Bag, _CallOperationAction);
		private final @NonNull BagType _Bag_Class = createBagType(_Bag, _Class);
		private final @NonNull BagType _Bag_CollectionType = createBagType(_Bag, _CollectionType);
		private final @NonNull BagType _Bag_CompleteClass = createBagType(_Bag, _CompleteClass);
		private final @NonNull BagType _Bag_CompleteModel = createBagType(_Bag, _CompleteModel);
		private final @NonNull BagType _Bag_CompletePackage = createBagType(_Bag, _CompletePackage);
		private final @NonNull BagType _Bag_ConnectionPointReference = createBagType(_Bag, _ConnectionPointReference);
		private final @NonNull BagType _Bag_Constraint = createBagType(_Bag, _Constraint);
		private final @NonNull BagType _Bag_DataType = createBagType(_Bag, _DataType);
		private final @NonNull BagType _Bag_DynamicElement = createBagType(_Bag, _DynamicElement);
		private final @NonNull BagType _Bag_DynamicProperty = createBagType(_Bag, _DynamicProperty);
		private final @NonNull BagType _Bag_ElementExtension = createBagType(_Bag, _ElementExtension);
		private final @NonNull BagType _Bag_EnumLiteralExp = createBagType(_Bag, _EnumLiteralExp);
		private final @NonNull BagType _Bag_Import = createBagType(_Bag, _Import);
		private final @NonNull BagType _Bag_InstanceSpecification = createBagType(_Bag, _InstanceSpecification);
		private final @NonNull BagType _Bag_LambdaType = createBagType(_Bag, _LambdaType);
		private final @NonNull BagType _Bag_LoopExp = createBagType(_Bag, _LoopExp);
		private final @NonNull BagType _Bag_MapType = createBagType(_Bag, _MapType);
		private final @NonNull BagType _Bag_MessageType = createBagType(_Bag, _MessageType);
		private final @NonNull BagType _Bag_NavigationCallExp = createBagType(_Bag, _NavigationCallExp);
		private final @NonNull BagType _Bag_Operation = createBagType(_Bag, _Operation);
		private final @NonNull BagType _Bag_OperationCallExp = createBagType(_Bag, _OperationCallExp);
		private final @NonNull BagType _Bag_OppositePropertyCallExp = createBagType(_Bag, _OppositePropertyCallExp);
		private final @NonNull BagType _Bag_Package = createBagType(_Bag, _Package);
		private final @NonNull BagType _Bag_PrimitiveType = createBagType(_Bag, _PrimitiveType);
		private final @NonNull BagType _Bag_Property = createBagType(_Bag, _Property);
		private final @NonNull BagType _Bag_PropertyCallExp = createBagType(_Bag, _PropertyCallExp);
		private final @NonNull BagType _Bag_Region = createBagType(_Bag, _Region);
		private final @NonNull BagType _Bag_SendSignalAction = createBagType(_Bag, _SendSignalAction);
		private final @NonNull BagType _Bag_ShadowPart = createBagType(_Bag, _ShadowPart);
		private final @NonNull BagType _Bag_Slot = createBagType(_Bag, _Slot);
		private final @NonNull BagType _Bag_State = createBagType(_Bag, _State);
		private final @NonNull BagType _Bag_StateExp = createBagType(_Bag, _StateExp);
		private final @NonNull BagType _Bag_StateMachine = createBagType(_Bag, _StateMachine);
		private final @NonNull BagType _Bag_TemplateBinding = createBagType(_Bag, _TemplateBinding);
		private final @NonNull BagType _Bag_TemplateParameter = createBagType(_Bag, _TemplateParameter);
		private final @NonNull BagType _Bag_TemplateParameterSubstitution = createBagType(_Bag, _TemplateParameterSubstitution);
		private final @NonNull BagType _Bag_TypeExp = createBagType(_Bag, _TypeExp);
		private final @NonNull BagType _Bag_TypedElement = createBagType(_Bag, _TypedElement);
		private final @NonNull BagType _Bag_Variable = createBagType(_Bag, _Variable);
		private final @NonNull BagType _Bag_VariableExp = createBagType(_Bag, _VariableExp);
		private final @NonNull BagType _Bag_WildcardType = createBagType(_Bag, _WildcardType);
		private final @NonNull CollectionType _Collection_Annotation = createCollectionType(_Collection, _Annotation);
		private final @NonNull CollectionType _Collection_AssociationClassCallExp = createCollectionType(_Collection, _AssociationClassCallExp);
		private final @NonNull CollectionType _Collection_Behavior = createCollectionType(_Collection, _Behavior);
		private final @NonNull CollectionType _Collection_CallOperationAction = createCollectionType(_Collection, _CallOperationAction);
		private final @NonNull CollectionType _Collection_Class = createCollectionType(_Collection, _Class);
		private final @NonNull CollectionType _Collection_CollectionLiteralPart = createCollectionType(_Collection, _CollectionLiteralPart);
		private final @NonNull CollectionType _Collection_CollectionType = createCollectionType(_Collection, _CollectionType);
		private final @NonNull CollectionType _Collection_Comment = createCollectionType(_Collection, _Comment);
		private final @NonNull CollectionType _Collection_CompleteClass = createCollectionType(_Collection, _CompleteClass);
		private final @NonNull CollectionType _Collection_CompleteModel = createCollectionType(_Collection, _CompleteModel);
		private final @NonNull CollectionType _Collection_CompletePackage = createCollectionType(_Collection, _CompletePackage);
		private final @NonNull CollectionType _Collection_ConnectionPointReference = createCollectionType(_Collection, _ConnectionPointReference);
		private final @NonNull CollectionType _Collection_Constraint = createCollectionType(_Collection, _Constraint);
		private final @NonNull CollectionType _Collection_DataType = createCollectionType(_Collection, _DataType);
		private final @NonNull CollectionType _Collection_Detail = createCollectionType(_Collection, _Detail);
		private final @NonNull CollectionType _Collection_DynamicElement = createCollectionType(_Collection, _DynamicElement);
		private final @NonNull CollectionType _Collection_DynamicProperty = createCollectionType(_Collection, _DynamicProperty);
		private final @NonNull CollectionType _Collection_Element = createCollectionType(_Collection, _Element);
		private final @NonNull CollectionType _Collection_ElementExtension = createCollectionType(_Collection, _ElementExtension);
		private final @NonNull CollectionType _Collection_EnumLiteralExp = createCollectionType(_Collection, _EnumLiteralExp);
		private final @NonNull CollectionType _Collection_EnumerationLiteral = createCollectionType(_Collection, _EnumerationLiteral);
		private final @NonNull CollectionType _Collection_Import = createCollectionType(_Collection, _Import);
		private final @NonNull CollectionType _Collection_InstanceSpecification = createCollectionType(_Collection, _InstanceSpecification);
		private final @NonNull CollectionType _Collection_LambdaType = createCollectionType(_Collection, _LambdaType);
		private final @NonNull CollectionType _Collection_LoopExp = createCollectionType(_Collection, _LoopExp);
		private final @NonNull CollectionType _Collection_MapLiteralPart = createCollectionType(_Collection, _MapLiteralPart);
		private final @NonNull CollectionType _Collection_MapType = createCollectionType(_Collection, _MapType);
		private final @NonNull CollectionType _Collection_MessageType = createCollectionType(_Collection, _MessageType);
		private final @NonNull CollectionType _Collection_Model = createCollectionType(_Collection, _Model);
		private final @NonNull CollectionType _Collection_NavigationCallExp = createCollectionType(_Collection, _NavigationCallExp);
		private final @NonNull CollectionType _Collection_OCLExpression = createCollectionType(_Collection, _OCLExpression);
		private final @NonNull CollectionType _Collection_Operation = createCollectionType(_Collection, _Operation);
		private final @NonNull CollectionType _Collection_OperationCallExp = createCollectionType(_Collection, _OperationCallExp);
		private final @NonNull CollectionType _Collection_OppositePropertyCallExp = createCollectionType(_Collection, _OppositePropertyCallExp);
		private final @NonNull CollectionType _Collection_Package = createCollectionType(_Collection, _Package);
		private final @NonNull CollectionType _Collection_Parameter = createCollectionType(_Collection, _Parameter);
		private final @NonNull CollectionType _Collection_Precedence = createCollectionType(_Collection, _Precedence);
		private final @NonNull CollectionType _Collection_PrimitiveType = createCollectionType(_Collection, _PrimitiveType);
		private final @NonNull CollectionType _Collection_ProfileApplication = createCollectionType(_Collection, _ProfileApplication);
		private final @NonNull CollectionType _Collection_Property = createCollectionType(_Collection, _Property);
		private final @NonNull CollectionType _Collection_PropertyCallExp = createCollectionType(_Collection, _PropertyCallExp);
		private final @NonNull CollectionType _Collection_Pseudostate = createCollectionType(_Collection, _Pseudostate);
		private final @NonNull CollectionType _Collection_Region = createCollectionType(_Collection, _Region);
		private final @NonNull CollectionType _Collection_SendSignalAction = createCollectionType(_Collection, _SendSignalAction);
		private final @NonNull CollectionType _Collection_ShadowPart = createCollectionType(_Collection, _ShadowPart);
		private final @NonNull CollectionType _Collection_Slot = createCollectionType(_Collection, _Slot);
		private final @NonNull CollectionType _Collection_State = createCollectionType(_Collection, _State);
		private final @NonNull CollectionType _Collection_StateExp = createCollectionType(_Collection, _StateExp);
		private final @NonNull CollectionType _Collection_StateMachine = createCollectionType(_Collection, _StateMachine);
		private final @NonNull CollectionType _Collection_StereotypeExtender = createCollectionType(_Collection, _StereotypeExtender);
		private final @NonNull CollectionType _Collection_String = createCollectionType(_Collection, _String);
		private final @NonNull CollectionType _Collection_TemplateBinding = createCollectionType(_Collection, _TemplateBinding);
		private final @NonNull CollectionType _Collection_TemplateParameter = createCollectionType(_Collection, _TemplateParameter);
		private final @NonNull CollectionType _Collection_TemplateParameterSubstitution = createCollectionType(_Collection, _TemplateParameterSubstitution);
		private final @NonNull CollectionType _Collection_Transition = createCollectionType(_Collection, _Transition);
		private final @NonNull CollectionType _Collection_Trigger = createCollectionType(_Collection, _Trigger);
		private final @NonNull CollectionType _Collection_TupleLiteralPart = createCollectionType(_Collection, _TupleLiteralPart);
		private final @NonNull CollectionType _Collection_Type = createCollectionType(_Collection, _Type);
		private final @NonNull CollectionType _Collection_TypeExp = createCollectionType(_Collection, _TypeExp);
		private final @NonNull CollectionType _Collection_TypedElement = createCollectionType(_Collection, _TypedElement);
		private final @NonNull CollectionType _Collection_ValueSpecification = createCollectionType(_Collection, _ValueSpecification);
		private final @NonNull CollectionType _Collection_Variable = createCollectionType(_Collection, _Variable);
		private final @NonNull CollectionType _Collection_VariableExp = createCollectionType(_Collection, _VariableExp);
		private final @NonNull CollectionType _Collection_Vertex = createCollectionType(_Collection, _Vertex);
		private final @NonNull CollectionType _Collection_WildcardType = createCollectionType(_Collection, _WildcardType);
		private final @NonNull CollectionType _OrderedCollection_CollectionLiteralPart = createCollectionType(_OrderedCollection, _CollectionLiteralPart);
		private final @NonNull CollectionType _OrderedCollection_Detail = createCollectionType(_OrderedCollection, _Detail);
		private final @NonNull CollectionType _OrderedCollection_Element = createCollectionType(_OrderedCollection, _Element);
		private final @NonNull CollectionType _OrderedCollection_EnumerationLiteral = createCollectionType(_OrderedCollection, _EnumerationLiteral);
		private final @NonNull CollectionType _OrderedCollection_Import = createCollectionType(_OrderedCollection, _Import);
		private final @NonNull CollectionType _OrderedCollection_MapLiteralPart = createCollectionType(_OrderedCollection, _MapLiteralPart);
		private final @NonNull CollectionType _OrderedCollection_OCLExpression = createCollectionType(_OrderedCollection, _OCLExpression);
		private final @NonNull CollectionType _OrderedCollection_Operation = createCollectionType(_OrderedCollection, _Operation);
		private final @NonNull CollectionType _OrderedCollection_Parameter = createCollectionType(_OrderedCollection, _Parameter);
		private final @NonNull CollectionType _OrderedCollection_Precedence = createCollectionType(_OrderedCollection, _Precedence);
		private final @NonNull CollectionType _OrderedCollection_Property = createCollectionType(_OrderedCollection, _Property);
		private final @NonNull CollectionType _OrderedCollection_ShadowPart = createCollectionType(_OrderedCollection, _ShadowPart);
		private final @NonNull CollectionType _OrderedCollection_TemplateParameter = createCollectionType(_OrderedCollection, _TemplateParameter);
		private final @NonNull CollectionType _OrderedCollection_TupleLiteralPart = createCollectionType(_OrderedCollection, _TupleLiteralPart);
		private final @NonNull CollectionType _OrderedCollection_Type = createCollectionType(_OrderedCollection, _Type);
		private final @NonNull CollectionType _OrderedCollection_ValueSpecification = createCollectionType(_OrderedCollection, _ValueSpecification);
		private final @NonNull CollectionType _OrderedCollection_Variable = createCollectionType(_OrderedCollection, _Variable);
		private final @NonNull OrderedSetType _OrderedSet_CollectionLiteralPart = createOrderedSetType(_OrderedSet, _CollectionLiteralPart);
		private final @NonNull OrderedSetType _OrderedSet_Detail = createOrderedSetType(_OrderedSet, _Detail);
		private final @NonNull OrderedSetType _OrderedSet_Element = createOrderedSetType(_OrderedSet, _Element);
		private final @NonNull OrderedSetType _OrderedSet_EnumerationLiteral = createOrderedSetType(_OrderedSet, _EnumerationLiteral);
		private final @NonNull OrderedSetType _OrderedSet_Import = createOrderedSetType(_OrderedSet, _Import);
		private final @NonNull OrderedSetType _OrderedSet_MapLiteralPart = createOrderedSetType(_OrderedSet, _MapLiteralPart);
		private final @NonNull OrderedSetType _OrderedSet_OCLExpression = createOrderedSetType(_OrderedSet, _OCLExpression);
		private final @NonNull OrderedSetType _OrderedSet_Operation = createOrderedSetType(_OrderedSet, _Operation);
		private final @NonNull OrderedSetType _OrderedSet_Parameter = createOrderedSetType(_OrderedSet, _Parameter);
		private final @NonNull OrderedSetType _OrderedSet_Precedence = createOrderedSetType(_OrderedSet, _Precedence);
		private final @NonNull OrderedSetType _OrderedSet_Property = createOrderedSetType(_OrderedSet, _Property);
		private final @NonNull OrderedSetType _OrderedSet_ShadowPart = createOrderedSetType(_OrderedSet, _ShadowPart);
		private final @NonNull OrderedSetType _OrderedSet_TemplateParameter = createOrderedSetType(_OrderedSet, _TemplateParameter);
		private final @NonNull OrderedSetType _OrderedSet_TupleLiteralPart = createOrderedSetType(_OrderedSet, _TupleLiteralPart);
		private final @NonNull OrderedSetType _OrderedSet_ValueSpecification = createOrderedSetType(_OrderedSet, _ValueSpecification);
		private final @NonNull OrderedSetType _OrderedSet_Variable = createOrderedSetType(_OrderedSet, _Variable);
		private final @NonNull SequenceType _Sequence_Type = createSequenceType(_Sequence, _Type);
		private final @NonNull SetType _Set_Behavior = createSetType(_Set, _Behavior);
		private final @NonNull SetType _Set_Class = createSetType(_Set, _Class);
		private final @NonNull SetType _Set_Comment = createSetType(_Set, _Comment);
		private final @NonNull SetType _Set_CompleteClass = createSetType(_Set, _CompleteClass);
		private final @NonNull SetType _Set_CompletePackage = createSetType(_Set, _CompletePackage);
		private final @NonNull SetType _Set_ConnectionPointReference = createSetType(_Set, _ConnectionPointReference);
		private final @NonNull SetType _Set_Constraint = createSetType(_Set, _Constraint);
		private final @NonNull SetType _Set_DynamicProperty = createSetType(_Set, _DynamicProperty);
		private final @NonNull SetType _Set_Element = createSetType(_Set, _Element);
		private final @NonNull SetType _Set_ElementExtension = createSetType(_Set, _ElementExtension);
		private final @NonNull SetType _Set_InstanceSpecification = createSetType(_Set, _InstanceSpecification);
		private final @NonNull SetType _Set_Model = createSetType(_Set, _Model);
		private final @NonNull SetType _Set_Operation = createSetType(_Set, _Operation);
		private final @NonNull SetType _Set_Package = createSetType(_Set, _Package);
		private final @NonNull SetType _Set_ProfileApplication = createSetType(_Set, _ProfileApplication);
		private final @NonNull SetType _Set_Property = createSetType(_Set, _Property);
		private final @NonNull SetType _Set_Pseudostate = createSetType(_Set, _Pseudostate);
		private final @NonNull SetType _Set_Region = createSetType(_Set, _Region);
		private final @NonNull SetType _Set_Region_1 = createSetType(_Set, _Region);
		private final @NonNull SetType _Set_Slot = createSetType(_Set, _Slot);
		private final @NonNull SetType _Set_State = createSetType(_Set, _State);
		private final @NonNull SetType _Set_StateMachine = createSetType(_Set, _StateMachine);
		private final @NonNull SetType _Set_StereotypeExtender = createSetType(_Set, _StereotypeExtender);
		private final @NonNull SetType _Set_String = createSetType(_Set, _String);
		private final @NonNull SetType _Set_TemplateBinding = createSetType(_Set, _TemplateBinding);
		private final @NonNull SetType _Set_TemplateParameterSubstitution = createSetType(_Set, _TemplateParameterSubstitution);
		private final @NonNull SetType _Set_Transition = createSetType(_Set, _Transition);
		private final @NonNull SetType _Set_Trigger = createSetType(_Set, _Trigger);
		private final @NonNull SetType _Set_Type = createSetType(_Set, _Type);
		private final @NonNull SetType _Set_Vertex = createSetType(_Set, _Vertex);
		private final @NonNull CollectionType _UniqueCollection_Behavior = createCollectionType(_UniqueCollection, _Behavior);
		private final @NonNull CollectionType _UniqueCollection_Class = createCollectionType(_UniqueCollection, _Class);
		private final @NonNull CollectionType _UniqueCollection_CollectionLiteralPart = createCollectionType(_UniqueCollection, _CollectionLiteralPart);
		private final @NonNull CollectionType _UniqueCollection_Comment = createCollectionType(_UniqueCollection, _Comment);
		private final @NonNull CollectionType _UniqueCollection_CompleteClass = createCollectionType(_UniqueCollection, _CompleteClass);
		private final @NonNull CollectionType _UniqueCollection_CompletePackage = createCollectionType(_UniqueCollection, _CompletePackage);
		private final @NonNull CollectionType _UniqueCollection_ConnectionPointReference = createCollectionType(_UniqueCollection, _ConnectionPointReference);
		private final @NonNull CollectionType _UniqueCollection_Constraint = createCollectionType(_UniqueCollection, _Constraint);
		private final @NonNull CollectionType _UniqueCollection_Detail = createCollectionType(_UniqueCollection, _Detail);
		private final @NonNull CollectionType _UniqueCollection_DynamicProperty = createCollectionType(_UniqueCollection, _DynamicProperty);
		private final @NonNull CollectionType _UniqueCollection_Element = createCollectionType(_UniqueCollection, _Element);
		private final @NonNull CollectionType _UniqueCollection_ElementExtension = createCollectionType(_UniqueCollection, _ElementExtension);
		private final @NonNull CollectionType _UniqueCollection_EnumerationLiteral = createCollectionType(_UniqueCollection, _EnumerationLiteral);
		private final @NonNull CollectionType _UniqueCollection_Import = createCollectionType(_UniqueCollection, _Import);
		private final @NonNull CollectionType _UniqueCollection_InstanceSpecification = createCollectionType(_UniqueCollection, _InstanceSpecification);
		private final @NonNull CollectionType _UniqueCollection_MapLiteralPart = createCollectionType(_UniqueCollection, _MapLiteralPart);
		private final @NonNull CollectionType _UniqueCollection_Model = createCollectionType(_UniqueCollection, _Model);
		private final @NonNull CollectionType _UniqueCollection_OCLExpression = createCollectionType(_UniqueCollection, _OCLExpression);
		private final @NonNull CollectionType _UniqueCollection_Operation = createCollectionType(_UniqueCollection, _Operation);
		private final @NonNull CollectionType _UniqueCollection_Package = createCollectionType(_UniqueCollection, _Package);
		private final @NonNull CollectionType _UniqueCollection_Parameter = createCollectionType(_UniqueCollection, _Parameter);
		private final @NonNull CollectionType _UniqueCollection_Precedence = createCollectionType(_UniqueCollection, _Precedence);
		private final @NonNull CollectionType _UniqueCollection_ProfileApplication = createCollectionType(_UniqueCollection, _ProfileApplication);
		private final @NonNull CollectionType _UniqueCollection_Property = createCollectionType(_UniqueCollection, _Property);
		private final @NonNull CollectionType _UniqueCollection_Pseudostate = createCollectionType(_UniqueCollection, _Pseudostate);
		private final @NonNull CollectionType _UniqueCollection_Region = createCollectionType(_UniqueCollection, _Region);
		private final @NonNull CollectionType _UniqueCollection_ShadowPart = createCollectionType(_UniqueCollection, _ShadowPart);
		private final @NonNull CollectionType _UniqueCollection_Slot = createCollectionType(_UniqueCollection, _Slot);
		private final @NonNull CollectionType _UniqueCollection_State = createCollectionType(_UniqueCollection, _State);
		private final @NonNull CollectionType _UniqueCollection_StateMachine = createCollectionType(_UniqueCollection, _StateMachine);
		private final @NonNull CollectionType _UniqueCollection_StereotypeExtender = createCollectionType(_UniqueCollection, _StereotypeExtender);
		private final @NonNull CollectionType _UniqueCollection_String = createCollectionType(_UniqueCollection, _String);
		private final @NonNull CollectionType _UniqueCollection_TemplateBinding = createCollectionType(_UniqueCollection, _TemplateBinding);
		private final @NonNull CollectionType _UniqueCollection_TemplateParameter = createCollectionType(_UniqueCollection, _TemplateParameter);
		private final @NonNull CollectionType _UniqueCollection_TemplateParameterSubstitution = createCollectionType(_UniqueCollection, _TemplateParameterSubstitution);
		private final @NonNull CollectionType _UniqueCollection_Transition = createCollectionType(_UniqueCollection, _Transition);
		private final @NonNull CollectionType _UniqueCollection_Trigger = createCollectionType(_UniqueCollection, _Trigger);
		private final @NonNull CollectionType _UniqueCollection_TupleLiteralPart = createCollectionType(_UniqueCollection, _TupleLiteralPart);
		private final @NonNull CollectionType _UniqueCollection_Type = createCollectionType(_UniqueCollection, _Type);
		private final @NonNull CollectionType _UniqueCollection_ValueSpecification = createCollectionType(_UniqueCollection, _ValueSpecification);
		private final @NonNull CollectionType _UniqueCollection_Variable = createCollectionType(_UniqueCollection, _Variable);
		private final @NonNull CollectionType _UniqueCollection_Vertex = createCollectionType(_UniqueCollection, _Vertex);
		
		private void installClassTypes() {
			List<Class> ownedClasses;
			List<Class> superClasses;
			Class type;
		
			ownedClasses = pivot.getOwnedClasses();
			ownedClasses.add(type = _Annotation);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _AnyType);
			superClasses = type.getSuperClasses();
			superClasses.add(_Class);
			ownedClasses.add(type = _AssociationClass);
			superClasses = type.getSuperClasses();
			superClasses.add(_Class);
			ownedClasses.add(type = _AssociationClassCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_NavigationCallExp);
			ownedClasses.add(type = _BagType);
			superClasses = type.getSuperClasses();
			superClasses.add(_CollectionType);
			ownedClasses.add(type = _Behavior);
			superClasses = type.getSuperClasses();
			superClasses.add(_Class);
			ownedClasses.add(type = _BooleanLiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_PrimitiveLiteralExp);
			ownedClasses.add(type = _CallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OCLExpression);
			ownedClasses.add(type = _CallOperationAction);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _Class);
			superClasses = type.getSuperClasses();
			superClasses.add(_Type);
			superClasses.add(_Namespace);
			superClasses.add(_TemplateableElement);
			ownedClasses.add(type = _CollectionItem);
			superClasses = type.getSuperClasses();
			superClasses.add(_CollectionLiteralPart);
			ownedClasses.add(type = _CollectionLiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_LiteralExp);
			ownedClasses.add(type = _CollectionLiteralPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_TypedElement);
			ownedClasses.add(type = _CollectionRange);
			superClasses = type.getSuperClasses();
			superClasses.add(_CollectionLiteralPart);
			ownedClasses.add(type = _CollectionType);
			superClasses = type.getSuperClasses();
			superClasses.add(_DataType);
			ownedClasses.add(type = _Comment);
			superClasses = type.getSuperClasses();
			superClasses.add(_Element);
			ownedClasses.add(type = _CompleteClass);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _CompleteEnvironment);
			superClasses = type.getSuperClasses();
			superClasses.add(_Element);
			ownedClasses.add(type = _CompleteModel);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _CompletePackage);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _ConnectionPointReference);
			superClasses = type.getSuperClasses();
			superClasses.add(_Vertex);
			ownedClasses.add(type = _Constraint);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _DataType);
			superClasses = type.getSuperClasses();
			superClasses.add(_Class);
			ownedClasses.add(type = _Detail);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _DynamicBehavior);
			superClasses = type.getSuperClasses();
			superClasses.add(_Behavior);
			superClasses.add(_DynamicType);
			ownedClasses.add(type = _DynamicElement);
			superClasses = type.getSuperClasses();
			superClasses.add(_Element);
			ownedClasses.add(type = _DynamicProperty);
			superClasses = type.getSuperClasses();
			superClasses.add(_Element);
			ownedClasses.add(type = _DynamicType);
			superClasses = type.getSuperClasses();
			superClasses.add(_Class);
			superClasses.add(_DynamicElement);
			ownedClasses.add(type = _DynamicValueSpecification);
			superClasses = type.getSuperClasses();
			superClasses.add(_ValueSpecification);
			ownedClasses.add(type = _Element);
			superClasses = type.getSuperClasses();
			superClasses.add(_Visitable);
			ownedClasses.add(type = _ElementExtension);
			superClasses = type.getSuperClasses();
			superClasses.add(_Class);
			ownedClasses.add(type = _EnumLiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_LiteralExp);
			ownedClasses.add(type = _Enumeration);
			superClasses = type.getSuperClasses();
			superClasses.add(_DataType);
			ownedClasses.add(type = _EnumerationLiteral);
			superClasses = type.getSuperClasses();
			superClasses.add(_InstanceSpecification);
			ownedClasses.add(type = _ExpressionInOCL);
			superClasses = type.getSuperClasses();
			superClasses.add(_LanguageExpression);
			ownedClasses.add(type = _Feature);
			superClasses = type.getSuperClasses();
			superClasses.add(_TypedElement);
			ownedClasses.add(type = _FeatureCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_CallExp);
			ownedClasses.add(type = _FinalState);
			superClasses = type.getSuperClasses();
			superClasses.add(_State);
			ownedClasses.add(type = _IfExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OCLExpression);
			ownedClasses.add(type = _Import);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _InstanceSpecification);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _IntegerLiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_NumericLiteralExp);
			ownedClasses.add(type = _InvalidLiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_LiteralExp);
			ownedClasses.add(type = _InvalidType);
			superClasses = type.getSuperClasses();
			superClasses.add(_Class);
			ownedClasses.add(type = _IterateExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_LoopExp);
			superClasses.add(_ReferringElement);
			ownedClasses.add(type = _Iteration);
			superClasses = type.getSuperClasses();
			superClasses.add(_Operation);
			ownedClasses.add(type = _IteratorExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_LoopExp);
			superClasses.add(_ReferringElement);
			ownedClasses.add(type = _LambdaType);
			superClasses = type.getSuperClasses();
			superClasses.add(_DataType);
			ownedClasses.add(type = _LanguageExpression);
			superClasses = type.getSuperClasses();
			superClasses.add(_ValueSpecification);
			ownedClasses.add(type = _LetExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OCLExpression);
			ownedClasses.add(type = _Library);
			superClasses = type.getSuperClasses();
			superClasses.add(_Package);
			ownedClasses.add(type = _LibraryFeature);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _LiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OCLExpression);
			ownedClasses.add(type = _LoopExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_CallExp);
			ownedClasses.add(type = _MapLiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_LiteralExp);
			ownedClasses.add(type = _MapLiteralPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_Element);
			ownedClasses.add(type = _MapType);
			superClasses = type.getSuperClasses();
			superClasses.add(_DataType);
			ownedClasses.add(type = _MessageExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OCLExpression);
			ownedClasses.add(type = _MessageType);
			superClasses = type.getSuperClasses();
			superClasses.add(_Class);
			ownedClasses.add(type = _Model);
			superClasses = type.getSuperClasses();
			superClasses.add(_Namespace);
			ownedClasses.add(type = _MorePivotable);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Nameable);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _NamedElement);
			superClasses = type.getSuperClasses();
			superClasses.add(_Element);
			superClasses.add(_Nameable);
			ownedClasses.add(type = _Namespace);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _NavigationCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_FeatureCallExp);
			ownedClasses.add(type = _NullLiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_PrimitiveLiteralExp);
			ownedClasses.add(type = _NumericLiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_PrimitiveLiteralExp);
			ownedClasses.add(type = _OCLExpression);
			superClasses = type.getSuperClasses();
			superClasses.add(_TypedElement);
			ownedClasses.add(type = _Object);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Operation);
			superClasses = type.getSuperClasses();
			superClasses.add(_Feature);
			superClasses.add(_Namespace);
			superClasses.add(_TemplateableElement);
			ownedClasses.add(type = _OperationCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_FeatureCallExp);
			superClasses.add(_ReferringElement);
			ownedClasses.add(type = _OppositePropertyCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_NavigationCallExp);
			ownedClasses.add(type = _OrderedSetType);
			superClasses = type.getSuperClasses();
			superClasses.add(_CollectionType);
			ownedClasses.add(type = _OrphanCompletePackage);
			superClasses = type.getSuperClasses();
			superClasses.add(_CompletePackage);
			ownedClasses.add(type = _Package);
			superClasses = type.getSuperClasses();
			superClasses.add(_Namespace);
			ownedClasses.add(type = _Parameter);
			superClasses = type.getSuperClasses();
			superClasses.add(_VariableDeclaration);
			ownedClasses.add(type = _Pivotable);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Precedence);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _PrimitiveCompletePackage);
			superClasses = type.getSuperClasses();
			superClasses.add(_CompletePackage);
			ownedClasses.add(type = _PrimitiveLiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_LiteralExp);
			ownedClasses.add(type = _PrimitiveType);
			superClasses = type.getSuperClasses();
			superClasses.add(_DataType);
			ownedClasses.add(type = _Profile);
			superClasses = type.getSuperClasses();
			superClasses.add(_Package);
			ownedClasses.add(type = _ProfileApplication);
			superClasses = type.getSuperClasses();
			superClasses.add(_Element);
			ownedClasses.add(type = _Property);
			superClasses = type.getSuperClasses();
			superClasses.add(_Feature);
			ownedClasses.add(type = _PropertyCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_NavigationCallExp);
			superClasses.add(_ReferringElement);
			ownedClasses.add(type = _Pseudostate);
			superClasses = type.getSuperClasses();
			superClasses.add(_Vertex);
			ownedClasses.add(type = _RealLiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_NumericLiteralExp);
			ownedClasses.add(type = _ReferringElement);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Region);
			superClasses = type.getSuperClasses();
			superClasses.add(_Namespace);
			ownedClasses.add(type = _SelfType);
			superClasses = type.getSuperClasses();
			superClasses.add(_Class);
			ownedClasses.add(type = _SendSignalAction);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _SequenceType);
			superClasses = type.getSuperClasses();
			superClasses.add(_CollectionType);
			ownedClasses.add(type = _SetType);
			superClasses = type.getSuperClasses();
			superClasses.add(_CollectionType);
			ownedClasses.add(type = _ShadowExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OCLExpression);
			ownedClasses.add(type = _ShadowPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_TypedElement);
			ownedClasses.add(type = _Signal);
			superClasses = type.getSuperClasses();
			superClasses.add(_Class);
			ownedClasses.add(type = _Slot);
			superClasses = type.getSuperClasses();
			superClasses.add(_Element);
			ownedClasses.add(type = _StandardLibrary);
			superClasses = type.getSuperClasses();
			superClasses.add(_Element);
			ownedClasses.add(type = _State);
			superClasses = type.getSuperClasses();
			superClasses.add(_Namespace);
			superClasses.add(_Vertex);
			ownedClasses.add(type = _StateExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OCLExpression);
			ownedClasses.add(type = _StateMachine);
			superClasses = type.getSuperClasses();
			superClasses.add(_Behavior);
			ownedClasses.add(type = _Stereotype);
			superClasses = type.getSuperClasses();
			superClasses.add(_Class);
			ownedClasses.add(type = _StereotypeExtender);
			superClasses = type.getSuperClasses();
			superClasses.add(_Element);
			ownedClasses.add(type = _StringLiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_PrimitiveLiteralExp);
			ownedClasses.add(type = _TemplateBinding);
			superClasses = type.getSuperClasses();
			superClasses.add(_Element);
			ownedClasses.add(type = _TemplateParameter);
			superClasses = type.getSuperClasses();
			superClasses.add(_Type);
			ownedClasses.add(type = _TemplateParameterSubstitution);
			superClasses = type.getSuperClasses();
			superClasses.add(_Element);
			ownedClasses.add(type = _TemplateSignature);
			superClasses = type.getSuperClasses();
			superClasses.add(_Element);
			ownedClasses.add(type = _TemplateableElement);
			superClasses = type.getSuperClasses();
			superClasses.add(_Element);
			ownedClasses.add(type = _Throwable);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Transition);
			superClasses = type.getSuperClasses();
			superClasses.add(_Namespace);
			ownedClasses.add(type = _Trigger);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _TupleLiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_LiteralExp);
			ownedClasses.add(type = _TupleLiteralPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_VariableDeclaration);
			ownedClasses.add(type = _TupleType);
			superClasses = type.getSuperClasses();
			superClasses.add(_DataType);
			ownedClasses.add(type = _Type);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _TypeExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OCLExpression);
			superClasses.add(_ReferringElement);
			ownedClasses.add(type = _TypedElement);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _UnlimitedNaturalLiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_NumericLiteralExp);
			ownedClasses.add(type = _UnspecifiedValueExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OCLExpression);
			ownedClasses.add(type = _ValueSpecification);
			superClasses = type.getSuperClasses();
			superClasses.add(_TypedElement);
			ownedClasses.add(type = _Variable);
			superClasses = type.getSuperClasses();
			superClasses.add(_VariableDeclaration);
			ownedClasses.add(type = _VariableDeclaration);
			superClasses = type.getSuperClasses();
			superClasses.add(_TypedElement);
			ownedClasses.add(type = _VariableExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OCLExpression);
			superClasses.add(_ReferringElement);
			ownedClasses.add(type = _Vertex);
			superClasses = type.getSuperClasses();
			superClasses.add(_NamedElement);
			ownedClasses.add(type = _Visitable);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _VoidType);
			superClasses = type.getSuperClasses();
			superClasses.add(_Class);
			ownedClasses.add(type = _WildcardType);
			superClasses = type.getSuperClasses();
			superClasses.add(_Class);
		}
		
		private void installEnumerations() {
			List<Class> ownedClasses;
			Enumeration type;
			List<EnumerationLiteral> enumerationLiterals;
		
			ownedClasses = pivot.getOwnedClasses();
			ownedClasses.add(type = _AssociativityKind);
			enumerationLiterals = type.getOwnedLiterals();
			enumerationLiterals.add(el__AssociativityKind_left);
			enumerationLiterals.add(el__AssociativityKind_right);
			type.getSuperClasses().add(_Enumeration);
			ownedClasses.add(type = _CollectionKind);
			enumerationLiterals = type.getOwnedLiterals();
			enumerationLiterals.add(el__CollectionKind_Collection);
			enumerationLiterals.add(el__CollectionKind_Set);
			enumerationLiterals.add(el__CollectionKind_OrderedSet);
			enumerationLiterals.add(el__CollectionKind_Bag);
			enumerationLiterals.add(el__CollectionKind_Sequence);
			type.getSuperClasses().add(_Enumeration);
			ownedClasses.add(type = _PseudostateKind);
			enumerationLiterals = type.getOwnedLiterals();
			enumerationLiterals.add(el__PseudostateKind_initial);
			enumerationLiterals.add(el__PseudostateKind_deepHistory);
			enumerationLiterals.add(el__PseudostateKind_shallowHistory);
			enumerationLiterals.add(el__PseudostateKind_join);
			enumerationLiterals.add(el__PseudostateKind_fork);
			enumerationLiterals.add(el__PseudostateKind_junction);
			enumerationLiterals.add(el__PseudostateKind_choice);
			enumerationLiterals.add(el__PseudostateKind_entryPoint);
			enumerationLiterals.add(el__PseudostateKind_exitPoint);
			enumerationLiterals.add(el__PseudostateKind_terminate);
			type.getSuperClasses().add(_Enumeration);
			ownedClasses.add(type = _TransitionKind);
			enumerationLiterals = type.getOwnedLiterals();
			enumerationLiterals.add(el__TransitionKind_internal);
			enumerationLiterals.add(el__TransitionKind_local);
			enumerationLiterals.add(el__TransitionKind_external);
			type.getSuperClasses().add(_Enumeration);
		}
		
		private void installCollectionTypes() {
			List<Class> ownedClasses;
			List<Class> superClasses;
			CollectionType type;
		
			ownedClasses = orphanage.getOwnedClasses();
			ownedClasses.add(type = _Bag_Annotation);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Annotation);
			ownedClasses.add(type = _Bag_AssociationClassCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_AssociationClassCallExp);
			ownedClasses.add(type = _Bag_CallOperationAction);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_CallOperationAction);
			ownedClasses.add(type = _Bag_Class);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Class);
			ownedClasses.add(type = _Bag_CollectionType);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_CollectionType);
			ownedClasses.add(type = _Bag_CompleteClass);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_CompleteClass);
			ownedClasses.add(type = _Bag_CompleteModel);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_CompleteModel);
			ownedClasses.add(type = _Bag_CompletePackage);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_CompletePackage);
			ownedClasses.add(type = _Bag_ConnectionPointReference);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_ConnectionPointReference);
			ownedClasses.add(type = _Bag_Constraint);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Constraint);
			ownedClasses.add(type = _Bag_DataType);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_DataType);
			ownedClasses.add(type = _Bag_DynamicElement);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_DynamicElement);
			ownedClasses.add(type = _Bag_DynamicProperty);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_DynamicProperty);
			ownedClasses.add(type = _Bag_ElementExtension);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_ElementExtension);
			ownedClasses.add(type = _Bag_EnumLiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_EnumLiteralExp);
			ownedClasses.add(type = _Bag_Import);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Import);
			ownedClasses.add(type = _Bag_InstanceSpecification);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_InstanceSpecification);
			ownedClasses.add(type = _Bag_LambdaType);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_LambdaType);
			ownedClasses.add(type = _Bag_LoopExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_LoopExp);
			ownedClasses.add(type = _Bag_MapType);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_MapType);
			ownedClasses.add(type = _Bag_MessageType);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_MessageType);
			ownedClasses.add(type = _Bag_NavigationCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_NavigationCallExp);
			ownedClasses.add(type = _Bag_Operation);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Operation);
			ownedClasses.add(type = _Bag_OperationCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OperationCallExp);
			ownedClasses.add(type = _Bag_OppositePropertyCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OppositePropertyCallExp);
			ownedClasses.add(type = _Bag_Package);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Package);
			ownedClasses.add(type = _Bag_PrimitiveType);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_PrimitiveType);
			ownedClasses.add(type = _Bag_Property);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Property);
			ownedClasses.add(type = _Bag_PropertyCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_PropertyCallExp);
			ownedClasses.add(type = _Bag_Region);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Region);
			ownedClasses.add(type = _Bag_SendSignalAction);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_SendSignalAction);
			ownedClasses.add(type = _Bag_ShadowPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_ShadowPart);
			ownedClasses.add(type = _Bag_Slot);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Slot);
			ownedClasses.add(type = _Bag_State);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_State);
			ownedClasses.add(type = _Bag_StateExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_StateExp);
			ownedClasses.add(type = _Bag_StateMachine);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_StateMachine);
			ownedClasses.add(type = _Bag_TemplateBinding);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_TemplateBinding);
			ownedClasses.add(type = _Bag_TemplateParameter);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_TemplateParameter);
			ownedClasses.add(type = _Bag_TemplateParameterSubstitution);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_TemplateParameterSubstitution);
			ownedClasses.add(type = _Bag_TypeExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_TypeExp);
			ownedClasses.add(type = _Bag_TypedElement);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_TypedElement);
			ownedClasses.add(type = _Bag_Variable);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Variable);
			ownedClasses.add(type = _Bag_VariableExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_VariableExp);
			ownedClasses.add(type = _Bag_WildcardType);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_WildcardType);
			ownedClasses.add(type = _Collection_Annotation);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_AssociationClassCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Behavior);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_CallOperationAction);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Class);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_CollectionLiteralPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_CollectionType);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Comment);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_CompleteClass);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_CompleteModel);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_CompletePackage);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_ConnectionPointReference);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Constraint);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_DataType);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Detail);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_DynamicElement);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_DynamicProperty);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Element);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_ElementExtension);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_EnumLiteralExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_EnumerationLiteral);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Import);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_InstanceSpecification);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_LambdaType);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_LoopExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_MapLiteralPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_MapType);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_MessageType);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Model);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_NavigationCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_OCLExpression);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Operation);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_OperationCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_OppositePropertyCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Package);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Parameter);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Precedence);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_PrimitiveType);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_ProfileApplication);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Property);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_PropertyCallExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Pseudostate);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Region);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_SendSignalAction);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_ShadowPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Slot);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_State);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_StateExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_StateMachine);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_StereotypeExtender);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_String);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_TemplateBinding);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_TemplateParameter);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_TemplateParameterSubstitution);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Transition);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Trigger);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_TupleLiteralPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Type);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_TypeExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_TypedElement);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_ValueSpecification);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Variable);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_VariableExp);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_Vertex);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _Collection_WildcardType);
			superClasses = type.getSuperClasses();
			superClasses.add(_OclElement);
			ownedClasses.add(type = _OrderedCollection_CollectionLiteralPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_CollectionLiteralPart);
			ownedClasses.add(type = _OrderedCollection_Detail);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Detail);
			ownedClasses.add(type = _OrderedCollection_Element);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Element);
			ownedClasses.add(type = _OrderedCollection_EnumerationLiteral);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_EnumerationLiteral);
			ownedClasses.add(type = _OrderedCollection_Import);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Import);
			ownedClasses.add(type = _OrderedCollection_MapLiteralPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_MapLiteralPart);
			ownedClasses.add(type = _OrderedCollection_OCLExpression);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OCLExpression);
			ownedClasses.add(type = _OrderedCollection_Operation);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Operation);
			ownedClasses.add(type = _OrderedCollection_Parameter);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Parameter);
			ownedClasses.add(type = _OrderedCollection_Precedence);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Precedence);
			ownedClasses.add(type = _OrderedCollection_Property);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Property);
			ownedClasses.add(type = _OrderedCollection_ShadowPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_ShadowPart);
			ownedClasses.add(type = _OrderedCollection_TemplateParameter);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_TemplateParameter);
			ownedClasses.add(type = _OrderedCollection_TupleLiteralPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_TupleLiteralPart);
			ownedClasses.add(type = _OrderedCollection_Type);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Type);
			ownedClasses.add(type = _OrderedCollection_ValueSpecification);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_ValueSpecification);
			ownedClasses.add(type = _OrderedCollection_Variable);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Variable);
			ownedClasses.add(type = _OrderedSet_CollectionLiteralPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_CollectionLiteralPart);
			superClasses.add(_UniqueCollection_CollectionLiteralPart);
			ownedClasses.add(type = _OrderedSet_Detail);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Detail);
			superClasses.add(_UniqueCollection_Detail);
			ownedClasses.add(type = _OrderedSet_Element);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Element);
			superClasses.add(_UniqueCollection_Element);
			ownedClasses.add(type = _OrderedSet_EnumerationLiteral);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_EnumerationLiteral);
			superClasses.add(_UniqueCollection_EnumerationLiteral);
			ownedClasses.add(type = _OrderedSet_Import);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Import);
			superClasses.add(_UniqueCollection_Import);
			ownedClasses.add(type = _OrderedSet_MapLiteralPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_MapLiteralPart);
			superClasses.add(_UniqueCollection_MapLiteralPart);
			ownedClasses.add(type = _OrderedSet_OCLExpression);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_OCLExpression);
			superClasses.add(_UniqueCollection_OCLExpression);
			ownedClasses.add(type = _OrderedSet_Operation);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Operation);
			superClasses.add(_UniqueCollection_Operation);
			ownedClasses.add(type = _OrderedSet_Parameter);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Parameter);
			superClasses.add(_UniqueCollection_Parameter);
			ownedClasses.add(type = _OrderedSet_Precedence);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Precedence);
			superClasses.add(_UniqueCollection_Precedence);
			ownedClasses.add(type = _OrderedSet_Property);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Property);
			superClasses.add(_UniqueCollection_Property);
			ownedClasses.add(type = _OrderedSet_ShadowPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_ShadowPart);
			superClasses.add(_UniqueCollection_ShadowPart);
			ownedClasses.add(type = _OrderedSet_TemplateParameter);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_TemplateParameter);
			superClasses.add(_UniqueCollection_TemplateParameter);
			ownedClasses.add(type = _OrderedSet_TupleLiteralPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_TupleLiteralPart);
			superClasses.add(_UniqueCollection_TupleLiteralPart);
			ownedClasses.add(type = _OrderedSet_ValueSpecification);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_ValueSpecification);
			superClasses.add(_UniqueCollection_ValueSpecification);
			ownedClasses.add(type = _OrderedSet_Variable);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Variable);
			superClasses.add(_UniqueCollection_Variable);
			ownedClasses.add(type = _Sequence_Type);
			superClasses = type.getSuperClasses();
			superClasses.add(_OrderedCollection_Type);
			ownedClasses.add(type = _Set_Behavior);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Behavior);
			ownedClasses.add(type = _Set_Class);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Class);
			ownedClasses.add(type = _Set_Comment);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Comment);
			ownedClasses.add(type = _Set_CompleteClass);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_CompleteClass);
			ownedClasses.add(type = _Set_CompletePackage);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_CompletePackage);
			ownedClasses.add(type = _Set_ConnectionPointReference);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_ConnectionPointReference);
			ownedClasses.add(type = _Set_Constraint);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Constraint);
			ownedClasses.add(type = _Set_DynamicProperty);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_DynamicProperty);
			ownedClasses.add(type = _Set_Element);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Element);
			ownedClasses.add(type = _Set_ElementExtension);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_ElementExtension);
			ownedClasses.add(type = _Set_InstanceSpecification);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_InstanceSpecification);
			ownedClasses.add(type = _Set_Model);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Model);
			ownedClasses.add(type = _Set_Operation);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Operation);
			ownedClasses.add(type = _Set_Package);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Package);
			ownedClasses.add(type = _Set_ProfileApplication);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_ProfileApplication);
			ownedClasses.add(type = _Set_Property);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Property);
			ownedClasses.add(type = _Set_Pseudostate);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Pseudostate);
			ownedClasses.add(type = _Set_Region);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Region);
			ownedClasses.add(type = _Set_Region_1);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Region);
			ownedClasses.add(type = _Set_Slot);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Slot);
			ownedClasses.add(type = _Set_State);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_State);
			ownedClasses.add(type = _Set_StateMachine);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_StateMachine);
			ownedClasses.add(type = _Set_StereotypeExtender);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_StereotypeExtender);
			ownedClasses.add(type = _Set_String);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_String);
			ownedClasses.add(type = _Set_TemplateBinding);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_TemplateBinding);
			ownedClasses.add(type = _Set_TemplateParameterSubstitution);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_TemplateParameterSubstitution);
			ownedClasses.add(type = _Set_Transition);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Transition);
			ownedClasses.add(type = _Set_Trigger);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Trigger);
			ownedClasses.add(type = _Set_Type);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Type);
			ownedClasses.add(type = _Set_Vertex);
			superClasses = type.getSuperClasses();
			superClasses.add(_UniqueCollection_Vertex);
			ownedClasses.add(type = _UniqueCollection_Behavior);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Behavior);
			ownedClasses.add(type = _UniqueCollection_Class);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Class);
			ownedClasses.add(type = _UniqueCollection_CollectionLiteralPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_CollectionLiteralPart);
			ownedClasses.add(type = _UniqueCollection_Comment);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Comment);
			ownedClasses.add(type = _UniqueCollection_CompleteClass);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_CompleteClass);
			ownedClasses.add(type = _UniqueCollection_CompletePackage);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_CompletePackage);
			ownedClasses.add(type = _UniqueCollection_ConnectionPointReference);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_ConnectionPointReference);
			ownedClasses.add(type = _UniqueCollection_Constraint);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Constraint);
			ownedClasses.add(type = _UniqueCollection_Detail);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Detail);
			ownedClasses.add(type = _UniqueCollection_DynamicProperty);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_DynamicProperty);
			ownedClasses.add(type = _UniqueCollection_Element);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Element);
			ownedClasses.add(type = _UniqueCollection_ElementExtension);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_ElementExtension);
			ownedClasses.add(type = _UniqueCollection_EnumerationLiteral);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_EnumerationLiteral);
			ownedClasses.add(type = _UniqueCollection_Import);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Import);
			ownedClasses.add(type = _UniqueCollection_InstanceSpecification);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_InstanceSpecification);
			ownedClasses.add(type = _UniqueCollection_MapLiteralPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_MapLiteralPart);
			ownedClasses.add(type = _UniqueCollection_Model);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Model);
			ownedClasses.add(type = _UniqueCollection_OCLExpression);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_OCLExpression);
			ownedClasses.add(type = _UniqueCollection_Operation);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Operation);
			ownedClasses.add(type = _UniqueCollection_Package);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Package);
			ownedClasses.add(type = _UniqueCollection_Parameter);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Parameter);
			ownedClasses.add(type = _UniqueCollection_Precedence);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Precedence);
			ownedClasses.add(type = _UniqueCollection_ProfileApplication);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_ProfileApplication);
			ownedClasses.add(type = _UniqueCollection_Property);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Property);
			ownedClasses.add(type = _UniqueCollection_Pseudostate);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Pseudostate);
			ownedClasses.add(type = _UniqueCollection_Region);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Region);
			ownedClasses.add(type = _UniqueCollection_ShadowPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_ShadowPart);
			ownedClasses.add(type = _UniqueCollection_Slot);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Slot);
			ownedClasses.add(type = _UniqueCollection_State);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_State);
			ownedClasses.add(type = _UniqueCollection_StateMachine);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_StateMachine);
			ownedClasses.add(type = _UniqueCollection_StereotypeExtender);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_StereotypeExtender);
			ownedClasses.add(type = _UniqueCollection_String);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_String);
			ownedClasses.add(type = _UniqueCollection_TemplateBinding);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_TemplateBinding);
			ownedClasses.add(type = _UniqueCollection_TemplateParameter);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_TemplateParameter);
			ownedClasses.add(type = _UniqueCollection_TemplateParameterSubstitution);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_TemplateParameterSubstitution);
			ownedClasses.add(type = _UniqueCollection_Transition);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Transition);
			ownedClasses.add(type = _UniqueCollection_Trigger);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Trigger);
			ownedClasses.add(type = _UniqueCollection_TupleLiteralPart);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_TupleLiteralPart);
			ownedClasses.add(type = _UniqueCollection_Type);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Type);
			ownedClasses.add(type = _UniqueCollection_ValueSpecification);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_ValueSpecification);
			ownedClasses.add(type = _UniqueCollection_Variable);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Variable);
			ownedClasses.add(type = _UniqueCollection_Vertex);
			superClasses = type.getSuperClasses();
			superClasses.add(_Collection_Vertex);
		}
		
		private final @NonNull Operation op_CompleteModel_getOwnedCompletePackage = createOperation("getOwnedCompletePackage", _CompletePackage, null, null);
		private final @NonNull Operation op_CompletePackage_getOwnedCompleteClass = createOperation("getOwnedCompleteClass", _CompleteClass, null, null);
		private final @NonNull Operation op_Element_allOwnedElements = createOperation("allOwnedElements", _Set_Element, null, null);
		private final @NonNull Operation op_Element_getValue = createOperation("getValue", _Element, null, null);
		private final @NonNull Operation op_Property_isAttribute = createOperation("isAttribute", _Boolean, null, null);
		private final @NonNull Operation op_PropertyCallExp_getSpecializedReferredPropertyOwningType = createOperation("getSpecializedReferredPropertyOwningType", _Class, null, null);
		private final @NonNull Operation op_PropertyCallExp_getSpecializedReferredPropertyType = createOperation("getSpecializedReferredPropertyType", _Class, null, null);
		private final @NonNull Operation op_ReferringElement_getReferredElement = createOperation("getReferredElement", _Element, null, null);
		private final @NonNull Operation op_SelfType_specializeIn = createOperation("specializeIn", _Type, null, null);
		private final @NonNull Operation op_Type_flattenedType = createOperation("flattenedType", _Type, null, null);
		private final @NonNull Operation op_Type_isClass = createOperation("isClass", _Class, null, null);
		private final @NonNull Operation op_Type_isTemplateParameter = createOperation("isTemplateParameter", _TemplateParameter, null, null);
		private final @NonNull Operation op_Type_specializeIn = createOperation("specializeIn", _Type, null, null);
		private final @NonNull Operation op_TypedElement_CompatibleBody = createOperation("CompatibleBody", _Boolean, null, null);
		private final @NonNull Operation op_ValueSpecification_booleanValue = createOperation("booleanValue", _Boolean, null, null);
		private final @NonNull Operation op_ValueSpecification_integerValue = createOperation("integerValue", _Integer, null, null);
		private final @NonNull Operation op_ValueSpecification_isComputable = createOperation("isComputable", _Boolean, null, null);
		private final @NonNull Operation op_ValueSpecification_isNull = createOperation("isNull", _Boolean, null, null);
		private final @NonNull Operation op_ValueSpecification_stringValue = createOperation("stringValue", _String, null, null);
		private final @NonNull Operation op_ValueSpecification_unlimitedValue = createOperation("unlimitedValue", _UnlimitedNatural, null, null);
		
		private void installOperations() {
			List<Operation> ownedOperations;
			List<Parameter> ownedParameters;
			Operation operation;
			Parameter parameter;
		
			ownedOperations = _CompleteModel.getOwnedOperations();
			ownedOperations.add(operation = op_CompleteModel_getOwnedCompletePackage);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("name", _String, false));
		
			ownedOperations = _CompletePackage.getOwnedOperations();
			ownedOperations.add(operation = op_CompletePackage_getOwnedCompleteClass);
			operation.setIsRequired(false);
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("name", _String, false));
		
			ownedOperations = _Element.getOwnedOperations();
			ownedOperations.add(operation = op_Element_allOwnedElements);
			operation.setBodyExpression(createExpressionInOCL(_Set_Element, "self->closure(oclContents()->selectByKind(Element))"));
			ownedOperations.add(operation = op_Element_getValue);
			operation.setIsRequired(false);
			operation.setBodyExpression(createExpressionInOCL(_Element, "null"));
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("stereotype", _Type, true));
			ownedParameters.add(parameter = createParameter("propertyName", _String, true));
		
			ownedOperations = _Property.getOwnedOperations();
			ownedOperations.add(operation = op_Property_isAttribute);
			operation.setBodyExpression(createExpressionInOCL(_Boolean, "--Type.allInstances()->exists(c| c.ownedAttribute->includes(p))\nlet container : ocl::OclElement = oclContainer() in container.oclIsKindOf(Class) and container.oclAsType(Class).ownedProperties->includes(self)"));
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("p", _Property, true));
		
			ownedOperations = _PropertyCallExp.getOwnedOperations();
			ownedOperations.add(operation = op_PropertyCallExp_getSpecializedReferredPropertyOwningType);
			operation.setBodyExpression(createExpressionInOCL(_Class, "referredProperty?.owningClass"));
			ownedOperations.add(operation = op_PropertyCallExp_getSpecializedReferredPropertyType);
			operation.setBodyExpression(createExpressionInOCL(_Class, "referredProperty?.type.oclAsType(Class)"));
		
			ownedOperations = _ReferringElement.getOwnedOperations();
			ownedOperations.add(operation = op_ReferringElement_getReferredElement);
		
			ownedOperations = _SelfType.getOwnedOperations();
			ownedOperations.add(operation = op_SelfType_specializeIn);
			operation.setBodyExpression(createExpressionInOCL(_Type, "selfType"));
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("expr", _CallExp, true));
			ownedParameters.add(parameter = createParameter("selfType", _Type, true));
		
			ownedOperations = _Type.getOwnedOperations();
			ownedOperations.add(operation = op_Type_flattenedType);
			operation.setIsRequired(false);
			operation.setBodyExpression(createExpressionInOCL(_Type, "self"));
			ownedOperations.add(operation = op_Type_isClass);
			operation.setIsRequired(false);
			ownedOperations.add(operation = op_Type_isTemplateParameter);
			operation.setIsRequired(false);
			ownedOperations.add(operation = op_Type_specializeIn);
			operation.setBodyExpression(createExpressionInOCL(_Type, "self"));
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("expr", _CallExp, true));
			ownedParameters.add(parameter = createParameter("selfType", _Type, true));
		
			ownedOperations = _TypedElement.getOwnedOperations();
			ownedOperations.add(operation = op_TypedElement_CompatibleBody);
			operation.setBodyExpression(createExpressionInOCL(_Boolean, "bodySpecification.type?.conformsTo(self.type)"));
			ownedParameters = operation.getOwnedParameters();
			ownedParameters.add(parameter = createParameter("bodySpecification", _ValueSpecification, true));
		
			ownedOperations = _ValueSpecification.getOwnedOperations();
			ownedOperations.add(operation = op_ValueSpecification_booleanValue);
			operation.setIsRequired(false);
			ownedOperations.add(operation = op_ValueSpecification_integerValue);
			operation.setIsRequired(false);
			ownedOperations.add(operation = op_ValueSpecification_isComputable);
			ownedOperations.add(operation = op_ValueSpecification_isNull);
			ownedOperations.add(operation = op_ValueSpecification_stringValue);
			operation.setIsRequired(false);
			ownedOperations.add(operation = op_ValueSpecification_unlimitedValue);
			operation.setIsRequired(false);
		}
		
		private final @NonNull Property pr_Annotation_ownedContents = createProperty(PivotPackage.Literals.ANNOTATION__OWNED_CONTENTS, _OrderedSet_Element);
		private final @NonNull Property pr_Annotation_ownedDetails = createProperty(PivotPackage.Literals.ANNOTATION__OWNED_DETAILS, _OrderedSet_Detail);
		private final @NonNull Property pr_Annotation_references = createProperty(PivotPackage.Literals.ANNOTATION__REFERENCES, _OrderedSet_Element);
		private final @NonNull Property pr_AssociationClass_unownedAttributes = createProperty(PivotPackage.Literals.ASSOCIATION_CLASS__UNOWNED_ATTRIBUTES, _Set_Property);
		private final @NonNull Property pr_AssociationClass_AssociationClassCallExp_referredAssociationClass = createProperty("AssociationClassCallExp", _Bag_AssociationClassCallExp);
		private final @NonNull Property pr_AssociationClassCallExp_referredAssociationClass = createProperty(PivotPackage.Literals.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS, _AssociationClass);
		private final @NonNull Property pr_Behavior_owningTransition = createProperty(PivotPackage.Literals.BEHAVIOR__OWNING_TRANSITION, _Transition);
		private final @NonNull Property pr_Behavior_Class_ownedBehaviors = createProperty("Class", _Class);
		private final @NonNull Property pr_Behavior_State_ownedDoActivity = createProperty("State", _State);
		private final @NonNull Property pr_Behavior_State_ownedEntry = createProperty("State", _State);
		private final @NonNull Property pr_Behavior_State_ownedExit = createProperty("State", _State);
		private final @NonNull Property pr_BooleanLiteralExp_booleanSymbol = createProperty(PivotPackage.Literals.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL, _Boolean);
		private final @NonNull Property pr_CallExp_isImplicit = createProperty(PivotPackage.Literals.CALL_EXP__IS_IMPLICIT, _Boolean);
		private final @NonNull Property pr_CallExp_isSafe = createProperty(PivotPackage.Literals.CALL_EXP__IS_SAFE, _Boolean);
		private final @NonNull Property pr_CallExp_ownedSource = createProperty(PivotPackage.Literals.CALL_EXP__OWNED_SOURCE, _OCLExpression);
		private final @NonNull Property pr_CallOperationAction_operation = createProperty(PivotPackage.Literals.CALL_OPERATION_ACTION__OPERATION, _Operation);
		private final @NonNull Property pr_CallOperationAction_MessageExp_ownedCalledOperation = createProperty("MessageExp", _MessageExp);
		private final @NonNull Property pr_Class_extenders = createProperty(PivotPackage.Literals.CLASS__EXTENDERS, _Set_StereotypeExtender);
		private final @NonNull Property pr_Class_instanceClassName = createProperty(PivotPackage.Literals.CLASS__INSTANCE_CLASS_NAME, _String);
		private final @NonNull Property pr_Class_isAbstract = createProperty(PivotPackage.Literals.CLASS__IS_ABSTRACT, _Boolean);
		private final @NonNull Property pr_Class_isActive = createProperty(PivotPackage.Literals.CLASS__IS_ACTIVE, _Boolean);
		private final @NonNull Property pr_Class_isInterface = createProperty(PivotPackage.Literals.CLASS__IS_INTERFACE, _Boolean);
		private final @NonNull Property pr_Class_ownedBehaviors = createProperty(PivotPackage.Literals.CLASS__OWNED_BEHAVIORS, _Set_Behavior);
		private final @NonNull Property pr_Class_ownedInvariants = createProperty(PivotPackage.Literals.CLASS__OWNED_INVARIANTS, _Set_Constraint);
		private final @NonNull Property pr_Class_ownedOperations = createProperty(PivotPackage.Literals.CLASS__OWNED_OPERATIONS, _OrderedSet_Operation);
		private final @NonNull Property pr_Class_ownedProperties = createProperty(PivotPackage.Literals.CLASS__OWNED_PROPERTIES, _OrderedSet_Property);
		private final @NonNull Property pr_Class_owningPackage = createProperty(PivotPackage.Literals.CLASS__OWNING_PACKAGE, _Package);
		private final @NonNull Property pr_Class_superClasses = createProperty(PivotPackage.Literals.CLASS__SUPER_CLASSES, _Set_Class);
		private final @NonNull Property pr_Class_Class_superClasses = createProperty("Class", _Bag_Class);
		private final @NonNull Property pr_Class_CompleteClass_partialClasses = createProperty("CompleteClass", _Bag_CompleteClass);
		private final @NonNull Property pr_Class_DataType_behavioralClass = createProperty("DataType", _Bag_DataType);
		private final @NonNull Property pr_Class_InstanceSpecification_classes = createProperty("InstanceSpecification", _Bag_InstanceSpecification);
		private final @NonNull Property pr_Class_TemplateParameter_constrainingClasses = createProperty("TemplateParameter", _Bag_TemplateParameter);
		private final @NonNull Property pr_CollectionItem_ownedItem = createProperty(PivotPackage.Literals.COLLECTION_ITEM__OWNED_ITEM, _OCLExpression);
		private final @NonNull Property pr_CollectionLiteralExp_kind = createProperty(PivotPackage.Literals.COLLECTION_LITERAL_EXP__KIND, _CollectionKind);
		private final @NonNull Property pr_CollectionLiteralExp_ownedParts = createProperty(PivotPackage.Literals.COLLECTION_LITERAL_EXP__OWNED_PARTS, _OrderedSet_CollectionLiteralPart);
		private final @NonNull Property pr_CollectionLiteralPart_CollectionLiteralExp_ownedParts = createProperty("CollectionLiteralExp", _CollectionLiteralExp);
		private final @NonNull Property pr_CollectionRange_ownedFirst = createProperty(PivotPackage.Literals.COLLECTION_RANGE__OWNED_FIRST, _OCLExpression);
		private final @NonNull Property pr_CollectionRange_ownedLast = createProperty(PivotPackage.Literals.COLLECTION_RANGE__OWNED_LAST, _OCLExpression);
		private final @NonNull Property pr_CollectionType_elementType = createProperty(PivotPackage.Literals.COLLECTION_TYPE__ELEMENT_TYPE, _Type);
		private final @NonNull Property pr_CollectionType_isNullFree = createProperty(PivotPackage.Literals.COLLECTION_TYPE__IS_NULL_FREE, _Boolean);
		private final @NonNull Property pr_CollectionType_lower = createProperty(PivotPackage.Literals.COLLECTION_TYPE__LOWER, _Integer);
		private final @NonNull Property pr_CollectionType_upper = createProperty(PivotPackage.Literals.COLLECTION_TYPE__UPPER, _UnlimitedNatural);
		private final @NonNull Property pr_Comment_annotatedElements = createProperty(PivotPackage.Literals.COMMENT__ANNOTATED_ELEMENTS, _Set_Element);
		private final @NonNull Property pr_Comment_body = createProperty(PivotPackage.Literals.COMMENT__BODY, _String);
		private final @NonNull Property pr_Comment_owningElement = createProperty(PivotPackage.Literals.COMMENT__OWNING_ELEMENT, _Element);
		private final @NonNull Property pr_CompleteClass_owningCompletePackage = createProperty(PivotPackage.Literals.COMPLETE_CLASS__OWNING_COMPLETE_PACKAGE, _CompletePackage);
		private final @NonNull Property pr_CompleteClass_partialClasses = createProperty(PivotPackage.Literals.COMPLETE_CLASS__PARTIAL_CLASSES, _Set_Class);
		private final @NonNull Property pr_CompleteEnvironment_ownedCompleteModel = createProperty(PivotPackage.Literals.COMPLETE_ENVIRONMENT__OWNED_COMPLETE_MODEL, _CompleteModel);
		private final @NonNull Property pr_CompleteEnvironment_ownedStandardLibrary = createProperty(PivotPackage.Literals.COMPLETE_ENVIRONMENT__OWNED_STANDARD_LIBRARY, _StandardLibrary);
		private final @NonNull Property pr_CompleteModel_orphanCompletePackage = createProperty(PivotPackage.Literals.COMPLETE_MODEL__ORPHAN_COMPLETE_PACKAGE, _OrphanCompletePackage);
		private final @NonNull Property pr_CompleteModel_ownedCompletePackages = createProperty(PivotPackage.Literals.COMPLETE_MODEL__OWNED_COMPLETE_PACKAGES, _Set_CompletePackage);
		private final @NonNull Property pr_CompleteModel_owningCompleteEnvironment = createProperty(PivotPackage.Literals.COMPLETE_MODEL__OWNING_COMPLETE_ENVIRONMENT, _CompleteEnvironment);
		private final @NonNull Property pr_CompleteModel_partialModels = createProperty(PivotPackage.Literals.COMPLETE_MODEL__PARTIAL_MODELS, _Set_Model);
		private final @NonNull Property pr_CompleteModel_primitiveCompletePackage = createProperty(PivotPackage.Literals.COMPLETE_MODEL__PRIMITIVE_COMPLETE_PACKAGE, _PrimitiveCompletePackage);
		private final @NonNull Property pr_CompletePackage_ownedCompleteClasses = createProperty(PivotPackage.Literals.COMPLETE_PACKAGE__OWNED_COMPLETE_CLASSES, _Set_CompleteClass);
		private final @NonNull Property pr_CompletePackage_ownedCompletePackages = createProperty(PivotPackage.Literals.COMPLETE_PACKAGE__OWNED_COMPLETE_PACKAGES, _Set_CompletePackage);
		private final @NonNull Property pr_CompletePackage_owningCompleteModel = createProperty(PivotPackage.Literals.COMPLETE_PACKAGE__OWNING_COMPLETE_MODEL, _CompleteModel);
		private final @NonNull Property pr_CompletePackage_owningCompletePackage = createProperty(PivotPackage.Literals.COMPLETE_PACKAGE__OWNING_COMPLETE_PACKAGE, _CompletePackage);
		private final @NonNull Property pr_CompletePackage_partialPackages = createProperty(PivotPackage.Literals.COMPLETE_PACKAGE__PARTIAL_PACKAGES, _Set_Package);
		private final @NonNull Property pr_ConnectionPointReference_entries = createProperty(PivotPackage.Literals.CONNECTION_POINT_REFERENCE__ENTRIES, _Set_Pseudostate);
		private final @NonNull Property pr_ConnectionPointReference_exits = createProperty(PivotPackage.Literals.CONNECTION_POINT_REFERENCE__EXITS, _Set_Pseudostate);
		private final @NonNull Property pr_ConnectionPointReference_owningState = createProperty(PivotPackage.Literals.CONNECTION_POINT_REFERENCE__OWNING_STATE, _State);
		private final @NonNull Property pr_Constraint_constrainedElements = createProperty(PivotPackage.Literals.CONSTRAINT__CONSTRAINED_ELEMENTS, _OrderedSet_Element);
		private final @NonNull Property pr_Constraint_context = createProperty(PivotPackage.Literals.CONSTRAINT__CONTEXT, _Namespace);
		private final @NonNull Property pr_Constraint_isCallable = createProperty(PivotPackage.Literals.CONSTRAINT__IS_CALLABLE, _Boolean);
		private final @NonNull Property pr_Constraint_ownedSpecification = createProperty(PivotPackage.Literals.CONSTRAINT__OWNED_SPECIFICATION, _LanguageExpression);
		private final @NonNull Property pr_Constraint_owningPostContext = createProperty(PivotPackage.Literals.CONSTRAINT__OWNING_POST_CONTEXT, _Operation);
		private final @NonNull Property pr_Constraint_owningPreContext = createProperty(PivotPackage.Literals.CONSTRAINT__OWNING_PRE_CONTEXT, _Operation);
		private final @NonNull Property pr_Constraint_owningState = createProperty(PivotPackage.Literals.CONSTRAINT__OWNING_STATE, _State);
		private final @NonNull Property pr_Constraint_owningTransition = createProperty(PivotPackage.Literals.CONSTRAINT__OWNING_TRANSITION, _Transition);
		private final @NonNull Property pr_Constraint_redefinedConstraints = createProperty(PivotPackage.Literals.CONSTRAINT__REDEFINED_CONSTRAINTS, _Set_Constraint);
		private final @NonNull Property pr_Constraint_Class_ownedInvariants = createProperty("Class", _Class);
		private final @NonNull Property pr_Constraint_Constraint_redefinedConstraints = createProperty("Constraint", _Bag_Constraint);
		private final @NonNull Property pr_Constraint_Namespace_ownedConstraints = createProperty("Namespace", _Namespace);
		private final @NonNull Property pr_DataType_behavioralClass = createProperty(PivotPackage.Literals.DATA_TYPE__BEHAVIORAL_CLASS, _Class);
		private final @NonNull Property pr_DataType_isSerializable = createProperty(PivotPackage.Literals.DATA_TYPE__IS_SERIALIZABLE, _Boolean);
		private final @NonNull Property pr_Detail_values = createProperty(PivotPackage.Literals.DETAIL__VALUES, _Set_String);
		private final @NonNull Property pr_Detail_Annotation_ownedDetails = createProperty("Annotation", _Annotation);
		private final @NonNull Property pr_DynamicElement_metaType = createProperty(PivotPackage.Literals.DYNAMIC_ELEMENT__META_TYPE, _Type);
		private final @NonNull Property pr_DynamicProperty_default = createProperty(PivotPackage.Literals.DYNAMIC_PROPERTY__DEFAULT, _String);
		private final @NonNull Property pr_DynamicProperty_referredProperty = createProperty(PivotPackage.Literals.DYNAMIC_PROPERTY__REFERRED_PROPERTY, _Property);
		private final @NonNull Property pr_DynamicProperty_DynamicType_ownedDynamicProperties = createProperty("DynamicType", _DynamicType);
		private final @NonNull Property pr_DynamicType_ownedDynamicProperties = createProperty(PivotPackage.Literals.DYNAMIC_TYPE__OWNED_DYNAMIC_PROPERTIES, _Set_DynamicProperty);
		private final @NonNull Property pr_Element_annotatingComments = createProperty(PivotPackage.Literals.ELEMENT__ANNOTATING_COMMENTS, _Set_Comment);
		private final @NonNull Property pr_Element_ownedAnnotations = createProperty(PivotPackage.Literals.ELEMENT__OWNED_ANNOTATIONS, _OrderedSet_Element);
		private final @NonNull Property pr_Element_ownedComments = createProperty(PivotPackage.Literals.ELEMENT__OWNED_COMMENTS, _Set_Comment);
		private final @NonNull Property pr_Element_ownedExtensions = createProperty(PivotPackage.Literals.ELEMENT__OWNED_EXTENSIONS, _Set_ElementExtension);
		private final @NonNull Property pr_Element_Annotation_ownedContents = createProperty("Annotation", _Annotation);
		private final @NonNull Property pr_Element_Annotation_references = createProperty("Annotation", _Bag_Annotation);
		private final @NonNull Property pr_Element_Constraint_constrainedElements = createProperty("Constraint", _Bag_Constraint);
		private final @NonNull Property pr_Element_Element_ownedAnnotations = createProperty("Element", _Element);
		private final @NonNull Property pr_ElementExtension_base = createProperty(PivotPackage.Literals.ELEMENT_EXTENSION__BASE, _Element);
		private final @NonNull Property pr_ElementExtension_isApplied = createProperty(PivotPackage.Literals.ELEMENT_EXTENSION__IS_APPLIED, _Boolean);
		private final @NonNull Property pr_ElementExtension_isRequired = createProperty(PivotPackage.Literals.ELEMENT_EXTENSION__IS_REQUIRED, _Boolean);
		private final @NonNull Property pr_ElementExtension_stereotype = createProperty(PivotPackage.Literals.ELEMENT_EXTENSION__STEREOTYPE, _Stereotype);
		private final @NonNull Property pr_EnumLiteralExp_referredLiteral = createProperty(PivotPackage.Literals.ENUM_LITERAL_EXP__REFERRED_LITERAL, _EnumerationLiteral);
		private final @NonNull Property pr_Enumeration_ownedLiterals = createProperty(PivotPackage.Literals.ENUMERATION__OWNED_LITERALS, _OrderedSet_EnumerationLiteral);
		private final @NonNull Property pr_EnumerationLiteral_owningEnumeration = createProperty(PivotPackage.Literals.ENUMERATION_LITERAL__OWNING_ENUMERATION, _Enumeration);
		private final @NonNull Property pr_EnumerationLiteral_value = createProperty(PivotPackage.Literals.ENUMERATION_LITERAL__VALUE, _Integer);
		private final @NonNull Property pr_EnumerationLiteral_EnumLiteralExp_referredLiteral = createProperty("EnumLiteralExp", _Bag_EnumLiteralExp);
		private final @NonNull Property pr_ExpressionInOCL_ownedBody = createProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__OWNED_BODY, _OCLExpression);
		private final @NonNull Property pr_ExpressionInOCL_ownedContext = createProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__OWNED_CONTEXT, _Variable);
		private final @NonNull Property pr_ExpressionInOCL_ownedParameters = createProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__OWNED_PARAMETERS, _OrderedSet_Variable);
		private final @NonNull Property pr_ExpressionInOCL_ownedResult = createProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__OWNED_RESULT, _Variable);
		private final @NonNull Property pr_Feature_implementation = createProperty(PivotPackage.Literals.FEATURE__IMPLEMENTATION, _LibraryFeature);
		private final @NonNull Property pr_Feature_implementationClass = createProperty(PivotPackage.Literals.FEATURE__IMPLEMENTATION_CLASS, _String);
		private final @NonNull Property pr_Feature_isStatic = createProperty(PivotPackage.Literals.FEATURE__IS_STATIC, _Boolean);
		private final @NonNull Property pr_FeatureCallExp_isPre = createProperty(PivotPackage.Literals.FEATURE_CALL_EXP__IS_PRE, _Boolean);
		private final @NonNull Property pr_IfExp_ownedCondition = createProperty(PivotPackage.Literals.IF_EXP__OWNED_CONDITION, _OCLExpression);
		private final @NonNull Property pr_IfExp_ownedElse = createProperty(PivotPackage.Literals.IF_EXP__OWNED_ELSE, _OCLExpression);
		private final @NonNull Property pr_IfExp_ownedThen = createProperty(PivotPackage.Literals.IF_EXP__OWNED_THEN, _OCLExpression);
		private final @NonNull Property pr_Import_importedNamespace = createProperty(PivotPackage.Literals.IMPORT__IMPORTED_NAMESPACE, _Namespace);
		private final @NonNull Property pr_Import_Model_ownedImports = createProperty("Model", _Model);
		private final @NonNull Property pr_InstanceSpecification_classes = createProperty(PivotPackage.Literals.INSTANCE_SPECIFICATION__CLASSES, _Set_Class);
		private final @NonNull Property pr_InstanceSpecification_ownedSlots = createProperty(PivotPackage.Literals.INSTANCE_SPECIFICATION__OWNED_SLOTS, _Set_Slot);
		private final @NonNull Property pr_InstanceSpecification_ownedSpecification = createProperty(PivotPackage.Literals.INSTANCE_SPECIFICATION__OWNED_SPECIFICATION, _LanguageExpression);
		private final @NonNull Property pr_InstanceSpecification_owningPackage = createProperty(PivotPackage.Literals.INSTANCE_SPECIFICATION__OWNING_PACKAGE, _Package);
		private final @NonNull Property pr_IntegerLiteralExp_integerSymbol = createProperty(PivotPackage.Literals.INTEGER_LITERAL_EXP__INTEGER_SYMBOL, _Integer);
		private final @NonNull Property pr_IterateExp_ownedResult = createProperty(PivotPackage.Literals.ITERATE_EXP__OWNED_RESULT, _Variable);
		private final @NonNull Property pr_Iteration_ownedAccumulators = createProperty(PivotPackage.Literals.ITERATION__OWNED_ACCUMULATORS, _OrderedSet_Parameter);
		private final @NonNull Property pr_Iteration_ownedIterators = createProperty(PivotPackage.Literals.ITERATION__OWNED_ITERATORS, _OrderedSet_Parameter);
		private final @NonNull Property pr_Iteration_LoopExp_referredIteration = createProperty("LoopExp", _Bag_LoopExp);
		private final @NonNull Property pr_LambdaType_contextType = createProperty(PivotPackage.Literals.LAMBDA_TYPE__CONTEXT_TYPE, _Type);
		private final @NonNull Property pr_LambdaType_parameterType = createProperty(PivotPackage.Literals.LAMBDA_TYPE__PARAMETER_TYPE, _Sequence_Type);
		private final @NonNull Property pr_LambdaType_resultType = createProperty(PivotPackage.Literals.LAMBDA_TYPE__RESULT_TYPE, _Type);
		private final @NonNull Property pr_LanguageExpression_body = createProperty(PivotPackage.Literals.LANGUAGE_EXPRESSION__BODY, _String);
		private final @NonNull Property pr_LanguageExpression_language = createProperty(PivotPackage.Literals.LANGUAGE_EXPRESSION__LANGUAGE, _String);
		private final @NonNull Property pr_LanguageExpression_owningConstraint = createProperty(PivotPackage.Literals.LANGUAGE_EXPRESSION__OWNING_CONSTRAINT, _Constraint);
		private final @NonNull Property pr_LanguageExpression_InstanceSpecification_ownedSpecification = createProperty("InstanceSpecification", _InstanceSpecification);
		private final @NonNull Property pr_LanguageExpression_Operation_bodyExpression = createProperty("Operation", _Operation);
		private final @NonNull Property pr_LanguageExpression_Property_ownedExpression = createProperty("Property", _Property);
		private final @NonNull Property pr_LetExp_ownedIn = createProperty(PivotPackage.Literals.LET_EXP__OWNED_IN, _OCLExpression);
		private final @NonNull Property pr_LetExp_ownedVariable = createProperty(PivotPackage.Literals.LET_EXP__OWNED_VARIABLE, _Variable);
		private final @NonNull Property pr_Library_ownedPrecedences = createProperty(PivotPackage.Literals.LIBRARY__OWNED_PRECEDENCES, _OrderedSet_Precedence);
		private final @NonNull Property pr_LoopExp_ownedBody = createProperty(PivotPackage.Literals.LOOP_EXP__OWNED_BODY, _OCLExpression);
		private final @NonNull Property pr_LoopExp_ownedIterators = createProperty(PivotPackage.Literals.LOOP_EXP__OWNED_ITERATORS, _OrderedSet_Variable);
		private final @NonNull Property pr_LoopExp_referredIteration = createProperty(PivotPackage.Literals.LOOP_EXP__REFERRED_ITERATION, _Iteration);
		private final @NonNull Property pr_MapLiteralExp_ownedParts = createProperty(PivotPackage.Literals.MAP_LITERAL_EXP__OWNED_PARTS, _OrderedSet_MapLiteralPart);
		private final @NonNull Property pr_MapLiteralPart_ownedKey = createProperty(PivotPackage.Literals.MAP_LITERAL_PART__OWNED_KEY, _OCLExpression);
		private final @NonNull Property pr_MapLiteralPart_ownedValue = createProperty(PivotPackage.Literals.MAP_LITERAL_PART__OWNED_VALUE, _OCLExpression);
		private final @NonNull Property pr_MapLiteralPart_MapLiteralExp_ownedParts = createProperty("MapLiteralExp", _MapLiteralExp);
		private final @NonNull Property pr_MapType_keyType = createProperty(PivotPackage.Literals.MAP_TYPE__KEY_TYPE, _Type);
		private final @NonNull Property pr_MapType_valueType = createProperty(PivotPackage.Literals.MAP_TYPE__VALUE_TYPE, _Type);
		private final @NonNull Property pr_MessageExp_ownedArguments = createProperty(PivotPackage.Literals.MESSAGE_EXP__OWNED_ARGUMENTS, _OrderedSet_OCLExpression);
		private final @NonNull Property pr_MessageExp_ownedCalledOperation = createProperty(PivotPackage.Literals.MESSAGE_EXP__OWNED_CALLED_OPERATION, _CallOperationAction);
		private final @NonNull Property pr_MessageExp_ownedSentSignal = createProperty(PivotPackage.Literals.MESSAGE_EXP__OWNED_SENT_SIGNAL, _SendSignalAction);
		private final @NonNull Property pr_MessageExp_ownedTarget = createProperty(PivotPackage.Literals.MESSAGE_EXP__OWNED_TARGET, _OCLExpression);
		private final @NonNull Property pr_MessageType_referredOperation = createProperty(PivotPackage.Literals.MESSAGE_TYPE__REFERRED_OPERATION, _Operation);
		private final @NonNull Property pr_MessageType_referredSignal = createProperty(PivotPackage.Literals.MESSAGE_TYPE__REFERRED_SIGNAL, _Signal);
		private final @NonNull Property pr_Model_externalURI = createProperty(PivotPackage.Literals.MODEL__EXTERNAL_URI, _String);
		private final @NonNull Property pr_Model_ownedImports = createProperty(PivotPackage.Literals.MODEL__OWNED_IMPORTS, _OrderedSet_Import);
		private final @NonNull Property pr_Model_ownedPackages = createProperty(PivotPackage.Literals.MODEL__OWNED_PACKAGES, _Set_Package);
		private final @NonNull Property pr_Model_CompleteModel_partialModels = createProperty("CompleteModel", _Bag_CompleteModel);
		private final @NonNull Property pr_NamedElement_name = createProperty(PivotPackage.Literals.NAMED_ELEMENT__NAME, _String);
		private final @NonNull Property pr_Namespace_ownedConstraints = createProperty(PivotPackage.Literals.NAMESPACE__OWNED_CONSTRAINTS, _Set_Constraint);
		private final @NonNull Property pr_Namespace_Constraint_context = createProperty("Constraint", _Bag_Constraint);
		private final @NonNull Property pr_Namespace_Import_importedNamespace = createProperty("Import", _Bag_Import);
		private final @NonNull Property pr_NavigationCallExp_navigationSource = createProperty(PivotPackage.Literals.NAVIGATION_CALL_EXP__NAVIGATION_SOURCE, _Property);
		private final @NonNull Property pr_NavigationCallExp_qualifiers = createProperty(PivotPackage.Literals.NAVIGATION_CALL_EXP__QUALIFIERS, _OrderedSet_OCLExpression);
		private final @NonNull Property pr_OCLExpression_typeValue = createProperty(PivotPackage.Literals.OCL_EXPRESSION__TYPE_VALUE, _Type);
		private final @NonNull Property pr_OCLExpression_CallExp_ownedSource = createProperty("CallExp", _CallExp);
		private final @NonNull Property pr_OCLExpression_CollectionItem_ownedItem = createProperty("CollectionItem", _CollectionItem);
		private final @NonNull Property pr_OCLExpression_CollectionRange_ownedFirst = createProperty("CollectionRange", _CollectionRange);
		private final @NonNull Property pr_OCLExpression_CollectionRange_ownedLast = createProperty("CollectionRange", _CollectionRange);
		private final @NonNull Property pr_OCLExpression_ExpressionInOCL_ownedBody = createProperty("ExpressionInOCL", _ExpressionInOCL);
		private final @NonNull Property pr_OCLExpression_IfExp_ownedCondition = createProperty("IfExp", _IfExp);
		private final @NonNull Property pr_OCLExpression_IfExp_ownedElse = createProperty("IfExp", _IfExp);
		private final @NonNull Property pr_OCLExpression_IfExp_ownedThen = createProperty("IfExp", _IfExp);
		private final @NonNull Property pr_OCLExpression_LetExp_ownedIn = createProperty("LetExp", _LetExp);
		private final @NonNull Property pr_OCLExpression_LoopExp_ownedBody = createProperty("LoopExp", _LoopExp);
		private final @NonNull Property pr_OCLExpression_MapLiteralPart_ownedKey = createProperty("MapLiteralPart", _MapLiteralPart);
		private final @NonNull Property pr_OCLExpression_MapLiteralPart_ownedValue = createProperty("MapLiteralPart", _MapLiteralPart);
		private final @NonNull Property pr_OCLExpression_MessageExp_ownedArguments = createProperty("MessageExp", _MessageExp);
		private final @NonNull Property pr_OCLExpression_MessageExp_ownedTarget = createProperty("MessageExp", _MessageExp);
		private final @NonNull Property pr_OCLExpression_NavigationCallExp_qualifiers = createProperty("NavigationCallExp", _Bag_NavigationCallExp);
		private final @NonNull Property pr_OCLExpression_OperationCallExp_ownedArguments = createProperty("OperationCallExp", _OperationCallExp);
		private final @NonNull Property pr_OCLExpression_ShadowPart_ownedInit = createProperty("ShadowPart", _ShadowPart);
		private final @NonNull Property pr_OCLExpression_TupleLiteralPart_ownedInit = createProperty("TupleLiteralPart", _TupleLiteralPart);
		private final @NonNull Property pr_OCLExpression_Variable_ownedInit = createProperty("Variable", _Variable);
		private final @NonNull Property pr_Operation_bodyExpression = createProperty(PivotPackage.Literals.OPERATION__BODY_EXPRESSION, _LanguageExpression);
		private final @NonNull Property pr_Operation_isInvalidating = createProperty(PivotPackage.Literals.OPERATION__IS_INVALIDATING, _Boolean);
		private final @NonNull Property pr_Operation_isTypeof = createProperty(PivotPackage.Literals.OPERATION__IS_TYPEOF, _Boolean);
		private final @NonNull Property pr_Operation_isValidating = createProperty(PivotPackage.Literals.OPERATION__IS_VALIDATING, _Boolean);
		private final @NonNull Property pr_Operation_ownedParameters = createProperty(PivotPackage.Literals.OPERATION__OWNED_PARAMETERS, _OrderedSet_Parameter);
		private final @NonNull Property pr_Operation_ownedPostconditions = createProperty(PivotPackage.Literals.OPERATION__OWNED_POSTCONDITIONS, _Set_Constraint);
		private final @NonNull Property pr_Operation_ownedPreconditions = createProperty(PivotPackage.Literals.OPERATION__OWNED_PRECONDITIONS, _Set_Constraint);
		private final @NonNull Property pr_Operation_owningClass = createProperty(PivotPackage.Literals.OPERATION__OWNING_CLASS, _Class);
		private final @NonNull Property pr_Operation_precedence = createProperty(PivotPackage.Literals.OPERATION__PRECEDENCE, _Precedence);
		private final @NonNull Property pr_Operation_raisedExceptions = createProperty(PivotPackage.Literals.OPERATION__RAISED_EXCEPTIONS, _Set_Type);
		private final @NonNull Property pr_Operation_redefinedOperations = createProperty(PivotPackage.Literals.OPERATION__REDEFINED_OPERATIONS, _Set_Operation);
		private final @NonNull Property pr_Operation_CallOperationAction_operation = createProperty("CallOperationAction", _Bag_CallOperationAction);
		private final @NonNull Property pr_Operation_MessageType_referredOperation = createProperty("MessageType", _Bag_MessageType);
		private final @NonNull Property pr_Operation_Operation_redefinedOperations = createProperty("Operation", _Bag_Operation);
		private final @NonNull Property pr_Operation_OperationCallExp_referredOperation = createProperty("OperationCallExp", _Bag_OperationCallExp);
		private final @NonNull Property pr_Operation_PrimitiveType_coercions = createProperty("PrimitiveType", _Bag_PrimitiveType);
		private final @NonNull Property pr_OperationCallExp_ownedArguments = createProperty(PivotPackage.Literals.OPERATION_CALL_EXP__OWNED_ARGUMENTS, _OrderedSet_OCLExpression);
		private final @NonNull Property pr_OperationCallExp_referredOperation = createProperty(PivotPackage.Literals.OPERATION_CALL_EXP__REFERRED_OPERATION, _Operation);
		private final @NonNull Property pr_OppositePropertyCallExp_referredProperty = createProperty(PivotPackage.Literals.OPPOSITE_PROPERTY_CALL_EXP__REFERRED_PROPERTY, _Property);
		private final @NonNull Property pr_OrphanCompletePackage_CompleteModel_orphanCompletePackage = createProperty("CompleteModel", _Bag_CompleteModel);
		private final @NonNull Property pr_Package_URI = createProperty(PivotPackage.Literals.PACKAGE__URI, _String);
		private final @NonNull Property pr_Package_importedPackages = createProperty(PivotPackage.Literals.PACKAGE__IMPORTED_PACKAGES, _Set_Package);
		private final @NonNull Property pr_Package_nsPrefix = createProperty(PivotPackage.Literals.PACKAGE__NS_PREFIX, _String);
		private final @NonNull Property pr_Package_ownedClasses = createProperty(PivotPackage.Literals.PACKAGE__OWNED_CLASSES, _Set_Class);
		private final @NonNull Property pr_Package_ownedInstances = createProperty(PivotPackage.Literals.PACKAGE__OWNED_INSTANCES, _Set_InstanceSpecification);
		private final @NonNull Property pr_Package_ownedPackages = createProperty(PivotPackage.Literals.PACKAGE__OWNED_PACKAGES, _Set_Package);
		private final @NonNull Property pr_Package_ownedProfileApplications = createProperty(PivotPackage.Literals.PACKAGE__OWNED_PROFILE_APPLICATIONS, _Set_ProfileApplication);
		private final @NonNull Property pr_Package_owningPackage = createProperty(PivotPackage.Literals.PACKAGE__OWNING_PACKAGE, _Package);
		private final @NonNull Property pr_Package_CompletePackage_partialPackages = createProperty("CompletePackage", _Bag_CompletePackage);
		private final @NonNull Property pr_Package_Model_ownedPackages = createProperty("Model", _Model);
		private final @NonNull Property pr_Package_Package_importedPackages = createProperty("Package", _Bag_Package);
		private final @NonNull Property pr_Parameter_isTypeof = createProperty(PivotPackage.Literals.PARAMETER__IS_TYPEOF, _Boolean);
		private final @NonNull Property pr_Parameter_owningOperation = createProperty(PivotPackage.Literals.PARAMETER__OWNING_OPERATION, _Operation);
		private final @NonNull Property pr_Parameter_Iteration_ownedAccumulators = createProperty("Iteration", _Iteration);
		private final @NonNull Property pr_Parameter_Iteration_ownedIterators = createProperty("Iteration", _Iteration);
		private final @NonNull Property pr_Parameter_Variable_representedParameter = createProperty("Variable", _Bag_Variable);
		private final @NonNull Property pr_Precedence_associativity = createProperty(PivotPackage.Literals.PRECEDENCE__ASSOCIATIVITY, _AssociativityKind);
		private final @NonNull Property pr_Precedence_order = createProperty(PivotPackage.Literals.PRECEDENCE__ORDER, _Integer);
		private final @NonNull Property pr_Precedence_Library_ownedPrecedences = createProperty("Library", _Library);
		private final @NonNull Property pr_Precedence_Operation_precedence = createProperty("Operation", _Bag_Operation);
		private final @NonNull Property pr_PrimitiveCompletePackage_CompleteModel_primitiveCompletePackage = createProperty("CompleteModel", _Bag_CompleteModel);
		private final @NonNull Property pr_PrimitiveType_coercions = createProperty(PivotPackage.Literals.PRIMITIVE_TYPE__COERCIONS, _OrderedSet_Operation);
		private final @NonNull Property pr_Profile_profileApplications = createProperty(PivotPackage.Literals.PROFILE__PROFILE_APPLICATIONS, _Set_ProfileApplication);
		private final @NonNull Property pr_ProfileApplication_appliedProfile = createProperty(PivotPackage.Literals.PROFILE_APPLICATION__APPLIED_PROFILE, _Profile);
		private final @NonNull Property pr_ProfileApplication_isStrict = createProperty(PivotPackage.Literals.PROFILE_APPLICATION__IS_STRICT, _Boolean);
		private final @NonNull Property pr_ProfileApplication_owningPackage = createProperty(PivotPackage.Literals.PROFILE_APPLICATION__OWNING_PACKAGE, _Package);
		private final @NonNull Property pr_Property_associationClass = createProperty(PivotPackage.Literals.PROPERTY__ASSOCIATION_CLASS, _AssociationClass);
		private final @NonNull Property pr_Property_defaultValue = createProperty(PivotPackage.Literals.PROPERTY__DEFAULT_VALUE, _Object);
		private final @NonNull Property pr_Property_defaultValueString = createProperty(PivotPackage.Literals.PROPERTY__DEFAULT_VALUE_STRING, _String);
		private final @NonNull Property pr_Property_isComposite = createProperty(PivotPackage.Literals.PROPERTY__IS_COMPOSITE, _Boolean);
		private final @NonNull Property pr_Property_isDerived = createProperty(PivotPackage.Literals.PROPERTY__IS_DERIVED, _Boolean);
		private final @NonNull Property pr_Property_isID = createProperty(PivotPackage.Literals.PROPERTY__IS_ID, _Boolean);
		private final @NonNull Property pr_Property_isImplicit = createProperty(PivotPackage.Literals.PROPERTY__IS_IMPLICIT, _Boolean);
		private final @NonNull Property pr_Property_isReadOnly = createProperty(PivotPackage.Literals.PROPERTY__IS_READ_ONLY, _Boolean);
		private final @NonNull Property pr_Property_isResolveProxies = createProperty(PivotPackage.Literals.PROPERTY__IS_RESOLVE_PROXIES, _Boolean);
		private final @NonNull Property pr_Property_isTransient = createProperty(PivotPackage.Literals.PROPERTY__IS_TRANSIENT, _Boolean);
		private final @NonNull Property pr_Property_isUnsettable = createProperty(PivotPackage.Literals.PROPERTY__IS_UNSETTABLE, _Boolean);
		private final @NonNull Property pr_Property_isVolatile = createProperty(PivotPackage.Literals.PROPERTY__IS_VOLATILE, _Boolean);
		private final @NonNull Property pr_Property_keys = createProperty(PivotPackage.Literals.PROPERTY__KEYS, _Set_Property);
		private final @NonNull Property pr_Property_opposite = createProperty(PivotPackage.Literals.PROPERTY__OPPOSITE, _Property);
		private final @NonNull Property pr_Property_ownedExpression = createProperty(PivotPackage.Literals.PROPERTY__OWNED_EXPRESSION, _LanguageExpression);
		private final @NonNull Property pr_Property_owningClass = createProperty(PivotPackage.Literals.PROPERTY__OWNING_CLASS, _Class);
		private final @NonNull Property pr_Property_redefinedProperties = createProperty(PivotPackage.Literals.PROPERTY__REDEFINED_PROPERTIES, _Set_Property);
		private final @NonNull Property pr_Property_referredProperty = createProperty(PivotPackage.Literals.PROPERTY__REFERRED_PROPERTY, _Property);
		private final @NonNull Property pr_Property_subsettedProperty = createProperty(PivotPackage.Literals.PROPERTY__SUBSETTED_PROPERTY, _Set_Property);
		private final @NonNull Property pr_Property_DynamicProperty_referredProperty = createProperty("DynamicProperty", _Bag_DynamicProperty);
		private final @NonNull Property pr_Property_NavigationCallExp_navigationSource = createProperty("NavigationCallExp", _Bag_NavigationCallExp);
		private final @NonNull Property pr_Property_OppositePropertyCallExp_referredProperty = createProperty("OppositePropertyCallExp", _Bag_OppositePropertyCallExp);
		private final @NonNull Property pr_Property_Property_keys = createProperty("Property", _Bag_Property);
		private final @NonNull Property pr_Property_Property_opposite = createProperty("Property", _Bag_Property);
		private final @NonNull Property pr_Property_Property_redefinedProperties = createProperty("Property", _Bag_Property);
		private final @NonNull Property pr_Property_Property_referredProperty = createProperty("Property", _Bag_Property);
		private final @NonNull Property pr_Property_Property_subsettedProperty = createProperty("Property", _Bag_Property);
		private final @NonNull Property pr_Property_PropertyCallExp_referredProperty = createProperty("PropertyCallExp", _Bag_PropertyCallExp);
		private final @NonNull Property pr_Property_ShadowPart_referredProperty = createProperty("ShadowPart", _Bag_ShadowPart);
		private final @NonNull Property pr_Property_Slot_definingProperty = createProperty("Slot", _Bag_Slot);
		private final @NonNull Property pr_PropertyCallExp_referredProperty = createProperty(PivotPackage.Literals.PROPERTY_CALL_EXP__REFERRED_PROPERTY, _Property);
		private final @NonNull Property pr_Pseudostate_kind = createProperty(PivotPackage.Literals.PSEUDOSTATE__KIND, _PseudostateKind);
		private final @NonNull Property pr_Pseudostate_owningState = createProperty(PivotPackage.Literals.PSEUDOSTATE__OWNING_STATE, _State);
		private final @NonNull Property pr_Pseudostate_owningStateMachine = createProperty(PivotPackage.Literals.PSEUDOSTATE__OWNING_STATE_MACHINE, _StateMachine);
		private final @NonNull Property pr_Pseudostate_ConnectionPointReference_entries = createProperty("ConnectionPointReference", _Bag_ConnectionPointReference);
		private final @NonNull Property pr_Pseudostate_ConnectionPointReference_exits = createProperty("ConnectionPointReference", _Bag_ConnectionPointReference);
		private final @NonNull Property pr_RealLiteralExp_realSymbol = createProperty(PivotPackage.Literals.REAL_LITERAL_EXP__REAL_SYMBOL, _Real);
		private final @NonNull Property pr_Region_extendedRegion = createProperty(PivotPackage.Literals.REGION__EXTENDED_REGION, _Region);
		private final @NonNull Property pr_Region_ownedSubvertexes = createProperty(PivotPackage.Literals.REGION__OWNED_SUBVERTEXES, _Set_Vertex);
		private final @NonNull Property pr_Region_ownedTransitions = createProperty(PivotPackage.Literals.REGION__OWNED_TRANSITIONS, _Set_Transition);
		private final @NonNull Property pr_Region_owningState = createProperty(PivotPackage.Literals.REGION__OWNING_STATE, _State);
		private final @NonNull Property pr_Region_owningStateMachine = createProperty(PivotPackage.Literals.REGION__OWNING_STATE_MACHINE, _StateMachine);
		private final @NonNull Property pr_Region_Region_extendedRegion = createProperty("Region", _Bag_Region);
		private final @NonNull Property pr_SendSignalAction_signal = createProperty(PivotPackage.Literals.SEND_SIGNAL_ACTION__SIGNAL, _Signal);
		private final @NonNull Property pr_SendSignalAction_MessageExp_ownedSentSignal = createProperty("MessageExp", _MessageExp);
		private final @NonNull Property pr_ShadowExp_ownedParts = createProperty(PivotPackage.Literals.SHADOW_EXP__OWNED_PARTS, _OrderedSet_ShadowPart);
		private final @NonNull Property pr_ShadowExp_value = createProperty(PivotPackage.Literals.SHADOW_EXP__VALUE, _String);
		private final @NonNull Property pr_ShadowPart_ownedInit = createProperty(PivotPackage.Literals.SHADOW_PART__OWNED_INIT, _OCLExpression);
		private final @NonNull Property pr_ShadowPart_referredProperty = createProperty(PivotPackage.Literals.SHADOW_PART__REFERRED_PROPERTY, _Property);
		private final @NonNull Property pr_ShadowPart_ShadowExp_ownedParts = createProperty("ShadowExp", _ShadowExp);
		private final @NonNull Property pr_Signal_MessageType_referredSignal = createProperty("MessageType", _Bag_MessageType);
		private final @NonNull Property pr_Signal_SendSignalAction_signal = createProperty("SendSignalAction", _Bag_SendSignalAction);
		private final @NonNull Property pr_Slot_definingProperty = createProperty(PivotPackage.Literals.SLOT__DEFINING_PROPERTY, _Property);
		private final @NonNull Property pr_Slot_ownedValues = createProperty(PivotPackage.Literals.SLOT__OWNED_VALUES, _OrderedSet_ValueSpecification);
		private final @NonNull Property pr_Slot_owningInstance = createProperty(PivotPackage.Literals.SLOT__OWNING_INSTANCE, _InstanceSpecification);
		private final @NonNull Property pr_StandardLibrary_owningCompleteEnvironment = createProperty(PivotPackage.Literals.STANDARD_LIBRARY__OWNING_COMPLETE_ENVIRONMENT, _CompleteEnvironment);
		private final @NonNull Property pr_State_isComposite = createProperty(PivotPackage.Literals.STATE__IS_COMPOSITE, _Boolean);
		private final @NonNull Property pr_State_isOrthogonal = createProperty(PivotPackage.Literals.STATE__IS_ORTHOGONAL, _Boolean);
		private final @NonNull Property pr_State_isSimple = createProperty(PivotPackage.Literals.STATE__IS_SIMPLE, _Boolean);
		private final @NonNull Property pr_State_isSubmachineState = createProperty(PivotPackage.Literals.STATE__IS_SUBMACHINE_STATE, _Boolean);
		private final @NonNull Property pr_State_ownedConnectionPoints = createProperty(PivotPackage.Literals.STATE__OWNED_CONNECTION_POINTS, _Set_Pseudostate);
		private final @NonNull Property pr_State_ownedConnections = createProperty(PivotPackage.Literals.STATE__OWNED_CONNECTIONS, _Set_ConnectionPointReference);
		private final @NonNull Property pr_State_ownedDeferrableTriggers = createProperty(PivotPackage.Literals.STATE__OWNED_DEFERRABLE_TRIGGERS, _Set_Trigger);
		private final @NonNull Property pr_State_ownedDoActivity = createProperty(PivotPackage.Literals.STATE__OWNED_DO_ACTIVITY, _Behavior);
		private final @NonNull Property pr_State_ownedEntry = createProperty(PivotPackage.Literals.STATE__OWNED_ENTRY, _Behavior);
		private final @NonNull Property pr_State_ownedExit = createProperty(PivotPackage.Literals.STATE__OWNED_EXIT, _Behavior);
		private final @NonNull Property pr_State_ownedRegions = createProperty(PivotPackage.Literals.STATE__OWNED_REGIONS, _Set_Region);
		private final @NonNull Property pr_State_ownedStateInvariant = createProperty(PivotPackage.Literals.STATE__OWNED_STATE_INVARIANT, _Constraint);
		private final @NonNull Property pr_State_redefinedState = createProperty(PivotPackage.Literals.STATE__REDEFINED_STATE, _State);
		private final @NonNull Property pr_State_submachines = createProperty(PivotPackage.Literals.STATE__SUBMACHINES, _StateMachine);
		private final @NonNull Property pr_State_State_redefinedState = createProperty("State", _Bag_State);
		private final @NonNull Property pr_State_StateExp_referredState = createProperty("StateExp", _Bag_StateExp);
		private final @NonNull Property pr_StateExp_referredState = createProperty(PivotPackage.Literals.STATE_EXP__REFERRED_STATE, _State);
		private final @NonNull Property pr_StateMachine_extendedStateMachines = createProperty(PivotPackage.Literals.STATE_MACHINE__EXTENDED_STATE_MACHINES, _Set_StateMachine);
		private final @NonNull Property pr_StateMachine_ownedConnectionPoints = createProperty(PivotPackage.Literals.STATE_MACHINE__OWNED_CONNECTION_POINTS, _Set_Pseudostate);
		private final @NonNull Property pr_StateMachine_ownedRegions = createProperty(PivotPackage.Literals.STATE_MACHINE__OWNED_REGIONS, _Set_Region_1);
		private final @NonNull Property pr_StateMachine_submachineStates = createProperty(PivotPackage.Literals.STATE_MACHINE__SUBMACHINE_STATES, _Set_State);
		private final @NonNull Property pr_StateMachine_StateMachine_extendedStateMachines = createProperty("StateMachine", _Bag_StateMachine);
		private final @NonNull Property pr_Stereotype_ownedExtenders = createProperty(PivotPackage.Literals.STEREOTYPE__OWNED_EXTENDERS, _Set_StereotypeExtender);
		private final @NonNull Property pr_Stereotype_ElementExtension_stereotype = createProperty("ElementExtension", _Bag_ElementExtension);
		private final @NonNull Property pr_StereotypeExtender_class = createProperty(PivotPackage.Literals.STEREOTYPE_EXTENDER__CLASS, _Class);
		private final @NonNull Property pr_StereotypeExtender_isRequired = createProperty(PivotPackage.Literals.STEREOTYPE_EXTENDER__IS_REQUIRED, _Boolean);
		private final @NonNull Property pr_StereotypeExtender_owningStereotype = createProperty(PivotPackage.Literals.STEREOTYPE_EXTENDER__OWNING_STEREOTYPE, _Stereotype);
		private final @NonNull Property pr_StringLiteralExp_stringSymbol = createProperty(PivotPackage.Literals.STRING_LITERAL_EXP__STRING_SYMBOL, _String);
		private final @NonNull Property pr_TemplateBinding_ownedSubstitutions = createProperty(PivotPackage.Literals.TEMPLATE_BINDING__OWNED_SUBSTITUTIONS, _Set_TemplateParameterSubstitution);
		private final @NonNull Property pr_TemplateBinding_owningElement = createProperty(PivotPackage.Literals.TEMPLATE_BINDING__OWNING_ELEMENT, _TemplateableElement);
		private final @NonNull Property pr_TemplateBinding_templateSignature = createProperty(PivotPackage.Literals.TEMPLATE_BINDING__TEMPLATE_SIGNATURE, _TemplateSignature);
		private final @NonNull Property pr_TemplateParameter_constrainingClasses = createProperty(PivotPackage.Literals.TEMPLATE_PARAMETER__CONSTRAINING_CLASSES, _Set_Class);
		private final @NonNull Property pr_TemplateParameter_owningSignature = createProperty(PivotPackage.Literals.TEMPLATE_PARAMETER__OWNING_SIGNATURE, _TemplateSignature);
		private final @NonNull Property pr_TemplateParameter_TemplateParameterSubstitution_formal = createProperty("TemplateParameterSubstitution", _Bag_TemplateParameterSubstitution);
		private final @NonNull Property pr_TemplateParameterSubstitution_actual = createProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, _Type);
		private final @NonNull Property pr_TemplateParameterSubstitution_formal = createProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, _TemplateParameter);
		private final @NonNull Property pr_TemplateParameterSubstitution_ownedWildcard = createProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_WILDCARD, _WildcardType);
		private final @NonNull Property pr_TemplateParameterSubstitution_owningBinding = createProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNING_BINDING, _TemplateBinding);
		private final @NonNull Property pr_TemplateSignature_ownedParameters = createProperty(PivotPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETERS, _OrderedSet_TemplateParameter);
		private final @NonNull Property pr_TemplateSignature_owningElement = createProperty(PivotPackage.Literals.TEMPLATE_SIGNATURE__OWNING_ELEMENT, _TemplateableElement);
		private final @NonNull Property pr_TemplateSignature_TemplateBinding_templateSignature = createProperty("TemplateBinding", _Bag_TemplateBinding);
		private final @NonNull Property pr_TemplateableElement_ownedBindings = createProperty(PivotPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_BINDINGS, _Set_TemplateBinding);
		private final @NonNull Property pr_TemplateableElement_ownedSignature = createProperty(PivotPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_SIGNATURE, _TemplateSignature);
		private final @NonNull Property pr_TemplateableElement_unspecializedElement = createProperty(PivotPackage.Literals.TEMPLATEABLE_ELEMENT__UNSPECIALIZED_ELEMENT, _TemplateableElement);
		private final @NonNull Property pr_Transition_kind = createProperty(PivotPackage.Literals.TRANSITION__KIND, _TransitionKind);
		private final @NonNull Property pr_Transition_ownedEffect = createProperty(PivotPackage.Literals.TRANSITION__OWNED_EFFECT, _Behavior);
		private final @NonNull Property pr_Transition_ownedGuard = createProperty(PivotPackage.Literals.TRANSITION__OWNED_GUARD, _Constraint);
		private final @NonNull Property pr_Transition_ownedTriggers = createProperty(PivotPackage.Literals.TRANSITION__OWNED_TRIGGERS, _Set_Trigger);
		private final @NonNull Property pr_Transition_owningRegion = createProperty(PivotPackage.Literals.TRANSITION__OWNING_REGION, _Region);
		private final @NonNull Property pr_Transition_source = createProperty(PivotPackage.Literals.TRANSITION__SOURCE, _Vertex);
		private final @NonNull Property pr_Transition_target = createProperty(PivotPackage.Literals.TRANSITION__TARGET, _Vertex);
		private final @NonNull Property pr_Trigger_owningState = createProperty(PivotPackage.Literals.TRIGGER__OWNING_STATE, _State);
		private final @NonNull Property pr_Trigger_owningTransition = createProperty(PivotPackage.Literals.TRIGGER__OWNING_TRANSITION, _Transition);
		private final @NonNull Property pr_TupleLiteralExp_ownedParts = createProperty(PivotPackage.Literals.TUPLE_LITERAL_EXP__OWNED_PARTS, _OrderedSet_TupleLiteralPart);
		private final @NonNull Property pr_TupleLiteralPart_ownedInit = createProperty(PivotPackage.Literals.TUPLE_LITERAL_PART__OWNED_INIT, _OCLExpression);
		private final @NonNull Property pr_TupleLiteralPart_TupleLiteralExp_ownedParts = createProperty("TupleLiteralExp", _TupleLiteralExp);
		private final @NonNull Property pr_Type_CollectionType_elementType = createProperty("CollectionType", _Bag_CollectionType);
		private final @NonNull Property pr_Type_DynamicElement_metaType = createProperty("DynamicElement", _Bag_DynamicElement);
		private final @NonNull Property pr_Type_LambdaType_contextType = createProperty("LambdaType", _Bag_LambdaType);
		private final @NonNull Property pr_Type_LambdaType_parameterType = createProperty("LambdaType", _Bag_LambdaType);
		private final @NonNull Property pr_Type_LambdaType_resultType = createProperty("LambdaType", _Bag_LambdaType);
		private final @NonNull Property pr_Type_MapType_keyType = createProperty("MapType", _Bag_MapType);
		private final @NonNull Property pr_Type_MapType_valueType = createProperty("MapType", _Bag_MapType);
		private final @NonNull Property pr_Type_Operation_raisedExceptions = createProperty("Operation", _Bag_Operation);
		private final @NonNull Property pr_Type_TemplateParameterSubstitution_actual = createProperty("TemplateParameterSubstitution", _Bag_TemplateParameterSubstitution);
		private final @NonNull Property pr_Type_TypeExp_referredType = createProperty("TypeExp", _Bag_TypeExp);
		private final @NonNull Property pr_Type_TypedElement_type = createProperty("TypedElement", _Bag_TypedElement);
		private final @NonNull Property pr_Type_WildcardType_lowerBound = createProperty("WildcardType", _Bag_WildcardType);
		private final @NonNull Property pr_Type_WildcardType_upperBound = createProperty("WildcardType", _Bag_WildcardType);
		private final @NonNull Property pr_TypeExp_referredType = createProperty(PivotPackage.Literals.TYPE_EXP__REFERRED_TYPE, _Type);
		private final @NonNull Property pr_TypedElement_isMany = createProperty(PivotPackage.Literals.TYPED_ELEMENT__IS_MANY, _Boolean);
		private final @NonNull Property pr_TypedElement_isRequired = createProperty(PivotPackage.Literals.TYPED_ELEMENT__IS_REQUIRED, _Boolean);
		private final @NonNull Property pr_TypedElement_type = createProperty(PivotPackage.Literals.TYPED_ELEMENT__TYPE, _Type);
		private final @NonNull Property pr_UnlimitedNaturalLiteralExp_unlimitedNaturalSymbol = createProperty(PivotPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED_NATURAL_SYMBOL, _UnlimitedNatural);
		private final @NonNull Property pr_ValueSpecification_Slot_ownedValues = createProperty("Slot", _Slot);
		private final @NonNull Property pr_Variable_isImplicit = createProperty(PivotPackage.Literals.VARIABLE__IS_IMPLICIT, _Boolean);
		private final @NonNull Property pr_Variable_ownedInit = createProperty(PivotPackage.Literals.VARIABLE__OWNED_INIT, _OCLExpression);
		private final @NonNull Property pr_Variable_representedParameter = createProperty(PivotPackage.Literals.VARIABLE__REPRESENTED_PARAMETER, _Parameter);
		private final @NonNull Property pr_Variable_ExpressionInOCL_ownedContext = createProperty("ExpressionInOCL", _ExpressionInOCL);
		private final @NonNull Property pr_Variable_ExpressionInOCL_ownedParameters = createProperty("ExpressionInOCL", _ExpressionInOCL);
		private final @NonNull Property pr_Variable_ExpressionInOCL_ownedResult = createProperty("ExpressionInOCL", _ExpressionInOCL);
		private final @NonNull Property pr_Variable_IterateExp_ownedResult = createProperty("IterateExp", _IterateExp);
		private final @NonNull Property pr_Variable_LetExp_ownedVariable = createProperty("LetExp", _LetExp);
		private final @NonNull Property pr_Variable_LoopExp_ownedIterators = createProperty("LoopExp", _LoopExp);
		private final @NonNull Property pr_VariableDeclaration_typeValue = createProperty(PivotPackage.Literals.VARIABLE_DECLARATION__TYPE_VALUE, _Type);
		private final @NonNull Property pr_VariableDeclaration_VariableExp_referredVariable = createProperty("VariableExp", _Bag_VariableExp);
		private final @NonNull Property pr_VariableExp_isImplicit = createProperty(PivotPackage.Literals.VARIABLE_EXP__IS_IMPLICIT, _Boolean);
		private final @NonNull Property pr_VariableExp_referredVariable = createProperty(PivotPackage.Literals.VARIABLE_EXP__REFERRED_VARIABLE, _VariableDeclaration);
		private final @NonNull Property pr_Vertex_incomingTransitions = createProperty(PivotPackage.Literals.VERTEX__INCOMING_TRANSITIONS, _Set_Transition);
		private final @NonNull Property pr_Vertex_outgoingTransitions = createProperty(PivotPackage.Literals.VERTEX__OUTGOING_TRANSITIONS, _Set_Transition);
		private final @NonNull Property pr_Vertex_owningRegion = createProperty(PivotPackage.Literals.VERTEX__OWNING_REGION, _Region);
		private final @NonNull Property pr_WildcardType_lowerBound = createProperty(PivotPackage.Literals.WILDCARD_TYPE__LOWER_BOUND, _Type);
		private final @NonNull Property pr_WildcardType_upperBound = createProperty(PivotPackage.Literals.WILDCARD_TYPE__UPPER_BOUND, _Type);
		private final @NonNull Property pr_WildcardType_TemplateParameterSubstitution_ownedWildcard = createProperty("TemplateParameterSubstitution", _TemplateParameterSubstitution);
		
		private void installProperties() {
			List<Property> ownedProperties;
			Property property;
		
			ownedProperties = _Annotation.getOwnedProperties();
			ownedProperties.add(property = pr_Annotation_ownedContents);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Element_Annotation_ownedContents);
			ownedProperties.add(property = pr_Annotation_ownedDetails);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Detail_Annotation_ownedDetails);
			ownedProperties.add(property = pr_Annotation_references);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Element_Annotation_references);
		
			ownedProperties = _AssociationClass.getOwnedProperties();
			ownedProperties.add(property = pr_AssociationClass_unownedAttributes);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_associationClass);
			ownedProperties.add(property = pr_AssociationClass_AssociationClassCallExp_referredAssociationClass);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_AssociationClassCallExp_referredAssociationClass);
		
			ownedProperties = _AssociationClassCallExp.getOwnedProperties();
			ownedProperties.add(property = pr_AssociationClassCallExp_referredAssociationClass);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_AssociationClass_AssociationClassCallExp_referredAssociationClass);
		
			ownedProperties = _Behavior.getOwnedProperties();
			ownedProperties.add(property = pr_Behavior_owningTransition);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Transition_ownedEffect);
			ownedProperties.add(property = pr_Behavior_Class_ownedBehaviors);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Class_ownedBehaviors);
			ownedProperties.add(property = pr_Behavior_State_ownedDoActivity);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_State_ownedDoActivity);
			ownedProperties.add(property = pr_Behavior_State_ownedEntry);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_State_ownedEntry);
			ownedProperties.add(property = pr_Behavior_State_ownedExit);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_State_ownedExit);
		
			ownedProperties = _BooleanLiteralExp.getOwnedProperties();
			ownedProperties.add(property = pr_BooleanLiteralExp_booleanSymbol);
			property.setIsResolveProxies(true);
			property.setIsUnsettable(true);
		
			ownedProperties = _CallExp.getOwnedProperties();
			ownedProperties.add(property = pr_CallExp_isImplicit);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_CallExp_isSafe);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_CallExp_ownedSource);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_CallExp_ownedSource);
		
			ownedProperties = _CallOperationAction.getOwnedProperties();
			ownedProperties.add(property = pr_CallOperationAction_operation);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Operation_CallOperationAction_operation);
			ownedProperties.add(property = pr_CallOperationAction_MessageExp_ownedCalledOperation);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_MessageExp_ownedCalledOperation);
		
			ownedProperties = _Class.getOwnedProperties();
			ownedProperties.add(property = pr_Class_extenders);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_StereotypeExtender_class);
			ownedProperties.add(property = pr_Class_instanceClassName);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Class_isAbstract);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Class_isActive);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Class_isInterface);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Class_ownedBehaviors);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Behavior_Class_ownedBehaviors);
			ownedProperties.add(property = pr_Class_ownedInvariants);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Constraint_Class_ownedInvariants);
			ownedProperties.add(property = pr_Class_ownedOperations);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Operation_owningClass);
			ownedProperties.add(property = pr_Class_ownedProperties);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_owningClass);
			ownedProperties.add(property = pr_Class_owningPackage);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Package_ownedClasses);
			ownedProperties.add(property = pr_Class_superClasses);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Class_Class_superClasses);
			ownedProperties.add(property = pr_Class_Class_superClasses);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Class_superClasses);
			ownedProperties.add(property = pr_Class_CompleteClass_partialClasses);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CompleteClass_partialClasses);
			ownedProperties.add(property = pr_Class_DataType_behavioralClass);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_DataType_behavioralClass);
			ownedProperties.add(property = pr_Class_InstanceSpecification_classes);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_InstanceSpecification_classes);
			ownedProperties.add(property = pr_Class_TemplateParameter_constrainingClasses);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TemplateParameter_constrainingClasses);
		
			ownedProperties = _CollectionItem.getOwnedProperties();
			ownedProperties.add(property = pr_CollectionItem_ownedItem);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_CollectionItem_ownedItem);
		
			ownedProperties = _CollectionLiteralExp.getOwnedProperties();
			ownedProperties.add(property = pr_CollectionLiteralExp_kind);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_CollectionLiteralExp_ownedParts);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CollectionLiteralPart_CollectionLiteralExp_ownedParts);
		
			ownedProperties = _CollectionLiteralPart.getOwnedProperties();
			ownedProperties.add(property = pr_CollectionLiteralPart_CollectionLiteralExp_ownedParts);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CollectionLiteralExp_ownedParts);
		
			ownedProperties = _CollectionRange.getOwnedProperties();
			ownedProperties.add(property = pr_CollectionRange_ownedFirst);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_CollectionRange_ownedFirst);
			ownedProperties.add(property = pr_CollectionRange_ownedLast);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_CollectionRange_ownedLast);
		
			ownedProperties = _CollectionType.getOwnedProperties();
			ownedProperties.add(property = pr_CollectionType_elementType);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Type_CollectionType_elementType);
			ownedProperties.add(property = pr_CollectionType_isNullFree);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_CollectionType_lower);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_CollectionType_upper);
			property.setIsResolveProxies(true);
		
			ownedProperties = _Comment.getOwnedProperties();
			ownedProperties.add(property = pr_Comment_annotatedElements);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Element_annotatingComments);
			ownedProperties.add(property = pr_Comment_body);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Comment_owningElement);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Element_ownedComments);
		
			ownedProperties = _CompleteClass.getOwnedProperties();
			ownedProperties.add(property = pr_CompleteClass_owningCompletePackage);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CompletePackage_ownedCompleteClasses);
			ownedProperties.add(property = pr_CompleteClass_partialClasses);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Class_CompleteClass_partialClasses);
		
			ownedProperties = _CompleteEnvironment.getOwnedProperties();
			ownedProperties.add(property = pr_CompleteEnvironment_ownedCompleteModel);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CompleteModel_owningCompleteEnvironment);
			ownedProperties.add(property = pr_CompleteEnvironment_ownedStandardLibrary);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_StandardLibrary_owningCompleteEnvironment);
		
			ownedProperties = _CompleteModel.getOwnedProperties();
			ownedProperties.add(property = pr_CompleteModel_orphanCompletePackage);
			property.setIsDerived(true);
			property.setIsReadOnly(true);
			property.setIsRequired(false);
			property.setIsTransient(true);
			property.setOpposite(pr_OrphanCompletePackage_CompleteModel_orphanCompletePackage);
			ownedProperties.add(property = pr_CompleteModel_ownedCompletePackages);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CompletePackage_owningCompleteModel);
			ownedProperties.add(property = pr_CompleteModel_owningCompleteEnvironment);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CompleteEnvironment_ownedCompleteModel);
			ownedProperties.add(property = pr_CompleteModel_partialModels);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Model_CompleteModel_partialModels);
			ownedProperties.add(property = pr_CompleteModel_primitiveCompletePackage);
			property.setIsDerived(true);
			property.setIsReadOnly(true);
			property.setIsRequired(false);
			property.setIsTransient(true);
			property.setOpposite(pr_PrimitiveCompletePackage_CompleteModel_primitiveCompletePackage);
		
			ownedProperties = _CompletePackage.getOwnedProperties();
			ownedProperties.add(property = pr_CompletePackage_ownedCompleteClasses);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CompleteClass_owningCompletePackage);
			ownedProperties.add(property = pr_CompletePackage_ownedCompletePackages);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CompletePackage_owningCompletePackage);
			ownedProperties.add(property = pr_CompletePackage_owningCompleteModel);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CompleteModel_ownedCompletePackages);
			ownedProperties.add(property = pr_CompletePackage_owningCompletePackage);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CompletePackage_ownedCompletePackages);
			ownedProperties.add(property = pr_CompletePackage_partialPackages);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Package_CompletePackage_partialPackages);
		
			ownedProperties = _ConnectionPointReference.getOwnedProperties();
			ownedProperties.add(property = pr_ConnectionPointReference_entries);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Pseudostate_ConnectionPointReference_entries);
			ownedProperties.add(property = pr_ConnectionPointReference_exits);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Pseudostate_ConnectionPointReference_exits);
			ownedProperties.add(property = pr_ConnectionPointReference_owningState);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_State_ownedConnections);
		
			ownedProperties = _Constraint.getOwnedProperties();
			ownedProperties.add(property = pr_Constraint_constrainedElements);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Element_Constraint_constrainedElements);
			ownedProperties.add(property = pr_Constraint_context);
			property.setIsDerived(true);
			property.setIsReadOnly(true);
			property.setIsRequired(false);
			property.setIsTransient(true);
			property.setIsVolatile(true);
			property.setOpposite(pr_Namespace_Constraint_context);
			ownedProperties.add(property = pr_Constraint_isCallable);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Constraint_ownedSpecification);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_LanguageExpression_owningConstraint);
			ownedProperties.add(property = pr_Constraint_owningPostContext);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Operation_ownedPostconditions);
			ownedProperties.add(property = pr_Constraint_owningPreContext);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Operation_ownedPreconditions);
			ownedProperties.add(property = pr_Constraint_owningState);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_State_ownedStateInvariant);
			ownedProperties.add(property = pr_Constraint_owningTransition);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Transition_ownedGuard);
			ownedProperties.add(property = pr_Constraint_redefinedConstraints);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Constraint_Constraint_redefinedConstraints);
			ownedProperties.add(property = pr_Constraint_Class_ownedInvariants);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Class_ownedInvariants);
			ownedProperties.add(property = pr_Constraint_Constraint_redefinedConstraints);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Constraint_redefinedConstraints);
			ownedProperties.add(property = pr_Constraint_Namespace_ownedConstraints);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Namespace_ownedConstraints);
		
			ownedProperties = _DataType.getOwnedProperties();
			ownedProperties.add(property = pr_DataType_behavioralClass);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Class_DataType_behavioralClass);
			ownedProperties.add(property = pr_DataType_isSerializable);
			property.setIsResolveProxies(true);
		
			ownedProperties = _Detail.getOwnedProperties();
			ownedProperties.add(property = pr_Detail_values);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Detail_Annotation_ownedDetails);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Annotation_ownedDetails);
		
			ownedProperties = _DynamicElement.getOwnedProperties();
			ownedProperties.add(property = pr_DynamicElement_metaType);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Type_DynamicElement_metaType);
		
			ownedProperties = _DynamicProperty.getOwnedProperties();
			ownedProperties.add(property = pr_DynamicProperty_default);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_DynamicProperty_referredProperty);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_DynamicProperty_referredProperty);
			ownedProperties.add(property = pr_DynamicProperty_DynamicType_ownedDynamicProperties);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_DynamicType_ownedDynamicProperties);
		
			ownedProperties = _DynamicType.getOwnedProperties();
			ownedProperties.add(property = pr_DynamicType_ownedDynamicProperties);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_DynamicProperty_DynamicType_ownedDynamicProperties);
		
			ownedProperties = _Element.getOwnedProperties();
			ownedProperties.add(property = pr_Element_annotatingComments);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Comment_annotatedElements);
			ownedProperties.add(property = pr_Element_ownedAnnotations);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Element_Element_ownedAnnotations);
			ownedProperties.add(property = pr_Element_ownedComments);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Comment_owningElement);
			ownedProperties.add(property = pr_Element_ownedExtensions);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ElementExtension_base);
			ownedProperties.add(property = pr_Element_Annotation_ownedContents);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Annotation_ownedContents);
			ownedProperties.add(property = pr_Element_Annotation_references);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Annotation_references);
			ownedProperties.add(property = pr_Element_Constraint_constrainedElements);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Constraint_constrainedElements);
			ownedProperties.add(property = pr_Element_Element_ownedAnnotations);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Element_ownedAnnotations);
		
			ownedProperties = _ElementExtension.getOwnedProperties();
			ownedProperties.add(property = pr_ElementExtension_base);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Element_ownedExtensions);
			ownedProperties.add(property = pr_ElementExtension_isApplied);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_ElementExtension_isRequired);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_ElementExtension_stereotype);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Stereotype_ElementExtension_stereotype);
		
			ownedProperties = _EnumLiteralExp.getOwnedProperties();
			ownedProperties.add(property = pr_EnumLiteralExp_referredLiteral);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_EnumerationLiteral_EnumLiteralExp_referredLiteral);
		
			ownedProperties = _Enumeration.getOwnedProperties();
			ownedProperties.add(property = pr_Enumeration_ownedLiterals);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_EnumerationLiteral_owningEnumeration);
		
			ownedProperties = _EnumerationLiteral.getOwnedProperties();
			ownedProperties.add(property = pr_EnumerationLiteral_owningEnumeration);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Enumeration_ownedLiterals);
			ownedProperties.add(property = pr_EnumerationLiteral_value);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_EnumerationLiteral_EnumLiteralExp_referredLiteral);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_EnumLiteralExp_referredLiteral);
		
			ownedProperties = _ExpressionInOCL.getOwnedProperties();
			ownedProperties.add(property = pr_ExpressionInOCL_ownedBody);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_ExpressionInOCL_ownedBody);
			ownedProperties.add(property = pr_ExpressionInOCL_ownedContext);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Variable_ExpressionInOCL_ownedContext);
			ownedProperties.add(property = pr_ExpressionInOCL_ownedParameters);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Variable_ExpressionInOCL_ownedParameters);
			ownedProperties.add(property = pr_ExpressionInOCL_ownedResult);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Variable_ExpressionInOCL_ownedResult);
		
			ownedProperties = _Feature.getOwnedProperties();
			ownedProperties.add(property = pr_Feature_implementation);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setIsTransient(true);
			ownedProperties.add(property = pr_Feature_implementationClass);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Feature_isStatic);
			property.setIsResolveProxies(true);
		
			ownedProperties = _FeatureCallExp.getOwnedProperties();
			ownedProperties.add(property = pr_FeatureCallExp_isPre);
			property.setIsResolveProxies(true);
		
			ownedProperties = _IfExp.getOwnedProperties();
			ownedProperties.add(property = pr_IfExp_ownedCondition);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_IfExp_ownedCondition);
			ownedProperties.add(property = pr_IfExp_ownedElse);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_IfExp_ownedElse);
			ownedProperties.add(property = pr_IfExp_ownedThen);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_IfExp_ownedThen);
		
			ownedProperties = _Import.getOwnedProperties();
			ownedProperties.add(property = pr_Import_importedNamespace);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Namespace_Import_importedNamespace);
			ownedProperties.add(property = pr_Import_Model_ownedImports);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Model_ownedImports);
		
			ownedProperties = _InstanceSpecification.getOwnedProperties();
			ownedProperties.add(property = pr_InstanceSpecification_classes);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Class_InstanceSpecification_classes);
			ownedProperties.add(property = pr_InstanceSpecification_ownedSlots);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Slot_owningInstance);
			ownedProperties.add(property = pr_InstanceSpecification_ownedSpecification);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_LanguageExpression_InstanceSpecification_ownedSpecification);
			ownedProperties.add(property = pr_InstanceSpecification_owningPackage);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Package_ownedInstances);
		
			ownedProperties = _IntegerLiteralExp.getOwnedProperties();
			ownedProperties.add(property = pr_IntegerLiteralExp_integerSymbol);
			property.setIsResolveProxies(true);
		
			ownedProperties = _IterateExp.getOwnedProperties();
			ownedProperties.add(property = pr_IterateExp_ownedResult);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Variable_IterateExp_ownedResult);
		
			ownedProperties = _Iteration.getOwnedProperties();
			ownedProperties.add(property = pr_Iteration_ownedAccumulators);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Parameter_Iteration_ownedAccumulators);
			ownedProperties.add(property = pr_Iteration_ownedIterators);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Parameter_Iteration_ownedIterators);
			ownedProperties.add(property = pr_Iteration_LoopExp_referredIteration);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_LoopExp_referredIteration);
		
			ownedProperties = _LambdaType.getOwnedProperties();
			ownedProperties.add(property = pr_LambdaType_contextType);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Type_LambdaType_contextType);
			ownedProperties.add(property = pr_LambdaType_parameterType);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Type_LambdaType_parameterType);
			ownedProperties.add(property = pr_LambdaType_resultType);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Type_LambdaType_resultType);
		
			ownedProperties = _LanguageExpression.getOwnedProperties();
			ownedProperties.add(property = pr_LanguageExpression_body);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_LanguageExpression_language);
			property.setIsDerived(true);
			property.setIsReadOnly(true);
			property.setIsResolveProxies(true);
			property.setIsTransient(true);
			property.setIsVolatile(true);
			ownedProperties.add(property = pr_LanguageExpression_owningConstraint);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Constraint_ownedSpecification);
			ownedProperties.add(property = pr_LanguageExpression_InstanceSpecification_ownedSpecification);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_InstanceSpecification_ownedSpecification);
			ownedProperties.add(property = pr_LanguageExpression_Operation_bodyExpression);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Operation_bodyExpression);
			ownedProperties.add(property = pr_LanguageExpression_Property_ownedExpression);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_ownedExpression);
		
			ownedProperties = _LetExp.getOwnedProperties();
			ownedProperties.add(property = pr_LetExp_ownedIn);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_LetExp_ownedIn);
			ownedProperties.add(property = pr_LetExp_ownedVariable);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Variable_LetExp_ownedVariable);
		
			ownedProperties = _Library.getOwnedProperties();
			ownedProperties.add(property = pr_Library_ownedPrecedences);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Precedence_Library_ownedPrecedences);
		
			ownedProperties = _LoopExp.getOwnedProperties();
			ownedProperties.add(property = pr_LoopExp_ownedBody);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_LoopExp_ownedBody);
			ownedProperties.add(property = pr_LoopExp_ownedIterators);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Variable_LoopExp_ownedIterators);
			ownedProperties.add(property = pr_LoopExp_referredIteration);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Iteration_LoopExp_referredIteration);
		
			ownedProperties = _MapLiteralExp.getOwnedProperties();
			ownedProperties.add(property = pr_MapLiteralExp_ownedParts);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_MapLiteralPart_MapLiteralExp_ownedParts);
		
			ownedProperties = _MapLiteralPart.getOwnedProperties();
			ownedProperties.add(property = pr_MapLiteralPart_ownedKey);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_MapLiteralPart_ownedKey);
			ownedProperties.add(property = pr_MapLiteralPart_ownedValue);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_MapLiteralPart_ownedValue);
			ownedProperties.add(property = pr_MapLiteralPart_MapLiteralExp_ownedParts);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_MapLiteralExp_ownedParts);
		
			ownedProperties = _MapType.getOwnedProperties();
			ownedProperties.add(property = pr_MapType_keyType);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Type_MapType_keyType);
			ownedProperties.add(property = pr_MapType_valueType);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Type_MapType_valueType);
		
			ownedProperties = _MessageExp.getOwnedProperties();
			ownedProperties.add(property = pr_MessageExp_ownedArguments);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_MessageExp_ownedArguments);
			ownedProperties.add(property = pr_MessageExp_ownedCalledOperation);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CallOperationAction_MessageExp_ownedCalledOperation);
			ownedProperties.add(property = pr_MessageExp_ownedSentSignal);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_SendSignalAction_MessageExp_ownedSentSignal);
			ownedProperties.add(property = pr_MessageExp_ownedTarget);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_MessageExp_ownedTarget);
		
			ownedProperties = _MessageType.getOwnedProperties();
			ownedProperties.add(property = pr_MessageType_referredOperation);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Operation_MessageType_referredOperation);
			ownedProperties.add(property = pr_MessageType_referredSignal);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Signal_MessageType_referredSignal);
		
			ownedProperties = _Model.getOwnedProperties();
			ownedProperties.add(property = pr_Model_externalURI);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Model_ownedImports);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Import_Model_ownedImports);
			ownedProperties.add(property = pr_Model_ownedPackages);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Package_Model_ownedPackages);
			ownedProperties.add(property = pr_Model_CompleteModel_partialModels);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CompleteModel_partialModels);
		
			ownedProperties = _NamedElement.getOwnedProperties();
			ownedProperties.add(property = pr_NamedElement_name);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
		
			ownedProperties = _Namespace.getOwnedProperties();
			ownedProperties.add(property = pr_Namespace_ownedConstraints);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Constraint_Namespace_ownedConstraints);
			ownedProperties.add(property = pr_Namespace_Constraint_context);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Constraint_context);
			ownedProperties.add(property = pr_Namespace_Import_importedNamespace);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Import_importedNamespace);
		
			ownedProperties = _NavigationCallExp.getOwnedProperties();
			ownedProperties.add(property = pr_NavigationCallExp_navigationSource);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_NavigationCallExp_navigationSource);
			ownedProperties.add(property = pr_NavigationCallExp_qualifiers);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_NavigationCallExp_qualifiers);
		
			ownedProperties = _OCLExpression.getOwnedProperties();
			ownedProperties.add(property = pr_OCLExpression_typeValue);
			property.setIsRequired(false);
			property.setIsTransient(true);
			ownedProperties.add(property = pr_OCLExpression_CallExp_ownedSource);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CallExp_ownedSource);
			ownedProperties.add(property = pr_OCLExpression_CollectionItem_ownedItem);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CollectionItem_ownedItem);
			ownedProperties.add(property = pr_OCLExpression_CollectionRange_ownedFirst);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CollectionRange_ownedFirst);
			ownedProperties.add(property = pr_OCLExpression_CollectionRange_ownedLast);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CollectionRange_ownedLast);
			ownedProperties.add(property = pr_OCLExpression_ExpressionInOCL_ownedBody);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ExpressionInOCL_ownedBody);
			ownedProperties.add(property = pr_OCLExpression_IfExp_ownedCondition);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_IfExp_ownedCondition);
			ownedProperties.add(property = pr_OCLExpression_IfExp_ownedElse);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_IfExp_ownedElse);
			ownedProperties.add(property = pr_OCLExpression_IfExp_ownedThen);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_IfExp_ownedThen);
			ownedProperties.add(property = pr_OCLExpression_LetExp_ownedIn);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_LetExp_ownedIn);
			ownedProperties.add(property = pr_OCLExpression_LoopExp_ownedBody);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_LoopExp_ownedBody);
			ownedProperties.add(property = pr_OCLExpression_MapLiteralPart_ownedKey);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_MapLiteralPart_ownedKey);
			ownedProperties.add(property = pr_OCLExpression_MapLiteralPart_ownedValue);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_MapLiteralPart_ownedValue);
			ownedProperties.add(property = pr_OCLExpression_MessageExp_ownedArguments);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_MessageExp_ownedArguments);
			ownedProperties.add(property = pr_OCLExpression_MessageExp_ownedTarget);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_MessageExp_ownedTarget);
			ownedProperties.add(property = pr_OCLExpression_NavigationCallExp_qualifiers);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_NavigationCallExp_qualifiers);
			ownedProperties.add(property = pr_OCLExpression_OperationCallExp_ownedArguments);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OperationCallExp_ownedArguments);
			ownedProperties.add(property = pr_OCLExpression_ShadowPart_ownedInit);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ShadowPart_ownedInit);
			ownedProperties.add(property = pr_OCLExpression_TupleLiteralPart_ownedInit);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TupleLiteralPart_ownedInit);
			ownedProperties.add(property = pr_OCLExpression_Variable_ownedInit);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Variable_ownedInit);
		
			ownedProperties = _Operation.getOwnedProperties();
			ownedProperties.add(property = pr_Operation_bodyExpression);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_LanguageExpression_Operation_bodyExpression);
			ownedProperties.add(property = pr_Operation_isInvalidating);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Operation_isTypeof);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Operation_isValidating);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Operation_ownedParameters);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Parameter_owningOperation);
			ownedProperties.add(property = pr_Operation_ownedPostconditions);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Constraint_owningPostContext);
			ownedProperties.add(property = pr_Operation_ownedPreconditions);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Constraint_owningPreContext);
			ownedProperties.add(property = pr_Operation_owningClass);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Class_ownedOperations);
			ownedProperties.add(property = pr_Operation_precedence);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Precedence_Operation_precedence);
			ownedProperties.add(property = pr_Operation_raisedExceptions);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Type_Operation_raisedExceptions);
			ownedProperties.add(property = pr_Operation_redefinedOperations);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Operation_Operation_redefinedOperations);
			ownedProperties.add(property = pr_Operation_CallOperationAction_operation);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CallOperationAction_operation);
			ownedProperties.add(property = pr_Operation_MessageType_referredOperation);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_MessageType_referredOperation);
			ownedProperties.add(property = pr_Operation_Operation_redefinedOperations);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Operation_redefinedOperations);
			ownedProperties.add(property = pr_Operation_OperationCallExp_referredOperation);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OperationCallExp_referredOperation);
			ownedProperties.add(property = pr_Operation_PrimitiveType_coercions);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_PrimitiveType_coercions);
		
			ownedProperties = _OperationCallExp.getOwnedProperties();
			ownedProperties.add(property = pr_OperationCallExp_ownedArguments);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_OperationCallExp_ownedArguments);
			ownedProperties.add(property = pr_OperationCallExp_referredOperation);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Operation_OperationCallExp_referredOperation);
		
			ownedProperties = _OppositePropertyCallExp.getOwnedProperties();
			ownedProperties.add(property = pr_OppositePropertyCallExp_referredProperty);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_OppositePropertyCallExp_referredProperty);
		
			ownedProperties = _OrphanCompletePackage.getOwnedProperties();
			ownedProperties.add(property = pr_OrphanCompletePackage_CompleteModel_orphanCompletePackage);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CompleteModel_orphanCompletePackage);
		
			ownedProperties = _Package.getOwnedProperties();
			ownedProperties.add(property = pr_Package_URI);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Package_importedPackages);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Package_Package_importedPackages);
			ownedProperties.add(property = pr_Package_nsPrefix);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Package_ownedClasses);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Class_owningPackage);
			ownedProperties.add(property = pr_Package_ownedInstances);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_InstanceSpecification_owningPackage);
			ownedProperties.add(property = pr_Package_ownedPackages);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Package_owningPackage);
			ownedProperties.add(property = pr_Package_ownedProfileApplications);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ProfileApplication_owningPackage);
			ownedProperties.add(property = pr_Package_owningPackage);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Package_ownedPackages);
			ownedProperties.add(property = pr_Package_CompletePackage_partialPackages);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CompletePackage_partialPackages);
			ownedProperties.add(property = pr_Package_Model_ownedPackages);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Model_ownedPackages);
			ownedProperties.add(property = pr_Package_Package_importedPackages);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Package_importedPackages);
		
			ownedProperties = _Parameter.getOwnedProperties();
			ownedProperties.add(property = pr_Parameter_isTypeof);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Parameter_owningOperation);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Operation_ownedParameters);
			ownedProperties.add(property = pr_Parameter_Iteration_ownedAccumulators);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Iteration_ownedAccumulators);
			ownedProperties.add(property = pr_Parameter_Iteration_ownedIterators);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Iteration_ownedIterators);
			ownedProperties.add(property = pr_Parameter_Variable_representedParameter);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Variable_representedParameter);
		
			ownedProperties = _Precedence.getOwnedProperties();
			ownedProperties.add(property = pr_Precedence_associativity);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Precedence_order);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Precedence_Library_ownedPrecedences);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Library_ownedPrecedences);
			ownedProperties.add(property = pr_Precedence_Operation_precedence);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Operation_precedence);
		
			ownedProperties = _PrimitiveCompletePackage.getOwnedProperties();
			ownedProperties.add(property = pr_PrimitiveCompletePackage_CompleteModel_primitiveCompletePackage);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CompleteModel_primitiveCompletePackage);
		
			ownedProperties = _PrimitiveType.getOwnedProperties();
			ownedProperties.add(property = pr_PrimitiveType_coercions);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Operation_PrimitiveType_coercions);
		
			ownedProperties = _Profile.getOwnedProperties();
			ownedProperties.add(property = pr_Profile_profileApplications);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ProfileApplication_appliedProfile);
		
			ownedProperties = _ProfileApplication.getOwnedProperties();
			ownedProperties.add(property = pr_ProfileApplication_appliedProfile);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Profile_profileApplications);
			ownedProperties.add(property = pr_ProfileApplication_isStrict);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_ProfileApplication_owningPackage);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Package_ownedProfileApplications);
		
			ownedProperties = _Property.getOwnedProperties();
			ownedProperties.add(property = pr_Property_associationClass);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_AssociationClass_unownedAttributes);
			ownedProperties.add(property = pr_Property_defaultValue);
			property.setIsDerived(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setIsTransient(true);
			ownedProperties.add(property = pr_Property_defaultValueString);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Property_isComposite);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Property_isDerived);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Property_isID);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Property_isImplicit);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Property_isReadOnly);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Property_isResolveProxies);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Property_isTransient);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Property_isUnsettable);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Property_isVolatile);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Property_keys);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_Property_keys);
			ownedProperties.add(property = pr_Property_opposite);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_Property_opposite);
			ownedProperties.add(property = pr_Property_ownedExpression);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_LanguageExpression_Property_ownedExpression);
			ownedProperties.add(property = pr_Property_owningClass);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Class_ownedProperties);
			ownedProperties.add(property = pr_Property_redefinedProperties);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_Property_redefinedProperties);
			ownedProperties.add(property = pr_Property_referredProperty);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_Property_referredProperty);
			ownedProperties.add(property = pr_Property_subsettedProperty);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_Property_subsettedProperty);
			ownedProperties.add(property = pr_Property_DynamicProperty_referredProperty);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_DynamicProperty_referredProperty);
			ownedProperties.add(property = pr_Property_NavigationCallExp_navigationSource);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_NavigationCallExp_navigationSource);
			ownedProperties.add(property = pr_Property_OppositePropertyCallExp_referredProperty);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OppositePropertyCallExp_referredProperty);
			ownedProperties.add(property = pr_Property_Property_keys);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_keys);
			ownedProperties.add(property = pr_Property_Property_opposite);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_opposite);
			ownedProperties.add(property = pr_Property_Property_redefinedProperties);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_redefinedProperties);
			ownedProperties.add(property = pr_Property_Property_referredProperty);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_referredProperty);
			ownedProperties.add(property = pr_Property_Property_subsettedProperty);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_subsettedProperty);
			ownedProperties.add(property = pr_Property_PropertyCallExp_referredProperty);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_PropertyCallExp_referredProperty);
			ownedProperties.add(property = pr_Property_ShadowPart_referredProperty);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ShadowPart_referredProperty);
			ownedProperties.add(property = pr_Property_Slot_definingProperty);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Slot_definingProperty);
		
			ownedProperties = _PropertyCallExp.getOwnedProperties();
			ownedProperties.add(property = pr_PropertyCallExp_referredProperty);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_PropertyCallExp_referredProperty);
		
			ownedProperties = _Pseudostate.getOwnedProperties();
			ownedProperties.add(property = pr_Pseudostate_kind);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Pseudostate_owningState);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_State_ownedConnectionPoints);
			ownedProperties.add(property = pr_Pseudostate_owningStateMachine);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_StateMachine_ownedConnectionPoints);
			ownedProperties.add(property = pr_Pseudostate_ConnectionPointReference_entries);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ConnectionPointReference_entries);
			ownedProperties.add(property = pr_Pseudostate_ConnectionPointReference_exits);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ConnectionPointReference_exits);
		
			ownedProperties = _RealLiteralExp.getOwnedProperties();
			ownedProperties.add(property = pr_RealLiteralExp_realSymbol);
			property.setIsResolveProxies(true);
		
			ownedProperties = _Region.getOwnedProperties();
			ownedProperties.add(property = pr_Region_extendedRegion);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Region_Region_extendedRegion);
			ownedProperties.add(property = pr_Region_ownedSubvertexes);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Vertex_owningRegion);
			ownedProperties.add(property = pr_Region_ownedTransitions);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Transition_owningRegion);
			ownedProperties.add(property = pr_Region_owningState);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_State_ownedRegions);
			ownedProperties.add(property = pr_Region_owningStateMachine);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_StateMachine_ownedRegions);
			ownedProperties.add(property = pr_Region_Region_extendedRegion);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Region_extendedRegion);
		
			ownedProperties = _SendSignalAction.getOwnedProperties();
			ownedProperties.add(property = pr_SendSignalAction_signal);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Signal_SendSignalAction_signal);
			ownedProperties.add(property = pr_SendSignalAction_MessageExp_ownedSentSignal);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_MessageExp_ownedSentSignal);
		
			ownedProperties = _ShadowExp.getOwnedProperties();
			ownedProperties.add(property = pr_ShadowExp_ownedParts);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ShadowPart_ShadowExp_ownedParts);
			ownedProperties.add(property = pr_ShadowExp_value);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
		
			ownedProperties = _ShadowPart.getOwnedProperties();
			ownedProperties.add(property = pr_ShadowPart_ownedInit);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_ShadowPart_ownedInit);
			ownedProperties.add(property = pr_ShadowPart_referredProperty);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_ShadowPart_referredProperty);
			ownedProperties.add(property = pr_ShadowPart_ShadowExp_ownedParts);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ShadowExp_ownedParts);
		
			ownedProperties = _Signal.getOwnedProperties();
			ownedProperties.add(property = pr_Signal_MessageType_referredSignal);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_MessageType_referredSignal);
			ownedProperties.add(property = pr_Signal_SendSignalAction_signal);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_SendSignalAction_signal);
		
			ownedProperties = _Slot.getOwnedProperties();
			ownedProperties.add(property = pr_Slot_definingProperty);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Property_Slot_definingProperty);
			ownedProperties.add(property = pr_Slot_ownedValues);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ValueSpecification_Slot_ownedValues);
			ownedProperties.add(property = pr_Slot_owningInstance);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_InstanceSpecification_ownedSlots);
		
			ownedProperties = _StandardLibrary.getOwnedProperties();
			ownedProperties.add(property = pr_StandardLibrary_owningCompleteEnvironment);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CompleteEnvironment_ownedStandardLibrary);
		
			ownedProperties = _State.getOwnedProperties();
			ownedProperties.add(property = pr_State_isComposite);
			property.setIsDerived(true);
			property.setIsReadOnly(true);
			property.setIsResolveProxies(true);
			property.setIsTransient(true);
			property.setIsVolatile(true);
			ownedProperties.add(property = pr_State_isOrthogonal);
			property.setIsDerived(true);
			property.setIsReadOnly(true);
			property.setIsResolveProxies(true);
			property.setIsTransient(true);
			property.setIsVolatile(true);
			ownedProperties.add(property = pr_State_isSimple);
			property.setIsDerived(true);
			property.setIsReadOnly(true);
			property.setIsResolveProxies(true);
			property.setIsTransient(true);
			property.setIsVolatile(true);
			ownedProperties.add(property = pr_State_isSubmachineState);
			property.setIsDerived(true);
			property.setIsReadOnly(true);
			property.setIsResolveProxies(true);
			property.setIsTransient(true);
			property.setIsVolatile(true);
			ownedProperties.add(property = pr_State_ownedConnectionPoints);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Pseudostate_owningState);
			ownedProperties.add(property = pr_State_ownedConnections);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ConnectionPointReference_owningState);
			ownedProperties.add(property = pr_State_ownedDeferrableTriggers);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Trigger_owningState);
			ownedProperties.add(property = pr_State_ownedDoActivity);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Behavior_State_ownedDoActivity);
			ownedProperties.add(property = pr_State_ownedEntry);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Behavior_State_ownedEntry);
			ownedProperties.add(property = pr_State_ownedExit);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Behavior_State_ownedExit);
			ownedProperties.add(property = pr_State_ownedRegions);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Region_owningState);
			ownedProperties.add(property = pr_State_ownedStateInvariant);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Constraint_owningState);
			ownedProperties.add(property = pr_State_redefinedState);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_State_State_redefinedState);
			ownedProperties.add(property = pr_State_submachines);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_StateMachine_submachineStates);
			ownedProperties.add(property = pr_State_State_redefinedState);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_State_redefinedState);
			ownedProperties.add(property = pr_State_StateExp_referredState);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_StateExp_referredState);
		
			ownedProperties = _StateExp.getOwnedProperties();
			ownedProperties.add(property = pr_StateExp_referredState);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_State_StateExp_referredState);
		
			ownedProperties = _StateMachine.getOwnedProperties();
			ownedProperties.add(property = pr_StateMachine_extendedStateMachines);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_StateMachine_StateMachine_extendedStateMachines);
			ownedProperties.add(property = pr_StateMachine_ownedConnectionPoints);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Pseudostate_owningStateMachine);
			ownedProperties.add(property = pr_StateMachine_ownedRegions);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Region_owningStateMachine);
			ownedProperties.add(property = pr_StateMachine_submachineStates);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_State_submachines);
			ownedProperties.add(property = pr_StateMachine_StateMachine_extendedStateMachines);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_StateMachine_extendedStateMachines);
		
			ownedProperties = _Stereotype.getOwnedProperties();
			ownedProperties.add(property = pr_Stereotype_ownedExtenders);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_StereotypeExtender_owningStereotype);
			ownedProperties.add(property = pr_Stereotype_ElementExtension_stereotype);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ElementExtension_stereotype);
		
			ownedProperties = _StereotypeExtender.getOwnedProperties();
			ownedProperties.add(property = pr_StereotypeExtender_class);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Class_extenders);
			ownedProperties.add(property = pr_StereotypeExtender_isRequired);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_StereotypeExtender_owningStereotype);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Stereotype_ownedExtenders);
		
			ownedProperties = _StringLiteralExp.getOwnedProperties();
			ownedProperties.add(property = pr_StringLiteralExp_stringSymbol);
			property.setIsResolveProxies(true);
		
			ownedProperties = _TemplateBinding.getOwnedProperties();
			ownedProperties.add(property = pr_TemplateBinding_ownedSubstitutions);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TemplateParameterSubstitution_owningBinding);
			ownedProperties.add(property = pr_TemplateBinding_owningElement);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TemplateableElement_ownedBindings);
			ownedProperties.add(property = pr_TemplateBinding_templateSignature);
			property.setIsDerived(true);
			property.setIsReadOnly(true);
			property.setIsTransient(true);
			property.setIsVolatile(true);
			property.setOpposite(pr_TemplateSignature_TemplateBinding_templateSignature);
		
			ownedProperties = _TemplateParameter.getOwnedProperties();
			ownedProperties.add(property = pr_TemplateParameter_constrainingClasses);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Class_TemplateParameter_constrainingClasses);
			ownedProperties.add(property = pr_TemplateParameter_owningSignature);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TemplateSignature_ownedParameters);
			ownedProperties.add(property = pr_TemplateParameter_TemplateParameterSubstitution_formal);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TemplateParameterSubstitution_formal);
		
			ownedProperties = _TemplateParameterSubstitution.getOwnedProperties();
			ownedProperties.add(property = pr_TemplateParameterSubstitution_actual);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Type_TemplateParameterSubstitution_actual);
			ownedProperties.add(property = pr_TemplateParameterSubstitution_formal);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TemplateParameter_TemplateParameterSubstitution_formal);
			ownedProperties.add(property = pr_TemplateParameterSubstitution_ownedWildcard);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_WildcardType_TemplateParameterSubstitution_ownedWildcard);
			ownedProperties.add(property = pr_TemplateParameterSubstitution_owningBinding);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TemplateBinding_ownedSubstitutions);
		
			ownedProperties = _TemplateSignature.getOwnedProperties();
			ownedProperties.add(property = pr_TemplateSignature_ownedParameters);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TemplateParameter_owningSignature);
			ownedProperties.add(property = pr_TemplateSignature_owningElement);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TemplateableElement_ownedSignature);
			ownedProperties.add(property = pr_TemplateSignature_TemplateBinding_templateSignature);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TemplateBinding_templateSignature);
		
			ownedProperties = _TemplateableElement.getOwnedProperties();
			ownedProperties.add(property = pr_TemplateableElement_ownedBindings);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TemplateBinding_owningElement);
			ownedProperties.add(property = pr_TemplateableElement_ownedSignature);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TemplateSignature_owningElement);
			ownedProperties.add(property = pr_TemplateableElement_unspecializedElement);
			property.setIsRequired(false);
			property.setIsTransient(true);
		
			ownedProperties = _Transition.getOwnedProperties();
			ownedProperties.add(property = pr_Transition_kind);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Transition_ownedEffect);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Behavior_owningTransition);
			ownedProperties.add(property = pr_Transition_ownedGuard);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Constraint_owningTransition);
			ownedProperties.add(property = pr_Transition_ownedTriggers);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Trigger_owningTransition);
			ownedProperties.add(property = pr_Transition_owningRegion);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Region_ownedTransitions);
			ownedProperties.add(property = pr_Transition_source);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Vertex_outgoingTransitions);
			ownedProperties.add(property = pr_Transition_target);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Vertex_incomingTransitions);
		
			ownedProperties = _Trigger.getOwnedProperties();
			ownedProperties.add(property = pr_Trigger_owningState);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_State_ownedDeferrableTriggers);
			ownedProperties.add(property = pr_Trigger_owningTransition);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Transition_ownedTriggers);
		
			ownedProperties = _TupleLiteralExp.getOwnedProperties();
			ownedProperties.add(property = pr_TupleLiteralExp_ownedParts);
			property.setIsComposite(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TupleLiteralPart_TupleLiteralExp_ownedParts);
		
			ownedProperties = _TupleLiteralPart.getOwnedProperties();
			ownedProperties.add(property = pr_TupleLiteralPart_ownedInit);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_TupleLiteralPart_ownedInit);
			ownedProperties.add(property = pr_TupleLiteralPart_TupleLiteralExp_ownedParts);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TupleLiteralExp_ownedParts);
		
			ownedProperties = _Type.getOwnedProperties();
			ownedProperties.add(property = pr_Type_CollectionType_elementType);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_CollectionType_elementType);
			ownedProperties.add(property = pr_Type_DynamicElement_metaType);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_DynamicElement_metaType);
			ownedProperties.add(property = pr_Type_LambdaType_contextType);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_LambdaType_contextType);
			ownedProperties.add(property = pr_Type_LambdaType_parameterType);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_LambdaType_parameterType);
			ownedProperties.add(property = pr_Type_LambdaType_resultType);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_LambdaType_resultType);
			ownedProperties.add(property = pr_Type_MapType_keyType);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_MapType_keyType);
			ownedProperties.add(property = pr_Type_MapType_valueType);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_MapType_valueType);
			ownedProperties.add(property = pr_Type_Operation_raisedExceptions);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Operation_raisedExceptions);
			ownedProperties.add(property = pr_Type_TemplateParameterSubstitution_actual);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TemplateParameterSubstitution_actual);
			ownedProperties.add(property = pr_Type_TypeExp_referredType);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TypeExp_referredType);
			ownedProperties.add(property = pr_Type_TypedElement_type);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TypedElement_type);
			ownedProperties.add(property = pr_Type_WildcardType_lowerBound);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_WildcardType_lowerBound);
			ownedProperties.add(property = pr_Type_WildcardType_upperBound);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_WildcardType_upperBound);
		
			ownedProperties = _TypeExp.getOwnedProperties();
			ownedProperties.add(property = pr_TypeExp_referredType);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Type_TypeExp_referredType);
		
			ownedProperties = _TypedElement.getOwnedProperties();
			ownedProperties.add(property = pr_TypedElement_isMany);
			property.setIsDerived(true);
			property.setIsReadOnly(true);
			property.setIsResolveProxies(true);
			property.setIsTransient(true);
			property.setIsVolatile(true);
			ownedProperties.add(property = pr_TypedElement_isRequired);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_TypedElement_type);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Type_TypedElement_type);
		
			ownedProperties = _UnlimitedNaturalLiteralExp.getOwnedProperties();
			ownedProperties.add(property = pr_UnlimitedNaturalLiteralExp_unlimitedNaturalSymbol);
			property.setIsResolveProxies(true);
		
			ownedProperties = _ValueSpecification.getOwnedProperties();
			ownedProperties.add(property = pr_ValueSpecification_Slot_ownedValues);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Slot_ownedValues);
		
			ownedProperties = _Variable.getOwnedProperties();
			ownedProperties.add(property = pr_Variable_isImplicit);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_Variable_ownedInit);
			property.setIsComposite(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_OCLExpression_Variable_ownedInit);
			ownedProperties.add(property = pr_Variable_representedParameter);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Parameter_Variable_representedParameter);
			ownedProperties.add(property = pr_Variable_ExpressionInOCL_ownedContext);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ExpressionInOCL_ownedContext);
			ownedProperties.add(property = pr_Variable_ExpressionInOCL_ownedParameters);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ExpressionInOCL_ownedParameters);
			ownedProperties.add(property = pr_Variable_ExpressionInOCL_ownedResult);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_ExpressionInOCL_ownedResult);
			ownedProperties.add(property = pr_Variable_IterateExp_ownedResult);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_IterateExp_ownedResult);
			ownedProperties.add(property = pr_Variable_LetExp_ownedVariable);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_LetExp_ownedVariable);
			ownedProperties.add(property = pr_Variable_LoopExp_ownedIterators);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_LoopExp_ownedIterators);
		
			ownedProperties = _VariableDeclaration.getOwnedProperties();
			ownedProperties.add(property = pr_VariableDeclaration_typeValue);
			property.setIsRequired(false);
			property.setIsTransient(true);
			ownedProperties.add(property = pr_VariableDeclaration_VariableExp_referredVariable);
			property.setIsImplicit(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_VariableExp_referredVariable);
		
			ownedProperties = _VariableExp.getOwnedProperties();
			ownedProperties.add(property = pr_VariableExp_isImplicit);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			ownedProperties.add(property = pr_VariableExp_referredVariable);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_VariableDeclaration_VariableExp_referredVariable);
		
			ownedProperties = _Vertex.getOwnedProperties();
			ownedProperties.add(property = pr_Vertex_incomingTransitions);
			property.setIsReadOnly(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Transition_target);
			ownedProperties.add(property = pr_Vertex_outgoingTransitions);
			property.setIsReadOnly(true);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Transition_source);
			ownedProperties.add(property = pr_Vertex_owningRegion);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Region_ownedSubvertexes);
		
			ownedProperties = _WildcardType.getOwnedProperties();
			ownedProperties.add(property = pr_WildcardType_lowerBound);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Type_WildcardType_lowerBound);
			ownedProperties.add(property = pr_WildcardType_upperBound);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_Type_WildcardType_upperBound);
			ownedProperties.add(property = pr_WildcardType_TemplateParameterSubstitution_ownedWildcard);
			property.setIsImplicit(true);
			property.setIsRequired(false);
			property.setIsResolveProxies(true);
			property.setOpposite(pr_TemplateParameterSubstitution_ownedWildcard);
		}
		
		private void installTemplateBindings() {
			_Bag_Annotation.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _Annotation)));
			_Bag_AssociationClassCallExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _AssociationClassCallExp)));
			_Bag_CallOperationAction.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _CallOperationAction)));
			_Bag_Class.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _Class)));
			_Bag_CollectionType.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _CollectionType)));
			_Bag_CompleteClass.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _CompleteClass)));
			_Bag_CompleteModel.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _CompleteModel)));
			_Bag_CompletePackage.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _CompletePackage)));
			_Bag_ConnectionPointReference.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _ConnectionPointReference)));
			_Bag_Constraint.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _Constraint)));
			_Bag_DataType.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _DataType)));
			_Bag_DynamicElement.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _DynamicElement)));
			_Bag_DynamicProperty.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _DynamicProperty)));
			_Bag_ElementExtension.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _ElementExtension)));
			_Bag_EnumLiteralExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _EnumLiteralExp)));
			_Bag_Import.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _Import)));
			_Bag_InstanceSpecification.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _InstanceSpecification)));
			_Bag_LambdaType.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _LambdaType)));
			_Bag_LoopExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _LoopExp)));
			_Bag_MapType.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _MapType)));
			_Bag_MessageType.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _MessageType)));
			_Bag_NavigationCallExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _NavigationCallExp)));
			_Bag_OperationCallExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _OperationCallExp)));
			_Bag_Operation.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _Operation)));
			_Bag_OppositePropertyCallExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _OppositePropertyCallExp)));
			_Bag_Package.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _Package)));
			_Bag_PrimitiveType.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _PrimitiveType)));
			_Bag_PropertyCallExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _PropertyCallExp)));
			_Bag_Property.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _Property)));
			_Bag_Region.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _Region)));
			_Bag_SendSignalAction.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _SendSignalAction)));
			_Bag_ShadowPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _ShadowPart)));
			_Bag_Slot.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _Slot)));
			_Bag_StateExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _StateExp)));
			_Bag_StateMachine.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _StateMachine)));
			_Bag_State.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _State)));
			_Bag_TemplateBinding.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _TemplateBinding)));
			_Bag_TemplateParameterSubstitution.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _TemplateParameterSubstitution)));
			_Bag_TemplateParameter.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _TemplateParameter)));
			_Bag_TypeExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _TypeExp)));
			_Bag_TypedElement.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _TypedElement)));
			_Bag_VariableExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _VariableExp)));
			_Bag_Variable.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _Variable)));
			_Bag_WildcardType.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Bag_T, _WildcardType)));
			_Collection_String.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _String)));
			_Collection_Annotation.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Annotation)));
			_Collection_AssociationClassCallExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _AssociationClassCallExp)));
			_Collection_Behavior.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Behavior)));
			_Collection_CallOperationAction.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _CallOperationAction)));
			_Collection_Class.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Class)));
			_Collection_CollectionLiteralPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _CollectionLiteralPart)));
			_Collection_CollectionType.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _CollectionType)));
			_Collection_Comment.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Comment)));
			_Collection_CompleteClass.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _CompleteClass)));
			_Collection_CompleteModel.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _CompleteModel)));
			_Collection_CompletePackage.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _CompletePackage)));
			_Collection_ConnectionPointReference.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _ConnectionPointReference)));
			_Collection_Constraint.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Constraint)));
			_Collection_DataType.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _DataType)));
			_Collection_Detail.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Detail)));
			_Collection_DynamicElement.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _DynamicElement)));
			_Collection_DynamicProperty.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _DynamicProperty)));
			_Collection_ElementExtension.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _ElementExtension)));
			_Collection_Element.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Element)));
			_Collection_EnumLiteralExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _EnumLiteralExp)));
			_Collection_EnumerationLiteral.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _EnumerationLiteral)));
			_Collection_Import.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Import)));
			_Collection_InstanceSpecification.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _InstanceSpecification)));
			_Collection_LambdaType.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _LambdaType)));
			_Collection_LoopExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _LoopExp)));
			_Collection_MapLiteralPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _MapLiteralPart)));
			_Collection_MapType.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _MapType)));
			_Collection_MessageType.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _MessageType)));
			_Collection_Model.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Model)));
			_Collection_NavigationCallExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _NavigationCallExp)));
			_Collection_OCLExpression.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _OCLExpression)));
			_Collection_OperationCallExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _OperationCallExp)));
			_Collection_Operation.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Operation)));
			_Collection_OppositePropertyCallExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _OppositePropertyCallExp)));
			_Collection_Package.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Package)));
			_Collection_Parameter.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Parameter)));
			_Collection_Precedence.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Precedence)));
			_Collection_PrimitiveType.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _PrimitiveType)));
			_Collection_ProfileApplication.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _ProfileApplication)));
			_Collection_PropertyCallExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _PropertyCallExp)));
			_Collection_Property.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Property)));
			_Collection_Pseudostate.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Pseudostate)));
			_Collection_Region.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Region)));
			_Collection_SendSignalAction.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _SendSignalAction)));
			_Collection_ShadowPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _ShadowPart)));
			_Collection_Slot.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Slot)));
			_Collection_StateExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _StateExp)));
			_Collection_StateMachine.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _StateMachine)));
			_Collection_State.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _State)));
			_Collection_StereotypeExtender.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _StereotypeExtender)));
			_Collection_TemplateBinding.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _TemplateBinding)));
			_Collection_TemplateParameterSubstitution.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _TemplateParameterSubstitution)));
			_Collection_TemplateParameter.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _TemplateParameter)));
			_Collection_Transition.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Transition)));
			_Collection_Trigger.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Trigger)));
			_Collection_TupleLiteralPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _TupleLiteralPart)));
			_Collection_TypeExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _TypeExp)));
			_Collection_Type.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Type)));
			_Collection_TypedElement.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _TypedElement)));
			_Collection_ValueSpecification.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _ValueSpecification)));
			_Collection_VariableExp.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _VariableExp)));
			_Collection_Variable.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Variable)));
			_Collection_Vertex.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _Vertex)));
			_Collection_WildcardType.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Collection_T, _WildcardType)));
			_OrderedCollection_CollectionLiteralPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _CollectionLiteralPart)));
			_OrderedCollection_Detail.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _Detail)));
			_OrderedCollection_Element.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _Element)));
			_OrderedCollection_EnumerationLiteral.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _EnumerationLiteral)));
			_OrderedCollection_Import.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _Import)));
			_OrderedCollection_MapLiteralPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _MapLiteralPart)));
			_OrderedCollection_OCLExpression.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _OCLExpression)));
			_OrderedCollection_Operation.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _Operation)));
			_OrderedCollection_Parameter.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _Parameter)));
			_OrderedCollection_Precedence.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _Precedence)));
			_OrderedCollection_Property.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _Property)));
			_OrderedCollection_ShadowPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _ShadowPart)));
			_OrderedCollection_TemplateParameter.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _TemplateParameter)));
			_OrderedCollection_TupleLiteralPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _TupleLiteralPart)));
			_OrderedCollection_Type.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _Type)));
			_OrderedCollection_ValueSpecification.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _ValueSpecification)));
			_OrderedCollection_Variable.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedCollection_T, _Variable)));
			_OrderedSet_CollectionLiteralPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _CollectionLiteralPart)));
			_OrderedSet_Detail.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _Detail)));
			_OrderedSet_Element.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _Element)));
			_OrderedSet_EnumerationLiteral.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _EnumerationLiteral)));
			_OrderedSet_Import.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _Import)));
			_OrderedSet_MapLiteralPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _MapLiteralPart)));
			_OrderedSet_OCLExpression.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _OCLExpression)));
			_OrderedSet_Operation.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _Operation)));
			_OrderedSet_Parameter.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _Parameter)));
			_OrderedSet_Precedence.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _Precedence)));
			_OrderedSet_Property.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _Property)));
			_OrderedSet_ShadowPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _ShadowPart)));
			_OrderedSet_TemplateParameter.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _TemplateParameter)));
			_OrderedSet_TupleLiteralPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _TupleLiteralPart)));
			_OrderedSet_ValueSpecification.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _ValueSpecification)));
			_OrderedSet_Variable.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_OrderedSet_T, _Variable)));
			_Sequence_Type.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Sequence_T, _Type)));
			_Set_String.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _String)));
			_Set_Behavior.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Behavior)));
			_Set_Class.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Class)));
			_Set_Comment.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Comment)));
			_Set_CompleteClass.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _CompleteClass)));
			_Set_CompletePackage.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _CompletePackage)));
			_Set_ConnectionPointReference.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _ConnectionPointReference)));
			_Set_Constraint.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Constraint)));
			_Set_DynamicProperty.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _DynamicProperty)));
			_Set_ElementExtension.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _ElementExtension)));
			_Set_Element.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Element)));
			_Set_InstanceSpecification.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _InstanceSpecification)));
			_Set_Model.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Model)));
			_Set_Operation.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Operation)));
			_Set_Package.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Package)));
			_Set_ProfileApplication.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _ProfileApplication)));
			_Set_Property.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Property)));
			_Set_Pseudostate.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Pseudostate)));
			_Set_Region.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Region)));
			_Set_Region_1.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Region)));
			_Set_Slot.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Slot)));
			_Set_StateMachine.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _StateMachine)));
			_Set_State.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _State)));
			_Set_StereotypeExtender.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _StereotypeExtender)));
			_Set_TemplateBinding.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _TemplateBinding)));
			_Set_TemplateParameterSubstitution.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _TemplateParameterSubstitution)));
			_Set_Transition.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Transition)));
			_Set_Trigger.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Trigger)));
			_Set_Type.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Type)));
			_Set_Vertex.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_Set_T, _Vertex)));
			_UniqueCollection_String.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _String)));
			_UniqueCollection_Behavior.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Behavior)));
			_UniqueCollection_Class.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Class)));
			_UniqueCollection_CollectionLiteralPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _CollectionLiteralPart)));
			_UniqueCollection_Comment.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Comment)));
			_UniqueCollection_CompleteClass.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _CompleteClass)));
			_UniqueCollection_CompletePackage.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _CompletePackage)));
			_UniqueCollection_ConnectionPointReference.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _ConnectionPointReference)));
			_UniqueCollection_Constraint.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Constraint)));
			_UniqueCollection_Detail.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Detail)));
			_UniqueCollection_DynamicProperty.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _DynamicProperty)));
			_UniqueCollection_ElementExtension.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _ElementExtension)));
			_UniqueCollection_Element.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Element)));
			_UniqueCollection_EnumerationLiteral.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _EnumerationLiteral)));
			_UniqueCollection_Import.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Import)));
			_UniqueCollection_InstanceSpecification.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _InstanceSpecification)));
			_UniqueCollection_MapLiteralPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _MapLiteralPart)));
			_UniqueCollection_Model.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Model)));
			_UniqueCollection_OCLExpression.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _OCLExpression)));
			_UniqueCollection_Operation.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Operation)));
			_UniqueCollection_Package.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Package)));
			_UniqueCollection_Parameter.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Parameter)));
			_UniqueCollection_Precedence.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Precedence)));
			_UniqueCollection_ProfileApplication.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _ProfileApplication)));
			_UniqueCollection_Property.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Property)));
			_UniqueCollection_Pseudostate.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Pseudostate)));
			_UniqueCollection_Region.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Region)));
			_UniqueCollection_ShadowPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _ShadowPart)));
			_UniqueCollection_Slot.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Slot)));
			_UniqueCollection_StateMachine.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _StateMachine)));
			_UniqueCollection_State.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _State)));
			_UniqueCollection_StereotypeExtender.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _StereotypeExtender)));
			_UniqueCollection_TemplateBinding.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _TemplateBinding)));
			_UniqueCollection_TemplateParameterSubstitution.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _TemplateParameterSubstitution)));
			_UniqueCollection_TemplateParameter.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _TemplateParameter)));
			_UniqueCollection_Transition.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Transition)));
			_UniqueCollection_Trigger.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Trigger)));
			_UniqueCollection_TupleLiteralPart.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _TupleLiteralPart)));
			_UniqueCollection_Type.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Type)));
			_UniqueCollection_ValueSpecification.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _ValueSpecification)));
			_UniqueCollection_Variable.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Variable)));
			_UniqueCollection_Vertex.getOwnedBindings().add(createTemplateBinding(
				createTemplateParameterSubstitution(_UniqueCollection_T, _Vertex)));
		}
		
		private void installComments() {
			installComment(_AssociationClass, "A link is a tuple of values that refer to typed objects.  An Association classifies a set of links, each of which is an instance of the Association.  Each value in the link refers to an instance of the type of the corresponding end of the Association.\n\nA model element that has both Association and Class properties. An AssociationClass can be seen as an Association that also has Class properties, or as a Class that also has Association properties. It not only connects a set of Classifiers but also defines a set of Features that belong to the Association itself and not to any of the associated Classifiers.");
			installComment(_Behavior, "Behavior is a specification of how its context BehavioredClassifier changes state over time. This specification may be either a definition of possible behavior execution or emergent behavior, or a selective illustration of an interesting subset of possible executions. The latter form is typically used for capturing examples, such as a trace of a particular execution.");
			installComment(_Class, "A Class classifies a set of objects and specifies the features that characterize the structure and behavior of those objects.  A Class may have an internal structure and Ports.\n\nA Classifier represents a classification of instances according to their Features.\n\nStructuredClassifiers may contain an internal structure of connected elements each of which plays a role in the overall Behavior modeled by the StructuredClassifier.");
			installComment(pr_Class_isAbstract, "If true, the Class does not provide a complete declaration and cannot be instantiated. An abstract Class is typically used as a target of Associations or Generalizations.\n\nIf true, the Classifier can only be instantiated by instantiating one of its specializations. An abstract Classifier is intended to be used by other Classifiers e.g., as the target of Associations or Generalizations.");
			installComment(pr_Class_isActive, "Determines whether an object specified by this Class is active or not. If true, then the owning Class is referred to as an active Class. If false, then such a Class is referred to as a passive Class.");
			installComment(pr_Class_ownedBehaviors, "Behaviors owned by a BehavioredClassifier.");
			installComment(pr_Class_ownedOperations, "The Operations owned by the Class.");
			installComment(pr_Class_ownedProperties, "The Properties owned by the StructuredClassifier.\n\nThe attributes (i.e., the Properties) owned by the Class.");
			installComment(_Comment, "A Comment is a textual annotation that can be attached to a set of Elements.");
			installComment(pr_Comment_annotatedElements, "References the Element(s) being commented.");
			installComment(pr_Comment_body, "Specifies a string that is the comment.");
			installComment(_ConnectionPointReference, "A ConnectionPointReference represents a usage (as part of a submachine State) of an entry/exit point Pseudostate defined in the StateMachine referenced by the submachine State.");
			installComment(pr_ConnectionPointReference_entries, "The entryPoint Pseudostates corresponding to this connection point.");
			installComment(pr_ConnectionPointReference_exits, "The exitPoints kind Pseudostates corresponding to this connection point.");
			installComment(pr_ConnectionPointReference_owningState, "The State in which the ConnectionPointReference is defined.");
			installComment(_Constraint, "A Constraint is a condition or restriction expressed in natural language text or in a machine readable language for the purpose of declaring some of the semantics of an Element or set of Elements.");
			installComment(pr_Constraint_constrainedElements, "The ordered set of Elements referenced by this Constraint.");
			installComment(pr_Constraint_ownedSpecification, "A condition that must be true when evaluated in order for the Constraint to be satisfied.");
			installComment(_DataType, "A DataType is a type whose instances are identified only by their value.");
			installComment(_Element, "An Element is a constituent of a model. As such, it has the capability of owning other Elements.");
			installComment(op_Element_allOwnedElements, "The query allOwnedElements() gives all of the direct and indirect ownedElements of an Element.");
			installComment(pr_Element_ownedComments, "The Comments owned by this Element.");
			installComment(_Enumeration, "An Enumeration is a DataType whose values are enumerated in the model as EnumerationLiterals.");
			installComment(pr_Enumeration_ownedLiterals, "The ordered set of literals owned by this Enumeration.");
			installComment(_EnumerationLiteral, "An EnumerationLiteral is a user-defined data value for an Enumeration.");
			installComment(pr_EnumerationLiteral_owningEnumeration, "The Enumeration that this EnumerationLiteral is a member of.");
			installComment(_Feature, "A Feature declares a behavioral or structural characteristic of Classifiers.");
			installComment(pr_Feature_isStatic, "Specifies whether this Feature characterizes individual instances classified by the Classifier (false) or the Classifier itself (true).");
			installComment(_FinalState, "A special kind of State, which, when entered, signifies that the enclosing Region has completed. If the enclosing Region is directly contained in a StateMachine and all other Regions in that StateMachine also are completed, then it means that the entire StateMachine behavior is completed.");
			installComment(_InstanceSpecification, "An InstanceSpecification is a model element that represents an instance in a modeled system. An InstanceSpecification can act as a DeploymentTarget in a Deployment relationship, in the case that it represents an instance of a Node. It can also act as a DeployedArtifact, if it represents an instance of an Artifact.");
			installComment(pr_InstanceSpecification_classes, "The Classifier or Classifiers of the represented instance. If multiple Classifiers are specified, the instance is classified by all of them.");
			installComment(pr_InstanceSpecification_ownedSlots, "A Slot giving the value or values of a StructuralFeature of the instance. An InstanceSpecification can have one Slot per StructuralFeature of its Classifiers, including inherited features. It is not necessary to model a Slot for every StructuralFeature, in which case the InstanceSpecification is a partial description.");
			installComment(pr_InstanceSpecification_ownedSpecification, "A specification of how to compute, derive, or construct the instance.");
			installComment(_Model, "A model captures a view of a physical system. It is an abstraction of the physical system, with a certain purpose. This purpose determines what is to be included in the model and what is irrelevant. Thus the model completely describes those aspects of the physical system that are relevant to the purpose of the model, at the appropriate level of detail.");
			installComment(_NamedElement, "A NamedElement is an Element in a model that may have a name. The name may be given directly and/or via the use of a StringExpression.");
			installComment(pr_NamedElement_name, "The name of the NamedElement.");
			installComment(_Namespace, "A Namespace is an Element in a model that owns and/or imports a set of NamedElements that can be identified by name.");
			installComment(pr_Namespace_ownedConstraints, "Specifies a set of Constraints owned by this Namespace.");
			installComment(_Operation, "An Operation is a BehavioralFeature of a Classifier that specifies the name, type, parameters, and constraints for invoking an associated Behavior. An Operation may invoke both the execution of method behaviors as well as other behavioral responses. Operation specializes TemplateableElement in order to support specification of template operations and bound operations. Operation specializes ParameterableElement to specify that an operation can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.");
			installComment(pr_Operation_ownedParameters, "The ordered set of formal Parameters of this BehavioralFeature.\n\nThe parameters owned by this Operation.");
			installComment(pr_Operation_ownedPostconditions, "An optional set of Constraints specifying the state of the system when the Operation is completed.");
			installComment(pr_Operation_ownedPreconditions, "An optional set of Constraints on the state of the system when the Operation is invoked.");
			installComment(pr_Operation_owningClass, "The Class that owns this operation, if any.");
			installComment(pr_Operation_raisedExceptions, "The Types representing exceptions that may be raised during an invocation of this BehavioralFeature.\n\nThe Types representing exceptions that may be raised during an invocation of this operation.");
			installComment(pr_Operation_redefinedOperations, "The Operations that are redefined by this Operation.");
			installComment(_Package, "A package can have one or more profile applications to indicate which profiles have been applied. Because a profile is a package, it is possible to apply a profile not only to packages, but also to profiles.\nPackage specializes TemplateableElement and PackageableElement specializes ParameterableElement to specify that a package can be used as a template and a PackageableElement as a template parameter.\nA package is used to group elements, and provides a namespace for the grouped elements.");
			installComment(pr_Package_URI, "Provides an identifier for the package that can be used for many purposes. A URI is the universally unique identification of the package following the IETF URI specification, RFC 2396 http://www.ietf.org/rfc/rfc2396.txt and it must comply with those syntax rules.");
			installComment(pr_Package_ownedClasses, "References the packaged elements that are Types.");
			installComment(pr_Package_ownedInstances, "The instance specification that owns this slot.");
			installComment(pr_Package_ownedPackages, "References the packaged elements that are Packages.");
			installComment(pr_Package_ownedProfileApplications, "References the ProfileApplications that indicate which profiles have been applied to the Package.");
			installComment(pr_Package_owningPackage, "References the Package that owns this Package.");
			installComment(_Parameter, "A Parameter is a specification of an argument used to pass information into or out of an invocation of a BehavioralFeature.  Parameters can be treated as ConnectableElements within Collaborations.");
			installComment(pr_Parameter_owningOperation, "The Operation owning this parameter.");
			installComment(_PrimitiveType, "A PrimitiveType defines a predefined DataType, without any substructure. A PrimitiveType may have an algebra and operations defined outside of UML, for example, mathematically.");
			installComment(_Profile, "A profile defines limited extensions to a reference metamodel with the purpose of adapting the metamodel to a specific platform or domain.");
			installComment(_ProfileApplication, "A profile application is used to show which profiles have been applied to a package.");
			installComment(pr_ProfileApplication_appliedProfile, "References the Profiles that are applied to a Package through this ProfileApplication.");
			installComment(pr_ProfileApplication_isStrict, "Specifies that the Profile filtering rules for the metaclasses of the referenced metamodel shall be strictly applied.");
			installComment(pr_ProfileApplication_owningPackage, "The package that owns the profile application.");
			installComment(_Property, "A Property is a StructuralFeature. A Property related by ownedAttribute to a Classifier (other than an association) represents an attribute and might also represent an association end. It relates an instance of the Classifier to a value or set of values of the type of the attribute. A Property related by memberEnd to an Association represents an end of the Association. The type of the Property is the type of the end of the Association. A Property has the capability of being a DeploymentTarget in a Deployment relationship. This enables modeling the deployment to hierarchical nodes that have Properties functioning as internal parts.  Property specializes ParameterableElement to specify that a Property can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.");
			installComment(pr_Property_isDerived, "Specifies whether the Property is derived, i.e., whether its value or values can be computed from other information.");
			installComment(pr_Property_isID, "True indicates this property can be used to uniquely identify an instance of the containing Class.");
			installComment(pr_Property_isReadOnly, "If isReadOnly is true, the StructuralFeature may not be written to after initialization.");
			installComment(pr_Property_opposite, "In the case where the Property is one end of a binary association this gives the other end.");
			installComment(pr_Property_owningClass, "The Class that owns this Property, if any.");
			installComment(pr_Property_redefinedProperties, "The properties that are redefined by this property, if any.");
			installComment(pr_Property_subsettedProperty, "The properties of which this Property is constrained to be a subset, if any.");
			installComment(_Pseudostate, "A Pseudostate is an abstraction that encompasses different types of transient Vertices in the StateMachine graph. A StateMachine instance never comes to rest in a Pseudostate, instead, it will exit and enter the Pseudostate within a single run-to-completion step.");
			installComment(pr_Pseudostate_kind, "Determines the precise type of the Pseudostate and can be one of: entryPoint, exitPoint, initial, deepHistory, shallowHistory, join, fork, junction, terminate or choice.");
			installComment(pr_Pseudostate_owningState, "The State that owns this Pseudostate and in which it appears.");
			installComment(pr_Pseudostate_owningStateMachine, "The StateMachine in which this Pseudostate is defined. This only applies to Pseudostates of the kind entryPoint or exitPoint.");
			installComment(_Region, "A Region is a top-level part of a StateMachine or a composite State, that serves as a container for the Vertices and Transitions of the StateMachine. A StateMachine or composite State may contain multiple Regions representing behaviors that may occur in parallel.");
			installComment(pr_Region_extendedRegion, "The region of which this region is an extension.");
			installComment(pr_Region_ownedSubvertexes, "The set of Vertices that are owned by this Region.");
			installComment(pr_Region_ownedTransitions, "The set of Transitions owned by the Region.");
			installComment(pr_Region_owningState, "The State that owns the Region. If a Region is owned by a State, then it cannot also be owned by a StateMachine.");
			installComment(pr_Region_owningStateMachine, "The StateMachine that owns the Region. If a Region is owned by a StateMachine, then it cannot also be owned by a State.");
			installComment(_Signal, "A Signal is a specification of a kind of communication between objects in which a reaction is asynchronously triggered in the receiver without a reply.");
			installComment(_Slot, "A Slot designates that an entity modeled by an InstanceSpecification has a value or values for a specific StructuralFeature.");
			installComment(pr_Slot_definingProperty, "The StructuralFeature that specifies the values that may be held by the Slot.");
			installComment(pr_Slot_ownedValues, "The value or values held by the Slot.");
			installComment(pr_Slot_owningInstance, "The InstanceSpecification that owns this Slot.");
			installComment(_State, "A State models a situation during which some (usually implicit) invariant condition holds.");
			installComment(pr_State_isComposite, "A state with isComposite=true is said to be a composite State. A composite State is a State that contains at least one Region.");
			installComment(pr_State_isOrthogonal, "A State with isOrthogonal=true is said to be an orthogonal composite State An orthogonal composite State contains two or more Regions.");
			installComment(pr_State_isSimple, "A State with isSimple=true is said to be a simple State A simple State does not have any Regions and it does not refer to any submachine StateMachine.");
			installComment(pr_State_isSubmachineState, "A State with isSubmachineState=true is said to be a submachine State Such a State refers to another StateMachine(submachine).");
			installComment(pr_State_ownedConnectionPoints, "The entry and exit Pseudostates of a composite State. These can only be entry or exit Pseudostates, and they must have different names. They can only be defined for composite States.");
			installComment(pr_State_ownedConnections, "The entry and exit connection points used in conjunction with this (submachine) State, i.e., as targets and sources, respectively, in the Region with the submachine State. A connection point reference references the corresponding definition of a connection point Pseudostate in the StateMachine referenced by the submachine State.");
			installComment(pr_State_ownedDeferrableTriggers, "A list of Triggers that are candidates to be retained by the StateMachine if they trigger no Transitions out of the State (not consumed). A deferred Trigger is retained until the StateMachine reaches a State configuration where it is no longer deferred.");
			installComment(pr_State_ownedDoActivity, "An optional Behavior that is executed while being in the State. The execution starts when this State is entered, and ceases either by itself when done, or when the State is exited, whichever comes first.");
			installComment(pr_State_ownedEntry, "An optional Behavior that is executed whenever this State is entered regardless of the Transition taken to reach the State. If defined, entry Behaviors are always executed to completion prior to any internal Behavior or Transitions performed within the State.");
			installComment(pr_State_ownedExit, "An optional Behavior that is executed whenever this State is exited regardless of which Transition was taken out of the State. If defined, exit Behaviors are always executed to completion only after all internal and transition Behaviors have completed execution.");
			installComment(pr_State_ownedRegions, "The Regions owned directly by the State.");
			installComment(pr_State_ownedStateInvariant, "Specifies conditions that are always true when this State is the current State. In ProtocolStateMachines state invariants are additional conditions to the preconditions of the outgoing Transitions, and to the postcondition of the incoming Transitions.");
			installComment(pr_State_redefinedState, "The State of which this State is a redefinition.");
			installComment(pr_State_submachines, "The StateMachine that is to be inserted in place of the (submachine) State.");
			installComment(_StateMachine, "StateMachines can be used to express event-driven behaviors of parts of a system. Behavior is modeled as a traversal of a graph of Vertices interconnected by one or more joined Transition arcs that are triggered by the dispatching of successive Event occurrences. During this traversal, the StateMachine may execute a sequence of Behaviors associated with various elements of the StateMachine.");
			installComment(pr_StateMachine_extendedStateMachines, "The StateMachines of which this is an extension.");
			installComment(pr_StateMachine_ownedConnectionPoints, "The connection points defined for this StateMachine. They represent the interface of the StateMachine when used as part of submachine State");
			installComment(pr_StateMachine_ownedRegions, "The Regions owned directly by the StateMachine.");
			installComment(pr_StateMachine_submachineStates, "References the submachine(s) in case of a submachine State. Multiple machines are referenced in case of a concurrent State.");
			installComment(_Stereotype, "A stereotype defines how an existing metaclass may be extended, and enables the use of platform or domain specific terminology or notation in place of, or in addition to, the ones used for the extended metaclass.");
			installComment(_TemplateBinding, "A TemplateBinding is a DirectedRelationship between a TemplateableElement and a template. A TemplateBinding specifies the TemplateParameterSubstitutions of actual parameters for the formal parameters of the template.");
			installComment(pr_TemplateBinding_ownedSubstitutions, "The TemplateParameterSubstitutions owned by this TemplateBinding.");
			installComment(pr_TemplateBinding_owningElement, "The TemplateableElement that is bound by this TemplateBinding.");
			installComment(pr_TemplateBinding_templateSignature, "The TemplateSignature for the template that is the target of this TemplateBinding.");
			installComment(_TemplateParameter, "A TemplateParameter exposes a ParameterableElement as a formal parameter of a template.");
			installComment(pr_TemplateParameter_owningSignature, "The TemplateSignature that owns this TemplateParameter.");
			installComment(_TemplateParameterSubstitution, "A TemplateParameterSubstitution relates the actual parameter to a formal TemplateParameter as part of a template binding.");
			installComment(pr_TemplateParameterSubstitution_actual, "The ParameterableElement that is the actual parameter for this TemplateParameterSubstitution.");
			installComment(pr_TemplateParameterSubstitution_formal, "The formal TemplateParameter that is associated with this TemplateParameterSubstitution.");
			installComment(pr_TemplateParameterSubstitution_owningBinding, "The TemplateBinding that owns this TemplateParameterSubstitution.");
			installComment(_TemplateSignature, "A Template Signature bundles the set of formal TemplateParameters for a template.");
			installComment(pr_TemplateSignature_ownedParameters, "The formal parameters that are owned by this TemplateSignature.");
			installComment(pr_TemplateSignature_owningElement, "The TemplateableElement that owns this TemplateSignature.");
			installComment(_TemplateableElement, "A TemplateableElement is an Element that can optionally be defined as a template and bound to other templates.");
			installComment(pr_TemplateableElement_ownedBindings, "The optional TemplateBindings from this TemplateableElement to one or more templates.");
			installComment(pr_TemplateableElement_ownedSignature, "The optional TemplateSignature specifying the formal TemplateParameters for this TemplateableElement. If a TemplateableElement has a TemplateSignature, then it is a template.");
			installComment(_Transition, "A Transition represents an arc between exactly one source Vertex and exactly one Target vertex (the source and targets may be the same Vertex). It may form part of a compound transition, which takes the StateMachine from one steady State configuration to another, representing the full response of the StateMachine to an occurrence of an Event that triggered it.");
			installComment(pr_Transition_kind, "Indicates the precise type of the Transition.");
			installComment(pr_Transition_ownedEffect, "Specifies an optional behavior to be performed when the Transition fires.");
			installComment(pr_Transition_ownedGuard, "A guard is a Constraint that provides a fine-grained control over the firing of the Transition. The guard is evaluated when an Event occurrence is dispatched by the StateMachine. If the guard is true at that time, the Transition may be enabled, otherwise, it is disabled. Guards should be pure expressions without side effects. Guard expressions with side effects are ill formed.");
			installComment(pr_Transition_ownedTriggers, "Specifies the Triggers that may fire the transition.");
			installComment(pr_Transition_owningRegion, "Designates the Region that owns this Transition.");
			installComment(pr_Transition_source, "Designates the originating Vertex (State or Pseudostate) of the Transition.");
			installComment(pr_Transition_target, "Designates the target Vertex that is reached when the Transition is taken.");
			installComment(el__TransitionKind_external, "Implies that the Transition, if triggered, will exit the composite (source) State.");
			installComment(el__TransitionKind_internal, "Implies that the Transition, if triggered, occurs without exiting or entering the source State (i.e., it does not cause a state change). This means that the entry or exit condition of the source State will not be invoked. An internal Transition can be taken even if the SateMachine is in one or more Regions nested within the associated State.");
			installComment(el__TransitionKind_local, "Implies that the Transition, if triggered, will not exit the composite (source) State, but it will exit and re-enter any state within the composite State that is in the current state configuration.");
			installComment(_Trigger, "A Trigger specifies a specific point  at which an Event occurrence may trigger an effect in a Behavior. A Trigger may be qualified by the Port on which the Event occurred.");
			installComment(_Type, "A Type constrains the values represented by a TypedElement.");
			installComment(_TypedElement, "A TypedElement is a NamedElement that may have a Type specified for it.");
			installComment(pr_TypedElement_type, "The type of the TypedElement.");
			installComment(_ValueSpecification, "A ValueSpecification is the specification of a (possibly empty) set of values. A ValueSpecification is a ParameterableElement that may be exposed as a formal TemplateParameter and provided as the actual parameter in the binding of a template.");
			installComment(op_ValueSpecification_booleanValue, "The query booleanValue() gives a single Boolean value when one can be computed.");
			installComment(op_ValueSpecification_integerValue, "The query integerValue() gives a single Integer value when one can be computed.");
			installComment(op_ValueSpecification_isComputable, "The query isComputable() determines whether a value specification can be computed in a model. This operation cannot be fully defined in OCL. A conforming implementation is expected to deliver true for this operation for all ValueSpecifications that it can compute, and to compute all of those for which the operation is true. A conforming implementation is expected to be able to compute at least the value of all LiteralSpecifications.");
			installComment(op_ValueSpecification_isNull, "The query isNull() returns true when it can be computed that the value is null.");
			installComment(op_ValueSpecification_stringValue, "The query stringValue() gives a single String value when one can be computed.");
			installComment(op_ValueSpecification_unlimitedValue, "The query unlimitedValue() gives a single UnlimitedNatural value when one can be computed.");
			installComment(_Vertex, "A Vertex is an abstraction of a node in a StateMachine graph. It can be the source or destination of any number of Transitions.");
			installComment(pr_Vertex_incomingTransitions, "Specifies the Transitions entering this Vertex.");
			installComment(pr_Vertex_outgoingTransitions, "Specifies the Transitions departing from this Vertex.");
			installComment(pr_Vertex_owningRegion, "The Region that contains this Vertex.");
		}
	}
}

/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.pattern.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.pim.PimPackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.impl.BehaviorPackageImpl;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.impl.ComponentPackageImpl;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.impl.ConnectorPackageImpl;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.constraint.impl.ConstraintPackageImpl;
import org.muml.pim.impl.PimPackageImpl;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.impl.InstancePackageImpl;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.msgtype.impl.MsgtypePackageImpl;
import org.muml.pim.pattern.AbstractCoordinationPattern;
import org.muml.pim.pattern.CoordinationPattern;
import org.muml.pim.pattern.CoordinationPatternVariant;
import org.muml.pim.pattern.DescriptionAspects;
import org.muml.pim.pattern.PatternFactory;
import org.muml.pim.pattern.PatternPackage;
import org.muml.pim.pattern.VerifiedConfiguration;
import org.muml.pim.pattern.util.PatternValidator;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.protocol.impl.ProtocolPackageImpl;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl;
import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;
import org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl;
import org.muml.pim.runnable.RunnablePackage;
import org.muml.pim.runnable.impl.RunnablePackageImpl;
import org.muml.pim.types.TypesPackage;
import org.muml.pim.types.impl.TypesPackageImpl;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.pim.valuetype.impl.ValuetypePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternPackageImpl extends EPackageImpl implements PatternPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCoordinationPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionAspectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verifiedConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationPatternVariantEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.muml.pim.pattern.PatternPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatternPackageImpl() {
		super(eNS_URI, PatternFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PatternPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatternPackage init() {
		if (isInited) return (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);

		// Obtain or create and register package
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PimPackageImpl thePimPackage = (PimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PimPackage.eNS_URI) instanceof PimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PimPackage.eNS_URI) : PimPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) : ProtocolPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		One_to_n_schemataPackageImpl theOne_to_n_schemataPackage = (One_to_n_schemataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI) instanceof One_to_n_schemataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI) : One_to_n_schemataPackage.eINSTANCE);
		MsgtypePackageImpl theMsgtypePackage = (MsgtypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) instanceof MsgtypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) : MsgtypePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) instanceof ConnectorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) : ConnectorPackage.eINSTANCE);
		ValuetypePackageImpl theValuetypePackage = (ValuetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) instanceof ValuetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) : ValuetypePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		RunnablePackageImpl theRunnablePackage = (RunnablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RunnablePackage.eNS_URI) instanceof RunnablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RunnablePackage.eNS_URI) : RunnablePackage.eINSTANCE);

		// Create package meta-data objects
		thePatternPackage.createPackageContents();
		thePimPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theProtocolPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theOne_to_n_schemataPackage.createPackageContents();
		theMsgtypePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theConnectorPackage.createPackageContents();
		theValuetypePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theRunnablePackage.createPackageContents();

		// Initialize created meta-data
		thePatternPackage.initializePackageContents();
		thePimPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theProtocolPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theOne_to_n_schemataPackage.initializePackageContents();
		theMsgtypePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theConnectorPackage.initializePackageContents();
		theValuetypePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theRunnablePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePatternPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PatternValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePatternPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatternPackage.eNS_URI, thePatternPackage);
		return thePatternPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCoordinationPattern() {
		return abstractCoordinationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCoordinationPattern_VerifiedConfigurations() {
		return (EReference)abstractCoordinationPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCoordinationPattern_PatternParameters() {
		return (EReference)abstractCoordinationPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinationPattern() {
		return coordinationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationPattern_DescriptionAspects() {
		return (EReference)coordinationPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationPattern_PatternVariants() {
		return (EReference)coordinationPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationPattern_CombineablePatterns() {
		return (EReference)coordinationPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationPattern_AlternativePatterns() {
		return (EReference)coordinationPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionAspects() {
		return descriptionAspectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionAspects_Overview() {
		return (EAttribute)descriptionAspectsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionAspects_Context() {
		return (EAttribute)descriptionAspectsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionAspects_Problem() {
		return (EAttribute)descriptionAspectsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionAspects_Solution() {
		return (EAttribute)descriptionAspectsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionAspects_Structure() {
		return (EAttribute)descriptionAspectsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionAspects_Behavior() {
		return (EAttribute)descriptionAspectsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionAspects_Examples() {
		return (EAttribute)descriptionAspectsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionAspects_Consequences() {
		return (EAttribute)descriptionAspectsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionAspects_Combineability() {
		return (EAttribute)descriptionAspectsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionAspects_Variants() {
		return (EAttribute)descriptionAspectsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionAspects_AlsoKnownAs() {
		return (EAttribute)descriptionAspectsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionAspects_Alternatives() {
		return (EAttribute)descriptionAspectsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionAspects_Verification_properties() {
		return (EAttribute)descriptionAspectsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionAspects_SearchTerms() {
		return (EAttribute)descriptionAspectsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerifiedConfiguration() {
		return verifiedConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerifiedConfiguration_ParameterBindings() {
		return (EReference)verifiedConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerifiedConfiguration_CoordinationPattern() {
		return (EReference)verifiedConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinationPatternVariant() {
		return coordinationPatternVariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationPatternVariant_OriginalPattern() {
		return (EReference)coordinationPatternVariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternFactory getPatternFactory() {
		return (PatternFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractCoordinationPatternEClass = createEClass(ABSTRACT_COORDINATION_PATTERN);
		createEReference(abstractCoordinationPatternEClass, ABSTRACT_COORDINATION_PATTERN__VERIFIED_CONFIGURATIONS);
		createEReference(abstractCoordinationPatternEClass, ABSTRACT_COORDINATION_PATTERN__PATTERN_PARAMETERS);

		descriptionAspectsEClass = createEClass(DESCRIPTION_ASPECTS);
		createEAttribute(descriptionAspectsEClass, DESCRIPTION_ASPECTS__OVERVIEW);
		createEAttribute(descriptionAspectsEClass, DESCRIPTION_ASPECTS__CONTEXT);
		createEAttribute(descriptionAspectsEClass, DESCRIPTION_ASPECTS__PROBLEM);
		createEAttribute(descriptionAspectsEClass, DESCRIPTION_ASPECTS__SOLUTION);
		createEAttribute(descriptionAspectsEClass, DESCRIPTION_ASPECTS__STRUCTURE);
		createEAttribute(descriptionAspectsEClass, DESCRIPTION_ASPECTS__BEHAVIOR);
		createEAttribute(descriptionAspectsEClass, DESCRIPTION_ASPECTS__EXAMPLES);
		createEAttribute(descriptionAspectsEClass, DESCRIPTION_ASPECTS__CONSEQUENCES);
		createEAttribute(descriptionAspectsEClass, DESCRIPTION_ASPECTS__COMBINEABILITY);
		createEAttribute(descriptionAspectsEClass, DESCRIPTION_ASPECTS__VARIANTS);
		createEAttribute(descriptionAspectsEClass, DESCRIPTION_ASPECTS__ALSO_KNOWN_AS);
		createEAttribute(descriptionAspectsEClass, DESCRIPTION_ASPECTS__VERIFICATION_PROPERTIES);
		createEAttribute(descriptionAspectsEClass, DESCRIPTION_ASPECTS__SEARCH_TERMS);
		createEAttribute(descriptionAspectsEClass, DESCRIPTION_ASPECTS__ALTERNATIVES);

		verifiedConfigurationEClass = createEClass(VERIFIED_CONFIGURATION);
		createEReference(verifiedConfigurationEClass, VERIFIED_CONFIGURATION__PARAMETER_BINDINGS);
		createEReference(verifiedConfigurationEClass, VERIFIED_CONFIGURATION__COORDINATION_PATTERN);

		coordinationPatternVariantEClass = createEClass(COORDINATION_PATTERN_VARIANT);
		createEReference(coordinationPatternVariantEClass, COORDINATION_PATTERN_VARIANT__ORIGINAL_PATTERN);

		coordinationPatternEClass = createEClass(COORDINATION_PATTERN);
		createEReference(coordinationPatternEClass, COORDINATION_PATTERN__COMBINEABLE_PATTERNS);
		createEReference(coordinationPatternEClass, COORDINATION_PATTERN__ALTERNATIVE_PATTERNS);
		createEReference(coordinationPatternEClass, COORDINATION_PATTERN__DESCRIPTION_ASPECTS);
		createEReference(coordinationPatternEClass, COORDINATION_PATTERN__PATTERN_VARIANTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ProtocolPackage theProtocolPackage = (ProtocolPackage)EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractCoordinationPatternEClass.getESuperTypes().add(theProtocolPackage.getAbstractCoordinationSpecification());
		verifiedConfigurationEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		verifiedConfigurationEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		coordinationPatternVariantEClass.getESuperTypes().add(this.getAbstractCoordinationPattern());
		coordinationPatternEClass.getESuperTypes().add(this.getAbstractCoordinationPattern());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractCoordinationPatternEClass, AbstractCoordinationPattern.class, "AbstractCoordinationPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractCoordinationPattern_VerifiedConfigurations(), this.getVerifiedConfiguration(), this.getVerifiedConfiguration_CoordinationPattern(), "verifiedConfigurations", null, 0, -1, AbstractCoordinationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCoordinationPattern_PatternParameters(), theBehaviorPackage.getParameter(), null, "patternParameters", null, 0, -1, AbstractCoordinationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionAspectsEClass, DescriptionAspects.class, "DescriptionAspects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptionAspects_Overview(), ecorePackage.getEString(), "overview", null, 1, 1, DescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionAspects_Context(), ecorePackage.getEString(), "context", null, 1, 1, DescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionAspects_Problem(), ecorePackage.getEString(), "problem", null, 1, 1, DescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionAspects_Solution(), ecorePackage.getEString(), "solution", null, 1, 1, DescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionAspects_Structure(), ecorePackage.getEString(), "structure", null, 1, 1, DescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionAspects_Behavior(), ecorePackage.getEString(), "behavior", null, 1, 1, DescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionAspects_Examples(), ecorePackage.getEString(), "examples", null, 1, 1, DescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionAspects_Consequences(), ecorePackage.getEString(), "consequences", null, 1, 1, DescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionAspects_Combineability(), ecorePackage.getEString(), "combineability", null, 1, 1, DescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionAspects_Variants(), ecorePackage.getEString(), "variants", null, 1, 1, DescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionAspects_AlsoKnownAs(), ecorePackage.getEString(), "alsoKnownAs", null, 1, 1, DescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionAspects_Verification_properties(), ecorePackage.getEString(), "verification_properties", null, 1, 1, DescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionAspects_SearchTerms(), ecorePackage.getEString(), "searchTerms", null, 1, 1, DescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionAspects_Alternatives(), ecorePackage.getEString(), "alternatives", null, 1, 1, DescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verifiedConfigurationEClass, VerifiedConfiguration.class, "VerifiedConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerifiedConfiguration_ParameterBindings(), theBehaviorPackage.getParameterBinding(), null, "parameterBindings", null, 0, -1, VerifiedConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerifiedConfiguration_CoordinationPattern(), this.getAbstractCoordinationPattern(), this.getAbstractCoordinationPattern_VerifiedConfigurations(), "coordinationPattern", null, 1, 1, VerifiedConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationPatternVariantEClass, CoordinationPatternVariant.class, "CoordinationPatternVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationPatternVariant_OriginalPattern(), this.getCoordinationPattern(), this.getCoordinationPattern_PatternVariants(), "originalPattern", null, 1, 1, CoordinationPatternVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationPatternEClass, CoordinationPattern.class, "CoordinationPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationPattern_CombineablePatterns(), this.getCoordinationPattern(), null, "combineablePatterns", null, 0, -1, CoordinationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationPattern_AlternativePatterns(), this.getCoordinationPattern(), null, "alternativePatterns", null, 0, -1, CoordinationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationPattern_DescriptionAspects(), this.getDescriptionAspects(), null, "descriptionAspects", null, 1, 1, CoordinationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationPattern_PatternVariants(), this.getCoordinationPatternVariant(), this.getCoordinationPatternVariant_OriginalPattern(), "patternVariants", null, 0, -1, CoordinationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http://www.muml.org/emf/OCLFilter
		createOCLFilterAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (abstractCoordinationPatternEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniquePatternNames PatternWithParametersNeedsVerifiedConfiguration"
		   });	
		addAnnotation
		  (verifiedConfigurationEClass, 
		   source, 
		   new String[] {
			 "constraints", "ensureBindingForAllPatternParameters"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (abstractCoordinationPatternEClass, 
		   source, 
		   new String[] {
			 "PatternWithParametersNeedsVerifiedConfiguration", "-- @warning\r\n--When a CoordinationPattern defines Parameters, it is advised to define a verified configuration for these Parameters\r\nself.patternParameters->size() > 0 implies self.verifiedConfigurations->size() > 0",
			 "UniquePatternNames", "-- A name of a CoordinationPattern must be unique.\r\nAbstractCoordinationPattern.allInstances()->isUnique(name)"
		   });	
		addAnnotation
		  (verifiedConfigurationEClass, 
		   source, 
		   new String[] {
			 "ensureBindingForAllPatternParameters", "-- A VerifiedConfiguration must bind every CoordinaionPattern parameter\r\nself.coordinationPattern.oclAsSet()->select(object|object <> null).patternParameters->forAll(parameter| self.parameterBindings.parameter->includes(parameter))"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.muml.org/emf/OCLFilter</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLFilterAnnotations() {
		String source = "http://www.muml.org/emf/OCLFilter";	
		addAnnotation
		  (getCoordinationPattern_CombineablePatterns(), 
		   source, 
		   new String[] {
			 "filter", "pattern::CoordinationPattern::allInstances()->select(p| not (p = self))"
		   });	
		addAnnotation
		  (getCoordinationPattern_AlternativePatterns(), 
		   source, 
		   new String[] {
			 "filter", "pattern::CoordinationPattern::allInstances()->select(p| not (p = self))"
		   });
	}

} //PatternPackageImpl

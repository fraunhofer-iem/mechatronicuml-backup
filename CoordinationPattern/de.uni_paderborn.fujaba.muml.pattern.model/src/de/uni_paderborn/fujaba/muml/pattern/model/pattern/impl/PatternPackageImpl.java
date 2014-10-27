/**
 */
package de.uni_paderborn.fujaba.muml.pattern.model.pattern.impl;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;

import de.uni_paderborn.fujaba.muml.component.ComponentPackage;

import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;

import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.muml.instance.InstancePackage;

import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;

import de.uni_paderborn.fujaba.muml.pattern.model.pattern.AdaptedFromCoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.model.pattern.LegalConfiguration;
import de.uni_paderborn.fujaba.muml.pattern.model.pattern.PatternFactory;
import de.uni_paderborn.fujaba.muml.pattern.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.pattern.model.pattern.PlainTextualDescriptionAspects;

import de.uni_paderborn.fujaba.muml.pattern.model.pattern.util.PatternValidator;

import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;

import de.uni_paderborn.fujaba.muml.types.TypesPackage;

import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.core.CorePackage;

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
	private EClass adaptedFromCoordinationPatternEClass = null;

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
	private EClass plainTextualDescriptionAspectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legalConfigurationEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.pattern.model.pattern.PatternPackage#eNS_URI
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
		ComponentPackage.eINSTANCE.eClass();
		ConstraintPackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		ProtocolPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgtypePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		ConnectorPackage.eINSTANCE.eClass();
		ValuetypePackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePatternPackage.createPackageContents();

		// Initialize created meta-data
		thePatternPackage.initializePackageContents();

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
	public EClass getAdaptedFromCoordinationPattern() {
		return adaptedFromCoordinationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptedFromCoordinationPattern_AdaptedPattern() {
		return (EReference)adaptedFromCoordinationPatternEClass.getEStructuralFeatures().get(0);
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
		return (EReference)coordinationPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationPattern_LegalConfigurations() {
		return (EReference)coordinationPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationPattern_PatternParameters() {
		return (EReference)coordinationPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationPattern_CombineablePatterns() {
		return (EReference)coordinationPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationPattern_AlternativePatterns() {
		return (EReference)coordinationPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationPattern_GmfCoordinationPattern() {
		return (EReference)coordinationPatternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainTextualDescriptionAspects() {
		return plainTextualDescriptionAspectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainTextualDescriptionAspects_Overview() {
		return (EAttribute)plainTextualDescriptionAspectsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainTextualDescriptionAspects_Context() {
		return (EAttribute)plainTextualDescriptionAspectsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainTextualDescriptionAspects_Problem() {
		return (EAttribute)plainTextualDescriptionAspectsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainTextualDescriptionAspects_Solution() {
		return (EAttribute)plainTextualDescriptionAspectsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainTextualDescriptionAspects_Structure() {
		return (EAttribute)plainTextualDescriptionAspectsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainTextualDescriptionAspects_Behavior() {
		return (EAttribute)plainTextualDescriptionAspectsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainTextualDescriptionAspects_Examples() {
		return (EAttribute)plainTextualDescriptionAspectsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainTextualDescriptionAspects_Consequences() {
		return (EAttribute)plainTextualDescriptionAspectsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainTextualDescriptionAspects_Combineability() {
		return (EAttribute)plainTextualDescriptionAspectsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainTextualDescriptionAspects_Variants() {
		return (EAttribute)plainTextualDescriptionAspectsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainTextualDescriptionAspects_Alternatives() {
		return (EAttribute)plainTextualDescriptionAspectsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegalConfiguration() {
		return legalConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegalConfiguration_ParameterBindings() {
		return (EReference)legalConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegalConfiguration_CoordinationPattern() {
		return (EReference)legalConfigurationEClass.getEStructuralFeatures().get(1);
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
		adaptedFromCoordinationPatternEClass = createEClass(ADAPTED_FROM_COORDINATION_PATTERN);
		createEReference(adaptedFromCoordinationPatternEClass, ADAPTED_FROM_COORDINATION_PATTERN__ADAPTED_PATTERN);

		coordinationPatternEClass = createEClass(COORDINATION_PATTERN);
		createEReference(coordinationPatternEClass, COORDINATION_PATTERN__DESCRIPTION_ASPECTS);
		createEReference(coordinationPatternEClass, COORDINATION_PATTERN__LEGAL_CONFIGURATIONS);
		createEReference(coordinationPatternEClass, COORDINATION_PATTERN__PATTERN_PARAMETERS);
		createEReference(coordinationPatternEClass, COORDINATION_PATTERN__COMBINEABLE_PATTERNS);
		createEReference(coordinationPatternEClass, COORDINATION_PATTERN__ALTERNATIVE_PATTERNS);
		createEReference(coordinationPatternEClass, COORDINATION_PATTERN__GMF_COORDINATION_PATTERN);

		plainTextualDescriptionAspectsEClass = createEClass(PLAIN_TEXTUAL_DESCRIPTION_ASPECTS);
		createEAttribute(plainTextualDescriptionAspectsEClass, PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__OVERVIEW);
		createEAttribute(plainTextualDescriptionAspectsEClass, PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONTEXT);
		createEAttribute(plainTextualDescriptionAspectsEClass, PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__PROBLEM);
		createEAttribute(plainTextualDescriptionAspectsEClass, PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__SOLUTION);
		createEAttribute(plainTextualDescriptionAspectsEClass, PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__STRUCTURE);
		createEAttribute(plainTextualDescriptionAspectsEClass, PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__BEHAVIOR);
		createEAttribute(plainTextualDescriptionAspectsEClass, PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__EXAMPLES);
		createEAttribute(plainTextualDescriptionAspectsEClass, PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONSEQUENCES);
		createEAttribute(plainTextualDescriptionAspectsEClass, PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__COMBINEABILITY);
		createEAttribute(plainTextualDescriptionAspectsEClass, PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__VARIANTS);
		createEAttribute(plainTextualDescriptionAspectsEClass, PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__ALTERNATIVES);

		legalConfigurationEClass = createEClass(LEGAL_CONFIGURATION);
		createEReference(legalConfigurationEClass, LEGAL_CONFIGURATION__PARAMETER_BINDINGS);
		createEReference(legalConfigurationEClass, LEGAL_CONFIGURATION__COORDINATION_PATTERN);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ProtocolPackage theProtocolPackage = (ProtocolPackage)EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		adaptedFromCoordinationPatternEClass.getESuperTypes().add(theCorePackage.getExtension());
		coordinationPatternEClass.getESuperTypes().add(theProtocolPackage.getAbstractCoordinationSpecification());
		legalConfigurationEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		legalConfigurationEClass.getESuperTypes().add(theCorePackage.getCommentableElement());

		// Initialize classes and features; add operations and parameters
		initEClass(adaptedFromCoordinationPatternEClass, AdaptedFromCoordinationPattern.class, "AdaptedFromCoordinationPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptedFromCoordinationPattern_AdaptedPattern(), this.getCoordinationPattern(), null, "adaptedPattern", null, 1, -1, AdaptedFromCoordinationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationPatternEClass, CoordinationPattern.class, "CoordinationPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationPattern_DescriptionAspects(), this.getPlainTextualDescriptionAspects(), null, "descriptionAspects", null, 1, 1, CoordinationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationPattern_LegalConfigurations(), this.getLegalConfiguration(), this.getLegalConfiguration_CoordinationPattern(), "legalConfigurations", null, 0, -1, CoordinationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationPattern_PatternParameters(), theBehaviorPackage.getParameter(), null, "patternParameters", null, 0, -1, CoordinationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationPattern_CombineablePatterns(), this.getCoordinationPattern(), null, "combineablePatterns", null, 0, -1, CoordinationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationPattern_AlternativePatterns(), this.getCoordinationPattern(), null, "alternativePatterns", null, 0, -1, CoordinationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationPattern_GmfCoordinationPattern(), this.getCoordinationPattern(), null, "gmfCoordinationPattern", null, 0, 1, CoordinationPattern.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(plainTextualDescriptionAspectsEClass, PlainTextualDescriptionAspects.class, "PlainTextualDescriptionAspects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlainTextualDescriptionAspects_Overview(), ecorePackage.getEString(), "overview", null, 1, 1, PlainTextualDescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainTextualDescriptionAspects_Context(), ecorePackage.getEString(), "context", null, 1, 1, PlainTextualDescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainTextualDescriptionAspects_Problem(), ecorePackage.getEString(), "problem", null, 1, 1, PlainTextualDescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainTextualDescriptionAspects_Solution(), ecorePackage.getEString(), "solution", null, 1, 1, PlainTextualDescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainTextualDescriptionAspects_Structure(), ecorePackage.getEString(), "structure", null, 1, 1, PlainTextualDescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainTextualDescriptionAspects_Behavior(), ecorePackage.getEString(), "behavior", null, 1, 1, PlainTextualDescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainTextualDescriptionAspects_Examples(), ecorePackage.getEString(), "examples", null, 1, 1, PlainTextualDescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainTextualDescriptionAspects_Consequences(), ecorePackage.getEString(), "consequences", null, 1, 1, PlainTextualDescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainTextualDescriptionAspects_Combineability(), ecorePackage.getEString(), "combineability", null, 1, 1, PlainTextualDescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainTextualDescriptionAspects_Variants(), ecorePackage.getEString(), "variants", null, 1, 1, PlainTextualDescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainTextualDescriptionAspects_Alternatives(), ecorePackage.getEString(), "alternatives", null, 1, 1, PlainTextualDescriptionAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legalConfigurationEClass, LegalConfiguration.class, "LegalConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegalConfiguration_ParameterBindings(), theBehaviorPackage.getParameterBinding(), null, "parameterBindings", null, 0, -1, LegalConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegalConfiguration_CoordinationPattern(), this.getCoordinationPattern(), this.getCoordinationPattern_LegalConfigurations(), "coordinationPattern", null, 1, 1, LegalConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
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
		   });	
		addAnnotation
		  (coordinationPatternEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniquePatternNames"
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
		  (coordinationPatternEClass, 
		   source, 
		   new String[] {
			 "UniquePatternNames", "CoordinationPattern.allInstances()->isUnique(name)"
		   });	
		addAnnotation
		  (getCoordinationPattern_GmfCoordinationPattern(), 
		   source, 
		   new String[] {
			 "derivation", "self"
		   });
	}

} //PatternPackageImpl

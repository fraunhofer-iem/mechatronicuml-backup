/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.constraint.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.expressions.ExpressionsPackage;
import org.storydriven.storydiagrams.StorydiagramsPackage;

import de.fujaba.modelinstance.ModelinstancePackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl;
import de.uni_paderborn.fujaba.muml.model.constraint.Constraint;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintFactory;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.model.constraint.Correctness;
import de.uni_paderborn.fujaba.muml.model.constraint.ModelingConstraint;
import de.uni_paderborn.fujaba.muml.model.constraint.TextualConstraint;
import de.uni_paderborn.fujaba.muml.model.constraint.VerifiableConstraint;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl;
import de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage;
import de.uni_paderborn.fujaba.muml.model.msgiface.impl.MsgifacePackageImpl;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternPackageImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintPackageImpl extends EPackageImpl implements ConstraintPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verifiableConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textualConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum correctnessEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConstraintPackageImpl() {
		super(eNS_URI, ConstraintFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConstraintPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConstraintPackage init() {
		if (isInited) return (ConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI);

		// Obtain or create and register package
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConstraintPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelinstancePackage.eINSTANCE.eClass();
		StorydiagramsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		MsgifacePackageImpl theMsgifacePackage = (MsgifacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) instanceof MsgifacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) : MsgifacePackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);

		// Create package meta-data objects
		theConstraintPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theInstancePackage.createPackageContents();
		thePatternPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theMsgifacePackage.createPackageContents();
		theDeploymentPackage.createPackageContents();

		// Initialize created meta-data
		theConstraintPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		thePatternPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theMsgifacePackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConstraintPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConstraintPackage.eNS_URI, theConstraintPackage);
		return theConstraintPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Correctness() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Background() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_ConstrainableElement() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelingConstraint() {
		return modelingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerifiableConstraint() {
		return verifiableConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextualConstraint() {
		return textualConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextualConstraint_TextualExpression() {
		return (EReference)textualConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCorrectness() {
		return correctnessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintFactory getConstraintFactory() {
		return (ConstraintFactory)getEFactoryInstance();
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
		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__CORRECTNESS);
		createEAttribute(constraintEClass, CONSTRAINT__BACKGROUND);
		createEReference(constraintEClass, CONSTRAINT__CONSTRAINABLE_ELEMENT);

		modelingConstraintEClass = createEClass(MODELING_CONSTRAINT);

		verifiableConstraintEClass = createEClass(VERIFIABLE_CONSTRAINT);

		textualConstraintEClass = createEClass(TEXTUAL_CONSTRAINT);
		createEReference(textualConstraintEClass, TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION);

		// Create enums
		correctnessEEnum = createEEnum(CORRECTNESS);
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
		org.storydriven.core.CorePackage theCorePackage_1 = (org.storydriven.core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(org.storydriven.core.CorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		constraintEClass.getESuperTypes().add(theCorePackage_1.getExtendableElement());
		modelingConstraintEClass.getESuperTypes().add(this.getConstraint());
		verifiableConstraintEClass.getESuperTypes().add(this.getConstraint());
		textualConstraintEClass.getESuperTypes().add(this.getVerifiableConstraint());
		textualConstraintEClass.getESuperTypes().add(theCorePackage_1.getExtendableElement());

		// Initialize classes and features; add operations and parameters
		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Correctness(), this.getCorrectness(), "correctness", "Correctness.UNKNOWN", 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_Background(), ecorePackage.getEBoolean(), "background", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_ConstrainableElement(), theCorePackage.getConstrainableElement(), theCorePackage.getConstrainableElement_Constraint(), "constrainableElement", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(constraintEClass, ecorePackage.getEBoolean(), "isCorrect", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modelingConstraintEClass, ModelingConstraint.class, "ModelingConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(verifiableConstraintEClass, VerifiableConstraint.class, "VerifiableConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textualConstraintEClass, TextualConstraint.class, "TextualConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextualConstraint_TextualExpression(), theExpressionsPackage.getTextualExpression(), null, "textualExpression", null, 0, 1, TextualConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(correctnessEEnum, Correctness.class, "Correctness");
		addEEnumLiteral(correctnessEEnum, Correctness.UNKNOWN);
		addEEnumLiteral(correctnessEEnum, Correctness.CORRECT);
		addEEnumLiteral(correctnessEEnum, Correctness.VIOLATED);

		// Create resource
		createResource(eNS_URI);
	}

} //ConstraintPackageImpl

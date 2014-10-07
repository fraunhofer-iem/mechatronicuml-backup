/**
 */
package de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.impl;

import de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage;

import de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.BasicSDDFactory;
import de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.BasicSDDPackage;
import de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.StoryDecisionDiagram;
import de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.StoryPatternNode;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.storydiagrams.StorydiagramsPackage;

import org.storydriven.storydiagrams.patterns.PatternsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicSDDPackageImpl extends EPackageImpl implements BasicSDDPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyDecisionDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternNodeEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.BasicSDDPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicSDDPackageImpl() {
		super(eNS_URI, BasicSDDFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasicSDDPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicSDDPackage init() {
		if (isInited) return (BasicSDDPackage)EPackage.Registry.INSTANCE.getEPackage(BasicSDDPackage.eNS_URI);

		// Obtain or create and register package
		BasicSDDPackageImpl theBasicSDDPackage = (BasicSDDPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasicSDDPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasicSDDPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SDDPackage.eINSTANCE.eClass();
		StorydiagramsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBasicSDDPackage.createPackageContents();

		// Initialize created meta-data
		theBasicSDDPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasicSDDPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicSDDPackage.eNS_URI, theBasicSDDPackage);
		return theBasicSDDPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryDecisionDiagram() {
		return storyDecisionDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternNode() {
		return storyPatternNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPatternNode_Pattern() {
		return (EReference)storyPatternNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSDDFactory getBasicSDDFactory() {
		return (BasicSDDFactory)getEFactoryInstance();
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
		storyDecisionDiagramEClass = createEClass(STORY_DECISION_DIAGRAM);

		storyPatternNodeEClass = createEClass(STORY_PATTERN_NODE);
		createEReference(storyPatternNodeEClass, STORY_PATTERN_NODE__PATTERN);
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
		SDDPackage theSDDPackage = (SDDPackage)EPackage.Registry.INSTANCE.getEPackage(SDDPackage.eNS_URI);
		PatternsPackage thePatternsPackage = (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		storyDecisionDiagramEClass.getESuperTypes().add(theSDDPackage.getAbstractStoryDecisionDiagram());
		storyPatternNodeEClass.getESuperTypes().add(theSDDPackage.getPatternNode());

		// Initialize classes and features; add operations and parameters
		initEClass(storyDecisionDiagramEClass, StoryDecisionDiagram.class, "StoryDecisionDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storyPatternNodeEClass, StoryPatternNode.class, "StoryPatternNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoryPatternNode_Pattern(), thePatternsPackage.getStoryPattern(), null, "pattern", null, 1, 1, StoryPatternNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BasicSDDPackageImpl

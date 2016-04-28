/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.AtomicPropositionMapping;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.LabelingFactory;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.LabelingPackage;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LabelingPackageImpl extends EPackageImpl implements LabelingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicPropositionMappingEClass = null;

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
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.LabelingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LabelingPackageImpl() {
		super(eNS_URI, LabelingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LabelingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LabelingPackage init() {
		if (isInited) return (LabelingPackage)EPackage.Registry.INSTANCE.getEPackage(LabelingPackage.eNS_URI);

		// Obtain or create and register package
		LabelingPackageImpl theLabelingPackage = (LabelingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LabelingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LabelingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SdmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLabelingPackage.createPackageContents();

		// Initialize created meta-data
		theLabelingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLabelingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LabelingPackage.eNS_URI, theLabelingPackage);
		return theLabelingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicPropositionMapping() {
		return atomicPropositionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicPropositionMapping_Propositions() {
		return (EAttribute)atomicPropositionMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicPropositionMapping_StepGraph() {
		return (EReference)atomicPropositionMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelingFactory getLabelingFactory() {
		return (LabelingFactory)getEFactoryInstance();
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
		atomicPropositionMappingEClass = createEClass(ATOMIC_PROPOSITION_MAPPING);
		createEAttribute(atomicPropositionMappingEClass, ATOMIC_PROPOSITION_MAPPING__PROPOSITIONS);
		createEReference(atomicPropositionMappingEClass, ATOMIC_PROPOSITION_MAPPING__STEP_GRAPH);
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
		SdmPackage theSdmPackage = (SdmPackage)EPackage.Registry.INSTANCE.getEPackage(SdmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		atomicPropositionMappingEClass.getESuperTypes().add(theCorePackage.getExtension());

		// Initialize classes and features; add operations and parameters
		initEClass(atomicPropositionMappingEClass, AtomicPropositionMapping.class, "AtomicPropositionMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicPropositionMapping_Propositions(), ecorePackage.getEString(), "propositions", null, 0, -1, AtomicPropositionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicPropositionMapping_StepGraph(), theSdmPackage.getStepGraph(), null, "stepGraph", null, 1, 1, AtomicPropositionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LabelingPackageImpl

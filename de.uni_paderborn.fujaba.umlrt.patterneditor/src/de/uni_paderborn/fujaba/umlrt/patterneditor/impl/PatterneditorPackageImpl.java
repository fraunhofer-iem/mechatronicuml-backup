/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.patterneditor.impl;

import de.uni_paderborn.fujaba.umlrt.model.behavior.BehaviorPackage;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;

import de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;

import de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage;

import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;

import de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram;
import de.uni_paderborn.fujaba.umlrt.patterneditor.PatterneditorFactory;
import de.uni_paderborn.fujaba.umlrt.patterneditor.PatterneditorPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatterneditorPackageImpl extends EPackageImpl implements PatterneditorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternDiagramEClass = null;

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
	 * @see de.uni_paderborn.fujaba.umlrt.patterneditor.PatterneditorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatterneditorPackageImpl() {
		super(eNS_URI, PatterneditorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PatterneditorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatterneditorPackage init() {
		if (isInited) return (PatterneditorPackage)EPackage.Registry.INSTANCE.getEPackage(PatterneditorPackage.eNS_URI);

		// Obtain or create and register package
		PatterneditorPackageImpl thePatterneditorPackage = (PatterneditorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatterneditorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatterneditorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BehaviorPackage.eINSTANCE.eClass();
		ComponentPackage.eINSTANCE.eClass();
		ConstraintPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgifacePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePatterneditorPackage.createPackageContents();

		// Initialize created meta-data
		thePatterneditorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePatterneditorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatterneditorPackage.eNS_URI, thePatterneditorPackage);
		return thePatterneditorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternDiagram() {
		return patternDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternDiagram_CoordinationPattern() {
		return (EReference)patternDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternDiagram_Roles() {
		return (EReference)patternDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternDiagram_RoleConnectors() {
		return (EReference)patternDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternDiagram_TextualConstraints() {
		return (EReference)patternDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatterneditorFactory getPatterneditorFactory() {
		return (PatterneditorFactory)getEFactoryInstance();
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
		patternDiagramEClass = createEClass(PATTERN_DIAGRAM);
		createEReference(patternDiagramEClass, PATTERN_DIAGRAM__COORDINATION_PATTERN);
		createEReference(patternDiagramEClass, PATTERN_DIAGRAM__ROLES);
		createEReference(patternDiagramEClass, PATTERN_DIAGRAM__ROLE_CONNECTORS);
		createEReference(patternDiagramEClass, PATTERN_DIAGRAM__TEXTUAL_CONSTRAINTS);
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
		PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
		ConstraintPackage theConstraintPackage = (ConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(patternDiagramEClass, PatternDiagram.class, "PatternDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternDiagram_CoordinationPattern(), thePatternPackage.getCoordinationPattern(), null, "coordinationPattern", null, 0, 1, PatternDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternDiagram_Roles(), thePatternPackage.getRole(), null, "roles", null, 0, 2, PatternDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternDiagram_RoleConnectors(), thePatternPackage.getRoleConnector(), null, "roleConnectors", null, 0, -1, PatternDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternDiagram_TextualConstraints(), theConstraintPackage.getTextualConstraint(), null, "textualConstraints", null, 0, -1, PatternDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PatterneditorPackageImpl

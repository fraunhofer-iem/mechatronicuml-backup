/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.impl;

import de.uni_paderborn.fujaba.umlrt.model.behavior.BehaviorPackage;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;

import de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;

import de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage;

import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.StructuredComponentDiagram;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.StructuredcomponenteditorFactory;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.StructuredcomponenteditorPackage;

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
public class StructuredcomponenteditorPackageImpl extends EPackageImpl implements StructuredcomponenteditorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredComponentDiagramEClass = null;

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
	 * @see de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.StructuredcomponenteditorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructuredcomponenteditorPackageImpl() {
		super(eNS_URI, StructuredcomponenteditorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StructuredcomponenteditorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructuredcomponenteditorPackage init() {
		if (isInited) return (StructuredcomponenteditorPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredcomponenteditorPackage.eNS_URI);

		// Obtain or create and register package
		StructuredcomponenteditorPackageImpl theStructuredcomponenteditorPackage = (StructuredcomponenteditorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StructuredcomponenteditorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StructuredcomponenteditorPackageImpl());

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
		theStructuredcomponenteditorPackage.createPackageContents();

		// Initialize created meta-data
		theStructuredcomponenteditorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructuredcomponenteditorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructuredcomponenteditorPackage.eNS_URI, theStructuredcomponenteditorPackage);
		return theStructuredcomponenteditorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredComponentDiagram() {
		return structuredComponentDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredComponentDiagram_StructuredComponent() {
		return (EReference)structuredComponentDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredcomponenteditorFactory getStructuredcomponenteditorFactory() {
		return (StructuredcomponenteditorFactory)getEFactoryInstance();
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
		structuredComponentDiagramEClass = createEClass(STRUCTURED_COMPONENT_DIAGRAM);
		createEReference(structuredComponentDiagramEClass, STRUCTURED_COMPONENT_DIAGRAM__STRUCTURED_COMPONENT);
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
		ComponentPackage theComponentPackage = (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(structuredComponentDiagramEClass, StructuredComponentDiagram.class, "StructuredComponentDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredComponentDiagram_StructuredComponent(), theComponentPackage.getStructuredComponent(), null, "structuredComponent", null, 0, 1, StructuredComponentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StructuredcomponenteditorPackageImpl

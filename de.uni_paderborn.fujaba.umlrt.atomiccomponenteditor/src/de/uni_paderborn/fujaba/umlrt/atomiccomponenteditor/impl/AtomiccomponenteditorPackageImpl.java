/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomicComponentDiagram;
import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomiccomponenteditorFactory;
import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomiccomponenteditorPackage;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;
import de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomiccomponenteditorPackageImpl extends EPackageImpl implements AtomiccomponenteditorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicComponentDiagramEClass = null;

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
	 * @see de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomiccomponenteditorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AtomiccomponenteditorPackageImpl() {
		super(eNS_URI, AtomiccomponenteditorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AtomiccomponenteditorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AtomiccomponenteditorPackage init() {
		if (isInited) return (AtomiccomponenteditorPackage)EPackage.Registry.INSTANCE.getEPackage(AtomiccomponenteditorPackage.eNS_URI);

		// Obtain or create and register package
		AtomiccomponenteditorPackageImpl theAtomiccomponenteditorPackage = (AtomiccomponenteditorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AtomiccomponenteditorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AtomiccomponenteditorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentPackage.eINSTANCE.eClass();
		ConstraintPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgifacePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAtomiccomponenteditorPackage.createPackageContents();

		// Initialize created meta-data
		theAtomiccomponenteditorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAtomiccomponenteditorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AtomiccomponenteditorPackage.eNS_URI, theAtomiccomponenteditorPackage);
		return theAtomiccomponenteditorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicComponentDiagram() {
		return atomicComponentDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicComponentDiagram_AtomicComponent() {
		return (EReference)atomicComponentDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomiccomponenteditorFactory getAtomiccomponenteditorFactory() {
		return (AtomiccomponenteditorFactory)getEFactoryInstance();
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
		atomicComponentDiagramEClass = createEClass(ATOMIC_COMPONENT_DIAGRAM);
		createEReference(atomicComponentDiagramEClass, ATOMIC_COMPONENT_DIAGRAM__ATOMIC_COMPONENT);
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
		initEClass(atomicComponentDiagramEClass, AtomicComponentDiagram.class, "AtomicComponentDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicComponentDiagram_AtomicComponent(), theComponentPackage.getAtomicComponent(), null, "atomicComponent", null, 0, 1, AtomicComponentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AtomiccomponenteditorPackageImpl

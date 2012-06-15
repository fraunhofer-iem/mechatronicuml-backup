/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStopNode;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryDiagram;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowFactory;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.storydiagrams.activities.ActivitiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlflowPackageImpl extends EPackageImpl implements ControlflowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentStoryDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentStoryNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentStopNodeEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ControlflowPackageImpl() {
		super(eNS_URI, ControlflowFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ControlflowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ControlflowPackage init() {
		if (isInited) return (ControlflowPackage)EPackage.Registry.INSTANCE.getEPackage(ControlflowPackage.eNS_URI);

		// Obtain or create and register package
		ControlflowPackageImpl theControlflowPackage = (ControlflowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ControlflowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ControlflowPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ReconfigurationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ComponentstorypatternPackageImpl theComponentstorypatternPackage = (ComponentstorypatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentstorypatternPackage.eNS_URI) instanceof ComponentstorypatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentstorypatternPackage.eNS_URI) : ComponentstorypatternPackage.eINSTANCE);

		// Create package meta-data objects
		theControlflowPackage.createPackageContents();
		theComponentstorypatternPackage.createPackageContents();

		// Initialize created meta-data
		theControlflowPackage.initializePackageContents();
		theComponentstorypatternPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theControlflowPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ControlflowPackage.eNS_URI, theControlflowPackage);
		return theControlflowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentStoryDiagram() {
		return componentStoryDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentStoryNode() {
		return componentStoryNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentStoryNode_ComponentStoryPattern() {
		return (EReference)componentStoryNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentStopNode() {
		return componentStopNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlflowFactory getControlflowFactory() {
		return (ControlflowFactory)getEFactoryInstance();
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
		componentStoryDiagramEClass = createEClass(COMPONENT_STORY_DIAGRAM);

		componentStoryNodeEClass = createEClass(COMPONENT_STORY_NODE);
		createEReference(componentStoryNodeEClass, COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN);

		componentStopNodeEClass = createEClass(COMPONENT_STOP_NODE);
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
		ActivitiesPackage theActivitiesPackage = (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
		ReconfigurationPackage theReconfigurationPackage = (ReconfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI);
		ComponentstorypatternPackage theComponentstorypatternPackage = (ComponentstorypatternPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentstorypatternPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentStoryDiagramEClass.getESuperTypes().add(theActivitiesPackage.getActivity());
		componentStoryDiagramEClass.getESuperTypes().add(theReconfigurationPackage.getReconfigurationRule());
		componentStoryNodeEClass.getESuperTypes().add(theActivitiesPackage.getActivityNode());
		componentStopNodeEClass.getESuperTypes().add(theActivitiesPackage.getActivityNode());

		// Initialize classes and features; add operations and parameters
		initEClass(componentStoryDiagramEClass, ComponentStoryDiagram.class, "ComponentStoryDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentStoryNodeEClass, ComponentStoryNode.class, "ComponentStoryNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentStoryNode_ComponentStoryPattern(), theComponentstorypatternPackage.getComponentStoryPattern(), null, "componentStoryPattern", null, 1, 1, ComponentStoryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentStopNodeEClass, ComponentStopNode.class, "ComponentStopNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ControlflowPackageImpl

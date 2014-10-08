/**
 */
package de.uni_paderborn.fujaba.graphviz.graphviz.impl;

import de.uni_paderborn.fujaba.graphviz.graphviz.GraphvizFactory;
import de.uni_paderborn.fujaba.graphviz.graphviz.GraphvizPackage;
import de.uni_paderborn.fujaba.graphviz.graphviz.Test;

import de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage;

import de.uni_paderborn.fujaba.graphviz.graphviz.input.impl.InputPackageImpl;

import de.uni_paderborn.fujaba.graphviz.graphviz.output.OutputPackage;

import de.uni_paderborn.fujaba.graphviz.graphviz.output.impl.OutputPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphvizPackageImpl extends EPackageImpl implements GraphvizPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

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
	 * @see de.uni_paderborn.fujaba.graphviz.graphviz.GraphvizPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraphvizPackageImpl() {
		super(eNS_URI, GraphvizFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GraphvizPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraphvizPackage init() {
		if (isInited) return (GraphvizPackage)EPackage.Registry.INSTANCE.getEPackage(GraphvizPackage.eNS_URI);

		// Obtain or create and register package
		GraphvizPackageImpl theGraphvizPackage = (GraphvizPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GraphvizPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GraphvizPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		OutputPackageImpl theOutputPackage = (OutputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OutputPackage.eNS_URI) instanceof OutputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OutputPackage.eNS_URI) : OutputPackage.eINSTANCE);

		// Create package meta-data objects
		theGraphvizPackage.createPackageContents();
		theInputPackage.createPackageContents();
		theOutputPackage.createPackageContents();

		// Initialize created meta-data
		theGraphvizPackage.initializePackageContents();
		theInputPackage.initializePackageContents();
		theOutputPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraphvizPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraphvizPackage.eNS_URI, theGraphvizPackage);
		return theGraphvizPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphvizFactory getGraphvizFactory() {
		return (GraphvizFactory)getEFactoryInstance();
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
		testEClass = createEClass(TEST);
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
		InputPackage theInputPackage = (InputPackage)EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI);
		OutputPackage theOutputPackage = (OutputPackage)EPackage.Registry.INSTANCE.getEPackage(OutputPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theInputPackage);
		getESubpackages().add(theOutputPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(testEClass, Test.class, "Test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GraphvizPackageImpl

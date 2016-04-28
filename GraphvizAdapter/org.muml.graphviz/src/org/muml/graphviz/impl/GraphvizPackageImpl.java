/**
 */
package org.muml.graphviz.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.graphviz.DummyClassForAcceleoWillBeDeleted;
import org.muml.graphviz.GraphvizFactory;
import org.muml.graphviz.GraphvizPackage;
import org.muml.graphviz.common.CommonPackage;
import org.muml.graphviz.common.impl.CommonPackageImpl;
import org.muml.graphviz.dot.DotPackage;
import org.muml.graphviz.dot.impl.DotPackageImpl;
import org.muml.graphviz.plain.PlainPackage;
import org.muml.graphviz.plain.impl.PlainPackageImpl;
import org.muml.graphviz.util.UtilPackage;
import org.muml.graphviz.util.impl.UtilPackageImpl;
import org.muml.mumlcore.CorePackage;

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
	private EClass dummyClassForAcceleoWillBeDeletedEClass = null;

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
	 * @see org.muml.graphviz.GraphvizPackage#eNS_URI
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
		DotPackageImpl theDotPackage = (DotPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DotPackage.eNS_URI) instanceof DotPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DotPackage.eNS_URI) : DotPackage.eINSTANCE);
		PlainPackageImpl thePlainPackage = (PlainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlainPackage.eNS_URI) instanceof PlainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlainPackage.eNS_URI) : PlainPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		theGraphvizPackage.createPackageContents();
		theDotPackage.createPackageContents();
		thePlainPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		theGraphvizPackage.initializePackageContents();
		theDotPackage.initializePackageContents();
		thePlainPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();

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
	public EClass getDummyClassForAcceleoWillBeDeleted() {
		return dummyClassForAcceleoWillBeDeletedEClass;
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
		dummyClassForAcceleoWillBeDeletedEClass = createEClass(DUMMY_CLASS_FOR_ACCELEO_WILL_BE_DELETED);
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
		DotPackage theDotPackage = (DotPackage)EPackage.Registry.INSTANCE.getEPackage(DotPackage.eNS_URI);
		PlainPackage thePlainPackage = (PlainPackage)EPackage.Registry.INSTANCE.getEPackage(PlainPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDotPackage);
		getESubpackages().add(thePlainPackage);
		getESubpackages().add(theCommonPackage);
		getESubpackages().add(theUtilPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dummyClassForAcceleoWillBeDeletedEClass, DummyClassForAcceleoWillBeDeleted.class, "DummyClassForAcceleoWillBeDeleted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GraphvizPackageImpl

/**
 */
package org.muml.graphviz.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.graphviz.DummyClassForAcceleoWillBeDeleted;
import org.muml.graphviz.GraphvizFactory;
import org.muml.graphviz.GraphvizPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphvizFactoryImpl extends EFactoryImpl implements GraphvizFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GraphvizFactory init() {
		try {
			GraphvizFactory theGraphvizFactory = (GraphvizFactory)EPackage.Registry.INSTANCE.getEFactory(GraphvizPackage.eNS_URI);
			if (theGraphvizFactory != null) {
				return theGraphvizFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GraphvizFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphvizFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GraphvizPackage.DUMMY_CLASS_FOR_ACCELEO_WILL_BE_DELETED: return createDummyClassForAcceleoWillBeDeleted();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DummyClassForAcceleoWillBeDeleted createDummyClassForAcceleoWillBeDeleted() {
		DummyClassForAcceleoWillBeDeletedImpl dummyClassForAcceleoWillBeDeleted = new DummyClassForAcceleoWillBeDeletedImpl();
		return dummyClassForAcceleoWillBeDeleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphvizPackage getGraphvizPackage() {
		return (GraphvizPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GraphvizPackage getPackage() {
		return GraphvizPackage.eINSTANCE;
	}

} //GraphvizFactoryImpl

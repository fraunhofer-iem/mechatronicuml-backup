/**
 */
package de.uni_paderborn.fujaba.graphviz.plain.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.graphviz.plain.PlainEdge;
import de.uni_paderborn.fujaba.graphviz.plain.PlainFactory;
import de.uni_paderborn.fujaba.graphviz.plain.PlainGraph;
import de.uni_paderborn.fujaba.graphviz.plain.PlainNode;
import de.uni_paderborn.fujaba.graphviz.plain.PlainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlainFactoryImpl extends EFactoryImpl implements PlainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlainFactory init() {
		try {
			PlainFactory thePlainFactory = (PlainFactory)EPackage.Registry.INSTANCE.getEFactory(PlainPackage.eNS_URI);
			if (thePlainFactory != null) {
				return thePlainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainFactoryImpl() {
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
			case PlainPackage.PLAIN_GRAPH: return createPlainGraph();
			case PlainPackage.PLAIN_NODE: return createPlainNode();
			case PlainPackage.PLAIN_EDGE: return createPlainEdge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainGraph createPlainGraph() {
		PlainGraphImpl plainGraph = new PlainGraphImpl();
		return plainGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainNode createPlainNode() {
		PlainNodeImpl plainNode = new PlainNodeImpl();
		return plainNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainEdge createPlainEdge() {
		PlainEdgeImpl plainEdge = new PlainEdgeImpl();
		return plainEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainPackage getPlainPackage() {
		return (PlainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlainPackage getPackage() {
		return PlainPackage.eINSTANCE;
	}

} //PlainFactoryImpl

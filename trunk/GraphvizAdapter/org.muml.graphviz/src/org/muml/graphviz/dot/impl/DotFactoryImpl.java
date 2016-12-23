/**
 */
package org.muml.graphviz.dot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.graphviz.dot.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DotFactoryImpl extends EFactoryImpl implements DotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DotFactory init() {
		try {
			DotFactory theDotFactory = (DotFactory)EPackage.Registry.INSTANCE.getEFactory(DotPackage.eNS_URI);
			if (theDotFactory != null) {
				return theDotFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotFactoryImpl() {
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
			case DotPackage.DOT_GRAPH: return createDotGraph();
			case DotPackage.DOT_NODE: return createDotNode();
			case DotPackage.SETTING: return createSetting();
			case DotPackage.DIRECTED_DOT_EDGE: return createDirectedDotEdge();
			case DotPackage.UNDIRECTED_DOT_EDGE: return createUndirectedDotEdge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotGraph createDotGraph() {
		DotGraphImpl dotGraph = new DotGraphImpl();
		return dotGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotNode createDotNode() {
		DotNodeImpl dotNode = new DotNodeImpl();
		return dotNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setting createSetting() {
		SettingImpl setting = new SettingImpl();
		return setting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedDotEdge createDirectedDotEdge() {
		DirectedDotEdgeImpl directedDotEdge = new DirectedDotEdgeImpl();
		return directedDotEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndirectedDotEdge createUndirectedDotEdge() {
		UndirectedDotEdgeImpl undirectedDotEdge = new UndirectedDotEdgeImpl();
		return undirectedDotEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotPackage getDotPackage() {
		return (DotPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DotPackage getPackage() {
		return DotPackage.eINSTANCE;
	}

} //DotFactoryImpl

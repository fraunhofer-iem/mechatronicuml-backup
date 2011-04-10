/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomiccomponenteditorFactory
 * @model kind="package"
 * @generated
 */
public interface AtomiccomponenteditorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atomiccomponenteditor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/uni_paderborn/fujaba/umlrt/atomiccomponenteditor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atomiccomponenteditor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtomiccomponenteditorPackage eINSTANCE = de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.impl.AtomiccomponenteditorPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.impl.AtomicComponentDiagramImpl <em>Atomic Component Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.impl.AtomicComponentDiagramImpl
	 * @see de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.impl.AtomiccomponenteditorPackageImpl#getAtomicComponentDiagram()
	 * @generated
	 */
	int ATOMIC_COMPONENT_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Atomic Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_DIAGRAM__ATOMIC_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Atomic Component Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_DIAGRAM_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomicComponentDiagram <em>Atomic Component Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Component Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomicComponentDiagram
	 * @generated
	 */
	EClass getAtomicComponentDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomicComponentDiagram#getAtomicComponent <em>Atomic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Atomic Component</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomicComponentDiagram#getAtomicComponent()
	 * @see #getAtomicComponentDiagram()
	 * @generated
	 */
	EReference getAtomicComponentDiagram_AtomicComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtomiccomponenteditorFactory getAtomiccomponenteditorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.impl.AtomicComponentDiagramImpl <em>Atomic Component Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.impl.AtomicComponentDiagramImpl
		 * @see de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.impl.AtomiccomponenteditorPackageImpl#getAtomicComponentDiagram()
		 * @generated
		 */
		EClass ATOMIC_COMPONENT_DIAGRAM = eINSTANCE.getAtomicComponentDiagram();

		/**
		 * The meta object literal for the '<em><b>Atomic Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_COMPONENT_DIAGRAM__ATOMIC_COMPONENT = eINSTANCE.getAtomicComponentDiagram_AtomicComponent();

	}

} //AtomiccomponenteditorPackage

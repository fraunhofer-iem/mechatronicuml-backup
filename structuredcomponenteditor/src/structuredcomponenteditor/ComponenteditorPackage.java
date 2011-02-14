/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package structuredcomponenteditor;

import de.uni_paderborn.fujaba.umlrt.model.modelstructure.ModelstructurePackage;

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
 * @see structuredcomponenteditor.ComponenteditorFactory
 * @model kind="package"
 * @generated
 */
public interface ComponenteditorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structuredcomponenteditor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://structuredcomponenteditor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "structuredcomponenteditor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponenteditorPackage eINSTANCE = structuredcomponenteditor.impl.ComponenteditorPackageImpl.init();

	/**
	 * The meta object id for the '{@link structuredcomponenteditor.impl.StructuredComponentDiagramImpl <em>Structured Component Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structuredcomponenteditor.impl.StructuredComponentDiagramImpl
	 * @see structuredcomponenteditor.impl.ComponenteditorPackageImpl#getStructuredComponentDiagram()
	 * @generated
	 */
	int STRUCTURED_COMPONENT_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Structured Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_DIAGRAM__STRUCTURED_COMPONENT = ModelstructurePackage.DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structured Component Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_DIAGRAM_FEATURE_COUNT = ModelstructurePackage.DIAGRAM_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link structuredcomponenteditor.StructuredComponentDiagram <em>Structured Component Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Component Diagram</em>'.
	 * @see structuredcomponenteditor.StructuredComponentDiagram
	 * @generated
	 */
	EClass getStructuredComponentDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link structuredcomponenteditor.StructuredComponentDiagram#getStructuredComponent <em>Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structured Component</em>'.
	 * @see structuredcomponenteditor.StructuredComponentDiagram#getStructuredComponent()
	 * @see #getStructuredComponentDiagram()
	 * @generated
	 */
	EReference getStructuredComponentDiagram_StructuredComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponenteditorFactory getComponenteditorFactory();

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
		 * The meta object literal for the '{@link structuredcomponenteditor.impl.StructuredComponentDiagramImpl <em>Structured Component Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structuredcomponenteditor.impl.StructuredComponentDiagramImpl
		 * @see structuredcomponenteditor.impl.ComponenteditorPackageImpl#getStructuredComponentDiagram()
		 * @generated
		 */
		EClass STRUCTURED_COMPONENT_DIAGRAM = eINSTANCE.getStructuredComponentDiagram();

		/**
		 * The meta object literal for the '<em><b>Structured Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_COMPONENT_DIAGRAM__STRUCTURED_COMPONENT = eINSTANCE.getStructuredComponentDiagram_StructuredComponent();

	}

} //ComponenteditorPackage

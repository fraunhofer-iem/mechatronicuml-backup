/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package patterneditor;

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
 * @see patterneditor.PatterneditorFactory
 * @model kind="package"
 * @generated
 */
public interface PatterneditorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "patterneditor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://patterneditor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "patterneditor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatterneditorPackage eINSTANCE = patterneditor.impl.PatterneditorPackageImpl.init();

	/**
	 * The meta object id for the '{@link patterneditor.impl.PatternDiagramImpl <em>Pattern Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patterneditor.impl.PatternDiagramImpl
	 * @see patterneditor.impl.PatterneditorPackageImpl#getPatternDiagram()
	 * @generated
	 */
	int PATTERN_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Coordination Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIAGRAM__COORDINATION_PATTERN = ModelstructurePackage.DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIAGRAM__ROLES = ModelstructurePackage.DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIAGRAM__ROLE_CONNECTORS = ModelstructurePackage.DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Textual Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIAGRAM__TEXTUAL_CONSTRAINTS = ModelstructurePackage.DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pattern Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIAGRAM_FEATURE_COUNT = ModelstructurePackage.DIAGRAM_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link patterneditor.PatternDiagram <em>Pattern Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diagram</em>'.
	 * @see patterneditor.PatternDiagram
	 * @generated
	 */
	EClass getPatternDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link patterneditor.PatternDiagram#getCoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordination Pattern</em>'.
	 * @see patterneditor.PatternDiagram#getCoordinationPattern()
	 * @see #getPatternDiagram()
	 * @generated
	 */
	EReference getPatternDiagram_CoordinationPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link patterneditor.PatternDiagram#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see patterneditor.PatternDiagram#getRoles()
	 * @see #getPatternDiagram()
	 * @generated
	 */
	EReference getPatternDiagram_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link patterneditor.PatternDiagram#getRoleConnectors <em>Role Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Connectors</em>'.
	 * @see patterneditor.PatternDiagram#getRoleConnectors()
	 * @see #getPatternDiagram()
	 * @generated
	 */
	EReference getPatternDiagram_RoleConnectors();

	/**
	 * Returns the meta object for the containment reference list '{@link patterneditor.PatternDiagram#getTextualConstraints <em>Textual Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textual Constraints</em>'.
	 * @see patterneditor.PatternDiagram#getTextualConstraints()
	 * @see #getPatternDiagram()
	 * @generated
	 */
	EReference getPatternDiagram_TextualConstraints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatterneditorFactory getPatterneditorFactory();

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
		 * The meta object literal for the '{@link patterneditor.impl.PatternDiagramImpl <em>Pattern Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patterneditor.impl.PatternDiagramImpl
		 * @see patterneditor.impl.PatterneditorPackageImpl#getPatternDiagram()
		 * @generated
		 */
		EClass PATTERN_DIAGRAM = eINSTANCE.getPatternDiagram();

		/**
		 * The meta object literal for the '<em><b>Coordination Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIAGRAM__COORDINATION_PATTERN = eINSTANCE.getPatternDiagram_CoordinationPattern();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIAGRAM__ROLES = eINSTANCE.getPatternDiagram_Roles();

		/**
		 * The meta object literal for the '<em><b>Role Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIAGRAM__ROLE_CONNECTORS = eINSTANCE.getPatternDiagram_RoleConnectors();

		/**
		 * The meta object literal for the '<em><b>Textual Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_DIAGRAM__TEXTUAL_CONSTRAINTS = eINSTANCE.getPatternDiagram_TextualConstraints();

	}

} //PatterneditorPackage

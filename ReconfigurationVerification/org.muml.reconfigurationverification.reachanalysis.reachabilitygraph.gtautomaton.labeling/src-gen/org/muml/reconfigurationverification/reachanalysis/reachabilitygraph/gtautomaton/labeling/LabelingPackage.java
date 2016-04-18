package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;

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
 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.LabelingFactory
 * @model kind="package"
 * @generated
 */
public interface LabelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "labeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/reconfigurationverification/reachanalysis/reachabilitygraph/gtautomaton/labeling/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gtautomatonlabeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LabelingPackage eINSTANCE = org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.impl.LabelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.impl.AtomicPropositionMappingImpl <em>Atomic Proposition Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.impl.AtomicPropositionMappingImpl
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.impl.LabelingPackageImpl#getAtomicPropositionMapping()
	 * @generated
	 */
	int ATOMIC_PROPOSITION_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROPOSITION_MAPPING__EXTENSIONS = CorePackage.EXTENSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROPOSITION_MAPPING__EXTENDABLE_BASE = CorePackage.EXTENSION__EXTENDABLE_BASE;

	/**
	 * The feature id for the '<em><b>Propositions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROPOSITION_MAPPING__PROPOSITIONS = CorePackage.EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Step Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROPOSITION_MAPPING__STEP_GRAPH = CorePackage.EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atomic Proposition Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROPOSITION_MAPPING_FEATURE_COUNT = CorePackage.EXTENSION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.AtomicPropositionMapping <em>Atomic Proposition Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Proposition Mapping</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.AtomicPropositionMapping
	 * @generated
	 */
	EClass getAtomicPropositionMapping();

	/**
	 * Returns the meta object for the attribute list '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.AtomicPropositionMapping#getPropositions <em>Propositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Propositions</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.AtomicPropositionMapping#getPropositions()
	 * @see #getAtomicPropositionMapping()
	 * @generated
	 */
	EAttribute getAtomicPropositionMapping_Propositions();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.AtomicPropositionMapping#getStepGraph <em>Step Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step Graph</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.AtomicPropositionMapping#getStepGraph()
	 * @see #getAtomicPropositionMapping()
	 * @generated
	 */
	EReference getAtomicPropositionMapping_StepGraph();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LabelingFactory getLabelingFactory();

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
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.impl.AtomicPropositionMappingImpl <em>Atomic Proposition Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.impl.AtomicPropositionMappingImpl
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.impl.LabelingPackageImpl#getAtomicPropositionMapping()
		 * @generated
		 */
		EClass ATOMIC_PROPOSITION_MAPPING = eINSTANCE.getAtomicPropositionMapping();

		/**
		 * The meta object literal for the '<em><b>Propositions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_PROPOSITION_MAPPING__PROPOSITIONS = eINSTANCE.getAtomicPropositionMapping_Propositions();

		/**
		 * The meta object literal for the '<em><b>Step Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_PROPOSITION_MAPPING__STEP_GRAPH = eINSTANCE.getAtomicPropositionMapping_StepGraph();

	}

} //LabelingPackage
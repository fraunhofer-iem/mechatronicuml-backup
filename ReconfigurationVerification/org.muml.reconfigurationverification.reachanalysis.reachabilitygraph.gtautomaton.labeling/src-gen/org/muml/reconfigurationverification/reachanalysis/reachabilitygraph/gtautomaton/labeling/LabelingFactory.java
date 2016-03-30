/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.LabelingPackage
 * @generated
 */
public interface LabelingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LabelingFactory eINSTANCE = org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.impl.LabelingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Atomic Proposition Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Proposition Mapping</em>'.
	 * @generated
	 */
	AtomicPropositionMapping createAtomicPropositionMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LabelingPackage getLabelingPackage();

} //LabelingFactory

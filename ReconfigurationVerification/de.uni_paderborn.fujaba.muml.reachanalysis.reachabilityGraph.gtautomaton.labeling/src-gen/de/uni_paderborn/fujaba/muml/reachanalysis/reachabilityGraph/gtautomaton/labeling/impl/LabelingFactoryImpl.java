/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling.AtomicPropositionMapping;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling.LabelingFactory;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling.LabelingPackage;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling.computation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LabelingFactoryImpl extends EFactoryImpl implements LabelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LabelingFactory init() {
		try {
			LabelingFactory theLabelingFactory = (LabelingFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/reachabilityGraph/gtautomaton/labeling/0.1.0"); 
			if (theLabelingFactory != null) {
				return theLabelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LabelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelingFactoryImpl() {
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
			case LabelingPackage.ATOMIC_PROPOSITION_MAPPING: return createAtomicPropositionMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicPropositionMapping createAtomicPropositionMapping() {
		AtomicPropositionMappingImpl atomicPropositionMapping = new AtomicPropositionMappingImpl();
		return atomicPropositionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelingPackage getLabelingPackage() {
		return (LabelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LabelingPackage getPackage() {
		return LabelingPackage.eINSTANCE;
	}

} //LabelingFactoryImpl

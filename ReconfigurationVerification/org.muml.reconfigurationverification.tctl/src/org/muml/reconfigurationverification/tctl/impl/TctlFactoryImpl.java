/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.tctl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.reconfigurationverification.tctl.*;
import org.muml.reconfigurationverification.tctl.AtomicProposition;
import org.muml.reconfigurationverification.tctl.BinaryLogicFormula;
import org.muml.reconfigurationverification.tctl.BinaryLogicOperator;
import org.muml.reconfigurationverification.tctl.BinaryTemporalFormula;
import org.muml.reconfigurationverification.tctl.ComparisonOperator;
import org.muml.reconfigurationverification.tctl.NotFormula;
import org.muml.reconfigurationverification.tctl.TCTLFormula;
import org.muml.reconfigurationverification.tctl.TctlFactory;
import org.muml.reconfigurationverification.tctl.TctlPackage;
import org.muml.reconfigurationverification.tctl.TemporalOperator;
import org.muml.reconfigurationverification.tctl.UnaryTemporalFormula;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TctlFactoryImpl extends EFactoryImpl implements TctlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TctlFactory init() {
		try {
			TctlFactory theTctlFactory = (TctlFactory)EPackage.Registry.INSTANCE.getEFactory(TctlPackage.eNS_URI);
			if (theTctlFactory != null) {
				return theTctlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TctlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TctlFactoryImpl() {
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
			case TctlPackage.NOT_FORMULA: return createNotFormula();
			case TctlPackage.UNARY_TEMPORAL_FORMULA: return createUnaryTemporalFormula();
			case TctlPackage.BINARY_LOGIC_FORMULA: return createBinaryLogicFormula();
			case TctlPackage.BINARY_TEMPORAL_FORMULA: return createBinaryTemporalFormula();
			case TctlPackage.ATOMIC_PROPOSITION: return createAtomicProposition();
			case TctlPackage.TCTL_FORMULA: return createTCTLFormula();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TctlPackage.COMPARISON_OPERATOR:
				return createComparisonOperatorFromString(eDataType, initialValue);
			case TctlPackage.BINARY_LOGIC_OPERATOR:
				return createBinaryLogicOperatorFromString(eDataType, initialValue);
			case TctlPackage.TEMPORAL_OPERATOR:
				return createTemporalOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TctlPackage.COMPARISON_OPERATOR:
				return convertComparisonOperatorToString(eDataType, instanceValue);
			case TctlPackage.BINARY_LOGIC_OPERATOR:
				return convertBinaryLogicOperatorToString(eDataType, instanceValue);
			case TctlPackage.TEMPORAL_OPERATOR:
				return convertTemporalOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotFormula createNotFormula() {
		NotFormulaImpl notFormula = new NotFormulaImpl();
		return notFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryTemporalFormula createUnaryTemporalFormula() {
		UnaryTemporalFormulaImpl unaryTemporalFormula = new UnaryTemporalFormulaImpl();
		return unaryTemporalFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryLogicFormula createBinaryLogicFormula() {
		BinaryLogicFormulaImpl binaryLogicFormula = new BinaryLogicFormulaImpl();
		return binaryLogicFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryTemporalFormula createBinaryTemporalFormula() {
		BinaryTemporalFormulaImpl binaryTemporalFormula = new BinaryTemporalFormulaImpl();
		return binaryTemporalFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicProposition createAtomicProposition() {
		AtomicPropositionImpl atomicProposition = new AtomicPropositionImpl();
		return atomicProposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCTLFormula createTCTLFormula() {
		TCTLFormulaImpl tctlFormula = new TCTLFormulaImpl();
		return tctlFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator createComparisonOperatorFromString(EDataType eDataType, String initialValue) {
		ComparisonOperator result = ComparisonOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryLogicOperator createBinaryLogicOperatorFromString(EDataType eDataType, String initialValue) {
		BinaryLogicOperator result = BinaryLogicOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryLogicOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalOperator createTemporalOperatorFromString(EDataType eDataType, String initialValue) {
		TemporalOperator result = TemporalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemporalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TctlPackage getTctlPackage() {
		return (TctlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TctlPackage getPackage() {
		return TctlPackage.eINSTANCE;
	}

} //TctlFactoryImpl

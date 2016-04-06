/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.fotctl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.reconfigurationverification.fotctl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FotctlFactoryImpl extends EFactoryImpl implements FotctlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FotctlFactory init() {
		try {
			FotctlFactory theFotctlFactory = (FotctlFactory)EPackage.Registry.INSTANCE.getEFactory(FotctlPackage.eNS_URI);
			if (theFotctlFactory != null) {
				return theFotctlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FotctlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FotctlFactoryImpl() {
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
			case FotctlPackage.FO_TCTL_SPEC: return createFoTCTLSpec();
			case FotctlPackage.FO_TCTL_FORMULA: return createFoTCTLFormula();
			case FotctlPackage.NODE_LABEL_PREDICATE_DECL: return createNodeLabelPredicateDecl();
			case FotctlPackage.EDGE_LABEL_PREDICATE_DECL: return createEdgeLabelPredicateDecl();
			case FotctlPackage.CONSTANT_SYMBOL_DECL: return createConstantSymbolDecl();
			case FotctlPackage.QUANTIFIED_FORMULA: return createQuantifiedFormula();
			case FotctlPackage.NODE_LABEL_PREDICATE: return createNodeLabelPredicate();
			case FotctlPackage.EDGE_LABEL_PREDICATE: return createEdgeLabelPredicate();
			case FotctlPackage.VARIABLE: return createVariable();
			case FotctlPackage.CONSTANT: return createConstant();
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
			case FotctlPackage.QUANTIFIER:
				return createQuantifierFromString(eDataType, initialValue);
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
			case FotctlPackage.QUANTIFIER:
				return convertQuantifierToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoTCTLSpec createFoTCTLSpec() {
		FoTCTLSpecImpl foTCTLSpec = new FoTCTLSpecImpl();
		return foTCTLSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoTCTLFormula createFoTCTLFormula() {
		FoTCTLFormulaImpl foTCTLFormula = new FoTCTLFormulaImpl();
		return foTCTLFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeLabelPredicateDecl createNodeLabelPredicateDecl() {
		NodeLabelPredicateDeclImpl nodeLabelPredicateDecl = new NodeLabelPredicateDeclImpl();
		return nodeLabelPredicateDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeLabelPredicateDecl createEdgeLabelPredicateDecl() {
		EdgeLabelPredicateDeclImpl edgeLabelPredicateDecl = new EdgeLabelPredicateDeclImpl();
		return edgeLabelPredicateDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantSymbolDecl createConstantSymbolDecl() {
		ConstantSymbolDeclImpl constantSymbolDecl = new ConstantSymbolDeclImpl();
		return constantSymbolDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifiedFormula createQuantifiedFormula() {
		QuantifiedFormulaImpl quantifiedFormula = new QuantifiedFormulaImpl();
		return quantifiedFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeLabelPredicate createNodeLabelPredicate() {
		NodeLabelPredicateImpl nodeLabelPredicate = new NodeLabelPredicateImpl();
		return nodeLabelPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeLabelPredicate createEdgeLabelPredicate() {
		EdgeLabelPredicateImpl edgeLabelPredicate = new EdgeLabelPredicateImpl();
		return edgeLabelPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier createQuantifierFromString(EDataType eDataType, String initialValue) {
		Quantifier result = Quantifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FotctlPackage getFotctlPackage() {
		return (FotctlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FotctlPackage getPackage() {
		return FotctlPackage.eINSTANCE;
	}

} //FotctlFactoryImpl

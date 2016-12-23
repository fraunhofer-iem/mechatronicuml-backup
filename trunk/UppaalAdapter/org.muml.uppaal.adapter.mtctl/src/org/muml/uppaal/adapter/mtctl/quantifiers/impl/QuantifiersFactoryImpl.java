/**
 */
package org.muml.uppaal.adapter.mtctl.quantifiers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.uppaal.adapter.mtctl.quantifiers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantifiersFactoryImpl extends EFactoryImpl implements QuantifiersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuantifiersFactory init() {
		try {
			QuantifiersFactory theQuantifiersFactory = (QuantifiersFactory)EPackage.Registry.INSTANCE.getEFactory(QuantifiersPackage.eNS_URI);
			if (theQuantifiersFactory != null) {
				return theQuantifiersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuantifiersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifiersFactoryImpl() {
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
			case QuantifiersPackage.AF_EXPR: return createAFExpr();
			case QuantifiersPackage.AG_EXPR: return createAGExpr();
			case QuantifiersPackage.EF_EXPR: return createEFExpr();
			case QuantifiersPackage.EG_EXPR: return createEGExpr();
			case QuantifiersPackage.EXISTENCE_QUANT_EXPR: return createExistenceQuantExpr();
			case QuantifiersPackage.BOUND_VARIABLE: return createBoundVariable();
			case QuantifiersPackage.UNIVERSAL_QUANT_EXPR: return createUniversalQuantExpr();
			case QuantifiersPackage.LEADS_TO_EXPR: return createLeadsToExpr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFExpr createAFExpr() {
		AFExprImpl afExpr = new AFExprImpl();
		return afExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AGExpr createAGExpr() {
		AGExprImpl agExpr = new AGExprImpl();
		return agExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFExpr createEFExpr() {
		EFExprImpl efExpr = new EFExprImpl();
		return efExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGExpr createEGExpr() {
		EGExprImpl egExpr = new EGExprImpl();
		return egExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceQuantExpr createExistenceQuantExpr() {
		ExistenceQuantExprImpl existenceQuantExpr = new ExistenceQuantExprImpl();
		return existenceQuantExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundVariable createBoundVariable() {
		BoundVariableImpl boundVariable = new BoundVariableImpl();
		return boundVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversalQuantExpr createUniversalQuantExpr() {
		UniversalQuantExprImpl universalQuantExpr = new UniversalQuantExprImpl();
		return universalQuantExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeadsToExpr createLeadsToExpr() {
		LeadsToExprImpl leadsToExpr = new LeadsToExprImpl();
		return leadsToExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifiersPackage getQuantifiersPackage() {
		return (QuantifiersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuantifiersPackage getPackage() {
		return QuantifiersPackage.eINSTANCE;
	}

} //QuantifiersFactoryImpl

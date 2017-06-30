/**
 */
package org.muml.uppaal.adapter.mtctl.booleanlogic.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.uppaal.adapter.mtctl.booleanlogic.AndExpr;
import org.muml.uppaal.adapter.mtctl.booleanlogic.BooleanlogicFactory;
import org.muml.uppaal.adapter.mtctl.booleanlogic.BooleanlogicPackage;
import org.muml.uppaal.adapter.mtctl.booleanlogic.ImplyExpr;
import org.muml.uppaal.adapter.mtctl.booleanlogic.NotExpr;
import org.muml.uppaal.adapter.mtctl.booleanlogic.OrExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanlogicFactoryImpl extends EFactoryImpl implements BooleanlogicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BooleanlogicFactory init() {
		try {
			BooleanlogicFactory theBooleanlogicFactory = (BooleanlogicFactory)EPackage.Registry.INSTANCE.getEFactory(BooleanlogicPackage.eNS_URI);
			if (theBooleanlogicFactory != null) {
				return theBooleanlogicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BooleanlogicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanlogicFactoryImpl() {
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
			case BooleanlogicPackage.AND_EXPR: return createAndExpr();
			case BooleanlogicPackage.IMPLY_EXPR: return createImplyExpr();
			case BooleanlogicPackage.NOT_EXPR: return createNotExpr();
			case BooleanlogicPackage.OR_EXPR: return createOrExpr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndExpr createAndExpr() {
		AndExprImpl andExpr = new AndExprImpl();
		return andExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplyExpr createImplyExpr() {
		ImplyExprImpl implyExpr = new ImplyExprImpl();
		return implyExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotExpr createNotExpr() {
		NotExprImpl notExpr = new NotExprImpl();
		return notExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrExpr createOrExpr() {
		OrExprImpl orExpr = new OrExprImpl();
		return orExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanlogicPackage getBooleanlogicPackage() {
		return (BooleanlogicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BooleanlogicPackage getPackage() {
		return BooleanlogicPackage.eINSTANCE;
	}

} //BooleanlogicFactoryImpl

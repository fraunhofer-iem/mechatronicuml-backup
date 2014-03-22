/**
 */
package mtctl.BooleanLogic.impl;

import mtctl.BooleanLogic.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanLogicFactoryImpl extends EFactoryImpl implements BooleanLogicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BooleanLogicFactory init() {
		try {
			BooleanLogicFactory theBooleanLogicFactory = (BooleanLogicFactory)EPackage.Registry.INSTANCE.getEFactory(BooleanLogicPackage.eNS_URI);
			if (theBooleanLogicFactory != null) {
				return theBooleanLogicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BooleanLogicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLogicFactoryImpl() {
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
			case BooleanLogicPackage.AND_EXPR: return createAndExpr();
			case BooleanLogicPackage.IMPLY_EXPR: return createImplyExpr();
			case BooleanLogicPackage.NOT_EXPR: return createNotExpr();
			case BooleanLogicPackage.OR_EXPR: return createOrExpr();
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
	public BooleanLogicPackage getBooleanLogicPackage() {
		return (BooleanLogicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BooleanLogicPackage getPackage() {
		return BooleanLogicPackage.eINSTANCE;
	}

} //BooleanLogicFactoryImpl

/**
 */
package mtctl.Comparables.impl;

import mtctl.Comparables.*;

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
public class ComparablesFactoryImpl extends EFactoryImpl implements ComparablesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComparablesFactory init() {
		try {
			ComparablesFactory theComparablesFactory = (ComparablesFactory)EPackage.Registry.INSTANCE.getEFactory(ComparablesPackage.eNS_URI);
			if (theComparablesFactory != null) {
				return theComparablesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComparablesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparablesFactoryImpl() {
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
			case ComparablesPackage.BUFFER_MSG_COUNT_EXPR: return createBufferMsgCountExpr();
			case ComparablesPackage.CONST_EXPR: return createConstExpr();
			case ComparablesPackage.PRIMITIVE_VARIABLE_EXPR: return createPrimitiveVariableExpr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferMsgCountExpr createBufferMsgCountExpr() {
		BufferMsgCountExprImpl bufferMsgCountExpr = new BufferMsgCountExprImpl();
		return bufferMsgCountExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstExpr createConstExpr() {
		ConstExprImpl constExpr = new ConstExprImpl();
		return constExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveVariableExpr createPrimitiveVariableExpr() {
		PrimitiveVariableExprImpl primitiveVariableExpr = new PrimitiveVariableExprImpl();
		return primitiveVariableExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparablesPackage getComparablesPackage() {
		return (ComparablesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComparablesPackage getPackage() {
		return ComparablesPackage.eINSTANCE;
	}

} //ComparablesFactoryImpl

/**
 */
package org.muml.uppaal.adapter.mtctl.comparables.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.uppaal.adapter.mtctl.comparables.*;

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
			case ComparablesPackage.MUML_ELEM_EXPR: return createMumlElemExpr();
			case ComparablesPackage.SOURCE_STATE_EXPR: return createSourceStateExpr();
			case ComparablesPackage.TARGET_STATE_EXPR: return createTargetStateExpr();
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
	public MumlElemExpr createMumlElemExpr() {
		MumlElemExprImpl mumlElemExpr = new MumlElemExprImpl();
		return mumlElemExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceStateExpr createSourceStateExpr() {
		SourceStateExprImpl sourceStateExpr = new SourceStateExprImpl();
		return sourceStateExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetStateExpr createTargetStateExpr() {
		TargetStateExprImpl targetStateExpr = new TargetStateExprImpl();
		return targetStateExpr;
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

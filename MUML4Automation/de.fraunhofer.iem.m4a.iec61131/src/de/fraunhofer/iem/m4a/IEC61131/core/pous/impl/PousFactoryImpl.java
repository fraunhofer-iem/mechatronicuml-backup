/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.pous.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.*;

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
public class PousFactoryImpl extends EFactoryImpl implements PousFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PousFactory init() {
		try {
			PousFactory thePousFactory = (PousFactory)EPackage.Registry.INSTANCE.getEFactory(PousPackage.eNS_URI);
			if (thePousFactory != null) {
				return thePousFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PousFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PousFactoryImpl() {
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
			case PousPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
			case PousPackage.FUNCTION_BLOCK_DECLARATION: return createFunctionBlockDeclaration();
			case PousPackage.PROGRAM_DECLARATION: return createProgramDeclaration();
			case PousPackage.BLACKBOX_FUNCTION_BLOCK_DECLARATION: return createBlackboxFunctionBlockDeclaration();
			case PousPackage.FUNCTION_BLOCK_POINTER: return createFunctionBlockPointer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDeclaration createFunctionDeclaration() {
		FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
		return functionDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockDeclaration createFunctionBlockDeclaration() {
		FunctionBlockDeclarationImpl functionBlockDeclaration = new FunctionBlockDeclarationImpl();
		return functionBlockDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramDeclaration createProgramDeclaration() {
		ProgramDeclarationImpl programDeclaration = new ProgramDeclarationImpl();
		return programDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlackboxFunctionBlockDeclaration createBlackboxFunctionBlockDeclaration() {
		BlackboxFunctionBlockDeclarationImpl blackboxFunctionBlockDeclaration = new BlackboxFunctionBlockDeclarationImpl();
		return blackboxFunctionBlockDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockPointer createFunctionBlockPointer() {
		FunctionBlockPointerImpl functionBlockPointer = new FunctionBlockPointerImpl();
		return functionBlockPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PousPackage getPousPackage() {
		return (PousPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PousPackage getPackage() {
		return PousPackage.eINSTANCE;
	}

} //PousFactoryImpl

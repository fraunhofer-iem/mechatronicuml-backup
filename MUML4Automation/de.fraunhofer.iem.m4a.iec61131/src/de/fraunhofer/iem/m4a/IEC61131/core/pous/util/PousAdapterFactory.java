/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.pous.util;

import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.CommentableElement;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage
 * @generated
 */
public class PousAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PousPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PousAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PousPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PousSwitch<Adapter> modelSwitch =
		new PousSwitch<Adapter>() {
			@Override
			public Adapter caseFunctionDeclaration(FunctionDeclaration object) {
				return createFunctionDeclarationAdapter();
			}
			@Override
			public Adapter caseFunctionReturnDomain(FunctionReturnDomain object) {
				return createFunctionReturnDomainAdapter();
			}
			@Override
			public Adapter caseFunctionBody(FunctionBody object) {
				return createFunctionBodyAdapter();
			}
			@Override
			public Adapter caseFunctionBlockDeclaration(FunctionBlockDeclaration object) {
				return createFunctionBlockDeclarationAdapter();
			}
			@Override
			public Adapter caseFunctionBlockBody(FunctionBlockBody object) {
				return createFunctionBlockBodyAdapter();
			}
			@Override
			public Adapter caseProgramDeclaration(ProgramDeclaration object) {
				return createProgramDeclarationAdapter();
			}
			@Override
			public Adapter casePOU(POU object) {
				return createPOUAdapter();
			}
			@Override
			public Adapter caseAbstractFunctionBlockDeclaration(AbstractFunctionBlockDeclaration object) {
				return createAbstractFunctionBlockDeclarationAdapter();
			}
			@Override
			public Adapter caseBlackboxFunctionBlockDeclaration(BlackboxFunctionBlockDeclaration object) {
				return createBlackboxFunctionBlockDeclarationAdapter();
			}
			@Override
			public Adapter caseFunctionBlockPointer(FunctionBlockPointer object) {
				return createFunctionBlockPointerAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseLibraryElement(LibraryElement object) {
				return createLibraryElementAdapter();
			}
			@Override
			public Adapter caseCommentableElement(CommentableElement object) {
				return createCommentableElementAdapter();
			}
			@Override
			public Adapter caseExternalVarSpec(ExternalVarSpec object) {
				return createExternalVarSpecAdapter();
			}
			@Override
			public Adapter caseGlobalVarSpecInit(GlobalVarSpecInit object) {
				return createGlobalVarSpecInitAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration <em>Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration
	 * @generated
	 */
	public Adapter createFunctionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionReturnDomain <em>Function Return Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionReturnDomain
	 * @generated
	 */
	public Adapter createFunctionReturnDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody <em>Function Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody
	 * @generated
	 */
	public Adapter createFunctionBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration <em>Function Block Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration
	 * @generated
	 */
	public Adapter createFunctionBlockDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody <em>Function Block Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody
	 * @generated
	 */
	public Adapter createFunctionBlockBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.ProgramDeclaration <em>Program Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.ProgramDeclaration
	 * @generated
	 */
	public Adapter createProgramDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.POU <em>POU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.POU
	 * @generated
	 */
	public Adapter createPOUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.AbstractFunctionBlockDeclaration <em>Abstract Function Block Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.AbstractFunctionBlockDeclaration
	 * @generated
	 */
	public Adapter createAbstractFunctionBlockDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.BlackboxFunctionBlockDeclaration <em>Blackbox Function Block Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.BlackboxFunctionBlockDeclaration
	 * @generated
	 */
	public Adapter createBlackboxFunctionBlockDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockPointer <em>Function Block Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockPointer
	 * @generated
	 */
	public Adapter createFunctionBlockPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement <em>Library Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement
	 * @generated
	 */
	public Adapter createLibraryElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.CommentableElement
	 * @generated
	 */
	public Adapter createCommentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarSpec <em>External Var Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarSpec
	 * @generated
	 */
	public Adapter createExternalVarSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpecInit <em>Global Var Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpecInit
	 * @generated
	 */
	public Adapter createGlobalVarSpecInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PousAdapterFactory

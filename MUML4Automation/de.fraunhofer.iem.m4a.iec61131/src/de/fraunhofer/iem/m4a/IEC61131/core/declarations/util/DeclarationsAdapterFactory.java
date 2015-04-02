/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.util;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.*;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage
 * @generated
 */
public class DeclarationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeclarationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DeclarationsPackage.eINSTANCE;
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
	protected DeclarationsSwitch<Adapter> modelSwitch =
		new DeclarationsSwitch<Adapter>() {
			@Override
			public Adapter caseVariableDeclaration(VariableDeclaration object) {
				return createVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseIOVarDeclaration(IOVarDeclaration object) {
				return createIOVarDeclarationAdapter();
			}
			@Override
			public Adapter caseInputVarContainer(InputVarContainer object) {
				return createInputVarContainerAdapter();
			}
			@Override
			public Adapter caseOutputVarContainer(OutputVarContainer object) {
				return createOutputVarContainerAdapter();
			}
			@Override
			public Adapter caseInputOutputVarContainer(InputOutputVarContainer object) {
				return createInputOutputVarContainerAdapter();
			}
			@Override
			public Adapter caseFBProgramVarDeclaration(FBProgramVarDeclaration object) {
				return createFBProgramVarDeclarationAdapter();
			}
			@Override
			public Adapter caseVarDeclarationContainer(VarDeclarationContainer object) {
				return createVarDeclarationContainerAdapter();
			}
			@Override
			public Adapter caseExternalVarContainer(ExternalVarContainer object) {
				return createExternalVarContainerAdapter();
			}
			@Override
			public Adapter caseTempVarDeclarationContainer(TempVarDeclarationContainer object) {
				return createTempVarDeclarationContainerAdapter();
			}
			@Override
			public Adapter caseIncomplLocatedVarContainer(IncomplLocatedVarContainer object) {
				return createIncomplLocatedVarContainerAdapter();
			}
			@Override
			public Adapter caseProgramSpecificDeclaration(ProgramSpecificDeclaration object) {
				return createProgramSpecificDeclarationAdapter();
			}
			@Override
			public Adapter caseLocatedVarDeclarationContainer(LocatedVarDeclarationContainer object) {
				return createLocatedVarDeclarationContainerAdapter();
			}
			@Override
			public Adapter caseProgramAccessContainer(ProgramAccessContainer object) {
				return createProgramAccessContainerAdapter();
			}
			@Override
			public Adapter caseFunctionVarContainer(FunctionVarContainer object) {
				return createFunctionVarContainerAdapter();
			}
			@Override
			public Adapter caseGlobalVarDeclarationContainer(GlobalVarDeclarationContainer object) {
				return createGlobalVarDeclarationContainerAdapter();
			}
			@Override
			public Adapter caseFunctionVariableDeclaration(FunctionVariableDeclaration object) {
				return createFunctionVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseFunctionBlockVariableDeclaration(FunctionBlockVariableDeclaration object) {
				return createFunctionBlockVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseProgramVariableDeclaration(ProgramVariableDeclaration object) {
				return createProgramVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseConfigurationVariableDeclaration(ConfigurationVariableDeclaration object) {
				return createConfigurationVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseResourceVariableDeclaration(ResourceVariableDeclaration object) {
				return createResourceVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseAccessVarContainer(AccessVarContainer object) {
				return createAccessVarContainerAdapter();
			}
			@Override
			public Adapter caseInstanceSpecificVarContainter(InstanceSpecificVarContainter object) {
				return createInstanceSpecificVarContainterAdapter();
			}
			@Override
			public Adapter caseConfigurationSpecificDeclaration(ConfigurationSpecificDeclaration object) {
				return createConfigurationSpecificDeclarationAdapter();
			}
			@Override
			public Adapter caseInputDeclaration(InputDeclaration object) {
				return createInputDeclarationAdapter();
			}
			@Override
			public Adapter caseEdgeDeclaration(EdgeDeclaration object) {
				return createEdgeDeclarationAdapter();
			}
			@Override
			public Adapter caseVarInitDeclaration(VarInitDeclaration object) {
				return createVarInitDeclarationAdapter();
			}
			@Override
			public Adapter caseVar1SpecInitDecl(Var1SpecInitDecl object) {
				return createVar1SpecInitDeclAdapter();
			}
			@Override
			public Adapter caseStringVarDecl(StringVarDecl object) {
				return createStringVarDeclAdapter();
			}
			@Override
			public Adapter caseSingleByteStringSpecInit(SingleByteStringSpecInit object) {
				return createSingleByteStringSpecInitAdapter();
			}
			@Override
			public Adapter caseDoubleByteStringSpecInit(DoubleByteStringSpecInit object) {
				return createDoubleByteStringSpecInitAdapter();
			}
			@Override
			public Adapter caseVarDeclarationOnly(VarDeclarationOnly object) {
				return createVarDeclarationOnlyAdapter();
			}
			@Override
			public Adapter caseTempVarDeclaration(TempVarDeclaration object) {
				return createTempVarDeclarationAdapter();
			}
			@Override
			public Adapter caseVar1Decl(Var1Decl object) {
				return createVar1DeclAdapter();
			}
			@Override
			public Adapter caseLocatedVarDeclaration(LocatedVarDeclaration object) {
				return createLocatedVarDeclarationAdapter();
			}
			@Override
			public Adapter caseIncomplLocatedVarDeclaration(IncomplLocatedVarDeclaration object) {
				return createIncomplLocatedVarDeclarationAdapter();
			}
			@Override
			public Adapter caseStringSpecification(StringSpecification object) {
				return createStringSpecificationAdapter();
			}
			@Override
			public Adapter caseVarSpec(VarSpec object) {
				return createVarSpecAdapter();
			}
			@Override
			public Adapter caseOnlyNamedGlobalVar(OnlyNamedGlobalVar object) {
				return createOnlyNamedGlobalVarAdapter();
			}
			@Override
			public Adapter caseLocatedGlobalVar(LocatedGlobalVar object) {
				return createLocatedGlobalVarAdapter();
			}
			@Override
			public Adapter caseGlobalVarSpec(GlobalVarSpec object) {
				return createGlobalVarSpecAdapter();
			}
			@Override
			public Adapter caseGlobalVarDeclaration(GlobalVarDeclaration object) {
				return createGlobalVarDeclarationAdapter();
			}
			@Override
			public Adapter caseVar2SpecInitDecl(Var2SpecInitDecl object) {
				return createVar2SpecInitDeclAdapter();
			}
			@Override
			public Adapter caseProgramAccessDeclaration(ProgramAccessDeclaration object) {
				return createProgramAccessDeclarationAdapter();
			}
			@Override
			public Adapter caseFBInstance(FBInstance object) {
				return createFBInstanceAdapter();
			}
			@Override
			public Adapter caseExternalVarDeclaration(ExternalVarDeclaration object) {
				return createExternalVarDeclarationAdapter();
			}
			@Override
			public Adapter caseArrayStructVarSpec(ArrayStructVarSpec object) {
				return createArrayStructVarSpecAdapter();
			}
			@Override
			public Adapter caseSharedVarSpec(SharedVarSpec object) {
				return createSharedVarSpecAdapter();
			}
			@Override
			public Adapter caseSingleByteStringVar(SingleByteStringVar object) {
				return createSingleByteStringVarAdapter();
			}
			@Override
			public Adapter caseSingleByteStringSpec(SingleByteStringSpec object) {
				return createSingleByteStringSpecAdapter();
			}
			@Override
			public Adapter caseStringVariable(StringVariable object) {
				return createStringVariableAdapter();
			}
			@Override
			public Adapter caseDoubleByteStringSpec(DoubleByteStringSpec object) {
				return createDoubleByteStringSpecAdapter();
			}
			@Override
			public Adapter caseDoubleByteStringVar(DoubleByteStringVar object) {
				return createDoubleByteStringVarAdapter();
			}
			@Override
			public Adapter caseAccessDeclaration(AccessDeclaration object) {
				return createAccessDeclarationAdapter();
			}
			@Override
			public Adapter caseSymbolicAccessPath(SymbolicAccessPath object) {
				return createSymbolicAccessPathAdapter();
			}
			@Override
			public Adapter caseInstanceSpecificVarInit(InstanceSpecificVarInit object) {
				return createInstanceSpecificVarInitAdapter();
			}
			@Override
			public Adapter caseInstanceSpecificVariable(InstanceSpecificVariable object) {
				return createInstanceSpecificVariableAdapter();
			}
			@Override
			public Adapter caseInstanceSpecificFB(InstanceSpecificFB object) {
				return createInstanceSpecificFBAdapter();
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
			public Adapter caseInstanceSpecificSpecInit(InstanceSpecificSpecInit object) {
				return createInstanceSpecificSpecInitAdapter();
			}
			@Override
			public Adapter caseVar2SpecInit(Var2SpecInit object) {
				return createVar2SpecInitAdapter();
			}
			@Override
			public Adapter caseVar1SpecInit(Var1SpecInit object) {
				return createVar1SpecInitAdapter();
			}
			@Override
			public Adapter caseNamedVariableDeclaration(NamedVariableDeclaration object) {
				return createNamedVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseLocatedVarSpecInit(LocatedVarSpecInit object) {
				return createLocatedVarSpecInitAdapter();
			}
			@Override
			public Adapter caseVar1Specification(Var1Specification object) {
				return createVar1SpecificationAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IOVarDeclaration <em>IO Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.IOVarDeclaration
	 * @generated
	 */
	public Adapter createIOVarDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer <em>Input Var Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer
	 * @generated
	 */
	public Adapter createInputVarContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.OutputVarContainer <em>Output Var Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.OutputVarContainer
	 * @generated
	 */
	public Adapter createOutputVarContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputOutputVarContainer <em>Input Output Var Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputOutputVarContainer
	 * @generated
	 */
	public Adapter createInputOutputVarContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBProgramVarDeclaration <em>FB Program Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBProgramVarDeclaration
	 * @generated
	 */
	public Adapter createFBProgramVarDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationContainer <em>Var Declaration Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationContainer
	 * @generated
	 */
	public Adapter createVarDeclarationContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarContainer <em>External Var Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarContainer
	 * @generated
	 */
	public Adapter createExternalVarContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration <em>External Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration
	 * @generated
	 */
	public Adapter createExternalVarDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ArrayStructVarSpec <em>Array Struct Var Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ArrayStructVarSpec
	 * @generated
	 */
	public Adapter createArrayStructVarSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SharedVarSpec <em>Shared Var Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.SharedVarSpec
	 * @generated
	 */
	public Adapter createSharedVarSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringVar <em>Single Byte String Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringVar
	 * @generated
	 */
	public Adapter createSingleByteStringVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclarationContainer <em>Temp Var Declaration Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclarationContainer
	 * @generated
	 */
	public Adapter createTempVarDeclarationContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarContainer <em>Incompl Located Var Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarContainer
	 * @generated
	 */
	public Adapter createIncomplLocatedVarContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramSpecificDeclaration <em>Program Specific Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramSpecificDeclaration
	 * @generated
	 */
	public Adapter createProgramSpecificDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclarationContainer <em>Located Var Declaration Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclarationContainer
	 * @generated
	 */
	public Adapter createLocatedVarDeclarationContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessContainer <em>Program Access Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessContainer
	 * @generated
	 */
	public Adapter createProgramAccessContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVarContainer <em>Function Var Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVarContainer
	 * @generated
	 */
	public Adapter createFunctionVarContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclarationContainer <em>Global Var Declaration Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclarationContainer
	 * @generated
	 */
	public Adapter createGlobalVarDeclarationContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVariableDeclaration <em>Function Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVariableDeclaration
	 * @generated
	 */
	public Adapter createFunctionVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionBlockVariableDeclaration <em>Function Block Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionBlockVariableDeclaration
	 * @generated
	 */
	public Adapter createFunctionBlockVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramVariableDeclaration <em>Program Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramVariableDeclaration
	 * @generated
	 */
	public Adapter createProgramVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationVariableDeclaration <em>Configuration Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationVariableDeclaration
	 * @generated
	 */
	public Adapter createConfigurationVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ResourceVariableDeclaration <em>Resource Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ResourceVariableDeclaration
	 * @generated
	 */
	public Adapter createResourceVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessVarContainer <em>Access Var Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessVarContainer
	 * @generated
	 */
	public Adapter createAccessVarContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarContainter <em>Instance Specific Var Containter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarContainter
	 * @generated
	 */
	public Adapter createInstanceSpecificVarContainterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarInit <em>Instance Specific Var Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarInit
	 * @generated
	 */
	public Adapter createInstanceSpecificVarInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable <em>Instance Specific Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable
	 * @generated
	 */
	public Adapter createInstanceSpecificVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB <em>Instance Specific FB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB
	 * @generated
	 */
	public Adapter createInstanceSpecificFBAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit <em>Instance Specific Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit
	 * @generated
	 */
	public Adapter createInstanceSpecificSpecInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInit <em>Var2 Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInit
	 * @generated
	 */
	public Adapter createVar2SpecInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationSpecificDeclaration <em>Configuration Specific Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationSpecificDeclaration
	 * @generated
	 */
	public Adapter createConfigurationSpecificDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputDeclaration <em>Input Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputDeclaration
	 * @generated
	 */
	public Adapter createInputDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeDeclaration <em>Edge Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeDeclaration
	 * @generated
	 */
	public Adapter createEdgeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarInitDeclaration <em>Var Init Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarInitDeclaration
	 * @generated
	 */
	public Adapter createVarInitDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInitDecl <em>Var1 Spec Init Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInitDecl
	 * @generated
	 */
	public Adapter createVar1SpecInitDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringVarDecl <em>String Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringVarDecl
	 * @generated
	 */
	public Adapter createStringVarDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpecInit <em>Single Byte String Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpecInit
	 * @generated
	 */
	public Adapter createSingleByteStringSpecInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpecInit <em>Double Byte String Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpecInit
	 * @generated
	 */
	public Adapter createDoubleByteStringSpecInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInit <em>Var1 Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInit
	 * @generated
	 */
	public Adapter createVar1SpecInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.NamedVariableDeclaration <em>Named Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.NamedVariableDeclaration
	 * @generated
	 */
	public Adapter createNamedVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpec <em>Single Byte String Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpec
	 * @generated
	 */
	public Adapter createSingleByteStringSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringVariable <em>String Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringVariable
	 * @generated
	 */
	public Adapter createStringVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpec <em>Double Byte String Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpec
	 * @generated
	 */
	public Adapter createDoubleByteStringSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringVar <em>Double Byte String Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringVar
	 * @generated
	 */
	public Adapter createDoubleByteStringVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration <em>Access Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration
	 * @generated
	 */
	public Adapter createAccessDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath <em>Symbolic Access Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath
	 * @generated
	 */
	public Adapter createSymbolicAccessPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationOnly <em>Var Declaration Only</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationOnly
	 * @generated
	 */
	public Adapter createVarDeclarationOnlyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclaration <em>Temp Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclaration
	 * @generated
	 */
	public Adapter createTempVarDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Decl <em>Var1 Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Decl
	 * @generated
	 */
	public Adapter createVar1DeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration <em>Located Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration
	 * @generated
	 */
	public Adapter createLocatedVarDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarSpecInit <em>Located Var Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarSpecInit
	 * @generated
	 */
	public Adapter createLocatedVarSpecInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Specification <em>Var1 Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Specification
	 * @generated
	 */
	public Adapter createVar1SpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration <em>Incompl Located Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration
	 * @generated
	 */
	public Adapter createIncomplLocatedVarDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringSpecification <em>String Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringSpecification
	 * @generated
	 */
	public Adapter createStringSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarSpec <em>Var Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarSpec
	 * @generated
	 */
	public Adapter createVarSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.OnlyNamedGlobalVar <em>Only Named Global Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.OnlyNamedGlobalVar
	 * @generated
	 */
	public Adapter createOnlyNamedGlobalVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedGlobalVar <em>Located Global Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedGlobalVar
	 * @generated
	 */
	public Adapter createLocatedGlobalVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpec <em>Global Var Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpec
	 * @generated
	 */
	public Adapter createGlobalVarSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclaration <em>Global Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclaration
	 * @generated
	 */
	public Adapter createGlobalVarDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInitDecl <em>Var2 Spec Init Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInitDecl
	 * @generated
	 */
	public Adapter createVar2SpecInitDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessDeclaration <em>Program Access Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessDeclaration
	 * @generated
	 */
	public Adapter createProgramAccessDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance <em>FB Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance
	 * @generated
	 */
	public Adapter createFBInstanceAdapter() {
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

} //DeclarationsAdapterFactory

/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.util;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.*;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage
 * @generated
 */
public class DeclarationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeclarationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationsSwitch() {
		if (modelPackage == null) {
			modelPackage = DeclarationsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DeclarationsPackage.VARIABLE_DECLARATION: {
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				T result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.IO_VAR_DECLARATION: {
				IOVarDeclaration ioVarDeclaration = (IOVarDeclaration)theEObject;
				T result = caseIOVarDeclaration(ioVarDeclaration);
				if (result == null) result = caseFunctionVariableDeclaration(ioVarDeclaration);
				if (result == null) result = caseFunctionBlockVariableDeclaration(ioVarDeclaration);
				if (result == null) result = caseProgramVariableDeclaration(ioVarDeclaration);
				if (result == null) result = caseVariableDeclaration(ioVarDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.INPUT_VAR_CONTAINER: {
				InputVarContainer inputVarContainer = (InputVarContainer)theEObject;
				T result = caseInputVarContainer(inputVarContainer);
				if (result == null) result = caseIOVarDeclaration(inputVarContainer);
				if (result == null) result = caseFunctionVariableDeclaration(inputVarContainer);
				if (result == null) result = caseFunctionBlockVariableDeclaration(inputVarContainer);
				if (result == null) result = caseProgramVariableDeclaration(inputVarContainer);
				if (result == null) result = caseVariableDeclaration(inputVarContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.OUTPUT_VAR_CONTAINER: {
				OutputVarContainer outputVarContainer = (OutputVarContainer)theEObject;
				T result = caseOutputVarContainer(outputVarContainer);
				if (result == null) result = caseIOVarDeclaration(outputVarContainer);
				if (result == null) result = caseFunctionVariableDeclaration(outputVarContainer);
				if (result == null) result = caseFunctionBlockVariableDeclaration(outputVarContainer);
				if (result == null) result = caseProgramVariableDeclaration(outputVarContainer);
				if (result == null) result = caseVariableDeclaration(outputVarContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.INPUT_OUTPUT_VAR_CONTAINER: {
				InputOutputVarContainer inputOutputVarContainer = (InputOutputVarContainer)theEObject;
				T result = caseInputOutputVarContainer(inputOutputVarContainer);
				if (result == null) result = caseIOVarDeclaration(inputOutputVarContainer);
				if (result == null) result = caseFunctionVariableDeclaration(inputOutputVarContainer);
				if (result == null) result = caseFunctionBlockVariableDeclaration(inputOutputVarContainer);
				if (result == null) result = caseProgramVariableDeclaration(inputOutputVarContainer);
				if (result == null) result = caseVariableDeclaration(inputOutputVarContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.FB_PROGRAM_VAR_DECLARATION: {
				FBProgramVarDeclaration fbProgramVarDeclaration = (FBProgramVarDeclaration)theEObject;
				T result = caseFBProgramVarDeclaration(fbProgramVarDeclaration);
				if (result == null) result = caseFunctionBlockVariableDeclaration(fbProgramVarDeclaration);
				if (result == null) result = caseProgramVariableDeclaration(fbProgramVarDeclaration);
				if (result == null) result = caseVariableDeclaration(fbProgramVarDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.VAR_DECLARATION_CONTAINER: {
				VarDeclarationContainer varDeclarationContainer = (VarDeclarationContainer)theEObject;
				T result = caseVarDeclarationContainer(varDeclarationContainer);
				if (result == null) result = caseFBProgramVarDeclaration(varDeclarationContainer);
				if (result == null) result = caseFunctionBlockVariableDeclaration(varDeclarationContainer);
				if (result == null) result = caseProgramVariableDeclaration(varDeclarationContainer);
				if (result == null) result = caseVariableDeclaration(varDeclarationContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.EXTERNAL_VAR_CONTAINER: {
				ExternalVarContainer externalVarContainer = (ExternalVarContainer)theEObject;
				T result = caseExternalVarContainer(externalVarContainer);
				if (result == null) result = caseFBProgramVarDeclaration(externalVarContainer);
				if (result == null) result = caseFunctionBlockVariableDeclaration(externalVarContainer);
				if (result == null) result = caseProgramVariableDeclaration(externalVarContainer);
				if (result == null) result = caseVariableDeclaration(externalVarContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.TEMP_VAR_DECLARATION_CONTAINER: {
				TempVarDeclarationContainer tempVarDeclarationContainer = (TempVarDeclarationContainer)theEObject;
				T result = caseTempVarDeclarationContainer(tempVarDeclarationContainer);
				if (result == null) result = caseFBProgramVarDeclaration(tempVarDeclarationContainer);
				if (result == null) result = caseFunctionBlockVariableDeclaration(tempVarDeclarationContainer);
				if (result == null) result = caseProgramVariableDeclaration(tempVarDeclarationContainer);
				if (result == null) result = caseVariableDeclaration(tempVarDeclarationContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_CONTAINER: {
				IncomplLocatedVarContainer incomplLocatedVarContainer = (IncomplLocatedVarContainer)theEObject;
				T result = caseIncomplLocatedVarContainer(incomplLocatedVarContainer);
				if (result == null) result = caseFBProgramVarDeclaration(incomplLocatedVarContainer);
				if (result == null) result = caseFunctionBlockVariableDeclaration(incomplLocatedVarContainer);
				if (result == null) result = caseProgramVariableDeclaration(incomplLocatedVarContainer);
				if (result == null) result = caseVariableDeclaration(incomplLocatedVarContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.PROGRAM_SPECIFIC_DECLARATION: {
				ProgramSpecificDeclaration programSpecificDeclaration = (ProgramSpecificDeclaration)theEObject;
				T result = caseProgramSpecificDeclaration(programSpecificDeclaration);
				if (result == null) result = caseProgramVariableDeclaration(programSpecificDeclaration);
				if (result == null) result = caseVariableDeclaration(programSpecificDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.LOCATED_VAR_DECLARATION_CONTAINER: {
				LocatedVarDeclarationContainer locatedVarDeclarationContainer = (LocatedVarDeclarationContainer)theEObject;
				T result = caseLocatedVarDeclarationContainer(locatedVarDeclarationContainer);
				if (result == null) result = caseProgramSpecificDeclaration(locatedVarDeclarationContainer);
				if (result == null) result = caseProgramVariableDeclaration(locatedVarDeclarationContainer);
				if (result == null) result = caseVariableDeclaration(locatedVarDeclarationContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.PROGRAM_ACCESS_CONTAINER: {
				ProgramAccessContainer programAccessContainer = (ProgramAccessContainer)theEObject;
				T result = caseProgramAccessContainer(programAccessContainer);
				if (result == null) result = caseProgramSpecificDeclaration(programAccessContainer);
				if (result == null) result = caseProgramVariableDeclaration(programAccessContainer);
				if (result == null) result = caseVariableDeclaration(programAccessContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.FUNCTION_VAR_CONTAINER: {
				FunctionVarContainer functionVarContainer = (FunctionVarContainer)theEObject;
				T result = caseFunctionVarContainer(functionVarContainer);
				if (result == null) result = caseFunctionVariableDeclaration(functionVarContainer);
				if (result == null) result = caseVariableDeclaration(functionVarContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION_CONTAINER: {
				GlobalVarDeclarationContainer globalVarDeclarationContainer = (GlobalVarDeclarationContainer)theEObject;
				T result = caseGlobalVarDeclarationContainer(globalVarDeclarationContainer);
				if (result == null) result = caseConfigurationVariableDeclaration(globalVarDeclarationContainer);
				if (result == null) result = caseResourceVariableDeclaration(globalVarDeclarationContainer);
				if (result == null) result = caseVariableDeclaration(globalVarDeclarationContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.FUNCTION_VARIABLE_DECLARATION: {
				FunctionVariableDeclaration functionVariableDeclaration = (FunctionVariableDeclaration)theEObject;
				T result = caseFunctionVariableDeclaration(functionVariableDeclaration);
				if (result == null) result = caseVariableDeclaration(functionVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.FUNCTION_BLOCK_VARIABLE_DECLARATION: {
				FunctionBlockVariableDeclaration functionBlockVariableDeclaration = (FunctionBlockVariableDeclaration)theEObject;
				T result = caseFunctionBlockVariableDeclaration(functionBlockVariableDeclaration);
				if (result == null) result = caseProgramVariableDeclaration(functionBlockVariableDeclaration);
				if (result == null) result = caseVariableDeclaration(functionBlockVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.PROGRAM_VARIABLE_DECLARATION: {
				ProgramVariableDeclaration programVariableDeclaration = (ProgramVariableDeclaration)theEObject;
				T result = caseProgramVariableDeclaration(programVariableDeclaration);
				if (result == null) result = caseVariableDeclaration(programVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.CONFIGURATION_VARIABLE_DECLARATION: {
				ConfigurationVariableDeclaration configurationVariableDeclaration = (ConfigurationVariableDeclaration)theEObject;
				T result = caseConfigurationVariableDeclaration(configurationVariableDeclaration);
				if (result == null) result = caseVariableDeclaration(configurationVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.RESOURCE_VARIABLE_DECLARATION: {
				ResourceVariableDeclaration resourceVariableDeclaration = (ResourceVariableDeclaration)theEObject;
				T result = caseResourceVariableDeclaration(resourceVariableDeclaration);
				if (result == null) result = caseVariableDeclaration(resourceVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.ACCESS_VAR_CONTAINER: {
				AccessVarContainer accessVarContainer = (AccessVarContainer)theEObject;
				T result = caseAccessVarContainer(accessVarContainer);
				if (result == null) result = caseConfigurationSpecificDeclaration(accessVarContainer);
				if (result == null) result = caseConfigurationVariableDeclaration(accessVarContainer);
				if (result == null) result = caseVariableDeclaration(accessVarContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.INSTANCE_SPECIFIC_VAR_CONTAINTER: {
				InstanceSpecificVarContainter instanceSpecificVarContainter = (InstanceSpecificVarContainter)theEObject;
				T result = caseInstanceSpecificVarContainter(instanceSpecificVarContainter);
				if (result == null) result = caseConfigurationSpecificDeclaration(instanceSpecificVarContainter);
				if (result == null) result = caseConfigurationVariableDeclaration(instanceSpecificVarContainter);
				if (result == null) result = caseVariableDeclaration(instanceSpecificVarContainter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.CONFIGURATION_SPECIFIC_DECLARATION: {
				ConfigurationSpecificDeclaration configurationSpecificDeclaration = (ConfigurationSpecificDeclaration)theEObject;
				T result = caseConfigurationSpecificDeclaration(configurationSpecificDeclaration);
				if (result == null) result = caseConfigurationVariableDeclaration(configurationSpecificDeclaration);
				if (result == null) result = caseVariableDeclaration(configurationSpecificDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.INPUT_DECLARATION: {
				InputDeclaration inputDeclaration = (InputDeclaration)theEObject;
				T result = caseInputDeclaration(inputDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.EDGE_DECLARATION: {
				EdgeDeclaration edgeDeclaration = (EdgeDeclaration)theEObject;
				T result = caseEdgeDeclaration(edgeDeclaration);
				if (result == null) result = caseInputDeclaration(edgeDeclaration);
				if (result == null) result = caseNamedVariableDeclaration(edgeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.VAR_INIT_DECLARATION: {
				VarInitDeclaration varInitDeclaration = (VarInitDeclaration)theEObject;
				T result = caseVarInitDeclaration(varInitDeclaration);
				if (result == null) result = caseInputDeclaration(varInitDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.VAR1_SPEC_INIT_DECL: {
				Var1SpecInitDecl var1SpecInitDecl = (Var1SpecInitDecl)theEObject;
				T result = caseVar1SpecInitDecl(var1SpecInitDecl);
				if (result == null) result = caseNamedVariableDeclaration(var1SpecInitDecl);
				if (result == null) result = caseLocatedVarSpecInit(var1SpecInitDecl);
				if (result == null) result = caseGlobalVarSpecInit(var1SpecInitDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.STRING_VAR_DECL: {
				StringVarDecl stringVarDecl = (StringVarDecl)theEObject;
				T result = caseStringVarDecl(stringVarDecl);
				if (result == null) result = caseTempVarDeclaration(stringVarDecl);
				if (result == null) result = caseVar2SpecInit(stringVarDecl);
				if (result == null) result = caseVarDeclarationOnly(stringVarDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.SINGLE_BYTE_STRING_SPEC_INIT: {
				SingleByteStringSpecInit singleByteStringSpecInit = (SingleByteStringSpecInit)theEObject;
				T result = caseSingleByteStringSpecInit(singleByteStringSpecInit);
				if (result == null) result = caseSingleByteStringVar(singleByteStringSpecInit);
				if (result == null) result = caseStringVarDecl(singleByteStringSpecInit);
				if (result == null) result = caseLocatedVarSpecInit(singleByteStringSpecInit);
				if (result == null) result = caseStringVariable(singleByteStringSpecInit);
				if (result == null) result = caseTempVarDeclaration(singleByteStringSpecInit);
				if (result == null) result = caseVar2SpecInit(singleByteStringSpecInit);
				if (result == null) result = caseGlobalVarSpecInit(singleByteStringSpecInit);
				if (result == null) result = caseVarDeclarationOnly(singleByteStringSpecInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT: {
				DoubleByteStringSpecInit doubleByteStringSpecInit = (DoubleByteStringSpecInit)theEObject;
				T result = caseDoubleByteStringSpecInit(doubleByteStringSpecInit);
				if (result == null) result = caseStringVarDecl(doubleByteStringSpecInit);
				if (result == null) result = caseDoubleByteStringVar(doubleByteStringSpecInit);
				if (result == null) result = caseLocatedVarSpecInit(doubleByteStringSpecInit);
				if (result == null) result = caseTempVarDeclaration(doubleByteStringSpecInit);
				if (result == null) result = caseVar2SpecInit(doubleByteStringSpecInit);
				if (result == null) result = caseStringVariable(doubleByteStringSpecInit);
				if (result == null) result = caseGlobalVarSpecInit(doubleByteStringSpecInit);
				if (result == null) result = caseVarDeclarationOnly(doubleByteStringSpecInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.VAR_DECLARATION_ONLY: {
				VarDeclarationOnly varDeclarationOnly = (VarDeclarationOnly)theEObject;
				T result = caseVarDeclarationOnly(varDeclarationOnly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.TEMP_VAR_DECLARATION: {
				TempVarDeclaration tempVarDeclaration = (TempVarDeclaration)theEObject;
				T result = caseTempVarDeclaration(tempVarDeclaration);
				if (result == null) result = caseVarDeclarationOnly(tempVarDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.VAR1_DECL: {
				Var1Decl var1Decl = (Var1Decl)theEObject;
				T result = caseVar1Decl(var1Decl);
				if (result == null) result = caseTempVarDeclaration(var1Decl);
				if (result == null) result = caseNamedVariableDeclaration(var1Decl);
				if (result == null) result = caseVarDeclarationOnly(var1Decl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.LOCATED_VAR_DECLARATION: {
				LocatedVarDeclaration locatedVarDeclaration = (LocatedVarDeclaration)theEObject;
				T result = caseLocatedVarDeclaration(locatedVarDeclaration);
				if (result == null) result = caseNamedVariableDeclaration(locatedVarDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION: {
				IncomplLocatedVarDeclaration incomplLocatedVarDeclaration = (IncomplLocatedVarDeclaration)theEObject;
				T result = caseIncomplLocatedVarDeclaration(incomplLocatedVarDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.STRING_SPECIFICATION: {
				StringSpecification stringSpecification = (StringSpecification)theEObject;
				T result = caseStringSpecification(stringSpecification);
				if (result == null) result = caseVarSpec(stringSpecification);
				if (result == null) result = caseInstanceSpecificSpecInit(stringSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.VAR_SPEC: {
				VarSpec varSpec = (VarSpec)theEObject;
				T result = caseVarSpec(varSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.ONLY_NAMED_GLOBAL_VAR: {
				OnlyNamedGlobalVar onlyNamedGlobalVar = (OnlyNamedGlobalVar)theEObject;
				T result = caseOnlyNamedGlobalVar(onlyNamedGlobalVar);
				if (result == null) result = caseGlobalVarSpec(onlyNamedGlobalVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.LOCATED_GLOBAL_VAR: {
				LocatedGlobalVar locatedGlobalVar = (LocatedGlobalVar)theEObject;
				T result = caseLocatedGlobalVar(locatedGlobalVar);
				if (result == null) result = caseGlobalVarSpec(locatedGlobalVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.GLOBAL_VAR_SPEC: {
				GlobalVarSpec globalVarSpec = (GlobalVarSpec)theEObject;
				T result = caseGlobalVarSpec(globalVarSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION: {
				GlobalVarDeclaration globalVarDeclaration = (GlobalVarDeclaration)theEObject;
				T result = caseGlobalVarDeclaration(globalVarDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.VAR2_SPEC_INIT_DECL: {
				Var2SpecInitDecl var2SpecInitDecl = (Var2SpecInitDecl)theEObject;
				T result = caseVar2SpecInitDecl(var2SpecInitDecl);
				if (result == null) result = caseNamedVariableDeclaration(var2SpecInitDecl);
				if (result == null) result = caseVarInitDeclaration(var2SpecInitDecl);
				if (result == null) result = caseInputDeclaration(var2SpecInitDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.PROGRAM_ACCESS_DECLARATION: {
				ProgramAccessDeclaration programAccessDeclaration = (ProgramAccessDeclaration)theEObject;
				T result = caseProgramAccessDeclaration(programAccessDeclaration);
				if (result == null) result = caseNamedElement(programAccessDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.FB_INSTANCE: {
				FBInstance fbInstance = (FBInstance)theEObject;
				T result = caseFBInstance(fbInstance);
				if (result == null) result = caseVarInitDeclaration(fbInstance);
				if (result == null) result = caseVarDeclarationOnly(fbInstance);
				if (result == null) result = caseNamedElement(fbInstance);
				if (result == null) result = caseInputDeclaration(fbInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.EXTERNAL_VAR_DECLARATION: {
				ExternalVarDeclaration externalVarDeclaration = (ExternalVarDeclaration)theEObject;
				T result = caseExternalVarDeclaration(externalVarDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.ARRAY_STRUCT_VAR_SPEC: {
				ArrayStructVarSpec arrayStructVarSpec = (ArrayStructVarSpec)theEObject;
				T result = caseArrayStructVarSpec(arrayStructVarSpec);
				if (result == null) result = caseTempVarDeclaration(arrayStructVarSpec);
				if (result == null) result = caseVarDeclarationOnly(arrayStructVarSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.SHARED_VAR_SPEC: {
				SharedVarSpec sharedVarSpec = (SharedVarSpec)theEObject;
				T result = caseSharedVarSpec(sharedVarSpec);
				if (result == null) result = caseVarSpec(sharedVarSpec);
				if (result == null) result = caseExternalVarSpec(sharedVarSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.SINGLE_BYTE_STRING_VAR: {
				SingleByteStringVar singleByteStringVar = (SingleByteStringVar)theEObject;
				T result = caseSingleByteStringVar(singleByteStringVar);
				if (result == null) result = caseStringVariable(singleByteStringVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.SINGLE_BYTE_STRING_SPEC: {
				SingleByteStringSpec singleByteStringSpec = (SingleByteStringSpec)theEObject;
				T result = caseSingleByteStringSpec(singleByteStringSpec);
				if (result == null) result = caseSingleByteStringVar(singleByteStringSpec);
				if (result == null) result = caseStringSpecification(singleByteStringSpec);
				if (result == null) result = caseStringVariable(singleByteStringSpec);
				if (result == null) result = caseVarSpec(singleByteStringSpec);
				if (result == null) result = caseInstanceSpecificSpecInit(singleByteStringSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.STRING_VARIABLE: {
				StringVariable stringVariable = (StringVariable)theEObject;
				T result = caseStringVariable(stringVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC: {
				DoubleByteStringSpec doubleByteStringSpec = (DoubleByteStringSpec)theEObject;
				T result = caseDoubleByteStringSpec(doubleByteStringSpec);
				if (result == null) result = caseStringSpecification(doubleByteStringSpec);
				if (result == null) result = caseDoubleByteStringVar(doubleByteStringSpec);
				if (result == null) result = caseVarSpec(doubleByteStringSpec);
				if (result == null) result = caseInstanceSpecificSpecInit(doubleByteStringSpec);
				if (result == null) result = caseStringVariable(doubleByteStringSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.DOUBLE_BYTE_STRING_VAR: {
				DoubleByteStringVar doubleByteStringVar = (DoubleByteStringVar)theEObject;
				T result = caseDoubleByteStringVar(doubleByteStringVar);
				if (result == null) result = caseStringVariable(doubleByteStringVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.ACCESS_DECLARATION: {
				AccessDeclaration accessDeclaration = (AccessDeclaration)theEObject;
				T result = caseAccessDeclaration(accessDeclaration);
				if (result == null) result = caseNamedElement(accessDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.SYMBOLIC_ACCESS_PATH: {
				SymbolicAccessPath symbolicAccessPath = (SymbolicAccessPath)theEObject;
				T result = caseSymbolicAccessPath(symbolicAccessPath);
				if (result == null) result = caseAccessDeclaration(symbolicAccessPath);
				if (result == null) result = caseNamedElement(symbolicAccessPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.INSTANCE_SPECIFIC_VAR_INIT: {
				InstanceSpecificVarInit instanceSpecificVarInit = (InstanceSpecificVarInit)theEObject;
				T result = caseInstanceSpecificVarInit(instanceSpecificVarInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.INSTANCE_SPECIFIC_VARIABLE: {
				InstanceSpecificVariable instanceSpecificVariable = (InstanceSpecificVariable)theEObject;
				T result = caseInstanceSpecificVariable(instanceSpecificVariable);
				if (result == null) result = caseInstanceSpecificVarInit(instanceSpecificVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.INSTANCE_SPECIFIC_FB: {
				InstanceSpecificFB instanceSpecificFB = (InstanceSpecificFB)theEObject;
				T result = caseInstanceSpecificFB(instanceSpecificFB);
				if (result == null) result = caseInstanceSpecificVarInit(instanceSpecificFB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.EXTERNAL_VAR_SPEC: {
				ExternalVarSpec externalVarSpec = (ExternalVarSpec)theEObject;
				T result = caseExternalVarSpec(externalVarSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.GLOBAL_VAR_SPEC_INIT: {
				GlobalVarSpecInit globalVarSpecInit = (GlobalVarSpecInit)theEObject;
				T result = caseGlobalVarSpecInit(globalVarSpecInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.INSTANCE_SPECIFIC_SPEC_INIT: {
				InstanceSpecificSpecInit instanceSpecificSpecInit = (InstanceSpecificSpecInit)theEObject;
				T result = caseInstanceSpecificSpecInit(instanceSpecificSpecInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.VAR2_SPEC_INIT: {
				Var2SpecInit var2SpecInit = (Var2SpecInit)theEObject;
				T result = caseVar2SpecInit(var2SpecInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.VAR1_SPEC_INIT: {
				Var1SpecInit var1SpecInit = (Var1SpecInit)theEObject;
				T result = caseVar1SpecInit(var1SpecInit);
				if (result == null) result = caseVar2SpecInit(var1SpecInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.NAMED_VARIABLE_DECLARATION: {
				NamedVariableDeclaration namedVariableDeclaration = (NamedVariableDeclaration)theEObject;
				T result = caseNamedVariableDeclaration(namedVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.LOCATED_VAR_SPEC_INIT: {
				LocatedVarSpecInit locatedVarSpecInit = (LocatedVarSpecInit)theEObject;
				T result = caseLocatedVarSpecInit(locatedVarSpecInit);
				if (result == null) result = caseGlobalVarSpecInit(locatedVarSpecInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationsPackage.VAR1_SPECIFICATION: {
				Var1Specification var1Specification = (Var1Specification)theEObject;
				T result = caseVar1Specification(var1Specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Var Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Var Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOVarDeclaration(IOVarDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Var Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Var Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputVarContainer(InputVarContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Var Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Var Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputVarContainer(OutputVarContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Output Var Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Output Var Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputOutputVarContainer(InputOutputVarContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FB Program Var Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FB Program Var Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFBProgramVarDeclaration(FBProgramVarDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Declaration Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Declaration Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarDeclarationContainer(VarDeclarationContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Var Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Var Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalVarContainer(ExternalVarContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Var Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Var Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalVarDeclaration(ExternalVarDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Struct Var Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Struct Var Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayStructVarSpec(ArrayStructVarSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Var Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Var Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedVarSpec(SharedVarSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Byte String Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Byte String Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleByteStringVar(SingleByteStringVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temp Var Declaration Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temp Var Declaration Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTempVarDeclarationContainer(TempVarDeclarationContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incompl Located Var Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incompl Located Var Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncomplLocatedVarContainer(IncomplLocatedVarContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Specific Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Specific Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramSpecificDeclaration(ProgramSpecificDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Var Declaration Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Var Declaration Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedVarDeclarationContainer(LocatedVarDeclarationContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Access Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Access Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramAccessContainer(ProgramAccessContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Var Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Var Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionVarContainer(FunctionVarContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Var Declaration Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Var Declaration Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVarDeclarationContainer(GlobalVarDeclarationContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionVariableDeclaration(FunctionVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Block Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Block Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionBlockVariableDeclaration(FunctionBlockVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramVariableDeclaration(ProgramVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationVariableDeclaration(ConfigurationVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceVariableDeclaration(ResourceVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Var Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Var Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessVarContainer(AccessVarContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Specific Var Containter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Specific Var Containter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceSpecificVarContainter(InstanceSpecificVarContainter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Specific Var Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Specific Var Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceSpecificVarInit(InstanceSpecificVarInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Specific Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Specific Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceSpecificVariable(InstanceSpecificVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Specific FB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Specific FB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceSpecificFB(InstanceSpecificFB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Var Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Var Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalVarSpec(ExternalVarSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Var Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Var Spec Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVarSpecInit(GlobalVarSpecInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Specific Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Specific Spec Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceSpecificSpecInit(InstanceSpecificSpecInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var2 Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var2 Spec Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVar2SpecInit(Var2SpecInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Specific Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Specific Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationSpecificDeclaration(ConfigurationSpecificDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputDeclaration(InputDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeDeclaration(EdgeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Init Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Init Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarInitDeclaration(VarInitDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var1 Spec Init Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var1 Spec Init Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVar1SpecInitDecl(Var1SpecInitDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Var Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Var Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringVarDecl(StringVarDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Byte String Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Byte String Spec Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleByteStringSpecInit(SingleByteStringSpecInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Byte String Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Byte String Spec Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleByteStringSpecInit(DoubleByteStringSpecInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var1 Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var1 Spec Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVar1SpecInit(Var1SpecInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedVariableDeclaration(NamedVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Byte String Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Byte String Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleByteStringSpec(SingleByteStringSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringVariable(StringVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Byte String Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Byte String Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleByteStringSpec(DoubleByteStringSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Byte String Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Byte String Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleByteStringVar(DoubleByteStringVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessDeclaration(AccessDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbolic Access Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbolic Access Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolicAccessPath(SymbolicAccessPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Declaration Only</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Declaration Only</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarDeclarationOnly(VarDeclarationOnly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temp Var Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temp Var Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTempVarDeclaration(TempVarDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var1 Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var1 Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVar1Decl(Var1Decl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Var Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Var Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedVarDeclaration(LocatedVarDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Var Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Var Spec Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedVarSpecInit(LocatedVarSpecInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var1 Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var1 Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVar1Specification(Var1Specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incompl Located Var Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incompl Located Var Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncomplLocatedVarDeclaration(IncomplLocatedVarDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringSpecification(StringSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarSpec(VarSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Only Named Global Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Only Named Global Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnlyNamedGlobalVar(OnlyNamedGlobalVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Global Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Global Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedGlobalVar(LocatedGlobalVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Var Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Var Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVarSpec(GlobalVarSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Var Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Var Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVarDeclaration(GlobalVarDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var2 Spec Init Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var2 Spec Init Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVar2SpecInitDecl(Var2SpecInitDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Access Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Access Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramAccessDeclaration(ProgramAccessDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FB Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FB Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFBInstance(FBInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DeclarationsSwitch

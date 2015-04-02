/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class DeclarationsFactoryImpl extends EFactoryImpl implements DeclarationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeclarationsFactory init() {
		try {
			DeclarationsFactory theDeclarationsFactory = (DeclarationsFactory)EPackage.Registry.INSTANCE.getEFactory(DeclarationsPackage.eNS_URI);
			if (theDeclarationsFactory != null) {
				return theDeclarationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeclarationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationsFactoryImpl() {
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
			case DeclarationsPackage.INPUT_VAR_CONTAINER: return createInputVarContainer();
			case DeclarationsPackage.OUTPUT_VAR_CONTAINER: return createOutputVarContainer();
			case DeclarationsPackage.INPUT_OUTPUT_VAR_CONTAINER: return createInputOutputVarContainer();
			case DeclarationsPackage.VAR_DECLARATION_CONTAINER: return createVarDeclarationContainer();
			case DeclarationsPackage.EXTERNAL_VAR_CONTAINER: return createExternalVarContainer();
			case DeclarationsPackage.TEMP_VAR_DECLARATION_CONTAINER: return createTempVarDeclarationContainer();
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_CONTAINER: return createIncomplLocatedVarContainer();
			case DeclarationsPackage.LOCATED_VAR_DECLARATION_CONTAINER: return createLocatedVarDeclarationContainer();
			case DeclarationsPackage.PROGRAM_ACCESS_CONTAINER: return createProgramAccessContainer();
			case DeclarationsPackage.FUNCTION_VAR_CONTAINER: return createFunctionVarContainer();
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION_CONTAINER: return createGlobalVarDeclarationContainer();
			case DeclarationsPackage.ACCESS_VAR_CONTAINER: return createAccessVarContainer();
			case DeclarationsPackage.INSTANCE_SPECIFIC_VAR_CONTAINTER: return createInstanceSpecificVarContainter();
			case DeclarationsPackage.EDGE_DECLARATION: return createEdgeDeclaration();
			case DeclarationsPackage.VAR1_SPEC_INIT_DECL: return createVar1SpecInitDecl();
			case DeclarationsPackage.SINGLE_BYTE_STRING_SPEC_INIT: return createSingleByteStringSpecInit();
			case DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT: return createDoubleByteStringSpecInit();
			case DeclarationsPackage.LOCATED_VAR_DECLARATION: return createLocatedVarDeclaration();
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_DECLARATION: return createIncomplLocatedVarDeclaration();
			case DeclarationsPackage.ONLY_NAMED_GLOBAL_VAR: return createOnlyNamedGlobalVar();
			case DeclarationsPackage.LOCATED_GLOBAL_VAR: return createLocatedGlobalVar();
			case DeclarationsPackage.VAR2_SPEC_INIT_DECL: return createVar2SpecInitDecl();
			case DeclarationsPackage.PROGRAM_ACCESS_DECLARATION: return createProgramAccessDeclaration();
			case DeclarationsPackage.FB_INSTANCE: return createFBInstance();
			case DeclarationsPackage.EXTERNAL_VAR_DECLARATION: return createExternalVarDeclaration();
			case DeclarationsPackage.SINGLE_BYTE_STRING_SPEC: return createSingleByteStringSpec();
			case DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC: return createDoubleByteStringSpec();
			case DeclarationsPackage.SYMBOLIC_ACCESS_PATH: return createSymbolicAccessPath();
			case DeclarationsPackage.INSTANCE_SPECIFIC_FB: return createInstanceSpecificFB();
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
			case DeclarationsPackage.VAR_DECLARATION_TYPE:
				return createVarDeclarationTypeFromString(eDataType, initialValue);
			case DeclarationsPackage.EDGE_TYPE:
				return createEdgeTypeFromString(eDataType, initialValue);
			case DeclarationsPackage.GLOBAL_ATTRIBUTE:
				return createGlobalAttributeFromString(eDataType, initialValue);
			case DeclarationsPackage.DIRECTION:
				return createDirectionFromString(eDataType, initialValue);
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
			case DeclarationsPackage.VAR_DECLARATION_TYPE:
				return convertVarDeclarationTypeToString(eDataType, instanceValue);
			case DeclarationsPackage.EDGE_TYPE:
				return convertEdgeTypeToString(eDataType, instanceValue);
			case DeclarationsPackage.GLOBAL_ATTRIBUTE:
				return convertGlobalAttributeToString(eDataType, instanceValue);
			case DeclarationsPackage.DIRECTION:
				return convertDirectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputVarContainer createInputVarContainer() {
		InputVarContainerImpl inputVarContainer = new InputVarContainerImpl();
		return inputVarContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputVarContainer createOutputVarContainer() {
		OutputVarContainerImpl outputVarContainer = new OutputVarContainerImpl();
		return outputVarContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputVarContainer createInputOutputVarContainer() {
		InputOutputVarContainerImpl inputOutputVarContainer = new InputOutputVarContainerImpl();
		return inputOutputVarContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDeclarationContainer createVarDeclarationContainer() {
		VarDeclarationContainerImpl varDeclarationContainer = new VarDeclarationContainerImpl();
		return varDeclarationContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalVarContainer createExternalVarContainer() {
		ExternalVarContainerImpl externalVarContainer = new ExternalVarContainerImpl();
		return externalVarContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalVarDeclaration createExternalVarDeclaration() {
		ExternalVarDeclarationImpl externalVarDeclaration = new ExternalVarDeclarationImpl();
		return externalVarDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TempVarDeclarationContainer createTempVarDeclarationContainer() {
		TempVarDeclarationContainerImpl tempVarDeclarationContainer = new TempVarDeclarationContainerImpl();
		return tempVarDeclarationContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomplLocatedVarContainer createIncomplLocatedVarContainer() {
		IncomplLocatedVarContainerImpl incomplLocatedVarContainer = new IncomplLocatedVarContainerImpl();
		return incomplLocatedVarContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocatedVarDeclarationContainer createLocatedVarDeclarationContainer() {
		LocatedVarDeclarationContainerImpl locatedVarDeclarationContainer = new LocatedVarDeclarationContainerImpl();
		return locatedVarDeclarationContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramAccessContainer createProgramAccessContainer() {
		ProgramAccessContainerImpl programAccessContainer = new ProgramAccessContainerImpl();
		return programAccessContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionVarContainer createFunctionVarContainer() {
		FunctionVarContainerImpl functionVarContainer = new FunctionVarContainerImpl();
		return functionVarContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVarDeclarationContainer createGlobalVarDeclarationContainer() {
		GlobalVarDeclarationContainerImpl globalVarDeclarationContainer = new GlobalVarDeclarationContainerImpl();
		return globalVarDeclarationContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessVarContainer createAccessVarContainer() {
		AccessVarContainerImpl accessVarContainer = new AccessVarContainerImpl();
		return accessVarContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecificVarContainter createInstanceSpecificVarContainter() {
		InstanceSpecificVarContainterImpl instanceSpecificVarContainter = new InstanceSpecificVarContainterImpl();
		return instanceSpecificVarContainter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeDeclaration createEdgeDeclaration() {
		EdgeDeclarationImpl edgeDeclaration = new EdgeDeclarationImpl();
		return edgeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Var1SpecInitDecl createVar1SpecInitDecl() {
		Var1SpecInitDeclImpl var1SpecInitDecl = new Var1SpecInitDeclImpl();
		return var1SpecInitDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleByteStringSpecInit createSingleByteStringSpecInit() {
		SingleByteStringSpecInitImpl singleByteStringSpecInit = new SingleByteStringSpecInitImpl();
		return singleByteStringSpecInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleByteStringSpecInit createDoubleByteStringSpecInit() {
		DoubleByteStringSpecInitImpl doubleByteStringSpecInit = new DoubleByteStringSpecInitImpl();
		return doubleByteStringSpecInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleByteStringSpec createSingleByteStringSpec() {
		SingleByteStringSpecImpl singleByteStringSpec = new SingleByteStringSpecImpl();
		return singleByteStringSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleByteStringSpec createDoubleByteStringSpec() {
		DoubleByteStringSpecImpl doubleByteStringSpec = new DoubleByteStringSpecImpl();
		return doubleByteStringSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicAccessPath createSymbolicAccessPath() {
		SymbolicAccessPathImpl symbolicAccessPath = new SymbolicAccessPathImpl();
		return symbolicAccessPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecificFB createInstanceSpecificFB() {
		InstanceSpecificFBImpl instanceSpecificFB = new InstanceSpecificFBImpl();
		return instanceSpecificFB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocatedVarDeclaration createLocatedVarDeclaration() {
		LocatedVarDeclarationImpl locatedVarDeclaration = new LocatedVarDeclarationImpl();
		return locatedVarDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomplLocatedVarDeclaration createIncomplLocatedVarDeclaration() {
		IncomplLocatedVarDeclarationImpl incomplLocatedVarDeclaration = new IncomplLocatedVarDeclarationImpl();
		return incomplLocatedVarDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlyNamedGlobalVar createOnlyNamedGlobalVar() {
		OnlyNamedGlobalVarImpl onlyNamedGlobalVar = new OnlyNamedGlobalVarImpl();
		return onlyNamedGlobalVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocatedGlobalVar createLocatedGlobalVar() {
		LocatedGlobalVarImpl locatedGlobalVar = new LocatedGlobalVarImpl();
		return locatedGlobalVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Var2SpecInitDecl createVar2SpecInitDecl() {
		Var2SpecInitDeclImpl var2SpecInitDecl = new Var2SpecInitDeclImpl();
		return var2SpecInitDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramAccessDeclaration createProgramAccessDeclaration() {
		ProgramAccessDeclarationImpl programAccessDeclaration = new ProgramAccessDeclarationImpl();
		return programAccessDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBInstance createFBInstance() {
		FBInstanceImpl fbInstance = new FBInstanceImpl();
		return fbInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDeclarationType createVarDeclarationTypeFromString(EDataType eDataType, String initialValue) {
		VarDeclarationType result = VarDeclarationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVarDeclarationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeType createEdgeTypeFromString(EDataType eDataType, String initialValue) {
		EdgeType result = EdgeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalAttribute createGlobalAttributeFromString(EDataType eDataType, String initialValue) {
		GlobalAttribute result = GlobalAttribute.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGlobalAttributeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationsPackage getDeclarationsPackage() {
		return (DeclarationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeclarationsPackage getPackage() {
		return DeclarationsPackage.eINSTANCE;
	}

} //DeclarationsFactoryImpl

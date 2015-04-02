/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il.impl;

import de.fraunhofer.iem.m4a.IEC61131.IEC61131Package;

import de.fraunhofer.iem.m4a.IEC61131.core.CorePackage;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.impl.CorePackageImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;

import de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl;

import de.fraunhofer.iem.m4a.IEC61131.impl.IEC61131PackageImpl;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.CallOperator;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.ExprOperator;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.FBCallParamPlaceHolder;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFactory;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFormalFunctCall;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlLabel;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamAssignment;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamOutAssignment;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.Instruction;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.InstructionList;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperation;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperator;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.Operand;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandConstant;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandEnumeratedValue;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandList;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandVariable;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamAssignmentOperand;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamInstruction;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamList;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperator;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperatorPlaceHolder;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleInstruction;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperation;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationFunction;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperator;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.util.IlValidator;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IlPackageImpl extends EPackageImpl implements IlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleOperationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumpOperationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ilExpressionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ilFBCallEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ilFormalFunctCallEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnOperatorPlaceHolderEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operandEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleInstructionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramInstructionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ilParamAssignmentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ilParamOutAssignmentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramAssignmentOperandEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramListEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operandListEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fbCallParamPlaceHolderEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ilLabelEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operandConstantEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operandEnumeratedValueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operandVariableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleOperationOperandEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleOperationFunctionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum simpleOperatorEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exprOperatorEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jumpOperatorEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum callOperatorEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum returnOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IlPackageImpl() {
		super(eNS_URI, IlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IlPackage init() {
		if (isInited) return (IlPackage)EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI);

		// Obtain or create and register package
		IlPackageImpl theIlPackage = (IlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IlPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IEC61131PackageImpl theIEC61131Package = (IEC61131PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IEC61131Package.eNS_URI) instanceof IEC61131PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IEC61131Package.eNS_URI) : IEC61131Package.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) instanceof LiteralsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) : LiteralsPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);
		DeclarationsPackageImpl theDeclarationsPackage = (DeclarationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) instanceof DeclarationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) : DeclarationsPackage.eINSTANCE);
		PousPackageImpl thePousPackage = (PousPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI) instanceof PousPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI) : PousPackage.eINSTANCE);
		ConfigurationsPackageImpl theConfigurationsPackage = (ConfigurationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI) instanceof ConfigurationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI) : ConfigurationsPackage.eINSTANCE);
		StPackageImpl theStPackage = (StPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) instanceof StPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) : StPackage.eINSTANCE);

		// Create package meta-data objects
		theIlPackage.createPackageContents();
		theIEC61131Package.createPackageContents();
		theCorePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theDeclarationsPackage.createPackageContents();
		thePousPackage.createPackageContents();
		theConfigurationsPackage.createPackageContents();
		theStPackage.createPackageContents();

		// Initialize created meta-data
		theIlPackage.initializePackageContents();
		theIEC61131Package.initializePackageContents();
		theCorePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theDeclarationsPackage.initializePackageContents();
		thePousPackage.initializePackageContents();
		theConfigurationsPackage.initializePackageContents();
		theStPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theIlPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return IlValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theIlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IlPackage.eNS_URI, theIlPackage);
		return theIlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionList() {
		return instructionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionList_Instruction() {
		return (EReference)instructionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_Label() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleOperation() {
		return simpleOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJumpOperation() {
		return jumpOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJumpOperation_JumpOperatorLabel() {
		return (EReference)jumpOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJumpOperation_JumpOperator() {
		return (EAttribute)jumpOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIlExpression() {
		return ilExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIlExpression_ExprOperator() {
		return (EAttribute)ilExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIlExpression_Operand() {
		return (EReference)ilExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIlExpression_SimpleInstructionList() {
		return (EReference)ilExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIlFBCall() {
		return ilFBCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIlFBCall_CallOperator() {
		return (EAttribute)ilFBCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIlFBCall_FbName() {
		return (EReference)ilFBCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIlFBCall_FbCallParam() {
		return (EReference)ilFBCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIlFormalFunctCall() {
		return ilFormalFunctCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIlFormalFunctCall_FunctionName() {
		return (EReference)ilFormalFunctCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIlFormalFunctCall_ParamList() {
		return (EReference)ilFormalFunctCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnOperatorPlaceHolder() {
		return returnOperatorPlaceHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnOperatorPlaceHolder_ReturnOperator() {
		return (EAttribute)returnOperatorPlaceHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperand() {
		return operandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleInstruction() {
		return simpleInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamInstruction() {
		return paramInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamInstruction_VariableName() {
		return (EReference)paramInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIlParamAssignment() {
		return ilParamAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIlParamAssignment_Operand() {
		return (EReference)ilParamAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIlParamOutAssignment() {
		return ilParamOutAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIlParamOutAssignment_NOT() {
		return (EAttribute)ilParamOutAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIlParamOutAssignment_Variable() {
		return (EReference)ilParamOutAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamAssignmentOperand() {
		return paramAssignmentOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamList() {
		return paramListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamList_ParamInstructions() {
		return (EReference)paramListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperandList() {
		return operandListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperandList_Operands() {
		return (EReference)operandListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFBCallParamPlaceHolder() {
		return fbCallParamPlaceHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIlLabel() {
		return ilLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperandConstant() {
		return operandConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperandConstant_Constant() {
		return (EReference)operandConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperandEnumeratedValue() {
		return operandEnumeratedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperandEnumeratedValue_EnumeratedValue() {
		return (EReference)operandEnumeratedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperandVariable() {
		return operandVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperandVariable_Variable() {
		return (EReference)operandVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleOperationOperand() {
		return simpleOperationOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleOperationOperand_SimpleOperator() {
		return (EAttribute)simpleOperationOperandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleOperationOperand_ExprOperator() {
		return (EAttribute)simpleOperationOperandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleOperationOperand_Operand() {
		return (EReference)simpleOperationOperandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleOperationFunction() {
		return simpleOperationFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleOperationFunction_OperandList() {
		return (EReference)simpleOperationFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleOperationFunction_FunctionName() {
		return (EReference)simpleOperationFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSimpleOperator() {
		return simpleOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExprOperator() {
		return exprOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJumpOperator() {
		return jumpOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCallOperator() {
		return callOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReturnOperator() {
		return returnOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlFactory getIlFactory() {
		return (IlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		instructionListEClass = createEClass(INSTRUCTION_LIST);
		createEReference(instructionListEClass, INSTRUCTION_LIST__INSTRUCTION);

		instructionEClass = createEClass(INSTRUCTION);
		createEReference(instructionEClass, INSTRUCTION__LABEL);

		simpleOperationEClass = createEClass(SIMPLE_OPERATION);

		jumpOperationEClass = createEClass(JUMP_OPERATION);
		createEReference(jumpOperationEClass, JUMP_OPERATION__JUMP_OPERATOR_LABEL);
		createEAttribute(jumpOperationEClass, JUMP_OPERATION__JUMP_OPERATOR);

		ilExpressionEClass = createEClass(IL_EXPRESSION);
		createEAttribute(ilExpressionEClass, IL_EXPRESSION__EXPR_OPERATOR);
		createEReference(ilExpressionEClass, IL_EXPRESSION__OPERAND);
		createEReference(ilExpressionEClass, IL_EXPRESSION__SIMPLE_INSTRUCTION_LIST);

		ilFBCallEClass = createEClass(IL_FB_CALL);
		createEAttribute(ilFBCallEClass, IL_FB_CALL__CALL_OPERATOR);
		createEReference(ilFBCallEClass, IL_FB_CALL__FB_NAME);
		createEReference(ilFBCallEClass, IL_FB_CALL__FB_CALL_PARAM);

		ilFormalFunctCallEClass = createEClass(IL_FORMAL_FUNCT_CALL);
		createEReference(ilFormalFunctCallEClass, IL_FORMAL_FUNCT_CALL__FUNCTION_NAME);
		createEReference(ilFormalFunctCallEClass, IL_FORMAL_FUNCT_CALL__PARAM_LIST);

		returnOperatorPlaceHolderEClass = createEClass(RETURN_OPERATOR_PLACE_HOLDER);
		createEAttribute(returnOperatorPlaceHolderEClass, RETURN_OPERATOR_PLACE_HOLDER__RETURN_OPERATOR);

		operandEClass = createEClass(OPERAND);

		simpleInstructionEClass = createEClass(SIMPLE_INSTRUCTION);

		paramInstructionEClass = createEClass(PARAM_INSTRUCTION);
		createEReference(paramInstructionEClass, PARAM_INSTRUCTION__VARIABLE_NAME);

		ilParamAssignmentEClass = createEClass(IL_PARAM_ASSIGNMENT);
		createEReference(ilParamAssignmentEClass, IL_PARAM_ASSIGNMENT__OPERAND);

		ilParamOutAssignmentEClass = createEClass(IL_PARAM_OUT_ASSIGNMENT);
		createEAttribute(ilParamOutAssignmentEClass, IL_PARAM_OUT_ASSIGNMENT__NOT);
		createEReference(ilParamOutAssignmentEClass, IL_PARAM_OUT_ASSIGNMENT__VARIABLE);

		paramAssignmentOperandEClass = createEClass(PARAM_ASSIGNMENT_OPERAND);

		paramListEClass = createEClass(PARAM_LIST);
		createEReference(paramListEClass, PARAM_LIST__PARAM_INSTRUCTIONS);

		operandListEClass = createEClass(OPERAND_LIST);
		createEReference(operandListEClass, OPERAND_LIST__OPERANDS);

		fbCallParamPlaceHolderEClass = createEClass(FB_CALL_PARAM_PLACE_HOLDER);

		ilLabelEClass = createEClass(IL_LABEL);

		operandConstantEClass = createEClass(OPERAND_CONSTANT);
		createEReference(operandConstantEClass, OPERAND_CONSTANT__CONSTANT);

		operandEnumeratedValueEClass = createEClass(OPERAND_ENUMERATED_VALUE);
		createEReference(operandEnumeratedValueEClass, OPERAND_ENUMERATED_VALUE__ENUMERATED_VALUE);

		operandVariableEClass = createEClass(OPERAND_VARIABLE);
		createEReference(operandVariableEClass, OPERAND_VARIABLE__VARIABLE);

		simpleOperationOperandEClass = createEClass(SIMPLE_OPERATION_OPERAND);
		createEAttribute(simpleOperationOperandEClass, SIMPLE_OPERATION_OPERAND__SIMPLE_OPERATOR);
		createEAttribute(simpleOperationOperandEClass, SIMPLE_OPERATION_OPERAND__EXPR_OPERATOR);
		createEReference(simpleOperationOperandEClass, SIMPLE_OPERATION_OPERAND__OPERAND);

		simpleOperationFunctionEClass = createEClass(SIMPLE_OPERATION_FUNCTION);
		createEReference(simpleOperationFunctionEClass, SIMPLE_OPERATION_FUNCTION__OPERAND_LIST);
		createEReference(simpleOperationFunctionEClass, SIMPLE_OPERATION_FUNCTION__FUNCTION_NAME);

		// Create enums
		simpleOperatorEEnum = createEEnum(SIMPLE_OPERATOR);
		exprOperatorEEnum = createEEnum(EXPR_OPERATOR);
		jumpOperatorEEnum = createEEnum(JUMP_OPERATOR);
		callOperatorEEnum = createEEnum(CALL_OPERATOR);
		returnOperatorEEnum = createEEnum(RETURN_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PousPackage thePousPackage = (PousPackage)EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI);
		DeclarationsPackage theDeclarationsPackage = (DeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		LiteralsPackage theLiteralsPackage = (LiteralsPackage)EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		instructionListEClass.getESuperTypes().add(thePousPackage.getFunctionBody());
		instructionListEClass.getESuperTypes().add(thePousPackage.getFunctionBlockBody());
		simpleOperationEClass.getESuperTypes().add(this.getInstruction());
		simpleOperationEClass.getESuperTypes().add(this.getSimpleInstruction());
		jumpOperationEClass.getESuperTypes().add(this.getInstruction());
		ilExpressionEClass.getESuperTypes().add(this.getInstruction());
		ilExpressionEClass.getESuperTypes().add(this.getSimpleInstruction());
		ilFBCallEClass.getESuperTypes().add(this.getInstruction());
		ilFormalFunctCallEClass.getESuperTypes().add(this.getInstruction());
		ilFormalFunctCallEClass.getESuperTypes().add(this.getSimpleInstruction());
		returnOperatorPlaceHolderEClass.getESuperTypes().add(this.getInstruction());
		operandEClass.getESuperTypes().add(this.getParamAssignmentOperand());
		simpleInstructionEClass.getESuperTypes().add(this.getParamAssignmentOperand());
		ilParamAssignmentEClass.getESuperTypes().add(this.getParamInstruction());
		ilParamOutAssignmentEClass.getESuperTypes().add(this.getParamInstruction());
		paramListEClass.getESuperTypes().add(this.getFBCallParamPlaceHolder());
		operandListEClass.getESuperTypes().add(this.getFBCallParamPlaceHolder());
		ilLabelEClass.getESuperTypes().add(theLiteralsPackage.getNamedElement());
		operandConstantEClass.getESuperTypes().add(this.getOperand());
		operandEnumeratedValueEClass.getESuperTypes().add(this.getOperand());
		operandVariableEClass.getESuperTypes().add(this.getOperand());
		simpleOperationOperandEClass.getESuperTypes().add(this.getSimpleOperation());
		simpleOperationFunctionEClass.getESuperTypes().add(this.getSimpleOperation());

		// Initialize classes, features, and operations; add parameters
		initEClass(instructionListEClass, InstructionList.class, "InstructionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructionList_Instruction(), this.getInstruction(), null, "instruction", null, 1, -1, InstructionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstruction_Label(), this.getIlLabel(), null, "label", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleOperationEClass, SimpleOperation.class, "SimpleOperation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jumpOperationEClass, JumpOperation.class, "JumpOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJumpOperation_JumpOperatorLabel(), this.getInstruction(), null, "JumpOperatorLabel", null, 1, 1, JumpOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJumpOperation_JumpOperator(), this.getJumpOperator(), "JumpOperator", null, 1, 1, JumpOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ilExpressionEClass, IlExpression.class, "IlExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIlExpression_ExprOperator(), this.getExprOperator(), "ExprOperator", "AND", 1, 1, IlExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIlExpression_Operand(), this.getOperand(), null, "operand", null, 0, 1, IlExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIlExpression_SimpleInstructionList(), this.getSimpleInstruction(), null, "simpleInstructionList", null, 0, -1, IlExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ilFBCallEClass, IlFBCall.class, "IlFBCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIlFBCall_CallOperator(), this.getCallOperator(), "callOperator", null, 1, 1, IlFBCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIlFBCall_FbName(), theDeclarationsPackage.getFBInstance(), null, "fbName", null, 1, 1, IlFBCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIlFBCall_FbCallParam(), this.getFBCallParamPlaceHolder(), null, "fbCallParam", null, 1, 1, IlFBCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ilFormalFunctCallEClass, IlFormalFunctCall.class, "IlFormalFunctCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIlFormalFunctCall_FunctionName(), thePousPackage.getFunctionDeclaration(), null, "functionName", null, 1, 1, IlFormalFunctCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIlFormalFunctCall_ParamList(), this.getParamList(), null, "paramList", null, 0, 1, IlFormalFunctCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnOperatorPlaceHolderEClass, ReturnOperatorPlaceHolder.class, "ReturnOperatorPlaceHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnOperatorPlaceHolder_ReturnOperator(), this.getReturnOperator(), "returnOperator", null, 1, 1, ReturnOperatorPlaceHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operandEClass, Operand.class, "Operand", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleInstructionEClass, SimpleInstruction.class, "SimpleInstruction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paramInstructionEClass, ParamInstruction.class, "ParamInstruction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParamInstruction_VariableName(), theVariablesPackage.getNamedVariable(), null, "variableName", null, 1, 1, ParamInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ilParamAssignmentEClass, IlParamAssignment.class, "IlParamAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIlParamAssignment_Operand(), this.getParamAssignmentOperand(), null, "operand", null, 1, 1, IlParamAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ilParamOutAssignmentEClass, IlParamOutAssignment.class, "IlParamOutAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIlParamOutAssignment_NOT(), ecorePackage.getEBoolean(), "NOT", null, 1, 1, IlParamOutAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIlParamOutAssignment_Variable(), theVariablesPackage.getVariable(), null, "variable", null, 1, 1, IlParamOutAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramAssignmentOperandEClass, ParamAssignmentOperand.class, "ParamAssignmentOperand", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paramListEClass, ParamList.class, "ParamList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParamList_ParamInstructions(), this.getParamInstruction(), null, "paramInstructions", null, 1, -1, ParamList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operandListEClass, OperandList.class, "OperandList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperandList_Operands(), this.getOperand(), null, "operands", null, 1, -1, OperandList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fbCallParamPlaceHolderEClass, FBCallParamPlaceHolder.class, "FBCallParamPlaceHolder", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ilLabelEClass, IlLabel.class, "IlLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operandConstantEClass, OperandConstant.class, "OperandConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperandConstant_Constant(), theLiteralsPackage.getConstant(), null, "constant", null, 1, 1, OperandConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operandEnumeratedValueEClass, OperandEnumeratedValue.class, "OperandEnumeratedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperandEnumeratedValue_EnumeratedValue(), theTypesPackage.getEnumeratedValue(), null, "enumeratedValue", null, 1, 1, OperandEnumeratedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operandVariableEClass, OperandVariable.class, "OperandVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperandVariable_Variable(), theVariablesPackage.getVariable(), null, "variable", null, 1, 1, OperandVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleOperationOperandEClass, SimpleOperationOperand.class, "SimpleOperationOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleOperationOperand_SimpleOperator(), this.getSimpleOperator(), "SimpleOperator", null, 0, 1, SimpleOperationOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleOperationOperand_ExprOperator(), this.getExprOperator(), "ExprOperator", null, 0, 1, SimpleOperationOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleOperationOperand_Operand(), this.getOperand(), null, "operand", null, 0, 1, SimpleOperationOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleOperationFunctionEClass, SimpleOperationFunction.class, "SimpleOperationFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleOperationFunction_OperandList(), this.getOperandList(), null, "operandList", null, 0, 1, SimpleOperationFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleOperationFunction_FunctionName(), thePousPackage.getFunctionDeclaration(), null, "functionName", null, 1, 1, SimpleOperationFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(simpleOperatorEEnum, SimpleOperator.class, "SimpleOperator");
		addEEnumLiteral(simpleOperatorEEnum, SimpleOperator.LD);
		addEEnumLiteral(simpleOperatorEEnum, SimpleOperator.LDN);
		addEEnumLiteral(simpleOperatorEEnum, SimpleOperator.ST);
		addEEnumLiteral(simpleOperatorEEnum, SimpleOperator.STN);
		addEEnumLiteral(simpleOperatorEEnum, SimpleOperator.NOT);
		addEEnumLiteral(simpleOperatorEEnum, SimpleOperator.S);
		addEEnumLiteral(simpleOperatorEEnum, SimpleOperator.R);
		addEEnumLiteral(simpleOperatorEEnum, SimpleOperator.S1);
		addEEnumLiteral(simpleOperatorEEnum, SimpleOperator.R1);
		addEEnumLiteral(simpleOperatorEEnum, SimpleOperator.CLK);
		addEEnumLiteral(simpleOperatorEEnum, SimpleOperator.CU);
		addEEnumLiteral(simpleOperatorEEnum, SimpleOperator.CD);
		addEEnumLiteral(simpleOperatorEEnum, SimpleOperator.PV);
		addEEnumLiteral(simpleOperatorEEnum, SimpleOperator.IN);
		addEEnumLiteral(simpleOperatorEEnum, SimpleOperator.PT);

		initEEnum(exprOperatorEEnum, ExprOperator.class, "ExprOperator");
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.AND);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.OR);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.XOR);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.ANDN);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.ORN);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.XORN);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.ADD);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.SUB);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.MUL);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.DIV);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.MOD);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.GT);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.GE);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.EQ);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.LT);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.LE);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.NE);

		initEEnum(jumpOperatorEEnum, JumpOperator.class, "JumpOperator");
		addEEnumLiteral(jumpOperatorEEnum, JumpOperator.JMP);
		addEEnumLiteral(jumpOperatorEEnum, JumpOperator.JMPC);
		addEEnumLiteral(jumpOperatorEEnum, JumpOperator.JMPCN);

		initEEnum(callOperatorEEnum, CallOperator.class, "CallOperator");
		addEEnumLiteral(callOperatorEEnum, CallOperator.CAL);
		addEEnumLiteral(callOperatorEEnum, CallOperator.CALC);
		addEEnumLiteral(callOperatorEEnum, CallOperator.CALCN);

		initEEnum(returnOperatorEEnum, ReturnOperator.class, "ReturnOperator");
		addEEnumLiteral(returnOperatorEEnum, ReturnOperator.RET);
		addEEnumLiteral(returnOperatorEEnum, ReturnOperator.RETC);
		addEEnumLiteral(returnOperatorEEnum, ReturnOperator.RETCN);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (instructionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (ilParamOutAssignmentEClass, 
		   source, 
		   new String[] {
			 "constraints", "isLastElementInList"
		   });	
		addAnnotation
		  (simpleOperationOperandEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasOnlyOneOperator"
		   });
	}

} //IlPackageImpl

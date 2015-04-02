/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st.impl;

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

import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.AssignmentStatement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.Else;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.EnumeratedValueRef;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.ExitStatement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.Expression;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.FBInvocation;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.FunctionInvocation;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.IterationStatement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.NILStatement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.Operator;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamAssignment;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamExpression;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpressionValue;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.RepeatStatement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.Return;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.SelectionStatement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StFactory;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.Statement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StatementList;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.SubprogramControlStatement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.UnaryOperator;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.VariableRef;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.WhileStatement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StPackageImpl extends EPackageImpl implements StPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryExpressionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramControlStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterationStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nilStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fbInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramImplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseListElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedValueRefEClass = null;

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
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StPackageImpl() {
		super(eNS_URI, StFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StPackage init() {
		if (isInited) return (StPackage)EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI);

		// Obtain or create and register package
		StPackageImpl theStPackage = (StPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StPackageImpl());

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
		IlPackageImpl theIlPackage = (IlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) instanceof IlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) : IlPackage.eINSTANCE);

		// Create package meta-data objects
		theStPackage.createPackageContents();
		theIEC61131Package.createPackageContents();
		theCorePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theDeclarationsPackage.createPackageContents();
		thePousPackage.createPackageContents();
		theConfigurationsPackage.createPackageContents();
		theIlPackage.createPackageContents();

		// Initialize created meta-data
		theStPackage.initializePackageContents();
		theIEC61131Package.initializePackageContents();
		theCorePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theDeclarationsPackage.initializePackageContents();
		thePousPackage.initializePackageContents();
		theConfigurationsPackage.initializePackageContents();
		theIlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StPackage.eNS_URI, theStPackage);
		return theStPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Operator() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_Operand() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperator_Operation() {
		return (EAttribute)operatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryExpression() {
		return primaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryExpression_UnaryOperator() {
		return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryExpression_Value() {
		return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryOperator() {
		return unaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryOperator_Operation() {
		return (EAttribute)unaryOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryExpressionValue() {
		return primaryExpressionValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionInvocation() {
		return functionInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInvocation_ParamAssignmentList() {
		return (EReference)functionInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInvocation_Function() {
		return (EReference)functionInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamAssignment() {
		return paramAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementList() {
		return statementListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatementList_Statments() {
		return (EReference)statementListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentStatement() {
		return assignmentStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentStatement_Variable() {
		return (EReference)assignmentStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentStatement_Value() {
		return (EReference)assignmentStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramControlStatement() {
		return subprogramControlStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionStatement() {
		return selectionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterationStatement() {
		return iterationStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNILStatement() {
		return nilStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFBInvocation() {
		return fbInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFBInvocation_FunctionBlock() {
		return (EReference)fbInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFBInvocation_ParamAssignmentList() {
		return (EReference)fbInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturn() {
		return returnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamImplication() {
		return paramImplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamImplication_Not() {
		return (EAttribute)paramImplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamImplication_LeftSide() {
		return (EReference)paramImplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamImplication_RightSide() {
		return (EReference)paramImplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamExpression() {
		return paramExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamExpression_VariableName() {
		return (EReference)paramExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamExpression_Expression() {
		return (EReference)paramExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatement() {
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Condition() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Elsif() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Then() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Else() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseStatement() {
		return caseStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseStatement_Else() {
		return (EReference)caseStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseStatement_Condition() {
		return (EReference)caseStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseStatement_CaseElements() {
		return (EReference)caseStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElse() {
		return elseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElse_Then() {
		return (EReference)elseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseElement() {
		return caseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseElement_CaseList() {
		return (EReference)caseElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseElement_StatementList() {
		return (EReference)caseElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseListElement() {
		return caseListElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForStatement() {
		return forStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_From() {
		return (EReference)forStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_To() {
		return (EReference)forStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_By() {
		return (EReference)forStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_Do() {
		return (EReference)forStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileStatement() {
		return whileStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileStatement_Condition() {
		return (EReference)whileStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileStatement_Do() {
		return (EReference)whileStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatStatement() {
		return repeatStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatStatement_Condition() {
		return (EReference)repeatStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatStatement_Do() {
		return (EReference)repeatStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitStatement() {
		return exitStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableRef() {
		return variableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableRef_Variable() {
		return (EReference)variableRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedValueRef() {
		return enumeratedValueRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedValueRef_EnumValue() {
		return (EReference)enumeratedValueRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StFactory getStFactory() {
		return (StFactory)getEFactoryInstance();
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
		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__OPERATOR);

		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__OPERAND);
		createEAttribute(operatorEClass, OPERATOR__OPERATION);

		primaryExpressionEClass = createEClass(PRIMARY_EXPRESSION);
		createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__UNARY_OPERATOR);
		createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__VALUE);

		unaryOperatorEClass = createEClass(UNARY_OPERATOR);
		createEAttribute(unaryOperatorEClass, UNARY_OPERATOR__OPERATION);

		primaryExpressionValueEClass = createEClass(PRIMARY_EXPRESSION_VALUE);

		functionInvocationEClass = createEClass(FUNCTION_INVOCATION);
		createEReference(functionInvocationEClass, FUNCTION_INVOCATION__PARAM_ASSIGNMENT_LIST);
		createEReference(functionInvocationEClass, FUNCTION_INVOCATION__FUNCTION);

		paramAssignmentEClass = createEClass(PARAM_ASSIGNMENT);

		statementListEClass = createEClass(STATEMENT_LIST);
		createEReference(statementListEClass, STATEMENT_LIST__STATMENTS);

		statementEClass = createEClass(STATEMENT);

		assignmentStatementEClass = createEClass(ASSIGNMENT_STATEMENT);
		createEReference(assignmentStatementEClass, ASSIGNMENT_STATEMENT__VARIABLE);
		createEReference(assignmentStatementEClass, ASSIGNMENT_STATEMENT__VALUE);

		subprogramControlStatementEClass = createEClass(SUBPROGRAM_CONTROL_STATEMENT);

		selectionStatementEClass = createEClass(SELECTION_STATEMENT);

		iterationStatementEClass = createEClass(ITERATION_STATEMENT);

		nilStatementEClass = createEClass(NIL_STATEMENT);

		fbInvocationEClass = createEClass(FB_INVOCATION);
		createEReference(fbInvocationEClass, FB_INVOCATION__FUNCTION_BLOCK);
		createEReference(fbInvocationEClass, FB_INVOCATION__PARAM_ASSIGNMENT_LIST);

		returnEClass = createEClass(RETURN);

		paramImplicationEClass = createEClass(PARAM_IMPLICATION);
		createEAttribute(paramImplicationEClass, PARAM_IMPLICATION__NOT);
		createEReference(paramImplicationEClass, PARAM_IMPLICATION__LEFT_SIDE);
		createEReference(paramImplicationEClass, PARAM_IMPLICATION__RIGHT_SIDE);

		paramExpressionEClass = createEClass(PARAM_EXPRESSION);
		createEReference(paramExpressionEClass, PARAM_EXPRESSION__VARIABLE_NAME);
		createEReference(paramExpressionEClass, PARAM_EXPRESSION__EXPRESSION);

		ifStatementEClass = createEClass(IF_STATEMENT);
		createEReference(ifStatementEClass, IF_STATEMENT__CONDITION);
		createEReference(ifStatementEClass, IF_STATEMENT__ELSIF);
		createEReference(ifStatementEClass, IF_STATEMENT__THEN);
		createEReference(ifStatementEClass, IF_STATEMENT__ELSE);

		caseStatementEClass = createEClass(CASE_STATEMENT);
		createEReference(caseStatementEClass, CASE_STATEMENT__ELSE);
		createEReference(caseStatementEClass, CASE_STATEMENT__CONDITION);
		createEReference(caseStatementEClass, CASE_STATEMENT__CASE_ELEMENTS);

		elseEClass = createEClass(ELSE);
		createEReference(elseEClass, ELSE__THEN);

		caseElementEClass = createEClass(CASE_ELEMENT);
		createEReference(caseElementEClass, CASE_ELEMENT__CASE_LIST);
		createEReference(caseElementEClass, CASE_ELEMENT__STATEMENT_LIST);

		caseListElementEClass = createEClass(CASE_LIST_ELEMENT);

		forStatementEClass = createEClass(FOR_STATEMENT);
		createEReference(forStatementEClass, FOR_STATEMENT__FROM);
		createEReference(forStatementEClass, FOR_STATEMENT__TO);
		createEReference(forStatementEClass, FOR_STATEMENT__BY);
		createEReference(forStatementEClass, FOR_STATEMENT__DO);

		whileStatementEClass = createEClass(WHILE_STATEMENT);
		createEReference(whileStatementEClass, WHILE_STATEMENT__CONDITION);
		createEReference(whileStatementEClass, WHILE_STATEMENT__DO);

		repeatStatementEClass = createEClass(REPEAT_STATEMENT);
		createEReference(repeatStatementEClass, REPEAT_STATEMENT__CONDITION);
		createEReference(repeatStatementEClass, REPEAT_STATEMENT__DO);

		exitStatementEClass = createEClass(EXIT_STATEMENT);

		variableRefEClass = createEClass(VARIABLE_REF);
		createEReference(variableRefEClass, VARIABLE_REF__VARIABLE);

		enumeratedValueRefEClass = createEClass(ENUMERATED_VALUE_REF);
		createEReference(enumeratedValueRefEClass, ENUMERATED_VALUE_REF__ENUM_VALUE);
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
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		DeclarationsPackage theDeclarationsPackage = (DeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		expressionEClass.getESuperTypes().add(this.getPrimaryExpressionValue());
		primaryExpressionEClass.getESuperTypes().add(this.getExpression());
		functionInvocationEClass.getESuperTypes().add(this.getPrimaryExpressionValue());
		statementListEClass.getESuperTypes().add(thePousPackage.getFunctionBody());
		statementListEClass.getESuperTypes().add(thePousPackage.getFunctionBlockBody());
		assignmentStatementEClass.getESuperTypes().add(this.getStatement());
		subprogramControlStatementEClass.getESuperTypes().add(this.getStatement());
		selectionStatementEClass.getESuperTypes().add(this.getStatement());
		iterationStatementEClass.getESuperTypes().add(this.getStatement());
		nilStatementEClass.getESuperTypes().add(this.getStatement());
		fbInvocationEClass.getESuperTypes().add(this.getSubprogramControlStatement());
		returnEClass.getESuperTypes().add(this.getSubprogramControlStatement());
		paramImplicationEClass.getESuperTypes().add(this.getParamAssignment());
		paramExpressionEClass.getESuperTypes().add(this.getParamAssignment());
		ifStatementEClass.getESuperTypes().add(this.getSelectionStatement());
		caseStatementEClass.getESuperTypes().add(this.getSelectionStatement());
		forStatementEClass.getESuperTypes().add(this.getIterationStatement());
		whileStatementEClass.getESuperTypes().add(this.getIterationStatement());
		repeatStatementEClass.getESuperTypes().add(this.getIterationStatement());
		exitStatementEClass.getESuperTypes().add(this.getIterationStatement());
		variableRefEClass.getESuperTypes().add(this.getPrimaryExpressionValue());
		enumeratedValueRefEClass.getESuperTypes().add(this.getPrimaryExpressionValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Operator(), this.getOperator(), null, "operator", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperator_Operand(), this.getExpression(), null, "operand", null, 1, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperator_Operation(), ecorePackage.getEString(), "operation", null, 1, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryExpressionEClass, PrimaryExpression.class, "PrimaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimaryExpression_UnaryOperator(), this.getUnaryOperator(), null, "unaryOperator", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimaryExpression_Value(), this.getPrimaryExpressionValue(), null, "value", null, 1, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryOperatorEClass, UnaryOperator.class, "UnaryOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryOperator_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, UnaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryExpressionValueEClass, PrimaryExpressionValue.class, "PrimaryExpressionValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionInvocationEClass, FunctionInvocation.class, "FunctionInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionInvocation_ParamAssignmentList(), this.getParamAssignment(), null, "paramAssignmentList", null, 1, -1, FunctionInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionInvocation_Function(), thePousPackage.getFunctionDeclaration(), null, "function", null, 1, 1, FunctionInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramAssignmentEClass, ParamAssignment.class, "ParamAssignment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementListEClass, StatementList.class, "StatementList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatementList_Statments(), this.getStatement(), null, "statments", null, 1, -1, StatementList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignmentStatementEClass, AssignmentStatement.class, "AssignmentStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignmentStatement_Variable(), theVariablesPackage.getVariable(), null, "variable", null, 1, 1, AssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignmentStatement_Value(), this.getExpression(), null, "value", null, 1, 1, AssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subprogramControlStatementEClass, SubprogramControlStatement.class, "SubprogramControlStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionStatementEClass, SelectionStatement.class, "SelectionStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iterationStatementEClass, IterationStatement.class, "IterationStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nilStatementEClass, NILStatement.class, "NILStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fbInvocationEClass, FBInvocation.class, "FBInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFBInvocation_FunctionBlock(), theDeclarationsPackage.getFBInstance(), null, "functionBlock", null, 1, 1, FBInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFBInvocation_ParamAssignmentList(), this.getParamAssignment(), null, "paramAssignmentList", null, 0, -1, FBInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paramImplicationEClass, ParamImplication.class, "ParamImplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParamImplication_Not(), ecorePackage.getEBoolean(), "not", null, 0, 1, ParamImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParamImplication_LeftSide(), theVariablesPackage.getSymbolicVariable(), null, "leftSide", null, 1, 1, ParamImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParamImplication_RightSide(), theVariablesPackage.getVariable(), null, "rightSide", null, 1, 1, ParamImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramExpressionEClass, ParamExpression.class, "ParamExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParamExpression_VariableName(), theVariablesPackage.getSymbolicVariable(), null, "variableName", null, 0, 1, ParamExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParamExpression_Expression(), this.getExpression(), null, "expression", null, 1, 1, ParamExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfStatement_Condition(), this.getExpression(), null, "condition", null, 1, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_Elsif(), this.getIfStatement(), null, "elsif", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_Then(), this.getStatementList(), null, "then", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_Else(), this.getElse(), null, "else", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseStatementEClass, CaseStatement.class, "CaseStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaseStatement_Else(), this.getElse(), null, "else", null, 0, 1, CaseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseStatement_Condition(), this.getExpression(), null, "condition", null, 1, 1, CaseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseStatement_CaseElements(), this.getCaseElement(), null, "caseElements", null, 1, -1, CaseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elseEClass, Else.class, "Else", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElse_Then(), this.getStatementList(), null, "then", null, 1, 1, Else.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseElementEClass, CaseElement.class, "CaseElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaseElement_CaseList(), this.getCaseListElement(), null, "caseList", null, 1, -1, CaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseElement_StatementList(), this.getStatementList(), null, "statementList", null, 1, 1, CaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseListElementEClass, CaseListElement.class, "CaseListElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forStatementEClass, ForStatement.class, "ForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForStatement_From(), this.getExpression(), null, "from", null, 1, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForStatement_To(), this.getExpression(), null, "to", null, 1, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForStatement_By(), this.getExpression(), null, "by", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForStatement_Do(), this.getStatementList(), null, "do", null, 1, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileStatementEClass, WhileStatement.class, "WhileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhileStatement_Condition(), this.getExpression(), null, "condition", null, 1, 1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhileStatement_Do(), this.getStatementList(), null, "do", null, 1, 1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatStatementEClass, RepeatStatement.class, "RepeatStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatStatement_Condition(), this.getExpression(), null, "condition", null, 1, 1, RepeatStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatStatement_Do(), this.getStatementList(), null, "do", null, 1, 1, RepeatStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exitStatementEClass, ExitStatement.class, "ExitStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableRefEClass, VariableRef.class, "VariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableRef_Variable(), theVariablesPackage.getVariable(), null, "variable", null, 1, 1, VariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedValueRefEClass, EnumeratedValueRef.class, "EnumeratedValueRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeratedValueRef_EnumValue(), theTypesPackage.getEnumeratedValue(), null, "enumValue", null, 0, 1, EnumeratedValueRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StPackageImpl

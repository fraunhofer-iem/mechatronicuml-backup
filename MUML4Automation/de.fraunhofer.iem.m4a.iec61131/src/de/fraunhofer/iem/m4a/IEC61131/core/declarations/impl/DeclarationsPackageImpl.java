/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.IEC61131Package;
import de.fraunhofer.iem.m4a.IEC61131.core.CorePackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessVarContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ArrayStructVarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationSpecificDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationVariableDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Direction;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringVar;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeType;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBProgramVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionBlockVariableDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVarContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVariableDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalAttribute;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclarationContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.IOVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputOutputVarContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarContainter;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedGlobalVar;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclarationContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.NamedVariableDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.OnlyNamedGlobalVar;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.OutputVarContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramSpecificDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramVariableDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ResourceVariableDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.SharedVarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringVar;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringSpecification;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringVarDecl;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclarationContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Decl;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInitDecl;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Specification;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInitDecl;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationOnly;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationType;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarInitDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VariableDeclaration;
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
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclarationsPackageImpl extends EPackageImpl implements DeclarationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioVarDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputVarContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputVarContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputOutputVarContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fbProgramVarDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varDeclarationContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalVarContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalVarDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayStructVarSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedVarSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleByteStringVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tempVarDeclarationContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomplLocatedVarContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programSpecificDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locatedVarDeclarationContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programAccessContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionVarContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVarDeclarationContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBlockVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessVarContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceSpecificVarContainterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceSpecificVarInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceSpecificVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceSpecificFBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalVarSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVarSpecInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceSpecificSpecInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass var2SpecInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationSpecificDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varInitDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass var1SpecInitDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringVarDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleByteStringSpecInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleByteStringSpecInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass var1SpecInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleByteStringSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleByteStringSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleByteStringVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolicAccessPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varDeclarationOnlyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tempVarDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass var1DeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locatedVarDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locatedVarSpecInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass var1SpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomplLocatedVarDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlyNamedGlobalVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locatedGlobalVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVarSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVarDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass var2SpecInitDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programAccessDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fbInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum varDeclarationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum edgeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum globalAttributeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

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
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeclarationsPackageImpl() {
		super(eNS_URI, DeclarationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DeclarationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeclarationsPackage init() {
		if (isInited) return (DeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI);

		// Obtain or create and register package
		DeclarationsPackageImpl theDeclarationsPackage = (DeclarationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DeclarationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DeclarationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IEC61131PackageImpl theIEC61131Package = (IEC61131PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IEC61131Package.eNS_URI) instanceof IEC61131PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IEC61131Package.eNS_URI) : IEC61131Package.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) instanceof LiteralsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) : LiteralsPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);
		PousPackageImpl thePousPackage = (PousPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI) instanceof PousPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI) : PousPackage.eINSTANCE);
		ConfigurationsPackageImpl theConfigurationsPackage = (ConfigurationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI) instanceof ConfigurationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI) : ConfigurationsPackage.eINSTANCE);
		StPackageImpl theStPackage = (StPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) instanceof StPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) : StPackage.eINSTANCE);
		IlPackageImpl theIlPackage = (IlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) instanceof IlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) : IlPackage.eINSTANCE);

		// Create package meta-data objects
		theDeclarationsPackage.createPackageContents();
		theIEC61131Package.createPackageContents();
		theCorePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		thePousPackage.createPackageContents();
		theConfigurationsPackage.createPackageContents();
		theStPackage.createPackageContents();
		theIlPackage.createPackageContents();

		// Initialize created meta-data
		theDeclarationsPackage.initializePackageContents();
		theIEC61131Package.initializePackageContents();
		theCorePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		thePousPackage.initializePackageContents();
		theConfigurationsPackage.initializePackageContents();
		theStPackage.initializePackageContents();
		theIlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeclarationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeclarationsPackage.eNS_URI, theDeclarationsPackage);
		return theDeclarationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOVarDeclaration() {
		return ioVarDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputVarContainer() {
		return inputVarContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputVarContainer_Retain() {
		return (EAttribute)inputVarContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputVarContainer_Declarations() {
		return (EReference)inputVarContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputVarContainer() {
		return outputVarContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputVarContainer_Declarations() {
		return (EReference)outputVarContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputVarContainer_Retain() {
		return (EAttribute)outputVarContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputOutputVarContainer() {
		return inputOutputVarContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputOutputVarContainer_Declarations() {
		return (EReference)inputOutputVarContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFBProgramVarDeclaration() {
		return fbProgramVarDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarDeclarationContainer() {
		return varDeclarationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDeclarationContainer_DeclarationType() {
		return (EAttribute)varDeclarationContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarDeclarationContainer_Declarations() {
		return (EReference)varDeclarationContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalVarContainer() {
		return externalVarContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalVarContainer_Constant() {
		return (EAttribute)externalVarContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalVarContainer_Declarations() {
		return (EReference)externalVarContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalVarDeclaration() {
		return externalVarDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalVarDeclaration_VariableName() {
		return (EReference)externalVarDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalVarDeclaration_Spec() {
		return (EReference)externalVarDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayStructVarSpec() {
		return arrayStructVarSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayStructVarSpec_VariableName() {
		return (EReference)arrayStructVarSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedVarSpec() {
		return sharedVarSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleByteStringVar() {
		return singleByteStringVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTempVarDeclarationContainer() {
		return tempVarDeclarationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTempVarDeclarationContainer_Declarations() {
		return (EReference)tempVarDeclarationContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncomplLocatedVarContainer() {
		return incomplLocatedVarContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncomplLocatedVarContainer_Retain() {
		return (EAttribute)incomplLocatedVarContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomplLocatedVarContainer_Declarations() {
		return (EReference)incomplLocatedVarContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramSpecificDeclaration() {
		return programSpecificDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocatedVarDeclarationContainer() {
		return locatedVarDeclarationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocatedVarDeclarationContainer_Type() {
		return (EAttribute)locatedVarDeclarationContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocatedVarDeclarationContainer_Declarations() {
		return (EReference)locatedVarDeclarationContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramAccessContainer() {
		return programAccessContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramAccessContainer_Declarations() {
		return (EReference)programAccessContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionVarContainer() {
		return functionVarContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionVarContainer_Declarations() {
		return (EReference)functionVarContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionVarContainer_CONSTANT() {
		return (EAttribute)functionVarContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVarDeclarationContainer() {
		return globalVarDeclarationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVarDeclarationContainer_Declarations() {
		return (EReference)globalVarDeclarationContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVarDeclarationContainer_GlobalAttribute() {
		return (EAttribute)globalVarDeclarationContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionVariableDeclaration() {
		return functionVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBlockVariableDeclaration() {
		return functionBlockVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramVariableDeclaration() {
		return programVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationVariableDeclaration() {
		return configurationVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceVariableDeclaration() {
		return resourceVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessVarContainer() {
		return accessVarContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessVarContainer_Declarations() {
		return (EReference)accessVarContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceSpecificVarContainter() {
		return instanceSpecificVarContainterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecificVarContainter_Declarations() {
		return (EReference)instanceSpecificVarContainterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceSpecificVarInit() {
		return instanceSpecificVarInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecificVarInit_ResourceRef() {
		return (EReference)instanceSpecificVarInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecificVarInit_ProgramRef() {
		return (EReference)instanceSpecificVarInitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceSpecificVariable() {
		return instanceSpecificVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecificVariable_VariableRef() {
		return (EReference)instanceSpecificVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecificVariable_Location() {
		return (EReference)instanceSpecificVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecificVariable_Specinit() {
		return (EReference)instanceSpecificVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceSpecificFB() {
		return instanceSpecificFBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecificFB_Init() {
		return (EReference)instanceSpecificFBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecificFB_FbInstanceRef() {
		return (EReference)instanceSpecificFBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalVarSpec() {
		return externalVarSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVarSpecInit() {
		return globalVarSpecInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceSpecificSpecInit() {
		return instanceSpecificSpecInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVar2SpecInit() {
		return var2SpecInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationSpecificDeclaration() {
		return configurationSpecificDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputDeclaration() {
		return inputDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeDeclaration() {
		return edgeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeDeclaration_EdgeType() {
		return (EAttribute)edgeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarInitDeclaration() {
		return varInitDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVar1SpecInitDecl() {
		return var1SpecInitDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVar1SpecInitDecl_SpecInit() {
		return (EReference)var1SpecInitDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringVarDecl() {
		return stringVarDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleByteStringSpecInit() {
		return singleByteStringSpecInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleByteStringSpecInit_Init() {
		return (EReference)singleByteStringSpecInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleByteStringSpecInit() {
		return doubleByteStringSpecInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoubleByteStringSpecInit_Init() {
		return (EReference)doubleByteStringSpecInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVar1SpecInit() {
		return var1SpecInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedVariableDeclaration() {
		return namedVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedVariableDeclaration_VariableName() {
		return (EReference)namedVariableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleByteStringSpec() {
		return singleByteStringSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringVariable() {
		return stringVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringVariable_Length() {
		return (EReference)stringVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleByteStringSpec() {
		return doubleByteStringSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleByteStringVar() {
		return doubleByteStringVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessDeclaration() {
		return accessDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessDeclaration_Direction() {
		return (EAttribute)accessDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessDeclaration_Type() {
		return (EReference)accessDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessDeclaration_ResourceRef() {
		return (EReference)accessDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolicAccessPath() {
		return symbolicAccessPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolicAccessPath_FbRef() {
		return (EReference)symbolicAccessPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolicAccessPath_ProgramRef() {
		return (EReference)symbolicAccessPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolicAccessPath_Variable() {
		return (EReference)symbolicAccessPathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarDeclarationOnly() {
		return varDeclarationOnlyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTempVarDeclaration() {
		return tempVarDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVar1Decl() {
		return var1DeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVar1Decl_Specification() {
		return (EReference)var1DeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocatedVarDeclaration() {
		return locatedVarDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocatedVarDeclaration_Location() {
		return (EReference)locatedVarDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocatedVarDeclaration_SpecInit() {
		return (EReference)locatedVarDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocatedVarSpecInit() {
		return locatedVarSpecInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVar1Specification() {
		return var1SpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncomplLocatedVarDeclaration() {
		return incomplLocatedVarDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncomplLocatedVarDeclaration_Location() {
		return (EAttribute)incomplLocatedVarDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomplLocatedVarDeclaration_VariableName() {
		return (EReference)incomplLocatedVarDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomplLocatedVarDeclaration_Spec() {
		return (EReference)incomplLocatedVarDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringSpecification() {
		return stringSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarSpec() {
		return varSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnlyNamedGlobalVar() {
		return onlyNamedGlobalVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnlyNamedGlobalVar_VariableName() {
		return (EReference)onlyNamedGlobalVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocatedGlobalVar() {
		return locatedGlobalVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocatedGlobalVar_VariableName() {
		return (EReference)locatedGlobalVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocatedGlobalVar_Location() {
		return (EReference)locatedGlobalVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVarSpec() {
		return globalVarSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVarDeclaration() {
		return globalVarDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVarDeclaration_VarSpec() {
		return (EReference)globalVarDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVarDeclaration_SpecInit() {
		return (EReference)globalVarDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVar2SpecInitDecl() {
		return var2SpecInitDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVar2SpecInitDecl_SpecInit() {
		return (EReference)var2SpecInitDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramAccessDeclaration() {
		return programAccessDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramAccessDeclaration_Type() {
		return (EReference)programAccessDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramAccessDeclaration_Variable() {
		return (EReference)programAccessDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramAccessDeclaration_Direction() {
		return (EAttribute)programAccessDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFBInstance() {
		return fbInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFBInstance_Init() {
		return (EReference)fbInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFBInstance_Type() {
		return (EReference)fbInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFBInstance_FunctionBlockType() {
		return (EReference)fbInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVarDeclarationType() {
		return varDeclarationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEdgeType() {
		return edgeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlobalAttribute() {
		return globalAttributeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationsFactory getDeclarationsFactory() {
		return (DeclarationsFactory)getEFactoryInstance();
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
		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);

		ioVarDeclarationEClass = createEClass(IO_VAR_DECLARATION);

		inputVarContainerEClass = createEClass(INPUT_VAR_CONTAINER);
		createEAttribute(inputVarContainerEClass, INPUT_VAR_CONTAINER__RETAIN);
		createEReference(inputVarContainerEClass, INPUT_VAR_CONTAINER__DECLARATIONS);

		outputVarContainerEClass = createEClass(OUTPUT_VAR_CONTAINER);
		createEReference(outputVarContainerEClass, OUTPUT_VAR_CONTAINER__DECLARATIONS);
		createEAttribute(outputVarContainerEClass, OUTPUT_VAR_CONTAINER__RETAIN);

		inputOutputVarContainerEClass = createEClass(INPUT_OUTPUT_VAR_CONTAINER);
		createEReference(inputOutputVarContainerEClass, INPUT_OUTPUT_VAR_CONTAINER__DECLARATIONS);

		fbProgramVarDeclarationEClass = createEClass(FB_PROGRAM_VAR_DECLARATION);

		varDeclarationContainerEClass = createEClass(VAR_DECLARATION_CONTAINER);
		createEAttribute(varDeclarationContainerEClass, VAR_DECLARATION_CONTAINER__DECLARATION_TYPE);
		createEReference(varDeclarationContainerEClass, VAR_DECLARATION_CONTAINER__DECLARATIONS);

		externalVarContainerEClass = createEClass(EXTERNAL_VAR_CONTAINER);
		createEAttribute(externalVarContainerEClass, EXTERNAL_VAR_CONTAINER__CONSTANT);
		createEReference(externalVarContainerEClass, EXTERNAL_VAR_CONTAINER__DECLARATIONS);

		tempVarDeclarationContainerEClass = createEClass(TEMP_VAR_DECLARATION_CONTAINER);
		createEReference(tempVarDeclarationContainerEClass, TEMP_VAR_DECLARATION_CONTAINER__DECLARATIONS);

		incomplLocatedVarContainerEClass = createEClass(INCOMPL_LOCATED_VAR_CONTAINER);
		createEAttribute(incomplLocatedVarContainerEClass, INCOMPL_LOCATED_VAR_CONTAINER__RETAIN);
		createEReference(incomplLocatedVarContainerEClass, INCOMPL_LOCATED_VAR_CONTAINER__DECLARATIONS);

		programSpecificDeclarationEClass = createEClass(PROGRAM_SPECIFIC_DECLARATION);

		locatedVarDeclarationContainerEClass = createEClass(LOCATED_VAR_DECLARATION_CONTAINER);
		createEAttribute(locatedVarDeclarationContainerEClass, LOCATED_VAR_DECLARATION_CONTAINER__TYPE);
		createEReference(locatedVarDeclarationContainerEClass, LOCATED_VAR_DECLARATION_CONTAINER__DECLARATIONS);

		programAccessContainerEClass = createEClass(PROGRAM_ACCESS_CONTAINER);
		createEReference(programAccessContainerEClass, PROGRAM_ACCESS_CONTAINER__DECLARATIONS);

		functionVarContainerEClass = createEClass(FUNCTION_VAR_CONTAINER);
		createEReference(functionVarContainerEClass, FUNCTION_VAR_CONTAINER__DECLARATIONS);
		createEAttribute(functionVarContainerEClass, FUNCTION_VAR_CONTAINER__CONSTANT);

		globalVarDeclarationContainerEClass = createEClass(GLOBAL_VAR_DECLARATION_CONTAINER);
		createEReference(globalVarDeclarationContainerEClass, GLOBAL_VAR_DECLARATION_CONTAINER__DECLARATIONS);
		createEAttribute(globalVarDeclarationContainerEClass, GLOBAL_VAR_DECLARATION_CONTAINER__GLOBAL_ATTRIBUTE);

		functionVariableDeclarationEClass = createEClass(FUNCTION_VARIABLE_DECLARATION);

		functionBlockVariableDeclarationEClass = createEClass(FUNCTION_BLOCK_VARIABLE_DECLARATION);

		programVariableDeclarationEClass = createEClass(PROGRAM_VARIABLE_DECLARATION);

		configurationVariableDeclarationEClass = createEClass(CONFIGURATION_VARIABLE_DECLARATION);

		resourceVariableDeclarationEClass = createEClass(RESOURCE_VARIABLE_DECLARATION);

		accessVarContainerEClass = createEClass(ACCESS_VAR_CONTAINER);
		createEReference(accessVarContainerEClass, ACCESS_VAR_CONTAINER__DECLARATIONS);

		instanceSpecificVarContainterEClass = createEClass(INSTANCE_SPECIFIC_VAR_CONTAINTER);
		createEReference(instanceSpecificVarContainterEClass, INSTANCE_SPECIFIC_VAR_CONTAINTER__DECLARATIONS);

		configurationSpecificDeclarationEClass = createEClass(CONFIGURATION_SPECIFIC_DECLARATION);

		inputDeclarationEClass = createEClass(INPUT_DECLARATION);

		edgeDeclarationEClass = createEClass(EDGE_DECLARATION);
		createEAttribute(edgeDeclarationEClass, EDGE_DECLARATION__EDGE_TYPE);

		varInitDeclarationEClass = createEClass(VAR_INIT_DECLARATION);

		var1SpecInitDeclEClass = createEClass(VAR1_SPEC_INIT_DECL);
		createEReference(var1SpecInitDeclEClass, VAR1_SPEC_INIT_DECL__SPEC_INIT);

		stringVarDeclEClass = createEClass(STRING_VAR_DECL);

		singleByteStringSpecInitEClass = createEClass(SINGLE_BYTE_STRING_SPEC_INIT);
		createEReference(singleByteStringSpecInitEClass, SINGLE_BYTE_STRING_SPEC_INIT__INIT);

		doubleByteStringSpecInitEClass = createEClass(DOUBLE_BYTE_STRING_SPEC_INIT);
		createEReference(doubleByteStringSpecInitEClass, DOUBLE_BYTE_STRING_SPEC_INIT__INIT);

		varDeclarationOnlyEClass = createEClass(VAR_DECLARATION_ONLY);

		tempVarDeclarationEClass = createEClass(TEMP_VAR_DECLARATION);

		var1DeclEClass = createEClass(VAR1_DECL);
		createEReference(var1DeclEClass, VAR1_DECL__SPECIFICATION);

		locatedVarDeclarationEClass = createEClass(LOCATED_VAR_DECLARATION);
		createEReference(locatedVarDeclarationEClass, LOCATED_VAR_DECLARATION__LOCATION);
		createEReference(locatedVarDeclarationEClass, LOCATED_VAR_DECLARATION__SPEC_INIT);

		incomplLocatedVarDeclarationEClass = createEClass(INCOMPL_LOCATED_VAR_DECLARATION);
		createEAttribute(incomplLocatedVarDeclarationEClass, INCOMPL_LOCATED_VAR_DECLARATION__LOCATION);
		createEReference(incomplLocatedVarDeclarationEClass, INCOMPL_LOCATED_VAR_DECLARATION__VARIABLE_NAME);
		createEReference(incomplLocatedVarDeclarationEClass, INCOMPL_LOCATED_VAR_DECLARATION__SPEC);

		stringSpecificationEClass = createEClass(STRING_SPECIFICATION);

		varSpecEClass = createEClass(VAR_SPEC);

		onlyNamedGlobalVarEClass = createEClass(ONLY_NAMED_GLOBAL_VAR);
		createEReference(onlyNamedGlobalVarEClass, ONLY_NAMED_GLOBAL_VAR__VARIABLE_NAME);

		locatedGlobalVarEClass = createEClass(LOCATED_GLOBAL_VAR);
		createEReference(locatedGlobalVarEClass, LOCATED_GLOBAL_VAR__VARIABLE_NAME);
		createEReference(locatedGlobalVarEClass, LOCATED_GLOBAL_VAR__LOCATION);

		globalVarSpecEClass = createEClass(GLOBAL_VAR_SPEC);

		globalVarDeclarationEClass = createEClass(GLOBAL_VAR_DECLARATION);
		createEReference(globalVarDeclarationEClass, GLOBAL_VAR_DECLARATION__VAR_SPEC);
		createEReference(globalVarDeclarationEClass, GLOBAL_VAR_DECLARATION__SPEC_INIT);

		var2SpecInitDeclEClass = createEClass(VAR2_SPEC_INIT_DECL);
		createEReference(var2SpecInitDeclEClass, VAR2_SPEC_INIT_DECL__SPEC_INIT);

		programAccessDeclarationEClass = createEClass(PROGRAM_ACCESS_DECLARATION);
		createEReference(programAccessDeclarationEClass, PROGRAM_ACCESS_DECLARATION__TYPE);
		createEReference(programAccessDeclarationEClass, PROGRAM_ACCESS_DECLARATION__VARIABLE);
		createEAttribute(programAccessDeclarationEClass, PROGRAM_ACCESS_DECLARATION__DIRECTION);

		fbInstanceEClass = createEClass(FB_INSTANCE);
		createEReference(fbInstanceEClass, FB_INSTANCE__INIT);
		createEReference(fbInstanceEClass, FB_INSTANCE__TYPE);
		createEReference(fbInstanceEClass, FB_INSTANCE__FUNCTION_BLOCK_TYPE);

		externalVarDeclarationEClass = createEClass(EXTERNAL_VAR_DECLARATION);
		createEReference(externalVarDeclarationEClass, EXTERNAL_VAR_DECLARATION__VARIABLE_NAME);
		createEReference(externalVarDeclarationEClass, EXTERNAL_VAR_DECLARATION__SPEC);

		arrayStructVarSpecEClass = createEClass(ARRAY_STRUCT_VAR_SPEC);
		createEReference(arrayStructVarSpecEClass, ARRAY_STRUCT_VAR_SPEC__VARIABLE_NAME);

		sharedVarSpecEClass = createEClass(SHARED_VAR_SPEC);

		singleByteStringVarEClass = createEClass(SINGLE_BYTE_STRING_VAR);

		singleByteStringSpecEClass = createEClass(SINGLE_BYTE_STRING_SPEC);

		stringVariableEClass = createEClass(STRING_VARIABLE);
		createEReference(stringVariableEClass, STRING_VARIABLE__LENGTH);

		doubleByteStringSpecEClass = createEClass(DOUBLE_BYTE_STRING_SPEC);

		doubleByteStringVarEClass = createEClass(DOUBLE_BYTE_STRING_VAR);

		accessDeclarationEClass = createEClass(ACCESS_DECLARATION);
		createEAttribute(accessDeclarationEClass, ACCESS_DECLARATION__DIRECTION);
		createEReference(accessDeclarationEClass, ACCESS_DECLARATION__TYPE);
		createEReference(accessDeclarationEClass, ACCESS_DECLARATION__RESOURCE_REF);

		symbolicAccessPathEClass = createEClass(SYMBOLIC_ACCESS_PATH);
		createEReference(symbolicAccessPathEClass, SYMBOLIC_ACCESS_PATH__FB_REF);
		createEReference(symbolicAccessPathEClass, SYMBOLIC_ACCESS_PATH__PROGRAM_REF);
		createEReference(symbolicAccessPathEClass, SYMBOLIC_ACCESS_PATH__VARIABLE);

		instanceSpecificVarInitEClass = createEClass(INSTANCE_SPECIFIC_VAR_INIT);
		createEReference(instanceSpecificVarInitEClass, INSTANCE_SPECIFIC_VAR_INIT__RESOURCE_REF);
		createEReference(instanceSpecificVarInitEClass, INSTANCE_SPECIFIC_VAR_INIT__PROGRAM_REF);

		instanceSpecificVariableEClass = createEClass(INSTANCE_SPECIFIC_VARIABLE);
		createEReference(instanceSpecificVariableEClass, INSTANCE_SPECIFIC_VARIABLE__VARIABLE_REF);
		createEReference(instanceSpecificVariableEClass, INSTANCE_SPECIFIC_VARIABLE__LOCATION);
		createEReference(instanceSpecificVariableEClass, INSTANCE_SPECIFIC_VARIABLE__SPECINIT);

		instanceSpecificFBEClass = createEClass(INSTANCE_SPECIFIC_FB);
		createEReference(instanceSpecificFBEClass, INSTANCE_SPECIFIC_FB__INIT);
		createEReference(instanceSpecificFBEClass, INSTANCE_SPECIFIC_FB__FB_INSTANCE_REF);

		externalVarSpecEClass = createEClass(EXTERNAL_VAR_SPEC);

		globalVarSpecInitEClass = createEClass(GLOBAL_VAR_SPEC_INIT);

		instanceSpecificSpecInitEClass = createEClass(INSTANCE_SPECIFIC_SPEC_INIT);

		var2SpecInitEClass = createEClass(VAR2_SPEC_INIT);

		var1SpecInitEClass = createEClass(VAR1_SPEC_INIT);

		namedVariableDeclarationEClass = createEClass(NAMED_VARIABLE_DECLARATION);
		createEReference(namedVariableDeclarationEClass, NAMED_VARIABLE_DECLARATION__VARIABLE_NAME);

		locatedVarSpecInitEClass = createEClass(LOCATED_VAR_SPEC_INIT);

		var1SpecificationEClass = createEClass(VAR1_SPECIFICATION);

		// Create enums
		varDeclarationTypeEEnum = createEEnum(VAR_DECLARATION_TYPE);
		edgeTypeEEnum = createEEnum(EDGE_TYPE);
		globalAttributeEEnum = createEEnum(GLOBAL_ATTRIBUTE);
		directionEEnum = createEEnum(DIRECTION);
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
		LiteralsPackage theLiteralsPackage = (LiteralsPackage)EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		PousPackage thePousPackage = (PousPackage)EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI);
		ConfigurationsPackage theConfigurationsPackage = (ConfigurationsPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ioVarDeclarationEClass.getESuperTypes().add(this.getFunctionVariableDeclaration());
		ioVarDeclarationEClass.getESuperTypes().add(this.getFunctionBlockVariableDeclaration());
		ioVarDeclarationEClass.getESuperTypes().add(this.getProgramVariableDeclaration());
		inputVarContainerEClass.getESuperTypes().add(this.getIOVarDeclaration());
		outputVarContainerEClass.getESuperTypes().add(this.getIOVarDeclaration());
		inputOutputVarContainerEClass.getESuperTypes().add(this.getIOVarDeclaration());
		fbProgramVarDeclarationEClass.getESuperTypes().add(this.getFunctionBlockVariableDeclaration());
		fbProgramVarDeclarationEClass.getESuperTypes().add(this.getProgramVariableDeclaration());
		varDeclarationContainerEClass.getESuperTypes().add(this.getFBProgramVarDeclaration());
		externalVarContainerEClass.getESuperTypes().add(this.getFBProgramVarDeclaration());
		tempVarDeclarationContainerEClass.getESuperTypes().add(this.getFBProgramVarDeclaration());
		incomplLocatedVarContainerEClass.getESuperTypes().add(this.getFBProgramVarDeclaration());
		programSpecificDeclarationEClass.getESuperTypes().add(this.getProgramVariableDeclaration());
		locatedVarDeclarationContainerEClass.getESuperTypes().add(this.getProgramSpecificDeclaration());
		programAccessContainerEClass.getESuperTypes().add(this.getProgramSpecificDeclaration());
		functionVarContainerEClass.getESuperTypes().add(this.getFunctionVariableDeclaration());
		globalVarDeclarationContainerEClass.getESuperTypes().add(this.getConfigurationVariableDeclaration());
		globalVarDeclarationContainerEClass.getESuperTypes().add(this.getResourceVariableDeclaration());
		functionVariableDeclarationEClass.getESuperTypes().add(this.getVariableDeclaration());
		functionBlockVariableDeclarationEClass.getESuperTypes().add(this.getProgramVariableDeclaration());
		programVariableDeclarationEClass.getESuperTypes().add(this.getVariableDeclaration());
		configurationVariableDeclarationEClass.getESuperTypes().add(this.getVariableDeclaration());
		resourceVariableDeclarationEClass.getESuperTypes().add(this.getVariableDeclaration());
		accessVarContainerEClass.getESuperTypes().add(this.getConfigurationSpecificDeclaration());
		instanceSpecificVarContainterEClass.getESuperTypes().add(this.getConfigurationSpecificDeclaration());
		configurationSpecificDeclarationEClass.getESuperTypes().add(this.getConfigurationVariableDeclaration());
		edgeDeclarationEClass.getESuperTypes().add(this.getInputDeclaration());
		edgeDeclarationEClass.getESuperTypes().add(this.getNamedVariableDeclaration());
		varInitDeclarationEClass.getESuperTypes().add(this.getInputDeclaration());
		var1SpecInitDeclEClass.getESuperTypes().add(this.getNamedVariableDeclaration());
		var1SpecInitDeclEClass.getESuperTypes().add(this.getLocatedVarSpecInit());
		stringVarDeclEClass.getESuperTypes().add(this.getTempVarDeclaration());
		stringVarDeclEClass.getESuperTypes().add(this.getVar2SpecInit());
		singleByteStringSpecInitEClass.getESuperTypes().add(this.getSingleByteStringVar());
		singleByteStringSpecInitEClass.getESuperTypes().add(this.getStringVarDecl());
		singleByteStringSpecInitEClass.getESuperTypes().add(this.getLocatedVarSpecInit());
		doubleByteStringSpecInitEClass.getESuperTypes().add(this.getStringVarDecl());
		doubleByteStringSpecInitEClass.getESuperTypes().add(this.getDoubleByteStringVar());
		doubleByteStringSpecInitEClass.getESuperTypes().add(this.getLocatedVarSpecInit());
		tempVarDeclarationEClass.getESuperTypes().add(this.getVarDeclarationOnly());
		var1DeclEClass.getESuperTypes().add(this.getTempVarDeclaration());
		var1DeclEClass.getESuperTypes().add(this.getNamedVariableDeclaration());
		locatedVarDeclarationEClass.getESuperTypes().add(this.getNamedVariableDeclaration());
		stringSpecificationEClass.getESuperTypes().add(this.getVarSpec());
		stringSpecificationEClass.getESuperTypes().add(this.getInstanceSpecificSpecInit());
		onlyNamedGlobalVarEClass.getESuperTypes().add(this.getGlobalVarSpec());
		locatedGlobalVarEClass.getESuperTypes().add(this.getGlobalVarSpec());
		var2SpecInitDeclEClass.getESuperTypes().add(this.getNamedVariableDeclaration());
		var2SpecInitDeclEClass.getESuperTypes().add(this.getVarInitDeclaration());
		programAccessDeclarationEClass.getESuperTypes().add(theLiteralsPackage.getNamedElement());
		fbInstanceEClass.getESuperTypes().add(this.getVarInitDeclaration());
		fbInstanceEClass.getESuperTypes().add(this.getVarDeclarationOnly());
		fbInstanceEClass.getESuperTypes().add(theLiteralsPackage.getNamedElement());
		arrayStructVarSpecEClass.getESuperTypes().add(this.getTempVarDeclaration());
		sharedVarSpecEClass.getESuperTypes().add(this.getVarSpec());
		sharedVarSpecEClass.getESuperTypes().add(this.getExternalVarSpec());
		singleByteStringVarEClass.getESuperTypes().add(this.getStringVariable());
		singleByteStringSpecEClass.getESuperTypes().add(this.getSingleByteStringVar());
		singleByteStringSpecEClass.getESuperTypes().add(this.getStringSpecification());
		doubleByteStringSpecEClass.getESuperTypes().add(this.getStringSpecification());
		doubleByteStringSpecEClass.getESuperTypes().add(this.getDoubleByteStringVar());
		doubleByteStringVarEClass.getESuperTypes().add(this.getStringVariable());
		accessDeclarationEClass.getESuperTypes().add(theLiteralsPackage.getNamedElement());
		symbolicAccessPathEClass.getESuperTypes().add(this.getAccessDeclaration());
		instanceSpecificVariableEClass.getESuperTypes().add(this.getInstanceSpecificVarInit());
		instanceSpecificFBEClass.getESuperTypes().add(this.getInstanceSpecificVarInit());
		var1SpecInitEClass.getESuperTypes().add(this.getVar2SpecInit());
		locatedVarSpecInitEClass.getESuperTypes().add(this.getGlobalVarSpecInit());

		// Initialize classes, features, and operations; add parameters
		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ioVarDeclarationEClass, IOVarDeclaration.class, "IOVarDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputVarContainerEClass, InputVarContainer.class, "InputVarContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputVarContainer_Retain(), ecorePackage.getEBoolean(), "retain", null, 0, 1, InputVarContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputVarContainer_Declarations(), this.getInputDeclaration(), null, "declarations", null, 1, -1, InputVarContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputVarContainerEClass, OutputVarContainer.class, "OutputVarContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputVarContainer_Declarations(), this.getVarInitDeclaration(), null, "declarations", null, 1, -1, OutputVarContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputVarContainer_Retain(), ecorePackage.getEBoolean(), "retain", null, 0, 1, OutputVarContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputOutputVarContainerEClass, InputOutputVarContainer.class, "InputOutputVarContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputOutputVarContainer_Declarations(), this.getVarDeclarationOnly(), null, "declarations", null, 1, -1, InputOutputVarContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fbProgramVarDeclarationEClass, FBProgramVarDeclaration.class, "FBProgramVarDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(varDeclarationContainerEClass, VarDeclarationContainer.class, "VarDeclarationContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarDeclarationContainer_DeclarationType(), this.getVarDeclarationType(), "declarationType", null, 0, 1, VarDeclarationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarDeclarationContainer_Declarations(), this.getVarInitDeclaration(), null, "declarations", null, 1, -1, VarDeclarationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalVarContainerEClass, ExternalVarContainer.class, "ExternalVarContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalVarContainer_Constant(), ecorePackage.getEBoolean(), "constant", null, 1, 1, ExternalVarContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalVarContainer_Declarations(), this.getExternalVarDeclaration(), null, "declarations", null, 1, -1, ExternalVarContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tempVarDeclarationContainerEClass, TempVarDeclarationContainer.class, "TempVarDeclarationContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTempVarDeclarationContainer_Declarations(), this.getTempVarDeclaration(), null, "declarations", null, 1, -1, TempVarDeclarationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incomplLocatedVarContainerEClass, IncomplLocatedVarContainer.class, "IncomplLocatedVarContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncomplLocatedVarContainer_Retain(), ecorePackage.getEBoolean(), "retain", null, 0, 1, IncomplLocatedVarContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncomplLocatedVarContainer_Declarations(), this.getIncomplLocatedVarDeclaration(), null, "declarations", null, 1, -1, IncomplLocatedVarContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programSpecificDeclarationEClass, ProgramSpecificDeclaration.class, "ProgramSpecificDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locatedVarDeclarationContainerEClass, LocatedVarDeclarationContainer.class, "LocatedVarDeclarationContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocatedVarDeclarationContainer_Type(), this.getVarDeclarationType(), "type", null, 0, 1, LocatedVarDeclarationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocatedVarDeclarationContainer_Declarations(), this.getLocatedVarDeclaration(), null, "declarations", null, 1, -1, LocatedVarDeclarationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programAccessContainerEClass, ProgramAccessContainer.class, "ProgramAccessContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramAccessContainer_Declarations(), this.getProgramAccessDeclaration(), null, "declarations", null, 1, -1, ProgramAccessContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionVarContainerEClass, FunctionVarContainer.class, "FunctionVarContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionVarContainer_Declarations(), this.getVar2SpecInitDecl(), null, "declarations", null, 1, -1, FunctionVarContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionVarContainer_CONSTANT(), ecorePackage.getEBoolean(), "CONSTANT", null, 0, 1, FunctionVarContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalVarDeclarationContainerEClass, GlobalVarDeclarationContainer.class, "GlobalVarDeclarationContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalVarDeclarationContainer_Declarations(), this.getGlobalVarDeclaration(), null, "declarations", null, 1, -1, GlobalVarDeclarationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalVarDeclarationContainer_GlobalAttribute(), this.getGlobalAttribute(), "globalAttribute", null, 0, 1, GlobalVarDeclarationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionVariableDeclarationEClass, FunctionVariableDeclaration.class, "FunctionVariableDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionBlockVariableDeclarationEClass, FunctionBlockVariableDeclaration.class, "FunctionBlockVariableDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(programVariableDeclarationEClass, ProgramVariableDeclaration.class, "ProgramVariableDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationVariableDeclarationEClass, ConfigurationVariableDeclaration.class, "ConfigurationVariableDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceVariableDeclarationEClass, ResourceVariableDeclaration.class, "ResourceVariableDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessVarContainerEClass, AccessVarContainer.class, "AccessVarContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessVarContainer_Declarations(), this.getAccessDeclaration(), null, "declarations", null, 1, -1, AccessVarContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceSpecificVarContainterEClass, InstanceSpecificVarContainter.class, "InstanceSpecificVarContainter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceSpecificVarContainter_Declarations(), this.getInstanceSpecificVarInit(), null, "declarations", null, 1, -1, InstanceSpecificVarContainter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationSpecificDeclarationEClass, ConfigurationSpecificDeclaration.class, "ConfigurationSpecificDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputDeclarationEClass, InputDeclaration.class, "InputDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeDeclarationEClass, EdgeDeclaration.class, "EdgeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdgeDeclaration_EdgeType(), this.getEdgeType(), "edgeType", null, 1, 1, EdgeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varInitDeclarationEClass, VarInitDeclaration.class, "VarInitDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(var1SpecInitDeclEClass, Var1SpecInitDecl.class, "Var1SpecInitDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVar1SpecInitDecl_SpecInit(), this.getVar1SpecInit(), null, "specInit", null, 1, 1, Var1SpecInitDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringVarDeclEClass, StringVarDecl.class, "StringVarDecl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleByteStringSpecInitEClass, SingleByteStringSpecInit.class, "SingleByteStringSpecInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleByteStringSpecInit_Init(), theLiteralsPackage.getSingleByteCharacterString(), null, "init", null, 0, 1, SingleByteStringSpecInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleByteStringSpecInitEClass, DoubleByteStringSpecInit.class, "DoubleByteStringSpecInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoubleByteStringSpecInit_Init(), theLiteralsPackage.getDoubleByteCharacterString(), null, "init", null, 0, 1, DoubleByteStringSpecInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varDeclarationOnlyEClass, VarDeclarationOnly.class, "VarDeclarationOnly", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tempVarDeclarationEClass, TempVarDeclaration.class, "TempVarDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(var1DeclEClass, Var1Decl.class, "Var1Decl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVar1Decl_Specification(), this.getVar1Specification(), null, "specification", null, 1, 1, Var1Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locatedVarDeclarationEClass, LocatedVarDeclaration.class, "LocatedVarDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocatedVarDeclaration_Location(), theVariablesPackage.getDirectVariable(), null, "location", null, 1, 1, LocatedVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocatedVarDeclaration_SpecInit(), this.getLocatedVarSpecInit(), null, "specInit", null, 1, 1, LocatedVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incomplLocatedVarDeclarationEClass, IncomplLocatedVarDeclaration.class, "IncomplLocatedVarDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncomplLocatedVarDeclaration_Location(), theVariablesPackage.getLocationPrefix(), "location", null, 0, 1, IncomplLocatedVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncomplLocatedVarDeclaration_VariableName(), theVariablesPackage.getNamedVariable(), null, "variableName", null, 1, 1, IncomplLocatedVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncomplLocatedVarDeclaration_Spec(), this.getVarSpec(), null, "spec", null, 1, 1, IncomplLocatedVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringSpecificationEClass, StringSpecification.class, "StringSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(varSpecEClass, VarSpec.class, "VarSpec", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(onlyNamedGlobalVarEClass, OnlyNamedGlobalVar.class, "OnlyNamedGlobalVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOnlyNamedGlobalVar_VariableName(), theVariablesPackage.getGlobalVar(), null, "variableName", null, 1, 1, OnlyNamedGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locatedGlobalVarEClass, LocatedGlobalVar.class, "LocatedGlobalVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocatedGlobalVar_VariableName(), theVariablesPackage.getGlobalVar(), null, "variableName", null, 0, 1, LocatedGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocatedGlobalVar_Location(), theVariablesPackage.getDirectVariable(), null, "location", null, 1, 1, LocatedGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalVarSpecEClass, GlobalVarSpec.class, "GlobalVarSpec", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(globalVarDeclarationEClass, GlobalVarDeclaration.class, "GlobalVarDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalVarDeclaration_VarSpec(), this.getGlobalVarSpec(), null, "varSpec", null, 1, 1, GlobalVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalVarDeclaration_SpecInit(), this.getGlobalVarSpecInit(), null, "specInit", null, 1, 1, GlobalVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(var2SpecInitDeclEClass, Var2SpecInitDecl.class, "Var2SpecInitDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVar2SpecInitDecl_SpecInit(), this.getVar2SpecInit(), null, "specInit", null, 1, 1, Var2SpecInitDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programAccessDeclarationEClass, ProgramAccessDeclaration.class, "ProgramAccessDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramAccessDeclaration_Type(), theTypesPackage.getNonGenericType(), null, "type", null, 1, 1, ProgramAccessDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramAccessDeclaration_Variable(), theVariablesPackage.getSymbolicVariable(), null, "variable", null, 1, 1, ProgramAccessDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramAccessDeclaration_Direction(), this.getDirection(), "direction", null, 0, 1, ProgramAccessDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fbInstanceEClass, FBInstance.class, "FBInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFBInstance_Init(), theTypesPackage.getStructureInit(), null, "init", null, 0, 1, FBInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFBInstance_Type(), thePousPackage.getAbstractFunctionBlockDeclaration(), null, "type", null, 1, 1, FBInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFBInstance_FunctionBlockType(), thePousPackage.getAbstractFunctionBlockDeclaration(), null, "functionBlockType", null, 1, 1, FBInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalVarDeclarationEClass, ExternalVarDeclaration.class, "ExternalVarDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalVarDeclaration_VariableName(), theVariablesPackage.getGlobalVar(), null, "variableName", null, 1, 1, ExternalVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalVarDeclaration_Spec(), this.getExternalVarSpec(), null, "spec", null, 1, 1, ExternalVarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayStructVarSpecEClass, ArrayStructVarSpec.class, "ArrayStructVarSpec", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayStructVarSpec_VariableName(), theVariablesPackage.getNamedVariable(), null, "variableName", null, 1, 1, ArrayStructVarSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedVarSpecEClass, SharedVarSpec.class, "SharedVarSpec", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleByteStringVarEClass, SingleByteStringVar.class, "SingleByteStringVar", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleByteStringSpecEClass, SingleByteStringSpec.class, "SingleByteStringSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringVariableEClass, StringVariable.class, "StringVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringVariable_Length(), theLiteralsPackage.getIntegerLiteral(), null, "length", null, 1, 1, StringVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleByteStringSpecEClass, DoubleByteStringSpec.class, "DoubleByteStringSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(doubleByteStringVarEClass, DoubleByteStringVar.class, "DoubleByteStringVar", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessDeclarationEClass, AccessDeclaration.class, "AccessDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessDeclaration_Direction(), this.getDirection(), "direction", null, 0, 1, AccessDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessDeclaration_Type(), theTypesPackage.getNonGenericType(), null, "type", null, 1, 1, AccessDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessDeclaration_ResourceRef(), theConfigurationsPackage.getResourceDeclaration(), null, "resourceRef", null, 0, 1, AccessDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolicAccessPathEClass, SymbolicAccessPath.class, "SymbolicAccessPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymbolicAccessPath_FbRef(), this.getFBInstance(), null, "fbRef", null, 0, 1, SymbolicAccessPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymbolicAccessPath_ProgramRef(), theConfigurationsPackage.getProgramConfiguration(), null, "programRef", null, 0, 1, SymbolicAccessPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymbolicAccessPath_Variable(), theVariablesPackage.getSymbolicVariable(), null, "variable", null, 1, 1, SymbolicAccessPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceSpecificVarInitEClass, InstanceSpecificVarInit.class, "InstanceSpecificVarInit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceSpecificVarInit_ResourceRef(), theConfigurationsPackage.getResourceDeclaration(), null, "resourceRef", null, 1, 1, InstanceSpecificVarInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceSpecificVarInit_ProgramRef(), theConfigurationsPackage.getProgramConfiguration(), null, "programRef", null, 1, 1, InstanceSpecificVarInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceSpecificVariableEClass, InstanceSpecificVariable.class, "InstanceSpecificVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceSpecificVariable_VariableRef(), theVariablesPackage.getNamedVariable(), null, "variableRef", null, 1, 1, InstanceSpecificVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceSpecificVariable_Location(), theVariablesPackage.getDirectVariable(), null, "location", null, 0, 1, InstanceSpecificVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceSpecificVariable_Specinit(), this.getInstanceSpecificSpecInit(), null, "specinit", null, 1, 1, InstanceSpecificVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceSpecificFBEClass, InstanceSpecificFB.class, "InstanceSpecificFB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceSpecificFB_Init(), theTypesPackage.getStructureInit(), null, "init", null, 1, 1, InstanceSpecificFB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceSpecificFB_FbInstanceRef(), this.getFBInstance(), null, "fbInstanceRef", null, 1, 1, InstanceSpecificFB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalVarSpecEClass, ExternalVarSpec.class, "ExternalVarSpec", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(globalVarSpecInitEClass, GlobalVarSpecInit.class, "GlobalVarSpecInit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceSpecificSpecInitEClass, InstanceSpecificSpecInit.class, "InstanceSpecificSpecInit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(var2SpecInitEClass, Var2SpecInit.class, "Var2SpecInit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(var1SpecInitEClass, Var1SpecInit.class, "Var1SpecInit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedVariableDeclarationEClass, NamedVariableDeclaration.class, "NamedVariableDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedVariableDeclaration_VariableName(), theVariablesPackage.getNamedVariable(), null, "variableName", null, 1, 1, NamedVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locatedVarSpecInitEClass, LocatedVarSpecInit.class, "LocatedVarSpecInit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(var1SpecificationEClass, Var1Specification.class, "Var1Specification", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(varDeclarationTypeEEnum, VarDeclarationType.class, "VarDeclarationType");
		addEEnumLiteral(varDeclarationTypeEEnum, VarDeclarationType.NIL);
		addEEnumLiteral(varDeclarationTypeEEnum, VarDeclarationType.RETAIN);
		addEEnumLiteral(varDeclarationTypeEEnum, VarDeclarationType.NONRETAIN);
		addEEnumLiteral(varDeclarationTypeEEnum, VarDeclarationType.CONSTANT);

		initEEnum(edgeTypeEEnum, EdgeType.class, "EdgeType");
		addEEnumLiteral(edgeTypeEEnum, EdgeType.REDGE);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.FEDGE);

		initEEnum(globalAttributeEEnum, GlobalAttribute.class, "GlobalAttribute");
		addEEnumLiteral(globalAttributeEEnum, GlobalAttribute.CONSTANT);
		addEEnumLiteral(globalAttributeEEnum, GlobalAttribute.RETAIN);

		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.READ_ONLY);
		addEEnumLiteral(directionEEnum, Direction.READ_WRITE);
	}

} //DeclarationsPackageImpl

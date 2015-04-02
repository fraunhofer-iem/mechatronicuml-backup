/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.impl;

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

import de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInit;
import de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInitElement;
import de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecification;
import de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeReference;
import de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeSpecification;
import de.fraunhofer.iem.m4a.IEC61131.core.types.BitStringType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.DataType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.DataTypeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.DateType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EBitStringType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EDateType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EElementaryStringType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EGenericType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.ERealType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.ESignedIntegerType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.ETimeType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EUnsignedIntegerType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryStringType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecification;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeReference;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeSpecification;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValue;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValuePointer;
import de.fraunhofer.iem.m4a.IEC61131.core.types.GenericType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.HardwareResourceTypeName;
import de.fraunhofer.iem.m4a.IEC61131.core.types.InitializedStructure;
import de.fraunhofer.iem.m4a.IEC61131.core.types.IntegerType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.NonGenericType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.NumericType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.RealType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SignedIntegerType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecification;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeReference;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SingleElementTypeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDomain;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementValue;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureInit;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructurePointer;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureSpecification;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureTypeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecification;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeReference;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeSpecification;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TimeType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.types.UnsignedIntegerType;

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
public class TypesPackageImpl extends EPackageImpl implements TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signedIntegerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedIntegerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleElementTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subrangeTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSpecInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subrangeSpecInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subrangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subrangeSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subrangeTypeSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedSpecInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedTypeSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arraySpecInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arraySpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInitElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializedStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureElementDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureElementDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureElementInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureElementValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonGenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subrangeTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structurePointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedValuePointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareResourceTypeNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eDateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eElementaryStringTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eBitStringTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eSignedIntegerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eUnsignedIntegerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eRealTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eGenericTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eTimeTypeEEnum = null;

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
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesPackageImpl() {
		super(eNS_URI, TypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypesPackage init() {
		if (isInited) return (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Obtain or create and register package
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IEC61131PackageImpl theIEC61131Package = (IEC61131PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IEC61131Package.eNS_URI) instanceof IEC61131PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IEC61131Package.eNS_URI) : IEC61131Package.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) instanceof LiteralsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) : LiteralsPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);
		DeclarationsPackageImpl theDeclarationsPackage = (DeclarationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) instanceof DeclarationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) : DeclarationsPackage.eINSTANCE);
		PousPackageImpl thePousPackage = (PousPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI) instanceof PousPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI) : PousPackage.eINSTANCE);
		ConfigurationsPackageImpl theConfigurationsPackage = (ConfigurationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI) instanceof ConfigurationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI) : ConfigurationsPackage.eINSTANCE);
		StPackageImpl theStPackage = (StPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) instanceof StPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) : StPackage.eINSTANCE);
		IlPackageImpl theIlPackage = (IlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) instanceof IlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) : IlPackage.eINSTANCE);

		// Create package meta-data objects
		theTypesPackage.createPackageContents();
		theIEC61131Package.createPackageContents();
		theCorePackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theDeclarationsPackage.createPackageContents();
		thePousPackage.createPackageContents();
		theConfigurationsPackage.createPackageContents();
		theStPackage.createPackageContents();
		theIlPackage.createPackageContents();

		// Initialize created meta-data
		theTypesPackage.initializePackageContents();
		theIEC61131Package.initializePackageContents();
		theCorePackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theDeclarationsPackage.initializePackageContents();
		thePousPackage.initializePackageContents();
		theConfigurationsPackage.initializePackageContents();
		theStPackage.initializePackageContents();
		theIlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, theTypesPackage);
		return theTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementaryType() {
		return elementaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericType() {
		return numericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateType() {
		return dateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Name() {
		return (EAttribute)dateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitStringType() {
		return bitStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitStringType_Name() {
		return (EAttribute)bitStringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeType() {
		return timeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Name() {
		return (EAttribute)timeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerType() {
		return integerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealType() {
		return realTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Name() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignedIntegerType() {
		return signedIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignedIntegerType_Name() {
		return (EAttribute)signedIntegerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedIntegerType() {
		return unsignedIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedIntegerType_Name() {
		return (EAttribute)unsignedIntegerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementaryStringType() {
		return elementaryStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementaryStringType_Name() {
		return (EAttribute)elementaryStringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeDeclaration() {
		return dataTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleElementTypeDeclaration() {
		return singleElementTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayTypeDeclaration() {
		return arrayTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayTypeDeclaration_SpecInit() {
		return (EReference)arrayTypeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureTypeDeclaration() {
		return structureTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureTypeDeclaration_Specification() {
		return (EReference)structureTypeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringTypeDeclaration() {
		return stringTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringTypeDeclaration_Length() {
		return (EReference)stringTypeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringTypeDeclaration_Value() {
		return (EReference)stringTypeDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringTypeDeclaration_Domain() {
		return (EReference)stringTypeDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTypeDeclaration() {
		return simpleTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTypeDeclaration_SpecInit() {
		return (EReference)simpleTypeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubrangeTypeDeclaration() {
		return subrangeTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubrangeTypeDeclaration_SpecInit() {
		return (EReference)subrangeTypeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedTypeDeclaration() {
		return enumeratedTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedTypeDeclaration_SpecInit() {
		return (EReference)enumeratedTypeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSpecInit() {
		return simpleSpecInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleSpecInit_Specification() {
		return (EReference)simpleSpecInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleSpecInit_Value() {
		return (EReference)simpleSpecInitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSpecification() {
		return simpleSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubrangeSpecInit() {
		return subrangeSpecInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubrangeSpecInit_Value() {
		return (EReference)subrangeSpecInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubrangeSpecInit_Specification() {
		return (EReference)subrangeSpecInitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubrange() {
		return subrangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubrange_LowerBound() {
		return (EReference)subrangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubrange_UpperBound() {
		return (EReference)subrangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubrangeSpecification() {
		return subrangeSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubrangeTypeSpecification() {
		return subrangeTypeSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubrangeTypeSpecification_IntegerType() {
		return (EReference)subrangeTypeSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubrangeTypeSpecification_Range() {
		return (EReference)subrangeTypeSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedSpecInit() {
		return enumeratedSpecInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedSpecInit_Specification() {
		return (EReference)enumeratedSpecInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedSpecInit_Initialization() {
		return (EReference)enumeratedSpecInitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedSpecification() {
		return enumeratedSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedValue() {
		return enumeratedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedValue_Scope() {
		return (EReference)enumeratedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedTypeSpecification() {
		return enumeratedTypeSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedTypeSpecification_ValueList() {
		return (EReference)enumeratedTypeSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArraySpecInit() {
		return arraySpecInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArraySpecInit_Specification() {
		return (EReference)arraySpecInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArraySpecInit_Initialization() {
		return (EReference)arraySpecInitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArraySpecification() {
		return arraySpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInit() {
		return arrayInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayInit_InitElements() {
		return (EReference)arrayInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayTypeSpecification() {
		return arrayTypeSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayTypeSpecification_Ranges() {
		return (EReference)arrayTypeSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayTypeSpecification_OfType() {
		return (EReference)arrayTypeSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInitElement() {
		return arrayInitElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureSpecification() {
		return structureSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDeclaration() {
		return structureDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDeclaration_DeclElements() {
		return (EReference)structureDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitializedStructure() {
		return initializedStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitializedStructure_DefinedStructure() {
		return (EReference)initializedStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitializedStructure_Init() {
		return (EReference)initializedStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureElementDeclaration() {
		return structureElementDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureElementDeclaration_Domain() {
		return (EReference)structureElementDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureInit() {
		return structureInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureInit_ElementInit() {
		return (EReference)structureInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureElementDomain() {
		return structureElementDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureElementInit() {
		return structureElementInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureElementInit_Element() {
		return (EReference)structureElementInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureElementInit_Value() {
		return (EReference)structureElementInitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureElementValue() {
		return structureElementValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonGenericType() {
		return nonGenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericType() {
		return genericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericType_Name() {
		return (EAttribute)genericTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayTypeReference() {
		return arrayTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayTypeReference_ArrayType() {
		return (EReference)arrayTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTypeReference() {
		return simpleTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTypeReference_SimpleType() {
		return (EReference)simpleTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubrangeTypeReference() {
		return subrangeTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubrangeTypeReference_SubrangeType() {
		return (EReference)subrangeTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedTypeReference() {
		return enumeratedTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedTypeReference_EnumeratedType() {
		return (EReference)enumeratedTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructurePointer() {
		return structurePointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructurePointer_StructureType() {
		return (EReference)structurePointerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedValuePointer() {
		return enumeratedValuePointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedValuePointer_EnumValue() {
		return (EReference)enumeratedValuePointerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareResourceTypeName() {
		return hardwareResourceTypeNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEDateType() {
		return eDateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEElementaryStringType() {
		return eElementaryStringTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEBitStringType() {
		return eBitStringTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getESignedIntegerType() {
		return eSignedIntegerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEUnsignedIntegerType() {
		return eUnsignedIntegerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getERealType() {
		return eRealTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEGenericType() {
		return eGenericTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getETimeType() {
		return eTimeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactory getTypesFactory() {
		return (TypesFactory)getEFactoryInstance();
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
		elementaryTypeEClass = createEClass(ELEMENTARY_TYPE);

		numericTypeEClass = createEClass(NUMERIC_TYPE);

		dateTypeEClass = createEClass(DATE_TYPE);
		createEAttribute(dateTypeEClass, DATE_TYPE__NAME);

		bitStringTypeEClass = createEClass(BIT_STRING_TYPE);
		createEAttribute(bitStringTypeEClass, BIT_STRING_TYPE__NAME);

		timeTypeEClass = createEClass(TIME_TYPE);
		createEAttribute(timeTypeEClass, TIME_TYPE__NAME);

		integerTypeEClass = createEClass(INTEGER_TYPE);

		realTypeEClass = createEClass(REAL_TYPE);
		createEAttribute(realTypeEClass, REAL_TYPE__NAME);

		signedIntegerTypeEClass = createEClass(SIGNED_INTEGER_TYPE);
		createEAttribute(signedIntegerTypeEClass, SIGNED_INTEGER_TYPE__NAME);

		unsignedIntegerTypeEClass = createEClass(UNSIGNED_INTEGER_TYPE);
		createEAttribute(unsignedIntegerTypeEClass, UNSIGNED_INTEGER_TYPE__NAME);

		elementaryStringTypeEClass = createEClass(ELEMENTARY_STRING_TYPE);
		createEAttribute(elementaryStringTypeEClass, ELEMENTARY_STRING_TYPE__NAME);

		dataTypeDeclarationEClass = createEClass(DATA_TYPE_DECLARATION);

		singleElementTypeDeclarationEClass = createEClass(SINGLE_ELEMENT_TYPE_DECLARATION);

		arrayTypeDeclarationEClass = createEClass(ARRAY_TYPE_DECLARATION);
		createEReference(arrayTypeDeclarationEClass, ARRAY_TYPE_DECLARATION__SPEC_INIT);

		structureTypeDeclarationEClass = createEClass(STRUCTURE_TYPE_DECLARATION);
		createEReference(structureTypeDeclarationEClass, STRUCTURE_TYPE_DECLARATION__SPECIFICATION);

		stringTypeDeclarationEClass = createEClass(STRING_TYPE_DECLARATION);
		createEReference(stringTypeDeclarationEClass, STRING_TYPE_DECLARATION__LENGTH);
		createEReference(stringTypeDeclarationEClass, STRING_TYPE_DECLARATION__VALUE);
		createEReference(stringTypeDeclarationEClass, STRING_TYPE_DECLARATION__DOMAIN);

		simpleTypeDeclarationEClass = createEClass(SIMPLE_TYPE_DECLARATION);
		createEReference(simpleTypeDeclarationEClass, SIMPLE_TYPE_DECLARATION__SPEC_INIT);

		subrangeTypeDeclarationEClass = createEClass(SUBRANGE_TYPE_DECLARATION);
		createEReference(subrangeTypeDeclarationEClass, SUBRANGE_TYPE_DECLARATION__SPEC_INIT);

		enumeratedTypeDeclarationEClass = createEClass(ENUMERATED_TYPE_DECLARATION);
		createEReference(enumeratedTypeDeclarationEClass, ENUMERATED_TYPE_DECLARATION__SPEC_INIT);

		simpleSpecInitEClass = createEClass(SIMPLE_SPEC_INIT);
		createEReference(simpleSpecInitEClass, SIMPLE_SPEC_INIT__SPECIFICATION);
		createEReference(simpleSpecInitEClass, SIMPLE_SPEC_INIT__VALUE);

		simpleSpecificationEClass = createEClass(SIMPLE_SPECIFICATION);

		subrangeSpecInitEClass = createEClass(SUBRANGE_SPEC_INIT);
		createEReference(subrangeSpecInitEClass, SUBRANGE_SPEC_INIT__VALUE);
		createEReference(subrangeSpecInitEClass, SUBRANGE_SPEC_INIT__SPECIFICATION);

		subrangeEClass = createEClass(SUBRANGE);
		createEReference(subrangeEClass, SUBRANGE__LOWER_BOUND);
		createEReference(subrangeEClass, SUBRANGE__UPPER_BOUND);

		subrangeSpecificationEClass = createEClass(SUBRANGE_SPECIFICATION);

		subrangeTypeSpecificationEClass = createEClass(SUBRANGE_TYPE_SPECIFICATION);
		createEReference(subrangeTypeSpecificationEClass, SUBRANGE_TYPE_SPECIFICATION__INTEGER_TYPE);
		createEReference(subrangeTypeSpecificationEClass, SUBRANGE_TYPE_SPECIFICATION__RANGE);

		enumeratedSpecInitEClass = createEClass(ENUMERATED_SPEC_INIT);
		createEReference(enumeratedSpecInitEClass, ENUMERATED_SPEC_INIT__SPECIFICATION);
		createEReference(enumeratedSpecInitEClass, ENUMERATED_SPEC_INIT__INITIALIZATION);

		enumeratedSpecificationEClass = createEClass(ENUMERATED_SPECIFICATION);

		enumeratedValueEClass = createEClass(ENUMERATED_VALUE);
		createEReference(enumeratedValueEClass, ENUMERATED_VALUE__SCOPE);

		enumeratedTypeSpecificationEClass = createEClass(ENUMERATED_TYPE_SPECIFICATION);
		createEReference(enumeratedTypeSpecificationEClass, ENUMERATED_TYPE_SPECIFICATION__VALUE_LIST);

		arraySpecInitEClass = createEClass(ARRAY_SPEC_INIT);
		createEReference(arraySpecInitEClass, ARRAY_SPEC_INIT__SPECIFICATION);
		createEReference(arraySpecInitEClass, ARRAY_SPEC_INIT__INITIALIZATION);

		arraySpecificationEClass = createEClass(ARRAY_SPECIFICATION);

		arrayInitEClass = createEClass(ARRAY_INIT);
		createEReference(arrayInitEClass, ARRAY_INIT__INIT_ELEMENTS);

		arrayTypeSpecificationEClass = createEClass(ARRAY_TYPE_SPECIFICATION);
		createEReference(arrayTypeSpecificationEClass, ARRAY_TYPE_SPECIFICATION__RANGES);
		createEReference(arrayTypeSpecificationEClass, ARRAY_TYPE_SPECIFICATION__OF_TYPE);

		arrayInitElementEClass = createEClass(ARRAY_INIT_ELEMENT);

		structureSpecificationEClass = createEClass(STRUCTURE_SPECIFICATION);

		structureDeclarationEClass = createEClass(STRUCTURE_DECLARATION);
		createEReference(structureDeclarationEClass, STRUCTURE_DECLARATION__DECL_ELEMENTS);

		initializedStructureEClass = createEClass(INITIALIZED_STRUCTURE);
		createEReference(initializedStructureEClass, INITIALIZED_STRUCTURE__DEFINED_STRUCTURE);
		createEReference(initializedStructureEClass, INITIALIZED_STRUCTURE__INIT);

		structureElementDeclarationEClass = createEClass(STRUCTURE_ELEMENT_DECLARATION);
		createEReference(structureElementDeclarationEClass, STRUCTURE_ELEMENT_DECLARATION__DOMAIN);

		structureInitEClass = createEClass(STRUCTURE_INIT);
		createEReference(structureInitEClass, STRUCTURE_INIT__ELEMENT_INIT);

		structureElementDomainEClass = createEClass(STRUCTURE_ELEMENT_DOMAIN);

		structureElementInitEClass = createEClass(STRUCTURE_ELEMENT_INIT);
		createEReference(structureElementInitEClass, STRUCTURE_ELEMENT_INIT__ELEMENT);
		createEReference(structureElementInitEClass, STRUCTURE_ELEMENT_INIT__VALUE);

		structureElementValueEClass = createEClass(STRUCTURE_ELEMENT_VALUE);

		dataTypeEClass = createEClass(DATA_TYPE);

		nonGenericTypeEClass = createEClass(NON_GENERIC_TYPE);

		genericTypeEClass = createEClass(GENERIC_TYPE);
		createEAttribute(genericTypeEClass, GENERIC_TYPE__NAME);

		arrayTypeReferenceEClass = createEClass(ARRAY_TYPE_REFERENCE);
		createEReference(arrayTypeReferenceEClass, ARRAY_TYPE_REFERENCE__ARRAY_TYPE);

		simpleTypeReferenceEClass = createEClass(SIMPLE_TYPE_REFERENCE);
		createEReference(simpleTypeReferenceEClass, SIMPLE_TYPE_REFERENCE__SIMPLE_TYPE);

		subrangeTypeReferenceEClass = createEClass(SUBRANGE_TYPE_REFERENCE);
		createEReference(subrangeTypeReferenceEClass, SUBRANGE_TYPE_REFERENCE__SUBRANGE_TYPE);

		enumeratedTypeReferenceEClass = createEClass(ENUMERATED_TYPE_REFERENCE);
		createEReference(enumeratedTypeReferenceEClass, ENUMERATED_TYPE_REFERENCE__ENUMERATED_TYPE);

		structurePointerEClass = createEClass(STRUCTURE_POINTER);
		createEReference(structurePointerEClass, STRUCTURE_POINTER__STRUCTURE_TYPE);

		enumeratedValuePointerEClass = createEClass(ENUMERATED_VALUE_POINTER);
		createEReference(enumeratedValuePointerEClass, ENUMERATED_VALUE_POINTER__ENUM_VALUE);

		hardwareResourceTypeNameEClass = createEClass(HARDWARE_RESOURCE_TYPE_NAME);

		// Create enums
		eDateTypeEEnum = createEEnum(EDATE_TYPE);
		eElementaryStringTypeEEnum = createEEnum(EELEMENTARY_STRING_TYPE);
		eBitStringTypeEEnum = createEEnum(EBIT_STRING_TYPE);
		eSignedIntegerTypeEEnum = createEEnum(ESIGNED_INTEGER_TYPE);
		eUnsignedIntegerTypeEEnum = createEEnum(EUNSIGNED_INTEGER_TYPE);
		eRealTypeEEnum = createEEnum(EREAL_TYPE);
		eGenericTypeEEnum = createEEnum(EGENERIC_TYPE);
		eTimeTypeEEnum = createEEnum(ETIME_TYPE);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		DeclarationsPackage theDeclarationsPackage = (DeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI);
		LiteralsPackage theLiteralsPackage = (LiteralsPackage)EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);
		StPackage theStPackage = (StPackage)EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI);
		ConfigurationsPackage theConfigurationsPackage = (ConfigurationsPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementaryTypeEClass.getESuperTypes().add(this.getSimpleSpecification());
		elementaryTypeEClass.getESuperTypes().add(this.getNonGenericType());
		elementaryTypeEClass.getESuperTypes().add(thePousPackage.getFunctionReturnDomain());
		numericTypeEClass.getESuperTypes().add(this.getElementaryType());
		dateTypeEClass.getESuperTypes().add(this.getElementaryType());
		bitStringTypeEClass.getESuperTypes().add(this.getElementaryType());
		timeTypeEClass.getESuperTypes().add(this.getElementaryType());
		integerTypeEClass.getESuperTypes().add(this.getNumericType());
		realTypeEClass.getESuperTypes().add(this.getNumericType());
		signedIntegerTypeEClass.getESuperTypes().add(this.getIntegerType());
		unsignedIntegerTypeEClass.getESuperTypes().add(this.getIntegerType());
		elementaryStringTypeEClass.getESuperTypes().add(this.getElementaryType());
		dataTypeDeclarationEClass.getESuperTypes().add(theCorePackage.getLibraryElement());
		singleElementTypeDeclarationEClass.getESuperTypes().add(this.getDataTypeDeclaration());
		arrayTypeDeclarationEClass.getESuperTypes().add(this.getDataTypeDeclaration());
		structureTypeDeclarationEClass.getESuperTypes().add(this.getDataTypeDeclaration());
		structureTypeDeclarationEClass.getESuperTypes().add(theDeclarationsPackage.getVarSpec());
		stringTypeDeclarationEClass.getESuperTypes().add(this.getDataTypeDeclaration());
		simpleTypeDeclarationEClass.getESuperTypes().add(this.getSingleElementTypeDeclaration());
		subrangeTypeDeclarationEClass.getESuperTypes().add(this.getSingleElementTypeDeclaration());
		enumeratedTypeDeclarationEClass.getESuperTypes().add(this.getSingleElementTypeDeclaration());
		simpleSpecInitEClass.getESuperTypes().add(this.getStructureElementDomain());
		simpleSpecInitEClass.getESuperTypes().add(theDeclarationsPackage.getInstanceSpecificSpecInit());
		simpleSpecInitEClass.getESuperTypes().add(theDeclarationsPackage.getVar1SpecInit());
		simpleSpecificationEClass.getESuperTypes().add(theDeclarationsPackage.getSharedVarSpec());
		simpleSpecificationEClass.getESuperTypes().add(theDeclarationsPackage.getVar1Specification());
		subrangeSpecInitEClass.getESuperTypes().add(this.getStructureElementDomain());
		subrangeSpecInitEClass.getESuperTypes().add(theDeclarationsPackage.getInstanceSpecificSpecInit());
		subrangeSpecInitEClass.getESuperTypes().add(theDeclarationsPackage.getVar1SpecInit());
		subrangeSpecificationEClass.getESuperTypes().add(theDeclarationsPackage.getSharedVarSpec());
		subrangeSpecificationEClass.getESuperTypes().add(theDeclarationsPackage.getVar1Specification());
		subrangeTypeSpecificationEClass.getESuperTypes().add(this.getSubrangeSpecification());
		subrangeTypeSpecificationEClass.getESuperTypes().add(theStPackage.getCaseListElement());
		enumeratedSpecInitEClass.getESuperTypes().add(this.getStructureElementDomain());
		enumeratedSpecInitEClass.getESuperTypes().add(theDeclarationsPackage.getInstanceSpecificSpecInit());
		enumeratedSpecInitEClass.getESuperTypes().add(theDeclarationsPackage.getVar1SpecInit());
		enumeratedSpecificationEClass.getESuperTypes().add(theDeclarationsPackage.getSharedVarSpec());
		enumeratedSpecificationEClass.getESuperTypes().add(theDeclarationsPackage.getVar1Specification());
		enumeratedValueEClass.getESuperTypes().add(theLiteralsPackage.getNamedElement());
		enumeratedValueEClass.getESuperTypes().add(this.getStructureElementValue());
		enumeratedValueEClass.getESuperTypes().add(theConfigurationsPackage.getProgDataSource());
		enumeratedValueEClass.getESuperTypes().add(theStPackage.getCaseListElement());
		enumeratedTypeSpecificationEClass.getESuperTypes().add(this.getEnumeratedSpecification());
		arraySpecInitEClass.getESuperTypes().add(this.getStructureElementDomain());
		arraySpecInitEClass.getESuperTypes().add(theDeclarationsPackage.getInstanceSpecificSpecInit());
		arraySpecInitEClass.getESuperTypes().add(theDeclarationsPackage.getVar2SpecInit());
		arraySpecInitEClass.getESuperTypes().add(theDeclarationsPackage.getLocatedVarSpecInit());
		arraySpecificationEClass.getESuperTypes().add(theDeclarationsPackage.getArrayStructVarSpec());
		arraySpecificationEClass.getESuperTypes().add(theDeclarationsPackage.getSharedVarSpec());
		arrayInitEClass.getESuperTypes().add(this.getArrayInitElement());
		arrayInitEClass.getESuperTypes().add(this.getStructureElementValue());
		arrayTypeSpecificationEClass.getESuperTypes().add(this.getArraySpecification());
		structureDeclarationEClass.getESuperTypes().add(this.getStructureSpecification());
		initializedStructureEClass.getESuperTypes().add(this.getStructureSpecification());
		initializedStructureEClass.getESuperTypes().add(this.getStructureElementDomain());
		initializedStructureEClass.getESuperTypes().add(theDeclarationsPackage.getInstanceSpecificSpecInit());
		initializedStructureEClass.getESuperTypes().add(theDeclarationsPackage.getVar2SpecInit());
		initializedStructureEClass.getESuperTypes().add(theDeclarationsPackage.getLocatedVarSpecInit());
		structureElementDeclarationEClass.getESuperTypes().add(theLiteralsPackage.getNamedElement());
		structureInitEClass.getESuperTypes().add(this.getStructureElementValue());
		structureInitEClass.getESuperTypes().add(this.getArrayInitElement());
		dataTypeEClass.getESuperTypes().add(theCorePackage.getLibraryElementReference());
		nonGenericTypeEClass.getESuperTypes().add(this.getDataType());
		genericTypeEClass.getESuperTypes().add(this.getDataType());
		arrayTypeReferenceEClass.getESuperTypes().add(this.getArraySpecification());
		simpleTypeReferenceEClass.getESuperTypes().add(this.getSimpleSpecification());
		subrangeTypeReferenceEClass.getESuperTypes().add(this.getSubrangeSpecification());
		enumeratedTypeReferenceEClass.getESuperTypes().add(this.getEnumeratedSpecification());
		structurePointerEClass.getESuperTypes().add(theDeclarationsPackage.getSharedVarSpec());
		structurePointerEClass.getESuperTypes().add(theDeclarationsPackage.getArrayStructVarSpec());
		enumeratedValuePointerEClass.getESuperTypes().add(this.getArrayInitElement());
		hardwareResourceTypeNameEClass.getESuperTypes().add(theCorePackage.getLibraryElementReference());
		hardwareResourceTypeNameEClass.getESuperTypes().add(theLiteralsPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementaryTypeEClass, ElementaryType.class, "ElementaryType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericTypeEClass, NumericType.class, "NumericType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateTypeEClass, DateType.class, "DateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateType_Name(), this.getEDateType(), "name", null, 1, 1, DateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bitStringTypeEClass, BitStringType.class, "BitStringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBitStringType_Name(), this.getEBitStringType(), "name", null, 1, 1, BitStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeTypeEClass, TimeType.class, "TimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeType_Name(), this.getETimeType(), "name", null, 0, 1, TimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerTypeEClass, IntegerType.class, "IntegerType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realTypeEClass, RealType.class, "RealType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealType_Name(), this.getERealType(), "name", null, 1, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signedIntegerTypeEClass, SignedIntegerType.class, "SignedIntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignedIntegerType_Name(), this.getESignedIntegerType(), "name", null, 1, 1, SignedIntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsignedIntegerTypeEClass, UnsignedIntegerType.class, "UnsignedIntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnsignedIntegerType_Name(), this.getEUnsignedIntegerType(), "name", null, 1, 1, UnsignedIntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementaryStringTypeEClass, ElementaryStringType.class, "ElementaryStringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementaryStringType_Name(), this.getEElementaryStringType(), "name", null, 1, 1, ElementaryStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeDeclarationEClass, DataTypeDeclaration.class, "DataTypeDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleElementTypeDeclarationEClass, SingleElementTypeDeclaration.class, "SingleElementTypeDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayTypeDeclarationEClass, ArrayTypeDeclaration.class, "ArrayTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayTypeDeclaration_SpecInit(), this.getArraySpecInit(), null, "specInit", null, 1, 1, ArrayTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureTypeDeclarationEClass, StructureTypeDeclaration.class, "StructureTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureTypeDeclaration_Specification(), this.getStructureSpecification(), null, "specification", null, 1, 1, StructureTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringTypeDeclarationEClass, StringTypeDeclaration.class, "StringTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringTypeDeclaration_Length(), theLiteralsPackage.getIntegerLiteral(), null, "length", null, 1, 1, StringTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringTypeDeclaration_Value(), theLiteralsPackage.getCharacterString(), null, "value", null, 0, 1, StringTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringTypeDeclaration_Domain(), this.getElementaryStringType(), null, "domain", null, 1, 1, StringTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTypeDeclarationEClass, SimpleTypeDeclaration.class, "SimpleTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleTypeDeclaration_SpecInit(), this.getSimpleSpecInit(), null, "specInit", null, 1, 1, SimpleTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subrangeTypeDeclarationEClass, SubrangeTypeDeclaration.class, "SubrangeTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubrangeTypeDeclaration_SpecInit(), this.getSubrangeSpecInit(), null, "specInit", null, 1, 1, SubrangeTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedTypeDeclarationEClass, EnumeratedTypeDeclaration.class, "EnumeratedTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeratedTypeDeclaration_SpecInit(), this.getEnumeratedSpecInit(), null, "specInit", null, 1, 1, EnumeratedTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleSpecInitEClass, SimpleSpecInit.class, "SimpleSpecInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleSpecInit_Specification(), this.getSimpleSpecification(), null, "specification", null, 1, 1, SimpleSpecInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleSpecInit_Value(), theLiteralsPackage.getConstant(), null, "value", null, 0, 1, SimpleSpecInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleSpecificationEClass, SimpleSpecification.class, "SimpleSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subrangeSpecInitEClass, SubrangeSpecInit.class, "SubrangeSpecInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubrangeSpecInit_Value(), theLiteralsPackage.getSignedInteger(), null, "value", null, 0, 1, SubrangeSpecInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubrangeSpecInit_Specification(), this.getSubrangeSpecification(), null, "specification", null, 1, 1, SubrangeSpecInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subrangeEClass, Subrange.class, "Subrange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubrange_LowerBound(), theLiteralsPackage.getSignedInteger(), null, "lowerBound", null, 1, 1, Subrange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubrange_UpperBound(), theLiteralsPackage.getSignedInteger(), null, "upperBound", null, 1, 1, Subrange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subrangeSpecificationEClass, SubrangeSpecification.class, "SubrangeSpecification", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subrangeTypeSpecificationEClass, SubrangeTypeSpecification.class, "SubrangeTypeSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubrangeTypeSpecification_IntegerType(), this.getIntegerType(), null, "integerType", null, 1, 1, SubrangeTypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubrangeTypeSpecification_Range(), this.getSubrange(), null, "range", null, 1, 1, SubrangeTypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedSpecInitEClass, EnumeratedSpecInit.class, "EnumeratedSpecInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeratedSpecInit_Specification(), this.getEnumeratedSpecification(), null, "specification", null, 1, 1, EnumeratedSpecInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeratedSpecInit_Initialization(), this.getEnumeratedValue(), null, "initialization", null, 0, 1, EnumeratedSpecInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedSpecificationEClass, EnumeratedSpecification.class, "EnumeratedSpecification", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumeratedValueEClass, EnumeratedValue.class, "EnumeratedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeratedValue_Scope(), this.getEnumeratedTypeDeclaration(), null, "scope", null, 0, 1, EnumeratedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedTypeSpecificationEClass, EnumeratedTypeSpecification.class, "EnumeratedTypeSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeratedTypeSpecification_ValueList(), this.getEnumeratedValue(), null, "valueList", null, 1, -1, EnumeratedTypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arraySpecInitEClass, ArraySpecInit.class, "ArraySpecInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArraySpecInit_Specification(), this.getArraySpecification(), null, "specification", null, 1, 1, ArraySpecInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArraySpecInit_Initialization(), this.getArrayInit(), null, "initialization", null, 0, 1, ArraySpecInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arraySpecificationEClass, ArraySpecification.class, "ArraySpecification", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayInitEClass, ArrayInit.class, "ArrayInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayInit_InitElements(), this.getArrayInitElement(), null, "initElements", null, 1, -1, ArrayInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayTypeSpecificationEClass, ArrayTypeSpecification.class, "ArrayTypeSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayTypeSpecification_Ranges(), this.getSubrange(), null, "ranges", null, 1, -1, ArrayTypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayTypeSpecification_OfType(), this.getNonGenericType(), null, "ofType", null, 1, 1, ArrayTypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayInitElementEClass, ArrayInitElement.class, "ArrayInitElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structureSpecificationEClass, StructureSpecification.class, "StructureSpecification", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structureDeclarationEClass, StructureDeclaration.class, "StructureDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureDeclaration_DeclElements(), this.getStructureElementDeclaration(), null, "declElements", null, 1, -1, StructureDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initializedStructureEClass, InitializedStructure.class, "InitializedStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitializedStructure_DefinedStructure(), this.getStructureTypeDeclaration(), null, "definedStructure", null, 1, 1, InitializedStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitializedStructure_Init(), this.getStructureInit(), null, "init", null, 0, 1, InitializedStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureElementDeclarationEClass, StructureElementDeclaration.class, "StructureElementDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureElementDeclaration_Domain(), this.getStructureElementDomain(), null, "domain", null, 1, 1, StructureElementDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureInitEClass, StructureInit.class, "StructureInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureInit_ElementInit(), this.getStructureElementInit(), null, "elementInit", null, 1, -1, StructureInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureElementDomainEClass, StructureElementDomain.class, "StructureElementDomain", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structureElementInitEClass, StructureElementInit.class, "StructureElementInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureElementInit_Element(), this.getStructureElementDeclaration(), null, "element", null, 1, 1, StructureElementInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructureElementInit_Value(), this.getStructureElementValue(), null, "value", null, 1, 1, StructureElementInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureElementValueEClass, StructureElementValue.class, "StructureElementValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nonGenericTypeEClass, NonGenericType.class, "NonGenericType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericTypeEClass, GenericType.class, "GenericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericType_Name(), this.getEGenericType(), "name", null, 1, 1, GenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayTypeReferenceEClass, ArrayTypeReference.class, "ArrayTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayTypeReference_ArrayType(), this.getArrayTypeDeclaration(), null, "arrayType", null, 1, 1, ArrayTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTypeReferenceEClass, SimpleTypeReference.class, "SimpleTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleTypeReference_SimpleType(), this.getSimpleTypeDeclaration(), null, "simpleType", null, 1, 1, SimpleTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subrangeTypeReferenceEClass, SubrangeTypeReference.class, "SubrangeTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubrangeTypeReference_SubrangeType(), this.getSubrangeTypeDeclaration(), null, "subrangeType", null, 1, 1, SubrangeTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedTypeReferenceEClass, EnumeratedTypeReference.class, "EnumeratedTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeratedTypeReference_EnumeratedType(), this.getEnumeratedTypeDeclaration(), null, "enumeratedType", null, 1, 1, EnumeratedTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structurePointerEClass, StructurePointer.class, "StructurePointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructurePointer_StructureType(), this.getStructureTypeDeclaration(), null, "structureType", null, 1, 1, StructurePointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedValuePointerEClass, EnumeratedValuePointer.class, "EnumeratedValuePointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeratedValuePointer_EnumValue(), this.getEnumeratedValue(), null, "enumValue", null, 1, 1, EnumeratedValuePointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareResourceTypeNameEClass, HardwareResourceTypeName.class, "HardwareResourceTypeName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(eDateTypeEEnum, EDateType.class, "EDateType");
		addEEnumLiteral(eDateTypeEEnum, EDateType.DATE);
		addEEnumLiteral(eDateTypeEEnum, EDateType.TIMEOFDAY);
		addEEnumLiteral(eDateTypeEEnum, EDateType.TOD);
		addEEnumLiteral(eDateTypeEEnum, EDateType.DATEANDTIME);
		addEEnumLiteral(eDateTypeEEnum, EDateType.DT);

		initEEnum(eElementaryStringTypeEEnum, EElementaryStringType.class, "EElementaryStringType");
		addEEnumLiteral(eElementaryStringTypeEEnum, EElementaryStringType.STRING);
		addEEnumLiteral(eElementaryStringTypeEEnum, EElementaryStringType.WSTRING);

		initEEnum(eBitStringTypeEEnum, EBitStringType.class, "EBitStringType");
		addEEnumLiteral(eBitStringTypeEEnum, EBitStringType.BOOL);
		addEEnumLiteral(eBitStringTypeEEnum, EBitStringType.DWORD);
		addEEnumLiteral(eBitStringTypeEEnum, EBitStringType.LWORD);
		addEEnumLiteral(eBitStringTypeEEnum, EBitStringType.WORD);
		addEEnumLiteral(eBitStringTypeEEnum, EBitStringType.BYTE);

		initEEnum(eSignedIntegerTypeEEnum, ESignedIntegerType.class, "ESignedIntegerType");
		addEEnumLiteral(eSignedIntegerTypeEEnum, ESignedIntegerType.SINT);
		addEEnumLiteral(eSignedIntegerTypeEEnum, ESignedIntegerType.INT);
		addEEnumLiteral(eSignedIntegerTypeEEnum, ESignedIntegerType.LINT);
		addEEnumLiteral(eSignedIntegerTypeEEnum, ESignedIntegerType.DINT);

		initEEnum(eUnsignedIntegerTypeEEnum, EUnsignedIntegerType.class, "EUnsignedIntegerType");
		addEEnumLiteral(eUnsignedIntegerTypeEEnum, EUnsignedIntegerType.USINT);
		addEEnumLiteral(eUnsignedIntegerTypeEEnum, EUnsignedIntegerType.UINT);
		addEEnumLiteral(eUnsignedIntegerTypeEEnum, EUnsignedIntegerType.UDINT);
		addEEnumLiteral(eUnsignedIntegerTypeEEnum, EUnsignedIntegerType.ULINT);

		initEEnum(eRealTypeEEnum, ERealType.class, "ERealType");
		addEEnumLiteral(eRealTypeEEnum, ERealType.REAL);
		addEEnumLiteral(eRealTypeEEnum, ERealType.LREAL);

		initEEnum(eGenericTypeEEnum, EGenericType.class, "EGenericType");
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.ANY);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.ANY_DERIVED);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.ANY_ELEMENTARY);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.ANY_MAGNITUDE);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.ANY_NUM);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.ANY_REAL);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.ANY_INT);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.ANY_BIT);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.ANY_STRING);
		addEEnumLiteral(eGenericTypeEEnum, EGenericType.ANY_DATE);

		initEEnum(eTimeTypeEEnum, ETimeType.class, "ETimeType");
		addEEnumLiteral(eTimeTypeEEnum, ETimeType.TIME);
	}

} //TypesPackageImpl

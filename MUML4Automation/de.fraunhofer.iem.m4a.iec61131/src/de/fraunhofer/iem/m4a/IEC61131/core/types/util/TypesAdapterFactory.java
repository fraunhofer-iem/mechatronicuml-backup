/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.util;

import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement;
import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElementReference;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ArrayStructVarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.SharedVarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Specification;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationOnly;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionReturnDomain;
import de.fraunhofer.iem.m4a.IEC61131.core.types.*;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage
 * @generated
 */
public class TypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
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
	protected TypesSwitch<Adapter> modelSwitch =
		new TypesSwitch<Adapter>() {
			@Override
			public Adapter caseElementaryType(ElementaryType object) {
				return createElementaryTypeAdapter();
			}
			@Override
			public Adapter caseNumericType(NumericType object) {
				return createNumericTypeAdapter();
			}
			@Override
			public Adapter caseDateType(DateType object) {
				return createDateTypeAdapter();
			}
			@Override
			public Adapter caseBitStringType(BitStringType object) {
				return createBitStringTypeAdapter();
			}
			@Override
			public Adapter caseTimeType(TimeType object) {
				return createTimeTypeAdapter();
			}
			@Override
			public Adapter caseIntegerType(IntegerType object) {
				return createIntegerTypeAdapter();
			}
			@Override
			public Adapter caseRealType(RealType object) {
				return createRealTypeAdapter();
			}
			@Override
			public Adapter caseSignedIntegerType(SignedIntegerType object) {
				return createSignedIntegerTypeAdapter();
			}
			@Override
			public Adapter caseUnsignedIntegerType(UnsignedIntegerType object) {
				return createUnsignedIntegerTypeAdapter();
			}
			@Override
			public Adapter caseElementaryStringType(ElementaryStringType object) {
				return createElementaryStringTypeAdapter();
			}
			@Override
			public Adapter caseDataTypeDeclaration(DataTypeDeclaration object) {
				return createDataTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseSingleElementTypeDeclaration(SingleElementTypeDeclaration object) {
				return createSingleElementTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseArrayTypeDeclaration(ArrayTypeDeclaration object) {
				return createArrayTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseStructureTypeDeclaration(StructureTypeDeclaration object) {
				return createStructureTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseStringTypeDeclaration(StringTypeDeclaration object) {
				return createStringTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseSimpleTypeDeclaration(SimpleTypeDeclaration object) {
				return createSimpleTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseSubrangeTypeDeclaration(SubrangeTypeDeclaration object) {
				return createSubrangeTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseEnumeratedTypeDeclaration(EnumeratedTypeDeclaration object) {
				return createEnumeratedTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseSimpleSpecInit(SimpleSpecInit object) {
				return createSimpleSpecInitAdapter();
			}
			@Override
			public Adapter caseSimpleSpecification(SimpleSpecification object) {
				return createSimpleSpecificationAdapter();
			}
			@Override
			public Adapter caseSubrangeSpecInit(SubrangeSpecInit object) {
				return createSubrangeSpecInitAdapter();
			}
			@Override
			public Adapter caseSubrange(Subrange object) {
				return createSubrangeAdapter();
			}
			@Override
			public Adapter caseSubrangeSpecification(SubrangeSpecification object) {
				return createSubrangeSpecificationAdapter();
			}
			@Override
			public Adapter caseSubrangeTypeSpecification(SubrangeTypeSpecification object) {
				return createSubrangeTypeSpecificationAdapter();
			}
			@Override
			public Adapter caseEnumeratedSpecInit(EnumeratedSpecInit object) {
				return createEnumeratedSpecInitAdapter();
			}
			@Override
			public Adapter caseEnumeratedSpecification(EnumeratedSpecification object) {
				return createEnumeratedSpecificationAdapter();
			}
			@Override
			public Adapter caseEnumeratedValue(EnumeratedValue object) {
				return createEnumeratedValueAdapter();
			}
			@Override
			public Adapter caseEnumeratedTypeSpecification(EnumeratedTypeSpecification object) {
				return createEnumeratedTypeSpecificationAdapter();
			}
			@Override
			public Adapter caseArraySpecInit(ArraySpecInit object) {
				return createArraySpecInitAdapter();
			}
			@Override
			public Adapter caseArraySpecification(ArraySpecification object) {
				return createArraySpecificationAdapter();
			}
			@Override
			public Adapter caseArrayInit(ArrayInit object) {
				return createArrayInitAdapter();
			}
			@Override
			public Adapter caseArrayTypeSpecification(ArrayTypeSpecification object) {
				return createArrayTypeSpecificationAdapter();
			}
			@Override
			public Adapter caseArrayInitElement(ArrayInitElement object) {
				return createArrayInitElementAdapter();
			}
			@Override
			public Adapter caseStructureSpecification(StructureSpecification object) {
				return createStructureSpecificationAdapter();
			}
			@Override
			public Adapter caseStructureDeclaration(StructureDeclaration object) {
				return createStructureDeclarationAdapter();
			}
			@Override
			public Adapter caseInitializedStructure(InitializedStructure object) {
				return createInitializedStructureAdapter();
			}
			@Override
			public Adapter caseStructureElementDeclaration(StructureElementDeclaration object) {
				return createStructureElementDeclarationAdapter();
			}
			@Override
			public Adapter caseStructureInit(StructureInit object) {
				return createStructureInitAdapter();
			}
			@Override
			public Adapter caseStructureElementDomain(StructureElementDomain object) {
				return createStructureElementDomainAdapter();
			}
			@Override
			public Adapter caseStructureElementInit(StructureElementInit object) {
				return createStructureElementInitAdapter();
			}
			@Override
			public Adapter caseStructureElementValue(StructureElementValue object) {
				return createStructureElementValueAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseNonGenericType(NonGenericType object) {
				return createNonGenericTypeAdapter();
			}
			@Override
			public Adapter caseGenericType(GenericType object) {
				return createGenericTypeAdapter();
			}
			@Override
			public Adapter caseArrayTypeReference(ArrayTypeReference object) {
				return createArrayTypeReferenceAdapter();
			}
			@Override
			public Adapter caseSimpleTypeReference(SimpleTypeReference object) {
				return createSimpleTypeReferenceAdapter();
			}
			@Override
			public Adapter caseSubrangeTypeReference(SubrangeTypeReference object) {
				return createSubrangeTypeReferenceAdapter();
			}
			@Override
			public Adapter caseEnumeratedTypeReference(EnumeratedTypeReference object) {
				return createEnumeratedTypeReferenceAdapter();
			}
			@Override
			public Adapter caseStructurePointer(StructurePointer object) {
				return createStructurePointerAdapter();
			}
			@Override
			public Adapter caseEnumeratedValuePointer(EnumeratedValuePointer object) {
				return createEnumeratedValuePointerAdapter();
			}
			@Override
			public Adapter caseHardwareResourceTypeName(HardwareResourceTypeName object) {
				return createHardwareResourceTypeNameAdapter();
			}
			@Override
			public Adapter caseVarSpec(VarSpec object) {
				return createVarSpecAdapter();
			}
			@Override
			public Adapter caseExternalVarSpec(ExternalVarSpec object) {
				return createExternalVarSpecAdapter();
			}
			@Override
			public Adapter caseSharedVarSpec(SharedVarSpec object) {
				return createSharedVarSpecAdapter();
			}
			@Override
			public Adapter caseVar1Specification(Var1Specification object) {
				return createVar1SpecificationAdapter();
			}
			@Override
			public Adapter caseLibraryElementReference(LibraryElementReference object) {
				return createLibraryElementReferenceAdapter();
			}
			@Override
			public Adapter caseFunctionReturnDomain(FunctionReturnDomain object) {
				return createFunctionReturnDomainAdapter();
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
			public Adapter caseCaseListElement(CaseListElement object) {
				return createCaseListElementAdapter();
			}
			@Override
			public Adapter caseProgDataSource(ProgDataSource object) {
				return createProgDataSourceAdapter();
			}
			@Override
			public Adapter caseGlobalVarSpecInit(GlobalVarSpecInit object) {
				return createGlobalVarSpecInitAdapter();
			}
			@Override
			public Adapter caseLocatedVarSpecInit(LocatedVarSpecInit object) {
				return createLocatedVarSpecInitAdapter();
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
			public Adapter caseArrayStructVarSpec(ArrayStructVarSpec object) {
				return createArrayStructVarSpecAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryType <em>Elementary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryType
	 * @generated
	 */
	public Adapter createElementaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.NumericType
	 * @generated
	 */
	public Adapter createNumericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.DateType
	 * @generated
	 */
	public Adapter createDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.BitStringType <em>Bit String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.BitStringType
	 * @generated
	 */
	public Adapter createBitStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TimeType
	 * @generated
	 */
	public Adapter createTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.IntegerType
	 * @generated
	 */
	public Adapter createIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.RealType
	 * @generated
	 */
	public Adapter createRealTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SignedIntegerType <em>Signed Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SignedIntegerType
	 * @generated
	 */
	public Adapter createSignedIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.UnsignedIntegerType <em>Unsigned Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.UnsignedIntegerType
	 * @generated
	 */
	public Adapter createUnsignedIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryStringType <em>Elementary String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryStringType
	 * @generated
	 */
	public Adapter createElementaryStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.DataTypeDeclaration <em>Data Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.DataTypeDeclaration
	 * @generated
	 */
	public Adapter createDataTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SingleElementTypeDeclaration <em>Single Element Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SingleElementTypeDeclaration
	 * @generated
	 */
	public Adapter createSingleElementTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeDeclaration <em>Array Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeDeclaration
	 * @generated
	 */
	public Adapter createArrayTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureTypeDeclaration <em>Structure Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureTypeDeclaration
	 * @generated
	 */
	public Adapter createStructureTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration <em>String Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration
	 * @generated
	 */
	public Adapter createStringTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeDeclaration <em>Simple Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeDeclaration
	 * @generated
	 */
	public Adapter createSimpleTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeDeclaration <em>Subrange Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeDeclaration
	 * @generated
	 */
	public Adapter createSubrangeTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeDeclaration <em>Enumerated Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeDeclaration
	 * @generated
	 */
	public Adapter createEnumeratedTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecInit <em>Simple Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecInit
	 * @generated
	 */
	public Adapter createSimpleSpecInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecification <em>Simple Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecification
	 * @generated
	 */
	public Adapter createSimpleSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecInit <em>Subrange Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecInit
	 * @generated
	 */
	public Adapter createSubrangeSpecInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecification <em>Subrange Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecification
	 * @generated
	 */
	public Adapter createSubrangeSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeSpecification <em>Subrange Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeSpecification
	 * @generated
	 */
	public Adapter createSubrangeTypeSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange <em>Subrange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange
	 * @generated
	 */
	public Adapter createSubrangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecInit <em>Enumerated Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecInit
	 * @generated
	 */
	public Adapter createEnumeratedSpecInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecification <em>Enumerated Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecification
	 * @generated
	 */
	public Adapter createEnumeratedSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValue <em>Enumerated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValue
	 * @generated
	 */
	public Adapter createEnumeratedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeSpecification <em>Enumerated Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeSpecification
	 * @generated
	 */
	public Adapter createEnumeratedTypeSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecInit <em>Array Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecInit
	 * @generated
	 */
	public Adapter createArraySpecInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecification <em>Array Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecification
	 * @generated
	 */
	public Adapter createArraySpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInit <em>Array Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInit
	 * @generated
	 */
	public Adapter createArrayInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeSpecification <em>Array Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeSpecification
	 * @generated
	 */
	public Adapter createArrayTypeSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInitElement <em>Array Init Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInitElement
	 * @generated
	 */
	public Adapter createArrayInitElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureSpecification <em>Structure Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureSpecification
	 * @generated
	 */
	public Adapter createStructureSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureDeclaration <em>Structure Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureDeclaration
	 * @generated
	 */
	public Adapter createStructureDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.InitializedStructure <em>Initialized Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.InitializedStructure
	 * @generated
	 */
	public Adapter createInitializedStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDeclaration <em>Structure Element Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDeclaration
	 * @generated
	 */
	public Adapter createStructureElementDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureInit <em>Structure Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureInit
	 * @generated
	 */
	public Adapter createStructureInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDomain <em>Structure Element Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDomain
	 * @generated
	 */
	public Adapter createStructureElementDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit <em>Structure Element Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit
	 * @generated
	 */
	public Adapter createStructureElementInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementValue <em>Structure Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementValue
	 * @generated
	 */
	public Adapter createStructureElementValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.NonGenericType <em>Non Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.NonGenericType
	 * @generated
	 */
	public Adapter createNonGenericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.GenericType <em>Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.GenericType
	 * @generated
	 */
	public Adapter createGenericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeReference <em>Array Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeReference
	 * @generated
	 */
	public Adapter createArrayTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeReference <em>Simple Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeReference
	 * @generated
	 */
	public Adapter createSimpleTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeReference <em>Subrange Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeReference
	 * @generated
	 */
	public Adapter createSubrangeTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeReference <em>Enumerated Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeReference
	 * @generated
	 */
	public Adapter createEnumeratedTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructurePointer <em>Structure Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructurePointer
	 * @generated
	 */
	public Adapter createStructurePointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValuePointer <em>Enumerated Value Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValuePointer
	 * @generated
	 */
	public Adapter createEnumeratedValuePointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.HardwareResourceTypeName <em>Hardware Resource Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.HardwareResourceTypeName
	 * @generated
	 */
	public Adapter createHardwareResourceTypeNameAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.LibraryElementReference <em>Library Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.LibraryElementReference
	 * @generated
	 */
	public Adapter createLibraryElementReferenceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement <em>Case List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement
	 * @generated
	 */
	public Adapter createCaseListElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource <em>Prog Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource
	 * @generated
	 */
	public Adapter createProgDataSourceAdapter() {
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

} //TypesAdapterFactory

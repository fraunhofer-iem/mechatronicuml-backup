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
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage
 * @generated
 */
public class TypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSwitch() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
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
			case TypesPackage.ELEMENTARY_TYPE: {
				ElementaryType elementaryType = (ElementaryType)theEObject;
				T result = caseElementaryType(elementaryType);
				if (result == null) result = caseSimpleSpecification(elementaryType);
				if (result == null) result = caseNonGenericType(elementaryType);
				if (result == null) result = caseFunctionReturnDomain(elementaryType);
				if (result == null) result = caseSharedVarSpec(elementaryType);
				if (result == null) result = caseVar1Specification(elementaryType);
				if (result == null) result = caseDataType(elementaryType);
				if (result == null) result = caseVarSpec(elementaryType);
				if (result == null) result = caseExternalVarSpec(elementaryType);
				if (result == null) result = caseLibraryElementReference(elementaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.NUMERIC_TYPE: {
				NumericType numericType = (NumericType)theEObject;
				T result = caseNumericType(numericType);
				if (result == null) result = caseElementaryType(numericType);
				if (result == null) result = caseSimpleSpecification(numericType);
				if (result == null) result = caseNonGenericType(numericType);
				if (result == null) result = caseFunctionReturnDomain(numericType);
				if (result == null) result = caseSharedVarSpec(numericType);
				if (result == null) result = caseVar1Specification(numericType);
				if (result == null) result = caseDataType(numericType);
				if (result == null) result = caseVarSpec(numericType);
				if (result == null) result = caseExternalVarSpec(numericType);
				if (result == null) result = caseLibraryElementReference(numericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATE_TYPE: {
				DateType dateType = (DateType)theEObject;
				T result = caseDateType(dateType);
				if (result == null) result = caseElementaryType(dateType);
				if (result == null) result = caseSimpleSpecification(dateType);
				if (result == null) result = caseNonGenericType(dateType);
				if (result == null) result = caseFunctionReturnDomain(dateType);
				if (result == null) result = caseSharedVarSpec(dateType);
				if (result == null) result = caseVar1Specification(dateType);
				if (result == null) result = caseDataType(dateType);
				if (result == null) result = caseVarSpec(dateType);
				if (result == null) result = caseExternalVarSpec(dateType);
				if (result == null) result = caseLibraryElementReference(dateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BIT_STRING_TYPE: {
				BitStringType bitStringType = (BitStringType)theEObject;
				T result = caseBitStringType(bitStringType);
				if (result == null) result = caseElementaryType(bitStringType);
				if (result == null) result = caseSimpleSpecification(bitStringType);
				if (result == null) result = caseNonGenericType(bitStringType);
				if (result == null) result = caseFunctionReturnDomain(bitStringType);
				if (result == null) result = caseSharedVarSpec(bitStringType);
				if (result == null) result = caseVar1Specification(bitStringType);
				if (result == null) result = caseDataType(bitStringType);
				if (result == null) result = caseVarSpec(bitStringType);
				if (result == null) result = caseExternalVarSpec(bitStringType);
				if (result == null) result = caseLibraryElementReference(bitStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TIME_TYPE: {
				TimeType timeType = (TimeType)theEObject;
				T result = caseTimeType(timeType);
				if (result == null) result = caseElementaryType(timeType);
				if (result == null) result = caseSimpleSpecification(timeType);
				if (result == null) result = caseNonGenericType(timeType);
				if (result == null) result = caseFunctionReturnDomain(timeType);
				if (result == null) result = caseSharedVarSpec(timeType);
				if (result == null) result = caseVar1Specification(timeType);
				if (result == null) result = caseDataType(timeType);
				if (result == null) result = caseVarSpec(timeType);
				if (result == null) result = caseExternalVarSpec(timeType);
				if (result == null) result = caseLibraryElementReference(timeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.INTEGER_TYPE: {
				IntegerType integerType = (IntegerType)theEObject;
				T result = caseIntegerType(integerType);
				if (result == null) result = caseNumericType(integerType);
				if (result == null) result = caseElementaryType(integerType);
				if (result == null) result = caseSimpleSpecification(integerType);
				if (result == null) result = caseNonGenericType(integerType);
				if (result == null) result = caseFunctionReturnDomain(integerType);
				if (result == null) result = caseSharedVarSpec(integerType);
				if (result == null) result = caseVar1Specification(integerType);
				if (result == null) result = caseDataType(integerType);
				if (result == null) result = caseVarSpec(integerType);
				if (result == null) result = caseExternalVarSpec(integerType);
				if (result == null) result = caseLibraryElementReference(integerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.REAL_TYPE: {
				RealType realType = (RealType)theEObject;
				T result = caseRealType(realType);
				if (result == null) result = caseNumericType(realType);
				if (result == null) result = caseElementaryType(realType);
				if (result == null) result = caseSimpleSpecification(realType);
				if (result == null) result = caseNonGenericType(realType);
				if (result == null) result = caseFunctionReturnDomain(realType);
				if (result == null) result = caseSharedVarSpec(realType);
				if (result == null) result = caseVar1Specification(realType);
				if (result == null) result = caseDataType(realType);
				if (result == null) result = caseVarSpec(realType);
				if (result == null) result = caseExternalVarSpec(realType);
				if (result == null) result = caseLibraryElementReference(realType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SIGNED_INTEGER_TYPE: {
				SignedIntegerType signedIntegerType = (SignedIntegerType)theEObject;
				T result = caseSignedIntegerType(signedIntegerType);
				if (result == null) result = caseIntegerType(signedIntegerType);
				if (result == null) result = caseNumericType(signedIntegerType);
				if (result == null) result = caseElementaryType(signedIntegerType);
				if (result == null) result = caseSimpleSpecification(signedIntegerType);
				if (result == null) result = caseNonGenericType(signedIntegerType);
				if (result == null) result = caseFunctionReturnDomain(signedIntegerType);
				if (result == null) result = caseSharedVarSpec(signedIntegerType);
				if (result == null) result = caseVar1Specification(signedIntegerType);
				if (result == null) result = caseDataType(signedIntegerType);
				if (result == null) result = caseVarSpec(signedIntegerType);
				if (result == null) result = caseExternalVarSpec(signedIntegerType);
				if (result == null) result = caseLibraryElementReference(signedIntegerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UNSIGNED_INTEGER_TYPE: {
				UnsignedIntegerType unsignedIntegerType = (UnsignedIntegerType)theEObject;
				T result = caseUnsignedIntegerType(unsignedIntegerType);
				if (result == null) result = caseIntegerType(unsignedIntegerType);
				if (result == null) result = caseNumericType(unsignedIntegerType);
				if (result == null) result = caseElementaryType(unsignedIntegerType);
				if (result == null) result = caseSimpleSpecification(unsignedIntegerType);
				if (result == null) result = caseNonGenericType(unsignedIntegerType);
				if (result == null) result = caseFunctionReturnDomain(unsignedIntegerType);
				if (result == null) result = caseSharedVarSpec(unsignedIntegerType);
				if (result == null) result = caseVar1Specification(unsignedIntegerType);
				if (result == null) result = caseDataType(unsignedIntegerType);
				if (result == null) result = caseVarSpec(unsignedIntegerType);
				if (result == null) result = caseExternalVarSpec(unsignedIntegerType);
				if (result == null) result = caseLibraryElementReference(unsignedIntegerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ELEMENTARY_STRING_TYPE: {
				ElementaryStringType elementaryStringType = (ElementaryStringType)theEObject;
				T result = caseElementaryStringType(elementaryStringType);
				if (result == null) result = caseElementaryType(elementaryStringType);
				if (result == null) result = caseSimpleSpecification(elementaryStringType);
				if (result == null) result = caseNonGenericType(elementaryStringType);
				if (result == null) result = caseFunctionReturnDomain(elementaryStringType);
				if (result == null) result = caseSharedVarSpec(elementaryStringType);
				if (result == null) result = caseVar1Specification(elementaryStringType);
				if (result == null) result = caseDataType(elementaryStringType);
				if (result == null) result = caseVarSpec(elementaryStringType);
				if (result == null) result = caseExternalVarSpec(elementaryStringType);
				if (result == null) result = caseLibraryElementReference(elementaryStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_TYPE_DECLARATION: {
				DataTypeDeclaration dataTypeDeclaration = (DataTypeDeclaration)theEObject;
				T result = caseDataTypeDeclaration(dataTypeDeclaration);
				if (result == null) result = caseLibraryElement(dataTypeDeclaration);
				if (result == null) result = caseNamedElement(dataTypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SINGLE_ELEMENT_TYPE_DECLARATION: {
				SingleElementTypeDeclaration singleElementTypeDeclaration = (SingleElementTypeDeclaration)theEObject;
				T result = caseSingleElementTypeDeclaration(singleElementTypeDeclaration);
				if (result == null) result = caseDataTypeDeclaration(singleElementTypeDeclaration);
				if (result == null) result = caseLibraryElement(singleElementTypeDeclaration);
				if (result == null) result = caseNamedElement(singleElementTypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ARRAY_TYPE_DECLARATION: {
				ArrayTypeDeclaration arrayTypeDeclaration = (ArrayTypeDeclaration)theEObject;
				T result = caseArrayTypeDeclaration(arrayTypeDeclaration);
				if (result == null) result = caseDataTypeDeclaration(arrayTypeDeclaration);
				if (result == null) result = caseLibraryElement(arrayTypeDeclaration);
				if (result == null) result = caseNamedElement(arrayTypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCTURE_TYPE_DECLARATION: {
				StructureTypeDeclaration structureTypeDeclaration = (StructureTypeDeclaration)theEObject;
				T result = caseStructureTypeDeclaration(structureTypeDeclaration);
				if (result == null) result = caseDataTypeDeclaration(structureTypeDeclaration);
				if (result == null) result = caseVarSpec(structureTypeDeclaration);
				if (result == null) result = caseLibraryElement(structureTypeDeclaration);
				if (result == null) result = caseNamedElement(structureTypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRING_TYPE_DECLARATION: {
				StringTypeDeclaration stringTypeDeclaration = (StringTypeDeclaration)theEObject;
				T result = caseStringTypeDeclaration(stringTypeDeclaration);
				if (result == null) result = caseDataTypeDeclaration(stringTypeDeclaration);
				if (result == null) result = caseLibraryElement(stringTypeDeclaration);
				if (result == null) result = caseNamedElement(stringTypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SIMPLE_TYPE_DECLARATION: {
				SimpleTypeDeclaration simpleTypeDeclaration = (SimpleTypeDeclaration)theEObject;
				T result = caseSimpleTypeDeclaration(simpleTypeDeclaration);
				if (result == null) result = caseSingleElementTypeDeclaration(simpleTypeDeclaration);
				if (result == null) result = caseDataTypeDeclaration(simpleTypeDeclaration);
				if (result == null) result = caseLibraryElement(simpleTypeDeclaration);
				if (result == null) result = caseNamedElement(simpleTypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SUBRANGE_TYPE_DECLARATION: {
				SubrangeTypeDeclaration subrangeTypeDeclaration = (SubrangeTypeDeclaration)theEObject;
				T result = caseSubrangeTypeDeclaration(subrangeTypeDeclaration);
				if (result == null) result = caseSingleElementTypeDeclaration(subrangeTypeDeclaration);
				if (result == null) result = caseDataTypeDeclaration(subrangeTypeDeclaration);
				if (result == null) result = caseLibraryElement(subrangeTypeDeclaration);
				if (result == null) result = caseNamedElement(subrangeTypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENUMERATED_TYPE_DECLARATION: {
				EnumeratedTypeDeclaration enumeratedTypeDeclaration = (EnumeratedTypeDeclaration)theEObject;
				T result = caseEnumeratedTypeDeclaration(enumeratedTypeDeclaration);
				if (result == null) result = caseSingleElementTypeDeclaration(enumeratedTypeDeclaration);
				if (result == null) result = caseDataTypeDeclaration(enumeratedTypeDeclaration);
				if (result == null) result = caseLibraryElement(enumeratedTypeDeclaration);
				if (result == null) result = caseNamedElement(enumeratedTypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SIMPLE_SPEC_INIT: {
				SimpleSpecInit simpleSpecInit = (SimpleSpecInit)theEObject;
				T result = caseSimpleSpecInit(simpleSpecInit);
				if (result == null) result = caseStructureElementDomain(simpleSpecInit);
				if (result == null) result = caseInstanceSpecificSpecInit(simpleSpecInit);
				if (result == null) result = caseVar1SpecInit(simpleSpecInit);
				if (result == null) result = caseVar2SpecInit(simpleSpecInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SIMPLE_SPECIFICATION: {
				SimpleSpecification simpleSpecification = (SimpleSpecification)theEObject;
				T result = caseSimpleSpecification(simpleSpecification);
				if (result == null) result = caseSharedVarSpec(simpleSpecification);
				if (result == null) result = caseVar1Specification(simpleSpecification);
				if (result == null) result = caseVarSpec(simpleSpecification);
				if (result == null) result = caseExternalVarSpec(simpleSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SUBRANGE_SPEC_INIT: {
				SubrangeSpecInit subrangeSpecInit = (SubrangeSpecInit)theEObject;
				T result = caseSubrangeSpecInit(subrangeSpecInit);
				if (result == null) result = caseStructureElementDomain(subrangeSpecInit);
				if (result == null) result = caseInstanceSpecificSpecInit(subrangeSpecInit);
				if (result == null) result = caseVar1SpecInit(subrangeSpecInit);
				if (result == null) result = caseVar2SpecInit(subrangeSpecInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SUBRANGE: {
				Subrange subrange = (Subrange)theEObject;
				T result = caseSubrange(subrange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SUBRANGE_SPECIFICATION: {
				SubrangeSpecification subrangeSpecification = (SubrangeSpecification)theEObject;
				T result = caseSubrangeSpecification(subrangeSpecification);
				if (result == null) result = caseSharedVarSpec(subrangeSpecification);
				if (result == null) result = caseVar1Specification(subrangeSpecification);
				if (result == null) result = caseVarSpec(subrangeSpecification);
				if (result == null) result = caseExternalVarSpec(subrangeSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SUBRANGE_TYPE_SPECIFICATION: {
				SubrangeTypeSpecification subrangeTypeSpecification = (SubrangeTypeSpecification)theEObject;
				T result = caseSubrangeTypeSpecification(subrangeTypeSpecification);
				if (result == null) result = caseSubrangeSpecification(subrangeTypeSpecification);
				if (result == null) result = caseCaseListElement(subrangeTypeSpecification);
				if (result == null) result = caseSharedVarSpec(subrangeTypeSpecification);
				if (result == null) result = caseVar1Specification(subrangeTypeSpecification);
				if (result == null) result = caseVarSpec(subrangeTypeSpecification);
				if (result == null) result = caseExternalVarSpec(subrangeTypeSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENUMERATED_SPEC_INIT: {
				EnumeratedSpecInit enumeratedSpecInit = (EnumeratedSpecInit)theEObject;
				T result = caseEnumeratedSpecInit(enumeratedSpecInit);
				if (result == null) result = caseStructureElementDomain(enumeratedSpecInit);
				if (result == null) result = caseInstanceSpecificSpecInit(enumeratedSpecInit);
				if (result == null) result = caseVar1SpecInit(enumeratedSpecInit);
				if (result == null) result = caseVar2SpecInit(enumeratedSpecInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENUMERATED_SPECIFICATION: {
				EnumeratedSpecification enumeratedSpecification = (EnumeratedSpecification)theEObject;
				T result = caseEnumeratedSpecification(enumeratedSpecification);
				if (result == null) result = caseSharedVarSpec(enumeratedSpecification);
				if (result == null) result = caseVar1Specification(enumeratedSpecification);
				if (result == null) result = caseVarSpec(enumeratedSpecification);
				if (result == null) result = caseExternalVarSpec(enumeratedSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENUMERATED_VALUE: {
				EnumeratedValue enumeratedValue = (EnumeratedValue)theEObject;
				T result = caseEnumeratedValue(enumeratedValue);
				if (result == null) result = caseNamedElement(enumeratedValue);
				if (result == null) result = caseStructureElementValue(enumeratedValue);
				if (result == null) result = caseProgDataSource(enumeratedValue);
				if (result == null) result = caseCaseListElement(enumeratedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENUMERATED_TYPE_SPECIFICATION: {
				EnumeratedTypeSpecification enumeratedTypeSpecification = (EnumeratedTypeSpecification)theEObject;
				T result = caseEnumeratedTypeSpecification(enumeratedTypeSpecification);
				if (result == null) result = caseEnumeratedSpecification(enumeratedTypeSpecification);
				if (result == null) result = caseSharedVarSpec(enumeratedTypeSpecification);
				if (result == null) result = caseVar1Specification(enumeratedTypeSpecification);
				if (result == null) result = caseVarSpec(enumeratedTypeSpecification);
				if (result == null) result = caseExternalVarSpec(enumeratedTypeSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ARRAY_SPEC_INIT: {
				ArraySpecInit arraySpecInit = (ArraySpecInit)theEObject;
				T result = caseArraySpecInit(arraySpecInit);
				if (result == null) result = caseStructureElementDomain(arraySpecInit);
				if (result == null) result = caseInstanceSpecificSpecInit(arraySpecInit);
				if (result == null) result = caseVar2SpecInit(arraySpecInit);
				if (result == null) result = caseLocatedVarSpecInit(arraySpecInit);
				if (result == null) result = caseGlobalVarSpecInit(arraySpecInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ARRAY_SPECIFICATION: {
				ArraySpecification arraySpecification = (ArraySpecification)theEObject;
				T result = caseArraySpecification(arraySpecification);
				if (result == null) result = caseArrayStructVarSpec(arraySpecification);
				if (result == null) result = caseSharedVarSpec(arraySpecification);
				if (result == null) result = caseTempVarDeclaration(arraySpecification);
				if (result == null) result = caseVarSpec(arraySpecification);
				if (result == null) result = caseExternalVarSpec(arraySpecification);
				if (result == null) result = caseVarDeclarationOnly(arraySpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ARRAY_INIT: {
				ArrayInit arrayInit = (ArrayInit)theEObject;
				T result = caseArrayInit(arrayInit);
				if (result == null) result = caseArrayInitElement(arrayInit);
				if (result == null) result = caseStructureElementValue(arrayInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ARRAY_TYPE_SPECIFICATION: {
				ArrayTypeSpecification arrayTypeSpecification = (ArrayTypeSpecification)theEObject;
				T result = caseArrayTypeSpecification(arrayTypeSpecification);
				if (result == null) result = caseArraySpecification(arrayTypeSpecification);
				if (result == null) result = caseArrayStructVarSpec(arrayTypeSpecification);
				if (result == null) result = caseSharedVarSpec(arrayTypeSpecification);
				if (result == null) result = caseTempVarDeclaration(arrayTypeSpecification);
				if (result == null) result = caseVarSpec(arrayTypeSpecification);
				if (result == null) result = caseExternalVarSpec(arrayTypeSpecification);
				if (result == null) result = caseVarDeclarationOnly(arrayTypeSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ARRAY_INIT_ELEMENT: {
				ArrayInitElement arrayInitElement = (ArrayInitElement)theEObject;
				T result = caseArrayInitElement(arrayInitElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCTURE_SPECIFICATION: {
				StructureSpecification structureSpecification = (StructureSpecification)theEObject;
				T result = caseStructureSpecification(structureSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCTURE_DECLARATION: {
				StructureDeclaration structureDeclaration = (StructureDeclaration)theEObject;
				T result = caseStructureDeclaration(structureDeclaration);
				if (result == null) result = caseStructureSpecification(structureDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.INITIALIZED_STRUCTURE: {
				InitializedStructure initializedStructure = (InitializedStructure)theEObject;
				T result = caseInitializedStructure(initializedStructure);
				if (result == null) result = caseStructureSpecification(initializedStructure);
				if (result == null) result = caseStructureElementDomain(initializedStructure);
				if (result == null) result = caseInstanceSpecificSpecInit(initializedStructure);
				if (result == null) result = caseVar2SpecInit(initializedStructure);
				if (result == null) result = caseLocatedVarSpecInit(initializedStructure);
				if (result == null) result = caseGlobalVarSpecInit(initializedStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCTURE_ELEMENT_DECLARATION: {
				StructureElementDeclaration structureElementDeclaration = (StructureElementDeclaration)theEObject;
				T result = caseStructureElementDeclaration(structureElementDeclaration);
				if (result == null) result = caseNamedElement(structureElementDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCTURE_INIT: {
				StructureInit structureInit = (StructureInit)theEObject;
				T result = caseStructureInit(structureInit);
				if (result == null) result = caseStructureElementValue(structureInit);
				if (result == null) result = caseArrayInitElement(structureInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCTURE_ELEMENT_DOMAIN: {
				StructureElementDomain structureElementDomain = (StructureElementDomain)theEObject;
				T result = caseStructureElementDomain(structureElementDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCTURE_ELEMENT_INIT: {
				StructureElementInit structureElementInit = (StructureElementInit)theEObject;
				T result = caseStructureElementInit(structureElementInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCTURE_ELEMENT_VALUE: {
				StructureElementValue structureElementValue = (StructureElementValue)theEObject;
				T result = caseStructureElementValue(structureElementValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseLibraryElementReference(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.NON_GENERIC_TYPE: {
				NonGenericType nonGenericType = (NonGenericType)theEObject;
				T result = caseNonGenericType(nonGenericType);
				if (result == null) result = caseDataType(nonGenericType);
				if (result == null) result = caseLibraryElementReference(nonGenericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.GENERIC_TYPE: {
				GenericType genericType = (GenericType)theEObject;
				T result = caseGenericType(genericType);
				if (result == null) result = caseDataType(genericType);
				if (result == null) result = caseLibraryElementReference(genericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ARRAY_TYPE_REFERENCE: {
				ArrayTypeReference arrayTypeReference = (ArrayTypeReference)theEObject;
				T result = caseArrayTypeReference(arrayTypeReference);
				if (result == null) result = caseArraySpecification(arrayTypeReference);
				if (result == null) result = caseArrayStructVarSpec(arrayTypeReference);
				if (result == null) result = caseSharedVarSpec(arrayTypeReference);
				if (result == null) result = caseTempVarDeclaration(arrayTypeReference);
				if (result == null) result = caseVarSpec(arrayTypeReference);
				if (result == null) result = caseExternalVarSpec(arrayTypeReference);
				if (result == null) result = caseVarDeclarationOnly(arrayTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SIMPLE_TYPE_REFERENCE: {
				SimpleTypeReference simpleTypeReference = (SimpleTypeReference)theEObject;
				T result = caseSimpleTypeReference(simpleTypeReference);
				if (result == null) result = caseSimpleSpecification(simpleTypeReference);
				if (result == null) result = caseSharedVarSpec(simpleTypeReference);
				if (result == null) result = caseVar1Specification(simpleTypeReference);
				if (result == null) result = caseVarSpec(simpleTypeReference);
				if (result == null) result = caseExternalVarSpec(simpleTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SUBRANGE_TYPE_REFERENCE: {
				SubrangeTypeReference subrangeTypeReference = (SubrangeTypeReference)theEObject;
				T result = caseSubrangeTypeReference(subrangeTypeReference);
				if (result == null) result = caseSubrangeSpecification(subrangeTypeReference);
				if (result == null) result = caseSharedVarSpec(subrangeTypeReference);
				if (result == null) result = caseVar1Specification(subrangeTypeReference);
				if (result == null) result = caseVarSpec(subrangeTypeReference);
				if (result == null) result = caseExternalVarSpec(subrangeTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENUMERATED_TYPE_REFERENCE: {
				EnumeratedTypeReference enumeratedTypeReference = (EnumeratedTypeReference)theEObject;
				T result = caseEnumeratedTypeReference(enumeratedTypeReference);
				if (result == null) result = caseEnumeratedSpecification(enumeratedTypeReference);
				if (result == null) result = caseSharedVarSpec(enumeratedTypeReference);
				if (result == null) result = caseVar1Specification(enumeratedTypeReference);
				if (result == null) result = caseVarSpec(enumeratedTypeReference);
				if (result == null) result = caseExternalVarSpec(enumeratedTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCTURE_POINTER: {
				StructurePointer structurePointer = (StructurePointer)theEObject;
				T result = caseStructurePointer(structurePointer);
				if (result == null) result = caseSharedVarSpec(structurePointer);
				if (result == null) result = caseArrayStructVarSpec(structurePointer);
				if (result == null) result = caseVarSpec(structurePointer);
				if (result == null) result = caseExternalVarSpec(structurePointer);
				if (result == null) result = caseTempVarDeclaration(structurePointer);
				if (result == null) result = caseVarDeclarationOnly(structurePointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENUMERATED_VALUE_POINTER: {
				EnumeratedValuePointer enumeratedValuePointer = (EnumeratedValuePointer)theEObject;
				T result = caseEnumeratedValuePointer(enumeratedValuePointer);
				if (result == null) result = caseArrayInitElement(enumeratedValuePointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.HARDWARE_RESOURCE_TYPE_NAME: {
				HardwareResourceTypeName hardwareResourceTypeName = (HardwareResourceTypeName)theEObject;
				T result = caseHardwareResourceTypeName(hardwareResourceTypeName);
				if (result == null) result = caseLibraryElementReference(hardwareResourceTypeName);
				if (result == null) result = caseNamedElement(hardwareResourceTypeName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementaryType(ElementaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericType(NumericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateType(DateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitStringType(BitStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeType(TimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerType(IntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealType(RealType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signed Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signed Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignedIntegerType(SignedIntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedIntegerType(UnsignedIntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementary String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementary String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementaryStringType(ElementaryStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeDeclaration(DataTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Element Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Element Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleElementTypeDeclaration(SingleElementTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayTypeDeclaration(ArrayTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureTypeDeclaration(StructureTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringTypeDeclaration(StringTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTypeDeclaration(SimpleTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrange Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrange Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrangeTypeDeclaration(SubrangeTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedTypeDeclaration(EnumeratedTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Spec Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSpecInit(SimpleSpecInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSpecification(SimpleSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrange Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrange Spec Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrangeSpecInit(SubrangeSpecInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrange Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrange Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrangeSpecification(SubrangeSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrange Type Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrange Type Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrangeTypeSpecification(SubrangeTypeSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrange(Subrange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Spec Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedSpecInit(EnumeratedSpecInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedSpecification(EnumeratedSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedValue(EnumeratedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Type Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Type Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedTypeSpecification(EnumeratedTypeSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Spec Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArraySpecInit(ArraySpecInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArraySpecification(ArraySpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInit(ArrayInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayTypeSpecification(ArrayTypeSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Init Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Init Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInitElement(ArrayInitElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureSpecification(StructureSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDeclaration(StructureDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initialized Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initialized Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializedStructure(InitializedStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Element Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Element Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureElementDeclaration(StructureElementDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureInit(StructureInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Element Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Element Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureElementDomain(StructureElementDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Element Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Element Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureElementInit(StructureElementInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Element Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureElementValue(StructureElementValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Generic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Generic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonGenericType(NonGenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericType(GenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayTypeReference(ArrayTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTypeReference(SimpleTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrange Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrange Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrangeTypeReference(SubrangeTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedTypeReference(EnumeratedTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructurePointer(StructurePointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Value Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Value Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedValuePointer(EnumeratedValuePointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Resource Type Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Resource Type Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareResourceTypeName(HardwareResourceTypeName object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Library Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryElementReference(LibraryElementReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Library Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryElement(LibraryElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Return Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Return Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionReturnDomain(FunctionReturnDomain object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Case List Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case List Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseListElement(CaseListElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prog Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prog Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgDataSource(ProgDataSource object) {
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

} //TypesSwitch

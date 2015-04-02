/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.literals.util;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.BinaryInteger;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.BitStringLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.CharacterLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.CharacterString;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.CommentableElement;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.Constant;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.Date;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.DateAndTime;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.DoubleByteCharacterString;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.Duration;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.HexInteger;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.IntegerLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.Literal;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.NumericLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.OctalInteger;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.RealLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.SignedInteger;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.SingleByteCharacterString;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.TimeLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.TimeOfDay;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.UnsignedInteger;

import de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInitElement;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementValue;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpressionValue;

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
 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage
 * @generated
 */
public class LiteralsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LiteralsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralsSwitch() {
		if (modelPackage == null) {
			modelPackage = LiteralsPackage.eINSTANCE;
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
			case LiteralsPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseLiteral(constant);
				if (result == null) result = caseArrayInitElement(constant);
				if (result == null) result = caseStructureElementValue(constant);
				if (result == null) result = caseDataSource(constant);
				if (result == null) result = caseProgDataSource(constant);
				if (result == null) result = casePrimaryExpressionValue(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.NUMERIC_LITERAL: {
				NumericLiteral numericLiteral = (NumericLiteral)theEObject;
				T result = caseNumericLiteral(numericLiteral);
				if (result == null) result = caseConstant(numericLiteral);
				if (result == null) result = caseLiteral(numericLiteral);
				if (result == null) result = caseArrayInitElement(numericLiteral);
				if (result == null) result = caseStructureElementValue(numericLiteral);
				if (result == null) result = caseDataSource(numericLiteral);
				if (result == null) result = caseProgDataSource(numericLiteral);
				if (result == null) result = casePrimaryExpressionValue(numericLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.CHARACTER_LITERAL: {
				CharacterLiteral characterLiteral = (CharacterLiteral)theEObject;
				T result = caseCharacterLiteral(characterLiteral);
				if (result == null) result = caseConstant(characterLiteral);
				if (result == null) result = caseLiteral(characterLiteral);
				if (result == null) result = caseArrayInitElement(characterLiteral);
				if (result == null) result = caseStructureElementValue(characterLiteral);
				if (result == null) result = caseDataSource(characterLiteral);
				if (result == null) result = caseProgDataSource(characterLiteral);
				if (result == null) result = casePrimaryExpressionValue(characterLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.BIT_STRING_LITERAL: {
				BitStringLiteral bitStringLiteral = (BitStringLiteral)theEObject;
				T result = caseBitStringLiteral(bitStringLiteral);
				if (result == null) result = caseConstant(bitStringLiteral);
				if (result == null) result = caseLiteral(bitStringLiteral);
				if (result == null) result = caseArrayInitElement(bitStringLiteral);
				if (result == null) result = caseStructureElementValue(bitStringLiteral);
				if (result == null) result = caseDataSource(bitStringLiteral);
				if (result == null) result = caseProgDataSource(bitStringLiteral);
				if (result == null) result = casePrimaryExpressionValue(bitStringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.BOOLEAN: {
				de.fraunhofer.iem.m4a.IEC61131.core.literals.Boolean boolean_ = (de.fraunhofer.iem.m4a.IEC61131.core.literals.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseConstant(boolean_);
				if (result == null) result = caseLiteral(boolean_);
				if (result == null) result = caseArrayInitElement(boolean_);
				if (result == null) result = caseStructureElementValue(boolean_);
				if (result == null) result = caseDataSource(boolean_);
				if (result == null) result = caseProgDataSource(boolean_);
				if (result == null) result = casePrimaryExpressionValue(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.INTEGER_LITERAL: {
				IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
				T result = caseIntegerLiteral(integerLiteral);
				if (result == null) result = caseNumericLiteral(integerLiteral);
				if (result == null) result = caseConstant(integerLiteral);
				if (result == null) result = caseLiteral(integerLiteral);
				if (result == null) result = caseArrayInitElement(integerLiteral);
				if (result == null) result = caseStructureElementValue(integerLiteral);
				if (result == null) result = caseDataSource(integerLiteral);
				if (result == null) result = caseProgDataSource(integerLiteral);
				if (result == null) result = casePrimaryExpressionValue(integerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.REAL_LITERAL: {
				RealLiteral realLiteral = (RealLiteral)theEObject;
				T result = caseRealLiteral(realLiteral);
				if (result == null) result = caseNumericLiteral(realLiteral);
				if (result == null) result = caseConstant(realLiteral);
				if (result == null) result = caseLiteral(realLiteral);
				if (result == null) result = caseArrayInitElement(realLiteral);
				if (result == null) result = caseStructureElementValue(realLiteral);
				if (result == null) result = caseDataSource(realLiteral);
				if (result == null) result = caseProgDataSource(realLiteral);
				if (result == null) result = casePrimaryExpressionValue(realLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.SIGNED_INTEGER: {
				SignedInteger signedInteger = (SignedInteger)theEObject;
				T result = caseSignedInteger(signedInteger);
				if (result == null) result = caseCaseListElement(signedInteger);
				if (result == null) result = caseIntegerLiteral(signedInteger);
				if (result == null) result = caseNumericLiteral(signedInteger);
				if (result == null) result = caseConstant(signedInteger);
				if (result == null) result = caseLiteral(signedInteger);
				if (result == null) result = caseArrayInitElement(signedInteger);
				if (result == null) result = caseStructureElementValue(signedInteger);
				if (result == null) result = caseDataSource(signedInteger);
				if (result == null) result = caseProgDataSource(signedInteger);
				if (result == null) result = casePrimaryExpressionValue(signedInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.BINARY_INTEGER: {
				BinaryInteger binaryInteger = (BinaryInteger)theEObject;
				T result = caseBinaryInteger(binaryInteger);
				if (result == null) result = caseIntegerLiteral(binaryInteger);
				if (result == null) result = caseNumericLiteral(binaryInteger);
				if (result == null) result = caseConstant(binaryInteger);
				if (result == null) result = caseLiteral(binaryInteger);
				if (result == null) result = caseArrayInitElement(binaryInteger);
				if (result == null) result = caseStructureElementValue(binaryInteger);
				if (result == null) result = caseDataSource(binaryInteger);
				if (result == null) result = caseProgDataSource(binaryInteger);
				if (result == null) result = casePrimaryExpressionValue(binaryInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.OCTAL_INTEGER: {
				OctalInteger octalInteger = (OctalInteger)theEObject;
				T result = caseOctalInteger(octalInteger);
				if (result == null) result = caseIntegerLiteral(octalInteger);
				if (result == null) result = caseNumericLiteral(octalInteger);
				if (result == null) result = caseConstant(octalInteger);
				if (result == null) result = caseLiteral(octalInteger);
				if (result == null) result = caseArrayInitElement(octalInteger);
				if (result == null) result = caseStructureElementValue(octalInteger);
				if (result == null) result = caseDataSource(octalInteger);
				if (result == null) result = caseProgDataSource(octalInteger);
				if (result == null) result = casePrimaryExpressionValue(octalInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.HEX_INTEGER: {
				HexInteger hexInteger = (HexInteger)theEObject;
				T result = caseHexInteger(hexInteger);
				if (result == null) result = caseIntegerLiteral(hexInteger);
				if (result == null) result = caseNumericLiteral(hexInteger);
				if (result == null) result = caseConstant(hexInteger);
				if (result == null) result = caseLiteral(hexInteger);
				if (result == null) result = caseArrayInitElement(hexInteger);
				if (result == null) result = caseStructureElementValue(hexInteger);
				if (result == null) result = caseDataSource(hexInteger);
				if (result == null) result = caseProgDataSource(hexInteger);
				if (result == null) result = casePrimaryExpressionValue(hexInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.UNSIGNED_INTEGER: {
				UnsignedInteger unsignedInteger = (UnsignedInteger)theEObject;
				T result = caseUnsignedInteger(unsignedInteger);
				if (result == null) result = caseIntegerLiteral(unsignedInteger);
				if (result == null) result = caseNumericLiteral(unsignedInteger);
				if (result == null) result = caseConstant(unsignedInteger);
				if (result == null) result = caseLiteral(unsignedInteger);
				if (result == null) result = caseArrayInitElement(unsignedInteger);
				if (result == null) result = caseStructureElementValue(unsignedInteger);
				if (result == null) result = caseDataSource(unsignedInteger);
				if (result == null) result = caseProgDataSource(unsignedInteger);
				if (result == null) result = casePrimaryExpressionValue(unsignedInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.CHARACTER_STRING: {
				CharacterString characterString = (CharacterString)theEObject;
				T result = caseCharacterString(characterString);
				if (result == null) result = caseLiteral(characterString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.SINGLE_BYTE_CHARACTER_STRING: {
				SingleByteCharacterString singleByteCharacterString = (SingleByteCharacterString)theEObject;
				T result = caseSingleByteCharacterString(singleByteCharacterString);
				if (result == null) result = caseCharacterString(singleByteCharacterString);
				if (result == null) result = caseLiteral(singleByteCharacterString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.DOUBLE_BYTE_CHARACTER_STRING: {
				DoubleByteCharacterString doubleByteCharacterString = (DoubleByteCharacterString)theEObject;
				T result = caseDoubleByteCharacterString(doubleByteCharacterString);
				if (result == null) result = caseCharacterString(doubleByteCharacterString);
				if (result == null) result = caseLiteral(doubleByteCharacterString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.TIME_LITERAL: {
				TimeLiteral timeLiteral = (TimeLiteral)theEObject;
				T result = caseTimeLiteral(timeLiteral);
				if (result == null) result = caseConstant(timeLiteral);
				if (result == null) result = caseLiteral(timeLiteral);
				if (result == null) result = caseArrayInitElement(timeLiteral);
				if (result == null) result = caseStructureElementValue(timeLiteral);
				if (result == null) result = caseDataSource(timeLiteral);
				if (result == null) result = caseProgDataSource(timeLiteral);
				if (result == null) result = casePrimaryExpressionValue(timeLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.DURATION: {
				Duration duration = (Duration)theEObject;
				T result = caseDuration(duration);
				if (result == null) result = caseTimeLiteral(duration);
				if (result == null) result = caseConstant(duration);
				if (result == null) result = caseLiteral(duration);
				if (result == null) result = caseArrayInitElement(duration);
				if (result == null) result = caseStructureElementValue(duration);
				if (result == null) result = caseDataSource(duration);
				if (result == null) result = caseProgDataSource(duration);
				if (result == null) result = casePrimaryExpressionValue(duration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.TIME_OF_DAY: {
				TimeOfDay timeOfDay = (TimeOfDay)theEObject;
				T result = caseTimeOfDay(timeOfDay);
				if (result == null) result = caseTimeLiteral(timeOfDay);
				if (result == null) result = caseConstant(timeOfDay);
				if (result == null) result = caseLiteral(timeOfDay);
				if (result == null) result = caseArrayInitElement(timeOfDay);
				if (result == null) result = caseStructureElementValue(timeOfDay);
				if (result == null) result = caseDataSource(timeOfDay);
				if (result == null) result = caseProgDataSource(timeOfDay);
				if (result == null) result = casePrimaryExpressionValue(timeOfDay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = caseTimeLiteral(date);
				if (result == null) result = caseConstant(date);
				if (result == null) result = caseLiteral(date);
				if (result == null) result = caseArrayInitElement(date);
				if (result == null) result = caseStructureElementValue(date);
				if (result == null) result = caseDataSource(date);
				if (result == null) result = caseProgDataSource(date);
				if (result == null) result = casePrimaryExpressionValue(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.DATE_AND_TIME: {
				DateAndTime dateAndTime = (DateAndTime)theEObject;
				T result = caseDateAndTime(dateAndTime);
				if (result == null) result = caseTimeLiteral(dateAndTime);
				if (result == null) result = caseConstant(dateAndTime);
				if (result == null) result = caseLiteral(dateAndTime);
				if (result == null) result = caseArrayInitElement(dateAndTime);
				if (result == null) result = caseStructureElementValue(dateAndTime);
				if (result == null) result = caseDataSource(dateAndTime);
				if (result == null) result = caseProgDataSource(dateAndTime);
				if (result == null) result = casePrimaryExpressionValue(dateAndTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiteralsPackage.COMMENTABLE_ELEMENT: {
				CommentableElement commentableElement = (CommentableElement)theEObject;
				T result = caseCommentableElement(commentableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericLiteral(NumericLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterLiteral(CharacterLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitStringLiteral(BitStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(de.fraunhofer.iem.m4a.IEC61131.core.literals.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteral(IntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealLiteral(RealLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signed Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signed Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignedInteger(SignedInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryInteger(BinaryInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Octal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Octal Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOctalInteger(OctalInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hex Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hex Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHexInteger(HexInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedInteger(UnsignedInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterString(CharacterString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Byte Character String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Byte Character String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleByteCharacterString(SingleByteCharacterString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Byte Character String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Byte Character String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleByteCharacterString(DoubleByteCharacterString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeLiteral(TimeLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuration(Duration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Of Day</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Of Day</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeOfDay(TimeOfDay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date And Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date And Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateAndTime(DateAndTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentableElement(CommentableElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Primary Expression Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Expression Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryExpressionValue(PrimaryExpressionValue object) {
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

} //LiteralsSwitch

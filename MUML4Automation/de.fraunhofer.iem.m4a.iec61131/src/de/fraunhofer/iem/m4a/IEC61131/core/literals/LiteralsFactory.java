/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.literals;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage
 * @generated
 */
public interface LiteralsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LiteralsFactory eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns a new object of class '<em>Numeric Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Literal</em>'.
	 * @generated
	 */
	NumericLiteral createNumericLiteral();

	/**
	 * Returns a new object of class '<em>Character Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Literal</em>'.
	 * @generated
	 */
	CharacterLiteral createCharacterLiteral();

	/**
	 * Returns a new object of class '<em>Bit String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit String Literal</em>'.
	 * @generated
	 */
	BitStringLiteral createBitStringLiteral();

	/**
	 * Returns a new object of class '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal</em>'.
	 * @generated
	 */
	Literal createLiteral();

	/**
	 * Returns a new object of class '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean</em>'.
	 * @generated
	 */
	Boolean createBoolean();

	/**
	 * Returns a new object of class '<em>Real Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Literal</em>'.
	 * @generated
	 */
	RealLiteral createRealLiteral();

	/**
	 * Returns a new object of class '<em>Signed Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signed Integer</em>'.
	 * @generated
	 */
	SignedInteger createSignedInteger();

	/**
	 * Returns a new object of class '<em>Binary Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Integer</em>'.
	 * @generated
	 */
	BinaryInteger createBinaryInteger();

	/**
	 * Returns a new object of class '<em>Octal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Octal Integer</em>'.
	 * @generated
	 */
	OctalInteger createOctalInteger();

	/**
	 * Returns a new object of class '<em>Hex Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hex Integer</em>'.
	 * @generated
	 */
	HexInteger createHexInteger();

	/**
	 * Returns a new object of class '<em>Unsigned Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsigned Integer</em>'.
	 * @generated
	 */
	UnsignedInteger createUnsignedInteger();

	/**
	 * Returns a new object of class '<em>Character String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character String</em>'.
	 * @generated
	 */
	CharacterString createCharacterString();

	/**
	 * Returns a new object of class '<em>Single Byte Character String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Byte Character String</em>'.
	 * @generated
	 */
	SingleByteCharacterString createSingleByteCharacterString();

	/**
	 * Returns a new object of class '<em>Double Byte Character String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Byte Character String</em>'.
	 * @generated
	 */
	DoubleByteCharacterString createDoubleByteCharacterString();

	/**
	 * Returns a new object of class '<em>Time Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Literal</em>'.
	 * @generated
	 */
	TimeLiteral createTimeLiteral();

	/**
	 * Returns a new object of class '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duration</em>'.
	 * @generated
	 */
	Duration createDuration();

	/**
	 * Returns a new object of class '<em>Time Of Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Of Day</em>'.
	 * @generated
	 */
	TimeOfDay createTimeOfDay();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Date And Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date And Time</em>'.
	 * @generated
	 */
	DateAndTime createDateAndTime();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LiteralsPackage getLiteralsPackage();

} //LiteralsFactory

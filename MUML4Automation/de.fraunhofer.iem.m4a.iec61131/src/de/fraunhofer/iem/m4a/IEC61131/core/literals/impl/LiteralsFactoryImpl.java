/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.literals.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.BinaryInteger;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.BitStringLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.CharacterLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.CharacterString;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.Constant;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.Date;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.DateAndTime;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.DoubleByteCharacterString;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.Duration;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.HexInteger;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.Literal;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.NumericLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.OctalInteger;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.RealLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.SignedInteger;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.SingleByteCharacterString;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.TimeLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.TimeOfDay;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.UnsignedInteger;

import org.eclipse.emf.ecore.EClass;
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
public class LiteralsFactoryImpl extends EFactoryImpl implements LiteralsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LiteralsFactory init() {
		try {
			LiteralsFactory theLiteralsFactory = (LiteralsFactory)EPackage.Registry.INSTANCE.getEFactory(LiteralsPackage.eNS_URI);
			if (theLiteralsFactory != null) {
				return theLiteralsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LiteralsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralsFactoryImpl() {
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
			case LiteralsPackage.CONSTANT: return createConstant();
			case LiteralsPackage.NUMERIC_LITERAL: return createNumericLiteral();
			case LiteralsPackage.CHARACTER_LITERAL: return createCharacterLiteral();
			case LiteralsPackage.BIT_STRING_LITERAL: return createBitStringLiteral();
			case LiteralsPackage.LITERAL: return createLiteral();
			case LiteralsPackage.BOOLEAN: return createBoolean();
			case LiteralsPackage.REAL_LITERAL: return createRealLiteral();
			case LiteralsPackage.SIGNED_INTEGER: return createSignedInteger();
			case LiteralsPackage.BINARY_INTEGER: return createBinaryInteger();
			case LiteralsPackage.OCTAL_INTEGER: return createOctalInteger();
			case LiteralsPackage.HEX_INTEGER: return createHexInteger();
			case LiteralsPackage.UNSIGNED_INTEGER: return createUnsignedInteger();
			case LiteralsPackage.CHARACTER_STRING: return createCharacterString();
			case LiteralsPackage.SINGLE_BYTE_CHARACTER_STRING: return createSingleByteCharacterString();
			case LiteralsPackage.DOUBLE_BYTE_CHARACTER_STRING: return createDoubleByteCharacterString();
			case LiteralsPackage.TIME_LITERAL: return createTimeLiteral();
			case LiteralsPackage.DURATION: return createDuration();
			case LiteralsPackage.TIME_OF_DAY: return createTimeOfDay();
			case LiteralsPackage.DATE: return createDate();
			case LiteralsPackage.DATE_AND_TIME: return createDateAndTime();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericLiteral createNumericLiteral() {
		NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
		return numericLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterLiteral createCharacterLiteral() {
		CharacterLiteralImpl characterLiteral = new CharacterLiteralImpl();
		return characterLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitStringLiteral createBitStringLiteral() {
		BitStringLiteralImpl bitStringLiteral = new BitStringLiteralImpl();
		return bitStringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.fraunhofer.iem.m4a.IEC61131.core.literals.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealLiteral createRealLiteral() {
		RealLiteralImpl realLiteral = new RealLiteralImpl();
		return realLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedInteger createSignedInteger() {
		SignedIntegerImpl signedInteger = new SignedIntegerImpl();
		return signedInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryInteger createBinaryInteger() {
		BinaryIntegerImpl binaryInteger = new BinaryIntegerImpl();
		return binaryInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OctalInteger createOctalInteger() {
		OctalIntegerImpl octalInteger = new OctalIntegerImpl();
		return octalInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HexInteger createHexInteger() {
		HexIntegerImpl hexInteger = new HexIntegerImpl();
		return hexInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInteger createUnsignedInteger() {
		UnsignedIntegerImpl unsignedInteger = new UnsignedIntegerImpl();
		return unsignedInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterString createCharacterString() {
		CharacterStringImpl characterString = new CharacterStringImpl();
		return characterString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleByteCharacterString createSingleByteCharacterString() {
		SingleByteCharacterStringImpl singleByteCharacterString = new SingleByteCharacterStringImpl();
		return singleByteCharacterString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleByteCharacterString createDoubleByteCharacterString() {
		DoubleByteCharacterStringImpl doubleByteCharacterString = new DoubleByteCharacterStringImpl();
		return doubleByteCharacterString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLiteral createTimeLiteral() {
		TimeLiteralImpl timeLiteral = new TimeLiteralImpl();
		return timeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeOfDay createTimeOfDay() {
		TimeOfDayImpl timeOfDay = new TimeOfDayImpl();
		return timeOfDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateAndTime createDateAndTime() {
		DateAndTimeImpl dateAndTime = new DateAndTimeImpl();
		return dateAndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralsPackage getLiteralsPackage() {
		return (LiteralsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LiteralsPackage getPackage() {
		return LiteralsPackage.eINSTANCE;
	}

} //LiteralsFactoryImpl

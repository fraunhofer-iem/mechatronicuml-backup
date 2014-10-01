/**
 */
package es.unican.mast.xmlmast.trace.util;

import es.unican.mast.xmlmast.trace.*;

import java.math.BigInteger;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see es.unican.mast.xmlmast.trace.TracePackage
 * @generated
 */
public class TraceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TraceValidator INSTANCE = new TraceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "es.unican.mast.xmlmast.trace";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TracePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TracePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case TracePackage.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case TracePackage.MESSAGE_TYPE:
				return validateMessageType((MessageType)value, diagnostics, context);
			case TracePackage.MSG_LIST:
				return validateMsgList((MsgList)value, diagnostics, context);
			case TracePackage.MSG_TYPE_LIST:
				return validateMsgTypeList((MsgTypeList)value, diagnostics, context);
			case TracePackage.SOURCE:
				return validateSource((Source)value, diagnostics, context);
			case TracePackage.SRC_LIST:
				return validateSrcList((SrcList)value, diagnostics, context);
			case TracePackage.TRACEFILE_TYPE:
				return validateTRACEFILEType((TRACEFILEType)value, diagnostics, context);
			case TracePackage.DATE_TIME:
				return validateDateTime((XMLGregorianCalendar)value, diagnostics, context);
			case TracePackage.EXTERNAL_REFERENCE:
				return validateExternalReference((String)value, diagnostics, context);
			case TracePackage.IDENTIFIER:
				return validateIdentifier((String)value, diagnostics, context);
			case TracePackage.MESSAGE_IDENTIFIER:
				return validateMessageIdentifier((BigInteger)value, diagnostics, context);
			case TracePackage.SOURCE_IDENTIFIER:
				return validateSourceIdentifier((Integer)value, diagnostics, context);
			case TracePackage.SOURCE_IDENTIFIER_OBJECT:
				return validateSourceIdentifierObject((Integer)value, diagnostics, context);
			case TracePackage.TIME:
				return validateTime((Float)value, diagnostics, context);
			case TracePackage.TIME_OBJECT:
				return validateTimeObject((Float)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(message, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageType(MessageType messageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsgList(MsgList msgList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msgList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsgTypeList(MsgTypeList msgTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msgTypeList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSource(Source source, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(source, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSrcList(SrcList srcList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(srcList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRACEFILEType(TRACEFILEType tracefileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tracefileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime(XMLGregorianCalendar dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference(String externalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExternalReference_Pattern(externalReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateExternalReference_Pattern
	 */
	public static final  PatternMatcher [][] EXTERNAL_REFERENCE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([a-z]|[A-Z])([a-z]|[A-Z]|[0-9]|.|_)*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\i-[:]][\\c-[:]]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference_Pattern(String externalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TracePackage.Literals.EXTERNAL_REFERENCE, externalReference, EXTERNAL_REFERENCE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier(String identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdentifier_Pattern(identifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIdentifier_Pattern
	 */
	public static final  PatternMatcher [][] IDENTIFIER__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([a-z]|[A-Z])([a-z]|[A-Z]|[0-9]|.|_)*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\i-[:]][\\c-[:]]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier_Pattern(String identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TracePackage.Literals.IDENTIFIER, identifier, IDENTIFIER__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageIdentifier(BigInteger messageIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(messageIdentifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceIdentifier(int sourceIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceIdentifierObject(Integer sourceIdentifierObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(float time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTime_Min(time, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTime_Min
	 */
	public static final float TIME__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime_Min(float time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = time >= TIME__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(TracePackage.Literals.TIME, time, TIME__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeObject(Float timeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTime_Min(timeObject, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TraceValidator

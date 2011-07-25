/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.msgiface.util;

import de.uni_paderborn.fujaba.muml.model.msgiface.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage
 * @generated
 */
public class MsgifaceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MsgifaceValidator INSTANCE = new MsgifaceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.model.msgiface";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgifaceValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MsgifacePackage.eINSTANCE;
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
			case MsgifacePackage.MESSAGE_INTERFACE:
				return validateMessageInterface((MessageInterface)value, diagnostics, context);
			case MsgifacePackage.MESSAGE_TYPE:
				return validateMessageType((MessageType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageInterface(MessageInterface messageInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageInterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageInterface_NoSelfGeneralization(messageInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageInterface_NoBidirectionalGeneralization(messageInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageInterface_UniqueMessageTypeNames(messageInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageInterface_NoMessageTypeOrNotAtLeastTwoGeneralizations(messageInterface, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoSelfGeneralization constraint of '<em>Message Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE_INTERFACE__NO_SELF_GENERALIZATION__EEXPRESSION = "self.superType->forAll(x|x<>self)";

	/**
	 * Validates the NoSelfGeneralization constraint of '<em>Message Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageInterface_NoSelfGeneralization(MessageInterface messageInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MsgifacePackage.Literals.MESSAGE_INTERFACE,
				 messageInterface,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoSelfGeneralization",
				 MESSAGE_INTERFACE__NO_SELF_GENERALIZATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoBidirectionalGeneralization constraint of '<em>Message Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE_INTERFACE__NO_BIDIRECTIONAL_GENERALIZATION__EEXPRESSION = "self.superType->forAll(x|x.superType->forAll(y|y<>self))";

	/**
	 * Validates the NoBidirectionalGeneralization constraint of '<em>Message Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageInterface_NoBidirectionalGeneralization(MessageInterface messageInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MsgifacePackage.Literals.MESSAGE_INTERFACE,
				 messageInterface,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoBidirectionalGeneralization",
				 MESSAGE_INTERFACE__NO_BIDIRECTIONAL_GENERALIZATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueMessageTypeNames constraint of '<em>Message Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE_INTERFACE__UNIQUE_MESSAGE_TYPE_NAMES__EEXPRESSION = "self.messageTypes->isUnique(name)";

	/**
	 * Validates the UniqueMessageTypeNames constraint of '<em>Message Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageInterface_UniqueMessageTypeNames(MessageInterface messageInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MsgifacePackage.Literals.MESSAGE_INTERFACE,
				 messageInterface,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueMessageTypeNames",
				 MESSAGE_INTERFACE__UNIQUE_MESSAGE_TYPE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoMessageTypeOrNotAtLeastTwoGeneralizations constraint of '<em>Message Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE_INTERFACE__NO_MESSAGE_TYPE_OR_NOT_AT_LEAST_TWO_GENERALIZATIONS__EEXPRESSION = "self.messageTypes->size()>=1 or self.superType->size()>=2";

	/**
	 * Validates the NoMessageTypeOrNotAtLeastTwoGeneralizations constraint of '<em>Message Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageInterface_NoMessageTypeOrNotAtLeastTwoGeneralizations(MessageInterface messageInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MsgifacePackage.Literals.MESSAGE_INTERFACE,
				 messageInterface,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoMessageTypeOrNotAtLeastTwoGeneralizations",
				 MESSAGE_INTERFACE__NO_MESSAGE_TYPE_OR_NOT_AT_LEAST_TWO_GENERALIZATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //MsgifaceValidator

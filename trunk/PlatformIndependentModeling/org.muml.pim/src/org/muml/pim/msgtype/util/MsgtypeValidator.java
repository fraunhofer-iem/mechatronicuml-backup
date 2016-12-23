/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.msgtype.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.pim.msgtype.*;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.msgtype.MessageTypeRepository;
import org.muml.pim.msgtype.MsgtypePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.pim.msgtype.MsgtypePackage
 * @generated
 */
public class MsgtypeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MsgtypeValidator INSTANCE = new MsgtypeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.pim.msgtype";

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
	public MsgtypeValidator() {
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
	  return MsgtypePackage.eINSTANCE;
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
			case MsgtypePackage.MESSAGE_TYPE:
				return validateMessageType((MessageType)value, diagnostics, context);
			case MsgtypePackage.MESSAGE_TYPE_REPOSITORY:
				return validateMessageTypeRepository((MessageTypeRepository)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageType(MessageType messageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageType_UniqueParameterNames(messageType, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageType_repositoryMustBeSet(messageType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueParameterNames constraint of '<em>Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE_TYPE__UNIQUE_PARAMETER_NAMES__EEXPRESSION = "-- Parameter names must be unique\r\n" +
		"self.parameters->isUnique(name)";

	/**
	 * Validates the UniqueParameterNames constraint of '<em>Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageType_UniqueParameterNames(MessageType messageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MsgtypePackage.Literals.MESSAGE_TYPE,
				 messageType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueParameterNames",
				 MESSAGE_TYPE__UNIQUE_PARAMETER_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the repositoryMustBeSet constraint of '<em>Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE_TYPE__REPOSITORY_MUST_BE_SET__EEXPRESSION = "-- A MessageType must be contained in a MessageTypeRepository.\r\n" +
		"not self.repository.oclIsUndefined()";

	/**
	 * Validates the repositoryMustBeSet constraint of '<em>Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageType_repositoryMustBeSet(MessageType messageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MsgtypePackage.Literals.MESSAGE_TYPE,
				 messageType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "repositoryMustBeSet",
				 MESSAGE_TYPE__REPOSITORY_MUST_BE_SET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageTypeRepository(MessageTypeRepository messageTypeRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageTypeRepository, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageTypeRepository_AtLeastOneMessageType(messageTypeRepository, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtLeastOneMessageType constraint of '<em>Message Type Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE_TYPE_REPOSITORY__AT_LEAST_ONE_MESSAGE_TYPE__EEXPRESSION = "-- A MessageTypeRepository must contain at least one MessageType.\r\n" +
		"self.messageTypes->notEmpty()";

	/**
	 * Validates the AtLeastOneMessageType constraint of '<em>Message Type Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageTypeRepository_AtLeastOneMessageType(MessageTypeRepository messageTypeRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MsgtypePackage.Literals.MESSAGE_TYPE_REPOSITORY,
				 messageTypeRepository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AtLeastOneMessageType",
				 MESSAGE_TYPE_REPOSITORY__AT_LEAST_ONE_MESSAGE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //MsgtypeValidator

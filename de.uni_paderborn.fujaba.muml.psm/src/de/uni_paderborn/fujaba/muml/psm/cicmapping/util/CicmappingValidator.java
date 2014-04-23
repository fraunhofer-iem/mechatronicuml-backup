/**
 */
package de.uni_paderborn.fujaba.muml.psm.cicmapping.util;

import de.uni_paderborn.fujaba.muml.psm.cicmapping.*;

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
 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.CicmappingPackage
 * @generated
 */
public class CicmappingValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CicmappingValidator INSTANCE = new CicmappingValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.psm.cicmapping";

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
	public CicmappingValidator() {
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
	  return CicmappingPackage.eINSTANCE;
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
			case CicmappingPackage.CIC_SYSTEM_MAPPING:
				return validateCICSystemMapping((CICSystemMapping)value, diagnostics, context);
			case CicmappingPackage.CIC_MAPPING:
				return validateCICMapping((CICMapping)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCICSystemMapping(CICSystemMapping cicSystemMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cicSystemMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCICMapping(CICMapping cicMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cicMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cicMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cicMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cicMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cicMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cicMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cicMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cicMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cicMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateCICMapping_ComponentInstanceIsContinousComponentInstance(cicMapping, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ComponentInstanceIsContinousComponentInstance constraint of '<em>CIC Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CIC_MAPPING__COMPONENT_INSTANCE_IS_CONTINOUS_COMPONENT_INSTANCE__EEXPRESSION = "self.cic.componentType.componentKind=muml::component::ComponentKind::CONTINUOUS_COMPONENT";

	/**
	 * Validates the ComponentInstanceIsContinousComponentInstance constraint of '<em>CIC Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCICMapping_ComponentInstanceIsContinousComponentInstance(CICMapping cicMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CicmappingPackage.Literals.CIC_MAPPING,
				 cicMapping,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ComponentInstanceIsContinousComponentInstance",
				 CIC_MAPPING__COMPONENT_INSTANCE_IS_CONTINOUS_COMPONENT_INSTANCE__EEXPRESSION,
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

} //CicmappingValidator

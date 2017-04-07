/**
 */
package org.muml.psm.allocation.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.psm.allocation.Allocation;
import org.muml.psm.allocation.AllocationPackage;
import org.muml.psm.allocation.AssemblyConnectorInstanceAllocation;
import org.muml.psm.allocation.SystemAllocation;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.allocation.AllocationPackage
 * @generated
 */
public class AllocationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AllocationValidator INSTANCE = new AllocationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.psm.allocation";

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
	public AllocationValidator() {
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
	  return AllocationPackage.eINSTANCE;
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
			case AllocationPackage.SYSTEM_ALLOCATION:
				return validateSystemAllocation((SystemAllocation)value, diagnostics, context);
			case AllocationPackage.ALLOCATION:
				return validateAllocation((Allocation)value, diagnostics, context);
			case AllocationPackage.ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION:
				return validateAssemblyConnectorInstanceAllocation((AssemblyConnectorInstanceAllocation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemAllocation(SystemAllocation systemAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemAllocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemAllocation_AllComponentInstancesAllocated(systemAllocation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AllComponentInstancesAllocated constraint of '<em>System Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM_ALLOCATION__ALL_COMPONENT_INSTANCES_ALLOCATED__EEXPRESSION = "-- All component instances must be allocated\n" +
		"let componentInstances : Bag(pim::instance::ComponentInstance)\n" +
		"=\n" +
		"Bag{}\n" +
		"in\n" +
		"let foo : Set(Integer) = Set{2}->union(Set{3})\n" +
		"in\n" +
		"true\n" +
		"\n" +
		"\n" +
		"--self.cic->asSet()->union(\n" +
		"--\t-- XXX: is the union really needed (pivot ocl)?\n" +
		"--\tself.cic->closure(\n" +
		"--\t\tcomponentInstances->select(\n" +
		"--\t\t\toclIsKindOf(pim::instance::StructuredComponentInstance)\n" +
		"--\t\t)->collect(\n" +
		"--\t\t\toclAsType(pim::instance::StructuredComponentInstance).embeddedCIC\n" +
		"--\t\t)\n" +
		"--\t)->asSet()\n" +
		"--)->collect(\n" +
		"--\tcomponentInstances\n" +
		"--)->asBag()\n" +
		"--in\n" +
		"--componentInstances = self.allocations->collect(componentInstance)->asBag()";

	/**
	 * Validates the AllComponentInstancesAllocated constraint of '<em>System Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemAllocation_AllComponentInstancesAllocated(SystemAllocation systemAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AllocationPackage.Literals.SYSTEM_ALLOCATION,
				 systemAllocation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AllComponentInstancesAllocated",
				 SYSTEM_ALLOCATION__ALL_COMPONENT_INSTANCES_ALLOCATED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnectorInstanceAllocation(AssemblyConnectorInstanceAllocation assemblyConnectorInstanceAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assemblyConnectorInstanceAllocation, diagnostics, context);
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

} //AllocationValidator

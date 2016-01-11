/**
 */
package de.uni_paderborn.fujaba.muml.testlanguage.specification.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import de.uni_paderborn.fujaba.muml.testlanguage.specification.ExecuteUPPAAL;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.NodeSpecification;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.PortType;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.SpecificationPackage;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.ExecutionException;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.CoordinationProtocolOptions;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.OptionsFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.TraceOptions;
import de.uni_paderborn.uppaal.NTA;
import de.uni_paderborn.uppaal.job.VerifyTAOperation;
import de.uni_paderborn.uppaal.requirements.PropertyRepository;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Execute UPPAAL</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExecuteUPPAALImpl extends NodeSpecificationImpl implements
		ExecuteUPPAAL {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExecuteUPPAALImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.EXECUTE_UPPAAL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initialize() {
		this.setLabel("Check UPPAAL");
		this.addPortSpecification(PortType.IN, "nta", false,
				de.uni_paderborn.uppaal.NTA.class);
		this.addPortSpecification(PortType.IN, "property_repository", false,
				de.uni_paderborn.uppaal.requirements.PropertyRepository.class);
		this.addPortSpecification(
				PortType.IN,
				"options",
				true,
				de.uni_paderborn.fujaba.muml.verification.uppaal.options.Options.class);
		this.addPortSpecification(PortType.OUT, "trace_repository", false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void execute(final Map<String, Object> inputs,
			final Map<String, Object> outputs) throws ExecutionException,
			Exception {
		// Check if we have custom options or use the default ones.
		CoordinationProtocolOptions options;
		if (inputs.containsKey("options") && inputs.get("options") != null) {
			options = (CoordinationProtocolOptions) inputs.get("options");
		} else {
			options = OptionsFactory.eINSTANCE
					.createCoordinationProtocolOptions();
			options.setTraceOptions(TraceOptions.NONE);
		}

		// Start the job that serialized and then verifies the NTA.
		VerifyTAOperation operation = new VerifyTAOperation((NTA) inputs.get("nta"),
				(PropertyRepository) inputs.get("property_repository"), options);
		operation.run(new NullProgressMonitor());

		// Put the traces on the output port and return.
		outputs.put("trace_repository", operation.getTraceRepository());
		return;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NodeSpecification.class) {
			switch (baseOperationID) {
			case SpecificationPackage.NODE_SPECIFICATION___INITIALIZE:
				return SpecificationPackage.EXECUTE_UPPAAL___INITIALIZE;
			case SpecificationPackage.NODE_SPECIFICATION___EXECUTE__MAP_MAP:
				return SpecificationPackage.EXECUTE_UPPAAL___EXECUTE__MAP_MAP;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case SpecificationPackage.EXECUTE_UPPAAL___INITIALIZE:
			initialize();
			return null;
		case SpecificationPackage.EXECUTE_UPPAAL___EXECUTE__MAP_MAP:
			try {
				execute((Map<String, Object>) arguments.get(0),
						(Map<String, Object>) arguments.get(1));
				return null;
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		}
		return super.eInvoke(operationID, arguments);
	}

} // ExecuteUPPAALImpl

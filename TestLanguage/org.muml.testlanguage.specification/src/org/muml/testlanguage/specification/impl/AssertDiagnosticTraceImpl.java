/**
 */
package org.muml.testlanguage.specification.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.muml.testlanguage.specification.AssertBool;
import org.muml.testlanguage.specification.AssertDiagnosticTrace;
import org.muml.testlanguage.specification.NodeSpecification;
import org.muml.testlanguage.specification.PortType;
import org.muml.testlanguage.specification.SpecificationPackage;
import org.muml.testlanguage.specification.custom.ExecutionException;
import org.muml.uppaal.trace.Result;
import org.muml.uppaal.trace.Trace;
import org.muml.uppaal.trace.TraceRepository;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Assert Diagnostic Trace</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class AssertDiagnosticTraceImpl extends AssertBoolImpl implements AssertDiagnosticTrace {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssertDiagnosticTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.ASSERT_DIAGNOSTIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initialize() {
		this.setLabel("Assert DiagnosticTrace");
		this.addPortSpecification(PortType.IN, "trace_repository", false,
				org.muml.uppaal.trace.TraceRepository.class);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void execute(final Map<String, Object> inputs, final Map<String, Object> outputs)
			throws ExecutionException, Exception {
		// Get the repository.
		TraceRepository repo = (TraceRepository) inputs.get("trace_repository");

		// Make sure we know if we want all the properties to verify or not.
		Result expected;
		String alpha, beta;
		if (this.assertion) {
			expected = Result.SUCCESS;
			alpha = "SUCCESS";
			beta = "FAILURE";
		} else {
			expected = Result.FAILURE;
			alpha = "FAILURE";
			beta = "SUCCESS";
		}

		// Check each property.
		String error = "";
		for (Trace item : repo.getTraces()) {
			if (!item.getResult().equals(expected)) {
				error += "[Property " + item.getProperty() + " at line " + item.getLine() + "] ";
			}
		}

		// Throw an exception if errors occurred.
		if (!error.equals("")) {
			throw new ExecutionException("Expected " + alpha + ", but got " + beta + " on " + error);
		}
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
				return SpecificationPackage.ASSERT_DIAGNOSTIC_TRACE___INITIALIZE;
			case SpecificationPackage.NODE_SPECIFICATION___EXECUTE__MAP_MAP:
				return SpecificationPackage.ASSERT_DIAGNOSTIC_TRACE___EXECUTE__MAP_MAP;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == AssertBool.class) {
			switch (baseOperationID) {
			case SpecificationPackage.ASSERT_BOOL___INITIALIZE:
				return SpecificationPackage.ASSERT_DIAGNOSTIC_TRACE___INITIALIZE;
			case SpecificationPackage.ASSERT_BOOL___EXECUTE__MAP_MAP:
				return SpecificationPackage.ASSERT_DIAGNOSTIC_TRACE___EXECUTE__MAP_MAP;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SpecificationPackage.ASSERT_DIAGNOSTIC_TRACE___INITIALIZE:
			initialize();
			return null;
		case SpecificationPackage.ASSERT_DIAGNOSTIC_TRACE___EXECUTE__MAP_MAP:
			try {
				execute((Map<String, Object>) arguments.get(0), (Map<String, Object>) arguments.get(1));
				return null;
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		}
		return super.eInvoke(operationID, arguments);
	}
} // AssertDiagnosticTraceImpl

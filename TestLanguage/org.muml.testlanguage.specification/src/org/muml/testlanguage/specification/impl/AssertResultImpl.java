/**
 */
package org.muml.testlanguage.specification.impl;

import de.uni_paderborn.fujaba.muml.verification.uppaal.results.PropertyResult;
import de.uni_paderborn.fujaba.muml.verification.uppaal.results.PropertyResultRepository;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.muml.testlanguage.specification.AssertBool;
import org.muml.testlanguage.specification.AssertResult;
import org.muml.testlanguage.specification.NodeSpecification;
import org.muml.testlanguage.specification.PortType;
import org.muml.testlanguage.specification.SpecificationPackage;
import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Assert Result</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssertResultImpl extends AssertBoolImpl implements AssertResult {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssertResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.ASSERT_RESULT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initialize() {
		this.setLabel("Assert Result");
		this.addPortSpecification(
				PortType.IN,
				"property_result_repository",
				false,
				de.uni_paderborn.fujaba.muml.verification.uppaal.results.PropertyResultRepository.class);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void execute(final Map<String, Object> inputs,
			final Map<String, Object> outputs) throws ExecutionException,
			Exception {
		// Get the repository of the results.
		PropertyResultRepository repo = (PropertyResultRepository) inputs
				.get("property_result_repository");

		// Make sure we know if we want all the properties to verify or not.
		String alpha, beta;
		if (this.assertion) {
			alpha = "FULFILLED";
			beta = "NOT FULFILLED";
		} else {
			alpha = "NOT FULFILLED";
			beta = "FULFILLED";
		}

		// Check each property.
		String error = "";
		for (PropertyResult result : repo.getResults()) {
			if (result.isFulfilled() != this.assertion) {
				error += "[Comment " + result.getProperty().getComment() + "] ";
			}
		}

		// Throw an exception if errors occurred.
		if (!error.equals("")) {
			throw new ExecutionException("Expected " + alpha + ", but got "
					+ beta + " on " + error);
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
				return SpecificationPackage.ASSERT_RESULT___INITIALIZE;
			case SpecificationPackage.NODE_SPECIFICATION___EXECUTE__MAP_MAP:
				return SpecificationPackage.ASSERT_RESULT___EXECUTE__MAP_MAP;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == AssertBool.class) {
			switch (baseOperationID) {
			case SpecificationPackage.ASSERT_BOOL___INITIALIZE:
				return SpecificationPackage.ASSERT_RESULT___INITIALIZE;
			case SpecificationPackage.ASSERT_BOOL___EXECUTE__MAP_MAP:
				return SpecificationPackage.ASSERT_RESULT___EXECUTE__MAP_MAP;
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
		case SpecificationPackage.ASSERT_RESULT___INITIALIZE:
			initialize();
			return null;
		case SpecificationPackage.ASSERT_RESULT___EXECUTE__MAP_MAP:
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

} // AssertResultImpl

/**
 */
package org.muml.testlanguage.specification.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.muml.testlanguage.specification.*;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see org.muml.testlanguage.specification.SpecificationPackage
 * @generated
 */
public class SpecificationSwitch<T> extends Switch<T> {

	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static SpecificationPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public SpecificationSwitch() {
		if (modelPackage == null) {
			modelPackage = SpecificationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param ePackage
	 *            the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SpecificationPackage.NODE_SPECIFICATION: {
			NodeSpecification nodeSpecification = (NodeSpecification) theEObject;
			T result = caseNodeSpecification(nodeSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpecificationPackage.PORT_SPECIFICATION: {
			PortSpecification portSpecification = (PortSpecification) theEObject;
			T result = casePortSpecification(portSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpecificationPackage.DEFAULT: {
			Default default_ = (Default) theEObject;
			T result = caseDefault(default_);
			if (result == null)
				result = caseNodeSpecification(default_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpecificationPackage.LOAD_MODEL: {
			LoadModel loadModel = (LoadModel) theEObject;
			T result = caseLoadModel(loadModel);
			if (result == null)
				result = caseNodeSpecification(loadModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpecificationPackage.COMPARE_MODELS: {
			CompareModels compareModels = (CompareModels) theEObject;
			T result = caseCompareModels(compareModels);
			if (result == null)
				result = caseNodeSpecification(compareModels);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpecificationPackage.VALIDATE_MODEL: {
			ValidateModel validateModel = (ValidateModel) theEObject;
			T result = caseValidateModel(validateModel);
			if (result == null)
				result = caseNodeSpecification(validateModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpecificationPackage.SAVE_MODEL: {
			SaveModel saveModel = (SaveModel) theEObject;
			T result = caseSaveModel(saveModel);
			if (result == null)
				result = caseNodeSpecification(saveModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpecificationPackage.TRANSFORMATION: {
			Transformation transformation = (Transformation) theEObject;
			T result = caseTransformation(transformation);
			if (result == null)
				result = caseNodeSpecification(transformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpecificationPackage.EXECUTE_UPPAAL: {
			ExecuteUPPAAL executeUPPAAL = (ExecuteUPPAAL) theEObject;
			T result = caseExecuteUPPAAL(executeUPPAAL);
			if (result == null)
				result = caseNodeSpecification(executeUPPAAL);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpecificationPackage.PRIMITIVE_STRING: {
			PrimitiveString primitiveString = (PrimitiveString) theEObject;
			T result = casePrimitiveString(primitiveString);
			if (result == null)
				result = caseNodeSpecification(primitiveString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpecificationPackage.ASSERT_BOOL: {
			AssertBool assertBool = (AssertBool) theEObject;
			T result = caseAssertBool(assertBool);
			if (result == null)
				result = caseNodeSpecification(assertBool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpecificationPackage.ASSERT_DIAGNOSTIC_TRACE: {
			AssertDiagnosticTrace assertDiagnosticTrace = (AssertDiagnosticTrace) theEObject;
			T result = caseAssertDiagnosticTrace(assertDiagnosticTrace);
			if (result == null)
				result = caseAssertBool(assertDiagnosticTrace);
			if (result == null)
				result = caseNodeSpecification(assertDiagnosticTrace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpecificationPackage.ASSERT_RESULT: {
			AssertResult assertResult = (AssertResult) theEObject;
			T result = caseAssertResult(assertResult);
			if (result == null)
				result = caseAssertBool(assertResult);
			if (result == null)
				result = caseNodeSpecification(assertResult);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpecificationPackage.CHECK_MTCTL: {
			CheckMTCTL checkMTCTL = (CheckMTCTL) theEObject;
			T result = caseCheckMTCTL(checkMTCTL);
			if (result == null)
				result = caseNodeSpecification(checkMTCTL);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Node Specification</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Node Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeSpecification(NodeSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Port Specification</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Port Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortSpecification(PortSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Default</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefault(Default object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Load Model</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Load Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadModel(LoadModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Compare Models</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Compare Models</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompareModels(CompareModels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Validate Model</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Validate Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidateModel(ValidateModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Save Model</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Save Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSaveModel(SaveModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Transformation</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Execute UPPAAL</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Execute UPPAAL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecuteUPPAAL(ExecuteUPPAAL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Primitive String</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Primitive String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveString(PrimitiveString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Assert Bool</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Assert Bool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertBool(AssertBool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Assert Diagnostic Trace</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Assert Diagnostic Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertDiagnosticTrace(AssertDiagnosticTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Assert Result</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Assert Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertResult(AssertResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Check MTCTL</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Check MTCTL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckMTCTL(CheckMTCTL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>EObject</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}
} // SpecificationSwitch

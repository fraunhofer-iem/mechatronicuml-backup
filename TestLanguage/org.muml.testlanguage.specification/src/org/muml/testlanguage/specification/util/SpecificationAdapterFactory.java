/**
 */
package org.muml.testlanguage.specification.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.muml.testlanguage.specification.*;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see org.muml.testlanguage.specification.SpecificationPackage
 * @generated
 */
public class SpecificationAdapterFactory extends AdapterFactoryImpl {

	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static SpecificationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public SpecificationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpecificationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SpecificationSwitch<Adapter> modelSwitch = new SpecificationSwitch<Adapter>() {
		@Override
		public Adapter caseNodeSpecification(NodeSpecification object) {
			return createNodeSpecificationAdapter();
		}

		@Override
		public Adapter casePortSpecification(PortSpecification object) {
			return createPortSpecificationAdapter();
		}

		@Override
		public Adapter caseDefault(Default object) {
			return createDefaultAdapter();
		}

		@Override
		public Adapter caseLoadModel(LoadModel object) {
			return createLoadModelAdapter();
		}

		@Override
		public Adapter caseCompareModels(CompareModels object) {
			return createCompareModelsAdapter();
		}

		@Override
		public Adapter caseValidateModel(ValidateModel object) {
			return createValidateModelAdapter();
		}

		@Override
		public Adapter caseSaveModel(SaveModel object) {
			return createSaveModelAdapter();
		}

		@Override
		public Adapter caseTransformation(Transformation object) {
			return createTransformationAdapter();
		}

		@Override
		public Adapter caseExecuteUPPAAL(ExecuteUPPAAL object) {
			return createExecuteUPPAALAdapter();
		}

		@Override
		public Adapter casePrimitiveString(PrimitiveString object) {
			return createPrimitiveStringAdapter();
		}

		@Override
		public Adapter caseAssertBool(AssertBool object) {
			return createAssertBoolAdapter();
		}

		@Override
		public Adapter caseAssertDiagnosticTrace(AssertDiagnosticTrace object) {
			return createAssertDiagnosticTraceAdapter();
		}

		@Override
		public Adapter caseAssertResult(AssertResult object) {
			return createAssertResultAdapter();
		}

		@Override
		public Adapter caseCheckMTCTL(CheckMTCTL object) {
			return createCheckMTCTLAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.muml.testlanguage.specification.NodeSpecification
	 * <em>Node Specification</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.muml.testlanguage.specification.NodeSpecification
	 * @generated
	 */
	public Adapter createNodeSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.muml.testlanguage.specification.PortSpecification
	 * <em>Port Specification</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.muml.testlanguage.specification.PortSpecification
	 * @generated
	 */
	public Adapter createPortSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.muml.testlanguage.specification.Default <em>Default</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.muml.testlanguage.specification.Default
	 * @generated
	 */
	public Adapter createDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.muml.testlanguage.specification.LoadModel <em>Load Model</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.muml.testlanguage.specification.LoadModel
	 * @generated
	 */
	public Adapter createLoadModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.muml.testlanguage.specification.CompareModels
	 * <em>Compare Models</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.muml.testlanguage.specification.CompareModels
	 * @generated
	 */
	public Adapter createCompareModelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.muml.testlanguage.specification.ValidateModel
	 * <em>Validate Model</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.muml.testlanguage.specification.ValidateModel
	 * @generated
	 */
	public Adapter createValidateModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.muml.testlanguage.specification.SaveModel <em>Save Model</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.muml.testlanguage.specification.SaveModel
	 * @generated
	 */
	public Adapter createSaveModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.muml.testlanguage.specification.Transformation
	 * <em>Transformation</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.muml.testlanguage.specification.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.muml.testlanguage.specification.ExecuteUPPAAL
	 * <em>Execute UPPAAL</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.muml.testlanguage.specification.ExecuteUPPAAL
	 * @generated
	 */
	public Adapter createExecuteUPPAALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.muml.testlanguage.specification.PrimitiveString
	 * <em>Primitive String</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.muml.testlanguage.specification.PrimitiveString
	 * @generated
	 */
	public Adapter createPrimitiveStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.muml.testlanguage.specification.AssertBool
	 * <em>Assert Bool</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.muml.testlanguage.specification.AssertBool
	 * @generated
	 */
	public Adapter createAssertBoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.muml.testlanguage.specification.AssertDiagnosticTrace
	 * <em>Assert Diagnostic Trace</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.muml.testlanguage.specification.AssertDiagnosticTrace
	 * @generated
	 */
	public Adapter createAssertDiagnosticTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.muml.testlanguage.specification.AssertResult
	 * <em>Assert Result</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.muml.testlanguage.specification.AssertResult
	 * @generated
	 */
	public Adapter createAssertResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.muml.testlanguage.specification.CheckMTCTL
	 * <em>Check MTCTL</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.muml.testlanguage.specification.CheckMTCTL
	 * @generated
	 */
	public Adapter createCheckMTCTLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}
} // SpecificationAdapterFactory

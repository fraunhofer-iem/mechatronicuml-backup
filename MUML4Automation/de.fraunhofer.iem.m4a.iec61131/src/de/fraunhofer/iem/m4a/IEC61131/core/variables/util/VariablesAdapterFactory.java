/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.variables.util;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSink;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage
 * @generated
 */
public class VariablesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VariablesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariablesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VariablesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariablesSwitch<Adapter> modelSwitch =
		new VariablesSwitch<Adapter>() {
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseSymbolicVariable(SymbolicVariable object) {
				return createSymbolicVariableAdapter();
			}
			@Override
			public Adapter caseDirectVariable(DirectVariable object) {
				return createDirectVariableAdapter();
			}
			@Override
			public Adapter caseNamedVariable(NamedVariable object) {
				return createNamedVariableAdapter();
			}
			@Override
			public Adapter caseMultiElementVariable(MultiElementVariable object) {
				return createMultiElementVariableAdapter();
			}
			@Override
			public Adapter caseStructuredVariable(StructuredVariable object) {
				return createStructuredVariableAdapter();
			}
			@Override
			public Adapter caseArrayVariable(ArrayVariable object) {
				return createArrayVariableAdapter();
			}
			@Override
			public Adapter caseFieldSelector(FieldSelector object) {
				return createFieldSelectorAdapter();
			}
			@Override
			public Adapter caseGlobalVar(GlobalVar object) {
				return createGlobalVarAdapter();
			}
			@Override
			public Adapter caseNonGlobalVariable(NonGlobalVariable object) {
				return createNonGlobalVariableAdapter();
			}
			@Override
			public Adapter caseFBName(FBName object) {
				return createFBNameAdapter();
			}
			@Override
			public Adapter caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			@Override
			public Adapter caseDataSink(DataSink object) {
				return createDataSinkAdapter();
			}
			@Override
			public Adapter caseProgDataSource(ProgDataSource object) {
				return createProgDataSourceAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseAccessDeclaration(AccessDeclaration object) {
				return createAccessDeclarationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.SymbolicVariable <em>Symbolic Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.SymbolicVariable
	 * @generated
	 */
	public Adapter createSymbolicVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.DirectVariable <em>Direct Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.DirectVariable
	 * @generated
	 */
	public Adapter createDirectVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.NamedVariable <em>Named Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.NamedVariable
	 * @generated
	 */
	public Adapter createNamedVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.MultiElementVariable <em>Multi Element Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.MultiElementVariable
	 * @generated
	 */
	public Adapter createMultiElementVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.StructuredVariable <em>Structured Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.StructuredVariable
	 * @generated
	 */
	public Adapter createStructuredVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.ArrayVariable <em>Array Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.ArrayVariable
	 * @generated
	 */
	public Adapter createArrayVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.FieldSelector <em>Field Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.FieldSelector
	 * @generated
	 */
	public Adapter createFieldSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.GlobalVar <em>Global Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.GlobalVar
	 * @generated
	 */
	public Adapter createGlobalVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.NonGlobalVariable <em>Non Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.NonGlobalVariable
	 * @generated
	 */
	public Adapter createNonGlobalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.FBName <em>FB Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.FBName
	 * @generated
	 */
	public Adapter createFBNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSink <em>Data Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSink
	 * @generated
	 */
	public Adapter createDataSinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource <em>Prog Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource
	 * @generated
	 */
	public Adapter createProgDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration <em>Access Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration
	 * @generated
	 */
	public Adapter createAccessDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VariablesAdapterFactory

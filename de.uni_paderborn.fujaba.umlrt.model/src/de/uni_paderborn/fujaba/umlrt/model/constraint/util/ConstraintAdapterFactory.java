/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.constraint.util;

import de.uni_paderborn.fujaba.umlrt.model.constraint.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage
 * @generated
 */
public class ConstraintAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConstraintPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConstraintPackage.eINSTANCE;
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
	protected ConstraintSwitch<Adapter> modelSwitch =
		new ConstraintSwitch<Adapter>() {
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseModelingConstraint(ModelingConstraint object) {
				return createModelingConstraintAdapter();
			}
			@Override
			public Adapter caseVerifiableConstraint(VerifiableConstraint object) {
				return createVerifiableConstraintAdapter();
			}
			@Override
			public Adapter caseTextualConstraint(TextualConstraint object) {
				return createTextualConstraintAdapter();
			}
			@Override
			public Adapter caseExtendableElement(ExtendableElement object) {
				return createExtendableElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.ModelingConstraint <em>Modeling Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.ModelingConstraint
	 * @generated
	 */
	public Adapter createModelingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.VerifiableConstraint <em>Verifiable Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.VerifiableConstraint
	 * @generated
	 */
	public Adapter createVerifiableConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint <em>Textual Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint
	 * @generated
	 */
	public Adapter createTextualConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.modeling.ExtendableElement <em>Extendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.modeling.ExtendableElement
	 * @generated
	 */
	public Adapter createExtendableElementAdapter() {
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

} //ConstraintAdapterFactory

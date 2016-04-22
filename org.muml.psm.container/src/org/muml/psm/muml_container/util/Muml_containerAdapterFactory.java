/**
 */
package org.muml.psm.muml_container.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.muml.core.ExtendableElement;
import org.muml.core.NamedElement;

import org.muml.psm.muml_container.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.muml_container.Muml_containerPackage
 * @generated
 */
public class Muml_containerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Muml_containerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Muml_containerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Muml_containerPackage.eINSTANCE;
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
	protected Muml_containerSwitch<Adapter> modelSwitch =
		new Muml_containerSwitch<Adapter>() {
			@Override
			public Adapter caseComponentContainer(ComponentContainer object) {
				return createComponentContainerAdapter();
			}
			@Override
			public Adapter caseContainerComponentInstanceConfiguration(ContainerComponentInstanceConfiguration object) {
				return createContainerComponentInstanceConfigurationAdapter();
			}
			@Override
			public Adapter casePortInstanceConfiguration(PortInstanceConfiguration object) {
				return createPortInstanceConfigurationAdapter();
			}
			@Override
			public Adapter casePortInstanceConfiguration_Local(PortInstanceConfiguration_Local object) {
				return createPortInstanceConfiguration_LocalAdapter();
			}
			@Override
			public Adapter casePortInstanceConfiguration_DDS(PortInstanceConfiguration_DDS object) {
				return createPortInstanceConfiguration_DDSAdapter();
			}
			@Override
			public Adapter caseECUConfiguration(ECUConfiguration object) {
				return createECUConfigurationAdapter();
			}
			@Override
			public Adapter caseMultiPortInstanceConfiguration(MultiPortInstanceConfiguration object) {
				return createMultiPortInstanceConfigurationAdapter();
			}
			@Override
			public Adapter caseDeploymentConfiguration(DeploymentConfiguration object) {
				return createDeploymentConfigurationAdapter();
			}
			@Override
			public Adapter caseExtendableElement(ExtendableElement object) {
				return createExtendableElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.muml.psm.muml_container.ComponentContainer <em>Component Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.muml_container.ComponentContainer
	 * @generated
	 */
	public Adapter createComponentContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.muml_container.ContainerComponentInstanceConfiguration <em>Container Component Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.muml_container.ContainerComponentInstanceConfiguration
	 * @generated
	 */
	public Adapter createContainerComponentInstanceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.muml_container.PortInstanceConfiguration <em>Port Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.muml_container.PortInstanceConfiguration
	 * @generated
	 */
	public Adapter createPortInstanceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.muml_container.PortInstanceConfiguration_Local <em>Port Instance Configuration Local</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.muml_container.PortInstanceConfiguration_Local
	 * @generated
	 */
	public Adapter createPortInstanceConfiguration_LocalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS <em>Port Instance Configuration DDS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.muml_container.PortInstanceConfiguration_DDS
	 * @generated
	 */
	public Adapter createPortInstanceConfiguration_DDSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.muml_container.ECUConfiguration <em>ECU Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.muml_container.ECUConfiguration
	 * @generated
	 */
	public Adapter createECUConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.muml_container.MultiPortInstanceConfiguration <em>Multi Port Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.muml_container.MultiPortInstanceConfiguration
	 * @generated
	 */
	public Adapter createMultiPortInstanceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.muml_container.DeploymentConfiguration <em>Deployment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.muml_container.DeploymentConfiguration
	 * @generated
	 */
	public Adapter createDeploymentConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.ExtendableElement <em>Extendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.ExtendableElement
	 * @generated
	 */
	public Adapter createExtendableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
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

} //Muml_containerAdapterFactory

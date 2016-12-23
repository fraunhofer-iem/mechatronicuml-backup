/**
 */
package org.muml.psm.muml_container.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.muml.core.ExtendableElement;
import org.muml.core.NamedElement;

import org.muml.psm.muml_container.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.muml.psm.muml_container.Muml_containerPackage
 * @generated
 */
public class Muml_containerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Muml_containerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Muml_containerSwitch() {
		if (modelPackage == null) {
			modelPackage = Muml_containerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Muml_containerPackage.COMPONENT_CONTAINER: {
				ComponentContainer componentContainer = (ComponentContainer)theEObject;
				T result = caseComponentContainer(componentContainer);
				if (result == null) result = caseNamedElement(componentContainer);
				if (result == null) result = caseExtendableElement(componentContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Muml_containerPackage.CONTAINER_COMPONENT_INSTANCE_CONFIGURATION: {
				ContainerComponentInstanceConfiguration containerComponentInstanceConfiguration = (ContainerComponentInstanceConfiguration)theEObject;
				T result = caseContainerComponentInstanceConfiguration(containerComponentInstanceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION: {
				PortInstanceConfiguration portInstanceConfiguration = (PortInstanceConfiguration)theEObject;
				T result = casePortInstanceConfiguration(portInstanceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_LOCAL: {
				PortInstanceConfiguration_Local portInstanceConfiguration_Local = (PortInstanceConfiguration_Local)theEObject;
				T result = casePortInstanceConfiguration_Local(portInstanceConfiguration_Local);
				if (result == null) result = casePortInstanceConfiguration(portInstanceConfiguration_Local);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS: {
				PortInstanceConfiguration_DDS portInstanceConfiguration_DDS = (PortInstanceConfiguration_DDS)theEObject;
				T result = casePortInstanceConfiguration_DDS(portInstanceConfiguration_DDS);
				if (result == null) result = casePortInstanceConfiguration(portInstanceConfiguration_DDS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Muml_containerPackage.ECU_CONFIGURATION: {
				ECUConfiguration ecuConfiguration = (ECUConfiguration)theEObject;
				T result = caseECUConfiguration(ecuConfiguration);
				if (result == null) result = caseNamedElement(ecuConfiguration);
				if (result == null) result = caseExtendableElement(ecuConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Muml_containerPackage.MULTI_PORT_INSTANCE_CONFIGURATION: {
				MultiPortInstanceConfiguration multiPortInstanceConfiguration = (MultiPortInstanceConfiguration)theEObject;
				T result = caseMultiPortInstanceConfiguration(multiPortInstanceConfiguration);
				if (result == null) result = casePortInstanceConfiguration(multiPortInstanceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Muml_containerPackage.DEPLOYMENT_CONFIGURATION: {
				DeploymentConfiguration deploymentConfiguration = (DeploymentConfiguration)theEObject;
				T result = caseDeploymentConfiguration(deploymentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentContainer(ComponentContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Component Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Component Instance Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerComponentInstanceConfiguration(ContainerComponentInstanceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Instance Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortInstanceConfiguration(PortInstanceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Instance Configuration Local</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Instance Configuration Local</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortInstanceConfiguration_Local(PortInstanceConfiguration_Local object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Instance Configuration DDS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Instance Configuration DDS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortInstanceConfiguration_DDS(PortInstanceConfiguration_DDS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECU Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECU Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECUConfiguration(ECUConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Port Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Port Instance Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiPortInstanceConfiguration(MultiPortInstanceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentConfiguration(DeploymentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendableElement(ExtendableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Muml_containerSwitch

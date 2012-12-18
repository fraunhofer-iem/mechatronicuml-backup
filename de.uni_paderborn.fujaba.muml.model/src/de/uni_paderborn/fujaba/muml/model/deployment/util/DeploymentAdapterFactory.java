/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.deployment.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink;
import de.uni_paderborn.fujaba.muml.model.deployment.Deployment;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort;
import de.uni_paderborn.fujaba.muml.model.deployment.LinkQualityOfService;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage
 * @generated
 */
public class DeploymentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeploymentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DeploymentPackage.eINSTANCE;
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
	protected DeploymentSwitch<Adapter> modelSwitch =
		new DeploymentSwitch<Adapter>() {
			@Override
			public Adapter caseDeployment(Deployment object) {
				return createDeploymentAdapter();
			}
			@Override
			public Adapter caseHardwareNode(HardwareNode object) {
				return createHardwareNodeAdapter();
			}
			@Override
			public Adapter caseHardwarePort(HardwarePort object) {
				return createHardwarePortAdapter();
			}
			@Override
			public Adapter caseCommunicationLink(CommunicationLink object) {
				return createCommunicationLinkAdapter();
			}
			@Override
			public Adapter caseLinkQualityOfService(LinkQualityOfService object) {
				return createLinkQualityOfServiceAdapter();
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
			public Adapter caseCommentableElement(CommentableElement object) {
				return createCommentableElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.Deployment
	 * @generated
	 */
	public Adapter createDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode <em>Hardware Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode
	 * @generated
	 */
	public Adapter createHardwareNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort <em>Hardware Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort
	 * @generated
	 */
	public Adapter createHardwarePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink <em>Communication Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink
	 * @generated
	 */
	public Adapter createCommunicationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.model.deployment.LinkQualityOfService <em>Link Quality Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.LinkQualityOfService
	 * @generated
	 */
	public Adapter createLinkQualityOfServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.ExtendableElement <em>Extendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.ExtendableElement
	 * @generated
	 */
	public Adapter createExtendableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.CommentableElement
	 * @generated
	 */
	public Adapter createCommentableElementAdapter() {
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

} //DeploymentAdapterFactory

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.deployment;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.model.valuetype.NaturalNumber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Of Link Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Quality of Service of a communication link. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.QualityOfLinkService#getPacketDelayVariation <em>Packet Delay Variation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.QualityOfLinkService#getLatency <em>Latency</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.QualityOfLinkService#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getQualityOfLinkService()
 * @model
 * @generated
 */
public interface QualityOfLinkService extends CommentableElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Packet Delay Variation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Difference in end-to-end one-way delay between selected messages without lost messages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packet Delay Variation</em>' containment reference.
	 * @see #setPacketDelayVariation(NaturalNumber)
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getQualityOfLinkService_PacketDelayVariation()
	 * @model containment="true"
	 * @generated
	 */
	NaturalNumber getPacketDelayVariation();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.deployment.QualityOfLinkService#getPacketDelayVariation <em>Packet Delay Variation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Delay Variation</em>' containment reference.
	 * @see #getPacketDelayVariation()
	 * @generated
	 */
	void setPacketDelayVariation(NaturalNumber value);

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time from the source port sending a message to the destination port receiving it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latency</em>' containment reference.
	 * @see #setLatency(NaturalNumber)
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getQualityOfLinkService_Latency()
	 * @model containment="true"
	 * @generated
	 */
	NaturalNumber getLatency();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.deployment.QualityOfLinkService#getLatency <em>Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' containment reference.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(NaturalNumber value);

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getQualityOfLinkServices <em>Quality Of Link Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The deployment to which the service belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment</em>' container reference.
	 * @see #setDeployment(Deployment)
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getQualityOfLinkService_Deployment()
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getQualityOfLinkServices
	 * @model opposite="qualityOfLinkServices" transient="false"
	 * @generated
	 */
	Deployment getDeployment();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.deployment.QualityOfLinkService#getDeployment <em>Deployment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' container reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(Deployment value);

} // QualityOfLinkService

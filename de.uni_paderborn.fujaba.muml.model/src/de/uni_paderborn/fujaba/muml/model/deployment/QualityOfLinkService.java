/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.deployment;

import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.QualityOfLinkService#getDeplyoment <em>Deplyoment</em>}</li>
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
	 * Returns the value of the '<em><b>Deplyoment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getQualityOfLinkServices <em>Quality Of Link Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deplyoment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The deployment to which the service belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deplyoment</em>' container reference.
	 * @see #setDeplyoment(Deployment)
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getQualityOfLinkService_Deplyoment()
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getQualityOfLinkServices
	 * @model opposite="qualityOfLinkServices" transient="false"
	 * @generated
	 */
	Deployment getDeplyoment();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.deployment.QualityOfLinkService#getDeplyoment <em>Deplyoment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deplyoment</em>' container reference.
	 * @see #getDeplyoment()
	 * @generated
	 */
	void setDeplyoment(Deployment value);

} // QualityOfLinkService

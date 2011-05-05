/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.NamedElement;

import de.uni_paderborn.fujaba.umlrt.model.core.Cardinality;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ports represent the interaction points between a component and the components environment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getInvisibleInterfaces <em>Invisible Interfaces</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getComponent <em>Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getSpecification <em>Specification</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getFromPortToConnectorRev <em>From Port To Connector Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getToPortToConnectorRev <em>To Port To Connector Rev</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='body'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.cardinality.lowerBound->notEmpty()'"
 * @generated
 */
public interface Port extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Invisible Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Don't know.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invisible Interfaces</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_InvisibleInterfaces()
	 * @model
	 * @generated
	 */
	EList<EClass> getInvisibleInterfaces();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component this port belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_Component()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.Component#getPorts
	 * @model opposite="ports" transient="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Port Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.umlrt.model.component.PortKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of this port which can be either discrete, continuous, hybrid or hardware. This attribute can be derived by determining which port specifications the port possesses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.PortKind
	 * @see #setPortKind(PortKind)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_PortKind()
	 * @model derived="true"
	 * @generated
	 */
	PortKind getPortKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getPortKind <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.PortKind
	 * @see #getPortKind()
	 * @generated
	 */
	void setPortKind(PortKind value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.component.PortSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This association stores all port specifications this port realizes. Possible port specifications provide continuous or discrete behavior as well as the functionlity a hardware port provides.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_Specification()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortSpecification> getSpecification();

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cardinality of a port specifies how many instances of a port are allowed to exist at runtime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>From Port To Connector Rev</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType#getFromPort <em>From Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This association stores the connector this port is the source of. The connector can either be a delegation or an assembly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Port To Connector Rev</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_FromPortToConnectorRev()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType#getFromPort
	 * @model opposite="fromPort"
	 * @generated
	 */
	EList<ConnectorType> getFromPortToConnectorRev();

	/**
	 * Returns the value of the '<em><b>To Port To Connector Rev</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType#getToPort <em>To Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This association stores the connector this port is the target of. The connector can either be a delegation or an assembly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Port To Connector Rev</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getPort_ToPortToConnectorRev()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType#getToPort
	 * @model opposite="toPort"
	 * @generated
	 */
	EList<ConnectorType> getToPortToConnectorRev();

} // Port

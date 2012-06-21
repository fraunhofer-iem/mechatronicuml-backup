/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;
import org.storydriven.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class encapsules represents a configuration.
 * 
 * It contains all component instances and connector instances that belong to a concrete configuration.
 * 
 * \todosd{implement ocl derived for parent port isntances derived}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration#getConnectorInstances <em>Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration#getDirectParentPortInstances <em>Direct Parent Port Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getComponentInstanceConfiguration()
 * @model
 * @generated
 */
public interface ComponentInstanceConfiguration extends CommentableElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Component Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of component instances of a component instance configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getComponentInstanceConfiguration_ComponentInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getComponentInstances();

	/**
	 * Returns the value of the '<em><b>Connector Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of connector instances of a component instance configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getComponentInstanceConfiguration_ConnectorInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectorInstance> getConnectorInstances();

	/**
	 * Returns the value of the '<em><b>Direct Parent Port Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The direct port instances of the containing component instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direct Parent Port Instances</em>' containment reference list.
	 * @see #isSetDirectParentPortInstances()
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getComponentInstanceConfiguration_DirectParentPortInstances()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.eContainer().oclIsKindOf(ComponentInstance)) then\n\tself.eContainer().oclAsType(ComponentInstance).directPortInstances\nelse\n\tOrderedSet {}\nendif'"
	 * @generated
	 */
	EList<PortInstance> getDirectParentPortInstances();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration#getDirectParentPortInstances <em>Direct Parent Port Instances</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direct Parent Port Instances</em>' containment reference list is set.
	 * @see #getDirectParentPortInstances()
	 * @generated
	 */
	boolean isSetDirectParentPortInstances();

} // ComponentInstanceConfiguration

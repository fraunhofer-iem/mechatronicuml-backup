/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.pattern.Role;
import org.storydriven.modeling.calls.Callable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronization Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a type of a synchronization channel that can be used to synchronize
 * between statecharts contained as substatecharts in the same state.
 * Serves as a type for Synchronizations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.MessageType#getState <em>State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.MessageType#getSynchroChannelExpr <em>Synchro Channel Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.MessageType#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.MessageType#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel()
 * @model
 * @generated
 */
public interface MessageType extends Callable {
	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state in which this synchronization channel is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel_State()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getChannels
	 * @model opposite="channels" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.MessageType#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Synchro Channel Expr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchro Channel Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchro Channel Expr</em>' attribute.
	 * @see #isSetSynchroChannelExpr()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel_SynchroChannelExpr()
	 * @model default="" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='toMyString()'"
	 * @generated
	 */
	String getSynchroChannelExpr();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.MessageType#getSynchroChannelExpr <em>Synchro Channel Expr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Synchro Channel Expr</em>' attribute is set.
	 * @see #getSynchroChannelExpr()
	 * @generated
	 */
	boolean isSetSynchroChannelExpr();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.MessageType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' container reference.
	 * @see #setRole(Role)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel_Role()
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getChannels
	 * @model opposite="channels" transient="false"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.MessageType#getRole <em>Role</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' container reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String value =\"null\";\r\nboolean firstTime = true;\r\nif(name!=null) {\r\nvalue = name ;\r\nif(containedParameters!=null){\r\n\tvalue = value+\"(\";\r\n\tjava.util.Iterator<EParameter> iter = containedParameters.iterator();\r\n\twhile(iter.hasNext()){\r\n\t\tEParameter tmp = iter.next();\r\n\t\tif(tmp.getName()!=null && tmp.getEType()!=null && \r\n\t\t\ttmp.getEType().getInstanceTypeName()!=null){\t\t\t\t\r\n\t\t\t\tif(firstTime){\r\n\t\t\t\t\tfirstTime=false;\r\n\t\t\t\t\tvalue = value + tmp.getName() + \":\" + tmp.getEType().getName();\r\n\t\t\t\t}else{\r\n\t\t\t\t\tvalue = value +\", \"+ tmp.getName() + \":\" + tmp.getEType().getName() ;\r\n\t\t\t\t}\t\r\n\t\t\t}\r\n\t\t}\r\n\tvalue = value + \")\";\r\n\t}else{\r\n\t\tvalue = value+\"()\";\r\n\t}\r\n}\r\nreturn value;'"
	 * @generated
	 */
	String toMyString();

} // SynchronizationChannel

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.core;

import java.util.Map;

import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a realtime statechart.
 * TODO-SD: All references should moved to FujabaRealtimeStatechart, because an AbstractRealtimeStatechart abstracts from the concrete modeling.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getWcetDocument <em>Wcet Document</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getSystemWcetMap <em>System Wcet Map</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getUtilisation <em>Utilisation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getScheduleDocument <em>Schedule Document</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getBehavioralElement <em>Behavioral Element</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#isEmbedded <em>Embedded</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getAbstractRealtimeStatechart()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRealtimeStatechart extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Wcet Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * needed for WCET-analysis
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wcet Document</em>' attribute.
	 * @see #setWcetDocument(String)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getAbstractRealtimeStatechart_WcetDocument()
	 * @model
	 * @generated
	 */
	String getWcetDocument();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getWcetDocument <em>Wcet Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcet Document</em>' attribute.
	 * @see #getWcetDocument()
	 * @generated
	 */
	void setWcetDocument(String value);

	/**
	 * Returns the value of the '<em><b>Security Level</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * needed for WCET-analysis
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Level</em>' attribute.
	 * @see #setSecurityLevel(int)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getAbstractRealtimeStatechart_SecurityLevel()
	 * @model default="0"
	 * @generated
	 */
	int getSecurityLevel();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getSecurityLevel <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level</em>' attribute.
	 * @see #getSecurityLevel()
	 * @generated
	 */
	void setSecurityLevel(int value);

	/**
	 * Returns the value of the '<em><b>System Wcet Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * needed for WCET-analysis
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Wcet Map</em>' attribute.
	 * @see #setSystemWcetMap(Map)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getAbstractRealtimeStatechart_SystemWcetMap()
	 * @model dataType="de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.Map"
	 * @generated
	 */
	Map getSystemWcetMap();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getSystemWcetMap <em>System Wcet Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Wcet Map</em>' attribute.
	 * @see #getSystemWcetMap()
	 * @generated
	 */
	void setSystemWcetMap(Map value);

	/**
	 * Returns the value of the '<em><b>Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * needed for WCET-analysis
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Utilisation</em>' attribute.
	 * @see #setUtilisation(double)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getAbstractRealtimeStatechart_Utilisation()
	 * @model
	 * @generated
	 */
	double getUtilisation();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getUtilisation <em>Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilisation</em>' attribute.
	 * @see #getUtilisation()
	 * @generated
	 */
	void setUtilisation(double value);

	/**
	 * Returns the value of the '<em><b>Schedule Document</b></em>' attribute.
	 * The default value is <code>"\\\"schedule.xml\\\""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * needed for WCET-analysis
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Document</em>' attribute.
	 * @see #setScheduleDocument(String)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getAbstractRealtimeStatechart_ScheduleDocument()
	 * @model default="\\\"schedule.xml\\\""
	 * @generated
	 */
	String getScheduleDocument();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getScheduleDocument <em>Schedule Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Document</em>' attribute.
	 * @see #getScheduleDocument()
	 * @generated
	 */
	void setScheduleDocument(String value);

	/**
	 * Returns the value of the '<em><b>Behavioral Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.core.BehavioralElement#getRealtimeStatechart <em>Realtime Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behovioral element this statechart belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavioral Element</em>' reference.
	 * @see #setBehavioralElement(BehavioralElement)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getAbstractRealtimeStatechart_BehavioralElement()
	 * @see de.uni_paderborn.fujaba.muml.model.core.BehavioralElement#getRealtimeStatechart
	 * @model opposite="realtimeStatechart"
	 * @generated
	 */
	BehavioralElement getBehavioralElement();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#getBehavioralElement <em>Behavioral Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioral Element</em>' reference.
	 * @see #getBehavioralElement()
	 * @generated
	 */
	void setBehavioralElement(BehavioralElement value);

	/**
	 * Returns the value of the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute specifies whether this realtime statechart is embedded into a region or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded</em>' attribute.
	 * @see #setEmbedded(boolean)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getAbstractRealtimeStatechart_Embedded()
	 * @model derived="true"
	 * @generated
	 */
	boolean isEmbedded();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart#isEmbedded <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded</em>' attribute.
	 * @see #isEmbedded()
	 * @generated
	 */
	void setEmbedded(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns realtime statechart which represents the root of the hierarchy tree.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	AbstractRealtimeStatechart getHighestParentStatechart();

} // AbstractRealtimeStatechart

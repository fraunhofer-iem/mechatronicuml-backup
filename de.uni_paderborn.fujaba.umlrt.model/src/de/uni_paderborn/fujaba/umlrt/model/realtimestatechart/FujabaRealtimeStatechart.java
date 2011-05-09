/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fujaba Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is a concrete statechart implementation of a real-time statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FujabaRealtimeStatechart#getEmbeddingRegion <em>Embedding Region</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FujabaRealtimeStatechart#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFujabaRealtimeStatechart()
 * @model
 * @generated
 */
public interface FujabaRealtimeStatechart extends AbstractRealtimeStatechart {
	/**
	 * Returns the value of the '<em><b>Embedding Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedding Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedding Region</em>' reference.
	 * @see #setEmbeddingRegion(Region)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFujabaRealtimeStatechart_EmbeddingRegion()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region#getStatechart
	 * @model opposite="statechart"
	 * @generated
	 */
	Region getEmbeddingRegion();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FujabaRealtimeStatechart#getEmbeddingRegion <em>Embedding Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedding Region</em>' reference.
	 * @see #getEmbeddingRegion()
	 * @generated
	 */
	void setEmbeddingRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFujabaRealtimeStatechart_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDataType> getDataTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO: Delete?
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.MyList<org.eclipse.emf.ecore.EDataType>" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(embeddingRegion == null){\r\n\t\t\treturn getDataTypes();\r\n\t\t}\r\n\t\tde.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart root = embeddingRegion.getParentState().getRootRealtimeStatechart();\r\n\t\tif(root instanceof FujabaRealtimeStatechart){\r\n\t\t\treturn ((FujabaRealtimeStatechart)root).getDataTypes();\r\n\t\t}\r\n\t\treturn null;'"
	 * @generated
	 */
	List<EDataType> getTopLevelDataTypes();

} // FujabaRealtimeStatechart

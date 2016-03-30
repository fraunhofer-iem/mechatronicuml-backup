/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding;

import org.eclipse.emf.ecore.EObject;
import org.muml.psm.psm_instance.ParameterisableDiscreteSinglePortInstance;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realtime Statechart Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a binding for a parameter of a realtimestatechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding#getPortInstance <em>Port Instance</em>}</li>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage#getRealtimeStatechartParameterBinding()
 * @model abstract="true"
 * @generated
 */
public interface RealtimeStatechartParameterBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.psm.psm_instance.ParameterisableDiscreteSinglePortInstance#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instance of a discrete port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Instance</em>' container reference.
	 * @see #setPortInstance(ParameterisableDiscreteSinglePortInstance)
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage#getRealtimeStatechartParameterBinding_PortInstance()
	 * @see org.muml.psm.psm_instance.ParameterisableDiscreteSinglePortInstance#getBindings
	 * @model opposite="bindings" required="true" transient="false"
	 * @generated
	 */
	ParameterisableDiscreteSinglePortInstance getPortInstance();

	/**
	 * Sets the value of the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding#getPortInstance <em>Port Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Instance</em>' container reference.
	 * @see #getPortInstance()
	 * @generated
	 */
	void setPortInstance(ParameterisableDiscreteSinglePortInstance value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter, to which a concrete value will be assigned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(RealtimeStatechartParameter)
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage#getRealtimeStatechartParameterBinding_Parameter()
	 * @model required="true"
	 * @generated
	 */
	RealtimeStatechartParameter getParameter();

	/**
	 * Sets the value of the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(RealtimeStatechartParameter value);

} // RealtimeStatechartParameterBinding

/**
 */
package org.muml.psm.psm_instance;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.instance.DiscreteSinglePortInstance;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterisable Discrete Single Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is a extension of a discrete port at instance level. The behavior of this port instance can have parameters. To these parameters this class defines parameter bindings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.psm_instance.ParameterisableDiscreteSinglePortInstance#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.psm_instance.Psm_instancePackage#getParameterisableDiscreteSinglePortInstance()
 * @model
 * @generated
 */
public interface ParameterisableDiscreteSinglePortInstance extends DiscreteSinglePortInstance {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding}.
	 * It is bidirectional and its opposite is '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding#getPortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter bindings for each parameter of the statechart of the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.muml.psm.psm_instance.Psm_instancePackage#getParameterisableDiscreteSinglePortInstance_Bindings()
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding#getPortInstance
	 * @model opposite="portInstance" containment="true"
	 * @generated
	 */
	EList<RealtimeStatechartParameterBinding> getBindings();

} // ParameterisableDiscreteSinglePortInstance

/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tcp Transport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getLocal_address_str <em>Local address str</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getEnable_nagle_algorithm <em>Enable nagle algorithm</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getConn_retry_initial_delay <em>Conn retry initial delay</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getConn_retry_backoff_multiplier <em>Conn retry backoff multiplier</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getConn_retry_attempts <em>Conn retry attempts</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getMax_output_pause_period <em>Max output pause period</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getPassive_reconnect_duration <em>Passive reconnect duration</em>}</li>
 * </ul>
 *
 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTcpTransport()
 * @model
 * @generated
 */
public interface TcpTransport extends TransportInst {
	/**
	 * Returns the value of the '<em><b>Local address str</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local address str</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local address str</em>' containment reference.
	 * @see #setLocal_address_str(LocalAddressString)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTcpTransport_Local_address_str()
	 * @model containment="true"
	 * @generated
	 */
	LocalAddressString getLocal_address_str();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getLocal_address_str <em>Local address str</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local address str</em>' containment reference.
	 * @see #getLocal_address_str()
	 * @generated
	 */
	void setLocal_address_str(LocalAddressString value);

	/**
	 * Returns the value of the '<em><b>Enable nagle algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable nagle algorithm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable nagle algorithm</em>' containment reference.
	 * @see #setEnable_nagle_algorithm(EnableNagleAlgorithm)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTcpTransport_Enable_nagle_algorithm()
	 * @model containment="true"
	 * @generated
	 */
	EnableNagleAlgorithm getEnable_nagle_algorithm();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getEnable_nagle_algorithm <em>Enable nagle algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable nagle algorithm</em>' containment reference.
	 * @see #getEnable_nagle_algorithm()
	 * @generated
	 */
	void setEnable_nagle_algorithm(EnableNagleAlgorithm value);

	/**
	 * Returns the value of the '<em><b>Conn retry initial delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conn retry initial delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conn retry initial delay</em>' containment reference.
	 * @see #setConn_retry_initial_delay(ConnRetryInitialDelay)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTcpTransport_Conn_retry_initial_delay()
	 * @model containment="true"
	 * @generated
	 */
	ConnRetryInitialDelay getConn_retry_initial_delay();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getConn_retry_initial_delay <em>Conn retry initial delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn retry initial delay</em>' containment reference.
	 * @see #getConn_retry_initial_delay()
	 * @generated
	 */
	void setConn_retry_initial_delay(ConnRetryInitialDelay value);

	/**
	 * Returns the value of the '<em><b>Conn retry backoff multiplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conn retry backoff multiplier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conn retry backoff multiplier</em>' containment reference.
	 * @see #setConn_retry_backoff_multiplier(ConnRetryBackoffMultiplier)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTcpTransport_Conn_retry_backoff_multiplier()
	 * @model containment="true"
	 * @generated
	 */
	ConnRetryBackoffMultiplier getConn_retry_backoff_multiplier();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getConn_retry_backoff_multiplier <em>Conn retry backoff multiplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn retry backoff multiplier</em>' containment reference.
	 * @see #getConn_retry_backoff_multiplier()
	 * @generated
	 */
	void setConn_retry_backoff_multiplier(ConnRetryBackoffMultiplier value);

	/**
	 * Returns the value of the '<em><b>Conn retry attempts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conn retry attempts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conn retry attempts</em>' containment reference.
	 * @see #setConn_retry_attempts(ConnRetryAttempts)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTcpTransport_Conn_retry_attempts()
	 * @model containment="true"
	 * @generated
	 */
	ConnRetryAttempts getConn_retry_attempts();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getConn_retry_attempts <em>Conn retry attempts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn retry attempts</em>' containment reference.
	 * @see #getConn_retry_attempts()
	 * @generated
	 */
	void setConn_retry_attempts(ConnRetryAttempts value);

	/**
	 * Returns the value of the '<em><b>Max output pause period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max output pause period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max output pause period</em>' containment reference.
	 * @see #setMax_output_pause_period(MaxOutputPausePeriod)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTcpTransport_Max_output_pause_period()
	 * @model containment="true"
	 * @generated
	 */
	MaxOutputPausePeriod getMax_output_pause_period();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getMax_output_pause_period <em>Max output pause period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max output pause period</em>' containment reference.
	 * @see #getMax_output_pause_period()
	 * @generated
	 */
	void setMax_output_pause_period(MaxOutputPausePeriod value);

	/**
	 * Returns the value of the '<em><b>Passive reconnect duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passive reconnect duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passive reconnect duration</em>' containment reference.
	 * @see #setPassive_reconnect_duration(PassiveReconnectDuration)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTcpTransport_Passive_reconnect_duration()
	 * @model containment="true"
	 * @generated
	 */
	PassiveReconnectDuration getPassive_reconnect_duration();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport#getPassive_reconnect_duration <em>Passive reconnect duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passive reconnect duration</em>' containment reference.
	 * @see #getPassive_reconnect_duration()
	 * @generated
	 */
	void setPassive_reconnect_duration(PassiveReconnectDuration value);

} // TcpTransport

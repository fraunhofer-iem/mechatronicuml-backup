/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multicast Transport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getDefault_to_ipv6 <em>Default to ipv6</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getPort_offset <em>Port offset</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getGroup_address <em>Group address</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getReliable <em>Reliable</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getSyn_backoff <em>Syn backoff</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getSyn_interval <em>Syn interval</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getSyn_timeout <em>Syn timeout</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_depth <em>Nak depth</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_interval <em>Nak interval</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_max <em>Nak max</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_timeout <em>Nak timeout</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getTtl <em>Ttl</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getRcv_buffer_size <em>Rcv buffer size</em>}</li>
 * </ul>
 *
 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getMulticastTransport()
 * @model
 * @generated
 */
public interface MulticastTransport extends TransportInst {
	/**
	 * Returns the value of the '<em><b>Default to ipv6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default to ipv6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default to ipv6</em>' containment reference.
	 * @see #setDefault_to_ipv6(DefaultToIPv6)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getMulticastTransport_Default_to_ipv6()
	 * @model containment="true"
	 * @generated
	 */
	DefaultToIPv6 getDefault_to_ipv6();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getDefault_to_ipv6 <em>Default to ipv6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default to ipv6</em>' containment reference.
	 * @see #getDefault_to_ipv6()
	 * @generated
	 */
	void setDefault_to_ipv6(DefaultToIPv6 value);

	/**
	 * Returns the value of the '<em><b>Port offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port offset</em>' containment reference.
	 * @see #setPort_offset(PortOffset)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getMulticastTransport_Port_offset()
	 * @model containment="true"
	 * @generated
	 */
	PortOffset getPort_offset();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getPort_offset <em>Port offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port offset</em>' containment reference.
	 * @see #getPort_offset()
	 * @generated
	 */
	void setPort_offset(PortOffset value);

	/**
	 * Returns the value of the '<em><b>Group address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group address</em>' containment reference.
	 * @see #setGroup_address(GroupAddress)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getMulticastTransport_Group_address()
	 * @model containment="true"
	 * @generated
	 */
	GroupAddress getGroup_address();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getGroup_address <em>Group address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group address</em>' containment reference.
	 * @see #getGroup_address()
	 * @generated
	 */
	void setGroup_address(GroupAddress value);

	/**
	 * Returns the value of the '<em><b>Reliable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliable</em>' containment reference.
	 * @see #setReliable(Reliable)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getMulticastTransport_Reliable()
	 * @model containment="true"
	 * @generated
	 */
	Reliable getReliable();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getReliable <em>Reliable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliable</em>' containment reference.
	 * @see #getReliable()
	 * @generated
	 */
	void setReliable(Reliable value);

	/**
	 * Returns the value of the '<em><b>Syn backoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syn backoff</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syn backoff</em>' containment reference.
	 * @see #setSyn_backoff(SynBackoff)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getMulticastTransport_Syn_backoff()
	 * @model containment="true"
	 * @generated
	 */
	SynBackoff getSyn_backoff();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getSyn_backoff <em>Syn backoff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syn backoff</em>' containment reference.
	 * @see #getSyn_backoff()
	 * @generated
	 */
	void setSyn_backoff(SynBackoff value);

	/**
	 * Returns the value of the '<em><b>Syn interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syn interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syn interval</em>' containment reference.
	 * @see #setSyn_interval(SynInterval)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getMulticastTransport_Syn_interval()
	 * @model containment="true"
	 * @generated
	 */
	SynInterval getSyn_interval();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getSyn_interval <em>Syn interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syn interval</em>' containment reference.
	 * @see #getSyn_interval()
	 * @generated
	 */
	void setSyn_interval(SynInterval value);

	/**
	 * Returns the value of the '<em><b>Syn timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syn timeout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syn timeout</em>' containment reference.
	 * @see #setSyn_timeout(SynTimeout)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getMulticastTransport_Syn_timeout()
	 * @model containment="true"
	 * @generated
	 */
	SynTimeout getSyn_timeout();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getSyn_timeout <em>Syn timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syn timeout</em>' containment reference.
	 * @see #getSyn_timeout()
	 * @generated
	 */
	void setSyn_timeout(SynTimeout value);

	/**
	 * Returns the value of the '<em><b>Nak depth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nak depth</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nak depth</em>' containment reference.
	 * @see #setNak_depth(NakDepth)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getMulticastTransport_Nak_depth()
	 * @model containment="true"
	 * @generated
	 */
	NakDepth getNak_depth();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_depth <em>Nak depth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nak depth</em>' containment reference.
	 * @see #getNak_depth()
	 * @generated
	 */
	void setNak_depth(NakDepth value);

	/**
	 * Returns the value of the '<em><b>Nak interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nak interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nak interval</em>' containment reference.
	 * @see #setNak_interval(NakInterval)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getMulticastTransport_Nak_interval()
	 * @model containment="true"
	 * @generated
	 */
	NakInterval getNak_interval();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_interval <em>Nak interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nak interval</em>' containment reference.
	 * @see #getNak_interval()
	 * @generated
	 */
	void setNak_interval(NakInterval value);

	/**
	 * Returns the value of the '<em><b>Nak max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nak max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nak max</em>' reference.
	 * @see #setNak_max(NakMax)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getMulticastTransport_Nak_max()
	 * @model
	 * @generated
	 */
	NakMax getNak_max();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_max <em>Nak max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nak max</em>' reference.
	 * @see #getNak_max()
	 * @generated
	 */
	void setNak_max(NakMax value);

	/**
	 * Returns the value of the '<em><b>Nak timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nak timeout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nak timeout</em>' containment reference.
	 * @see #setNak_timeout(NakTimeout)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getMulticastTransport_Nak_timeout()
	 * @model containment="true"
	 * @generated
	 */
	NakTimeout getNak_timeout();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getNak_timeout <em>Nak timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nak timeout</em>' containment reference.
	 * @see #getNak_timeout()
	 * @generated
	 */
	void setNak_timeout(NakTimeout value);

	/**
	 * Returns the value of the '<em><b>Ttl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ttl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ttl</em>' containment reference.
	 * @see #setTtl(TTL)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getMulticastTransport_Ttl()
	 * @model containment="true"
	 * @generated
	 */
	TTL getTtl();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getTtl <em>Ttl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ttl</em>' containment reference.
	 * @see #getTtl()
	 * @generated
	 */
	void setTtl(TTL value);

	/**
	 * Returns the value of the '<em><b>Rcv buffer size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rcv buffer size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rcv buffer size</em>' containment reference.
	 * @see #setRcv_buffer_size(RcvBufferSIze)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getMulticastTransport_Rcv_buffer_size()
	 * @model containment="true"
	 * @generated
	 */
	RcvBufferSIze getRcv_buffer_size();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport#getRcv_buffer_size <em>Rcv buffer size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rcv buffer size</em>' containment reference.
	 * @see #getRcv_buffer_size()
	 * @generated
	 */
	void setRcv_buffer_size(RcvBufferSIze value);

} // MulticastTransport

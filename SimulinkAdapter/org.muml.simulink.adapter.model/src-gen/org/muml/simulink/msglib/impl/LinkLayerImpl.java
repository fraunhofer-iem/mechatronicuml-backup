/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.msglib.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.simulink.impl.BlockImpl;
import org.muml.simulink.msglib.LinkLayer;
import org.muml.simulink.msglib.MsglibPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.msglib.impl.LinkLayerImpl#getDelayMin <em>Delay Min</em>}</li>
 *   <li>{@link org.muml.simulink.msglib.impl.LinkLayerImpl#getDelayMax <em>Delay Max</em>}</li>
 *   <li>{@link org.muml.simulink.msglib.impl.LinkLayerImpl#getMessageLossProbability <em>Message Loss Probability</em>}</li>
 *   <li>{@link org.muml.simulink.msglib.impl.LinkLayerImpl#isMessageRetransmission <em>Message Retransmission</em>}</li>
 *   <li>{@link org.muml.simulink.msglib.impl.LinkLayerImpl#isBufferOverflowPossible <em>Buffer Overflow Possible</em>}</li>
 *   <li>{@link org.muml.simulink.msglib.impl.LinkLayerImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.muml.simulink.msglib.impl.LinkLayerImpl#getSourceBufferSize <em>Source Buffer Size</em>}</li>
 *   <li>{@link org.muml.simulink.msglib.impl.LinkLayerImpl#getMessageMapping <em>Message Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkLayerImpl extends BlockImpl implements LinkLayer {
	/**
	 * The default value of the '{@link #getDelayMin() <em>Delay Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayMin()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_MIN_EDEFAULT = "2";
	/**
	 * The cached value of the '{@link #getDelayMin() <em>Delay Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayMin()
	 * @generated
	 * @ordered
	 */
	protected String delayMin = DELAY_MIN_EDEFAULT;
	/**
	 * The default value of the '{@link #getDelayMax() <em>Delay Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayMax()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_MAX_EDEFAULT = "100";
	/**
	 * The cached value of the '{@link #getDelayMax() <em>Delay Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayMax()
	 * @generated
	 * @ordered
	 */
	protected String delayMax = DELAY_MAX_EDEFAULT;
	/**
	 * The default value of the '{@link #getMessageLossProbability() <em>Message Loss Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageLossProbability()
	 * @generated
	 * @ordered
	 */
	protected static final int MESSAGE_LOSS_PROBABILITY_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getMessageLossProbability() <em>Message Loss Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageLossProbability()
	 * @generated
	 * @ordered
	 */
	protected int messageLossProbability = MESSAGE_LOSS_PROBABILITY_EDEFAULT;
	/**
	 * The default value of the '{@link #isMessageRetransmission() <em>Message Retransmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageRetransmission()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MESSAGE_RETRANSMISSION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isMessageRetransmission() <em>Message Retransmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageRetransmission()
	 * @generated
	 * @ordered
	 */
	protected boolean messageRetransmission = MESSAGE_RETRANSMISSION_EDEFAULT;
	/**
	 * The default value of the '{@link #isBufferOverflowPossible() <em>Buffer Overflow Possible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBufferOverflowPossible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUFFER_OVERFLOW_POSSIBLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isBufferOverflowPossible() <em>Buffer Overflow Possible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBufferOverflowPossible()
	 * @generated
	 * @ordered
	 */
	protected boolean bufferOverflowPossible = BUFFER_OVERFLOW_POSSIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final int BUFFER_SIZE_EDEFAULT = 10;
	/**
	 * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected int bufferSize = BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceBufferSize() <em>Source Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SOURCE_BUFFER_SIZE_EDEFAULT = 10;
	/**
	 * The cached value of the '{@link #getSourceBufferSize() <em>Source Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceBufferSize()
	 * @generated
	 * @ordered
	 */
	protected int sourceBufferSize = SOURCE_BUFFER_SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getMessageMapping() <em>Message Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageMapping()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_MAPPING_EDEFAULT = "[1 1; 2 1]";
	/**
	 * The cached value of the '{@link #getMessageMapping() <em>Message Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageMapping()
	 * @generated
	 * @ordered
	 */
	protected String messageMapping = MESSAGE_MAPPING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsglibPackage.Literals.LINK_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelayMin() {
		return delayMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayMin(String newDelayMin) {
		String oldDelayMin = delayMin;
		delayMin = newDelayMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsglibPackage.LINK_LAYER__DELAY_MIN, oldDelayMin, delayMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelayMax() {
		return delayMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayMax(String newDelayMax) {
		String oldDelayMax = delayMax;
		delayMax = newDelayMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsglibPackage.LINK_LAYER__DELAY_MAX, oldDelayMax, delayMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMessageLossProbability() {
		return messageLossProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageLossProbability(int newMessageLossProbability) {
		int oldMessageLossProbability = messageLossProbability;
		messageLossProbability = newMessageLossProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsglibPackage.LINK_LAYER__MESSAGE_LOSS_PROBABILITY, oldMessageLossProbability, messageLossProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMessageRetransmission() {
		return messageRetransmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageRetransmission(boolean newMessageRetransmission) {
		boolean oldMessageRetransmission = messageRetransmission;
		messageRetransmission = newMessageRetransmission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsglibPackage.LINK_LAYER__MESSAGE_RETRANSMISSION, oldMessageRetransmission, messageRetransmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBufferOverflowPossible() {
		return bufferOverflowPossible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferOverflowPossible(boolean newBufferOverflowPossible) {
		boolean oldBufferOverflowPossible = bufferOverflowPossible;
		bufferOverflowPossible = newBufferOverflowPossible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsglibPackage.LINK_LAYER__BUFFER_OVERFLOW_POSSIBLE, oldBufferOverflowPossible, bufferOverflowPossible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBufferSize() {
		return bufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferSize(int newBufferSize) {
		int oldBufferSize = bufferSize;
		bufferSize = newBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsglibPackage.LINK_LAYER__BUFFER_SIZE, oldBufferSize, bufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSourceBufferSize() {
		return sourceBufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceBufferSize(int newSourceBufferSize) {
		int oldSourceBufferSize = sourceBufferSize;
		sourceBufferSize = newSourceBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsglibPackage.LINK_LAYER__SOURCE_BUFFER_SIZE, oldSourceBufferSize, sourceBufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageMapping() {
		return messageMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageMapping(String newMessageMapping) {
		String oldMessageMapping = messageMapping;
		messageMapping = newMessageMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsglibPackage.LINK_LAYER__MESSAGE_MAPPING, oldMessageMapping, messageMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MsglibPackage.LINK_LAYER__DELAY_MIN:
				return getDelayMin();
			case MsglibPackage.LINK_LAYER__DELAY_MAX:
				return getDelayMax();
			case MsglibPackage.LINK_LAYER__MESSAGE_LOSS_PROBABILITY:
				return getMessageLossProbability();
			case MsglibPackage.LINK_LAYER__MESSAGE_RETRANSMISSION:
				return isMessageRetransmission();
			case MsglibPackage.LINK_LAYER__BUFFER_OVERFLOW_POSSIBLE:
				return isBufferOverflowPossible();
			case MsglibPackage.LINK_LAYER__BUFFER_SIZE:
				return getBufferSize();
			case MsglibPackage.LINK_LAYER__SOURCE_BUFFER_SIZE:
				return getSourceBufferSize();
			case MsglibPackage.LINK_LAYER__MESSAGE_MAPPING:
				return getMessageMapping();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MsglibPackage.LINK_LAYER__DELAY_MIN:
				setDelayMin((String)newValue);
				return;
			case MsglibPackage.LINK_LAYER__DELAY_MAX:
				setDelayMax((String)newValue);
				return;
			case MsglibPackage.LINK_LAYER__MESSAGE_LOSS_PROBABILITY:
				setMessageLossProbability((Integer)newValue);
				return;
			case MsglibPackage.LINK_LAYER__MESSAGE_RETRANSMISSION:
				setMessageRetransmission((Boolean)newValue);
				return;
			case MsglibPackage.LINK_LAYER__BUFFER_OVERFLOW_POSSIBLE:
				setBufferOverflowPossible((Boolean)newValue);
				return;
			case MsglibPackage.LINK_LAYER__BUFFER_SIZE:
				setBufferSize((Integer)newValue);
				return;
			case MsglibPackage.LINK_LAYER__SOURCE_BUFFER_SIZE:
				setSourceBufferSize((Integer)newValue);
				return;
			case MsglibPackage.LINK_LAYER__MESSAGE_MAPPING:
				setMessageMapping((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MsglibPackage.LINK_LAYER__DELAY_MIN:
				setDelayMin(DELAY_MIN_EDEFAULT);
				return;
			case MsglibPackage.LINK_LAYER__DELAY_MAX:
				setDelayMax(DELAY_MAX_EDEFAULT);
				return;
			case MsglibPackage.LINK_LAYER__MESSAGE_LOSS_PROBABILITY:
				setMessageLossProbability(MESSAGE_LOSS_PROBABILITY_EDEFAULT);
				return;
			case MsglibPackage.LINK_LAYER__MESSAGE_RETRANSMISSION:
				setMessageRetransmission(MESSAGE_RETRANSMISSION_EDEFAULT);
				return;
			case MsglibPackage.LINK_LAYER__BUFFER_OVERFLOW_POSSIBLE:
				setBufferOverflowPossible(BUFFER_OVERFLOW_POSSIBLE_EDEFAULT);
				return;
			case MsglibPackage.LINK_LAYER__BUFFER_SIZE:
				setBufferSize(BUFFER_SIZE_EDEFAULT);
				return;
			case MsglibPackage.LINK_LAYER__SOURCE_BUFFER_SIZE:
				setSourceBufferSize(SOURCE_BUFFER_SIZE_EDEFAULT);
				return;
			case MsglibPackage.LINK_LAYER__MESSAGE_MAPPING:
				setMessageMapping(MESSAGE_MAPPING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MsglibPackage.LINK_LAYER__DELAY_MIN:
				return DELAY_MIN_EDEFAULT == null ? delayMin != null : !DELAY_MIN_EDEFAULT.equals(delayMin);
			case MsglibPackage.LINK_LAYER__DELAY_MAX:
				return DELAY_MAX_EDEFAULT == null ? delayMax != null : !DELAY_MAX_EDEFAULT.equals(delayMax);
			case MsglibPackage.LINK_LAYER__MESSAGE_LOSS_PROBABILITY:
				return messageLossProbability != MESSAGE_LOSS_PROBABILITY_EDEFAULT;
			case MsglibPackage.LINK_LAYER__MESSAGE_RETRANSMISSION:
				return messageRetransmission != MESSAGE_RETRANSMISSION_EDEFAULT;
			case MsglibPackage.LINK_LAYER__BUFFER_OVERFLOW_POSSIBLE:
				return bufferOverflowPossible != BUFFER_OVERFLOW_POSSIBLE_EDEFAULT;
			case MsglibPackage.LINK_LAYER__BUFFER_SIZE:
				return bufferSize != BUFFER_SIZE_EDEFAULT;
			case MsglibPackage.LINK_LAYER__SOURCE_BUFFER_SIZE:
				return sourceBufferSize != SOURCE_BUFFER_SIZE_EDEFAULT;
			case MsglibPackage.LINK_LAYER__MESSAGE_MAPPING:
				return MESSAGE_MAPPING_EDEFAULT == null ? messageMapping != null : !MESSAGE_MAPPING_EDEFAULT.equals(messageMapping);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (delayMin: ");
		result.append(delayMin);
		result.append(", delayMax: ");
		result.append(delayMax);
		result.append(", messageLossProbability: ");
		result.append(messageLossProbability);
		result.append(", messageRetransmission: ");
		result.append(messageRetransmission);
		result.append(", bufferOverflowPossible: ");
		result.append(bufferOverflowPossible);
		result.append(", bufferSize: ");
		result.append(bufferSize);
		result.append(", sourceBufferSize: ");
		result.append(sourceBufferSize);
		result.append(", messageMapping: ");
		result.append(messageMapping);
		result.append(')');
		return result.toString();
	}

} //LinkLayerImpl

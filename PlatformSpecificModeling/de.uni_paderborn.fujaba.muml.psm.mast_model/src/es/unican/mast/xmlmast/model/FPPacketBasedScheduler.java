/**
 */
package es.unican.mast.xmlmast.model;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FP Packet Based Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getMaxPriority <em>Max Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getMinPriority <em>Min Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadAvgSize <em>Packet Overhead Avg Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadMaxSize <em>Packet Overhead Max Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadMinSize <em>Packet Overhead Min Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getFPPacketBasedScheduler()
 * @model extendedMetaData="name='FP_Packet_Based_Scheduler' kind='empty'"
 * @generated
 */
public interface FPPacketBasedScheduler extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Priority</em>' attribute.
	 * @see #setMaxPriority(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getFPPacketBasedScheduler_MaxPriority()
	 * @model dataType="es.unican.mast.xmlmast.model.Priority"
	 *        extendedMetaData="kind='attribute' name='Max_Priority'"
	 * @generated
	 */
	BigInteger getMaxPriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getMaxPriority <em>Max Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Priority</em>' attribute.
	 * @see #getMaxPriority()
	 * @generated
	 */
	void setMaxPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Min Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Priority</em>' attribute.
	 * @see #setMinPriority(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getFPPacketBasedScheduler_MinPriority()
	 * @model dataType="es.unican.mast.xmlmast.model.Priority"
	 *        extendedMetaData="kind='attribute' name='Min_Priority'"
	 * @generated
	 */
	BigInteger getMinPriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getMinPriority <em>Min Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Priority</em>' attribute.
	 * @see #getMinPriority()
	 * @generated
	 */
	void setMinPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Packet Overhead Avg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Overhead Avg Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Overhead Avg Size</em>' attribute.
	 * @see #isSetPacketOverheadAvgSize()
	 * @see #unsetPacketOverheadAvgSize()
	 * @see #setPacketOverheadAvgSize(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getFPPacketBasedScheduler_PacketOverheadAvgSize()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.BitCount"
	 *        extendedMetaData="kind='attribute' name='Packet_Overhead_Avg_Size'"
	 * @generated
	 */
	float getPacketOverheadAvgSize();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadAvgSize <em>Packet Overhead Avg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Overhead Avg Size</em>' attribute.
	 * @see #isSetPacketOverheadAvgSize()
	 * @see #unsetPacketOverheadAvgSize()
	 * @see #getPacketOverheadAvgSize()
	 * @generated
	 */
	void setPacketOverheadAvgSize(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadAvgSize <em>Packet Overhead Avg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPacketOverheadAvgSize()
	 * @see #getPacketOverheadAvgSize()
	 * @see #setPacketOverheadAvgSize(float)
	 * @generated
	 */
	void unsetPacketOverheadAvgSize();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadAvgSize <em>Packet Overhead Avg Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Packet Overhead Avg Size</em>' attribute is set.
	 * @see #unsetPacketOverheadAvgSize()
	 * @see #getPacketOverheadAvgSize()
	 * @see #setPacketOverheadAvgSize(float)
	 * @generated
	 */
	boolean isSetPacketOverheadAvgSize();

	/**
	 * Returns the value of the '<em><b>Packet Overhead Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Overhead Max Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Overhead Max Size</em>' attribute.
	 * @see #isSetPacketOverheadMaxSize()
	 * @see #unsetPacketOverheadMaxSize()
	 * @see #setPacketOverheadMaxSize(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getFPPacketBasedScheduler_PacketOverheadMaxSize()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.BitCount"
	 *        extendedMetaData="kind='attribute' name='Packet_Overhead_Max_Size'"
	 * @generated
	 */
	float getPacketOverheadMaxSize();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadMaxSize <em>Packet Overhead Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Overhead Max Size</em>' attribute.
	 * @see #isSetPacketOverheadMaxSize()
	 * @see #unsetPacketOverheadMaxSize()
	 * @see #getPacketOverheadMaxSize()
	 * @generated
	 */
	void setPacketOverheadMaxSize(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadMaxSize <em>Packet Overhead Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPacketOverheadMaxSize()
	 * @see #getPacketOverheadMaxSize()
	 * @see #setPacketOverheadMaxSize(float)
	 * @generated
	 */
	void unsetPacketOverheadMaxSize();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadMaxSize <em>Packet Overhead Max Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Packet Overhead Max Size</em>' attribute is set.
	 * @see #unsetPacketOverheadMaxSize()
	 * @see #getPacketOverheadMaxSize()
	 * @see #setPacketOverheadMaxSize(float)
	 * @generated
	 */
	boolean isSetPacketOverheadMaxSize();

	/**
	 * Returns the value of the '<em><b>Packet Overhead Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Overhead Min Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Overhead Min Size</em>' attribute.
	 * @see #isSetPacketOverheadMinSize()
	 * @see #unsetPacketOverheadMinSize()
	 * @see #setPacketOverheadMinSize(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getFPPacketBasedScheduler_PacketOverheadMinSize()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.BitCount"
	 *        extendedMetaData="kind='attribute' name='Packet_Overhead_Min_Size'"
	 * @generated
	 */
	float getPacketOverheadMinSize();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadMinSize <em>Packet Overhead Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Overhead Min Size</em>' attribute.
	 * @see #isSetPacketOverheadMinSize()
	 * @see #unsetPacketOverheadMinSize()
	 * @see #getPacketOverheadMinSize()
	 * @generated
	 */
	void setPacketOverheadMinSize(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadMinSize <em>Packet Overhead Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPacketOverheadMinSize()
	 * @see #getPacketOverheadMinSize()
	 * @see #setPacketOverheadMinSize(float)
	 * @generated
	 */
	void unsetPacketOverheadMinSize();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler#getPacketOverheadMinSize <em>Packet Overhead Min Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Packet Overhead Min Size</em>' attribute is set.
	 * @see #unsetPacketOverheadMinSize()
	 * @see #getPacketOverheadMinSize()
	 * @see #setPacketOverheadMinSize(float)
	 * @generated
	 */
	boolean isSetPacketOverheadMinSize();

} // FPPacketBasedScheduler

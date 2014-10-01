/**
 */
package es.unican.mast.xmlmast.trace.impl;

import es.unican.mast.xmlmast.trace.MsgList;
import es.unican.mast.xmlmast.trace.MsgTypeList;
import es.unican.mast.xmlmast.trace.SrcList;
import es.unican.mast.xmlmast.trace.TRACEFILEType;
import es.unican.mast.xmlmast.trace.TracePackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TRACEFILE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.trace.impl.TRACEFILETypeImpl#getMsgTypeList <em>Msg Type List</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.impl.TRACEFILETypeImpl#getSrcList <em>Src List</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.impl.TRACEFILETypeImpl#getMsgList <em>Msg List</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.impl.TRACEFILETypeImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.impl.TRACEFILETypeImpl#getGenerationDate <em>Generation Date</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.impl.TRACEFILETypeImpl#getGenerationProfile <em>Generation Profile</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.impl.TRACEFILETypeImpl#getGenerationTool <em>Generation Tool</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.impl.TRACEFILETypeImpl#getModelDate <em>Model Date</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.impl.TRACEFILETypeImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.impl.TRACEFILETypeImpl#getStartTime <em>Start Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TRACEFILETypeImpl extends MinimalEObjectImpl.Container implements TRACEFILEType {
	/**
	 * The cached value of the '{@link #getMsgTypeList() <em>Msg Type List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgTypeList()
	 * @generated
	 * @ordered
	 */
	protected MsgTypeList msgTypeList;

	/**
	 * The cached value of the '{@link #getSrcList() <em>Src List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcList()
	 * @generated
	 * @ordered
	 */
	protected SrcList srcList;

	/**
	 * The cached value of the '{@link #getMsgList() <em>Msg List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgList()
	 * @generated
	 * @ordered
	 */
	protected MsgList msgList;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final float END_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected float endTime = END_TIME_EDEFAULT;

	/**
	 * This is true if the End Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endTimeESet;

	/**
	 * The default value of the '{@link #getGenerationDate() <em>Generation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GENERATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerationDate() <em>Generation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar generationDate = GENERATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerationProfile() <em>Generation Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationProfile()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATION_PROFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerationProfile() <em>Generation Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationProfile()
	 * @generated
	 * @ordered
	 */
	protected String generationProfile = GENERATION_PROFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerationTool() <em>Generation Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationTool()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATION_TOOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerationTool() <em>Generation Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationTool()
	 * @generated
	 * @ordered
	 */
	protected String generationTool = GENERATION_TOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelDate() <em>Model Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MODEL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelDate() <em>Model Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar modelDate = MODEL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final float START_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected float startTime = START_TIME_EDEFAULT;

	/**
	 * This is true if the Start Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startTimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRACEFILETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.TRACEFILE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgTypeList getMsgTypeList() {
		return msgTypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgTypeList(MsgTypeList newMsgTypeList, NotificationChain msgs) {
		MsgTypeList oldMsgTypeList = msgTypeList;
		msgTypeList = newMsgTypeList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracePackage.TRACEFILE_TYPE__MSG_TYPE_LIST, oldMsgTypeList, newMsgTypeList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsgTypeList(MsgTypeList newMsgTypeList) {
		if (newMsgTypeList != msgTypeList) {
			NotificationChain msgs = null;
			if (msgTypeList != null)
				msgs = ((InternalEObject)msgTypeList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TracePackage.TRACEFILE_TYPE__MSG_TYPE_LIST, null, msgs);
			if (newMsgTypeList != null)
				msgs = ((InternalEObject)newMsgTypeList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TracePackage.TRACEFILE_TYPE__MSG_TYPE_LIST, null, msgs);
			msgs = basicSetMsgTypeList(newMsgTypeList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACEFILE_TYPE__MSG_TYPE_LIST, newMsgTypeList, newMsgTypeList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcList getSrcList() {
		return srcList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrcList(SrcList newSrcList, NotificationChain msgs) {
		SrcList oldSrcList = srcList;
		srcList = newSrcList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracePackage.TRACEFILE_TYPE__SRC_LIST, oldSrcList, newSrcList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcList(SrcList newSrcList) {
		if (newSrcList != srcList) {
			NotificationChain msgs = null;
			if (srcList != null)
				msgs = ((InternalEObject)srcList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TracePackage.TRACEFILE_TYPE__SRC_LIST, null, msgs);
			if (newSrcList != null)
				msgs = ((InternalEObject)newSrcList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TracePackage.TRACEFILE_TYPE__SRC_LIST, null, msgs);
			msgs = basicSetSrcList(newSrcList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACEFILE_TYPE__SRC_LIST, newSrcList, newSrcList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgList getMsgList() {
		return msgList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgList(MsgList newMsgList, NotificationChain msgs) {
		MsgList oldMsgList = msgList;
		msgList = newMsgList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracePackage.TRACEFILE_TYPE__MSG_LIST, oldMsgList, newMsgList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsgList(MsgList newMsgList) {
		if (newMsgList != msgList) {
			NotificationChain msgs = null;
			if (msgList != null)
				msgs = ((InternalEObject)msgList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TracePackage.TRACEFILE_TYPE__MSG_LIST, null, msgs);
			if (newMsgList != null)
				msgs = ((InternalEObject)newMsgList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TracePackage.TRACEFILE_TYPE__MSG_LIST, null, msgs);
			msgs = basicSetMsgList(newMsgList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACEFILE_TYPE__MSG_LIST, newMsgList, newMsgList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(float newEndTime) {
		float oldEndTime = endTime;
		endTime = newEndTime;
		boolean oldEndTimeESet = endTimeESet;
		endTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACEFILE_TYPE__END_TIME, oldEndTime, endTime, !oldEndTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndTime() {
		float oldEndTime = endTime;
		boolean oldEndTimeESet = endTimeESet;
		endTime = END_TIME_EDEFAULT;
		endTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TracePackage.TRACEFILE_TYPE__END_TIME, oldEndTime, END_TIME_EDEFAULT, oldEndTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndTime() {
		return endTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGenerationDate() {
		return generationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationDate(XMLGregorianCalendar newGenerationDate) {
		XMLGregorianCalendar oldGenerationDate = generationDate;
		generationDate = newGenerationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACEFILE_TYPE__GENERATION_DATE, oldGenerationDate, generationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerationProfile() {
		return generationProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationProfile(String newGenerationProfile) {
		String oldGenerationProfile = generationProfile;
		generationProfile = newGenerationProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACEFILE_TYPE__GENERATION_PROFILE, oldGenerationProfile, generationProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerationTool() {
		return generationTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationTool(String newGenerationTool) {
		String oldGenerationTool = generationTool;
		generationTool = newGenerationTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACEFILE_TYPE__GENERATION_TOOL, oldGenerationTool, generationTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getModelDate() {
		return modelDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelDate(XMLGregorianCalendar newModelDate) {
		XMLGregorianCalendar oldModelDate = modelDate;
		modelDate = newModelDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACEFILE_TYPE__MODEL_DATE, oldModelDate, modelDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACEFILE_TYPE__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(float newStartTime) {
		float oldStartTime = startTime;
		startTime = newStartTime;
		boolean oldStartTimeESet = startTimeESet;
		startTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACEFILE_TYPE__START_TIME, oldStartTime, startTime, !oldStartTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartTime() {
		float oldStartTime = startTime;
		boolean oldStartTimeESet = startTimeESet;
		startTime = START_TIME_EDEFAULT;
		startTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TracePackage.TRACEFILE_TYPE__START_TIME, oldStartTime, START_TIME_EDEFAULT, oldStartTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartTime() {
		return startTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracePackage.TRACEFILE_TYPE__MSG_TYPE_LIST:
				return basicSetMsgTypeList(null, msgs);
			case TracePackage.TRACEFILE_TYPE__SRC_LIST:
				return basicSetSrcList(null, msgs);
			case TracePackage.TRACEFILE_TYPE__MSG_LIST:
				return basicSetMsgList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.TRACEFILE_TYPE__MSG_TYPE_LIST:
				return getMsgTypeList();
			case TracePackage.TRACEFILE_TYPE__SRC_LIST:
				return getSrcList();
			case TracePackage.TRACEFILE_TYPE__MSG_LIST:
				return getMsgList();
			case TracePackage.TRACEFILE_TYPE__END_TIME:
				return getEndTime();
			case TracePackage.TRACEFILE_TYPE__GENERATION_DATE:
				return getGenerationDate();
			case TracePackage.TRACEFILE_TYPE__GENERATION_PROFILE:
				return getGenerationProfile();
			case TracePackage.TRACEFILE_TYPE__GENERATION_TOOL:
				return getGenerationTool();
			case TracePackage.TRACEFILE_TYPE__MODEL_DATE:
				return getModelDate();
			case TracePackage.TRACEFILE_TYPE__MODEL_NAME:
				return getModelName();
			case TracePackage.TRACEFILE_TYPE__START_TIME:
				return getStartTime();
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
			case TracePackage.TRACEFILE_TYPE__MSG_TYPE_LIST:
				setMsgTypeList((MsgTypeList)newValue);
				return;
			case TracePackage.TRACEFILE_TYPE__SRC_LIST:
				setSrcList((SrcList)newValue);
				return;
			case TracePackage.TRACEFILE_TYPE__MSG_LIST:
				setMsgList((MsgList)newValue);
				return;
			case TracePackage.TRACEFILE_TYPE__END_TIME:
				setEndTime((Float)newValue);
				return;
			case TracePackage.TRACEFILE_TYPE__GENERATION_DATE:
				setGenerationDate((XMLGregorianCalendar)newValue);
				return;
			case TracePackage.TRACEFILE_TYPE__GENERATION_PROFILE:
				setGenerationProfile((String)newValue);
				return;
			case TracePackage.TRACEFILE_TYPE__GENERATION_TOOL:
				setGenerationTool((String)newValue);
				return;
			case TracePackage.TRACEFILE_TYPE__MODEL_DATE:
				setModelDate((XMLGregorianCalendar)newValue);
				return;
			case TracePackage.TRACEFILE_TYPE__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case TracePackage.TRACEFILE_TYPE__START_TIME:
				setStartTime((Float)newValue);
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
			case TracePackage.TRACEFILE_TYPE__MSG_TYPE_LIST:
				setMsgTypeList((MsgTypeList)null);
				return;
			case TracePackage.TRACEFILE_TYPE__SRC_LIST:
				setSrcList((SrcList)null);
				return;
			case TracePackage.TRACEFILE_TYPE__MSG_LIST:
				setMsgList((MsgList)null);
				return;
			case TracePackage.TRACEFILE_TYPE__END_TIME:
				unsetEndTime();
				return;
			case TracePackage.TRACEFILE_TYPE__GENERATION_DATE:
				setGenerationDate(GENERATION_DATE_EDEFAULT);
				return;
			case TracePackage.TRACEFILE_TYPE__GENERATION_PROFILE:
				setGenerationProfile(GENERATION_PROFILE_EDEFAULT);
				return;
			case TracePackage.TRACEFILE_TYPE__GENERATION_TOOL:
				setGenerationTool(GENERATION_TOOL_EDEFAULT);
				return;
			case TracePackage.TRACEFILE_TYPE__MODEL_DATE:
				setModelDate(MODEL_DATE_EDEFAULT);
				return;
			case TracePackage.TRACEFILE_TYPE__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case TracePackage.TRACEFILE_TYPE__START_TIME:
				unsetStartTime();
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
			case TracePackage.TRACEFILE_TYPE__MSG_TYPE_LIST:
				return msgTypeList != null;
			case TracePackage.TRACEFILE_TYPE__SRC_LIST:
				return srcList != null;
			case TracePackage.TRACEFILE_TYPE__MSG_LIST:
				return msgList != null;
			case TracePackage.TRACEFILE_TYPE__END_TIME:
				return isSetEndTime();
			case TracePackage.TRACEFILE_TYPE__GENERATION_DATE:
				return GENERATION_DATE_EDEFAULT == null ? generationDate != null : !GENERATION_DATE_EDEFAULT.equals(generationDate);
			case TracePackage.TRACEFILE_TYPE__GENERATION_PROFILE:
				return GENERATION_PROFILE_EDEFAULT == null ? generationProfile != null : !GENERATION_PROFILE_EDEFAULT.equals(generationProfile);
			case TracePackage.TRACEFILE_TYPE__GENERATION_TOOL:
				return GENERATION_TOOL_EDEFAULT == null ? generationTool != null : !GENERATION_TOOL_EDEFAULT.equals(generationTool);
			case TracePackage.TRACEFILE_TYPE__MODEL_DATE:
				return MODEL_DATE_EDEFAULT == null ? modelDate != null : !MODEL_DATE_EDEFAULT.equals(modelDate);
			case TracePackage.TRACEFILE_TYPE__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case TracePackage.TRACEFILE_TYPE__START_TIME:
				return isSetStartTime();
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
		result.append(" (endTime: ");
		if (endTimeESet) result.append(endTime); else result.append("<unset>");
		result.append(", generationDate: ");
		result.append(generationDate);
		result.append(", generationProfile: ");
		result.append(generationProfile);
		result.append(", generationTool: ");
		result.append(generationTool);
		result.append(", modelDate: ");
		result.append(modelDate);
		result.append(", modelName: ");
		result.append(modelName);
		result.append(", startTime: ");
		if (startTimeESet) result.append(startTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TRACEFILETypeImpl

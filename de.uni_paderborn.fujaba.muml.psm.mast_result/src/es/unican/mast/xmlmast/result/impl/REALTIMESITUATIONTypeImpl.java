/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.OperationResults;
import es.unican.mast.xmlmast.result.ProcessingResourceResults;
import es.unican.mast.xmlmast.result.REALTIMESITUATIONType;
import es.unican.mast.xmlmast.result.ResultPackage;
import es.unican.mast.xmlmast.result.SchedulingServerResults;
import es.unican.mast.xmlmast.result.SharedResourceResults;
import es.unican.mast.xmlmast.result.Slack;
import es.unican.mast.xmlmast.result.Trace;
import es.unican.mast.xmlmast.result.TransactionResults;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REALTIMESITUATION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl#getSlack <em>Slack</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl#getTrace <em>Trace</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl#getProcessingResource <em>Processing Resource</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl#getSchedulingServer <em>Scheduling Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl#getSharedResource <em>Shared Resource</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl#getGenerationDate <em>Generation Date</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl#getGenerationProfile <em>Generation Profile</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl#getGenerationTool <em>Generation Tool</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl#getModelDate <em>Model Date</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.REALTIMESITUATIONTypeImpl#getModelName <em>Model Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class REALTIMESITUATIONTypeImpl extends MinimalEObjectImpl.Container implements REALTIMESITUATIONType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REALTIMESITUATIONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.REALTIMESITUATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ResultPackage.REALTIMESITUATION_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slack> getSlack() {
		return getGroup().list(ResultPackage.Literals.REALTIMESITUATION_TYPE__SLACK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getTrace() {
		return getGroup().list(ResultPackage.Literals.REALTIMESITUATION_TYPE__TRACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransactionResults> getTransaction() {
		return getGroup().list(ResultPackage.Literals.REALTIMESITUATION_TYPE__TRANSACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessingResourceResults> getProcessingResource() {
		return getGroup().list(ResultPackage.Literals.REALTIMESITUATION_TYPE__PROCESSING_RESOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationResults> getOperation() {
		return getGroup().list(ResultPackage.Literals.REALTIMESITUATION_TYPE__OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchedulingServerResults> getSchedulingServer() {
		return getGroup().list(ResultPackage.Literals.REALTIMESITUATION_TYPE__SCHEDULING_SERVER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedResourceResults> getSharedResource() {
		return getGroup().list(ResultPackage.Literals.REALTIMESITUATION_TYPE__SHARED_RESOURCE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.REALTIMESITUATION_TYPE__GENERATION_DATE, oldGenerationDate, generationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.REALTIMESITUATION_TYPE__GENERATION_PROFILE, oldGenerationProfile, generationProfile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.REALTIMESITUATION_TYPE__GENERATION_TOOL, oldGenerationTool, generationTool));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.REALTIMESITUATION_TYPE__MODEL_DATE, oldModelDate, modelDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.REALTIMESITUATION_TYPE__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultPackage.REALTIMESITUATION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ResultPackage.REALTIMESITUATION_TYPE__SLACK:
				return ((InternalEList<?>)getSlack()).basicRemove(otherEnd, msgs);
			case ResultPackage.REALTIMESITUATION_TYPE__TRACE:
				return ((InternalEList<?>)getTrace()).basicRemove(otherEnd, msgs);
			case ResultPackage.REALTIMESITUATION_TYPE__TRANSACTION:
				return ((InternalEList<?>)getTransaction()).basicRemove(otherEnd, msgs);
			case ResultPackage.REALTIMESITUATION_TYPE__PROCESSING_RESOURCE:
				return ((InternalEList<?>)getProcessingResource()).basicRemove(otherEnd, msgs);
			case ResultPackage.REALTIMESITUATION_TYPE__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case ResultPackage.REALTIMESITUATION_TYPE__SCHEDULING_SERVER:
				return ((InternalEList<?>)getSchedulingServer()).basicRemove(otherEnd, msgs);
			case ResultPackage.REALTIMESITUATION_TYPE__SHARED_RESOURCE:
				return ((InternalEList<?>)getSharedResource()).basicRemove(otherEnd, msgs);
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
			case ResultPackage.REALTIMESITUATION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ResultPackage.REALTIMESITUATION_TYPE__SLACK:
				return getSlack();
			case ResultPackage.REALTIMESITUATION_TYPE__TRACE:
				return getTrace();
			case ResultPackage.REALTIMESITUATION_TYPE__TRANSACTION:
				return getTransaction();
			case ResultPackage.REALTIMESITUATION_TYPE__PROCESSING_RESOURCE:
				return getProcessingResource();
			case ResultPackage.REALTIMESITUATION_TYPE__OPERATION:
				return getOperation();
			case ResultPackage.REALTIMESITUATION_TYPE__SCHEDULING_SERVER:
				return getSchedulingServer();
			case ResultPackage.REALTIMESITUATION_TYPE__SHARED_RESOURCE:
				return getSharedResource();
			case ResultPackage.REALTIMESITUATION_TYPE__GENERATION_DATE:
				return getGenerationDate();
			case ResultPackage.REALTIMESITUATION_TYPE__GENERATION_PROFILE:
				return getGenerationProfile();
			case ResultPackage.REALTIMESITUATION_TYPE__GENERATION_TOOL:
				return getGenerationTool();
			case ResultPackage.REALTIMESITUATION_TYPE__MODEL_DATE:
				return getModelDate();
			case ResultPackage.REALTIMESITUATION_TYPE__MODEL_NAME:
				return getModelName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResultPackage.REALTIMESITUATION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__SLACK:
				getSlack().clear();
				getSlack().addAll((Collection<? extends Slack>)newValue);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__TRACE:
				getTrace().clear();
				getTrace().addAll((Collection<? extends Trace>)newValue);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__TRANSACTION:
				getTransaction().clear();
				getTransaction().addAll((Collection<? extends TransactionResults>)newValue);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__PROCESSING_RESOURCE:
				getProcessingResource().clear();
				getProcessingResource().addAll((Collection<? extends ProcessingResourceResults>)newValue);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends OperationResults>)newValue);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__SCHEDULING_SERVER:
				getSchedulingServer().clear();
				getSchedulingServer().addAll((Collection<? extends SchedulingServerResults>)newValue);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__SHARED_RESOURCE:
				getSharedResource().clear();
				getSharedResource().addAll((Collection<? extends SharedResourceResults>)newValue);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__GENERATION_DATE:
				setGenerationDate((XMLGregorianCalendar)newValue);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__GENERATION_PROFILE:
				setGenerationProfile((String)newValue);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__GENERATION_TOOL:
				setGenerationTool((String)newValue);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__MODEL_DATE:
				setModelDate((XMLGregorianCalendar)newValue);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__MODEL_NAME:
				setModelName((String)newValue);
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
			case ResultPackage.REALTIMESITUATION_TYPE__GROUP:
				getGroup().clear();
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__SLACK:
				getSlack().clear();
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__TRACE:
				getTrace().clear();
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__TRANSACTION:
				getTransaction().clear();
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__PROCESSING_RESOURCE:
				getProcessingResource().clear();
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__OPERATION:
				getOperation().clear();
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__SCHEDULING_SERVER:
				getSchedulingServer().clear();
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__SHARED_RESOURCE:
				getSharedResource().clear();
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__GENERATION_DATE:
				setGenerationDate(GENERATION_DATE_EDEFAULT);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__GENERATION_PROFILE:
				setGenerationProfile(GENERATION_PROFILE_EDEFAULT);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__GENERATION_TOOL:
				setGenerationTool(GENERATION_TOOL_EDEFAULT);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__MODEL_DATE:
				setModelDate(MODEL_DATE_EDEFAULT);
				return;
			case ResultPackage.REALTIMESITUATION_TYPE__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
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
			case ResultPackage.REALTIMESITUATION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case ResultPackage.REALTIMESITUATION_TYPE__SLACK:
				return !getSlack().isEmpty();
			case ResultPackage.REALTIMESITUATION_TYPE__TRACE:
				return !getTrace().isEmpty();
			case ResultPackage.REALTIMESITUATION_TYPE__TRANSACTION:
				return !getTransaction().isEmpty();
			case ResultPackage.REALTIMESITUATION_TYPE__PROCESSING_RESOURCE:
				return !getProcessingResource().isEmpty();
			case ResultPackage.REALTIMESITUATION_TYPE__OPERATION:
				return !getOperation().isEmpty();
			case ResultPackage.REALTIMESITUATION_TYPE__SCHEDULING_SERVER:
				return !getSchedulingServer().isEmpty();
			case ResultPackage.REALTIMESITUATION_TYPE__SHARED_RESOURCE:
				return !getSharedResource().isEmpty();
			case ResultPackage.REALTIMESITUATION_TYPE__GENERATION_DATE:
				return GENERATION_DATE_EDEFAULT == null ? generationDate != null : !GENERATION_DATE_EDEFAULT.equals(generationDate);
			case ResultPackage.REALTIMESITUATION_TYPE__GENERATION_PROFILE:
				return GENERATION_PROFILE_EDEFAULT == null ? generationProfile != null : !GENERATION_PROFILE_EDEFAULT.equals(generationProfile);
			case ResultPackage.REALTIMESITUATION_TYPE__GENERATION_TOOL:
				return GENERATION_TOOL_EDEFAULT == null ? generationTool != null : !GENERATION_TOOL_EDEFAULT.equals(generationTool);
			case ResultPackage.REALTIMESITUATION_TYPE__MODEL_DATE:
				return MODEL_DATE_EDEFAULT == null ? modelDate != null : !MODEL_DATE_EDEFAULT.equals(modelDate);
			case ResultPackage.REALTIMESITUATION_TYPE__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
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
		result.append(" (group: ");
		result.append(group);
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
		result.append(')');
		return result.toString();
	}

} //REALTIMESITUATIONTypeImpl

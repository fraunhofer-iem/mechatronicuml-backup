/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.CompositeOperation;
import es.unican.mast.xmlmast.model.EnclosingOperation;
import es.unican.mast.xmlmast.model.ImmediateCeilingResource;
import es.unican.mast.xmlmast.model.MASTMODELType;
import es.unican.mast.xmlmast.model.MessageTransmission;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.PacketBasedNetwork;
import es.unican.mast.xmlmast.model.PrimaryScheduler;
import es.unican.mast.xmlmast.model.PriorityInheritanceProtocol;
import es.unican.mast.xmlmast.model.PriorityInheritanceResource;
import es.unican.mast.xmlmast.model.RegularProcessor;
import es.unican.mast.xmlmast.model.RegularSchedulingServer;
import es.unican.mast.xmlmast.model.RegularTransaction;
import es.unican.mast.xmlmast.model.SRPResource;
import es.unican.mast.xmlmast.model.SecondaryScheduler;
import es.unican.mast.xmlmast.model.SimpleOperation;

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
 * An implementation of the model object '<em><b>MASTMODEL Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getRegularProcessor <em>Regular Processor</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getPacketBasedNetwork <em>Packet Based Network</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getRegularSchedulingServer <em>Regular Scheduling Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getImmediateCeilingResource <em>Immediate Ceiling Resource</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getPriorityInheritanceResource <em>Priority Inheritance Resource</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getSRPResource <em>SRP Resource</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getSimpleOperation <em>Simple Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getMessageTransmission <em>Message Transmission</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getCompositeOperation <em>Composite Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getEnclosingOperation <em>Enclosing Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getRegularTransaction <em>Regular Transaction</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getPrimaryScheduler <em>Primary Scheduler</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getSecondaryScheduler <em>Secondary Scheduler</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getModelDate <em>Model Date</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MASTMODELTypeImpl#getSystemPiPBehaviour <em>System Pi PBehaviour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MASTMODELTypeImpl extends MinimalEObjectImpl.Container implements MASTMODELType {
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
	 * The default value of the '{@link #getSystemPiPBehaviour() <em>System Pi PBehaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemPiPBehaviour()
	 * @generated
	 * @ordered
	 */
	protected static final PriorityInheritanceProtocol SYSTEM_PI_PBEHAVIOUR_EDEFAULT = PriorityInheritanceProtocol.STRICT;

	/**
	 * The cached value of the '{@link #getSystemPiPBehaviour() <em>System Pi PBehaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemPiPBehaviour()
	 * @generated
	 * @ordered
	 */
	protected PriorityInheritanceProtocol systemPiPBehaviour = SYSTEM_PI_PBEHAVIOUR_EDEFAULT;

	/**
	 * This is true if the System Pi PBehaviour attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean systemPiPBehaviourESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MASTMODELTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MASTMODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ModelPackage.MASTMODEL_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularProcessor> getRegularProcessor() {
		return getGroup().list(ModelPackage.Literals.MASTMODEL_TYPE__REGULAR_PROCESSOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PacketBasedNetwork> getPacketBasedNetwork() {
		return getGroup().list(ModelPackage.Literals.MASTMODEL_TYPE__PACKET_BASED_NETWORK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularSchedulingServer> getRegularSchedulingServer() {
		return getGroup().list(ModelPackage.Literals.MASTMODEL_TYPE__REGULAR_SCHEDULING_SERVER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmediateCeilingResource> getImmediateCeilingResource() {
		return getGroup().list(ModelPackage.Literals.MASTMODEL_TYPE__IMMEDIATE_CEILING_RESOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PriorityInheritanceResource> getPriorityInheritanceResource() {
		return getGroup().list(ModelPackage.Literals.MASTMODEL_TYPE__PRIORITY_INHERITANCE_RESOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SRPResource> getSRPResource() {
		return getGroup().list(ModelPackage.Literals.MASTMODEL_TYPE__SRP_RESOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleOperation> getSimpleOperation() {
		return getGroup().list(ModelPackage.Literals.MASTMODEL_TYPE__SIMPLE_OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageTransmission> getMessageTransmission() {
		return getGroup().list(ModelPackage.Literals.MASTMODEL_TYPE__MESSAGE_TRANSMISSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeOperation> getCompositeOperation() {
		return getGroup().list(ModelPackage.Literals.MASTMODEL_TYPE__COMPOSITE_OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnclosingOperation> getEnclosingOperation() {
		return getGroup().list(ModelPackage.Literals.MASTMODEL_TYPE__ENCLOSING_OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularTransaction> getRegularTransaction() {
		return getGroup().list(ModelPackage.Literals.MASTMODEL_TYPE__REGULAR_TRANSACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryScheduler> getPrimaryScheduler() {
		return getGroup().list(ModelPackage.Literals.MASTMODEL_TYPE__PRIMARY_SCHEDULER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecondaryScheduler> getSecondaryScheduler() {
		return getGroup().list(ModelPackage.Literals.MASTMODEL_TYPE__SECONDARY_SCHEDULER);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MASTMODEL_TYPE__MODEL_DATE, oldModelDate, modelDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MASTMODEL_TYPE__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityInheritanceProtocol getSystemPiPBehaviour() {
		return systemPiPBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemPiPBehaviour(PriorityInheritanceProtocol newSystemPiPBehaviour) {
		PriorityInheritanceProtocol oldSystemPiPBehaviour = systemPiPBehaviour;
		systemPiPBehaviour = newSystemPiPBehaviour == null ? SYSTEM_PI_PBEHAVIOUR_EDEFAULT : newSystemPiPBehaviour;
		boolean oldSystemPiPBehaviourESet = systemPiPBehaviourESet;
		systemPiPBehaviourESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MASTMODEL_TYPE__SYSTEM_PI_PBEHAVIOUR, oldSystemPiPBehaviour, systemPiPBehaviour, !oldSystemPiPBehaviourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSystemPiPBehaviour() {
		PriorityInheritanceProtocol oldSystemPiPBehaviour = systemPiPBehaviour;
		boolean oldSystemPiPBehaviourESet = systemPiPBehaviourESet;
		systemPiPBehaviour = SYSTEM_PI_PBEHAVIOUR_EDEFAULT;
		systemPiPBehaviourESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.MASTMODEL_TYPE__SYSTEM_PI_PBEHAVIOUR, oldSystemPiPBehaviour, SYSTEM_PI_PBEHAVIOUR_EDEFAULT, oldSystemPiPBehaviourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSystemPiPBehaviour() {
		return systemPiPBehaviourESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.MASTMODEL_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ModelPackage.MASTMODEL_TYPE__REGULAR_PROCESSOR:
				return ((InternalEList<?>)getRegularProcessor()).basicRemove(otherEnd, msgs);
			case ModelPackage.MASTMODEL_TYPE__PACKET_BASED_NETWORK:
				return ((InternalEList<?>)getPacketBasedNetwork()).basicRemove(otherEnd, msgs);
			case ModelPackage.MASTMODEL_TYPE__REGULAR_SCHEDULING_SERVER:
				return ((InternalEList<?>)getRegularSchedulingServer()).basicRemove(otherEnd, msgs);
			case ModelPackage.MASTMODEL_TYPE__IMMEDIATE_CEILING_RESOURCE:
				return ((InternalEList<?>)getImmediateCeilingResource()).basicRemove(otherEnd, msgs);
			case ModelPackage.MASTMODEL_TYPE__PRIORITY_INHERITANCE_RESOURCE:
				return ((InternalEList<?>)getPriorityInheritanceResource()).basicRemove(otherEnd, msgs);
			case ModelPackage.MASTMODEL_TYPE__SRP_RESOURCE:
				return ((InternalEList<?>)getSRPResource()).basicRemove(otherEnd, msgs);
			case ModelPackage.MASTMODEL_TYPE__SIMPLE_OPERATION:
				return ((InternalEList<?>)getSimpleOperation()).basicRemove(otherEnd, msgs);
			case ModelPackage.MASTMODEL_TYPE__MESSAGE_TRANSMISSION:
				return ((InternalEList<?>)getMessageTransmission()).basicRemove(otherEnd, msgs);
			case ModelPackage.MASTMODEL_TYPE__COMPOSITE_OPERATION:
				return ((InternalEList<?>)getCompositeOperation()).basicRemove(otherEnd, msgs);
			case ModelPackage.MASTMODEL_TYPE__ENCLOSING_OPERATION:
				return ((InternalEList<?>)getEnclosingOperation()).basicRemove(otherEnd, msgs);
			case ModelPackage.MASTMODEL_TYPE__REGULAR_TRANSACTION:
				return ((InternalEList<?>)getRegularTransaction()).basicRemove(otherEnd, msgs);
			case ModelPackage.MASTMODEL_TYPE__PRIMARY_SCHEDULER:
				return ((InternalEList<?>)getPrimaryScheduler()).basicRemove(otherEnd, msgs);
			case ModelPackage.MASTMODEL_TYPE__SECONDARY_SCHEDULER:
				return ((InternalEList<?>)getSecondaryScheduler()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.MASTMODEL_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ModelPackage.MASTMODEL_TYPE__REGULAR_PROCESSOR:
				return getRegularProcessor();
			case ModelPackage.MASTMODEL_TYPE__PACKET_BASED_NETWORK:
				return getPacketBasedNetwork();
			case ModelPackage.MASTMODEL_TYPE__REGULAR_SCHEDULING_SERVER:
				return getRegularSchedulingServer();
			case ModelPackage.MASTMODEL_TYPE__IMMEDIATE_CEILING_RESOURCE:
				return getImmediateCeilingResource();
			case ModelPackage.MASTMODEL_TYPE__PRIORITY_INHERITANCE_RESOURCE:
				return getPriorityInheritanceResource();
			case ModelPackage.MASTMODEL_TYPE__SRP_RESOURCE:
				return getSRPResource();
			case ModelPackage.MASTMODEL_TYPE__SIMPLE_OPERATION:
				return getSimpleOperation();
			case ModelPackage.MASTMODEL_TYPE__MESSAGE_TRANSMISSION:
				return getMessageTransmission();
			case ModelPackage.MASTMODEL_TYPE__COMPOSITE_OPERATION:
				return getCompositeOperation();
			case ModelPackage.MASTMODEL_TYPE__ENCLOSING_OPERATION:
				return getEnclosingOperation();
			case ModelPackage.MASTMODEL_TYPE__REGULAR_TRANSACTION:
				return getRegularTransaction();
			case ModelPackage.MASTMODEL_TYPE__PRIMARY_SCHEDULER:
				return getPrimaryScheduler();
			case ModelPackage.MASTMODEL_TYPE__SECONDARY_SCHEDULER:
				return getSecondaryScheduler();
			case ModelPackage.MASTMODEL_TYPE__MODEL_DATE:
				return getModelDate();
			case ModelPackage.MASTMODEL_TYPE__MODEL_NAME:
				return getModelName();
			case ModelPackage.MASTMODEL_TYPE__SYSTEM_PI_PBEHAVIOUR:
				return getSystemPiPBehaviour();
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
			case ModelPackage.MASTMODEL_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__REGULAR_PROCESSOR:
				getRegularProcessor().clear();
				getRegularProcessor().addAll((Collection<? extends RegularProcessor>)newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__PACKET_BASED_NETWORK:
				getPacketBasedNetwork().clear();
				getPacketBasedNetwork().addAll((Collection<? extends PacketBasedNetwork>)newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__REGULAR_SCHEDULING_SERVER:
				getRegularSchedulingServer().clear();
				getRegularSchedulingServer().addAll((Collection<? extends RegularSchedulingServer>)newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__IMMEDIATE_CEILING_RESOURCE:
				getImmediateCeilingResource().clear();
				getImmediateCeilingResource().addAll((Collection<? extends ImmediateCeilingResource>)newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__PRIORITY_INHERITANCE_RESOURCE:
				getPriorityInheritanceResource().clear();
				getPriorityInheritanceResource().addAll((Collection<? extends PriorityInheritanceResource>)newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__SRP_RESOURCE:
				getSRPResource().clear();
				getSRPResource().addAll((Collection<? extends SRPResource>)newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__SIMPLE_OPERATION:
				getSimpleOperation().clear();
				getSimpleOperation().addAll((Collection<? extends SimpleOperation>)newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__MESSAGE_TRANSMISSION:
				getMessageTransmission().clear();
				getMessageTransmission().addAll((Collection<? extends MessageTransmission>)newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__COMPOSITE_OPERATION:
				getCompositeOperation().clear();
				getCompositeOperation().addAll((Collection<? extends CompositeOperation>)newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__ENCLOSING_OPERATION:
				getEnclosingOperation().clear();
				getEnclosingOperation().addAll((Collection<? extends EnclosingOperation>)newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__REGULAR_TRANSACTION:
				getRegularTransaction().clear();
				getRegularTransaction().addAll((Collection<? extends RegularTransaction>)newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__PRIMARY_SCHEDULER:
				getPrimaryScheduler().clear();
				getPrimaryScheduler().addAll((Collection<? extends PrimaryScheduler>)newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__SECONDARY_SCHEDULER:
				getSecondaryScheduler().clear();
				getSecondaryScheduler().addAll((Collection<? extends SecondaryScheduler>)newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__MODEL_DATE:
				setModelDate((XMLGregorianCalendar)newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case ModelPackage.MASTMODEL_TYPE__SYSTEM_PI_PBEHAVIOUR:
				setSystemPiPBehaviour((PriorityInheritanceProtocol)newValue);
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
			case ModelPackage.MASTMODEL_TYPE__GROUP:
				getGroup().clear();
				return;
			case ModelPackage.MASTMODEL_TYPE__REGULAR_PROCESSOR:
				getRegularProcessor().clear();
				return;
			case ModelPackage.MASTMODEL_TYPE__PACKET_BASED_NETWORK:
				getPacketBasedNetwork().clear();
				return;
			case ModelPackage.MASTMODEL_TYPE__REGULAR_SCHEDULING_SERVER:
				getRegularSchedulingServer().clear();
				return;
			case ModelPackage.MASTMODEL_TYPE__IMMEDIATE_CEILING_RESOURCE:
				getImmediateCeilingResource().clear();
				return;
			case ModelPackage.MASTMODEL_TYPE__PRIORITY_INHERITANCE_RESOURCE:
				getPriorityInheritanceResource().clear();
				return;
			case ModelPackage.MASTMODEL_TYPE__SRP_RESOURCE:
				getSRPResource().clear();
				return;
			case ModelPackage.MASTMODEL_TYPE__SIMPLE_OPERATION:
				getSimpleOperation().clear();
				return;
			case ModelPackage.MASTMODEL_TYPE__MESSAGE_TRANSMISSION:
				getMessageTransmission().clear();
				return;
			case ModelPackage.MASTMODEL_TYPE__COMPOSITE_OPERATION:
				getCompositeOperation().clear();
				return;
			case ModelPackage.MASTMODEL_TYPE__ENCLOSING_OPERATION:
				getEnclosingOperation().clear();
				return;
			case ModelPackage.MASTMODEL_TYPE__REGULAR_TRANSACTION:
				getRegularTransaction().clear();
				return;
			case ModelPackage.MASTMODEL_TYPE__PRIMARY_SCHEDULER:
				getPrimaryScheduler().clear();
				return;
			case ModelPackage.MASTMODEL_TYPE__SECONDARY_SCHEDULER:
				getSecondaryScheduler().clear();
				return;
			case ModelPackage.MASTMODEL_TYPE__MODEL_DATE:
				setModelDate(MODEL_DATE_EDEFAULT);
				return;
			case ModelPackage.MASTMODEL_TYPE__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case ModelPackage.MASTMODEL_TYPE__SYSTEM_PI_PBEHAVIOUR:
				unsetSystemPiPBehaviour();
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
			case ModelPackage.MASTMODEL_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case ModelPackage.MASTMODEL_TYPE__REGULAR_PROCESSOR:
				return !getRegularProcessor().isEmpty();
			case ModelPackage.MASTMODEL_TYPE__PACKET_BASED_NETWORK:
				return !getPacketBasedNetwork().isEmpty();
			case ModelPackage.MASTMODEL_TYPE__REGULAR_SCHEDULING_SERVER:
				return !getRegularSchedulingServer().isEmpty();
			case ModelPackage.MASTMODEL_TYPE__IMMEDIATE_CEILING_RESOURCE:
				return !getImmediateCeilingResource().isEmpty();
			case ModelPackage.MASTMODEL_TYPE__PRIORITY_INHERITANCE_RESOURCE:
				return !getPriorityInheritanceResource().isEmpty();
			case ModelPackage.MASTMODEL_TYPE__SRP_RESOURCE:
				return !getSRPResource().isEmpty();
			case ModelPackage.MASTMODEL_TYPE__SIMPLE_OPERATION:
				return !getSimpleOperation().isEmpty();
			case ModelPackage.MASTMODEL_TYPE__MESSAGE_TRANSMISSION:
				return !getMessageTransmission().isEmpty();
			case ModelPackage.MASTMODEL_TYPE__COMPOSITE_OPERATION:
				return !getCompositeOperation().isEmpty();
			case ModelPackage.MASTMODEL_TYPE__ENCLOSING_OPERATION:
				return !getEnclosingOperation().isEmpty();
			case ModelPackage.MASTMODEL_TYPE__REGULAR_TRANSACTION:
				return !getRegularTransaction().isEmpty();
			case ModelPackage.MASTMODEL_TYPE__PRIMARY_SCHEDULER:
				return !getPrimaryScheduler().isEmpty();
			case ModelPackage.MASTMODEL_TYPE__SECONDARY_SCHEDULER:
				return !getSecondaryScheduler().isEmpty();
			case ModelPackage.MASTMODEL_TYPE__MODEL_DATE:
				return MODEL_DATE_EDEFAULT == null ? modelDate != null : !MODEL_DATE_EDEFAULT.equals(modelDate);
			case ModelPackage.MASTMODEL_TYPE__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case ModelPackage.MASTMODEL_TYPE__SYSTEM_PI_PBEHAVIOUR:
				return isSetSystemPiPBehaviour();
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
		result.append(", modelDate: ");
		result.append(modelDate);
		result.append(", modelName: ");
		result.append(modelName);
		result.append(", systemPiPBehaviour: ");
		if (systemPiPBehaviourESet) result.append(systemPiPBehaviour); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MASTMODELTypeImpl

/**
 */
package org.muml.testlanguage.specification.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.testlanguage.specification.NodeSpecification;
import org.muml.testlanguage.specification.PortSpecification;
import org.muml.testlanguage.specification.PortType;
import org.muml.testlanguage.specification.SpecificationFactory;
import org.muml.testlanguage.specification.SpecificationPackage;
import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Node Specification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.muml.testlanguage.specification.impl.NodeSpecificationImpl#getPortSpecifications
 * <em>Port Specifications</em>}</li>
 * <li>
 * {@link org.muml.testlanguage.specification.impl.NodeSpecificationImpl#getLabel
 * <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeSpecificationImpl extends MinimalEObjectImpl.Container implements NodeSpecification {
	/**
	 * The cached value of the '{@link #getPortSpecifications()
	 * <em>Port Specifications</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPortSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<PortSpecification> portSpecifications;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = "Node";

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NodeSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.NODE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<PortSpecification> getPortSpecifications() {
		if (portSpecifications == null) {
			portSpecifications = new EObjectContainmentEList<PortSpecification>(PortSpecification.class, this,
					SpecificationPackage.NODE_SPECIFICATION__PORT_SPECIFICATIONS);
		}
		return portSpecifications;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.NODE_SPECIFICATION__LABEL,
					oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initialize() {

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void execute(Map<String, Object> inputs, Map<String, Object> outputs) throws ExecutionException, Exception,
			de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.ExecutionException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean notifyChanged(final Object notification) {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PortSpecification addPortSpecification(final PortType type, final String name, final boolean optional) {
		return this.addPortSpecification(type, name, optional, null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PortSpecification addPortSpecification(final PortType type, final String name, final boolean optional,
			final Class<?> dataType) {
		PortSpecification spec = SpecificationFactory.eINSTANCE.createPortSpecification();
		spec.setType(type);
		spec.setName(name);
		spec.setOptional(optional);
		spec.setDataType(dataType);
		this.getPortSpecifications().add(spec);
		return spec;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpecificationPackage.NODE_SPECIFICATION__PORT_SPECIFICATIONS:
			return ((InternalEList<?>) getPortSpecifications()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpecificationPackage.NODE_SPECIFICATION__PORT_SPECIFICATIONS:
			return getPortSpecifications();
		case SpecificationPackage.NODE_SPECIFICATION__LABEL:
			return getLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SpecificationPackage.NODE_SPECIFICATION__PORT_SPECIFICATIONS:
			getPortSpecifications().clear();
			getPortSpecifications().addAll((Collection<? extends PortSpecification>) newValue);
			return;
		case SpecificationPackage.NODE_SPECIFICATION__LABEL:
			setLabel((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SpecificationPackage.NODE_SPECIFICATION__PORT_SPECIFICATIONS:
			getPortSpecifications().clear();
			return;
		case SpecificationPackage.NODE_SPECIFICATION__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SpecificationPackage.NODE_SPECIFICATION__PORT_SPECIFICATIONS:
			return portSpecifications != null && !portSpecifications.isEmpty();
		case SpecificationPackage.NODE_SPECIFICATION__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SpecificationPackage.NODE_SPECIFICATION___INITIALIZE:
			initialize();
			return null;
		case SpecificationPackage.NODE_SPECIFICATION___EXECUTE__MAP_MAP:
			try {
				execute((Map<String, Object>) arguments.get(0), (Map<String, Object>) arguments.get(1));
				return null;
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		case SpecificationPackage.NODE_SPECIFICATION___NOTIFY_CHANGED__OBJECT:
			return notifyChanged(arguments.get(0));
		case SpecificationPackage.NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN:
			return addPortSpecification((PortType) arguments.get(0), (String) arguments.get(1),
					(Boolean) arguments.get(2));
		case SpecificationPackage.NODE_SPECIFICATION___ADD_PORT_SPECIFICATION__PORTTYPE_STRING_BOOLEAN_CLASS:
			return addPortSpecification((PortType) arguments.get(0), (String) arguments.get(1),
					(Boolean) arguments.get(2), (Class<?>) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} // NodeSpecificationImpl

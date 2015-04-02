/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgConfElement;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.Retain;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.NamedElementImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.ProgramDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgramConfigurationImpl#getWith <em>With</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgramConfigurationImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgramConfigurationImpl#getRetain <em>Retain</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgramConfigurationImpl#getProgConfElements <em>Prog Conf Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramConfigurationImpl extends NamedElementImpl implements ProgramConfiguration {
	/**
	 * The cached value of the '{@link #getWith() <em>With</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWith()
	 * @generated
	 * @ordered
	 */
	protected TaskConfiguration with;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected ProgramDeclaration program;

	/**
	 * The default value of the '{@link #getRetain() <em>Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetain()
	 * @generated
	 * @ordered
	 */
	protected static final Retain RETAIN_EDEFAULT = Retain.RETAIN;

	/**
	 * The cached value of the '{@link #getRetain() <em>Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetain()
	 * @generated
	 * @ordered
	 */
	protected Retain retain = RETAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProgConfElements() <em>Prog Conf Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgConfElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgConfElement> progConfElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationsPackage.Literals.PROGRAM_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskConfiguration getWith() {
		if (with != null && with.eIsProxy()) {
			InternalEObject oldWith = (InternalEObject)with;
			with = (TaskConfiguration)eResolveProxy(oldWith);
			if (with != oldWith) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationsPackage.PROGRAM_CONFIGURATION__WITH, oldWith, with));
			}
		}
		return with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskConfiguration basicGetWith() {
		return with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWith(TaskConfiguration newWith) {
		TaskConfiguration oldWith = with;
		with = newWith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.PROGRAM_CONFIGURATION__WITH, oldWith, with));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramDeclaration getProgram() {
		if (program != null && program.eIsProxy()) {
			InternalEObject oldProgram = (InternalEObject)program;
			program = (ProgramDeclaration)eResolveProxy(oldProgram);
			if (program != oldProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationsPackage.PROGRAM_CONFIGURATION__PROGRAM, oldProgram, program));
			}
		}
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramDeclaration basicGetProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgram(ProgramDeclaration newProgram) {
		ProgramDeclaration oldProgram = program;
		program = newProgram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.PROGRAM_CONFIGURATION__PROGRAM, oldProgram, program));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Retain getRetain() {
		return retain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetain(Retain newRetain) {
		Retain oldRetain = retain;
		retain = newRetain == null ? RETAIN_EDEFAULT : newRetain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.PROGRAM_CONFIGURATION__RETAIN, oldRetain, retain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProgConfElement> getProgConfElements() {
		if (progConfElements == null) {
			progConfElements = new EObjectContainmentEList<ProgConfElement>(ProgConfElement.class, this, ConfigurationsPackage.PROGRAM_CONFIGURATION__PROG_CONF_ELEMENTS);
		}
		return progConfElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__PROG_CONF_ELEMENTS:
				return ((InternalEList<?>)getProgConfElements()).basicRemove(otherEnd, msgs);
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
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__WITH:
				if (resolve) return getWith();
				return basicGetWith();
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__PROGRAM:
				if (resolve) return getProgram();
				return basicGetProgram();
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__RETAIN:
				return getRetain();
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__PROG_CONF_ELEMENTS:
				return getProgConfElements();
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
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__WITH:
				setWith((TaskConfiguration)newValue);
				return;
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__PROGRAM:
				setProgram((ProgramDeclaration)newValue);
				return;
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__RETAIN:
				setRetain((Retain)newValue);
				return;
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__PROG_CONF_ELEMENTS:
				getProgConfElements().clear();
				getProgConfElements().addAll((Collection<? extends ProgConfElement>)newValue);
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
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__WITH:
				setWith((TaskConfiguration)null);
				return;
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__PROGRAM:
				setProgram((ProgramDeclaration)null);
				return;
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__RETAIN:
				setRetain(RETAIN_EDEFAULT);
				return;
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__PROG_CONF_ELEMENTS:
				getProgConfElements().clear();
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
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__WITH:
				return with != null;
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__PROGRAM:
				return program != null;
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__RETAIN:
				return retain != RETAIN_EDEFAULT;
			case ConfigurationsPackage.PROGRAM_CONFIGURATION__PROG_CONF_ELEMENTS:
				return progConfElements != null && !progConfElements.isEmpty();
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
		result.append(" (retain: ");
		result.append(retain);
		result.append(')');
		return result.toString();
	}

} //ProgramConfigurationImpl

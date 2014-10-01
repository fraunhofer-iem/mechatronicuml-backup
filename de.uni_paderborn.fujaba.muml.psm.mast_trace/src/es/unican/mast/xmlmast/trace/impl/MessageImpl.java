/**
 */
package es.unican.mast.xmlmast.trace.impl;

import es.unican.mast.xmlmast.trace.Message;
import es.unican.mast.xmlmast.trace.TracePackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.trace.impl.MessageImpl#getM <em>M</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.impl.MessageImpl#getS <em>S</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.impl.MessageImpl#getT <em>T</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends MinimalEObjectImpl.Container implements Message {
	/**
	 * The default value of the '{@link #getM() <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger M_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM() <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected BigInteger m = M_EDEFAULT;

	/**
	 * The default value of the '{@link #getS() <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected static final int S_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getS() <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected int s = S_EDEFAULT;

	/**
	 * This is true if the S attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sESet;

	/**
	 * The default value of the '{@link #getT() <em>T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT()
	 * @generated
	 * @ordered
	 */
	protected static final float T_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getT() <em>T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT()
	 * @generated
	 * @ordered
	 */
	protected float t = T_EDEFAULT;

	/**
	 * This is true if the T attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getM() {
		return m;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM(BigInteger newM) {
		BigInteger oldM = m;
		m = newM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.MESSAGE__M, oldM, m));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getS() {
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS(int newS) {
		int oldS = s;
		s = newS;
		boolean oldSESet = sESet;
		sESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.MESSAGE__S, oldS, s, !oldSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetS() {
		int oldS = s;
		boolean oldSESet = sESet;
		s = S_EDEFAULT;
		sESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TracePackage.MESSAGE__S, oldS, S_EDEFAULT, oldSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetS() {
		return sESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getT() {
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT(float newT) {
		float oldT = t;
		t = newT;
		boolean oldTESet = tESet;
		tESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.MESSAGE__T, oldT, t, !oldTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetT() {
		float oldT = t;
		boolean oldTESet = tESet;
		t = T_EDEFAULT;
		tESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TracePackage.MESSAGE__T, oldT, T_EDEFAULT, oldTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetT() {
		return tESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.MESSAGE__M:
				return getM();
			case TracePackage.MESSAGE__S:
				return getS();
			case TracePackage.MESSAGE__T:
				return getT();
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
			case TracePackage.MESSAGE__M:
				setM((BigInteger)newValue);
				return;
			case TracePackage.MESSAGE__S:
				setS((Integer)newValue);
				return;
			case TracePackage.MESSAGE__T:
				setT((Float)newValue);
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
			case TracePackage.MESSAGE__M:
				setM(M_EDEFAULT);
				return;
			case TracePackage.MESSAGE__S:
				unsetS();
				return;
			case TracePackage.MESSAGE__T:
				unsetT();
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
			case TracePackage.MESSAGE__M:
				return M_EDEFAULT == null ? m != null : !M_EDEFAULT.equals(m);
			case TracePackage.MESSAGE__S:
				return isSetS();
			case TracePackage.MESSAGE__T:
				return isSetT();
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
		result.append(" (m: ");
		result.append(m);
		result.append(", s: ");
		if (sESet) result.append(s); else result.append("<unset>");
		result.append(", t: ");
		if (tESet) result.append(t); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MessageImpl

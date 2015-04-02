/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st.impl;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.Expression;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StatementList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ForStatementImpl#getFrom <em>From</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ForStatementImpl#getTo <em>To</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ForStatementImpl#getBy <em>By</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ForStatementImpl#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForStatementImpl extends MinimalEObjectImpl.Container implements ForStatement {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Expression from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Expression to;

	/**
	 * The cached value of the '{@link #getBy() <em>By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBy()
	 * @generated
	 * @ordered
	 */
	protected Expression by;

	/**
	 * The cached value of the '{@link #getDo() <em>Do</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDo()
	 * @generated
	 * @ordered
	 */
	protected StatementList do_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StPackage.Literals.FOR_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Expression newFrom, NotificationChain msgs) {
		Expression oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StPackage.FOR_STATEMENT__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Expression newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StPackage.FOR_STATEMENT__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StPackage.FOR_STATEMENT__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.FOR_STATEMENT__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Expression newTo, NotificationChain msgs) {
		Expression oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StPackage.FOR_STATEMENT__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Expression newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StPackage.FOR_STATEMENT__TO, null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StPackage.FOR_STATEMENT__TO, null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.FOR_STATEMENT__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBy() {
		return by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBy(Expression newBy, NotificationChain msgs) {
		Expression oldBy = by;
		by = newBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StPackage.FOR_STATEMENT__BY, oldBy, newBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBy(Expression newBy) {
		if (newBy != by) {
			NotificationChain msgs = null;
			if (by != null)
				msgs = ((InternalEObject)by).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StPackage.FOR_STATEMENT__BY, null, msgs);
			if (newBy != null)
				msgs = ((InternalEObject)newBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StPackage.FOR_STATEMENT__BY, null, msgs);
			msgs = basicSetBy(newBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.FOR_STATEMENT__BY, newBy, newBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementList getDo() {
		return do_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDo(StatementList newDo, NotificationChain msgs) {
		StatementList oldDo = do_;
		do_ = newDo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StPackage.FOR_STATEMENT__DO, oldDo, newDo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDo(StatementList newDo) {
		if (newDo != do_) {
			NotificationChain msgs = null;
			if (do_ != null)
				msgs = ((InternalEObject)do_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StPackage.FOR_STATEMENT__DO, null, msgs);
			if (newDo != null)
				msgs = ((InternalEObject)newDo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StPackage.FOR_STATEMENT__DO, null, msgs);
			msgs = basicSetDo(newDo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.FOR_STATEMENT__DO, newDo, newDo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StPackage.FOR_STATEMENT__FROM:
				return basicSetFrom(null, msgs);
			case StPackage.FOR_STATEMENT__TO:
				return basicSetTo(null, msgs);
			case StPackage.FOR_STATEMENT__BY:
				return basicSetBy(null, msgs);
			case StPackage.FOR_STATEMENT__DO:
				return basicSetDo(null, msgs);
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
			case StPackage.FOR_STATEMENT__FROM:
				return getFrom();
			case StPackage.FOR_STATEMENT__TO:
				return getTo();
			case StPackage.FOR_STATEMENT__BY:
				return getBy();
			case StPackage.FOR_STATEMENT__DO:
				return getDo();
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
			case StPackage.FOR_STATEMENT__FROM:
				setFrom((Expression)newValue);
				return;
			case StPackage.FOR_STATEMENT__TO:
				setTo((Expression)newValue);
				return;
			case StPackage.FOR_STATEMENT__BY:
				setBy((Expression)newValue);
				return;
			case StPackage.FOR_STATEMENT__DO:
				setDo((StatementList)newValue);
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
			case StPackage.FOR_STATEMENT__FROM:
				setFrom((Expression)null);
				return;
			case StPackage.FOR_STATEMENT__TO:
				setTo((Expression)null);
				return;
			case StPackage.FOR_STATEMENT__BY:
				setBy((Expression)null);
				return;
			case StPackage.FOR_STATEMENT__DO:
				setDo((StatementList)null);
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
			case StPackage.FOR_STATEMENT__FROM:
				return from != null;
			case StPackage.FOR_STATEMENT__TO:
				return to != null;
			case StPackage.FOR_STATEMENT__BY:
				return by != null;
			case StPackage.FOR_STATEMENT__DO:
				return do_ != null;
		}
		return super.eIsSet(featureID);
	}

} //ForStatementImpl

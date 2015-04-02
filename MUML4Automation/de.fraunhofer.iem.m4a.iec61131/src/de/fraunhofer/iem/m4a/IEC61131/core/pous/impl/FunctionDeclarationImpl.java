/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.pous.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVariableDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.impl.LibraryElementImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.CommentableElement;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionReturnDomain;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage;
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
 * An implementation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionDeclarationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionDeclarationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionDeclarationImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionDeclarationImpl#getReturnDomain <em>Return Domain</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionDeclarationImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDeclarationImpl extends LibraryElementImpl implements FunctionDeclaration {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = "st";

	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionVariableDeclaration> declarations;

	/**
	 * The cached value of the '{@link #getReturnDomain() <em>Return Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnDomain()
	 * @generated
	 * @ordered
	 */
	protected FunctionReturnDomain returnDomain;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected FunctionBody body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PousPackage.Literals.FUNCTION_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PousPackage.FUNCTION_DECLARATION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getLanguage() {
		// TODO: implement this method to return the 'Language' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setLanguage(String newLanguage) {
		// TODO: implement this method to set the 'Language' attribute
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionVariableDeclaration> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<FunctionVariableDeclaration>(FunctionVariableDeclaration.class, this, PousPackage.FUNCTION_DECLARATION__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionReturnDomain getReturnDomain() {
		if (returnDomain != null && returnDomain.eIsProxy()) {
			InternalEObject oldReturnDomain = (InternalEObject)returnDomain;
			returnDomain = (FunctionReturnDomain)eResolveProxy(oldReturnDomain);
			if (returnDomain != oldReturnDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PousPackage.FUNCTION_DECLARATION__RETURN_DOMAIN, oldReturnDomain, returnDomain));
			}
		}
		return returnDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionReturnDomain basicGetReturnDomain() {
		return returnDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnDomain(FunctionReturnDomain newReturnDomain) {
		FunctionReturnDomain oldReturnDomain = returnDomain;
		returnDomain = newReturnDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PousPackage.FUNCTION_DECLARATION__RETURN_DOMAIN, oldReturnDomain, returnDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBody getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(FunctionBody newBody, NotificationChain msgs) {
		FunctionBody oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PousPackage.FUNCTION_DECLARATION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(FunctionBody newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PousPackage.FUNCTION_DECLARATION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PousPackage.FUNCTION_DECLARATION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PousPackage.FUNCTION_DECLARATION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PousPackage.FUNCTION_DECLARATION__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case PousPackage.FUNCTION_DECLARATION__BODY:
				return basicSetBody(null, msgs);
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
			case PousPackage.FUNCTION_DECLARATION__COMMENT:
				return getComment();
			case PousPackage.FUNCTION_DECLARATION__LANGUAGE:
				return getLanguage();
			case PousPackage.FUNCTION_DECLARATION__DECLARATIONS:
				return getDeclarations();
			case PousPackage.FUNCTION_DECLARATION__RETURN_DOMAIN:
				if (resolve) return getReturnDomain();
				return basicGetReturnDomain();
			case PousPackage.FUNCTION_DECLARATION__BODY:
				return getBody();
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
			case PousPackage.FUNCTION_DECLARATION__COMMENT:
				setComment((String)newValue);
				return;
			case PousPackage.FUNCTION_DECLARATION__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case PousPackage.FUNCTION_DECLARATION__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends FunctionVariableDeclaration>)newValue);
				return;
			case PousPackage.FUNCTION_DECLARATION__RETURN_DOMAIN:
				setReturnDomain((FunctionReturnDomain)newValue);
				return;
			case PousPackage.FUNCTION_DECLARATION__BODY:
				setBody((FunctionBody)newValue);
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
			case PousPackage.FUNCTION_DECLARATION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case PousPackage.FUNCTION_DECLARATION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case PousPackage.FUNCTION_DECLARATION__DECLARATIONS:
				getDeclarations().clear();
				return;
			case PousPackage.FUNCTION_DECLARATION__RETURN_DOMAIN:
				setReturnDomain((FunctionReturnDomain)null);
				return;
			case PousPackage.FUNCTION_DECLARATION__BODY:
				setBody((FunctionBody)null);
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
			case PousPackage.FUNCTION_DECLARATION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case PousPackage.FUNCTION_DECLARATION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? getLanguage() != null : !LANGUAGE_EDEFAULT.equals(getLanguage());
			case PousPackage.FUNCTION_DECLARATION__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case PousPackage.FUNCTION_DECLARATION__RETURN_DOMAIN:
				return returnDomain != null;
			case PousPackage.FUNCTION_DECLARATION__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case PousPackage.FUNCTION_DECLARATION__COMMENT: return LiteralsPackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case LiteralsPackage.COMMENTABLE_ELEMENT__COMMENT: return PousPackage.FUNCTION_DECLARATION__COMMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //FunctionDeclarationImpl

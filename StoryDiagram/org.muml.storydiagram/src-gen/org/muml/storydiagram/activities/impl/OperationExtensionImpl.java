/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.mumlcore.CommentableElement;
import org.muml.mumlcore.CorePackage;
import org.muml.mumlcore.ExtendableElement;
import org.muml.mumlcore.Extension;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.OperationExtension;
import org.muml.storydiagram.activities.util.ActivitiesValidator;
import org.muml.storydiagram.calls.Callable;
import org.muml.storydiagram.calls.CallsPackage;
import org.muml.storydiagram.impl.SDMExtensionImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Operation Extension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.impl.OperationExtensionImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.OperationExtensionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.OperationExtensionImpl#getInParameters <em>In Parameters</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.OperationExtensionImpl#getOutParameters <em>Out Parameters</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.OperationExtensionImpl#getContainedParameters <em>Contained Parameters</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.OperationExtensionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.OperationExtensionImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.OperationExtensionImpl#getOwnedActivity <em>Owned Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationExtensionImpl extends SDMExtensionImpl implements
		OperationExtension {
	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extensions;
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = "\"no comment provided\"";
	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getInParameters() <em>In Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> inParameters;
	/**
	 * The cached value of the '{@link #getOutParameters() <em>Out Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> outParameters;
	/**
	 * The cached value of the '{@link #getContainedParameters() <em>Contained Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContainedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> containedParameters;
	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected EParameter returnValue;
	/**
	 * The cached value of the '{@link #getOwnedActivity() <em>Owned Activity</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOwnedActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity ownedActivity;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.OPERATION_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentWithInverseEList<Extension>(Extension.class, this, ActivitiesPackage.OPERATION_EXTENSION__EXTENSIONS, CorePackage.EXTENSION__EXTENDABLE_BASE);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OPERATION_EXTENSION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EParameter> getContainedParameters() {
		if (containedParameters == null) {
			containedParameters = new EObjectContainmentEList<EParameter>(EParameter.class, this, ActivitiesPackage.OPERATION_EXTENSION__CONTAINED_PARAMETERS);
		}
		return containedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation() {
		// TODO: implement this method to return the 'Operation' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<EParameter> getInParameters() {
		final EOperation operation = getOperation();
		return operation == null ? ECollections.<EParameter> emptyEList()
				: operation.getEParameters();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<EParameter> getOutParameters() {
		final EOperation operation = getOperation();

		if (operation == null || operation.getEType() == null) {
			return ECollections.<EParameter> emptyEList();
		}

		if (getReturnValue() == null) {
			final EParameter parameter;
			parameter = EcorePackage.eINSTANCE.getEcoreFactory()
					.createEParameter();
			parameter.setName("returnValue");
			setReturnValue(parameter);
		}

		if (operation.getEType() != getReturnValue().getEType()) {
			getReturnValue().setEType(operation.getEType());
		}

		return new BasicEList.UnmodifiableEList<EParameter>(1,
				new EParameter[] { getReturnValue() });
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EParameter getReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnValue(EParameter newReturnValue,
			NotificationChain msgs) {
		EParameter oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE, oldReturnValue, newReturnValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> Only for internal use in this class. UMLLab does not generate correct visibility for some reason... <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValue(EParameter newReturnValue) {
		if (newReturnValue != returnValue) {
			NotificationChain msgs = null;
			if (returnValue != null)
				msgs = ((InternalEObject)returnValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE, null, msgs);
			if (newReturnValue != null)
				msgs = ((InternalEObject)newReturnValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE, null, msgs);
			msgs = basicSetReturnValue(newReturnValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE, newReturnValue, newReturnValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getOwnedActivity() {
		return ownedActivity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedActivity(Activity newOwnedActivity,
			NotificationChain msgs) {
		Activity oldOwnedActivity = ownedActivity;
		ownedActivity = newOwnedActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY, oldOwnedActivity, newOwnedActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedActivity(Activity newOwnedActivity) {
		if (newOwnedActivity != ownedActivity) {
			NotificationChain msgs = null;
			if (ownedActivity != null)
				msgs = ((InternalEObject)ownedActivity).eInverseRemove(this, ActivitiesPackage.ACTIVITY__OWNING_OPERATION, Activity.class, msgs);
			if (newOwnedActivity != null)
				msgs = ((InternalEObject)newOwnedActivity).eInverseAdd(this, ActivitiesPackage.ACTIVITY__OWNING_OPERATION, Activity.class, msgs);
			msgs = basicSetOwnedActivity(newOwnedActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY, newOwnedActivity, newOwnedActivity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NumberOfOutParams(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ActivitiesValidator.DIAGNOSTIC_SOURCE,
						 ActivitiesValidator.OPERATION_EXTENSION__NUMBER_OF_OUT_PARAMS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NumberOfOutParams", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension(final EClass type) {
		EList<Extension> extensions = this.getExtensions();
						for (Extension extension : extensions) {
							if (type.isInstance(extension)) {
								return extension;
							}
						}
						return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitiesPackage.OPERATION_EXTENSION__EXTENSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensions()).basicAdd(otherEnd, msgs);
			case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
				if (ownedActivity != null)
					msgs = ((InternalEObject)ownedActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY, null, msgs);
				return basicSetOwnedActivity((Activity)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitiesPackage.OPERATION_EXTENSION__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case ActivitiesPackage.OPERATION_EXTENSION__CONTAINED_PARAMETERS:
				return ((InternalEList<?>)getContainedParameters()).basicRemove(otherEnd, msgs);
			case ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE:
				return basicSetReturnValue(null, msgs);
			case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
				return basicSetOwnedActivity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitiesPackage.OPERATION_EXTENSION__EXTENSIONS:
				return getExtensions();
			case ActivitiesPackage.OPERATION_EXTENSION__COMMENT:
				return getComment();
			case ActivitiesPackage.OPERATION_EXTENSION__IN_PARAMETERS:
				return getInParameters();
			case ActivitiesPackage.OPERATION_EXTENSION__OUT_PARAMETERS:
				return getOutParameters();
			case ActivitiesPackage.OPERATION_EXTENSION__CONTAINED_PARAMETERS:
				return getContainedParameters();
			case ActivitiesPackage.OPERATION_EXTENSION__OPERATION:
				return getOperation();
			case ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE:
				return getReturnValue();
			case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
				return getOwnedActivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitiesPackage.OPERATION_EXTENSION__EXTENSIONS:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Extension>)newValue);
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__COMMENT:
				setComment((String)newValue);
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__IN_PARAMETERS:
				getInParameters().clear();
				getInParameters().addAll((Collection<? extends EParameter>)newValue);
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__OUT_PARAMETERS:
				getOutParameters().clear();
				getOutParameters().addAll((Collection<? extends EParameter>)newValue);
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__CONTAINED_PARAMETERS:
				getContainedParameters().clear();
				getContainedParameters().addAll((Collection<? extends EParameter>)newValue);
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE:
				setReturnValue((EParameter)newValue);
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
				setOwnedActivity((Activity)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.OPERATION_EXTENSION__EXTENSIONS:
				getExtensions().clear();
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__IN_PARAMETERS:
				getInParameters().clear();
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__OUT_PARAMETERS:
				getOutParameters().clear();
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__CONTAINED_PARAMETERS:
				getContainedParameters().clear();
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE:
				setReturnValue((EParameter)null);
				return;
			case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
				setOwnedActivity((Activity)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.OPERATION_EXTENSION__EXTENSIONS:
				return extensions != null && !extensions.isEmpty();
			case ActivitiesPackage.OPERATION_EXTENSION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ActivitiesPackage.OPERATION_EXTENSION__IN_PARAMETERS:
				return inParameters != null && !inParameters.isEmpty();
			case ActivitiesPackage.OPERATION_EXTENSION__OUT_PARAMETERS:
				return outParameters != null && !outParameters.isEmpty();
			case ActivitiesPackage.OPERATION_EXTENSION__CONTAINED_PARAMETERS:
				return containedParameters != null && !containedParameters.isEmpty();
			case ActivitiesPackage.OPERATION_EXTENSION__OPERATION:
				return getOperation() != null;
			case ActivitiesPackage.OPERATION_EXTENSION__RETURN_VALUE:
				return returnValue != null;
			case ActivitiesPackage.OPERATION_EXTENSION__OWNED_ACTIVITY:
				return ownedActivity != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ExtendableElement.class) {
			switch (derivedFeatureID) {
				case ActivitiesPackage.OPERATION_EXTENSION__EXTENSIONS: return CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case ActivitiesPackage.OPERATION_EXTENSION__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Callable.class) {
			switch (derivedFeatureID) {
				case ActivitiesPackage.OPERATION_EXTENSION__IN_PARAMETERS: return CallsPackage.CALLABLE__IN_PARAMETERS;
				case ActivitiesPackage.OPERATION_EXTENSION__OUT_PARAMETERS: return CallsPackage.CALLABLE__OUT_PARAMETERS;
				case ActivitiesPackage.OPERATION_EXTENSION__CONTAINED_PARAMETERS: return CallsPackage.CALLABLE__CONTAINED_PARAMETERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ExtendableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS: return ActivitiesPackage.OPERATION_EXTENSION__EXTENSIONS;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return ActivitiesPackage.OPERATION_EXTENSION__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Callable.class) {
			switch (baseFeatureID) {
				case CallsPackage.CALLABLE__IN_PARAMETERS: return ActivitiesPackage.OPERATION_EXTENSION__IN_PARAMETERS;
				case CallsPackage.CALLABLE__OUT_PARAMETERS: return ActivitiesPackage.OPERATION_EXTENSION__OUT_PARAMETERS;
				case CallsPackage.CALLABLE__CONTAINED_PARAMETERS: return ActivitiesPackage.OPERATION_EXTENSION__CONTAINED_PARAMETERS;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ExtendableElement.class) {
			switch (baseOperationID) {
				case CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS: return ActivitiesPackage.OPERATION_EXTENSION___GET_EXTENSION__ECLASS;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Callable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case ActivitiesPackage.OPERATION_EXTENSION___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP:
				return NumberOfOutParams((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ActivitiesPackage.OPERATION_EXTENSION___GET_EXTENSION__ECLASS:
				return getExtension((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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


} // OperationExtensionImpl

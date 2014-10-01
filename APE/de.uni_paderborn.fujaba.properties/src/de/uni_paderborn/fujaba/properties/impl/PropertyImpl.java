/**
 */
package de.uni_paderborn.fujaba.properties.impl;

import de.uni_paderborn.fujaba.properties.CreationConstraint;
import de.uni_paderborn.fujaba.properties.Filter;
import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.properties.PropertiesPackage;
import de.uni_paderborn.fujaba.properties.Property;
import de.uni_paderborn.fujaba.properties.PropertyCategory;
import de.uni_paderborn.fujaba.properties.PropertyEditor;
import de.uni_paderborn.fujaba.properties.PropertyFilter;
import de.uni_paderborn.fujaba.properties.PropertyTab;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyImpl#getGenFeature <em>Gen Feature</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyImpl#getVisibilityFilters <em>Visibility Filters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyImpl#getTab <em>Tab</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyImpl#isReconcile <em>Reconcile</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyImpl#getCreationConstraint <em>Creation Constraint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyImpl#getCreationOppositeConstraint <em>Creation Opposite Constraint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyImpl#getInitializeOCLExpression <em>Initialize OCL Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends EObjectImpl implements Property {
	/**
	 * The cached value of the '{@link #getGenFeature() <em>Gen Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenFeature()
	 * @generated
	 * @ordered
	 */
	protected GenFeature genFeature;

	/**
	 * The cached value of the '{@link #getVisibilityFilters() <em>Visibility Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilityFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> visibilityFilters;

	/**
	 * The cached value of the '{@link #getTab() <em>Tab</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTab()
	 * @generated
	 * @ordered
	 */
	protected PropertyTab tab;

	/**
	 * The cached value of the '{@link #getEditor() <em>Editor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected PropertyEditor editor;

	/**
	 * The default value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOLTIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected String tooltip = TOOLTIP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected PropertyCategory category;

	/**
	 * The default value of the '{@link #isReconcile() <em>Reconcile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReconcile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECONCILE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isReconcile() <em>Reconcile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReconcile()
	 * @generated
	 * @ordered
	 */
	protected boolean reconcile = RECONCILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreationConstraint() <em>Creation Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationConstraint()
	 * @generated
	 * @ordered
	 */
	protected CreationConstraint creationConstraint;

	/**
	 * The cached value of the '{@link #getCreationOppositeConstraint() <em>Creation Opposite Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationOppositeConstraint()
	 * @generated
	 * @ordered
	 */
	protected CreationConstraint creationOppositeConstraint;

	/**
	 * The default value of the '{@link #getInitializeOCLExpression() <em>Initialize OCL Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializeOCLExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIALIZE_OCL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitializeOCLExpression() <em>Initialize OCL Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializeOCLExpression()
	 * @generated
	 * @ordered
	 */
	protected String initializeOCLExpression = INITIALIZE_OCL_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature getGenFeature() {
		if (genFeature != null && genFeature.eIsProxy()) {
			InternalEObject oldGenFeature = (InternalEObject)genFeature;
			genFeature = (GenFeature)eResolveProxy(oldGenFeature);
			if (genFeature != oldGenFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.PROPERTY__GEN_FEATURE, oldGenFeature, genFeature));
			}
		}
		return genFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature basicGetGenFeature() {
		return genFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenFeature(GenFeature newGenFeature) {
		GenFeature oldGenFeature = genFeature;
		genFeature = newGenFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__GEN_FEATURE, oldGenFeature, genFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getVisibilityFilters() {
		if (visibilityFilters == null) {
			visibilityFilters = new EObjectContainmentEList<Filter>(Filter.class, this, PropertiesPackage.PROPERTY__VISIBILITY_FILTERS);
		}
		return visibilityFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTab getTab() {
		if (tab != null && tab.eIsProxy()) {
			InternalEObject oldTab = (InternalEObject)tab;
			tab = (PropertyTab)eResolveProxy(oldTab);
			if (tab != oldTab) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.PROPERTY__TAB, oldTab, tab));
			}
		}
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTab basicGetTab() {
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTab(PropertyTab newTab) {
		PropertyTab oldTab = tab;
		tab = newTab;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__TAB, oldTab, tab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyEditor getEditor() {
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditor(PropertyEditor newEditor, NotificationChain msgs) {
		PropertyEditor oldEditor = editor;
		editor = newEditor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__EDITOR, oldEditor, newEditor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditor(PropertyEditor newEditor) {
		if (newEditor != editor) {
			NotificationChain msgs = null;
			if (editor != null)
				msgs = ((InternalEObject)editor).eInverseRemove(this, PropertiesPackage.PROPERTY_EDITOR__PROPERTY, PropertyEditor.class, msgs);
			if (newEditor != null)
				msgs = ((InternalEObject)newEditor).eInverseAdd(this, PropertiesPackage.PROPERTY_EDITOR__PROPERTY, PropertyEditor.class, msgs);
			msgs = basicSetEditor(newEditor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__EDITOR, newEditor, newEditor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTooltip() {
		return tooltip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltip(String newTooltip) {
		String oldTooltip = tooltip;
		tooltip = newTooltip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__TOOLTIP, oldTooltip, tooltip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.properties.Class getClazz() {
		if (eContainerFeatureID() != PropertiesPackage.PROPERTY__CLAZZ) return null;
		return (de.uni_paderborn.fujaba.properties.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClazz(de.uni_paderborn.fujaba.properties.Class newClazz, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClazz, PropertiesPackage.PROPERTY__CLAZZ, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClazz(de.uni_paderborn.fujaba.properties.Class newClazz) {
		if (newClazz != eInternalContainer() || (eContainerFeatureID() != PropertiesPackage.PROPERTY__CLAZZ && newClazz != null)) {
			if (EcoreUtil.isAncestor(this, newClazz))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClazz != null)
				msgs = ((InternalEObject)newClazz).eInverseAdd(this, PropertiesPackage.CLASS__PROPERTIES, de.uni_paderborn.fujaba.properties.Class.class, msgs);
			msgs = basicSetClazz(newClazz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__CLAZZ, newClazz, newClazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCategory getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (PropertyCategory)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.PROPERTY__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCategory basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(PropertyCategory newCategory, NotificationChain msgs) {
		PropertyCategory oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(PropertyCategory newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, PropertiesPackage.PROPERTY_CATEGORY__PROPERTIES, PropertyCategory.class, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, PropertiesPackage.PROPERTY_CATEGORY__PROPERTIES, PropertyCategory.class, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReconcile() {
		return reconcile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconcile(boolean newReconcile) {
		boolean oldReconcile = reconcile;
		reconcile = newReconcile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__RECONCILE, oldReconcile, reconcile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationConstraint getCreationConstraint() {
		return creationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationConstraint(CreationConstraint newCreationConstraint, NotificationChain msgs) {
		CreationConstraint oldCreationConstraint = creationConstraint;
		creationConstraint = newCreationConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__CREATION_CONSTRAINT, oldCreationConstraint, newCreationConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationConstraint(CreationConstraint newCreationConstraint) {
		if (newCreationConstraint != creationConstraint) {
			NotificationChain msgs = null;
			if (creationConstraint != null)
				msgs = ((InternalEObject)creationConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.PROPERTY__CREATION_CONSTRAINT, null, msgs);
			if (newCreationConstraint != null)
				msgs = ((InternalEObject)newCreationConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.PROPERTY__CREATION_CONSTRAINT, null, msgs);
			msgs = basicSetCreationConstraint(newCreationConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__CREATION_CONSTRAINT, newCreationConstraint, newCreationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationConstraint getCreationOppositeConstraint() {
		return creationOppositeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationOppositeConstraint(CreationConstraint newCreationOppositeConstraint, NotificationChain msgs) {
		CreationConstraint oldCreationOppositeConstraint = creationOppositeConstraint;
		creationOppositeConstraint = newCreationOppositeConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__CREATION_OPPOSITE_CONSTRAINT, oldCreationOppositeConstraint, newCreationOppositeConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationOppositeConstraint(CreationConstraint newCreationOppositeConstraint) {
		if (newCreationOppositeConstraint != creationOppositeConstraint) {
			NotificationChain msgs = null;
			if (creationOppositeConstraint != null)
				msgs = ((InternalEObject)creationOppositeConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.PROPERTY__CREATION_OPPOSITE_CONSTRAINT, null, msgs);
			if (newCreationOppositeConstraint != null)
				msgs = ((InternalEObject)newCreationOppositeConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.PROPERTY__CREATION_OPPOSITE_CONSTRAINT, null, msgs);
			msgs = basicSetCreationOppositeConstraint(newCreationOppositeConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__CREATION_OPPOSITE_CONSTRAINT, newCreationOppositeConstraint, newCreationOppositeConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitializeOCLExpression() {
		return initializeOCLExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializeOCLExpression(String newInitializeOCLExpression) {
		String oldInitializeOCLExpression = initializeOCLExpression;
		initializeOCLExpression = newInitializeOCLExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__INITIALIZE_OCL_EXPRESSION, oldInitializeOCLExpression, initializeOCLExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PropertiesPackage.PROPERTY__EDITOR:
				if (editor != null)
					msgs = ((InternalEObject)editor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.PROPERTY__EDITOR, null, msgs);
				return basicSetEditor((PropertyEditor)otherEnd, msgs);
			case PropertiesPackage.PROPERTY__CLAZZ:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClazz((de.uni_paderborn.fujaba.properties.Class)otherEnd, msgs);
			case PropertiesPackage.PROPERTY__CATEGORY:
				if (category != null)
					msgs = ((InternalEObject)category).eInverseRemove(this, PropertiesPackage.PROPERTY_CATEGORY__PROPERTIES, PropertyCategory.class, msgs);
				return basicSetCategory((PropertyCategory)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PropertiesPackage.PROPERTY__VISIBILITY_FILTERS:
				return ((InternalEList<?>)getVisibilityFilters()).basicRemove(otherEnd, msgs);
			case PropertiesPackage.PROPERTY__EDITOR:
				return basicSetEditor(null, msgs);
			case PropertiesPackage.PROPERTY__CLAZZ:
				return basicSetClazz(null, msgs);
			case PropertiesPackage.PROPERTY__CATEGORY:
				return basicSetCategory(null, msgs);
			case PropertiesPackage.PROPERTY__CREATION_CONSTRAINT:
				return basicSetCreationConstraint(null, msgs);
			case PropertiesPackage.PROPERTY__CREATION_OPPOSITE_CONSTRAINT:
				return basicSetCreationOppositeConstraint(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PropertiesPackage.PROPERTY__CLAZZ:
				return eInternalContainer().eInverseRemove(this, PropertiesPackage.CLASS__PROPERTIES, de.uni_paderborn.fujaba.properties.Class.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertiesPackage.PROPERTY__GEN_FEATURE:
				if (resolve) return getGenFeature();
				return basicGetGenFeature();
			case PropertiesPackage.PROPERTY__VISIBILITY_FILTERS:
				return getVisibilityFilters();
			case PropertiesPackage.PROPERTY__TAB:
				if (resolve) return getTab();
				return basicGetTab();
			case PropertiesPackage.PROPERTY__EDITOR:
				return getEditor();
			case PropertiesPackage.PROPERTY__TOOLTIP:
				return getTooltip();
			case PropertiesPackage.PROPERTY__CLAZZ:
				return getClazz();
			case PropertiesPackage.PROPERTY__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case PropertiesPackage.PROPERTY__RECONCILE:
				return isReconcile();
			case PropertiesPackage.PROPERTY__CREATION_CONSTRAINT:
				return getCreationConstraint();
			case PropertiesPackage.PROPERTY__CREATION_OPPOSITE_CONSTRAINT:
				return getCreationOppositeConstraint();
			case PropertiesPackage.PROPERTY__INITIALIZE_OCL_EXPRESSION:
				return getInitializeOCLExpression();
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
			case PropertiesPackage.PROPERTY__GEN_FEATURE:
				setGenFeature((GenFeature)newValue);
				return;
			case PropertiesPackage.PROPERTY__VISIBILITY_FILTERS:
				getVisibilityFilters().clear();
				getVisibilityFilters().addAll((Collection<? extends Filter>)newValue);
				return;
			case PropertiesPackage.PROPERTY__TAB:
				setTab((PropertyTab)newValue);
				return;
			case PropertiesPackage.PROPERTY__EDITOR:
				setEditor((PropertyEditor)newValue);
				return;
			case PropertiesPackage.PROPERTY__TOOLTIP:
				setTooltip((String)newValue);
				return;
			case PropertiesPackage.PROPERTY__CLAZZ:
				setClazz((de.uni_paderborn.fujaba.properties.Class)newValue);
				return;
			case PropertiesPackage.PROPERTY__CATEGORY:
				setCategory((PropertyCategory)newValue);
				return;
			case PropertiesPackage.PROPERTY__RECONCILE:
				setReconcile((Boolean)newValue);
				return;
			case PropertiesPackage.PROPERTY__CREATION_CONSTRAINT:
				setCreationConstraint((CreationConstraint)newValue);
				return;
			case PropertiesPackage.PROPERTY__CREATION_OPPOSITE_CONSTRAINT:
				setCreationOppositeConstraint((CreationConstraint)newValue);
				return;
			case PropertiesPackage.PROPERTY__INITIALIZE_OCL_EXPRESSION:
				setInitializeOCLExpression((String)newValue);
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
			case PropertiesPackage.PROPERTY__GEN_FEATURE:
				setGenFeature((GenFeature)null);
				return;
			case PropertiesPackage.PROPERTY__VISIBILITY_FILTERS:
				getVisibilityFilters().clear();
				return;
			case PropertiesPackage.PROPERTY__TAB:
				setTab((PropertyTab)null);
				return;
			case PropertiesPackage.PROPERTY__EDITOR:
				setEditor((PropertyEditor)null);
				return;
			case PropertiesPackage.PROPERTY__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
				return;
			case PropertiesPackage.PROPERTY__CLAZZ:
				setClazz((de.uni_paderborn.fujaba.properties.Class)null);
				return;
			case PropertiesPackage.PROPERTY__CATEGORY:
				setCategory((PropertyCategory)null);
				return;
			case PropertiesPackage.PROPERTY__RECONCILE:
				setReconcile(RECONCILE_EDEFAULT);
				return;
			case PropertiesPackage.PROPERTY__CREATION_CONSTRAINT:
				setCreationConstraint((CreationConstraint)null);
				return;
			case PropertiesPackage.PROPERTY__CREATION_OPPOSITE_CONSTRAINT:
				setCreationOppositeConstraint((CreationConstraint)null);
				return;
			case PropertiesPackage.PROPERTY__INITIALIZE_OCL_EXPRESSION:
				setInitializeOCLExpression(INITIALIZE_OCL_EXPRESSION_EDEFAULT);
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
			case PropertiesPackage.PROPERTY__GEN_FEATURE:
				return genFeature != null;
			case PropertiesPackage.PROPERTY__VISIBILITY_FILTERS:
				return visibilityFilters != null && !visibilityFilters.isEmpty();
			case PropertiesPackage.PROPERTY__TAB:
				return tab != null;
			case PropertiesPackage.PROPERTY__EDITOR:
				return editor != null;
			case PropertiesPackage.PROPERTY__TOOLTIP:
				return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
			case PropertiesPackage.PROPERTY__CLAZZ:
				return getClazz() != null;
			case PropertiesPackage.PROPERTY__CATEGORY:
				return category != null;
			case PropertiesPackage.PROPERTY__RECONCILE:
				return reconcile != RECONCILE_EDEFAULT;
			case PropertiesPackage.PROPERTY__CREATION_CONSTRAINT:
				return creationConstraint != null;
			case PropertiesPackage.PROPERTY__CREATION_OPPOSITE_CONSTRAINT:
				return creationOppositeConstraint != null;
			case PropertiesPackage.PROPERTY__INITIALIZE_OCL_EXPRESSION:
				return INITIALIZE_OCL_EXPRESSION_EDEFAULT == null ? initializeOCLExpression != null : !INITIALIZE_OCL_EXPRESSION_EDEFAULT.equals(initializeOCLExpression);
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
		result.append(" (tooltip: ");
		result.append(tooltip);
		result.append(", reconcile: ");
		result.append(reconcile);
		result.append(", initializeOCLExpression: ");
		result.append(initializeOCLExpression);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl

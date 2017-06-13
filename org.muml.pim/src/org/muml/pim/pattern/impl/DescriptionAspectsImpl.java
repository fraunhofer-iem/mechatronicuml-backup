/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.pattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.muml.pim.pattern.DescriptionAspects;
import org.muml.pim.pattern.PatternPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description Aspects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl#getOverview <em>Overview</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl#getProblem <em>Problem</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl#getConsequences <em>Consequences</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl#getCombineability <em>Combineability</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl#getAlsoKnownAs <em>Also Known As</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl#getVerification_properties <em>Verification properties</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl#getSearchTerms <em>Search Terms</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.DescriptionAspectsImpl#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptionAspectsImpl extends EObjectImpl implements DescriptionAspects {
	/**
	 * The default value of the '{@link #getOverview() <em>Overview</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverview()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERVIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverview() <em>Overview</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverview()
	 * @generated
	 * @ordered
	 */
	protected String overview = OVERVIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProblem() <em>Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBLEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProblem() <em>Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected String problem = PROBLEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolution() <em>Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected String solution = SOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStructure() <em>Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected static final String STRUCTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected String structure = STRUCTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected String behavior = BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getExamples() <em>Examples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExamples() <em>Examples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected String examples = EXAMPLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsequences() <em>Consequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequences()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSEQUENCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsequences() <em>Consequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequences()
	 * @generated
	 * @ordered
	 */
	protected String consequences = CONSEQUENCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCombineability() <em>Combineability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombineability()
	 * @generated
	 * @ordered
	 */
	protected static final String COMBINEABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCombineability() <em>Combineability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombineability()
	 * @generated
	 * @ordered
	 */
	protected String combineability = COMBINEABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariants() <em>Variants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIANTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected String variants = VARIANTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlsoKnownAs() <em>Also Known As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlsoKnownAs()
	 * @generated
	 * @ordered
	 */
	protected static final String ALSO_KNOWN_AS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlsoKnownAs() <em>Also Known As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlsoKnownAs()
	 * @generated
	 * @ordered
	 */
	protected String alsoKnownAs = ALSO_KNOWN_AS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerification_properties() <em>Verification properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerification_properties()
	 * @generated
	 * @ordered
	 */
	protected static final String VERIFICATION_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerification_properties() <em>Verification properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerification_properties()
	 * @generated
	 * @ordered
	 */
	protected String verification_properties = VERIFICATION_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSearchTerms() <em>Search Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchTerms()
	 * @generated
	 * @ordered
	 */
	protected static final String SEARCH_TERMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSearchTerms() <em>Search Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchTerms()
	 * @generated
	 * @ordered
	 */
	protected String searchTerms = SEARCH_TERMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlternatives() <em>Alternatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternatives()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternatives() <em>Alternatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternatives()
	 * @generated
	 * @ordered
	 */
	protected String alternatives = ALTERNATIVES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionAspectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.DESCRIPTION_ASPECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverview() {
		return overview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverview(String newOverview) {
		String oldOverview = overview;
		overview = newOverview;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DESCRIPTION_ASPECTS__OVERVIEW, oldOverview, overview));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DESCRIPTION_ASPECTS__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProblem() {
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblem(String newProblem) {
		String oldProblem = problem;
		problem = newProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DESCRIPTION_ASPECTS__PROBLEM, oldProblem, problem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolution() {
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolution(String newSolution) {
		String oldSolution = solution;
		solution = newSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DESCRIPTION_ASPECTS__SOLUTION, oldSolution, solution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(String newStructure) {
		String oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DESCRIPTION_ASPECTS__STRUCTURE, oldStructure, structure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(String newBehavior) {
		String oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DESCRIPTION_ASPECTS__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExamples() {
		return examples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExamples(String newExamples) {
		String oldExamples = examples;
		examples = newExamples;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DESCRIPTION_ASPECTS__EXAMPLES, oldExamples, examples));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsequences() {
		return consequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequences(String newConsequences) {
		String oldConsequences = consequences;
		consequences = newConsequences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DESCRIPTION_ASPECTS__CONSEQUENCES, oldConsequences, consequences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCombineability() {
		return combineability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombineability(String newCombineability) {
		String oldCombineability = combineability;
		combineability = newCombineability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DESCRIPTION_ASPECTS__COMBINEABILITY, oldCombineability, combineability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariants() {
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariants(String newVariants) {
		String oldVariants = variants;
		variants = newVariants;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DESCRIPTION_ASPECTS__VARIANTS, oldVariants, variants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlsoKnownAs() {
		return alsoKnownAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlsoKnownAs(String newAlsoKnownAs) {
		String oldAlsoKnownAs = alsoKnownAs;
		alsoKnownAs = newAlsoKnownAs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DESCRIPTION_ASPECTS__ALSO_KNOWN_AS, oldAlsoKnownAs, alsoKnownAs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlternatives() {
		return alternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternatives(String newAlternatives) {
		String oldAlternatives = alternatives;
		alternatives = newAlternatives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DESCRIPTION_ASPECTS__ALTERNATIVES, oldAlternatives, alternatives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVerification_properties() {
		return verification_properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerification_properties(String newVerification_properties) {
		String oldVerification_properties = verification_properties;
		verification_properties = newVerification_properties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DESCRIPTION_ASPECTS__VERIFICATION_PROPERTIES, oldVerification_properties, verification_properties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSearchTerms() {
		return searchTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchTerms(String newSearchTerms) {
		String oldSearchTerms = searchTerms;
		searchTerms = newSearchTerms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DESCRIPTION_ASPECTS__SEARCH_TERMS, oldSearchTerms, searchTerms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternPackage.DESCRIPTION_ASPECTS__OVERVIEW:
				return getOverview();
			case PatternPackage.DESCRIPTION_ASPECTS__CONTEXT:
				return getContext();
			case PatternPackage.DESCRIPTION_ASPECTS__PROBLEM:
				return getProblem();
			case PatternPackage.DESCRIPTION_ASPECTS__SOLUTION:
				return getSolution();
			case PatternPackage.DESCRIPTION_ASPECTS__STRUCTURE:
				return getStructure();
			case PatternPackage.DESCRIPTION_ASPECTS__BEHAVIOR:
				return getBehavior();
			case PatternPackage.DESCRIPTION_ASPECTS__EXAMPLES:
				return getExamples();
			case PatternPackage.DESCRIPTION_ASPECTS__CONSEQUENCES:
				return getConsequences();
			case PatternPackage.DESCRIPTION_ASPECTS__COMBINEABILITY:
				return getCombineability();
			case PatternPackage.DESCRIPTION_ASPECTS__VARIANTS:
				return getVariants();
			case PatternPackage.DESCRIPTION_ASPECTS__ALSO_KNOWN_AS:
				return getAlsoKnownAs();
			case PatternPackage.DESCRIPTION_ASPECTS__VERIFICATION_PROPERTIES:
				return getVerification_properties();
			case PatternPackage.DESCRIPTION_ASPECTS__SEARCH_TERMS:
				return getSearchTerms();
			case PatternPackage.DESCRIPTION_ASPECTS__ALTERNATIVES:
				return getAlternatives();
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
			case PatternPackage.DESCRIPTION_ASPECTS__OVERVIEW:
				setOverview((String)newValue);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__CONTEXT:
				setContext((String)newValue);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__PROBLEM:
				setProblem((String)newValue);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__SOLUTION:
				setSolution((String)newValue);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__STRUCTURE:
				setStructure((String)newValue);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__BEHAVIOR:
				setBehavior((String)newValue);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__EXAMPLES:
				setExamples((String)newValue);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__CONSEQUENCES:
				setConsequences((String)newValue);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__COMBINEABILITY:
				setCombineability((String)newValue);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__VARIANTS:
				setVariants((String)newValue);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__ALSO_KNOWN_AS:
				setAlsoKnownAs((String)newValue);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__VERIFICATION_PROPERTIES:
				setVerification_properties((String)newValue);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__SEARCH_TERMS:
				setSearchTerms((String)newValue);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__ALTERNATIVES:
				setAlternatives((String)newValue);
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
			case PatternPackage.DESCRIPTION_ASPECTS__OVERVIEW:
				setOverview(OVERVIEW_EDEFAULT);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__PROBLEM:
				setProblem(PROBLEM_EDEFAULT);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__SOLUTION:
				setSolution(SOLUTION_EDEFAULT);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__STRUCTURE:
				setStructure(STRUCTURE_EDEFAULT);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__BEHAVIOR:
				setBehavior(BEHAVIOR_EDEFAULT);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__EXAMPLES:
				setExamples(EXAMPLES_EDEFAULT);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__CONSEQUENCES:
				setConsequences(CONSEQUENCES_EDEFAULT);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__COMBINEABILITY:
				setCombineability(COMBINEABILITY_EDEFAULT);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__VARIANTS:
				setVariants(VARIANTS_EDEFAULT);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__ALSO_KNOWN_AS:
				setAlsoKnownAs(ALSO_KNOWN_AS_EDEFAULT);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__VERIFICATION_PROPERTIES:
				setVerification_properties(VERIFICATION_PROPERTIES_EDEFAULT);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__SEARCH_TERMS:
				setSearchTerms(SEARCH_TERMS_EDEFAULT);
				return;
			case PatternPackage.DESCRIPTION_ASPECTS__ALTERNATIVES:
				setAlternatives(ALTERNATIVES_EDEFAULT);
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
			case PatternPackage.DESCRIPTION_ASPECTS__OVERVIEW:
				return OVERVIEW_EDEFAULT == null ? overview != null : !OVERVIEW_EDEFAULT.equals(overview);
			case PatternPackage.DESCRIPTION_ASPECTS__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case PatternPackage.DESCRIPTION_ASPECTS__PROBLEM:
				return PROBLEM_EDEFAULT == null ? problem != null : !PROBLEM_EDEFAULT.equals(problem);
			case PatternPackage.DESCRIPTION_ASPECTS__SOLUTION:
				return SOLUTION_EDEFAULT == null ? solution != null : !SOLUTION_EDEFAULT.equals(solution);
			case PatternPackage.DESCRIPTION_ASPECTS__STRUCTURE:
				return STRUCTURE_EDEFAULT == null ? structure != null : !STRUCTURE_EDEFAULT.equals(structure);
			case PatternPackage.DESCRIPTION_ASPECTS__BEHAVIOR:
				return BEHAVIOR_EDEFAULT == null ? behavior != null : !BEHAVIOR_EDEFAULT.equals(behavior);
			case PatternPackage.DESCRIPTION_ASPECTS__EXAMPLES:
				return EXAMPLES_EDEFAULT == null ? examples != null : !EXAMPLES_EDEFAULT.equals(examples);
			case PatternPackage.DESCRIPTION_ASPECTS__CONSEQUENCES:
				return CONSEQUENCES_EDEFAULT == null ? consequences != null : !CONSEQUENCES_EDEFAULT.equals(consequences);
			case PatternPackage.DESCRIPTION_ASPECTS__COMBINEABILITY:
				return COMBINEABILITY_EDEFAULT == null ? combineability != null : !COMBINEABILITY_EDEFAULT.equals(combineability);
			case PatternPackage.DESCRIPTION_ASPECTS__VARIANTS:
				return VARIANTS_EDEFAULT == null ? variants != null : !VARIANTS_EDEFAULT.equals(variants);
			case PatternPackage.DESCRIPTION_ASPECTS__ALSO_KNOWN_AS:
				return ALSO_KNOWN_AS_EDEFAULT == null ? alsoKnownAs != null : !ALSO_KNOWN_AS_EDEFAULT.equals(alsoKnownAs);
			case PatternPackage.DESCRIPTION_ASPECTS__VERIFICATION_PROPERTIES:
				return VERIFICATION_PROPERTIES_EDEFAULT == null ? verification_properties != null : !VERIFICATION_PROPERTIES_EDEFAULT.equals(verification_properties);
			case PatternPackage.DESCRIPTION_ASPECTS__SEARCH_TERMS:
				return SEARCH_TERMS_EDEFAULT == null ? searchTerms != null : !SEARCH_TERMS_EDEFAULT.equals(searchTerms);
			case PatternPackage.DESCRIPTION_ASPECTS__ALTERNATIVES:
				return ALTERNATIVES_EDEFAULT == null ? alternatives != null : !ALTERNATIVES_EDEFAULT.equals(alternatives);
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
		result.append(" (overview: ");
		result.append(overview);
		result.append(", context: ");
		result.append(context);
		result.append(", problem: ");
		result.append(problem);
		result.append(", solution: ");
		result.append(solution);
		result.append(", structure: ");
		result.append(structure);
		result.append(", behavior: ");
		result.append(behavior);
		result.append(", examples: ");
		result.append(examples);
		result.append(", consequences: ");
		result.append(consequences);
		result.append(", combineability: ");
		result.append(combineability);
		result.append(", variants: ");
		result.append(variants);
		result.append(", alsoKnownAs: ");
		result.append(alsoKnownAs);
		result.append(", verification_properties: ");
		result.append(verification_properties);
		result.append(", searchTerms: ");
		result.append(searchTerms);
		result.append(", alternatives: ");
		result.append(alternatives);
		result.append(')');
		return result.toString();
	}

} //DescriptionAspectsImpl

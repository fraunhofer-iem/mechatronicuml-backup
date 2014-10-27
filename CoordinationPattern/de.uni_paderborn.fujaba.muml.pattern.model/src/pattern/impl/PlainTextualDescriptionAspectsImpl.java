/**
 */
package pattern.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pattern.PatternPackage;
import pattern.PlainTextualDescriptionAspects;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plain Textual Description Aspects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pattern.impl.PlainTextualDescriptionAspectsImpl#getOverview <em>Overview</em>}</li>
 *   <li>{@link pattern.impl.PlainTextualDescriptionAspectsImpl#getContext <em>Context</em>}</li>
 *   <li>{@link pattern.impl.PlainTextualDescriptionAspectsImpl#getProblem <em>Problem</em>}</li>
 *   <li>{@link pattern.impl.PlainTextualDescriptionAspectsImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link pattern.impl.PlainTextualDescriptionAspectsImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link pattern.impl.PlainTextualDescriptionAspectsImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link pattern.impl.PlainTextualDescriptionAspectsImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link pattern.impl.PlainTextualDescriptionAspectsImpl#getConsequences <em>Consequences</em>}</li>
 *   <li>{@link pattern.impl.PlainTextualDescriptionAspectsImpl#getCombineability <em>Combineability</em>}</li>
 *   <li>{@link pattern.impl.PlainTextualDescriptionAspectsImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link pattern.impl.PlainTextualDescriptionAspectsImpl#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlainTextualDescriptionAspectsImpl extends MinimalEObjectImpl.Container implements PlainTextualDescriptionAspects {
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
	protected PlainTextualDescriptionAspectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__OVERVIEW, oldOverview, overview));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__PROBLEM, oldProblem, problem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__SOLUTION, oldSolution, solution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__STRUCTURE, oldStructure, structure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__BEHAVIOR, oldBehavior, behavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__EXAMPLES, oldExamples, examples));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONSEQUENCES, oldConsequences, consequences));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__COMBINEABILITY, oldCombineability, combineability));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__VARIANTS, oldVariants, variants));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__ALTERNATIVES, oldAlternatives, alternatives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__OVERVIEW:
				return getOverview();
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONTEXT:
				return getContext();
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__PROBLEM:
				return getProblem();
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__SOLUTION:
				return getSolution();
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__STRUCTURE:
				return getStructure();
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__BEHAVIOR:
				return getBehavior();
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__EXAMPLES:
				return getExamples();
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONSEQUENCES:
				return getConsequences();
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__COMBINEABILITY:
				return getCombineability();
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__VARIANTS:
				return getVariants();
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__ALTERNATIVES:
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
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__OVERVIEW:
				setOverview((String)newValue);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONTEXT:
				setContext((String)newValue);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__PROBLEM:
				setProblem((String)newValue);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__SOLUTION:
				setSolution((String)newValue);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__STRUCTURE:
				setStructure((String)newValue);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__BEHAVIOR:
				setBehavior((String)newValue);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__EXAMPLES:
				setExamples((String)newValue);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONSEQUENCES:
				setConsequences((String)newValue);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__COMBINEABILITY:
				setCombineability((String)newValue);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__VARIANTS:
				setVariants((String)newValue);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__ALTERNATIVES:
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
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__OVERVIEW:
				setOverview(OVERVIEW_EDEFAULT);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__PROBLEM:
				setProblem(PROBLEM_EDEFAULT);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__SOLUTION:
				setSolution(SOLUTION_EDEFAULT);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__STRUCTURE:
				setStructure(STRUCTURE_EDEFAULT);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__BEHAVIOR:
				setBehavior(BEHAVIOR_EDEFAULT);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__EXAMPLES:
				setExamples(EXAMPLES_EDEFAULT);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONSEQUENCES:
				setConsequences(CONSEQUENCES_EDEFAULT);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__COMBINEABILITY:
				setCombineability(COMBINEABILITY_EDEFAULT);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__VARIANTS:
				setVariants(VARIANTS_EDEFAULT);
				return;
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__ALTERNATIVES:
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
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__OVERVIEW:
				return OVERVIEW_EDEFAULT == null ? overview != null : !OVERVIEW_EDEFAULT.equals(overview);
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__PROBLEM:
				return PROBLEM_EDEFAULT == null ? problem != null : !PROBLEM_EDEFAULT.equals(problem);
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__SOLUTION:
				return SOLUTION_EDEFAULT == null ? solution != null : !SOLUTION_EDEFAULT.equals(solution);
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__STRUCTURE:
				return STRUCTURE_EDEFAULT == null ? structure != null : !STRUCTURE_EDEFAULT.equals(structure);
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__BEHAVIOR:
				return BEHAVIOR_EDEFAULT == null ? behavior != null : !BEHAVIOR_EDEFAULT.equals(behavior);
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__EXAMPLES:
				return EXAMPLES_EDEFAULT == null ? examples != null : !EXAMPLES_EDEFAULT.equals(examples);
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONSEQUENCES:
				return CONSEQUENCES_EDEFAULT == null ? consequences != null : !CONSEQUENCES_EDEFAULT.equals(consequences);
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__COMBINEABILITY:
				return COMBINEABILITY_EDEFAULT == null ? combineability != null : !COMBINEABILITY_EDEFAULT.equals(combineability);
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__VARIANTS:
				return VARIANTS_EDEFAULT == null ? variants != null : !VARIANTS_EDEFAULT.equals(variants);
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__ALTERNATIVES:
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
		result.append(", alternatives: ");
		result.append(alternatives);
		result.append(')');
		return result.toString();
	}

} //PlainTextualDescriptionAspectsImpl

/*
* generated by Xtext
*/
package de.uni_paderborn.fujaba.muml.verification.uppaal.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.validation.Check;
import org.muml.core.NamedElement;

import com.google.inject.Inject;

import de.uni_paderborn.fujaba.muml.behavior.Variable;
import de.uni_paderborn.fujaba.muml.common.naming.QualifiedNameProvider;
import de.uni_paderborn.fujaba.muml.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.MessageBuffer;
import de.uni_paderborn.fujaba.muml.msgtype.MessageType;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.BufferMsgCountExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ConstExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MapExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.SourceStateExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TargetStateExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonOp;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.DeadlockExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicateExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StaticPredicateExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.AGExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.BoundVariable;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EFExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifierExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TemporalQuantifierExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.BufferSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ClockSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.InstanceSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.IntervalSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.MessageSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.StateSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.TransitionSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.common.MtctlModelElementProvider;
import de.uni_paderborn.fujaba.muml.verification.uppaal.scoping.MtctlQualifiedNameProvider;
import de.uni_paderborn.fujaba.muml.verification.uppaal.scoping.MtctlScopeProvider;

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
public class MtctlJavaValidator extends de.uni_paderborn.fujaba.muml.verification.uppaal.validation.AbstractMtctlJavaValidator {

	public enum Type {NUMERAL, CLOCK_VALUE, BUFFER, STATE, TRANSITION, MESSAGE_TYPE, CONNECTOR_ENDPOINT, CONNECTOR_ENDPOINT_INSTANCE};
	
	protected MtctlModelElementProvider elementProvider = null;
	protected static QualifiedNameProvider qualifiedNameProvider = new MtctlQualifiedNameProvider();
	
	@Inject
	IScopeProvider scopeProvider;
	
	public MtctlJavaValidator() {
		
	}
	
	/**
	 * Returns the ElementProvider
	 */
	protected MtctlModelElementProvider getElementProvider() {
		return ((MtctlScopeProvider) scopeProvider).getElementProvider();
	}
	
	public Type getType(MapExpr expr) {
		if (expr == null)
			return null;
		
		if (expr instanceof MumlElemExpr && ((MumlElemExpr) expr).getElem() instanceof BoundVariable) {
			if (((BoundVariable) ((MumlElemExpr) expr).getElem()).getSet() instanceof IntervalSetExpr) 
				return Type.NUMERAL;
			if (((BoundVariable) ((MumlElemExpr) expr).getElem()).getSet() instanceof TransitionSetExpr)
				return Type.TRANSITION;
			if (((BoundVariable) ((MumlElemExpr) expr).getElem()).getSet() instanceof ClockSetExpr)
				return Type.CLOCK_VALUE;
			if (((BoundVariable) ((MumlElemExpr) expr).getElem()).getSet() instanceof StateSetExpr)
				return Type.STATE;
			if (((BoundVariable) ((MumlElemExpr) expr).getElem()).getSet() instanceof MessageSetExpr)
				return Type.MESSAGE_TYPE;
			if (((BoundVariable) ((MumlElemExpr) expr).getElem()).getSet() instanceof BufferSetExpr)
				return Type.BUFFER;
			if (((BoundVariable) ((MumlElemExpr) expr).getElem()).getSet() instanceof InstanceSetExpr)			
				return Type.CONNECTOR_ENDPOINT_INSTANCE;
		}
			
		if (expr instanceof MumlElemExpr) {
			EObject elem = ((MumlElemExpr) expr).getElem();
			if (elem instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.State)
				return Type.STATE;
			if (elem instanceof Transition)
				return Type.TRANSITION;
			if (elem instanceof Clock)
				return Type.CLOCK_VALUE;
			if (elem instanceof Variable)
				return Type.NUMERAL;
			if (elem instanceof MessageBuffer)
				return Type.BUFFER;
			if (elem instanceof MessageType)
				return Type.MESSAGE_TYPE;
			if (elem instanceof ConnectorEndpointInstance)
				return Type.CONNECTOR_ENDPOINT_INSTANCE;
			if (elem instanceof ConnectorEndpoint)
				return Type.CONNECTOR_ENDPOINT;
		}
		
		if (expr instanceof ConstExpr){
			if (((ConstExpr) expr).getTimeUnit() == null)
				return Type.NUMERAL;
			else
				return Type.CLOCK_VALUE;
		}
		
		if (expr instanceof SourceStateExpr || expr instanceof TargetStateExpr)
			return Type.STATE;
				
		if (expr instanceof BufferMsgCountExpr)
			return Type.NUMERAL;
		return null;
	}
	
	/**
	 * Returns true iff the expression can be evaluated statically to a value
	 */
	public boolean isStaticallyEvaluable(MapExpr expr) {
		if (expr == null)
			return true;
		
		if (expr instanceof MumlElemExpr && ((MumlElemExpr) expr).getElem() instanceof BoundVariable) {
			if (((BoundVariable) ((MumlElemExpr) expr).getElem()).getSet() instanceof ClockSetExpr)
				return false;
		}
			
		if (expr instanceof MumlElemExpr) {
			EObject elem = ((MumlElemExpr) expr).getElem();
			if (elem instanceof Clock)
				return false;
			if (elem instanceof Variable)
				return false;
		}
		
		if (expr instanceof BufferMsgCountExpr)
			return false;
		return true;
	}
	
	@Check
	public void checkTemporallyQuantified(final PredicateExpr expr) { //Check whether every predicate is bound to a TemporalQuantifier
		if (expr instanceof StaticPredicateExpr)
			return; //in this case, we're fine
		
		if (expr instanceof ComparisonExpr) {
			if (isStaticallyEvaluable(((ComparisonExpr) expr).getLhs()) && isStaticallyEvaluable(((ComparisonExpr) expr).getRhs()))
				return;
		}
			
		EObject parent = expr;
		while (parent != null) {
			if (parent instanceof TemporalQuantifierExpr)
				return;
			parent = parent.eContainer();
		}
		
		error("This "+expr.eClass().getName()+" must be bound to a Temporal Quantifier such as \"AG\"", null);
	}
	
	@Check
	public void checkDeadlockTemporalQuantifier(final DeadlockExpr expr) { //check that deadlock expressions are only bound to AG or EF (because Uppaal cannot handle it otherwise)
		EObject parent = expr;
		while (parent != null) {
			if (parent instanceof AGExpr || parent instanceof EFExpr)
				return; //we're safe
			parent = parent.eContainer();
		}
		
		error("deadlocks can only be checked when using AG or EF quantifiers", null);
	}
	
	@Check 
	public void checkTemporallyQuantified(final TemporalQuantifierExpr expr) { //Disallow using nested TemporalQuantifiers
		EObject parent = expr.eContainer();
		while (parent != null) {
			if (parent instanceof TemporalQuantifierExpr) {
				error("TemporalQuantifiers must not be nested", null);
				return;
			}
			parent = parent.eContainer();
		}
	}
	
	@Check
	public void checkHiddenBoundVariable(final QuantifierExpr expr) { //give a warning when quantifier variables are shadowing one another
		EObject parent = expr.eContainer();
		while (parent != null) {
			if (parent instanceof QuantifierExpr && expr.getVar().getName().equals(((QuantifierExpr) parent).getVar().getName()))
				warning("The variable "+expr.getVar().getName()+" is shadowed", null);
			parent = parent.eContainer();
		}
	}
	
	/**
	 * Given an EObject, determines whether it can be used in an inequality
	 */
	private boolean isInequalityComparable(EObject obj) {
		if (obj instanceof ConstExpr || obj instanceof BufferMsgCountExpr || obj instanceof Variable || obj instanceof Clock)
			return true;
		if (obj instanceof BoundVariable)
			if (((BoundVariable) obj).getSet() instanceof IntervalSetExpr || ((BoundVariable) obj).getSet() instanceof ClockSetExpr)
				return true;
		if (obj instanceof MumlElemExpr)
			return isInequalityComparable(((MumlElemExpr) obj).getElem());
		
		return false;
	}
	
	@Check
	public void checkComparisonOperators(final ComparisonExpr expr) { //make sure that inequalities are only used on naturally ordered elements
		if (isInequalityComparable(expr.getLhs()) && isInequalityComparable(expr.getRhs()))
			return;
		if (expr.getOp().equals(ComparisonOp.EQUALS) || expr.getOp().equals(ComparisonOp.NOT_EQUAL))
			return;
		error(expr.getOp().toString() + " is not allowed here",null);
	}

	@Check
	public void checkTypesOfComparables(final ComparisonExpr compExpr) { //make sure that the types of elements in comparisons are compatible
		if (getType(compExpr.getLhs()) == getType(compExpr.getRhs()))
			return;
		if (compExpr.getLhs() instanceof ConstExpr && getType(compExpr.getRhs()) == Type.CLOCK_VALUE 
				|| getType(compExpr.getLhs()) == Type.CLOCK_VALUE && compExpr.getRhs() instanceof ConstExpr)
			return; // we can compare clocks with ConstExpr. checkClockComparisonTimeUnits will check existence of the time unit
		error("You cannot compare objects of these types", null);
	}
	
	@Check
	public void checkClockComparisonTimeUnits(final ConstExpr expr) { //make sure that every ConstExpr has its TimeUnit set iff it's used in a clock value comparison
		boolean isUsedInClockValueComparison = false;
		
		if (expr.eContainer() instanceof ComparisonExpr) { //set isUsedInClockValueComparison appropriately
			ComparisonExpr parent = (ComparisonExpr) expr.eContainer();
			MapExpr other = parent.getLhs() == expr ? parent.getRhs() : parent.getLhs();
			isUsedInClockValueComparison = getType(other) == Type.CLOCK_VALUE; 
		}
		
		if (isUsedInClockValueComparison && (expr.getTimeUnit() == null))
			error("Time unit missing", null);
		if (!isUsedInClockValueComparison && (expr.getTimeUnit() != null))
			error("Not expecting time unit", null);
	}
	
	@Check
	public void checkMumlElemExprInstanceSet(final MumlElemExpr expr) { //checks whether the MumlElemExpr should include a reference to a ConnectorEndpointInstance
		if (getType(expr) == Type.CONNECTOR_ENDPOINT && expr.getInstance() != null )
			error("Connector endpoints should not have a reference to an instance", null);
		
		if (getType(expr) == Type.CONNECTOR_ENDPOINT_INSTANCE && expr.getInstance() != null ) 
			error("Connector endpoint instances should not have a reference to an instance.", null);
		
		if (expr.getElem() instanceof BoundVariable && expr.getInstance() != null)
			error("BoundVariables should not have their instance set.", null);
		
		if (expr.getInstance() != null)
			return; // if a connector endpoint instance is set, we don't have to check the rest
		
		//After this point, it holds that no ConnectorEndpointInstance is set. We emit an error for cases where that's not okay
		EObject instanceType = getElementProvider().getInstanceType(expr.getElem()); //the instance type of the referenced element
		
		if (instanceType == null || instanceType == expr.getElem())
			return;
		
		if (instanceType instanceof Role)
			for (Role r : ((Role) instanceType).getCoordinationProtocol().getRoles())
				if (r.isMulti()) {
					error("An instance must be set for this element because "+((NamedElement) instanceType).getName()+" is instantiated multiple times. "
							+ "\nWrite \""+qualifiedNameProvider.getQualifiedName(expr.getElem())+"[Instance]\" instead.", null);
					return;
				}
		
		if (instanceType instanceof AtomicComponent || instanceType instanceof DiscretePort) {
			int instanceCount = 0;
			for (EObject instance : getElementProvider().getAllInstances()) {
				if (getElementProvider().getInstanceType(instance) == instanceType)
					if (++instanceCount >= 2) {
						error("An instance must be set for this element because "+((NamedElement) instanceType).getName()+" has multiple instances", null);
						return;
					}
			}
		}
	}
}
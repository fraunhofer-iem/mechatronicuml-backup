package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.english

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.AndExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.ImplyExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.NotExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.OrExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.BufferMsgCountExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ConstExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.SourceStateExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TargetStateExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Expression
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.BufferOverflowExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonOp
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.DeadlockExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.FalseExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInBufferExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInTransitExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateActiveExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateInStatechartExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.SubstateOfExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TransitionFiringExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TrueExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Property
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.AFExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.AGExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.BoundVariable
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EFExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EGExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.ExistenceQuantExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.LeadsToExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifierExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TemporalQuantifierExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.UniversalQuantExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.BufferSetExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ClockSetExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.InstanceSetExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.IntervalSetExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.MessageSetExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.StateSetExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.TransitionSetExpr
import de.uni_paderborn.fujaba.muml.verification.uppaal.scoping.MtctlQualifiedNameProvider
import java.util.concurrent.TimeUnit
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SubinstanceSetExpr

class Mtctl2English {
	def serializeProperty(Property it) '''«expr(it.expression, true).toString().toFirstUpper».'''
	def propertyWithResult(Property it, boolean fulfilled) '''The verification result is that «expr(it.expression, fulfilled).toString()».'''
	
	
	def dispatch expr(QuantifierExpr expr, boolean positive) {
		var thereIs = (expr instanceof ExistenceQuantExpr == positive);
		if (specialCase(expr, positive) != null)
			return specialCase(expr, positive);
		if (thereIs) {
			'''there exists «boundVariable(expr.^var, true)» so that «itHoldsThat(expr.formula, positive)»'''
		} else {
			'''for all «boundVariable(expr.^var, false)» «itHoldsThat(expr.formula, positive)»'''
		}
	}
		
	def dispatch expr(AGExpr expr, boolean positive) {
		if (positive)
			'''it invariantly holds that «expr(expr.expr, true)»'''
		else 
			'''it can possibly happen that «expr(expr.expr, false)»'''
	}
	
	def dispatch expr(AFExpr expr, boolean positive) {
		if (positive)
			'''eventually it holds that «expr(expr.expr, true)»'''
		else
			'''it might always hold that «expr(expr.expr, false)»'''
	}
	
	def dispatch expr(EFExpr expr, boolean positive) {
		if (positive)
			'''it can possibly happen that «expr(expr.expr, true)»'''
		else
			'''it cannot possibly happen that «expr(expr.expr, true)»'''
	}
	
	def dispatch expr(EGExpr expr, boolean positive) {
		if (positive)
			'''it might always hold that «expr(expr.expr, true)»'''
		else
			'''eventually it holds that «expr(expr.expr, false)»'''
	}
	
	def dispatch expr(LeadsToExpr expr, boolean positive) {
		if (positive)
			'''whenever «expr(expr.leftOpd, true)», then eventually «expr(expr.rightOpd, true)»'''
		else
			'''it can happen that «expr(expr.leftOpd, true)» and afterwards possibly always «expr(expr.rightOpd, false)»''' //(EF (a and EG not b))
	}
	
	def dispatch expr(DeadlockExpr expr, boolean positive) {
		if (positive)
			'''a deadlock occurs'''
		else
			'''no deadlock occurs'''
	}
	
	def dispatch expr(BufferOverflowExpr expr, boolean positive) {
		if (positive)
			'''a buffer overflow occurs'''
		else
			'''no buffer overflow occurs'''
	}

	def dispatch expr(ComparisonExpr expr, boolean positive) {
		if (positive)
			'''«expr(expr.lhs, true)» «comparisonOp(expr.op)» «expr(expr.rhs, true)»'''
		else {
			var ComparisonOp op;
			switch (expr.op) {
				case ComparisonOp::EQUALS : op = ComparisonOp::NOT_EQUAL
				case ComparisonOp::NOT_EQUAL : op = ComparisonOp::EQUALS
				case ComparisonOp::GREATER : op = ComparisonOp::LESS_OR_EQUAL
				case ComparisonOp::GREATER_OR_EQUAL : op = ComparisonOp::LESS
				case ComparisonOp::LESS : op = ComparisonOp::GREATER_OR_EQUAL
				case ComparisonOp::LESS_OR_EQUAL : op = ComparisonOp::GREATER
				default: op = null
			}
			'''«expr(expr.lhs, true)» «comparisonOp(op)» «expr(expr.rhs, true)»'''
		}
	}
		
	def dispatch expr(MessageInBufferExpr expr, boolean positive) {
		if (positive)
			'''the message «expr(expr.message, true)» is in the buffer «expr(expr.buffer, true)»'''
		else
			'''the message «expr(expr.message, true)» is not in the buffer «expr(expr.buffer, true)»'''
	}
	
	def dispatch expr(MessageInTransitExpr expr, boolean positive) {
		if (positive)
			'''the message «expr(expr.message, true)» is in transit'''
		else
			'''the message «expr(expr.message, true)» is not in transit'''
	}
	
	def dispatch expr(StateActiveExpr expr, boolean positive) {
		if (positive)
			'''«expr(expr.state, true)» is active'''
		else
			'''«expr(expr.state, true)» is not active'''
	}
	
	def dispatch expr(SubstateOfExpr expr, boolean positive) {
		if (positive)
			'''«expr(expr.state, true)» is a substate of «expr(expr.superstate, true)»'''
		else
			'''«expr(expr.state, true)» is not a substate of «expr(expr.superstate, true)»'''
	}
	
	def dispatch expr(TransitionFiringExpr expr, boolean positive) {
		if (positive)
			'''«expr(expr.transition, true)» is firing'''
		else
			'''«expr(expr.transition, true)» is not firing'''
	}
	
	def dispatch expr(TrueExpr expr, boolean positive) {
		if (positive)
			'''true'''
		else
			'''false'''
	}
	
	def dispatch expr(FalseExpr expr, boolean positive) {
		if (positive)
			'''false'''
		else
			'''true'''
	}
	
	def dispatch expr(StateInStatechartExpr expr, boolean positive) {
		if (positive)
			'''«expr(expr.state, true)» is in statechart «expr(expr.statechart, true)»'''
		else
			'''«expr(expr.state, true)» is not in statechart «expr(expr.statechart, true)»'''
	}
	
	def boundVariable(BoundVariable expr, boolean singular) {
		switch expr.set {
			ClockSetExpr case singular: '''a clock «expr.name»'''
			ClockSetExpr case !singular: '''clocks «expr.name»'''
			IntervalSetExpr case singular: '''a number «expr.name» between «(expr.set as IntervalSetExpr).lowerVal» and «(expr.set as IntervalSetExpr).upperVal»'''
			IntervalSetExpr case !singular: '''numbers «expr.name» between «(expr.set as IntervalSetExpr).lowerVal» and «(expr.set as IntervalSetExpr).upperVal»'''
			MessageSetExpr case singular: '''a message «expr.name»'''
			MessageSetExpr case !singular: '''messages «expr.name»'''
			StateSetExpr case singular: '''a state «expr.name»'''
			StateSetExpr case !singular: '''states «expr.name»'''
			TransitionSetExpr case singular: '''a transition «expr.name»'''
			TransitionSetExpr case !singular: '''transitions «expr.name»'''
			BufferSetExpr case singular: '''a buffer «expr.name»'''
			BufferSetExpr case !singular: '''buffers «expr.name»'''
			InstanceSetExpr case singular: '''an instance «expr.name» of «expr((expr.set as InstanceSetExpr).type, true)»'''
			InstanceSetExpr case !singular: '''instances «expr.name» of «expr((expr.set as InstanceSetExpr).type, true)»'''
			SubinstanceSetExpr case singular: '''a subinstance «expr.name» of «expr((expr.set as SubinstanceSetExpr).type, true)»'''
			SubinstanceSetExpr case !singular: '''subinstances «expr.name» of «expr((expr.set as SubinstanceSetExpr).type, true)»'''
		}
	}

	def dispatch expr(AndExpr expr, boolean positive) {
		if (positive)
			'''«expr(expr.leftOpd, true)» and «expr(expr.rightOpd, true)»'''
		else
			'''«expr(expr.leftOpd, false)» or «expr(expr.rightOpd, false)»'''
	}
	
	def dispatch expr(ImplyExpr expr, boolean positive) {
		if (positive)
			'''if «expr(expr.leftOpd, true)» then «expr(expr.rightOpd, true)»'''
		else
			'''«expr(expr.leftOpd, true)» and «expr(expr.rightOpd, false)»'''
	}
	
	def dispatch expr(NotExpr expr, boolean positive) {
		if (positive)
			'''«expr(expr.opd, false)»'''
		else
			'''«expr(expr.opd, true)»'''
	}
	
	def dispatch expr(OrExpr expr, boolean positive) {
		if (positive)
			'''«expr(expr.leftOpd, true)» or «expr(expr.rightOpd, true)»'''
		else
			'''«expr(expr.leftOpd, false)» and «expr(expr.rightOpd, false)»'''
	}
	
	def dispatch expr(BufferMsgCountExpr expr, boolean positive) {
		'''the number of messages in buffer «expr(expr.buffer, true)»'''
	}
	
	def dispatch expr(ConstExpr expr, boolean positive) {
		'''«expr.^val»«if (expr.timeUnit != null) ' ' + timeUnit(expr.timeUnit)»'''
	}
	
	def dispatch expr(MumlElemExpr expr, boolean positive) {
		var provider = new MtctlQualifiedNameProvider();
		'''«provider.getQualifiedName(expr.elem, null)»''' //TODO only last segment (solve strange type resolve error)
	}
	
	def dispatch expr(SourceStateExpr expr, boolean positive) {
		'''the source state of «expr(expr.transition, true)»'''
	}
	
	def dispatch expr(TargetStateExpr expr, boolean positive) {
		'''the target state of «expr(expr.transition, true)»'''
	}
	
	def comparisonOp(ComparisonOp op) {
		switch (op) {
			case ComparisonOp::EQUALS : 'is'
			case ComparisonOp::NOT_EQUAL : 'is not'
			case ComparisonOp::GREATER : 'is more than'
			case ComparisonOp::GREATER_OR_EQUAL : 'is at least'
			case ComparisonOp::LESS : 'is less than'
			case ComparisonOp::LESS_OR_EQUAL : 'is at most'
			default: ""
		}
	}
	
	def timeUnit(TimeUnit unit) {
		switch (unit) {
			case TimeUnit::DAYS : 'days'
			case TimeUnit::HOURS : 'hours'
			case TimeUnit::MINUTES: 'minutes'
			case TimeUnit::SECONDS: 'seconds'
			case TimeUnit::MILLISECONDS: 'milliseconds'
			case TimeUnit::MICROSECONDS : 'microseconds'
			case TimeUnit::NANOSECONDS: 'nanoseconds'
			default: ""
		}
	}
	
	
	//Special Cases
	def dispatch specialCase(QuantifierExpr expr, boolean positive) {
		// forall X implies Y, exists X and Y
		if (expr.formula instanceof ImplyExpr && expr instanceof UniversalQuantExpr || expr.formula instanceof AndExpr && expr instanceof ExistenceQuantExpr) {
			var thereIs = positive == (expr instanceof ExistenceQuantExpr);
			var leftOpd = if (expr.formula instanceof ImplyExpr) (expr.formula as ImplyExpr).leftOpd else (expr.formula as AndExpr).leftOpd;
			var rightOpd = if (expr.formula instanceof ImplyExpr) (expr.formula as ImplyExpr).rightOpd else (expr.formula as AndExpr).rightOpd;
			switch (leftOpd) {
				SubstateOfExpr case leftOpd.state instanceof MumlElemExpr && (leftOpd.state as MumlElemExpr).elem == expr.^var: '''«IF thereIs»there exists a substate«ELSE»for all substates«ENDIF» «expr.^var.name» of «expr(leftOpd.superstate, true)»«IF thereIs» so that«ENDIF» «itHoldsThat(rightOpd, positive)»'''
				SubstateOfExpr case leftOpd.superstate instanceof MumlElemExpr && (leftOpd.superstate as MumlElemExpr).elem == expr.^var: '''«IF thereIs»there exists a superstate«ELSE»for all superstates«ENDIF» «expr.^var.name» of «expr(leftOpd.state, true)»«IF thereIs» so that«ENDIF» «itHoldsThat(rightOpd, positive)»'''
				StateInStatechartExpr case leftOpd.state instanceof MumlElemExpr && (leftOpd.state as MumlElemExpr).elem == expr.^var: '''«IF thereIs»there exists a state«ELSE»for all states«ENDIF» «expr.^var.name» in «expr(leftOpd.statechart, true)»«IF thereIs» so that«ENDIF» «itHoldsThat(rightOpd, positive)»'''
				default: return null
			}
		} else
			return null
	}
	
	def itHoldsThat(Expression expr, boolean positive) {
		if (expr instanceof TemporalQuantifierExpr || expr.eContainer() instanceof TemporalQuantifierExpr || expr instanceof QuantifierExpr || expr instanceof NotExpr)
			 '''«expr(expr, positive)»'''
		else
			'''it holds that «expr(expr, positive)»'''
	}
}
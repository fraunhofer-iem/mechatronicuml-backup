package org.muml.uppaal.adapter.mtctl.english

import java.util.concurrent.TimeUnit
import org.muml.uppaal.adapter.mtctl.BooleanLogic.AndExpr
import org.muml.uppaal.adapter.mtctl.BooleanLogic.ImplyExpr
import org.muml.uppaal.adapter.mtctl.BooleanLogic.NotExpr
import org.muml.uppaal.adapter.mtctl.BooleanLogic.OrExpr
import org.muml.uppaal.adapter.mtctl.Comparables.BufferMsgCountExpr
import org.muml.uppaal.adapter.mtctl.Comparables.ConstExpr
import org.muml.uppaal.adapter.mtctl.Comparables.MumlElemExpr
import org.muml.uppaal.adapter.mtctl.Comparables.SourceStateExpr
import org.muml.uppaal.adapter.mtctl.Comparables.TargetStateExpr
import org.muml.uppaal.adapter.mtctl.Expression
import org.muml.uppaal.adapter.mtctl.Predicates.ComparisonExpr
import org.muml.uppaal.adapter.mtctl.Predicates.ComparisonOp
import org.muml.uppaal.adapter.mtctl.Predicates.ConnectorOverflowExpr
import org.muml.uppaal.adapter.mtctl.Predicates.DeadlockExpr
import org.muml.uppaal.adapter.mtctl.Predicates.FalseExpr
import org.muml.uppaal.adapter.mtctl.Predicates.MessageDiscardedExpr
import org.muml.uppaal.adapter.mtctl.Predicates.MessageInBufferExpr
import org.muml.uppaal.adapter.mtctl.Predicates.MessageInTransitExpr
import org.muml.uppaal.adapter.mtctl.Predicates.StateActiveExpr
import org.muml.uppaal.adapter.mtctl.Predicates.StateInStatechartExpr
import org.muml.uppaal.adapter.mtctl.Predicates.SubstateOfExpr
import org.muml.uppaal.adapter.mtctl.Predicates.TransitionFiringExpr
import org.muml.uppaal.adapter.mtctl.Predicates.TrueExpr
import org.muml.uppaal.adapter.mtctl.Property
import org.muml.uppaal.adapter.mtctl.Quantifiers.AFExpr
import org.muml.uppaal.adapter.mtctl.Quantifiers.AGExpr
import org.muml.uppaal.adapter.mtctl.Quantifiers.BoundVariable
import org.muml.uppaal.adapter.mtctl.Quantifiers.EFExpr
import org.muml.uppaal.adapter.mtctl.Quantifiers.EGExpr
import org.muml.uppaal.adapter.mtctl.Quantifiers.ExistenceQuantExpr
import org.muml.uppaal.adapter.mtctl.Quantifiers.LeadsToExpr
import org.muml.uppaal.adapter.mtctl.Quantifiers.QuantifierExpr
import org.muml.uppaal.adapter.mtctl.Quantifiers.TemporalQuantifierExpr
import org.muml.uppaal.adapter.mtctl.Quantifiers.UniversalQuantExpr
import org.muml.uppaal.adapter.mtctl.Sets.BufferSetExpr
import org.muml.uppaal.adapter.mtctl.Sets.ClockSetExpr
import org.muml.uppaal.adapter.mtctl.Sets.InstanceSetExpr
import org.muml.uppaal.adapter.mtctl.Sets.IntervalSetExpr
import org.muml.uppaal.adapter.mtctl.Sets.MessageSetExpr
import org.muml.uppaal.adapter.mtctl.Sets.StateSetExpr
import org.muml.uppaal.adapter.mtctl.Sets.SubinstanceSetExpr
import org.muml.uppaal.adapter.mtctl.Sets.TransitionSetExpr
import org.muml.uppaal.adapter.mtctl.xtext.scoping.MtctlQualifiedNameProvider

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
			'''it invariantly holds that «expr(expr.expr, false)»'''
	}
	
	def dispatch expr(EGExpr expr, boolean positive) {
		if (positive)
			'''it might always hold that «expr(expr.expr, true)»'''
		else
			'''eventually it holds that «expr(expr.expr, false)»'''
	}
	
	def dispatch expr(LeadsToExpr expr, boolean positive) {
		if (positive)
			'''whenever «expr(expr.leftOpd, true)», then eventually «expr(expr.rightOpd, true)» as well''' //  AG (a imply AF b)
		else
			'''it can possibly happen that when «expr(expr.leftOpd, true)» it might always hold that «expr(expr.rightOpd, false)»''' // not(AG (a imply AF b)) == (EF (a and EG not b))
			// '''it can happen that «expr(expr.leftOpd, true)» and afterwards possibly always «expr(expr.rightOpd, false)»''' // not(AG (a imply AF b)) == (EF (a and EG not b))
	}
	
	def dispatch expr(DeadlockExpr expr, boolean positive) {
		if (positive)
			'''a deadlock occurs'''
		else
			'''no deadlock occurs'''
	}
	
	def dispatch expr(ConnectorOverflowExpr expr, boolean positive) {
		if (positive)
			'''a connector overflow occurs'''
		else
			'''no connector overflow occurs'''
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
	
	def dispatch expr(MessageDiscardedExpr expr, boolean positive) {
		if (positive)
			'''a message in the buffer «expr(expr.buffer, true)» gets discarded'''
		else
			'''no message in the buffer «expr(expr.buffer, true)» gets discarded'''
	}
	
	def dispatch expr(StateActiveExpr expr, boolean positive) {
		if (positive)
			'''the state «expr(expr.state, true)» is active'''
		else
			'''the state «expr(expr.state, true)» is not active'''
	}
	
	def dispatch expr(SubstateOfExpr expr, boolean positive) {
		if (positive)
			'''the state «expr(expr.state, true)» is a substate of «expr(expr.superstate, true)»'''
		else
			'''the state «expr(expr.state, true)» is not a substate of «expr(expr.superstate, true)»'''
	}
	
	def dispatch expr(TransitionFiringExpr expr, boolean positive) {
		if (positive)
			'''the transition «expr(expr.transition, true)» is firing'''
		else
			'''the transition «expr(expr.transition, true)» is not firing'''
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
			'''the state «expr(expr.state, true)» is in statechart «expr(expr.statechart, true)»'''
		else
			'''the state «expr(expr.state, true)» is not in statechart «expr(expr.statechart, true)»'''
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
			'''if «expr(expr.leftOpd, true)» then «expr(expr.rightOpd, true)» as well'''
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
package de.uni_paderborn.uppaal.serialization

import de.uni_paderborn.uppaal.requirements.PropertyRepository
import de.uni_paderborn.uppaal.requirements.UnaryProperty
import de.uni_paderborn.uppaal.requirements.LeadsToProperty
import de.uni_paderborn.uppaal.requirements.TemporalOperator
import de.uni_paderborn.uppaal.requirements.PathQuantifier
import de.uni_paderborn.uppaal.requirements.DeadlockExpression
import de.uni_paderborn.uppaal.expressions.CompareOperator
import de.uni_paderborn.uppaal.expressions.Expression

class UppaalPropertySerialization extends UppaalSerialization {
	def serializePropertyRepository(PropertyRepository it) '''«FOR i : properties ?:emptyList»
		«IF i.comment != "\"no comment provided\"" »«comment(i.comment)»«ENDIF»
		«property(i)»
		
		«ENDFOR»'''
	
	def comment(String s) '''/*
«s.replace("*/","* /")»
*/'''
	
	def dispatch property(LeadsToProperty it) '''«expression(leftExpression)» --> «expression(rightExpression)»'''
	
	def dispatch property(UnaryProperty it)'''«pathQuantifier(quantifier)»«temporalOperator(operator)» «expression(expression)»'''
	
	def dispatch expression(DeadlockExpression it)'''deadlock'''
	
	// set the precedence of DeadlockExpression to the precedence of identifiers
	override int precedence(Expression it) {
		switch (it) {
			case it instanceof DeadlockExpression: return 500
		}
		return super.precedence(it)
	}
	
	def temporalOperator(TemporalOperator op) {
		switch (op) {
			case TemporalOperator::FUTURE : '<>'
			case TemporalOperator::GLOBAL : '[]'
			default: ""
		}
	}
	
	def pathQuantifier(PathQuantifier op) {
		switch (op) {
			case PathQuantifier::EXISTS : 'E'
			case PathQuantifier::FORALL : 'A'
			default: ""
		}
	}
	
	override comparison(CompareOperator op) {
		switch (op) {
			case CompareOperator::EQUAL : '=='
			case CompareOperator::UNEQUAL : '!='
			case CompareOperator::GREATER : '>'
			case CompareOperator::GREATER_OR_EQUAL : '>='
			case CompareOperator::LESS : '<'
			case CompareOperator::LESS_OR_EQUAL : '<='
			default: ""
		}
	}
	
}
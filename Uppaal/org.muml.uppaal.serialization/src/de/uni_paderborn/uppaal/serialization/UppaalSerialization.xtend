package de.uni_paderborn.uppaal.serialization

import de.uni_paderborn.uppaal.NTA
import de.uni_paderborn.uppaal.core.NamedElement
import de.uni_paderborn.uppaal.declarations.ArrayInitializer
import de.uni_paderborn.uppaal.declarations.CallType
import de.uni_paderborn.uppaal.declarations.ChannelVariableDeclaration
import de.uni_paderborn.uppaal.declarations.ClockVariableDeclaration
import de.uni_paderborn.uppaal.declarations.DataVariableDeclaration
import de.uni_paderborn.uppaal.declarations.DataVariablePrefix
import de.uni_paderborn.uppaal.declarations.ExpressionInitializer
import de.uni_paderborn.uppaal.declarations.Function
import de.uni_paderborn.uppaal.declarations.FunctionDeclaration
import de.uni_paderborn.uppaal.declarations.GlobalDeclarations
import de.uni_paderborn.uppaal.declarations.LocalDeclarations
import de.uni_paderborn.uppaal.declarations.Parameter
import de.uni_paderborn.uppaal.declarations.SystemDeclarations
import de.uni_paderborn.uppaal.declarations.TypeDeclaration
import de.uni_paderborn.uppaal.declarations.TypeIndex
import de.uni_paderborn.uppaal.declarations.ValueIndex
import de.uni_paderborn.uppaal.declarations.Variable
import de.uni_paderborn.uppaal.declarations.VariableDeclaration
import de.uni_paderborn.uppaal.declarations.global.ChannelList
import de.uni_paderborn.uppaal.declarations.global.ChannelPriority
import de.uni_paderborn.uppaal.declarations.global.DefaultChannelPriority
import de.uni_paderborn.uppaal.declarations.system.InstantiationList
import de.uni_paderborn.uppaal.declarations.system.ProgressMeasure
import de.uni_paderborn.uppaal.declarations.system.System
import de.uni_paderborn.uppaal.declarations.system.TemplateDeclaration
import de.uni_paderborn.uppaal.expressions.ArithmeticExpression
import de.uni_paderborn.uppaal.expressions.ArithmeticOperator
import de.uni_paderborn.uppaal.expressions.AssignmentExpression
import de.uni_paderborn.uppaal.expressions.AssignmentOperator
import de.uni_paderborn.uppaal.expressions.BitShiftExpression
import de.uni_paderborn.uppaal.expressions.BitwiseExpression
import de.uni_paderborn.uppaal.expressions.BitwiseOperator
import de.uni_paderborn.uppaal.expressions.CompareExpression
import de.uni_paderborn.uppaal.expressions.CompareOperator
import de.uni_paderborn.uppaal.expressions.ConditionExpression
import de.uni_paderborn.uppaal.expressions.Expression
import de.uni_paderborn.uppaal.expressions.FunctionCallExpression
import de.uni_paderborn.uppaal.expressions.IdentifierExpression
import de.uni_paderborn.uppaal.expressions.IncrementDecrementExpression
import de.uni_paderborn.uppaal.expressions.IncrementDecrementOperator
import de.uni_paderborn.uppaal.expressions.IncrementDecrementPosition
import de.uni_paderborn.uppaal.expressions.LiteralExpression
import de.uni_paderborn.uppaal.expressions.LogicalExpression
import de.uni_paderborn.uppaal.expressions.LogicalOperator
import de.uni_paderborn.uppaal.expressions.MinMaxExpression
import de.uni_paderborn.uppaal.expressions.MinMaxOperator
import de.uni_paderborn.uppaal.expressions.MinusExpression
import de.uni_paderborn.uppaal.expressions.NegationExpression
import de.uni_paderborn.uppaal.expressions.PlusExpression
import de.uni_paderborn.uppaal.expressions.QuantificationExpression
import de.uni_paderborn.uppaal.expressions.Quantifier
import de.uni_paderborn.uppaal.expressions.ScopedIdentifierExpression
import de.uni_paderborn.uppaal.statements.Block
import de.uni_paderborn.uppaal.statements.DoWhileLoop
import de.uni_paderborn.uppaal.statements.EmptyStatement
import de.uni_paderborn.uppaal.statements.ExpressionStatement
import de.uni_paderborn.uppaal.statements.ForLoop
import de.uni_paderborn.uppaal.statements.IfStatement
import de.uni_paderborn.uppaal.statements.Iteration
import de.uni_paderborn.uppaal.statements.ReturnStatement
import de.uni_paderborn.uppaal.statements.WhileLoop
import de.uni_paderborn.uppaal.templates.AbstractTemplate
import de.uni_paderborn.uppaal.templates.Edge
import de.uni_paderborn.uppaal.templates.Location
import de.uni_paderborn.uppaal.templates.LocationKind
import de.uni_paderborn.uppaal.templates.Selection
import de.uni_paderborn.uppaal.templates.Synchronization
import de.uni_paderborn.uppaal.templates.SynchronizationKind
import de.uni_paderborn.uppaal.templates.Template
import de.uni_paderborn.uppaal.types.DeclaredType
import de.uni_paderborn.uppaal.types.RangeTypeSpecification
import de.uni_paderborn.uppaal.types.ScalarTypeSpecification
import de.uni_paderborn.uppaal.types.StructTypeSpecification
import de.uni_paderborn.uppaal.types.Type
import de.uni_paderborn.uppaal.types.TypeReference
import de.uni_paderborn.uppaal.expressions.BitShiftOperator
import de.uni_paderborn.uppaal.visuals.ColorKind

class UppaalSerialization {
	var moveEdgeLabelsAway = false;
	
	def setMoveEdgeLabelsAway(boolean state) {
		moveEdgeLabelsAway = state;
	}
	
	// create root
	def main(NTA it) '''
	<?xml version="1.0" encoding="utf-8"?>
	<!DOCTYPE nta PUBLIC '-//Uppaal Team//DTD Flat System 1.1//EN' 'http://www.it.uu.se/research/group/darts/uppaal/flat-1_1.dtd'>
		<nta>
			<declaration>
	«declarations(globalDeclarations)»
			</declaration>
	«FOR i : template ?:emptyList»«template(i)»«ENDFOR»
			<system>
	«declarations(systemDeclarations)»
			</system>
		</nta>
	'''
	
	/* generate declarations */
	
	def dispatch declarations(Void it) ''''''
	
	def dispatch declarations(GlobalDeclarations it) '''
	«FOR i : declaration ?:emptyList»
		«declaration(i)»

		«ENDFOR»
	«channelPriority(channelPriority)»'''
	
	def dispatch declarations(LocalDeclarations it) '''«FOR i : declaration ?:emptyList»
		«declaration(i)»
		
		«ENDFOR»'''
	
	def dispatch declarations(SystemDeclarations it) '''«FOR i : declaration ?:emptyList»
		«declaration(i)»
		
		«ENDFOR»
	«system(system)»
	«IF progressMeasure != null»«progressMeasure(progressMeasure)»«ENDIF»'''
	
	def dispatch declaration(Void it) ''''''
	
	def dispatch declaration(FunctionDeclaration it) '''«function(function)»'''
	
	def function(Function it) '''«typedefinition(returnType)» «name»(«FOR i : parameter ?:emptyList SEPARATOR ', '»«parameter(i)»«ENDFOR») «block(block)»'''
	
	def dispatch block(Block it) '''{
	«FOR i : if (declarations == null) emptyList else (declarations.declaration ?: emptyList)»
	«declaration(i)»
	«ENDFOR»
	«FOR i : statement ?:emptyList»
	«statement(i)»
	«ENDFOR»
}'''
	
	def dispatch declaration(TypeDeclaration it) '''typedef «typedefinition(typeDefinition)» «FOR DeclaredType i : type ?:emptyList SEPARATOR ', '»«typedeclaration(i)»«ENDFOR»;'''
	
	def typedeclaration(Type it) '''«typename(it)»«FOR i : index ?:emptyList»«index(i)»«ENDFOR»'''
	
	def dispatch declaration(VariableDeclaration it) '''«declaration(it, false)»;'''
	
	def declaration(VariableDeclaration it, Boolean callByReference)'''«prefix(it)»«typedefinition(typeDefinition)» «IF callByReference»&amp;«ENDIF»«FOR i : variable ?:emptyList SEPARATOR ', '»«variable(i)»«ENDFOR»'''
	
	def dispatch prefix(ClockVariableDeclaration it) ''''''
	
	def dispatch prefix(DataVariableDeclaration it) '''«IF prefix != DataVariablePrefix::NONE»«prefix.toString()» «ENDIF»'''
	
	def dispatch prefix(ChannelVariableDeclaration it) '''«IF broadcast»broadcast «ENDIF»«IF urgent»urgent «ENDIF»'''
	
	def dispatch declaration(TemplateDeclaration it) '''«name(declaredTemplate)»«IF declaredTemplate.parameter.size > 0»(«FOR i : declaredTemplate.parameter ?:emptyList SEPARATOR ', '»«parameter(i)»«ENDFOR»)«ENDIF» = «name(declaredTemplate.referredTemplate)»(«FOR i : argument ?:emptyList SEPARATOR ', '»«expression(i)»«ENDFOR»);'''
	
	def dispatch channelPriority(ChannelPriority it) '''chan priority «FOR i : item ?:emptyList SEPARATOR ' < '»«item(i)»«ENDFOR»;'''
	
	def dispatch channelPriority(Void it) ''''''
	
	def dispatch item(Void it) ''''''
	
	def dispatch item(ChannelList it) '''«FOR IdentifierExpression i : channelExpression ?:emptyList SEPARATOR ', '»«expression(i)»«ENDFOR»'''
	
	def dispatch item(DefaultChannelPriority it) '''default'''
	
	def dispatch typedefinition(Void it) '''
	'''
	
	def dispatch typedefinition(TypeReference it) '''«typename(referredType)»'''
	
	def dispatch typedefinition(RangeTypeSpecification it) '''«baseType.toString()»[«expression(bounds.lowerBound)»,«expression(bounds.upperBound)»]'''
	
	def dispatch typedefinition(ScalarTypeSpecification it) '''scalar [«expression(sizeExpression)»]'''
	
	def dispatch typedefinition(StructTypeSpecification it) '''struct {
	«FOR DataVariableDeclaration i : declaration ?:emptyList»
	«declaration(i)»
	«ENDFOR»
}'''
	
	def typename(Type it) '''«name»'''
	
	def variable(Variable it) '''«name(it)»«FOR i : index ?:emptyList»«index(i)»«ENDFOR»«IF initializer != null» = «initializer(initializer)»«ENDIF»'''
	
	def dispatch index(Void it) ''''''
	
	def dispatch index(ValueIndex it) '''[«expression(sizeExpression)»]'''
	
	def dispatch index(TypeIndex it) '''[«typedefinition(typeDefinition)»]'''
	
	def dispatch initializer(Void it) ''''''
	
	def dispatch initializer(ExpressionInitializer it) '''«expression(expression)»'''
	
	def dispatch initializer(ArrayInitializer it) '''{«FOR i : initializer ?:emptyList SEPARATOR ','»«initializer(i)»«ENDFOR»}'''
	
	/* define templates */
	def template(Template it) '''
	<template>
	<name>«name(it)»</name>
	«IF (parameter.size > 0)»
	<parameter>
	«FOR i : parameter ?:emptyList SEPARATOR ', '»«parameter(i)»«ENDFOR»
	</parameter>
	«ENDIF»
	<declaration>
	«declarations(declarations)»
	</declaration>	
	«FOR i : location ?:emptyList»«location(i)»«ENDFOR»
	<init ref="«init.name+"_"+name»"/>
	«FOR i : edge ?:emptyList»«edge(i)»«ENDFOR»
	</template>
	'''
	
	def parameter(Parameter it) '''«declaration(variableDeclaration, callType == CallType::CALL_BY_REFERENCE)»'''
	
	def id(Location it) '''«name»_«parentTemplate.name»'''
	
	def name(NamedElement it) '''«name.replaceAll('\\.','')»'''
	
	def location(Location it) '''
	<location id="«id(it)»" x="«if (position == null) "" else position.x»" y="«if (position == null) "" else position.y»" «IF colorToString(it) != null»color="«colorToString(it)»"«ENDIF»>
		<name>«name(it)»</name>
		«IF !(invariant == null)»<label kind="invariant">«expression(invariant)»</label>«ENDIF»
		«IF locationTimeKind == LocationKind::URGENT»<urgent/>«ENDIF»
		«IF locationTimeKind == LocationKind::COMMITED»<committed/>«ENDIF»
	</location>
	'''
	
	def colorToString(Location it) {
		if (color == null)
			return null;
		switch (color) {
			case ColorKind.BLACK: return "#000000"
			case ColorKind.BLUE: return "#0000ff"
			case ColorKind.CYAN: return "#00ffff"
			case ColorKind.DARKGREY: return "#a9a9a9"
			case ColorKind.DEFAULT: return null
			case ColorKind.GREEN: return "#00ff00"
			case ColorKind.LIGHTGREY: return "#c0c0c0"
			case ColorKind.MAGENTA: return "#ff00ff"
			case ColorKind.ORANGE: return "#ffa500"
			case ColorKind.PINK: return "#ffc0cb"
			case ColorKind.RED: return "#ff0000"
			case ColorKind.SELF_DEFINED: return colorCode
			case ColorKind.WHITE: return "#ffffff"
			case ColorKind.YELLOW: return "#ffff00"
			default: return null
		}
	}
	
	def edge(Edge it) '''
	<transition>
	<source ref="«id(source)»"/>
	<target ref="«id(target)»"/>
	«IF !(selection == null)»<label kind="select"«IF moveEdgeLabelsAway» x="-100" y="-100"«ENDIF»>«FOR i : selection ?:emptyList SEPARATOR ', '»«selection(i)»«ENDFOR»</label>«ENDIF»
	«IF !(guard == null)»<label kind="guard"«IF moveEdgeLabelsAway» x="-100" y="-100"«ENDIF»>«expression(guard)»</label>«ENDIF»
	«IF !(synchronization == null)»<label kind="synchronisation"«IF moveEdgeLabelsAway» x="-100" y="-100"«ENDIF»>«synchronization(synchronization)»</label>«ENDIF»
	«IF !(update == null)»<label kind="assignment"«IF moveEdgeLabelsAway» x="-100" y="-100"«ENDIF»>«FOR i : update ?:emptyList SEPARATOR ","»
	«expression(i)»
	«ENDFOR»</label>«ENDIF»
	«IF !(bendPoint == null)»«FOR i : bendPoint ?:emptyList»
	<nail x="«i.x»" y="«i.y»"/>
	«ENDFOR»«ENDIF»
	</transition>
	'''
	
	def selection(Selection it) '''«variable(variable.get(0))» : «typedefinition(typeDefinition)»'''
	
	def synchronization(Synchronization it) '''«expression(channelExpression)»«IF kind == SynchronizationKind::RECEIVE»?«ELSE»!«ENDIF»'''
	
	def dispatch statement(Void it) ''''''
	
	def dispatch statement(Block it) '''«block(it)»'''
	
	def dispatch statement(ExpressionStatement it) '''«expression(expression)»;'''
	
	def dispatch statement(EmptyStatement it) ''';'''
	
	def dispatch statement(ForLoop it) '''for(«expression(initialization)»; «expression(condition)»; «expression(iteration)») «IF !(statement instanceof Block)»
	«ENDIF»«statement(statement)»'''
	
	def dispatch statement(Iteration it) '''for(«variable(variable.get(0))» : «typedefinition(typeDefinition)») «IF !(statement instanceof Block)»
	«ENDIF»«statement(statement)»'''
	
	def dispatch statement(WhileLoop it) '''while(«expression(expression)») «IF !(statement instanceof Block)»
	«ENDIF»«statement(statement)»'''
	
	def dispatch statement(DoWhileLoop it) '''do «statement( statement)» while («expression(expression)»);'''
	
	def dispatch statement(IfStatement it) '''if(«expression(ifExpression)») «IF !(thenStatement instanceof Block)»
		«ENDIF»«statement(thenStatement)» 
«IF elseStatement != null»else «IF !(elseStatement instanceof Block)»
	«ENDIF»«statement(elseStatement)»«ENDIF»'''
	
	def dispatch statement(ReturnStatement it) '''return «IF returnExpression != null»«expression(returnExpression)»«ENDIF»;'''
	
	/* expressions */
	
	//Creates parentheses around the supplied expression if it has lower precedence than its parent
	def expressionOptionalParentheses(Expression it) '''«IF eContainer() instanceof Expression && precedence(it) < precedence(eContainer() as Expression)»(«expression(it)»)«ELSE»«expression(it)»«ENDIF»'''
	
	//Creates parentheses around the supplied expression if its precedence is lower than its parent's or it's equal and the parent operator is not associative. For non-associative left-associative operators, use it on the right hand side expression (see expression(ArithmeticExpression it) for example)
	def expressionOptionalParenthesesNonAssoc(Expression it) '''«IF eContainer() instanceof Expression && (precedence(it) < precedence(eContainer() as Expression) || precedence(it) == precedence(eContainer() as Expression) && !isAssociative(eContainer() as Expression))»(«expression(it)»)«ELSE»«expression(it)»«ENDIF»'''
	
	def dispatch expression(Void it) ''''''
	
	def dispatch expression(AssignmentExpression it) '''«expressionOptionalParentheses(firstExpr)» «assignment(operator)» «expressionOptionalParentheses(secondExpr)»'''
	
	def dispatch expression(IdentifierExpression it) '''«name(identifier)»«IF !index.isEmpty»[«FOR i : index ?:emptyList SEPARATOR ']['»«expression(i)»«ENDFOR»]«ENDIF»'''
	
	def dispatch expression(NegationExpression it) '''not «expressionOptionalParentheses(negatedExpression)»'''
	
	def dispatch expression(FunctionCallExpression it) '''«function.name»(«FOR i : argument ?:emptyList SEPARATOR ', '»«expression(i)»«ENDFOR»)'''
	
	def dispatch expression(LogicalExpression it) '''«expressionOptionalParentheses(firstExpr)» «operator.toString()» «expressionOptionalParenthesesNonAssoc(secondExpr)»'''
	
	def dispatch expression(CompareExpression it) '''«expressionOptionalParentheses(firstExpr)» «comparison(operator)» «expressionOptionalParenthesesNonAssoc(secondExpr)»'''
	
	def dispatch expression(ArithmeticExpression it) '''«expressionOptionalParentheses(firstExpr)»«arithmetic(operator)»«expressionOptionalParenthesesNonAssoc(secondExpr)»'''
	
	def dispatch expression(LiteralExpression it) '''«text»'''
	
	def dispatch expression(IncrementDecrementExpression it) '''«IF position==IncrementDecrementPosition::PRE»«operator(operator)»«ENDIF»«expressionOptionalParentheses(expression)»«IF position==IncrementDecrementPosition::POST»«operator(operator)»«ENDIF»'''
	
	def operator(IncrementDecrementOperator it) '''«IF it==IncrementDecrementOperator::INCREMENT»++«ENDIF»«IF it==IncrementDecrementOperator::DECREMENT»--«ENDIF»'''
	
	def dispatch expression(ConditionExpression it) '''«expressionOptionalParenthesesNonAssoc(ifExpression)» ? «expressionOptionalParentheses(thenExpression)» : «expressionOptionalParentheses(elseExpression)»'''
	
	def dispatch expression(ScopedIdentifierExpression it) '''«expressionOptionalParentheses(scope)».«expressionOptionalParentheses(identifier)»'''
	
	def dispatch expression(QuantificationExpression it) '''«quantifier(quantifier)» («variable(variable.get(0))» : «typedefinition(typeDefinition)») «expressionOptionalParentheses(expression)»'''
	
	def quantifier(Quantifier it) '''«IF it==Quantifier::UNIVERSAL»forall«ENDIF»«IF it==Quantifier::EXISTENTIAL»exists«ENDIF»'''
	
	def dispatch expression(PlusExpression it) '''+«expressionOptionalParentheses(confirmedExpression)»'''
	
	def dispatch expression(MinusExpression it) '''-«expressionOptionalParentheses(invertedExpression)»'''
	
	def dispatch expression(MinMaxExpression it) '''«expressionOptionalParentheses(firstExpr)» «IF operator == MinMaxOperator::MIN»<?«ENDIF»«IF operator == MinMaxOperator::MAX»>?«ENDIF» «expressionOptionalParenthesesNonAssoc(secondExpr)»'''
	
	def dispatch expression(BitwiseExpression it) '''«expressionOptionalParentheses(firstExpr)» «IF operator==BitwiseOperator::AND»&«ENDIF»«IF operator==BitwiseOperator::OR»|«ENDIF»«IF operator==BitwiseOperator::XOR»^«ENDIF» «expressionOptionalParentheses(secondExpr)»'''
	
	def dispatch expression(BitShiftExpression it) '''«expressionOptionalParentheses(firstExpr)» «IF operator==BitShiftOperator::LEFT»<<«ENDIF»«IF operator==BitShiftOperator::RIGHT»>>«ENDIF» «expressionOptionalParenthesesNonAssoc(secondExpr)»'''
	
	/* define system */
	def system(System it) '''system «FOR i : instantiationList ?:emptyList SEPARATOR ' < '»«instantiationList(i)»«ENDFOR»;'''
	
	def instantiationList(InstantiationList it) '''«FOR AbstractTemplate i : template ?:emptyList SEPARATOR ','»«name(i)»«ENDFOR»'''
	
	def progressMeasure(ProgressMeasure it) '''progress {«FOR i : expression ?:emptyList SEPARATOR ';'»«expression(i)»«ENDFOR»;}'''
	
	//Non-template "to-text" methods
	def assignment(AssignmentOperator op) {
		switch (op) {
			case AssignmentOperator::EQUAL : '='
			case AssignmentOperator::PLUS_EQUAL : '+='
			case AssignmentOperator::MINUS_EQUAL : '-='
			case AssignmentOperator::TIMES_EQUAL : '*='
			case AssignmentOperator::DIVIDE_EQUAL : '/='
			case AssignmentOperator::MODULO_EQUAL : '%='
			default: ""
		}
	}
	
	def comparison(CompareOperator op) {
		switch (op) {
			case CompareOperator::EQUAL : '=='
			case CompareOperator::UNEQUAL : '!='
			case CompareOperator::GREATER : '&gt;'
			case CompareOperator::GREATER_OR_EQUAL : '&gt;='
			case CompareOperator::LESS : '&lt;'
			case CompareOperator::LESS_OR_EQUAL : '&lt;='
			default: ""
		}
	}
	
	
	def arithmetic(ArithmeticOperator op) {
		switch (op) {
			case ArithmeticOperator::ADD : '+'
			case ArithmeticOperator::SUBTRACT : '-'
			case ArithmeticOperator::MULTIPLICATE : '*'
			case ArithmeticOperator::DIVIDE : '/'
			case ArithmeticOperator::MODULO : '%'
			default: ""
		}
	}
	
	//Returns false if the expression belongs to a (potentially) non-associative non-unary operator
	def boolean isAssociative(Expression it) {
		switch (it) {
			ArithmeticExpression: return operator == ArithmeticOperator::MULTIPLICATE || operator == ArithmeticOperator::ADD //left-associative
			ConditionExpression: return false //right-associative
			BitShiftExpression: return false //left-associative
			MinMaxExpression: return false //left-associative (associative for only min/only max, though)
			CompareExpression: return false //left-associative
			LogicalExpression: return operator != LogicalOperator::IMPLY //left-associative
		};
		
		return true;
	}
	
	//Operator precedence provider. Higher number implies higher precedence
	def int precedence(Expression it) {
		switch (it) { //listing 
			case it == null: return 1000
			
			case it instanceof IdentifierExpression: return 500
			case it instanceof ScopedIdentifierExpression: return 500
			case it instanceof LiteralExpression: return 500
			case it instanceof FunctionCallExpression: return 500
			
			case it instanceof IncrementDecrementExpression: return 300
			case it instanceof PlusExpression: return 300
			case it instanceof MinusExpression: return 300

			case it instanceof ArithmeticExpression && (
									(it as ArithmeticExpression).operator == ArithmeticOperator::MULTIPLICATE
									|| (it as ArithmeticExpression).operator == ArithmeticOperator::DIVIDE
									|| (it as ArithmeticExpression).operator == ArithmeticOperator::MODULO
								): return 290
			case it instanceof ArithmeticExpression && (
									(it as ArithmeticExpression).operator == ArithmeticOperator::SUBTRACT
									|| (it as ArithmeticExpression).operator == ArithmeticOperator::ADD
								): return 280
			
			
			case it instanceof BitShiftExpression: return 270
			case it instanceof MinMaxExpression: return 260
			case it instanceof CompareExpression && ((it as CompareExpression).operator == CompareOperator::EQUAL || (it as CompareExpression).operator == CompareOperator::UNEQUAL): return 250
			case it instanceof CompareExpression: return 245
			case it instanceof BitwiseExpression && (it as BitwiseExpression).operator == BitwiseOperator::AND: return 240
			case it instanceof BitwiseExpression && (it as BitwiseExpression).operator == BitwiseOperator::XOR: return 230
			case it instanceof BitwiseExpression && (it as BitwiseExpression).operator == BitwiseOperator::OR: return 220
			case it instanceof ConditionExpression: return 210
			
			case it instanceof AssignmentExpression: return 200
			
			case it instanceof NegationExpression: return 190
			case it instanceof LogicalExpression && (it as LogicalExpression).operator == LogicalOperator::AND: return 180
			case it instanceof LogicalExpression && (it as LogicalExpression).operator == LogicalOperator::OR: return 170
			case it instanceof LogicalExpression && (it as LogicalExpression).operator == LogicalOperator::IMPLY: return 170
			case it instanceof QuantificationExpression: return 160
		}
		
		return 0;
	}
}
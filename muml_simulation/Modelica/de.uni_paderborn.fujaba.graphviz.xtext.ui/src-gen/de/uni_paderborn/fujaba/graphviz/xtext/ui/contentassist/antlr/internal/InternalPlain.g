/*
* generated by Xtext
*/
grammar InternalPlain;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package de.uni_paderborn.fujaba.graphviz.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.uni_paderborn.fujaba.graphviz.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.uni_paderborn.fujaba.graphviz.xtext.services.PlainGrammarAccess;

}

@parser::members {
 
 	private PlainGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(PlainGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleGraph
entryRuleGraph 
:
{ before(grammarAccess.getGraphRule()); }
	 ruleGraph
{ after(grammarAccess.getGraphRule()); } 
	 EOF 
;

// Rule Graph
ruleGraph
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getGraphAccess().getGroup()); }
(rule__Graph__Group__0)
{ after(grammarAccess.getGraphAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNode
entryRuleNode 
:
{ before(grammarAccess.getNodeRule()); }
	 ruleNode
{ after(grammarAccess.getNodeRule()); } 
	 EOF 
;

// Rule Node
ruleNode
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNodeAccess().getGroup()); }
(rule__Node__Group__0)
{ after(grammarAccess.getNodeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEdge
entryRuleEdge 
:
{ before(grammarAccess.getEdgeRule()); }
	 ruleEdge
{ after(grammarAccess.getEdgeRule()); } 
	 EOF 
;

// Rule Edge
ruleEdge
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEdgeAccess().getGroup()); }
(rule__Edge__Group__0)
{ after(grammarAccess.getEdgeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePoint
entryRulePoint 
:
{ before(grammarAccess.getPointRule()); }
	 rulePoint
{ after(grammarAccess.getPointRule()); } 
	 EOF 
;

// Rule Point
rulePoint
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPointAccess().getGroup()); }
(rule__Point__Group__0)
{ after(grammarAccess.getPointAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNumber
entryRuleNumber 
:
{ before(grammarAccess.getNumberRule()); }
	 ruleNumber
{ after(grammarAccess.getNumberRule()); } 
	 EOF 
;

// Rule Number
ruleNumber
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNumberAccess().getAlternatives()); }
(rule__Number__Alternatives)
{ after(grammarAccess.getNumberAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleIdentifier
entryRuleIdentifier 
:
{ before(grammarAccess.getIdentifierRule()); }
	 ruleIdentifier
{ after(grammarAccess.getIdentifierRule()); } 
	 EOF 
;

// Rule Identifier
ruleIdentifier
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIdentifierAccess().getAlternatives()); }
(rule__Identifier__Alternatives)
{ after(grammarAccess.getIdentifierAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Number__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); }
	RULE_DOUBLE
{ after(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
{ after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Identifier__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); }
	RULE_STRING
{ after(grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Graph__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Graph__Group__0__Impl
	rule__Graph__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Graph__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGraphAccess().getGraphKeyword_0()); }

	'graph' 

{ after(grammarAccess.getGraphAccess().getGraphKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Graph__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Graph__Group__1__Impl
	rule__Graph__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Graph__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGraphAccess().getScaleAssignment_1()); }
(rule__Graph__ScaleAssignment_1)
{ after(grammarAccess.getGraphAccess().getScaleAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Graph__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Graph__Group__2__Impl
	rule__Graph__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Graph__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGraphAccess().getWidthAssignment_2()); }
(rule__Graph__WidthAssignment_2)
{ after(grammarAccess.getGraphAccess().getWidthAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Graph__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Graph__Group__3__Impl
	rule__Graph__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Graph__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGraphAccess().getHeightAssignment_3()); }
(rule__Graph__HeightAssignment_3)
{ after(grammarAccess.getGraphAccess().getHeightAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Graph__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Graph__Group__4__Impl
	rule__Graph__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Graph__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGraphAccess().getNodesAssignment_4()); }
(rule__Graph__NodesAssignment_4)*
{ after(grammarAccess.getGraphAccess().getNodesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Graph__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Graph__Group__5__Impl
	rule__Graph__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Graph__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGraphAccess().getEdgesAssignment_5()); }
(rule__Graph__EdgesAssignment_5)*
{ after(grammarAccess.getGraphAccess().getEdgesAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Graph__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Graph__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Graph__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGraphAccess().getStopKeyword_6()); }

	'stop' 

{ after(grammarAccess.getGraphAccess().getStopKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Node__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__0__Impl
	rule__Node__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getNodeKeyword_0()); }

	'node' 

{ after(grammarAccess.getNodeAccess().getNodeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__1__Impl
	rule__Node__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getNameAssignment_1()); }
(rule__Node__NameAssignment_1)
{ after(grammarAccess.getNodeAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__2__Impl
	rule__Node__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getPositionAssignment_2()); }
(rule__Node__PositionAssignment_2)
{ after(grammarAccess.getNodeAccess().getPositionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__3__Impl
	rule__Node__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getWidthAssignment_3()); }
(rule__Node__WidthAssignment_3)
{ after(grammarAccess.getNodeAccess().getWidthAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__4__Impl
	rule__Node__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getHeightAssignment_4()); }
(rule__Node__HeightAssignment_4)
{ after(grammarAccess.getNodeAccess().getHeightAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__5__Impl
	rule__Node__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getIdentifierParserRuleCall_5()); }
	ruleIdentifier
{ after(grammarAccess.getNodeAccess().getIdentifierParserRuleCall_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__6__Impl
	rule__Node__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getIDTerminalRuleCall_6()); }
	RULE_ID
{ after(grammarAccess.getNodeAccess().getIDTerminalRuleCall_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__7__Impl
	rule__Node__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getIDTerminalRuleCall_7()); }
	RULE_ID
{ after(grammarAccess.getNodeAccess().getIDTerminalRuleCall_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__8__Impl
	rule__Node__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getIDTerminalRuleCall_8()); }
	RULE_ID
{ after(grammarAccess.getNodeAccess().getIDTerminalRuleCall_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Node__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getIDTerminalRuleCall_9()); }
	RULE_ID
{ after(grammarAccess.getNodeAccess().getIDTerminalRuleCall_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}






















rule__Edge__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__0__Impl
	rule__Edge__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getEdgeKeyword_0()); }

	'edge' 

{ after(grammarAccess.getEdgeAccess().getEdgeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__1__Impl
	rule__Edge__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getSourceAssignment_1()); }
(rule__Edge__SourceAssignment_1)
{ after(grammarAccess.getEdgeAccess().getSourceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__2__Impl
	rule__Edge__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getTargetAssignment_2()); }
(rule__Edge__TargetAssignment_2)
{ after(grammarAccess.getEdgeAccess().getTargetAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__3__Impl
	rule__Edge__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getINTTerminalRuleCall_3()); }
	RULE_INT
{ after(grammarAccess.getEdgeAccess().getINTTerminalRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__4__Impl
	rule__Edge__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getSplinePointsAssignment_4()); }
(rule__Edge__SplinePointsAssignment_4)*
{ after(grammarAccess.getEdgeAccess().getSplinePointsAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__5__Impl
	rule__Edge__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getGroup_5()); }
(rule__Edge__Group_5__0)?
{ after(grammarAccess.getEdgeAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__6__Impl
	rule__Edge__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getIDTerminalRuleCall_6()); }
	RULE_ID
{ after(grammarAccess.getEdgeAccess().getIDTerminalRuleCall_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getIDTerminalRuleCall_7()); }
	RULE_ID
{ after(grammarAccess.getEdgeAccess().getIDTerminalRuleCall_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__Edge__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_5__0__Impl
	rule__Edge__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getIdentifierParserRuleCall_5_0()); }
	ruleIdentifier
{ after(grammarAccess.getEdgeAccess().getIdentifierParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_5__1__Impl
	rule__Edge__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getNumberParserRuleCall_5_1()); }
	ruleNumber
{ after(grammarAccess.getEdgeAccess().getNumberParserRuleCall_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edge__Group_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edge__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__Group_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getNumberParserRuleCall_5_2()); }
	ruleNumber
{ after(grammarAccess.getEdgeAccess().getNumberParserRuleCall_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Point__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Point__Group__0__Impl
	rule__Point__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Point__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPointAccess().getXAssignment_0()); }
(rule__Point__XAssignment_0)
{ after(grammarAccess.getPointAccess().getXAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Point__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Point__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Point__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPointAccess().getYAssignment_1()); }
(rule__Point__YAssignment_1)
{ after(grammarAccess.getPointAccess().getYAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Graph__ScaleAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGraphAccess().getScaleNumberParserRuleCall_1_0()); }
	ruleNumber{ after(grammarAccess.getGraphAccess().getScaleNumberParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Graph__WidthAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGraphAccess().getWidthNumberParserRuleCall_2_0()); }
	ruleNumber{ after(grammarAccess.getGraphAccess().getWidthNumberParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Graph__HeightAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGraphAccess().getHeightNumberParserRuleCall_3_0()); }
	ruleNumber{ after(grammarAccess.getGraphAccess().getHeightNumberParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Graph__NodesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGraphAccess().getNodesNodeParserRuleCall_4_0()); }
	ruleNode{ after(grammarAccess.getGraphAccess().getNodesNodeParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Graph__EdgesAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGraphAccess().getEdgesEdgeParserRuleCall_5_0()); }
	ruleEdge{ after(grammarAccess.getGraphAccess().getEdgesEdgeParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Node__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getNameIdentifierParserRuleCall_1_0()); }
	ruleIdentifier{ after(grammarAccess.getNodeAccess().getNameIdentifierParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Node__PositionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getPositionPointParserRuleCall_2_0()); }
	rulePoint{ after(grammarAccess.getNodeAccess().getPositionPointParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Node__WidthAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getWidthNumberParserRuleCall_3_0()); }
	ruleNumber{ after(grammarAccess.getNodeAccess().getWidthNumberParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Node__HeightAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getHeightNumberParserRuleCall_4_0()); }
	ruleNumber{ after(grammarAccess.getNodeAccess().getHeightNumberParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__SourceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getSourceNodeCrossReference_1_0()); }
(
{ before(grammarAccess.getEdgeAccess().getSourceNodeIdentifierParserRuleCall_1_0_1()); }
	ruleIdentifier{ after(grammarAccess.getEdgeAccess().getSourceNodeIdentifierParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getEdgeAccess().getSourceNodeCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__TargetAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getTargetNodeCrossReference_2_0()); }
(
{ before(grammarAccess.getEdgeAccess().getTargetNodeIdentifierParserRuleCall_2_0_1()); }
	ruleIdentifier{ after(grammarAccess.getEdgeAccess().getTargetNodeIdentifierParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getEdgeAccess().getTargetNodeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Edge__SplinePointsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEdgeAccess().getSplinePointsPointParserRuleCall_4_0()); }
	rulePoint{ after(grammarAccess.getEdgeAccess().getSplinePointsPointParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Point__XAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPointAccess().getXNumberParserRuleCall_0_0()); }
	ruleNumber{ after(grammarAccess.getPointAccess().getXNumberParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Point__YAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPointAccess().getYNumberParserRuleCall_1_0()); }
	ruleNumber{ after(grammarAccess.getPointAccess().getYNumberParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_DOUBLE : RULE_INT+ '.' RULE_INT+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



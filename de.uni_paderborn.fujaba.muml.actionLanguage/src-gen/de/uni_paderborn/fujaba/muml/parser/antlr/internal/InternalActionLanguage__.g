lexer grammar InternalActionLanguage;
@header {
package de.uni_paderborn.fujaba.muml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : '{' ;
T13 : '}' ;
T14 : 'for' ;
T15 : '(' ;
T16 : ';' ;
T17 : ')' ;
T18 : 'while' ;
T19 : 'do' ;
T20 : 'if' ;
T21 : 'elseif' ;
T22 : 'else' ;
T23 : ':' ;
T24 : '=' ;
T25 : ':=' ;
T26 : '+=' ;
T27 : '=+' ;
T28 : '-=' ;
T29 : '=-' ;
T30 : '++' ;
T31 : '--' ;
T32 : '&' ;
T33 : '&&' ;
T34 : '|' ;
T35 : '||' ;
T36 : 'xor' ;
T37 : '=>' ;
T38 : '<=>' ;
T39 : '+' ;
T40 : '-' ;
T41 : '*' ;
T42 : '/' ;
T43 : '%' ;
T44 : '^' ;
T45 : '<' ;
T46 : '<=' ;
T47 : '==' ;
T48 : '>=' ;
T49 : '>' ;
T50 : '<>' ;
T51 : 'not' ;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g" 1742
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g" 1744
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g" 1746
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g" 1748
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g" 1750
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g" 1752
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g" 1754
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g" 1756
RULE_ANY_OTHER : .;



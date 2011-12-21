lexer grammar InternalActionLanguage;
@header {
package de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : '=' ;
T13 : ':=' ;
T14 : '+=' ;
T15 : '=+' ;
T16 : '-=' ;
T17 : '=-' ;
T18 : '++' ;
T19 : '--' ;
T20 : '&' ;
T21 : '&&' ;
T22 : '|' ;
T23 : '||' ;
T24 : 'xor' ;
T25 : '=>' ;
T26 : '<=>' ;
T27 : '+' ;
T28 : '-' ;
T29 : '*' ;
T30 : '/' ;
T31 : '%' ;
T32 : '^' ;
T33 : '<' ;
T34 : '<=' ;
T35 : '==' ;
T36 : '>=' ;
T37 : '>' ;
T38 : '<>' ;
T39 : 'not' ;
T40 : '{' ;
T41 : '}' ;
T42 : 'for' ;
T43 : '(' ;
T44 : ';' ;
T45 : ')' ;
T46 : 'while' ;
T47 : 'do' ;
T48 : 'if' ;
T49 : 'elseif' ;
T50 : 'else' ;
T51 : ':' ;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3912
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3914
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3916
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3918
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3920
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3922
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3924
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3926
RULE_ANY_OTHER : .;



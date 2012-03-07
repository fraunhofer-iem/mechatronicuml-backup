lexer grammar InternalActionLanguage;
@header {
package de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : '=' ;
T14 : ':=' ;
T15 : '+=' ;
T16 : '=+' ;
T17 : '-=' ;
T18 : '=-' ;
T19 : '++' ;
T20 : '--' ;
T21 : '&' ;
T22 : '&&' ;
T23 : '|' ;
T24 : '||' ;
T25 : 'xor' ;
T26 : '=>' ;
T27 : '<=>' ;
T28 : '+' ;
T29 : '-' ;
T30 : '*' ;
T31 : '/' ;
T32 : '%' ;
T33 : '^' ;
T34 : '<' ;
T35 : '<=' ;
T36 : '==' ;
T37 : '>=' ;
T38 : '>' ;
T39 : '<>' ;
T40 : 'not' ;
T41 : '{' ;
T42 : '}' ;
T43 : 'for' ;
T44 : '(' ;
T45 : ';' ;
T46 : ')' ;
T47 : 'while' ;
T48 : 'do' ;
T49 : 'if' ;
T50 : 'elseif' ;
T51 : 'else' ;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3884
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3886
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3888
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3890
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3892
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3894
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3896
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3898
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g" 3900
RULE_ANY_OTHER : .;



lexer grammar InternalMultiplosdestinos;
@header {
package org.xtext.lrm.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'pionner' ;
T12 : 'srv' ;
T13 : 'golfe' ;
T14 : 'defines' ;
T15 : 'includes' ;
T16 : 'player;' ;
T17 : 'localizacao;' ;
T18 : 'gps' ;
T19 : 'bussola' ;
T20 : 'camera' ;
T21 : 'robo' ;
T22 : 'plataforma' ;
T23 : 'adicionar' ;
T24 : 'importar pacote' ;
T25 : 'criarSensor' ;
T26 : 'int main()' ;
T27 : '{' ;
T28 : '}' ;
T29 : 'while' ;
T30 : '(true)' ;
T31 : 'gps.ligar();' ;
T32 : 'bussola.ligar();' ;
T33 : 'camera.ligar();' ;
T34 : 'carregarListaCoordenadas();' ;
T35 : 'inicializarPlayer();' ;
T36 : 'gps.ler();' ;
T37 : 'bussola.ler();' ;
T38 : 'camera.ler();' ;
T39 : 'receberCoordenada();' ;
T40 : 'processaInfo();' ;
T41 : 'processaImagem();' ;
T42 : 'defineRegra();' ;
T43 : 'defineRegraSeguir();' ;
T44 : 'defineRegraNaoBater();' ;
T45 : 'defineRegraSeguirMultiplasCoordenadas();' ;
T46 : 'andar();' ;

// $ANTLR src "../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g" 2259
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g" 2261
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g" 2263
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g" 2265
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g" 2267
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g" 2269
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g" 2271
RULE_ANY_OTHER : .;



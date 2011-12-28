lexer grammar InternalMultiplosdestinos;
@header {
package org.xtext.lrm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'robo' ;
T12 : 'plataforma' ;
T13 : 'pionner' ;
T14 : 'srv' ;
T15 : 'golfe' ;
T16 : 'adicionar' ;
T17 : 'defines' ;
T18 : 'includes' ;
T19 : 'importar pacote' ;
T20 : 'player;' ;
T21 : 'localizacao;' ;
T22 : 'criarSensor' ;
T23 : 'gps' ;
T24 : 'bussola' ;
T25 : 'camera' ;
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

// $ANTLR src "../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g" 1373
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g" 1375
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g" 1377
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g" 1379
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g" 1381
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g" 1383
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g" 1385
RULE_ANY_OTHER : .;



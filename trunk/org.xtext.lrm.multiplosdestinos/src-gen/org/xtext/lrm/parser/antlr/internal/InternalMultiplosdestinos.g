/*
* generated by Xtext
*/
grammar InternalMultiplosdestinos;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.lrm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.lrm.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.xtext.lrm.services.MultiplosdestinosGrammarAccess;

}

@parser::members {

 	private MultiplosdestinosGrammarAccess grammarAccess;
 	
    public InternalMultiplosdestinosParser(TokenStream input, IAstFactory factory, MultiplosdestinosGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.tokens");
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "ModeloRobo";	
   	}
   	
   	@Override
   	protected MultiplosdestinosGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModeloRobo
entryRuleModeloRobo returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getModeloRoboRule(), currentNode); }
	 iv_ruleModeloRobo=ruleModeloRobo 
	 { $current=$iv_ruleModeloRobo.current; } 
	 EOF 
;

// Rule ModeloRobo
ruleModeloRobo returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getModeloRoboAccess().getPlataformaPlataformaParserRuleCall_0_0(), currentNode); 
	    }
		lv_plataforma_0_0=rulePlataforma		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModeloRoboRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"plataforma",
	        		lv_plataforma_0_0, 
	        		"Plataforma", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	'robo' 
    {
        createLeafNode(grammarAccess.getModeloRoboAccess().getRoboKeyword_1(), null); 
    }
(
(
		lv_name_2_0=RULE_ID
		{
			createLeafNode(grammarAccess.getModeloRoboAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModeloRoboRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_2_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getModeloRoboAccess().getCabecalhoCabecalhoParserRuleCall_3_0(), currentNode); 
	    }
		lv_cabecalho_3_0=ruleCabecalho		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModeloRoboRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"cabecalho",
	        		lv_cabecalho_3_0, 
	        		"Cabecalho", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getModeloRoboAccess().getPacotePacoteParserRuleCall_4_0(), currentNode); 
	    }
		lv_pacote_4_0=rulePacote		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModeloRoboRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"pacote",
	        		lv_pacote_4_0, 
	        		"Pacote", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getModeloRoboAccess().getSensorSensorParserRuleCall_5_0(), currentNode); 
	    }
		lv_sensor_5_0=ruleSensor		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModeloRoboRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"sensor",
	        		lv_sensor_5_0, 
	        		"Sensor", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getModeloRoboAccess().getMainMainParserRuleCall_6_0(), currentNode); 
	    }
		lv_main_6_0=ruleMain		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModeloRoboRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"main",
	        		lv_main_6_0, 
	        		"Main", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
;





// Entry rule entryRulePlataforma
entryRulePlataforma returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getPlataformaRule(), currentNode); }
	 iv_rulePlataforma=rulePlataforma 
	 { $current=$iv_rulePlataforma.current; } 
	 EOF 
;

// Rule Plataforma
rulePlataforma returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'plataforma' 
    {
        createLeafNode(grammarAccess.getPlataformaAccess().getPlataformaKeyword_0(), null); 
    }

    { 
        currentNode=createCompositeNode(grammarAccess.getPlataformaAccess().getNomeDaPlataformaParserRuleCall_1(), currentNode); 
    }
    this_nomeDaPlataforma_1=rulenomeDaPlataforma
    { 
        $current = $this_nomeDaPlataforma_1.current; 
        currentNode = currentNode.getParent();
    }
)
;





// Entry rule entryRulenomeDaPlataforma
entryRulenomeDaPlataforma returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getNomeDaPlataformaRule(), currentNode); }
	 iv_rulenomeDaPlataforma=rulenomeDaPlataforma 
	 { $current=$iv_rulenomeDaPlataforma.current; } 
	 EOF 
;

// Rule nomeDaPlataforma
rulenomeDaPlataforma returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
(
(
		lv_plat_0_1=	'pionner' 
    {
        createLeafNode(grammarAccess.getNomeDaPlataformaAccess().getPlatPionnerKeyword_0_0(), "plat"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getNomeDaPlataformaRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "plat", lv_plat_0_1, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_plat_0_2=	'srv' 
    {
        createLeafNode(grammarAccess.getNomeDaPlataformaAccess().getPlatSrvKeyword_0_1(), "plat"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getNomeDaPlataformaRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "plat", lv_plat_0_2, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_plat_0_3=	'golfe' 
    {
        createLeafNode(grammarAccess.getNomeDaPlataformaAccess().getPlatGolfeKeyword_0_2(), "plat"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getNomeDaPlataformaRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "plat", lv_plat_0_3, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)

)
)
;





// Entry rule entryRuleCabecalho
entryRuleCabecalho returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getCabecalhoRule(), currentNode); }
	 iv_ruleCabecalho=ruleCabecalho 
	 { $current=$iv_ruleCabecalho.current; } 
	 EOF 
;

// Rule Cabecalho
ruleCabecalho returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'adicionar' 
    {
        createLeafNode(grammarAccess.getCabecalhoAccess().getAdicionarKeyword_0(), null); 
    }
(
(
(
		lv_itensCabecalho_1_1=	'defines' 
    {
        createLeafNode(grammarAccess.getCabecalhoAccess().getItensCabecalhoDefinesKeyword_1_0_0(), "itensCabecalho"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getCabecalhoRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "itensCabecalho", lv_itensCabecalho_1_1, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_itensCabecalho_1_2=	'includes' 
    {
        createLeafNode(grammarAccess.getCabecalhoAccess().getItensCabecalhoIncludesKeyword_1_0_1(), "itensCabecalho"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getCabecalhoRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "itensCabecalho", lv_itensCabecalho_1_2, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)

)
))
;





// Entry rule entryRulePacote
entryRulePacote returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getPacoteRule(), currentNode); }
	 iv_rulePacote=rulePacote 
	 { $current=$iv_rulePacote.current; } 
	 EOF 
;

// Rule Pacote
rulePacote returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'importar pacote' 
    {
        createLeafNode(grammarAccess.getPacoteAccess().getImportarPacoteKeyword_0(), null); 
    }
(
(
(
		lv_tipo_1_1=	'player;' 
    {
        createLeafNode(grammarAccess.getPacoteAccess().getTipoPlayerKeyword_1_0_0(), "tipo"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPacoteRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "tipo", lv_tipo_1_1, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_tipo_1_2=	'localizacao;' 
    {
        createLeafNode(grammarAccess.getPacoteAccess().getTipoLocalizacaoKeyword_1_0_1(), "tipo"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPacoteRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "tipo", lv_tipo_1_2, null, lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)

)
))
;





// Entry rule entryRuleSensor
entryRuleSensor returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getSensorRule(), currentNode); }
	 iv_ruleSensor=ruleSensor 
	 { $current=$iv_ruleSensor.current; } 
	 EOF 
;

// Rule Sensor
ruleSensor returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'criarSensor' 
    {
        createLeafNode(grammarAccess.getSensorAccess().getCriarSensorKeyword_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getSensorAccess().getTipoSensorTipoSensorParserRuleCall_1_0(), currentNode); 
	    }
		lv_tipoSensor_1_0=ruleTipoSensor		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getSensorRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"tipoSensor",
	        		lv_tipoSensor_1_0, 
	        		"TipoSensor", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
;





// Entry rule entryRuleTipoSensor
entryRuleTipoSensor returns [String current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getTipoSensorRule(), currentNode); } 
	 iv_ruleTipoSensor=ruleTipoSensor 
	 { $current=$iv_ruleTipoSensor.current.getText(); }  
	 EOF 
;

// Rule TipoSensor
ruleTipoSensor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
    }:
(
	kw='gps' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getTipoSensorAccess().getGpsKeyword_0(), null); 
    }

    |
	kw='bussola' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getTipoSensorAccess().getBussolaKeyword_1(), null); 
    }

    |
	kw='camera' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getTipoSensorAccess().getCameraKeyword_2(), null); 
    }
)
    ;





// Entry rule entryRuleMain
entryRuleMain returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getMainRule(), currentNode); }
	 iv_ruleMain=ruleMain 
	 { $current=$iv_ruleMain.current; } 
	 EOF 
;

// Rule Main
ruleMain returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'int main()' 
    {
        createLeafNode(grammarAccess.getMainAccess().getIntMainKeyword_0(), null); 
    }
	'{' 
    {
        createLeafNode(grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_1(), null); 
    }

    { 
        currentNode=createCompositeNode(grammarAccess.getMainAccess().getLoopParserRuleCall_2(), currentNode); 
    }
    this_loop_2=ruleloop
    { 
        $current = $this_loop_2.current; 
        currentNode = currentNode.getParent();
    }
	'}' 
    {
        createLeafNode(grammarAccess.getMainAccess().getRightCurlyBracketKeyword_3(), null); 
    }
)
;





// Entry rule entryRuleloop
entryRuleloop returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getLoopRule(), currentNode); }
	 iv_ruleloop=ruleloop 
	 { $current=$iv_ruleloop.current; } 
	 EOF 
;

// Rule loop
ruleloop returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getIniSensorInicializacaoSensorParserRuleCall_0_0(), currentNode); 
	    }
		lv_iniSensor_0_0=ruleinicializacaoSensor		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"iniSensor",
	        		lv_iniSensor_0_0, 
	        		"inicializacaoSensor", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getWWhileParserRuleCall_1_0(), currentNode); 
	    }
		lv_w_1_0=rulewhile		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"w",
	        		lv_w_1_0, 
	        		"while", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getEnEntradaParserRuleCall_2_0_0(), currentNode); 
	    }
		lv_en_2_0=ruleentrada		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"en",
	        		lv_en_2_0, 
	        		"entrada", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)
    |(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getProcProcessamentoParserRuleCall_2_1_0(), currentNode); 
	    }
		lv_proc_3_0=ruleprocessamento		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"proc",
	        		lv_proc_3_0, 
	        		"processamento", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)
    |(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getCompComportamentoParserRuleCall_2_2_0(), currentNode); 
	    }
		lv_comp_4_0=rulecomportamento		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"comp",
	        		lv_comp_4_0, 
	        		"comportamento", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)
    |(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getAcAcaoParserRuleCall_2_3_0(), currentNode); 
	    }
		lv_ac_5_0=ruleacao		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"ac",
	        		lv_ac_5_0, 
	        		"acao", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*	'}' 
    {
        createLeafNode(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_3(), null); 
    }
)
;





// Entry rule entryRulewhile
entryRulewhile returns [String current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getWhileRule(), currentNode); } 
	 iv_rulewhile=rulewhile 
	 { $current=$iv_rulewhile.current.getText(); }  
	 EOF 
;

// Rule while
rulewhile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
    }:
(
	kw='while' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getWhileAccess().getWhileKeyword_0(), null); 
    }

	kw='(true)' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getWhileAccess().getTrueKeyword_1(), null); 
    }

	kw='{' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_2(), null); 
    }
)
    ;





// Entry rule entryRuleinicializacaoSensor
entryRuleinicializacaoSensor returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getInicializacaoSensorRule(), currentNode); }
	 iv_ruleinicializacaoSensor=ruleinicializacaoSensor 
	 { $current=$iv_ruleinicializacaoSensor.current; } 
	 EOF 
;

// Rule inicializacaoSensor
ruleinicializacaoSensor returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_gpsLigar_0_0=	'gps.ligar();' 
    {
        createLeafNode(grammarAccess.getInicializacaoSensorAccess().getGpsLigarGpsLigarKeyword_0_0(), "gpsLigar"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getInicializacaoSensorRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "gpsLigar", lv_gpsLigar_0_0, "gps.ligar();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_bussolaLigar_1_0=	'bussola.ligar();' 
    {
        createLeafNode(grammarAccess.getInicializacaoSensorAccess().getBussolaLigarBussolaLigarKeyword_1_0(), "bussolaLigar"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getInicializacaoSensorRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "bussolaLigar", lv_bussolaLigar_1_0, "bussola.ligar();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_cameraLigar_2_0=	'camera.ligar();' 
    {
        createLeafNode(grammarAccess.getInicializacaoSensorAccess().getCameraLigarCameraLigarKeyword_2_0(), "cameraLigar"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getInicializacaoSensorRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "cameraLigar", lv_cameraLigar_2_0, "camera.ligar();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_carregarListaCoordenadas_3_0=	'carregarListaCoordenadas();' 
    {
        createLeafNode(grammarAccess.getInicializacaoSensorAccess().getCarregarListaCoordenadasCarregarListaCoordenadasKeyword_3_0(), "carregarListaCoordenadas"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getInicializacaoSensorRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "carregarListaCoordenadas", lv_carregarListaCoordenadas_3_0, "carregarListaCoordenadas();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_inicializarPlayer_4_0=	'inicializarPlayer();' 
    {
        createLeafNode(grammarAccess.getInicializacaoSensorAccess().getInicializarPlayerInicializarPlayerKeyword_4_0(), "inicializarPlayer"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getInicializacaoSensorRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "inicializarPlayer", lv_inicializarPlayer_4_0, "inicializarPlayer();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;





// Entry rule entryRuleentrada
entryRuleentrada returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getEntradaRule(), currentNode); }
	 iv_ruleentrada=ruleentrada 
	 { $current=$iv_ruleentrada.current; } 
	 EOF 
;

// Rule entrada
ruleentrada returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_gpsLer_0_0=	'gps.ler();' 
    {
        createLeafNode(grammarAccess.getEntradaAccess().getGpsLerGpsLerKeyword_0_0(), "gpsLer"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getEntradaRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "gpsLer", lv_gpsLer_0_0, "gps.ler();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_bussolaLer_1_0=	'bussola.ler();' 
    {
        createLeafNode(grammarAccess.getEntradaAccess().getBussolaLerBussolaLerKeyword_1_0(), "bussolaLer"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getEntradaRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "bussolaLer", lv_bussolaLer_1_0, "bussola.ler();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_cameraLer_2_0=	'camera.ler();' 
    {
        createLeafNode(grammarAccess.getEntradaAccess().getCameraLerCameraLerKeyword_2_0(), "cameraLer"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getEntradaRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "cameraLer", lv_cameraLer_2_0, "camera.ler();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_receberCoordenada_3_0=	'receberCoordenada();' 
    {
        createLeafNode(grammarAccess.getEntradaAccess().getReceberCoordenadaReceberCoordenadaKeyword_3_0(), "receberCoordenada"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getEntradaRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "receberCoordenada", lv_receberCoordenada_3_0, "receberCoordenada();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_carregarListaCoordenadas_4_0=	'carregarListaCoordenadas();' 
    {
        createLeafNode(grammarAccess.getEntradaAccess().getCarregarListaCoordenadasCarregarListaCoordenadasKeyword_4_0(), "carregarListaCoordenadas"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getEntradaRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "carregarListaCoordenadas", lv_carregarListaCoordenadas_4_0, "carregarListaCoordenadas();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;





// Entry rule entryRuleprocessamento
entryRuleprocessamento returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getProcessamentoRule(), currentNode); }
	 iv_ruleprocessamento=ruleprocessamento 
	 { $current=$iv_ruleprocessamento.current; } 
	 EOF 
;

// Rule processamento
ruleprocessamento returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_processaInfo_0_0=	'processaInfo();' 
    {
        createLeafNode(grammarAccess.getProcessamentoAccess().getProcessaInfoProcessaInfoKeyword_0_0(), "processaInfo"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getProcessamentoRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "processaInfo", lv_processaInfo_0_0, "processaInfo();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_processaImagem_1_0=	'processaImagem();' 
    {
        createLeafNode(grammarAccess.getProcessamentoAccess().getProcessaImagemProcessaImagemKeyword_1_0(), "processaImagem"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getProcessamentoRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "processaImagem", lv_processaImagem_1_0, "processaImagem();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;





// Entry rule entryRuleacao
entryRuleacao returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getAcaoRule(), currentNode); }
	 iv_ruleacao=ruleacao 
	 { $current=$iv_ruleacao.current; } 
	 EOF 
;

// Rule acao
ruleacao returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:

    { 
        currentNode=createCompositeNode(grammarAccess.getAcaoAccess().getAndarParserRuleCall(), currentNode); 
    }
    this_andar_0=ruleandar
    { 
        $current = $this_andar_0.current; 
        currentNode = currentNode.getParent();
    }

;





// Entry rule entryRulecomportamento
entryRulecomportamento returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getComportamentoRule(), currentNode); }
	 iv_rulecomportamento=rulecomportamento 
	 { $current=$iv_rulecomportamento.current; } 
	 EOF 
;

// Rule comportamento
rulecomportamento returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_defineRegra_0_0=	'defineRegra();' 
    {
        createLeafNode(grammarAccess.getComportamentoAccess().getDefineRegraDefineRegraKeyword_0_0(), "defineRegra"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getComportamentoRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "defineRegra", lv_defineRegra_0_0, "defineRegra();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_defineRegraSeguir_1_0=	'defineRegraSeguir();' 
    {
        createLeafNode(grammarAccess.getComportamentoAccess().getDefineRegraSeguirDefineRegraSeguirKeyword_1_0(), "defineRegraSeguir"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getComportamentoRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "defineRegraSeguir", lv_defineRegraSeguir_1_0, "defineRegraSeguir();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_defineRegraNaoBater_2_0=	'defineRegraNaoBater();' 
    {
        createLeafNode(grammarAccess.getComportamentoAccess().getDefineRegraNaoBaterDefineRegraNaoBaterKeyword_2_0(), "defineRegraNaoBater"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getComportamentoRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "defineRegraNaoBater", lv_defineRegraNaoBater_2_0, "defineRegraNaoBater();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_defineRegraSeguirMultiplasCoordenadas_3_0=	'defineRegraSeguirMultiplasCoordenadas();' 
    {
        createLeafNode(grammarAccess.getComportamentoAccess().getDefineRegraSeguirMultiplasCoordenadasDefineRegraSeguirMultiplasCoordenadasKeyword_3_0(), "defineRegraSeguirMultiplasCoordenadas"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getComportamentoRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "defineRegraSeguirMultiplasCoordenadas", lv_defineRegraSeguirMultiplasCoordenadas_3_0, "defineRegraSeguirMultiplasCoordenadas();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;





// Entry rule entryRuleandar
entryRuleandar returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getAndarRule(), currentNode); }
	 iv_ruleandar=ruleandar 
	 { $current=$iv_ruleandar.current; } 
	 EOF 
;

// Rule andar
ruleandar returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
(
		lv_andar_0_0=	'andar();' 
    {
        createLeafNode(grammarAccess.getAndarAccess().getAndarAndarKeyword_0(), "andar"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getAndarRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "andar", lv_andar_0_0, "andar();", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


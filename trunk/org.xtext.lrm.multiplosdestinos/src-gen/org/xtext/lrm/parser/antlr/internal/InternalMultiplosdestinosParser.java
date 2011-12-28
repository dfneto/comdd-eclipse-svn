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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMultiplosdestinosParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'robo'", "'plataforma'", "'pionner'", "'srv'", "'golfe'", "'adicionar'", "'defines'", "'includes'", "'importar pacote'", "'player;'", "'localizacao;'", "'criarSensor'", "'gps'", "'bussola'", "'camera'", "'int main()'", "'{'", "'}'", "'while'", "'(true)'", "'gps.ligar();'", "'bussola.ligar();'", "'camera.ligar();'", "'carregarListaCoordenadas();'", "'inicializarPlayer();'", "'gps.ler();'", "'bussola.ler();'", "'camera.ler();'", "'receberCoordenada();'", "'processaInfo();'", "'processaImagem();'", "'defineRegra();'", "'defineRegraSeguir();'", "'defineRegraNaoBater();'", "'defineRegraSeguirMultiplasCoordenadas();'", "'andar();'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalMultiplosdestinosParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g"; }



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



    // $ANTLR start entryRuleModeloRobo
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:77:1: entryRuleModeloRobo returns [EObject current=null] : iv_ruleModeloRobo= ruleModeloRobo EOF ;
    public final EObject entryRuleModeloRobo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModeloRobo = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:78:2: (iv_ruleModeloRobo= ruleModeloRobo EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:79:2: iv_ruleModeloRobo= ruleModeloRobo EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModeloRoboRule(), currentNode); 
            pushFollow(FOLLOW_ruleModeloRobo_in_entryRuleModeloRobo75);
            iv_ruleModeloRobo=ruleModeloRobo();
            _fsp--;

             current =iv_ruleModeloRobo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModeloRobo85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModeloRobo


    // $ANTLR start ruleModeloRobo
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:86:1: ruleModeloRobo returns [EObject current=null] : ( ( (lv_plataforma_0_0= rulePlataforma ) ) 'robo' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cabecalho_3_0= ruleCabecalho ) )* ( (lv_pacote_4_0= rulePacote ) )* ( (lv_sensor_5_0= ruleSensor ) )* ( (lv_main_6_0= ruleMain ) ) ) ;
    public final EObject ruleModeloRobo() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_plataforma_0_0 = null;

        EObject lv_cabecalho_3_0 = null;

        EObject lv_pacote_4_0 = null;

        EObject lv_sensor_5_0 = null;

        EObject lv_main_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:91:6: ( ( ( (lv_plataforma_0_0= rulePlataforma ) ) 'robo' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cabecalho_3_0= ruleCabecalho ) )* ( (lv_pacote_4_0= rulePacote ) )* ( (lv_sensor_5_0= ruleSensor ) )* ( (lv_main_6_0= ruleMain ) ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:92:1: ( ( (lv_plataforma_0_0= rulePlataforma ) ) 'robo' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cabecalho_3_0= ruleCabecalho ) )* ( (lv_pacote_4_0= rulePacote ) )* ( (lv_sensor_5_0= ruleSensor ) )* ( (lv_main_6_0= ruleMain ) ) )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:92:1: ( ( (lv_plataforma_0_0= rulePlataforma ) ) 'robo' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cabecalho_3_0= ruleCabecalho ) )* ( (lv_pacote_4_0= rulePacote ) )* ( (lv_sensor_5_0= ruleSensor ) )* ( (lv_main_6_0= ruleMain ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:92:2: ( (lv_plataforma_0_0= rulePlataforma ) ) 'robo' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cabecalho_3_0= ruleCabecalho ) )* ( (lv_pacote_4_0= rulePacote ) )* ( (lv_sensor_5_0= ruleSensor ) )* ( (lv_main_6_0= ruleMain ) )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:92:2: ( (lv_plataforma_0_0= rulePlataforma ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:93:1: (lv_plataforma_0_0= rulePlataforma )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:93:1: (lv_plataforma_0_0= rulePlataforma )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:94:3: lv_plataforma_0_0= rulePlataforma
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModeloRoboAccess().getPlataformaPlataformaParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePlataforma_in_ruleModeloRobo131);
            lv_plataforma_0_0=rulePlataforma();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModeloRoboRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"plataforma",
            	        		lv_plataforma_0_0, 
            	        		"Plataforma", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,11,FOLLOW_11_in_ruleModeloRobo141); 

                    createLeafNode(grammarAccess.getModeloRoboAccess().getRoboKeyword_1(), null); 
                
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:120:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:121:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:121:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:122:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModeloRobo158); 

            			createLeafNode(grammarAccess.getModeloRoboAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModeloRoboRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:144:2: ( (lv_cabecalho_3_0= ruleCabecalho ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:145:1: (lv_cabecalho_3_0= ruleCabecalho )
            	    {
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:145:1: (lv_cabecalho_3_0= ruleCabecalho )
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:146:3: lv_cabecalho_3_0= ruleCabecalho
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModeloRoboAccess().getCabecalhoCabecalhoParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCabecalho_in_ruleModeloRobo184);
            	    lv_cabecalho_3_0=ruleCabecalho();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModeloRoboRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"cabecalho",
            	    	        		lv_cabecalho_3_0, 
            	    	        		"Cabecalho", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:168:3: ( (lv_pacote_4_0= rulePacote ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:169:1: (lv_pacote_4_0= rulePacote )
            	    {
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:169:1: (lv_pacote_4_0= rulePacote )
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:170:3: lv_pacote_4_0= rulePacote
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModeloRoboAccess().getPacotePacoteParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePacote_in_ruleModeloRobo206);
            	    lv_pacote_4_0=rulePacote();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModeloRoboRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"pacote",
            	    	        		lv_pacote_4_0, 
            	    	        		"Pacote", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:192:3: ( (lv_sensor_5_0= ruleSensor ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:193:1: (lv_sensor_5_0= ruleSensor )
            	    {
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:193:1: (lv_sensor_5_0= ruleSensor )
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:194:3: lv_sensor_5_0= ruleSensor
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModeloRoboAccess().getSensorSensorParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSensor_in_ruleModeloRobo228);
            	    lv_sensor_5_0=ruleSensor();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModeloRoboRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"sensor",
            	    	        		lv_sensor_5_0, 
            	    	        		"Sensor", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:216:3: ( (lv_main_6_0= ruleMain ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:217:1: (lv_main_6_0= ruleMain )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:217:1: (lv_main_6_0= ruleMain )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:218:3: lv_main_6_0= ruleMain
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModeloRoboAccess().getMainMainParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMain_in_ruleModeloRobo250);
            lv_main_6_0=ruleMain();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModeloRoboRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"main",
            	        		lv_main_6_0, 
            	        		"Main", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModeloRobo


    // $ANTLR start entryRulePlataforma
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:248:1: entryRulePlataforma returns [EObject current=null] : iv_rulePlataforma= rulePlataforma EOF ;
    public final EObject entryRulePlataforma() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlataforma = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:249:2: (iv_rulePlataforma= rulePlataforma EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:250:2: iv_rulePlataforma= rulePlataforma EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPlataformaRule(), currentNode); 
            pushFollow(FOLLOW_rulePlataforma_in_entryRulePlataforma286);
            iv_rulePlataforma=rulePlataforma();
            _fsp--;

             current =iv_rulePlataforma; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlataforma296); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePlataforma


    // $ANTLR start rulePlataforma
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:257:1: rulePlataforma returns [EObject current=null] : ( 'plataforma' this_nomeDaPlataforma_1= rulenomeDaPlataforma ) ;
    public final EObject rulePlataforma() throws RecognitionException {
        EObject current = null;

        EObject this_nomeDaPlataforma_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:262:6: ( ( 'plataforma' this_nomeDaPlataforma_1= rulenomeDaPlataforma ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:263:1: ( 'plataforma' this_nomeDaPlataforma_1= rulenomeDaPlataforma )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:263:1: ( 'plataforma' this_nomeDaPlataforma_1= rulenomeDaPlataforma )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:263:3: 'plataforma' this_nomeDaPlataforma_1= rulenomeDaPlataforma
            {
            match(input,12,FOLLOW_12_in_rulePlataforma331); 

                    createLeafNode(grammarAccess.getPlataformaAccess().getPlataformaKeyword_0(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getPlataformaAccess().getNomeDaPlataformaParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_rulenomeDaPlataforma_in_rulePlataforma353);
            this_nomeDaPlataforma_1=rulenomeDaPlataforma();
            _fsp--;

             
                    current = this_nomeDaPlataforma_1; 
                    currentNode = currentNode.getParent();
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePlataforma


    // $ANTLR start entryRulenomeDaPlataforma
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:284:1: entryRulenomeDaPlataforma returns [EObject current=null] : iv_rulenomeDaPlataforma= rulenomeDaPlataforma EOF ;
    public final EObject entryRulenomeDaPlataforma() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenomeDaPlataforma = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:285:2: (iv_rulenomeDaPlataforma= rulenomeDaPlataforma EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:286:2: iv_rulenomeDaPlataforma= rulenomeDaPlataforma EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNomeDaPlataformaRule(), currentNode); 
            pushFollow(FOLLOW_rulenomeDaPlataforma_in_entryRulenomeDaPlataforma388);
            iv_rulenomeDaPlataforma=rulenomeDaPlataforma();
            _fsp--;

             current =iv_rulenomeDaPlataforma; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenomeDaPlataforma398); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulenomeDaPlataforma


    // $ANTLR start rulenomeDaPlataforma
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:293:1: rulenomeDaPlataforma returns [EObject current=null] : ( ( (lv_plat_0_1= 'pionner' | lv_plat_0_2= 'srv' | lv_plat_0_3= 'golfe' ) ) ) ;
    public final EObject rulenomeDaPlataforma() throws RecognitionException {
        EObject current = null;

        Token lv_plat_0_1=null;
        Token lv_plat_0_2=null;
        Token lv_plat_0_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:298:6: ( ( ( (lv_plat_0_1= 'pionner' | lv_plat_0_2= 'srv' | lv_plat_0_3= 'golfe' ) ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:299:1: ( ( (lv_plat_0_1= 'pionner' | lv_plat_0_2= 'srv' | lv_plat_0_3= 'golfe' ) ) )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:299:1: ( ( (lv_plat_0_1= 'pionner' | lv_plat_0_2= 'srv' | lv_plat_0_3= 'golfe' ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:300:1: ( (lv_plat_0_1= 'pionner' | lv_plat_0_2= 'srv' | lv_plat_0_3= 'golfe' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:300:1: ( (lv_plat_0_1= 'pionner' | lv_plat_0_2= 'srv' | lv_plat_0_3= 'golfe' ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:301:1: (lv_plat_0_1= 'pionner' | lv_plat_0_2= 'srv' | lv_plat_0_3= 'golfe' )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:301:1: (lv_plat_0_1= 'pionner' | lv_plat_0_2= 'srv' | lv_plat_0_3= 'golfe' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("301:1: (lv_plat_0_1= 'pionner' | lv_plat_0_2= 'srv' | lv_plat_0_3= 'golfe' )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:302:3: lv_plat_0_1= 'pionner'
                    {
                    lv_plat_0_1=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_rulenomeDaPlataforma442); 

                            createLeafNode(grammarAccess.getNomeDaPlataformaAccess().getPlatPionnerKeyword_0_0(), "plat"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNomeDaPlataformaRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "plat", lv_plat_0_1, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:320:8: lv_plat_0_2= 'srv'
                    {
                    lv_plat_0_2=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_rulenomeDaPlataforma471); 

                            createLeafNode(grammarAccess.getNomeDaPlataformaAccess().getPlatSrvKeyword_0_1(), "plat"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNomeDaPlataformaRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "plat", lv_plat_0_2, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:338:8: lv_plat_0_3= 'golfe'
                    {
                    lv_plat_0_3=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_rulenomeDaPlataforma500); 

                            createLeafNode(grammarAccess.getNomeDaPlataformaAccess().getPlatGolfeKeyword_0_2(), "plat"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNomeDaPlataformaRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "plat", lv_plat_0_3, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulenomeDaPlataforma


    // $ANTLR start entryRuleCabecalho
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:367:1: entryRuleCabecalho returns [EObject current=null] : iv_ruleCabecalho= ruleCabecalho EOF ;
    public final EObject entryRuleCabecalho() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCabecalho = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:368:2: (iv_ruleCabecalho= ruleCabecalho EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:369:2: iv_ruleCabecalho= ruleCabecalho EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCabecalhoRule(), currentNode); 
            pushFollow(FOLLOW_ruleCabecalho_in_entryRuleCabecalho551);
            iv_ruleCabecalho=ruleCabecalho();
            _fsp--;

             current =iv_ruleCabecalho; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCabecalho561); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCabecalho


    // $ANTLR start ruleCabecalho
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:376:1: ruleCabecalho returns [EObject current=null] : ( 'adicionar' ( ( (lv_itensCabecalho_1_1= 'defines' | lv_itensCabecalho_1_2= 'includes' ) ) ) ) ;
    public final EObject ruleCabecalho() throws RecognitionException {
        EObject current = null;

        Token lv_itensCabecalho_1_1=null;
        Token lv_itensCabecalho_1_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:381:6: ( ( 'adicionar' ( ( (lv_itensCabecalho_1_1= 'defines' | lv_itensCabecalho_1_2= 'includes' ) ) ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:382:1: ( 'adicionar' ( ( (lv_itensCabecalho_1_1= 'defines' | lv_itensCabecalho_1_2= 'includes' ) ) ) )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:382:1: ( 'adicionar' ( ( (lv_itensCabecalho_1_1= 'defines' | lv_itensCabecalho_1_2= 'includes' ) ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:382:3: 'adicionar' ( ( (lv_itensCabecalho_1_1= 'defines' | lv_itensCabecalho_1_2= 'includes' ) ) )
            {
            match(input,16,FOLLOW_16_in_ruleCabecalho596); 

                    createLeafNode(grammarAccess.getCabecalhoAccess().getAdicionarKeyword_0(), null); 
                
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:386:1: ( ( (lv_itensCabecalho_1_1= 'defines' | lv_itensCabecalho_1_2= 'includes' ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:387:1: ( (lv_itensCabecalho_1_1= 'defines' | lv_itensCabecalho_1_2= 'includes' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:387:1: ( (lv_itensCabecalho_1_1= 'defines' | lv_itensCabecalho_1_2= 'includes' ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:388:1: (lv_itensCabecalho_1_1= 'defines' | lv_itensCabecalho_1_2= 'includes' )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:388:1: (lv_itensCabecalho_1_1= 'defines' | lv_itensCabecalho_1_2= 'includes' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("388:1: (lv_itensCabecalho_1_1= 'defines' | lv_itensCabecalho_1_2= 'includes' )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:389:3: lv_itensCabecalho_1_1= 'defines'
                    {
                    lv_itensCabecalho_1_1=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleCabecalho616); 

                            createLeafNode(grammarAccess.getCabecalhoAccess().getItensCabecalhoDefinesKeyword_1_0_0(), "itensCabecalho"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCabecalhoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "itensCabecalho", lv_itensCabecalho_1_1, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:407:8: lv_itensCabecalho_1_2= 'includes'
                    {
                    lv_itensCabecalho_1_2=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleCabecalho645); 

                            createLeafNode(grammarAccess.getCabecalhoAccess().getItensCabecalhoIncludesKeyword_1_0_1(), "itensCabecalho"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCabecalhoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "itensCabecalho", lv_itensCabecalho_1_2, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCabecalho


    // $ANTLR start entryRulePacote
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:436:1: entryRulePacote returns [EObject current=null] : iv_rulePacote= rulePacote EOF ;
    public final EObject entryRulePacote() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePacote = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:437:2: (iv_rulePacote= rulePacote EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:438:2: iv_rulePacote= rulePacote EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPacoteRule(), currentNode); 
            pushFollow(FOLLOW_rulePacote_in_entryRulePacote697);
            iv_rulePacote=rulePacote();
            _fsp--;

             current =iv_rulePacote; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePacote707); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePacote


    // $ANTLR start rulePacote
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:445:1: rulePacote returns [EObject current=null] : ( 'importar pacote' ( ( (lv_tipo_1_1= 'player;' | lv_tipo_1_2= 'localizacao;' ) ) ) ) ;
    public final EObject rulePacote() throws RecognitionException {
        EObject current = null;

        Token lv_tipo_1_1=null;
        Token lv_tipo_1_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:450:6: ( ( 'importar pacote' ( ( (lv_tipo_1_1= 'player;' | lv_tipo_1_2= 'localizacao;' ) ) ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:451:1: ( 'importar pacote' ( ( (lv_tipo_1_1= 'player;' | lv_tipo_1_2= 'localizacao;' ) ) ) )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:451:1: ( 'importar pacote' ( ( (lv_tipo_1_1= 'player;' | lv_tipo_1_2= 'localizacao;' ) ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:451:3: 'importar pacote' ( ( (lv_tipo_1_1= 'player;' | lv_tipo_1_2= 'localizacao;' ) ) )
            {
            match(input,19,FOLLOW_19_in_rulePacote742); 

                    createLeafNode(grammarAccess.getPacoteAccess().getImportarPacoteKeyword_0(), null); 
                
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:455:1: ( ( (lv_tipo_1_1= 'player;' | lv_tipo_1_2= 'localizacao;' ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:456:1: ( (lv_tipo_1_1= 'player;' | lv_tipo_1_2= 'localizacao;' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:456:1: ( (lv_tipo_1_1= 'player;' | lv_tipo_1_2= 'localizacao;' ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:457:1: (lv_tipo_1_1= 'player;' | lv_tipo_1_2= 'localizacao;' )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:457:1: (lv_tipo_1_1= 'player;' | lv_tipo_1_2= 'localizacao;' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("457:1: (lv_tipo_1_1= 'player;' | lv_tipo_1_2= 'localizacao;' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:458:3: lv_tipo_1_1= 'player;'
                    {
                    lv_tipo_1_1=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_rulePacote762); 

                            createLeafNode(grammarAccess.getPacoteAccess().getTipoPlayerKeyword_1_0_0(), "tipo"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPacoteRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "tipo", lv_tipo_1_1, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:476:8: lv_tipo_1_2= 'localizacao;'
                    {
                    lv_tipo_1_2=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_rulePacote791); 

                            createLeafNode(grammarAccess.getPacoteAccess().getTipoLocalizacaoKeyword_1_0_1(), "tipo"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPacoteRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "tipo", lv_tipo_1_2, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePacote


    // $ANTLR start entryRuleSensor
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:505:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:506:2: (iv_ruleSensor= ruleSensor EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:507:2: iv_ruleSensor= ruleSensor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSensorRule(), currentNode); 
            pushFollow(FOLLOW_ruleSensor_in_entryRuleSensor843);
            iv_ruleSensor=ruleSensor();
            _fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensor853); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSensor


    // $ANTLR start ruleSensor
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:514:1: ruleSensor returns [EObject current=null] : ( 'criarSensor' ( (lv_tipoSensor_1_0= ruleTipoSensor ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipoSensor_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:519:6: ( ( 'criarSensor' ( (lv_tipoSensor_1_0= ruleTipoSensor ) ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:520:1: ( 'criarSensor' ( (lv_tipoSensor_1_0= ruleTipoSensor ) ) )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:520:1: ( 'criarSensor' ( (lv_tipoSensor_1_0= ruleTipoSensor ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:520:3: 'criarSensor' ( (lv_tipoSensor_1_0= ruleTipoSensor ) )
            {
            match(input,22,FOLLOW_22_in_ruleSensor888); 

                    createLeafNode(grammarAccess.getSensorAccess().getCriarSensorKeyword_0(), null); 
                
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:524:1: ( (lv_tipoSensor_1_0= ruleTipoSensor ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:525:1: (lv_tipoSensor_1_0= ruleTipoSensor )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:525:1: (lv_tipoSensor_1_0= ruleTipoSensor )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:526:3: lv_tipoSensor_1_0= ruleTipoSensor
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSensorAccess().getTipoSensorTipoSensorParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTipoSensor_in_ruleSensor909);
            lv_tipoSensor_1_0=ruleTipoSensor();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSensorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"tipoSensor",
            	        		lv_tipoSensor_1_0, 
            	        		"TipoSensor", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSensor


    // $ANTLR start entryRuleTipoSensor
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:556:1: entryRuleTipoSensor returns [String current=null] : iv_ruleTipoSensor= ruleTipoSensor EOF ;
    public final String entryRuleTipoSensor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoSensor = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:557:2: (iv_ruleTipoSensor= ruleTipoSensor EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:558:2: iv_ruleTipoSensor= ruleTipoSensor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTipoSensorRule(), currentNode); 
            pushFollow(FOLLOW_ruleTipoSensor_in_entryRuleTipoSensor946);
            iv_ruleTipoSensor=ruleTipoSensor();
            _fsp--;

             current =iv_ruleTipoSensor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTipoSensor957); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTipoSensor


    // $ANTLR start ruleTipoSensor
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:565:1: ruleTipoSensor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'gps' | kw= 'bussola' | kw= 'camera' ) ;
    public final AntlrDatatypeRuleToken ruleTipoSensor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:570:6: ( (kw= 'gps' | kw= 'bussola' | kw= 'camera' ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:571:1: (kw= 'gps' | kw= 'bussola' | kw= 'camera' )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:571:1: (kw= 'gps' | kw= 'bussola' | kw= 'camera' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("571:1: (kw= 'gps' | kw= 'bussola' | kw= 'camera' )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:572:2: kw= 'gps'
                    {
                    kw=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_ruleTipoSensor995); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getTipoSensorAccess().getGpsKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:579:2: kw= 'bussola'
                    {
                    kw=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruleTipoSensor1014); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getTipoSensorAccess().getBussolaKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:586:2: kw= 'camera'
                    {
                    kw=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_ruleTipoSensor1033); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getTipoSensorAccess().getCameraKeyword_2(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTipoSensor


    // $ANTLR start entryRuleMain
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:599:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:600:2: (iv_ruleMain= ruleMain EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:601:2: iv_ruleMain= ruleMain EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMainRule(), currentNode); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain1073);
            iv_ruleMain=ruleMain();
            _fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain1083); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMain


    // $ANTLR start ruleMain
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:608:1: ruleMain returns [EObject current=null] : ( 'int main()' '{' this_loop_2= ruleloop '}' ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        EObject this_loop_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:613:6: ( ( 'int main()' '{' this_loop_2= ruleloop '}' ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:614:1: ( 'int main()' '{' this_loop_2= ruleloop '}' )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:614:1: ( 'int main()' '{' this_loop_2= ruleloop '}' )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:614:3: 'int main()' '{' this_loop_2= ruleloop '}'
            {
            match(input,26,FOLLOW_26_in_ruleMain1118); 

                    createLeafNode(grammarAccess.getMainAccess().getIntMainKeyword_0(), null); 
                
            match(input,27,FOLLOW_27_in_ruleMain1128); 

                    createLeafNode(grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_1(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getMainAccess().getLoopParserRuleCall_2(), currentNode); 
                
            pushFollow(FOLLOW_ruleloop_in_ruleMain1150);
            this_loop_2=ruleloop();
            _fsp--;

             
                    current = this_loop_2; 
                    currentNode = currentNode.getParent();
                
            match(input,28,FOLLOW_28_in_ruleMain1159); 

                    createLeafNode(grammarAccess.getMainAccess().getRightCurlyBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMain


    // $ANTLR start entryRuleloop
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:643:1: entryRuleloop returns [EObject current=null] : iv_ruleloop= ruleloop EOF ;
    public final EObject entryRuleloop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleloop = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:644:2: (iv_ruleloop= ruleloop EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:645:2: iv_ruleloop= ruleloop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoopRule(), currentNode); 
            pushFollow(FOLLOW_ruleloop_in_entryRuleloop1195);
            iv_ruleloop=ruleloop();
            _fsp--;

             current =iv_ruleloop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleloop1205); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleloop


    // $ANTLR start ruleloop
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:652:1: ruleloop returns [EObject current=null] : ( ( (lv_iniSensor_0_0= ruleinicializacaoSensor ) )* ( (lv_w_1_0= rulewhile ) ) ( ( (lv_en_2_0= ruleentrada ) ) | ( (lv_proc_3_0= ruleprocessamento ) ) | ( (lv_comp_4_0= rulecomportamento ) ) | ( (lv_ac_5_0= ruleacao ) ) )* '}' ) ;
    public final EObject ruleloop() throws RecognitionException {
        EObject current = null;

        EObject lv_iniSensor_0_0 = null;

        AntlrDatatypeRuleToken lv_w_1_0 = null;

        EObject lv_en_2_0 = null;

        EObject lv_proc_3_0 = null;

        EObject lv_comp_4_0 = null;

        EObject lv_ac_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:657:6: ( ( ( (lv_iniSensor_0_0= ruleinicializacaoSensor ) )* ( (lv_w_1_0= rulewhile ) ) ( ( (lv_en_2_0= ruleentrada ) ) | ( (lv_proc_3_0= ruleprocessamento ) ) | ( (lv_comp_4_0= rulecomportamento ) ) | ( (lv_ac_5_0= ruleacao ) ) )* '}' ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:658:1: ( ( (lv_iniSensor_0_0= ruleinicializacaoSensor ) )* ( (lv_w_1_0= rulewhile ) ) ( ( (lv_en_2_0= ruleentrada ) ) | ( (lv_proc_3_0= ruleprocessamento ) ) | ( (lv_comp_4_0= rulecomportamento ) ) | ( (lv_ac_5_0= ruleacao ) ) )* '}' )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:658:1: ( ( (lv_iniSensor_0_0= ruleinicializacaoSensor ) )* ( (lv_w_1_0= rulewhile ) ) ( ( (lv_en_2_0= ruleentrada ) ) | ( (lv_proc_3_0= ruleprocessamento ) ) | ( (lv_comp_4_0= rulecomportamento ) ) | ( (lv_ac_5_0= ruleacao ) ) )* '}' )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:658:2: ( (lv_iniSensor_0_0= ruleinicializacaoSensor ) )* ( (lv_w_1_0= rulewhile ) ) ( ( (lv_en_2_0= ruleentrada ) ) | ( (lv_proc_3_0= ruleprocessamento ) ) | ( (lv_comp_4_0= rulecomportamento ) ) | ( (lv_ac_5_0= ruleacao ) ) )* '}'
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:658:2: ( (lv_iniSensor_0_0= ruleinicializacaoSensor ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=31 && LA8_0<=35)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:659:1: (lv_iniSensor_0_0= ruleinicializacaoSensor )
            	    {
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:659:1: (lv_iniSensor_0_0= ruleinicializacaoSensor )
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:660:3: lv_iniSensor_0_0= ruleinicializacaoSensor
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getIniSensorInicializacaoSensorParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleinicializacaoSensor_in_ruleloop1251);
            	    lv_iniSensor_0_0=ruleinicializacaoSensor();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"iniSensor",
            	    	        		lv_iniSensor_0_0, 
            	    	        		"inicializacaoSensor", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:682:3: ( (lv_w_1_0= rulewhile ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:683:1: (lv_w_1_0= rulewhile )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:683:1: (lv_w_1_0= rulewhile )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:684:3: lv_w_1_0= rulewhile
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getWWhileParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulewhile_in_ruleloop1273);
            lv_w_1_0=rulewhile();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"w",
            	        		lv_w_1_0, 
            	        		"while", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:706:2: ( ( (lv_en_2_0= ruleentrada ) ) | ( (lv_proc_3_0= ruleprocessamento ) ) | ( (lv_comp_4_0= rulecomportamento ) ) | ( (lv_ac_5_0= ruleacao ) ) )*
            loop9:
            do {
                int alt9=5;
                switch ( input.LA(1) ) {
                case 34:
                case 36:
                case 37:
                case 38:
                case 39:
                    {
                    alt9=1;
                    }
                    break;
                case 40:
                case 41:
                    {
                    alt9=2;
                    }
                    break;
                case 42:
                case 43:
                case 44:
                case 45:
                    {
                    alt9=3;
                    }
                    break;
                case 46:
                    {
                    alt9=4;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:706:3: ( (lv_en_2_0= ruleentrada ) )
            	    {
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:706:3: ( (lv_en_2_0= ruleentrada ) )
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:707:1: (lv_en_2_0= ruleentrada )
            	    {
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:707:1: (lv_en_2_0= ruleentrada )
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:708:3: lv_en_2_0= ruleentrada
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getEnEntradaParserRuleCall_2_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleentrada_in_ruleloop1295);
            	    lv_en_2_0=ruleentrada();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"en",
            	    	        		lv_en_2_0, 
            	    	        		"entrada", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:731:6: ( (lv_proc_3_0= ruleprocessamento ) )
            	    {
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:731:6: ( (lv_proc_3_0= ruleprocessamento ) )
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:732:1: (lv_proc_3_0= ruleprocessamento )
            	    {
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:732:1: (lv_proc_3_0= ruleprocessamento )
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:733:3: lv_proc_3_0= ruleprocessamento
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getProcProcessamentoParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleprocessamento_in_ruleloop1322);
            	    lv_proc_3_0=ruleprocessamento();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"proc",
            	    	        		lv_proc_3_0, 
            	    	        		"processamento", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:756:6: ( (lv_comp_4_0= rulecomportamento ) )
            	    {
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:756:6: ( (lv_comp_4_0= rulecomportamento ) )
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:757:1: (lv_comp_4_0= rulecomportamento )
            	    {
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:757:1: (lv_comp_4_0= rulecomportamento )
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:758:3: lv_comp_4_0= rulecomportamento
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getCompComportamentoParserRuleCall_2_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulecomportamento_in_ruleloop1349);
            	    lv_comp_4_0=rulecomportamento();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"comp",
            	    	        		lv_comp_4_0, 
            	    	        		"comportamento", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:781:6: ( (lv_ac_5_0= ruleacao ) )
            	    {
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:781:6: ( (lv_ac_5_0= ruleacao ) )
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:782:1: (lv_ac_5_0= ruleacao )
            	    {
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:782:1: (lv_ac_5_0= ruleacao )
            	    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:783:3: lv_ac_5_0= ruleacao
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getAcAcaoParserRuleCall_2_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleacao_in_ruleloop1376);
            	    lv_ac_5_0=ruleacao();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ac",
            	    	        		lv_ac_5_0, 
            	    	        		"acao", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,28,FOLLOW_28_in_ruleloop1388); 

                    createLeafNode(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleloop


    // $ANTLR start entryRulewhile
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:817:1: entryRulewhile returns [String current=null] : iv_rulewhile= rulewhile EOF ;
    public final String entryRulewhile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulewhile = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:818:2: (iv_rulewhile= rulewhile EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:819:2: iv_rulewhile= rulewhile EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWhileRule(), currentNode); 
            pushFollow(FOLLOW_rulewhile_in_entryRulewhile1425);
            iv_rulewhile=rulewhile();
            _fsp--;

             current =iv_rulewhile.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile1436); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulewhile


    // $ANTLR start rulewhile
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:826:1: rulewhile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'while' kw= '(true)' kw= '{' ) ;
    public final AntlrDatatypeRuleToken rulewhile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:831:6: ( (kw= 'while' kw= '(true)' kw= '{' ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:832:1: (kw= 'while' kw= '(true)' kw= '{' )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:832:1: (kw= 'while' kw= '(true)' kw= '{' )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:833:2: kw= 'while' kw= '(true)' kw= '{'
            {
            kw=(Token)input.LT(1);
            match(input,29,FOLLOW_29_in_rulewhile1474); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getWhileAccess().getWhileKeyword_0(), null); 
                
            kw=(Token)input.LT(1);
            match(input,30,FOLLOW_30_in_rulewhile1487); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getWhileAccess().getTrueKeyword_1(), null); 
                
            kw=(Token)input.LT(1);
            match(input,27,FOLLOW_27_in_rulewhile1500); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulewhile


    // $ANTLR start entryRuleinicializacaoSensor
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:858:1: entryRuleinicializacaoSensor returns [EObject current=null] : iv_ruleinicializacaoSensor= ruleinicializacaoSensor EOF ;
    public final EObject entryRuleinicializacaoSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinicializacaoSensor = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:859:2: (iv_ruleinicializacaoSensor= ruleinicializacaoSensor EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:860:2: iv_ruleinicializacaoSensor= ruleinicializacaoSensor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInicializacaoSensorRule(), currentNode); 
            pushFollow(FOLLOW_ruleinicializacaoSensor_in_entryRuleinicializacaoSensor1540);
            iv_ruleinicializacaoSensor=ruleinicializacaoSensor();
            _fsp--;

             current =iv_ruleinicializacaoSensor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinicializacaoSensor1550); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleinicializacaoSensor


    // $ANTLR start ruleinicializacaoSensor
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:867:1: ruleinicializacaoSensor returns [EObject current=null] : ( ( (lv_gpsLigar_0_0= 'gps.ligar();' ) ) | ( (lv_bussolaLigar_1_0= 'bussola.ligar();' ) ) | ( (lv_cameraLigar_2_0= 'camera.ligar();' ) ) | ( (lv_carregarListaCoordenadas_3_0= 'carregarListaCoordenadas();' ) ) | ( (lv_inicializarPlayer_4_0= 'inicializarPlayer();' ) ) ) ;
    public final EObject ruleinicializacaoSensor() throws RecognitionException {
        EObject current = null;

        Token lv_gpsLigar_0_0=null;
        Token lv_bussolaLigar_1_0=null;
        Token lv_cameraLigar_2_0=null;
        Token lv_carregarListaCoordenadas_3_0=null;
        Token lv_inicializarPlayer_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:872:6: ( ( ( (lv_gpsLigar_0_0= 'gps.ligar();' ) ) | ( (lv_bussolaLigar_1_0= 'bussola.ligar();' ) ) | ( (lv_cameraLigar_2_0= 'camera.ligar();' ) ) | ( (lv_carregarListaCoordenadas_3_0= 'carregarListaCoordenadas();' ) ) | ( (lv_inicializarPlayer_4_0= 'inicializarPlayer();' ) ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:873:1: ( ( (lv_gpsLigar_0_0= 'gps.ligar();' ) ) | ( (lv_bussolaLigar_1_0= 'bussola.ligar();' ) ) | ( (lv_cameraLigar_2_0= 'camera.ligar();' ) ) | ( (lv_carregarListaCoordenadas_3_0= 'carregarListaCoordenadas();' ) ) | ( (lv_inicializarPlayer_4_0= 'inicializarPlayer();' ) ) )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:873:1: ( ( (lv_gpsLigar_0_0= 'gps.ligar();' ) ) | ( (lv_bussolaLigar_1_0= 'bussola.ligar();' ) ) | ( (lv_cameraLigar_2_0= 'camera.ligar();' ) ) | ( (lv_carregarListaCoordenadas_3_0= 'carregarListaCoordenadas();' ) ) | ( (lv_inicializarPlayer_4_0= 'inicializarPlayer();' ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 33:
                {
                alt10=3;
                }
                break;
            case 34:
                {
                alt10=4;
                }
                break;
            case 35:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("873:1: ( ( (lv_gpsLigar_0_0= 'gps.ligar();' ) ) | ( (lv_bussolaLigar_1_0= 'bussola.ligar();' ) ) | ( (lv_cameraLigar_2_0= 'camera.ligar();' ) ) | ( (lv_carregarListaCoordenadas_3_0= 'carregarListaCoordenadas();' ) ) | ( (lv_inicializarPlayer_4_0= 'inicializarPlayer();' ) ) )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:873:2: ( (lv_gpsLigar_0_0= 'gps.ligar();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:873:2: ( (lv_gpsLigar_0_0= 'gps.ligar();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:874:1: (lv_gpsLigar_0_0= 'gps.ligar();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:874:1: (lv_gpsLigar_0_0= 'gps.ligar();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:875:3: lv_gpsLigar_0_0= 'gps.ligar();'
                    {
                    lv_gpsLigar_0_0=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleinicializacaoSensor1593); 

                            createLeafNode(grammarAccess.getInicializacaoSensorAccess().getGpsLigarGpsLigarKeyword_0_0(), "gpsLigar"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInicializacaoSensorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "gpsLigar", lv_gpsLigar_0_0, "gps.ligar();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:895:6: ( (lv_bussolaLigar_1_0= 'bussola.ligar();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:895:6: ( (lv_bussolaLigar_1_0= 'bussola.ligar();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:896:1: (lv_bussolaLigar_1_0= 'bussola.ligar();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:896:1: (lv_bussolaLigar_1_0= 'bussola.ligar();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:897:3: lv_bussolaLigar_1_0= 'bussola.ligar();'
                    {
                    lv_bussolaLigar_1_0=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleinicializacaoSensor1630); 

                            createLeafNode(grammarAccess.getInicializacaoSensorAccess().getBussolaLigarBussolaLigarKeyword_1_0(), "bussolaLigar"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInicializacaoSensorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "bussolaLigar", lv_bussolaLigar_1_0, "bussola.ligar();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:917:6: ( (lv_cameraLigar_2_0= 'camera.ligar();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:917:6: ( (lv_cameraLigar_2_0= 'camera.ligar();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:918:1: (lv_cameraLigar_2_0= 'camera.ligar();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:918:1: (lv_cameraLigar_2_0= 'camera.ligar();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:919:3: lv_cameraLigar_2_0= 'camera.ligar();'
                    {
                    lv_cameraLigar_2_0=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleinicializacaoSensor1667); 

                            createLeafNode(grammarAccess.getInicializacaoSensorAccess().getCameraLigarCameraLigarKeyword_2_0(), "cameraLigar"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInicializacaoSensorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "cameraLigar", lv_cameraLigar_2_0, "camera.ligar();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:939:6: ( (lv_carregarListaCoordenadas_3_0= 'carregarListaCoordenadas();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:939:6: ( (lv_carregarListaCoordenadas_3_0= 'carregarListaCoordenadas();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:940:1: (lv_carregarListaCoordenadas_3_0= 'carregarListaCoordenadas();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:940:1: (lv_carregarListaCoordenadas_3_0= 'carregarListaCoordenadas();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:941:3: lv_carregarListaCoordenadas_3_0= 'carregarListaCoordenadas();'
                    {
                    lv_carregarListaCoordenadas_3_0=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleinicializacaoSensor1704); 

                            createLeafNode(grammarAccess.getInicializacaoSensorAccess().getCarregarListaCoordenadasCarregarListaCoordenadasKeyword_3_0(), "carregarListaCoordenadas"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInicializacaoSensorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "carregarListaCoordenadas", lv_carregarListaCoordenadas_3_0, "carregarListaCoordenadas();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:961:6: ( (lv_inicializarPlayer_4_0= 'inicializarPlayer();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:961:6: ( (lv_inicializarPlayer_4_0= 'inicializarPlayer();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:962:1: (lv_inicializarPlayer_4_0= 'inicializarPlayer();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:962:1: (lv_inicializarPlayer_4_0= 'inicializarPlayer();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:963:3: lv_inicializarPlayer_4_0= 'inicializarPlayer();'
                    {
                    lv_inicializarPlayer_4_0=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_ruleinicializacaoSensor1741); 

                            createLeafNode(grammarAccess.getInicializacaoSensorAccess().getInicializarPlayerInicializarPlayerKeyword_4_0(), "inicializarPlayer"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInicializacaoSensorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "inicializarPlayer", lv_inicializarPlayer_4_0, "inicializarPlayer();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleinicializacaoSensor


    // $ANTLR start entryRuleentrada
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:990:1: entryRuleentrada returns [EObject current=null] : iv_ruleentrada= ruleentrada EOF ;
    public final EObject entryRuleentrada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleentrada = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:991:2: (iv_ruleentrada= ruleentrada EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:992:2: iv_ruleentrada= ruleentrada EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntradaRule(), currentNode); 
            pushFollow(FOLLOW_ruleentrada_in_entryRuleentrada1790);
            iv_ruleentrada=ruleentrada();
            _fsp--;

             current =iv_ruleentrada; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleentrada1800); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleentrada


    // $ANTLR start ruleentrada
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:999:1: ruleentrada returns [EObject current=null] : ( ( (lv_gpsLer_0_0= 'gps.ler();' ) ) | ( (lv_bussolaLer_1_0= 'bussola.ler();' ) ) | ( (lv_cameraLer_2_0= 'camera.ler();' ) ) | ( (lv_receberCoordenada_3_0= 'receberCoordenada();' ) ) | ( (lv_carregarListaCoordenadas_4_0= 'carregarListaCoordenadas();' ) ) ) ;
    public final EObject ruleentrada() throws RecognitionException {
        EObject current = null;

        Token lv_gpsLer_0_0=null;
        Token lv_bussolaLer_1_0=null;
        Token lv_cameraLer_2_0=null;
        Token lv_receberCoordenada_3_0=null;
        Token lv_carregarListaCoordenadas_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1004:6: ( ( ( (lv_gpsLer_0_0= 'gps.ler();' ) ) | ( (lv_bussolaLer_1_0= 'bussola.ler();' ) ) | ( (lv_cameraLer_2_0= 'camera.ler();' ) ) | ( (lv_receberCoordenada_3_0= 'receberCoordenada();' ) ) | ( (lv_carregarListaCoordenadas_4_0= 'carregarListaCoordenadas();' ) ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1005:1: ( ( (lv_gpsLer_0_0= 'gps.ler();' ) ) | ( (lv_bussolaLer_1_0= 'bussola.ler();' ) ) | ( (lv_cameraLer_2_0= 'camera.ler();' ) ) | ( (lv_receberCoordenada_3_0= 'receberCoordenada();' ) ) | ( (lv_carregarListaCoordenadas_4_0= 'carregarListaCoordenadas();' ) ) )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1005:1: ( ( (lv_gpsLer_0_0= 'gps.ler();' ) ) | ( (lv_bussolaLer_1_0= 'bussola.ler();' ) ) | ( (lv_cameraLer_2_0= 'camera.ler();' ) ) | ( (lv_receberCoordenada_3_0= 'receberCoordenada();' ) ) | ( (lv_carregarListaCoordenadas_4_0= 'carregarListaCoordenadas();' ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt11=1;
                }
                break;
            case 37:
                {
                alt11=2;
                }
                break;
            case 38:
                {
                alt11=3;
                }
                break;
            case 39:
                {
                alt11=4;
                }
                break;
            case 34:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1005:1: ( ( (lv_gpsLer_0_0= 'gps.ler();' ) ) | ( (lv_bussolaLer_1_0= 'bussola.ler();' ) ) | ( (lv_cameraLer_2_0= 'camera.ler();' ) ) | ( (lv_receberCoordenada_3_0= 'receberCoordenada();' ) ) | ( (lv_carregarListaCoordenadas_4_0= 'carregarListaCoordenadas();' ) ) )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1005:2: ( (lv_gpsLer_0_0= 'gps.ler();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1005:2: ( (lv_gpsLer_0_0= 'gps.ler();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1006:1: (lv_gpsLer_0_0= 'gps.ler();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1006:1: (lv_gpsLer_0_0= 'gps.ler();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1007:3: lv_gpsLer_0_0= 'gps.ler();'
                    {
                    lv_gpsLer_0_0=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleentrada1843); 

                            createLeafNode(grammarAccess.getEntradaAccess().getGpsLerGpsLerKeyword_0_0(), "gpsLer"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEntradaRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "gpsLer", lv_gpsLer_0_0, "gps.ler();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1027:6: ( (lv_bussolaLer_1_0= 'bussola.ler();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1027:6: ( (lv_bussolaLer_1_0= 'bussola.ler();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1028:1: (lv_bussolaLer_1_0= 'bussola.ler();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1028:1: (lv_bussolaLer_1_0= 'bussola.ler();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1029:3: lv_bussolaLer_1_0= 'bussola.ler();'
                    {
                    lv_bussolaLer_1_0=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_ruleentrada1880); 

                            createLeafNode(grammarAccess.getEntradaAccess().getBussolaLerBussolaLerKeyword_1_0(), "bussolaLer"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEntradaRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "bussolaLer", lv_bussolaLer_1_0, "bussola.ler();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1049:6: ( (lv_cameraLer_2_0= 'camera.ler();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1049:6: ( (lv_cameraLer_2_0= 'camera.ler();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1050:1: (lv_cameraLer_2_0= 'camera.ler();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1050:1: (lv_cameraLer_2_0= 'camera.ler();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1051:3: lv_cameraLer_2_0= 'camera.ler();'
                    {
                    lv_cameraLer_2_0=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_ruleentrada1917); 

                            createLeafNode(grammarAccess.getEntradaAccess().getCameraLerCameraLerKeyword_2_0(), "cameraLer"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEntradaRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "cameraLer", lv_cameraLer_2_0, "camera.ler();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1071:6: ( (lv_receberCoordenada_3_0= 'receberCoordenada();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1071:6: ( (lv_receberCoordenada_3_0= 'receberCoordenada();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1072:1: (lv_receberCoordenada_3_0= 'receberCoordenada();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1072:1: (lv_receberCoordenada_3_0= 'receberCoordenada();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1073:3: lv_receberCoordenada_3_0= 'receberCoordenada();'
                    {
                    lv_receberCoordenada_3_0=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_ruleentrada1954); 

                            createLeafNode(grammarAccess.getEntradaAccess().getReceberCoordenadaReceberCoordenadaKeyword_3_0(), "receberCoordenada"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEntradaRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "receberCoordenada", lv_receberCoordenada_3_0, "receberCoordenada();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1093:6: ( (lv_carregarListaCoordenadas_4_0= 'carregarListaCoordenadas();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1093:6: ( (lv_carregarListaCoordenadas_4_0= 'carregarListaCoordenadas();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1094:1: (lv_carregarListaCoordenadas_4_0= 'carregarListaCoordenadas();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1094:1: (lv_carregarListaCoordenadas_4_0= 'carregarListaCoordenadas();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1095:3: lv_carregarListaCoordenadas_4_0= 'carregarListaCoordenadas();'
                    {
                    lv_carregarListaCoordenadas_4_0=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleentrada1991); 

                            createLeafNode(grammarAccess.getEntradaAccess().getCarregarListaCoordenadasCarregarListaCoordenadasKeyword_4_0(), "carregarListaCoordenadas"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEntradaRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "carregarListaCoordenadas", lv_carregarListaCoordenadas_4_0, "carregarListaCoordenadas();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleentrada


    // $ANTLR start entryRuleprocessamento
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1122:1: entryRuleprocessamento returns [EObject current=null] : iv_ruleprocessamento= ruleprocessamento EOF ;
    public final EObject entryRuleprocessamento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocessamento = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1123:2: (iv_ruleprocessamento= ruleprocessamento EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1124:2: iv_ruleprocessamento= ruleprocessamento EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessamentoRule(), currentNode); 
            pushFollow(FOLLOW_ruleprocessamento_in_entryRuleprocessamento2040);
            iv_ruleprocessamento=ruleprocessamento();
            _fsp--;

             current =iv_ruleprocessamento; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocessamento2050); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleprocessamento


    // $ANTLR start ruleprocessamento
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1131:1: ruleprocessamento returns [EObject current=null] : ( ( (lv_processaInfo_0_0= 'processaInfo();' ) ) | ( (lv_processaImagem_1_0= 'processaImagem();' ) ) ) ;
    public final EObject ruleprocessamento() throws RecognitionException {
        EObject current = null;

        Token lv_processaInfo_0_0=null;
        Token lv_processaImagem_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1136:6: ( ( ( (lv_processaInfo_0_0= 'processaInfo();' ) ) | ( (lv_processaImagem_1_0= 'processaImagem();' ) ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1137:1: ( ( (lv_processaInfo_0_0= 'processaInfo();' ) ) | ( (lv_processaImagem_1_0= 'processaImagem();' ) ) )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1137:1: ( ( (lv_processaInfo_0_0= 'processaInfo();' ) ) | ( (lv_processaImagem_1_0= 'processaImagem();' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            else if ( (LA12_0==41) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1137:1: ( ( (lv_processaInfo_0_0= 'processaInfo();' ) ) | ( (lv_processaImagem_1_0= 'processaImagem();' ) ) )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1137:2: ( (lv_processaInfo_0_0= 'processaInfo();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1137:2: ( (lv_processaInfo_0_0= 'processaInfo();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1138:1: (lv_processaInfo_0_0= 'processaInfo();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1138:1: (lv_processaInfo_0_0= 'processaInfo();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1139:3: lv_processaInfo_0_0= 'processaInfo();'
                    {
                    lv_processaInfo_0_0=(Token)input.LT(1);
                    match(input,40,FOLLOW_40_in_ruleprocessamento2093); 

                            createLeafNode(grammarAccess.getProcessamentoAccess().getProcessaInfoProcessaInfoKeyword_0_0(), "processaInfo"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessamentoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "processaInfo", lv_processaInfo_0_0, "processaInfo();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1159:6: ( (lv_processaImagem_1_0= 'processaImagem();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1159:6: ( (lv_processaImagem_1_0= 'processaImagem();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1160:1: (lv_processaImagem_1_0= 'processaImagem();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1160:1: (lv_processaImagem_1_0= 'processaImagem();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1161:3: lv_processaImagem_1_0= 'processaImagem();'
                    {
                    lv_processaImagem_1_0=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleprocessamento2130); 

                            createLeafNode(grammarAccess.getProcessamentoAccess().getProcessaImagemProcessaImagemKeyword_1_0(), "processaImagem"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessamentoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "processaImagem", lv_processaImagem_1_0, "processaImagem();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleprocessamento


    // $ANTLR start entryRuleacao
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1188:1: entryRuleacao returns [EObject current=null] : iv_ruleacao= ruleacao EOF ;
    public final EObject entryRuleacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleacao = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1189:2: (iv_ruleacao= ruleacao EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1190:2: iv_ruleacao= ruleacao EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAcaoRule(), currentNode); 
            pushFollow(FOLLOW_ruleacao_in_entryRuleacao2179);
            iv_ruleacao=ruleacao();
            _fsp--;

             current =iv_ruleacao; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleacao2189); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleacao


    // $ANTLR start ruleacao
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1197:1: ruleacao returns [EObject current=null] : this_andar_0= ruleandar ;
    public final EObject ruleacao() throws RecognitionException {
        EObject current = null;

        EObject this_andar_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1202:6: (this_andar_0= ruleandar )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1204:5: this_andar_0= ruleandar
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAcaoAccess().getAndarParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleandar_in_ruleacao2235);
            this_andar_0=ruleandar();
            _fsp--;

             
                    current = this_andar_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleacao


    // $ANTLR start entryRulecomportamento
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1220:1: entryRulecomportamento returns [EObject current=null] : iv_rulecomportamento= rulecomportamento EOF ;
    public final EObject entryRulecomportamento() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecomportamento = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1221:2: (iv_rulecomportamento= rulecomportamento EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1222:2: iv_rulecomportamento= rulecomportamento EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComportamentoRule(), currentNode); 
            pushFollow(FOLLOW_rulecomportamento_in_entryRulecomportamento2269);
            iv_rulecomportamento=rulecomportamento();
            _fsp--;

             current =iv_rulecomportamento; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecomportamento2279); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulecomportamento


    // $ANTLR start rulecomportamento
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1229:1: rulecomportamento returns [EObject current=null] : ( ( (lv_defineRegra_0_0= 'defineRegra();' ) ) | ( (lv_defineRegraSeguir_1_0= 'defineRegraSeguir();' ) ) | ( (lv_defineRegraNaoBater_2_0= 'defineRegraNaoBater();' ) ) | ( (lv_defineRegraSeguirMultiplasCoordenadas_3_0= 'defineRegraSeguirMultiplasCoordenadas();' ) ) ) ;
    public final EObject rulecomportamento() throws RecognitionException {
        EObject current = null;

        Token lv_defineRegra_0_0=null;
        Token lv_defineRegraSeguir_1_0=null;
        Token lv_defineRegraNaoBater_2_0=null;
        Token lv_defineRegraSeguirMultiplasCoordenadas_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1234:6: ( ( ( (lv_defineRegra_0_0= 'defineRegra();' ) ) | ( (lv_defineRegraSeguir_1_0= 'defineRegraSeguir();' ) ) | ( (lv_defineRegraNaoBater_2_0= 'defineRegraNaoBater();' ) ) | ( (lv_defineRegraSeguirMultiplasCoordenadas_3_0= 'defineRegraSeguirMultiplasCoordenadas();' ) ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1235:1: ( ( (lv_defineRegra_0_0= 'defineRegra();' ) ) | ( (lv_defineRegraSeguir_1_0= 'defineRegraSeguir();' ) ) | ( (lv_defineRegraNaoBater_2_0= 'defineRegraNaoBater();' ) ) | ( (lv_defineRegraSeguirMultiplasCoordenadas_3_0= 'defineRegraSeguirMultiplasCoordenadas();' ) ) )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1235:1: ( ( (lv_defineRegra_0_0= 'defineRegra();' ) ) | ( (lv_defineRegraSeguir_1_0= 'defineRegraSeguir();' ) ) | ( (lv_defineRegraNaoBater_2_0= 'defineRegraNaoBater();' ) ) | ( (lv_defineRegraSeguirMultiplasCoordenadas_3_0= 'defineRegraSeguirMultiplasCoordenadas();' ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt13=1;
                }
                break;
            case 43:
                {
                alt13=2;
                }
                break;
            case 44:
                {
                alt13=3;
                }
                break;
            case 45:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1235:1: ( ( (lv_defineRegra_0_0= 'defineRegra();' ) ) | ( (lv_defineRegraSeguir_1_0= 'defineRegraSeguir();' ) ) | ( (lv_defineRegraNaoBater_2_0= 'defineRegraNaoBater();' ) ) | ( (lv_defineRegraSeguirMultiplasCoordenadas_3_0= 'defineRegraSeguirMultiplasCoordenadas();' ) ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1235:2: ( (lv_defineRegra_0_0= 'defineRegra();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1235:2: ( (lv_defineRegra_0_0= 'defineRegra();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1236:1: (lv_defineRegra_0_0= 'defineRegra();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1236:1: (lv_defineRegra_0_0= 'defineRegra();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1237:3: lv_defineRegra_0_0= 'defineRegra();'
                    {
                    lv_defineRegra_0_0=(Token)input.LT(1);
                    match(input,42,FOLLOW_42_in_rulecomportamento2322); 

                            createLeafNode(grammarAccess.getComportamentoAccess().getDefineRegraDefineRegraKeyword_0_0(), "defineRegra"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComportamentoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "defineRegra", lv_defineRegra_0_0, "defineRegra();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1257:6: ( (lv_defineRegraSeguir_1_0= 'defineRegraSeguir();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1257:6: ( (lv_defineRegraSeguir_1_0= 'defineRegraSeguir();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1258:1: (lv_defineRegraSeguir_1_0= 'defineRegraSeguir();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1258:1: (lv_defineRegraSeguir_1_0= 'defineRegraSeguir();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1259:3: lv_defineRegraSeguir_1_0= 'defineRegraSeguir();'
                    {
                    lv_defineRegraSeguir_1_0=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_rulecomportamento2359); 

                            createLeafNode(grammarAccess.getComportamentoAccess().getDefineRegraSeguirDefineRegraSeguirKeyword_1_0(), "defineRegraSeguir"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComportamentoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "defineRegraSeguir", lv_defineRegraSeguir_1_0, "defineRegraSeguir();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1279:6: ( (lv_defineRegraNaoBater_2_0= 'defineRegraNaoBater();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1279:6: ( (lv_defineRegraNaoBater_2_0= 'defineRegraNaoBater();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1280:1: (lv_defineRegraNaoBater_2_0= 'defineRegraNaoBater();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1280:1: (lv_defineRegraNaoBater_2_0= 'defineRegraNaoBater();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1281:3: lv_defineRegraNaoBater_2_0= 'defineRegraNaoBater();'
                    {
                    lv_defineRegraNaoBater_2_0=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_rulecomportamento2396); 

                            createLeafNode(grammarAccess.getComportamentoAccess().getDefineRegraNaoBaterDefineRegraNaoBaterKeyword_2_0(), "defineRegraNaoBater"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComportamentoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "defineRegraNaoBater", lv_defineRegraNaoBater_2_0, "defineRegraNaoBater();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1301:6: ( (lv_defineRegraSeguirMultiplasCoordenadas_3_0= 'defineRegraSeguirMultiplasCoordenadas();' ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1301:6: ( (lv_defineRegraSeguirMultiplasCoordenadas_3_0= 'defineRegraSeguirMultiplasCoordenadas();' ) )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1302:1: (lv_defineRegraSeguirMultiplasCoordenadas_3_0= 'defineRegraSeguirMultiplasCoordenadas();' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1302:1: (lv_defineRegraSeguirMultiplasCoordenadas_3_0= 'defineRegraSeguirMultiplasCoordenadas();' )
                    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1303:3: lv_defineRegraSeguirMultiplasCoordenadas_3_0= 'defineRegraSeguirMultiplasCoordenadas();'
                    {
                    lv_defineRegraSeguirMultiplasCoordenadas_3_0=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_rulecomportamento2433); 

                            createLeafNode(grammarAccess.getComportamentoAccess().getDefineRegraSeguirMultiplasCoordenadasDefineRegraSeguirMultiplasCoordenadasKeyword_3_0(), "defineRegraSeguirMultiplasCoordenadas"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComportamentoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "defineRegraSeguirMultiplasCoordenadas", lv_defineRegraSeguirMultiplasCoordenadas_3_0, "defineRegraSeguirMultiplasCoordenadas();", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulecomportamento


    // $ANTLR start entryRuleandar
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1330:1: entryRuleandar returns [EObject current=null] : iv_ruleandar= ruleandar EOF ;
    public final EObject entryRuleandar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleandar = null;


        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1331:2: (iv_ruleandar= ruleandar EOF )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1332:2: iv_ruleandar= ruleandar EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndarRule(), currentNode); 
            pushFollow(FOLLOW_ruleandar_in_entryRuleandar2482);
            iv_ruleandar=ruleandar();
            _fsp--;

             current =iv_ruleandar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleandar2492); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleandar


    // $ANTLR start ruleandar
    // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1339:1: ruleandar returns [EObject current=null] : ( (lv_andar_0_0= 'andar();' ) ) ;
    public final EObject ruleandar() throws RecognitionException {
        EObject current = null;

        Token lv_andar_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1344:6: ( ( (lv_andar_0_0= 'andar();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1345:1: ( (lv_andar_0_0= 'andar();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1345:1: ( (lv_andar_0_0= 'andar();' ) )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1346:1: (lv_andar_0_0= 'andar();' )
            {
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1346:1: (lv_andar_0_0= 'andar();' )
            // ../org.xtext.lrm.multiplosdestinos/src-gen/org/xtext/lrm/parser/antlr/internal/InternalMultiplosdestinos.g:1347:3: lv_andar_0_0= 'andar();'
            {
            lv_andar_0_0=(Token)input.LT(1);
            match(input,46,FOLLOW_46_in_ruleandar2534); 

                    createLeafNode(grammarAccess.getAndarAccess().getAndarAndarKeyword_0(), "andar"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAndarRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "andar", lv_andar_0_0, "andar();", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleandar


 

    public static final BitSet FOLLOW_ruleModeloRobo_in_entryRuleModeloRobo75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModeloRobo85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlataforma_in_ruleModeloRobo131 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleModeloRobo141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModeloRobo158 = new BitSet(new long[]{0x0000000004490000L});
    public static final BitSet FOLLOW_ruleCabecalho_in_ruleModeloRobo184 = new BitSet(new long[]{0x0000000004490000L});
    public static final BitSet FOLLOW_rulePacote_in_ruleModeloRobo206 = new BitSet(new long[]{0x0000000004480000L});
    public static final BitSet FOLLOW_ruleSensor_in_ruleModeloRobo228 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_ruleMain_in_ruleModeloRobo250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlataforma_in_entryRulePlataforma286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlataforma296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePlataforma331 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rulenomeDaPlataforma_in_rulePlataforma353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenomeDaPlataforma_in_entryRulenomeDaPlataforma388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenomeDaPlataforma398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulenomeDaPlataforma442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulenomeDaPlataforma471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulenomeDaPlataforma500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCabecalho_in_entryRuleCabecalho551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCabecalho561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleCabecalho596 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleCabecalho616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCabecalho645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePacote_in_entryRulePacote697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePacote707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePacote742 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_rulePacote762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePacote791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensor_in_entryRuleSensor843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensor853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSensor888 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_ruleTipoSensor_in_ruleSensor909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTipoSensor_in_entryRuleTipoSensor946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTipoSensor957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTipoSensor995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTipoSensor1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTipoSensor1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain1073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMain1118 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMain1128 = new BitSet(new long[]{0x0000000FA0000000L});
    public static final BitSet FOLLOW_ruleloop_in_ruleMain1150 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMain1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleloop_in_entryRuleloop1195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleloop1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinicializacaoSensor_in_ruleloop1251 = new BitSet(new long[]{0x0000000FA0000000L});
    public static final BitSet FOLLOW_rulewhile_in_ruleloop1273 = new BitSet(new long[]{0x00007FF410000000L});
    public static final BitSet FOLLOW_ruleentrada_in_ruleloop1295 = new BitSet(new long[]{0x00007FF410000000L});
    public static final BitSet FOLLOW_ruleprocessamento_in_ruleloop1322 = new BitSet(new long[]{0x00007FF410000000L});
    public static final BitSet FOLLOW_rulecomportamento_in_ruleloop1349 = new BitSet(new long[]{0x00007FF410000000L});
    public static final BitSet FOLLOW_ruleacao_in_ruleloop1376 = new BitSet(new long[]{0x00007FF410000000L});
    public static final BitSet FOLLOW_28_in_ruleloop1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_in_entryRulewhile1425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulewhile1474 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulewhile1487 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulewhile1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinicializacaoSensor_in_entryRuleinicializacaoSensor1540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinicializacaoSensor1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleinicializacaoSensor1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleinicializacaoSensor1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleinicializacaoSensor1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleinicializacaoSensor1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleinicializacaoSensor1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentrada_in_entryRuleentrada1790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleentrada1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleentrada1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleentrada1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleentrada1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleentrada1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleentrada1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocessamento_in_entryRuleprocessamento2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocessamento2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleprocessamento2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleprocessamento2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleacao_in_entryRuleacao2179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleacao2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandar_in_ruleacao2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomportamento_in_entryRulecomportamento2269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecomportamento2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulecomportamento2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulecomportamento2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulecomportamento2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulecomportamento2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandar_in_entryRuleandar2482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleandar2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleandar2534 = new BitSet(new long[]{0x0000000000000002L});

}
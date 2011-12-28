package org.xtext.lrm.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.lrm.services.MultiplosdestinosGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMultiplosdestinosParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pionner'", "'srv'", "'golfe'", "'defines'", "'includes'", "'player;'", "'localizacao;'", "'gps'", "'bussola'", "'camera'", "'robo'", "'plataforma'", "'adicionar'", "'importar pacote'", "'criarSensor'", "'int main()'", "'{'", "'}'", "'while'", "'(true)'", "'gps.ligar();'", "'bussola.ligar();'", "'camera.ligar();'", "'carregarListaCoordenadas();'", "'inicializarPlayer();'", "'gps.ler();'", "'bussola.ler();'", "'camera.ler();'", "'receberCoordenada();'", "'processaInfo();'", "'processaImagem();'", "'defineRegra();'", "'defineRegraSeguir();'", "'defineRegraNaoBater();'", "'defineRegraSeguirMultiplasCoordenadas();'", "'andar();'"
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
    public String getGrammarFileName() { return "../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g"; }


     
     	private MultiplosdestinosGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MultiplosdestinosGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleModeloRobo
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:61:1: entryRuleModeloRobo : ruleModeloRobo EOF ;
    public final void entryRuleModeloRobo() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:62:1: ( ruleModeloRobo EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:63:1: ruleModeloRobo EOF
            {
             before(grammarAccess.getModeloRoboRule()); 
            pushFollow(FOLLOW_ruleModeloRobo_in_entryRuleModeloRobo61);
            ruleModeloRobo();
            _fsp--;

             after(grammarAccess.getModeloRoboRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModeloRobo68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleModeloRobo


    // $ANTLR start ruleModeloRobo
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:70:1: ruleModeloRobo : ( ( rule__ModeloRobo__Group__0 ) ) ;
    public final void ruleModeloRobo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:74:2: ( ( ( rule__ModeloRobo__Group__0 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:75:1: ( ( rule__ModeloRobo__Group__0 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:75:1: ( ( rule__ModeloRobo__Group__0 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:76:1: ( rule__ModeloRobo__Group__0 )
            {
             before(grammarAccess.getModeloRoboAccess().getGroup()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:77:1: ( rule__ModeloRobo__Group__0 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:77:2: rule__ModeloRobo__Group__0
            {
            pushFollow(FOLLOW_rule__ModeloRobo__Group__0_in_ruleModeloRobo94);
            rule__ModeloRobo__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModeloRoboAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModeloRobo


    // $ANTLR start entryRulePlataforma
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:89:1: entryRulePlataforma : rulePlataforma EOF ;
    public final void entryRulePlataforma() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:90:1: ( rulePlataforma EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:91:1: rulePlataforma EOF
            {
             before(grammarAccess.getPlataformaRule()); 
            pushFollow(FOLLOW_rulePlataforma_in_entryRulePlataforma121);
            rulePlataforma();
            _fsp--;

             after(grammarAccess.getPlataformaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlataforma128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePlataforma


    // $ANTLR start rulePlataforma
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:98:1: rulePlataforma : ( ( rule__Plataforma__Group__0 ) ) ;
    public final void rulePlataforma() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:102:2: ( ( ( rule__Plataforma__Group__0 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:103:1: ( ( rule__Plataforma__Group__0 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:103:1: ( ( rule__Plataforma__Group__0 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:104:1: ( rule__Plataforma__Group__0 )
            {
             before(grammarAccess.getPlataformaAccess().getGroup()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:105:1: ( rule__Plataforma__Group__0 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:105:2: rule__Plataforma__Group__0
            {
            pushFollow(FOLLOW_rule__Plataforma__Group__0_in_rulePlataforma154);
            rule__Plataforma__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPlataformaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePlataforma


    // $ANTLR start entryRulenomeDaPlataforma
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:117:1: entryRulenomeDaPlataforma : rulenomeDaPlataforma EOF ;
    public final void entryRulenomeDaPlataforma() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:118:1: ( rulenomeDaPlataforma EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:119:1: rulenomeDaPlataforma EOF
            {
             before(grammarAccess.getNomeDaPlataformaRule()); 
            pushFollow(FOLLOW_rulenomeDaPlataforma_in_entryRulenomeDaPlataforma181);
            rulenomeDaPlataforma();
            _fsp--;

             after(grammarAccess.getNomeDaPlataformaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenomeDaPlataforma188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulenomeDaPlataforma


    // $ANTLR start rulenomeDaPlataforma
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:126:1: rulenomeDaPlataforma : ( ( rule__NomeDaPlataforma__PlatAssignment ) ) ;
    public final void rulenomeDaPlataforma() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:130:2: ( ( ( rule__NomeDaPlataforma__PlatAssignment ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:131:1: ( ( rule__NomeDaPlataforma__PlatAssignment ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:131:1: ( ( rule__NomeDaPlataforma__PlatAssignment ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:132:1: ( rule__NomeDaPlataforma__PlatAssignment )
            {
             before(grammarAccess.getNomeDaPlataformaAccess().getPlatAssignment()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:133:1: ( rule__NomeDaPlataforma__PlatAssignment )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:133:2: rule__NomeDaPlataforma__PlatAssignment
            {
            pushFollow(FOLLOW_rule__NomeDaPlataforma__PlatAssignment_in_rulenomeDaPlataforma214);
            rule__NomeDaPlataforma__PlatAssignment();
            _fsp--;


            }

             after(grammarAccess.getNomeDaPlataformaAccess().getPlatAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulenomeDaPlataforma


    // $ANTLR start entryRuleCabecalho
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:145:1: entryRuleCabecalho : ruleCabecalho EOF ;
    public final void entryRuleCabecalho() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:146:1: ( ruleCabecalho EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:147:1: ruleCabecalho EOF
            {
             before(grammarAccess.getCabecalhoRule()); 
            pushFollow(FOLLOW_ruleCabecalho_in_entryRuleCabecalho241);
            ruleCabecalho();
            _fsp--;

             after(grammarAccess.getCabecalhoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCabecalho248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCabecalho


    // $ANTLR start ruleCabecalho
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:154:1: ruleCabecalho : ( ( rule__Cabecalho__Group__0 ) ) ;
    public final void ruleCabecalho() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:158:2: ( ( ( rule__Cabecalho__Group__0 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:159:1: ( ( rule__Cabecalho__Group__0 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:159:1: ( ( rule__Cabecalho__Group__0 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:160:1: ( rule__Cabecalho__Group__0 )
            {
             before(grammarAccess.getCabecalhoAccess().getGroup()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:161:1: ( rule__Cabecalho__Group__0 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:161:2: rule__Cabecalho__Group__0
            {
            pushFollow(FOLLOW_rule__Cabecalho__Group__0_in_ruleCabecalho274);
            rule__Cabecalho__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCabecalhoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCabecalho


    // $ANTLR start entryRulePacote
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:173:1: entryRulePacote : rulePacote EOF ;
    public final void entryRulePacote() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:174:1: ( rulePacote EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:175:1: rulePacote EOF
            {
             before(grammarAccess.getPacoteRule()); 
            pushFollow(FOLLOW_rulePacote_in_entryRulePacote301);
            rulePacote();
            _fsp--;

             after(grammarAccess.getPacoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePacote308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePacote


    // $ANTLR start rulePacote
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:182:1: rulePacote : ( ( rule__Pacote__Group__0 ) ) ;
    public final void rulePacote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:186:2: ( ( ( rule__Pacote__Group__0 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:187:1: ( ( rule__Pacote__Group__0 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:187:1: ( ( rule__Pacote__Group__0 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:188:1: ( rule__Pacote__Group__0 )
            {
             before(grammarAccess.getPacoteAccess().getGroup()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:189:1: ( rule__Pacote__Group__0 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:189:2: rule__Pacote__Group__0
            {
            pushFollow(FOLLOW_rule__Pacote__Group__0_in_rulePacote334);
            rule__Pacote__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPacoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePacote


    // $ANTLR start entryRuleSensor
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:201:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:202:1: ( ruleSensor EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:203:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_ruleSensor_in_entryRuleSensor361);
            ruleSensor();
            _fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensor368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSensor


    // $ANTLR start ruleSensor
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:210:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:214:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:215:1: ( ( rule__Sensor__Group__0 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:215:1: ( ( rule__Sensor__Group__0 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:216:1: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:217:1: ( rule__Sensor__Group__0 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:217:2: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_rule__Sensor__Group__0_in_ruleSensor394);
            rule__Sensor__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSensor


    // $ANTLR start entryRuleTipoSensor
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:229:1: entryRuleTipoSensor : ruleTipoSensor EOF ;
    public final void entryRuleTipoSensor() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:230:1: ( ruleTipoSensor EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:231:1: ruleTipoSensor EOF
            {
             before(grammarAccess.getTipoSensorRule()); 
            pushFollow(FOLLOW_ruleTipoSensor_in_entryRuleTipoSensor421);
            ruleTipoSensor();
            _fsp--;

             after(grammarAccess.getTipoSensorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTipoSensor428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTipoSensor


    // $ANTLR start ruleTipoSensor
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:238:1: ruleTipoSensor : ( ( rule__TipoSensor__Alternatives ) ) ;
    public final void ruleTipoSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:242:2: ( ( ( rule__TipoSensor__Alternatives ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:243:1: ( ( rule__TipoSensor__Alternatives ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:243:1: ( ( rule__TipoSensor__Alternatives ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:244:1: ( rule__TipoSensor__Alternatives )
            {
             before(grammarAccess.getTipoSensorAccess().getAlternatives()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:245:1: ( rule__TipoSensor__Alternatives )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:245:2: rule__TipoSensor__Alternatives
            {
            pushFollow(FOLLOW_rule__TipoSensor__Alternatives_in_ruleTipoSensor454);
            rule__TipoSensor__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTipoSensorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTipoSensor


    // $ANTLR start entryRuleMain
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:257:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:258:1: ( ruleMain EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:259:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain481);
            ruleMain();
            _fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMain


    // $ANTLR start ruleMain
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:266:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:270:2: ( ( ( rule__Main__Group__0 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:271:1: ( ( rule__Main__Group__0 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:271:1: ( ( rule__Main__Group__0 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:272:1: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:273:1: ( rule__Main__Group__0 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:273:2: rule__Main__Group__0
            {
            pushFollow(FOLLOW_rule__Main__Group__0_in_ruleMain514);
            rule__Main__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMain


    // $ANTLR start entryRuleloop
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:285:1: entryRuleloop : ruleloop EOF ;
    public final void entryRuleloop() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:286:1: ( ruleloop EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:287:1: ruleloop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_ruleloop_in_entryRuleloop541);
            ruleloop();
            _fsp--;

             after(grammarAccess.getLoopRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleloop548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleloop


    // $ANTLR start ruleloop
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:294:1: ruleloop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleloop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:298:2: ( ( ( rule__Loop__Group__0 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:299:1: ( ( rule__Loop__Group__0 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:299:1: ( ( rule__Loop__Group__0 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:300:1: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:301:1: ( rule__Loop__Group__0 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:301:2: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_rule__Loop__Group__0_in_ruleloop574);
            rule__Loop__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleloop


    // $ANTLR start entryRulewhile
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:313:1: entryRulewhile : rulewhile EOF ;
    public final void entryRulewhile() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:314:1: ( rulewhile EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:315:1: rulewhile EOF
            {
             before(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_rulewhile_in_entryRulewhile601);
            rulewhile();
            _fsp--;

             after(grammarAccess.getWhileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulewhile


    // $ANTLR start rulewhile
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:322:1: rulewhile : ( ( rule__While__Group__0 ) ) ;
    public final void rulewhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:326:2: ( ( ( rule__While__Group__0 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:327:1: ( ( rule__While__Group__0 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:327:1: ( ( rule__While__Group__0 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:328:1: ( rule__While__Group__0 )
            {
             before(grammarAccess.getWhileAccess().getGroup()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:329:1: ( rule__While__Group__0 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:329:2: rule__While__Group__0
            {
            pushFollow(FOLLOW_rule__While__Group__0_in_rulewhile634);
            rule__While__Group__0();
            _fsp--;


            }

             after(grammarAccess.getWhileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulewhile


    // $ANTLR start entryRuleinicializacaoSensor
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:341:1: entryRuleinicializacaoSensor : ruleinicializacaoSensor EOF ;
    public final void entryRuleinicializacaoSensor() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:342:1: ( ruleinicializacaoSensor EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:343:1: ruleinicializacaoSensor EOF
            {
             before(grammarAccess.getInicializacaoSensorRule()); 
            pushFollow(FOLLOW_ruleinicializacaoSensor_in_entryRuleinicializacaoSensor661);
            ruleinicializacaoSensor();
            _fsp--;

             after(grammarAccess.getInicializacaoSensorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinicializacaoSensor668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleinicializacaoSensor


    // $ANTLR start ruleinicializacaoSensor
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:350:1: ruleinicializacaoSensor : ( ( rule__InicializacaoSensor__Alternatives ) ) ;
    public final void ruleinicializacaoSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:354:2: ( ( ( rule__InicializacaoSensor__Alternatives ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:355:1: ( ( rule__InicializacaoSensor__Alternatives ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:355:1: ( ( rule__InicializacaoSensor__Alternatives ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:356:1: ( rule__InicializacaoSensor__Alternatives )
            {
             before(grammarAccess.getInicializacaoSensorAccess().getAlternatives()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:357:1: ( rule__InicializacaoSensor__Alternatives )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:357:2: rule__InicializacaoSensor__Alternatives
            {
            pushFollow(FOLLOW_rule__InicializacaoSensor__Alternatives_in_ruleinicializacaoSensor694);
            rule__InicializacaoSensor__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getInicializacaoSensorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleinicializacaoSensor


    // $ANTLR start entryRuleentrada
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:369:1: entryRuleentrada : ruleentrada EOF ;
    public final void entryRuleentrada() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:370:1: ( ruleentrada EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:371:1: ruleentrada EOF
            {
             before(grammarAccess.getEntradaRule()); 
            pushFollow(FOLLOW_ruleentrada_in_entryRuleentrada721);
            ruleentrada();
            _fsp--;

             after(grammarAccess.getEntradaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleentrada728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleentrada


    // $ANTLR start ruleentrada
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:378:1: ruleentrada : ( ( rule__Entrada__Alternatives ) ) ;
    public final void ruleentrada() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:382:2: ( ( ( rule__Entrada__Alternatives ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:383:1: ( ( rule__Entrada__Alternatives ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:383:1: ( ( rule__Entrada__Alternatives ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:384:1: ( rule__Entrada__Alternatives )
            {
             before(grammarAccess.getEntradaAccess().getAlternatives()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:385:1: ( rule__Entrada__Alternatives )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:385:2: rule__Entrada__Alternatives
            {
            pushFollow(FOLLOW_rule__Entrada__Alternatives_in_ruleentrada754);
            rule__Entrada__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getEntradaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleentrada


    // $ANTLR start entryRuleprocessamento
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:397:1: entryRuleprocessamento : ruleprocessamento EOF ;
    public final void entryRuleprocessamento() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:398:1: ( ruleprocessamento EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:399:1: ruleprocessamento EOF
            {
             before(grammarAccess.getProcessamentoRule()); 
            pushFollow(FOLLOW_ruleprocessamento_in_entryRuleprocessamento781);
            ruleprocessamento();
            _fsp--;

             after(grammarAccess.getProcessamentoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocessamento788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleprocessamento


    // $ANTLR start ruleprocessamento
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:406:1: ruleprocessamento : ( ( rule__Processamento__Alternatives ) ) ;
    public final void ruleprocessamento() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:410:2: ( ( ( rule__Processamento__Alternatives ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:411:1: ( ( rule__Processamento__Alternatives ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:411:1: ( ( rule__Processamento__Alternatives ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:412:1: ( rule__Processamento__Alternatives )
            {
             before(grammarAccess.getProcessamentoAccess().getAlternatives()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:413:1: ( rule__Processamento__Alternatives )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:413:2: rule__Processamento__Alternatives
            {
            pushFollow(FOLLOW_rule__Processamento__Alternatives_in_ruleprocessamento814);
            rule__Processamento__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getProcessamentoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleprocessamento


    // $ANTLR start entryRuleacao
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:425:1: entryRuleacao : ruleacao EOF ;
    public final void entryRuleacao() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:426:1: ( ruleacao EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:427:1: ruleacao EOF
            {
             before(grammarAccess.getAcaoRule()); 
            pushFollow(FOLLOW_ruleacao_in_entryRuleacao841);
            ruleacao();
            _fsp--;

             after(grammarAccess.getAcaoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleacao848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleacao


    // $ANTLR start ruleacao
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:434:1: ruleacao : ( ruleandar ) ;
    public final void ruleacao() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:438:2: ( ( ruleandar ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:439:1: ( ruleandar )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:439:1: ( ruleandar )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:440:1: ruleandar
            {
             before(grammarAccess.getAcaoAccess().getAndarParserRuleCall()); 
            pushFollow(FOLLOW_ruleandar_in_ruleacao874);
            ruleandar();
            _fsp--;

             after(grammarAccess.getAcaoAccess().getAndarParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleacao


    // $ANTLR start entryRulecomportamento
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:453:1: entryRulecomportamento : rulecomportamento EOF ;
    public final void entryRulecomportamento() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:454:1: ( rulecomportamento EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:455:1: rulecomportamento EOF
            {
             before(grammarAccess.getComportamentoRule()); 
            pushFollow(FOLLOW_rulecomportamento_in_entryRulecomportamento900);
            rulecomportamento();
            _fsp--;

             after(grammarAccess.getComportamentoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecomportamento907); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulecomportamento


    // $ANTLR start rulecomportamento
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:462:1: rulecomportamento : ( ( rule__Comportamento__Alternatives ) ) ;
    public final void rulecomportamento() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:466:2: ( ( ( rule__Comportamento__Alternatives ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:467:1: ( ( rule__Comportamento__Alternatives ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:467:1: ( ( rule__Comportamento__Alternatives ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:468:1: ( rule__Comportamento__Alternatives )
            {
             before(grammarAccess.getComportamentoAccess().getAlternatives()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:469:1: ( rule__Comportamento__Alternatives )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:469:2: rule__Comportamento__Alternatives
            {
            pushFollow(FOLLOW_rule__Comportamento__Alternatives_in_rulecomportamento933);
            rule__Comportamento__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getComportamentoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulecomportamento


    // $ANTLR start entryRuleandar
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:481:1: entryRuleandar : ruleandar EOF ;
    public final void entryRuleandar() throws RecognitionException {
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:482:1: ( ruleandar EOF )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:483:1: ruleandar EOF
            {
             before(grammarAccess.getAndarRule()); 
            pushFollow(FOLLOW_ruleandar_in_entryRuleandar960);
            ruleandar();
            _fsp--;

             after(grammarAccess.getAndarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleandar967); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleandar


    // $ANTLR start ruleandar
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:490:1: ruleandar : ( ( rule__Andar__AndarAssignment ) ) ;
    public final void ruleandar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:494:2: ( ( ( rule__Andar__AndarAssignment ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:495:1: ( ( rule__Andar__AndarAssignment ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:495:1: ( ( rule__Andar__AndarAssignment ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:496:1: ( rule__Andar__AndarAssignment )
            {
             before(grammarAccess.getAndarAccess().getAndarAssignment()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:497:1: ( rule__Andar__AndarAssignment )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:497:2: rule__Andar__AndarAssignment
            {
            pushFollow(FOLLOW_rule__Andar__AndarAssignment_in_ruleandar993);
            rule__Andar__AndarAssignment();
            _fsp--;


            }

             after(grammarAccess.getAndarAccess().getAndarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleandar


    // $ANTLR start rule__NomeDaPlataforma__PlatAlternatives_0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:509:1: rule__NomeDaPlataforma__PlatAlternatives_0 : ( ( 'pionner' ) | ( 'srv' ) | ( 'golfe' ) );
    public final void rule__NomeDaPlataforma__PlatAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:513:1: ( ( 'pionner' ) | ( 'srv' ) | ( 'golfe' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("509:1: rule__NomeDaPlataforma__PlatAlternatives_0 : ( ( 'pionner' ) | ( 'srv' ) | ( 'golfe' ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:514:1: ( 'pionner' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:514:1: ( 'pionner' )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:515:1: 'pionner'
                    {
                     before(grammarAccess.getNomeDaPlataformaAccess().getPlatPionnerKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__NomeDaPlataforma__PlatAlternatives_01030); 
                     after(grammarAccess.getNomeDaPlataformaAccess().getPlatPionnerKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:522:6: ( 'srv' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:522:6: ( 'srv' )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:523:1: 'srv'
                    {
                     before(grammarAccess.getNomeDaPlataformaAccess().getPlatSrvKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__NomeDaPlataforma__PlatAlternatives_01050); 
                     after(grammarAccess.getNomeDaPlataformaAccess().getPlatSrvKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:530:6: ( 'golfe' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:530:6: ( 'golfe' )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:531:1: 'golfe'
                    {
                     before(grammarAccess.getNomeDaPlataformaAccess().getPlatGolfeKeyword_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__NomeDaPlataforma__PlatAlternatives_01070); 
                     after(grammarAccess.getNomeDaPlataformaAccess().getPlatGolfeKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NomeDaPlataforma__PlatAlternatives_0


    // $ANTLR start rule__Cabecalho__ItensCabecalhoAlternatives_1_0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:543:1: rule__Cabecalho__ItensCabecalhoAlternatives_1_0 : ( ( 'defines' ) | ( 'includes' ) );
    public final void rule__Cabecalho__ItensCabecalhoAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:547:1: ( ( 'defines' ) | ( 'includes' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("543:1: rule__Cabecalho__ItensCabecalhoAlternatives_1_0 : ( ( 'defines' ) | ( 'includes' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:548:1: ( 'defines' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:548:1: ( 'defines' )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:549:1: 'defines'
                    {
                     before(grammarAccess.getCabecalhoAccess().getItensCabecalhoDefinesKeyword_1_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Cabecalho__ItensCabecalhoAlternatives_1_01105); 
                     after(grammarAccess.getCabecalhoAccess().getItensCabecalhoDefinesKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:556:6: ( 'includes' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:556:6: ( 'includes' )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:557:1: 'includes'
                    {
                     before(grammarAccess.getCabecalhoAccess().getItensCabecalhoIncludesKeyword_1_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Cabecalho__ItensCabecalhoAlternatives_1_01125); 
                     after(grammarAccess.getCabecalhoAccess().getItensCabecalhoIncludesKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Cabecalho__ItensCabecalhoAlternatives_1_0


    // $ANTLR start rule__Pacote__TipoAlternatives_1_0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:569:1: rule__Pacote__TipoAlternatives_1_0 : ( ( 'player;' ) | ( 'localizacao;' ) );
    public final void rule__Pacote__TipoAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:573:1: ( ( 'player;' ) | ( 'localizacao;' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("569:1: rule__Pacote__TipoAlternatives_1_0 : ( ( 'player;' ) | ( 'localizacao;' ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:574:1: ( 'player;' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:574:1: ( 'player;' )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:575:1: 'player;'
                    {
                     before(grammarAccess.getPacoteAccess().getTipoPlayerKeyword_1_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Pacote__TipoAlternatives_1_01160); 
                     after(grammarAccess.getPacoteAccess().getTipoPlayerKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:582:6: ( 'localizacao;' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:582:6: ( 'localizacao;' )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:583:1: 'localizacao;'
                    {
                     before(grammarAccess.getPacoteAccess().getTipoLocalizacaoKeyword_1_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Pacote__TipoAlternatives_1_01180); 
                     after(grammarAccess.getPacoteAccess().getTipoLocalizacaoKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Pacote__TipoAlternatives_1_0


    // $ANTLR start rule__TipoSensor__Alternatives
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:595:1: rule__TipoSensor__Alternatives : ( ( 'gps' ) | ( 'bussola' ) | ( 'camera' ) );
    public final void rule__TipoSensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:599:1: ( ( 'gps' ) | ( 'bussola' ) | ( 'camera' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("595:1: rule__TipoSensor__Alternatives : ( ( 'gps' ) | ( 'bussola' ) | ( 'camera' ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:600:1: ( 'gps' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:600:1: ( 'gps' )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:601:1: 'gps'
                    {
                     before(grammarAccess.getTipoSensorAccess().getGpsKeyword_0()); 
                    match(input,18,FOLLOW_18_in_rule__TipoSensor__Alternatives1215); 
                     after(grammarAccess.getTipoSensorAccess().getGpsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:608:6: ( 'bussola' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:608:6: ( 'bussola' )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:609:1: 'bussola'
                    {
                     before(grammarAccess.getTipoSensorAccess().getBussolaKeyword_1()); 
                    match(input,19,FOLLOW_19_in_rule__TipoSensor__Alternatives1235); 
                     after(grammarAccess.getTipoSensorAccess().getBussolaKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:616:6: ( 'camera' )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:616:6: ( 'camera' )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:617:1: 'camera'
                    {
                     before(grammarAccess.getTipoSensorAccess().getCameraKeyword_2()); 
                    match(input,20,FOLLOW_20_in_rule__TipoSensor__Alternatives1255); 
                     after(grammarAccess.getTipoSensorAccess().getCameraKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TipoSensor__Alternatives


    // $ANTLR start rule__Loop__Alternatives_2
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:629:1: rule__Loop__Alternatives_2 : ( ( ( rule__Loop__EnAssignment_2_0 ) ) | ( ( rule__Loop__ProcAssignment_2_1 ) ) | ( ( rule__Loop__CompAssignment_2_2 ) ) | ( ( rule__Loop__AcAssignment_2_3 ) ) );
    public final void rule__Loop__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:633:1: ( ( ( rule__Loop__EnAssignment_2_0 ) ) | ( ( rule__Loop__ProcAssignment_2_1 ) ) | ( ( rule__Loop__CompAssignment_2_2 ) ) | ( ( rule__Loop__AcAssignment_2_3 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 34:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt5=1;
                }
                break;
            case 40:
            case 41:
                {
                alt5=2;
                }
                break;
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt5=3;
                }
                break;
            case 46:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("629:1: rule__Loop__Alternatives_2 : ( ( ( rule__Loop__EnAssignment_2_0 ) ) | ( ( rule__Loop__ProcAssignment_2_1 ) ) | ( ( rule__Loop__CompAssignment_2_2 ) ) | ( ( rule__Loop__AcAssignment_2_3 ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:634:1: ( ( rule__Loop__EnAssignment_2_0 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:634:1: ( ( rule__Loop__EnAssignment_2_0 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:635:1: ( rule__Loop__EnAssignment_2_0 )
                    {
                     before(grammarAccess.getLoopAccess().getEnAssignment_2_0()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:636:1: ( rule__Loop__EnAssignment_2_0 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:636:2: rule__Loop__EnAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Loop__EnAssignment_2_0_in_rule__Loop__Alternatives_21289);
                    rule__Loop__EnAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getLoopAccess().getEnAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:640:6: ( ( rule__Loop__ProcAssignment_2_1 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:640:6: ( ( rule__Loop__ProcAssignment_2_1 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:641:1: ( rule__Loop__ProcAssignment_2_1 )
                    {
                     before(grammarAccess.getLoopAccess().getProcAssignment_2_1()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:642:1: ( rule__Loop__ProcAssignment_2_1 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:642:2: rule__Loop__ProcAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Loop__ProcAssignment_2_1_in_rule__Loop__Alternatives_21307);
                    rule__Loop__ProcAssignment_2_1();
                    _fsp--;


                    }

                     after(grammarAccess.getLoopAccess().getProcAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:646:6: ( ( rule__Loop__CompAssignment_2_2 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:646:6: ( ( rule__Loop__CompAssignment_2_2 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:647:1: ( rule__Loop__CompAssignment_2_2 )
                    {
                     before(grammarAccess.getLoopAccess().getCompAssignment_2_2()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:648:1: ( rule__Loop__CompAssignment_2_2 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:648:2: rule__Loop__CompAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__Loop__CompAssignment_2_2_in_rule__Loop__Alternatives_21325);
                    rule__Loop__CompAssignment_2_2();
                    _fsp--;


                    }

                     after(grammarAccess.getLoopAccess().getCompAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:652:6: ( ( rule__Loop__AcAssignment_2_3 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:652:6: ( ( rule__Loop__AcAssignment_2_3 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:653:1: ( rule__Loop__AcAssignment_2_3 )
                    {
                     before(grammarAccess.getLoopAccess().getAcAssignment_2_3()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:654:1: ( rule__Loop__AcAssignment_2_3 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:654:2: rule__Loop__AcAssignment_2_3
                    {
                    pushFollow(FOLLOW_rule__Loop__AcAssignment_2_3_in_rule__Loop__Alternatives_21343);
                    rule__Loop__AcAssignment_2_3();
                    _fsp--;


                    }

                     after(grammarAccess.getLoopAccess().getAcAssignment_2_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Loop__Alternatives_2


    // $ANTLR start rule__InicializacaoSensor__Alternatives
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:663:1: rule__InicializacaoSensor__Alternatives : ( ( ( rule__InicializacaoSensor__GpsLigarAssignment_0 ) ) | ( ( rule__InicializacaoSensor__BussolaLigarAssignment_1 ) ) | ( ( rule__InicializacaoSensor__CameraLigarAssignment_2 ) ) | ( ( rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_3 ) ) | ( ( rule__InicializacaoSensor__InicializarPlayerAssignment_4 ) ) );
    public final void rule__InicializacaoSensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:667:1: ( ( ( rule__InicializacaoSensor__GpsLigarAssignment_0 ) ) | ( ( rule__InicializacaoSensor__BussolaLigarAssignment_1 ) ) | ( ( rule__InicializacaoSensor__CameraLigarAssignment_2 ) ) | ( ( rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_3 ) ) | ( ( rule__InicializacaoSensor__InicializarPlayerAssignment_4 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt6=1;
                }
                break;
            case 32:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            case 34:
                {
                alt6=4;
                }
                break;
            case 35:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("663:1: rule__InicializacaoSensor__Alternatives : ( ( ( rule__InicializacaoSensor__GpsLigarAssignment_0 ) ) | ( ( rule__InicializacaoSensor__BussolaLigarAssignment_1 ) ) | ( ( rule__InicializacaoSensor__CameraLigarAssignment_2 ) ) | ( ( rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_3 ) ) | ( ( rule__InicializacaoSensor__InicializarPlayerAssignment_4 ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:668:1: ( ( rule__InicializacaoSensor__GpsLigarAssignment_0 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:668:1: ( ( rule__InicializacaoSensor__GpsLigarAssignment_0 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:669:1: ( rule__InicializacaoSensor__GpsLigarAssignment_0 )
                    {
                     before(grammarAccess.getInicializacaoSensorAccess().getGpsLigarAssignment_0()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:670:1: ( rule__InicializacaoSensor__GpsLigarAssignment_0 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:670:2: rule__InicializacaoSensor__GpsLigarAssignment_0
                    {
                    pushFollow(FOLLOW_rule__InicializacaoSensor__GpsLigarAssignment_0_in_rule__InicializacaoSensor__Alternatives1376);
                    rule__InicializacaoSensor__GpsLigarAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getInicializacaoSensorAccess().getGpsLigarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:674:6: ( ( rule__InicializacaoSensor__BussolaLigarAssignment_1 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:674:6: ( ( rule__InicializacaoSensor__BussolaLigarAssignment_1 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:675:1: ( rule__InicializacaoSensor__BussolaLigarAssignment_1 )
                    {
                     before(grammarAccess.getInicializacaoSensorAccess().getBussolaLigarAssignment_1()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:676:1: ( rule__InicializacaoSensor__BussolaLigarAssignment_1 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:676:2: rule__InicializacaoSensor__BussolaLigarAssignment_1
                    {
                    pushFollow(FOLLOW_rule__InicializacaoSensor__BussolaLigarAssignment_1_in_rule__InicializacaoSensor__Alternatives1394);
                    rule__InicializacaoSensor__BussolaLigarAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getInicializacaoSensorAccess().getBussolaLigarAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:680:6: ( ( rule__InicializacaoSensor__CameraLigarAssignment_2 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:680:6: ( ( rule__InicializacaoSensor__CameraLigarAssignment_2 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:681:1: ( rule__InicializacaoSensor__CameraLigarAssignment_2 )
                    {
                     before(grammarAccess.getInicializacaoSensorAccess().getCameraLigarAssignment_2()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:682:1: ( rule__InicializacaoSensor__CameraLigarAssignment_2 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:682:2: rule__InicializacaoSensor__CameraLigarAssignment_2
                    {
                    pushFollow(FOLLOW_rule__InicializacaoSensor__CameraLigarAssignment_2_in_rule__InicializacaoSensor__Alternatives1412);
                    rule__InicializacaoSensor__CameraLigarAssignment_2();
                    _fsp--;


                    }

                     after(grammarAccess.getInicializacaoSensorAccess().getCameraLigarAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:686:6: ( ( rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_3 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:686:6: ( ( rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_3 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:687:1: ( rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_3 )
                    {
                     before(grammarAccess.getInicializacaoSensorAccess().getCarregarListaCoordenadasAssignment_3()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:688:1: ( rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_3 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:688:2: rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_3
                    {
                    pushFollow(FOLLOW_rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_3_in_rule__InicializacaoSensor__Alternatives1430);
                    rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_3();
                    _fsp--;


                    }

                     after(grammarAccess.getInicializacaoSensorAccess().getCarregarListaCoordenadasAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:692:6: ( ( rule__InicializacaoSensor__InicializarPlayerAssignment_4 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:692:6: ( ( rule__InicializacaoSensor__InicializarPlayerAssignment_4 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:693:1: ( rule__InicializacaoSensor__InicializarPlayerAssignment_4 )
                    {
                     before(grammarAccess.getInicializacaoSensorAccess().getInicializarPlayerAssignment_4()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:694:1: ( rule__InicializacaoSensor__InicializarPlayerAssignment_4 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:694:2: rule__InicializacaoSensor__InicializarPlayerAssignment_4
                    {
                    pushFollow(FOLLOW_rule__InicializacaoSensor__InicializarPlayerAssignment_4_in_rule__InicializacaoSensor__Alternatives1448);
                    rule__InicializacaoSensor__InicializarPlayerAssignment_4();
                    _fsp--;


                    }

                     after(grammarAccess.getInicializacaoSensorAccess().getInicializarPlayerAssignment_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InicializacaoSensor__Alternatives


    // $ANTLR start rule__Entrada__Alternatives
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:703:1: rule__Entrada__Alternatives : ( ( ( rule__Entrada__GpsLerAssignment_0 ) ) | ( ( rule__Entrada__BussolaLerAssignment_1 ) ) | ( ( rule__Entrada__CameraLerAssignment_2 ) ) | ( ( rule__Entrada__ReceberCoordenadaAssignment_3 ) ) | ( ( rule__Entrada__CarregarListaCoordenadasAssignment_4 ) ) );
    public final void rule__Entrada__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:707:1: ( ( ( rule__Entrada__GpsLerAssignment_0 ) ) | ( ( rule__Entrada__BussolaLerAssignment_1 ) ) | ( ( rule__Entrada__CameraLerAssignment_2 ) ) | ( ( rule__Entrada__ReceberCoordenadaAssignment_3 ) ) | ( ( rule__Entrada__CarregarListaCoordenadasAssignment_4 ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt7=1;
                }
                break;
            case 37:
                {
                alt7=2;
                }
                break;
            case 38:
                {
                alt7=3;
                }
                break;
            case 39:
                {
                alt7=4;
                }
                break;
            case 34:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("703:1: rule__Entrada__Alternatives : ( ( ( rule__Entrada__GpsLerAssignment_0 ) ) | ( ( rule__Entrada__BussolaLerAssignment_1 ) ) | ( ( rule__Entrada__CameraLerAssignment_2 ) ) | ( ( rule__Entrada__ReceberCoordenadaAssignment_3 ) ) | ( ( rule__Entrada__CarregarListaCoordenadasAssignment_4 ) ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:708:1: ( ( rule__Entrada__GpsLerAssignment_0 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:708:1: ( ( rule__Entrada__GpsLerAssignment_0 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:709:1: ( rule__Entrada__GpsLerAssignment_0 )
                    {
                     before(grammarAccess.getEntradaAccess().getGpsLerAssignment_0()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:710:1: ( rule__Entrada__GpsLerAssignment_0 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:710:2: rule__Entrada__GpsLerAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Entrada__GpsLerAssignment_0_in_rule__Entrada__Alternatives1481);
                    rule__Entrada__GpsLerAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getEntradaAccess().getGpsLerAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:714:6: ( ( rule__Entrada__BussolaLerAssignment_1 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:714:6: ( ( rule__Entrada__BussolaLerAssignment_1 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:715:1: ( rule__Entrada__BussolaLerAssignment_1 )
                    {
                     before(grammarAccess.getEntradaAccess().getBussolaLerAssignment_1()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:716:1: ( rule__Entrada__BussolaLerAssignment_1 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:716:2: rule__Entrada__BussolaLerAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Entrada__BussolaLerAssignment_1_in_rule__Entrada__Alternatives1499);
                    rule__Entrada__BussolaLerAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getEntradaAccess().getBussolaLerAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:720:6: ( ( rule__Entrada__CameraLerAssignment_2 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:720:6: ( ( rule__Entrada__CameraLerAssignment_2 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:721:1: ( rule__Entrada__CameraLerAssignment_2 )
                    {
                     before(grammarAccess.getEntradaAccess().getCameraLerAssignment_2()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:722:1: ( rule__Entrada__CameraLerAssignment_2 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:722:2: rule__Entrada__CameraLerAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Entrada__CameraLerAssignment_2_in_rule__Entrada__Alternatives1517);
                    rule__Entrada__CameraLerAssignment_2();
                    _fsp--;


                    }

                     after(grammarAccess.getEntradaAccess().getCameraLerAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:726:6: ( ( rule__Entrada__ReceberCoordenadaAssignment_3 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:726:6: ( ( rule__Entrada__ReceberCoordenadaAssignment_3 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:727:1: ( rule__Entrada__ReceberCoordenadaAssignment_3 )
                    {
                     before(grammarAccess.getEntradaAccess().getReceberCoordenadaAssignment_3()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:728:1: ( rule__Entrada__ReceberCoordenadaAssignment_3 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:728:2: rule__Entrada__ReceberCoordenadaAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Entrada__ReceberCoordenadaAssignment_3_in_rule__Entrada__Alternatives1535);
                    rule__Entrada__ReceberCoordenadaAssignment_3();
                    _fsp--;


                    }

                     after(grammarAccess.getEntradaAccess().getReceberCoordenadaAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:732:6: ( ( rule__Entrada__CarregarListaCoordenadasAssignment_4 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:732:6: ( ( rule__Entrada__CarregarListaCoordenadasAssignment_4 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:733:1: ( rule__Entrada__CarregarListaCoordenadasAssignment_4 )
                    {
                     before(grammarAccess.getEntradaAccess().getCarregarListaCoordenadasAssignment_4()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:734:1: ( rule__Entrada__CarregarListaCoordenadasAssignment_4 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:734:2: rule__Entrada__CarregarListaCoordenadasAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Entrada__CarregarListaCoordenadasAssignment_4_in_rule__Entrada__Alternatives1553);
                    rule__Entrada__CarregarListaCoordenadasAssignment_4();
                    _fsp--;


                    }

                     after(grammarAccess.getEntradaAccess().getCarregarListaCoordenadasAssignment_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entrada__Alternatives


    // $ANTLR start rule__Processamento__Alternatives
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:743:1: rule__Processamento__Alternatives : ( ( ( rule__Processamento__ProcessaInfoAssignment_0 ) ) | ( ( rule__Processamento__ProcessaImagemAssignment_1 ) ) );
    public final void rule__Processamento__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:747:1: ( ( ( rule__Processamento__ProcessaInfoAssignment_0 ) ) | ( ( rule__Processamento__ProcessaImagemAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                alt8=1;
            }
            else if ( (LA8_0==41) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("743:1: rule__Processamento__Alternatives : ( ( ( rule__Processamento__ProcessaInfoAssignment_0 ) ) | ( ( rule__Processamento__ProcessaImagemAssignment_1 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:748:1: ( ( rule__Processamento__ProcessaInfoAssignment_0 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:748:1: ( ( rule__Processamento__ProcessaInfoAssignment_0 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:749:1: ( rule__Processamento__ProcessaInfoAssignment_0 )
                    {
                     before(grammarAccess.getProcessamentoAccess().getProcessaInfoAssignment_0()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:750:1: ( rule__Processamento__ProcessaInfoAssignment_0 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:750:2: rule__Processamento__ProcessaInfoAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Processamento__ProcessaInfoAssignment_0_in_rule__Processamento__Alternatives1586);
                    rule__Processamento__ProcessaInfoAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getProcessamentoAccess().getProcessaInfoAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:754:6: ( ( rule__Processamento__ProcessaImagemAssignment_1 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:754:6: ( ( rule__Processamento__ProcessaImagemAssignment_1 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:755:1: ( rule__Processamento__ProcessaImagemAssignment_1 )
                    {
                     before(grammarAccess.getProcessamentoAccess().getProcessaImagemAssignment_1()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:756:1: ( rule__Processamento__ProcessaImagemAssignment_1 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:756:2: rule__Processamento__ProcessaImagemAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Processamento__ProcessaImagemAssignment_1_in_rule__Processamento__Alternatives1604);
                    rule__Processamento__ProcessaImagemAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getProcessamentoAccess().getProcessaImagemAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Processamento__Alternatives


    // $ANTLR start rule__Comportamento__Alternatives
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:765:1: rule__Comportamento__Alternatives : ( ( ( rule__Comportamento__DefineRegraAssignment_0 ) ) | ( ( rule__Comportamento__DefineRegraSeguirAssignment_1 ) ) | ( ( rule__Comportamento__DefineRegraNaoBaterAssignment_2 ) ) | ( ( rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_3 ) ) );
    public final void rule__Comportamento__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:769:1: ( ( ( rule__Comportamento__DefineRegraAssignment_0 ) ) | ( ( rule__Comportamento__DefineRegraSeguirAssignment_1 ) ) | ( ( rule__Comportamento__DefineRegraNaoBaterAssignment_2 ) ) | ( ( rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_3 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt9=1;
                }
                break;
            case 43:
                {
                alt9=2;
                }
                break;
            case 44:
                {
                alt9=3;
                }
                break;
            case 45:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("765:1: rule__Comportamento__Alternatives : ( ( ( rule__Comportamento__DefineRegraAssignment_0 ) ) | ( ( rule__Comportamento__DefineRegraSeguirAssignment_1 ) ) | ( ( rule__Comportamento__DefineRegraNaoBaterAssignment_2 ) ) | ( ( rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_3 ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:770:1: ( ( rule__Comportamento__DefineRegraAssignment_0 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:770:1: ( ( rule__Comportamento__DefineRegraAssignment_0 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:771:1: ( rule__Comportamento__DefineRegraAssignment_0 )
                    {
                     before(grammarAccess.getComportamentoAccess().getDefineRegraAssignment_0()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:772:1: ( rule__Comportamento__DefineRegraAssignment_0 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:772:2: rule__Comportamento__DefineRegraAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Comportamento__DefineRegraAssignment_0_in_rule__Comportamento__Alternatives1637);
                    rule__Comportamento__DefineRegraAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getComportamentoAccess().getDefineRegraAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:776:6: ( ( rule__Comportamento__DefineRegraSeguirAssignment_1 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:776:6: ( ( rule__Comportamento__DefineRegraSeguirAssignment_1 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:777:1: ( rule__Comportamento__DefineRegraSeguirAssignment_1 )
                    {
                     before(grammarAccess.getComportamentoAccess().getDefineRegraSeguirAssignment_1()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:778:1: ( rule__Comportamento__DefineRegraSeguirAssignment_1 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:778:2: rule__Comportamento__DefineRegraSeguirAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Comportamento__DefineRegraSeguirAssignment_1_in_rule__Comportamento__Alternatives1655);
                    rule__Comportamento__DefineRegraSeguirAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getComportamentoAccess().getDefineRegraSeguirAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:782:6: ( ( rule__Comportamento__DefineRegraNaoBaterAssignment_2 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:782:6: ( ( rule__Comportamento__DefineRegraNaoBaterAssignment_2 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:783:1: ( rule__Comportamento__DefineRegraNaoBaterAssignment_2 )
                    {
                     before(grammarAccess.getComportamentoAccess().getDefineRegraNaoBaterAssignment_2()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:784:1: ( rule__Comportamento__DefineRegraNaoBaterAssignment_2 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:784:2: rule__Comportamento__DefineRegraNaoBaterAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Comportamento__DefineRegraNaoBaterAssignment_2_in_rule__Comportamento__Alternatives1673);
                    rule__Comportamento__DefineRegraNaoBaterAssignment_2();
                    _fsp--;


                    }

                     after(grammarAccess.getComportamentoAccess().getDefineRegraNaoBaterAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:788:6: ( ( rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_3 ) )
                    {
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:788:6: ( ( rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_3 ) )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:789:1: ( rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_3 )
                    {
                     before(grammarAccess.getComportamentoAccess().getDefineRegraSeguirMultiplasCoordenadasAssignment_3()); 
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:790:1: ( rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_3 )
                    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:790:2: rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_3_in_rule__Comportamento__Alternatives1691);
                    rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_3();
                    _fsp--;


                    }

                     after(grammarAccess.getComportamentoAccess().getDefineRegraSeguirMultiplasCoordenadasAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Comportamento__Alternatives


    // $ANTLR start rule__ModeloRobo__Group__0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:801:1: rule__ModeloRobo__Group__0 : rule__ModeloRobo__Group__0__Impl rule__ModeloRobo__Group__1 ;
    public final void rule__ModeloRobo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:805:1: ( rule__ModeloRobo__Group__0__Impl rule__ModeloRobo__Group__1 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:806:2: rule__ModeloRobo__Group__0__Impl rule__ModeloRobo__Group__1
            {
            pushFollow(FOLLOW_rule__ModeloRobo__Group__0__Impl_in_rule__ModeloRobo__Group__01722);
            rule__ModeloRobo__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ModeloRobo__Group__1_in_rule__ModeloRobo__Group__01725);
            rule__ModeloRobo__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__Group__0


    // $ANTLR start rule__ModeloRobo__Group__0__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:813:1: rule__ModeloRobo__Group__0__Impl : ( ( rule__ModeloRobo__PlataformaAssignment_0 ) ) ;
    public final void rule__ModeloRobo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:817:1: ( ( ( rule__ModeloRobo__PlataformaAssignment_0 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:818:1: ( ( rule__ModeloRobo__PlataformaAssignment_0 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:818:1: ( ( rule__ModeloRobo__PlataformaAssignment_0 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:819:1: ( rule__ModeloRobo__PlataformaAssignment_0 )
            {
             before(grammarAccess.getModeloRoboAccess().getPlataformaAssignment_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:820:1: ( rule__ModeloRobo__PlataformaAssignment_0 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:820:2: rule__ModeloRobo__PlataformaAssignment_0
            {
            pushFollow(FOLLOW_rule__ModeloRobo__PlataformaAssignment_0_in_rule__ModeloRobo__Group__0__Impl1752);
            rule__ModeloRobo__PlataformaAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getModeloRoboAccess().getPlataformaAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__Group__0__Impl


    // $ANTLR start rule__ModeloRobo__Group__1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:830:1: rule__ModeloRobo__Group__1 : rule__ModeloRobo__Group__1__Impl rule__ModeloRobo__Group__2 ;
    public final void rule__ModeloRobo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:834:1: ( rule__ModeloRobo__Group__1__Impl rule__ModeloRobo__Group__2 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:835:2: rule__ModeloRobo__Group__1__Impl rule__ModeloRobo__Group__2
            {
            pushFollow(FOLLOW_rule__ModeloRobo__Group__1__Impl_in_rule__ModeloRobo__Group__11782);
            rule__ModeloRobo__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ModeloRobo__Group__2_in_rule__ModeloRobo__Group__11785);
            rule__ModeloRobo__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__Group__1


    // $ANTLR start rule__ModeloRobo__Group__1__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:842:1: rule__ModeloRobo__Group__1__Impl : ( 'robo' ) ;
    public final void rule__ModeloRobo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:846:1: ( ( 'robo' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:847:1: ( 'robo' )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:847:1: ( 'robo' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:848:1: 'robo'
            {
             before(grammarAccess.getModeloRoboAccess().getRoboKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ModeloRobo__Group__1__Impl1813); 
             after(grammarAccess.getModeloRoboAccess().getRoboKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__Group__1__Impl


    // $ANTLR start rule__ModeloRobo__Group__2
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:861:1: rule__ModeloRobo__Group__2 : rule__ModeloRobo__Group__2__Impl rule__ModeloRobo__Group__3 ;
    public final void rule__ModeloRobo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:865:1: ( rule__ModeloRobo__Group__2__Impl rule__ModeloRobo__Group__3 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:866:2: rule__ModeloRobo__Group__2__Impl rule__ModeloRobo__Group__3
            {
            pushFollow(FOLLOW_rule__ModeloRobo__Group__2__Impl_in_rule__ModeloRobo__Group__21844);
            rule__ModeloRobo__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ModeloRobo__Group__3_in_rule__ModeloRobo__Group__21847);
            rule__ModeloRobo__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__Group__2


    // $ANTLR start rule__ModeloRobo__Group__2__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:873:1: rule__ModeloRobo__Group__2__Impl : ( ( rule__ModeloRobo__NameAssignment_2 ) ) ;
    public final void rule__ModeloRobo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:877:1: ( ( ( rule__ModeloRobo__NameAssignment_2 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:878:1: ( ( rule__ModeloRobo__NameAssignment_2 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:878:1: ( ( rule__ModeloRobo__NameAssignment_2 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:879:1: ( rule__ModeloRobo__NameAssignment_2 )
            {
             before(grammarAccess.getModeloRoboAccess().getNameAssignment_2()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:880:1: ( rule__ModeloRobo__NameAssignment_2 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:880:2: rule__ModeloRobo__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ModeloRobo__NameAssignment_2_in_rule__ModeloRobo__Group__2__Impl1874);
            rule__ModeloRobo__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getModeloRoboAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__Group__2__Impl


    // $ANTLR start rule__ModeloRobo__Group__3
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:890:1: rule__ModeloRobo__Group__3 : rule__ModeloRobo__Group__3__Impl rule__ModeloRobo__Group__4 ;
    public final void rule__ModeloRobo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:894:1: ( rule__ModeloRobo__Group__3__Impl rule__ModeloRobo__Group__4 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:895:2: rule__ModeloRobo__Group__3__Impl rule__ModeloRobo__Group__4
            {
            pushFollow(FOLLOW_rule__ModeloRobo__Group__3__Impl_in_rule__ModeloRobo__Group__31904);
            rule__ModeloRobo__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ModeloRobo__Group__4_in_rule__ModeloRobo__Group__31907);
            rule__ModeloRobo__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__Group__3


    // $ANTLR start rule__ModeloRobo__Group__3__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:902:1: rule__ModeloRobo__Group__3__Impl : ( ( rule__ModeloRobo__CabecalhoAssignment_3 )* ) ;
    public final void rule__ModeloRobo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:906:1: ( ( ( rule__ModeloRobo__CabecalhoAssignment_3 )* ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:907:1: ( ( rule__ModeloRobo__CabecalhoAssignment_3 )* )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:907:1: ( ( rule__ModeloRobo__CabecalhoAssignment_3 )* )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:908:1: ( rule__ModeloRobo__CabecalhoAssignment_3 )*
            {
             before(grammarAccess.getModeloRoboAccess().getCabecalhoAssignment_3()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:909:1: ( rule__ModeloRobo__CabecalhoAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:909:2: rule__ModeloRobo__CabecalhoAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ModeloRobo__CabecalhoAssignment_3_in_rule__ModeloRobo__Group__3__Impl1934);
            	    rule__ModeloRobo__CabecalhoAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModeloRoboAccess().getCabecalhoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__Group__3__Impl


    // $ANTLR start rule__ModeloRobo__Group__4
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:919:1: rule__ModeloRobo__Group__4 : rule__ModeloRobo__Group__4__Impl rule__ModeloRobo__Group__5 ;
    public final void rule__ModeloRobo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:923:1: ( rule__ModeloRobo__Group__4__Impl rule__ModeloRobo__Group__5 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:924:2: rule__ModeloRobo__Group__4__Impl rule__ModeloRobo__Group__5
            {
            pushFollow(FOLLOW_rule__ModeloRobo__Group__4__Impl_in_rule__ModeloRobo__Group__41965);
            rule__ModeloRobo__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ModeloRobo__Group__5_in_rule__ModeloRobo__Group__41968);
            rule__ModeloRobo__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__Group__4


    // $ANTLR start rule__ModeloRobo__Group__4__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:931:1: rule__ModeloRobo__Group__4__Impl : ( ( rule__ModeloRobo__PacoteAssignment_4 )* ) ;
    public final void rule__ModeloRobo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:935:1: ( ( ( rule__ModeloRobo__PacoteAssignment_4 )* ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:936:1: ( ( rule__ModeloRobo__PacoteAssignment_4 )* )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:936:1: ( ( rule__ModeloRobo__PacoteAssignment_4 )* )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:937:1: ( rule__ModeloRobo__PacoteAssignment_4 )*
            {
             before(grammarAccess.getModeloRoboAccess().getPacoteAssignment_4()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:938:1: ( rule__ModeloRobo__PacoteAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:938:2: rule__ModeloRobo__PacoteAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ModeloRobo__PacoteAssignment_4_in_rule__ModeloRobo__Group__4__Impl1995);
            	    rule__ModeloRobo__PacoteAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModeloRoboAccess().getPacoteAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__Group__4__Impl


    // $ANTLR start rule__ModeloRobo__Group__5
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:948:1: rule__ModeloRobo__Group__5 : rule__ModeloRobo__Group__5__Impl rule__ModeloRobo__Group__6 ;
    public final void rule__ModeloRobo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:952:1: ( rule__ModeloRobo__Group__5__Impl rule__ModeloRobo__Group__6 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:953:2: rule__ModeloRobo__Group__5__Impl rule__ModeloRobo__Group__6
            {
            pushFollow(FOLLOW_rule__ModeloRobo__Group__5__Impl_in_rule__ModeloRobo__Group__52026);
            rule__ModeloRobo__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ModeloRobo__Group__6_in_rule__ModeloRobo__Group__52029);
            rule__ModeloRobo__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__Group__5


    // $ANTLR start rule__ModeloRobo__Group__5__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:960:1: rule__ModeloRobo__Group__5__Impl : ( ( rule__ModeloRobo__SensorAssignment_5 )* ) ;
    public final void rule__ModeloRobo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:964:1: ( ( ( rule__ModeloRobo__SensorAssignment_5 )* ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:965:1: ( ( rule__ModeloRobo__SensorAssignment_5 )* )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:965:1: ( ( rule__ModeloRobo__SensorAssignment_5 )* )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:966:1: ( rule__ModeloRobo__SensorAssignment_5 )*
            {
             before(grammarAccess.getModeloRoboAccess().getSensorAssignment_5()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:967:1: ( rule__ModeloRobo__SensorAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:967:2: rule__ModeloRobo__SensorAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ModeloRobo__SensorAssignment_5_in_rule__ModeloRobo__Group__5__Impl2056);
            	    rule__ModeloRobo__SensorAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModeloRoboAccess().getSensorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__Group__5__Impl


    // $ANTLR start rule__ModeloRobo__Group__6
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:977:1: rule__ModeloRobo__Group__6 : rule__ModeloRobo__Group__6__Impl ;
    public final void rule__ModeloRobo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:981:1: ( rule__ModeloRobo__Group__6__Impl )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:982:2: rule__ModeloRobo__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ModeloRobo__Group__6__Impl_in_rule__ModeloRobo__Group__62087);
            rule__ModeloRobo__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__Group__6


    // $ANTLR start rule__ModeloRobo__Group__6__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:988:1: rule__ModeloRobo__Group__6__Impl : ( ( rule__ModeloRobo__MainAssignment_6 ) ) ;
    public final void rule__ModeloRobo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:992:1: ( ( ( rule__ModeloRobo__MainAssignment_6 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:993:1: ( ( rule__ModeloRobo__MainAssignment_6 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:993:1: ( ( rule__ModeloRobo__MainAssignment_6 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:994:1: ( rule__ModeloRobo__MainAssignment_6 )
            {
             before(grammarAccess.getModeloRoboAccess().getMainAssignment_6()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:995:1: ( rule__ModeloRobo__MainAssignment_6 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:995:2: rule__ModeloRobo__MainAssignment_6
            {
            pushFollow(FOLLOW_rule__ModeloRobo__MainAssignment_6_in_rule__ModeloRobo__Group__6__Impl2114);
            rule__ModeloRobo__MainAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getModeloRoboAccess().getMainAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__Group__6__Impl


    // $ANTLR start rule__Plataforma__Group__0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1019:1: rule__Plataforma__Group__0 : rule__Plataforma__Group__0__Impl rule__Plataforma__Group__1 ;
    public final void rule__Plataforma__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1023:1: ( rule__Plataforma__Group__0__Impl rule__Plataforma__Group__1 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1024:2: rule__Plataforma__Group__0__Impl rule__Plataforma__Group__1
            {
            pushFollow(FOLLOW_rule__Plataforma__Group__0__Impl_in_rule__Plataforma__Group__02158);
            rule__Plataforma__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Plataforma__Group__1_in_rule__Plataforma__Group__02161);
            rule__Plataforma__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plataforma__Group__0


    // $ANTLR start rule__Plataforma__Group__0__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1031:1: rule__Plataforma__Group__0__Impl : ( 'plataforma' ) ;
    public final void rule__Plataforma__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1035:1: ( ( 'plataforma' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1036:1: ( 'plataforma' )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1036:1: ( 'plataforma' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1037:1: 'plataforma'
            {
             before(grammarAccess.getPlataformaAccess().getPlataformaKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Plataforma__Group__0__Impl2189); 
             after(grammarAccess.getPlataformaAccess().getPlataformaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plataforma__Group__0__Impl


    // $ANTLR start rule__Plataforma__Group__1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1050:1: rule__Plataforma__Group__1 : rule__Plataforma__Group__1__Impl ;
    public final void rule__Plataforma__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1054:1: ( rule__Plataforma__Group__1__Impl )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1055:2: rule__Plataforma__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Plataforma__Group__1__Impl_in_rule__Plataforma__Group__12220);
            rule__Plataforma__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plataforma__Group__1


    // $ANTLR start rule__Plataforma__Group__1__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1061:1: rule__Plataforma__Group__1__Impl : ( rulenomeDaPlataforma ) ;
    public final void rule__Plataforma__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1065:1: ( ( rulenomeDaPlataforma ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1066:1: ( rulenomeDaPlataforma )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1066:1: ( rulenomeDaPlataforma )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1067:1: rulenomeDaPlataforma
            {
             before(grammarAccess.getPlataformaAccess().getNomeDaPlataformaParserRuleCall_1()); 
            pushFollow(FOLLOW_rulenomeDaPlataforma_in_rule__Plataforma__Group__1__Impl2247);
            rulenomeDaPlataforma();
            _fsp--;

             after(grammarAccess.getPlataformaAccess().getNomeDaPlataformaParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plataforma__Group__1__Impl


    // $ANTLR start rule__Cabecalho__Group__0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1082:1: rule__Cabecalho__Group__0 : rule__Cabecalho__Group__0__Impl rule__Cabecalho__Group__1 ;
    public final void rule__Cabecalho__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1086:1: ( rule__Cabecalho__Group__0__Impl rule__Cabecalho__Group__1 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1087:2: rule__Cabecalho__Group__0__Impl rule__Cabecalho__Group__1
            {
            pushFollow(FOLLOW_rule__Cabecalho__Group__0__Impl_in_rule__Cabecalho__Group__02280);
            rule__Cabecalho__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Cabecalho__Group__1_in_rule__Cabecalho__Group__02283);
            rule__Cabecalho__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Cabecalho__Group__0


    // $ANTLR start rule__Cabecalho__Group__0__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1094:1: rule__Cabecalho__Group__0__Impl : ( 'adicionar' ) ;
    public final void rule__Cabecalho__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1098:1: ( ( 'adicionar' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1099:1: ( 'adicionar' )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1099:1: ( 'adicionar' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1100:1: 'adicionar'
            {
             before(grammarAccess.getCabecalhoAccess().getAdicionarKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Cabecalho__Group__0__Impl2311); 
             after(grammarAccess.getCabecalhoAccess().getAdicionarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Cabecalho__Group__0__Impl


    // $ANTLR start rule__Cabecalho__Group__1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1113:1: rule__Cabecalho__Group__1 : rule__Cabecalho__Group__1__Impl ;
    public final void rule__Cabecalho__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1117:1: ( rule__Cabecalho__Group__1__Impl )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1118:2: rule__Cabecalho__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Cabecalho__Group__1__Impl_in_rule__Cabecalho__Group__12342);
            rule__Cabecalho__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Cabecalho__Group__1


    // $ANTLR start rule__Cabecalho__Group__1__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1124:1: rule__Cabecalho__Group__1__Impl : ( ( rule__Cabecalho__ItensCabecalhoAssignment_1 ) ) ;
    public final void rule__Cabecalho__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1128:1: ( ( ( rule__Cabecalho__ItensCabecalhoAssignment_1 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1129:1: ( ( rule__Cabecalho__ItensCabecalhoAssignment_1 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1129:1: ( ( rule__Cabecalho__ItensCabecalhoAssignment_1 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1130:1: ( rule__Cabecalho__ItensCabecalhoAssignment_1 )
            {
             before(grammarAccess.getCabecalhoAccess().getItensCabecalhoAssignment_1()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1131:1: ( rule__Cabecalho__ItensCabecalhoAssignment_1 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1131:2: rule__Cabecalho__ItensCabecalhoAssignment_1
            {
            pushFollow(FOLLOW_rule__Cabecalho__ItensCabecalhoAssignment_1_in_rule__Cabecalho__Group__1__Impl2369);
            rule__Cabecalho__ItensCabecalhoAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCabecalhoAccess().getItensCabecalhoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Cabecalho__Group__1__Impl


    // $ANTLR start rule__Pacote__Group__0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1145:1: rule__Pacote__Group__0 : rule__Pacote__Group__0__Impl rule__Pacote__Group__1 ;
    public final void rule__Pacote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1149:1: ( rule__Pacote__Group__0__Impl rule__Pacote__Group__1 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1150:2: rule__Pacote__Group__0__Impl rule__Pacote__Group__1
            {
            pushFollow(FOLLOW_rule__Pacote__Group__0__Impl_in_rule__Pacote__Group__02403);
            rule__Pacote__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Pacote__Group__1_in_rule__Pacote__Group__02406);
            rule__Pacote__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Pacote__Group__0


    // $ANTLR start rule__Pacote__Group__0__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1157:1: rule__Pacote__Group__0__Impl : ( 'importar pacote' ) ;
    public final void rule__Pacote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1161:1: ( ( 'importar pacote' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1162:1: ( 'importar pacote' )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1162:1: ( 'importar pacote' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1163:1: 'importar pacote'
            {
             before(grammarAccess.getPacoteAccess().getImportarPacoteKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Pacote__Group__0__Impl2434); 
             after(grammarAccess.getPacoteAccess().getImportarPacoteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Pacote__Group__0__Impl


    // $ANTLR start rule__Pacote__Group__1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1176:1: rule__Pacote__Group__1 : rule__Pacote__Group__1__Impl ;
    public final void rule__Pacote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1180:1: ( rule__Pacote__Group__1__Impl )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1181:2: rule__Pacote__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Pacote__Group__1__Impl_in_rule__Pacote__Group__12465);
            rule__Pacote__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Pacote__Group__1


    // $ANTLR start rule__Pacote__Group__1__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1187:1: rule__Pacote__Group__1__Impl : ( ( rule__Pacote__TipoAssignment_1 ) ) ;
    public final void rule__Pacote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1191:1: ( ( ( rule__Pacote__TipoAssignment_1 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1192:1: ( ( rule__Pacote__TipoAssignment_1 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1192:1: ( ( rule__Pacote__TipoAssignment_1 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1193:1: ( rule__Pacote__TipoAssignment_1 )
            {
             before(grammarAccess.getPacoteAccess().getTipoAssignment_1()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1194:1: ( rule__Pacote__TipoAssignment_1 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1194:2: rule__Pacote__TipoAssignment_1
            {
            pushFollow(FOLLOW_rule__Pacote__TipoAssignment_1_in_rule__Pacote__Group__1__Impl2492);
            rule__Pacote__TipoAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPacoteAccess().getTipoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Pacote__Group__1__Impl


    // $ANTLR start rule__Sensor__Group__0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1208:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1212:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1213:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_rule__Sensor__Group__0__Impl_in_rule__Sensor__Group__02526);
            rule__Sensor__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Sensor__Group__1_in_rule__Sensor__Group__02529);
            rule__Sensor__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Sensor__Group__0


    // $ANTLR start rule__Sensor__Group__0__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1220:1: rule__Sensor__Group__0__Impl : ( 'criarSensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1224:1: ( ( 'criarSensor' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1225:1: ( 'criarSensor' )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1225:1: ( 'criarSensor' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1226:1: 'criarSensor'
            {
             before(grammarAccess.getSensorAccess().getCriarSensorKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Sensor__Group__0__Impl2557); 
             after(grammarAccess.getSensorAccess().getCriarSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Sensor__Group__0__Impl


    // $ANTLR start rule__Sensor__Group__1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1239:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1243:1: ( rule__Sensor__Group__1__Impl )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1244:2: rule__Sensor__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Sensor__Group__1__Impl_in_rule__Sensor__Group__12588);
            rule__Sensor__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Sensor__Group__1


    // $ANTLR start rule__Sensor__Group__1__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1250:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__TipoSensorAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1254:1: ( ( ( rule__Sensor__TipoSensorAssignment_1 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1255:1: ( ( rule__Sensor__TipoSensorAssignment_1 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1255:1: ( ( rule__Sensor__TipoSensorAssignment_1 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1256:1: ( rule__Sensor__TipoSensorAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getTipoSensorAssignment_1()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1257:1: ( rule__Sensor__TipoSensorAssignment_1 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1257:2: rule__Sensor__TipoSensorAssignment_1
            {
            pushFollow(FOLLOW_rule__Sensor__TipoSensorAssignment_1_in_rule__Sensor__Group__1__Impl2615);
            rule__Sensor__TipoSensorAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSensorAccess().getTipoSensorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Sensor__Group__1__Impl


    // $ANTLR start rule__Main__Group__0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1271:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1275:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1276:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__02649);
            rule__Main__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Main__Group__1_in_rule__Main__Group__02652);
            rule__Main__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Main__Group__0


    // $ANTLR start rule__Main__Group__0__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1283:1: rule__Main__Group__0__Impl : ( 'int main()' ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1287:1: ( ( 'int main()' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1288:1: ( 'int main()' )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1288:1: ( 'int main()' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1289:1: 'int main()'
            {
             before(grammarAccess.getMainAccess().getIntMainKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Main__Group__0__Impl2680); 
             after(grammarAccess.getMainAccess().getIntMainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Main__Group__0__Impl


    // $ANTLR start rule__Main__Group__1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1302:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1306:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1307:2: rule__Main__Group__1__Impl rule__Main__Group__2
            {
            pushFollow(FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__12711);
            rule__Main__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Main__Group__2_in_rule__Main__Group__12714);
            rule__Main__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Main__Group__1


    // $ANTLR start rule__Main__Group__1__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1314:1: rule__Main__Group__1__Impl : ( '{' ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1318:1: ( ( '{' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1319:1: ( '{' )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1319:1: ( '{' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1320:1: '{'
            {
             before(grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__Main__Group__1__Impl2742); 
             after(grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Main__Group__1__Impl


    // $ANTLR start rule__Main__Group__2
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1333:1: rule__Main__Group__2 : rule__Main__Group__2__Impl rule__Main__Group__3 ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1337:1: ( rule__Main__Group__2__Impl rule__Main__Group__3 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1338:2: rule__Main__Group__2__Impl rule__Main__Group__3
            {
            pushFollow(FOLLOW_rule__Main__Group__2__Impl_in_rule__Main__Group__22773);
            rule__Main__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Main__Group__3_in_rule__Main__Group__22776);
            rule__Main__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Main__Group__2


    // $ANTLR start rule__Main__Group__2__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1345:1: rule__Main__Group__2__Impl : ( ruleloop ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1349:1: ( ( ruleloop ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1350:1: ( ruleloop )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1350:1: ( ruleloop )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1351:1: ruleloop
            {
             before(grammarAccess.getMainAccess().getLoopParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleloop_in_rule__Main__Group__2__Impl2803);
            ruleloop();
            _fsp--;

             after(grammarAccess.getMainAccess().getLoopParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Main__Group__2__Impl


    // $ANTLR start rule__Main__Group__3
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1362:1: rule__Main__Group__3 : rule__Main__Group__3__Impl ;
    public final void rule__Main__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1366:1: ( rule__Main__Group__3__Impl )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1367:2: rule__Main__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Main__Group__3__Impl_in_rule__Main__Group__32832);
            rule__Main__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Main__Group__3


    // $ANTLR start rule__Main__Group__3__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1373:1: rule__Main__Group__3__Impl : ( '}' ) ;
    public final void rule__Main__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1377:1: ( ( '}' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1378:1: ( '}' )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1378:1: ( '}' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1379:1: '}'
            {
             before(grammarAccess.getMainAccess().getRightCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Main__Group__3__Impl2860); 
             after(grammarAccess.getMainAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Main__Group__3__Impl


    // $ANTLR start rule__Loop__Group__0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1400:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1404:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1405:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_rule__Loop__Group__0__Impl_in_rule__Loop__Group__02899);
            rule__Loop__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Loop__Group__1_in_rule__Loop__Group__02902);
            rule__Loop__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Loop__Group__0


    // $ANTLR start rule__Loop__Group__0__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1412:1: rule__Loop__Group__0__Impl : ( ( rule__Loop__IniSensorAssignment_0 )* ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1416:1: ( ( ( rule__Loop__IniSensorAssignment_0 )* ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1417:1: ( ( rule__Loop__IniSensorAssignment_0 )* )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1417:1: ( ( rule__Loop__IniSensorAssignment_0 )* )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1418:1: ( rule__Loop__IniSensorAssignment_0 )*
            {
             before(grammarAccess.getLoopAccess().getIniSensorAssignment_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1419:1: ( rule__Loop__IniSensorAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=31 && LA13_0<=35)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1419:2: rule__Loop__IniSensorAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Loop__IniSensorAssignment_0_in_rule__Loop__Group__0__Impl2929);
            	    rule__Loop__IniSensorAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getIniSensorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Loop__Group__0__Impl


    // $ANTLR start rule__Loop__Group__1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1429:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1433:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1434:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_rule__Loop__Group__1__Impl_in_rule__Loop__Group__12960);
            rule__Loop__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Loop__Group__2_in_rule__Loop__Group__12963);
            rule__Loop__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Loop__Group__1


    // $ANTLR start rule__Loop__Group__1__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1441:1: rule__Loop__Group__1__Impl : ( ( rule__Loop__WAssignment_1 ) ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1445:1: ( ( ( rule__Loop__WAssignment_1 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1446:1: ( ( rule__Loop__WAssignment_1 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1446:1: ( ( rule__Loop__WAssignment_1 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1447:1: ( rule__Loop__WAssignment_1 )
            {
             before(grammarAccess.getLoopAccess().getWAssignment_1()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1448:1: ( rule__Loop__WAssignment_1 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1448:2: rule__Loop__WAssignment_1
            {
            pushFollow(FOLLOW_rule__Loop__WAssignment_1_in_rule__Loop__Group__1__Impl2990);
            rule__Loop__WAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLoopAccess().getWAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Loop__Group__1__Impl


    // $ANTLR start rule__Loop__Group__2
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1458:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1462:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1463:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
            {
            pushFollow(FOLLOW_rule__Loop__Group__2__Impl_in_rule__Loop__Group__23020);
            rule__Loop__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Loop__Group__3_in_rule__Loop__Group__23023);
            rule__Loop__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Loop__Group__2


    // $ANTLR start rule__Loop__Group__2__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1470:1: rule__Loop__Group__2__Impl : ( ( rule__Loop__Alternatives_2 )* ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1474:1: ( ( ( rule__Loop__Alternatives_2 )* ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1475:1: ( ( rule__Loop__Alternatives_2 )* )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1475:1: ( ( rule__Loop__Alternatives_2 )* )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1476:1: ( rule__Loop__Alternatives_2 )*
            {
             before(grammarAccess.getLoopAccess().getAlternatives_2()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1477:1: ( rule__Loop__Alternatives_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34||(LA14_0>=36 && LA14_0<=46)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1477:2: rule__Loop__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Loop__Alternatives_2_in_rule__Loop__Group__2__Impl3050);
            	    rule__Loop__Alternatives_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Loop__Group__2__Impl


    // $ANTLR start rule__Loop__Group__3
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1487:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1491:1: ( rule__Loop__Group__3__Impl )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1492:2: rule__Loop__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Loop__Group__3__Impl_in_rule__Loop__Group__33081);
            rule__Loop__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Loop__Group__3


    // $ANTLR start rule__Loop__Group__3__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1498:1: rule__Loop__Group__3__Impl : ( '}' ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1502:1: ( ( '}' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1503:1: ( '}' )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1503:1: ( '}' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1504:1: '}'
            {
             before(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Loop__Group__3__Impl3109); 
             after(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Loop__Group__3__Impl


    // $ANTLR start rule__While__Group__0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1525:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1529:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1530:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__03148);
            rule__While__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__03151);
            rule__While__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__While__Group__0


    // $ANTLR start rule__While__Group__0__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1537:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1541:1: ( ( 'while' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1542:1: ( 'while' )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1542:1: ( 'while' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1543:1: 'while'
            {
             before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__While__Group__0__Impl3179); 
             after(grammarAccess.getWhileAccess().getWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__While__Group__0__Impl


    // $ANTLR start rule__While__Group__1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1556:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1560:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1561:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__13210);
            rule__While__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__13213);
            rule__While__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__While__Group__1


    // $ANTLR start rule__While__Group__1__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1568:1: rule__While__Group__1__Impl : ( '(true)' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1572:1: ( ( '(true)' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1573:1: ( '(true)' )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1573:1: ( '(true)' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1574:1: '(true)'
            {
             before(grammarAccess.getWhileAccess().getTrueKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__While__Group__1__Impl3241); 
             after(grammarAccess.getWhileAccess().getTrueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__While__Group__1__Impl


    // $ANTLR start rule__While__Group__2
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1587:1: rule__While__Group__2 : rule__While__Group__2__Impl ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1591:1: ( rule__While__Group__2__Impl )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1592:2: rule__While__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__23272);
            rule__While__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__While__Group__2


    // $ANTLR start rule__While__Group__2__Impl
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1598:1: rule__While__Group__2__Impl : ( '{' ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1602:1: ( ( '{' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1603:1: ( '{' )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1603:1: ( '{' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1604:1: '{'
            {
             before(grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__While__Group__2__Impl3300); 
             after(grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__While__Group__2__Impl


    // $ANTLR start rule__ModeloRobo__PlataformaAssignment_0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1624:1: rule__ModeloRobo__PlataformaAssignment_0 : ( rulePlataforma ) ;
    public final void rule__ModeloRobo__PlataformaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1628:1: ( ( rulePlataforma ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1629:1: ( rulePlataforma )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1629:1: ( rulePlataforma )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1630:1: rulePlataforma
            {
             before(grammarAccess.getModeloRoboAccess().getPlataformaPlataformaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePlataforma_in_rule__ModeloRobo__PlataformaAssignment_03342);
            rulePlataforma();
            _fsp--;

             after(grammarAccess.getModeloRoboAccess().getPlataformaPlataformaParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__PlataformaAssignment_0


    // $ANTLR start rule__ModeloRobo__NameAssignment_2
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1639:1: rule__ModeloRobo__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ModeloRobo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1643:1: ( ( RULE_ID ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1644:1: ( RULE_ID )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1644:1: ( RULE_ID )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1645:1: RULE_ID
            {
             before(grammarAccess.getModeloRoboAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModeloRobo__NameAssignment_23373); 
             after(grammarAccess.getModeloRoboAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__NameAssignment_2


    // $ANTLR start rule__ModeloRobo__CabecalhoAssignment_3
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1654:1: rule__ModeloRobo__CabecalhoAssignment_3 : ( ruleCabecalho ) ;
    public final void rule__ModeloRobo__CabecalhoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1658:1: ( ( ruleCabecalho ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1659:1: ( ruleCabecalho )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1659:1: ( ruleCabecalho )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1660:1: ruleCabecalho
            {
             before(grammarAccess.getModeloRoboAccess().getCabecalhoCabecalhoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCabecalho_in_rule__ModeloRobo__CabecalhoAssignment_33404);
            ruleCabecalho();
            _fsp--;

             after(grammarAccess.getModeloRoboAccess().getCabecalhoCabecalhoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__CabecalhoAssignment_3


    // $ANTLR start rule__ModeloRobo__PacoteAssignment_4
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1669:1: rule__ModeloRobo__PacoteAssignment_4 : ( rulePacote ) ;
    public final void rule__ModeloRobo__PacoteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1673:1: ( ( rulePacote ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1674:1: ( rulePacote )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1674:1: ( rulePacote )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1675:1: rulePacote
            {
             before(grammarAccess.getModeloRoboAccess().getPacotePacoteParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePacote_in_rule__ModeloRobo__PacoteAssignment_43435);
            rulePacote();
            _fsp--;

             after(grammarAccess.getModeloRoboAccess().getPacotePacoteParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__PacoteAssignment_4


    // $ANTLR start rule__ModeloRobo__SensorAssignment_5
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1684:1: rule__ModeloRobo__SensorAssignment_5 : ( ruleSensor ) ;
    public final void rule__ModeloRobo__SensorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1688:1: ( ( ruleSensor ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1689:1: ( ruleSensor )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1689:1: ( ruleSensor )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1690:1: ruleSensor
            {
             before(grammarAccess.getModeloRoboAccess().getSensorSensorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleSensor_in_rule__ModeloRobo__SensorAssignment_53466);
            ruleSensor();
            _fsp--;

             after(grammarAccess.getModeloRoboAccess().getSensorSensorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__SensorAssignment_5


    // $ANTLR start rule__ModeloRobo__MainAssignment_6
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1699:1: rule__ModeloRobo__MainAssignment_6 : ( ruleMain ) ;
    public final void rule__ModeloRobo__MainAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1703:1: ( ( ruleMain ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1704:1: ( ruleMain )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1704:1: ( ruleMain )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1705:1: ruleMain
            {
             before(grammarAccess.getModeloRoboAccess().getMainMainParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleMain_in_rule__ModeloRobo__MainAssignment_63497);
            ruleMain();
            _fsp--;

             after(grammarAccess.getModeloRoboAccess().getMainMainParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModeloRobo__MainAssignment_6


    // $ANTLR start rule__NomeDaPlataforma__PlatAssignment
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1714:1: rule__NomeDaPlataforma__PlatAssignment : ( ( rule__NomeDaPlataforma__PlatAlternatives_0 ) ) ;
    public final void rule__NomeDaPlataforma__PlatAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1718:1: ( ( ( rule__NomeDaPlataforma__PlatAlternatives_0 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1719:1: ( ( rule__NomeDaPlataforma__PlatAlternatives_0 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1719:1: ( ( rule__NomeDaPlataforma__PlatAlternatives_0 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1720:1: ( rule__NomeDaPlataforma__PlatAlternatives_0 )
            {
             before(grammarAccess.getNomeDaPlataformaAccess().getPlatAlternatives_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1721:1: ( rule__NomeDaPlataforma__PlatAlternatives_0 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1721:2: rule__NomeDaPlataforma__PlatAlternatives_0
            {
            pushFollow(FOLLOW_rule__NomeDaPlataforma__PlatAlternatives_0_in_rule__NomeDaPlataforma__PlatAssignment3528);
            rule__NomeDaPlataforma__PlatAlternatives_0();
            _fsp--;


            }

             after(grammarAccess.getNomeDaPlataformaAccess().getPlatAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NomeDaPlataforma__PlatAssignment


    // $ANTLR start rule__Cabecalho__ItensCabecalhoAssignment_1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1730:1: rule__Cabecalho__ItensCabecalhoAssignment_1 : ( ( rule__Cabecalho__ItensCabecalhoAlternatives_1_0 ) ) ;
    public final void rule__Cabecalho__ItensCabecalhoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1734:1: ( ( ( rule__Cabecalho__ItensCabecalhoAlternatives_1_0 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1735:1: ( ( rule__Cabecalho__ItensCabecalhoAlternatives_1_0 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1735:1: ( ( rule__Cabecalho__ItensCabecalhoAlternatives_1_0 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1736:1: ( rule__Cabecalho__ItensCabecalhoAlternatives_1_0 )
            {
             before(grammarAccess.getCabecalhoAccess().getItensCabecalhoAlternatives_1_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1737:1: ( rule__Cabecalho__ItensCabecalhoAlternatives_1_0 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1737:2: rule__Cabecalho__ItensCabecalhoAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Cabecalho__ItensCabecalhoAlternatives_1_0_in_rule__Cabecalho__ItensCabecalhoAssignment_13561);
            rule__Cabecalho__ItensCabecalhoAlternatives_1_0();
            _fsp--;


            }

             after(grammarAccess.getCabecalhoAccess().getItensCabecalhoAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Cabecalho__ItensCabecalhoAssignment_1


    // $ANTLR start rule__Pacote__TipoAssignment_1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1746:1: rule__Pacote__TipoAssignment_1 : ( ( rule__Pacote__TipoAlternatives_1_0 ) ) ;
    public final void rule__Pacote__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1750:1: ( ( ( rule__Pacote__TipoAlternatives_1_0 ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1751:1: ( ( rule__Pacote__TipoAlternatives_1_0 ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1751:1: ( ( rule__Pacote__TipoAlternatives_1_0 ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1752:1: ( rule__Pacote__TipoAlternatives_1_0 )
            {
             before(grammarAccess.getPacoteAccess().getTipoAlternatives_1_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1753:1: ( rule__Pacote__TipoAlternatives_1_0 )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1753:2: rule__Pacote__TipoAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Pacote__TipoAlternatives_1_0_in_rule__Pacote__TipoAssignment_13594);
            rule__Pacote__TipoAlternatives_1_0();
            _fsp--;


            }

             after(grammarAccess.getPacoteAccess().getTipoAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Pacote__TipoAssignment_1


    // $ANTLR start rule__Sensor__TipoSensorAssignment_1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1762:1: rule__Sensor__TipoSensorAssignment_1 : ( ruleTipoSensor ) ;
    public final void rule__Sensor__TipoSensorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1766:1: ( ( ruleTipoSensor ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1767:1: ( ruleTipoSensor )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1767:1: ( ruleTipoSensor )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1768:1: ruleTipoSensor
            {
             before(grammarAccess.getSensorAccess().getTipoSensorTipoSensorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTipoSensor_in_rule__Sensor__TipoSensorAssignment_13627);
            ruleTipoSensor();
            _fsp--;

             after(grammarAccess.getSensorAccess().getTipoSensorTipoSensorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Sensor__TipoSensorAssignment_1


    // $ANTLR start rule__Loop__IniSensorAssignment_0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1777:1: rule__Loop__IniSensorAssignment_0 : ( ruleinicializacaoSensor ) ;
    public final void rule__Loop__IniSensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1781:1: ( ( ruleinicializacaoSensor ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1782:1: ( ruleinicializacaoSensor )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1782:1: ( ruleinicializacaoSensor )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1783:1: ruleinicializacaoSensor
            {
             before(grammarAccess.getLoopAccess().getIniSensorInicializacaoSensorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleinicializacaoSensor_in_rule__Loop__IniSensorAssignment_03658);
            ruleinicializacaoSensor();
            _fsp--;

             after(grammarAccess.getLoopAccess().getIniSensorInicializacaoSensorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Loop__IniSensorAssignment_0


    // $ANTLR start rule__Loop__WAssignment_1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1792:1: rule__Loop__WAssignment_1 : ( rulewhile ) ;
    public final void rule__Loop__WAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1796:1: ( ( rulewhile ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1797:1: ( rulewhile )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1797:1: ( rulewhile )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1798:1: rulewhile
            {
             before(grammarAccess.getLoopAccess().getWWhileParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulewhile_in_rule__Loop__WAssignment_13689);
            rulewhile();
            _fsp--;

             after(grammarAccess.getLoopAccess().getWWhileParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Loop__WAssignment_1


    // $ANTLR start rule__Loop__EnAssignment_2_0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1807:1: rule__Loop__EnAssignment_2_0 : ( ruleentrada ) ;
    public final void rule__Loop__EnAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1811:1: ( ( ruleentrada ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1812:1: ( ruleentrada )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1812:1: ( ruleentrada )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1813:1: ruleentrada
            {
             before(grammarAccess.getLoopAccess().getEnEntradaParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleentrada_in_rule__Loop__EnAssignment_2_03720);
            ruleentrada();
            _fsp--;

             after(grammarAccess.getLoopAccess().getEnEntradaParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Loop__EnAssignment_2_0


    // $ANTLR start rule__Loop__ProcAssignment_2_1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1822:1: rule__Loop__ProcAssignment_2_1 : ( ruleprocessamento ) ;
    public final void rule__Loop__ProcAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1826:1: ( ( ruleprocessamento ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1827:1: ( ruleprocessamento )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1827:1: ( ruleprocessamento )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1828:1: ruleprocessamento
            {
             before(grammarAccess.getLoopAccess().getProcProcessamentoParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleprocessamento_in_rule__Loop__ProcAssignment_2_13751);
            ruleprocessamento();
            _fsp--;

             after(grammarAccess.getLoopAccess().getProcProcessamentoParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Loop__ProcAssignment_2_1


    // $ANTLR start rule__Loop__CompAssignment_2_2
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1837:1: rule__Loop__CompAssignment_2_2 : ( rulecomportamento ) ;
    public final void rule__Loop__CompAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1841:1: ( ( rulecomportamento ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1842:1: ( rulecomportamento )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1842:1: ( rulecomportamento )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1843:1: rulecomportamento
            {
             before(grammarAccess.getLoopAccess().getCompComportamentoParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_rulecomportamento_in_rule__Loop__CompAssignment_2_23782);
            rulecomportamento();
            _fsp--;

             after(grammarAccess.getLoopAccess().getCompComportamentoParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Loop__CompAssignment_2_2


    // $ANTLR start rule__Loop__AcAssignment_2_3
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1852:1: rule__Loop__AcAssignment_2_3 : ( ruleacao ) ;
    public final void rule__Loop__AcAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1856:1: ( ( ruleacao ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1857:1: ( ruleacao )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1857:1: ( ruleacao )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1858:1: ruleacao
            {
             before(grammarAccess.getLoopAccess().getAcAcaoParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleacao_in_rule__Loop__AcAssignment_2_33813);
            ruleacao();
            _fsp--;

             after(grammarAccess.getLoopAccess().getAcAcaoParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Loop__AcAssignment_2_3


    // $ANTLR start rule__InicializacaoSensor__GpsLigarAssignment_0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1867:1: rule__InicializacaoSensor__GpsLigarAssignment_0 : ( ( 'gps.ligar();' ) ) ;
    public final void rule__InicializacaoSensor__GpsLigarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1871:1: ( ( ( 'gps.ligar();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1872:1: ( ( 'gps.ligar();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1872:1: ( ( 'gps.ligar();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1873:1: ( 'gps.ligar();' )
            {
             before(grammarAccess.getInicializacaoSensorAccess().getGpsLigarGpsLigarKeyword_0_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1874:1: ( 'gps.ligar();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1875:1: 'gps.ligar();'
            {
             before(grammarAccess.getInicializacaoSensorAccess().getGpsLigarGpsLigarKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__InicializacaoSensor__GpsLigarAssignment_03849); 
             after(grammarAccess.getInicializacaoSensorAccess().getGpsLigarGpsLigarKeyword_0_0()); 

            }

             after(grammarAccess.getInicializacaoSensorAccess().getGpsLigarGpsLigarKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InicializacaoSensor__GpsLigarAssignment_0


    // $ANTLR start rule__InicializacaoSensor__BussolaLigarAssignment_1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1890:1: rule__InicializacaoSensor__BussolaLigarAssignment_1 : ( ( 'bussola.ligar();' ) ) ;
    public final void rule__InicializacaoSensor__BussolaLigarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1894:1: ( ( ( 'bussola.ligar();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1895:1: ( ( 'bussola.ligar();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1895:1: ( ( 'bussola.ligar();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1896:1: ( 'bussola.ligar();' )
            {
             before(grammarAccess.getInicializacaoSensorAccess().getBussolaLigarBussolaLigarKeyword_1_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1897:1: ( 'bussola.ligar();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1898:1: 'bussola.ligar();'
            {
             before(grammarAccess.getInicializacaoSensorAccess().getBussolaLigarBussolaLigarKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__InicializacaoSensor__BussolaLigarAssignment_13893); 
             after(grammarAccess.getInicializacaoSensorAccess().getBussolaLigarBussolaLigarKeyword_1_0()); 

            }

             after(grammarAccess.getInicializacaoSensorAccess().getBussolaLigarBussolaLigarKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InicializacaoSensor__BussolaLigarAssignment_1


    // $ANTLR start rule__InicializacaoSensor__CameraLigarAssignment_2
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1913:1: rule__InicializacaoSensor__CameraLigarAssignment_2 : ( ( 'camera.ligar();' ) ) ;
    public final void rule__InicializacaoSensor__CameraLigarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1917:1: ( ( ( 'camera.ligar();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1918:1: ( ( 'camera.ligar();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1918:1: ( ( 'camera.ligar();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1919:1: ( 'camera.ligar();' )
            {
             before(grammarAccess.getInicializacaoSensorAccess().getCameraLigarCameraLigarKeyword_2_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1920:1: ( 'camera.ligar();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1921:1: 'camera.ligar();'
            {
             before(grammarAccess.getInicializacaoSensorAccess().getCameraLigarCameraLigarKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__InicializacaoSensor__CameraLigarAssignment_23937); 
             after(grammarAccess.getInicializacaoSensorAccess().getCameraLigarCameraLigarKeyword_2_0()); 

            }

             after(grammarAccess.getInicializacaoSensorAccess().getCameraLigarCameraLigarKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InicializacaoSensor__CameraLigarAssignment_2


    // $ANTLR start rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_3
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1936:1: rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_3 : ( ( 'carregarListaCoordenadas();' ) ) ;
    public final void rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1940:1: ( ( ( 'carregarListaCoordenadas();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1941:1: ( ( 'carregarListaCoordenadas();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1941:1: ( ( 'carregarListaCoordenadas();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1942:1: ( 'carregarListaCoordenadas();' )
            {
             before(grammarAccess.getInicializacaoSensorAccess().getCarregarListaCoordenadasCarregarListaCoordenadasKeyword_3_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1943:1: ( 'carregarListaCoordenadas();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1944:1: 'carregarListaCoordenadas();'
            {
             before(grammarAccess.getInicializacaoSensorAccess().getCarregarListaCoordenadasCarregarListaCoordenadasKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_33981); 
             after(grammarAccess.getInicializacaoSensorAccess().getCarregarListaCoordenadasCarregarListaCoordenadasKeyword_3_0()); 

            }

             after(grammarAccess.getInicializacaoSensorAccess().getCarregarListaCoordenadasCarregarListaCoordenadasKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_3


    // $ANTLR start rule__InicializacaoSensor__InicializarPlayerAssignment_4
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1959:1: rule__InicializacaoSensor__InicializarPlayerAssignment_4 : ( ( 'inicializarPlayer();' ) ) ;
    public final void rule__InicializacaoSensor__InicializarPlayerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1963:1: ( ( ( 'inicializarPlayer();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1964:1: ( ( 'inicializarPlayer();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1964:1: ( ( 'inicializarPlayer();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1965:1: ( 'inicializarPlayer();' )
            {
             before(grammarAccess.getInicializacaoSensorAccess().getInicializarPlayerInicializarPlayerKeyword_4_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1966:1: ( 'inicializarPlayer();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1967:1: 'inicializarPlayer();'
            {
             before(grammarAccess.getInicializacaoSensorAccess().getInicializarPlayerInicializarPlayerKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__InicializacaoSensor__InicializarPlayerAssignment_44025); 
             after(grammarAccess.getInicializacaoSensorAccess().getInicializarPlayerInicializarPlayerKeyword_4_0()); 

            }

             after(grammarAccess.getInicializacaoSensorAccess().getInicializarPlayerInicializarPlayerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InicializacaoSensor__InicializarPlayerAssignment_4


    // $ANTLR start rule__Entrada__GpsLerAssignment_0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1982:1: rule__Entrada__GpsLerAssignment_0 : ( ( 'gps.ler();' ) ) ;
    public final void rule__Entrada__GpsLerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1986:1: ( ( ( 'gps.ler();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1987:1: ( ( 'gps.ler();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1987:1: ( ( 'gps.ler();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1988:1: ( 'gps.ler();' )
            {
             before(grammarAccess.getEntradaAccess().getGpsLerGpsLerKeyword_0_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1989:1: ( 'gps.ler();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:1990:1: 'gps.ler();'
            {
             before(grammarAccess.getEntradaAccess().getGpsLerGpsLerKeyword_0_0()); 
            match(input,36,FOLLOW_36_in_rule__Entrada__GpsLerAssignment_04069); 
             after(grammarAccess.getEntradaAccess().getGpsLerGpsLerKeyword_0_0()); 

            }

             after(grammarAccess.getEntradaAccess().getGpsLerGpsLerKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entrada__GpsLerAssignment_0


    // $ANTLR start rule__Entrada__BussolaLerAssignment_1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2005:1: rule__Entrada__BussolaLerAssignment_1 : ( ( 'bussola.ler();' ) ) ;
    public final void rule__Entrada__BussolaLerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2009:1: ( ( ( 'bussola.ler();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2010:1: ( ( 'bussola.ler();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2010:1: ( ( 'bussola.ler();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2011:1: ( 'bussola.ler();' )
            {
             before(grammarAccess.getEntradaAccess().getBussolaLerBussolaLerKeyword_1_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2012:1: ( 'bussola.ler();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2013:1: 'bussola.ler();'
            {
             before(grammarAccess.getEntradaAccess().getBussolaLerBussolaLerKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__Entrada__BussolaLerAssignment_14113); 
             after(grammarAccess.getEntradaAccess().getBussolaLerBussolaLerKeyword_1_0()); 

            }

             after(grammarAccess.getEntradaAccess().getBussolaLerBussolaLerKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entrada__BussolaLerAssignment_1


    // $ANTLR start rule__Entrada__CameraLerAssignment_2
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2028:1: rule__Entrada__CameraLerAssignment_2 : ( ( 'camera.ler();' ) ) ;
    public final void rule__Entrada__CameraLerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2032:1: ( ( ( 'camera.ler();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2033:1: ( ( 'camera.ler();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2033:1: ( ( 'camera.ler();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2034:1: ( 'camera.ler();' )
            {
             before(grammarAccess.getEntradaAccess().getCameraLerCameraLerKeyword_2_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2035:1: ( 'camera.ler();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2036:1: 'camera.ler();'
            {
             before(grammarAccess.getEntradaAccess().getCameraLerCameraLerKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__Entrada__CameraLerAssignment_24157); 
             after(grammarAccess.getEntradaAccess().getCameraLerCameraLerKeyword_2_0()); 

            }

             after(grammarAccess.getEntradaAccess().getCameraLerCameraLerKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entrada__CameraLerAssignment_2


    // $ANTLR start rule__Entrada__ReceberCoordenadaAssignment_3
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2051:1: rule__Entrada__ReceberCoordenadaAssignment_3 : ( ( 'receberCoordenada();' ) ) ;
    public final void rule__Entrada__ReceberCoordenadaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2055:1: ( ( ( 'receberCoordenada();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2056:1: ( ( 'receberCoordenada();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2056:1: ( ( 'receberCoordenada();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2057:1: ( 'receberCoordenada();' )
            {
             before(grammarAccess.getEntradaAccess().getReceberCoordenadaReceberCoordenadaKeyword_3_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2058:1: ( 'receberCoordenada();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2059:1: 'receberCoordenada();'
            {
             before(grammarAccess.getEntradaAccess().getReceberCoordenadaReceberCoordenadaKeyword_3_0()); 
            match(input,39,FOLLOW_39_in_rule__Entrada__ReceberCoordenadaAssignment_34201); 
             after(grammarAccess.getEntradaAccess().getReceberCoordenadaReceberCoordenadaKeyword_3_0()); 

            }

             after(grammarAccess.getEntradaAccess().getReceberCoordenadaReceberCoordenadaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entrada__ReceberCoordenadaAssignment_3


    // $ANTLR start rule__Entrada__CarregarListaCoordenadasAssignment_4
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2074:1: rule__Entrada__CarregarListaCoordenadasAssignment_4 : ( ( 'carregarListaCoordenadas();' ) ) ;
    public final void rule__Entrada__CarregarListaCoordenadasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2078:1: ( ( ( 'carregarListaCoordenadas();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2079:1: ( ( 'carregarListaCoordenadas();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2079:1: ( ( 'carregarListaCoordenadas();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2080:1: ( 'carregarListaCoordenadas();' )
            {
             before(grammarAccess.getEntradaAccess().getCarregarListaCoordenadasCarregarListaCoordenadasKeyword_4_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2081:1: ( 'carregarListaCoordenadas();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2082:1: 'carregarListaCoordenadas();'
            {
             before(grammarAccess.getEntradaAccess().getCarregarListaCoordenadasCarregarListaCoordenadasKeyword_4_0()); 
            match(input,34,FOLLOW_34_in_rule__Entrada__CarregarListaCoordenadasAssignment_44245); 
             after(grammarAccess.getEntradaAccess().getCarregarListaCoordenadasCarregarListaCoordenadasKeyword_4_0()); 

            }

             after(grammarAccess.getEntradaAccess().getCarregarListaCoordenadasCarregarListaCoordenadasKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entrada__CarregarListaCoordenadasAssignment_4


    // $ANTLR start rule__Processamento__ProcessaInfoAssignment_0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2097:1: rule__Processamento__ProcessaInfoAssignment_0 : ( ( 'processaInfo();' ) ) ;
    public final void rule__Processamento__ProcessaInfoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2101:1: ( ( ( 'processaInfo();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2102:1: ( ( 'processaInfo();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2102:1: ( ( 'processaInfo();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2103:1: ( 'processaInfo();' )
            {
             before(grammarAccess.getProcessamentoAccess().getProcessaInfoProcessaInfoKeyword_0_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2104:1: ( 'processaInfo();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2105:1: 'processaInfo();'
            {
             before(grammarAccess.getProcessamentoAccess().getProcessaInfoProcessaInfoKeyword_0_0()); 
            match(input,40,FOLLOW_40_in_rule__Processamento__ProcessaInfoAssignment_04289); 
             after(grammarAccess.getProcessamentoAccess().getProcessaInfoProcessaInfoKeyword_0_0()); 

            }

             after(grammarAccess.getProcessamentoAccess().getProcessaInfoProcessaInfoKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Processamento__ProcessaInfoAssignment_0


    // $ANTLR start rule__Processamento__ProcessaImagemAssignment_1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2120:1: rule__Processamento__ProcessaImagemAssignment_1 : ( ( 'processaImagem();' ) ) ;
    public final void rule__Processamento__ProcessaImagemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2124:1: ( ( ( 'processaImagem();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2125:1: ( ( 'processaImagem();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2125:1: ( ( 'processaImagem();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2126:1: ( 'processaImagem();' )
            {
             before(grammarAccess.getProcessamentoAccess().getProcessaImagemProcessaImagemKeyword_1_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2127:1: ( 'processaImagem();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2128:1: 'processaImagem();'
            {
             before(grammarAccess.getProcessamentoAccess().getProcessaImagemProcessaImagemKeyword_1_0()); 
            match(input,41,FOLLOW_41_in_rule__Processamento__ProcessaImagemAssignment_14333); 
             after(grammarAccess.getProcessamentoAccess().getProcessaImagemProcessaImagemKeyword_1_0()); 

            }

             after(grammarAccess.getProcessamentoAccess().getProcessaImagemProcessaImagemKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Processamento__ProcessaImagemAssignment_1


    // $ANTLR start rule__Comportamento__DefineRegraAssignment_0
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2143:1: rule__Comportamento__DefineRegraAssignment_0 : ( ( 'defineRegra();' ) ) ;
    public final void rule__Comportamento__DefineRegraAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2147:1: ( ( ( 'defineRegra();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2148:1: ( ( 'defineRegra();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2148:1: ( ( 'defineRegra();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2149:1: ( 'defineRegra();' )
            {
             before(grammarAccess.getComportamentoAccess().getDefineRegraDefineRegraKeyword_0_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2150:1: ( 'defineRegra();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2151:1: 'defineRegra();'
            {
             before(grammarAccess.getComportamentoAccess().getDefineRegraDefineRegraKeyword_0_0()); 
            match(input,42,FOLLOW_42_in_rule__Comportamento__DefineRegraAssignment_04377); 
             after(grammarAccess.getComportamentoAccess().getDefineRegraDefineRegraKeyword_0_0()); 

            }

             after(grammarAccess.getComportamentoAccess().getDefineRegraDefineRegraKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Comportamento__DefineRegraAssignment_0


    // $ANTLR start rule__Comportamento__DefineRegraSeguirAssignment_1
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2166:1: rule__Comportamento__DefineRegraSeguirAssignment_1 : ( ( 'defineRegraSeguir();' ) ) ;
    public final void rule__Comportamento__DefineRegraSeguirAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2170:1: ( ( ( 'defineRegraSeguir();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2171:1: ( ( 'defineRegraSeguir();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2171:1: ( ( 'defineRegraSeguir();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2172:1: ( 'defineRegraSeguir();' )
            {
             before(grammarAccess.getComportamentoAccess().getDefineRegraSeguirDefineRegraSeguirKeyword_1_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2173:1: ( 'defineRegraSeguir();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2174:1: 'defineRegraSeguir();'
            {
             before(grammarAccess.getComportamentoAccess().getDefineRegraSeguirDefineRegraSeguirKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Comportamento__DefineRegraSeguirAssignment_14421); 
             after(grammarAccess.getComportamentoAccess().getDefineRegraSeguirDefineRegraSeguirKeyword_1_0()); 

            }

             after(grammarAccess.getComportamentoAccess().getDefineRegraSeguirDefineRegraSeguirKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Comportamento__DefineRegraSeguirAssignment_1


    // $ANTLR start rule__Comportamento__DefineRegraNaoBaterAssignment_2
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2189:1: rule__Comportamento__DefineRegraNaoBaterAssignment_2 : ( ( 'defineRegraNaoBater();' ) ) ;
    public final void rule__Comportamento__DefineRegraNaoBaterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2193:1: ( ( ( 'defineRegraNaoBater();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2194:1: ( ( 'defineRegraNaoBater();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2194:1: ( ( 'defineRegraNaoBater();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2195:1: ( 'defineRegraNaoBater();' )
            {
             before(grammarAccess.getComportamentoAccess().getDefineRegraNaoBaterDefineRegraNaoBaterKeyword_2_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2196:1: ( 'defineRegraNaoBater();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2197:1: 'defineRegraNaoBater();'
            {
             before(grammarAccess.getComportamentoAccess().getDefineRegraNaoBaterDefineRegraNaoBaterKeyword_2_0()); 
            match(input,44,FOLLOW_44_in_rule__Comportamento__DefineRegraNaoBaterAssignment_24465); 
             after(grammarAccess.getComportamentoAccess().getDefineRegraNaoBaterDefineRegraNaoBaterKeyword_2_0()); 

            }

             after(grammarAccess.getComportamentoAccess().getDefineRegraNaoBaterDefineRegraNaoBaterKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Comportamento__DefineRegraNaoBaterAssignment_2


    // $ANTLR start rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_3
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2212:1: rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_3 : ( ( 'defineRegraSeguirMultiplasCoordenadas();' ) ) ;
    public final void rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2216:1: ( ( ( 'defineRegraSeguirMultiplasCoordenadas();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2217:1: ( ( 'defineRegraSeguirMultiplasCoordenadas();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2217:1: ( ( 'defineRegraSeguirMultiplasCoordenadas();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2218:1: ( 'defineRegraSeguirMultiplasCoordenadas();' )
            {
             before(grammarAccess.getComportamentoAccess().getDefineRegraSeguirMultiplasCoordenadasDefineRegraSeguirMultiplasCoordenadasKeyword_3_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2219:1: ( 'defineRegraSeguirMultiplasCoordenadas();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2220:1: 'defineRegraSeguirMultiplasCoordenadas();'
            {
             before(grammarAccess.getComportamentoAccess().getDefineRegraSeguirMultiplasCoordenadasDefineRegraSeguirMultiplasCoordenadasKeyword_3_0()); 
            match(input,45,FOLLOW_45_in_rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_34509); 
             after(grammarAccess.getComportamentoAccess().getDefineRegraSeguirMultiplasCoordenadasDefineRegraSeguirMultiplasCoordenadasKeyword_3_0()); 

            }

             after(grammarAccess.getComportamentoAccess().getDefineRegraSeguirMultiplasCoordenadasDefineRegraSeguirMultiplasCoordenadasKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_3


    // $ANTLR start rule__Andar__AndarAssignment
    // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2235:1: rule__Andar__AndarAssignment : ( ( 'andar();' ) ) ;
    public final void rule__Andar__AndarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2239:1: ( ( ( 'andar();' ) ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2240:1: ( ( 'andar();' ) )
            {
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2240:1: ( ( 'andar();' ) )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2241:1: ( 'andar();' )
            {
             before(grammarAccess.getAndarAccess().getAndarAndarKeyword_0()); 
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2242:1: ( 'andar();' )
            // ../org.xtext.lrm.multiplosdestinos.ui/src-gen/org/xtext/lrm/ui/contentassist/antlr/internal/InternalMultiplosdestinos.g:2243:1: 'andar();'
            {
             before(grammarAccess.getAndarAccess().getAndarAndarKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__Andar__AndarAssignment4553); 
             after(grammarAccess.getAndarAccess().getAndarAndarKeyword_0()); 

            }

             after(grammarAccess.getAndarAccess().getAndarAndarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Andar__AndarAssignment


 

    public static final BitSet FOLLOW_ruleModeloRobo_in_entryRuleModeloRobo61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModeloRobo68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModeloRobo__Group__0_in_ruleModeloRobo94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlataforma_in_entryRulePlataforma121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlataforma128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plataforma__Group__0_in_rulePlataforma154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenomeDaPlataforma_in_entryRulenomeDaPlataforma181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenomeDaPlataforma188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NomeDaPlataforma__PlatAssignment_in_rulenomeDaPlataforma214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCabecalho_in_entryRuleCabecalho241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCabecalho248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cabecalho__Group__0_in_ruleCabecalho274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePacote_in_entryRulePacote301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePacote308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pacote__Group__0_in_rulePacote334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensor_in_entryRuleSensor361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensor368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__0_in_ruleSensor394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTipoSensor_in_entryRuleTipoSensor421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTipoSensor428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TipoSensor__Alternatives_in_ruleTipoSensor454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0_in_ruleMain514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleloop_in_entryRuleloop541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleloop548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__Group__0_in_ruleloop574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_in_entryRulewhile601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0_in_rulewhile634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinicializacaoSensor_in_entryRuleinicializacaoSensor661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinicializacaoSensor668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InicializacaoSensor__Alternatives_in_ruleinicializacaoSensor694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentrada_in_entryRuleentrada721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleentrada728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entrada__Alternatives_in_ruleentrada754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocessamento_in_entryRuleprocessamento781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocessamento788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Processamento__Alternatives_in_ruleprocessamento814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleacao_in_entryRuleacao841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleacao848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandar_in_ruleacao874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomportamento_in_entryRulecomportamento900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecomportamento907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comportamento__Alternatives_in_rulecomportamento933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandar_in_entryRuleandar960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleandar967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Andar__AndarAssignment_in_ruleandar993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__NomeDaPlataforma__PlatAlternatives_01030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NomeDaPlataforma__PlatAlternatives_01050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NomeDaPlataforma__PlatAlternatives_01070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Cabecalho__ItensCabecalhoAlternatives_1_01105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Cabecalho__ItensCabecalhoAlternatives_1_01125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Pacote__TipoAlternatives_1_01160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Pacote__TipoAlternatives_1_01180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TipoSensor__Alternatives1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TipoSensor__Alternatives1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TipoSensor__Alternatives1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__EnAssignment_2_0_in_rule__Loop__Alternatives_21289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__ProcAssignment_2_1_in_rule__Loop__Alternatives_21307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__CompAssignment_2_2_in_rule__Loop__Alternatives_21325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__AcAssignment_2_3_in_rule__Loop__Alternatives_21343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InicializacaoSensor__GpsLigarAssignment_0_in_rule__InicializacaoSensor__Alternatives1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InicializacaoSensor__BussolaLigarAssignment_1_in_rule__InicializacaoSensor__Alternatives1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InicializacaoSensor__CameraLigarAssignment_2_in_rule__InicializacaoSensor__Alternatives1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_3_in_rule__InicializacaoSensor__Alternatives1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InicializacaoSensor__InicializarPlayerAssignment_4_in_rule__InicializacaoSensor__Alternatives1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entrada__GpsLerAssignment_0_in_rule__Entrada__Alternatives1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entrada__BussolaLerAssignment_1_in_rule__Entrada__Alternatives1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entrada__CameraLerAssignment_2_in_rule__Entrada__Alternatives1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entrada__ReceberCoordenadaAssignment_3_in_rule__Entrada__Alternatives1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entrada__CarregarListaCoordenadasAssignment_4_in_rule__Entrada__Alternatives1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Processamento__ProcessaInfoAssignment_0_in_rule__Processamento__Alternatives1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Processamento__ProcessaImagemAssignment_1_in_rule__Processamento__Alternatives1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comportamento__DefineRegraAssignment_0_in_rule__Comportamento__Alternatives1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comportamento__DefineRegraSeguirAssignment_1_in_rule__Comportamento__Alternatives1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comportamento__DefineRegraNaoBaterAssignment_2_in_rule__Comportamento__Alternatives1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_3_in_rule__Comportamento__Alternatives1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModeloRobo__Group__0__Impl_in_rule__ModeloRobo__Group__01722 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ModeloRobo__Group__1_in_rule__ModeloRobo__Group__01725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModeloRobo__PlataformaAssignment_0_in_rule__ModeloRobo__Group__0__Impl1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModeloRobo__Group__1__Impl_in_rule__ModeloRobo__Group__11782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModeloRobo__Group__2_in_rule__ModeloRobo__Group__11785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ModeloRobo__Group__1__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModeloRobo__Group__2__Impl_in_rule__ModeloRobo__Group__21844 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_rule__ModeloRobo__Group__3_in_rule__ModeloRobo__Group__21847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModeloRobo__NameAssignment_2_in_rule__ModeloRobo__Group__2__Impl1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModeloRobo__Group__3__Impl_in_rule__ModeloRobo__Group__31904 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_rule__ModeloRobo__Group__4_in_rule__ModeloRobo__Group__31907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModeloRobo__CabecalhoAssignment_3_in_rule__ModeloRobo__Group__3__Impl1934 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ModeloRobo__Group__4__Impl_in_rule__ModeloRobo__Group__41965 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__ModeloRobo__Group__5_in_rule__ModeloRobo__Group__41968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModeloRobo__PacoteAssignment_4_in_rule__ModeloRobo__Group__4__Impl1995 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__ModeloRobo__Group__5__Impl_in_rule__ModeloRobo__Group__52026 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ModeloRobo__Group__6_in_rule__ModeloRobo__Group__52029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModeloRobo__SensorAssignment_5_in_rule__ModeloRobo__Group__5__Impl2056 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ModeloRobo__Group__6__Impl_in_rule__ModeloRobo__Group__62087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModeloRobo__MainAssignment_6_in_rule__ModeloRobo__Group__6__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plataforma__Group__0__Impl_in_rule__Plataforma__Group__02158 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Plataforma__Group__1_in_rule__Plataforma__Group__02161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Plataforma__Group__0__Impl2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plataforma__Group__1__Impl_in_rule__Plataforma__Group__12220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenomeDaPlataforma_in_rule__Plataforma__Group__1__Impl2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cabecalho__Group__0__Impl_in_rule__Cabecalho__Group__02280 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Cabecalho__Group__1_in_rule__Cabecalho__Group__02283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Cabecalho__Group__0__Impl2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cabecalho__Group__1__Impl_in_rule__Cabecalho__Group__12342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cabecalho__ItensCabecalhoAssignment_1_in_rule__Cabecalho__Group__1__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pacote__Group__0__Impl_in_rule__Pacote__Group__02403 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Pacote__Group__1_in_rule__Pacote__Group__02406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Pacote__Group__0__Impl2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pacote__Group__1__Impl_in_rule__Pacote__Group__12465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pacote__TipoAssignment_1_in_rule__Pacote__Group__1__Impl2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__0__Impl_in_rule__Sensor__Group__02526 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__Sensor__Group__1_in_rule__Sensor__Group__02529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Sensor__Group__0__Impl2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__1__Impl_in_rule__Sensor__Group__12588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__TipoSensorAssignment_1_in_rule__Sensor__Group__1__Impl2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__02649 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Main__Group__1_in_rule__Main__Group__02652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Main__Group__0__Impl2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__12711 = new BitSet(new long[]{0x0000000FA0000000L});
    public static final BitSet FOLLOW_rule__Main__Group__2_in_rule__Main__Group__12714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Main__Group__1__Impl2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__2__Impl_in_rule__Main__Group__22773 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Main__Group__3_in_rule__Main__Group__22776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleloop_in_rule__Main__Group__2__Impl2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__3__Impl_in_rule__Main__Group__32832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Main__Group__3__Impl2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__Group__0__Impl_in_rule__Loop__Group__02899 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Loop__Group__1_in_rule__Loop__Group__02902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__IniSensorAssignment_0_in_rule__Loop__Group__0__Impl2929 = new BitSet(new long[]{0x0000000F80000002L});
    public static final BitSet FOLLOW_rule__Loop__Group__1__Impl_in_rule__Loop__Group__12960 = new BitSet(new long[]{0x00007FF410000000L});
    public static final BitSet FOLLOW_rule__Loop__Group__2_in_rule__Loop__Group__12963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__WAssignment_1_in_rule__Loop__Group__1__Impl2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__Group__2__Impl_in_rule__Loop__Group__23020 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Loop__Group__3_in_rule__Loop__Group__23023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__Alternatives_2_in_rule__Loop__Group__2__Impl3050 = new BitSet(new long[]{0x00007FF400000002L});
    public static final BitSet FOLLOW_rule__Loop__Group__3__Impl_in_rule__Loop__Group__33081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Loop__Group__3__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__03148 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__03151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__While__Group__0__Impl3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__13210 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__13213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__While__Group__1__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__23272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__While__Group__2__Impl3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlataforma_in_rule__ModeloRobo__PlataformaAssignment_03342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModeloRobo__NameAssignment_23373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCabecalho_in_rule__ModeloRobo__CabecalhoAssignment_33404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePacote_in_rule__ModeloRobo__PacoteAssignment_43435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensor_in_rule__ModeloRobo__SensorAssignment_53466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_rule__ModeloRobo__MainAssignment_63497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NomeDaPlataforma__PlatAlternatives_0_in_rule__NomeDaPlataforma__PlatAssignment3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cabecalho__ItensCabecalhoAlternatives_1_0_in_rule__Cabecalho__ItensCabecalhoAssignment_13561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pacote__TipoAlternatives_1_0_in_rule__Pacote__TipoAssignment_13594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTipoSensor_in_rule__Sensor__TipoSensorAssignment_13627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinicializacaoSensor_in_rule__Loop__IniSensorAssignment_03658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_in_rule__Loop__WAssignment_13689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentrada_in_rule__Loop__EnAssignment_2_03720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocessamento_in_rule__Loop__ProcAssignment_2_13751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomportamento_in_rule__Loop__CompAssignment_2_23782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleacao_in_rule__Loop__AcAssignment_2_33813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__InicializacaoSensor__GpsLigarAssignment_03849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InicializacaoSensor__BussolaLigarAssignment_13893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InicializacaoSensor__CameraLigarAssignment_23937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__InicializacaoSensor__CarregarListaCoordenadasAssignment_33981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__InicializacaoSensor__InicializarPlayerAssignment_44025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Entrada__GpsLerAssignment_04069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Entrada__BussolaLerAssignment_14113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Entrada__CameraLerAssignment_24157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Entrada__ReceberCoordenadaAssignment_34201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Entrada__CarregarListaCoordenadasAssignment_44245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Processamento__ProcessaInfoAssignment_04289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Processamento__ProcessaImagemAssignment_14333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Comportamento__DefineRegraAssignment_04377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Comportamento__DefineRegraSeguirAssignment_14421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Comportamento__DefineRegraNaoBaterAssignment_24465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Comportamento__DefineRegraSeguirMultiplasCoordenadasAssignment_34509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Andar__AndarAssignment4553 = new BitSet(new long[]{0x0000000000000002L});

}
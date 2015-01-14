package org.xtext.activity.ui.contentassist.antlr.internal; 

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
import org.xtext.activity.services.ActGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'months'", "'days'", "'weeks'", "'years'", "'hours'", "'january'", "'february'", "'march'", "'april'", "'may'", "'june'", "'july'", "'august'", "'september'", "'october'", "'november'", "'december'", "'Categorie'", "'{'", "'}'", "'PeriodicActivity'", "'from'", "'to'", "','", "'workshop'", "'every'", "'allocate'", "'rules'", "'reserve'", "'for'", "'pre'", "'Atelier'", "'activity'", "'-'", "'Elevage'", "'Culture'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalActParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g"; }


     
     	private ActGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ActGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:61:1: ( ruleModel EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:76:2: rule__Model__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePeriodicActivity"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:88:1: entryRulePeriodicActivity : rulePeriodicActivity EOF ;
    public final void entryRulePeriodicActivity() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:89:1: ( rulePeriodicActivity EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:90:1: rulePeriodicActivity EOF
            {
             before(grammarAccess.getPeriodicActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicActivity_in_entryRulePeriodicActivity121);
            rulePeriodicActivity();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePeriodicActivity128); 

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
    // $ANTLR end "entryRulePeriodicActivity"


    // $ANTLR start "rulePeriodicActivity"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:97:1: rulePeriodicActivity : ( ( rule__PeriodicActivity__Group__0 ) ) ;
    public final void rulePeriodicActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:101:2: ( ( ( rule__PeriodicActivity__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:102:1: ( ( rule__PeriodicActivity__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:102:1: ( ( rule__PeriodicActivity__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:103:1: ( rule__PeriodicActivity__Group__0 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:104:1: ( rule__PeriodicActivity__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:104:2: rule__PeriodicActivity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__0_in_rulePeriodicActivity154);
            rule__PeriodicActivity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getGroup()); 

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
    // $ANTLR end "rulePeriodicActivity"


    // $ANTLR start "entryRuleDate"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:118:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:119:1: ( ruleDate EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:120:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate183);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate190); 

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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:127:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:131:2: ( ( ( rule__Date__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:132:1: ( ( rule__Date__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:132:1: ( ( rule__Date__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:133:1: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:134:1: ( rule__Date__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:134:2: rule__Date__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0_in_ruleDate216);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleResAllocation"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:146:1: entryRuleResAllocation : ruleResAllocation EOF ;
    public final void entryRuleResAllocation() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:147:1: ( ruleResAllocation EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:148:1: ruleResAllocation EOF
            {
             before(grammarAccess.getResAllocationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_entryRuleResAllocation243);
            ruleResAllocation();

            state._fsp--;

             after(grammarAccess.getResAllocationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResAllocation250); 

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
    // $ANTLR end "entryRuleResAllocation"


    // $ANTLR start "ruleResAllocation"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:155:1: ruleResAllocation : ( ( rule__ResAllocation__Group__0 ) ) ;
    public final void ruleResAllocation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:159:2: ( ( ( rule__ResAllocation__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:160:1: ( ( rule__ResAllocation__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:160:1: ( ( rule__ResAllocation__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:161:1: ( rule__ResAllocation__Group__0 )
            {
             before(grammarAccess.getResAllocationAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:162:1: ( rule__ResAllocation__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:162:2: rule__ResAllocation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__0_in_ruleResAllocation276);
            rule__ResAllocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResAllocationAccess().getGroup()); 

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
    // $ANTLR end "ruleResAllocation"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:174:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:175:1: ( ruleEString EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:176:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString303);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString310); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:183:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:187:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:188:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:188:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:189:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:190:1: ( rule__EString__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:190:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString336);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRule"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:202:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:203:1: ( ruleRule EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:204:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule363);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule370); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:211:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:215:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:216:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:216:1: ( ( rule__Rule__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:217:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:218:1: ( rule__Rule__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:218:2: rule__Rule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0_in_ruleRule396);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleAtelier_Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:230:1: entryRuleAtelier_Impl : ruleAtelier_Impl EOF ;
    public final void entryRuleAtelier_Impl() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:231:1: ( ruleAtelier_Impl EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:232:1: ruleAtelier_Impl EOF
            {
             before(grammarAccess.getAtelier_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl423);
            ruleAtelier_Impl();

            state._fsp--;

             after(grammarAccess.getAtelier_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtelier_Impl430); 

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
    // $ANTLR end "entryRuleAtelier_Impl"


    // $ANTLR start "ruleAtelier_Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:239:1: ruleAtelier_Impl : ( ( rule__Atelier_Impl__Group__0 ) ) ;
    public final void ruleAtelier_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:243:2: ( ( ( rule__Atelier_Impl__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:244:1: ( ( rule__Atelier_Impl__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:244:1: ( ( rule__Atelier_Impl__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:245:1: ( rule__Atelier_Impl__Group__0 )
            {
             before(grammarAccess.getAtelier_ImplAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:246:1: ( rule__Atelier_Impl__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:246:2: rule__Atelier_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__0_in_ruleAtelier_Impl456);
            rule__Atelier_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtelier_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleAtelier_Impl"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:258:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:259:1: ( ruleEInt EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:260:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt483);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt490); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:267:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:271:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:272:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:272:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:273:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:274:1: ( rule__EInt__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:274:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt516);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRulePredicate"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:288:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:289:1: ( rulePredicate EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:290:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_entryRulePredicate545);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicate552); 

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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:297:1: rulePredicate : ( ( rule__Predicate__Group__0 ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:301:2: ( ( ( rule__Predicate__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:302:1: ( ( rule__Predicate__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:302:1: ( ( rule__Predicate__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:303:1: ( rule__Predicate__Group__0 )
            {
             before(grammarAccess.getPredicateAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:304:1: ( rule__Predicate__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:304:2: rule__Predicate__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group__0_in_rulePredicate578);
            rule__Predicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getGroup()); 

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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleElevage"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:316:1: entryRuleElevage : ruleElevage EOF ;
    public final void entryRuleElevage() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:317:1: ( ruleElevage EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:318:1: ruleElevage EOF
            {
             before(grammarAccess.getElevageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElevage_in_entryRuleElevage605);
            ruleElevage();

            state._fsp--;

             after(grammarAccess.getElevageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElevage612); 

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
    // $ANTLR end "entryRuleElevage"


    // $ANTLR start "ruleElevage"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:325:1: ruleElevage : ( ( rule__Elevage__Group__0 ) ) ;
    public final void ruleElevage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:329:2: ( ( ( rule__Elevage__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:330:1: ( ( rule__Elevage__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:330:1: ( ( rule__Elevage__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:331:1: ( rule__Elevage__Group__0 )
            {
             before(grammarAccess.getElevageAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:332:1: ( rule__Elevage__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:332:2: rule__Elevage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__0_in_ruleElevage638);
            rule__Elevage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElevageAccess().getGroup()); 

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
    // $ANTLR end "ruleElevage"


    // $ANTLR start "entryRuleCulture"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:344:1: entryRuleCulture : ruleCulture EOF ;
    public final void entryRuleCulture() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:345:1: ( ruleCulture EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:346:1: ruleCulture EOF
            {
             before(grammarAccess.getCultureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCulture_in_entryRuleCulture665);
            ruleCulture();

            state._fsp--;

             after(grammarAccess.getCultureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCulture672); 

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
    // $ANTLR end "entryRuleCulture"


    // $ANTLR start "ruleCulture"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:353:1: ruleCulture : ( ( rule__Culture__Group__0 ) ) ;
    public final void ruleCulture() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:357:2: ( ( ( rule__Culture__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:358:1: ( ( rule__Culture__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:358:1: ( ( rule__Culture__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:359:1: ( rule__Culture__Group__0 )
            {
             before(grammarAccess.getCultureAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:360:1: ( rule__Culture__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:360:2: rule__Culture__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__0_in_ruleCulture698);
            rule__Culture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCultureAccess().getGroup()); 

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
    // $ANTLR end "ruleCulture"


    // $ANTLR start "rulePeriodicity"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:373:1: rulePeriodicity : ( ( rule__Periodicity__Alternatives ) ) ;
    public final void rulePeriodicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:377:1: ( ( ( rule__Periodicity__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:378:1: ( ( rule__Periodicity__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:378:1: ( ( rule__Periodicity__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:379:1: ( rule__Periodicity__Alternatives )
            {
             before(grammarAccess.getPeriodicityAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:380:1: ( rule__Periodicity__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:380:2: rule__Periodicity__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Periodicity__Alternatives_in_rulePeriodicity735);
            rule__Periodicity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicityAccess().getAlternatives()); 

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
    // $ANTLR end "rulePeriodicity"


    // $ANTLR start "ruleMonth"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:392:1: ruleMonth : ( ( rule__Month__Alternatives ) ) ;
    public final void ruleMonth() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:396:1: ( ( ( rule__Month__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:397:1: ( ( rule__Month__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:397:1: ( ( rule__Month__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:398:1: ( rule__Month__Alternatives )
            {
             before(grammarAccess.getMonthAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:399:1: ( rule__Month__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:399:2: rule__Month__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Month__Alternatives_in_ruleMonth771);
            rule__Month__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMonthAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMonth"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:411:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:415:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:416:1: ( RULE_STRING )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:416:1: ( RULE_STRING )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:417:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives807); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:422:6: ( RULE_ID )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:422:6: ( RULE_ID )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:423:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives824); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Periodicity__Alternatives"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:433:1: rule__Periodicity__Alternatives : ( ( ( 'months' ) ) | ( ( 'days' ) ) | ( ( 'weeks' ) ) | ( ( 'years' ) ) | ( ( 'hours' ) ) );
    public final void rule__Periodicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:437:1: ( ( ( 'months' ) ) | ( ( 'days' ) ) | ( ( 'weeks' ) ) | ( ( 'years' ) ) | ( ( 'hours' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:438:1: ( ( 'months' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:438:1: ( ( 'months' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:439:1: ( 'months' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getMonthEnumLiteralDeclaration_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:440:1: ( 'months' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:440:3: 'months'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Periodicity__Alternatives857); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getMonthEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:445:6: ( ( 'days' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:445:6: ( ( 'days' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:446:1: ( 'days' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:447:1: ( 'days' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:447:3: 'days'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Periodicity__Alternatives878); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:452:6: ( ( 'weeks' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:452:6: ( ( 'weeks' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:453:1: ( 'weeks' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:454:1: ( 'weeks' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:454:3: 'weeks'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Periodicity__Alternatives899); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:459:6: ( ( 'years' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:459:6: ( ( 'years' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:460:1: ( 'years' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:461:1: ( 'years' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:461:3: 'years'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Periodicity__Alternatives920); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:466:6: ( ( 'hours' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:466:6: ( ( 'hours' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:467:1: ( 'hours' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getHoursEnumLiteralDeclaration_4()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:468:1: ( 'hours' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:468:3: 'hours'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Periodicity__Alternatives941); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getHoursEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__Periodicity__Alternatives"


    // $ANTLR start "rule__Month__Alternatives"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:478:1: rule__Month__Alternatives : ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) );
    public final void rule__Month__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:482:1: ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) )
            int alt3=12;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case 21:
                {
                alt3=6;
                }
                break;
            case 22:
                {
                alt3=7;
                }
                break;
            case 23:
                {
                alt3=8;
                }
                break;
            case 24:
                {
                alt3=9;
                }
                break;
            case 25:
                {
                alt3=10;
                }
                break;
            case 26:
                {
                alt3=11;
                }
                break;
            case 27:
                {
                alt3=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:483:1: ( ( 'january' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:483:1: ( ( 'january' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:484:1: ( 'january' )
                    {
                     before(grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:485:1: ( 'january' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:485:3: 'january'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Month__Alternatives977); 

                    }

                     after(grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:490:6: ( ( 'february' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:490:6: ( ( 'february' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:491:1: ( 'february' )
                    {
                     before(grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:492:1: ( 'february' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:492:3: 'february'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__Month__Alternatives998); 

                    }

                     after(grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:497:6: ( ( 'march' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:497:6: ( ( 'march' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:498:1: ( 'march' )
                    {
                     before(grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:499:1: ( 'march' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:499:3: 'march'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Month__Alternatives1019); 

                    }

                     after(grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:504:6: ( ( 'april' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:504:6: ( ( 'april' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:505:1: ( 'april' )
                    {
                     before(grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:506:1: ( 'april' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:506:3: 'april'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__Month__Alternatives1040); 

                    }

                     after(grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:511:6: ( ( 'may' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:511:6: ( ( 'may' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:512:1: ( 'may' )
                    {
                     before(grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:513:1: ( 'may' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:513:3: 'may'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__Month__Alternatives1061); 

                    }

                     after(grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:518:6: ( ( 'june' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:518:6: ( ( 'june' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:519:1: ( 'june' )
                    {
                     before(grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:520:1: ( 'june' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:520:3: 'june'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Month__Alternatives1082); 

                    }

                     after(grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:525:6: ( ( 'july' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:525:6: ( ( 'july' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:526:1: ( 'july' )
                    {
                     before(grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:527:1: ( 'july' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:527:3: 'july'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__Month__Alternatives1103); 

                    }

                     after(grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:532:6: ( ( 'august' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:532:6: ( ( 'august' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:533:1: ( 'august' )
                    {
                     before(grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:534:1: ( 'august' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:534:3: 'august'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__Month__Alternatives1124); 

                    }

                     after(grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:539:6: ( ( 'september' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:539:6: ( ( 'september' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:540:1: ( 'september' )
                    {
                     before(grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:541:1: ( 'september' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:541:3: 'september'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__Month__Alternatives1145); 

                    }

                     after(grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:546:6: ( ( 'october' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:546:6: ( ( 'october' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:547:1: ( 'october' )
                    {
                     before(grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:548:1: ( 'october' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:548:3: 'october'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__Month__Alternatives1166); 

                    }

                     after(grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:553:6: ( ( 'november' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:553:6: ( ( 'november' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:554:1: ( 'november' )
                    {
                     before(grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:555:1: ( 'november' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:555:3: 'november'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__Month__Alternatives1187); 

                    }

                     after(grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:560:6: ( ( 'december' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:560:6: ( ( 'december' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:561:1: ( 'december' )
                    {
                     before(grammarAccess.getMonthAccess().getDecemberEnumLiteralDeclaration_11()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:562:1: ( 'december' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:562:3: 'december'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__Month__Alternatives1208); 

                    }

                     after(grammarAccess.getMonthAccess().getDecemberEnumLiteralDeclaration_11()); 

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
    // $ANTLR end "rule__Month__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:574:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:578:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:579:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01241);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01244);
            rule__Model__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:586:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:590:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:591:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:591:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:592:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:593:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:595:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:605:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:609:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:610:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11302);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11305);
            rule__Model__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:617:1: rule__Model__Group__1__Impl : ( 'Categorie' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:621:1: ( ( 'Categorie' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:622:1: ( 'Categorie' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:622:1: ( 'Categorie' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:623:1: 'Categorie'
            {
             before(grammarAccess.getModelAccess().getCategorieKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Model__Group__1__Impl1333); 
             after(grammarAccess.getModelAccess().getCategorieKeyword_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:636:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:640:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:641:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21364);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21367);
            rule__Model__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:648:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:652:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:653:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:653:1: ( ( rule__Model__NameAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:654:1: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:655:1: ( rule__Model__NameAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:655:2: rule__Model__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl1394);
            rule__Model__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:665:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:669:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:670:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31424);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31427);
            rule__Model__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:677:1: rule__Model__Group__3__Impl : ( '{' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:681:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:682:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:682:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:683:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Model__Group__3__Impl1455); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:696:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:700:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:701:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41486);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41489);
            rule__Model__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:708:1: rule__Model__Group__4__Impl : ( ( rule__Model__ActivityAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:712:1: ( ( ( rule__Model__ActivityAssignment_4 )* ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:713:1: ( ( rule__Model__ActivityAssignment_4 )* )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:713:1: ( ( rule__Model__ActivityAssignment_4 )* )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:714:1: ( rule__Model__ActivityAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getActivityAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:715:1: ( rule__Model__ActivityAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==31) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:715:2: rule__Model__ActivityAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__ActivityAssignment_4_in_rule__Model__Group__4__Impl1516);
            	    rule__Model__ActivityAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getActivityAssignment_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:725:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:729:1: ( rule__Model__Group__5__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:730:2: rule__Model__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51547);
            rule__Model__Group__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:736:1: rule__Model__Group__5__Impl : ( '}' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:740:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:741:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:741:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:742:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Model__Group__5__Impl1575); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:767:1: rule__PeriodicActivity__Group__0 : rule__PeriodicActivity__Group__0__Impl rule__PeriodicActivity__Group__1 ;
    public final void rule__PeriodicActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:771:1: ( rule__PeriodicActivity__Group__0__Impl rule__PeriodicActivity__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:772:2: rule__PeriodicActivity__Group__0__Impl rule__PeriodicActivity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__0__Impl_in_rule__PeriodicActivity__Group__01618);
            rule__PeriodicActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__1_in_rule__PeriodicActivity__Group__01621);
            rule__PeriodicActivity__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group__0"


    // $ANTLR start "rule__PeriodicActivity__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:779:1: rule__PeriodicActivity__Group__0__Impl : ( () ) ;
    public final void rule__PeriodicActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:783:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:784:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:784:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:785:1: ()
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicActivityAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:786:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:788:1: 
            {
            }

             after(grammarAccess.getPeriodicActivityAccess().getPeriodicActivityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group__0__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:798:1: rule__PeriodicActivity__Group__1 : rule__PeriodicActivity__Group__1__Impl rule__PeriodicActivity__Group__2 ;
    public final void rule__PeriodicActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:802:1: ( rule__PeriodicActivity__Group__1__Impl rule__PeriodicActivity__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:803:2: rule__PeriodicActivity__Group__1__Impl rule__PeriodicActivity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__1__Impl_in_rule__PeriodicActivity__Group__11679);
            rule__PeriodicActivity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__2_in_rule__PeriodicActivity__Group__11682);
            rule__PeriodicActivity__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group__1"


    // $ANTLR start "rule__PeriodicActivity__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:810:1: rule__PeriodicActivity__Group__1__Impl : ( 'PeriodicActivity' ) ;
    public final void rule__PeriodicActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:814:1: ( ( 'PeriodicActivity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:815:1: ( 'PeriodicActivity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:815:1: ( 'PeriodicActivity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:816:1: 'PeriodicActivity'
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicActivityKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__PeriodicActivity__Group__1__Impl1710); 
             after(grammarAccess.getPeriodicActivityAccess().getPeriodicActivityKeyword_1()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group__1__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:829:1: rule__PeriodicActivity__Group__2 : rule__PeriodicActivity__Group__2__Impl rule__PeriodicActivity__Group__3 ;
    public final void rule__PeriodicActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:833:1: ( rule__PeriodicActivity__Group__2__Impl rule__PeriodicActivity__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:834:2: rule__PeriodicActivity__Group__2__Impl rule__PeriodicActivity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__2__Impl_in_rule__PeriodicActivity__Group__21741);
            rule__PeriodicActivity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__3_in_rule__PeriodicActivity__Group__21744);
            rule__PeriodicActivity__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group__2"


    // $ANTLR start "rule__PeriodicActivity__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:841:1: rule__PeriodicActivity__Group__2__Impl : ( ( rule__PeriodicActivity__NameAssignment_2 ) ) ;
    public final void rule__PeriodicActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:845:1: ( ( ( rule__PeriodicActivity__NameAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:846:1: ( ( rule__PeriodicActivity__NameAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:846:1: ( ( rule__PeriodicActivity__NameAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:847:1: ( rule__PeriodicActivity__NameAssignment_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getNameAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:848:1: ( rule__PeriodicActivity__NameAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:848:2: rule__PeriodicActivity__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__NameAssignment_2_in_rule__PeriodicActivity__Group__2__Impl1771);
            rule__PeriodicActivity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group__2__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:858:1: rule__PeriodicActivity__Group__3 : rule__PeriodicActivity__Group__3__Impl rule__PeriodicActivity__Group__4 ;
    public final void rule__PeriodicActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:862:1: ( rule__PeriodicActivity__Group__3__Impl rule__PeriodicActivity__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:863:2: rule__PeriodicActivity__Group__3__Impl rule__PeriodicActivity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__3__Impl_in_rule__PeriodicActivity__Group__31801);
            rule__PeriodicActivity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__4_in_rule__PeriodicActivity__Group__31804);
            rule__PeriodicActivity__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group__3"


    // $ANTLR start "rule__PeriodicActivity__Group__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:870:1: rule__PeriodicActivity__Group__3__Impl : ( '{' ) ;
    public final void rule__PeriodicActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:874:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:875:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:875:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:876:1: '{'
            {
             before(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__PeriodicActivity__Group__3__Impl1832); 
             after(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group__3__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:889:1: rule__PeriodicActivity__Group__4 : rule__PeriodicActivity__Group__4__Impl rule__PeriodicActivity__Group__5 ;
    public final void rule__PeriodicActivity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:893:1: ( rule__PeriodicActivity__Group__4__Impl rule__PeriodicActivity__Group__5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:894:2: rule__PeriodicActivity__Group__4__Impl rule__PeriodicActivity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__4__Impl_in_rule__PeriodicActivity__Group__41863);
            rule__PeriodicActivity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__5_in_rule__PeriodicActivity__Group__41866);
            rule__PeriodicActivity__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group__4"


    // $ANTLR start "rule__PeriodicActivity__Group__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:901:1: rule__PeriodicActivity__Group__4__Impl : ( ( rule__PeriodicActivity__Group_4__0 )? ) ;
    public final void rule__PeriodicActivity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:905:1: ( ( ( rule__PeriodicActivity__Group_4__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:906:1: ( ( rule__PeriodicActivity__Group_4__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:906:1: ( ( rule__PeriodicActivity__Group_4__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:907:1: ( rule__PeriodicActivity__Group_4__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:908:1: ( rule__PeriodicActivity__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:908:2: rule__PeriodicActivity__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__0_in_rule__PeriodicActivity__Group__4__Impl1893);
                    rule__PeriodicActivity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPeriodicActivityAccess().getGroup_4()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group__4__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group__5"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:918:1: rule__PeriodicActivity__Group__5 : rule__PeriodicActivity__Group__5__Impl rule__PeriodicActivity__Group__6 ;
    public final void rule__PeriodicActivity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:922:1: ( rule__PeriodicActivity__Group__5__Impl rule__PeriodicActivity__Group__6 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:923:2: rule__PeriodicActivity__Group__5__Impl rule__PeriodicActivity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__5__Impl_in_rule__PeriodicActivity__Group__51924);
            rule__PeriodicActivity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__6_in_rule__PeriodicActivity__Group__51927);
            rule__PeriodicActivity__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group__5"


    // $ANTLR start "rule__PeriodicActivity__Group__5__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:930:1: rule__PeriodicActivity__Group__5__Impl : ( 'from' ) ;
    public final void rule__PeriodicActivity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:934:1: ( ( 'from' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:935:1: ( 'from' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:935:1: ( 'from' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:936:1: 'from'
            {
             before(grammarAccess.getPeriodicActivityAccess().getFromKeyword_5()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__PeriodicActivity__Group__5__Impl1955); 
             after(grammarAccess.getPeriodicActivityAccess().getFromKeyword_5()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group__5__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group__6"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:949:1: rule__PeriodicActivity__Group__6 : rule__PeriodicActivity__Group__6__Impl rule__PeriodicActivity__Group__7 ;
    public final void rule__PeriodicActivity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:953:1: ( rule__PeriodicActivity__Group__6__Impl rule__PeriodicActivity__Group__7 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:954:2: rule__PeriodicActivity__Group__6__Impl rule__PeriodicActivity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__6__Impl_in_rule__PeriodicActivity__Group__61986);
            rule__PeriodicActivity__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__7_in_rule__PeriodicActivity__Group__61989);
            rule__PeriodicActivity__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group__6"


    // $ANTLR start "rule__PeriodicActivity__Group__6__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:961:1: rule__PeriodicActivity__Group__6__Impl : ( ( rule__PeriodicActivity__StartAssignment_6 ) ) ;
    public final void rule__PeriodicActivity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:965:1: ( ( ( rule__PeriodicActivity__StartAssignment_6 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:966:1: ( ( rule__PeriodicActivity__StartAssignment_6 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:966:1: ( ( rule__PeriodicActivity__StartAssignment_6 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:967:1: ( rule__PeriodicActivity__StartAssignment_6 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getStartAssignment_6()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:968:1: ( rule__PeriodicActivity__StartAssignment_6 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:968:2: rule__PeriodicActivity__StartAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__StartAssignment_6_in_rule__PeriodicActivity__Group__6__Impl2016);
            rule__PeriodicActivity__StartAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getStartAssignment_6()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group__6__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group__7"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:978:1: rule__PeriodicActivity__Group__7 : rule__PeriodicActivity__Group__7__Impl rule__PeriodicActivity__Group__8 ;
    public final void rule__PeriodicActivity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:982:1: ( rule__PeriodicActivity__Group__7__Impl rule__PeriodicActivity__Group__8 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:983:2: rule__PeriodicActivity__Group__7__Impl rule__PeriodicActivity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__7__Impl_in_rule__PeriodicActivity__Group__72046);
            rule__PeriodicActivity__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__8_in_rule__PeriodicActivity__Group__72049);
            rule__PeriodicActivity__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group__7"


    // $ANTLR start "rule__PeriodicActivity__Group__7__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:990:1: rule__PeriodicActivity__Group__7__Impl : ( 'to' ) ;
    public final void rule__PeriodicActivity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:994:1: ( ( 'to' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:995:1: ( 'to' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:995:1: ( 'to' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:996:1: 'to'
            {
             before(grammarAccess.getPeriodicActivityAccess().getToKeyword_7()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__PeriodicActivity__Group__7__Impl2077); 
             after(grammarAccess.getPeriodicActivityAccess().getToKeyword_7()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group__7__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group__8"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1009:1: rule__PeriodicActivity__Group__8 : rule__PeriodicActivity__Group__8__Impl rule__PeriodicActivity__Group__9 ;
    public final void rule__PeriodicActivity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1013:1: ( rule__PeriodicActivity__Group__8__Impl rule__PeriodicActivity__Group__9 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1014:2: rule__PeriodicActivity__Group__8__Impl rule__PeriodicActivity__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__8__Impl_in_rule__PeriodicActivity__Group__82108);
            rule__PeriodicActivity__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__9_in_rule__PeriodicActivity__Group__82111);
            rule__PeriodicActivity__Group__9();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group__8"


    // $ANTLR start "rule__PeriodicActivity__Group__8__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1021:1: rule__PeriodicActivity__Group__8__Impl : ( ( rule__PeriodicActivity__EndAssignment_8 ) ) ;
    public final void rule__PeriodicActivity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1025:1: ( ( ( rule__PeriodicActivity__EndAssignment_8 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1026:1: ( ( rule__PeriodicActivity__EndAssignment_8 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1026:1: ( ( rule__PeriodicActivity__EndAssignment_8 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1027:1: ( rule__PeriodicActivity__EndAssignment_8 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getEndAssignment_8()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1028:1: ( rule__PeriodicActivity__EndAssignment_8 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1028:2: rule__PeriodicActivity__EndAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__EndAssignment_8_in_rule__PeriodicActivity__Group__8__Impl2138);
            rule__PeriodicActivity__EndAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getEndAssignment_8()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group__8__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group__9"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1038:1: rule__PeriodicActivity__Group__9 : rule__PeriodicActivity__Group__9__Impl rule__PeriodicActivity__Group__10 ;
    public final void rule__PeriodicActivity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1042:1: ( rule__PeriodicActivity__Group__9__Impl rule__PeriodicActivity__Group__10 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1043:2: rule__PeriodicActivity__Group__9__Impl rule__PeriodicActivity__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__9__Impl_in_rule__PeriodicActivity__Group__92168);
            rule__PeriodicActivity__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__10_in_rule__PeriodicActivity__Group__92171);
            rule__PeriodicActivity__Group__10();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group__9"


    // $ANTLR start "rule__PeriodicActivity__Group__9__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1050:1: rule__PeriodicActivity__Group__9__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1054:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1055:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1055:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1056:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_9()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__PeriodicActivity__Group__9__Impl2199); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_9()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group__9__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group__10"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1069:1: rule__PeriodicActivity__Group__10 : rule__PeriodicActivity__Group__10__Impl rule__PeriodicActivity__Group__11 ;
    public final void rule__PeriodicActivity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1073:1: ( rule__PeriodicActivity__Group__10__Impl rule__PeriodicActivity__Group__11 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1074:2: rule__PeriodicActivity__Group__10__Impl rule__PeriodicActivity__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__10__Impl_in_rule__PeriodicActivity__Group__102230);
            rule__PeriodicActivity__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__11_in_rule__PeriodicActivity__Group__102233);
            rule__PeriodicActivity__Group__11();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group__10"


    // $ANTLR start "rule__PeriodicActivity__Group__10__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1081:1: rule__PeriodicActivity__Group__10__Impl : ( ( rule__PeriodicActivity__Group_10__0 )? ) ;
    public final void rule__PeriodicActivity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1085:1: ( ( ( rule__PeriodicActivity__Group_10__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1086:1: ( ( rule__PeriodicActivity__Group_10__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1086:1: ( ( rule__PeriodicActivity__Group_10__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1087:1: ( rule__PeriodicActivity__Group_10__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_10()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1088:1: ( rule__PeriodicActivity__Group_10__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==36) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1088:2: rule__PeriodicActivity__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__0_in_rule__PeriodicActivity__Group__10__Impl2260);
                    rule__PeriodicActivity__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPeriodicActivityAccess().getGroup_10()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group__10__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group__11"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1098:1: rule__PeriodicActivity__Group__11 : rule__PeriodicActivity__Group__11__Impl rule__PeriodicActivity__Group__12 ;
    public final void rule__PeriodicActivity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1102:1: ( rule__PeriodicActivity__Group__11__Impl rule__PeriodicActivity__Group__12 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1103:2: rule__PeriodicActivity__Group__11__Impl rule__PeriodicActivity__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__11__Impl_in_rule__PeriodicActivity__Group__112291);
            rule__PeriodicActivity__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__12_in_rule__PeriodicActivity__Group__112294);
            rule__PeriodicActivity__Group__12();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group__11"


    // $ANTLR start "rule__PeriodicActivity__Group__11__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1110:1: rule__PeriodicActivity__Group__11__Impl : ( ( rule__PeriodicActivity__Group_11__0 )? ) ;
    public final void rule__PeriodicActivity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1114:1: ( ( ( rule__PeriodicActivity__Group_11__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1115:1: ( ( rule__PeriodicActivity__Group_11__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1115:1: ( ( rule__PeriodicActivity__Group_11__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1116:1: ( rule__PeriodicActivity__Group_11__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_11()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1117:1: ( rule__PeriodicActivity__Group_11__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1117:2: rule__PeriodicActivity__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__0_in_rule__PeriodicActivity__Group__11__Impl2321);
                    rule__PeriodicActivity__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPeriodicActivityAccess().getGroup_11()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group__11__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group__12"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1127:1: rule__PeriodicActivity__Group__12 : rule__PeriodicActivity__Group__12__Impl rule__PeriodicActivity__Group__13 ;
    public final void rule__PeriodicActivity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1131:1: ( rule__PeriodicActivity__Group__12__Impl rule__PeriodicActivity__Group__13 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1132:2: rule__PeriodicActivity__Group__12__Impl rule__PeriodicActivity__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__12__Impl_in_rule__PeriodicActivity__Group__122352);
            rule__PeriodicActivity__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__13_in_rule__PeriodicActivity__Group__122355);
            rule__PeriodicActivity__Group__13();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group__12"


    // $ANTLR start "rule__PeriodicActivity__Group__12__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1139:1: rule__PeriodicActivity__Group__12__Impl : ( ( rule__PeriodicActivity__Group_12__0 )? ) ;
    public final void rule__PeriodicActivity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1143:1: ( ( ( rule__PeriodicActivity__Group_12__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1144:1: ( ( rule__PeriodicActivity__Group_12__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1144:1: ( ( rule__PeriodicActivity__Group_12__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1145:1: ( rule__PeriodicActivity__Group_12__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_12()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1146:1: ( rule__PeriodicActivity__Group_12__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1146:2: rule__PeriodicActivity__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__0_in_rule__PeriodicActivity__Group__12__Impl2382);
                    rule__PeriodicActivity__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPeriodicActivityAccess().getGroup_12()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group__12__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group__13"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1156:1: rule__PeriodicActivity__Group__13 : rule__PeriodicActivity__Group__13__Impl ;
    public final void rule__PeriodicActivity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1160:1: ( rule__PeriodicActivity__Group__13__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1161:2: rule__PeriodicActivity__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__13__Impl_in_rule__PeriodicActivity__Group__132413);
            rule__PeriodicActivity__Group__13__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group__13"


    // $ANTLR start "rule__PeriodicActivity__Group__13__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1167:1: rule__PeriodicActivity__Group__13__Impl : ( '}' ) ;
    public final void rule__PeriodicActivity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1171:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1172:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1172:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1173:1: '}'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_13()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__PeriodicActivity__Group__13__Impl2441); 
             after(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group__13__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_4__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1214:1: rule__PeriodicActivity__Group_4__0 : rule__PeriodicActivity__Group_4__0__Impl rule__PeriodicActivity__Group_4__1 ;
    public final void rule__PeriodicActivity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1218:1: ( rule__PeriodicActivity__Group_4__0__Impl rule__PeriodicActivity__Group_4__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1219:2: rule__PeriodicActivity__Group_4__0__Impl rule__PeriodicActivity__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__0__Impl_in_rule__PeriodicActivity__Group_4__02500);
            rule__PeriodicActivity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__1_in_rule__PeriodicActivity__Group_4__02503);
            rule__PeriodicActivity__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_4__0"


    // $ANTLR start "rule__PeriodicActivity__Group_4__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1226:1: rule__PeriodicActivity__Group_4__0__Impl : ( 'workshop' ) ;
    public final void rule__PeriodicActivity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1230:1: ( ( 'workshop' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1231:1: ( 'workshop' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1231:1: ( 'workshop' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1232:1: 'workshop'
            {
             before(grammarAccess.getPeriodicActivityAccess().getWorkshopKeyword_4_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__PeriodicActivity__Group_4__0__Impl2531); 
             after(grammarAccess.getPeriodicActivityAccess().getWorkshopKeyword_4_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_4__0__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_4__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1245:1: rule__PeriodicActivity__Group_4__1 : rule__PeriodicActivity__Group_4__1__Impl rule__PeriodicActivity__Group_4__2 ;
    public final void rule__PeriodicActivity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1249:1: ( rule__PeriodicActivity__Group_4__1__Impl rule__PeriodicActivity__Group_4__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1250:2: rule__PeriodicActivity__Group_4__1__Impl rule__PeriodicActivity__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__1__Impl_in_rule__PeriodicActivity__Group_4__12562);
            rule__PeriodicActivity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__2_in_rule__PeriodicActivity__Group_4__12565);
            rule__PeriodicActivity__Group_4__2();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_4__1"


    // $ANTLR start "rule__PeriodicActivity__Group_4__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1257:1: rule__PeriodicActivity__Group_4__1__Impl : ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) ) ;
    public final void rule__PeriodicActivity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1261:1: ( ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1262:1: ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1262:1: ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1263:1: ( rule__PeriodicActivity__AtelierAssignment_4_1 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getAtelierAssignment_4_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1264:1: ( rule__PeriodicActivity__AtelierAssignment_4_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1264:2: rule__PeriodicActivity__AtelierAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__AtelierAssignment_4_1_in_rule__PeriodicActivity__Group_4__1__Impl2592);
            rule__PeriodicActivity__AtelierAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getAtelierAssignment_4_1()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_4__1__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_4__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1274:1: rule__PeriodicActivity__Group_4__2 : rule__PeriodicActivity__Group_4__2__Impl ;
    public final void rule__PeriodicActivity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1278:1: ( rule__PeriodicActivity__Group_4__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1279:2: rule__PeriodicActivity__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__2__Impl_in_rule__PeriodicActivity__Group_4__22622);
            rule__PeriodicActivity__Group_4__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_4__2"


    // $ANTLR start "rule__PeriodicActivity__Group_4__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1285:1: rule__PeriodicActivity__Group_4__2__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1289:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1290:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1290:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1291:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_4_2()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__PeriodicActivity__Group_4__2__Impl2650); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_4_2()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_4__2__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_10__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1310:1: rule__PeriodicActivity__Group_10__0 : rule__PeriodicActivity__Group_10__0__Impl rule__PeriodicActivity__Group_10__1 ;
    public final void rule__PeriodicActivity__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1314:1: ( rule__PeriodicActivity__Group_10__0__Impl rule__PeriodicActivity__Group_10__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1315:2: rule__PeriodicActivity__Group_10__0__Impl rule__PeriodicActivity__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__0__Impl_in_rule__PeriodicActivity__Group_10__02687);
            rule__PeriodicActivity__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__1_in_rule__PeriodicActivity__Group_10__02690);
            rule__PeriodicActivity__Group_10__1();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_10__0"


    // $ANTLR start "rule__PeriodicActivity__Group_10__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1322:1: rule__PeriodicActivity__Group_10__0__Impl : ( 'every' ) ;
    public final void rule__PeriodicActivity__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1326:1: ( ( 'every' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1327:1: ( 'every' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1327:1: ( 'every' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1328:1: 'every'
            {
             before(grammarAccess.getPeriodicActivityAccess().getEveryKeyword_10_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__PeriodicActivity__Group_10__0__Impl2718); 
             after(grammarAccess.getPeriodicActivityAccess().getEveryKeyword_10_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_10__0__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_10__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1341:1: rule__PeriodicActivity__Group_10__1 : rule__PeriodicActivity__Group_10__1__Impl rule__PeriodicActivity__Group_10__2 ;
    public final void rule__PeriodicActivity__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1345:1: ( rule__PeriodicActivity__Group_10__1__Impl rule__PeriodicActivity__Group_10__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1346:2: rule__PeriodicActivity__Group_10__1__Impl rule__PeriodicActivity__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__1__Impl_in_rule__PeriodicActivity__Group_10__12749);
            rule__PeriodicActivity__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__2_in_rule__PeriodicActivity__Group_10__12752);
            rule__PeriodicActivity__Group_10__2();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_10__1"


    // $ANTLR start "rule__PeriodicActivity__Group_10__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1353:1: rule__PeriodicActivity__Group_10__1__Impl : ( ( rule__PeriodicActivity__FrequencyAssignment_10_1 )? ) ;
    public final void rule__PeriodicActivity__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1357:1: ( ( ( rule__PeriodicActivity__FrequencyAssignment_10_1 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1358:1: ( ( rule__PeriodicActivity__FrequencyAssignment_10_1 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1358:1: ( ( rule__PeriodicActivity__FrequencyAssignment_10_1 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1359:1: ( rule__PeriodicActivity__FrequencyAssignment_10_1 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getFrequencyAssignment_10_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1360:1: ( rule__PeriodicActivity__FrequencyAssignment_10_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==44) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1360:2: rule__PeriodicActivity__FrequencyAssignment_10_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__FrequencyAssignment_10_1_in_rule__PeriodicActivity__Group_10__1__Impl2779);
                    rule__PeriodicActivity__FrequencyAssignment_10_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPeriodicActivityAccess().getFrequencyAssignment_10_1()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_10__1__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_10__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1370:1: rule__PeriodicActivity__Group_10__2 : rule__PeriodicActivity__Group_10__2__Impl rule__PeriodicActivity__Group_10__3 ;
    public final void rule__PeriodicActivity__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1374:1: ( rule__PeriodicActivity__Group_10__2__Impl rule__PeriodicActivity__Group_10__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1375:2: rule__PeriodicActivity__Group_10__2__Impl rule__PeriodicActivity__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__2__Impl_in_rule__PeriodicActivity__Group_10__22810);
            rule__PeriodicActivity__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__3_in_rule__PeriodicActivity__Group_10__22813);
            rule__PeriodicActivity__Group_10__3();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_10__2"


    // $ANTLR start "rule__PeriodicActivity__Group_10__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1382:1: rule__PeriodicActivity__Group_10__2__Impl : ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_10_2 ) ) ;
    public final void rule__PeriodicActivity__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1386:1: ( ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_10_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1387:1: ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_10_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1387:1: ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_10_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1388:1: ( rule__PeriodicActivity__PeriodicityTypeAssignment_10_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypeAssignment_10_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1389:1: ( rule__PeriodicActivity__PeriodicityTypeAssignment_10_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1389:2: rule__PeriodicActivity__PeriodicityTypeAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__PeriodicityTypeAssignment_10_2_in_rule__PeriodicActivity__Group_10__2__Impl2840);
            rule__PeriodicActivity__PeriodicityTypeAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypeAssignment_10_2()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_10__2__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_10__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1399:1: rule__PeriodicActivity__Group_10__3 : rule__PeriodicActivity__Group_10__3__Impl ;
    public final void rule__PeriodicActivity__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1403:1: ( rule__PeriodicActivity__Group_10__3__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1404:2: rule__PeriodicActivity__Group_10__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__3__Impl_in_rule__PeriodicActivity__Group_10__32870);
            rule__PeriodicActivity__Group_10__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_10__3"


    // $ANTLR start "rule__PeriodicActivity__Group_10__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1410:1: rule__PeriodicActivity__Group_10__3__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1414:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1415:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1415:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1416:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_10_3()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__PeriodicActivity__Group_10__3__Impl2898); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_10_3()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_10__3__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_11__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1437:1: rule__PeriodicActivity__Group_11__0 : rule__PeriodicActivity__Group_11__0__Impl rule__PeriodicActivity__Group_11__1 ;
    public final void rule__PeriodicActivity__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1441:1: ( rule__PeriodicActivity__Group_11__0__Impl rule__PeriodicActivity__Group_11__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1442:2: rule__PeriodicActivity__Group_11__0__Impl rule__PeriodicActivity__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__0__Impl_in_rule__PeriodicActivity__Group_11__02937);
            rule__PeriodicActivity__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__1_in_rule__PeriodicActivity__Group_11__02940);
            rule__PeriodicActivity__Group_11__1();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_11__0"


    // $ANTLR start "rule__PeriodicActivity__Group_11__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1449:1: rule__PeriodicActivity__Group_11__0__Impl : ( 'allocate' ) ;
    public final void rule__PeriodicActivity__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1453:1: ( ( 'allocate' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1454:1: ( 'allocate' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1454:1: ( 'allocate' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1455:1: 'allocate'
            {
             before(grammarAccess.getPeriodicActivityAccess().getAllocateKeyword_11_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__PeriodicActivity__Group_11__0__Impl2968); 
             after(grammarAccess.getPeriodicActivityAccess().getAllocateKeyword_11_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_11__0__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_11__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1468:1: rule__PeriodicActivity__Group_11__1 : rule__PeriodicActivity__Group_11__1__Impl rule__PeriodicActivity__Group_11__2 ;
    public final void rule__PeriodicActivity__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1472:1: ( rule__PeriodicActivity__Group_11__1__Impl rule__PeriodicActivity__Group_11__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1473:2: rule__PeriodicActivity__Group_11__1__Impl rule__PeriodicActivity__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__1__Impl_in_rule__PeriodicActivity__Group_11__12999);
            rule__PeriodicActivity__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__2_in_rule__PeriodicActivity__Group_11__13002);
            rule__PeriodicActivity__Group_11__2();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_11__1"


    // $ANTLR start "rule__PeriodicActivity__Group_11__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1480:1: rule__PeriodicActivity__Group_11__1__Impl : ( '{' ) ;
    public final void rule__PeriodicActivity__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1484:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1485:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1485:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1486:1: '{'
            {
             before(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__PeriodicActivity__Group_11__1__Impl3030); 
             after(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_11_1()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_11__1__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_11__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1499:1: rule__PeriodicActivity__Group_11__2 : rule__PeriodicActivity__Group_11__2__Impl rule__PeriodicActivity__Group_11__3 ;
    public final void rule__PeriodicActivity__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1503:1: ( rule__PeriodicActivity__Group_11__2__Impl rule__PeriodicActivity__Group_11__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1504:2: rule__PeriodicActivity__Group_11__2__Impl rule__PeriodicActivity__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__2__Impl_in_rule__PeriodicActivity__Group_11__23061);
            rule__PeriodicActivity__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__3_in_rule__PeriodicActivity__Group_11__23064);
            rule__PeriodicActivity__Group_11__3();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_11__2"


    // $ANTLR start "rule__PeriodicActivity__Group_11__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1511:1: rule__PeriodicActivity__Group_11__2__Impl : ( ( rule__PeriodicActivity__ResAllocationAssignment_11_2 ) ) ;
    public final void rule__PeriodicActivity__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1515:1: ( ( ( rule__PeriodicActivity__ResAllocationAssignment_11_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1516:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_11_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1516:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_11_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1517:1: ( rule__PeriodicActivity__ResAllocationAssignment_11_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_11_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1518:1: ( rule__PeriodicActivity__ResAllocationAssignment_11_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1518:2: rule__PeriodicActivity__ResAllocationAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_11_2_in_rule__PeriodicActivity__Group_11__2__Impl3091);
            rule__PeriodicActivity__ResAllocationAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_11_2()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_11__2__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_11__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1528:1: rule__PeriodicActivity__Group_11__3 : rule__PeriodicActivity__Group_11__3__Impl rule__PeriodicActivity__Group_11__4 ;
    public final void rule__PeriodicActivity__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1532:1: ( rule__PeriodicActivity__Group_11__3__Impl rule__PeriodicActivity__Group_11__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1533:2: rule__PeriodicActivity__Group_11__3__Impl rule__PeriodicActivity__Group_11__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__3__Impl_in_rule__PeriodicActivity__Group_11__33121);
            rule__PeriodicActivity__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__4_in_rule__PeriodicActivity__Group_11__33124);
            rule__PeriodicActivity__Group_11__4();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_11__3"


    // $ANTLR start "rule__PeriodicActivity__Group_11__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1540:1: rule__PeriodicActivity__Group_11__3__Impl : ( ( rule__PeriodicActivity__Group_11_3__0 )* ) ;
    public final void rule__PeriodicActivity__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1544:1: ( ( ( rule__PeriodicActivity__Group_11_3__0 )* ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1545:1: ( ( rule__PeriodicActivity__Group_11_3__0 )* )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1545:1: ( ( rule__PeriodicActivity__Group_11_3__0 )* )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1546:1: ( rule__PeriodicActivity__Group_11_3__0 )*
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_11_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1547:1: ( rule__PeriodicActivity__Group_11_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1547:2: rule__PeriodicActivity__Group_11_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11_3__0_in_rule__PeriodicActivity__Group_11__3__Impl3151);
            	    rule__PeriodicActivity__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPeriodicActivityAccess().getGroup_11_3()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_11__3__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_11__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1557:1: rule__PeriodicActivity__Group_11__4 : rule__PeriodicActivity__Group_11__4__Impl rule__PeriodicActivity__Group_11__5 ;
    public final void rule__PeriodicActivity__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1561:1: ( rule__PeriodicActivity__Group_11__4__Impl rule__PeriodicActivity__Group_11__5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1562:2: rule__PeriodicActivity__Group_11__4__Impl rule__PeriodicActivity__Group_11__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__4__Impl_in_rule__PeriodicActivity__Group_11__43182);
            rule__PeriodicActivity__Group_11__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__5_in_rule__PeriodicActivity__Group_11__43185);
            rule__PeriodicActivity__Group_11__5();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_11__4"


    // $ANTLR start "rule__PeriodicActivity__Group_11__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1569:1: rule__PeriodicActivity__Group_11__4__Impl : ( '}' ) ;
    public final void rule__PeriodicActivity__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1573:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1574:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1574:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1575:1: '}'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__PeriodicActivity__Group_11__4__Impl3213); 
             after(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_11_4()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_11__4__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_11__5"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1588:1: rule__PeriodicActivity__Group_11__5 : rule__PeriodicActivity__Group_11__5__Impl ;
    public final void rule__PeriodicActivity__Group_11__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1592:1: ( rule__PeriodicActivity__Group_11__5__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1593:2: rule__PeriodicActivity__Group_11__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__5__Impl_in_rule__PeriodicActivity__Group_11__53244);
            rule__PeriodicActivity__Group_11__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_11__5"


    // $ANTLR start "rule__PeriodicActivity__Group_11__5__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1599:1: rule__PeriodicActivity__Group_11__5__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_11__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1603:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1604:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1604:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1605:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11_5()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__PeriodicActivity__Group_11__5__Impl3272); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11_5()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_11__5__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_11_3__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1630:1: rule__PeriodicActivity__Group_11_3__0 : rule__PeriodicActivity__Group_11_3__0__Impl rule__PeriodicActivity__Group_11_3__1 ;
    public final void rule__PeriodicActivity__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1634:1: ( rule__PeriodicActivity__Group_11_3__0__Impl rule__PeriodicActivity__Group_11_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1635:2: rule__PeriodicActivity__Group_11_3__0__Impl rule__PeriodicActivity__Group_11_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11_3__0__Impl_in_rule__PeriodicActivity__Group_11_3__03315);
            rule__PeriodicActivity__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11_3__1_in_rule__PeriodicActivity__Group_11_3__03318);
            rule__PeriodicActivity__Group_11_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_11_3__0"


    // $ANTLR start "rule__PeriodicActivity__Group_11_3__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1642:1: rule__PeriodicActivity__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1646:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1647:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1647:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1648:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__PeriodicActivity__Group_11_3__0__Impl3346); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11_3_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_11_3__0__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_11_3__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1661:1: rule__PeriodicActivity__Group_11_3__1 : rule__PeriodicActivity__Group_11_3__1__Impl ;
    public final void rule__PeriodicActivity__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1665:1: ( rule__PeriodicActivity__Group_11_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1666:2: rule__PeriodicActivity__Group_11_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11_3__1__Impl_in_rule__PeriodicActivity__Group_11_3__13377);
            rule__PeriodicActivity__Group_11_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_11_3__1"


    // $ANTLR start "rule__PeriodicActivity__Group_11_3__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1672:1: rule__PeriodicActivity__Group_11_3__1__Impl : ( ( rule__PeriodicActivity__ResAllocationAssignment_11_3_1 ) ) ;
    public final void rule__PeriodicActivity__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1676:1: ( ( ( rule__PeriodicActivity__ResAllocationAssignment_11_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1677:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_11_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1677:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_11_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1678:1: ( rule__PeriodicActivity__ResAllocationAssignment_11_3_1 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_11_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1679:1: ( rule__PeriodicActivity__ResAllocationAssignment_11_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1679:2: rule__PeriodicActivity__ResAllocationAssignment_11_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_11_3_1_in_rule__PeriodicActivity__Group_11_3__1__Impl3404);
            rule__PeriodicActivity__ResAllocationAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_11_3_1()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_11_3__1__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_12__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1693:1: rule__PeriodicActivity__Group_12__0 : rule__PeriodicActivity__Group_12__0__Impl rule__PeriodicActivity__Group_12__1 ;
    public final void rule__PeriodicActivity__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1697:1: ( rule__PeriodicActivity__Group_12__0__Impl rule__PeriodicActivity__Group_12__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1698:2: rule__PeriodicActivity__Group_12__0__Impl rule__PeriodicActivity__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__0__Impl_in_rule__PeriodicActivity__Group_12__03438);
            rule__PeriodicActivity__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__1_in_rule__PeriodicActivity__Group_12__03441);
            rule__PeriodicActivity__Group_12__1();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_12__0"


    // $ANTLR start "rule__PeriodicActivity__Group_12__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1705:1: rule__PeriodicActivity__Group_12__0__Impl : ( 'rules' ) ;
    public final void rule__PeriodicActivity__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1709:1: ( ( 'rules' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1710:1: ( 'rules' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1710:1: ( 'rules' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1711:1: 'rules'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRulesKeyword_12_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__PeriodicActivity__Group_12__0__Impl3469); 
             after(grammarAccess.getPeriodicActivityAccess().getRulesKeyword_12_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_12__0__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_12__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1724:1: rule__PeriodicActivity__Group_12__1 : rule__PeriodicActivity__Group_12__1__Impl rule__PeriodicActivity__Group_12__2 ;
    public final void rule__PeriodicActivity__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1728:1: ( rule__PeriodicActivity__Group_12__1__Impl rule__PeriodicActivity__Group_12__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1729:2: rule__PeriodicActivity__Group_12__1__Impl rule__PeriodicActivity__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__1__Impl_in_rule__PeriodicActivity__Group_12__13500);
            rule__PeriodicActivity__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__2_in_rule__PeriodicActivity__Group_12__13503);
            rule__PeriodicActivity__Group_12__2();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_12__1"


    // $ANTLR start "rule__PeriodicActivity__Group_12__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1736:1: rule__PeriodicActivity__Group_12__1__Impl : ( '{' ) ;
    public final void rule__PeriodicActivity__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1740:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1741:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1741:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1742:1: '{'
            {
             before(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__PeriodicActivity__Group_12__1__Impl3531); 
             after(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_12_1()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_12__1__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_12__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1755:1: rule__PeriodicActivity__Group_12__2 : rule__PeriodicActivity__Group_12__2__Impl rule__PeriodicActivity__Group_12__3 ;
    public final void rule__PeriodicActivity__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1759:1: ( rule__PeriodicActivity__Group_12__2__Impl rule__PeriodicActivity__Group_12__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1760:2: rule__PeriodicActivity__Group_12__2__Impl rule__PeriodicActivity__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__2__Impl_in_rule__PeriodicActivity__Group_12__23562);
            rule__PeriodicActivity__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__3_in_rule__PeriodicActivity__Group_12__23565);
            rule__PeriodicActivity__Group_12__3();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_12__2"


    // $ANTLR start "rule__PeriodicActivity__Group_12__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1767:1: rule__PeriodicActivity__Group_12__2__Impl : ( ( rule__PeriodicActivity__RuleAssignment_12_2 ) ) ;
    public final void rule__PeriodicActivity__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1771:1: ( ( ( rule__PeriodicActivity__RuleAssignment_12_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1772:1: ( ( rule__PeriodicActivity__RuleAssignment_12_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1772:1: ( ( rule__PeriodicActivity__RuleAssignment_12_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1773:1: ( rule__PeriodicActivity__RuleAssignment_12_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleAssignment_12_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1774:1: ( rule__PeriodicActivity__RuleAssignment_12_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1774:2: rule__PeriodicActivity__RuleAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__RuleAssignment_12_2_in_rule__PeriodicActivity__Group_12__2__Impl3592);
            rule__PeriodicActivity__RuleAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getRuleAssignment_12_2()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_12__2__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_12__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1784:1: rule__PeriodicActivity__Group_12__3 : rule__PeriodicActivity__Group_12__3__Impl rule__PeriodicActivity__Group_12__4 ;
    public final void rule__PeriodicActivity__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1788:1: ( rule__PeriodicActivity__Group_12__3__Impl rule__PeriodicActivity__Group_12__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1789:2: rule__PeriodicActivity__Group_12__3__Impl rule__PeriodicActivity__Group_12__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__3__Impl_in_rule__PeriodicActivity__Group_12__33622);
            rule__PeriodicActivity__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__4_in_rule__PeriodicActivity__Group_12__33625);
            rule__PeriodicActivity__Group_12__4();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_12__3"


    // $ANTLR start "rule__PeriodicActivity__Group_12__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1796:1: rule__PeriodicActivity__Group_12__3__Impl : ( ( rule__PeriodicActivity__Group_12_3__0 )* ) ;
    public final void rule__PeriodicActivity__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1800:1: ( ( ( rule__PeriodicActivity__Group_12_3__0 )* ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1801:1: ( ( rule__PeriodicActivity__Group_12_3__0 )* )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1801:1: ( ( rule__PeriodicActivity__Group_12_3__0 )* )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1802:1: ( rule__PeriodicActivity__Group_12_3__0 )*
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_12_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1803:1: ( rule__PeriodicActivity__Group_12_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1803:2: rule__PeriodicActivity__Group_12_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12_3__0_in_rule__PeriodicActivity__Group_12__3__Impl3652);
            	    rule__PeriodicActivity__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPeriodicActivityAccess().getGroup_12_3()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_12__3__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_12__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1813:1: rule__PeriodicActivity__Group_12__4 : rule__PeriodicActivity__Group_12__4__Impl ;
    public final void rule__PeriodicActivity__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1817:1: ( rule__PeriodicActivity__Group_12__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1818:2: rule__PeriodicActivity__Group_12__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__4__Impl_in_rule__PeriodicActivity__Group_12__43683);
            rule__PeriodicActivity__Group_12__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_12__4"


    // $ANTLR start "rule__PeriodicActivity__Group_12__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1824:1: rule__PeriodicActivity__Group_12__4__Impl : ( '}' ) ;
    public final void rule__PeriodicActivity__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1828:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1829:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1829:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1830:1: '}'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__PeriodicActivity__Group_12__4__Impl3711); 
             after(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_12_4()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_12__4__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_12_3__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1853:1: rule__PeriodicActivity__Group_12_3__0 : rule__PeriodicActivity__Group_12_3__0__Impl rule__PeriodicActivity__Group_12_3__1 ;
    public final void rule__PeriodicActivity__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1857:1: ( rule__PeriodicActivity__Group_12_3__0__Impl rule__PeriodicActivity__Group_12_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1858:2: rule__PeriodicActivity__Group_12_3__0__Impl rule__PeriodicActivity__Group_12_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12_3__0__Impl_in_rule__PeriodicActivity__Group_12_3__03752);
            rule__PeriodicActivity__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12_3__1_in_rule__PeriodicActivity__Group_12_3__03755);
            rule__PeriodicActivity__Group_12_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_12_3__0"


    // $ANTLR start "rule__PeriodicActivity__Group_12_3__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1865:1: rule__PeriodicActivity__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1869:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1870:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1870:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1871:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_12_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__PeriodicActivity__Group_12_3__0__Impl3783); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_12_3_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_12_3__0__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_12_3__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1884:1: rule__PeriodicActivity__Group_12_3__1 : rule__PeriodicActivity__Group_12_3__1__Impl ;
    public final void rule__PeriodicActivity__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1888:1: ( rule__PeriodicActivity__Group_12_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1889:2: rule__PeriodicActivity__Group_12_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12_3__1__Impl_in_rule__PeriodicActivity__Group_12_3__13814);
            rule__PeriodicActivity__Group_12_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PeriodicActivity__Group_12_3__1"


    // $ANTLR start "rule__PeriodicActivity__Group_12_3__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1895:1: rule__PeriodicActivity__Group_12_3__1__Impl : ( ( rule__PeriodicActivity__RuleAssignment_12_3_1 ) ) ;
    public final void rule__PeriodicActivity__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1899:1: ( ( ( rule__PeriodicActivity__RuleAssignment_12_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1900:1: ( ( rule__PeriodicActivity__RuleAssignment_12_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1900:1: ( ( rule__PeriodicActivity__RuleAssignment_12_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1901:1: ( rule__PeriodicActivity__RuleAssignment_12_3_1 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleAssignment_12_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1902:1: ( rule__PeriodicActivity__RuleAssignment_12_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1902:2: rule__PeriodicActivity__RuleAssignment_12_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__RuleAssignment_12_3_1_in_rule__PeriodicActivity__Group_12_3__1__Impl3841);
            rule__PeriodicActivity__RuleAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getRuleAssignment_12_3_1()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_12_3__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1916:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1920:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1921:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__03875);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1_in_rule__Date__Group__03878);
            rule__Date__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1928:1: rule__Date__Group__0__Impl : ( () ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1932:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1933:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1933:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1934:1: ()
            {
             before(grammarAccess.getDateAccess().getDateAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1935:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1937:1: 
            {
            }

             after(grammarAccess.getDateAccess().getDateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1947:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1951:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1952:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__13936);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2_in_rule__Date__Group__13939);
            rule__Date__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1959:1: rule__Date__Group__1__Impl : ( ( rule__Date__DayAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1963:1: ( ( ( rule__Date__DayAssignment_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1964:1: ( ( rule__Date__DayAssignment_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1964:1: ( ( rule__Date__DayAssignment_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1965:1: ( rule__Date__DayAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1966:1: ( rule__Date__DayAssignment_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1966:2: rule__Date__DayAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl3966);
            rule__Date__DayAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getDayAssignment_1()); 

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
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1976:1: rule__Date__Group__2 : rule__Date__Group__2__Impl ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1980:1: ( rule__Date__Group__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1981:2: rule__Date__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__23996);
            rule__Date__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Date__Group__2"


    // $ANTLR start "rule__Date__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1987:1: rule__Date__Group__2__Impl : ( ( rule__Date__MonthAssignment_2 ) ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1991:1: ( ( ( rule__Date__MonthAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1992:1: ( ( rule__Date__MonthAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1992:1: ( ( rule__Date__MonthAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1993:1: ( rule__Date__MonthAssignment_2 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1994:1: ( rule__Date__MonthAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1994:2: rule__Date__MonthAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__MonthAssignment_2_in_rule__Date__Group__2__Impl4023);
            rule__Date__MonthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getMonthAssignment_2()); 

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
    // $ANTLR end "rule__Date__Group__2__Impl"


    // $ANTLR start "rule__ResAllocation__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2010:1: rule__ResAllocation__Group__0 : rule__ResAllocation__Group__0__Impl rule__ResAllocation__Group__1 ;
    public final void rule__ResAllocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2014:1: ( rule__ResAllocation__Group__0__Impl rule__ResAllocation__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2015:2: rule__ResAllocation__Group__0__Impl rule__ResAllocation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__0__Impl_in_rule__ResAllocation__Group__04059);
            rule__ResAllocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__1_in_rule__ResAllocation__Group__04062);
            rule__ResAllocation__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ResAllocation__Group__0"


    // $ANTLR start "rule__ResAllocation__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2022:1: rule__ResAllocation__Group__0__Impl : ( () ) ;
    public final void rule__ResAllocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2026:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2027:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2027:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2028:1: ()
            {
             before(grammarAccess.getResAllocationAccess().getRessourceAllocationAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2029:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2031:1: 
            {
            }

             after(grammarAccess.getResAllocationAccess().getRessourceAllocationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResAllocation__Group__0__Impl"


    // $ANTLR start "rule__ResAllocation__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2041:1: rule__ResAllocation__Group__1 : rule__ResAllocation__Group__1__Impl rule__ResAllocation__Group__2 ;
    public final void rule__ResAllocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2045:1: ( rule__ResAllocation__Group__1__Impl rule__ResAllocation__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2046:2: rule__ResAllocation__Group__1__Impl rule__ResAllocation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__1__Impl_in_rule__ResAllocation__Group__14120);
            rule__ResAllocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__2_in_rule__ResAllocation__Group__14123);
            rule__ResAllocation__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ResAllocation__Group__1"


    // $ANTLR start "rule__ResAllocation__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2053:1: rule__ResAllocation__Group__1__Impl : ( 'reserve' ) ;
    public final void rule__ResAllocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2057:1: ( ( 'reserve' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2058:1: ( 'reserve' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2058:1: ( 'reserve' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2059:1: 'reserve'
            {
             before(grammarAccess.getResAllocationAccess().getReserveKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__ResAllocation__Group__1__Impl4151); 
             after(grammarAccess.getResAllocationAccess().getReserveKeyword_1()); 

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
    // $ANTLR end "rule__ResAllocation__Group__1__Impl"


    // $ANTLR start "rule__ResAllocation__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2072:1: rule__ResAllocation__Group__2 : rule__ResAllocation__Group__2__Impl rule__ResAllocation__Group__3 ;
    public final void rule__ResAllocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2076:1: ( rule__ResAllocation__Group__2__Impl rule__ResAllocation__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2077:2: rule__ResAllocation__Group__2__Impl rule__ResAllocation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__2__Impl_in_rule__ResAllocation__Group__24182);
            rule__ResAllocation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__3_in_rule__ResAllocation__Group__24185);
            rule__ResAllocation__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__ResAllocation__Group__2"


    // $ANTLR start "rule__ResAllocation__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2084:1: rule__ResAllocation__Group__2__Impl : ( ( rule__ResAllocation__RessourceAssignment_2 ) ) ;
    public final void rule__ResAllocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2088:1: ( ( ( rule__ResAllocation__RessourceAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2089:1: ( ( rule__ResAllocation__RessourceAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2089:1: ( ( rule__ResAllocation__RessourceAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2090:1: ( rule__ResAllocation__RessourceAssignment_2 )
            {
             before(grammarAccess.getResAllocationAccess().getRessourceAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2091:1: ( rule__ResAllocation__RessourceAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2091:2: rule__ResAllocation__RessourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__RessourceAssignment_2_in_rule__ResAllocation__Group__2__Impl4212);
            rule__ResAllocation__RessourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResAllocationAccess().getRessourceAssignment_2()); 

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
    // $ANTLR end "rule__ResAllocation__Group__2__Impl"


    // $ANTLR start "rule__ResAllocation__Group__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2101:1: rule__ResAllocation__Group__3 : rule__ResAllocation__Group__3__Impl rule__ResAllocation__Group__4 ;
    public final void rule__ResAllocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2105:1: ( rule__ResAllocation__Group__3__Impl rule__ResAllocation__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2106:2: rule__ResAllocation__Group__3__Impl rule__ResAllocation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__3__Impl_in_rule__ResAllocation__Group__34242);
            rule__ResAllocation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__4_in_rule__ResAllocation__Group__34245);
            rule__ResAllocation__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__ResAllocation__Group__3"


    // $ANTLR start "rule__ResAllocation__Group__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2113:1: rule__ResAllocation__Group__3__Impl : ( 'for' ) ;
    public final void rule__ResAllocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2117:1: ( ( 'for' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2118:1: ( 'for' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2118:1: ( 'for' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2119:1: 'for'
            {
             before(grammarAccess.getResAllocationAccess().getForKeyword_3()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__ResAllocation__Group__3__Impl4273); 
             after(grammarAccess.getResAllocationAccess().getForKeyword_3()); 

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
    // $ANTLR end "rule__ResAllocation__Group__3__Impl"


    // $ANTLR start "rule__ResAllocation__Group__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2132:1: rule__ResAllocation__Group__4 : rule__ResAllocation__Group__4__Impl rule__ResAllocation__Group__5 ;
    public final void rule__ResAllocation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2136:1: ( rule__ResAllocation__Group__4__Impl rule__ResAllocation__Group__5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2137:2: rule__ResAllocation__Group__4__Impl rule__ResAllocation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__4__Impl_in_rule__ResAllocation__Group__44304);
            rule__ResAllocation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__5_in_rule__ResAllocation__Group__44307);
            rule__ResAllocation__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__ResAllocation__Group__4"


    // $ANTLR start "rule__ResAllocation__Group__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2144:1: rule__ResAllocation__Group__4__Impl : ( ( rule__ResAllocation__DurationAssignment_4 ) ) ;
    public final void rule__ResAllocation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2148:1: ( ( ( rule__ResAllocation__DurationAssignment_4 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2149:1: ( ( rule__ResAllocation__DurationAssignment_4 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2149:1: ( ( rule__ResAllocation__DurationAssignment_4 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2150:1: ( rule__ResAllocation__DurationAssignment_4 )
            {
             before(grammarAccess.getResAllocationAccess().getDurationAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2151:1: ( rule__ResAllocation__DurationAssignment_4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2151:2: rule__ResAllocation__DurationAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__DurationAssignment_4_in_rule__ResAllocation__Group__4__Impl4334);
            rule__ResAllocation__DurationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getResAllocationAccess().getDurationAssignment_4()); 

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
    // $ANTLR end "rule__ResAllocation__Group__4__Impl"


    // $ANTLR start "rule__ResAllocation__Group__5"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2161:1: rule__ResAllocation__Group__5 : rule__ResAllocation__Group__5__Impl ;
    public final void rule__ResAllocation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2165:1: ( rule__ResAllocation__Group__5__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2166:2: rule__ResAllocation__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__5__Impl_in_rule__ResAllocation__Group__54364);
            rule__ResAllocation__Group__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ResAllocation__Group__5"


    // $ANTLR start "rule__ResAllocation__Group__5__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2172:1: rule__ResAllocation__Group__5__Impl : ( ( rule__ResAllocation__PeriodicityTypeAssignment_5 ) ) ;
    public final void rule__ResAllocation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2176:1: ( ( ( rule__ResAllocation__PeriodicityTypeAssignment_5 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2177:1: ( ( rule__ResAllocation__PeriodicityTypeAssignment_5 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2177:1: ( ( rule__ResAllocation__PeriodicityTypeAssignment_5 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2178:1: ( rule__ResAllocation__PeriodicityTypeAssignment_5 )
            {
             before(grammarAccess.getResAllocationAccess().getPeriodicityTypeAssignment_5()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2179:1: ( rule__ResAllocation__PeriodicityTypeAssignment_5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2179:2: rule__ResAllocation__PeriodicityTypeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__PeriodicityTypeAssignment_5_in_rule__ResAllocation__Group__5__Impl4391);
            rule__ResAllocation__PeriodicityTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getResAllocationAccess().getPeriodicityTypeAssignment_5()); 

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
    // $ANTLR end "rule__ResAllocation__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2201:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2205:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2206:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__04433);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__04436);
            rule__Rule__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2213:1: rule__Rule__Group__0__Impl : ( () ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2217:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2218:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2218:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2219:1: ()
            {
             before(grammarAccess.getRuleAccess().getRuleAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2220:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2222:1: 
            {
            }

             after(grammarAccess.getRuleAccess().getRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2232:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2236:1: ( rule__Rule__Group__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2237:2: rule__Rule__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__14494);
            rule__Rule__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2243:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__Group_1__0 )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2247:1: ( ( ( rule__Rule__Group_1__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2248:1: ( ( rule__Rule__Group_1__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2248:1: ( ( rule__Rule__Group_1__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2249:1: ( rule__Rule__Group_1__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2250:1: ( rule__Rule__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2250:2: rule__Rule__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1__0_in_rule__Rule__Group__1__Impl4521);
                    rule__Rule__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group_1__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2264:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2268:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2269:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1__0__Impl_in_rule__Rule__Group_1__04556);
            rule__Rule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1__1_in_rule__Rule__Group_1__04559);
            rule__Rule__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Rule__Group_1__0"


    // $ANTLR start "rule__Rule__Group_1__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2276:1: rule__Rule__Group_1__0__Impl : ( 'pre' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2280:1: ( ( 'pre' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2281:1: ( 'pre' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2281:1: ( 'pre' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2282:1: 'pre'
            {
             before(grammarAccess.getRuleAccess().getPreKeyword_1_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Rule__Group_1__0__Impl4587); 
             after(grammarAccess.getRuleAccess().getPreKeyword_1_0()); 

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
    // $ANTLR end "rule__Rule__Group_1__0__Impl"


    // $ANTLR start "rule__Rule__Group_1__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2295:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl rule__Rule__Group_1__2 ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2299:1: ( rule__Rule__Group_1__1__Impl rule__Rule__Group_1__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2300:2: rule__Rule__Group_1__1__Impl rule__Rule__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1__1__Impl_in_rule__Rule__Group_1__14618);
            rule__Rule__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1__2_in_rule__Rule__Group_1__14621);
            rule__Rule__Group_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__Rule__Group_1__1"


    // $ANTLR start "rule__Rule__Group_1__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2307:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__PreAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2311:1: ( ( ( rule__Rule__PreAssignment_1_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2312:1: ( ( rule__Rule__PreAssignment_1_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2312:1: ( ( rule__Rule__PreAssignment_1_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2313:1: ( rule__Rule__PreAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getPreAssignment_1_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2314:1: ( rule__Rule__PreAssignment_1_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2314:2: rule__Rule__PreAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__PreAssignment_1_1_in_rule__Rule__Group_1__1__Impl4648);
            rule__Rule__PreAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPreAssignment_1_1()); 

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
    // $ANTLR end "rule__Rule__Group_1__1__Impl"


    // $ANTLR start "rule__Rule__Group_1__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2324:1: rule__Rule__Group_1__2 : rule__Rule__Group_1__2__Impl ;
    public final void rule__Rule__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2328:1: ( rule__Rule__Group_1__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2329:2: rule__Rule__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1__2__Impl_in_rule__Rule__Group_1__24678);
            rule__Rule__Group_1__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Rule__Group_1__2"


    // $ANTLR start "rule__Rule__Group_1__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2335:1: rule__Rule__Group_1__2__Impl : ( ( rule__Rule__Group_1_2__0 )* ) ;
    public final void rule__Rule__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2339:1: ( ( ( rule__Rule__Group_1_2__0 )* ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2340:1: ( ( rule__Rule__Group_1_2__0 )* )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2340:1: ( ( rule__Rule__Group_1_2__0 )* )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2341:1: ( rule__Rule__Group_1_2__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_1_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2342:1: ( rule__Rule__Group_1_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==41) ) {
                        int LA13_3 = input.LA(3);

                        if ( (LA13_3==RULE_STRING) ) {
                            alt13=1;
                        }
                        else if ( (LA13_3==RULE_ID) ) {
                            alt13=1;
                        }


                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2342:2: rule__Rule__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1_2__0_in_rule__Rule__Group_1__2__Impl4705);
            	    rule__Rule__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Rule__Group_1__2__Impl"


    // $ANTLR start "rule__Rule__Group_1_2__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2358:1: rule__Rule__Group_1_2__0 : rule__Rule__Group_1_2__0__Impl rule__Rule__Group_1_2__1 ;
    public final void rule__Rule__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2362:1: ( rule__Rule__Group_1_2__0__Impl rule__Rule__Group_1_2__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2363:2: rule__Rule__Group_1_2__0__Impl rule__Rule__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1_2__0__Impl_in_rule__Rule__Group_1_2__04742);
            rule__Rule__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1_2__1_in_rule__Rule__Group_1_2__04745);
            rule__Rule__Group_1_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__Rule__Group_1_2__0"


    // $ANTLR start "rule__Rule__Group_1_2__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2370:1: rule__Rule__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2374:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2375:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2375:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2376:1: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_1_2_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Rule__Group_1_2__0__Impl4773); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Rule__Group_1_2__0__Impl"


    // $ANTLR start "rule__Rule__Group_1_2__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2389:1: rule__Rule__Group_1_2__1 : rule__Rule__Group_1_2__1__Impl rule__Rule__Group_1_2__2 ;
    public final void rule__Rule__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2393:1: ( rule__Rule__Group_1_2__1__Impl rule__Rule__Group_1_2__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2394:2: rule__Rule__Group_1_2__1__Impl rule__Rule__Group_1_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1_2__1__Impl_in_rule__Rule__Group_1_2__14804);
            rule__Rule__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1_2__2_in_rule__Rule__Group_1_2__14807);
            rule__Rule__Group_1_2__2();

            state._fsp--;


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
    // $ANTLR end "rule__Rule__Group_1_2__1"


    // $ANTLR start "rule__Rule__Group_1_2__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2401:1: rule__Rule__Group_1_2__1__Impl : ( 'pre' ) ;
    public final void rule__Rule__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2405:1: ( ( 'pre' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2406:1: ( 'pre' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2406:1: ( 'pre' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2407:1: 'pre'
            {
             before(grammarAccess.getRuleAccess().getPreKeyword_1_2_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Rule__Group_1_2__1__Impl4835); 
             after(grammarAccess.getRuleAccess().getPreKeyword_1_2_1()); 

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
    // $ANTLR end "rule__Rule__Group_1_2__1__Impl"


    // $ANTLR start "rule__Rule__Group_1_2__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2420:1: rule__Rule__Group_1_2__2 : rule__Rule__Group_1_2__2__Impl ;
    public final void rule__Rule__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2424:1: ( rule__Rule__Group_1_2__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2425:2: rule__Rule__Group_1_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1_2__2__Impl_in_rule__Rule__Group_1_2__24866);
            rule__Rule__Group_1_2__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Rule__Group_1_2__2"


    // $ANTLR start "rule__Rule__Group_1_2__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2431:1: rule__Rule__Group_1_2__2__Impl : ( ( rule__Rule__PreAssignment_1_2_2 ) ) ;
    public final void rule__Rule__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2435:1: ( ( ( rule__Rule__PreAssignment_1_2_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2436:1: ( ( rule__Rule__PreAssignment_1_2_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2436:1: ( ( rule__Rule__PreAssignment_1_2_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2437:1: ( rule__Rule__PreAssignment_1_2_2 )
            {
             before(grammarAccess.getRuleAccess().getPreAssignment_1_2_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2438:1: ( rule__Rule__PreAssignment_1_2_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2438:2: rule__Rule__PreAssignment_1_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__PreAssignment_1_2_2_in_rule__Rule__Group_1_2__2__Impl4893);
            rule__Rule__PreAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPreAssignment_1_2_2()); 

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
    // $ANTLR end "rule__Rule__Group_1_2__2__Impl"


    // $ANTLR start "rule__Atelier_Impl__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2454:1: rule__Atelier_Impl__Group__0 : rule__Atelier_Impl__Group__0__Impl rule__Atelier_Impl__Group__1 ;
    public final void rule__Atelier_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2458:1: ( rule__Atelier_Impl__Group__0__Impl rule__Atelier_Impl__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2459:2: rule__Atelier_Impl__Group__0__Impl rule__Atelier_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__0__Impl_in_rule__Atelier_Impl__Group__04929);
            rule__Atelier_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__1_in_rule__Atelier_Impl__Group__04932);
            rule__Atelier_Impl__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Atelier_Impl__Group__0"


    // $ANTLR start "rule__Atelier_Impl__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2466:1: rule__Atelier_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Atelier_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2470:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2471:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2471:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2472:1: ()
            {
             before(grammarAccess.getAtelier_ImplAccess().getAtelierAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2473:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2475:1: 
            {
            }

             after(grammarAccess.getAtelier_ImplAccess().getAtelierAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier_Impl__Group__0__Impl"


    // $ANTLR start "rule__Atelier_Impl__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2485:1: rule__Atelier_Impl__Group__1 : rule__Atelier_Impl__Group__1__Impl rule__Atelier_Impl__Group__2 ;
    public final void rule__Atelier_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2489:1: ( rule__Atelier_Impl__Group__1__Impl rule__Atelier_Impl__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2490:2: rule__Atelier_Impl__Group__1__Impl rule__Atelier_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__1__Impl_in_rule__Atelier_Impl__Group__14990);
            rule__Atelier_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__2_in_rule__Atelier_Impl__Group__14993);
            rule__Atelier_Impl__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Atelier_Impl__Group__1"


    // $ANTLR start "rule__Atelier_Impl__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2497:1: rule__Atelier_Impl__Group__1__Impl : ( 'Atelier' ) ;
    public final void rule__Atelier_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2501:1: ( ( 'Atelier' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2502:1: ( 'Atelier' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2502:1: ( 'Atelier' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2503:1: 'Atelier'
            {
             before(grammarAccess.getAtelier_ImplAccess().getAtelierKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Atelier_Impl__Group__1__Impl5021); 
             after(grammarAccess.getAtelier_ImplAccess().getAtelierKeyword_1()); 

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
    // $ANTLR end "rule__Atelier_Impl__Group__1__Impl"


    // $ANTLR start "rule__Atelier_Impl__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2516:1: rule__Atelier_Impl__Group__2 : rule__Atelier_Impl__Group__2__Impl rule__Atelier_Impl__Group__3 ;
    public final void rule__Atelier_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2520:1: ( rule__Atelier_Impl__Group__2__Impl rule__Atelier_Impl__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2521:2: rule__Atelier_Impl__Group__2__Impl rule__Atelier_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__2__Impl_in_rule__Atelier_Impl__Group__25052);
            rule__Atelier_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__3_in_rule__Atelier_Impl__Group__25055);
            rule__Atelier_Impl__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Atelier_Impl__Group__2"


    // $ANTLR start "rule__Atelier_Impl__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2528:1: rule__Atelier_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Atelier_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2532:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2533:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2533:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2534:1: '{'
            {
             before(grammarAccess.getAtelier_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Atelier_Impl__Group__2__Impl5083); 
             after(grammarAccess.getAtelier_ImplAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Atelier_Impl__Group__2__Impl"


    // $ANTLR start "rule__Atelier_Impl__Group__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2547:1: rule__Atelier_Impl__Group__3 : rule__Atelier_Impl__Group__3__Impl rule__Atelier_Impl__Group__4 ;
    public final void rule__Atelier_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2551:1: ( rule__Atelier_Impl__Group__3__Impl rule__Atelier_Impl__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2552:2: rule__Atelier_Impl__Group__3__Impl rule__Atelier_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__3__Impl_in_rule__Atelier_Impl__Group__35114);
            rule__Atelier_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__4_in_rule__Atelier_Impl__Group__35117);
            rule__Atelier_Impl__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Atelier_Impl__Group__3"


    // $ANTLR start "rule__Atelier_Impl__Group__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2559:1: rule__Atelier_Impl__Group__3__Impl : ( ( rule__Atelier_Impl__Group_3__0 )? ) ;
    public final void rule__Atelier_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2563:1: ( ( ( rule__Atelier_Impl__Group_3__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2564:1: ( ( rule__Atelier_Impl__Group_3__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2564:1: ( ( rule__Atelier_Impl__Group_3__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2565:1: ( rule__Atelier_Impl__Group_3__0 )?
            {
             before(grammarAccess.getAtelier_ImplAccess().getGroup_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2566:1: ( rule__Atelier_Impl__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2566:2: rule__Atelier_Impl__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__0_in_rule__Atelier_Impl__Group__3__Impl5144);
                    rule__Atelier_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtelier_ImplAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Atelier_Impl__Group__3__Impl"


    // $ANTLR start "rule__Atelier_Impl__Group__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2576:1: rule__Atelier_Impl__Group__4 : rule__Atelier_Impl__Group__4__Impl ;
    public final void rule__Atelier_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2580:1: ( rule__Atelier_Impl__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2581:2: rule__Atelier_Impl__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__4__Impl_in_rule__Atelier_Impl__Group__45175);
            rule__Atelier_Impl__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Atelier_Impl__Group__4"


    // $ANTLR start "rule__Atelier_Impl__Group__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2587:1: rule__Atelier_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__Atelier_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2591:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2592:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2592:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2593:1: '}'
            {
             before(grammarAccess.getAtelier_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Atelier_Impl__Group__4__Impl5203); 
             after(grammarAccess.getAtelier_ImplAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Atelier_Impl__Group__4__Impl"


    // $ANTLR start "rule__Atelier_Impl__Group_3__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2616:1: rule__Atelier_Impl__Group_3__0 : rule__Atelier_Impl__Group_3__0__Impl rule__Atelier_Impl__Group_3__1 ;
    public final void rule__Atelier_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2620:1: ( rule__Atelier_Impl__Group_3__0__Impl rule__Atelier_Impl__Group_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2621:2: rule__Atelier_Impl__Group_3__0__Impl rule__Atelier_Impl__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__0__Impl_in_rule__Atelier_Impl__Group_3__05244);
            rule__Atelier_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__1_in_rule__Atelier_Impl__Group_3__05247);
            rule__Atelier_Impl__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__Atelier_Impl__Group_3__0"


    // $ANTLR start "rule__Atelier_Impl__Group_3__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2628:1: rule__Atelier_Impl__Group_3__0__Impl : ( 'activity' ) ;
    public final void rule__Atelier_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2632:1: ( ( 'activity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2633:1: ( 'activity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2633:1: ( 'activity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2634:1: 'activity'
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityKeyword_3_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Atelier_Impl__Group_3__0__Impl5275); 
             after(grammarAccess.getAtelier_ImplAccess().getActivityKeyword_3_0()); 

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
    // $ANTLR end "rule__Atelier_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__Atelier_Impl__Group_3__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2647:1: rule__Atelier_Impl__Group_3__1 : rule__Atelier_Impl__Group_3__1__Impl ;
    public final void rule__Atelier_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2651:1: ( rule__Atelier_Impl__Group_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2652:2: rule__Atelier_Impl__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__1__Impl_in_rule__Atelier_Impl__Group_3__15306);
            rule__Atelier_Impl__Group_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Atelier_Impl__Group_3__1"


    // $ANTLR start "rule__Atelier_Impl__Group_3__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2658:1: rule__Atelier_Impl__Group_3__1__Impl : ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) ) ;
    public final void rule__Atelier_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2662:1: ( ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2663:1: ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2663:1: ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2664:1: ( rule__Atelier_Impl__ActivityAssignment_3_1 )
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityAssignment_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2665:1: ( rule__Atelier_Impl__ActivityAssignment_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2665:2: rule__Atelier_Impl__ActivityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__ActivityAssignment_3_1_in_rule__Atelier_Impl__Group_3__1__Impl5333);
            rule__Atelier_Impl__ActivityAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtelier_ImplAccess().getActivityAssignment_3_1()); 

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
    // $ANTLR end "rule__Atelier_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2679:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2683:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2684:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05367);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05370);
            rule__EInt__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2691:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2695:1: ( ( ( '-' )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2696:1: ( ( '-' )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2696:1: ( ( '-' )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2697:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2698:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2699:2: '-'
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_rule__EInt__Group__0__Impl5399); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2710:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2714:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2715:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15432);
            rule__EInt__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2721:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2725:1: ( ( RULE_INT ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2726:1: ( RULE_INT )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2726:1: ( RULE_INT )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2727:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5459); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Predicate__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2743:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2747:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2748:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group__0__Impl_in_rule__Predicate__Group__05493);
            rule__Predicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group__1_in_rule__Predicate__Group__05496);
            rule__Predicate__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Predicate__Group__0"


    // $ANTLR start "rule__Predicate__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2755:1: rule__Predicate__Group__0__Impl : ( () ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2759:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2760:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2760:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2761:1: ()
            {
             before(grammarAccess.getPredicateAccess().getPredicatAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2762:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2764:1: 
            {
            }

             after(grammarAccess.getPredicateAccess().getPredicatAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group__0__Impl"


    // $ANTLR start "rule__Predicate__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2774:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2778:1: ( rule__Predicate__Group__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2779:2: rule__Predicate__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group__1__Impl_in_rule__Predicate__Group__15554);
            rule__Predicate__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Predicate__Group__1"


    // $ANTLR start "rule__Predicate__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2785:1: rule__Predicate__Group__1__Impl : ( ruleEString ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2789:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2790:1: ( ruleEString )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2790:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2791:1: ruleEString
            {
             before(grammarAccess.getPredicateAccess().getEStringParserRuleCall_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Predicate__Group__1__Impl5581);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getEStringParserRuleCall_1()); 

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
    // $ANTLR end "rule__Predicate__Group__1__Impl"


    // $ANTLR start "rule__Elevage__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2806:1: rule__Elevage__Group__0 : rule__Elevage__Group__0__Impl rule__Elevage__Group__1 ;
    public final void rule__Elevage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2810:1: ( rule__Elevage__Group__0__Impl rule__Elevage__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2811:2: rule__Elevage__Group__0__Impl rule__Elevage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__0__Impl_in_rule__Elevage__Group__05614);
            rule__Elevage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__1_in_rule__Elevage__Group__05617);
            rule__Elevage__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Elevage__Group__0"


    // $ANTLR start "rule__Elevage__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2818:1: rule__Elevage__Group__0__Impl : ( () ) ;
    public final void rule__Elevage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2822:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2823:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2823:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2824:1: ()
            {
             before(grammarAccess.getElevageAccess().getElevageAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2825:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2827:1: 
            {
            }

             after(grammarAccess.getElevageAccess().getElevageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elevage__Group__0__Impl"


    // $ANTLR start "rule__Elevage__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2837:1: rule__Elevage__Group__1 : rule__Elevage__Group__1__Impl rule__Elevage__Group__2 ;
    public final void rule__Elevage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2841:1: ( rule__Elevage__Group__1__Impl rule__Elevage__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2842:2: rule__Elevage__Group__1__Impl rule__Elevage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__1__Impl_in_rule__Elevage__Group__15675);
            rule__Elevage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__2_in_rule__Elevage__Group__15678);
            rule__Elevage__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Elevage__Group__1"


    // $ANTLR start "rule__Elevage__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2849:1: rule__Elevage__Group__1__Impl : ( 'Elevage' ) ;
    public final void rule__Elevage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2853:1: ( ( 'Elevage' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2854:1: ( 'Elevage' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2854:1: ( 'Elevage' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2855:1: 'Elevage'
            {
             before(grammarAccess.getElevageAccess().getElevageKeyword_1()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Elevage__Group__1__Impl5706); 
             after(grammarAccess.getElevageAccess().getElevageKeyword_1()); 

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
    // $ANTLR end "rule__Elevage__Group__1__Impl"


    // $ANTLR start "rule__Elevage__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2868:1: rule__Elevage__Group__2 : rule__Elevage__Group__2__Impl rule__Elevage__Group__3 ;
    public final void rule__Elevage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2872:1: ( rule__Elevage__Group__2__Impl rule__Elevage__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2873:2: rule__Elevage__Group__2__Impl rule__Elevage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__2__Impl_in_rule__Elevage__Group__25737);
            rule__Elevage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__3_in_rule__Elevage__Group__25740);
            rule__Elevage__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Elevage__Group__2"


    // $ANTLR start "rule__Elevage__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2880:1: rule__Elevage__Group__2__Impl : ( '{' ) ;
    public final void rule__Elevage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2884:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2885:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2885:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2886:1: '{'
            {
             before(grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Elevage__Group__2__Impl5768); 
             after(grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Elevage__Group__2__Impl"


    // $ANTLR start "rule__Elevage__Group__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2899:1: rule__Elevage__Group__3 : rule__Elevage__Group__3__Impl rule__Elevage__Group__4 ;
    public final void rule__Elevage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2903:1: ( rule__Elevage__Group__3__Impl rule__Elevage__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2904:2: rule__Elevage__Group__3__Impl rule__Elevage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__3__Impl_in_rule__Elevage__Group__35799);
            rule__Elevage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__4_in_rule__Elevage__Group__35802);
            rule__Elevage__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Elevage__Group__3"


    // $ANTLR start "rule__Elevage__Group__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2911:1: rule__Elevage__Group__3__Impl : ( ( rule__Elevage__Group_3__0 )? ) ;
    public final void rule__Elevage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2915:1: ( ( ( rule__Elevage__Group_3__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2916:1: ( ( rule__Elevage__Group_3__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2916:1: ( ( rule__Elevage__Group_3__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2917:1: ( rule__Elevage__Group_3__0 )?
            {
             before(grammarAccess.getElevageAccess().getGroup_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2918:1: ( rule__Elevage__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2918:2: rule__Elevage__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__0_in_rule__Elevage__Group__3__Impl5829);
                    rule__Elevage__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElevageAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Elevage__Group__3__Impl"


    // $ANTLR start "rule__Elevage__Group__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2928:1: rule__Elevage__Group__4 : rule__Elevage__Group__4__Impl ;
    public final void rule__Elevage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2932:1: ( rule__Elevage__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2933:2: rule__Elevage__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__4__Impl_in_rule__Elevage__Group__45860);
            rule__Elevage__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Elevage__Group__4"


    // $ANTLR start "rule__Elevage__Group__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2939:1: rule__Elevage__Group__4__Impl : ( '}' ) ;
    public final void rule__Elevage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2943:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2944:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2944:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2945:1: '}'
            {
             before(grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Elevage__Group__4__Impl5888); 
             after(grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Elevage__Group__4__Impl"


    // $ANTLR start "rule__Elevage__Group_3__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2968:1: rule__Elevage__Group_3__0 : rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1 ;
    public final void rule__Elevage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2972:1: ( rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2973:2: rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__0__Impl_in_rule__Elevage__Group_3__05929);
            rule__Elevage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__1_in_rule__Elevage__Group_3__05932);
            rule__Elevage__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__Elevage__Group_3__0"


    // $ANTLR start "rule__Elevage__Group_3__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2980:1: rule__Elevage__Group_3__0__Impl : ( 'activity' ) ;
    public final void rule__Elevage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2984:1: ( ( 'activity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2985:1: ( 'activity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2985:1: ( 'activity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2986:1: 'activity'
            {
             before(grammarAccess.getElevageAccess().getActivityKeyword_3_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Elevage__Group_3__0__Impl5960); 
             after(grammarAccess.getElevageAccess().getActivityKeyword_3_0()); 

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
    // $ANTLR end "rule__Elevage__Group_3__0__Impl"


    // $ANTLR start "rule__Elevage__Group_3__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2999:1: rule__Elevage__Group_3__1 : rule__Elevage__Group_3__1__Impl ;
    public final void rule__Elevage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3003:1: ( rule__Elevage__Group_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3004:2: rule__Elevage__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__1__Impl_in_rule__Elevage__Group_3__15991);
            rule__Elevage__Group_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Elevage__Group_3__1"


    // $ANTLR start "rule__Elevage__Group_3__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3010:1: rule__Elevage__Group_3__1__Impl : ( ( rule__Elevage__ActivityAssignment_3_1 ) ) ;
    public final void rule__Elevage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3014:1: ( ( ( rule__Elevage__ActivityAssignment_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3015:1: ( ( rule__Elevage__ActivityAssignment_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3015:1: ( ( rule__Elevage__ActivityAssignment_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3016:1: ( rule__Elevage__ActivityAssignment_3_1 )
            {
             before(grammarAccess.getElevageAccess().getActivityAssignment_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3017:1: ( rule__Elevage__ActivityAssignment_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3017:2: rule__Elevage__ActivityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__ActivityAssignment_3_1_in_rule__Elevage__Group_3__1__Impl6018);
            rule__Elevage__ActivityAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElevageAccess().getActivityAssignment_3_1()); 

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
    // $ANTLR end "rule__Elevage__Group_3__1__Impl"


    // $ANTLR start "rule__Culture__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3031:1: rule__Culture__Group__0 : rule__Culture__Group__0__Impl rule__Culture__Group__1 ;
    public final void rule__Culture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3035:1: ( rule__Culture__Group__0__Impl rule__Culture__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3036:2: rule__Culture__Group__0__Impl rule__Culture__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__06052);
            rule__Culture__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__06055);
            rule__Culture__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Culture__Group__0"


    // $ANTLR start "rule__Culture__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3043:1: rule__Culture__Group__0__Impl : ( () ) ;
    public final void rule__Culture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3047:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3048:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3048:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3049:1: ()
            {
             before(grammarAccess.getCultureAccess().getCultureAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3050:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3052:1: 
            {
            }

             after(grammarAccess.getCultureAccess().getCultureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Culture__Group__0__Impl"


    // $ANTLR start "rule__Culture__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3062:1: rule__Culture__Group__1 : rule__Culture__Group__1__Impl rule__Culture__Group__2 ;
    public final void rule__Culture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3066:1: ( rule__Culture__Group__1__Impl rule__Culture__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3067:2: rule__Culture__Group__1__Impl rule__Culture__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__16113);
            rule__Culture__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__16116);
            rule__Culture__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Culture__Group__1"


    // $ANTLR start "rule__Culture__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3074:1: rule__Culture__Group__1__Impl : ( 'Culture' ) ;
    public final void rule__Culture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3078:1: ( ( 'Culture' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3079:1: ( 'Culture' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3079:1: ( 'Culture' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3080:1: 'Culture'
            {
             before(grammarAccess.getCultureAccess().getCultureKeyword_1()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Culture__Group__1__Impl6144); 
             after(grammarAccess.getCultureAccess().getCultureKeyword_1()); 

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
    // $ANTLR end "rule__Culture__Group__1__Impl"


    // $ANTLR start "rule__Culture__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3093:1: rule__Culture__Group__2 : rule__Culture__Group__2__Impl rule__Culture__Group__3 ;
    public final void rule__Culture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3097:1: ( rule__Culture__Group__2__Impl rule__Culture__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3098:2: rule__Culture__Group__2__Impl rule__Culture__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__26175);
            rule__Culture__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__26178);
            rule__Culture__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Culture__Group__2"


    // $ANTLR start "rule__Culture__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3105:1: rule__Culture__Group__2__Impl : ( '{' ) ;
    public final void rule__Culture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3109:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3110:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3110:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3111:1: '{'
            {
             before(grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Culture__Group__2__Impl6206); 
             after(grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Culture__Group__2__Impl"


    // $ANTLR start "rule__Culture__Group__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3124:1: rule__Culture__Group__3 : rule__Culture__Group__3__Impl rule__Culture__Group__4 ;
    public final void rule__Culture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3128:1: ( rule__Culture__Group__3__Impl rule__Culture__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3129:2: rule__Culture__Group__3__Impl rule__Culture__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__36237);
            rule__Culture__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__36240);
            rule__Culture__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Culture__Group__3"


    // $ANTLR start "rule__Culture__Group__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3136:1: rule__Culture__Group__3__Impl : ( ( rule__Culture__Group_3__0 )? ) ;
    public final void rule__Culture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3140:1: ( ( ( rule__Culture__Group_3__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3141:1: ( ( rule__Culture__Group_3__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3141:1: ( ( rule__Culture__Group_3__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3142:1: ( rule__Culture__Group_3__0 )?
            {
             before(grammarAccess.getCultureAccess().getGroup_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3143:1: ( rule__Culture__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3143:2: rule__Culture__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__0_in_rule__Culture__Group__3__Impl6267);
                    rule__Culture__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCultureAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Culture__Group__3__Impl"


    // $ANTLR start "rule__Culture__Group__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3153:1: rule__Culture__Group__4 : rule__Culture__Group__4__Impl ;
    public final void rule__Culture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3157:1: ( rule__Culture__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3158:2: rule__Culture__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__46298);
            rule__Culture__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Culture__Group__4"


    // $ANTLR start "rule__Culture__Group__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3164:1: rule__Culture__Group__4__Impl : ( '}' ) ;
    public final void rule__Culture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3168:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3169:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3169:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3170:1: '}'
            {
             before(grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Culture__Group__4__Impl6326); 
             after(grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Culture__Group__4__Impl"


    // $ANTLR start "rule__Culture__Group_3__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3193:1: rule__Culture__Group_3__0 : rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1 ;
    public final void rule__Culture__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3197:1: ( rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3198:2: rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__0__Impl_in_rule__Culture__Group_3__06367);
            rule__Culture__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__1_in_rule__Culture__Group_3__06370);
            rule__Culture__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__Culture__Group_3__0"


    // $ANTLR start "rule__Culture__Group_3__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3205:1: rule__Culture__Group_3__0__Impl : ( 'activity' ) ;
    public final void rule__Culture__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3209:1: ( ( 'activity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3210:1: ( 'activity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3210:1: ( 'activity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3211:1: 'activity'
            {
             before(grammarAccess.getCultureAccess().getActivityKeyword_3_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Culture__Group_3__0__Impl6398); 
             after(grammarAccess.getCultureAccess().getActivityKeyword_3_0()); 

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
    // $ANTLR end "rule__Culture__Group_3__0__Impl"


    // $ANTLR start "rule__Culture__Group_3__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3224:1: rule__Culture__Group_3__1 : rule__Culture__Group_3__1__Impl ;
    public final void rule__Culture__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3228:1: ( rule__Culture__Group_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3229:2: rule__Culture__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__1__Impl_in_rule__Culture__Group_3__16429);
            rule__Culture__Group_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Culture__Group_3__1"


    // $ANTLR start "rule__Culture__Group_3__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3235:1: rule__Culture__Group_3__1__Impl : ( ( rule__Culture__ActivityAssignment_3_1 ) ) ;
    public final void rule__Culture__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3239:1: ( ( ( rule__Culture__ActivityAssignment_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3240:1: ( ( rule__Culture__ActivityAssignment_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3240:1: ( ( rule__Culture__ActivityAssignment_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3241:1: ( rule__Culture__ActivityAssignment_3_1 )
            {
             before(grammarAccess.getCultureAccess().getActivityAssignment_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3242:1: ( rule__Culture__ActivityAssignment_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3242:2: rule__Culture__ActivityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__ActivityAssignment_3_1_in_rule__Culture__Group_3__1__Impl6456);
            rule__Culture__ActivityAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCultureAccess().getActivityAssignment_3_1()); 

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
    // $ANTLR end "rule__Culture__Group_3__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3257:1: rule__Model__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3261:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3262:1: ( ruleEString )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3262:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3263:1: ruleEString
            {
             before(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Model__NameAssignment_26495);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_2"


    // $ANTLR start "rule__Model__ActivityAssignment_4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3272:1: rule__Model__ActivityAssignment_4 : ( rulePeriodicActivity ) ;
    public final void rule__Model__ActivityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3276:1: ( ( rulePeriodicActivity ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3277:1: ( rulePeriodicActivity )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3277:1: ( rulePeriodicActivity )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3278:1: rulePeriodicActivity
            {
             before(grammarAccess.getModelAccess().getActivityPeriodicActivityParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicActivity_in_rule__Model__ActivityAssignment_46526);
            rulePeriodicActivity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getActivityPeriodicActivityParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Model__ActivityAssignment_4"


    // $ANTLR start "rule__PeriodicActivity__NameAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3287:1: rule__PeriodicActivity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PeriodicActivity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3291:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3292:1: ( ruleEString )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3292:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3293:1: ruleEString
            {
             before(grammarAccess.getPeriodicActivityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeriodicActivity__NameAssignment_26557);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__NameAssignment_2"


    // $ANTLR start "rule__PeriodicActivity__AtelierAssignment_4_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3302:1: rule__PeriodicActivity__AtelierAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__PeriodicActivity__AtelierAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3306:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3307:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3307:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3308:1: ( ruleEString )
            {
             before(grammarAccess.getPeriodicActivityAccess().getAtelierAtelierCrossReference_4_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3309:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3310:1: ruleEString
            {
             before(grammarAccess.getPeriodicActivityAccess().getAtelierAtelierEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeriodicActivity__AtelierAssignment_4_16592);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getAtelierAtelierEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getPeriodicActivityAccess().getAtelierAtelierCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__AtelierAssignment_4_1"


    // $ANTLR start "rule__PeriodicActivity__StartAssignment_6"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3321:1: rule__PeriodicActivity__StartAssignment_6 : ( ruleDate ) ;
    public final void rule__PeriodicActivity__StartAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3325:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3326:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3326:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3327:1: ruleDate
            {
             before(grammarAccess.getPeriodicActivityAccess().getStartDateParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__PeriodicActivity__StartAssignment_66627);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getStartDateParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__StartAssignment_6"


    // $ANTLR start "rule__PeriodicActivity__EndAssignment_8"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3336:1: rule__PeriodicActivity__EndAssignment_8 : ( ruleDate ) ;
    public final void rule__PeriodicActivity__EndAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3340:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3341:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3341:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3342:1: ruleDate
            {
             before(grammarAccess.getPeriodicActivityAccess().getEndDateParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__PeriodicActivity__EndAssignment_86658);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getEndDateParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__EndAssignment_8"


    // $ANTLR start "rule__PeriodicActivity__FrequencyAssignment_10_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3351:1: rule__PeriodicActivity__FrequencyAssignment_10_1 : ( ruleEInt ) ;
    public final void rule__PeriodicActivity__FrequencyAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3355:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3356:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3356:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3357:1: ruleEInt
            {
             before(grammarAccess.getPeriodicActivityAccess().getFrequencyEIntParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__PeriodicActivity__FrequencyAssignment_10_16689);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getFrequencyEIntParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__FrequencyAssignment_10_1"


    // $ANTLR start "rule__PeriodicActivity__PeriodicityTypeAssignment_10_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3366:1: rule__PeriodicActivity__PeriodicityTypeAssignment_10_2 : ( rulePeriodicity ) ;
    public final void rule__PeriodicActivity__PeriodicityTypeAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3370:1: ( ( rulePeriodicity ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3371:1: ( rulePeriodicity )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3371:1: ( rulePeriodicity )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3372:1: rulePeriodicity
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_rule__PeriodicActivity__PeriodicityTypeAssignment_10_26720);
            rulePeriodicity();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__PeriodicityTypeAssignment_10_2"


    // $ANTLR start "rule__PeriodicActivity__ResAllocationAssignment_11_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3381:1: rule__PeriodicActivity__ResAllocationAssignment_11_2 : ( ruleResAllocation ) ;
    public final void rule__PeriodicActivity__ResAllocationAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3385:1: ( ( ruleResAllocation ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3386:1: ( ruleResAllocation )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3386:1: ( ruleResAllocation )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3387:1: ruleResAllocation
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_11_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_11_26751);
            ruleResAllocation();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_11_2_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__ResAllocationAssignment_11_2"


    // $ANTLR start "rule__PeriodicActivity__ResAllocationAssignment_11_3_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3396:1: rule__PeriodicActivity__ResAllocationAssignment_11_3_1 : ( ruleResAllocation ) ;
    public final void rule__PeriodicActivity__ResAllocationAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3400:1: ( ( ruleResAllocation ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3401:1: ( ruleResAllocation )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3401:1: ( ruleResAllocation )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3402:1: ruleResAllocation
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_11_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_11_3_16782);
            ruleResAllocation();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_11_3_1_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__ResAllocationAssignment_11_3_1"


    // $ANTLR start "rule__PeriodicActivity__RuleAssignment_12_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3411:1: rule__PeriodicActivity__RuleAssignment_12_2 : ( ruleRule ) ;
    public final void rule__PeriodicActivity__RuleAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3415:1: ( ( ruleRule ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3416:1: ( ruleRule )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3416:1: ( ruleRule )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3417:1: ruleRule
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__PeriodicActivity__RuleAssignment_12_26813);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_12_2_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__RuleAssignment_12_2"


    // $ANTLR start "rule__PeriodicActivity__RuleAssignment_12_3_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3426:1: rule__PeriodicActivity__RuleAssignment_12_3_1 : ( ruleRule ) ;
    public final void rule__PeriodicActivity__RuleAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3430:1: ( ( ruleRule ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3431:1: ( ruleRule )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3431:1: ( ruleRule )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3432:1: ruleRule
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_12_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__PeriodicActivity__RuleAssignment_12_3_16844);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_12_3_1_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__RuleAssignment_12_3_1"


    // $ANTLR start "rule__Date__DayAssignment_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3441:1: rule__Date__DayAssignment_1 : ( ruleEInt ) ;
    public final void rule__Date__DayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3445:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3446:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3446:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3447:1: ruleEInt
            {
             before(grammarAccess.getDateAccess().getDayEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Date__DayAssignment_16875);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDateAccess().getDayEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Date__DayAssignment_1"


    // $ANTLR start "rule__Date__MonthAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3456:1: rule__Date__MonthAssignment_2 : ( ruleMonth ) ;
    public final void rule__Date__MonthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3460:1: ( ( ruleMonth ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3461:1: ( ruleMonth )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3461:1: ( ruleMonth )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3462:1: ruleMonth
            {
             before(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMonth_in_rule__Date__MonthAssignment_26906);
            ruleMonth();

            state._fsp--;

             after(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Date__MonthAssignment_2"


    // $ANTLR start "rule__ResAllocation__RessourceAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3471:1: rule__ResAllocation__RessourceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__ResAllocation__RessourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3475:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3476:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3476:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3477:1: ( ruleEString )
            {
             before(grammarAccess.getResAllocationAccess().getRessourceRessourceCrossReference_2_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3478:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3479:1: ruleEString
            {
             before(grammarAccess.getResAllocationAccess().getRessourceRessourceEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ResAllocation__RessourceAssignment_26941);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResAllocationAccess().getRessourceRessourceEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getResAllocationAccess().getRessourceRessourceCrossReference_2_0()); 

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
    // $ANTLR end "rule__ResAllocation__RessourceAssignment_2"


    // $ANTLR start "rule__ResAllocation__DurationAssignment_4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3490:1: rule__ResAllocation__DurationAssignment_4 : ( ruleEInt ) ;
    public final void rule__ResAllocation__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3494:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3495:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3495:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3496:1: ruleEInt
            {
             before(grammarAccess.getResAllocationAccess().getDurationEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ResAllocation__DurationAssignment_46976);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getResAllocationAccess().getDurationEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ResAllocation__DurationAssignment_4"


    // $ANTLR start "rule__ResAllocation__PeriodicityTypeAssignment_5"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3505:1: rule__ResAllocation__PeriodicityTypeAssignment_5 : ( rulePeriodicity ) ;
    public final void rule__ResAllocation__PeriodicityTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3509:1: ( ( rulePeriodicity ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3510:1: ( rulePeriodicity )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3510:1: ( rulePeriodicity )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3511:1: rulePeriodicity
            {
             before(grammarAccess.getResAllocationAccess().getPeriodicityTypePeriodicityEnumRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_rule__ResAllocation__PeriodicityTypeAssignment_57007);
            rulePeriodicity();

            state._fsp--;

             after(grammarAccess.getResAllocationAccess().getPeriodicityTypePeriodicityEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__ResAllocation__PeriodicityTypeAssignment_5"


    // $ANTLR start "rule__Rule__PreAssignment_1_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3520:1: rule__Rule__PreAssignment_1_1 : ( rulePredicate ) ;
    public final void rule__Rule__PreAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3524:1: ( ( rulePredicate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3525:1: ( rulePredicate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3525:1: ( rulePredicate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3526:1: rulePredicate
            {
             before(grammarAccess.getRuleAccess().getPrePredicateParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_rule__Rule__PreAssignment_1_17038);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPrePredicateParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Rule__PreAssignment_1_1"


    // $ANTLR start "rule__Rule__PreAssignment_1_2_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3535:1: rule__Rule__PreAssignment_1_2_2 : ( rulePredicate ) ;
    public final void rule__Rule__PreAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3539:1: ( ( rulePredicate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3540:1: ( rulePredicate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3540:1: ( rulePredicate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3541:1: rulePredicate
            {
             before(grammarAccess.getRuleAccess().getPrePredicateParserRuleCall_1_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_rule__Rule__PreAssignment_1_2_27069);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPrePredicateParserRuleCall_1_2_2_0()); 

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
    // $ANTLR end "rule__Rule__PreAssignment_1_2_2"


    // $ANTLR start "rule__Atelier_Impl__ActivityAssignment_3_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3550:1: rule__Atelier_Impl__ActivityAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Atelier_Impl__ActivityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3554:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3555:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3555:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3556:1: ( ruleEString )
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3557:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3558:1: ruleEString
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Atelier_Impl__ActivityAssignment_3_17104);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtelier_ImplAccess().getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAtelier_ImplAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Atelier_Impl__ActivityAssignment_3_1"


    // $ANTLR start "rule__Elevage__ActivityAssignment_3_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3570:1: rule__Elevage__ActivityAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Elevage__ActivityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3574:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3575:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3575:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3576:1: ( ruleEString )
            {
             before(grammarAccess.getElevageAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3577:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3578:1: ruleEString
            {
             before(grammarAccess.getElevageAccess().getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Elevage__ActivityAssignment_3_17144);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getElevageAccess().getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getElevageAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Elevage__ActivityAssignment_3_1"


    // $ANTLR start "rule__Culture__ActivityAssignment_3_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3589:1: rule__Culture__ActivityAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Culture__ActivityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3593:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3594:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3594:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3595:1: ( ruleEString )
            {
             before(grammarAccess.getCultureAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3596:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3597:1: ruleEString
            {
             before(grammarAccess.getCultureAccess().getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Culture__ActivityAssignment_3_17183);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCultureAccess().getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getCultureAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Culture__ActivityAssignment_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicActivity_in_entryRulePeriodicActivity121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePeriodicActivity128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__0_in_rulePeriodicActivity154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0_in_ruleDate216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_entryRuleResAllocation243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResAllocation250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__0_in_ruleResAllocation276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtelier_Impl430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__0_in_ruleAtelier_Impl456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate545 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicate552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Group__0_in_rulePredicate578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElevage_in_entryRuleElevage605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElevage612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__0_in_ruleElevage638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCulture_in_entryRuleCulture665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCulture672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__0_in_ruleCulture698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Periodicity__Alternatives_in_rulePeriodicity735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Month__Alternatives_in_ruleMonth771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Periodicity__Alternatives857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Periodicity__Alternatives878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Periodicity__Alternatives899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Periodicity__Alternatives920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Periodicity__Alternatives941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Month__Alternatives977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Month__Alternatives998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Month__Alternatives1019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Month__Alternatives1040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Month__Alternatives1061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Month__Alternatives1082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Month__Alternatives1103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Month__Alternatives1124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Month__Alternatives1145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Month__Alternatives1166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Month__Alternatives1187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Month__Alternatives1208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01241 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11302 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Model__Group__1__Impl1333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21364 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl1394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31424 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Model__Group__3__Impl1455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41486 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ActivityAssignment_4_in_rule__Model__Group__4__Impl1516 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Model__Group__5__Impl1575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__0__Impl_in_rule__PeriodicActivity__Group__01618 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__1_in_rule__PeriodicActivity__Group__01621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__1__Impl_in_rule__PeriodicActivity__Group__11679 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__2_in_rule__PeriodicActivity__Group__11682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__PeriodicActivity__Group__1__Impl1710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__2__Impl_in_rule__PeriodicActivity__Group__21741 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__3_in_rule__PeriodicActivity__Group__21744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__NameAssignment_2_in_rule__PeriodicActivity__Group__2__Impl1771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__3__Impl_in_rule__PeriodicActivity__Group__31801 = new BitSet(new long[]{0x0000000900000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__4_in_rule__PeriodicActivity__Group__31804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__PeriodicActivity__Group__3__Impl1832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__4__Impl_in_rule__PeriodicActivity__Group__41863 = new BitSet(new long[]{0x0000000900000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__5_in_rule__PeriodicActivity__Group__41866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__0_in_rule__PeriodicActivity__Group__4__Impl1893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__5__Impl_in_rule__PeriodicActivity__Group__51924 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__6_in_rule__PeriodicActivity__Group__51927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__PeriodicActivity__Group__5__Impl1955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__6__Impl_in_rule__PeriodicActivity__Group__61986 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__7_in_rule__PeriodicActivity__Group__61989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__StartAssignment_6_in_rule__PeriodicActivity__Group__6__Impl2016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__7__Impl_in_rule__PeriodicActivity__Group__72046 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__8_in_rule__PeriodicActivity__Group__72049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__PeriodicActivity__Group__7__Impl2077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__8__Impl_in_rule__PeriodicActivity__Group__82108 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__9_in_rule__PeriodicActivity__Group__82111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__EndAssignment_8_in_rule__PeriodicActivity__Group__8__Impl2138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__9__Impl_in_rule__PeriodicActivity__Group__92168 = new BitSet(new long[]{0x0000007040000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__10_in_rule__PeriodicActivity__Group__92171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__PeriodicActivity__Group__9__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__10__Impl_in_rule__PeriodicActivity__Group__102230 = new BitSet(new long[]{0x0000007040000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__11_in_rule__PeriodicActivity__Group__102233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__0_in_rule__PeriodicActivity__Group__10__Impl2260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__11__Impl_in_rule__PeriodicActivity__Group__112291 = new BitSet(new long[]{0x0000007040000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__12_in_rule__PeriodicActivity__Group__112294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__0_in_rule__PeriodicActivity__Group__11__Impl2321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__12__Impl_in_rule__PeriodicActivity__Group__122352 = new BitSet(new long[]{0x0000007040000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__13_in_rule__PeriodicActivity__Group__122355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__0_in_rule__PeriodicActivity__Group__12__Impl2382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__13__Impl_in_rule__PeriodicActivity__Group__132413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__PeriodicActivity__Group__13__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__0__Impl_in_rule__PeriodicActivity__Group_4__02500 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__1_in_rule__PeriodicActivity__Group_4__02503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__PeriodicActivity__Group_4__0__Impl2531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__1__Impl_in_rule__PeriodicActivity__Group_4__12562 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__2_in_rule__PeriodicActivity__Group_4__12565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__AtelierAssignment_4_1_in_rule__PeriodicActivity__Group_4__1__Impl2592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__2__Impl_in_rule__PeriodicActivity__Group_4__22622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__PeriodicActivity__Group_4__2__Impl2650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__0__Impl_in_rule__PeriodicActivity__Group_10__02687 = new BitSet(new long[]{0x000010000000F840L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__1_in_rule__PeriodicActivity__Group_10__02690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__PeriodicActivity__Group_10__0__Impl2718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__1__Impl_in_rule__PeriodicActivity__Group_10__12749 = new BitSet(new long[]{0x000010000000F840L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__2_in_rule__PeriodicActivity__Group_10__12752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__FrequencyAssignment_10_1_in_rule__PeriodicActivity__Group_10__1__Impl2779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__2__Impl_in_rule__PeriodicActivity__Group_10__22810 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__3_in_rule__PeriodicActivity__Group_10__22813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__PeriodicityTypeAssignment_10_2_in_rule__PeriodicActivity__Group_10__2__Impl2840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__3__Impl_in_rule__PeriodicActivity__Group_10__32870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__PeriodicActivity__Group_10__3__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__0__Impl_in_rule__PeriodicActivity__Group_11__02937 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__1_in_rule__PeriodicActivity__Group_11__02940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__PeriodicActivity__Group_11__0__Impl2968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__1__Impl_in_rule__PeriodicActivity__Group_11__12999 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__2_in_rule__PeriodicActivity__Group_11__13002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__PeriodicActivity__Group_11__1__Impl3030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__2__Impl_in_rule__PeriodicActivity__Group_11__23061 = new BitSet(new long[]{0x0000000440000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__3_in_rule__PeriodicActivity__Group_11__23064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_11_2_in_rule__PeriodicActivity__Group_11__2__Impl3091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__3__Impl_in_rule__PeriodicActivity__Group_11__33121 = new BitSet(new long[]{0x0000000440000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__4_in_rule__PeriodicActivity__Group_11__33124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11_3__0_in_rule__PeriodicActivity__Group_11__3__Impl3151 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__4__Impl_in_rule__PeriodicActivity__Group_11__43182 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__5_in_rule__PeriodicActivity__Group_11__43185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__PeriodicActivity__Group_11__4__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__5__Impl_in_rule__PeriodicActivity__Group_11__53244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__PeriodicActivity__Group_11__5__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11_3__0__Impl_in_rule__PeriodicActivity__Group_11_3__03315 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11_3__1_in_rule__PeriodicActivity__Group_11_3__03318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__PeriodicActivity__Group_11_3__0__Impl3346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11_3__1__Impl_in_rule__PeriodicActivity__Group_11_3__13377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_11_3_1_in_rule__PeriodicActivity__Group_11_3__1__Impl3404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__0__Impl_in_rule__PeriodicActivity__Group_12__03438 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__1_in_rule__PeriodicActivity__Group_12__03441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__PeriodicActivity__Group_12__0__Impl3469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__1__Impl_in_rule__PeriodicActivity__Group_12__13500 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__2_in_rule__PeriodicActivity__Group_12__13503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__PeriodicActivity__Group_12__1__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__2__Impl_in_rule__PeriodicActivity__Group_12__23562 = new BitSet(new long[]{0x0000000440000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__3_in_rule__PeriodicActivity__Group_12__23565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__RuleAssignment_12_2_in_rule__PeriodicActivity__Group_12__2__Impl3592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__3__Impl_in_rule__PeriodicActivity__Group_12__33622 = new BitSet(new long[]{0x0000000440000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__4_in_rule__PeriodicActivity__Group_12__33625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12_3__0_in_rule__PeriodicActivity__Group_12__3__Impl3652 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__4__Impl_in_rule__PeriodicActivity__Group_12__43683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__PeriodicActivity__Group_12__4__Impl3711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12_3__0__Impl_in_rule__PeriodicActivity__Group_12_3__03752 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12_3__1_in_rule__PeriodicActivity__Group_12_3__03755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__PeriodicActivity__Group_12_3__0__Impl3783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12_3__1__Impl_in_rule__PeriodicActivity__Group_12_3__13814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__RuleAssignment_12_3_1_in_rule__PeriodicActivity__Group_12_3__1__Impl3841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__03875 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__03878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__13936 = new BitSet(new long[]{0x000000000FFF0000L});
        public static final BitSet FOLLOW_rule__Date__Group__2_in_rule__Date__Group__13939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl3966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__23996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__MonthAssignment_2_in_rule__Date__Group__2__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__0__Impl_in_rule__ResAllocation__Group__04059 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__1_in_rule__ResAllocation__Group__04062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__1__Impl_in_rule__ResAllocation__Group__14120 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__2_in_rule__ResAllocation__Group__14123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__ResAllocation__Group__1__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__2__Impl_in_rule__ResAllocation__Group__24182 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__3_in_rule__ResAllocation__Group__24185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__RessourceAssignment_2_in_rule__ResAllocation__Group__2__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__3__Impl_in_rule__ResAllocation__Group__34242 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__4_in_rule__ResAllocation__Group__34245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__ResAllocation__Group__3__Impl4273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__4__Impl_in_rule__ResAllocation__Group__44304 = new BitSet(new long[]{0x000010000000F840L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__5_in_rule__ResAllocation__Group__44307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__DurationAssignment_4_in_rule__ResAllocation__Group__4__Impl4334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__5__Impl_in_rule__ResAllocation__Group__54364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__PeriodicityTypeAssignment_5_in_rule__ResAllocation__Group__5__Impl4391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__04433 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__04436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__14494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_1__0_in_rule__Rule__Group__1__Impl4521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_1__0__Impl_in_rule__Rule__Group_1__04556 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Rule__Group_1__1_in_rule__Rule__Group_1__04559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Rule__Group_1__0__Impl4587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_1__1__Impl_in_rule__Rule__Group_1__14618 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Rule__Group_1__2_in_rule__Rule__Group_1__14621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__PreAssignment_1_1_in_rule__Rule__Group_1__1__Impl4648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_1__2__Impl_in_rule__Rule__Group_1__24678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_1_2__0_in_rule__Rule__Group_1__2__Impl4705 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_1_2__0__Impl_in_rule__Rule__Group_1_2__04742 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group_1_2__1_in_rule__Rule__Group_1_2__04745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Rule__Group_1_2__0__Impl4773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_1_2__1__Impl_in_rule__Rule__Group_1_2__14804 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Rule__Group_1_2__2_in_rule__Rule__Group_1_2__14807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Rule__Group_1_2__1__Impl4835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_1_2__2__Impl_in_rule__Rule__Group_1_2__24866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__PreAssignment_1_2_2_in_rule__Rule__Group_1_2__2__Impl4893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__0__Impl_in_rule__Atelier_Impl__Group__04929 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__1_in_rule__Atelier_Impl__Group__04932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__1__Impl_in_rule__Atelier_Impl__Group__14990 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__2_in_rule__Atelier_Impl__Group__14993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Atelier_Impl__Group__1__Impl5021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__2__Impl_in_rule__Atelier_Impl__Group__25052 = new BitSet(new long[]{0x0000080040000000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__3_in_rule__Atelier_Impl__Group__25055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Atelier_Impl__Group__2__Impl5083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__3__Impl_in_rule__Atelier_Impl__Group__35114 = new BitSet(new long[]{0x0000080040000000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__4_in_rule__Atelier_Impl__Group__35117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__0_in_rule__Atelier_Impl__Group__3__Impl5144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__4__Impl_in_rule__Atelier_Impl__Group__45175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Atelier_Impl__Group__4__Impl5203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__0__Impl_in_rule__Atelier_Impl__Group_3__05244 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__1_in_rule__Atelier_Impl__Group_3__05247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Atelier_Impl__Group_3__0__Impl5275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__1__Impl_in_rule__Atelier_Impl__Group_3__15306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__ActivityAssignment_3_1_in_rule__Atelier_Impl__Group_3__1__Impl5333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05367 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__EInt__Group__0__Impl5399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Group__0__Impl_in_rule__Predicate__Group__05493 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Predicate__Group__1_in_rule__Predicate__Group__05496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Group__1__Impl_in_rule__Predicate__Group__15554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Predicate__Group__1__Impl5581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__0__Impl_in_rule__Elevage__Group__05614 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Elevage__Group__1_in_rule__Elevage__Group__05617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__1__Impl_in_rule__Elevage__Group__15675 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Elevage__Group__2_in_rule__Elevage__Group__15678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Elevage__Group__1__Impl5706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__2__Impl_in_rule__Elevage__Group__25737 = new BitSet(new long[]{0x0000080040000000L});
        public static final BitSet FOLLOW_rule__Elevage__Group__3_in_rule__Elevage__Group__25740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Elevage__Group__2__Impl5768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__3__Impl_in_rule__Elevage__Group__35799 = new BitSet(new long[]{0x0000080040000000L});
        public static final BitSet FOLLOW_rule__Elevage__Group__4_in_rule__Elevage__Group__35802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__0_in_rule__Elevage__Group__3__Impl5829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__4__Impl_in_rule__Elevage__Group__45860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Elevage__Group__4__Impl5888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__0__Impl_in_rule__Elevage__Group_3__05929 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__1_in_rule__Elevage__Group_3__05932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Elevage__Group_3__0__Impl5960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__1__Impl_in_rule__Elevage__Group_3__15991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__ActivityAssignment_3_1_in_rule__Elevage__Group_3__1__Impl6018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__06052 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__06055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__16113 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__16116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Culture__Group__1__Impl6144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__26175 = new BitSet(new long[]{0x0000080040000000L});
        public static final BitSet FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__26178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Culture__Group__2__Impl6206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__36237 = new BitSet(new long[]{0x0000080040000000L});
        public static final BitSet FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__36240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__0_in_rule__Culture__Group__3__Impl6267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__46298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Culture__Group__4__Impl6326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__0__Impl_in_rule__Culture__Group_3__06367 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__1_in_rule__Culture__Group_3__06370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Culture__Group_3__0__Impl6398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__1__Impl_in_rule__Culture__Group_3__16429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__ActivityAssignment_3_1_in_rule__Culture__Group_3__1__Impl6456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Model__NameAssignment_26495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicActivity_in_rule__Model__ActivityAssignment_46526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeriodicActivity__NameAssignment_26557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeriodicActivity__AtelierAssignment_4_16592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__PeriodicActivity__StartAssignment_66627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__PeriodicActivity__EndAssignment_86658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__PeriodicActivity__FrequencyAssignment_10_16689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicity_in_rule__PeriodicActivity__PeriodicityTypeAssignment_10_26720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_11_26751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_11_3_16782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__PeriodicActivity__RuleAssignment_12_26813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__PeriodicActivity__RuleAssignment_12_3_16844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Date__DayAssignment_16875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMonth_in_rule__Date__MonthAssignment_26906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ResAllocation__RessourceAssignment_26941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ResAllocation__DurationAssignment_46976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicity_in_rule__ResAllocation__PeriodicityTypeAssignment_57007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_rule__Rule__PreAssignment_1_17038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_rule__Rule__PreAssignment_1_2_27069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Atelier_Impl__ActivityAssignment_3_17104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Elevage__ActivityAssignment_3_17144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Culture__ActivityAssignment_3_17183 = new BitSet(new long[]{0x0000000000000002L});
    }


}
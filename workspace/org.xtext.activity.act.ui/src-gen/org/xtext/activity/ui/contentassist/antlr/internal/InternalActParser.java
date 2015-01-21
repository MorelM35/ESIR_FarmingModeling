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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'tm'", "'temperature'", "'rr'", "'precipitation'", "'par'", "'rayonnement'", "'etp'", "'evapotranspiration'", "'months'", "'days'", "'weeks'", "'years'", "'hours'", "'january'", "'february'", "'march'", "'april'", "'may'", "'june'", "'july'", "'august'", "'september'", "'october'", "'november'", "'december'", "'inferior'", "'inferiorOrEqual'", "'equal'", "'different'", "'superior'", "'superiorOrEqual'", "'AND'", "'OR'", "'XOR'", "'MATURE'", "'IMMATURE'", "'Worker'", "'Tractor'", "'atelier'", "'{'", "'}'", "'PeriodicActivity'", "'from'", "'to'", "','", "'every'", "'allocate'", "'rules'", "':'", "'reserve'", "'for'", "'before'", "'('", "')'", "'than'", "'activity'", "'done'", "'ago'", "'noRain'", "'since'", "'grain'", "'is'", "'-'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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


    // $ANTLR start "entryRuleAtelier"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:88:1: entryRuleAtelier : ruleAtelier EOF ;
    public final void entryRuleAtelier() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:89:1: ( ruleAtelier EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:90:1: ruleAtelier EOF
            {
             before(grammarAccess.getAtelierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtelier_in_entryRuleAtelier121);
            ruleAtelier();

            state._fsp--;

             after(grammarAccess.getAtelierRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtelier128); 

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
    // $ANTLR end "entryRuleAtelier"


    // $ANTLR start "ruleAtelier"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:97:1: ruleAtelier : ( ( rule__Atelier__Group__0 ) ) ;
    public final void ruleAtelier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:101:2: ( ( ( rule__Atelier__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:102:1: ( ( rule__Atelier__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:102:1: ( ( rule__Atelier__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:103:1: ( rule__Atelier__Group__0 )
            {
             before(grammarAccess.getAtelierAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:104:1: ( rule__Atelier__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:104:2: rule__Atelier__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier__Group__0_in_ruleAtelier154);
            rule__Atelier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtelierAccess().getGroup()); 

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
    // $ANTLR end "ruleAtelier"


    // $ANTLR start "entryRulePeriodicActivity"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:116:1: entryRulePeriodicActivity : rulePeriodicActivity EOF ;
    public final void entryRulePeriodicActivity() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:117:1: ( rulePeriodicActivity EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:118:1: rulePeriodicActivity EOF
            {
             before(grammarAccess.getPeriodicActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicActivity_in_entryRulePeriodicActivity181);
            rulePeriodicActivity();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePeriodicActivity188); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:125:1: rulePeriodicActivity : ( ( rule__PeriodicActivity__Group__0 ) ) ;
    public final void rulePeriodicActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:129:2: ( ( ( rule__PeriodicActivity__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:130:1: ( ( rule__PeriodicActivity__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:130:1: ( ( rule__PeriodicActivity__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:131:1: ( rule__PeriodicActivity__Group__0 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:132:1: ( rule__PeriodicActivity__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:132:2: rule__PeriodicActivity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__0_in_rulePeriodicActivity214);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:144:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:145:1: ( ruleDate EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:146:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate241);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate248); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:153:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:157:2: ( ( ( rule__Date__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:158:1: ( ( rule__Date__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:158:1: ( ( rule__Date__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:159:1: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:160:1: ( rule__Date__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:160:2: rule__Date__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0_in_ruleDate274);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:172:1: entryRuleResAllocation : ruleResAllocation EOF ;
    public final void entryRuleResAllocation() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:173:1: ( ruleResAllocation EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:174:1: ruleResAllocation EOF
            {
             before(grammarAccess.getResAllocationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_entryRuleResAllocation301);
            ruleResAllocation();

            state._fsp--;

             after(grammarAccess.getResAllocationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResAllocation308); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:181:1: ruleResAllocation : ( ( rule__ResAllocation__Group__0 ) ) ;
    public final void ruleResAllocation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:185:2: ( ( ( rule__ResAllocation__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:186:1: ( ( rule__ResAllocation__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:186:1: ( ( rule__ResAllocation__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:187:1: ( rule__ResAllocation__Group__0 )
            {
             before(grammarAccess.getResAllocationAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:188:1: ( rule__ResAllocation__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:188:2: rule__ResAllocation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__0_in_ruleResAllocation334);
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


    // $ANTLR start "entryRulePredicate"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:200:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:201:1: ( rulePredicate EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:202:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_entryRulePredicate361);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicate368); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:209:1: rulePredicate : ( ( rule__Predicate__Alternatives ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:213:2: ( ( ( rule__Predicate__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:214:1: ( ( rule__Predicate__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:214:1: ( ( rule__Predicate__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:215:1: ( rule__Predicate__Alternatives )
            {
             before(grammarAccess.getPredicateAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:216:1: ( rule__Predicate__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:216:2: rule__Predicate__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Alternatives_in_rulePredicate394);
            rule__Predicate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleBinaryExppression"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:228:1: entryRuleBinaryExppression : ruleBinaryExppression EOF ;
    public final void entryRuleBinaryExppression() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:229:1: ( ruleBinaryExppression EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:230:1: ruleBinaryExppression EOF
            {
             before(grammarAccess.getBinaryExppressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_entryRuleBinaryExppression421);
            ruleBinaryExppression();

            state._fsp--;

             after(grammarAccess.getBinaryExppressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryExppression428); 

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
    // $ANTLR end "entryRuleBinaryExppression"


    // $ANTLR start "ruleBinaryExppression"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:237:1: ruleBinaryExppression : ( ( rule__BinaryExppression__Group__0 ) ) ;
    public final void ruleBinaryExppression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:241:2: ( ( ( rule__BinaryExppression__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:242:1: ( ( rule__BinaryExppression__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:242:1: ( ( rule__BinaryExppression__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:243:1: ( rule__BinaryExppression__Group__0 )
            {
             before(grammarAccess.getBinaryExppressionAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:244:1: ( rule__BinaryExppression__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:244:2: rule__BinaryExppression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group__0_in_ruleBinaryExppression454);
            rule__BinaryExppression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExppressionAccess().getGroup()); 

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
    // $ANTLR end "ruleBinaryExppression"


    // $ANTLR start "entryRuleTemperature"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:256:1: entryRuleTemperature : ruleTemperature EOF ;
    public final void entryRuleTemperature() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:257:1: ( ruleTemperature EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:258:1: ruleTemperature EOF
            {
             before(grammarAccess.getTemperatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemperature_in_entryRuleTemperature481);
            ruleTemperature();

            state._fsp--;

             after(grammarAccess.getTemperatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemperature488); 

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
    // $ANTLR end "entryRuleTemperature"


    // $ANTLR start "ruleTemperature"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:265:1: ruleTemperature : ( ( rule__Temperature__Group__0 ) ) ;
    public final void ruleTemperature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:269:2: ( ( ( rule__Temperature__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:270:1: ( ( rule__Temperature__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:270:1: ( ( rule__Temperature__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:271:1: ( rule__Temperature__Group__0 )
            {
             before(grammarAccess.getTemperatureAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:272:1: ( rule__Temperature__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:272:2: rule__Temperature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__0_in_ruleTemperature514);
            rule__Temperature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemperatureAccess().getGroup()); 

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
    // $ANTLR end "ruleTemperature"


    // $ANTLR start "entryRulePrecipitation"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:284:1: entryRulePrecipitation : rulePrecipitation EOF ;
    public final void entryRulePrecipitation() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:285:1: ( rulePrecipitation EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:286:1: rulePrecipitation EOF
            {
             before(grammarAccess.getPrecipitationRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrecipitation_in_entryRulePrecipitation541);
            rulePrecipitation();

            state._fsp--;

             after(grammarAccess.getPrecipitationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrecipitation548); 

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
    // $ANTLR end "entryRulePrecipitation"


    // $ANTLR start "rulePrecipitation"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:293:1: rulePrecipitation : ( ( rule__Precipitation__Group__0 ) ) ;
    public final void rulePrecipitation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:297:2: ( ( ( rule__Precipitation__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:298:1: ( ( rule__Precipitation__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:298:1: ( ( rule__Precipitation__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:299:1: ( rule__Precipitation__Group__0 )
            {
             before(grammarAccess.getPrecipitationAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:300:1: ( rule__Precipitation__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:300:2: rule__Precipitation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__0_in_rulePrecipitation574);
            rule__Precipitation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrecipitationAccess().getGroup()); 

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
    // $ANTLR end "rulePrecipitation"


    // $ANTLR start "entryRuleRayonnement"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:312:1: entryRuleRayonnement : ruleRayonnement EOF ;
    public final void entryRuleRayonnement() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:313:1: ( ruleRayonnement EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:314:1: ruleRayonnement EOF
            {
             before(grammarAccess.getRayonnementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRayonnement_in_entryRuleRayonnement601);
            ruleRayonnement();

            state._fsp--;

             after(grammarAccess.getRayonnementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRayonnement608); 

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
    // $ANTLR end "entryRuleRayonnement"


    // $ANTLR start "ruleRayonnement"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:321:1: ruleRayonnement : ( ( rule__Rayonnement__Group__0 ) ) ;
    public final void ruleRayonnement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:325:2: ( ( ( rule__Rayonnement__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:326:1: ( ( rule__Rayonnement__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:326:1: ( ( rule__Rayonnement__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:327:1: ( rule__Rayonnement__Group__0 )
            {
             before(grammarAccess.getRayonnementAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:328:1: ( rule__Rayonnement__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:328:2: rule__Rayonnement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__0_in_ruleRayonnement634);
            rule__Rayonnement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRayonnementAccess().getGroup()); 

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
    // $ANTLR end "ruleRayonnement"


    // $ANTLR start "entryRuleEvapotranspiration"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:340:1: entryRuleEvapotranspiration : ruleEvapotranspiration EOF ;
    public final void entryRuleEvapotranspiration() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:341:1: ( ruleEvapotranspiration EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:342:1: ruleEvapotranspiration EOF
            {
             before(grammarAccess.getEvapotranspirationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvapotranspiration_in_entryRuleEvapotranspiration661);
            ruleEvapotranspiration();

            state._fsp--;

             after(grammarAccess.getEvapotranspirationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvapotranspiration668); 

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
    // $ANTLR end "entryRuleEvapotranspiration"


    // $ANTLR start "ruleEvapotranspiration"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:349:1: ruleEvapotranspiration : ( ( rule__Evapotranspiration__Group__0 ) ) ;
    public final void ruleEvapotranspiration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:353:2: ( ( ( rule__Evapotranspiration__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:354:1: ( ( rule__Evapotranspiration__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:354:1: ( ( rule__Evapotranspiration__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:355:1: ( rule__Evapotranspiration__Group__0 )
            {
             before(grammarAccess.getEvapotranspirationAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:356:1: ( rule__Evapotranspiration__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:356:2: rule__Evapotranspiration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__0_in_ruleEvapotranspiration694);
            rule__Evapotranspiration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvapotranspirationAccess().getGroup()); 

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
    // $ANTLR end "ruleEvapotranspiration"


    // $ANTLR start "entryRuleCheckDoneActivity"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:368:1: entryRuleCheckDoneActivity : ruleCheckDoneActivity EOF ;
    public final void entryRuleCheckDoneActivity() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:369:1: ( ruleCheckDoneActivity EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:370:1: ruleCheckDoneActivity EOF
            {
             before(grammarAccess.getCheckDoneActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCheckDoneActivity_in_entryRuleCheckDoneActivity721);
            ruleCheckDoneActivity();

            state._fsp--;

             after(grammarAccess.getCheckDoneActivityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCheckDoneActivity728); 

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
    // $ANTLR end "entryRuleCheckDoneActivity"


    // $ANTLR start "ruleCheckDoneActivity"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:377:1: ruleCheckDoneActivity : ( ( rule__CheckDoneActivity__Alternatives ) ) ;
    public final void ruleCheckDoneActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:381:2: ( ( ( rule__CheckDoneActivity__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:382:1: ( ( rule__CheckDoneActivity__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:382:1: ( ( rule__CheckDoneActivity__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:383:1: ( rule__CheckDoneActivity__Alternatives )
            {
             before(grammarAccess.getCheckDoneActivityAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:384:1: ( rule__CheckDoneActivity__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:384:2: rule__CheckDoneActivity__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Alternatives_in_ruleCheckDoneActivity754);
            rule__CheckDoneActivity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCheckDoneActivityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCheckDoneActivity"


    // $ANTLR start "entryRuleNoRain"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:396:1: entryRuleNoRain : ruleNoRain EOF ;
    public final void entryRuleNoRain() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:397:1: ( ruleNoRain EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:398:1: ruleNoRain EOF
            {
             before(grammarAccess.getNoRainRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRain_in_entryRuleNoRain781);
            ruleNoRain();

            state._fsp--;

             after(grammarAccess.getNoRainRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoRain788); 

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
    // $ANTLR end "entryRuleNoRain"


    // $ANTLR start "ruleNoRain"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:405:1: ruleNoRain : ( ( rule__NoRain__Group__0 ) ) ;
    public final void ruleNoRain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:409:2: ( ( ( rule__NoRain__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:410:1: ( ( rule__NoRain__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:410:1: ( ( rule__NoRain__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:411:1: ( rule__NoRain__Group__0 )
            {
             before(grammarAccess.getNoRainAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:412:1: ( rule__NoRain__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:412:2: rule__NoRain__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group__0_in_ruleNoRain814);
            rule__NoRain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoRainAccess().getGroup()); 

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
    // $ANTLR end "ruleNoRain"


    // $ANTLR start "entryRuleGrainState"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:424:1: entryRuleGrainState : ruleGrainState EOF ;
    public final void entryRuleGrainState() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:425:1: ( ruleGrainState EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:426:1: ruleGrainState EOF
            {
             before(grammarAccess.getGrainStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrainState_in_entryRuleGrainState841);
            ruleGrainState();

            state._fsp--;

             after(grammarAccess.getGrainStateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrainState848); 

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
    // $ANTLR end "entryRuleGrainState"


    // $ANTLR start "ruleGrainState"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:433:1: ruleGrainState : ( ( rule__GrainState__Group__0 ) ) ;
    public final void ruleGrainState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:437:2: ( ( ( rule__GrainState__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:438:1: ( ( rule__GrainState__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:438:1: ( ( rule__GrainState__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:439:1: ( rule__GrainState__Group__0 )
            {
             before(grammarAccess.getGrainStateAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:440:1: ( rule__GrainState__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:440:2: rule__GrainState__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__0_in_ruleGrainState874);
            rule__GrainState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrainStateAccess().getGroup()); 

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
    // $ANTLR end "ruleGrainState"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:452:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:453:1: ( ruleEString EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:454:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString901);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString908); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:461:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:465:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:466:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:466:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:467:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:468:1: ( rule__EString__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:468:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString934);
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


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:480:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:481:1: ( ruleEInt EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:482:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt961);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt968); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:489:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:493:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:494:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:494:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:495:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:496:1: ( rule__EInt__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:496:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt994);
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


    // $ANTLR start "entryRuleEFloat"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:508:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:509:1: ( ruleEFloat EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:510:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat1021);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat1028); 

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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:517:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:521:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:522:1: ( ( rule__EFloat__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:522:1: ( ( rule__EFloat__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:523:1: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:524:1: ( rule__EFloat__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:524:2: rule__EFloat__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0_in_ruleEFloat1054);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "rulePeriodicity"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:537:1: rulePeriodicity : ( ( rule__Periodicity__Alternatives ) ) ;
    public final void rulePeriodicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:541:1: ( ( ( rule__Periodicity__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:542:1: ( ( rule__Periodicity__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:542:1: ( ( rule__Periodicity__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:543:1: ( rule__Periodicity__Alternatives )
            {
             before(grammarAccess.getPeriodicityAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:544:1: ( rule__Periodicity__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:544:2: rule__Periodicity__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Periodicity__Alternatives_in_rulePeriodicity1091);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:556:1: ruleMonth : ( ( rule__Month__Alternatives ) ) ;
    public final void ruleMonth() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:560:1: ( ( ( rule__Month__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:561:1: ( ( rule__Month__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:561:1: ( ( rule__Month__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:562:1: ( rule__Month__Alternatives )
            {
             before(grammarAccess.getMonthAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:563:1: ( rule__Month__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:563:2: rule__Month__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Month__Alternatives_in_ruleMonth1127);
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


    // $ANTLR start "ruleComparator"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:575:1: ruleComparator : ( ( rule__Comparator__Alternatives ) ) ;
    public final void ruleComparator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:579:1: ( ( ( rule__Comparator__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:580:1: ( ( rule__Comparator__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:580:1: ( ( rule__Comparator__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:581:1: ( rule__Comparator__Alternatives )
            {
             before(grammarAccess.getComparatorAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:582:1: ( rule__Comparator__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:582:2: rule__Comparator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparator__Alternatives_in_ruleComparator1163);
            rule__Comparator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComparator"


    // $ANTLR start "ruleBinaryExppressionType"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:594:1: ruleBinaryExppressionType : ( ( rule__BinaryExppressionType__Alternatives ) ) ;
    public final void ruleBinaryExppressionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:598:1: ( ( ( rule__BinaryExppressionType__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:599:1: ( ( rule__BinaryExppressionType__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:599:1: ( ( rule__BinaryExppressionType__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:600:1: ( rule__BinaryExppressionType__Alternatives )
            {
             before(grammarAccess.getBinaryExppressionTypeAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:601:1: ( rule__BinaryExppressionType__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:601:2: rule__BinaryExppressionType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppressionType__Alternatives_in_ruleBinaryExppressionType1199);
            rule__BinaryExppressionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExppressionTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBinaryExppressionType"


    // $ANTLR start "ruleGrainStateEnum"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:613:1: ruleGrainStateEnum : ( ( rule__GrainStateEnum__Alternatives ) ) ;
    public final void ruleGrainStateEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:617:1: ( ( ( rule__GrainStateEnum__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:618:1: ( ( rule__GrainStateEnum__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:618:1: ( ( rule__GrainStateEnum__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:619:1: ( rule__GrainStateEnum__Alternatives )
            {
             before(grammarAccess.getGrainStateEnumAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:620:1: ( rule__GrainStateEnum__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:620:2: rule__GrainStateEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__GrainStateEnum__Alternatives_in_ruleGrainStateEnum1235);
            rule__GrainStateEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGrainStateEnumAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGrainStateEnum"


    // $ANTLR start "ruleEnumTypeRessource"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:632:1: ruleEnumTypeRessource : ( ( rule__EnumTypeRessource__Alternatives ) ) ;
    public final void ruleEnumTypeRessource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:636:1: ( ( ( rule__EnumTypeRessource__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:637:1: ( ( rule__EnumTypeRessource__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:637:1: ( ( rule__EnumTypeRessource__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:638:1: ( rule__EnumTypeRessource__Alternatives )
            {
             before(grammarAccess.getEnumTypeRessourceAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:639:1: ( rule__EnumTypeRessource__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:639:2: rule__EnumTypeRessource__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EnumTypeRessource__Alternatives_in_ruleEnumTypeRessource1271);
            rule__EnumTypeRessource__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeRessourceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEnumTypeRessource"


    // $ANTLR start "rule__Predicate__Alternatives"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:650:1: rule__Predicate__Alternatives : ( ( ( rule__Predicate__Group_0__0 ) ) | ( ruleCheckDoneActivity ) | ( ruleNoRain ) | ( ruleTemperature ) | ( rulePrecipitation ) | ( ruleRayonnement ) | ( ruleEvapotranspiration ) | ( ruleGrainState ) );
    public final void rule__Predicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:654:1: ( ( ( rule__Predicate__Group_0__0 ) ) | ( ruleCheckDoneActivity ) | ( ruleNoRain ) | ( ruleTemperature ) | ( rulePrecipitation ) | ( ruleRayonnement ) | ( ruleEvapotranspiration ) | ( ruleGrainState ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
            case 66:
            case 73:
                {
                alt1=2;
                }
                break;
            case 69:
                {
                alt1=3;
                }
                break;
            case 11:
            case 12:
                {
                alt1=4;
                }
                break;
            case 13:
            case 14:
                {
                alt1=5;
                }
                break;
            case 15:
            case 16:
                {
                alt1=6;
                }
                break;
            case 17:
            case 18:
                {
                alt1=7;
                }
                break;
            case 71:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:655:1: ( ( rule__Predicate__Group_0__0 ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:655:1: ( ( rule__Predicate__Group_0__0 ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:656:1: ( rule__Predicate__Group_0__0 )
                    {
                     before(grammarAccess.getPredicateAccess().getGroup_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:657:1: ( rule__Predicate__Group_0__0 )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:657:2: rule__Predicate__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0__0_in_rule__Predicate__Alternatives1306);
                    rule__Predicate__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicateAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:661:6: ( ruleCheckDoneActivity )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:661:6: ( ruleCheckDoneActivity )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:662:1: ruleCheckDoneActivity
                    {
                     before(grammarAccess.getPredicateAccess().getCheckDoneActivityParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCheckDoneActivity_in_rule__Predicate__Alternatives1324);
                    ruleCheckDoneActivity();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getCheckDoneActivityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:667:6: ( ruleNoRain )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:667:6: ( ruleNoRain )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:668:1: ruleNoRain
                    {
                     before(grammarAccess.getPredicateAccess().getNoRainParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNoRain_in_rule__Predicate__Alternatives1341);
                    ruleNoRain();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getNoRainParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:673:6: ( ruleTemperature )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:673:6: ( ruleTemperature )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:674:1: ruleTemperature
                    {
                     before(grammarAccess.getPredicateAccess().getTemperatureParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTemperature_in_rule__Predicate__Alternatives1358);
                    ruleTemperature();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getTemperatureParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:679:6: ( rulePrecipitation )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:679:6: ( rulePrecipitation )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:680:1: rulePrecipitation
                    {
                     before(grammarAccess.getPredicateAccess().getPrecipitationParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_rulePrecipitation_in_rule__Predicate__Alternatives1375);
                    rulePrecipitation();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getPrecipitationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:685:6: ( ruleRayonnement )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:685:6: ( ruleRayonnement )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:686:1: ruleRayonnement
                    {
                     before(grammarAccess.getPredicateAccess().getRayonnementParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRayonnement_in_rule__Predicate__Alternatives1392);
                    ruleRayonnement();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getRayonnementParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:691:6: ( ruleEvapotranspiration )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:691:6: ( ruleEvapotranspiration )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:692:1: ruleEvapotranspiration
                    {
                     before(grammarAccess.getPredicateAccess().getEvapotranspirationParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEvapotranspiration_in_rule__Predicate__Alternatives1409);
                    ruleEvapotranspiration();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getEvapotranspirationParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:697:6: ( ruleGrainState )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:697:6: ( ruleGrainState )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:698:1: ruleGrainState
                    {
                     before(grammarAccess.getPredicateAccess().getGrainStateParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleGrainState_in_rule__Predicate__Alternatives1426);
                    ruleGrainState();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getGrainStateParserRuleCall_7()); 

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
    // $ANTLR end "rule__Predicate__Alternatives"


    // $ANTLR start "rule__BinaryExppression__Alternatives_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:708:1: rule__BinaryExppression__Alternatives_1 : ( ( ( rule__BinaryExppression__LeftAssignment_1_0 ) ) | ( ( rule__BinaryExppression__Group_1_1__0 ) ) );
    public final void rule__BinaryExppression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:712:1: ( ( ( rule__BinaryExppression__LeftAssignment_1_0 ) ) | ( ( rule__BinaryExppression__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||(LA2_0>=11 && LA2_0<=18)||LA2_0==62||LA2_0==66||LA2_0==69||LA2_0==71||LA2_0==73) ) {
                alt2=1;
            }
            else if ( (LA2_0==63) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:713:1: ( ( rule__BinaryExppression__LeftAssignment_1_0 ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:713:1: ( ( rule__BinaryExppression__LeftAssignment_1_0 ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:714:1: ( rule__BinaryExppression__LeftAssignment_1_0 )
                    {
                     before(grammarAccess.getBinaryExppressionAccess().getLeftAssignment_1_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:715:1: ( rule__BinaryExppression__LeftAssignment_1_0 )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:715:2: rule__BinaryExppression__LeftAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__LeftAssignment_1_0_in_rule__BinaryExppression__Alternatives_11458);
                    rule__BinaryExppression__LeftAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinaryExppressionAccess().getLeftAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:719:6: ( ( rule__BinaryExppression__Group_1_1__0 ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:719:6: ( ( rule__BinaryExppression__Group_1_1__0 ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:720:1: ( rule__BinaryExppression__Group_1_1__0 )
                    {
                     before(grammarAccess.getBinaryExppressionAccess().getGroup_1_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:721:1: ( rule__BinaryExppression__Group_1_1__0 )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:721:2: rule__BinaryExppression__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_1_1__0_in_rule__BinaryExppression__Alternatives_11476);
                    rule__BinaryExppression__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinaryExppressionAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__BinaryExppression__Alternatives_1"


    // $ANTLR start "rule__Temperature__Alternatives_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:730:1: rule__Temperature__Alternatives_1 : ( ( 'tm' ) | ( 'temperature' ) );
    public final void rule__Temperature__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:734:1: ( ( 'tm' ) | ( 'temperature' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:735:1: ( 'tm' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:735:1: ( 'tm' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:736:1: 'tm'
                    {
                     before(grammarAccess.getTemperatureAccess().getTmKeyword_1_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Temperature__Alternatives_11510); 
                     after(grammarAccess.getTemperatureAccess().getTmKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:743:6: ( 'temperature' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:743:6: ( 'temperature' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:744:1: 'temperature'
                    {
                     before(grammarAccess.getTemperatureAccess().getTemperatureKeyword_1_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Temperature__Alternatives_11530); 
                     after(grammarAccess.getTemperatureAccess().getTemperatureKeyword_1_1()); 

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
    // $ANTLR end "rule__Temperature__Alternatives_1"


    // $ANTLR start "rule__Precipitation__Alternatives_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:756:1: rule__Precipitation__Alternatives_1 : ( ( 'rr' ) | ( 'precipitation' ) );
    public final void rule__Precipitation__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:760:1: ( ( 'rr' ) | ( 'precipitation' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:761:1: ( 'rr' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:761:1: ( 'rr' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:762:1: 'rr'
                    {
                     before(grammarAccess.getPrecipitationAccess().getRrKeyword_1_0()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Precipitation__Alternatives_11565); 
                     after(grammarAccess.getPrecipitationAccess().getRrKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:769:6: ( 'precipitation' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:769:6: ( 'precipitation' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:770:1: 'precipitation'
                    {
                     before(grammarAccess.getPrecipitationAccess().getPrecipitationKeyword_1_1()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Precipitation__Alternatives_11585); 
                     after(grammarAccess.getPrecipitationAccess().getPrecipitationKeyword_1_1()); 

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
    // $ANTLR end "rule__Precipitation__Alternatives_1"


    // $ANTLR start "rule__Rayonnement__Alternatives_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:782:1: rule__Rayonnement__Alternatives_1 : ( ( 'par' ) | ( 'rayonnement' ) );
    public final void rule__Rayonnement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:786:1: ( ( 'par' ) | ( 'rayonnement' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:787:1: ( 'par' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:787:1: ( 'par' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:788:1: 'par'
                    {
                     before(grammarAccess.getRayonnementAccess().getParKeyword_1_0()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Rayonnement__Alternatives_11620); 
                     after(grammarAccess.getRayonnementAccess().getParKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:795:6: ( 'rayonnement' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:795:6: ( 'rayonnement' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:796:1: 'rayonnement'
                    {
                     before(grammarAccess.getRayonnementAccess().getRayonnementKeyword_1_1()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Rayonnement__Alternatives_11640); 
                     after(grammarAccess.getRayonnementAccess().getRayonnementKeyword_1_1()); 

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
    // $ANTLR end "rule__Rayonnement__Alternatives_1"


    // $ANTLR start "rule__Evapotranspiration__Alternatives_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:808:1: rule__Evapotranspiration__Alternatives_1 : ( ( 'etp' ) | ( 'evapotranspiration' ) );
    public final void rule__Evapotranspiration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:812:1: ( ( 'etp' ) | ( 'evapotranspiration' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:813:1: ( 'etp' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:813:1: ( 'etp' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:814:1: 'etp'
                    {
                     before(grammarAccess.getEvapotranspirationAccess().getEtpKeyword_1_0()); 
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__Evapotranspiration__Alternatives_11675); 
                     after(grammarAccess.getEvapotranspirationAccess().getEtpKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:821:6: ( 'evapotranspiration' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:821:6: ( 'evapotranspiration' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:822:1: 'evapotranspiration'
                    {
                     before(grammarAccess.getEvapotranspirationAccess().getEvapotranspirationKeyword_1_1()); 
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Evapotranspiration__Alternatives_11695); 
                     after(grammarAccess.getEvapotranspirationAccess().getEvapotranspirationKeyword_1_1()); 

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
    // $ANTLR end "rule__Evapotranspiration__Alternatives_1"


    // $ANTLR start "rule__CheckDoneActivity__Alternatives"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:834:1: rule__CheckDoneActivity__Alternatives : ( ( ( rule__CheckDoneActivity__Group_0__0 ) ) | ( ( rule__CheckDoneActivity__DateAssignment_1 ) ) );
    public final void rule__CheckDoneActivity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:838:1: ( ( ( rule__CheckDoneActivity__Group_0__0 ) ) | ( ( rule__CheckDoneActivity__DateAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==66) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT||LA7_0==73) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:839:1: ( ( rule__CheckDoneActivity__Group_0__0 ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:839:1: ( ( rule__CheckDoneActivity__Group_0__0 ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:840:1: ( rule__CheckDoneActivity__Group_0__0 )
                    {
                     before(grammarAccess.getCheckDoneActivityAccess().getGroup_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:841:1: ( rule__CheckDoneActivity__Group_0__0 )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:841:2: rule__CheckDoneActivity__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__0_in_rule__CheckDoneActivity__Alternatives1729);
                    rule__CheckDoneActivity__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckDoneActivityAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:845:6: ( ( rule__CheckDoneActivity__DateAssignment_1 ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:845:6: ( ( rule__CheckDoneActivity__DateAssignment_1 ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:846:1: ( rule__CheckDoneActivity__DateAssignment_1 )
                    {
                     before(grammarAccess.getCheckDoneActivityAccess().getDateAssignment_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:847:1: ( rule__CheckDoneActivity__DateAssignment_1 )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:847:2: rule__CheckDoneActivity__DateAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__DateAssignment_1_in_rule__CheckDoneActivity__Alternatives1747);
                    rule__CheckDoneActivity__DateAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckDoneActivityAccess().getDateAssignment_1()); 

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
    // $ANTLR end "rule__CheckDoneActivity__Alternatives"


    // $ANTLR start "rule__NoRain__Alternatives_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:856:1: rule__NoRain__Alternatives_2 : ( ( ( rule__NoRain__Group_2_0__0 ) ) | ( ( rule__NoRain__Group_2_1__0 ) ) );
    public final void rule__NoRain__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:860:1: ( ( ( rule__NoRain__Group_2_0__0 ) ) | ( ( rule__NoRain__Group_2_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==61) ) {
                alt8=1;
            }
            else if ( (LA8_0==70) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:861:1: ( ( rule__NoRain__Group_2_0__0 ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:861:1: ( ( rule__NoRain__Group_2_0__0 ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:862:1: ( rule__NoRain__Group_2_0__0 )
                    {
                     before(grammarAccess.getNoRainAccess().getGroup_2_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:863:1: ( rule__NoRain__Group_2_0__0 )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:863:2: rule__NoRain__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_0__0_in_rule__NoRain__Alternatives_21780);
                    rule__NoRain__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNoRainAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:867:6: ( ( rule__NoRain__Group_2_1__0 ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:867:6: ( ( rule__NoRain__Group_2_1__0 ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:868:1: ( rule__NoRain__Group_2_1__0 )
                    {
                     before(grammarAccess.getNoRainAccess().getGroup_2_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:869:1: ( rule__NoRain__Group_2_1__0 )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:869:2: rule__NoRain__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_1__0_in_rule__NoRain__Alternatives_21798);
                    rule__NoRain__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNoRainAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__NoRain__Alternatives_2"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:878:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:882:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:883:1: ( RULE_STRING )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:883:1: ( RULE_STRING )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:884:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1831); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:889:6: ( RULE_ID )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:889:6: ( RULE_ID )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:890:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1848); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:900:1: rule__Periodicity__Alternatives : ( ( ( 'months' ) ) | ( ( 'days' ) ) | ( ( 'weeks' ) ) | ( ( 'years' ) ) | ( ( 'hours' ) ) );
    public final void rule__Periodicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:904:1: ( ( ( 'months' ) ) | ( ( 'days' ) ) | ( ( 'weeks' ) ) | ( ( 'years' ) ) | ( ( 'hours' ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            case 22:
                {
                alt10=4;
                }
                break;
            case 23:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:905:1: ( ( 'months' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:905:1: ( ( 'months' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:906:1: ( 'months' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getMonthEnumLiteralDeclaration_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:907:1: ( 'months' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:907:3: 'months'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__Periodicity__Alternatives1881); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getMonthEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:912:6: ( ( 'days' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:912:6: ( ( 'days' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:913:1: ( 'days' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:914:1: ( 'days' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:914:3: 'days'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__Periodicity__Alternatives1902); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:919:6: ( ( 'weeks' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:919:6: ( ( 'weeks' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:920:1: ( 'weeks' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:921:1: ( 'weeks' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:921:3: 'weeks'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Periodicity__Alternatives1923); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:926:6: ( ( 'years' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:926:6: ( ( 'years' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:927:1: ( 'years' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:928:1: ( 'years' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:928:3: 'years'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__Periodicity__Alternatives1944); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:933:6: ( ( 'hours' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:933:6: ( ( 'hours' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:934:1: ( 'hours' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getHoursEnumLiteralDeclaration_4()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:935:1: ( 'hours' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:935:3: 'hours'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__Periodicity__Alternatives1965); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:945:1: rule__Month__Alternatives : ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) );
    public final void rule__Month__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:949:1: ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) )
            int alt11=12;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            case 28:
                {
                alt11=5;
                }
                break;
            case 29:
                {
                alt11=6;
                }
                break;
            case 30:
                {
                alt11=7;
                }
                break;
            case 31:
                {
                alt11=8;
                }
                break;
            case 32:
                {
                alt11=9;
                }
                break;
            case 33:
                {
                alt11=10;
                }
                break;
            case 34:
                {
                alt11=11;
                }
                break;
            case 35:
                {
                alt11=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:950:1: ( ( 'january' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:950:1: ( ( 'january' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:951:1: ( 'january' )
                    {
                     before(grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:952:1: ( 'january' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:952:3: 'january'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__Month__Alternatives2001); 

                    }

                     after(grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:957:6: ( ( 'february' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:957:6: ( ( 'february' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:958:1: ( 'february' )
                    {
                     before(grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:959:1: ( 'february' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:959:3: 'february'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__Month__Alternatives2022); 

                    }

                     after(grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:964:6: ( ( 'march' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:964:6: ( ( 'march' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:965:1: ( 'march' )
                    {
                     before(grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:966:1: ( 'march' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:966:3: 'march'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__Month__Alternatives2043); 

                    }

                     after(grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:971:6: ( ( 'april' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:971:6: ( ( 'april' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:972:1: ( 'april' )
                    {
                     before(grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:973:1: ( 'april' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:973:3: 'april'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__Month__Alternatives2064); 

                    }

                     after(grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:978:6: ( ( 'may' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:978:6: ( ( 'may' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:979:1: ( 'may' )
                    {
                     before(grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:980:1: ( 'may' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:980:3: 'may'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__Month__Alternatives2085); 

                    }

                     after(grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:985:6: ( ( 'june' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:985:6: ( ( 'june' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:986:1: ( 'june' )
                    {
                     before(grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:987:1: ( 'june' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:987:3: 'june'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__Month__Alternatives2106); 

                    }

                     after(grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:992:6: ( ( 'july' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:992:6: ( ( 'july' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:993:1: ( 'july' )
                    {
                     before(grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:994:1: ( 'july' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:994:3: 'july'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__Month__Alternatives2127); 

                    }

                     after(grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:999:6: ( ( 'august' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:999:6: ( ( 'august' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1000:1: ( 'august' )
                    {
                     before(grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1001:1: ( 'august' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1001:3: 'august'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__Month__Alternatives2148); 

                    }

                     after(grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1006:6: ( ( 'september' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1006:6: ( ( 'september' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1007:1: ( 'september' )
                    {
                     before(grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1008:1: ( 'september' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1008:3: 'september'
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_rule__Month__Alternatives2169); 

                    }

                     after(grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1013:6: ( ( 'october' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1013:6: ( ( 'october' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1014:1: ( 'october' )
                    {
                     before(grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1015:1: ( 'october' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1015:3: 'october'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__Month__Alternatives2190); 

                    }

                     after(grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1020:6: ( ( 'november' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1020:6: ( ( 'november' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1021:1: ( 'november' )
                    {
                     before(grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1022:1: ( 'november' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1022:3: 'november'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__Month__Alternatives2211); 

                    }

                     after(grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1027:6: ( ( 'december' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1027:6: ( ( 'december' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1028:1: ( 'december' )
                    {
                     before(grammarAccess.getMonthAccess().getDecemberEnumLiteralDeclaration_11()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1029:1: ( 'december' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1029:3: 'december'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__Month__Alternatives2232); 

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


    // $ANTLR start "rule__Comparator__Alternatives"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1039:1: rule__Comparator__Alternatives : ( ( ( 'inferior' ) ) | ( ( 'inferiorOrEqual' ) ) | ( ( 'equal' ) ) | ( ( 'different' ) ) | ( ( 'superior' ) ) | ( ( 'superiorOrEqual' ) ) );
    public final void rule__Comparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1043:1: ( ( ( 'inferior' ) ) | ( ( 'inferiorOrEqual' ) ) | ( ( 'equal' ) ) | ( ( 'different' ) ) | ( ( 'superior' ) ) | ( ( 'superiorOrEqual' ) ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt12=1;
                }
                break;
            case 37:
                {
                alt12=2;
                }
                break;
            case 38:
                {
                alt12=3;
                }
                break;
            case 39:
                {
                alt12=4;
                }
                break;
            case 40:
                {
                alt12=5;
                }
                break;
            case 41:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1044:1: ( ( 'inferior' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1044:1: ( ( 'inferior' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1045:1: ( 'inferior' )
                    {
                     before(grammarAccess.getComparatorAccess().getInferiorEnumLiteralDeclaration_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1046:1: ( 'inferior' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1046:3: 'inferior'
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_rule__Comparator__Alternatives2268); 

                    }

                     after(grammarAccess.getComparatorAccess().getInferiorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1051:6: ( ( 'inferiorOrEqual' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1051:6: ( ( 'inferiorOrEqual' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1052:1: ( 'inferiorOrEqual' )
                    {
                     before(grammarAccess.getComparatorAccess().getInferiorOrEqualEnumLiteralDeclaration_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1053:1: ( 'inferiorOrEqual' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1053:3: 'inferiorOrEqual'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_rule__Comparator__Alternatives2289); 

                    }

                     after(grammarAccess.getComparatorAccess().getInferiorOrEqualEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1058:6: ( ( 'equal' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1058:6: ( ( 'equal' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1059:1: ( 'equal' )
                    {
                     before(grammarAccess.getComparatorAccess().getEqualEnumLiteralDeclaration_2()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1060:1: ( 'equal' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1060:3: 'equal'
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_rule__Comparator__Alternatives2310); 

                    }

                     after(grammarAccess.getComparatorAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1065:6: ( ( 'different' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1065:6: ( ( 'different' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1066:1: ( 'different' )
                    {
                     before(grammarAccess.getComparatorAccess().getDifferentEnumLiteralDeclaration_3()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1067:1: ( 'different' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1067:3: 'different'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_rule__Comparator__Alternatives2331); 

                    }

                     after(grammarAccess.getComparatorAccess().getDifferentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1072:6: ( ( 'superior' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1072:6: ( ( 'superior' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1073:1: ( 'superior' )
                    {
                     before(grammarAccess.getComparatorAccess().getSuperiorEnumLiteralDeclaration_4()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1074:1: ( 'superior' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1074:3: 'superior'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_rule__Comparator__Alternatives2352); 

                    }

                     after(grammarAccess.getComparatorAccess().getSuperiorEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1079:6: ( ( 'superiorOrEqual' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1079:6: ( ( 'superiorOrEqual' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1080:1: ( 'superiorOrEqual' )
                    {
                     before(grammarAccess.getComparatorAccess().getSuperiorOrEqualEnumLiteralDeclaration_5()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1081:1: ( 'superiorOrEqual' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1081:3: 'superiorOrEqual'
                    {
                    match(input,41,FollowSets000.FOLLOW_41_in_rule__Comparator__Alternatives2373); 

                    }

                     after(grammarAccess.getComparatorAccess().getSuperiorOrEqualEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__Comparator__Alternatives"


    // $ANTLR start "rule__BinaryExppressionType__Alternatives"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1091:1: rule__BinaryExppressionType__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'XOR' ) ) );
    public final void rule__BinaryExppressionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1095:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'XOR' ) ) )
            int alt13=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1096:1: ( ( 'AND' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1096:1: ( ( 'AND' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1097:1: ( 'AND' )
                    {
                     before(grammarAccess.getBinaryExppressionTypeAccess().getANDEnumLiteralDeclaration_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1098:1: ( 'AND' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1098:3: 'AND'
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_rule__BinaryExppressionType__Alternatives2409); 

                    }

                     after(grammarAccess.getBinaryExppressionTypeAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1103:6: ( ( 'OR' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1103:6: ( ( 'OR' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1104:1: ( 'OR' )
                    {
                     before(grammarAccess.getBinaryExppressionTypeAccess().getOREnumLiteralDeclaration_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1105:1: ( 'OR' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1105:3: 'OR'
                    {
                    match(input,43,FollowSets000.FOLLOW_43_in_rule__BinaryExppressionType__Alternatives2430); 

                    }

                     after(grammarAccess.getBinaryExppressionTypeAccess().getOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1110:6: ( ( 'XOR' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1110:6: ( ( 'XOR' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1111:1: ( 'XOR' )
                    {
                     before(grammarAccess.getBinaryExppressionTypeAccess().getXOREnumLiteralDeclaration_2()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1112:1: ( 'XOR' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1112:3: 'XOR'
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_rule__BinaryExppressionType__Alternatives2451); 

                    }

                     after(grammarAccess.getBinaryExppressionTypeAccess().getXOREnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__BinaryExppressionType__Alternatives"


    // $ANTLR start "rule__GrainStateEnum__Alternatives"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1122:1: rule__GrainStateEnum__Alternatives : ( ( ( 'MATURE' ) ) | ( ( 'IMMATURE' ) ) );
    public final void rule__GrainStateEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1126:1: ( ( ( 'MATURE' ) ) | ( ( 'IMMATURE' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==45) ) {
                alt14=1;
            }
            else if ( (LA14_0==46) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1127:1: ( ( 'MATURE' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1127:1: ( ( 'MATURE' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1128:1: ( 'MATURE' )
                    {
                     before(grammarAccess.getGrainStateEnumAccess().getMATUREEnumLiteralDeclaration_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1129:1: ( 'MATURE' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1129:3: 'MATURE'
                    {
                    match(input,45,FollowSets000.FOLLOW_45_in_rule__GrainStateEnum__Alternatives2487); 

                    }

                     after(grammarAccess.getGrainStateEnumAccess().getMATUREEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1134:6: ( ( 'IMMATURE' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1134:6: ( ( 'IMMATURE' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1135:1: ( 'IMMATURE' )
                    {
                     before(grammarAccess.getGrainStateEnumAccess().getIMMATUREEnumLiteralDeclaration_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1136:1: ( 'IMMATURE' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1136:3: 'IMMATURE'
                    {
                    match(input,46,FollowSets000.FOLLOW_46_in_rule__GrainStateEnum__Alternatives2508); 

                    }

                     after(grammarAccess.getGrainStateEnumAccess().getIMMATUREEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__GrainStateEnum__Alternatives"


    // $ANTLR start "rule__EnumTypeRessource__Alternatives"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1146:1: rule__EnumTypeRessource__Alternatives : ( ( ( 'Worker' ) ) | ( ( 'Tractor' ) ) );
    public final void rule__EnumTypeRessource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1150:1: ( ( ( 'Worker' ) ) | ( ( 'Tractor' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                alt15=1;
            }
            else if ( (LA15_0==48) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1151:1: ( ( 'Worker' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1151:1: ( ( 'Worker' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1152:1: ( 'Worker' )
                    {
                     before(grammarAccess.getEnumTypeRessourceAccess().getWorkerEnumLiteralDeclaration_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1153:1: ( 'Worker' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1153:3: 'Worker'
                    {
                    match(input,47,FollowSets000.FOLLOW_47_in_rule__EnumTypeRessource__Alternatives2544); 

                    }

                     after(grammarAccess.getEnumTypeRessourceAccess().getWorkerEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1158:6: ( ( 'Tractor' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1158:6: ( ( 'Tractor' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1159:1: ( 'Tractor' )
                    {
                     before(grammarAccess.getEnumTypeRessourceAccess().getTractorEnumLiteralDeclaration_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1160:1: ( 'Tractor' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1160:3: 'Tractor'
                    {
                    match(input,48,FollowSets000.FOLLOW_48_in_rule__EnumTypeRessource__Alternatives2565); 

                    }

                     after(grammarAccess.getEnumTypeRessourceAccess().getTractorEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__EnumTypeRessource__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1172:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1176:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1177:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02598);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02601);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1184:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1188:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1189:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1189:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1190:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1191:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1193:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1203:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1207:1: ( rule__Model__Group__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1208:2: rule__Model__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12659);
            rule__Model__Group__1__Impl();

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1214:1: rule__Model__Group__1__Impl : ( ( rule__Model__AtelierAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1218:1: ( ( ( rule__Model__AtelierAssignment_1 )* ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1219:1: ( ( rule__Model__AtelierAssignment_1 )* )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1219:1: ( ( rule__Model__AtelierAssignment_1 )* )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1220:1: ( rule__Model__AtelierAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getAtelierAssignment_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1221:1: ( rule__Model__AtelierAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==49) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1221:2: rule__Model__AtelierAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__AtelierAssignment_1_in_rule__Model__Group__1__Impl2686);
            	    rule__Model__AtelierAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAtelierAssignment_1()); 

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


    // $ANTLR start "rule__Atelier__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1235:1: rule__Atelier__Group__0 : rule__Atelier__Group__0__Impl rule__Atelier__Group__1 ;
    public final void rule__Atelier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1239:1: ( rule__Atelier__Group__0__Impl rule__Atelier__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1240:2: rule__Atelier__Group__0__Impl rule__Atelier__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier__Group__0__Impl_in_rule__Atelier__Group__02721);
            rule__Atelier__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier__Group__1_in_rule__Atelier__Group__02724);
            rule__Atelier__Group__1();

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
    // $ANTLR end "rule__Atelier__Group__0"


    // $ANTLR start "rule__Atelier__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1247:1: rule__Atelier__Group__0__Impl : ( () ) ;
    public final void rule__Atelier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1251:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1252:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1252:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1253:1: ()
            {
             before(grammarAccess.getAtelierAccess().getAtelierAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1254:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1256:1: 
            {
            }

             after(grammarAccess.getAtelierAccess().getAtelierAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atelier__Group__0__Impl"


    // $ANTLR start "rule__Atelier__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1266:1: rule__Atelier__Group__1 : rule__Atelier__Group__1__Impl rule__Atelier__Group__2 ;
    public final void rule__Atelier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1270:1: ( rule__Atelier__Group__1__Impl rule__Atelier__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1271:2: rule__Atelier__Group__1__Impl rule__Atelier__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier__Group__1__Impl_in_rule__Atelier__Group__12782);
            rule__Atelier__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier__Group__2_in_rule__Atelier__Group__12785);
            rule__Atelier__Group__2();

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
    // $ANTLR end "rule__Atelier__Group__1"


    // $ANTLR start "rule__Atelier__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1278:1: rule__Atelier__Group__1__Impl : ( 'atelier' ) ;
    public final void rule__Atelier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1282:1: ( ( 'atelier' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1283:1: ( 'atelier' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1283:1: ( 'atelier' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1284:1: 'atelier'
            {
             before(grammarAccess.getAtelierAccess().getAtelierKeyword_1()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Atelier__Group__1__Impl2813); 
             after(grammarAccess.getAtelierAccess().getAtelierKeyword_1()); 

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
    // $ANTLR end "rule__Atelier__Group__1__Impl"


    // $ANTLR start "rule__Atelier__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1297:1: rule__Atelier__Group__2 : rule__Atelier__Group__2__Impl rule__Atelier__Group__3 ;
    public final void rule__Atelier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1301:1: ( rule__Atelier__Group__2__Impl rule__Atelier__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1302:2: rule__Atelier__Group__2__Impl rule__Atelier__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier__Group__2__Impl_in_rule__Atelier__Group__22844);
            rule__Atelier__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier__Group__3_in_rule__Atelier__Group__22847);
            rule__Atelier__Group__3();

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
    // $ANTLR end "rule__Atelier__Group__2"


    // $ANTLR start "rule__Atelier__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1309:1: rule__Atelier__Group__2__Impl : ( ( rule__Atelier__IdAssignment_2 ) ) ;
    public final void rule__Atelier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1313:1: ( ( ( rule__Atelier__IdAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1314:1: ( ( rule__Atelier__IdAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1314:1: ( ( rule__Atelier__IdAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1315:1: ( rule__Atelier__IdAssignment_2 )
            {
             before(grammarAccess.getAtelierAccess().getIdAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1316:1: ( rule__Atelier__IdAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1316:2: rule__Atelier__IdAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier__IdAssignment_2_in_rule__Atelier__Group__2__Impl2874);
            rule__Atelier__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtelierAccess().getIdAssignment_2()); 

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
    // $ANTLR end "rule__Atelier__Group__2__Impl"


    // $ANTLR start "rule__Atelier__Group__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1326:1: rule__Atelier__Group__3 : rule__Atelier__Group__3__Impl rule__Atelier__Group__4 ;
    public final void rule__Atelier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1330:1: ( rule__Atelier__Group__3__Impl rule__Atelier__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1331:2: rule__Atelier__Group__3__Impl rule__Atelier__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier__Group__3__Impl_in_rule__Atelier__Group__32904);
            rule__Atelier__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier__Group__4_in_rule__Atelier__Group__32907);
            rule__Atelier__Group__4();

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
    // $ANTLR end "rule__Atelier__Group__3"


    // $ANTLR start "rule__Atelier__Group__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1338:1: rule__Atelier__Group__3__Impl : ( '{' ) ;
    public final void rule__Atelier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1342:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1343:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1343:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1344:1: '{'
            {
             before(grammarAccess.getAtelierAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Atelier__Group__3__Impl2935); 
             after(grammarAccess.getAtelierAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Atelier__Group__3__Impl"


    // $ANTLR start "rule__Atelier__Group__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1357:1: rule__Atelier__Group__4 : rule__Atelier__Group__4__Impl rule__Atelier__Group__5 ;
    public final void rule__Atelier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1361:1: ( rule__Atelier__Group__4__Impl rule__Atelier__Group__5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1362:2: rule__Atelier__Group__4__Impl rule__Atelier__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier__Group__4__Impl_in_rule__Atelier__Group__42966);
            rule__Atelier__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier__Group__5_in_rule__Atelier__Group__42969);
            rule__Atelier__Group__5();

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
    // $ANTLR end "rule__Atelier__Group__4"


    // $ANTLR start "rule__Atelier__Group__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1369:1: rule__Atelier__Group__4__Impl : ( ( rule__Atelier__ActivityAssignment_4 )* ) ;
    public final void rule__Atelier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1373:1: ( ( ( rule__Atelier__ActivityAssignment_4 )* ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1374:1: ( ( rule__Atelier__ActivityAssignment_4 )* )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1374:1: ( ( rule__Atelier__ActivityAssignment_4 )* )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1375:1: ( rule__Atelier__ActivityAssignment_4 )*
            {
             before(grammarAccess.getAtelierAccess().getActivityAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1376:1: ( rule__Atelier__ActivityAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==52) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1376:2: rule__Atelier__ActivityAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Atelier__ActivityAssignment_4_in_rule__Atelier__Group__4__Impl2996);
            	    rule__Atelier__ActivityAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAtelierAccess().getActivityAssignment_4()); 

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
    // $ANTLR end "rule__Atelier__Group__4__Impl"


    // $ANTLR start "rule__Atelier__Group__5"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1386:1: rule__Atelier__Group__5 : rule__Atelier__Group__5__Impl ;
    public final void rule__Atelier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1390:1: ( rule__Atelier__Group__5__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1391:2: rule__Atelier__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier__Group__5__Impl_in_rule__Atelier__Group__53027);
            rule__Atelier__Group__5__Impl();

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
    // $ANTLR end "rule__Atelier__Group__5"


    // $ANTLR start "rule__Atelier__Group__5__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1397:1: rule__Atelier__Group__5__Impl : ( '}' ) ;
    public final void rule__Atelier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1401:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1402:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1402:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1403:1: '}'
            {
             before(grammarAccess.getAtelierAccess().getRightCurlyBracketKeyword_5()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Atelier__Group__5__Impl3055); 
             after(grammarAccess.getAtelierAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Atelier__Group__5__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1428:1: rule__PeriodicActivity__Group__0 : rule__PeriodicActivity__Group__0__Impl rule__PeriodicActivity__Group__1 ;
    public final void rule__PeriodicActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1432:1: ( rule__PeriodicActivity__Group__0__Impl rule__PeriodicActivity__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1433:2: rule__PeriodicActivity__Group__0__Impl rule__PeriodicActivity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__0__Impl_in_rule__PeriodicActivity__Group__03098);
            rule__PeriodicActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__1_in_rule__PeriodicActivity__Group__03101);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1440:1: rule__PeriodicActivity__Group__0__Impl : ( () ) ;
    public final void rule__PeriodicActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1444:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1445:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1445:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1446:1: ()
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicActivityAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1447:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1449:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1459:1: rule__PeriodicActivity__Group__1 : rule__PeriodicActivity__Group__1__Impl rule__PeriodicActivity__Group__2 ;
    public final void rule__PeriodicActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1463:1: ( rule__PeriodicActivity__Group__1__Impl rule__PeriodicActivity__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1464:2: rule__PeriodicActivity__Group__1__Impl rule__PeriodicActivity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__1__Impl_in_rule__PeriodicActivity__Group__13159);
            rule__PeriodicActivity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__2_in_rule__PeriodicActivity__Group__13162);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1471:1: rule__PeriodicActivity__Group__1__Impl : ( 'PeriodicActivity' ) ;
    public final void rule__PeriodicActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1475:1: ( ( 'PeriodicActivity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1476:1: ( 'PeriodicActivity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1476:1: ( 'PeriodicActivity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1477:1: 'PeriodicActivity'
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicActivityKeyword_1()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__PeriodicActivity__Group__1__Impl3190); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1490:1: rule__PeriodicActivity__Group__2 : rule__PeriodicActivity__Group__2__Impl rule__PeriodicActivity__Group__3 ;
    public final void rule__PeriodicActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1494:1: ( rule__PeriodicActivity__Group__2__Impl rule__PeriodicActivity__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1495:2: rule__PeriodicActivity__Group__2__Impl rule__PeriodicActivity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__2__Impl_in_rule__PeriodicActivity__Group__23221);
            rule__PeriodicActivity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__3_in_rule__PeriodicActivity__Group__23224);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1502:1: rule__PeriodicActivity__Group__2__Impl : ( ( rule__PeriodicActivity__NameAssignment_2 ) ) ;
    public final void rule__PeriodicActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1506:1: ( ( ( rule__PeriodicActivity__NameAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1507:1: ( ( rule__PeriodicActivity__NameAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1507:1: ( ( rule__PeriodicActivity__NameAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1508:1: ( rule__PeriodicActivity__NameAssignment_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getNameAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1509:1: ( rule__PeriodicActivity__NameAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1509:2: rule__PeriodicActivity__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__NameAssignment_2_in_rule__PeriodicActivity__Group__2__Impl3251);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1519:1: rule__PeriodicActivity__Group__3 : rule__PeriodicActivity__Group__3__Impl rule__PeriodicActivity__Group__4 ;
    public final void rule__PeriodicActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1523:1: ( rule__PeriodicActivity__Group__3__Impl rule__PeriodicActivity__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1524:2: rule__PeriodicActivity__Group__3__Impl rule__PeriodicActivity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__3__Impl_in_rule__PeriodicActivity__Group__33281);
            rule__PeriodicActivity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__4_in_rule__PeriodicActivity__Group__33284);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1531:1: rule__PeriodicActivity__Group__3__Impl : ( '{' ) ;
    public final void rule__PeriodicActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1535:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1536:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1536:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1537:1: '{'
            {
             before(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__PeriodicActivity__Group__3__Impl3312); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1550:1: rule__PeriodicActivity__Group__4 : rule__PeriodicActivity__Group__4__Impl rule__PeriodicActivity__Group__5 ;
    public final void rule__PeriodicActivity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1554:1: ( rule__PeriodicActivity__Group__4__Impl rule__PeriodicActivity__Group__5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1555:2: rule__PeriodicActivity__Group__4__Impl rule__PeriodicActivity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__4__Impl_in_rule__PeriodicActivity__Group__43343);
            rule__PeriodicActivity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__5_in_rule__PeriodicActivity__Group__43346);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1562:1: rule__PeriodicActivity__Group__4__Impl : ( 'from' ) ;
    public final void rule__PeriodicActivity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1566:1: ( ( 'from' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1567:1: ( 'from' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1567:1: ( 'from' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1568:1: 'from'
            {
             before(grammarAccess.getPeriodicActivityAccess().getFromKeyword_4()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__PeriodicActivity__Group__4__Impl3374); 
             after(grammarAccess.getPeriodicActivityAccess().getFromKeyword_4()); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1581:1: rule__PeriodicActivity__Group__5 : rule__PeriodicActivity__Group__5__Impl rule__PeriodicActivity__Group__6 ;
    public final void rule__PeriodicActivity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1585:1: ( rule__PeriodicActivity__Group__5__Impl rule__PeriodicActivity__Group__6 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1586:2: rule__PeriodicActivity__Group__5__Impl rule__PeriodicActivity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__5__Impl_in_rule__PeriodicActivity__Group__53405);
            rule__PeriodicActivity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__6_in_rule__PeriodicActivity__Group__53408);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1593:1: rule__PeriodicActivity__Group__5__Impl : ( ( rule__PeriodicActivity__StartAssignment_5 ) ) ;
    public final void rule__PeriodicActivity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1597:1: ( ( ( rule__PeriodicActivity__StartAssignment_5 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1598:1: ( ( rule__PeriodicActivity__StartAssignment_5 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1598:1: ( ( rule__PeriodicActivity__StartAssignment_5 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1599:1: ( rule__PeriodicActivity__StartAssignment_5 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getStartAssignment_5()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1600:1: ( rule__PeriodicActivity__StartAssignment_5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1600:2: rule__PeriodicActivity__StartAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__StartAssignment_5_in_rule__PeriodicActivity__Group__5__Impl3435);
            rule__PeriodicActivity__StartAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getStartAssignment_5()); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1610:1: rule__PeriodicActivity__Group__6 : rule__PeriodicActivity__Group__6__Impl rule__PeriodicActivity__Group__7 ;
    public final void rule__PeriodicActivity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1614:1: ( rule__PeriodicActivity__Group__6__Impl rule__PeriodicActivity__Group__7 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1615:2: rule__PeriodicActivity__Group__6__Impl rule__PeriodicActivity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__6__Impl_in_rule__PeriodicActivity__Group__63465);
            rule__PeriodicActivity__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__7_in_rule__PeriodicActivity__Group__63468);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1622:1: rule__PeriodicActivity__Group__6__Impl : ( 'to' ) ;
    public final void rule__PeriodicActivity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1626:1: ( ( 'to' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1627:1: ( 'to' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1627:1: ( 'to' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1628:1: 'to'
            {
             before(grammarAccess.getPeriodicActivityAccess().getToKeyword_6()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__PeriodicActivity__Group__6__Impl3496); 
             after(grammarAccess.getPeriodicActivityAccess().getToKeyword_6()); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1641:1: rule__PeriodicActivity__Group__7 : rule__PeriodicActivity__Group__7__Impl rule__PeriodicActivity__Group__8 ;
    public final void rule__PeriodicActivity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1645:1: ( rule__PeriodicActivity__Group__7__Impl rule__PeriodicActivity__Group__8 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1646:2: rule__PeriodicActivity__Group__7__Impl rule__PeriodicActivity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__7__Impl_in_rule__PeriodicActivity__Group__73527);
            rule__PeriodicActivity__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__8_in_rule__PeriodicActivity__Group__73530);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1653:1: rule__PeriodicActivity__Group__7__Impl : ( ( rule__PeriodicActivity__EndAssignment_7 ) ) ;
    public final void rule__PeriodicActivity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1657:1: ( ( ( rule__PeriodicActivity__EndAssignment_7 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1658:1: ( ( rule__PeriodicActivity__EndAssignment_7 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1658:1: ( ( rule__PeriodicActivity__EndAssignment_7 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1659:1: ( rule__PeriodicActivity__EndAssignment_7 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getEndAssignment_7()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1660:1: ( rule__PeriodicActivity__EndAssignment_7 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1660:2: rule__PeriodicActivity__EndAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__EndAssignment_7_in_rule__PeriodicActivity__Group__7__Impl3557);
            rule__PeriodicActivity__EndAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getEndAssignment_7()); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1670:1: rule__PeriodicActivity__Group__8 : rule__PeriodicActivity__Group__8__Impl rule__PeriodicActivity__Group__9 ;
    public final void rule__PeriodicActivity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1674:1: ( rule__PeriodicActivity__Group__8__Impl rule__PeriodicActivity__Group__9 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1675:2: rule__PeriodicActivity__Group__8__Impl rule__PeriodicActivity__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__8__Impl_in_rule__PeriodicActivity__Group__83587);
            rule__PeriodicActivity__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__9_in_rule__PeriodicActivity__Group__83590);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1682:1: rule__PeriodicActivity__Group__8__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1686:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1687:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1687:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1688:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_8()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__PeriodicActivity__Group__8__Impl3618); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_8()); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1701:1: rule__PeriodicActivity__Group__9 : rule__PeriodicActivity__Group__9__Impl rule__PeriodicActivity__Group__10 ;
    public final void rule__PeriodicActivity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1705:1: ( rule__PeriodicActivity__Group__9__Impl rule__PeriodicActivity__Group__10 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1706:2: rule__PeriodicActivity__Group__9__Impl rule__PeriodicActivity__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__9__Impl_in_rule__PeriodicActivity__Group__93649);
            rule__PeriodicActivity__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__10_in_rule__PeriodicActivity__Group__93652);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1713:1: rule__PeriodicActivity__Group__9__Impl : ( ( rule__PeriodicActivity__Group_9__0 )? ) ;
    public final void rule__PeriodicActivity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1717:1: ( ( ( rule__PeriodicActivity__Group_9__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1718:1: ( ( rule__PeriodicActivity__Group_9__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1718:1: ( ( rule__PeriodicActivity__Group_9__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1719:1: ( rule__PeriodicActivity__Group_9__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_9()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1720:1: ( rule__PeriodicActivity__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==56) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1720:2: rule__PeriodicActivity__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_9__0_in_rule__PeriodicActivity__Group__9__Impl3679);
                    rule__PeriodicActivity__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPeriodicActivityAccess().getGroup_9()); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1730:1: rule__PeriodicActivity__Group__10 : rule__PeriodicActivity__Group__10__Impl rule__PeriodicActivity__Group__11 ;
    public final void rule__PeriodicActivity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1734:1: ( rule__PeriodicActivity__Group__10__Impl rule__PeriodicActivity__Group__11 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1735:2: rule__PeriodicActivity__Group__10__Impl rule__PeriodicActivity__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__10__Impl_in_rule__PeriodicActivity__Group__103710);
            rule__PeriodicActivity__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__11_in_rule__PeriodicActivity__Group__103713);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1742:1: rule__PeriodicActivity__Group__10__Impl : ( ( rule__PeriodicActivity__Group_10__0 )? ) ;
    public final void rule__PeriodicActivity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1746:1: ( ( ( rule__PeriodicActivity__Group_10__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1747:1: ( ( rule__PeriodicActivity__Group_10__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1747:1: ( ( rule__PeriodicActivity__Group_10__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1748:1: ( rule__PeriodicActivity__Group_10__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_10()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1749:1: ( rule__PeriodicActivity__Group_10__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==57) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1749:2: rule__PeriodicActivity__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__0_in_rule__PeriodicActivity__Group__10__Impl3740);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1759:1: rule__PeriodicActivity__Group__11 : rule__PeriodicActivity__Group__11__Impl rule__PeriodicActivity__Group__12 ;
    public final void rule__PeriodicActivity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1763:1: ( rule__PeriodicActivity__Group__11__Impl rule__PeriodicActivity__Group__12 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1764:2: rule__PeriodicActivity__Group__11__Impl rule__PeriodicActivity__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__11__Impl_in_rule__PeriodicActivity__Group__113771);
            rule__PeriodicActivity__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__12_in_rule__PeriodicActivity__Group__113774);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1771:1: rule__PeriodicActivity__Group__11__Impl : ( ( rule__PeriodicActivity__Group_11__0 )? ) ;
    public final void rule__PeriodicActivity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1775:1: ( ( ( rule__PeriodicActivity__Group_11__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1776:1: ( ( rule__PeriodicActivity__Group_11__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1776:1: ( ( rule__PeriodicActivity__Group_11__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1777:1: ( rule__PeriodicActivity__Group_11__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_11()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1778:1: ( rule__PeriodicActivity__Group_11__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==58) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1778:2: rule__PeriodicActivity__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__0_in_rule__PeriodicActivity__Group__11__Impl3801);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1788:1: rule__PeriodicActivity__Group__12 : rule__PeriodicActivity__Group__12__Impl ;
    public final void rule__PeriodicActivity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1792:1: ( rule__PeriodicActivity__Group__12__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1793:2: rule__PeriodicActivity__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__12__Impl_in_rule__PeriodicActivity__Group__123832);
            rule__PeriodicActivity__Group__12__Impl();

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1799:1: rule__PeriodicActivity__Group__12__Impl : ( '}' ) ;
    public final void rule__PeriodicActivity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1803:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1804:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1804:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1805:1: '}'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_12()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__PeriodicActivity__Group__12__Impl3860); 
             after(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_12()); 

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


    // $ANTLR start "rule__PeriodicActivity__Group_9__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1844:1: rule__PeriodicActivity__Group_9__0 : rule__PeriodicActivity__Group_9__0__Impl rule__PeriodicActivity__Group_9__1 ;
    public final void rule__PeriodicActivity__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1848:1: ( rule__PeriodicActivity__Group_9__0__Impl rule__PeriodicActivity__Group_9__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1849:2: rule__PeriodicActivity__Group_9__0__Impl rule__PeriodicActivity__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_9__0__Impl_in_rule__PeriodicActivity__Group_9__03917);
            rule__PeriodicActivity__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_9__1_in_rule__PeriodicActivity__Group_9__03920);
            rule__PeriodicActivity__Group_9__1();

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
    // $ANTLR end "rule__PeriodicActivity__Group_9__0"


    // $ANTLR start "rule__PeriodicActivity__Group_9__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1856:1: rule__PeriodicActivity__Group_9__0__Impl : ( 'every' ) ;
    public final void rule__PeriodicActivity__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1860:1: ( ( 'every' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1861:1: ( 'every' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1861:1: ( 'every' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1862:1: 'every'
            {
             before(grammarAccess.getPeriodicActivityAccess().getEveryKeyword_9_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__PeriodicActivity__Group_9__0__Impl3948); 
             after(grammarAccess.getPeriodicActivityAccess().getEveryKeyword_9_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_9__0__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_9__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1875:1: rule__PeriodicActivity__Group_9__1 : rule__PeriodicActivity__Group_9__1__Impl rule__PeriodicActivity__Group_9__2 ;
    public final void rule__PeriodicActivity__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1879:1: ( rule__PeriodicActivity__Group_9__1__Impl rule__PeriodicActivity__Group_9__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1880:2: rule__PeriodicActivity__Group_9__1__Impl rule__PeriodicActivity__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_9__1__Impl_in_rule__PeriodicActivity__Group_9__13979);
            rule__PeriodicActivity__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_9__2_in_rule__PeriodicActivity__Group_9__13982);
            rule__PeriodicActivity__Group_9__2();

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
    // $ANTLR end "rule__PeriodicActivity__Group_9__1"


    // $ANTLR start "rule__PeriodicActivity__Group_9__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1887:1: rule__PeriodicActivity__Group_9__1__Impl : ( ( rule__PeriodicActivity__FrequencyAssignment_9_1 )? ) ;
    public final void rule__PeriodicActivity__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1891:1: ( ( ( rule__PeriodicActivity__FrequencyAssignment_9_1 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1892:1: ( ( rule__PeriodicActivity__FrequencyAssignment_9_1 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1892:1: ( ( rule__PeriodicActivity__FrequencyAssignment_9_1 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1893:1: ( rule__PeriodicActivity__FrequencyAssignment_9_1 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getFrequencyAssignment_9_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1894:1: ( rule__PeriodicActivity__FrequencyAssignment_9_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT||LA21_0==73) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1894:2: rule__PeriodicActivity__FrequencyAssignment_9_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__FrequencyAssignment_9_1_in_rule__PeriodicActivity__Group_9__1__Impl4009);
                    rule__PeriodicActivity__FrequencyAssignment_9_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPeriodicActivityAccess().getFrequencyAssignment_9_1()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_9__1__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_9__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1904:1: rule__PeriodicActivity__Group_9__2 : rule__PeriodicActivity__Group_9__2__Impl rule__PeriodicActivity__Group_9__3 ;
    public final void rule__PeriodicActivity__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1908:1: ( rule__PeriodicActivity__Group_9__2__Impl rule__PeriodicActivity__Group_9__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1909:2: rule__PeriodicActivity__Group_9__2__Impl rule__PeriodicActivity__Group_9__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_9__2__Impl_in_rule__PeriodicActivity__Group_9__24040);
            rule__PeriodicActivity__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_9__3_in_rule__PeriodicActivity__Group_9__24043);
            rule__PeriodicActivity__Group_9__3();

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
    // $ANTLR end "rule__PeriodicActivity__Group_9__2"


    // $ANTLR start "rule__PeriodicActivity__Group_9__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1916:1: rule__PeriodicActivity__Group_9__2__Impl : ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_9_2 ) ) ;
    public final void rule__PeriodicActivity__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1920:1: ( ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_9_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1921:1: ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_9_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1921:1: ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_9_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1922:1: ( rule__PeriodicActivity__PeriodicityTypeAssignment_9_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypeAssignment_9_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1923:1: ( rule__PeriodicActivity__PeriodicityTypeAssignment_9_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1923:2: rule__PeriodicActivity__PeriodicityTypeAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__PeriodicityTypeAssignment_9_2_in_rule__PeriodicActivity__Group_9__2__Impl4070);
            rule__PeriodicActivity__PeriodicityTypeAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypeAssignment_9_2()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_9__2__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_9__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1933:1: rule__PeriodicActivity__Group_9__3 : rule__PeriodicActivity__Group_9__3__Impl ;
    public final void rule__PeriodicActivity__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1937:1: ( rule__PeriodicActivity__Group_9__3__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1938:2: rule__PeriodicActivity__Group_9__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_9__3__Impl_in_rule__PeriodicActivity__Group_9__34100);
            rule__PeriodicActivity__Group_9__3__Impl();

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
    // $ANTLR end "rule__PeriodicActivity__Group_9__3"


    // $ANTLR start "rule__PeriodicActivity__Group_9__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1944:1: rule__PeriodicActivity__Group_9__3__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1948:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1949:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1949:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1950:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_9_3()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__PeriodicActivity__Group_9__3__Impl4128); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_9_3()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_9__3__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_10__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1971:1: rule__PeriodicActivity__Group_10__0 : rule__PeriodicActivity__Group_10__0__Impl rule__PeriodicActivity__Group_10__1 ;
    public final void rule__PeriodicActivity__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1975:1: ( rule__PeriodicActivity__Group_10__0__Impl rule__PeriodicActivity__Group_10__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1976:2: rule__PeriodicActivity__Group_10__0__Impl rule__PeriodicActivity__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__0__Impl_in_rule__PeriodicActivity__Group_10__04167);
            rule__PeriodicActivity__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__1_in_rule__PeriodicActivity__Group_10__04170);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1983:1: rule__PeriodicActivity__Group_10__0__Impl : ( 'allocate' ) ;
    public final void rule__PeriodicActivity__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1987:1: ( ( 'allocate' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1988:1: ( 'allocate' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1988:1: ( 'allocate' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1989:1: 'allocate'
            {
             before(grammarAccess.getPeriodicActivityAccess().getAllocateKeyword_10_0()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__PeriodicActivity__Group_10__0__Impl4198); 
             after(grammarAccess.getPeriodicActivityAccess().getAllocateKeyword_10_0()); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2002:1: rule__PeriodicActivity__Group_10__1 : rule__PeriodicActivity__Group_10__1__Impl rule__PeriodicActivity__Group_10__2 ;
    public final void rule__PeriodicActivity__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2006:1: ( rule__PeriodicActivity__Group_10__1__Impl rule__PeriodicActivity__Group_10__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2007:2: rule__PeriodicActivity__Group_10__1__Impl rule__PeriodicActivity__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__1__Impl_in_rule__PeriodicActivity__Group_10__14229);
            rule__PeriodicActivity__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__2_in_rule__PeriodicActivity__Group_10__14232);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2014:1: rule__PeriodicActivity__Group_10__1__Impl : ( '{' ) ;
    public final void rule__PeriodicActivity__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2018:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2019:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2019:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2020:1: '{'
            {
             before(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__PeriodicActivity__Group_10__1__Impl4260); 
             after(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_10_1()); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2033:1: rule__PeriodicActivity__Group_10__2 : rule__PeriodicActivity__Group_10__2__Impl rule__PeriodicActivity__Group_10__3 ;
    public final void rule__PeriodicActivity__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2037:1: ( rule__PeriodicActivity__Group_10__2__Impl rule__PeriodicActivity__Group_10__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2038:2: rule__PeriodicActivity__Group_10__2__Impl rule__PeriodicActivity__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__2__Impl_in_rule__PeriodicActivity__Group_10__24291);
            rule__PeriodicActivity__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__3_in_rule__PeriodicActivity__Group_10__24294);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2045:1: rule__PeriodicActivity__Group_10__2__Impl : ( ( rule__PeriodicActivity__ResAllocationAssignment_10_2 ) ) ;
    public final void rule__PeriodicActivity__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2049:1: ( ( ( rule__PeriodicActivity__ResAllocationAssignment_10_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2050:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_10_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2050:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_10_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2051:1: ( rule__PeriodicActivity__ResAllocationAssignment_10_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_10_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2052:1: ( rule__PeriodicActivity__ResAllocationAssignment_10_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2052:2: rule__PeriodicActivity__ResAllocationAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_10_2_in_rule__PeriodicActivity__Group_10__2__Impl4321);
            rule__PeriodicActivity__ResAllocationAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_10_2()); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2062:1: rule__PeriodicActivity__Group_10__3 : rule__PeriodicActivity__Group_10__3__Impl rule__PeriodicActivity__Group_10__4 ;
    public final void rule__PeriodicActivity__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2066:1: ( rule__PeriodicActivity__Group_10__3__Impl rule__PeriodicActivity__Group_10__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2067:2: rule__PeriodicActivity__Group_10__3__Impl rule__PeriodicActivity__Group_10__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__3__Impl_in_rule__PeriodicActivity__Group_10__34351);
            rule__PeriodicActivity__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__4_in_rule__PeriodicActivity__Group_10__34354);
            rule__PeriodicActivity__Group_10__4();

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2074:1: rule__PeriodicActivity__Group_10__3__Impl : ( ( rule__PeriodicActivity__Group_10_3__0 )* ) ;
    public final void rule__PeriodicActivity__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2078:1: ( ( ( rule__PeriodicActivity__Group_10_3__0 )* ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2079:1: ( ( rule__PeriodicActivity__Group_10_3__0 )* )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2079:1: ( ( rule__PeriodicActivity__Group_10_3__0 )* )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2080:1: ( rule__PeriodicActivity__Group_10_3__0 )*
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_10_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2081:1: ( rule__PeriodicActivity__Group_10_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==55) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2081:2: rule__PeriodicActivity__Group_10_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10_3__0_in_rule__PeriodicActivity__Group_10__3__Impl4381);
            	    rule__PeriodicActivity__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPeriodicActivityAccess().getGroup_10_3()); 

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


    // $ANTLR start "rule__PeriodicActivity__Group_10__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2091:1: rule__PeriodicActivity__Group_10__4 : rule__PeriodicActivity__Group_10__4__Impl rule__PeriodicActivity__Group_10__5 ;
    public final void rule__PeriodicActivity__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2095:1: ( rule__PeriodicActivity__Group_10__4__Impl rule__PeriodicActivity__Group_10__5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2096:2: rule__PeriodicActivity__Group_10__4__Impl rule__PeriodicActivity__Group_10__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__4__Impl_in_rule__PeriodicActivity__Group_10__44412);
            rule__PeriodicActivity__Group_10__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__5_in_rule__PeriodicActivity__Group_10__44415);
            rule__PeriodicActivity__Group_10__5();

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
    // $ANTLR end "rule__PeriodicActivity__Group_10__4"


    // $ANTLR start "rule__PeriodicActivity__Group_10__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2103:1: rule__PeriodicActivity__Group_10__4__Impl : ( '}' ) ;
    public final void rule__PeriodicActivity__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2107:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2108:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2108:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2109:1: '}'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__PeriodicActivity__Group_10__4__Impl4443); 
             after(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_10_4()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_10__4__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_10__5"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2122:1: rule__PeriodicActivity__Group_10__5 : rule__PeriodicActivity__Group_10__5__Impl ;
    public final void rule__PeriodicActivity__Group_10__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2126:1: ( rule__PeriodicActivity__Group_10__5__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2127:2: rule__PeriodicActivity__Group_10__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__5__Impl_in_rule__PeriodicActivity__Group_10__54474);
            rule__PeriodicActivity__Group_10__5__Impl();

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
    // $ANTLR end "rule__PeriodicActivity__Group_10__5"


    // $ANTLR start "rule__PeriodicActivity__Group_10__5__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2133:1: rule__PeriodicActivity__Group_10__5__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_10__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2137:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2138:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2138:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2139:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_10_5()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__PeriodicActivity__Group_10__5__Impl4502); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_10_5()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_10__5__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_10_3__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2164:1: rule__PeriodicActivity__Group_10_3__0 : rule__PeriodicActivity__Group_10_3__0__Impl rule__PeriodicActivity__Group_10_3__1 ;
    public final void rule__PeriodicActivity__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2168:1: ( rule__PeriodicActivity__Group_10_3__0__Impl rule__PeriodicActivity__Group_10_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2169:2: rule__PeriodicActivity__Group_10_3__0__Impl rule__PeriodicActivity__Group_10_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10_3__0__Impl_in_rule__PeriodicActivity__Group_10_3__04545);
            rule__PeriodicActivity__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10_3__1_in_rule__PeriodicActivity__Group_10_3__04548);
            rule__PeriodicActivity__Group_10_3__1();

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
    // $ANTLR end "rule__PeriodicActivity__Group_10_3__0"


    // $ANTLR start "rule__PeriodicActivity__Group_10_3__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2176:1: rule__PeriodicActivity__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2180:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2181:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2181:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2182:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_10_3_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__PeriodicActivity__Group_10_3__0__Impl4576); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_10_3_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_10_3__0__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_10_3__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2195:1: rule__PeriodicActivity__Group_10_3__1 : rule__PeriodicActivity__Group_10_3__1__Impl ;
    public final void rule__PeriodicActivity__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2199:1: ( rule__PeriodicActivity__Group_10_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2200:2: rule__PeriodicActivity__Group_10_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10_3__1__Impl_in_rule__PeriodicActivity__Group_10_3__14607);
            rule__PeriodicActivity__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__PeriodicActivity__Group_10_3__1"


    // $ANTLR start "rule__PeriodicActivity__Group_10_3__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2206:1: rule__PeriodicActivity__Group_10_3__1__Impl : ( ( rule__PeriodicActivity__ResAllocationAssignment_10_3_1 ) ) ;
    public final void rule__PeriodicActivity__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2210:1: ( ( ( rule__PeriodicActivity__ResAllocationAssignment_10_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2211:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_10_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2211:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_10_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2212:1: ( rule__PeriodicActivity__ResAllocationAssignment_10_3_1 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_10_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2213:1: ( rule__PeriodicActivity__ResAllocationAssignment_10_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2213:2: rule__PeriodicActivity__ResAllocationAssignment_10_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_10_3_1_in_rule__PeriodicActivity__Group_10_3__1__Impl4634);
            rule__PeriodicActivity__ResAllocationAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_10_3_1()); 

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
    // $ANTLR end "rule__PeriodicActivity__Group_10_3__1__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_11__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2227:1: rule__PeriodicActivity__Group_11__0 : rule__PeriodicActivity__Group_11__0__Impl rule__PeriodicActivity__Group_11__1 ;
    public final void rule__PeriodicActivity__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2231:1: ( rule__PeriodicActivity__Group_11__0__Impl rule__PeriodicActivity__Group_11__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2232:2: rule__PeriodicActivity__Group_11__0__Impl rule__PeriodicActivity__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__0__Impl_in_rule__PeriodicActivity__Group_11__04668);
            rule__PeriodicActivity__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__1_in_rule__PeriodicActivity__Group_11__04671);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2239:1: rule__PeriodicActivity__Group_11__0__Impl : ( 'rules' ) ;
    public final void rule__PeriodicActivity__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2243:1: ( ( 'rules' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2244:1: ( 'rules' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2244:1: ( 'rules' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2245:1: 'rules'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRulesKeyword_11_0()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__PeriodicActivity__Group_11__0__Impl4699); 
             after(grammarAccess.getPeriodicActivityAccess().getRulesKeyword_11_0()); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2258:1: rule__PeriodicActivity__Group_11__1 : rule__PeriodicActivity__Group_11__1__Impl rule__PeriodicActivity__Group_11__2 ;
    public final void rule__PeriodicActivity__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2262:1: ( rule__PeriodicActivity__Group_11__1__Impl rule__PeriodicActivity__Group_11__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2263:2: rule__PeriodicActivity__Group_11__1__Impl rule__PeriodicActivity__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__1__Impl_in_rule__PeriodicActivity__Group_11__14730);
            rule__PeriodicActivity__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__2_in_rule__PeriodicActivity__Group_11__14733);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2270:1: rule__PeriodicActivity__Group_11__1__Impl : ( ':' ) ;
    public final void rule__PeriodicActivity__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2274:1: ( ( ':' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2275:1: ( ':' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2275:1: ( ':' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2276:1: ':'
            {
             before(grammarAccess.getPeriodicActivityAccess().getColonKeyword_11_1()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__PeriodicActivity__Group_11__1__Impl4761); 
             after(grammarAccess.getPeriodicActivityAccess().getColonKeyword_11_1()); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2289:1: rule__PeriodicActivity__Group_11__2 : rule__PeriodicActivity__Group_11__2__Impl rule__PeriodicActivity__Group_11__3 ;
    public final void rule__PeriodicActivity__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2293:1: ( rule__PeriodicActivity__Group_11__2__Impl rule__PeriodicActivity__Group_11__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2294:2: rule__PeriodicActivity__Group_11__2__Impl rule__PeriodicActivity__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__2__Impl_in_rule__PeriodicActivity__Group_11__24792);
            rule__PeriodicActivity__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__3_in_rule__PeriodicActivity__Group_11__24795);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2301:1: rule__PeriodicActivity__Group_11__2__Impl : ( ( rule__PeriodicActivity__RuleAssignment_11_2 ) ) ;
    public final void rule__PeriodicActivity__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2305:1: ( ( ( rule__PeriodicActivity__RuleAssignment_11_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2306:1: ( ( rule__PeriodicActivity__RuleAssignment_11_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2306:1: ( ( rule__PeriodicActivity__RuleAssignment_11_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2307:1: ( rule__PeriodicActivity__RuleAssignment_11_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleAssignment_11_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2308:1: ( rule__PeriodicActivity__RuleAssignment_11_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2308:2: rule__PeriodicActivity__RuleAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__RuleAssignment_11_2_in_rule__PeriodicActivity__Group_11__2__Impl4822);
            rule__PeriodicActivity__RuleAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getRuleAssignment_11_2()); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2318:1: rule__PeriodicActivity__Group_11__3 : rule__PeriodicActivity__Group_11__3__Impl ;
    public final void rule__PeriodicActivity__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2322:1: ( rule__PeriodicActivity__Group_11__3__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2323:2: rule__PeriodicActivity__Group_11__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__3__Impl_in_rule__PeriodicActivity__Group_11__34852);
            rule__PeriodicActivity__Group_11__3__Impl();

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2329:1: rule__PeriodicActivity__Group_11__3__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2333:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2334:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2334:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2335:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11_3()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__PeriodicActivity__Group_11__3__Impl4880); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11_3()); 

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


    // $ANTLR start "rule__Date__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2356:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2360:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2361:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__04919);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1_in_rule__Date__Group__04922);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2368:1: rule__Date__Group__0__Impl : ( () ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2372:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2373:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2373:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2374:1: ()
            {
             before(grammarAccess.getDateAccess().getDateAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2375:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2377:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2387:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2391:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2392:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__14980);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2_in_rule__Date__Group__14983);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2399:1: rule__Date__Group__1__Impl : ( ( rule__Date__DayAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2403:1: ( ( ( rule__Date__DayAssignment_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2404:1: ( ( rule__Date__DayAssignment_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2404:1: ( ( rule__Date__DayAssignment_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2405:1: ( rule__Date__DayAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2406:1: ( rule__Date__DayAssignment_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2406:2: rule__Date__DayAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl5010);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2416:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2420:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2421:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__25040);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__3_in_rule__Date__Group__25043);
            rule__Date__Group__3();

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2428:1: rule__Date__Group__2__Impl : ( ( rule__Date__MonthAssignment_2 ) ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2432:1: ( ( ( rule__Date__MonthAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2433:1: ( ( rule__Date__MonthAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2433:1: ( ( rule__Date__MonthAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2434:1: ( rule__Date__MonthAssignment_2 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2435:1: ( rule__Date__MonthAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2435:2: rule__Date__MonthAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__MonthAssignment_2_in_rule__Date__Group__2__Impl5070);
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


    // $ANTLR start "rule__Date__Group__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2445:1: rule__Date__Group__3 : rule__Date__Group__3__Impl ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2449:1: ( rule__Date__Group__3__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2450:2: rule__Date__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__35100);
            rule__Date__Group__3__Impl();

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
    // $ANTLR end "rule__Date__Group__3"


    // $ANTLR start "rule__Date__Group__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2456:1: rule__Date__Group__3__Impl : ( ( rule__Date__YearAssignment_3 ) ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2460:1: ( ( ( rule__Date__YearAssignment_3 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2461:1: ( ( rule__Date__YearAssignment_3 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2461:1: ( ( rule__Date__YearAssignment_3 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2462:1: ( rule__Date__YearAssignment_3 )
            {
             before(grammarAccess.getDateAccess().getYearAssignment_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2463:1: ( rule__Date__YearAssignment_3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2463:2: rule__Date__YearAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__YearAssignment_3_in_rule__Date__Group__3__Impl5127);
            rule__Date__YearAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getYearAssignment_3()); 

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
    // $ANTLR end "rule__Date__Group__3__Impl"


    // $ANTLR start "rule__ResAllocation__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2481:1: rule__ResAllocation__Group__0 : rule__ResAllocation__Group__0__Impl rule__ResAllocation__Group__1 ;
    public final void rule__ResAllocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2485:1: ( rule__ResAllocation__Group__0__Impl rule__ResAllocation__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2486:2: rule__ResAllocation__Group__0__Impl rule__ResAllocation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__0__Impl_in_rule__ResAllocation__Group__05165);
            rule__ResAllocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__1_in_rule__ResAllocation__Group__05168);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2493:1: rule__ResAllocation__Group__0__Impl : ( () ) ;
    public final void rule__ResAllocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2497:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2498:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2498:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2499:1: ()
            {
             before(grammarAccess.getResAllocationAccess().getRessourceAllocationAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2500:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2502:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2512:1: rule__ResAllocation__Group__1 : rule__ResAllocation__Group__1__Impl rule__ResAllocation__Group__2 ;
    public final void rule__ResAllocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2516:1: ( rule__ResAllocation__Group__1__Impl rule__ResAllocation__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2517:2: rule__ResAllocation__Group__1__Impl rule__ResAllocation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__1__Impl_in_rule__ResAllocation__Group__15226);
            rule__ResAllocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__2_in_rule__ResAllocation__Group__15229);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2524:1: rule__ResAllocation__Group__1__Impl : ( 'reserve' ) ;
    public final void rule__ResAllocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2528:1: ( ( 'reserve' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2529:1: ( 'reserve' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2529:1: ( 'reserve' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2530:1: 'reserve'
            {
             before(grammarAccess.getResAllocationAccess().getReserveKeyword_1()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__ResAllocation__Group__1__Impl5257); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2543:1: rule__ResAllocation__Group__2 : rule__ResAllocation__Group__2__Impl rule__ResAllocation__Group__3 ;
    public final void rule__ResAllocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2547:1: ( rule__ResAllocation__Group__2__Impl rule__ResAllocation__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2548:2: rule__ResAllocation__Group__2__Impl rule__ResAllocation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__2__Impl_in_rule__ResAllocation__Group__25288);
            rule__ResAllocation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__3_in_rule__ResAllocation__Group__25291);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2555:1: rule__ResAllocation__Group__2__Impl : ( ( rule__ResAllocation__RessourceTypeAssignment_2 ) ) ;
    public final void rule__ResAllocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2559:1: ( ( ( rule__ResAllocation__RessourceTypeAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2560:1: ( ( rule__ResAllocation__RessourceTypeAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2560:1: ( ( rule__ResAllocation__RessourceTypeAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2561:1: ( rule__ResAllocation__RessourceTypeAssignment_2 )
            {
             before(grammarAccess.getResAllocationAccess().getRessourceTypeAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2562:1: ( rule__ResAllocation__RessourceTypeAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2562:2: rule__ResAllocation__RessourceTypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__RessourceTypeAssignment_2_in_rule__ResAllocation__Group__2__Impl5318);
            rule__ResAllocation__RessourceTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResAllocationAccess().getRessourceTypeAssignment_2()); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2572:1: rule__ResAllocation__Group__3 : rule__ResAllocation__Group__3__Impl rule__ResAllocation__Group__4 ;
    public final void rule__ResAllocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2576:1: ( rule__ResAllocation__Group__3__Impl rule__ResAllocation__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2577:2: rule__ResAllocation__Group__3__Impl rule__ResAllocation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__3__Impl_in_rule__ResAllocation__Group__35348);
            rule__ResAllocation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__4_in_rule__ResAllocation__Group__35351);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2584:1: rule__ResAllocation__Group__3__Impl : ( 'for' ) ;
    public final void rule__ResAllocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2588:1: ( ( 'for' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2589:1: ( 'for' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2589:1: ( 'for' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2590:1: 'for'
            {
             before(grammarAccess.getResAllocationAccess().getForKeyword_3()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__ResAllocation__Group__3__Impl5379); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2603:1: rule__ResAllocation__Group__4 : rule__ResAllocation__Group__4__Impl rule__ResAllocation__Group__5 ;
    public final void rule__ResAllocation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2607:1: ( rule__ResAllocation__Group__4__Impl rule__ResAllocation__Group__5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2608:2: rule__ResAllocation__Group__4__Impl rule__ResAllocation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__4__Impl_in_rule__ResAllocation__Group__45410);
            rule__ResAllocation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__5_in_rule__ResAllocation__Group__45413);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2615:1: rule__ResAllocation__Group__4__Impl : ( ( rule__ResAllocation__DurationAssignment_4 ) ) ;
    public final void rule__ResAllocation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2619:1: ( ( ( rule__ResAllocation__DurationAssignment_4 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2620:1: ( ( rule__ResAllocation__DurationAssignment_4 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2620:1: ( ( rule__ResAllocation__DurationAssignment_4 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2621:1: ( rule__ResAllocation__DurationAssignment_4 )
            {
             before(grammarAccess.getResAllocationAccess().getDurationAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2622:1: ( rule__ResAllocation__DurationAssignment_4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2622:2: rule__ResAllocation__DurationAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__DurationAssignment_4_in_rule__ResAllocation__Group__4__Impl5440);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2632:1: rule__ResAllocation__Group__5 : rule__ResAllocation__Group__5__Impl ;
    public final void rule__ResAllocation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2636:1: ( rule__ResAllocation__Group__5__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2637:2: rule__ResAllocation__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__5__Impl_in_rule__ResAllocation__Group__55470);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2643:1: rule__ResAllocation__Group__5__Impl : ( ( rule__ResAllocation__PeriodicityTypeAssignment_5 ) ) ;
    public final void rule__ResAllocation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2647:1: ( ( ( rule__ResAllocation__PeriodicityTypeAssignment_5 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2648:1: ( ( rule__ResAllocation__PeriodicityTypeAssignment_5 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2648:1: ( ( rule__ResAllocation__PeriodicityTypeAssignment_5 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2649:1: ( rule__ResAllocation__PeriodicityTypeAssignment_5 )
            {
             before(grammarAccess.getResAllocationAccess().getPeriodicityTypeAssignment_5()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2650:1: ( rule__ResAllocation__PeriodicityTypeAssignment_5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2650:2: rule__ResAllocation__PeriodicityTypeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__PeriodicityTypeAssignment_5_in_rule__ResAllocation__Group__5__Impl5497);
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


    // $ANTLR start "rule__Predicate__Group_0__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2672:1: rule__Predicate__Group_0__0 : rule__Predicate__Group_0__0__Impl rule__Predicate__Group_0__1 ;
    public final void rule__Predicate__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2676:1: ( rule__Predicate__Group_0__0__Impl rule__Predicate__Group_0__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2677:2: rule__Predicate__Group_0__0__Impl rule__Predicate__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0__0__Impl_in_rule__Predicate__Group_0__05539);
            rule__Predicate__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0__1_in_rule__Predicate__Group_0__05542);
            rule__Predicate__Group_0__1();

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
    // $ANTLR end "rule__Predicate__Group_0__0"


    // $ANTLR start "rule__Predicate__Group_0__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2684:1: rule__Predicate__Group_0__0__Impl : ( () ) ;
    public final void rule__Predicate__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2688:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2689:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2689:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2690:1: ()
            {
             before(grammarAccess.getPredicateAccess().getPredicatAction_0_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2691:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2693:1: 
            {
            }

             after(grammarAccess.getPredicateAccess().getPredicatAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Group_0__0__Impl"


    // $ANTLR start "rule__Predicate__Group_0__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2703:1: rule__Predicate__Group_0__1 : rule__Predicate__Group_0__1__Impl ;
    public final void rule__Predicate__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2707:1: ( rule__Predicate__Group_0__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2708:2: rule__Predicate__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0__1__Impl_in_rule__Predicate__Group_0__15600);
            rule__Predicate__Group_0__1__Impl();

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
    // $ANTLR end "rule__Predicate__Group_0__1"


    // $ANTLR start "rule__Predicate__Group_0__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2714:1: rule__Predicate__Group_0__1__Impl : ( ( rule__Predicate__Group_0_1__0 ) ) ;
    public final void rule__Predicate__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2718:1: ( ( ( rule__Predicate__Group_0_1__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2719:1: ( ( rule__Predicate__Group_0_1__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2719:1: ( ( rule__Predicate__Group_0_1__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2720:1: ( rule__Predicate__Group_0_1__0 )
            {
             before(grammarAccess.getPredicateAccess().getGroup_0_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2721:1: ( rule__Predicate__Group_0_1__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2721:2: rule__Predicate__Group_0_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0_1__0_in_rule__Predicate__Group_0__1__Impl5627);
            rule__Predicate__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__Predicate__Group_0__1__Impl"


    // $ANTLR start "rule__Predicate__Group_0_1__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2735:1: rule__Predicate__Group_0_1__0 : rule__Predicate__Group_0_1__0__Impl rule__Predicate__Group_0_1__1 ;
    public final void rule__Predicate__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2739:1: ( rule__Predicate__Group_0_1__0__Impl rule__Predicate__Group_0_1__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2740:2: rule__Predicate__Group_0_1__0__Impl rule__Predicate__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0_1__0__Impl_in_rule__Predicate__Group_0_1__05661);
            rule__Predicate__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0_1__1_in_rule__Predicate__Group_0_1__05664);
            rule__Predicate__Group_0_1__1();

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
    // $ANTLR end "rule__Predicate__Group_0_1__0"


    // $ANTLR start "rule__Predicate__Group_0_1__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2747:1: rule__Predicate__Group_0_1__0__Impl : ( 'before' ) ;
    public final void rule__Predicate__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2751:1: ( ( 'before' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2752:1: ( 'before' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2752:1: ( 'before' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2753:1: 'before'
            {
             before(grammarAccess.getPredicateAccess().getBeforeKeyword_0_1_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__Predicate__Group_0_1__0__Impl5692); 
             after(grammarAccess.getPredicateAccess().getBeforeKeyword_0_1_0()); 

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
    // $ANTLR end "rule__Predicate__Group_0_1__0__Impl"


    // $ANTLR start "rule__Predicate__Group_0_1__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2766:1: rule__Predicate__Group_0_1__1 : rule__Predicate__Group_0_1__1__Impl ;
    public final void rule__Predicate__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2770:1: ( rule__Predicate__Group_0_1__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2771:2: rule__Predicate__Group_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0_1__1__Impl_in_rule__Predicate__Group_0_1__15723);
            rule__Predicate__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__Predicate__Group_0_1__1"


    // $ANTLR start "rule__Predicate__Group_0_1__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2777:1: rule__Predicate__Group_0_1__1__Impl : ( ( rule__Predicate__DateAssignment_0_1_1 ) ) ;
    public final void rule__Predicate__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2781:1: ( ( ( rule__Predicate__DateAssignment_0_1_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2782:1: ( ( rule__Predicate__DateAssignment_0_1_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2782:1: ( ( rule__Predicate__DateAssignment_0_1_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2783:1: ( rule__Predicate__DateAssignment_0_1_1 )
            {
             before(grammarAccess.getPredicateAccess().getDateAssignment_0_1_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2784:1: ( rule__Predicate__DateAssignment_0_1_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2784:2: rule__Predicate__DateAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__DateAssignment_0_1_1_in_rule__Predicate__Group_0_1__1__Impl5750);
            rule__Predicate__DateAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getDateAssignment_0_1_1()); 

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
    // $ANTLR end "rule__Predicate__Group_0_1__1__Impl"


    // $ANTLR start "rule__BinaryExppression__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2798:1: rule__BinaryExppression__Group__0 : rule__BinaryExppression__Group__0__Impl rule__BinaryExppression__Group__1 ;
    public final void rule__BinaryExppression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2802:1: ( rule__BinaryExppression__Group__0__Impl rule__BinaryExppression__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2803:2: rule__BinaryExppression__Group__0__Impl rule__BinaryExppression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group__0__Impl_in_rule__BinaryExppression__Group__05784);
            rule__BinaryExppression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group__1_in_rule__BinaryExppression__Group__05787);
            rule__BinaryExppression__Group__1();

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
    // $ANTLR end "rule__BinaryExppression__Group__0"


    // $ANTLR start "rule__BinaryExppression__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2810:1: rule__BinaryExppression__Group__0__Impl : ( () ) ;
    public final void rule__BinaryExppression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2814:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2815:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2815:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2816:1: ()
            {
             before(grammarAccess.getBinaryExppressionAccess().getBinaryExpressionAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2817:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2819:1: 
            {
            }

             after(grammarAccess.getBinaryExppressionAccess().getBinaryExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExppression__Group__0__Impl"


    // $ANTLR start "rule__BinaryExppression__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2829:1: rule__BinaryExppression__Group__1 : rule__BinaryExppression__Group__1__Impl rule__BinaryExppression__Group__2 ;
    public final void rule__BinaryExppression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2833:1: ( rule__BinaryExppression__Group__1__Impl rule__BinaryExppression__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2834:2: rule__BinaryExppression__Group__1__Impl rule__BinaryExppression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group__1__Impl_in_rule__BinaryExppression__Group__15845);
            rule__BinaryExppression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group__2_in_rule__BinaryExppression__Group__15848);
            rule__BinaryExppression__Group__2();

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
    // $ANTLR end "rule__BinaryExppression__Group__1"


    // $ANTLR start "rule__BinaryExppression__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2841:1: rule__BinaryExppression__Group__1__Impl : ( ( rule__BinaryExppression__Alternatives_1 ) ) ;
    public final void rule__BinaryExppression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2845:1: ( ( ( rule__BinaryExppression__Alternatives_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2846:1: ( ( rule__BinaryExppression__Alternatives_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2846:1: ( ( rule__BinaryExppression__Alternatives_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2847:1: ( rule__BinaryExppression__Alternatives_1 )
            {
             before(grammarAccess.getBinaryExppressionAccess().getAlternatives_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2848:1: ( rule__BinaryExppression__Alternatives_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2848:2: rule__BinaryExppression__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Alternatives_1_in_rule__BinaryExppression__Group__1__Impl5875);
            rule__BinaryExppression__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExppressionAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__BinaryExppression__Group__1__Impl"


    // $ANTLR start "rule__BinaryExppression__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2858:1: rule__BinaryExppression__Group__2 : rule__BinaryExppression__Group__2__Impl ;
    public final void rule__BinaryExppression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2862:1: ( rule__BinaryExppression__Group__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2863:2: rule__BinaryExppression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group__2__Impl_in_rule__BinaryExppression__Group__25905);
            rule__BinaryExppression__Group__2__Impl();

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
    // $ANTLR end "rule__BinaryExppression__Group__2"


    // $ANTLR start "rule__BinaryExppression__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2869:1: rule__BinaryExppression__Group__2__Impl : ( ( rule__BinaryExppression__Group_2__0 )? ) ;
    public final void rule__BinaryExppression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2873:1: ( ( ( rule__BinaryExppression__Group_2__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2874:1: ( ( rule__BinaryExppression__Group_2__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2874:1: ( ( rule__BinaryExppression__Group_2__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2875:1: ( rule__BinaryExppression__Group_2__0 )?
            {
             before(grammarAccess.getBinaryExppressionAccess().getGroup_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2876:1: ( rule__BinaryExppression__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=42 && LA23_0<=44)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2876:2: rule__BinaryExppression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_2__0_in_rule__BinaryExppression__Group__2__Impl5932);
                    rule__BinaryExppression__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBinaryExppressionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__BinaryExppression__Group__2__Impl"


    // $ANTLR start "rule__BinaryExppression__Group_1_1__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2892:1: rule__BinaryExppression__Group_1_1__0 : rule__BinaryExppression__Group_1_1__0__Impl rule__BinaryExppression__Group_1_1__1 ;
    public final void rule__BinaryExppression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2896:1: ( rule__BinaryExppression__Group_1_1__0__Impl rule__BinaryExppression__Group_1_1__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2897:2: rule__BinaryExppression__Group_1_1__0__Impl rule__BinaryExppression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_1_1__0__Impl_in_rule__BinaryExppression__Group_1_1__05969);
            rule__BinaryExppression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_1_1__1_in_rule__BinaryExppression__Group_1_1__05972);
            rule__BinaryExppression__Group_1_1__1();

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
    // $ANTLR end "rule__BinaryExppression__Group_1_1__0"


    // $ANTLR start "rule__BinaryExppression__Group_1_1__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2904:1: rule__BinaryExppression__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__BinaryExppression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2908:1: ( ( '(' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2909:1: ( '(' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2909:1: ( '(' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2910:1: '('
            {
             before(grammarAccess.getBinaryExppressionAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__BinaryExppression__Group_1_1__0__Impl6000); 
             after(grammarAccess.getBinaryExppressionAccess().getLeftParenthesisKeyword_1_1_0()); 

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
    // $ANTLR end "rule__BinaryExppression__Group_1_1__0__Impl"


    // $ANTLR start "rule__BinaryExppression__Group_1_1__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2923:1: rule__BinaryExppression__Group_1_1__1 : rule__BinaryExppression__Group_1_1__1__Impl rule__BinaryExppression__Group_1_1__2 ;
    public final void rule__BinaryExppression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2927:1: ( rule__BinaryExppression__Group_1_1__1__Impl rule__BinaryExppression__Group_1_1__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2928:2: rule__BinaryExppression__Group_1_1__1__Impl rule__BinaryExppression__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_1_1__1__Impl_in_rule__BinaryExppression__Group_1_1__16031);
            rule__BinaryExppression__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_1_1__2_in_rule__BinaryExppression__Group_1_1__16034);
            rule__BinaryExppression__Group_1_1__2();

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
    // $ANTLR end "rule__BinaryExppression__Group_1_1__1"


    // $ANTLR start "rule__BinaryExppression__Group_1_1__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2935:1: rule__BinaryExppression__Group_1_1__1__Impl : ( ( rule__BinaryExppression__LeftAssignment_1_1_1 ) ) ;
    public final void rule__BinaryExppression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2939:1: ( ( ( rule__BinaryExppression__LeftAssignment_1_1_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2940:1: ( ( rule__BinaryExppression__LeftAssignment_1_1_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2940:1: ( ( rule__BinaryExppression__LeftAssignment_1_1_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2941:1: ( rule__BinaryExppression__LeftAssignment_1_1_1 )
            {
             before(grammarAccess.getBinaryExppressionAccess().getLeftAssignment_1_1_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2942:1: ( rule__BinaryExppression__LeftAssignment_1_1_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2942:2: rule__BinaryExppression__LeftAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__LeftAssignment_1_1_1_in_rule__BinaryExppression__Group_1_1__1__Impl6061);
            rule__BinaryExppression__LeftAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExppressionAccess().getLeftAssignment_1_1_1()); 

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
    // $ANTLR end "rule__BinaryExppression__Group_1_1__1__Impl"


    // $ANTLR start "rule__BinaryExppression__Group_1_1__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2952:1: rule__BinaryExppression__Group_1_1__2 : rule__BinaryExppression__Group_1_1__2__Impl ;
    public final void rule__BinaryExppression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2956:1: ( rule__BinaryExppression__Group_1_1__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2957:2: rule__BinaryExppression__Group_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_1_1__2__Impl_in_rule__BinaryExppression__Group_1_1__26091);
            rule__BinaryExppression__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__BinaryExppression__Group_1_1__2"


    // $ANTLR start "rule__BinaryExppression__Group_1_1__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2963:1: rule__BinaryExppression__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__BinaryExppression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2967:1: ( ( ')' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2968:1: ( ')' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2968:1: ( ')' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2969:1: ')'
            {
             before(grammarAccess.getBinaryExppressionAccess().getRightParenthesisKeyword_1_1_2()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__BinaryExppression__Group_1_1__2__Impl6119); 
             after(grammarAccess.getBinaryExppressionAccess().getRightParenthesisKeyword_1_1_2()); 

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
    // $ANTLR end "rule__BinaryExppression__Group_1_1__2__Impl"


    // $ANTLR start "rule__BinaryExppression__Group_2__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2988:1: rule__BinaryExppression__Group_2__0 : rule__BinaryExppression__Group_2__0__Impl rule__BinaryExppression__Group_2__1 ;
    public final void rule__BinaryExppression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2992:1: ( rule__BinaryExppression__Group_2__0__Impl rule__BinaryExppression__Group_2__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2993:2: rule__BinaryExppression__Group_2__0__Impl rule__BinaryExppression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_2__0__Impl_in_rule__BinaryExppression__Group_2__06156);
            rule__BinaryExppression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_2__1_in_rule__BinaryExppression__Group_2__06159);
            rule__BinaryExppression__Group_2__1();

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
    // $ANTLR end "rule__BinaryExppression__Group_2__0"


    // $ANTLR start "rule__BinaryExppression__Group_2__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3000:1: rule__BinaryExppression__Group_2__0__Impl : ( ( rule__BinaryExppression__OpeAssignment_2_0 ) ) ;
    public final void rule__BinaryExppression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3004:1: ( ( ( rule__BinaryExppression__OpeAssignment_2_0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3005:1: ( ( rule__BinaryExppression__OpeAssignment_2_0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3005:1: ( ( rule__BinaryExppression__OpeAssignment_2_0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3006:1: ( rule__BinaryExppression__OpeAssignment_2_0 )
            {
             before(grammarAccess.getBinaryExppressionAccess().getOpeAssignment_2_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3007:1: ( rule__BinaryExppression__OpeAssignment_2_0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3007:2: rule__BinaryExppression__OpeAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__OpeAssignment_2_0_in_rule__BinaryExppression__Group_2__0__Impl6186);
            rule__BinaryExppression__OpeAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExppressionAccess().getOpeAssignment_2_0()); 

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
    // $ANTLR end "rule__BinaryExppression__Group_2__0__Impl"


    // $ANTLR start "rule__BinaryExppression__Group_2__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3017:1: rule__BinaryExppression__Group_2__1 : rule__BinaryExppression__Group_2__1__Impl ;
    public final void rule__BinaryExppression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3021:1: ( rule__BinaryExppression__Group_2__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3022:2: rule__BinaryExppression__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_2__1__Impl_in_rule__BinaryExppression__Group_2__16216);
            rule__BinaryExppression__Group_2__1__Impl();

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
    // $ANTLR end "rule__BinaryExppression__Group_2__1"


    // $ANTLR start "rule__BinaryExppression__Group_2__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3028:1: rule__BinaryExppression__Group_2__1__Impl : ( ( rule__BinaryExppression__RightAssignment_2_1 ) ) ;
    public final void rule__BinaryExppression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3032:1: ( ( ( rule__BinaryExppression__RightAssignment_2_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3033:1: ( ( rule__BinaryExppression__RightAssignment_2_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3033:1: ( ( rule__BinaryExppression__RightAssignment_2_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3034:1: ( rule__BinaryExppression__RightAssignment_2_1 )
            {
             before(grammarAccess.getBinaryExppressionAccess().getRightAssignment_2_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3035:1: ( rule__BinaryExppression__RightAssignment_2_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3035:2: rule__BinaryExppression__RightAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__RightAssignment_2_1_in_rule__BinaryExppression__Group_2__1__Impl6243);
            rule__BinaryExppression__RightAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExppressionAccess().getRightAssignment_2_1()); 

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
    // $ANTLR end "rule__BinaryExppression__Group_2__1__Impl"


    // $ANTLR start "rule__Temperature__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3049:1: rule__Temperature__Group__0 : rule__Temperature__Group__0__Impl rule__Temperature__Group__1 ;
    public final void rule__Temperature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3053:1: ( rule__Temperature__Group__0__Impl rule__Temperature__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3054:2: rule__Temperature__Group__0__Impl rule__Temperature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__0__Impl_in_rule__Temperature__Group__06277);
            rule__Temperature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__1_in_rule__Temperature__Group__06280);
            rule__Temperature__Group__1();

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
    // $ANTLR end "rule__Temperature__Group__0"


    // $ANTLR start "rule__Temperature__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3061:1: rule__Temperature__Group__0__Impl : ( () ) ;
    public final void rule__Temperature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3065:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3066:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3066:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3067:1: ()
            {
             before(grammarAccess.getTemperatureAccess().getTemperatureAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3068:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3070:1: 
            {
            }

             after(grammarAccess.getTemperatureAccess().getTemperatureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Temperature__Group__0__Impl"


    // $ANTLR start "rule__Temperature__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3080:1: rule__Temperature__Group__1 : rule__Temperature__Group__1__Impl rule__Temperature__Group__2 ;
    public final void rule__Temperature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3084:1: ( rule__Temperature__Group__1__Impl rule__Temperature__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3085:2: rule__Temperature__Group__1__Impl rule__Temperature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__1__Impl_in_rule__Temperature__Group__16338);
            rule__Temperature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__2_in_rule__Temperature__Group__16341);
            rule__Temperature__Group__2();

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
    // $ANTLR end "rule__Temperature__Group__1"


    // $ANTLR start "rule__Temperature__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3092:1: rule__Temperature__Group__1__Impl : ( ( rule__Temperature__Alternatives_1 ) ) ;
    public final void rule__Temperature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3096:1: ( ( ( rule__Temperature__Alternatives_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3097:1: ( ( rule__Temperature__Alternatives_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3097:1: ( ( rule__Temperature__Alternatives_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3098:1: ( rule__Temperature__Alternatives_1 )
            {
             before(grammarAccess.getTemperatureAccess().getAlternatives_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3099:1: ( rule__Temperature__Alternatives_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3099:2: rule__Temperature__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Alternatives_1_in_rule__Temperature__Group__1__Impl6368);
            rule__Temperature__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTemperatureAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Temperature__Group__1__Impl"


    // $ANTLR start "rule__Temperature__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3109:1: rule__Temperature__Group__2 : rule__Temperature__Group__2__Impl rule__Temperature__Group__3 ;
    public final void rule__Temperature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3113:1: ( rule__Temperature__Group__2__Impl rule__Temperature__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3114:2: rule__Temperature__Group__2__Impl rule__Temperature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__2__Impl_in_rule__Temperature__Group__26398);
            rule__Temperature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__3_in_rule__Temperature__Group__26401);
            rule__Temperature__Group__3();

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
    // $ANTLR end "rule__Temperature__Group__2"


    // $ANTLR start "rule__Temperature__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3121:1: rule__Temperature__Group__2__Impl : ( ( rule__Temperature__ComparatorAssignment_2 ) ) ;
    public final void rule__Temperature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3125:1: ( ( ( rule__Temperature__ComparatorAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3126:1: ( ( rule__Temperature__ComparatorAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3126:1: ( ( rule__Temperature__ComparatorAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3127:1: ( rule__Temperature__ComparatorAssignment_2 )
            {
             before(grammarAccess.getTemperatureAccess().getComparatorAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3128:1: ( rule__Temperature__ComparatorAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3128:2: rule__Temperature__ComparatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__ComparatorAssignment_2_in_rule__Temperature__Group__2__Impl6428);
            rule__Temperature__ComparatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTemperatureAccess().getComparatorAssignment_2()); 

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
    // $ANTLR end "rule__Temperature__Group__2__Impl"


    // $ANTLR start "rule__Temperature__Group__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3138:1: rule__Temperature__Group__3 : rule__Temperature__Group__3__Impl rule__Temperature__Group__4 ;
    public final void rule__Temperature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3142:1: ( rule__Temperature__Group__3__Impl rule__Temperature__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3143:2: rule__Temperature__Group__3__Impl rule__Temperature__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__3__Impl_in_rule__Temperature__Group__36458);
            rule__Temperature__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__4_in_rule__Temperature__Group__36461);
            rule__Temperature__Group__4();

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
    // $ANTLR end "rule__Temperature__Group__3"


    // $ANTLR start "rule__Temperature__Group__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3150:1: rule__Temperature__Group__3__Impl : ( 'than' ) ;
    public final void rule__Temperature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3154:1: ( ( 'than' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3155:1: ( 'than' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3155:1: ( 'than' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3156:1: 'than'
            {
             before(grammarAccess.getTemperatureAccess().getThanKeyword_3()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__Temperature__Group__3__Impl6489); 
             after(grammarAccess.getTemperatureAccess().getThanKeyword_3()); 

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
    // $ANTLR end "rule__Temperature__Group__3__Impl"


    // $ANTLR start "rule__Temperature__Group__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3169:1: rule__Temperature__Group__4 : rule__Temperature__Group__4__Impl ;
    public final void rule__Temperature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3173:1: ( rule__Temperature__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3174:2: rule__Temperature__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__4__Impl_in_rule__Temperature__Group__46520);
            rule__Temperature__Group__4__Impl();

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
    // $ANTLR end "rule__Temperature__Group__4"


    // $ANTLR start "rule__Temperature__Group__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3180:1: rule__Temperature__Group__4__Impl : ( ( rule__Temperature__ValueAssignment_4 ) ) ;
    public final void rule__Temperature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3184:1: ( ( ( rule__Temperature__ValueAssignment_4 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3185:1: ( ( rule__Temperature__ValueAssignment_4 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3185:1: ( ( rule__Temperature__ValueAssignment_4 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3186:1: ( rule__Temperature__ValueAssignment_4 )
            {
             before(grammarAccess.getTemperatureAccess().getValueAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3187:1: ( rule__Temperature__ValueAssignment_4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3187:2: rule__Temperature__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__ValueAssignment_4_in_rule__Temperature__Group__4__Impl6547);
            rule__Temperature__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTemperatureAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__Temperature__Group__4__Impl"


    // $ANTLR start "rule__Precipitation__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3207:1: rule__Precipitation__Group__0 : rule__Precipitation__Group__0__Impl rule__Precipitation__Group__1 ;
    public final void rule__Precipitation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3211:1: ( rule__Precipitation__Group__0__Impl rule__Precipitation__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3212:2: rule__Precipitation__Group__0__Impl rule__Precipitation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__0__Impl_in_rule__Precipitation__Group__06587);
            rule__Precipitation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__1_in_rule__Precipitation__Group__06590);
            rule__Precipitation__Group__1();

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
    // $ANTLR end "rule__Precipitation__Group__0"


    // $ANTLR start "rule__Precipitation__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3219:1: rule__Precipitation__Group__0__Impl : ( () ) ;
    public final void rule__Precipitation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3223:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3224:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3224:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3225:1: ()
            {
             before(grammarAccess.getPrecipitationAccess().getPrecipitationAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3226:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3228:1: 
            {
            }

             after(grammarAccess.getPrecipitationAccess().getPrecipitationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precipitation__Group__0__Impl"


    // $ANTLR start "rule__Precipitation__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3238:1: rule__Precipitation__Group__1 : rule__Precipitation__Group__1__Impl rule__Precipitation__Group__2 ;
    public final void rule__Precipitation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3242:1: ( rule__Precipitation__Group__1__Impl rule__Precipitation__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3243:2: rule__Precipitation__Group__1__Impl rule__Precipitation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__1__Impl_in_rule__Precipitation__Group__16648);
            rule__Precipitation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__2_in_rule__Precipitation__Group__16651);
            rule__Precipitation__Group__2();

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
    // $ANTLR end "rule__Precipitation__Group__1"


    // $ANTLR start "rule__Precipitation__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3250:1: rule__Precipitation__Group__1__Impl : ( ( rule__Precipitation__Alternatives_1 ) ) ;
    public final void rule__Precipitation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3254:1: ( ( ( rule__Precipitation__Alternatives_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3255:1: ( ( rule__Precipitation__Alternatives_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3255:1: ( ( rule__Precipitation__Alternatives_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3256:1: ( rule__Precipitation__Alternatives_1 )
            {
             before(grammarAccess.getPrecipitationAccess().getAlternatives_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3257:1: ( rule__Precipitation__Alternatives_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3257:2: rule__Precipitation__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Alternatives_1_in_rule__Precipitation__Group__1__Impl6678);
            rule__Precipitation__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecipitationAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Precipitation__Group__1__Impl"


    // $ANTLR start "rule__Precipitation__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3267:1: rule__Precipitation__Group__2 : rule__Precipitation__Group__2__Impl rule__Precipitation__Group__3 ;
    public final void rule__Precipitation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3271:1: ( rule__Precipitation__Group__2__Impl rule__Precipitation__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3272:2: rule__Precipitation__Group__2__Impl rule__Precipitation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__2__Impl_in_rule__Precipitation__Group__26708);
            rule__Precipitation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__3_in_rule__Precipitation__Group__26711);
            rule__Precipitation__Group__3();

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
    // $ANTLR end "rule__Precipitation__Group__2"


    // $ANTLR start "rule__Precipitation__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3279:1: rule__Precipitation__Group__2__Impl : ( ( rule__Precipitation__ComparatorAssignment_2 ) ) ;
    public final void rule__Precipitation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3283:1: ( ( ( rule__Precipitation__ComparatorAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3284:1: ( ( rule__Precipitation__ComparatorAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3284:1: ( ( rule__Precipitation__ComparatorAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3285:1: ( rule__Precipitation__ComparatorAssignment_2 )
            {
             before(grammarAccess.getPrecipitationAccess().getComparatorAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3286:1: ( rule__Precipitation__ComparatorAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3286:2: rule__Precipitation__ComparatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__ComparatorAssignment_2_in_rule__Precipitation__Group__2__Impl6738);
            rule__Precipitation__ComparatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecipitationAccess().getComparatorAssignment_2()); 

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
    // $ANTLR end "rule__Precipitation__Group__2__Impl"


    // $ANTLR start "rule__Precipitation__Group__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3296:1: rule__Precipitation__Group__3 : rule__Precipitation__Group__3__Impl rule__Precipitation__Group__4 ;
    public final void rule__Precipitation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3300:1: ( rule__Precipitation__Group__3__Impl rule__Precipitation__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3301:2: rule__Precipitation__Group__3__Impl rule__Precipitation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__3__Impl_in_rule__Precipitation__Group__36768);
            rule__Precipitation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__4_in_rule__Precipitation__Group__36771);
            rule__Precipitation__Group__4();

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
    // $ANTLR end "rule__Precipitation__Group__3"


    // $ANTLR start "rule__Precipitation__Group__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3308:1: rule__Precipitation__Group__3__Impl : ( 'than' ) ;
    public final void rule__Precipitation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3312:1: ( ( 'than' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3313:1: ( 'than' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3313:1: ( 'than' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3314:1: 'than'
            {
             before(grammarAccess.getPrecipitationAccess().getThanKeyword_3()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__Precipitation__Group__3__Impl6799); 
             after(grammarAccess.getPrecipitationAccess().getThanKeyword_3()); 

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
    // $ANTLR end "rule__Precipitation__Group__3__Impl"


    // $ANTLR start "rule__Precipitation__Group__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3327:1: rule__Precipitation__Group__4 : rule__Precipitation__Group__4__Impl ;
    public final void rule__Precipitation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3331:1: ( rule__Precipitation__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3332:2: rule__Precipitation__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__4__Impl_in_rule__Precipitation__Group__46830);
            rule__Precipitation__Group__4__Impl();

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
    // $ANTLR end "rule__Precipitation__Group__4"


    // $ANTLR start "rule__Precipitation__Group__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3338:1: rule__Precipitation__Group__4__Impl : ( ( rule__Precipitation__HeightAssignment_4 ) ) ;
    public final void rule__Precipitation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3342:1: ( ( ( rule__Precipitation__HeightAssignment_4 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3343:1: ( ( rule__Precipitation__HeightAssignment_4 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3343:1: ( ( rule__Precipitation__HeightAssignment_4 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3344:1: ( rule__Precipitation__HeightAssignment_4 )
            {
             before(grammarAccess.getPrecipitationAccess().getHeightAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3345:1: ( rule__Precipitation__HeightAssignment_4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3345:2: rule__Precipitation__HeightAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__HeightAssignment_4_in_rule__Precipitation__Group__4__Impl6857);
            rule__Precipitation__HeightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPrecipitationAccess().getHeightAssignment_4()); 

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
    // $ANTLR end "rule__Precipitation__Group__4__Impl"


    // $ANTLR start "rule__Rayonnement__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3365:1: rule__Rayonnement__Group__0 : rule__Rayonnement__Group__0__Impl rule__Rayonnement__Group__1 ;
    public final void rule__Rayonnement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3369:1: ( rule__Rayonnement__Group__0__Impl rule__Rayonnement__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3370:2: rule__Rayonnement__Group__0__Impl rule__Rayonnement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__0__Impl_in_rule__Rayonnement__Group__06897);
            rule__Rayonnement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__1_in_rule__Rayonnement__Group__06900);
            rule__Rayonnement__Group__1();

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
    // $ANTLR end "rule__Rayonnement__Group__0"


    // $ANTLR start "rule__Rayonnement__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3377:1: rule__Rayonnement__Group__0__Impl : ( () ) ;
    public final void rule__Rayonnement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3381:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3382:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3382:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3383:1: ()
            {
             before(grammarAccess.getRayonnementAccess().getRayonnementAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3384:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3386:1: 
            {
            }

             after(grammarAccess.getRayonnementAccess().getRayonnementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rayonnement__Group__0__Impl"


    // $ANTLR start "rule__Rayonnement__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3396:1: rule__Rayonnement__Group__1 : rule__Rayonnement__Group__1__Impl rule__Rayonnement__Group__2 ;
    public final void rule__Rayonnement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3400:1: ( rule__Rayonnement__Group__1__Impl rule__Rayonnement__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3401:2: rule__Rayonnement__Group__1__Impl rule__Rayonnement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__1__Impl_in_rule__Rayonnement__Group__16958);
            rule__Rayonnement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__2_in_rule__Rayonnement__Group__16961);
            rule__Rayonnement__Group__2();

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
    // $ANTLR end "rule__Rayonnement__Group__1"


    // $ANTLR start "rule__Rayonnement__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3408:1: rule__Rayonnement__Group__1__Impl : ( ( rule__Rayonnement__Alternatives_1 ) ) ;
    public final void rule__Rayonnement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3412:1: ( ( ( rule__Rayonnement__Alternatives_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3413:1: ( ( rule__Rayonnement__Alternatives_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3413:1: ( ( rule__Rayonnement__Alternatives_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3414:1: ( rule__Rayonnement__Alternatives_1 )
            {
             before(grammarAccess.getRayonnementAccess().getAlternatives_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3415:1: ( rule__Rayonnement__Alternatives_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3415:2: rule__Rayonnement__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Alternatives_1_in_rule__Rayonnement__Group__1__Impl6988);
            rule__Rayonnement__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRayonnementAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Rayonnement__Group__1__Impl"


    // $ANTLR start "rule__Rayonnement__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3425:1: rule__Rayonnement__Group__2 : rule__Rayonnement__Group__2__Impl rule__Rayonnement__Group__3 ;
    public final void rule__Rayonnement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3429:1: ( rule__Rayonnement__Group__2__Impl rule__Rayonnement__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3430:2: rule__Rayonnement__Group__2__Impl rule__Rayonnement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__2__Impl_in_rule__Rayonnement__Group__27018);
            rule__Rayonnement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__3_in_rule__Rayonnement__Group__27021);
            rule__Rayonnement__Group__3();

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
    // $ANTLR end "rule__Rayonnement__Group__2"


    // $ANTLR start "rule__Rayonnement__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3437:1: rule__Rayonnement__Group__2__Impl : ( ( rule__Rayonnement__ComparatorAssignment_2 ) ) ;
    public final void rule__Rayonnement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3441:1: ( ( ( rule__Rayonnement__ComparatorAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3442:1: ( ( rule__Rayonnement__ComparatorAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3442:1: ( ( rule__Rayonnement__ComparatorAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3443:1: ( rule__Rayonnement__ComparatorAssignment_2 )
            {
             before(grammarAccess.getRayonnementAccess().getComparatorAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3444:1: ( rule__Rayonnement__ComparatorAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3444:2: rule__Rayonnement__ComparatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__ComparatorAssignment_2_in_rule__Rayonnement__Group__2__Impl7048);
            rule__Rayonnement__ComparatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRayonnementAccess().getComparatorAssignment_2()); 

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
    // $ANTLR end "rule__Rayonnement__Group__2__Impl"


    // $ANTLR start "rule__Rayonnement__Group__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3454:1: rule__Rayonnement__Group__3 : rule__Rayonnement__Group__3__Impl rule__Rayonnement__Group__4 ;
    public final void rule__Rayonnement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3458:1: ( rule__Rayonnement__Group__3__Impl rule__Rayonnement__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3459:2: rule__Rayonnement__Group__3__Impl rule__Rayonnement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__3__Impl_in_rule__Rayonnement__Group__37078);
            rule__Rayonnement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__4_in_rule__Rayonnement__Group__37081);
            rule__Rayonnement__Group__4();

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
    // $ANTLR end "rule__Rayonnement__Group__3"


    // $ANTLR start "rule__Rayonnement__Group__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3466:1: rule__Rayonnement__Group__3__Impl : ( 'than' ) ;
    public final void rule__Rayonnement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3470:1: ( ( 'than' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3471:1: ( 'than' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3471:1: ( 'than' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3472:1: 'than'
            {
             before(grammarAccess.getRayonnementAccess().getThanKeyword_3()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__Rayonnement__Group__3__Impl7109); 
             after(grammarAccess.getRayonnementAccess().getThanKeyword_3()); 

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
    // $ANTLR end "rule__Rayonnement__Group__3__Impl"


    // $ANTLR start "rule__Rayonnement__Group__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3485:1: rule__Rayonnement__Group__4 : rule__Rayonnement__Group__4__Impl ;
    public final void rule__Rayonnement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3489:1: ( rule__Rayonnement__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3490:2: rule__Rayonnement__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__4__Impl_in_rule__Rayonnement__Group__47140);
            rule__Rayonnement__Group__4__Impl();

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
    // $ANTLR end "rule__Rayonnement__Group__4"


    // $ANTLR start "rule__Rayonnement__Group__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3496:1: rule__Rayonnement__Group__4__Impl : ( ( rule__Rayonnement__ValueAssignment_4 ) ) ;
    public final void rule__Rayonnement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3500:1: ( ( ( rule__Rayonnement__ValueAssignment_4 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3501:1: ( ( rule__Rayonnement__ValueAssignment_4 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3501:1: ( ( rule__Rayonnement__ValueAssignment_4 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3502:1: ( rule__Rayonnement__ValueAssignment_4 )
            {
             before(grammarAccess.getRayonnementAccess().getValueAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3503:1: ( rule__Rayonnement__ValueAssignment_4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3503:2: rule__Rayonnement__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__ValueAssignment_4_in_rule__Rayonnement__Group__4__Impl7167);
            rule__Rayonnement__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRayonnementAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__Rayonnement__Group__4__Impl"


    // $ANTLR start "rule__Evapotranspiration__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3523:1: rule__Evapotranspiration__Group__0 : rule__Evapotranspiration__Group__0__Impl rule__Evapotranspiration__Group__1 ;
    public final void rule__Evapotranspiration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3527:1: ( rule__Evapotranspiration__Group__0__Impl rule__Evapotranspiration__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3528:2: rule__Evapotranspiration__Group__0__Impl rule__Evapotranspiration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__0__Impl_in_rule__Evapotranspiration__Group__07207);
            rule__Evapotranspiration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__1_in_rule__Evapotranspiration__Group__07210);
            rule__Evapotranspiration__Group__1();

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
    // $ANTLR end "rule__Evapotranspiration__Group__0"


    // $ANTLR start "rule__Evapotranspiration__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3535:1: rule__Evapotranspiration__Group__0__Impl : ( () ) ;
    public final void rule__Evapotranspiration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3539:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3540:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3540:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3541:1: ()
            {
             before(grammarAccess.getEvapotranspirationAccess().getEvapoTranspirationAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3542:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3544:1: 
            {
            }

             after(grammarAccess.getEvapotranspirationAccess().getEvapoTranspirationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evapotranspiration__Group__0__Impl"


    // $ANTLR start "rule__Evapotranspiration__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3554:1: rule__Evapotranspiration__Group__1 : rule__Evapotranspiration__Group__1__Impl rule__Evapotranspiration__Group__2 ;
    public final void rule__Evapotranspiration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3558:1: ( rule__Evapotranspiration__Group__1__Impl rule__Evapotranspiration__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3559:2: rule__Evapotranspiration__Group__1__Impl rule__Evapotranspiration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__1__Impl_in_rule__Evapotranspiration__Group__17268);
            rule__Evapotranspiration__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__2_in_rule__Evapotranspiration__Group__17271);
            rule__Evapotranspiration__Group__2();

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
    // $ANTLR end "rule__Evapotranspiration__Group__1"


    // $ANTLR start "rule__Evapotranspiration__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3566:1: rule__Evapotranspiration__Group__1__Impl : ( ( rule__Evapotranspiration__Alternatives_1 ) ) ;
    public final void rule__Evapotranspiration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3570:1: ( ( ( rule__Evapotranspiration__Alternatives_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3571:1: ( ( rule__Evapotranspiration__Alternatives_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3571:1: ( ( rule__Evapotranspiration__Alternatives_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3572:1: ( rule__Evapotranspiration__Alternatives_1 )
            {
             before(grammarAccess.getEvapotranspirationAccess().getAlternatives_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3573:1: ( rule__Evapotranspiration__Alternatives_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3573:2: rule__Evapotranspiration__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Alternatives_1_in_rule__Evapotranspiration__Group__1__Impl7298);
            rule__Evapotranspiration__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getEvapotranspirationAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Evapotranspiration__Group__1__Impl"


    // $ANTLR start "rule__Evapotranspiration__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3583:1: rule__Evapotranspiration__Group__2 : rule__Evapotranspiration__Group__2__Impl rule__Evapotranspiration__Group__3 ;
    public final void rule__Evapotranspiration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3587:1: ( rule__Evapotranspiration__Group__2__Impl rule__Evapotranspiration__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3588:2: rule__Evapotranspiration__Group__2__Impl rule__Evapotranspiration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__2__Impl_in_rule__Evapotranspiration__Group__27328);
            rule__Evapotranspiration__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__3_in_rule__Evapotranspiration__Group__27331);
            rule__Evapotranspiration__Group__3();

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
    // $ANTLR end "rule__Evapotranspiration__Group__2"


    // $ANTLR start "rule__Evapotranspiration__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3595:1: rule__Evapotranspiration__Group__2__Impl : ( ( rule__Evapotranspiration__ComparatorAssignment_2 ) ) ;
    public final void rule__Evapotranspiration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3599:1: ( ( ( rule__Evapotranspiration__ComparatorAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3600:1: ( ( rule__Evapotranspiration__ComparatorAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3600:1: ( ( rule__Evapotranspiration__ComparatorAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3601:1: ( rule__Evapotranspiration__ComparatorAssignment_2 )
            {
             before(grammarAccess.getEvapotranspirationAccess().getComparatorAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3602:1: ( rule__Evapotranspiration__ComparatorAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3602:2: rule__Evapotranspiration__ComparatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__ComparatorAssignment_2_in_rule__Evapotranspiration__Group__2__Impl7358);
            rule__Evapotranspiration__ComparatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvapotranspirationAccess().getComparatorAssignment_2()); 

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
    // $ANTLR end "rule__Evapotranspiration__Group__2__Impl"


    // $ANTLR start "rule__Evapotranspiration__Group__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3612:1: rule__Evapotranspiration__Group__3 : rule__Evapotranspiration__Group__3__Impl rule__Evapotranspiration__Group__4 ;
    public final void rule__Evapotranspiration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3616:1: ( rule__Evapotranspiration__Group__3__Impl rule__Evapotranspiration__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3617:2: rule__Evapotranspiration__Group__3__Impl rule__Evapotranspiration__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__3__Impl_in_rule__Evapotranspiration__Group__37388);
            rule__Evapotranspiration__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__4_in_rule__Evapotranspiration__Group__37391);
            rule__Evapotranspiration__Group__4();

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
    // $ANTLR end "rule__Evapotranspiration__Group__3"


    // $ANTLR start "rule__Evapotranspiration__Group__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3624:1: rule__Evapotranspiration__Group__3__Impl : ( 'than' ) ;
    public final void rule__Evapotranspiration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3628:1: ( ( 'than' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3629:1: ( 'than' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3629:1: ( 'than' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3630:1: 'than'
            {
             before(grammarAccess.getEvapotranspirationAccess().getThanKeyword_3()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__Evapotranspiration__Group__3__Impl7419); 
             after(grammarAccess.getEvapotranspirationAccess().getThanKeyword_3()); 

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
    // $ANTLR end "rule__Evapotranspiration__Group__3__Impl"


    // $ANTLR start "rule__Evapotranspiration__Group__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3643:1: rule__Evapotranspiration__Group__4 : rule__Evapotranspiration__Group__4__Impl ;
    public final void rule__Evapotranspiration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3647:1: ( rule__Evapotranspiration__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3648:2: rule__Evapotranspiration__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__4__Impl_in_rule__Evapotranspiration__Group__47450);
            rule__Evapotranspiration__Group__4__Impl();

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
    // $ANTLR end "rule__Evapotranspiration__Group__4"


    // $ANTLR start "rule__Evapotranspiration__Group__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3654:1: rule__Evapotranspiration__Group__4__Impl : ( ( rule__Evapotranspiration__ValueAssignment_4 ) ) ;
    public final void rule__Evapotranspiration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3658:1: ( ( ( rule__Evapotranspiration__ValueAssignment_4 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3659:1: ( ( rule__Evapotranspiration__ValueAssignment_4 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3659:1: ( ( rule__Evapotranspiration__ValueAssignment_4 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3660:1: ( rule__Evapotranspiration__ValueAssignment_4 )
            {
             before(grammarAccess.getEvapotranspirationAccess().getValueAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3661:1: ( rule__Evapotranspiration__ValueAssignment_4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3661:2: rule__Evapotranspiration__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__ValueAssignment_4_in_rule__Evapotranspiration__Group__4__Impl7477);
            rule__Evapotranspiration__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEvapotranspirationAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__Evapotranspiration__Group__4__Impl"


    // $ANTLR start "rule__CheckDoneActivity__Group_0__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3681:1: rule__CheckDoneActivity__Group_0__0 : rule__CheckDoneActivity__Group_0__0__Impl rule__CheckDoneActivity__Group_0__1 ;
    public final void rule__CheckDoneActivity__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3685:1: ( rule__CheckDoneActivity__Group_0__0__Impl rule__CheckDoneActivity__Group_0__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3686:2: rule__CheckDoneActivity__Group_0__0__Impl rule__CheckDoneActivity__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__0__Impl_in_rule__CheckDoneActivity__Group_0__07517);
            rule__CheckDoneActivity__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__1_in_rule__CheckDoneActivity__Group_0__07520);
            rule__CheckDoneActivity__Group_0__1();

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
    // $ANTLR end "rule__CheckDoneActivity__Group_0__0"


    // $ANTLR start "rule__CheckDoneActivity__Group_0__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3693:1: rule__CheckDoneActivity__Group_0__0__Impl : ( () ) ;
    public final void rule__CheckDoneActivity__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3697:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3698:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3698:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3699:1: ()
            {
             before(grammarAccess.getCheckDoneActivityAccess().getCheckDoneActivityAction_0_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3700:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3702:1: 
            {
            }

             after(grammarAccess.getCheckDoneActivityAccess().getCheckDoneActivityAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckDoneActivity__Group_0__0__Impl"


    // $ANTLR start "rule__CheckDoneActivity__Group_0__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3712:1: rule__CheckDoneActivity__Group_0__1 : rule__CheckDoneActivity__Group_0__1__Impl rule__CheckDoneActivity__Group_0__2 ;
    public final void rule__CheckDoneActivity__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3716:1: ( rule__CheckDoneActivity__Group_0__1__Impl rule__CheckDoneActivity__Group_0__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3717:2: rule__CheckDoneActivity__Group_0__1__Impl rule__CheckDoneActivity__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__1__Impl_in_rule__CheckDoneActivity__Group_0__17578);
            rule__CheckDoneActivity__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__2_in_rule__CheckDoneActivity__Group_0__17581);
            rule__CheckDoneActivity__Group_0__2();

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
    // $ANTLR end "rule__CheckDoneActivity__Group_0__1"


    // $ANTLR start "rule__CheckDoneActivity__Group_0__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3724:1: rule__CheckDoneActivity__Group_0__1__Impl : ( 'activity' ) ;
    public final void rule__CheckDoneActivity__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3728:1: ( ( 'activity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3729:1: ( 'activity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3729:1: ( 'activity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3730:1: 'activity'
            {
             before(grammarAccess.getCheckDoneActivityAccess().getActivityKeyword_0_1()); 
            match(input,66,FollowSets000.FOLLOW_66_in_rule__CheckDoneActivity__Group_0__1__Impl7609); 
             after(grammarAccess.getCheckDoneActivityAccess().getActivityKeyword_0_1()); 

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
    // $ANTLR end "rule__CheckDoneActivity__Group_0__1__Impl"


    // $ANTLR start "rule__CheckDoneActivity__Group_0__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3743:1: rule__CheckDoneActivity__Group_0__2 : rule__CheckDoneActivity__Group_0__2__Impl rule__CheckDoneActivity__Group_0__3 ;
    public final void rule__CheckDoneActivity__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3747:1: ( rule__CheckDoneActivity__Group_0__2__Impl rule__CheckDoneActivity__Group_0__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3748:2: rule__CheckDoneActivity__Group_0__2__Impl rule__CheckDoneActivity__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__2__Impl_in_rule__CheckDoneActivity__Group_0__27640);
            rule__CheckDoneActivity__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__3_in_rule__CheckDoneActivity__Group_0__27643);
            rule__CheckDoneActivity__Group_0__3();

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
    // $ANTLR end "rule__CheckDoneActivity__Group_0__2"


    // $ANTLR start "rule__CheckDoneActivity__Group_0__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3755:1: rule__CheckDoneActivity__Group_0__2__Impl : ( ( rule__CheckDoneActivity__ActivityToValidateAssignment_0_2 ) ) ;
    public final void rule__CheckDoneActivity__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3759:1: ( ( ( rule__CheckDoneActivity__ActivityToValidateAssignment_0_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3760:1: ( ( rule__CheckDoneActivity__ActivityToValidateAssignment_0_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3760:1: ( ( rule__CheckDoneActivity__ActivityToValidateAssignment_0_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3761:1: ( rule__CheckDoneActivity__ActivityToValidateAssignment_0_2 )
            {
             before(grammarAccess.getCheckDoneActivityAccess().getActivityToValidateAssignment_0_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3762:1: ( rule__CheckDoneActivity__ActivityToValidateAssignment_0_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3762:2: rule__CheckDoneActivity__ActivityToValidateAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__ActivityToValidateAssignment_0_2_in_rule__CheckDoneActivity__Group_0__2__Impl7670);
            rule__CheckDoneActivity__ActivityToValidateAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckDoneActivityAccess().getActivityToValidateAssignment_0_2()); 

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
    // $ANTLR end "rule__CheckDoneActivity__Group_0__2__Impl"


    // $ANTLR start "rule__CheckDoneActivity__Group_0__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3772:1: rule__CheckDoneActivity__Group_0__3 : rule__CheckDoneActivity__Group_0__3__Impl rule__CheckDoneActivity__Group_0__4 ;
    public final void rule__CheckDoneActivity__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3776:1: ( rule__CheckDoneActivity__Group_0__3__Impl rule__CheckDoneActivity__Group_0__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3777:2: rule__CheckDoneActivity__Group_0__3__Impl rule__CheckDoneActivity__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__3__Impl_in_rule__CheckDoneActivity__Group_0__37700);
            rule__CheckDoneActivity__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__4_in_rule__CheckDoneActivity__Group_0__37703);
            rule__CheckDoneActivity__Group_0__4();

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
    // $ANTLR end "rule__CheckDoneActivity__Group_0__3"


    // $ANTLR start "rule__CheckDoneActivity__Group_0__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3784:1: rule__CheckDoneActivity__Group_0__3__Impl : ( 'done' ) ;
    public final void rule__CheckDoneActivity__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3788:1: ( ( 'done' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3789:1: ( 'done' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3789:1: ( 'done' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3790:1: 'done'
            {
             before(grammarAccess.getCheckDoneActivityAccess().getDoneKeyword_0_3()); 
            match(input,67,FollowSets000.FOLLOW_67_in_rule__CheckDoneActivity__Group_0__3__Impl7731); 
             after(grammarAccess.getCheckDoneActivityAccess().getDoneKeyword_0_3()); 

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
    // $ANTLR end "rule__CheckDoneActivity__Group_0__3__Impl"


    // $ANTLR start "rule__CheckDoneActivity__Group_0__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3803:1: rule__CheckDoneActivity__Group_0__4 : rule__CheckDoneActivity__Group_0__4__Impl ;
    public final void rule__CheckDoneActivity__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3807:1: ( rule__CheckDoneActivity__Group_0__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3808:2: rule__CheckDoneActivity__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__4__Impl_in_rule__CheckDoneActivity__Group_0__47762);
            rule__CheckDoneActivity__Group_0__4__Impl();

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
    // $ANTLR end "rule__CheckDoneActivity__Group_0__4"


    // $ANTLR start "rule__CheckDoneActivity__Group_0__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3814:1: rule__CheckDoneActivity__Group_0__4__Impl : ( ( rule__CheckDoneActivity__Group_0_4__0 ) ) ;
    public final void rule__CheckDoneActivity__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3818:1: ( ( ( rule__CheckDoneActivity__Group_0_4__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3819:1: ( ( rule__CheckDoneActivity__Group_0_4__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3819:1: ( ( rule__CheckDoneActivity__Group_0_4__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3820:1: ( rule__CheckDoneActivity__Group_0_4__0 )
            {
             before(grammarAccess.getCheckDoneActivityAccess().getGroup_0_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3821:1: ( rule__CheckDoneActivity__Group_0_4__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3821:2: rule__CheckDoneActivity__Group_0_4__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0_4__0_in_rule__CheckDoneActivity__Group_0__4__Impl7789);
            rule__CheckDoneActivity__Group_0_4__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckDoneActivityAccess().getGroup_0_4()); 

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
    // $ANTLR end "rule__CheckDoneActivity__Group_0__4__Impl"


    // $ANTLR start "rule__CheckDoneActivity__Group_0_4__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3841:1: rule__CheckDoneActivity__Group_0_4__0 : rule__CheckDoneActivity__Group_0_4__0__Impl rule__CheckDoneActivity__Group_0_4__1 ;
    public final void rule__CheckDoneActivity__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3845:1: ( rule__CheckDoneActivity__Group_0_4__0__Impl rule__CheckDoneActivity__Group_0_4__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3846:2: rule__CheckDoneActivity__Group_0_4__0__Impl rule__CheckDoneActivity__Group_0_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0_4__0__Impl_in_rule__CheckDoneActivity__Group_0_4__07829);
            rule__CheckDoneActivity__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0_4__1_in_rule__CheckDoneActivity__Group_0_4__07832);
            rule__CheckDoneActivity__Group_0_4__1();

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
    // $ANTLR end "rule__CheckDoneActivity__Group_0_4__0"


    // $ANTLR start "rule__CheckDoneActivity__Group_0_4__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3853:1: rule__CheckDoneActivity__Group_0_4__0__Impl : ( ( rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0 ) ) ;
    public final void rule__CheckDoneActivity__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3857:1: ( ( ( rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3858:1: ( ( rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3858:1: ( ( rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3859:1: ( rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0 )
            {
             before(grammarAccess.getCheckDoneActivityAccess().getElapsedTimeAssignment_0_4_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3860:1: ( rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3860:2: rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0_in_rule__CheckDoneActivity__Group_0_4__0__Impl7859);
            rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0();

            state._fsp--;


            }

             after(grammarAccess.getCheckDoneActivityAccess().getElapsedTimeAssignment_0_4_0()); 

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
    // $ANTLR end "rule__CheckDoneActivity__Group_0_4__0__Impl"


    // $ANTLR start "rule__CheckDoneActivity__Group_0_4__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3870:1: rule__CheckDoneActivity__Group_0_4__1 : rule__CheckDoneActivity__Group_0_4__1__Impl rule__CheckDoneActivity__Group_0_4__2 ;
    public final void rule__CheckDoneActivity__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3874:1: ( rule__CheckDoneActivity__Group_0_4__1__Impl rule__CheckDoneActivity__Group_0_4__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3875:2: rule__CheckDoneActivity__Group_0_4__1__Impl rule__CheckDoneActivity__Group_0_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0_4__1__Impl_in_rule__CheckDoneActivity__Group_0_4__17889);
            rule__CheckDoneActivity__Group_0_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0_4__2_in_rule__CheckDoneActivity__Group_0_4__17892);
            rule__CheckDoneActivity__Group_0_4__2();

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
    // $ANTLR end "rule__CheckDoneActivity__Group_0_4__1"


    // $ANTLR start "rule__CheckDoneActivity__Group_0_4__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3882:1: rule__CheckDoneActivity__Group_0_4__1__Impl : ( ( rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1 ) ) ;
    public final void rule__CheckDoneActivity__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3886:1: ( ( ( rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3887:1: ( ( rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3887:1: ( ( rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3888:1: ( rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1 )
            {
             before(grammarAccess.getCheckDoneActivityAccess().getPeriodicityTypeAssignment_0_4_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3889:1: ( rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3889:2: rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1_in_rule__CheckDoneActivity__Group_0_4__1__Impl7919);
            rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckDoneActivityAccess().getPeriodicityTypeAssignment_0_4_1()); 

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
    // $ANTLR end "rule__CheckDoneActivity__Group_0_4__1__Impl"


    // $ANTLR start "rule__CheckDoneActivity__Group_0_4__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3899:1: rule__CheckDoneActivity__Group_0_4__2 : rule__CheckDoneActivity__Group_0_4__2__Impl ;
    public final void rule__CheckDoneActivity__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3903:1: ( rule__CheckDoneActivity__Group_0_4__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3904:2: rule__CheckDoneActivity__Group_0_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0_4__2__Impl_in_rule__CheckDoneActivity__Group_0_4__27949);
            rule__CheckDoneActivity__Group_0_4__2__Impl();

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
    // $ANTLR end "rule__CheckDoneActivity__Group_0_4__2"


    // $ANTLR start "rule__CheckDoneActivity__Group_0_4__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3910:1: rule__CheckDoneActivity__Group_0_4__2__Impl : ( 'ago' ) ;
    public final void rule__CheckDoneActivity__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3914:1: ( ( 'ago' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3915:1: ( 'ago' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3915:1: ( 'ago' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3916:1: 'ago'
            {
             before(grammarAccess.getCheckDoneActivityAccess().getAgoKeyword_0_4_2()); 
            match(input,68,FollowSets000.FOLLOW_68_in_rule__CheckDoneActivity__Group_0_4__2__Impl7977); 
             after(grammarAccess.getCheckDoneActivityAccess().getAgoKeyword_0_4_2()); 

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
    // $ANTLR end "rule__CheckDoneActivity__Group_0_4__2__Impl"


    // $ANTLR start "rule__NoRain__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3935:1: rule__NoRain__Group__0 : rule__NoRain__Group__0__Impl rule__NoRain__Group__1 ;
    public final void rule__NoRain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3939:1: ( rule__NoRain__Group__0__Impl rule__NoRain__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3940:2: rule__NoRain__Group__0__Impl rule__NoRain__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group__0__Impl_in_rule__NoRain__Group__08014);
            rule__NoRain__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group__1_in_rule__NoRain__Group__08017);
            rule__NoRain__Group__1();

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
    // $ANTLR end "rule__NoRain__Group__0"


    // $ANTLR start "rule__NoRain__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3947:1: rule__NoRain__Group__0__Impl : ( () ) ;
    public final void rule__NoRain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3951:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3952:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3952:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3953:1: ()
            {
             before(grammarAccess.getNoRainAccess().getNoRainAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3954:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3956:1: 
            {
            }

             after(grammarAccess.getNoRainAccess().getNoRainAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRain__Group__0__Impl"


    // $ANTLR start "rule__NoRain__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3966:1: rule__NoRain__Group__1 : rule__NoRain__Group__1__Impl rule__NoRain__Group__2 ;
    public final void rule__NoRain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3970:1: ( rule__NoRain__Group__1__Impl rule__NoRain__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3971:2: rule__NoRain__Group__1__Impl rule__NoRain__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group__1__Impl_in_rule__NoRain__Group__18075);
            rule__NoRain__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group__2_in_rule__NoRain__Group__18078);
            rule__NoRain__Group__2();

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
    // $ANTLR end "rule__NoRain__Group__1"


    // $ANTLR start "rule__NoRain__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3978:1: rule__NoRain__Group__1__Impl : ( 'noRain' ) ;
    public final void rule__NoRain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3982:1: ( ( 'noRain' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3983:1: ( 'noRain' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3983:1: ( 'noRain' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3984:1: 'noRain'
            {
             before(grammarAccess.getNoRainAccess().getNoRainKeyword_1()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__NoRain__Group__1__Impl8106); 
             after(grammarAccess.getNoRainAccess().getNoRainKeyword_1()); 

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
    // $ANTLR end "rule__NoRain__Group__1__Impl"


    // $ANTLR start "rule__NoRain__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3997:1: rule__NoRain__Group__2 : rule__NoRain__Group__2__Impl ;
    public final void rule__NoRain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4001:1: ( rule__NoRain__Group__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4002:2: rule__NoRain__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group__2__Impl_in_rule__NoRain__Group__28137);
            rule__NoRain__Group__2__Impl();

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
    // $ANTLR end "rule__NoRain__Group__2"


    // $ANTLR start "rule__NoRain__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4008:1: rule__NoRain__Group__2__Impl : ( ( rule__NoRain__Alternatives_2 ) ) ;
    public final void rule__NoRain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4012:1: ( ( ( rule__NoRain__Alternatives_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4013:1: ( ( rule__NoRain__Alternatives_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4013:1: ( ( rule__NoRain__Alternatives_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4014:1: ( rule__NoRain__Alternatives_2 )
            {
             before(grammarAccess.getNoRainAccess().getAlternatives_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4015:1: ( rule__NoRain__Alternatives_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4015:2: rule__NoRain__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Alternatives_2_in_rule__NoRain__Group__2__Impl8164);
            rule__NoRain__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getNoRainAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__NoRain__Group__2__Impl"


    // $ANTLR start "rule__NoRain__Group_2_0__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4031:1: rule__NoRain__Group_2_0__0 : rule__NoRain__Group_2_0__0__Impl rule__NoRain__Group_2_0__1 ;
    public final void rule__NoRain__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4035:1: ( rule__NoRain__Group_2_0__0__Impl rule__NoRain__Group_2_0__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4036:2: rule__NoRain__Group_2_0__0__Impl rule__NoRain__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_0__0__Impl_in_rule__NoRain__Group_2_0__08200);
            rule__NoRain__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_0__1_in_rule__NoRain__Group_2_0__08203);
            rule__NoRain__Group_2_0__1();

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
    // $ANTLR end "rule__NoRain__Group_2_0__0"


    // $ANTLR start "rule__NoRain__Group_2_0__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4043:1: rule__NoRain__Group_2_0__0__Impl : ( 'for' ) ;
    public final void rule__NoRain__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4047:1: ( ( 'for' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4048:1: ( 'for' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4048:1: ( 'for' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4049:1: 'for'
            {
             before(grammarAccess.getNoRainAccess().getForKeyword_2_0_0()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__NoRain__Group_2_0__0__Impl8231); 
             after(grammarAccess.getNoRainAccess().getForKeyword_2_0_0()); 

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
    // $ANTLR end "rule__NoRain__Group_2_0__0__Impl"


    // $ANTLR start "rule__NoRain__Group_2_0__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4062:1: rule__NoRain__Group_2_0__1 : rule__NoRain__Group_2_0__1__Impl rule__NoRain__Group_2_0__2 ;
    public final void rule__NoRain__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4066:1: ( rule__NoRain__Group_2_0__1__Impl rule__NoRain__Group_2_0__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4067:2: rule__NoRain__Group_2_0__1__Impl rule__NoRain__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_0__1__Impl_in_rule__NoRain__Group_2_0__18262);
            rule__NoRain__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_0__2_in_rule__NoRain__Group_2_0__18265);
            rule__NoRain__Group_2_0__2();

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
    // $ANTLR end "rule__NoRain__Group_2_0__1"


    // $ANTLR start "rule__NoRain__Group_2_0__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4074:1: rule__NoRain__Group_2_0__1__Impl : ( ( rule__NoRain__ElapsedTimeAssignment_2_0_1 ) ) ;
    public final void rule__NoRain__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4078:1: ( ( ( rule__NoRain__ElapsedTimeAssignment_2_0_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4079:1: ( ( rule__NoRain__ElapsedTimeAssignment_2_0_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4079:1: ( ( rule__NoRain__ElapsedTimeAssignment_2_0_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4080:1: ( rule__NoRain__ElapsedTimeAssignment_2_0_1 )
            {
             before(grammarAccess.getNoRainAccess().getElapsedTimeAssignment_2_0_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4081:1: ( rule__NoRain__ElapsedTimeAssignment_2_0_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4081:2: rule__NoRain__ElapsedTimeAssignment_2_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__ElapsedTimeAssignment_2_0_1_in_rule__NoRain__Group_2_0__1__Impl8292);
            rule__NoRain__ElapsedTimeAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNoRainAccess().getElapsedTimeAssignment_2_0_1()); 

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
    // $ANTLR end "rule__NoRain__Group_2_0__1__Impl"


    // $ANTLR start "rule__NoRain__Group_2_0__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4091:1: rule__NoRain__Group_2_0__2 : rule__NoRain__Group_2_0__2__Impl ;
    public final void rule__NoRain__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4095:1: ( rule__NoRain__Group_2_0__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4096:2: rule__NoRain__Group_2_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_0__2__Impl_in_rule__NoRain__Group_2_0__28322);
            rule__NoRain__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__NoRain__Group_2_0__2"


    // $ANTLR start "rule__NoRain__Group_2_0__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4102:1: rule__NoRain__Group_2_0__2__Impl : ( ( rule__NoRain__PeriodicityTypeAssignment_2_0_2 ) ) ;
    public final void rule__NoRain__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4106:1: ( ( ( rule__NoRain__PeriodicityTypeAssignment_2_0_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4107:1: ( ( rule__NoRain__PeriodicityTypeAssignment_2_0_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4107:1: ( ( rule__NoRain__PeriodicityTypeAssignment_2_0_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4108:1: ( rule__NoRain__PeriodicityTypeAssignment_2_0_2 )
            {
             before(grammarAccess.getNoRainAccess().getPeriodicityTypeAssignment_2_0_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4109:1: ( rule__NoRain__PeriodicityTypeAssignment_2_0_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4109:2: rule__NoRain__PeriodicityTypeAssignment_2_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__PeriodicityTypeAssignment_2_0_2_in_rule__NoRain__Group_2_0__2__Impl8349);
            rule__NoRain__PeriodicityTypeAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getNoRainAccess().getPeriodicityTypeAssignment_2_0_2()); 

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
    // $ANTLR end "rule__NoRain__Group_2_0__2__Impl"


    // $ANTLR start "rule__NoRain__Group_2_1__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4125:1: rule__NoRain__Group_2_1__0 : rule__NoRain__Group_2_1__0__Impl rule__NoRain__Group_2_1__1 ;
    public final void rule__NoRain__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4129:1: ( rule__NoRain__Group_2_1__0__Impl rule__NoRain__Group_2_1__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4130:2: rule__NoRain__Group_2_1__0__Impl rule__NoRain__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_1__0__Impl_in_rule__NoRain__Group_2_1__08385);
            rule__NoRain__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_1__1_in_rule__NoRain__Group_2_1__08388);
            rule__NoRain__Group_2_1__1();

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
    // $ANTLR end "rule__NoRain__Group_2_1__0"


    // $ANTLR start "rule__NoRain__Group_2_1__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4137:1: rule__NoRain__Group_2_1__0__Impl : ( 'since' ) ;
    public final void rule__NoRain__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4141:1: ( ( 'since' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4142:1: ( 'since' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4142:1: ( 'since' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4143:1: 'since'
            {
             before(grammarAccess.getNoRainAccess().getSinceKeyword_2_1_0()); 
            match(input,70,FollowSets000.FOLLOW_70_in_rule__NoRain__Group_2_1__0__Impl8416); 
             after(grammarAccess.getNoRainAccess().getSinceKeyword_2_1_0()); 

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
    // $ANTLR end "rule__NoRain__Group_2_1__0__Impl"


    // $ANTLR start "rule__NoRain__Group_2_1__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4156:1: rule__NoRain__Group_2_1__1 : rule__NoRain__Group_2_1__1__Impl ;
    public final void rule__NoRain__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4160:1: ( rule__NoRain__Group_2_1__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4161:2: rule__NoRain__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_1__1__Impl_in_rule__NoRain__Group_2_1__18447);
            rule__NoRain__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__NoRain__Group_2_1__1"


    // $ANTLR start "rule__NoRain__Group_2_1__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4167:1: rule__NoRain__Group_2_1__1__Impl : ( ( rule__NoRain__DateAssignment_2_1_1 ) ) ;
    public final void rule__NoRain__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4171:1: ( ( ( rule__NoRain__DateAssignment_2_1_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4172:1: ( ( rule__NoRain__DateAssignment_2_1_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4172:1: ( ( rule__NoRain__DateAssignment_2_1_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4173:1: ( rule__NoRain__DateAssignment_2_1_1 )
            {
             before(grammarAccess.getNoRainAccess().getDateAssignment_2_1_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4174:1: ( rule__NoRain__DateAssignment_2_1_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4174:2: rule__NoRain__DateAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__DateAssignment_2_1_1_in_rule__NoRain__Group_2_1__1__Impl8474);
            rule__NoRain__DateAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNoRainAccess().getDateAssignment_2_1_1()); 

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
    // $ANTLR end "rule__NoRain__Group_2_1__1__Impl"


    // $ANTLR start "rule__GrainState__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4188:1: rule__GrainState__Group__0 : rule__GrainState__Group__0__Impl rule__GrainState__Group__1 ;
    public final void rule__GrainState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4192:1: ( rule__GrainState__Group__0__Impl rule__GrainState__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4193:2: rule__GrainState__Group__0__Impl rule__GrainState__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__0__Impl_in_rule__GrainState__Group__08508);
            rule__GrainState__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__1_in_rule__GrainState__Group__08511);
            rule__GrainState__Group__1();

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
    // $ANTLR end "rule__GrainState__Group__0"


    // $ANTLR start "rule__GrainState__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4200:1: rule__GrainState__Group__0__Impl : ( () ) ;
    public final void rule__GrainState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4204:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4205:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4205:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4206:1: ()
            {
             before(grammarAccess.getGrainStateAccess().getGrainStateAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4207:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4209:1: 
            {
            }

             after(grammarAccess.getGrainStateAccess().getGrainStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrainState__Group__0__Impl"


    // $ANTLR start "rule__GrainState__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4219:1: rule__GrainState__Group__1 : rule__GrainState__Group__1__Impl rule__GrainState__Group__2 ;
    public final void rule__GrainState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4223:1: ( rule__GrainState__Group__1__Impl rule__GrainState__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4224:2: rule__GrainState__Group__1__Impl rule__GrainState__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__1__Impl_in_rule__GrainState__Group__18569);
            rule__GrainState__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__2_in_rule__GrainState__Group__18572);
            rule__GrainState__Group__2();

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
    // $ANTLR end "rule__GrainState__Group__1"


    // $ANTLR start "rule__GrainState__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4231:1: rule__GrainState__Group__1__Impl : ( 'grain' ) ;
    public final void rule__GrainState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4235:1: ( ( 'grain' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4236:1: ( 'grain' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4236:1: ( 'grain' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4237:1: 'grain'
            {
             before(grammarAccess.getGrainStateAccess().getGrainKeyword_1()); 
            match(input,71,FollowSets000.FOLLOW_71_in_rule__GrainState__Group__1__Impl8600); 
             after(grammarAccess.getGrainStateAccess().getGrainKeyword_1()); 

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
    // $ANTLR end "rule__GrainState__Group__1__Impl"


    // $ANTLR start "rule__GrainState__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4250:1: rule__GrainState__Group__2 : rule__GrainState__Group__2__Impl rule__GrainState__Group__3 ;
    public final void rule__GrainState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4254:1: ( rule__GrainState__Group__2__Impl rule__GrainState__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4255:2: rule__GrainState__Group__2__Impl rule__GrainState__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__2__Impl_in_rule__GrainState__Group__28631);
            rule__GrainState__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__3_in_rule__GrainState__Group__28634);
            rule__GrainState__Group__3();

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
    // $ANTLR end "rule__GrainState__Group__2"


    // $ANTLR start "rule__GrainState__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4262:1: rule__GrainState__Group__2__Impl : ( 'is' ) ;
    public final void rule__GrainState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4266:1: ( ( 'is' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4267:1: ( 'is' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4267:1: ( 'is' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4268:1: 'is'
            {
             before(grammarAccess.getGrainStateAccess().getIsKeyword_2()); 
            match(input,72,FollowSets000.FOLLOW_72_in_rule__GrainState__Group__2__Impl8662); 
             after(grammarAccess.getGrainStateAccess().getIsKeyword_2()); 

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
    // $ANTLR end "rule__GrainState__Group__2__Impl"


    // $ANTLR start "rule__GrainState__Group__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4281:1: rule__GrainState__Group__3 : rule__GrainState__Group__3__Impl ;
    public final void rule__GrainState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4285:1: ( rule__GrainState__Group__3__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4286:2: rule__GrainState__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__3__Impl_in_rule__GrainState__Group__38693);
            rule__GrainState__Group__3__Impl();

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
    // $ANTLR end "rule__GrainState__Group__3"


    // $ANTLR start "rule__GrainState__Group__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4292:1: rule__GrainState__Group__3__Impl : ( ( rule__GrainState__StateAssignment_3 ) ) ;
    public final void rule__GrainState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4296:1: ( ( ( rule__GrainState__StateAssignment_3 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4297:1: ( ( rule__GrainState__StateAssignment_3 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4297:1: ( ( rule__GrainState__StateAssignment_3 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4298:1: ( rule__GrainState__StateAssignment_3 )
            {
             before(grammarAccess.getGrainStateAccess().getStateAssignment_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4299:1: ( rule__GrainState__StateAssignment_3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4299:2: rule__GrainState__StateAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GrainState__StateAssignment_3_in_rule__GrainState__Group__3__Impl8720);
            rule__GrainState__StateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGrainStateAccess().getStateAssignment_3()); 

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
    // $ANTLR end "rule__GrainState__Group__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4317:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4321:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4322:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08758);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08761);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4329:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4333:1: ( ( ( '-' )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4334:1: ( ( '-' )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4334:1: ( ( '-' )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4335:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4336:1: ( '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==73) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4337:2: '-'
                    {
                    match(input,73,FollowSets000.FOLLOW_73_in_rule__EInt__Group__0__Impl8790); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4348:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4352:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4353:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__18823);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4359:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4363:1: ( ( RULE_INT ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4364:1: ( RULE_INT )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4364:1: ( RULE_INT )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4365:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl8850); 
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


    // $ANTLR start "rule__EFloat__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4380:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4384:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4385:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__08883);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__08886);
            rule__EFloat__Group__1();

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
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4392:1: rule__EFloat__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4396:1: ( ( RULE_INT ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4397:1: ( RULE_INT )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4397:1: ( RULE_INT )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4398:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__0__Impl8913); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4409:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4413:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4414:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__18942);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__18945);
            rule__EFloat__Group__2();

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
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4421:1: rule__EFloat__Group__1__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4425:1: ( ( '.' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4426:1: ( '.' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4426:1: ( '.' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4427:1: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
            match(input,74,FollowSets000.FOLLOW_74_in_rule__EFloat__Group__1__Impl8973); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4440:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4444:1: ( rule__EFloat__Group__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4445:2: rule__EFloat__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__29004);
            rule__EFloat__Group__2__Impl();

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
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4451:1: rule__EFloat__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4455:1: ( ( RULE_INT ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4456:1: ( RULE_INT )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4456:1: ( RULE_INT )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4457:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__2__Impl9031); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__Model__AtelierAssignment_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4475:1: rule__Model__AtelierAssignment_1 : ( ruleAtelier ) ;
    public final void rule__Model__AtelierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4479:1: ( ( ruleAtelier ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4480:1: ( ruleAtelier )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4480:1: ( ruleAtelier )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4481:1: ruleAtelier
            {
             before(grammarAccess.getModelAccess().getAtelierAtelierParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtelier_in_rule__Model__AtelierAssignment_19071);
            ruleAtelier();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAtelierAtelierParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__AtelierAssignment_1"


    // $ANTLR start "rule__Atelier__IdAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4490:1: rule__Atelier__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__Atelier__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4494:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4495:1: ( ruleEString )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4495:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4496:1: ruleEString
            {
             before(grammarAccess.getAtelierAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Atelier__IdAssignment_29102);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtelierAccess().getIdEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Atelier__IdAssignment_2"


    // $ANTLR start "rule__Atelier__ActivityAssignment_4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4505:1: rule__Atelier__ActivityAssignment_4 : ( rulePeriodicActivity ) ;
    public final void rule__Atelier__ActivityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4509:1: ( ( rulePeriodicActivity ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4510:1: ( rulePeriodicActivity )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4510:1: ( rulePeriodicActivity )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4511:1: rulePeriodicActivity
            {
             before(grammarAccess.getAtelierAccess().getActivityPeriodicActivityParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicActivity_in_rule__Atelier__ActivityAssignment_49133);
            rulePeriodicActivity();

            state._fsp--;

             after(grammarAccess.getAtelierAccess().getActivityPeriodicActivityParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Atelier__ActivityAssignment_4"


    // $ANTLR start "rule__PeriodicActivity__NameAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4520:1: rule__PeriodicActivity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PeriodicActivity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4524:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4525:1: ( ruleEString )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4525:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4526:1: ruleEString
            {
             before(grammarAccess.getPeriodicActivityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeriodicActivity__NameAssignment_29164);
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


    // $ANTLR start "rule__PeriodicActivity__StartAssignment_5"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4535:1: rule__PeriodicActivity__StartAssignment_5 : ( ruleDate ) ;
    public final void rule__PeriodicActivity__StartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4539:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4540:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4540:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4541:1: ruleDate
            {
             before(grammarAccess.getPeriodicActivityAccess().getStartDateParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__PeriodicActivity__StartAssignment_59195);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getStartDateParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__StartAssignment_5"


    // $ANTLR start "rule__PeriodicActivity__EndAssignment_7"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4550:1: rule__PeriodicActivity__EndAssignment_7 : ( ruleDate ) ;
    public final void rule__PeriodicActivity__EndAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4554:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4555:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4555:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4556:1: ruleDate
            {
             before(grammarAccess.getPeriodicActivityAccess().getEndDateParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__PeriodicActivity__EndAssignment_79226);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getEndDateParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__EndAssignment_7"


    // $ANTLR start "rule__PeriodicActivity__FrequencyAssignment_9_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4565:1: rule__PeriodicActivity__FrequencyAssignment_9_1 : ( ruleEInt ) ;
    public final void rule__PeriodicActivity__FrequencyAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4569:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4570:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4570:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4571:1: ruleEInt
            {
             before(grammarAccess.getPeriodicActivityAccess().getFrequencyEIntParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__PeriodicActivity__FrequencyAssignment_9_19257);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getFrequencyEIntParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__FrequencyAssignment_9_1"


    // $ANTLR start "rule__PeriodicActivity__PeriodicityTypeAssignment_9_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4580:1: rule__PeriodicActivity__PeriodicityTypeAssignment_9_2 : ( rulePeriodicity ) ;
    public final void rule__PeriodicActivity__PeriodicityTypeAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4584:1: ( ( rulePeriodicity ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4585:1: ( rulePeriodicity )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4585:1: ( rulePeriodicity )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4586:1: rulePeriodicity
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_rule__PeriodicActivity__PeriodicityTypeAssignment_9_29288);
            rulePeriodicity();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__PeriodicityTypeAssignment_9_2"


    // $ANTLR start "rule__PeriodicActivity__ResAllocationAssignment_10_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4595:1: rule__PeriodicActivity__ResAllocationAssignment_10_2 : ( ruleResAllocation ) ;
    public final void rule__PeriodicActivity__ResAllocationAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4599:1: ( ( ruleResAllocation ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4600:1: ( ruleResAllocation )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4600:1: ( ruleResAllocation )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4601:1: ruleResAllocation
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_10_29319);
            ruleResAllocation();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__ResAllocationAssignment_10_2"


    // $ANTLR start "rule__PeriodicActivity__ResAllocationAssignment_10_3_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4610:1: rule__PeriodicActivity__ResAllocationAssignment_10_3_1 : ( ruleResAllocation ) ;
    public final void rule__PeriodicActivity__ResAllocationAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4614:1: ( ( ruleResAllocation ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4615:1: ( ruleResAllocation )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4615:1: ( ruleResAllocation )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4616:1: ruleResAllocation
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_10_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_10_3_19350);
            ruleResAllocation();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_10_3_1_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__ResAllocationAssignment_10_3_1"


    // $ANTLR start "rule__PeriodicActivity__RuleAssignment_11_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4625:1: rule__PeriodicActivity__RuleAssignment_11_2 : ( ruleBinaryExppression ) ;
    public final void rule__PeriodicActivity__RuleAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4629:1: ( ( ruleBinaryExppression ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4630:1: ( ruleBinaryExppression )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4630:1: ( ruleBinaryExppression )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4631:1: ruleBinaryExppression
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleBinaryExppressionParserRuleCall_11_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_rule__PeriodicActivity__RuleAssignment_11_29381);
            ruleBinaryExppression();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getRuleBinaryExppressionParserRuleCall_11_2_0()); 

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
    // $ANTLR end "rule__PeriodicActivity__RuleAssignment_11_2"


    // $ANTLR start "rule__Date__DayAssignment_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4640:1: rule__Date__DayAssignment_1 : ( ruleEInt ) ;
    public final void rule__Date__DayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4644:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4645:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4645:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4646:1: ruleEInt
            {
             before(grammarAccess.getDateAccess().getDayEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Date__DayAssignment_19412);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4655:1: rule__Date__MonthAssignment_2 : ( ruleMonth ) ;
    public final void rule__Date__MonthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4659:1: ( ( ruleMonth ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4660:1: ( ruleMonth )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4660:1: ( ruleMonth )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4661:1: ruleMonth
            {
             before(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMonth_in_rule__Date__MonthAssignment_29443);
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


    // $ANTLR start "rule__Date__YearAssignment_3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4670:1: rule__Date__YearAssignment_3 : ( ruleEInt ) ;
    public final void rule__Date__YearAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4674:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4675:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4675:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4676:1: ruleEInt
            {
             before(grammarAccess.getDateAccess().getYearEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Date__YearAssignment_39474);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDateAccess().getYearEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Date__YearAssignment_3"


    // $ANTLR start "rule__ResAllocation__RessourceTypeAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4685:1: rule__ResAllocation__RessourceTypeAssignment_2 : ( ruleEnumTypeRessource ) ;
    public final void rule__ResAllocation__RessourceTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4689:1: ( ( ruleEnumTypeRessource ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4690:1: ( ruleEnumTypeRessource )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4690:1: ( ruleEnumTypeRessource )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4691:1: ruleEnumTypeRessource
            {
             before(grammarAccess.getResAllocationAccess().getRessourceTypeEnumTypeRessourceEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumTypeRessource_in_rule__ResAllocation__RessourceTypeAssignment_29505);
            ruleEnumTypeRessource();

            state._fsp--;

             after(grammarAccess.getResAllocationAccess().getRessourceTypeEnumTypeRessourceEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__ResAllocation__RessourceTypeAssignment_2"


    // $ANTLR start "rule__ResAllocation__DurationAssignment_4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4700:1: rule__ResAllocation__DurationAssignment_4 : ( ruleEInt ) ;
    public final void rule__ResAllocation__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4704:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4705:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4705:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4706:1: ruleEInt
            {
             before(grammarAccess.getResAllocationAccess().getDurationEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ResAllocation__DurationAssignment_49536);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4715:1: rule__ResAllocation__PeriodicityTypeAssignment_5 : ( rulePeriodicity ) ;
    public final void rule__ResAllocation__PeriodicityTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4719:1: ( ( rulePeriodicity ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4720:1: ( rulePeriodicity )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4720:1: ( rulePeriodicity )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4721:1: rulePeriodicity
            {
             before(grammarAccess.getResAllocationAccess().getPeriodicityTypePeriodicityEnumRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_rule__ResAllocation__PeriodicityTypeAssignment_59567);
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


    // $ANTLR start "rule__Predicate__DateAssignment_0_1_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4730:1: rule__Predicate__DateAssignment_0_1_1 : ( ruleDate ) ;
    public final void rule__Predicate__DateAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4734:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4735:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4735:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4736:1: ruleDate
            {
             before(grammarAccess.getPredicateAccess().getDateDateParserRuleCall_0_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__Predicate__DateAssignment_0_1_19598);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getDateDateParserRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__Predicate__DateAssignment_0_1_1"


    // $ANTLR start "rule__BinaryExppression__LeftAssignment_1_0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4745:1: rule__BinaryExppression__LeftAssignment_1_0 : ( rulePredicate ) ;
    public final void rule__BinaryExppression__LeftAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4749:1: ( ( rulePredicate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4750:1: ( rulePredicate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4750:1: ( rulePredicate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4751:1: rulePredicate
            {
             before(grammarAccess.getBinaryExppressionAccess().getLeftPredicateParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_rule__BinaryExppression__LeftAssignment_1_09629);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getBinaryExppressionAccess().getLeftPredicateParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__BinaryExppression__LeftAssignment_1_0"


    // $ANTLR start "rule__BinaryExppression__LeftAssignment_1_1_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4760:1: rule__BinaryExppression__LeftAssignment_1_1_1 : ( ruleBinaryExppression ) ;
    public final void rule__BinaryExppression__LeftAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4764:1: ( ( ruleBinaryExppression ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4765:1: ( ruleBinaryExppression )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4765:1: ( ruleBinaryExppression )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4766:1: ruleBinaryExppression
            {
             before(grammarAccess.getBinaryExppressionAccess().getLeftBinaryExppressionParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_rule__BinaryExppression__LeftAssignment_1_1_19660);
            ruleBinaryExppression();

            state._fsp--;

             after(grammarAccess.getBinaryExppressionAccess().getLeftBinaryExppressionParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__BinaryExppression__LeftAssignment_1_1_1"


    // $ANTLR start "rule__BinaryExppression__OpeAssignment_2_0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4775:1: rule__BinaryExppression__OpeAssignment_2_0 : ( ruleBinaryExppressionType ) ;
    public final void rule__BinaryExppression__OpeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4779:1: ( ( ruleBinaryExppressionType ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4780:1: ( ruleBinaryExppressionType )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4780:1: ( ruleBinaryExppressionType )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4781:1: ruleBinaryExppressionType
            {
             before(grammarAccess.getBinaryExppressionAccess().getOpeBinaryExppressionTypeEnumRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExppressionType_in_rule__BinaryExppression__OpeAssignment_2_09691);
            ruleBinaryExppressionType();

            state._fsp--;

             after(grammarAccess.getBinaryExppressionAccess().getOpeBinaryExppressionTypeEnumRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__BinaryExppression__OpeAssignment_2_0"


    // $ANTLR start "rule__BinaryExppression__RightAssignment_2_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4790:1: rule__BinaryExppression__RightAssignment_2_1 : ( ruleBinaryExppression ) ;
    public final void rule__BinaryExppression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4794:1: ( ( ruleBinaryExppression ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4795:1: ( ruleBinaryExppression )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4795:1: ( ruleBinaryExppression )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4796:1: ruleBinaryExppression
            {
             before(grammarAccess.getBinaryExppressionAccess().getRightBinaryExppressionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_rule__BinaryExppression__RightAssignment_2_19722);
            ruleBinaryExppression();

            state._fsp--;

             after(grammarAccess.getBinaryExppressionAccess().getRightBinaryExppressionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__BinaryExppression__RightAssignment_2_1"


    // $ANTLR start "rule__Temperature__ComparatorAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4805:1: rule__Temperature__ComparatorAssignment_2 : ( ruleComparator ) ;
    public final void rule__Temperature__ComparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4809:1: ( ( ruleComparator ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4810:1: ( ruleComparator )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4810:1: ( ruleComparator )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4811:1: ruleComparator
            {
             before(grammarAccess.getTemperatureAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_rule__Temperature__ComparatorAssignment_29753);
            ruleComparator();

            state._fsp--;

             after(grammarAccess.getTemperatureAccess().getComparatorComparatorEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Temperature__ComparatorAssignment_2"


    // $ANTLR start "rule__Temperature__ValueAssignment_4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4820:1: rule__Temperature__ValueAssignment_4 : ( ruleEFloat ) ;
    public final void rule__Temperature__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4824:1: ( ( ruleEFloat ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4825:1: ( ruleEFloat )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4825:1: ( ruleEFloat )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4826:1: ruleEFloat
            {
             before(grammarAccess.getTemperatureAccess().getValueEFloatParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__Temperature__ValueAssignment_49784);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getTemperatureAccess().getValueEFloatParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Temperature__ValueAssignment_4"


    // $ANTLR start "rule__Precipitation__ComparatorAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4835:1: rule__Precipitation__ComparatorAssignment_2 : ( ruleComparator ) ;
    public final void rule__Precipitation__ComparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4839:1: ( ( ruleComparator ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4840:1: ( ruleComparator )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4840:1: ( ruleComparator )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4841:1: ruleComparator
            {
             before(grammarAccess.getPrecipitationAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_rule__Precipitation__ComparatorAssignment_29815);
            ruleComparator();

            state._fsp--;

             after(grammarAccess.getPrecipitationAccess().getComparatorComparatorEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Precipitation__ComparatorAssignment_2"


    // $ANTLR start "rule__Precipitation__HeightAssignment_4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4850:1: rule__Precipitation__HeightAssignment_4 : ( ruleEFloat ) ;
    public final void rule__Precipitation__HeightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4854:1: ( ( ruleEFloat ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4855:1: ( ruleEFloat )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4855:1: ( ruleEFloat )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4856:1: ruleEFloat
            {
             before(grammarAccess.getPrecipitationAccess().getHeightEFloatParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__Precipitation__HeightAssignment_49846);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getPrecipitationAccess().getHeightEFloatParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Precipitation__HeightAssignment_4"


    // $ANTLR start "rule__Rayonnement__ComparatorAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4865:1: rule__Rayonnement__ComparatorAssignment_2 : ( ruleComparator ) ;
    public final void rule__Rayonnement__ComparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4869:1: ( ( ruleComparator ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4870:1: ( ruleComparator )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4870:1: ( ruleComparator )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4871:1: ruleComparator
            {
             before(grammarAccess.getRayonnementAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_rule__Rayonnement__ComparatorAssignment_29877);
            ruleComparator();

            state._fsp--;

             after(grammarAccess.getRayonnementAccess().getComparatorComparatorEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Rayonnement__ComparatorAssignment_2"


    // $ANTLR start "rule__Rayonnement__ValueAssignment_4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4880:1: rule__Rayonnement__ValueAssignment_4 : ( ruleEFloat ) ;
    public final void rule__Rayonnement__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4884:1: ( ( ruleEFloat ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4885:1: ( ruleEFloat )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4885:1: ( ruleEFloat )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4886:1: ruleEFloat
            {
             before(grammarAccess.getRayonnementAccess().getValueEFloatParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__Rayonnement__ValueAssignment_49908);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getRayonnementAccess().getValueEFloatParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Rayonnement__ValueAssignment_4"


    // $ANTLR start "rule__Evapotranspiration__ComparatorAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4895:1: rule__Evapotranspiration__ComparatorAssignment_2 : ( ruleComparator ) ;
    public final void rule__Evapotranspiration__ComparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4899:1: ( ( ruleComparator ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4900:1: ( ruleComparator )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4900:1: ( ruleComparator )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4901:1: ruleComparator
            {
             before(grammarAccess.getEvapotranspirationAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_rule__Evapotranspiration__ComparatorAssignment_29939);
            ruleComparator();

            state._fsp--;

             after(grammarAccess.getEvapotranspirationAccess().getComparatorComparatorEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Evapotranspiration__ComparatorAssignment_2"


    // $ANTLR start "rule__Evapotranspiration__ValueAssignment_4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4910:1: rule__Evapotranspiration__ValueAssignment_4 : ( ruleEFloat ) ;
    public final void rule__Evapotranspiration__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4914:1: ( ( ruleEFloat ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4915:1: ( ruleEFloat )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4915:1: ( ruleEFloat )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4916:1: ruleEFloat
            {
             before(grammarAccess.getEvapotranspirationAccess().getValueEFloatParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__Evapotranspiration__ValueAssignment_49970);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEvapotranspirationAccess().getValueEFloatParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Evapotranspiration__ValueAssignment_4"


    // $ANTLR start "rule__CheckDoneActivity__ActivityToValidateAssignment_0_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4925:1: rule__CheckDoneActivity__ActivityToValidateAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__CheckDoneActivity__ActivityToValidateAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4929:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4930:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4930:1: ( ( RULE_ID ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4931:1: ( RULE_ID )
            {
             before(grammarAccess.getCheckDoneActivityAccess().getActivityToValidatePeriodicActivityCrossReference_0_2_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4932:1: ( RULE_ID )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4933:1: RULE_ID
            {
             before(grammarAccess.getCheckDoneActivityAccess().getActivityToValidatePeriodicActivityIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__CheckDoneActivity__ActivityToValidateAssignment_0_210005); 
             after(grammarAccess.getCheckDoneActivityAccess().getActivityToValidatePeriodicActivityIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getCheckDoneActivityAccess().getActivityToValidatePeriodicActivityCrossReference_0_2_0()); 

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
    // $ANTLR end "rule__CheckDoneActivity__ActivityToValidateAssignment_0_2"


    // $ANTLR start "rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4944:1: rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0 : ( ruleEInt ) ;
    public final void rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4948:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4949:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4949:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4950:1: ruleEInt
            {
             before(grammarAccess.getCheckDoneActivityAccess().getElapsedTimeEIntParserRuleCall_0_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_010040);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCheckDoneActivityAccess().getElapsedTimeEIntParserRuleCall_0_4_0_0()); 

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
    // $ANTLR end "rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0"


    // $ANTLR start "rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4959:1: rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1 : ( rulePeriodicity ) ;
    public final void rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4963:1: ( ( rulePeriodicity ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4964:1: ( rulePeriodicity )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4964:1: ( rulePeriodicity )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4965:1: rulePeriodicity
            {
             before(grammarAccess.getCheckDoneActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_0_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_110071);
            rulePeriodicity();

            state._fsp--;

             after(grammarAccess.getCheckDoneActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_0_4_1_0()); 

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
    // $ANTLR end "rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1"


    // $ANTLR start "rule__CheckDoneActivity__DateAssignment_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4974:1: rule__CheckDoneActivity__DateAssignment_1 : ( ruleDate ) ;
    public final void rule__CheckDoneActivity__DateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4978:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4979:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4979:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4980:1: ruleDate
            {
             before(grammarAccess.getCheckDoneActivityAccess().getDateDateParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__CheckDoneActivity__DateAssignment_110102);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getCheckDoneActivityAccess().getDateDateParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CheckDoneActivity__DateAssignment_1"


    // $ANTLR start "rule__NoRain__ElapsedTimeAssignment_2_0_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4989:1: rule__NoRain__ElapsedTimeAssignment_2_0_1 : ( ruleEInt ) ;
    public final void rule__NoRain__ElapsedTimeAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4993:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4994:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4994:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4995:1: ruleEInt
            {
             before(grammarAccess.getNoRainAccess().getElapsedTimeEIntParserRuleCall_2_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__NoRain__ElapsedTimeAssignment_2_0_110133);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNoRainAccess().getElapsedTimeEIntParserRuleCall_2_0_1_0()); 

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
    // $ANTLR end "rule__NoRain__ElapsedTimeAssignment_2_0_1"


    // $ANTLR start "rule__NoRain__PeriodicityTypeAssignment_2_0_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5004:1: rule__NoRain__PeriodicityTypeAssignment_2_0_2 : ( rulePeriodicity ) ;
    public final void rule__NoRain__PeriodicityTypeAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5008:1: ( ( rulePeriodicity ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5009:1: ( rulePeriodicity )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5009:1: ( rulePeriodicity )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5010:1: rulePeriodicity
            {
             before(grammarAccess.getNoRainAccess().getPeriodicityTypePeriodicityEnumRuleCall_2_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_rule__NoRain__PeriodicityTypeAssignment_2_0_210164);
            rulePeriodicity();

            state._fsp--;

             after(grammarAccess.getNoRainAccess().getPeriodicityTypePeriodicityEnumRuleCall_2_0_2_0()); 

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
    // $ANTLR end "rule__NoRain__PeriodicityTypeAssignment_2_0_2"


    // $ANTLR start "rule__NoRain__DateAssignment_2_1_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5019:1: rule__NoRain__DateAssignment_2_1_1 : ( ruleDate ) ;
    public final void rule__NoRain__DateAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5023:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5024:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5024:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5025:1: ruleDate
            {
             before(grammarAccess.getNoRainAccess().getDateDateParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__NoRain__DateAssignment_2_1_110195);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getNoRainAccess().getDateDateParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__NoRain__DateAssignment_2_1_1"


    // $ANTLR start "rule__GrainState__StateAssignment_3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5034:1: rule__GrainState__StateAssignment_3 : ( ruleGrainStateEnum ) ;
    public final void rule__GrainState__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5038:1: ( ( ruleGrainStateEnum ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5039:1: ( ruleGrainStateEnum )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5039:1: ( ruleGrainStateEnum )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5040:1: ruleGrainStateEnum
            {
             before(grammarAccess.getGrainStateAccess().getStateGrainStateEnumEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrainStateEnum_in_rule__GrainState__StateAssignment_310226);
            ruleGrainStateEnum();

            state._fsp--;

             after(grammarAccess.getGrainStateAccess().getStateGrainStateEnumEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__GrainState__StateAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtelier_in_entryRuleAtelier121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtelier128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier__Group__0_in_ruleAtelier154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicActivity_in_entryRulePeriodicActivity181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePeriodicActivity188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__0_in_rulePeriodicActivity214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0_in_ruleDate274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_entryRuleResAllocation301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResAllocation308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__0_in_ruleResAllocation334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicate368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Alternatives_in_rulePredicate394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_entryRuleBinaryExppression421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryExppression428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group__0_in_ruleBinaryExppression454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperature_in_entryRuleTemperature481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemperature488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__Group__0_in_ruleTemperature514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrecipitation_in_entryRulePrecipitation541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrecipitation548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__0_in_rulePrecipitation574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRayonnement_in_entryRuleRayonnement601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRayonnement608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__0_in_ruleRayonnement634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvapotranspiration_in_entryRuleEvapotranspiration661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvapotranspiration668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__0_in_ruleEvapotranspiration694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckDoneActivity_in_entryRuleCheckDoneActivity721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCheckDoneActivity728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Alternatives_in_ruleCheckDoneActivity754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRain_in_entryRuleNoRain781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoRain788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group__0_in_ruleNoRain814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrainState_in_entryRuleGrainState841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrainState848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GrainState__Group__0_in_ruleGrainState874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat1021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0_in_ruleEFloat1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Periodicity__Alternatives_in_rulePeriodicity1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Month__Alternatives_in_ruleMonth1127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparator__Alternatives_in_ruleComparator1163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppressionType__Alternatives_in_ruleBinaryExppressionType1199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GrainStateEnum__Alternatives_in_ruleGrainStateEnum1235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EnumTypeRessource__Alternatives_in_ruleEnumTypeRessource1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0__0_in_rule__Predicate__Alternatives1306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckDoneActivity_in_rule__Predicate__Alternatives1324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRain_in_rule__Predicate__Alternatives1341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperature_in_rule__Predicate__Alternatives1358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrecipitation_in_rule__Predicate__Alternatives1375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRayonnement_in_rule__Predicate__Alternatives1392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvapotranspiration_in_rule__Predicate__Alternatives1409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrainState_in_rule__Predicate__Alternatives1426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__LeftAssignment_1_0_in_rule__BinaryExppression__Alternatives_11458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_1_1__0_in_rule__BinaryExppression__Alternatives_11476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Temperature__Alternatives_11510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Temperature__Alternatives_11530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Precipitation__Alternatives_11565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Precipitation__Alternatives_11585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Rayonnement__Alternatives_11620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Rayonnement__Alternatives_11640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Evapotranspiration__Alternatives_11675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Evapotranspiration__Alternatives_11695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__0_in_rule__CheckDoneActivity__Alternatives1729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__DateAssignment_1_in_rule__CheckDoneActivity__Alternatives1747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_0__0_in_rule__NoRain__Alternatives_21780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_1__0_in_rule__NoRain__Alternatives_21798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Periodicity__Alternatives1881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Periodicity__Alternatives1902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Periodicity__Alternatives1923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Periodicity__Alternatives1944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Periodicity__Alternatives1965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Month__Alternatives2001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Month__Alternatives2022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Month__Alternatives2043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Month__Alternatives2064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Month__Alternatives2085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Month__Alternatives2106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Month__Alternatives2127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Month__Alternatives2148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Month__Alternatives2169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Month__Alternatives2190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Month__Alternatives2211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Month__Alternatives2232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Comparator__Alternatives2268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Comparator__Alternatives2289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Comparator__Alternatives2310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Comparator__Alternatives2331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Comparator__Alternatives2352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Comparator__Alternatives2373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__BinaryExppressionType__Alternatives2409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__BinaryExppressionType__Alternatives2430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__BinaryExppressionType__Alternatives2451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__GrainStateEnum__Alternatives2487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__GrainStateEnum__Alternatives2508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__EnumTypeRessource__Alternatives2544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__EnumTypeRessource__Alternatives2565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02598 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__AtelierAssignment_1_in_rule__Model__Group__1__Impl2686 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_rule__Atelier__Group__0__Impl_in_rule__Atelier__Group__02721 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Atelier__Group__1_in_rule__Atelier__Group__02724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier__Group__1__Impl_in_rule__Atelier__Group__12782 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Atelier__Group__2_in_rule__Atelier__Group__12785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Atelier__Group__1__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier__Group__2__Impl_in_rule__Atelier__Group__22844 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__Atelier__Group__3_in_rule__Atelier__Group__22847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier__IdAssignment_2_in_rule__Atelier__Group__2__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier__Group__3__Impl_in_rule__Atelier__Group__32904 = new BitSet(new long[]{0x0018000000000000L});
        public static final BitSet FOLLOW_rule__Atelier__Group__4_in_rule__Atelier__Group__32907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Atelier__Group__3__Impl2935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier__Group__4__Impl_in_rule__Atelier__Group__42966 = new BitSet(new long[]{0x0018000000000000L});
        public static final BitSet FOLLOW_rule__Atelier__Group__5_in_rule__Atelier__Group__42969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier__ActivityAssignment_4_in_rule__Atelier__Group__4__Impl2996 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_rule__Atelier__Group__5__Impl_in_rule__Atelier__Group__53027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Atelier__Group__5__Impl3055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__0__Impl_in_rule__PeriodicActivity__Group__03098 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__1_in_rule__PeriodicActivity__Group__03101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__1__Impl_in_rule__PeriodicActivity__Group__13159 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__2_in_rule__PeriodicActivity__Group__13162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__PeriodicActivity__Group__1__Impl3190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__2__Impl_in_rule__PeriodicActivity__Group__23221 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__3_in_rule__PeriodicActivity__Group__23224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__NameAssignment_2_in_rule__PeriodicActivity__Group__2__Impl3251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__3__Impl_in_rule__PeriodicActivity__Group__33281 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__4_in_rule__PeriodicActivity__Group__33284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__PeriodicActivity__Group__3__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__4__Impl_in_rule__PeriodicActivity__Group__43343 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__5_in_rule__PeriodicActivity__Group__43346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__PeriodicActivity__Group__4__Impl3374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__5__Impl_in_rule__PeriodicActivity__Group__53405 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__6_in_rule__PeriodicActivity__Group__53408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__StartAssignment_5_in_rule__PeriodicActivity__Group__5__Impl3435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__6__Impl_in_rule__PeriodicActivity__Group__63465 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__7_in_rule__PeriodicActivity__Group__63468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__PeriodicActivity__Group__6__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__7__Impl_in_rule__PeriodicActivity__Group__73527 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__8_in_rule__PeriodicActivity__Group__73530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__EndAssignment_7_in_rule__PeriodicActivity__Group__7__Impl3557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__8__Impl_in_rule__PeriodicActivity__Group__83587 = new BitSet(new long[]{0x0708000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__9_in_rule__PeriodicActivity__Group__83590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__PeriodicActivity__Group__8__Impl3618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__9__Impl_in_rule__PeriodicActivity__Group__93649 = new BitSet(new long[]{0x0708000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__10_in_rule__PeriodicActivity__Group__93652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_9__0_in_rule__PeriodicActivity__Group__9__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__10__Impl_in_rule__PeriodicActivity__Group__103710 = new BitSet(new long[]{0x0708000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__11_in_rule__PeriodicActivity__Group__103713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__0_in_rule__PeriodicActivity__Group__10__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__11__Impl_in_rule__PeriodicActivity__Group__113771 = new BitSet(new long[]{0x0708000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__12_in_rule__PeriodicActivity__Group__113774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__0_in_rule__PeriodicActivity__Group__11__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__12__Impl_in_rule__PeriodicActivity__Group__123832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__PeriodicActivity__Group__12__Impl3860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_9__0__Impl_in_rule__PeriodicActivity__Group_9__03917 = new BitSet(new long[]{0x0000000000F80040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_9__1_in_rule__PeriodicActivity__Group_9__03920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__PeriodicActivity__Group_9__0__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_9__1__Impl_in_rule__PeriodicActivity__Group_9__13979 = new BitSet(new long[]{0x0000000000F80040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_9__2_in_rule__PeriodicActivity__Group_9__13982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__FrequencyAssignment_9_1_in_rule__PeriodicActivity__Group_9__1__Impl4009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_9__2__Impl_in_rule__PeriodicActivity__Group_9__24040 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_9__3_in_rule__PeriodicActivity__Group_9__24043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__PeriodicityTypeAssignment_9_2_in_rule__PeriodicActivity__Group_9__2__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_9__3__Impl_in_rule__PeriodicActivity__Group_9__34100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__PeriodicActivity__Group_9__3__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__0__Impl_in_rule__PeriodicActivity__Group_10__04167 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__1_in_rule__PeriodicActivity__Group_10__04170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__PeriodicActivity__Group_10__0__Impl4198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__1__Impl_in_rule__PeriodicActivity__Group_10__14229 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__2_in_rule__PeriodicActivity__Group_10__14232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__PeriodicActivity__Group_10__1__Impl4260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__2__Impl_in_rule__PeriodicActivity__Group_10__24291 = new BitSet(new long[]{0x0088000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__3_in_rule__PeriodicActivity__Group_10__24294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_10_2_in_rule__PeriodicActivity__Group_10__2__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__3__Impl_in_rule__PeriodicActivity__Group_10__34351 = new BitSet(new long[]{0x0088000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__4_in_rule__PeriodicActivity__Group_10__34354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10_3__0_in_rule__PeriodicActivity__Group_10__3__Impl4381 = new BitSet(new long[]{0x0080000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__4__Impl_in_rule__PeriodicActivity__Group_10__44412 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__5_in_rule__PeriodicActivity__Group_10__44415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__PeriodicActivity__Group_10__4__Impl4443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__5__Impl_in_rule__PeriodicActivity__Group_10__54474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__PeriodicActivity__Group_10__5__Impl4502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10_3__0__Impl_in_rule__PeriodicActivity__Group_10_3__04545 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10_3__1_in_rule__PeriodicActivity__Group_10_3__04548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__PeriodicActivity__Group_10_3__0__Impl4576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10_3__1__Impl_in_rule__PeriodicActivity__Group_10_3__14607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_10_3_1_in_rule__PeriodicActivity__Group_10_3__1__Impl4634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__0__Impl_in_rule__PeriodicActivity__Group_11__04668 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__1_in_rule__PeriodicActivity__Group_11__04671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__PeriodicActivity__Group_11__0__Impl4699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__1__Impl_in_rule__PeriodicActivity__Group_11__14730 = new BitSet(new long[]{0xC00000000007F840L,0x00000000000002A4L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__2_in_rule__PeriodicActivity__Group_11__14733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__PeriodicActivity__Group_11__1__Impl4761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__2__Impl_in_rule__PeriodicActivity__Group_11__24792 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__3_in_rule__PeriodicActivity__Group_11__24795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__RuleAssignment_11_2_in_rule__PeriodicActivity__Group_11__2__Impl4822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__3__Impl_in_rule__PeriodicActivity__Group_11__34852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__PeriodicActivity__Group_11__3__Impl4880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__04919 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__04922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__14980 = new BitSet(new long[]{0x0000000FFF000000L});
        public static final BitSet FOLLOW_rule__Date__Group__2_in_rule__Date__Group__14983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl5010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__25040 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__Date__Group__3_in_rule__Date__Group__25043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__MonthAssignment_2_in_rule__Date__Group__2__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__35100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__YearAssignment_3_in_rule__Date__Group__3__Impl5127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__0__Impl_in_rule__ResAllocation__Group__05165 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__1_in_rule__ResAllocation__Group__05168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__1__Impl_in_rule__ResAllocation__Group__15226 = new BitSet(new long[]{0x0001800000000000L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__2_in_rule__ResAllocation__Group__15229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__ResAllocation__Group__1__Impl5257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__2__Impl_in_rule__ResAllocation__Group__25288 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__3_in_rule__ResAllocation__Group__25291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__RessourceTypeAssignment_2_in_rule__ResAllocation__Group__2__Impl5318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__3__Impl_in_rule__ResAllocation__Group__35348 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__4_in_rule__ResAllocation__Group__35351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__ResAllocation__Group__3__Impl5379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__4__Impl_in_rule__ResAllocation__Group__45410 = new BitSet(new long[]{0x0000000000F80040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__5_in_rule__ResAllocation__Group__45413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__DurationAssignment_4_in_rule__ResAllocation__Group__4__Impl5440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__5__Impl_in_rule__ResAllocation__Group__55470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__PeriodicityTypeAssignment_5_in_rule__ResAllocation__Group__5__Impl5497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0__0__Impl_in_rule__Predicate__Group_0__05539 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0__1_in_rule__Predicate__Group_0__05542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0__1__Impl_in_rule__Predicate__Group_0__15600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0_1__0_in_rule__Predicate__Group_0__1__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0_1__0__Impl_in_rule__Predicate__Group_0_1__05661 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0_1__1_in_rule__Predicate__Group_0_1__05664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__Predicate__Group_0_1__0__Impl5692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0_1__1__Impl_in_rule__Predicate__Group_0_1__15723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__DateAssignment_0_1_1_in_rule__Predicate__Group_0_1__1__Impl5750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group__0__Impl_in_rule__BinaryExppression__Group__05784 = new BitSet(new long[]{0xC00000000007F840L,0x00000000000002A4L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group__1_in_rule__BinaryExppression__Group__05787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group__1__Impl_in_rule__BinaryExppression__Group__15845 = new BitSet(new long[]{0x00001C0000000000L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group__2_in_rule__BinaryExppression__Group__15848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Alternatives_1_in_rule__BinaryExppression__Group__1__Impl5875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group__2__Impl_in_rule__BinaryExppression__Group__25905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_2__0_in_rule__BinaryExppression__Group__2__Impl5932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_1_1__0__Impl_in_rule__BinaryExppression__Group_1_1__05969 = new BitSet(new long[]{0xC00000000007F840L,0x00000000000002A4L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_1_1__1_in_rule__BinaryExppression__Group_1_1__05972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__BinaryExppression__Group_1_1__0__Impl6000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_1_1__1__Impl_in_rule__BinaryExppression__Group_1_1__16031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_1_1__2_in_rule__BinaryExppression__Group_1_1__16034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__LeftAssignment_1_1_1_in_rule__BinaryExppression__Group_1_1__1__Impl6061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_1_1__2__Impl_in_rule__BinaryExppression__Group_1_1__26091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__BinaryExppression__Group_1_1__2__Impl6119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_2__0__Impl_in_rule__BinaryExppression__Group_2__06156 = new BitSet(new long[]{0xC00000000007F840L,0x00000000000002A4L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_2__1_in_rule__BinaryExppression__Group_2__06159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__OpeAssignment_2_0_in_rule__BinaryExppression__Group_2__0__Impl6186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_2__1__Impl_in_rule__BinaryExppression__Group_2__16216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__RightAssignment_2_1_in_rule__BinaryExppression__Group_2__1__Impl6243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__Group__0__Impl_in_rule__Temperature__Group__06277 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Temperature__Group__1_in_rule__Temperature__Group__06280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__Group__1__Impl_in_rule__Temperature__Group__16338 = new BitSet(new long[]{0x000003F000000000L});
        public static final BitSet FOLLOW_rule__Temperature__Group__2_in_rule__Temperature__Group__16341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__Alternatives_1_in_rule__Temperature__Group__1__Impl6368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__Group__2__Impl_in_rule__Temperature__Group__26398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__Group__3_in_rule__Temperature__Group__26401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__ComparatorAssignment_2_in_rule__Temperature__Group__2__Impl6428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__Group__3__Impl_in_rule__Temperature__Group__36458 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Temperature__Group__4_in_rule__Temperature__Group__36461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__Temperature__Group__3__Impl6489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__Group__4__Impl_in_rule__Temperature__Group__46520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__ValueAssignment_4_in_rule__Temperature__Group__4__Impl6547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__0__Impl_in_rule__Precipitation__Group__06587 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__1_in_rule__Precipitation__Group__06590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__1__Impl_in_rule__Precipitation__Group__16648 = new BitSet(new long[]{0x000003F000000000L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__2_in_rule__Precipitation__Group__16651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__Alternatives_1_in_rule__Precipitation__Group__1__Impl6678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__2__Impl_in_rule__Precipitation__Group__26708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__3_in_rule__Precipitation__Group__26711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__ComparatorAssignment_2_in_rule__Precipitation__Group__2__Impl6738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__3__Impl_in_rule__Precipitation__Group__36768 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__4_in_rule__Precipitation__Group__36771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__Precipitation__Group__3__Impl6799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__4__Impl_in_rule__Precipitation__Group__46830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__HeightAssignment_4_in_rule__Precipitation__Group__4__Impl6857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__0__Impl_in_rule__Rayonnement__Group__06897 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__1_in_rule__Rayonnement__Group__06900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__1__Impl_in_rule__Rayonnement__Group__16958 = new BitSet(new long[]{0x000003F000000000L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__2_in_rule__Rayonnement__Group__16961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__Alternatives_1_in_rule__Rayonnement__Group__1__Impl6988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__2__Impl_in_rule__Rayonnement__Group__27018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__3_in_rule__Rayonnement__Group__27021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__ComparatorAssignment_2_in_rule__Rayonnement__Group__2__Impl7048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__3__Impl_in_rule__Rayonnement__Group__37078 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__4_in_rule__Rayonnement__Group__37081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__Rayonnement__Group__3__Impl7109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__4__Impl_in_rule__Rayonnement__Group__47140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__ValueAssignment_4_in_rule__Rayonnement__Group__4__Impl7167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__0__Impl_in_rule__Evapotranspiration__Group__07207 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__1_in_rule__Evapotranspiration__Group__07210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__1__Impl_in_rule__Evapotranspiration__Group__17268 = new BitSet(new long[]{0x000003F000000000L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__2_in_rule__Evapotranspiration__Group__17271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Alternatives_1_in_rule__Evapotranspiration__Group__1__Impl7298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__2__Impl_in_rule__Evapotranspiration__Group__27328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__3_in_rule__Evapotranspiration__Group__27331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__ComparatorAssignment_2_in_rule__Evapotranspiration__Group__2__Impl7358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__3__Impl_in_rule__Evapotranspiration__Group__37388 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__4_in_rule__Evapotranspiration__Group__37391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__Evapotranspiration__Group__3__Impl7419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__4__Impl_in_rule__Evapotranspiration__Group__47450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__ValueAssignment_4_in_rule__Evapotranspiration__Group__4__Impl7477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__0__Impl_in_rule__CheckDoneActivity__Group_0__07517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__1_in_rule__CheckDoneActivity__Group_0__07520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__1__Impl_in_rule__CheckDoneActivity__Group_0__17578 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__2_in_rule__CheckDoneActivity__Group_0__17581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rule__CheckDoneActivity__Group_0__1__Impl7609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__2__Impl_in_rule__CheckDoneActivity__Group_0__27640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__3_in_rule__CheckDoneActivity__Group_0__27643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__ActivityToValidateAssignment_0_2_in_rule__CheckDoneActivity__Group_0__2__Impl7670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__3__Impl_in_rule__CheckDoneActivity__Group_0__37700 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__4_in_rule__CheckDoneActivity__Group_0__37703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rule__CheckDoneActivity__Group_0__3__Impl7731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__4__Impl_in_rule__CheckDoneActivity__Group_0__47762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0_4__0_in_rule__CheckDoneActivity__Group_0__4__Impl7789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0_4__0__Impl_in_rule__CheckDoneActivity__Group_0_4__07829 = new BitSet(new long[]{0x0000000000F80040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0_4__1_in_rule__CheckDoneActivity__Group_0_4__07832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0_in_rule__CheckDoneActivity__Group_0_4__0__Impl7859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0_4__1__Impl_in_rule__CheckDoneActivity__Group_0_4__17889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0_4__2_in_rule__CheckDoneActivity__Group_0_4__17892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1_in_rule__CheckDoneActivity__Group_0_4__1__Impl7919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0_4__2__Impl_in_rule__CheckDoneActivity__Group_0_4__27949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_rule__CheckDoneActivity__Group_0_4__2__Impl7977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group__0__Impl_in_rule__NoRain__Group__08014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__NoRain__Group__1_in_rule__NoRain__Group__08017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group__1__Impl_in_rule__NoRain__Group__18075 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_rule__NoRain__Group__2_in_rule__NoRain__Group__18078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__NoRain__Group__1__Impl8106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group__2__Impl_in_rule__NoRain__Group__28137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Alternatives_2_in_rule__NoRain__Group__2__Impl8164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_0__0__Impl_in_rule__NoRain__Group_2_0__08200 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_0__1_in_rule__NoRain__Group_2_0__08203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__NoRain__Group_2_0__0__Impl8231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_0__1__Impl_in_rule__NoRain__Group_2_0__18262 = new BitSet(new long[]{0x0000000000F80040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_0__2_in_rule__NoRain__Group_2_0__18265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__ElapsedTimeAssignment_2_0_1_in_rule__NoRain__Group_2_0__1__Impl8292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_0__2__Impl_in_rule__NoRain__Group_2_0__28322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__PeriodicityTypeAssignment_2_0_2_in_rule__NoRain__Group_2_0__2__Impl8349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_1__0__Impl_in_rule__NoRain__Group_2_1__08385 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_1__1_in_rule__NoRain__Group_2_1__08388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_rule__NoRain__Group_2_1__0__Impl8416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_1__1__Impl_in_rule__NoRain__Group_2_1__18447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__DateAssignment_2_1_1_in_rule__NoRain__Group_2_1__1__Impl8474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GrainState__Group__0__Impl_in_rule__GrainState__Group__08508 = new BitSet(new long[]{0x400000000007F840L,0x00000000000002A4L});
        public static final BitSet FOLLOW_rule__GrainState__Group__1_in_rule__GrainState__Group__08511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GrainState__Group__1__Impl_in_rule__GrainState__Group__18569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_rule__GrainState__Group__2_in_rule__GrainState__Group__18572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_rule__GrainState__Group__1__Impl8600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GrainState__Group__2__Impl_in_rule__GrainState__Group__28631 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_rule__GrainState__Group__3_in_rule__GrainState__Group__28634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_rule__GrainState__Group__2__Impl8662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GrainState__Group__3__Impl_in_rule__GrainState__Group__38693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GrainState__StateAssignment_3_in_rule__GrainState__Group__3__Impl8720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08758 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_rule__EInt__Group__0__Impl8790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__18823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl8850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__08883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__08886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__0__Impl8913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__18942 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__18945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rule__EFloat__Group__1__Impl8973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__29004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__2__Impl9031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtelier_in_rule__Model__AtelierAssignment_19071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Atelier__IdAssignment_29102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicActivity_in_rule__Atelier__ActivityAssignment_49133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeriodicActivity__NameAssignment_29164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__PeriodicActivity__StartAssignment_59195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__PeriodicActivity__EndAssignment_79226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__PeriodicActivity__FrequencyAssignment_9_19257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicity_in_rule__PeriodicActivity__PeriodicityTypeAssignment_9_29288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_10_29319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_10_3_19350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_rule__PeriodicActivity__RuleAssignment_11_29381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Date__DayAssignment_19412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMonth_in_rule__Date__MonthAssignment_29443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Date__YearAssignment_39474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumTypeRessource_in_rule__ResAllocation__RessourceTypeAssignment_29505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ResAllocation__DurationAssignment_49536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicity_in_rule__ResAllocation__PeriodicityTypeAssignment_59567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__Predicate__DateAssignment_0_1_19598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_rule__BinaryExppression__LeftAssignment_1_09629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_rule__BinaryExppression__LeftAssignment_1_1_19660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExppressionType_in_rule__BinaryExppression__OpeAssignment_2_09691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_rule__BinaryExppression__RightAssignment_2_19722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparator_in_rule__Temperature__ComparatorAssignment_29753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__Temperature__ValueAssignment_49784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparator_in_rule__Precipitation__ComparatorAssignment_29815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__Precipitation__HeightAssignment_49846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparator_in_rule__Rayonnement__ComparatorAssignment_29877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__Rayonnement__ValueAssignment_49908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparator_in_rule__Evapotranspiration__ComparatorAssignment_29939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__Evapotranspiration__ValueAssignment_49970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__CheckDoneActivity__ActivityToValidateAssignment_0_210005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_010040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicity_in_rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_110071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__CheckDoneActivity__DateAssignment_110102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__NoRain__ElapsedTimeAssignment_2_0_110133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicity_in_rule__NoRain__PeriodicityTypeAssignment_2_0_210164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__NoRain__DateAssignment_2_1_110195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrainStateEnum_in_rule__GrainState__StateAssignment_310226 = new BitSet(new long[]{0x0000000000000002L});
    }


}
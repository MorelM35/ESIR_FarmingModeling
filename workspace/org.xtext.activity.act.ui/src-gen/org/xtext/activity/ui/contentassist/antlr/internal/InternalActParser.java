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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'tm'", "'temperature'", "'rr'", "'precipitation'", "'par'", "'rayonnement'", "'etp'", "'evapotranspiration'", "'months'", "'days'", "'weeks'", "'years'", "'hours'", "'january'", "'february'", "'march'", "'april'", "'may'", "'june'", "'july'", "'august'", "'september'", "'october'", "'november'", "'december'", "'inferior'", "'inferiorOrEqual'", "'equal'", "'different'", "'superior'", "'superiorOrEqual'", "'AND'", "'OR'", "'XOR'", "'MATURE'", "'IMMATURE'", "'culture'", "'{'", "'}'", "'PeriodicActivity'", "'from'", "'to'", "','", "'workshop'", "'every'", "'allocate'", "'rules'", "':'", "'reserve'", "'for'", "'before'", "'('", "')'", "'than'", "'activity'", "'done'", "'ago'", "'noRain'", "'since'", "'grain'", "'is'", "'Elevage'", "'Culture'", "'Atelier'", "'-'", "'.'"
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
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:116:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:117:1: ( ruleDate EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:118:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate181);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate188); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:125:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:129:2: ( ( ( rule__Date__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:130:1: ( ( rule__Date__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:130:1: ( ( rule__Date__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:131:1: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:132:1: ( rule__Date__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:132:2: rule__Date__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0_in_ruleDate214);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:144:1: entryRuleResAllocation : ruleResAllocation EOF ;
    public final void entryRuleResAllocation() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:145:1: ( ruleResAllocation EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:146:1: ruleResAllocation EOF
            {
             before(grammarAccess.getResAllocationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_entryRuleResAllocation241);
            ruleResAllocation();

            state._fsp--;

             after(grammarAccess.getResAllocationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResAllocation248); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:153:1: ruleResAllocation : ( ( rule__ResAllocation__Group__0 ) ) ;
    public final void ruleResAllocation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:157:2: ( ( ( rule__ResAllocation__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:158:1: ( ( rule__ResAllocation__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:158:1: ( ( rule__ResAllocation__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:159:1: ( rule__ResAllocation__Group__0 )
            {
             before(grammarAccess.getResAllocationAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:160:1: ( rule__ResAllocation__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:160:2: rule__ResAllocation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__0_in_ruleResAllocation274);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:172:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:173:1: ( rulePredicate EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:174:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_entryRulePredicate301);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicate308); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:181:1: rulePredicate : ( ( rule__Predicate__Alternatives ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:185:2: ( ( ( rule__Predicate__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:186:1: ( ( rule__Predicate__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:186:1: ( ( rule__Predicate__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:187:1: ( rule__Predicate__Alternatives )
            {
             before(grammarAccess.getPredicateAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:188:1: ( rule__Predicate__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:188:2: rule__Predicate__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Alternatives_in_rulePredicate334);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:200:1: entryRuleBinaryExppression : ruleBinaryExppression EOF ;
    public final void entryRuleBinaryExppression() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:201:1: ( ruleBinaryExppression EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:202:1: ruleBinaryExppression EOF
            {
             before(grammarAccess.getBinaryExppressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_entryRuleBinaryExppression361);
            ruleBinaryExppression();

            state._fsp--;

             after(grammarAccess.getBinaryExppressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryExppression368); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:209:1: ruleBinaryExppression : ( ( rule__BinaryExppression__Group__0 ) ) ;
    public final void ruleBinaryExppression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:213:2: ( ( ( rule__BinaryExppression__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:214:1: ( ( rule__BinaryExppression__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:214:1: ( ( rule__BinaryExppression__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:215:1: ( rule__BinaryExppression__Group__0 )
            {
             before(grammarAccess.getBinaryExppressionAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:216:1: ( rule__BinaryExppression__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:216:2: rule__BinaryExppression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group__0_in_ruleBinaryExppression394);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:228:1: entryRuleTemperature : ruleTemperature EOF ;
    public final void entryRuleTemperature() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:229:1: ( ruleTemperature EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:230:1: ruleTemperature EOF
            {
             before(grammarAccess.getTemperatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemperature_in_entryRuleTemperature421);
            ruleTemperature();

            state._fsp--;

             after(grammarAccess.getTemperatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemperature428); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:237:1: ruleTemperature : ( ( rule__Temperature__Group__0 ) ) ;
    public final void ruleTemperature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:241:2: ( ( ( rule__Temperature__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:242:1: ( ( rule__Temperature__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:242:1: ( ( rule__Temperature__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:243:1: ( rule__Temperature__Group__0 )
            {
             before(grammarAccess.getTemperatureAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:244:1: ( rule__Temperature__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:244:2: rule__Temperature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__0_in_ruleTemperature454);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:256:1: entryRulePrecipitation : rulePrecipitation EOF ;
    public final void entryRulePrecipitation() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:257:1: ( rulePrecipitation EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:258:1: rulePrecipitation EOF
            {
             before(grammarAccess.getPrecipitationRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrecipitation_in_entryRulePrecipitation481);
            rulePrecipitation();

            state._fsp--;

             after(grammarAccess.getPrecipitationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrecipitation488); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:265:1: rulePrecipitation : ( ( rule__Precipitation__Group__0 ) ) ;
    public final void rulePrecipitation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:269:2: ( ( ( rule__Precipitation__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:270:1: ( ( rule__Precipitation__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:270:1: ( ( rule__Precipitation__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:271:1: ( rule__Precipitation__Group__0 )
            {
             before(grammarAccess.getPrecipitationAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:272:1: ( rule__Precipitation__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:272:2: rule__Precipitation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__0_in_rulePrecipitation514);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:284:1: entryRuleRayonnement : ruleRayonnement EOF ;
    public final void entryRuleRayonnement() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:285:1: ( ruleRayonnement EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:286:1: ruleRayonnement EOF
            {
             before(grammarAccess.getRayonnementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRayonnement_in_entryRuleRayonnement541);
            ruleRayonnement();

            state._fsp--;

             after(grammarAccess.getRayonnementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRayonnement548); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:293:1: ruleRayonnement : ( ( rule__Rayonnement__Group__0 ) ) ;
    public final void ruleRayonnement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:297:2: ( ( ( rule__Rayonnement__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:298:1: ( ( rule__Rayonnement__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:298:1: ( ( rule__Rayonnement__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:299:1: ( rule__Rayonnement__Group__0 )
            {
             before(grammarAccess.getRayonnementAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:300:1: ( rule__Rayonnement__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:300:2: rule__Rayonnement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__0_in_ruleRayonnement574);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:312:1: entryRuleEvapotranspiration : ruleEvapotranspiration EOF ;
    public final void entryRuleEvapotranspiration() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:313:1: ( ruleEvapotranspiration EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:314:1: ruleEvapotranspiration EOF
            {
             before(grammarAccess.getEvapotranspirationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvapotranspiration_in_entryRuleEvapotranspiration601);
            ruleEvapotranspiration();

            state._fsp--;

             after(grammarAccess.getEvapotranspirationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvapotranspiration608); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:321:1: ruleEvapotranspiration : ( ( rule__Evapotranspiration__Group__0 ) ) ;
    public final void ruleEvapotranspiration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:325:2: ( ( ( rule__Evapotranspiration__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:326:1: ( ( rule__Evapotranspiration__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:326:1: ( ( rule__Evapotranspiration__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:327:1: ( rule__Evapotranspiration__Group__0 )
            {
             before(grammarAccess.getEvapotranspirationAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:328:1: ( rule__Evapotranspiration__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:328:2: rule__Evapotranspiration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__0_in_ruleEvapotranspiration634);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:340:1: entryRuleCheckDoneActivity : ruleCheckDoneActivity EOF ;
    public final void entryRuleCheckDoneActivity() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:341:1: ( ruleCheckDoneActivity EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:342:1: ruleCheckDoneActivity EOF
            {
             before(grammarAccess.getCheckDoneActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCheckDoneActivity_in_entryRuleCheckDoneActivity661);
            ruleCheckDoneActivity();

            state._fsp--;

             after(grammarAccess.getCheckDoneActivityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCheckDoneActivity668); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:349:1: ruleCheckDoneActivity : ( ( rule__CheckDoneActivity__Alternatives ) ) ;
    public final void ruleCheckDoneActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:353:2: ( ( ( rule__CheckDoneActivity__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:354:1: ( ( rule__CheckDoneActivity__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:354:1: ( ( rule__CheckDoneActivity__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:355:1: ( rule__CheckDoneActivity__Alternatives )
            {
             before(grammarAccess.getCheckDoneActivityAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:356:1: ( rule__CheckDoneActivity__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:356:2: rule__CheckDoneActivity__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Alternatives_in_ruleCheckDoneActivity694);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:368:1: entryRuleNoRain : ruleNoRain EOF ;
    public final void entryRuleNoRain() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:369:1: ( ruleNoRain EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:370:1: ruleNoRain EOF
            {
             before(grammarAccess.getNoRainRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRain_in_entryRuleNoRain721);
            ruleNoRain();

            state._fsp--;

             after(grammarAccess.getNoRainRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoRain728); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:377:1: ruleNoRain : ( ( rule__NoRain__Group__0 ) ) ;
    public final void ruleNoRain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:381:2: ( ( ( rule__NoRain__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:382:1: ( ( rule__NoRain__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:382:1: ( ( rule__NoRain__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:383:1: ( rule__NoRain__Group__0 )
            {
             before(grammarAccess.getNoRainAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:384:1: ( rule__NoRain__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:384:2: rule__NoRain__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group__0_in_ruleNoRain754);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:396:1: entryRuleGrainState : ruleGrainState EOF ;
    public final void entryRuleGrainState() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:397:1: ( ruleGrainState EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:398:1: ruleGrainState EOF
            {
             before(grammarAccess.getGrainStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrainState_in_entryRuleGrainState781);
            ruleGrainState();

            state._fsp--;

             after(grammarAccess.getGrainStateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrainState788); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:405:1: ruleGrainState : ( ( rule__GrainState__Group__0 ) ) ;
    public final void ruleGrainState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:409:2: ( ( ( rule__GrainState__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:410:1: ( ( rule__GrainState__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:410:1: ( ( rule__GrainState__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:411:1: ( rule__GrainState__Group__0 )
            {
             before(grammarAccess.getGrainStateAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:412:1: ( rule__GrainState__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:412:2: rule__GrainState__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__0_in_ruleGrainState814);
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


    // $ANTLR start "entryRuleElevage"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:426:1: entryRuleElevage : ruleElevage EOF ;
    public final void entryRuleElevage() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:427:1: ( ruleElevage EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:428:1: ruleElevage EOF
            {
             before(grammarAccess.getElevageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElevage_in_entryRuleElevage843);
            ruleElevage();

            state._fsp--;

             after(grammarAccess.getElevageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElevage850); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:435:1: ruleElevage : ( ( rule__Elevage__Group__0 ) ) ;
    public final void ruleElevage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:439:2: ( ( ( rule__Elevage__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:440:1: ( ( rule__Elevage__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:440:1: ( ( rule__Elevage__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:441:1: ( rule__Elevage__Group__0 )
            {
             before(grammarAccess.getElevageAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:442:1: ( rule__Elevage__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:442:2: rule__Elevage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__0_in_ruleElevage876);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:454:1: entryRuleCulture : ruleCulture EOF ;
    public final void entryRuleCulture() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:455:1: ( ruleCulture EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:456:1: ruleCulture EOF
            {
             before(grammarAccess.getCultureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCulture_in_entryRuleCulture903);
            ruleCulture();

            state._fsp--;

             after(grammarAccess.getCultureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCulture910); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:463:1: ruleCulture : ( ( rule__Culture__Group__0 ) ) ;
    public final void ruleCulture() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:467:2: ( ( ( rule__Culture__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:468:1: ( ( rule__Culture__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:468:1: ( ( rule__Culture__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:469:1: ( rule__Culture__Group__0 )
            {
             before(grammarAccess.getCultureAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:470:1: ( rule__Culture__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:470:2: rule__Culture__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__0_in_ruleCulture936);
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


    // $ANTLR start "entryRuleAtelier_Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:484:1: entryRuleAtelier_Impl : ruleAtelier_Impl EOF ;
    public final void entryRuleAtelier_Impl() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:485:1: ( ruleAtelier_Impl EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:486:1: ruleAtelier_Impl EOF
            {
             before(grammarAccess.getAtelier_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl965);
            ruleAtelier_Impl();

            state._fsp--;

             after(grammarAccess.getAtelier_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtelier_Impl972); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:493:1: ruleAtelier_Impl : ( ( rule__Atelier_Impl__Group__0 ) ) ;
    public final void ruleAtelier_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:497:2: ( ( ( rule__Atelier_Impl__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:498:1: ( ( rule__Atelier_Impl__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:498:1: ( ( rule__Atelier_Impl__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:499:1: ( rule__Atelier_Impl__Group__0 )
            {
             before(grammarAccess.getAtelier_ImplAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:500:1: ( rule__Atelier_Impl__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:500:2: rule__Atelier_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__0_in_ruleAtelier_Impl998);
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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:512:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:513:1: ( ruleEString EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:514:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1025);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1032); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:521:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:525:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:526:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:526:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:527:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:528:1: ( rule__EString__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:528:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString1058);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:540:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:541:1: ( ruleEInt EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:542:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1085);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1092); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:549:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:553:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:554:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:554:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:555:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:556:1: ( rule__EInt__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:556:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt1118);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:568:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:569:1: ( ruleEFloat EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:570:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat1145);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat1152); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:577:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:581:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:582:1: ( ( rule__EFloat__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:582:1: ( ( rule__EFloat__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:583:1: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:584:1: ( rule__EFloat__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:584:2: rule__EFloat__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0_in_ruleEFloat1178);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:597:1: rulePeriodicity : ( ( rule__Periodicity__Alternatives ) ) ;
    public final void rulePeriodicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:601:1: ( ( ( rule__Periodicity__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:602:1: ( ( rule__Periodicity__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:602:1: ( ( rule__Periodicity__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:603:1: ( rule__Periodicity__Alternatives )
            {
             before(grammarAccess.getPeriodicityAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:604:1: ( rule__Periodicity__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:604:2: rule__Periodicity__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Periodicity__Alternatives_in_rulePeriodicity1215);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:616:1: ruleMonth : ( ( rule__Month__Alternatives ) ) ;
    public final void ruleMonth() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:620:1: ( ( ( rule__Month__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:621:1: ( ( rule__Month__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:621:1: ( ( rule__Month__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:622:1: ( rule__Month__Alternatives )
            {
             before(grammarAccess.getMonthAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:623:1: ( rule__Month__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:623:2: rule__Month__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Month__Alternatives_in_ruleMonth1251);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:635:1: ruleComparator : ( ( rule__Comparator__Alternatives ) ) ;
    public final void ruleComparator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:639:1: ( ( ( rule__Comparator__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:640:1: ( ( rule__Comparator__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:640:1: ( ( rule__Comparator__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:641:1: ( rule__Comparator__Alternatives )
            {
             before(grammarAccess.getComparatorAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:642:1: ( rule__Comparator__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:642:2: rule__Comparator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comparator__Alternatives_in_ruleComparator1287);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:654:1: ruleBinaryExppressionType : ( ( rule__BinaryExppressionType__Alternatives ) ) ;
    public final void ruleBinaryExppressionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:658:1: ( ( ( rule__BinaryExppressionType__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:659:1: ( ( rule__BinaryExppressionType__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:659:1: ( ( rule__BinaryExppressionType__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:660:1: ( rule__BinaryExppressionType__Alternatives )
            {
             before(grammarAccess.getBinaryExppressionTypeAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:661:1: ( rule__BinaryExppressionType__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:661:2: rule__BinaryExppressionType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppressionType__Alternatives_in_ruleBinaryExppressionType1323);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:673:1: ruleGrainStateEnum : ( ( rule__GrainStateEnum__Alternatives ) ) ;
    public final void ruleGrainStateEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:677:1: ( ( ( rule__GrainStateEnum__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:678:1: ( ( rule__GrainStateEnum__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:678:1: ( ( rule__GrainStateEnum__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:679:1: ( rule__GrainStateEnum__Alternatives )
            {
             before(grammarAccess.getGrainStateEnumAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:680:1: ( rule__GrainStateEnum__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:680:2: rule__GrainStateEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__GrainStateEnum__Alternatives_in_ruleGrainStateEnum1359);
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


    // $ANTLR start "rule__Predicate__Alternatives"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:691:1: rule__Predicate__Alternatives : ( ( ( rule__Predicate__Group_0__0 ) ) | ( ruleCheckDoneActivity ) | ( ruleNoRain ) | ( ruleTemperature ) | ( rulePrecipitation ) | ( ruleRayonnement ) | ( ruleEvapotranspiration ) | ( ruleGrainState ) );
    public final void rule__Predicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:695:1: ( ( ( rule__Predicate__Group_0__0 ) ) | ( ruleCheckDoneActivity ) | ( ruleNoRain ) | ( ruleTemperature ) | ( rulePrecipitation ) | ( ruleRayonnement ) | ( ruleEvapotranspiration ) | ( ruleGrainState ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
            case 65:
            case 75:
                {
                alt1=2;
                }
                break;
            case 68:
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
            case 70:
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
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:696:1: ( ( rule__Predicate__Group_0__0 ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:696:1: ( ( rule__Predicate__Group_0__0 ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:697:1: ( rule__Predicate__Group_0__0 )
                    {
                     before(grammarAccess.getPredicateAccess().getGroup_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:698:1: ( rule__Predicate__Group_0__0 )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:698:2: rule__Predicate__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0__0_in_rule__Predicate__Alternatives1394);
                    rule__Predicate__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicateAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:702:6: ( ruleCheckDoneActivity )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:702:6: ( ruleCheckDoneActivity )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:703:1: ruleCheckDoneActivity
                    {
                     before(grammarAccess.getPredicateAccess().getCheckDoneActivityParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCheckDoneActivity_in_rule__Predicate__Alternatives1412);
                    ruleCheckDoneActivity();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getCheckDoneActivityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:708:6: ( ruleNoRain )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:708:6: ( ruleNoRain )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:709:1: ruleNoRain
                    {
                     before(grammarAccess.getPredicateAccess().getNoRainParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNoRain_in_rule__Predicate__Alternatives1429);
                    ruleNoRain();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getNoRainParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:714:6: ( ruleTemperature )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:714:6: ( ruleTemperature )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:715:1: ruleTemperature
                    {
                     before(grammarAccess.getPredicateAccess().getTemperatureParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTemperature_in_rule__Predicate__Alternatives1446);
                    ruleTemperature();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getTemperatureParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:720:6: ( rulePrecipitation )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:720:6: ( rulePrecipitation )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:721:1: rulePrecipitation
                    {
                     before(grammarAccess.getPredicateAccess().getPrecipitationParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_rulePrecipitation_in_rule__Predicate__Alternatives1463);
                    rulePrecipitation();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getPrecipitationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:726:6: ( ruleRayonnement )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:726:6: ( ruleRayonnement )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:727:1: ruleRayonnement
                    {
                     before(grammarAccess.getPredicateAccess().getRayonnementParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRayonnement_in_rule__Predicate__Alternatives1480);
                    ruleRayonnement();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getRayonnementParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:732:6: ( ruleEvapotranspiration )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:732:6: ( ruleEvapotranspiration )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:733:1: ruleEvapotranspiration
                    {
                     before(grammarAccess.getPredicateAccess().getEvapotranspirationParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEvapotranspiration_in_rule__Predicate__Alternatives1497);
                    ruleEvapotranspiration();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getEvapotranspirationParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:738:6: ( ruleGrainState )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:738:6: ( ruleGrainState )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:739:1: ruleGrainState
                    {
                     before(grammarAccess.getPredicateAccess().getGrainStateParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleGrainState_in_rule__Predicate__Alternatives1514);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:749:1: rule__BinaryExppression__Alternatives_1 : ( ( ( rule__BinaryExppression__LeftAssignment_1_0 ) ) | ( ( rule__BinaryExppression__Group_1_1__0 ) ) );
    public final void rule__BinaryExppression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:753:1: ( ( ( rule__BinaryExppression__LeftAssignment_1_0 ) ) | ( ( rule__BinaryExppression__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||(LA2_0>=11 && LA2_0<=18)||LA2_0==61||LA2_0==65||LA2_0==68||LA2_0==70||LA2_0==75) ) {
                alt2=1;
            }
            else if ( (LA2_0==62) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:754:1: ( ( rule__BinaryExppression__LeftAssignment_1_0 ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:754:1: ( ( rule__BinaryExppression__LeftAssignment_1_0 ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:755:1: ( rule__BinaryExppression__LeftAssignment_1_0 )
                    {
                     before(grammarAccess.getBinaryExppressionAccess().getLeftAssignment_1_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:756:1: ( rule__BinaryExppression__LeftAssignment_1_0 )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:756:2: rule__BinaryExppression__LeftAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__LeftAssignment_1_0_in_rule__BinaryExppression__Alternatives_11546);
                    rule__BinaryExppression__LeftAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinaryExppressionAccess().getLeftAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:760:6: ( ( rule__BinaryExppression__Group_1_1__0 ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:760:6: ( ( rule__BinaryExppression__Group_1_1__0 ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:761:1: ( rule__BinaryExppression__Group_1_1__0 )
                    {
                     before(grammarAccess.getBinaryExppressionAccess().getGroup_1_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:762:1: ( rule__BinaryExppression__Group_1_1__0 )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:762:2: rule__BinaryExppression__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_1_1__0_in_rule__BinaryExppression__Alternatives_11564);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:771:1: rule__Temperature__Alternatives_1 : ( ( 'tm' ) | ( 'temperature' ) );
    public final void rule__Temperature__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:775:1: ( ( 'tm' ) | ( 'temperature' ) )
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
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:776:1: ( 'tm' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:776:1: ( 'tm' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:777:1: 'tm'
                    {
                     before(grammarAccess.getTemperatureAccess().getTmKeyword_1_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Temperature__Alternatives_11598); 
                     after(grammarAccess.getTemperatureAccess().getTmKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:784:6: ( 'temperature' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:784:6: ( 'temperature' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:785:1: 'temperature'
                    {
                     before(grammarAccess.getTemperatureAccess().getTemperatureKeyword_1_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Temperature__Alternatives_11618); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:797:1: rule__Precipitation__Alternatives_1 : ( ( 'rr' ) | ( 'precipitation' ) );
    public final void rule__Precipitation__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:801:1: ( ( 'rr' ) | ( 'precipitation' ) )
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
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:802:1: ( 'rr' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:802:1: ( 'rr' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:803:1: 'rr'
                    {
                     before(grammarAccess.getPrecipitationAccess().getRrKeyword_1_0()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Precipitation__Alternatives_11653); 
                     after(grammarAccess.getPrecipitationAccess().getRrKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:810:6: ( 'precipitation' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:810:6: ( 'precipitation' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:811:1: 'precipitation'
                    {
                     before(grammarAccess.getPrecipitationAccess().getPrecipitationKeyword_1_1()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Precipitation__Alternatives_11673); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:823:1: rule__Rayonnement__Alternatives_1 : ( ( 'par' ) | ( 'rayonnement' ) );
    public final void rule__Rayonnement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:827:1: ( ( 'par' ) | ( 'rayonnement' ) )
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
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:828:1: ( 'par' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:828:1: ( 'par' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:829:1: 'par'
                    {
                     before(grammarAccess.getRayonnementAccess().getParKeyword_1_0()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Rayonnement__Alternatives_11708); 
                     after(grammarAccess.getRayonnementAccess().getParKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:836:6: ( 'rayonnement' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:836:6: ( 'rayonnement' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:837:1: 'rayonnement'
                    {
                     before(grammarAccess.getRayonnementAccess().getRayonnementKeyword_1_1()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Rayonnement__Alternatives_11728); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:849:1: rule__Evapotranspiration__Alternatives_1 : ( ( 'etp' ) | ( 'evapotranspiration' ) );
    public final void rule__Evapotranspiration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:853:1: ( ( 'etp' ) | ( 'evapotranspiration' ) )
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
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:854:1: ( 'etp' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:854:1: ( 'etp' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:855:1: 'etp'
                    {
                     before(grammarAccess.getEvapotranspirationAccess().getEtpKeyword_1_0()); 
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__Evapotranspiration__Alternatives_11763); 
                     after(grammarAccess.getEvapotranspirationAccess().getEtpKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:862:6: ( 'evapotranspiration' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:862:6: ( 'evapotranspiration' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:863:1: 'evapotranspiration'
                    {
                     before(grammarAccess.getEvapotranspirationAccess().getEvapotranspirationKeyword_1_1()); 
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Evapotranspiration__Alternatives_11783); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:875:1: rule__CheckDoneActivity__Alternatives : ( ( ( rule__CheckDoneActivity__Group_0__0 ) ) | ( ( rule__CheckDoneActivity__DateAssignment_1 ) ) );
    public final void rule__CheckDoneActivity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:879:1: ( ( ( rule__CheckDoneActivity__Group_0__0 ) ) | ( ( rule__CheckDoneActivity__DateAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==65) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT||LA7_0==75) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:880:1: ( ( rule__CheckDoneActivity__Group_0__0 ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:880:1: ( ( rule__CheckDoneActivity__Group_0__0 ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:881:1: ( rule__CheckDoneActivity__Group_0__0 )
                    {
                     before(grammarAccess.getCheckDoneActivityAccess().getGroup_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:882:1: ( rule__CheckDoneActivity__Group_0__0 )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:882:2: rule__CheckDoneActivity__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__0_in_rule__CheckDoneActivity__Alternatives1817);
                    rule__CheckDoneActivity__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckDoneActivityAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:886:6: ( ( rule__CheckDoneActivity__DateAssignment_1 ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:886:6: ( ( rule__CheckDoneActivity__DateAssignment_1 ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:887:1: ( rule__CheckDoneActivity__DateAssignment_1 )
                    {
                     before(grammarAccess.getCheckDoneActivityAccess().getDateAssignment_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:888:1: ( rule__CheckDoneActivity__DateAssignment_1 )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:888:2: rule__CheckDoneActivity__DateAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__DateAssignment_1_in_rule__CheckDoneActivity__Alternatives1835);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:897:1: rule__NoRain__Alternatives_2 : ( ( ( rule__NoRain__Group_2_0__0 ) ) | ( ( rule__NoRain__Group_2_1__0 ) ) );
    public final void rule__NoRain__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:901:1: ( ( ( rule__NoRain__Group_2_0__0 ) ) | ( ( rule__NoRain__Group_2_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==60) ) {
                alt8=1;
            }
            else if ( (LA8_0==69) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:902:1: ( ( rule__NoRain__Group_2_0__0 ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:902:1: ( ( rule__NoRain__Group_2_0__0 ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:903:1: ( rule__NoRain__Group_2_0__0 )
                    {
                     before(grammarAccess.getNoRainAccess().getGroup_2_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:904:1: ( rule__NoRain__Group_2_0__0 )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:904:2: rule__NoRain__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_0__0_in_rule__NoRain__Alternatives_21868);
                    rule__NoRain__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNoRainAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:908:6: ( ( rule__NoRain__Group_2_1__0 ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:908:6: ( ( rule__NoRain__Group_2_1__0 ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:909:1: ( rule__NoRain__Group_2_1__0 )
                    {
                     before(grammarAccess.getNoRainAccess().getGroup_2_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:910:1: ( rule__NoRain__Group_2_1__0 )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:910:2: rule__NoRain__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_1__0_in_rule__NoRain__Alternatives_21886);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:920:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:924:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:925:1: ( RULE_STRING )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:925:1: ( RULE_STRING )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:926:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1920); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:931:6: ( RULE_ID )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:931:6: ( RULE_ID )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:932:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1937); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:942:1: rule__Periodicity__Alternatives : ( ( ( 'months' ) ) | ( ( 'days' ) ) | ( ( 'weeks' ) ) | ( ( 'years' ) ) | ( ( 'hours' ) ) );
    public final void rule__Periodicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:946:1: ( ( ( 'months' ) ) | ( ( 'days' ) ) | ( ( 'weeks' ) ) | ( ( 'years' ) ) | ( ( 'hours' ) ) )
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
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:947:1: ( ( 'months' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:947:1: ( ( 'months' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:948:1: ( 'months' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getMonthEnumLiteralDeclaration_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:949:1: ( 'months' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:949:3: 'months'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__Periodicity__Alternatives1970); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getMonthEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:954:6: ( ( 'days' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:954:6: ( ( 'days' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:955:1: ( 'days' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:956:1: ( 'days' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:956:3: 'days'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__Periodicity__Alternatives1991); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:961:6: ( ( 'weeks' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:961:6: ( ( 'weeks' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:962:1: ( 'weeks' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:963:1: ( 'weeks' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:963:3: 'weeks'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Periodicity__Alternatives2012); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:968:6: ( ( 'years' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:968:6: ( ( 'years' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:969:1: ( 'years' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:970:1: ( 'years' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:970:3: 'years'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__Periodicity__Alternatives2033); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:975:6: ( ( 'hours' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:975:6: ( ( 'hours' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:976:1: ( 'hours' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getHoursEnumLiteralDeclaration_4()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:977:1: ( 'hours' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:977:3: 'hours'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__Periodicity__Alternatives2054); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:987:1: rule__Month__Alternatives : ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) );
    public final void rule__Month__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:991:1: ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) )
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
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:992:1: ( ( 'january' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:992:1: ( ( 'january' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:993:1: ( 'january' )
                    {
                     before(grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:994:1: ( 'january' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:994:3: 'january'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__Month__Alternatives2090); 

                    }

                     after(grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:999:6: ( ( 'february' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:999:6: ( ( 'february' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1000:1: ( 'february' )
                    {
                     before(grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1001:1: ( 'february' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1001:3: 'february'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__Month__Alternatives2111); 

                    }

                     after(grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1006:6: ( ( 'march' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1006:6: ( ( 'march' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1007:1: ( 'march' )
                    {
                     before(grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1008:1: ( 'march' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1008:3: 'march'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__Month__Alternatives2132); 

                    }

                     after(grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1013:6: ( ( 'april' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1013:6: ( ( 'april' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1014:1: ( 'april' )
                    {
                     before(grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1015:1: ( 'april' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1015:3: 'april'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__Month__Alternatives2153); 

                    }

                     after(grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1020:6: ( ( 'may' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1020:6: ( ( 'may' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1021:1: ( 'may' )
                    {
                     before(grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1022:1: ( 'may' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1022:3: 'may'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__Month__Alternatives2174); 

                    }

                     after(grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1027:6: ( ( 'june' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1027:6: ( ( 'june' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1028:1: ( 'june' )
                    {
                     before(grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1029:1: ( 'june' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1029:3: 'june'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__Month__Alternatives2195); 

                    }

                     after(grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1034:6: ( ( 'july' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1034:6: ( ( 'july' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1035:1: ( 'july' )
                    {
                     before(grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1036:1: ( 'july' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1036:3: 'july'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__Month__Alternatives2216); 

                    }

                     after(grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1041:6: ( ( 'august' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1041:6: ( ( 'august' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1042:1: ( 'august' )
                    {
                     before(grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1043:1: ( 'august' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1043:3: 'august'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__Month__Alternatives2237); 

                    }

                     after(grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1048:6: ( ( 'september' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1048:6: ( ( 'september' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1049:1: ( 'september' )
                    {
                     before(grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1050:1: ( 'september' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1050:3: 'september'
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_rule__Month__Alternatives2258); 

                    }

                     after(grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1055:6: ( ( 'october' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1055:6: ( ( 'october' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1056:1: ( 'october' )
                    {
                     before(grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1057:1: ( 'october' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1057:3: 'october'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__Month__Alternatives2279); 

                    }

                     after(grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1062:6: ( ( 'november' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1062:6: ( ( 'november' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1063:1: ( 'november' )
                    {
                     before(grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1064:1: ( 'november' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1064:3: 'november'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__Month__Alternatives2300); 

                    }

                     after(grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1069:6: ( ( 'december' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1069:6: ( ( 'december' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1070:1: ( 'december' )
                    {
                     before(grammarAccess.getMonthAccess().getDecemberEnumLiteralDeclaration_11()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1071:1: ( 'december' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1071:3: 'december'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__Month__Alternatives2321); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1081:1: rule__Comparator__Alternatives : ( ( ( 'inferior' ) ) | ( ( 'inferiorOrEqual' ) ) | ( ( 'equal' ) ) | ( ( 'different' ) ) | ( ( 'superior' ) ) | ( ( 'superiorOrEqual' ) ) );
    public final void rule__Comparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1085:1: ( ( ( 'inferior' ) ) | ( ( 'inferiorOrEqual' ) ) | ( ( 'equal' ) ) | ( ( 'different' ) ) | ( ( 'superior' ) ) | ( ( 'superiorOrEqual' ) ) )
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
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1086:1: ( ( 'inferior' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1086:1: ( ( 'inferior' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1087:1: ( 'inferior' )
                    {
                     before(grammarAccess.getComparatorAccess().getInferiorEnumLiteralDeclaration_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1088:1: ( 'inferior' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1088:3: 'inferior'
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_rule__Comparator__Alternatives2357); 

                    }

                     after(grammarAccess.getComparatorAccess().getInferiorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1093:6: ( ( 'inferiorOrEqual' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1093:6: ( ( 'inferiorOrEqual' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1094:1: ( 'inferiorOrEqual' )
                    {
                     before(grammarAccess.getComparatorAccess().getInferiorOrEqualEnumLiteralDeclaration_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1095:1: ( 'inferiorOrEqual' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1095:3: 'inferiorOrEqual'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_rule__Comparator__Alternatives2378); 

                    }

                     after(grammarAccess.getComparatorAccess().getInferiorOrEqualEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1100:6: ( ( 'equal' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1100:6: ( ( 'equal' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1101:1: ( 'equal' )
                    {
                     before(grammarAccess.getComparatorAccess().getEqualEnumLiteralDeclaration_2()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1102:1: ( 'equal' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1102:3: 'equal'
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_rule__Comparator__Alternatives2399); 

                    }

                     after(grammarAccess.getComparatorAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1107:6: ( ( 'different' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1107:6: ( ( 'different' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1108:1: ( 'different' )
                    {
                     before(grammarAccess.getComparatorAccess().getDifferentEnumLiteralDeclaration_3()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1109:1: ( 'different' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1109:3: 'different'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_rule__Comparator__Alternatives2420); 

                    }

                     after(grammarAccess.getComparatorAccess().getDifferentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1114:6: ( ( 'superior' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1114:6: ( ( 'superior' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1115:1: ( 'superior' )
                    {
                     before(grammarAccess.getComparatorAccess().getSuperiorEnumLiteralDeclaration_4()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1116:1: ( 'superior' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1116:3: 'superior'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_rule__Comparator__Alternatives2441); 

                    }

                     after(grammarAccess.getComparatorAccess().getSuperiorEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1121:6: ( ( 'superiorOrEqual' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1121:6: ( ( 'superiorOrEqual' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1122:1: ( 'superiorOrEqual' )
                    {
                     before(grammarAccess.getComparatorAccess().getSuperiorOrEqualEnumLiteralDeclaration_5()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1123:1: ( 'superiorOrEqual' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1123:3: 'superiorOrEqual'
                    {
                    match(input,41,FollowSets000.FOLLOW_41_in_rule__Comparator__Alternatives2462); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1133:1: rule__BinaryExppressionType__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'XOR' ) ) );
    public final void rule__BinaryExppressionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1137:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'XOR' ) ) )
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
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1138:1: ( ( 'AND' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1138:1: ( ( 'AND' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1139:1: ( 'AND' )
                    {
                     before(grammarAccess.getBinaryExppressionTypeAccess().getANDEnumLiteralDeclaration_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1140:1: ( 'AND' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1140:3: 'AND'
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_rule__BinaryExppressionType__Alternatives2498); 

                    }

                     after(grammarAccess.getBinaryExppressionTypeAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1145:6: ( ( 'OR' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1145:6: ( ( 'OR' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1146:1: ( 'OR' )
                    {
                     before(grammarAccess.getBinaryExppressionTypeAccess().getOREnumLiteralDeclaration_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1147:1: ( 'OR' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1147:3: 'OR'
                    {
                    match(input,43,FollowSets000.FOLLOW_43_in_rule__BinaryExppressionType__Alternatives2519); 

                    }

                     after(grammarAccess.getBinaryExppressionTypeAccess().getOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1152:6: ( ( 'XOR' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1152:6: ( ( 'XOR' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1153:1: ( 'XOR' )
                    {
                     before(grammarAccess.getBinaryExppressionTypeAccess().getXOREnumLiteralDeclaration_2()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1154:1: ( 'XOR' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1154:3: 'XOR'
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_rule__BinaryExppressionType__Alternatives2540); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1164:1: rule__GrainStateEnum__Alternatives : ( ( ( 'MATURE' ) ) | ( ( 'IMMATURE' ) ) );
    public final void rule__GrainStateEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1168:1: ( ( ( 'MATURE' ) ) | ( ( 'IMMATURE' ) ) )
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
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1169:1: ( ( 'MATURE' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1169:1: ( ( 'MATURE' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1170:1: ( 'MATURE' )
                    {
                     before(grammarAccess.getGrainStateEnumAccess().getMATUREEnumLiteralDeclaration_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1171:1: ( 'MATURE' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1171:3: 'MATURE'
                    {
                    match(input,45,FollowSets000.FOLLOW_45_in_rule__GrainStateEnum__Alternatives2576); 

                    }

                     after(grammarAccess.getGrainStateEnumAccess().getMATUREEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1176:6: ( ( 'IMMATURE' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1176:6: ( ( 'IMMATURE' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1177:1: ( 'IMMATURE' )
                    {
                     before(grammarAccess.getGrainStateEnumAccess().getIMMATUREEnumLiteralDeclaration_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1178:1: ( 'IMMATURE' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1178:3: 'IMMATURE'
                    {
                    match(input,46,FollowSets000.FOLLOW_46_in_rule__GrainStateEnum__Alternatives2597); 

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


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1190:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1194:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1195:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02630);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02633);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1202:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1206:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1207:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1207:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1208:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1209:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1211:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1221:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1225:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1226:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12691);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12694);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1233:1: rule__Model__Group__1__Impl : ( 'culture' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1237:1: ( ( 'culture' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1238:1: ( 'culture' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1238:1: ( 'culture' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1239:1: 'culture'
            {
             before(grammarAccess.getModelAccess().getCultureKeyword_1()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Model__Group__1__Impl2722); 
             after(grammarAccess.getModelAccess().getCultureKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1252:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1256:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1257:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22753);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22756);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1264:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1268:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1269:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1269:1: ( ( rule__Model__NameAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1270:1: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1271:1: ( rule__Model__NameAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1271:2: rule__Model__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl2783);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1281:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1285:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1286:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32813);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32816);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1293:1: rule__Model__Group__3__Impl : ( '{' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1297:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1298:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1298:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1299:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Model__Group__3__Impl2844); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1312:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1316:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1317:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42875);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42878);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1324:1: rule__Model__Group__4__Impl : ( ( rule__Model__ActivityAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1328:1: ( ( ( rule__Model__ActivityAssignment_4 )* ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1329:1: ( ( rule__Model__ActivityAssignment_4 )* )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1329:1: ( ( rule__Model__ActivityAssignment_4 )* )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1330:1: ( rule__Model__ActivityAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getActivityAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1331:1: ( rule__Model__ActivityAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==50) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1331:2: rule__Model__ActivityAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__ActivityAssignment_4_in_rule__Model__Group__4__Impl2905);
            	    rule__Model__ActivityAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1341:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1345:1: ( rule__Model__Group__5__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1346:2: rule__Model__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52936);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1352:1: rule__Model__Group__5__Impl : ( '}' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1356:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1357:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1357:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1358:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Model__Group__5__Impl2964); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1383:1: rule__PeriodicActivity__Group__0 : rule__PeriodicActivity__Group__0__Impl rule__PeriodicActivity__Group__1 ;
    public final void rule__PeriodicActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1387:1: ( rule__PeriodicActivity__Group__0__Impl rule__PeriodicActivity__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1388:2: rule__PeriodicActivity__Group__0__Impl rule__PeriodicActivity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__0__Impl_in_rule__PeriodicActivity__Group__03007);
            rule__PeriodicActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__1_in_rule__PeriodicActivity__Group__03010);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1395:1: rule__PeriodicActivity__Group__0__Impl : ( () ) ;
    public final void rule__PeriodicActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1399:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1400:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1400:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1401:1: ()
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicActivityAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1402:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1404:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1414:1: rule__PeriodicActivity__Group__1 : rule__PeriodicActivity__Group__1__Impl rule__PeriodicActivity__Group__2 ;
    public final void rule__PeriodicActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1418:1: ( rule__PeriodicActivity__Group__1__Impl rule__PeriodicActivity__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1419:2: rule__PeriodicActivity__Group__1__Impl rule__PeriodicActivity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__1__Impl_in_rule__PeriodicActivity__Group__13068);
            rule__PeriodicActivity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__2_in_rule__PeriodicActivity__Group__13071);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1426:1: rule__PeriodicActivity__Group__1__Impl : ( 'PeriodicActivity' ) ;
    public final void rule__PeriodicActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1430:1: ( ( 'PeriodicActivity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1431:1: ( 'PeriodicActivity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1431:1: ( 'PeriodicActivity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1432:1: 'PeriodicActivity'
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicActivityKeyword_1()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__PeriodicActivity__Group__1__Impl3099); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1445:1: rule__PeriodicActivity__Group__2 : rule__PeriodicActivity__Group__2__Impl rule__PeriodicActivity__Group__3 ;
    public final void rule__PeriodicActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1449:1: ( rule__PeriodicActivity__Group__2__Impl rule__PeriodicActivity__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1450:2: rule__PeriodicActivity__Group__2__Impl rule__PeriodicActivity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__2__Impl_in_rule__PeriodicActivity__Group__23130);
            rule__PeriodicActivity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__3_in_rule__PeriodicActivity__Group__23133);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1457:1: rule__PeriodicActivity__Group__2__Impl : ( ( rule__PeriodicActivity__NameAssignment_2 ) ) ;
    public final void rule__PeriodicActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1461:1: ( ( ( rule__PeriodicActivity__NameAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1462:1: ( ( rule__PeriodicActivity__NameAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1462:1: ( ( rule__PeriodicActivity__NameAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1463:1: ( rule__PeriodicActivity__NameAssignment_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getNameAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1464:1: ( rule__PeriodicActivity__NameAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1464:2: rule__PeriodicActivity__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__NameAssignment_2_in_rule__PeriodicActivity__Group__2__Impl3160);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1474:1: rule__PeriodicActivity__Group__3 : rule__PeriodicActivity__Group__3__Impl rule__PeriodicActivity__Group__4 ;
    public final void rule__PeriodicActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1478:1: ( rule__PeriodicActivity__Group__3__Impl rule__PeriodicActivity__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1479:2: rule__PeriodicActivity__Group__3__Impl rule__PeriodicActivity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__3__Impl_in_rule__PeriodicActivity__Group__33190);
            rule__PeriodicActivity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__4_in_rule__PeriodicActivity__Group__33193);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1486:1: rule__PeriodicActivity__Group__3__Impl : ( '{' ) ;
    public final void rule__PeriodicActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1490:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1491:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1491:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1492:1: '{'
            {
             before(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__PeriodicActivity__Group__3__Impl3221); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1505:1: rule__PeriodicActivity__Group__4 : rule__PeriodicActivity__Group__4__Impl rule__PeriodicActivity__Group__5 ;
    public final void rule__PeriodicActivity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1509:1: ( rule__PeriodicActivity__Group__4__Impl rule__PeriodicActivity__Group__5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1510:2: rule__PeriodicActivity__Group__4__Impl rule__PeriodicActivity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__4__Impl_in_rule__PeriodicActivity__Group__43252);
            rule__PeriodicActivity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__5_in_rule__PeriodicActivity__Group__43255);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1517:1: rule__PeriodicActivity__Group__4__Impl : ( ( rule__PeriodicActivity__Group_4__0 )? ) ;
    public final void rule__PeriodicActivity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1521:1: ( ( ( rule__PeriodicActivity__Group_4__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1522:1: ( ( rule__PeriodicActivity__Group_4__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1522:1: ( ( rule__PeriodicActivity__Group_4__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1523:1: ( rule__PeriodicActivity__Group_4__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1524:1: ( rule__PeriodicActivity__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==54) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1524:2: rule__PeriodicActivity__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__0_in_rule__PeriodicActivity__Group__4__Impl3282);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1534:1: rule__PeriodicActivity__Group__5 : rule__PeriodicActivity__Group__5__Impl rule__PeriodicActivity__Group__6 ;
    public final void rule__PeriodicActivity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1538:1: ( rule__PeriodicActivity__Group__5__Impl rule__PeriodicActivity__Group__6 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1539:2: rule__PeriodicActivity__Group__5__Impl rule__PeriodicActivity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__5__Impl_in_rule__PeriodicActivity__Group__53313);
            rule__PeriodicActivity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__6_in_rule__PeriodicActivity__Group__53316);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1546:1: rule__PeriodicActivity__Group__5__Impl : ( 'from' ) ;
    public final void rule__PeriodicActivity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1550:1: ( ( 'from' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1551:1: ( 'from' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1551:1: ( 'from' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1552:1: 'from'
            {
             before(grammarAccess.getPeriodicActivityAccess().getFromKeyword_5()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__PeriodicActivity__Group__5__Impl3344); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1565:1: rule__PeriodicActivity__Group__6 : rule__PeriodicActivity__Group__6__Impl rule__PeriodicActivity__Group__7 ;
    public final void rule__PeriodicActivity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1569:1: ( rule__PeriodicActivity__Group__6__Impl rule__PeriodicActivity__Group__7 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1570:2: rule__PeriodicActivity__Group__6__Impl rule__PeriodicActivity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__6__Impl_in_rule__PeriodicActivity__Group__63375);
            rule__PeriodicActivity__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__7_in_rule__PeriodicActivity__Group__63378);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1577:1: rule__PeriodicActivity__Group__6__Impl : ( ( rule__PeriodicActivity__StartAssignment_6 ) ) ;
    public final void rule__PeriodicActivity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1581:1: ( ( ( rule__PeriodicActivity__StartAssignment_6 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1582:1: ( ( rule__PeriodicActivity__StartAssignment_6 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1582:1: ( ( rule__PeriodicActivity__StartAssignment_6 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1583:1: ( rule__PeriodicActivity__StartAssignment_6 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getStartAssignment_6()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1584:1: ( rule__PeriodicActivity__StartAssignment_6 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1584:2: rule__PeriodicActivity__StartAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__StartAssignment_6_in_rule__PeriodicActivity__Group__6__Impl3405);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1594:1: rule__PeriodicActivity__Group__7 : rule__PeriodicActivity__Group__7__Impl rule__PeriodicActivity__Group__8 ;
    public final void rule__PeriodicActivity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1598:1: ( rule__PeriodicActivity__Group__7__Impl rule__PeriodicActivity__Group__8 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1599:2: rule__PeriodicActivity__Group__7__Impl rule__PeriodicActivity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__7__Impl_in_rule__PeriodicActivity__Group__73435);
            rule__PeriodicActivity__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__8_in_rule__PeriodicActivity__Group__73438);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1606:1: rule__PeriodicActivity__Group__7__Impl : ( 'to' ) ;
    public final void rule__PeriodicActivity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1610:1: ( ( 'to' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1611:1: ( 'to' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1611:1: ( 'to' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1612:1: 'to'
            {
             before(grammarAccess.getPeriodicActivityAccess().getToKeyword_7()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__PeriodicActivity__Group__7__Impl3466); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1625:1: rule__PeriodicActivity__Group__8 : rule__PeriodicActivity__Group__8__Impl rule__PeriodicActivity__Group__9 ;
    public final void rule__PeriodicActivity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1629:1: ( rule__PeriodicActivity__Group__8__Impl rule__PeriodicActivity__Group__9 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1630:2: rule__PeriodicActivity__Group__8__Impl rule__PeriodicActivity__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__8__Impl_in_rule__PeriodicActivity__Group__83497);
            rule__PeriodicActivity__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__9_in_rule__PeriodicActivity__Group__83500);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1637:1: rule__PeriodicActivity__Group__8__Impl : ( ( rule__PeriodicActivity__EndAssignment_8 ) ) ;
    public final void rule__PeriodicActivity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1641:1: ( ( ( rule__PeriodicActivity__EndAssignment_8 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1642:1: ( ( rule__PeriodicActivity__EndAssignment_8 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1642:1: ( ( rule__PeriodicActivity__EndAssignment_8 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1643:1: ( rule__PeriodicActivity__EndAssignment_8 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getEndAssignment_8()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1644:1: ( rule__PeriodicActivity__EndAssignment_8 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1644:2: rule__PeriodicActivity__EndAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__EndAssignment_8_in_rule__PeriodicActivity__Group__8__Impl3527);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1654:1: rule__PeriodicActivity__Group__9 : rule__PeriodicActivity__Group__9__Impl rule__PeriodicActivity__Group__10 ;
    public final void rule__PeriodicActivity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1658:1: ( rule__PeriodicActivity__Group__9__Impl rule__PeriodicActivity__Group__10 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1659:2: rule__PeriodicActivity__Group__9__Impl rule__PeriodicActivity__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__9__Impl_in_rule__PeriodicActivity__Group__93557);
            rule__PeriodicActivity__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__10_in_rule__PeriodicActivity__Group__93560);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1666:1: rule__PeriodicActivity__Group__9__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1670:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1671:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1671:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1672:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_9()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__PeriodicActivity__Group__9__Impl3588); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1685:1: rule__PeriodicActivity__Group__10 : rule__PeriodicActivity__Group__10__Impl rule__PeriodicActivity__Group__11 ;
    public final void rule__PeriodicActivity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1689:1: ( rule__PeriodicActivity__Group__10__Impl rule__PeriodicActivity__Group__11 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1690:2: rule__PeriodicActivity__Group__10__Impl rule__PeriodicActivity__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__10__Impl_in_rule__PeriodicActivity__Group__103619);
            rule__PeriodicActivity__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__11_in_rule__PeriodicActivity__Group__103622);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1697:1: rule__PeriodicActivity__Group__10__Impl : ( ( rule__PeriodicActivity__Group_10__0 )? ) ;
    public final void rule__PeriodicActivity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1701:1: ( ( ( rule__PeriodicActivity__Group_10__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1702:1: ( ( rule__PeriodicActivity__Group_10__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1702:1: ( ( rule__PeriodicActivity__Group_10__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1703:1: ( rule__PeriodicActivity__Group_10__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_10()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1704:1: ( rule__PeriodicActivity__Group_10__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==55) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1704:2: rule__PeriodicActivity__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__0_in_rule__PeriodicActivity__Group__10__Impl3649);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1714:1: rule__PeriodicActivity__Group__11 : rule__PeriodicActivity__Group__11__Impl rule__PeriodicActivity__Group__12 ;
    public final void rule__PeriodicActivity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1718:1: ( rule__PeriodicActivity__Group__11__Impl rule__PeriodicActivity__Group__12 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1719:2: rule__PeriodicActivity__Group__11__Impl rule__PeriodicActivity__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__11__Impl_in_rule__PeriodicActivity__Group__113680);
            rule__PeriodicActivity__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__12_in_rule__PeriodicActivity__Group__113683);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1726:1: rule__PeriodicActivity__Group__11__Impl : ( ( rule__PeriodicActivity__Group_11__0 )? ) ;
    public final void rule__PeriodicActivity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1730:1: ( ( ( rule__PeriodicActivity__Group_11__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1731:1: ( ( rule__PeriodicActivity__Group_11__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1731:1: ( ( rule__PeriodicActivity__Group_11__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1732:1: ( rule__PeriodicActivity__Group_11__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_11()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1733:1: ( rule__PeriodicActivity__Group_11__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==56) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1733:2: rule__PeriodicActivity__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__0_in_rule__PeriodicActivity__Group__11__Impl3710);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1743:1: rule__PeriodicActivity__Group__12 : rule__PeriodicActivity__Group__12__Impl rule__PeriodicActivity__Group__13 ;
    public final void rule__PeriodicActivity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1747:1: ( rule__PeriodicActivity__Group__12__Impl rule__PeriodicActivity__Group__13 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1748:2: rule__PeriodicActivity__Group__12__Impl rule__PeriodicActivity__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__12__Impl_in_rule__PeriodicActivity__Group__123741);
            rule__PeriodicActivity__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__13_in_rule__PeriodicActivity__Group__123744);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1755:1: rule__PeriodicActivity__Group__12__Impl : ( ( rule__PeriodicActivity__Group_12__0 )? ) ;
    public final void rule__PeriodicActivity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1759:1: ( ( ( rule__PeriodicActivity__Group_12__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1760:1: ( ( rule__PeriodicActivity__Group_12__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1760:1: ( ( rule__PeriodicActivity__Group_12__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1761:1: ( rule__PeriodicActivity__Group_12__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_12()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1762:1: ( rule__PeriodicActivity__Group_12__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==57) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1762:2: rule__PeriodicActivity__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__0_in_rule__PeriodicActivity__Group__12__Impl3771);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1772:1: rule__PeriodicActivity__Group__13 : rule__PeriodicActivity__Group__13__Impl ;
    public final void rule__PeriodicActivity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1776:1: ( rule__PeriodicActivity__Group__13__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1777:2: rule__PeriodicActivity__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__13__Impl_in_rule__PeriodicActivity__Group__133802);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1783:1: rule__PeriodicActivity__Group__13__Impl : ( '}' ) ;
    public final void rule__PeriodicActivity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1787:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1788:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1788:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1789:1: '}'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_13()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__PeriodicActivity__Group__13__Impl3830); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1830:1: rule__PeriodicActivity__Group_4__0 : rule__PeriodicActivity__Group_4__0__Impl rule__PeriodicActivity__Group_4__1 ;
    public final void rule__PeriodicActivity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1834:1: ( rule__PeriodicActivity__Group_4__0__Impl rule__PeriodicActivity__Group_4__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1835:2: rule__PeriodicActivity__Group_4__0__Impl rule__PeriodicActivity__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__0__Impl_in_rule__PeriodicActivity__Group_4__03889);
            rule__PeriodicActivity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__1_in_rule__PeriodicActivity__Group_4__03892);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1842:1: rule__PeriodicActivity__Group_4__0__Impl : ( 'workshop' ) ;
    public final void rule__PeriodicActivity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1846:1: ( ( 'workshop' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1847:1: ( 'workshop' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1847:1: ( 'workshop' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1848:1: 'workshop'
            {
             before(grammarAccess.getPeriodicActivityAccess().getWorkshopKeyword_4_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__PeriodicActivity__Group_4__0__Impl3920); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1861:1: rule__PeriodicActivity__Group_4__1 : rule__PeriodicActivity__Group_4__1__Impl rule__PeriodicActivity__Group_4__2 ;
    public final void rule__PeriodicActivity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1865:1: ( rule__PeriodicActivity__Group_4__1__Impl rule__PeriodicActivity__Group_4__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1866:2: rule__PeriodicActivity__Group_4__1__Impl rule__PeriodicActivity__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__1__Impl_in_rule__PeriodicActivity__Group_4__13951);
            rule__PeriodicActivity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__2_in_rule__PeriodicActivity__Group_4__13954);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1873:1: rule__PeriodicActivity__Group_4__1__Impl : ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) ) ;
    public final void rule__PeriodicActivity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1877:1: ( ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1878:1: ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1878:1: ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1879:1: ( rule__PeriodicActivity__AtelierAssignment_4_1 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getAtelierAssignment_4_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1880:1: ( rule__PeriodicActivity__AtelierAssignment_4_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1880:2: rule__PeriodicActivity__AtelierAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__AtelierAssignment_4_1_in_rule__PeriodicActivity__Group_4__1__Impl3981);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1890:1: rule__PeriodicActivity__Group_4__2 : rule__PeriodicActivity__Group_4__2__Impl ;
    public final void rule__PeriodicActivity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1894:1: ( rule__PeriodicActivity__Group_4__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1895:2: rule__PeriodicActivity__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__2__Impl_in_rule__PeriodicActivity__Group_4__24011);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1901:1: rule__PeriodicActivity__Group_4__2__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1905:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1906:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1906:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1907:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_4_2()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__PeriodicActivity__Group_4__2__Impl4039); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1926:1: rule__PeriodicActivity__Group_10__0 : rule__PeriodicActivity__Group_10__0__Impl rule__PeriodicActivity__Group_10__1 ;
    public final void rule__PeriodicActivity__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1930:1: ( rule__PeriodicActivity__Group_10__0__Impl rule__PeriodicActivity__Group_10__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1931:2: rule__PeriodicActivity__Group_10__0__Impl rule__PeriodicActivity__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__0__Impl_in_rule__PeriodicActivity__Group_10__04076);
            rule__PeriodicActivity__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__1_in_rule__PeriodicActivity__Group_10__04079);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1938:1: rule__PeriodicActivity__Group_10__0__Impl : ( 'every' ) ;
    public final void rule__PeriodicActivity__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1942:1: ( ( 'every' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1943:1: ( 'every' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1943:1: ( 'every' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1944:1: 'every'
            {
             before(grammarAccess.getPeriodicActivityAccess().getEveryKeyword_10_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__PeriodicActivity__Group_10__0__Impl4107); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1957:1: rule__PeriodicActivity__Group_10__1 : rule__PeriodicActivity__Group_10__1__Impl rule__PeriodicActivity__Group_10__2 ;
    public final void rule__PeriodicActivity__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1961:1: ( rule__PeriodicActivity__Group_10__1__Impl rule__PeriodicActivity__Group_10__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1962:2: rule__PeriodicActivity__Group_10__1__Impl rule__PeriodicActivity__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__1__Impl_in_rule__PeriodicActivity__Group_10__14138);
            rule__PeriodicActivity__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__2_in_rule__PeriodicActivity__Group_10__14141);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1969:1: rule__PeriodicActivity__Group_10__1__Impl : ( ( rule__PeriodicActivity__FrequencyAssignment_10_1 )? ) ;
    public final void rule__PeriodicActivity__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1973:1: ( ( ( rule__PeriodicActivity__FrequencyAssignment_10_1 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1974:1: ( ( rule__PeriodicActivity__FrequencyAssignment_10_1 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1974:1: ( ( rule__PeriodicActivity__FrequencyAssignment_10_1 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1975:1: ( rule__PeriodicActivity__FrequencyAssignment_10_1 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getFrequencyAssignment_10_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1976:1: ( rule__PeriodicActivity__FrequencyAssignment_10_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT||LA20_0==75) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1976:2: rule__PeriodicActivity__FrequencyAssignment_10_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__FrequencyAssignment_10_1_in_rule__PeriodicActivity__Group_10__1__Impl4168);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1986:1: rule__PeriodicActivity__Group_10__2 : rule__PeriodicActivity__Group_10__2__Impl rule__PeriodicActivity__Group_10__3 ;
    public final void rule__PeriodicActivity__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1990:1: ( rule__PeriodicActivity__Group_10__2__Impl rule__PeriodicActivity__Group_10__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1991:2: rule__PeriodicActivity__Group_10__2__Impl rule__PeriodicActivity__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__2__Impl_in_rule__PeriodicActivity__Group_10__24199);
            rule__PeriodicActivity__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__3_in_rule__PeriodicActivity__Group_10__24202);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1998:1: rule__PeriodicActivity__Group_10__2__Impl : ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_10_2 ) ) ;
    public final void rule__PeriodicActivity__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2002:1: ( ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_10_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2003:1: ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_10_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2003:1: ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_10_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2004:1: ( rule__PeriodicActivity__PeriodicityTypeAssignment_10_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypeAssignment_10_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2005:1: ( rule__PeriodicActivity__PeriodicityTypeAssignment_10_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2005:2: rule__PeriodicActivity__PeriodicityTypeAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__PeriodicityTypeAssignment_10_2_in_rule__PeriodicActivity__Group_10__2__Impl4229);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2015:1: rule__PeriodicActivity__Group_10__3 : rule__PeriodicActivity__Group_10__3__Impl ;
    public final void rule__PeriodicActivity__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2019:1: ( rule__PeriodicActivity__Group_10__3__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2020:2: rule__PeriodicActivity__Group_10__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_10__3__Impl_in_rule__PeriodicActivity__Group_10__34259);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2026:1: rule__PeriodicActivity__Group_10__3__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2030:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2031:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2031:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2032:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_10_3()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__PeriodicActivity__Group_10__3__Impl4287); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2053:1: rule__PeriodicActivity__Group_11__0 : rule__PeriodicActivity__Group_11__0__Impl rule__PeriodicActivity__Group_11__1 ;
    public final void rule__PeriodicActivity__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2057:1: ( rule__PeriodicActivity__Group_11__0__Impl rule__PeriodicActivity__Group_11__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2058:2: rule__PeriodicActivity__Group_11__0__Impl rule__PeriodicActivity__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__0__Impl_in_rule__PeriodicActivity__Group_11__04326);
            rule__PeriodicActivity__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__1_in_rule__PeriodicActivity__Group_11__04329);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2065:1: rule__PeriodicActivity__Group_11__0__Impl : ( 'allocate' ) ;
    public final void rule__PeriodicActivity__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2069:1: ( ( 'allocate' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2070:1: ( 'allocate' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2070:1: ( 'allocate' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2071:1: 'allocate'
            {
             before(grammarAccess.getPeriodicActivityAccess().getAllocateKeyword_11_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__PeriodicActivity__Group_11__0__Impl4357); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2084:1: rule__PeriodicActivity__Group_11__1 : rule__PeriodicActivity__Group_11__1__Impl rule__PeriodicActivity__Group_11__2 ;
    public final void rule__PeriodicActivity__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2088:1: ( rule__PeriodicActivity__Group_11__1__Impl rule__PeriodicActivity__Group_11__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2089:2: rule__PeriodicActivity__Group_11__1__Impl rule__PeriodicActivity__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__1__Impl_in_rule__PeriodicActivity__Group_11__14388);
            rule__PeriodicActivity__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__2_in_rule__PeriodicActivity__Group_11__14391);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2096:1: rule__PeriodicActivity__Group_11__1__Impl : ( '{' ) ;
    public final void rule__PeriodicActivity__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2100:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2101:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2101:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2102:1: '{'
            {
             before(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__PeriodicActivity__Group_11__1__Impl4419); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2115:1: rule__PeriodicActivity__Group_11__2 : rule__PeriodicActivity__Group_11__2__Impl rule__PeriodicActivity__Group_11__3 ;
    public final void rule__PeriodicActivity__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2119:1: ( rule__PeriodicActivity__Group_11__2__Impl rule__PeriodicActivity__Group_11__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2120:2: rule__PeriodicActivity__Group_11__2__Impl rule__PeriodicActivity__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__2__Impl_in_rule__PeriodicActivity__Group_11__24450);
            rule__PeriodicActivity__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__3_in_rule__PeriodicActivity__Group_11__24453);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2127:1: rule__PeriodicActivity__Group_11__2__Impl : ( ( rule__PeriodicActivity__ResAllocationAssignment_11_2 ) ) ;
    public final void rule__PeriodicActivity__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2131:1: ( ( ( rule__PeriodicActivity__ResAllocationAssignment_11_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2132:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_11_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2132:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_11_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2133:1: ( rule__PeriodicActivity__ResAllocationAssignment_11_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_11_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2134:1: ( rule__PeriodicActivity__ResAllocationAssignment_11_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2134:2: rule__PeriodicActivity__ResAllocationAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_11_2_in_rule__PeriodicActivity__Group_11__2__Impl4480);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2144:1: rule__PeriodicActivity__Group_11__3 : rule__PeriodicActivity__Group_11__3__Impl rule__PeriodicActivity__Group_11__4 ;
    public final void rule__PeriodicActivity__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2148:1: ( rule__PeriodicActivity__Group_11__3__Impl rule__PeriodicActivity__Group_11__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2149:2: rule__PeriodicActivity__Group_11__3__Impl rule__PeriodicActivity__Group_11__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__3__Impl_in_rule__PeriodicActivity__Group_11__34510);
            rule__PeriodicActivity__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__4_in_rule__PeriodicActivity__Group_11__34513);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2156:1: rule__PeriodicActivity__Group_11__3__Impl : ( ( rule__PeriodicActivity__Group_11_3__0 )* ) ;
    public final void rule__PeriodicActivity__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2160:1: ( ( ( rule__PeriodicActivity__Group_11_3__0 )* ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2161:1: ( ( rule__PeriodicActivity__Group_11_3__0 )* )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2161:1: ( ( rule__PeriodicActivity__Group_11_3__0 )* )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2162:1: ( rule__PeriodicActivity__Group_11_3__0 )*
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_11_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2163:1: ( rule__PeriodicActivity__Group_11_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==53) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2163:2: rule__PeriodicActivity__Group_11_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11_3__0_in_rule__PeriodicActivity__Group_11__3__Impl4540);
            	    rule__PeriodicActivity__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2173:1: rule__PeriodicActivity__Group_11__4 : rule__PeriodicActivity__Group_11__4__Impl rule__PeriodicActivity__Group_11__5 ;
    public final void rule__PeriodicActivity__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2177:1: ( rule__PeriodicActivity__Group_11__4__Impl rule__PeriodicActivity__Group_11__5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2178:2: rule__PeriodicActivity__Group_11__4__Impl rule__PeriodicActivity__Group_11__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__4__Impl_in_rule__PeriodicActivity__Group_11__44571);
            rule__PeriodicActivity__Group_11__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__5_in_rule__PeriodicActivity__Group_11__44574);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2185:1: rule__PeriodicActivity__Group_11__4__Impl : ( '}' ) ;
    public final void rule__PeriodicActivity__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2189:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2190:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2190:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2191:1: '}'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__PeriodicActivity__Group_11__4__Impl4602); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2204:1: rule__PeriodicActivity__Group_11__5 : rule__PeriodicActivity__Group_11__5__Impl ;
    public final void rule__PeriodicActivity__Group_11__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2208:1: ( rule__PeriodicActivity__Group_11__5__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2209:2: rule__PeriodicActivity__Group_11__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__5__Impl_in_rule__PeriodicActivity__Group_11__54633);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2215:1: rule__PeriodicActivity__Group_11__5__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_11__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2219:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2220:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2220:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2221:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11_5()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__PeriodicActivity__Group_11__5__Impl4661); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2246:1: rule__PeriodicActivity__Group_11_3__0 : rule__PeriodicActivity__Group_11_3__0__Impl rule__PeriodicActivity__Group_11_3__1 ;
    public final void rule__PeriodicActivity__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2250:1: ( rule__PeriodicActivity__Group_11_3__0__Impl rule__PeriodicActivity__Group_11_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2251:2: rule__PeriodicActivity__Group_11_3__0__Impl rule__PeriodicActivity__Group_11_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11_3__0__Impl_in_rule__PeriodicActivity__Group_11_3__04704);
            rule__PeriodicActivity__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11_3__1_in_rule__PeriodicActivity__Group_11_3__04707);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2258:1: rule__PeriodicActivity__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2262:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2263:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2263:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2264:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11_3_0()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__PeriodicActivity__Group_11_3__0__Impl4735); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2277:1: rule__PeriodicActivity__Group_11_3__1 : rule__PeriodicActivity__Group_11_3__1__Impl ;
    public final void rule__PeriodicActivity__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2281:1: ( rule__PeriodicActivity__Group_11_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2282:2: rule__PeriodicActivity__Group_11_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11_3__1__Impl_in_rule__PeriodicActivity__Group_11_3__14766);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2288:1: rule__PeriodicActivity__Group_11_3__1__Impl : ( ( rule__PeriodicActivity__ResAllocationAssignment_11_3_1 ) ) ;
    public final void rule__PeriodicActivity__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2292:1: ( ( ( rule__PeriodicActivity__ResAllocationAssignment_11_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2293:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_11_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2293:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_11_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2294:1: ( rule__PeriodicActivity__ResAllocationAssignment_11_3_1 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_11_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2295:1: ( rule__PeriodicActivity__ResAllocationAssignment_11_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2295:2: rule__PeriodicActivity__ResAllocationAssignment_11_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_11_3_1_in_rule__PeriodicActivity__Group_11_3__1__Impl4793);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2309:1: rule__PeriodicActivity__Group_12__0 : rule__PeriodicActivity__Group_12__0__Impl rule__PeriodicActivity__Group_12__1 ;
    public final void rule__PeriodicActivity__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2313:1: ( rule__PeriodicActivity__Group_12__0__Impl rule__PeriodicActivity__Group_12__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2314:2: rule__PeriodicActivity__Group_12__0__Impl rule__PeriodicActivity__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__0__Impl_in_rule__PeriodicActivity__Group_12__04827);
            rule__PeriodicActivity__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__1_in_rule__PeriodicActivity__Group_12__04830);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2321:1: rule__PeriodicActivity__Group_12__0__Impl : ( 'rules' ) ;
    public final void rule__PeriodicActivity__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2325:1: ( ( 'rules' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2326:1: ( 'rules' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2326:1: ( 'rules' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2327:1: 'rules'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRulesKeyword_12_0()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__PeriodicActivity__Group_12__0__Impl4858); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2340:1: rule__PeriodicActivity__Group_12__1 : rule__PeriodicActivity__Group_12__1__Impl rule__PeriodicActivity__Group_12__2 ;
    public final void rule__PeriodicActivity__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2344:1: ( rule__PeriodicActivity__Group_12__1__Impl rule__PeriodicActivity__Group_12__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2345:2: rule__PeriodicActivity__Group_12__1__Impl rule__PeriodicActivity__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__1__Impl_in_rule__PeriodicActivity__Group_12__14889);
            rule__PeriodicActivity__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__2_in_rule__PeriodicActivity__Group_12__14892);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2352:1: rule__PeriodicActivity__Group_12__1__Impl : ( ':' ) ;
    public final void rule__PeriodicActivity__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2356:1: ( ( ':' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2357:1: ( ':' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2357:1: ( ':' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2358:1: ':'
            {
             before(grammarAccess.getPeriodicActivityAccess().getColonKeyword_12_1()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__PeriodicActivity__Group_12__1__Impl4920); 
             after(grammarAccess.getPeriodicActivityAccess().getColonKeyword_12_1()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2371:1: rule__PeriodicActivity__Group_12__2 : rule__PeriodicActivity__Group_12__2__Impl rule__PeriodicActivity__Group_12__3 ;
    public final void rule__PeriodicActivity__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2375:1: ( rule__PeriodicActivity__Group_12__2__Impl rule__PeriodicActivity__Group_12__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2376:2: rule__PeriodicActivity__Group_12__2__Impl rule__PeriodicActivity__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__2__Impl_in_rule__PeriodicActivity__Group_12__24951);
            rule__PeriodicActivity__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__3_in_rule__PeriodicActivity__Group_12__24954);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2383:1: rule__PeriodicActivity__Group_12__2__Impl : ( ( rule__PeriodicActivity__RuleAssignment_12_2 ) ) ;
    public final void rule__PeriodicActivity__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2387:1: ( ( ( rule__PeriodicActivity__RuleAssignment_12_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2388:1: ( ( rule__PeriodicActivity__RuleAssignment_12_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2388:1: ( ( rule__PeriodicActivity__RuleAssignment_12_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2389:1: ( rule__PeriodicActivity__RuleAssignment_12_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleAssignment_12_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2390:1: ( rule__PeriodicActivity__RuleAssignment_12_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2390:2: rule__PeriodicActivity__RuleAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__RuleAssignment_12_2_in_rule__PeriodicActivity__Group_12__2__Impl4981);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2400:1: rule__PeriodicActivity__Group_12__3 : rule__PeriodicActivity__Group_12__3__Impl ;
    public final void rule__PeriodicActivity__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2404:1: ( rule__PeriodicActivity__Group_12__3__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2405:2: rule__PeriodicActivity__Group_12__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__3__Impl_in_rule__PeriodicActivity__Group_12__35011);
            rule__PeriodicActivity__Group_12__3__Impl();

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2411:1: rule__PeriodicActivity__Group_12__3__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2415:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2416:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2416:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2417:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_12_3()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__PeriodicActivity__Group_12__3__Impl5039); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_12_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Date__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2438:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2442:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2443:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__05078);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1_in_rule__Date__Group__05081);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2450:1: rule__Date__Group__0__Impl : ( () ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2454:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2455:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2455:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2456:1: ()
            {
             before(grammarAccess.getDateAccess().getDateAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2457:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2459:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2469:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2473:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2474:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__15139);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2_in_rule__Date__Group__15142);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2481:1: rule__Date__Group__1__Impl : ( ( rule__Date__DayAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2485:1: ( ( ( rule__Date__DayAssignment_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2486:1: ( ( rule__Date__DayAssignment_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2486:1: ( ( rule__Date__DayAssignment_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2487:1: ( rule__Date__DayAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2488:1: ( rule__Date__DayAssignment_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2488:2: rule__Date__DayAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl5169);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2498:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2502:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2503:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__25199);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__3_in_rule__Date__Group__25202);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2510:1: rule__Date__Group__2__Impl : ( ( rule__Date__MonthAssignment_2 ) ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2514:1: ( ( ( rule__Date__MonthAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2515:1: ( ( rule__Date__MonthAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2515:1: ( ( rule__Date__MonthAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2516:1: ( rule__Date__MonthAssignment_2 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2517:1: ( rule__Date__MonthAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2517:2: rule__Date__MonthAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__MonthAssignment_2_in_rule__Date__Group__2__Impl5229);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2527:1: rule__Date__Group__3 : rule__Date__Group__3__Impl ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2531:1: ( rule__Date__Group__3__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2532:2: rule__Date__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__35259);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2538:1: rule__Date__Group__3__Impl : ( ( rule__Date__YearAssignment_3 ) ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2542:1: ( ( ( rule__Date__YearAssignment_3 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2543:1: ( ( rule__Date__YearAssignment_3 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2543:1: ( ( rule__Date__YearAssignment_3 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2544:1: ( rule__Date__YearAssignment_3 )
            {
             before(grammarAccess.getDateAccess().getYearAssignment_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2545:1: ( rule__Date__YearAssignment_3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2545:2: rule__Date__YearAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__YearAssignment_3_in_rule__Date__Group__3__Impl5286);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2563:1: rule__ResAllocation__Group__0 : rule__ResAllocation__Group__0__Impl rule__ResAllocation__Group__1 ;
    public final void rule__ResAllocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2567:1: ( rule__ResAllocation__Group__0__Impl rule__ResAllocation__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2568:2: rule__ResAllocation__Group__0__Impl rule__ResAllocation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__0__Impl_in_rule__ResAllocation__Group__05324);
            rule__ResAllocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__1_in_rule__ResAllocation__Group__05327);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2575:1: rule__ResAllocation__Group__0__Impl : ( () ) ;
    public final void rule__ResAllocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2579:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2580:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2580:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2581:1: ()
            {
             before(grammarAccess.getResAllocationAccess().getRessourceAllocationAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2582:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2584:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2594:1: rule__ResAllocation__Group__1 : rule__ResAllocation__Group__1__Impl rule__ResAllocation__Group__2 ;
    public final void rule__ResAllocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2598:1: ( rule__ResAllocation__Group__1__Impl rule__ResAllocation__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2599:2: rule__ResAllocation__Group__1__Impl rule__ResAllocation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__1__Impl_in_rule__ResAllocation__Group__15385);
            rule__ResAllocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__2_in_rule__ResAllocation__Group__15388);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2606:1: rule__ResAllocation__Group__1__Impl : ( 'reserve' ) ;
    public final void rule__ResAllocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2610:1: ( ( 'reserve' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2611:1: ( 'reserve' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2611:1: ( 'reserve' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2612:1: 'reserve'
            {
             before(grammarAccess.getResAllocationAccess().getReserveKeyword_1()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__ResAllocation__Group__1__Impl5416); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2625:1: rule__ResAllocation__Group__2 : rule__ResAllocation__Group__2__Impl rule__ResAllocation__Group__3 ;
    public final void rule__ResAllocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2629:1: ( rule__ResAllocation__Group__2__Impl rule__ResAllocation__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2630:2: rule__ResAllocation__Group__2__Impl rule__ResAllocation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__2__Impl_in_rule__ResAllocation__Group__25447);
            rule__ResAllocation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__3_in_rule__ResAllocation__Group__25450);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2637:1: rule__ResAllocation__Group__2__Impl : ( ( rule__ResAllocation__RessourceAssignment_2 ) ) ;
    public final void rule__ResAllocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2641:1: ( ( ( rule__ResAllocation__RessourceAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2642:1: ( ( rule__ResAllocation__RessourceAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2642:1: ( ( rule__ResAllocation__RessourceAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2643:1: ( rule__ResAllocation__RessourceAssignment_2 )
            {
             before(grammarAccess.getResAllocationAccess().getRessourceAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2644:1: ( rule__ResAllocation__RessourceAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2644:2: rule__ResAllocation__RessourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__RessourceAssignment_2_in_rule__ResAllocation__Group__2__Impl5477);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2654:1: rule__ResAllocation__Group__3 : rule__ResAllocation__Group__3__Impl rule__ResAllocation__Group__4 ;
    public final void rule__ResAllocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2658:1: ( rule__ResAllocation__Group__3__Impl rule__ResAllocation__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2659:2: rule__ResAllocation__Group__3__Impl rule__ResAllocation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__3__Impl_in_rule__ResAllocation__Group__35507);
            rule__ResAllocation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__4_in_rule__ResAllocation__Group__35510);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2666:1: rule__ResAllocation__Group__3__Impl : ( 'for' ) ;
    public final void rule__ResAllocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2670:1: ( ( 'for' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2671:1: ( 'for' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2671:1: ( 'for' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2672:1: 'for'
            {
             before(grammarAccess.getResAllocationAccess().getForKeyword_3()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__ResAllocation__Group__3__Impl5538); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2685:1: rule__ResAllocation__Group__4 : rule__ResAllocation__Group__4__Impl rule__ResAllocation__Group__5 ;
    public final void rule__ResAllocation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2689:1: ( rule__ResAllocation__Group__4__Impl rule__ResAllocation__Group__5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2690:2: rule__ResAllocation__Group__4__Impl rule__ResAllocation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__4__Impl_in_rule__ResAllocation__Group__45569);
            rule__ResAllocation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__5_in_rule__ResAllocation__Group__45572);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2697:1: rule__ResAllocation__Group__4__Impl : ( ( rule__ResAllocation__DurationAssignment_4 ) ) ;
    public final void rule__ResAllocation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2701:1: ( ( ( rule__ResAllocation__DurationAssignment_4 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2702:1: ( ( rule__ResAllocation__DurationAssignment_4 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2702:1: ( ( rule__ResAllocation__DurationAssignment_4 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2703:1: ( rule__ResAllocation__DurationAssignment_4 )
            {
             before(grammarAccess.getResAllocationAccess().getDurationAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2704:1: ( rule__ResAllocation__DurationAssignment_4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2704:2: rule__ResAllocation__DurationAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__DurationAssignment_4_in_rule__ResAllocation__Group__4__Impl5599);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2714:1: rule__ResAllocation__Group__5 : rule__ResAllocation__Group__5__Impl ;
    public final void rule__ResAllocation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2718:1: ( rule__ResAllocation__Group__5__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2719:2: rule__ResAllocation__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__5__Impl_in_rule__ResAllocation__Group__55629);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2725:1: rule__ResAllocation__Group__5__Impl : ( ( rule__ResAllocation__PeriodicityTypeAssignment_5 ) ) ;
    public final void rule__ResAllocation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2729:1: ( ( ( rule__ResAllocation__PeriodicityTypeAssignment_5 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2730:1: ( ( rule__ResAllocation__PeriodicityTypeAssignment_5 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2730:1: ( ( rule__ResAllocation__PeriodicityTypeAssignment_5 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2731:1: ( rule__ResAllocation__PeriodicityTypeAssignment_5 )
            {
             before(grammarAccess.getResAllocationAccess().getPeriodicityTypeAssignment_5()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2732:1: ( rule__ResAllocation__PeriodicityTypeAssignment_5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2732:2: rule__ResAllocation__PeriodicityTypeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__PeriodicityTypeAssignment_5_in_rule__ResAllocation__Group__5__Impl5656);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2754:1: rule__Predicate__Group_0__0 : rule__Predicate__Group_0__0__Impl rule__Predicate__Group_0__1 ;
    public final void rule__Predicate__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2758:1: ( rule__Predicate__Group_0__0__Impl rule__Predicate__Group_0__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2759:2: rule__Predicate__Group_0__0__Impl rule__Predicate__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0__0__Impl_in_rule__Predicate__Group_0__05698);
            rule__Predicate__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0__1_in_rule__Predicate__Group_0__05701);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2766:1: rule__Predicate__Group_0__0__Impl : ( () ) ;
    public final void rule__Predicate__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2770:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2771:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2771:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2772:1: ()
            {
             before(grammarAccess.getPredicateAccess().getPredicatAction_0_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2773:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2775:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2785:1: rule__Predicate__Group_0__1 : rule__Predicate__Group_0__1__Impl ;
    public final void rule__Predicate__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2789:1: ( rule__Predicate__Group_0__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2790:2: rule__Predicate__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0__1__Impl_in_rule__Predicate__Group_0__15759);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2796:1: rule__Predicate__Group_0__1__Impl : ( ( rule__Predicate__Group_0_1__0 ) ) ;
    public final void rule__Predicate__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2800:1: ( ( ( rule__Predicate__Group_0_1__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2801:1: ( ( rule__Predicate__Group_0_1__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2801:1: ( ( rule__Predicate__Group_0_1__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2802:1: ( rule__Predicate__Group_0_1__0 )
            {
             before(grammarAccess.getPredicateAccess().getGroup_0_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2803:1: ( rule__Predicate__Group_0_1__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2803:2: rule__Predicate__Group_0_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0_1__0_in_rule__Predicate__Group_0__1__Impl5786);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2817:1: rule__Predicate__Group_0_1__0 : rule__Predicate__Group_0_1__0__Impl rule__Predicate__Group_0_1__1 ;
    public final void rule__Predicate__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2821:1: ( rule__Predicate__Group_0_1__0__Impl rule__Predicate__Group_0_1__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2822:2: rule__Predicate__Group_0_1__0__Impl rule__Predicate__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0_1__0__Impl_in_rule__Predicate__Group_0_1__05820);
            rule__Predicate__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0_1__1_in_rule__Predicate__Group_0_1__05823);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2829:1: rule__Predicate__Group_0_1__0__Impl : ( 'before' ) ;
    public final void rule__Predicate__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2833:1: ( ( 'before' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2834:1: ( 'before' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2834:1: ( 'before' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2835:1: 'before'
            {
             before(grammarAccess.getPredicateAccess().getBeforeKeyword_0_1_0()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__Predicate__Group_0_1__0__Impl5851); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2848:1: rule__Predicate__Group_0_1__1 : rule__Predicate__Group_0_1__1__Impl ;
    public final void rule__Predicate__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2852:1: ( rule__Predicate__Group_0_1__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2853:2: rule__Predicate__Group_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__Group_0_1__1__Impl_in_rule__Predicate__Group_0_1__15882);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2859:1: rule__Predicate__Group_0_1__1__Impl : ( ( rule__Predicate__DateAssignment_0_1_1 ) ) ;
    public final void rule__Predicate__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2863:1: ( ( ( rule__Predicate__DateAssignment_0_1_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2864:1: ( ( rule__Predicate__DateAssignment_0_1_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2864:1: ( ( rule__Predicate__DateAssignment_0_1_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2865:1: ( rule__Predicate__DateAssignment_0_1_1 )
            {
             before(grammarAccess.getPredicateAccess().getDateAssignment_0_1_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2866:1: ( rule__Predicate__DateAssignment_0_1_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2866:2: rule__Predicate__DateAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Predicate__DateAssignment_0_1_1_in_rule__Predicate__Group_0_1__1__Impl5909);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2880:1: rule__BinaryExppression__Group__0 : rule__BinaryExppression__Group__0__Impl rule__BinaryExppression__Group__1 ;
    public final void rule__BinaryExppression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2884:1: ( rule__BinaryExppression__Group__0__Impl rule__BinaryExppression__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2885:2: rule__BinaryExppression__Group__0__Impl rule__BinaryExppression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group__0__Impl_in_rule__BinaryExppression__Group__05943);
            rule__BinaryExppression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group__1_in_rule__BinaryExppression__Group__05946);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2892:1: rule__BinaryExppression__Group__0__Impl : ( () ) ;
    public final void rule__BinaryExppression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2896:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2897:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2897:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2898:1: ()
            {
             before(grammarAccess.getBinaryExppressionAccess().getBinaryExpressionAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2899:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2901:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2911:1: rule__BinaryExppression__Group__1 : rule__BinaryExppression__Group__1__Impl rule__BinaryExppression__Group__2 ;
    public final void rule__BinaryExppression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2915:1: ( rule__BinaryExppression__Group__1__Impl rule__BinaryExppression__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2916:2: rule__BinaryExppression__Group__1__Impl rule__BinaryExppression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group__1__Impl_in_rule__BinaryExppression__Group__16004);
            rule__BinaryExppression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group__2_in_rule__BinaryExppression__Group__16007);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2923:1: rule__BinaryExppression__Group__1__Impl : ( ( rule__BinaryExppression__Alternatives_1 ) ) ;
    public final void rule__BinaryExppression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2927:1: ( ( ( rule__BinaryExppression__Alternatives_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2928:1: ( ( rule__BinaryExppression__Alternatives_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2928:1: ( ( rule__BinaryExppression__Alternatives_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2929:1: ( rule__BinaryExppression__Alternatives_1 )
            {
             before(grammarAccess.getBinaryExppressionAccess().getAlternatives_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2930:1: ( rule__BinaryExppression__Alternatives_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2930:2: rule__BinaryExppression__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Alternatives_1_in_rule__BinaryExppression__Group__1__Impl6034);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2940:1: rule__BinaryExppression__Group__2 : rule__BinaryExppression__Group__2__Impl ;
    public final void rule__BinaryExppression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2944:1: ( rule__BinaryExppression__Group__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2945:2: rule__BinaryExppression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group__2__Impl_in_rule__BinaryExppression__Group__26064);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2951:1: rule__BinaryExppression__Group__2__Impl : ( ( rule__BinaryExppression__Group_2__0 )? ) ;
    public final void rule__BinaryExppression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2955:1: ( ( ( rule__BinaryExppression__Group_2__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2956:1: ( ( rule__BinaryExppression__Group_2__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2956:1: ( ( rule__BinaryExppression__Group_2__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2957:1: ( rule__BinaryExppression__Group_2__0 )?
            {
             before(grammarAccess.getBinaryExppressionAccess().getGroup_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2958:1: ( rule__BinaryExppression__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=42 && LA22_0<=44)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2958:2: rule__BinaryExppression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_2__0_in_rule__BinaryExppression__Group__2__Impl6091);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2974:1: rule__BinaryExppression__Group_1_1__0 : rule__BinaryExppression__Group_1_1__0__Impl rule__BinaryExppression__Group_1_1__1 ;
    public final void rule__BinaryExppression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2978:1: ( rule__BinaryExppression__Group_1_1__0__Impl rule__BinaryExppression__Group_1_1__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2979:2: rule__BinaryExppression__Group_1_1__0__Impl rule__BinaryExppression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_1_1__0__Impl_in_rule__BinaryExppression__Group_1_1__06128);
            rule__BinaryExppression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_1_1__1_in_rule__BinaryExppression__Group_1_1__06131);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2986:1: rule__BinaryExppression__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__BinaryExppression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2990:1: ( ( '(' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2991:1: ( '(' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2991:1: ( '(' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2992:1: '('
            {
             before(grammarAccess.getBinaryExppressionAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__BinaryExppression__Group_1_1__0__Impl6159); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3005:1: rule__BinaryExppression__Group_1_1__1 : rule__BinaryExppression__Group_1_1__1__Impl rule__BinaryExppression__Group_1_1__2 ;
    public final void rule__BinaryExppression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3009:1: ( rule__BinaryExppression__Group_1_1__1__Impl rule__BinaryExppression__Group_1_1__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3010:2: rule__BinaryExppression__Group_1_1__1__Impl rule__BinaryExppression__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_1_1__1__Impl_in_rule__BinaryExppression__Group_1_1__16190);
            rule__BinaryExppression__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_1_1__2_in_rule__BinaryExppression__Group_1_1__16193);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3017:1: rule__BinaryExppression__Group_1_1__1__Impl : ( ( rule__BinaryExppression__LeftAssignment_1_1_1 ) ) ;
    public final void rule__BinaryExppression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3021:1: ( ( ( rule__BinaryExppression__LeftAssignment_1_1_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3022:1: ( ( rule__BinaryExppression__LeftAssignment_1_1_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3022:1: ( ( rule__BinaryExppression__LeftAssignment_1_1_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3023:1: ( rule__BinaryExppression__LeftAssignment_1_1_1 )
            {
             before(grammarAccess.getBinaryExppressionAccess().getLeftAssignment_1_1_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3024:1: ( rule__BinaryExppression__LeftAssignment_1_1_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3024:2: rule__BinaryExppression__LeftAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__LeftAssignment_1_1_1_in_rule__BinaryExppression__Group_1_1__1__Impl6220);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3034:1: rule__BinaryExppression__Group_1_1__2 : rule__BinaryExppression__Group_1_1__2__Impl ;
    public final void rule__BinaryExppression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3038:1: ( rule__BinaryExppression__Group_1_1__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3039:2: rule__BinaryExppression__Group_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_1_1__2__Impl_in_rule__BinaryExppression__Group_1_1__26250);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3045:1: rule__BinaryExppression__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__BinaryExppression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3049:1: ( ( ')' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3050:1: ( ')' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3050:1: ( ')' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3051:1: ')'
            {
             before(grammarAccess.getBinaryExppressionAccess().getRightParenthesisKeyword_1_1_2()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__BinaryExppression__Group_1_1__2__Impl6278); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3070:1: rule__BinaryExppression__Group_2__0 : rule__BinaryExppression__Group_2__0__Impl rule__BinaryExppression__Group_2__1 ;
    public final void rule__BinaryExppression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3074:1: ( rule__BinaryExppression__Group_2__0__Impl rule__BinaryExppression__Group_2__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3075:2: rule__BinaryExppression__Group_2__0__Impl rule__BinaryExppression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_2__0__Impl_in_rule__BinaryExppression__Group_2__06315);
            rule__BinaryExppression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_2__1_in_rule__BinaryExppression__Group_2__06318);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3082:1: rule__BinaryExppression__Group_2__0__Impl : ( ( rule__BinaryExppression__OpeAssignment_2_0 ) ) ;
    public final void rule__BinaryExppression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3086:1: ( ( ( rule__BinaryExppression__OpeAssignment_2_0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3087:1: ( ( rule__BinaryExppression__OpeAssignment_2_0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3087:1: ( ( rule__BinaryExppression__OpeAssignment_2_0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3088:1: ( rule__BinaryExppression__OpeAssignment_2_0 )
            {
             before(grammarAccess.getBinaryExppressionAccess().getOpeAssignment_2_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3089:1: ( rule__BinaryExppression__OpeAssignment_2_0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3089:2: rule__BinaryExppression__OpeAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__OpeAssignment_2_0_in_rule__BinaryExppression__Group_2__0__Impl6345);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3099:1: rule__BinaryExppression__Group_2__1 : rule__BinaryExppression__Group_2__1__Impl ;
    public final void rule__BinaryExppression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3103:1: ( rule__BinaryExppression__Group_2__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3104:2: rule__BinaryExppression__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__Group_2__1__Impl_in_rule__BinaryExppression__Group_2__16375);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3110:1: rule__BinaryExppression__Group_2__1__Impl : ( ( rule__BinaryExppression__RightAssignment_2_1 ) ) ;
    public final void rule__BinaryExppression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3114:1: ( ( ( rule__BinaryExppression__RightAssignment_2_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3115:1: ( ( rule__BinaryExppression__RightAssignment_2_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3115:1: ( ( rule__BinaryExppression__RightAssignment_2_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3116:1: ( rule__BinaryExppression__RightAssignment_2_1 )
            {
             before(grammarAccess.getBinaryExppressionAccess().getRightAssignment_2_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3117:1: ( rule__BinaryExppression__RightAssignment_2_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3117:2: rule__BinaryExppression__RightAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryExppression__RightAssignment_2_1_in_rule__BinaryExppression__Group_2__1__Impl6402);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3131:1: rule__Temperature__Group__0 : rule__Temperature__Group__0__Impl rule__Temperature__Group__1 ;
    public final void rule__Temperature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3135:1: ( rule__Temperature__Group__0__Impl rule__Temperature__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3136:2: rule__Temperature__Group__0__Impl rule__Temperature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__0__Impl_in_rule__Temperature__Group__06436);
            rule__Temperature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__1_in_rule__Temperature__Group__06439);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3143:1: rule__Temperature__Group__0__Impl : ( () ) ;
    public final void rule__Temperature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3147:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3148:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3148:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3149:1: ()
            {
             before(grammarAccess.getTemperatureAccess().getTemperatureAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3150:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3152:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3162:1: rule__Temperature__Group__1 : rule__Temperature__Group__1__Impl rule__Temperature__Group__2 ;
    public final void rule__Temperature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3166:1: ( rule__Temperature__Group__1__Impl rule__Temperature__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3167:2: rule__Temperature__Group__1__Impl rule__Temperature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__1__Impl_in_rule__Temperature__Group__16497);
            rule__Temperature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__2_in_rule__Temperature__Group__16500);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3174:1: rule__Temperature__Group__1__Impl : ( ( rule__Temperature__Alternatives_1 ) ) ;
    public final void rule__Temperature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3178:1: ( ( ( rule__Temperature__Alternatives_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3179:1: ( ( rule__Temperature__Alternatives_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3179:1: ( ( rule__Temperature__Alternatives_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3180:1: ( rule__Temperature__Alternatives_1 )
            {
             before(grammarAccess.getTemperatureAccess().getAlternatives_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3181:1: ( rule__Temperature__Alternatives_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3181:2: rule__Temperature__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Alternatives_1_in_rule__Temperature__Group__1__Impl6527);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3191:1: rule__Temperature__Group__2 : rule__Temperature__Group__2__Impl rule__Temperature__Group__3 ;
    public final void rule__Temperature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3195:1: ( rule__Temperature__Group__2__Impl rule__Temperature__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3196:2: rule__Temperature__Group__2__Impl rule__Temperature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__2__Impl_in_rule__Temperature__Group__26557);
            rule__Temperature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__3_in_rule__Temperature__Group__26560);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3203:1: rule__Temperature__Group__2__Impl : ( ( rule__Temperature__ComparatorAssignment_2 ) ) ;
    public final void rule__Temperature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3207:1: ( ( ( rule__Temperature__ComparatorAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3208:1: ( ( rule__Temperature__ComparatorAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3208:1: ( ( rule__Temperature__ComparatorAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3209:1: ( rule__Temperature__ComparatorAssignment_2 )
            {
             before(grammarAccess.getTemperatureAccess().getComparatorAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3210:1: ( rule__Temperature__ComparatorAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3210:2: rule__Temperature__ComparatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__ComparatorAssignment_2_in_rule__Temperature__Group__2__Impl6587);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3220:1: rule__Temperature__Group__3 : rule__Temperature__Group__3__Impl rule__Temperature__Group__4 ;
    public final void rule__Temperature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3224:1: ( rule__Temperature__Group__3__Impl rule__Temperature__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3225:2: rule__Temperature__Group__3__Impl rule__Temperature__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__3__Impl_in_rule__Temperature__Group__36617);
            rule__Temperature__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__4_in_rule__Temperature__Group__36620);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3232:1: rule__Temperature__Group__3__Impl : ( 'than' ) ;
    public final void rule__Temperature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3236:1: ( ( 'than' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3237:1: ( 'than' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3237:1: ( 'than' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3238:1: 'than'
            {
             before(grammarAccess.getTemperatureAccess().getThanKeyword_3()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__Temperature__Group__3__Impl6648); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3251:1: rule__Temperature__Group__4 : rule__Temperature__Group__4__Impl ;
    public final void rule__Temperature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3255:1: ( rule__Temperature__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3256:2: rule__Temperature__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__Group__4__Impl_in_rule__Temperature__Group__46679);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3262:1: rule__Temperature__Group__4__Impl : ( ( rule__Temperature__ValueAssignment_4 ) ) ;
    public final void rule__Temperature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3266:1: ( ( ( rule__Temperature__ValueAssignment_4 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3267:1: ( ( rule__Temperature__ValueAssignment_4 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3267:1: ( ( rule__Temperature__ValueAssignment_4 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3268:1: ( rule__Temperature__ValueAssignment_4 )
            {
             before(grammarAccess.getTemperatureAccess().getValueAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3269:1: ( rule__Temperature__ValueAssignment_4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3269:2: rule__Temperature__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Temperature__ValueAssignment_4_in_rule__Temperature__Group__4__Impl6706);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3289:1: rule__Precipitation__Group__0 : rule__Precipitation__Group__0__Impl rule__Precipitation__Group__1 ;
    public final void rule__Precipitation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3293:1: ( rule__Precipitation__Group__0__Impl rule__Precipitation__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3294:2: rule__Precipitation__Group__0__Impl rule__Precipitation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__0__Impl_in_rule__Precipitation__Group__06746);
            rule__Precipitation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__1_in_rule__Precipitation__Group__06749);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3301:1: rule__Precipitation__Group__0__Impl : ( () ) ;
    public final void rule__Precipitation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3305:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3306:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3306:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3307:1: ()
            {
             before(grammarAccess.getPrecipitationAccess().getPrecipitationAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3308:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3310:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3320:1: rule__Precipitation__Group__1 : rule__Precipitation__Group__1__Impl rule__Precipitation__Group__2 ;
    public final void rule__Precipitation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3324:1: ( rule__Precipitation__Group__1__Impl rule__Precipitation__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3325:2: rule__Precipitation__Group__1__Impl rule__Precipitation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__1__Impl_in_rule__Precipitation__Group__16807);
            rule__Precipitation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__2_in_rule__Precipitation__Group__16810);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3332:1: rule__Precipitation__Group__1__Impl : ( ( rule__Precipitation__Alternatives_1 ) ) ;
    public final void rule__Precipitation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3336:1: ( ( ( rule__Precipitation__Alternatives_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3337:1: ( ( rule__Precipitation__Alternatives_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3337:1: ( ( rule__Precipitation__Alternatives_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3338:1: ( rule__Precipitation__Alternatives_1 )
            {
             before(grammarAccess.getPrecipitationAccess().getAlternatives_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3339:1: ( rule__Precipitation__Alternatives_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3339:2: rule__Precipitation__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Alternatives_1_in_rule__Precipitation__Group__1__Impl6837);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3349:1: rule__Precipitation__Group__2 : rule__Precipitation__Group__2__Impl rule__Precipitation__Group__3 ;
    public final void rule__Precipitation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3353:1: ( rule__Precipitation__Group__2__Impl rule__Precipitation__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3354:2: rule__Precipitation__Group__2__Impl rule__Precipitation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__2__Impl_in_rule__Precipitation__Group__26867);
            rule__Precipitation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__3_in_rule__Precipitation__Group__26870);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3361:1: rule__Precipitation__Group__2__Impl : ( ( rule__Precipitation__ComparatorAssignment_2 ) ) ;
    public final void rule__Precipitation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3365:1: ( ( ( rule__Precipitation__ComparatorAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3366:1: ( ( rule__Precipitation__ComparatorAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3366:1: ( ( rule__Precipitation__ComparatorAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3367:1: ( rule__Precipitation__ComparatorAssignment_2 )
            {
             before(grammarAccess.getPrecipitationAccess().getComparatorAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3368:1: ( rule__Precipitation__ComparatorAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3368:2: rule__Precipitation__ComparatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__ComparatorAssignment_2_in_rule__Precipitation__Group__2__Impl6897);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3378:1: rule__Precipitation__Group__3 : rule__Precipitation__Group__3__Impl rule__Precipitation__Group__4 ;
    public final void rule__Precipitation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3382:1: ( rule__Precipitation__Group__3__Impl rule__Precipitation__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3383:2: rule__Precipitation__Group__3__Impl rule__Precipitation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__3__Impl_in_rule__Precipitation__Group__36927);
            rule__Precipitation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__4_in_rule__Precipitation__Group__36930);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3390:1: rule__Precipitation__Group__3__Impl : ( 'than' ) ;
    public final void rule__Precipitation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3394:1: ( ( 'than' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3395:1: ( 'than' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3395:1: ( 'than' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3396:1: 'than'
            {
             before(grammarAccess.getPrecipitationAccess().getThanKeyword_3()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__Precipitation__Group__3__Impl6958); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3409:1: rule__Precipitation__Group__4 : rule__Precipitation__Group__4__Impl ;
    public final void rule__Precipitation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3413:1: ( rule__Precipitation__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3414:2: rule__Precipitation__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__Group__4__Impl_in_rule__Precipitation__Group__46989);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3420:1: rule__Precipitation__Group__4__Impl : ( ( rule__Precipitation__HeightAssignment_4 ) ) ;
    public final void rule__Precipitation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3424:1: ( ( ( rule__Precipitation__HeightAssignment_4 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3425:1: ( ( rule__Precipitation__HeightAssignment_4 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3425:1: ( ( rule__Precipitation__HeightAssignment_4 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3426:1: ( rule__Precipitation__HeightAssignment_4 )
            {
             before(grammarAccess.getPrecipitationAccess().getHeightAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3427:1: ( rule__Precipitation__HeightAssignment_4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3427:2: rule__Precipitation__HeightAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Precipitation__HeightAssignment_4_in_rule__Precipitation__Group__4__Impl7016);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3447:1: rule__Rayonnement__Group__0 : rule__Rayonnement__Group__0__Impl rule__Rayonnement__Group__1 ;
    public final void rule__Rayonnement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3451:1: ( rule__Rayonnement__Group__0__Impl rule__Rayonnement__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3452:2: rule__Rayonnement__Group__0__Impl rule__Rayonnement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__0__Impl_in_rule__Rayonnement__Group__07056);
            rule__Rayonnement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__1_in_rule__Rayonnement__Group__07059);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3459:1: rule__Rayonnement__Group__0__Impl : ( () ) ;
    public final void rule__Rayonnement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3463:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3464:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3464:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3465:1: ()
            {
             before(grammarAccess.getRayonnementAccess().getRayonnementAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3466:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3468:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3478:1: rule__Rayonnement__Group__1 : rule__Rayonnement__Group__1__Impl rule__Rayonnement__Group__2 ;
    public final void rule__Rayonnement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3482:1: ( rule__Rayonnement__Group__1__Impl rule__Rayonnement__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3483:2: rule__Rayonnement__Group__1__Impl rule__Rayonnement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__1__Impl_in_rule__Rayonnement__Group__17117);
            rule__Rayonnement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__2_in_rule__Rayonnement__Group__17120);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3490:1: rule__Rayonnement__Group__1__Impl : ( ( rule__Rayonnement__Alternatives_1 ) ) ;
    public final void rule__Rayonnement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3494:1: ( ( ( rule__Rayonnement__Alternatives_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3495:1: ( ( rule__Rayonnement__Alternatives_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3495:1: ( ( rule__Rayonnement__Alternatives_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3496:1: ( rule__Rayonnement__Alternatives_1 )
            {
             before(grammarAccess.getRayonnementAccess().getAlternatives_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3497:1: ( rule__Rayonnement__Alternatives_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3497:2: rule__Rayonnement__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Alternatives_1_in_rule__Rayonnement__Group__1__Impl7147);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3507:1: rule__Rayonnement__Group__2 : rule__Rayonnement__Group__2__Impl rule__Rayonnement__Group__3 ;
    public final void rule__Rayonnement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3511:1: ( rule__Rayonnement__Group__2__Impl rule__Rayonnement__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3512:2: rule__Rayonnement__Group__2__Impl rule__Rayonnement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__2__Impl_in_rule__Rayonnement__Group__27177);
            rule__Rayonnement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__3_in_rule__Rayonnement__Group__27180);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3519:1: rule__Rayonnement__Group__2__Impl : ( ( rule__Rayonnement__ComparatorAssignment_2 ) ) ;
    public final void rule__Rayonnement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3523:1: ( ( ( rule__Rayonnement__ComparatorAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3524:1: ( ( rule__Rayonnement__ComparatorAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3524:1: ( ( rule__Rayonnement__ComparatorAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3525:1: ( rule__Rayonnement__ComparatorAssignment_2 )
            {
             before(grammarAccess.getRayonnementAccess().getComparatorAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3526:1: ( rule__Rayonnement__ComparatorAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3526:2: rule__Rayonnement__ComparatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__ComparatorAssignment_2_in_rule__Rayonnement__Group__2__Impl7207);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3536:1: rule__Rayonnement__Group__3 : rule__Rayonnement__Group__3__Impl rule__Rayonnement__Group__4 ;
    public final void rule__Rayonnement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3540:1: ( rule__Rayonnement__Group__3__Impl rule__Rayonnement__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3541:2: rule__Rayonnement__Group__3__Impl rule__Rayonnement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__3__Impl_in_rule__Rayonnement__Group__37237);
            rule__Rayonnement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__4_in_rule__Rayonnement__Group__37240);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3548:1: rule__Rayonnement__Group__3__Impl : ( 'than' ) ;
    public final void rule__Rayonnement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3552:1: ( ( 'than' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3553:1: ( 'than' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3553:1: ( 'than' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3554:1: 'than'
            {
             before(grammarAccess.getRayonnementAccess().getThanKeyword_3()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__Rayonnement__Group__3__Impl7268); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3567:1: rule__Rayonnement__Group__4 : rule__Rayonnement__Group__4__Impl ;
    public final void rule__Rayonnement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3571:1: ( rule__Rayonnement__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3572:2: rule__Rayonnement__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__Group__4__Impl_in_rule__Rayonnement__Group__47299);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3578:1: rule__Rayonnement__Group__4__Impl : ( ( rule__Rayonnement__ValueAssignment_4 ) ) ;
    public final void rule__Rayonnement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3582:1: ( ( ( rule__Rayonnement__ValueAssignment_4 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3583:1: ( ( rule__Rayonnement__ValueAssignment_4 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3583:1: ( ( rule__Rayonnement__ValueAssignment_4 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3584:1: ( rule__Rayonnement__ValueAssignment_4 )
            {
             before(grammarAccess.getRayonnementAccess().getValueAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3585:1: ( rule__Rayonnement__ValueAssignment_4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3585:2: rule__Rayonnement__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rayonnement__ValueAssignment_4_in_rule__Rayonnement__Group__4__Impl7326);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3605:1: rule__Evapotranspiration__Group__0 : rule__Evapotranspiration__Group__0__Impl rule__Evapotranspiration__Group__1 ;
    public final void rule__Evapotranspiration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3609:1: ( rule__Evapotranspiration__Group__0__Impl rule__Evapotranspiration__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3610:2: rule__Evapotranspiration__Group__0__Impl rule__Evapotranspiration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__0__Impl_in_rule__Evapotranspiration__Group__07366);
            rule__Evapotranspiration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__1_in_rule__Evapotranspiration__Group__07369);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3617:1: rule__Evapotranspiration__Group__0__Impl : ( () ) ;
    public final void rule__Evapotranspiration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3621:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3622:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3622:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3623:1: ()
            {
             before(grammarAccess.getEvapotranspirationAccess().getEvapoTranspirationAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3624:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3626:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3636:1: rule__Evapotranspiration__Group__1 : rule__Evapotranspiration__Group__1__Impl rule__Evapotranspiration__Group__2 ;
    public final void rule__Evapotranspiration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3640:1: ( rule__Evapotranspiration__Group__1__Impl rule__Evapotranspiration__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3641:2: rule__Evapotranspiration__Group__1__Impl rule__Evapotranspiration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__1__Impl_in_rule__Evapotranspiration__Group__17427);
            rule__Evapotranspiration__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__2_in_rule__Evapotranspiration__Group__17430);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3648:1: rule__Evapotranspiration__Group__1__Impl : ( ( rule__Evapotranspiration__Alternatives_1 ) ) ;
    public final void rule__Evapotranspiration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3652:1: ( ( ( rule__Evapotranspiration__Alternatives_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3653:1: ( ( rule__Evapotranspiration__Alternatives_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3653:1: ( ( rule__Evapotranspiration__Alternatives_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3654:1: ( rule__Evapotranspiration__Alternatives_1 )
            {
             before(grammarAccess.getEvapotranspirationAccess().getAlternatives_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3655:1: ( rule__Evapotranspiration__Alternatives_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3655:2: rule__Evapotranspiration__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Alternatives_1_in_rule__Evapotranspiration__Group__1__Impl7457);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3665:1: rule__Evapotranspiration__Group__2 : rule__Evapotranspiration__Group__2__Impl rule__Evapotranspiration__Group__3 ;
    public final void rule__Evapotranspiration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3669:1: ( rule__Evapotranspiration__Group__2__Impl rule__Evapotranspiration__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3670:2: rule__Evapotranspiration__Group__2__Impl rule__Evapotranspiration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__2__Impl_in_rule__Evapotranspiration__Group__27487);
            rule__Evapotranspiration__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__3_in_rule__Evapotranspiration__Group__27490);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3677:1: rule__Evapotranspiration__Group__2__Impl : ( ( rule__Evapotranspiration__ComparatorAssignment_2 ) ) ;
    public final void rule__Evapotranspiration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3681:1: ( ( ( rule__Evapotranspiration__ComparatorAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3682:1: ( ( rule__Evapotranspiration__ComparatorAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3682:1: ( ( rule__Evapotranspiration__ComparatorAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3683:1: ( rule__Evapotranspiration__ComparatorAssignment_2 )
            {
             before(grammarAccess.getEvapotranspirationAccess().getComparatorAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3684:1: ( rule__Evapotranspiration__ComparatorAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3684:2: rule__Evapotranspiration__ComparatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__ComparatorAssignment_2_in_rule__Evapotranspiration__Group__2__Impl7517);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3694:1: rule__Evapotranspiration__Group__3 : rule__Evapotranspiration__Group__3__Impl rule__Evapotranspiration__Group__4 ;
    public final void rule__Evapotranspiration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3698:1: ( rule__Evapotranspiration__Group__3__Impl rule__Evapotranspiration__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3699:2: rule__Evapotranspiration__Group__3__Impl rule__Evapotranspiration__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__3__Impl_in_rule__Evapotranspiration__Group__37547);
            rule__Evapotranspiration__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__4_in_rule__Evapotranspiration__Group__37550);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3706:1: rule__Evapotranspiration__Group__3__Impl : ( 'than' ) ;
    public final void rule__Evapotranspiration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3710:1: ( ( 'than' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3711:1: ( 'than' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3711:1: ( 'than' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3712:1: 'than'
            {
             before(grammarAccess.getEvapotranspirationAccess().getThanKeyword_3()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__Evapotranspiration__Group__3__Impl7578); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3725:1: rule__Evapotranspiration__Group__4 : rule__Evapotranspiration__Group__4__Impl ;
    public final void rule__Evapotranspiration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3729:1: ( rule__Evapotranspiration__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3730:2: rule__Evapotranspiration__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__Group__4__Impl_in_rule__Evapotranspiration__Group__47609);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3736:1: rule__Evapotranspiration__Group__4__Impl : ( ( rule__Evapotranspiration__ValueAssignment_4 ) ) ;
    public final void rule__Evapotranspiration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3740:1: ( ( ( rule__Evapotranspiration__ValueAssignment_4 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3741:1: ( ( rule__Evapotranspiration__ValueAssignment_4 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3741:1: ( ( rule__Evapotranspiration__ValueAssignment_4 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3742:1: ( rule__Evapotranspiration__ValueAssignment_4 )
            {
             before(grammarAccess.getEvapotranspirationAccess().getValueAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3743:1: ( rule__Evapotranspiration__ValueAssignment_4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3743:2: rule__Evapotranspiration__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Evapotranspiration__ValueAssignment_4_in_rule__Evapotranspiration__Group__4__Impl7636);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3763:1: rule__CheckDoneActivity__Group_0__0 : rule__CheckDoneActivity__Group_0__0__Impl rule__CheckDoneActivity__Group_0__1 ;
    public final void rule__CheckDoneActivity__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3767:1: ( rule__CheckDoneActivity__Group_0__0__Impl rule__CheckDoneActivity__Group_0__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3768:2: rule__CheckDoneActivity__Group_0__0__Impl rule__CheckDoneActivity__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__0__Impl_in_rule__CheckDoneActivity__Group_0__07676);
            rule__CheckDoneActivity__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__1_in_rule__CheckDoneActivity__Group_0__07679);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3775:1: rule__CheckDoneActivity__Group_0__0__Impl : ( () ) ;
    public final void rule__CheckDoneActivity__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3779:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3780:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3780:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3781:1: ()
            {
             before(grammarAccess.getCheckDoneActivityAccess().getCheckDoneActivityAction_0_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3782:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3784:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3794:1: rule__CheckDoneActivity__Group_0__1 : rule__CheckDoneActivity__Group_0__1__Impl rule__CheckDoneActivity__Group_0__2 ;
    public final void rule__CheckDoneActivity__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3798:1: ( rule__CheckDoneActivity__Group_0__1__Impl rule__CheckDoneActivity__Group_0__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3799:2: rule__CheckDoneActivity__Group_0__1__Impl rule__CheckDoneActivity__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__1__Impl_in_rule__CheckDoneActivity__Group_0__17737);
            rule__CheckDoneActivity__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__2_in_rule__CheckDoneActivity__Group_0__17740);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3806:1: rule__CheckDoneActivity__Group_0__1__Impl : ( 'activity' ) ;
    public final void rule__CheckDoneActivity__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3810:1: ( ( 'activity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3811:1: ( 'activity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3811:1: ( 'activity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3812:1: 'activity'
            {
             before(grammarAccess.getCheckDoneActivityAccess().getActivityKeyword_0_1()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__CheckDoneActivity__Group_0__1__Impl7768); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3825:1: rule__CheckDoneActivity__Group_0__2 : rule__CheckDoneActivity__Group_0__2__Impl rule__CheckDoneActivity__Group_0__3 ;
    public final void rule__CheckDoneActivity__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3829:1: ( rule__CheckDoneActivity__Group_0__2__Impl rule__CheckDoneActivity__Group_0__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3830:2: rule__CheckDoneActivity__Group_0__2__Impl rule__CheckDoneActivity__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__2__Impl_in_rule__CheckDoneActivity__Group_0__27799);
            rule__CheckDoneActivity__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__3_in_rule__CheckDoneActivity__Group_0__27802);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3837:1: rule__CheckDoneActivity__Group_0__2__Impl : ( ( rule__CheckDoneActivity__ActivityToValidateAssignment_0_2 ) ) ;
    public final void rule__CheckDoneActivity__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3841:1: ( ( ( rule__CheckDoneActivity__ActivityToValidateAssignment_0_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3842:1: ( ( rule__CheckDoneActivity__ActivityToValidateAssignment_0_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3842:1: ( ( rule__CheckDoneActivity__ActivityToValidateAssignment_0_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3843:1: ( rule__CheckDoneActivity__ActivityToValidateAssignment_0_2 )
            {
             before(grammarAccess.getCheckDoneActivityAccess().getActivityToValidateAssignment_0_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3844:1: ( rule__CheckDoneActivity__ActivityToValidateAssignment_0_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3844:2: rule__CheckDoneActivity__ActivityToValidateAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__ActivityToValidateAssignment_0_2_in_rule__CheckDoneActivity__Group_0__2__Impl7829);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3854:1: rule__CheckDoneActivity__Group_0__3 : rule__CheckDoneActivity__Group_0__3__Impl rule__CheckDoneActivity__Group_0__4 ;
    public final void rule__CheckDoneActivity__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3858:1: ( rule__CheckDoneActivity__Group_0__3__Impl rule__CheckDoneActivity__Group_0__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3859:2: rule__CheckDoneActivity__Group_0__3__Impl rule__CheckDoneActivity__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__3__Impl_in_rule__CheckDoneActivity__Group_0__37859);
            rule__CheckDoneActivity__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__4_in_rule__CheckDoneActivity__Group_0__37862);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3866:1: rule__CheckDoneActivity__Group_0__3__Impl : ( 'done' ) ;
    public final void rule__CheckDoneActivity__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3870:1: ( ( 'done' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3871:1: ( 'done' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3871:1: ( 'done' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3872:1: 'done'
            {
             before(grammarAccess.getCheckDoneActivityAccess().getDoneKeyword_0_3()); 
            match(input,66,FollowSets000.FOLLOW_66_in_rule__CheckDoneActivity__Group_0__3__Impl7890); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3885:1: rule__CheckDoneActivity__Group_0__4 : rule__CheckDoneActivity__Group_0__4__Impl ;
    public final void rule__CheckDoneActivity__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3889:1: ( rule__CheckDoneActivity__Group_0__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3890:2: rule__CheckDoneActivity__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0__4__Impl_in_rule__CheckDoneActivity__Group_0__47921);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3896:1: rule__CheckDoneActivity__Group_0__4__Impl : ( ( rule__CheckDoneActivity__Group_0_4__0 ) ) ;
    public final void rule__CheckDoneActivity__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3900:1: ( ( ( rule__CheckDoneActivity__Group_0_4__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3901:1: ( ( rule__CheckDoneActivity__Group_0_4__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3901:1: ( ( rule__CheckDoneActivity__Group_0_4__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3902:1: ( rule__CheckDoneActivity__Group_0_4__0 )
            {
             before(grammarAccess.getCheckDoneActivityAccess().getGroup_0_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3903:1: ( rule__CheckDoneActivity__Group_0_4__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3903:2: rule__CheckDoneActivity__Group_0_4__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0_4__0_in_rule__CheckDoneActivity__Group_0__4__Impl7948);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3923:1: rule__CheckDoneActivity__Group_0_4__0 : rule__CheckDoneActivity__Group_0_4__0__Impl rule__CheckDoneActivity__Group_0_4__1 ;
    public final void rule__CheckDoneActivity__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3927:1: ( rule__CheckDoneActivity__Group_0_4__0__Impl rule__CheckDoneActivity__Group_0_4__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3928:2: rule__CheckDoneActivity__Group_0_4__0__Impl rule__CheckDoneActivity__Group_0_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0_4__0__Impl_in_rule__CheckDoneActivity__Group_0_4__07988);
            rule__CheckDoneActivity__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0_4__1_in_rule__CheckDoneActivity__Group_0_4__07991);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3935:1: rule__CheckDoneActivity__Group_0_4__0__Impl : ( ( rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0 ) ) ;
    public final void rule__CheckDoneActivity__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3939:1: ( ( ( rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3940:1: ( ( rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3940:1: ( ( rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3941:1: ( rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0 )
            {
             before(grammarAccess.getCheckDoneActivityAccess().getElapsedTimeAssignment_0_4_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3942:1: ( rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3942:2: rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0_in_rule__CheckDoneActivity__Group_0_4__0__Impl8018);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3952:1: rule__CheckDoneActivity__Group_0_4__1 : rule__CheckDoneActivity__Group_0_4__1__Impl rule__CheckDoneActivity__Group_0_4__2 ;
    public final void rule__CheckDoneActivity__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3956:1: ( rule__CheckDoneActivity__Group_0_4__1__Impl rule__CheckDoneActivity__Group_0_4__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3957:2: rule__CheckDoneActivity__Group_0_4__1__Impl rule__CheckDoneActivity__Group_0_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0_4__1__Impl_in_rule__CheckDoneActivity__Group_0_4__18048);
            rule__CheckDoneActivity__Group_0_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0_4__2_in_rule__CheckDoneActivity__Group_0_4__18051);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3964:1: rule__CheckDoneActivity__Group_0_4__1__Impl : ( ( rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1 ) ) ;
    public final void rule__CheckDoneActivity__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3968:1: ( ( ( rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3969:1: ( ( rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3969:1: ( ( rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3970:1: ( rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1 )
            {
             before(grammarAccess.getCheckDoneActivityAccess().getPeriodicityTypeAssignment_0_4_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3971:1: ( rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3971:2: rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1_in_rule__CheckDoneActivity__Group_0_4__1__Impl8078);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3981:1: rule__CheckDoneActivity__Group_0_4__2 : rule__CheckDoneActivity__Group_0_4__2__Impl ;
    public final void rule__CheckDoneActivity__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3985:1: ( rule__CheckDoneActivity__Group_0_4__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3986:2: rule__CheckDoneActivity__Group_0_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CheckDoneActivity__Group_0_4__2__Impl_in_rule__CheckDoneActivity__Group_0_4__28108);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3992:1: rule__CheckDoneActivity__Group_0_4__2__Impl : ( 'ago' ) ;
    public final void rule__CheckDoneActivity__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3996:1: ( ( 'ago' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3997:1: ( 'ago' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3997:1: ( 'ago' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:3998:1: 'ago'
            {
             before(grammarAccess.getCheckDoneActivityAccess().getAgoKeyword_0_4_2()); 
            match(input,67,FollowSets000.FOLLOW_67_in_rule__CheckDoneActivity__Group_0_4__2__Impl8136); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4017:1: rule__NoRain__Group__0 : rule__NoRain__Group__0__Impl rule__NoRain__Group__1 ;
    public final void rule__NoRain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4021:1: ( rule__NoRain__Group__0__Impl rule__NoRain__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4022:2: rule__NoRain__Group__0__Impl rule__NoRain__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group__0__Impl_in_rule__NoRain__Group__08173);
            rule__NoRain__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group__1_in_rule__NoRain__Group__08176);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4029:1: rule__NoRain__Group__0__Impl : ( () ) ;
    public final void rule__NoRain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4033:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4034:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4034:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4035:1: ()
            {
             before(grammarAccess.getNoRainAccess().getNoRainAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4036:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4038:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4048:1: rule__NoRain__Group__1 : rule__NoRain__Group__1__Impl rule__NoRain__Group__2 ;
    public final void rule__NoRain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4052:1: ( rule__NoRain__Group__1__Impl rule__NoRain__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4053:2: rule__NoRain__Group__1__Impl rule__NoRain__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group__1__Impl_in_rule__NoRain__Group__18234);
            rule__NoRain__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group__2_in_rule__NoRain__Group__18237);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4060:1: rule__NoRain__Group__1__Impl : ( 'noRain' ) ;
    public final void rule__NoRain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4064:1: ( ( 'noRain' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4065:1: ( 'noRain' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4065:1: ( 'noRain' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4066:1: 'noRain'
            {
             before(grammarAccess.getNoRainAccess().getNoRainKeyword_1()); 
            match(input,68,FollowSets000.FOLLOW_68_in_rule__NoRain__Group__1__Impl8265); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4079:1: rule__NoRain__Group__2 : rule__NoRain__Group__2__Impl ;
    public final void rule__NoRain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4083:1: ( rule__NoRain__Group__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4084:2: rule__NoRain__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group__2__Impl_in_rule__NoRain__Group__28296);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4090:1: rule__NoRain__Group__2__Impl : ( ( rule__NoRain__Alternatives_2 ) ) ;
    public final void rule__NoRain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4094:1: ( ( ( rule__NoRain__Alternatives_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4095:1: ( ( rule__NoRain__Alternatives_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4095:1: ( ( rule__NoRain__Alternatives_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4096:1: ( rule__NoRain__Alternatives_2 )
            {
             before(grammarAccess.getNoRainAccess().getAlternatives_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4097:1: ( rule__NoRain__Alternatives_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4097:2: rule__NoRain__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Alternatives_2_in_rule__NoRain__Group__2__Impl8323);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4113:1: rule__NoRain__Group_2_0__0 : rule__NoRain__Group_2_0__0__Impl rule__NoRain__Group_2_0__1 ;
    public final void rule__NoRain__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4117:1: ( rule__NoRain__Group_2_0__0__Impl rule__NoRain__Group_2_0__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4118:2: rule__NoRain__Group_2_0__0__Impl rule__NoRain__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_0__0__Impl_in_rule__NoRain__Group_2_0__08359);
            rule__NoRain__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_0__1_in_rule__NoRain__Group_2_0__08362);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4125:1: rule__NoRain__Group_2_0__0__Impl : ( 'for' ) ;
    public final void rule__NoRain__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4129:1: ( ( 'for' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4130:1: ( 'for' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4130:1: ( 'for' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4131:1: 'for'
            {
             before(grammarAccess.getNoRainAccess().getForKeyword_2_0_0()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__NoRain__Group_2_0__0__Impl8390); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4144:1: rule__NoRain__Group_2_0__1 : rule__NoRain__Group_2_0__1__Impl rule__NoRain__Group_2_0__2 ;
    public final void rule__NoRain__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4148:1: ( rule__NoRain__Group_2_0__1__Impl rule__NoRain__Group_2_0__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4149:2: rule__NoRain__Group_2_0__1__Impl rule__NoRain__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_0__1__Impl_in_rule__NoRain__Group_2_0__18421);
            rule__NoRain__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_0__2_in_rule__NoRain__Group_2_0__18424);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4156:1: rule__NoRain__Group_2_0__1__Impl : ( ( rule__NoRain__ElapsedTimeAssignment_2_0_1 ) ) ;
    public final void rule__NoRain__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4160:1: ( ( ( rule__NoRain__ElapsedTimeAssignment_2_0_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4161:1: ( ( rule__NoRain__ElapsedTimeAssignment_2_0_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4161:1: ( ( rule__NoRain__ElapsedTimeAssignment_2_0_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4162:1: ( rule__NoRain__ElapsedTimeAssignment_2_0_1 )
            {
             before(grammarAccess.getNoRainAccess().getElapsedTimeAssignment_2_0_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4163:1: ( rule__NoRain__ElapsedTimeAssignment_2_0_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4163:2: rule__NoRain__ElapsedTimeAssignment_2_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__ElapsedTimeAssignment_2_0_1_in_rule__NoRain__Group_2_0__1__Impl8451);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4173:1: rule__NoRain__Group_2_0__2 : rule__NoRain__Group_2_0__2__Impl ;
    public final void rule__NoRain__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4177:1: ( rule__NoRain__Group_2_0__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4178:2: rule__NoRain__Group_2_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_0__2__Impl_in_rule__NoRain__Group_2_0__28481);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4184:1: rule__NoRain__Group_2_0__2__Impl : ( ( rule__NoRain__PeriodicityTypeAssignment_2_0_2 ) ) ;
    public final void rule__NoRain__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4188:1: ( ( ( rule__NoRain__PeriodicityTypeAssignment_2_0_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4189:1: ( ( rule__NoRain__PeriodicityTypeAssignment_2_0_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4189:1: ( ( rule__NoRain__PeriodicityTypeAssignment_2_0_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4190:1: ( rule__NoRain__PeriodicityTypeAssignment_2_0_2 )
            {
             before(grammarAccess.getNoRainAccess().getPeriodicityTypeAssignment_2_0_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4191:1: ( rule__NoRain__PeriodicityTypeAssignment_2_0_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4191:2: rule__NoRain__PeriodicityTypeAssignment_2_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__PeriodicityTypeAssignment_2_0_2_in_rule__NoRain__Group_2_0__2__Impl8508);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4207:1: rule__NoRain__Group_2_1__0 : rule__NoRain__Group_2_1__0__Impl rule__NoRain__Group_2_1__1 ;
    public final void rule__NoRain__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4211:1: ( rule__NoRain__Group_2_1__0__Impl rule__NoRain__Group_2_1__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4212:2: rule__NoRain__Group_2_1__0__Impl rule__NoRain__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_1__0__Impl_in_rule__NoRain__Group_2_1__08544);
            rule__NoRain__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_1__1_in_rule__NoRain__Group_2_1__08547);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4219:1: rule__NoRain__Group_2_1__0__Impl : ( 'since' ) ;
    public final void rule__NoRain__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4223:1: ( ( 'since' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4224:1: ( 'since' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4224:1: ( 'since' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4225:1: 'since'
            {
             before(grammarAccess.getNoRainAccess().getSinceKeyword_2_1_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__NoRain__Group_2_1__0__Impl8575); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4238:1: rule__NoRain__Group_2_1__1 : rule__NoRain__Group_2_1__1__Impl ;
    public final void rule__NoRain__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4242:1: ( rule__NoRain__Group_2_1__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4243:2: rule__NoRain__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__Group_2_1__1__Impl_in_rule__NoRain__Group_2_1__18606);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4249:1: rule__NoRain__Group_2_1__1__Impl : ( ( rule__NoRain__DateAssignment_2_1_1 ) ) ;
    public final void rule__NoRain__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4253:1: ( ( ( rule__NoRain__DateAssignment_2_1_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4254:1: ( ( rule__NoRain__DateAssignment_2_1_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4254:1: ( ( rule__NoRain__DateAssignment_2_1_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4255:1: ( rule__NoRain__DateAssignment_2_1_1 )
            {
             before(grammarAccess.getNoRainAccess().getDateAssignment_2_1_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4256:1: ( rule__NoRain__DateAssignment_2_1_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4256:2: rule__NoRain__DateAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRain__DateAssignment_2_1_1_in_rule__NoRain__Group_2_1__1__Impl8633);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4270:1: rule__GrainState__Group__0 : rule__GrainState__Group__0__Impl rule__GrainState__Group__1 ;
    public final void rule__GrainState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4274:1: ( rule__GrainState__Group__0__Impl rule__GrainState__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4275:2: rule__GrainState__Group__0__Impl rule__GrainState__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__0__Impl_in_rule__GrainState__Group__08667);
            rule__GrainState__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__1_in_rule__GrainState__Group__08670);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4282:1: rule__GrainState__Group__0__Impl : ( () ) ;
    public final void rule__GrainState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4286:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4287:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4287:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4288:1: ()
            {
             before(grammarAccess.getGrainStateAccess().getGrainStateAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4289:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4291:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4301:1: rule__GrainState__Group__1 : rule__GrainState__Group__1__Impl rule__GrainState__Group__2 ;
    public final void rule__GrainState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4305:1: ( rule__GrainState__Group__1__Impl rule__GrainState__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4306:2: rule__GrainState__Group__1__Impl rule__GrainState__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__1__Impl_in_rule__GrainState__Group__18728);
            rule__GrainState__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__2_in_rule__GrainState__Group__18731);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4313:1: rule__GrainState__Group__1__Impl : ( 'grain' ) ;
    public final void rule__GrainState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4317:1: ( ( 'grain' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4318:1: ( 'grain' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4318:1: ( 'grain' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4319:1: 'grain'
            {
             before(grammarAccess.getGrainStateAccess().getGrainKeyword_1()); 
            match(input,70,FollowSets000.FOLLOW_70_in_rule__GrainState__Group__1__Impl8759); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4332:1: rule__GrainState__Group__2 : rule__GrainState__Group__2__Impl rule__GrainState__Group__3 ;
    public final void rule__GrainState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4336:1: ( rule__GrainState__Group__2__Impl rule__GrainState__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4337:2: rule__GrainState__Group__2__Impl rule__GrainState__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__2__Impl_in_rule__GrainState__Group__28790);
            rule__GrainState__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__3_in_rule__GrainState__Group__28793);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4344:1: rule__GrainState__Group__2__Impl : ( 'is' ) ;
    public final void rule__GrainState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4348:1: ( ( 'is' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4349:1: ( 'is' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4349:1: ( 'is' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4350:1: 'is'
            {
             before(grammarAccess.getGrainStateAccess().getIsKeyword_2()); 
            match(input,71,FollowSets000.FOLLOW_71_in_rule__GrainState__Group__2__Impl8821); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4363:1: rule__GrainState__Group__3 : rule__GrainState__Group__3__Impl ;
    public final void rule__GrainState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4367:1: ( rule__GrainState__Group__3__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4368:2: rule__GrainState__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GrainState__Group__3__Impl_in_rule__GrainState__Group__38852);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4374:1: rule__GrainState__Group__3__Impl : ( ( rule__GrainState__StateAssignment_3 ) ) ;
    public final void rule__GrainState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4378:1: ( ( ( rule__GrainState__StateAssignment_3 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4379:1: ( ( rule__GrainState__StateAssignment_3 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4379:1: ( ( rule__GrainState__StateAssignment_3 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4380:1: ( rule__GrainState__StateAssignment_3 )
            {
             before(grammarAccess.getGrainStateAccess().getStateAssignment_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4381:1: ( rule__GrainState__StateAssignment_3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4381:2: rule__GrainState__StateAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GrainState__StateAssignment_3_in_rule__GrainState__Group__3__Impl8879);
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


    // $ANTLR start "rule__Elevage__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4399:1: rule__Elevage__Group__0 : rule__Elevage__Group__0__Impl rule__Elevage__Group__1 ;
    public final void rule__Elevage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4403:1: ( rule__Elevage__Group__0__Impl rule__Elevage__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4404:2: rule__Elevage__Group__0__Impl rule__Elevage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__0__Impl_in_rule__Elevage__Group__08917);
            rule__Elevage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__1_in_rule__Elevage__Group__08920);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4411:1: rule__Elevage__Group__0__Impl : ( () ) ;
    public final void rule__Elevage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4415:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4416:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4416:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4417:1: ()
            {
             before(grammarAccess.getElevageAccess().getElevageAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4418:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4420:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4430:1: rule__Elevage__Group__1 : rule__Elevage__Group__1__Impl rule__Elevage__Group__2 ;
    public final void rule__Elevage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4434:1: ( rule__Elevage__Group__1__Impl rule__Elevage__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4435:2: rule__Elevage__Group__1__Impl rule__Elevage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__1__Impl_in_rule__Elevage__Group__18978);
            rule__Elevage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__2_in_rule__Elevage__Group__18981);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4442:1: rule__Elevage__Group__1__Impl : ( 'Elevage' ) ;
    public final void rule__Elevage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4446:1: ( ( 'Elevage' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4447:1: ( 'Elevage' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4447:1: ( 'Elevage' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4448:1: 'Elevage'
            {
             before(grammarAccess.getElevageAccess().getElevageKeyword_1()); 
            match(input,72,FollowSets000.FOLLOW_72_in_rule__Elevage__Group__1__Impl9009); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4461:1: rule__Elevage__Group__2 : rule__Elevage__Group__2__Impl rule__Elevage__Group__3 ;
    public final void rule__Elevage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4465:1: ( rule__Elevage__Group__2__Impl rule__Elevage__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4466:2: rule__Elevage__Group__2__Impl rule__Elevage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__2__Impl_in_rule__Elevage__Group__29040);
            rule__Elevage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__3_in_rule__Elevage__Group__29043);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4473:1: rule__Elevage__Group__2__Impl : ( '{' ) ;
    public final void rule__Elevage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4477:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4478:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4478:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4479:1: '{'
            {
             before(grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Elevage__Group__2__Impl9071); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4492:1: rule__Elevage__Group__3 : rule__Elevage__Group__3__Impl rule__Elevage__Group__4 ;
    public final void rule__Elevage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4496:1: ( rule__Elevage__Group__3__Impl rule__Elevage__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4497:2: rule__Elevage__Group__3__Impl rule__Elevage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__3__Impl_in_rule__Elevage__Group__39102);
            rule__Elevage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__4_in_rule__Elevage__Group__39105);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4504:1: rule__Elevage__Group__3__Impl : ( ( rule__Elevage__Group_3__0 )? ) ;
    public final void rule__Elevage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4508:1: ( ( ( rule__Elevage__Group_3__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4509:1: ( ( rule__Elevage__Group_3__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4509:1: ( ( rule__Elevage__Group_3__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4510:1: ( rule__Elevage__Group_3__0 )?
            {
             before(grammarAccess.getElevageAccess().getGroup_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4511:1: ( rule__Elevage__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==65) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4511:2: rule__Elevage__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__0_in_rule__Elevage__Group__3__Impl9132);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4521:1: rule__Elevage__Group__4 : rule__Elevage__Group__4__Impl ;
    public final void rule__Elevage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4525:1: ( rule__Elevage__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4526:2: rule__Elevage__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__4__Impl_in_rule__Elevage__Group__49163);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4532:1: rule__Elevage__Group__4__Impl : ( '}' ) ;
    public final void rule__Elevage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4536:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4537:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4537:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4538:1: '}'
            {
             before(grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Elevage__Group__4__Impl9191); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4561:1: rule__Elevage__Group_3__0 : rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1 ;
    public final void rule__Elevage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4565:1: ( rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4566:2: rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__0__Impl_in_rule__Elevage__Group_3__09232);
            rule__Elevage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__1_in_rule__Elevage__Group_3__09235);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4573:1: rule__Elevage__Group_3__0__Impl : ( 'activity' ) ;
    public final void rule__Elevage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4577:1: ( ( 'activity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4578:1: ( 'activity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4578:1: ( 'activity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4579:1: 'activity'
            {
             before(grammarAccess.getElevageAccess().getActivityKeyword_3_0()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__Elevage__Group_3__0__Impl9263); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4592:1: rule__Elevage__Group_3__1 : rule__Elevage__Group_3__1__Impl ;
    public final void rule__Elevage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4596:1: ( rule__Elevage__Group_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4597:2: rule__Elevage__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__1__Impl_in_rule__Elevage__Group_3__19294);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4603:1: rule__Elevage__Group_3__1__Impl : ( ( rule__Elevage__ActivityAssignment_3_1 ) ) ;
    public final void rule__Elevage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4607:1: ( ( ( rule__Elevage__ActivityAssignment_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4608:1: ( ( rule__Elevage__ActivityAssignment_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4608:1: ( ( rule__Elevage__ActivityAssignment_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4609:1: ( rule__Elevage__ActivityAssignment_3_1 )
            {
             before(grammarAccess.getElevageAccess().getActivityAssignment_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4610:1: ( rule__Elevage__ActivityAssignment_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4610:2: rule__Elevage__ActivityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__ActivityAssignment_3_1_in_rule__Elevage__Group_3__1__Impl9321);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4624:1: rule__Culture__Group__0 : rule__Culture__Group__0__Impl rule__Culture__Group__1 ;
    public final void rule__Culture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4628:1: ( rule__Culture__Group__0__Impl rule__Culture__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4629:2: rule__Culture__Group__0__Impl rule__Culture__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__09355);
            rule__Culture__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__09358);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4636:1: rule__Culture__Group__0__Impl : ( () ) ;
    public final void rule__Culture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4640:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4641:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4641:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4642:1: ()
            {
             before(grammarAccess.getCultureAccess().getCultureAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4643:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4645:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4655:1: rule__Culture__Group__1 : rule__Culture__Group__1__Impl rule__Culture__Group__2 ;
    public final void rule__Culture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4659:1: ( rule__Culture__Group__1__Impl rule__Culture__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4660:2: rule__Culture__Group__1__Impl rule__Culture__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__19416);
            rule__Culture__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__19419);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4667:1: rule__Culture__Group__1__Impl : ( 'Culture' ) ;
    public final void rule__Culture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4671:1: ( ( 'Culture' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4672:1: ( 'Culture' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4672:1: ( 'Culture' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4673:1: 'Culture'
            {
             before(grammarAccess.getCultureAccess().getCultureKeyword_1()); 
            match(input,73,FollowSets000.FOLLOW_73_in_rule__Culture__Group__1__Impl9447); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4686:1: rule__Culture__Group__2 : rule__Culture__Group__2__Impl rule__Culture__Group__3 ;
    public final void rule__Culture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4690:1: ( rule__Culture__Group__2__Impl rule__Culture__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4691:2: rule__Culture__Group__2__Impl rule__Culture__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__29478);
            rule__Culture__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__29481);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4698:1: rule__Culture__Group__2__Impl : ( '{' ) ;
    public final void rule__Culture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4702:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4703:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4703:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4704:1: '{'
            {
             before(grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Culture__Group__2__Impl9509); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4717:1: rule__Culture__Group__3 : rule__Culture__Group__3__Impl rule__Culture__Group__4 ;
    public final void rule__Culture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4721:1: ( rule__Culture__Group__3__Impl rule__Culture__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4722:2: rule__Culture__Group__3__Impl rule__Culture__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__39540);
            rule__Culture__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__39543);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4729:1: rule__Culture__Group__3__Impl : ( ( rule__Culture__Group_3__0 )? ) ;
    public final void rule__Culture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4733:1: ( ( ( rule__Culture__Group_3__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4734:1: ( ( rule__Culture__Group_3__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4734:1: ( ( rule__Culture__Group_3__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4735:1: ( rule__Culture__Group_3__0 )?
            {
             before(grammarAccess.getCultureAccess().getGroup_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4736:1: ( rule__Culture__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==65) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4736:2: rule__Culture__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__0_in_rule__Culture__Group__3__Impl9570);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4746:1: rule__Culture__Group__4 : rule__Culture__Group__4__Impl ;
    public final void rule__Culture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4750:1: ( rule__Culture__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4751:2: rule__Culture__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__49601);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4757:1: rule__Culture__Group__4__Impl : ( '}' ) ;
    public final void rule__Culture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4761:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4762:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4762:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4763:1: '}'
            {
             before(grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Culture__Group__4__Impl9629); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4786:1: rule__Culture__Group_3__0 : rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1 ;
    public final void rule__Culture__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4790:1: ( rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4791:2: rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__0__Impl_in_rule__Culture__Group_3__09670);
            rule__Culture__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__1_in_rule__Culture__Group_3__09673);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4798:1: rule__Culture__Group_3__0__Impl : ( 'activity' ) ;
    public final void rule__Culture__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4802:1: ( ( 'activity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4803:1: ( 'activity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4803:1: ( 'activity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4804:1: 'activity'
            {
             before(grammarAccess.getCultureAccess().getActivityKeyword_3_0()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__Culture__Group_3__0__Impl9701); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4817:1: rule__Culture__Group_3__1 : rule__Culture__Group_3__1__Impl ;
    public final void rule__Culture__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4821:1: ( rule__Culture__Group_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4822:2: rule__Culture__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__1__Impl_in_rule__Culture__Group_3__19732);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4828:1: rule__Culture__Group_3__1__Impl : ( ( rule__Culture__ActivityAssignment_3_1 ) ) ;
    public final void rule__Culture__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4832:1: ( ( ( rule__Culture__ActivityAssignment_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4833:1: ( ( rule__Culture__ActivityAssignment_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4833:1: ( ( rule__Culture__ActivityAssignment_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4834:1: ( rule__Culture__ActivityAssignment_3_1 )
            {
             before(grammarAccess.getCultureAccess().getActivityAssignment_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4835:1: ( rule__Culture__ActivityAssignment_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4835:2: rule__Culture__ActivityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__ActivityAssignment_3_1_in_rule__Culture__Group_3__1__Impl9759);
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


    // $ANTLR start "rule__Atelier_Impl__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4850:1: rule__Atelier_Impl__Group__0 : rule__Atelier_Impl__Group__0__Impl rule__Atelier_Impl__Group__1 ;
    public final void rule__Atelier_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4854:1: ( rule__Atelier_Impl__Group__0__Impl rule__Atelier_Impl__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4855:2: rule__Atelier_Impl__Group__0__Impl rule__Atelier_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__0__Impl_in_rule__Atelier_Impl__Group__09794);
            rule__Atelier_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__1_in_rule__Atelier_Impl__Group__09797);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4862:1: rule__Atelier_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Atelier_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4866:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4867:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4867:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4868:1: ()
            {
             before(grammarAccess.getAtelier_ImplAccess().getAtelierAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4869:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4871:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4881:1: rule__Atelier_Impl__Group__1 : rule__Atelier_Impl__Group__1__Impl rule__Atelier_Impl__Group__2 ;
    public final void rule__Atelier_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4885:1: ( rule__Atelier_Impl__Group__1__Impl rule__Atelier_Impl__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4886:2: rule__Atelier_Impl__Group__1__Impl rule__Atelier_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__1__Impl_in_rule__Atelier_Impl__Group__19855);
            rule__Atelier_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__2_in_rule__Atelier_Impl__Group__19858);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4893:1: rule__Atelier_Impl__Group__1__Impl : ( 'Atelier' ) ;
    public final void rule__Atelier_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4897:1: ( ( 'Atelier' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4898:1: ( 'Atelier' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4898:1: ( 'Atelier' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4899:1: 'Atelier'
            {
             before(grammarAccess.getAtelier_ImplAccess().getAtelierKeyword_1()); 
            match(input,74,FollowSets000.FOLLOW_74_in_rule__Atelier_Impl__Group__1__Impl9886); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4912:1: rule__Atelier_Impl__Group__2 : rule__Atelier_Impl__Group__2__Impl rule__Atelier_Impl__Group__3 ;
    public final void rule__Atelier_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4916:1: ( rule__Atelier_Impl__Group__2__Impl rule__Atelier_Impl__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4917:2: rule__Atelier_Impl__Group__2__Impl rule__Atelier_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__2__Impl_in_rule__Atelier_Impl__Group__29917);
            rule__Atelier_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__3_in_rule__Atelier_Impl__Group__29920);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4924:1: rule__Atelier_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Atelier_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4928:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4929:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4929:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4930:1: '{'
            {
             before(grammarAccess.getAtelier_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Atelier_Impl__Group__2__Impl9948); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4943:1: rule__Atelier_Impl__Group__3 : rule__Atelier_Impl__Group__3__Impl rule__Atelier_Impl__Group__4 ;
    public final void rule__Atelier_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4947:1: ( rule__Atelier_Impl__Group__3__Impl rule__Atelier_Impl__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4948:2: rule__Atelier_Impl__Group__3__Impl rule__Atelier_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__3__Impl_in_rule__Atelier_Impl__Group__39979);
            rule__Atelier_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__4_in_rule__Atelier_Impl__Group__39982);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4955:1: rule__Atelier_Impl__Group__3__Impl : ( ( rule__Atelier_Impl__Group_3__0 )? ) ;
    public final void rule__Atelier_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4959:1: ( ( ( rule__Atelier_Impl__Group_3__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4960:1: ( ( rule__Atelier_Impl__Group_3__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4960:1: ( ( rule__Atelier_Impl__Group_3__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4961:1: ( rule__Atelier_Impl__Group_3__0 )?
            {
             before(grammarAccess.getAtelier_ImplAccess().getGroup_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4962:1: ( rule__Atelier_Impl__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==65) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4962:2: rule__Atelier_Impl__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__0_in_rule__Atelier_Impl__Group__3__Impl10009);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4972:1: rule__Atelier_Impl__Group__4 : rule__Atelier_Impl__Group__4__Impl ;
    public final void rule__Atelier_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4976:1: ( rule__Atelier_Impl__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4977:2: rule__Atelier_Impl__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__4__Impl_in_rule__Atelier_Impl__Group__410040);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4983:1: rule__Atelier_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__Atelier_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4987:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4988:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4988:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:4989:1: '}'
            {
             before(grammarAccess.getAtelier_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Atelier_Impl__Group__4__Impl10068); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5012:1: rule__Atelier_Impl__Group_3__0 : rule__Atelier_Impl__Group_3__0__Impl rule__Atelier_Impl__Group_3__1 ;
    public final void rule__Atelier_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5016:1: ( rule__Atelier_Impl__Group_3__0__Impl rule__Atelier_Impl__Group_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5017:2: rule__Atelier_Impl__Group_3__0__Impl rule__Atelier_Impl__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__0__Impl_in_rule__Atelier_Impl__Group_3__010109);
            rule__Atelier_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__1_in_rule__Atelier_Impl__Group_3__010112);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5024:1: rule__Atelier_Impl__Group_3__0__Impl : ( 'activity' ) ;
    public final void rule__Atelier_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5028:1: ( ( 'activity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5029:1: ( 'activity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5029:1: ( 'activity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5030:1: 'activity'
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityKeyword_3_0()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__Atelier_Impl__Group_3__0__Impl10140); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5043:1: rule__Atelier_Impl__Group_3__1 : rule__Atelier_Impl__Group_3__1__Impl ;
    public final void rule__Atelier_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5047:1: ( rule__Atelier_Impl__Group_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5048:2: rule__Atelier_Impl__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__1__Impl_in_rule__Atelier_Impl__Group_3__110171);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5054:1: rule__Atelier_Impl__Group_3__1__Impl : ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) ) ;
    public final void rule__Atelier_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5058:1: ( ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5059:1: ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5059:1: ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5060:1: ( rule__Atelier_Impl__ActivityAssignment_3_1 )
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityAssignment_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5061:1: ( rule__Atelier_Impl__ActivityAssignment_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5061:2: rule__Atelier_Impl__ActivityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__ActivityAssignment_3_1_in_rule__Atelier_Impl__Group_3__1__Impl10198);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5075:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5079:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5080:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__010232);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__010235);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5087:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5091:1: ( ( ( '-' )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5092:1: ( ( '-' )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5092:1: ( ( '-' )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5093:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5094:1: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==75) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5095:2: '-'
                    {
                    match(input,75,FollowSets000.FOLLOW_75_in_rule__EInt__Group__0__Impl10264); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5106:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5110:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5111:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__110297);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5117:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5121:1: ( ( RULE_INT ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5122:1: ( RULE_INT )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5122:1: ( RULE_INT )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5123:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl10324); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5138:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5142:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5143:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__010357);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__010360);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5150:1: rule__EFloat__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5154:1: ( ( RULE_INT ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5155:1: ( RULE_INT )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5155:1: ( RULE_INT )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5156:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__0__Impl10387); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5167:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5171:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5172:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__110416);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__110419);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5179:1: rule__EFloat__Group__1__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5183:1: ( ( '.' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5184:1: ( '.' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5184:1: ( '.' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5185:1: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
            match(input,76,FollowSets000.FOLLOW_76_in_rule__EFloat__Group__1__Impl10447); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5198:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5202:1: ( rule__EFloat__Group__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5203:2: rule__EFloat__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__210478);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5209:1: rule__EFloat__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5213:1: ( ( RULE_INT ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5214:1: ( RULE_INT )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5214:1: ( RULE_INT )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5215:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__2__Impl10505); 
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


    // $ANTLR start "rule__Model__NameAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5233:1: rule__Model__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5237:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5238:1: ( ruleEString )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5238:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5239:1: ruleEString
            {
             before(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Model__NameAssignment_210545);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5248:1: rule__Model__ActivityAssignment_4 : ( rulePeriodicActivity ) ;
    public final void rule__Model__ActivityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5252:1: ( ( rulePeriodicActivity ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5253:1: ( rulePeriodicActivity )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5253:1: ( rulePeriodicActivity )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5254:1: rulePeriodicActivity
            {
             before(grammarAccess.getModelAccess().getActivityPeriodicActivityParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicActivity_in_rule__Model__ActivityAssignment_410576);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5263:1: rule__PeriodicActivity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PeriodicActivity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5267:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5268:1: ( ruleEString )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5268:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5269:1: ruleEString
            {
             before(grammarAccess.getPeriodicActivityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeriodicActivity__NameAssignment_210607);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5278:1: rule__PeriodicActivity__AtelierAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__PeriodicActivity__AtelierAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5282:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5283:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5283:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5284:1: ( ruleEString )
            {
             before(grammarAccess.getPeriodicActivityAccess().getAtelierAtelierCrossReference_4_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5285:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5286:1: ruleEString
            {
             before(grammarAccess.getPeriodicActivityAccess().getAtelierAtelierEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeriodicActivity__AtelierAssignment_4_110642);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5297:1: rule__PeriodicActivity__StartAssignment_6 : ( ruleDate ) ;
    public final void rule__PeriodicActivity__StartAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5301:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5302:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5302:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5303:1: ruleDate
            {
             before(grammarAccess.getPeriodicActivityAccess().getStartDateParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__PeriodicActivity__StartAssignment_610677);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5312:1: rule__PeriodicActivity__EndAssignment_8 : ( ruleDate ) ;
    public final void rule__PeriodicActivity__EndAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5316:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5317:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5317:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5318:1: ruleDate
            {
             before(grammarAccess.getPeriodicActivityAccess().getEndDateParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__PeriodicActivity__EndAssignment_810708);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5327:1: rule__PeriodicActivity__FrequencyAssignment_10_1 : ( ruleEInt ) ;
    public final void rule__PeriodicActivity__FrequencyAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5331:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5332:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5332:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5333:1: ruleEInt
            {
             before(grammarAccess.getPeriodicActivityAccess().getFrequencyEIntParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__PeriodicActivity__FrequencyAssignment_10_110739);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5342:1: rule__PeriodicActivity__PeriodicityTypeAssignment_10_2 : ( rulePeriodicity ) ;
    public final void rule__PeriodicActivity__PeriodicityTypeAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5346:1: ( ( rulePeriodicity ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5347:1: ( rulePeriodicity )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5347:1: ( rulePeriodicity )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5348:1: rulePeriodicity
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_rule__PeriodicActivity__PeriodicityTypeAssignment_10_210770);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5357:1: rule__PeriodicActivity__ResAllocationAssignment_11_2 : ( ruleResAllocation ) ;
    public final void rule__PeriodicActivity__ResAllocationAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5361:1: ( ( ruleResAllocation ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5362:1: ( ruleResAllocation )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5362:1: ( ruleResAllocation )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5363:1: ruleResAllocation
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_11_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_11_210801);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5372:1: rule__PeriodicActivity__ResAllocationAssignment_11_3_1 : ( ruleResAllocation ) ;
    public final void rule__PeriodicActivity__ResAllocationAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5376:1: ( ( ruleResAllocation ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5377:1: ( ruleResAllocation )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5377:1: ( ruleResAllocation )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5378:1: ruleResAllocation
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_11_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_11_3_110832);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5387:1: rule__PeriodicActivity__RuleAssignment_12_2 : ( ruleBinaryExppression ) ;
    public final void rule__PeriodicActivity__RuleAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5391:1: ( ( ruleBinaryExppression ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5392:1: ( ruleBinaryExppression )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5392:1: ( ruleBinaryExppression )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5393:1: ruleBinaryExppression
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleBinaryExppressionParserRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_rule__PeriodicActivity__RuleAssignment_12_210863);
            ruleBinaryExppression();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getRuleBinaryExppressionParserRuleCall_12_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Date__DayAssignment_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5402:1: rule__Date__DayAssignment_1 : ( ruleEInt ) ;
    public final void rule__Date__DayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5406:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5407:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5407:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5408:1: ruleEInt
            {
             before(grammarAccess.getDateAccess().getDayEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Date__DayAssignment_110894);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5417:1: rule__Date__MonthAssignment_2 : ( ruleMonth ) ;
    public final void rule__Date__MonthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5421:1: ( ( ruleMonth ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5422:1: ( ruleMonth )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5422:1: ( ruleMonth )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5423:1: ruleMonth
            {
             before(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMonth_in_rule__Date__MonthAssignment_210925);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5432:1: rule__Date__YearAssignment_3 : ( ruleEInt ) ;
    public final void rule__Date__YearAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5436:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5437:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5437:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5438:1: ruleEInt
            {
             before(grammarAccess.getDateAccess().getYearEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Date__YearAssignment_310956);
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


    // $ANTLR start "rule__ResAllocation__RessourceAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5447:1: rule__ResAllocation__RessourceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__ResAllocation__RessourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5451:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5452:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5452:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5453:1: ( ruleEString )
            {
             before(grammarAccess.getResAllocationAccess().getRessourceRessourceCrossReference_2_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5454:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5455:1: ruleEString
            {
             before(grammarAccess.getResAllocationAccess().getRessourceRessourceEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ResAllocation__RessourceAssignment_210991);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5466:1: rule__ResAllocation__DurationAssignment_4 : ( ruleEInt ) ;
    public final void rule__ResAllocation__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5470:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5471:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5471:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5472:1: ruleEInt
            {
             before(grammarAccess.getResAllocationAccess().getDurationEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ResAllocation__DurationAssignment_411026);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5481:1: rule__ResAllocation__PeriodicityTypeAssignment_5 : ( rulePeriodicity ) ;
    public final void rule__ResAllocation__PeriodicityTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5485:1: ( ( rulePeriodicity ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5486:1: ( rulePeriodicity )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5486:1: ( rulePeriodicity )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5487:1: rulePeriodicity
            {
             before(grammarAccess.getResAllocationAccess().getPeriodicityTypePeriodicityEnumRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_rule__ResAllocation__PeriodicityTypeAssignment_511057);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5496:1: rule__Predicate__DateAssignment_0_1_1 : ( ruleDate ) ;
    public final void rule__Predicate__DateAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5500:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5501:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5501:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5502:1: ruleDate
            {
             before(grammarAccess.getPredicateAccess().getDateDateParserRuleCall_0_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__Predicate__DateAssignment_0_1_111088);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5511:1: rule__BinaryExppression__LeftAssignment_1_0 : ( rulePredicate ) ;
    public final void rule__BinaryExppression__LeftAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5515:1: ( ( rulePredicate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5516:1: ( rulePredicate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5516:1: ( rulePredicate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5517:1: rulePredicate
            {
             before(grammarAccess.getBinaryExppressionAccess().getLeftPredicateParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_rule__BinaryExppression__LeftAssignment_1_011119);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5526:1: rule__BinaryExppression__LeftAssignment_1_1_1 : ( ruleBinaryExppression ) ;
    public final void rule__BinaryExppression__LeftAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5530:1: ( ( ruleBinaryExppression ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5531:1: ( ruleBinaryExppression )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5531:1: ( ruleBinaryExppression )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5532:1: ruleBinaryExppression
            {
             before(grammarAccess.getBinaryExppressionAccess().getLeftBinaryExppressionParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_rule__BinaryExppression__LeftAssignment_1_1_111150);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5541:1: rule__BinaryExppression__OpeAssignment_2_0 : ( ruleBinaryExppressionType ) ;
    public final void rule__BinaryExppression__OpeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5545:1: ( ( ruleBinaryExppressionType ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5546:1: ( ruleBinaryExppressionType )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5546:1: ( ruleBinaryExppressionType )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5547:1: ruleBinaryExppressionType
            {
             before(grammarAccess.getBinaryExppressionAccess().getOpeBinaryExppressionTypeEnumRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExppressionType_in_rule__BinaryExppression__OpeAssignment_2_011181);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5556:1: rule__BinaryExppression__RightAssignment_2_1 : ( ruleBinaryExppression ) ;
    public final void rule__BinaryExppression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5560:1: ( ( ruleBinaryExppression ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5561:1: ( ruleBinaryExppression )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5561:1: ( ruleBinaryExppression )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5562:1: ruleBinaryExppression
            {
             before(grammarAccess.getBinaryExppressionAccess().getRightBinaryExppressionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_rule__BinaryExppression__RightAssignment_2_111212);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5571:1: rule__Temperature__ComparatorAssignment_2 : ( ruleComparator ) ;
    public final void rule__Temperature__ComparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5575:1: ( ( ruleComparator ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5576:1: ( ruleComparator )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5576:1: ( ruleComparator )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5577:1: ruleComparator
            {
             before(grammarAccess.getTemperatureAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_rule__Temperature__ComparatorAssignment_211243);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5586:1: rule__Temperature__ValueAssignment_4 : ( ruleEFloat ) ;
    public final void rule__Temperature__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5590:1: ( ( ruleEFloat ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5591:1: ( ruleEFloat )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5591:1: ( ruleEFloat )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5592:1: ruleEFloat
            {
             before(grammarAccess.getTemperatureAccess().getValueEFloatParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__Temperature__ValueAssignment_411274);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5601:1: rule__Precipitation__ComparatorAssignment_2 : ( ruleComparator ) ;
    public final void rule__Precipitation__ComparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5605:1: ( ( ruleComparator ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5606:1: ( ruleComparator )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5606:1: ( ruleComparator )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5607:1: ruleComparator
            {
             before(grammarAccess.getPrecipitationAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_rule__Precipitation__ComparatorAssignment_211305);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5616:1: rule__Precipitation__HeightAssignment_4 : ( ruleEFloat ) ;
    public final void rule__Precipitation__HeightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5620:1: ( ( ruleEFloat ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5621:1: ( ruleEFloat )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5621:1: ( ruleEFloat )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5622:1: ruleEFloat
            {
             before(grammarAccess.getPrecipitationAccess().getHeightEFloatParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__Precipitation__HeightAssignment_411336);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5631:1: rule__Rayonnement__ComparatorAssignment_2 : ( ruleComparator ) ;
    public final void rule__Rayonnement__ComparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5635:1: ( ( ruleComparator ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5636:1: ( ruleComparator )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5636:1: ( ruleComparator )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5637:1: ruleComparator
            {
             before(grammarAccess.getRayonnementAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_rule__Rayonnement__ComparatorAssignment_211367);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5646:1: rule__Rayonnement__ValueAssignment_4 : ( ruleEFloat ) ;
    public final void rule__Rayonnement__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5650:1: ( ( ruleEFloat ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5651:1: ( ruleEFloat )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5651:1: ( ruleEFloat )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5652:1: ruleEFloat
            {
             before(grammarAccess.getRayonnementAccess().getValueEFloatParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__Rayonnement__ValueAssignment_411398);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5661:1: rule__Evapotranspiration__ComparatorAssignment_2 : ( ruleComparator ) ;
    public final void rule__Evapotranspiration__ComparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5665:1: ( ( ruleComparator ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5666:1: ( ruleComparator )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5666:1: ( ruleComparator )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5667:1: ruleComparator
            {
             before(grammarAccess.getEvapotranspirationAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_rule__Evapotranspiration__ComparatorAssignment_211429);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5676:1: rule__Evapotranspiration__ValueAssignment_4 : ( ruleEFloat ) ;
    public final void rule__Evapotranspiration__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5680:1: ( ( ruleEFloat ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5681:1: ( ruleEFloat )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5681:1: ( ruleEFloat )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5682:1: ruleEFloat
            {
             before(grammarAccess.getEvapotranspirationAccess().getValueEFloatParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__Evapotranspiration__ValueAssignment_411460);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5691:1: rule__CheckDoneActivity__ActivityToValidateAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__CheckDoneActivity__ActivityToValidateAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5695:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5696:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5696:1: ( ( RULE_ID ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5697:1: ( RULE_ID )
            {
             before(grammarAccess.getCheckDoneActivityAccess().getActivityToValidatePeriodicActivityCrossReference_0_2_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5698:1: ( RULE_ID )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5699:1: RULE_ID
            {
             before(grammarAccess.getCheckDoneActivityAccess().getActivityToValidatePeriodicActivityIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__CheckDoneActivity__ActivityToValidateAssignment_0_211495); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5710:1: rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0 : ( ruleEInt ) ;
    public final void rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5714:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5715:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5715:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5716:1: ruleEInt
            {
             before(grammarAccess.getCheckDoneActivityAccess().getElapsedTimeEIntParserRuleCall_0_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_011530);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5725:1: rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1 : ( rulePeriodicity ) ;
    public final void rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5729:1: ( ( rulePeriodicity ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5730:1: ( rulePeriodicity )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5730:1: ( rulePeriodicity )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5731:1: rulePeriodicity
            {
             before(grammarAccess.getCheckDoneActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_0_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_111561);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5740:1: rule__CheckDoneActivity__DateAssignment_1 : ( ruleDate ) ;
    public final void rule__CheckDoneActivity__DateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5744:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5745:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5745:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5746:1: ruleDate
            {
             before(grammarAccess.getCheckDoneActivityAccess().getDateDateParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__CheckDoneActivity__DateAssignment_111592);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5755:1: rule__NoRain__ElapsedTimeAssignment_2_0_1 : ( ruleEInt ) ;
    public final void rule__NoRain__ElapsedTimeAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5759:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5760:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5760:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5761:1: ruleEInt
            {
             before(grammarAccess.getNoRainAccess().getElapsedTimeEIntParserRuleCall_2_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__NoRain__ElapsedTimeAssignment_2_0_111623);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5770:1: rule__NoRain__PeriodicityTypeAssignment_2_0_2 : ( rulePeriodicity ) ;
    public final void rule__NoRain__PeriodicityTypeAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5774:1: ( ( rulePeriodicity ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5775:1: ( rulePeriodicity )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5775:1: ( rulePeriodicity )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5776:1: rulePeriodicity
            {
             before(grammarAccess.getNoRainAccess().getPeriodicityTypePeriodicityEnumRuleCall_2_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_rule__NoRain__PeriodicityTypeAssignment_2_0_211654);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5785:1: rule__NoRain__DateAssignment_2_1_1 : ( ruleDate ) ;
    public final void rule__NoRain__DateAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5789:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5790:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5790:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5791:1: ruleDate
            {
             before(grammarAccess.getNoRainAccess().getDateDateParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__NoRain__DateAssignment_2_1_111685);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5800:1: rule__GrainState__StateAssignment_3 : ( ruleGrainStateEnum ) ;
    public final void rule__GrainState__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5804:1: ( ( ruleGrainStateEnum ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5805:1: ( ruleGrainStateEnum )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5805:1: ( ruleGrainStateEnum )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5806:1: ruleGrainStateEnum
            {
             before(grammarAccess.getGrainStateAccess().getStateGrainStateEnumEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrainStateEnum_in_rule__GrainState__StateAssignment_311716);
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


    // $ANTLR start "rule__Elevage__ActivityAssignment_3_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5815:1: rule__Elevage__ActivityAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Elevage__ActivityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5819:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5820:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5820:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5821:1: ( ruleEString )
            {
             before(grammarAccess.getElevageAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5822:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5823:1: ruleEString
            {
             before(grammarAccess.getElevageAccess().getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Elevage__ActivityAssignment_3_111751);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5834:1: rule__Culture__ActivityAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Culture__ActivityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5838:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5839:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5839:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5840:1: ( ruleEString )
            {
             before(grammarAccess.getCultureAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5841:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5842:1: ruleEString
            {
             before(grammarAccess.getCultureAccess().getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Culture__ActivityAssignment_3_111790);
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


    // $ANTLR start "rule__Atelier_Impl__ActivityAssignment_3_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5854:1: rule__Atelier_Impl__ActivityAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Atelier_Impl__ActivityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5858:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5859:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5859:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5860:1: ( ruleEString )
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5861:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:5862:1: ruleEString
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Atelier_Impl__ActivityAssignment_3_111830);
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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicActivity_in_entryRulePeriodicActivity121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePeriodicActivity128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__0_in_rulePeriodicActivity154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0_in_ruleDate214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_entryRuleResAllocation241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResAllocation248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__0_in_ruleResAllocation274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicate308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Alternatives_in_rulePredicate334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_entryRuleBinaryExppression361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryExppression368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group__0_in_ruleBinaryExppression394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperature_in_entryRuleTemperature421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemperature428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__Group__0_in_ruleTemperature454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrecipitation_in_entryRulePrecipitation481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrecipitation488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__0_in_rulePrecipitation514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRayonnement_in_entryRuleRayonnement541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRayonnement548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__0_in_ruleRayonnement574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvapotranspiration_in_entryRuleEvapotranspiration601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvapotranspiration608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__0_in_ruleEvapotranspiration634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckDoneActivity_in_entryRuleCheckDoneActivity661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCheckDoneActivity668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Alternatives_in_ruleCheckDoneActivity694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRain_in_entryRuleNoRain721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoRain728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group__0_in_ruleNoRain754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrainState_in_entryRuleGrainState781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrainState788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GrainState__Group__0_in_ruleGrainState814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElevage_in_entryRuleElevage843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElevage850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__0_in_ruleElevage876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCulture_in_entryRuleCulture903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCulture910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__0_in_ruleCulture936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtelier_Impl972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__0_in_ruleAtelier_Impl998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1025 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt1118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat1145 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0_in_ruleEFloat1178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Periodicity__Alternatives_in_rulePeriodicity1215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Month__Alternatives_in_ruleMonth1251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comparator__Alternatives_in_ruleComparator1287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppressionType__Alternatives_in_ruleBinaryExppressionType1323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GrainStateEnum__Alternatives_in_ruleGrainStateEnum1359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0__0_in_rule__Predicate__Alternatives1394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckDoneActivity_in_rule__Predicate__Alternatives1412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRain_in_rule__Predicate__Alternatives1429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperature_in_rule__Predicate__Alternatives1446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrecipitation_in_rule__Predicate__Alternatives1463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRayonnement_in_rule__Predicate__Alternatives1480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvapotranspiration_in_rule__Predicate__Alternatives1497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrainState_in_rule__Predicate__Alternatives1514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__LeftAssignment_1_0_in_rule__BinaryExppression__Alternatives_11546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_1_1__0_in_rule__BinaryExppression__Alternatives_11564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Temperature__Alternatives_11598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Temperature__Alternatives_11618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Precipitation__Alternatives_11653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Precipitation__Alternatives_11673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Rayonnement__Alternatives_11708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Rayonnement__Alternatives_11728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Evapotranspiration__Alternatives_11763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Evapotranspiration__Alternatives_11783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__0_in_rule__CheckDoneActivity__Alternatives1817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__DateAssignment_1_in_rule__CheckDoneActivity__Alternatives1835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_0__0_in_rule__NoRain__Alternatives_21868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_1__0_in_rule__NoRain__Alternatives_21886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Periodicity__Alternatives1970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Periodicity__Alternatives1991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Periodicity__Alternatives2012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Periodicity__Alternatives2033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Periodicity__Alternatives2054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Month__Alternatives2090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Month__Alternatives2111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Month__Alternatives2132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Month__Alternatives2153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Month__Alternatives2174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Month__Alternatives2195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Month__Alternatives2216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Month__Alternatives2237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Month__Alternatives2258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Month__Alternatives2279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Month__Alternatives2300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Month__Alternatives2321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Comparator__Alternatives2357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Comparator__Alternatives2378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Comparator__Alternatives2399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Comparator__Alternatives2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Comparator__Alternatives2441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Comparator__Alternatives2462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__BinaryExppressionType__Alternatives2498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__BinaryExppressionType__Alternatives2519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__BinaryExppressionType__Alternatives2540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__GrainStateEnum__Alternatives2576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__GrainStateEnum__Alternatives2597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02630 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12691 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Model__Group__1__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22753 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl2783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32813 = new BitSet(new long[]{0x0006000000000000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Model__Group__3__Impl2844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42875 = new BitSet(new long[]{0x0006000000000000L});
        public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ActivityAssignment_4_in_rule__Model__Group__4__Impl2905 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Model__Group__5__Impl2964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__0__Impl_in_rule__PeriodicActivity__Group__03007 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__1_in_rule__PeriodicActivity__Group__03010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__1__Impl_in_rule__PeriodicActivity__Group__13068 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__2_in_rule__PeriodicActivity__Group__13071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__PeriodicActivity__Group__1__Impl3099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__2__Impl_in_rule__PeriodicActivity__Group__23130 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__3_in_rule__PeriodicActivity__Group__23133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__NameAssignment_2_in_rule__PeriodicActivity__Group__2__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__3__Impl_in_rule__PeriodicActivity__Group__33190 = new BitSet(new long[]{0x0048000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__4_in_rule__PeriodicActivity__Group__33193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__PeriodicActivity__Group__3__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__4__Impl_in_rule__PeriodicActivity__Group__43252 = new BitSet(new long[]{0x0048000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__5_in_rule__PeriodicActivity__Group__43255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__0_in_rule__PeriodicActivity__Group__4__Impl3282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__5__Impl_in_rule__PeriodicActivity__Group__53313 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000800L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__6_in_rule__PeriodicActivity__Group__53316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__PeriodicActivity__Group__5__Impl3344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__6__Impl_in_rule__PeriodicActivity__Group__63375 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__7_in_rule__PeriodicActivity__Group__63378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__StartAssignment_6_in_rule__PeriodicActivity__Group__6__Impl3405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__7__Impl_in_rule__PeriodicActivity__Group__73435 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000800L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__8_in_rule__PeriodicActivity__Group__73438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__PeriodicActivity__Group__7__Impl3466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__8__Impl_in_rule__PeriodicActivity__Group__83497 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__9_in_rule__PeriodicActivity__Group__83500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__EndAssignment_8_in_rule__PeriodicActivity__Group__8__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__9__Impl_in_rule__PeriodicActivity__Group__93557 = new BitSet(new long[]{0x0382000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__10_in_rule__PeriodicActivity__Group__93560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__PeriodicActivity__Group__9__Impl3588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__10__Impl_in_rule__PeriodicActivity__Group__103619 = new BitSet(new long[]{0x0382000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__11_in_rule__PeriodicActivity__Group__103622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__0_in_rule__PeriodicActivity__Group__10__Impl3649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__11__Impl_in_rule__PeriodicActivity__Group__113680 = new BitSet(new long[]{0x0382000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__12_in_rule__PeriodicActivity__Group__113683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__0_in_rule__PeriodicActivity__Group__11__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__12__Impl_in_rule__PeriodicActivity__Group__123741 = new BitSet(new long[]{0x0382000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__13_in_rule__PeriodicActivity__Group__123744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__0_in_rule__PeriodicActivity__Group__12__Impl3771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__13__Impl_in_rule__PeriodicActivity__Group__133802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__PeriodicActivity__Group__13__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__0__Impl_in_rule__PeriodicActivity__Group_4__03889 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__1_in_rule__PeriodicActivity__Group_4__03892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__PeriodicActivity__Group_4__0__Impl3920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__1__Impl_in_rule__PeriodicActivity__Group_4__13951 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__2_in_rule__PeriodicActivity__Group_4__13954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__AtelierAssignment_4_1_in_rule__PeriodicActivity__Group_4__1__Impl3981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__2__Impl_in_rule__PeriodicActivity__Group_4__24011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__PeriodicActivity__Group_4__2__Impl4039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__0__Impl_in_rule__PeriodicActivity__Group_10__04076 = new BitSet(new long[]{0x0000000000F80040L,0x0000000000000800L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__1_in_rule__PeriodicActivity__Group_10__04079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__PeriodicActivity__Group_10__0__Impl4107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__1__Impl_in_rule__PeriodicActivity__Group_10__14138 = new BitSet(new long[]{0x0000000000F80040L,0x0000000000000800L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__2_in_rule__PeriodicActivity__Group_10__14141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__FrequencyAssignment_10_1_in_rule__PeriodicActivity__Group_10__1__Impl4168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__2__Impl_in_rule__PeriodicActivity__Group_10__24199 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__3_in_rule__PeriodicActivity__Group_10__24202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__PeriodicityTypeAssignment_10_2_in_rule__PeriodicActivity__Group_10__2__Impl4229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_10__3__Impl_in_rule__PeriodicActivity__Group_10__34259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__PeriodicActivity__Group_10__3__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__0__Impl_in_rule__PeriodicActivity__Group_11__04326 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__1_in_rule__PeriodicActivity__Group_11__04329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__PeriodicActivity__Group_11__0__Impl4357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__1__Impl_in_rule__PeriodicActivity__Group_11__14388 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__2_in_rule__PeriodicActivity__Group_11__14391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__PeriodicActivity__Group_11__1__Impl4419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__2__Impl_in_rule__PeriodicActivity__Group_11__24450 = new BitSet(new long[]{0x0022000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__3_in_rule__PeriodicActivity__Group_11__24453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_11_2_in_rule__PeriodicActivity__Group_11__2__Impl4480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__3__Impl_in_rule__PeriodicActivity__Group_11__34510 = new BitSet(new long[]{0x0022000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__4_in_rule__PeriodicActivity__Group_11__34513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11_3__0_in_rule__PeriodicActivity__Group_11__3__Impl4540 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__4__Impl_in_rule__PeriodicActivity__Group_11__44571 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__5_in_rule__PeriodicActivity__Group_11__44574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__PeriodicActivity__Group_11__4__Impl4602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__5__Impl_in_rule__PeriodicActivity__Group_11__54633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__PeriodicActivity__Group_11__5__Impl4661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11_3__0__Impl_in_rule__PeriodicActivity__Group_11_3__04704 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11_3__1_in_rule__PeriodicActivity__Group_11_3__04707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__PeriodicActivity__Group_11_3__0__Impl4735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11_3__1__Impl_in_rule__PeriodicActivity__Group_11_3__14766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_11_3_1_in_rule__PeriodicActivity__Group_11_3__1__Impl4793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__0__Impl_in_rule__PeriodicActivity__Group_12__04827 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__1_in_rule__PeriodicActivity__Group_12__04830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__PeriodicActivity__Group_12__0__Impl4858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__1__Impl_in_rule__PeriodicActivity__Group_12__14889 = new BitSet(new long[]{0x600000000007F840L,0x0000000000000852L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__2_in_rule__PeriodicActivity__Group_12__14892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__PeriodicActivity__Group_12__1__Impl4920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__2__Impl_in_rule__PeriodicActivity__Group_12__24951 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__3_in_rule__PeriodicActivity__Group_12__24954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__RuleAssignment_12_2_in_rule__PeriodicActivity__Group_12__2__Impl4981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__3__Impl_in_rule__PeriodicActivity__Group_12__35011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__PeriodicActivity__Group_12__3__Impl5039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__05078 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__05081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__15139 = new BitSet(new long[]{0x0000000FFF000000L});
        public static final BitSet FOLLOW_rule__Date__Group__2_in_rule__Date__Group__15142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl5169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__25199 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Date__Group__3_in_rule__Date__Group__25202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__MonthAssignment_2_in_rule__Date__Group__2__Impl5229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__35259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__YearAssignment_3_in_rule__Date__Group__3__Impl5286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__0__Impl_in_rule__ResAllocation__Group__05324 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__1_in_rule__ResAllocation__Group__05327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__1__Impl_in_rule__ResAllocation__Group__15385 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__2_in_rule__ResAllocation__Group__15388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__ResAllocation__Group__1__Impl5416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__2__Impl_in_rule__ResAllocation__Group__25447 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__3_in_rule__ResAllocation__Group__25450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__RessourceAssignment_2_in_rule__ResAllocation__Group__2__Impl5477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__3__Impl_in_rule__ResAllocation__Group__35507 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000800L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__4_in_rule__ResAllocation__Group__35510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__ResAllocation__Group__3__Impl5538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__4__Impl_in_rule__ResAllocation__Group__45569 = new BitSet(new long[]{0x0000000000F80040L,0x0000000000000800L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__5_in_rule__ResAllocation__Group__45572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__DurationAssignment_4_in_rule__ResAllocation__Group__4__Impl5599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__5__Impl_in_rule__ResAllocation__Group__55629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__PeriodicityTypeAssignment_5_in_rule__ResAllocation__Group__5__Impl5656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0__0__Impl_in_rule__Predicate__Group_0__05698 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0__1_in_rule__Predicate__Group_0__05701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0__1__Impl_in_rule__Predicate__Group_0__15759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0_1__0_in_rule__Predicate__Group_0__1__Impl5786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0_1__0__Impl_in_rule__Predicate__Group_0_1__05820 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0_1__1_in_rule__Predicate__Group_0_1__05823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__Predicate__Group_0_1__0__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__Group_0_1__1__Impl_in_rule__Predicate__Group_0_1__15882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Predicate__DateAssignment_0_1_1_in_rule__Predicate__Group_0_1__1__Impl5909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group__0__Impl_in_rule__BinaryExppression__Group__05943 = new BitSet(new long[]{0x600000000007F840L,0x0000000000000852L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group__1_in_rule__BinaryExppression__Group__05946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group__1__Impl_in_rule__BinaryExppression__Group__16004 = new BitSet(new long[]{0x00001C0000000000L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group__2_in_rule__BinaryExppression__Group__16007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Alternatives_1_in_rule__BinaryExppression__Group__1__Impl6034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group__2__Impl_in_rule__BinaryExppression__Group__26064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_2__0_in_rule__BinaryExppression__Group__2__Impl6091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_1_1__0__Impl_in_rule__BinaryExppression__Group_1_1__06128 = new BitSet(new long[]{0x600000000007F840L,0x0000000000000852L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_1_1__1_in_rule__BinaryExppression__Group_1_1__06131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__BinaryExppression__Group_1_1__0__Impl6159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_1_1__1__Impl_in_rule__BinaryExppression__Group_1_1__16190 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_1_1__2_in_rule__BinaryExppression__Group_1_1__16193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__LeftAssignment_1_1_1_in_rule__BinaryExppression__Group_1_1__1__Impl6220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_1_1__2__Impl_in_rule__BinaryExppression__Group_1_1__26250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__BinaryExppression__Group_1_1__2__Impl6278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_2__0__Impl_in_rule__BinaryExppression__Group_2__06315 = new BitSet(new long[]{0x600000000007F840L,0x0000000000000852L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_2__1_in_rule__BinaryExppression__Group_2__06318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__OpeAssignment_2_0_in_rule__BinaryExppression__Group_2__0__Impl6345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__Group_2__1__Impl_in_rule__BinaryExppression__Group_2__16375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryExppression__RightAssignment_2_1_in_rule__BinaryExppression__Group_2__1__Impl6402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__Group__0__Impl_in_rule__Temperature__Group__06436 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Temperature__Group__1_in_rule__Temperature__Group__06439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__Group__1__Impl_in_rule__Temperature__Group__16497 = new BitSet(new long[]{0x000003F000000000L});
        public static final BitSet FOLLOW_rule__Temperature__Group__2_in_rule__Temperature__Group__16500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__Alternatives_1_in_rule__Temperature__Group__1__Impl6527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__Group__2__Impl_in_rule__Temperature__Group__26557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Temperature__Group__3_in_rule__Temperature__Group__26560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__ComparatorAssignment_2_in_rule__Temperature__Group__2__Impl6587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__Group__3__Impl_in_rule__Temperature__Group__36617 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Temperature__Group__4_in_rule__Temperature__Group__36620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__Temperature__Group__3__Impl6648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__Group__4__Impl_in_rule__Temperature__Group__46679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Temperature__ValueAssignment_4_in_rule__Temperature__Group__4__Impl6706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__0__Impl_in_rule__Precipitation__Group__06746 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__1_in_rule__Precipitation__Group__06749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__1__Impl_in_rule__Precipitation__Group__16807 = new BitSet(new long[]{0x000003F000000000L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__2_in_rule__Precipitation__Group__16810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__Alternatives_1_in_rule__Precipitation__Group__1__Impl6837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__2__Impl_in_rule__Precipitation__Group__26867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__3_in_rule__Precipitation__Group__26870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__ComparatorAssignment_2_in_rule__Precipitation__Group__2__Impl6897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__3__Impl_in_rule__Precipitation__Group__36927 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__4_in_rule__Precipitation__Group__36930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__Precipitation__Group__3__Impl6958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__Group__4__Impl_in_rule__Precipitation__Group__46989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Precipitation__HeightAssignment_4_in_rule__Precipitation__Group__4__Impl7016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__0__Impl_in_rule__Rayonnement__Group__07056 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__1_in_rule__Rayonnement__Group__07059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__1__Impl_in_rule__Rayonnement__Group__17117 = new BitSet(new long[]{0x000003F000000000L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__2_in_rule__Rayonnement__Group__17120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__Alternatives_1_in_rule__Rayonnement__Group__1__Impl7147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__2__Impl_in_rule__Rayonnement__Group__27177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__3_in_rule__Rayonnement__Group__27180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__ComparatorAssignment_2_in_rule__Rayonnement__Group__2__Impl7207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__3__Impl_in_rule__Rayonnement__Group__37237 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__4_in_rule__Rayonnement__Group__37240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__Rayonnement__Group__3__Impl7268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__Group__4__Impl_in_rule__Rayonnement__Group__47299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rayonnement__ValueAssignment_4_in_rule__Rayonnement__Group__4__Impl7326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__0__Impl_in_rule__Evapotranspiration__Group__07366 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__1_in_rule__Evapotranspiration__Group__07369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__1__Impl_in_rule__Evapotranspiration__Group__17427 = new BitSet(new long[]{0x000003F000000000L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__2_in_rule__Evapotranspiration__Group__17430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Alternatives_1_in_rule__Evapotranspiration__Group__1__Impl7457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__2__Impl_in_rule__Evapotranspiration__Group__27487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__3_in_rule__Evapotranspiration__Group__27490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__ComparatorAssignment_2_in_rule__Evapotranspiration__Group__2__Impl7517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__3__Impl_in_rule__Evapotranspiration__Group__37547 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__4_in_rule__Evapotranspiration__Group__37550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__Evapotranspiration__Group__3__Impl7578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__Group__4__Impl_in_rule__Evapotranspiration__Group__47609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Evapotranspiration__ValueAssignment_4_in_rule__Evapotranspiration__Group__4__Impl7636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__0__Impl_in_rule__CheckDoneActivity__Group_0__07676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__1_in_rule__CheckDoneActivity__Group_0__07679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__1__Impl_in_rule__CheckDoneActivity__Group_0__17737 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__2_in_rule__CheckDoneActivity__Group_0__17740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__CheckDoneActivity__Group_0__1__Impl7768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__2__Impl_in_rule__CheckDoneActivity__Group_0__27799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__3_in_rule__CheckDoneActivity__Group_0__27802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__ActivityToValidateAssignment_0_2_in_rule__CheckDoneActivity__Group_0__2__Impl7829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__3__Impl_in_rule__CheckDoneActivity__Group_0__37859 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000800L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__4_in_rule__CheckDoneActivity__Group_0__37862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rule__CheckDoneActivity__Group_0__3__Impl7890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0__4__Impl_in_rule__CheckDoneActivity__Group_0__47921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0_4__0_in_rule__CheckDoneActivity__Group_0__4__Impl7948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0_4__0__Impl_in_rule__CheckDoneActivity__Group_0_4__07988 = new BitSet(new long[]{0x0000000000F80040L,0x0000000000000800L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0_4__1_in_rule__CheckDoneActivity__Group_0_4__07991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_0_in_rule__CheckDoneActivity__Group_0_4__0__Impl8018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0_4__1__Impl_in_rule__CheckDoneActivity__Group_0_4__18048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0_4__2_in_rule__CheckDoneActivity__Group_0_4__18051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_1_in_rule__CheckDoneActivity__Group_0_4__1__Impl8078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CheckDoneActivity__Group_0_4__2__Impl_in_rule__CheckDoneActivity__Group_0_4__28108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rule__CheckDoneActivity__Group_0_4__2__Impl8136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group__0__Impl_in_rule__NoRain__Group__08173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_rule__NoRain__Group__1_in_rule__NoRain__Group__08176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group__1__Impl_in_rule__NoRain__Group__18234 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__NoRain__Group__2_in_rule__NoRain__Group__18237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_rule__NoRain__Group__1__Impl8265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group__2__Impl_in_rule__NoRain__Group__28296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Alternatives_2_in_rule__NoRain__Group__2__Impl8323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_0__0__Impl_in_rule__NoRain__Group_2_0__08359 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000800L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_0__1_in_rule__NoRain__Group_2_0__08362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__NoRain__Group_2_0__0__Impl8390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_0__1__Impl_in_rule__NoRain__Group_2_0__18421 = new BitSet(new long[]{0x0000000000F80040L,0x0000000000000800L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_0__2_in_rule__NoRain__Group_2_0__18424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__ElapsedTimeAssignment_2_0_1_in_rule__NoRain__Group_2_0__1__Impl8451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_0__2__Impl_in_rule__NoRain__Group_2_0__28481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__PeriodicityTypeAssignment_2_0_2_in_rule__NoRain__Group_2_0__2__Impl8508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_1__0__Impl_in_rule__NoRain__Group_2_1__08544 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000800L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_1__1_in_rule__NoRain__Group_2_1__08547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__NoRain__Group_2_1__0__Impl8575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__Group_2_1__1__Impl_in_rule__NoRain__Group_2_1__18606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRain__DateAssignment_2_1_1_in_rule__NoRain__Group_2_1__1__Impl8633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GrainState__Group__0__Impl_in_rule__GrainState__Group__08667 = new BitSet(new long[]{0x200000000007F840L,0x0000000000000852L});
        public static final BitSet FOLLOW_rule__GrainState__Group__1_in_rule__GrainState__Group__08670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GrainState__Group__1__Impl_in_rule__GrainState__Group__18728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_rule__GrainState__Group__2_in_rule__GrainState__Group__18731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_rule__GrainState__Group__1__Impl8759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GrainState__Group__2__Impl_in_rule__GrainState__Group__28790 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_rule__GrainState__Group__3_in_rule__GrainState__Group__28793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_rule__GrainState__Group__2__Impl8821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GrainState__Group__3__Impl_in_rule__GrainState__Group__38852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GrainState__StateAssignment_3_in_rule__GrainState__Group__3__Impl8879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__0__Impl_in_rule__Elevage__Group__08917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Elevage__Group__1_in_rule__Elevage__Group__08920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__1__Impl_in_rule__Elevage__Group__18978 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Elevage__Group__2_in_rule__Elevage__Group__18981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_rule__Elevage__Group__1__Impl9009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__2__Impl_in_rule__Elevage__Group__29040 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__3_in_rule__Elevage__Group__29043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Elevage__Group__2__Impl9071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__3__Impl_in_rule__Elevage__Group__39102 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__4_in_rule__Elevage__Group__39105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__0_in_rule__Elevage__Group__3__Impl9132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__4__Impl_in_rule__Elevage__Group__49163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Elevage__Group__4__Impl9191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__0__Impl_in_rule__Elevage__Group_3__09232 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__1_in_rule__Elevage__Group_3__09235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__Elevage__Group_3__0__Impl9263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__1__Impl_in_rule__Elevage__Group_3__19294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__ActivityAssignment_3_1_in_rule__Elevage__Group_3__1__Impl9321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__09355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__09358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__19416 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__19419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_rule__Culture__Group__1__Impl9447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__29478 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__29481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Culture__Group__2__Impl9509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__39540 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__39543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__0_in_rule__Culture__Group__3__Impl9570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__49601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Culture__Group__4__Impl9629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__0__Impl_in_rule__Culture__Group_3__09670 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__1_in_rule__Culture__Group_3__09673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__Culture__Group_3__0__Impl9701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__1__Impl_in_rule__Culture__Group_3__19732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__ActivityAssignment_3_1_in_rule__Culture__Group_3__1__Impl9759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__0__Impl_in_rule__Atelier_Impl__Group__09794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__1_in_rule__Atelier_Impl__Group__09797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__1__Impl_in_rule__Atelier_Impl__Group__19855 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__2_in_rule__Atelier_Impl__Group__19858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rule__Atelier_Impl__Group__1__Impl9886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__2__Impl_in_rule__Atelier_Impl__Group__29917 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__3_in_rule__Atelier_Impl__Group__29920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Atelier_Impl__Group__2__Impl9948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__3__Impl_in_rule__Atelier_Impl__Group__39979 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__4_in_rule__Atelier_Impl__Group__39982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__0_in_rule__Atelier_Impl__Group__3__Impl10009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__4__Impl_in_rule__Atelier_Impl__Group__410040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Atelier_Impl__Group__4__Impl10068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__0__Impl_in_rule__Atelier_Impl__Group_3__010109 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__1_in_rule__Atelier_Impl__Group_3__010112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__Atelier_Impl__Group_3__0__Impl10140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__1__Impl_in_rule__Atelier_Impl__Group_3__110171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__ActivityAssignment_3_1_in_rule__Atelier_Impl__Group_3__1__Impl10198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__010232 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000800L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__010235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_rule__EInt__Group__0__Impl10264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__110297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl10324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__010357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__010360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__0__Impl10387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__110416 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__110419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_rule__EFloat__Group__1__Impl10447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__210478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__2__Impl10505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Model__NameAssignment_210545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicActivity_in_rule__Model__ActivityAssignment_410576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeriodicActivity__NameAssignment_210607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeriodicActivity__AtelierAssignment_4_110642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__PeriodicActivity__StartAssignment_610677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__PeriodicActivity__EndAssignment_810708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__PeriodicActivity__FrequencyAssignment_10_110739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicity_in_rule__PeriodicActivity__PeriodicityTypeAssignment_10_210770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_11_210801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_11_3_110832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_rule__PeriodicActivity__RuleAssignment_12_210863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Date__DayAssignment_110894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMonth_in_rule__Date__MonthAssignment_210925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Date__YearAssignment_310956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ResAllocation__RessourceAssignment_210991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ResAllocation__DurationAssignment_411026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicity_in_rule__ResAllocation__PeriodicityTypeAssignment_511057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__Predicate__DateAssignment_0_1_111088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_rule__BinaryExppression__LeftAssignment_1_011119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_rule__BinaryExppression__LeftAssignment_1_1_111150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExppressionType_in_rule__BinaryExppression__OpeAssignment_2_011181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_rule__BinaryExppression__RightAssignment_2_111212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparator_in_rule__Temperature__ComparatorAssignment_211243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__Temperature__ValueAssignment_411274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparator_in_rule__Precipitation__ComparatorAssignment_211305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__Precipitation__HeightAssignment_411336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparator_in_rule__Rayonnement__ComparatorAssignment_211367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__Rayonnement__ValueAssignment_411398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparator_in_rule__Evapotranspiration__ComparatorAssignment_211429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__Evapotranspiration__ValueAssignment_411460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__CheckDoneActivity__ActivityToValidateAssignment_0_211495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__CheckDoneActivity__ElapsedTimeAssignment_0_4_011530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicity_in_rule__CheckDoneActivity__PeriodicityTypeAssignment_0_4_111561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__CheckDoneActivity__DateAssignment_111592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__NoRain__ElapsedTimeAssignment_2_0_111623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicity_in_rule__NoRain__PeriodicityTypeAssignment_2_0_211654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__NoRain__DateAssignment_2_1_111685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrainStateEnum_in_rule__GrainState__StateAssignment_311716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Elevage__ActivityAssignment_3_111751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Culture__ActivityAssignment_3_111790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Atelier_Impl__ActivityAssignment_3_111830 = new BitSet(new long[]{0x0000000000000002L});
    }


}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'hour'", "'day'", "'week'", "'month'", "'year'", "'PeriodicActivity'", "'{'", "'start'", "','", "'end'", "'}'", "'atelier'", "'every'", "'allocate'", "'} ,'", "'rules'", "'from'", "'reserve'", "'for'", "'pre'", "'Atelier'", "'activity'", "'-'", "'Elevage'", "'Culture'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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




    // $ANTLR start "entryRulePeriodicActivity"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:60:1: entryRulePeriodicActivity : rulePeriodicActivity EOF ;
    public final void entryRulePeriodicActivity() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:61:1: ( rulePeriodicActivity EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:62:1: rulePeriodicActivity EOF
            {
             before(grammarAccess.getPeriodicActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicActivity_in_entryRulePeriodicActivity61);
            rulePeriodicActivity();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePeriodicActivity68); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:69:1: rulePeriodicActivity : ( ( rule__PeriodicActivity__Group__0 ) ) ;
    public final void rulePeriodicActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:73:2: ( ( ( rule__PeriodicActivity__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:74:1: ( ( rule__PeriodicActivity__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:74:1: ( ( rule__PeriodicActivity__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:75:1: ( rule__PeriodicActivity__Group__0 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:76:1: ( rule__PeriodicActivity__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:76:2: rule__PeriodicActivity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__0_in_rulePeriodicActivity94);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:90:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:91:1: ( ruleDate EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:92:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate123);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate130); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:99:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:103:2: ( ( ( rule__Date__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:104:1: ( ( rule__Date__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:104:1: ( ( rule__Date__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:105:1: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:106:1: ( rule__Date__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:106:2: rule__Date__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0_in_ruleDate156);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:118:1: entryRuleResAllocation : ruleResAllocation EOF ;
    public final void entryRuleResAllocation() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:119:1: ( ruleResAllocation EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:120:1: ruleResAllocation EOF
            {
             before(grammarAccess.getResAllocationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_entryRuleResAllocation183);
            ruleResAllocation();

            state._fsp--;

             after(grammarAccess.getResAllocationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResAllocation190); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:127:1: ruleResAllocation : ( ( rule__ResAllocation__Group__0 ) ) ;
    public final void ruleResAllocation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:131:2: ( ( ( rule__ResAllocation__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:132:1: ( ( rule__ResAllocation__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:132:1: ( ( rule__ResAllocation__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:133:1: ( rule__ResAllocation__Group__0 )
            {
             before(grammarAccess.getResAllocationAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:134:1: ( rule__ResAllocation__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:134:2: rule__ResAllocation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__0_in_ruleResAllocation216);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:146:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:147:1: ( ruleEString EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:148:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString243);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString250); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:155:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:159:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:160:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:160:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:161:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:162:1: ( rule__EString__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:162:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString276);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:174:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:175:1: ( ruleRule EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:176:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule303);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule310); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:183:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:187:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:188:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:188:1: ( ( rule__Rule__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:189:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:190:1: ( rule__Rule__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:190:2: rule__Rule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0_in_ruleRule336);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:202:1: entryRuleAtelier_Impl : ruleAtelier_Impl EOF ;
    public final void entryRuleAtelier_Impl() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:203:1: ( ruleAtelier_Impl EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:204:1: ruleAtelier_Impl EOF
            {
             before(grammarAccess.getAtelier_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl363);
            ruleAtelier_Impl();

            state._fsp--;

             after(grammarAccess.getAtelier_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtelier_Impl370); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:211:1: ruleAtelier_Impl : ( ( rule__Atelier_Impl__Group__0 ) ) ;
    public final void ruleAtelier_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:215:2: ( ( ( rule__Atelier_Impl__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:216:1: ( ( rule__Atelier_Impl__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:216:1: ( ( rule__Atelier_Impl__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:217:1: ( rule__Atelier_Impl__Group__0 )
            {
             before(grammarAccess.getAtelier_ImplAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:218:1: ( rule__Atelier_Impl__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:218:2: rule__Atelier_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__0_in_ruleAtelier_Impl396);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:230:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:231:1: ( ruleEInt EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:232:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt423);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt430); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:239:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:243:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:244:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:244:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:245:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:246:1: ( rule__EInt__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:246:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt456);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:260:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:261:1: ( rulePredicate EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:262:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_entryRulePredicate485);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicate492); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:269:1: rulePredicate : ( () ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:273:2: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:274:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:274:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:275:1: ()
            {
             before(grammarAccess.getPredicateAccess().getPredicatAction()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:276:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:278:1: 
            {
            }

             after(grammarAccess.getPredicateAccess().getPredicatAction()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleElevage"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:290:1: entryRuleElevage : ruleElevage EOF ;
    public final void entryRuleElevage() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:291:1: ( ruleElevage EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:292:1: ruleElevage EOF
            {
             before(grammarAccess.getElevageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElevage_in_entryRuleElevage546);
            ruleElevage();

            state._fsp--;

             after(grammarAccess.getElevageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElevage553); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:299:1: ruleElevage : ( ( rule__Elevage__Group__0 ) ) ;
    public final void ruleElevage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:303:2: ( ( ( rule__Elevage__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:304:1: ( ( rule__Elevage__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:304:1: ( ( rule__Elevage__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:305:1: ( rule__Elevage__Group__0 )
            {
             before(grammarAccess.getElevageAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:306:1: ( rule__Elevage__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:306:2: rule__Elevage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__0_in_ruleElevage579);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:318:1: entryRuleCulture : ruleCulture EOF ;
    public final void entryRuleCulture() throws RecognitionException {
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:319:1: ( ruleCulture EOF )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:320:1: ruleCulture EOF
            {
             before(grammarAccess.getCultureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCulture_in_entryRuleCulture606);
            ruleCulture();

            state._fsp--;

             after(grammarAccess.getCultureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCulture613); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:327:1: ruleCulture : ( ( rule__Culture__Group__0 ) ) ;
    public final void ruleCulture() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:331:2: ( ( ( rule__Culture__Group__0 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:332:1: ( ( rule__Culture__Group__0 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:332:1: ( ( rule__Culture__Group__0 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:333:1: ( rule__Culture__Group__0 )
            {
             before(grammarAccess.getCultureAccess().getGroup()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:334:1: ( rule__Culture__Group__0 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:334:2: rule__Culture__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__0_in_ruleCulture639);
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


    // $ANTLR start "rule__PeriodicActivity__Alternatives_11_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:346:1: rule__PeriodicActivity__Alternatives_11_1 : ( ( 'hour' ) | ( 'day' ) | ( 'week' ) | ( 'month' ) | ( 'year' ) );
    public final void rule__PeriodicActivity__Alternatives_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:350:1: ( ( 'hour' ) | ( 'day' ) | ( 'week' ) | ( 'month' ) | ( 'year' ) )
            int alt1=5;
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
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:351:1: ( 'hour' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:351:1: ( 'hour' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:352:1: 'hour'
                    {
                     before(grammarAccess.getPeriodicActivityAccess().getHourKeyword_11_1_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__PeriodicActivity__Alternatives_11_1676); 
                     after(grammarAccess.getPeriodicActivityAccess().getHourKeyword_11_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:359:6: ( 'day' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:359:6: ( 'day' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:360:1: 'day'
                    {
                     before(grammarAccess.getPeriodicActivityAccess().getDayKeyword_11_1_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__PeriodicActivity__Alternatives_11_1696); 
                     after(grammarAccess.getPeriodicActivityAccess().getDayKeyword_11_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:367:6: ( 'week' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:367:6: ( 'week' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:368:1: 'week'
                    {
                     before(grammarAccess.getPeriodicActivityAccess().getWeekKeyword_11_1_2()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__PeriodicActivity__Alternatives_11_1716); 
                     after(grammarAccess.getPeriodicActivityAccess().getWeekKeyword_11_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:375:6: ( 'month' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:375:6: ( 'month' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:376:1: 'month'
                    {
                     before(grammarAccess.getPeriodicActivityAccess().getMonthKeyword_11_1_3()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__PeriodicActivity__Alternatives_11_1736); 
                     after(grammarAccess.getPeriodicActivityAccess().getMonthKeyword_11_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:383:6: ( 'year' )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:383:6: ( 'year' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:384:1: 'year'
                    {
                     before(grammarAccess.getPeriodicActivityAccess().getYearKeyword_11_1_4()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__PeriodicActivity__Alternatives_11_1756); 
                     after(grammarAccess.getPeriodicActivityAccess().getYearKeyword_11_1_4()); 

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
    // $ANTLR end "rule__PeriodicActivity__Alternatives_11_1"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:397:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:401:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:402:1: ( RULE_STRING )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:402:1: ( RULE_STRING )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:403:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives791); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:408:6: ( RULE_ID )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:408:6: ( RULE_ID )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:409:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives808); 
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


    // $ANTLR start "rule__PeriodicActivity__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:421:1: rule__PeriodicActivity__Group__0 : rule__PeriodicActivity__Group__0__Impl rule__PeriodicActivity__Group__1 ;
    public final void rule__PeriodicActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:425:1: ( rule__PeriodicActivity__Group__0__Impl rule__PeriodicActivity__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:426:2: rule__PeriodicActivity__Group__0__Impl rule__PeriodicActivity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__0__Impl_in_rule__PeriodicActivity__Group__0838);
            rule__PeriodicActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__1_in_rule__PeriodicActivity__Group__0841);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:433:1: rule__PeriodicActivity__Group__0__Impl : ( () ) ;
    public final void rule__PeriodicActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:437:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:438:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:438:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:439:1: ()
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicActivityAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:440:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:442:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:452:1: rule__PeriodicActivity__Group__1 : rule__PeriodicActivity__Group__1__Impl rule__PeriodicActivity__Group__2 ;
    public final void rule__PeriodicActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:456:1: ( rule__PeriodicActivity__Group__1__Impl rule__PeriodicActivity__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:457:2: rule__PeriodicActivity__Group__1__Impl rule__PeriodicActivity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__1__Impl_in_rule__PeriodicActivity__Group__1899);
            rule__PeriodicActivity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__2_in_rule__PeriodicActivity__Group__1902);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:464:1: rule__PeriodicActivity__Group__1__Impl : ( 'PeriodicActivity' ) ;
    public final void rule__PeriodicActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:468:1: ( ( 'PeriodicActivity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:469:1: ( 'PeriodicActivity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:469:1: ( 'PeriodicActivity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:470:1: 'PeriodicActivity'
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicActivityKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__PeriodicActivity__Group__1__Impl930); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:483:1: rule__PeriodicActivity__Group__2 : rule__PeriodicActivity__Group__2__Impl rule__PeriodicActivity__Group__3 ;
    public final void rule__PeriodicActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:487:1: ( rule__PeriodicActivity__Group__2__Impl rule__PeriodicActivity__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:488:2: rule__PeriodicActivity__Group__2__Impl rule__PeriodicActivity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__2__Impl_in_rule__PeriodicActivity__Group__2961);
            rule__PeriodicActivity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__3_in_rule__PeriodicActivity__Group__2964);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:495:1: rule__PeriodicActivity__Group__2__Impl : ( ( rule__PeriodicActivity__NameAssignment_2 ) ) ;
    public final void rule__PeriodicActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:499:1: ( ( ( rule__PeriodicActivity__NameAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:500:1: ( ( rule__PeriodicActivity__NameAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:500:1: ( ( rule__PeriodicActivity__NameAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:501:1: ( rule__PeriodicActivity__NameAssignment_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getNameAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:502:1: ( rule__PeriodicActivity__NameAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:502:2: rule__PeriodicActivity__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__NameAssignment_2_in_rule__PeriodicActivity__Group__2__Impl991);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:512:1: rule__PeriodicActivity__Group__3 : rule__PeriodicActivity__Group__3__Impl rule__PeriodicActivity__Group__4 ;
    public final void rule__PeriodicActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:516:1: ( rule__PeriodicActivity__Group__3__Impl rule__PeriodicActivity__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:517:2: rule__PeriodicActivity__Group__3__Impl rule__PeriodicActivity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__3__Impl_in_rule__PeriodicActivity__Group__31021);
            rule__PeriodicActivity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__4_in_rule__PeriodicActivity__Group__31024);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:524:1: rule__PeriodicActivity__Group__3__Impl : ( '{' ) ;
    public final void rule__PeriodicActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:528:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:529:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:529:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:530:1: '{'
            {
             before(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PeriodicActivity__Group__3__Impl1052); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:543:1: rule__PeriodicActivity__Group__4 : rule__PeriodicActivity__Group__4__Impl rule__PeriodicActivity__Group__5 ;
    public final void rule__PeriodicActivity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:547:1: ( rule__PeriodicActivity__Group__4__Impl rule__PeriodicActivity__Group__5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:548:2: rule__PeriodicActivity__Group__4__Impl rule__PeriodicActivity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__4__Impl_in_rule__PeriodicActivity__Group__41083);
            rule__PeriodicActivity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__5_in_rule__PeriodicActivity__Group__41086);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:555:1: rule__PeriodicActivity__Group__4__Impl : ( ( rule__PeriodicActivity__Group_4__0 )? ) ;
    public final void rule__PeriodicActivity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:559:1: ( ( ( rule__PeriodicActivity__Group_4__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:560:1: ( ( rule__PeriodicActivity__Group_4__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:560:1: ( ( rule__PeriodicActivity__Group_4__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:561:1: ( rule__PeriodicActivity__Group_4__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:562:1: ( rule__PeriodicActivity__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:562:2: rule__PeriodicActivity__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__0_in_rule__PeriodicActivity__Group__4__Impl1113);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:572:1: rule__PeriodicActivity__Group__5 : rule__PeriodicActivity__Group__5__Impl rule__PeriodicActivity__Group__6 ;
    public final void rule__PeriodicActivity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:576:1: ( rule__PeriodicActivity__Group__5__Impl rule__PeriodicActivity__Group__6 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:577:2: rule__PeriodicActivity__Group__5__Impl rule__PeriodicActivity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__5__Impl_in_rule__PeriodicActivity__Group__51144);
            rule__PeriodicActivity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__6_in_rule__PeriodicActivity__Group__51147);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:584:1: rule__PeriodicActivity__Group__5__Impl : ( 'start' ) ;
    public final void rule__PeriodicActivity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:588:1: ( ( 'start' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:589:1: ( 'start' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:589:1: ( 'start' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:590:1: 'start'
            {
             before(grammarAccess.getPeriodicActivityAccess().getStartKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__PeriodicActivity__Group__5__Impl1175); 
             after(grammarAccess.getPeriodicActivityAccess().getStartKeyword_5()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:603:1: rule__PeriodicActivity__Group__6 : rule__PeriodicActivity__Group__6__Impl rule__PeriodicActivity__Group__7 ;
    public final void rule__PeriodicActivity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:607:1: ( rule__PeriodicActivity__Group__6__Impl rule__PeriodicActivity__Group__7 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:608:2: rule__PeriodicActivity__Group__6__Impl rule__PeriodicActivity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__6__Impl_in_rule__PeriodicActivity__Group__61206);
            rule__PeriodicActivity__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__7_in_rule__PeriodicActivity__Group__61209);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:615:1: rule__PeriodicActivity__Group__6__Impl : ( ( rule__PeriodicActivity__StartAssignment_6 ) ) ;
    public final void rule__PeriodicActivity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:619:1: ( ( ( rule__PeriodicActivity__StartAssignment_6 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:620:1: ( ( rule__PeriodicActivity__StartAssignment_6 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:620:1: ( ( rule__PeriodicActivity__StartAssignment_6 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:621:1: ( rule__PeriodicActivity__StartAssignment_6 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getStartAssignment_6()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:622:1: ( rule__PeriodicActivity__StartAssignment_6 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:622:2: rule__PeriodicActivity__StartAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__StartAssignment_6_in_rule__PeriodicActivity__Group__6__Impl1236);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:632:1: rule__PeriodicActivity__Group__7 : rule__PeriodicActivity__Group__7__Impl rule__PeriodicActivity__Group__8 ;
    public final void rule__PeriodicActivity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:636:1: ( rule__PeriodicActivity__Group__7__Impl rule__PeriodicActivity__Group__8 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:637:2: rule__PeriodicActivity__Group__7__Impl rule__PeriodicActivity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__7__Impl_in_rule__PeriodicActivity__Group__71266);
            rule__PeriodicActivity__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__8_in_rule__PeriodicActivity__Group__71269);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:644:1: rule__PeriodicActivity__Group__7__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:648:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:649:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:649:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:650:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_7()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PeriodicActivity__Group__7__Impl1297); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_7()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:663:1: rule__PeriodicActivity__Group__8 : rule__PeriodicActivity__Group__8__Impl rule__PeriodicActivity__Group__9 ;
    public final void rule__PeriodicActivity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:667:1: ( rule__PeriodicActivity__Group__8__Impl rule__PeriodicActivity__Group__9 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:668:2: rule__PeriodicActivity__Group__8__Impl rule__PeriodicActivity__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__8__Impl_in_rule__PeriodicActivity__Group__81328);
            rule__PeriodicActivity__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__9_in_rule__PeriodicActivity__Group__81331);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:675:1: rule__PeriodicActivity__Group__8__Impl : ( 'end' ) ;
    public final void rule__PeriodicActivity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:679:1: ( ( 'end' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:680:1: ( 'end' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:680:1: ( 'end' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:681:1: 'end'
            {
             before(grammarAccess.getPeriodicActivityAccess().getEndKeyword_8()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__PeriodicActivity__Group__8__Impl1359); 
             after(grammarAccess.getPeriodicActivityAccess().getEndKeyword_8()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:694:1: rule__PeriodicActivity__Group__9 : rule__PeriodicActivity__Group__9__Impl rule__PeriodicActivity__Group__10 ;
    public final void rule__PeriodicActivity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:698:1: ( rule__PeriodicActivity__Group__9__Impl rule__PeriodicActivity__Group__10 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:699:2: rule__PeriodicActivity__Group__9__Impl rule__PeriodicActivity__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__9__Impl_in_rule__PeriodicActivity__Group__91390);
            rule__PeriodicActivity__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__10_in_rule__PeriodicActivity__Group__91393);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:706:1: rule__PeriodicActivity__Group__9__Impl : ( ( rule__PeriodicActivity__EndAssignment_9 ) ) ;
    public final void rule__PeriodicActivity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:710:1: ( ( ( rule__PeriodicActivity__EndAssignment_9 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:711:1: ( ( rule__PeriodicActivity__EndAssignment_9 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:711:1: ( ( rule__PeriodicActivity__EndAssignment_9 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:712:1: ( rule__PeriodicActivity__EndAssignment_9 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getEndAssignment_9()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:713:1: ( rule__PeriodicActivity__EndAssignment_9 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:713:2: rule__PeriodicActivity__EndAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__EndAssignment_9_in_rule__PeriodicActivity__Group__9__Impl1420);
            rule__PeriodicActivity__EndAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getEndAssignment_9()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:723:1: rule__PeriodicActivity__Group__10 : rule__PeriodicActivity__Group__10__Impl rule__PeriodicActivity__Group__11 ;
    public final void rule__PeriodicActivity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:727:1: ( rule__PeriodicActivity__Group__10__Impl rule__PeriodicActivity__Group__11 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:728:2: rule__PeriodicActivity__Group__10__Impl rule__PeriodicActivity__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__10__Impl_in_rule__PeriodicActivity__Group__101450);
            rule__PeriodicActivity__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__11_in_rule__PeriodicActivity__Group__101453);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:735:1: rule__PeriodicActivity__Group__10__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:739:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:740:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:740:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:741:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_10()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PeriodicActivity__Group__10__Impl1481); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_10()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:754:1: rule__PeriodicActivity__Group__11 : rule__PeriodicActivity__Group__11__Impl rule__PeriodicActivity__Group__12 ;
    public final void rule__PeriodicActivity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:758:1: ( rule__PeriodicActivity__Group__11__Impl rule__PeriodicActivity__Group__12 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:759:2: rule__PeriodicActivity__Group__11__Impl rule__PeriodicActivity__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__11__Impl_in_rule__PeriodicActivity__Group__111512);
            rule__PeriodicActivity__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__12_in_rule__PeriodicActivity__Group__111515);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:766:1: rule__PeriodicActivity__Group__11__Impl : ( ( rule__PeriodicActivity__Group_11__0 )? ) ;
    public final void rule__PeriodicActivity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:770:1: ( ( ( rule__PeriodicActivity__Group_11__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:771:1: ( ( rule__PeriodicActivity__Group_11__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:771:1: ( ( rule__PeriodicActivity__Group_11__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:772:1: ( rule__PeriodicActivity__Group_11__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_11()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:773:1: ( rule__PeriodicActivity__Group_11__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:773:2: rule__PeriodicActivity__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__0_in_rule__PeriodicActivity__Group__11__Impl1542);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:783:1: rule__PeriodicActivity__Group__12 : rule__PeriodicActivity__Group__12__Impl rule__PeriodicActivity__Group__13 ;
    public final void rule__PeriodicActivity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:787:1: ( rule__PeriodicActivity__Group__12__Impl rule__PeriodicActivity__Group__13 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:788:2: rule__PeriodicActivity__Group__12__Impl rule__PeriodicActivity__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__12__Impl_in_rule__PeriodicActivity__Group__121573);
            rule__PeriodicActivity__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__13_in_rule__PeriodicActivity__Group__121576);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:795:1: rule__PeriodicActivity__Group__12__Impl : ( ( rule__PeriodicActivity__Group_12__0 )? ) ;
    public final void rule__PeriodicActivity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:799:1: ( ( ( rule__PeriodicActivity__Group_12__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:800:1: ( ( rule__PeriodicActivity__Group_12__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:800:1: ( ( rule__PeriodicActivity__Group_12__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:801:1: ( rule__PeriodicActivity__Group_12__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_12()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:802:1: ( rule__PeriodicActivity__Group_12__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:802:2: rule__PeriodicActivity__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__0_in_rule__PeriodicActivity__Group__12__Impl1603);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:812:1: rule__PeriodicActivity__Group__13 : rule__PeriodicActivity__Group__13__Impl rule__PeriodicActivity__Group__14 ;
    public final void rule__PeriodicActivity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:816:1: ( rule__PeriodicActivity__Group__13__Impl rule__PeriodicActivity__Group__14 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:817:2: rule__PeriodicActivity__Group__13__Impl rule__PeriodicActivity__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__13__Impl_in_rule__PeriodicActivity__Group__131634);
            rule__PeriodicActivity__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__14_in_rule__PeriodicActivity__Group__131637);
            rule__PeriodicActivity__Group__14();

            state._fsp--;


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:824:1: rule__PeriodicActivity__Group__13__Impl : ( ( rule__PeriodicActivity__Group_13__0 )? ) ;
    public final void rule__PeriodicActivity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:828:1: ( ( ( rule__PeriodicActivity__Group_13__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:829:1: ( ( rule__PeriodicActivity__Group_13__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:829:1: ( ( rule__PeriodicActivity__Group_13__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:830:1: ( rule__PeriodicActivity__Group_13__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_13()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:831:1: ( rule__PeriodicActivity__Group_13__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:831:2: rule__PeriodicActivity__Group_13__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__0_in_rule__PeriodicActivity__Group__13__Impl1664);
                    rule__PeriodicActivity__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPeriodicActivityAccess().getGroup_13()); 

            }


            }

        }
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


    // $ANTLR start "rule__PeriodicActivity__Group__14"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:841:1: rule__PeriodicActivity__Group__14 : rule__PeriodicActivity__Group__14__Impl ;
    public final void rule__PeriodicActivity__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:845:1: ( rule__PeriodicActivity__Group__14__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:846:2: rule__PeriodicActivity__Group__14__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__14__Impl_in_rule__PeriodicActivity__Group__141695);
            rule__PeriodicActivity__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group__14"


    // $ANTLR start "rule__PeriodicActivity__Group__14__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:852:1: rule__PeriodicActivity__Group__14__Impl : ( '}' ) ;
    public final void rule__PeriodicActivity__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:856:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:857:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:857:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:858:1: '}'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_14()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__PeriodicActivity__Group__14__Impl1723); 
             after(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group__14__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_4__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:901:1: rule__PeriodicActivity__Group_4__0 : rule__PeriodicActivity__Group_4__0__Impl rule__PeriodicActivity__Group_4__1 ;
    public final void rule__PeriodicActivity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:905:1: ( rule__PeriodicActivity__Group_4__0__Impl rule__PeriodicActivity__Group_4__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:906:2: rule__PeriodicActivity__Group_4__0__Impl rule__PeriodicActivity__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__0__Impl_in_rule__PeriodicActivity__Group_4__01784);
            rule__PeriodicActivity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__1_in_rule__PeriodicActivity__Group_4__01787);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:913:1: rule__PeriodicActivity__Group_4__0__Impl : ( 'atelier' ) ;
    public final void rule__PeriodicActivity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:917:1: ( ( 'atelier' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:918:1: ( 'atelier' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:918:1: ( 'atelier' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:919:1: 'atelier'
            {
             before(grammarAccess.getPeriodicActivityAccess().getAtelierKeyword_4_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__PeriodicActivity__Group_4__0__Impl1815); 
             after(grammarAccess.getPeriodicActivityAccess().getAtelierKeyword_4_0()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:932:1: rule__PeriodicActivity__Group_4__1 : rule__PeriodicActivity__Group_4__1__Impl rule__PeriodicActivity__Group_4__2 ;
    public final void rule__PeriodicActivity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:936:1: ( rule__PeriodicActivity__Group_4__1__Impl rule__PeriodicActivity__Group_4__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:937:2: rule__PeriodicActivity__Group_4__1__Impl rule__PeriodicActivity__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__1__Impl_in_rule__PeriodicActivity__Group_4__11846);
            rule__PeriodicActivity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__2_in_rule__PeriodicActivity__Group_4__11849);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:944:1: rule__PeriodicActivity__Group_4__1__Impl : ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) ) ;
    public final void rule__PeriodicActivity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:948:1: ( ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:949:1: ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:949:1: ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:950:1: ( rule__PeriodicActivity__AtelierAssignment_4_1 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getAtelierAssignment_4_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:951:1: ( rule__PeriodicActivity__AtelierAssignment_4_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:951:2: rule__PeriodicActivity__AtelierAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__AtelierAssignment_4_1_in_rule__PeriodicActivity__Group_4__1__Impl1876);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:961:1: rule__PeriodicActivity__Group_4__2 : rule__PeriodicActivity__Group_4__2__Impl ;
    public final void rule__PeriodicActivity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:965:1: ( rule__PeriodicActivity__Group_4__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:966:2: rule__PeriodicActivity__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__2__Impl_in_rule__PeriodicActivity__Group_4__21906);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:972:1: rule__PeriodicActivity__Group_4__2__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:976:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:977:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:977:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:978:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_4_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PeriodicActivity__Group_4__2__Impl1934); 
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


    // $ANTLR start "rule__PeriodicActivity__Group_11__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:997:1: rule__PeriodicActivity__Group_11__0 : rule__PeriodicActivity__Group_11__0__Impl rule__PeriodicActivity__Group_11__1 ;
    public final void rule__PeriodicActivity__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1001:1: ( rule__PeriodicActivity__Group_11__0__Impl rule__PeriodicActivity__Group_11__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1002:2: rule__PeriodicActivity__Group_11__0__Impl rule__PeriodicActivity__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__0__Impl_in_rule__PeriodicActivity__Group_11__01971);
            rule__PeriodicActivity__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__1_in_rule__PeriodicActivity__Group_11__01974);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1009:1: rule__PeriodicActivity__Group_11__0__Impl : ( 'every' ) ;
    public final void rule__PeriodicActivity__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1013:1: ( ( 'every' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1014:1: ( 'every' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1014:1: ( 'every' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1015:1: 'every'
            {
             before(grammarAccess.getPeriodicActivityAccess().getEveryKeyword_11_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__PeriodicActivity__Group_11__0__Impl2002); 
             after(grammarAccess.getPeriodicActivityAccess().getEveryKeyword_11_0()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1028:1: rule__PeriodicActivity__Group_11__1 : rule__PeriodicActivity__Group_11__1__Impl ;
    public final void rule__PeriodicActivity__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1032:1: ( rule__PeriodicActivity__Group_11__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1033:2: rule__PeriodicActivity__Group_11__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_11__1__Impl_in_rule__PeriodicActivity__Group_11__12033);
            rule__PeriodicActivity__Group_11__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1039:1: rule__PeriodicActivity__Group_11__1__Impl : ( ( rule__PeriodicActivity__Alternatives_11_1 ) ) ;
    public final void rule__PeriodicActivity__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1043:1: ( ( ( rule__PeriodicActivity__Alternatives_11_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1044:1: ( ( rule__PeriodicActivity__Alternatives_11_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1044:1: ( ( rule__PeriodicActivity__Alternatives_11_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1045:1: ( rule__PeriodicActivity__Alternatives_11_1 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getAlternatives_11_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1046:1: ( rule__PeriodicActivity__Alternatives_11_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1046:2: rule__PeriodicActivity__Alternatives_11_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Alternatives_11_1_in_rule__PeriodicActivity__Group_11__1__Impl2060);
            rule__PeriodicActivity__Alternatives_11_1();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getAlternatives_11_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PeriodicActivity__Group_12__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1060:1: rule__PeriodicActivity__Group_12__0 : rule__PeriodicActivity__Group_12__0__Impl rule__PeriodicActivity__Group_12__1 ;
    public final void rule__PeriodicActivity__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1064:1: ( rule__PeriodicActivity__Group_12__0__Impl rule__PeriodicActivity__Group_12__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1065:2: rule__PeriodicActivity__Group_12__0__Impl rule__PeriodicActivity__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__0__Impl_in_rule__PeriodicActivity__Group_12__02094);
            rule__PeriodicActivity__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__1_in_rule__PeriodicActivity__Group_12__02097);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1072:1: rule__PeriodicActivity__Group_12__0__Impl : ( 'allocate' ) ;
    public final void rule__PeriodicActivity__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1076:1: ( ( 'allocate' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1077:1: ( 'allocate' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1077:1: ( 'allocate' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1078:1: 'allocate'
            {
             before(grammarAccess.getPeriodicActivityAccess().getAllocateKeyword_12_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__PeriodicActivity__Group_12__0__Impl2125); 
             after(grammarAccess.getPeriodicActivityAccess().getAllocateKeyword_12_0()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1091:1: rule__PeriodicActivity__Group_12__1 : rule__PeriodicActivity__Group_12__1__Impl rule__PeriodicActivity__Group_12__2 ;
    public final void rule__PeriodicActivity__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1095:1: ( rule__PeriodicActivity__Group_12__1__Impl rule__PeriodicActivity__Group_12__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1096:2: rule__PeriodicActivity__Group_12__1__Impl rule__PeriodicActivity__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__1__Impl_in_rule__PeriodicActivity__Group_12__12156);
            rule__PeriodicActivity__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__2_in_rule__PeriodicActivity__Group_12__12159);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1103:1: rule__PeriodicActivity__Group_12__1__Impl : ( '{' ) ;
    public final void rule__PeriodicActivity__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1107:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1108:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1108:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1109:1: '{'
            {
             before(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PeriodicActivity__Group_12__1__Impl2187); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1122:1: rule__PeriodicActivity__Group_12__2 : rule__PeriodicActivity__Group_12__2__Impl rule__PeriodicActivity__Group_12__3 ;
    public final void rule__PeriodicActivity__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1126:1: ( rule__PeriodicActivity__Group_12__2__Impl rule__PeriodicActivity__Group_12__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1127:2: rule__PeriodicActivity__Group_12__2__Impl rule__PeriodicActivity__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__2__Impl_in_rule__PeriodicActivity__Group_12__22218);
            rule__PeriodicActivity__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__3_in_rule__PeriodicActivity__Group_12__22221);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1134:1: rule__PeriodicActivity__Group_12__2__Impl : ( ( rule__PeriodicActivity__ResAllocationAssignment_12_2 ) ) ;
    public final void rule__PeriodicActivity__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1138:1: ( ( ( rule__PeriodicActivity__ResAllocationAssignment_12_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1139:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_12_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1139:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_12_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1140:1: ( rule__PeriodicActivity__ResAllocationAssignment_12_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_12_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1141:1: ( rule__PeriodicActivity__ResAllocationAssignment_12_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1141:2: rule__PeriodicActivity__ResAllocationAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_12_2_in_rule__PeriodicActivity__Group_12__2__Impl2248);
            rule__PeriodicActivity__ResAllocationAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_12_2()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1151:1: rule__PeriodicActivity__Group_12__3 : rule__PeriodicActivity__Group_12__3__Impl rule__PeriodicActivity__Group_12__4 ;
    public final void rule__PeriodicActivity__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1155:1: ( rule__PeriodicActivity__Group_12__3__Impl rule__PeriodicActivity__Group_12__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1156:2: rule__PeriodicActivity__Group_12__3__Impl rule__PeriodicActivity__Group_12__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__3__Impl_in_rule__PeriodicActivity__Group_12__32278);
            rule__PeriodicActivity__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__4_in_rule__PeriodicActivity__Group_12__32281);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1163:1: rule__PeriodicActivity__Group_12__3__Impl : ( ( rule__PeriodicActivity__Group_12_3__0 )* ) ;
    public final void rule__PeriodicActivity__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1167:1: ( ( ( rule__PeriodicActivity__Group_12_3__0 )* ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1168:1: ( ( rule__PeriodicActivity__Group_12_3__0 )* )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1168:1: ( ( rule__PeriodicActivity__Group_12_3__0 )* )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1169:1: ( rule__PeriodicActivity__Group_12_3__0 )*
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_12_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1170:1: ( rule__PeriodicActivity__Group_12_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1170:2: rule__PeriodicActivity__Group_12_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12_3__0_in_rule__PeriodicActivity__Group_12__3__Impl2308);
            	    rule__PeriodicActivity__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1180:1: rule__PeriodicActivity__Group_12__4 : rule__PeriodicActivity__Group_12__4__Impl ;
    public final void rule__PeriodicActivity__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1184:1: ( rule__PeriodicActivity__Group_12__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1185:2: rule__PeriodicActivity__Group_12__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__4__Impl_in_rule__PeriodicActivity__Group_12__42339);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1191:1: rule__PeriodicActivity__Group_12__4__Impl : ( '} ,' ) ;
    public final void rule__PeriodicActivity__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1195:1: ( ( '} ,' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1196:1: ( '} ,' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1196:1: ( '} ,' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1197:1: '} ,'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketSpaceCommaKeyword_12_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__PeriodicActivity__Group_12__4__Impl2367); 
             after(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketSpaceCommaKeyword_12_4()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1220:1: rule__PeriodicActivity__Group_12_3__0 : rule__PeriodicActivity__Group_12_3__0__Impl rule__PeriodicActivity__Group_12_3__1 ;
    public final void rule__PeriodicActivity__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1224:1: ( rule__PeriodicActivity__Group_12_3__0__Impl rule__PeriodicActivity__Group_12_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1225:2: rule__PeriodicActivity__Group_12_3__0__Impl rule__PeriodicActivity__Group_12_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12_3__0__Impl_in_rule__PeriodicActivity__Group_12_3__02408);
            rule__PeriodicActivity__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12_3__1_in_rule__PeriodicActivity__Group_12_3__02411);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1232:1: rule__PeriodicActivity__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1236:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1237:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1237:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1238:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_12_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PeriodicActivity__Group_12_3__0__Impl2439); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1251:1: rule__PeriodicActivity__Group_12_3__1 : rule__PeriodicActivity__Group_12_3__1__Impl ;
    public final void rule__PeriodicActivity__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1255:1: ( rule__PeriodicActivity__Group_12_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1256:2: rule__PeriodicActivity__Group_12_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12_3__1__Impl_in_rule__PeriodicActivity__Group_12_3__12470);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1262:1: rule__PeriodicActivity__Group_12_3__1__Impl : ( ( rule__PeriodicActivity__ResAllocationAssignment_12_3_1 ) ) ;
    public final void rule__PeriodicActivity__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1266:1: ( ( ( rule__PeriodicActivity__ResAllocationAssignment_12_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1267:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_12_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1267:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_12_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1268:1: ( rule__PeriodicActivity__ResAllocationAssignment_12_3_1 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_12_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1269:1: ( rule__PeriodicActivity__ResAllocationAssignment_12_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1269:2: rule__PeriodicActivity__ResAllocationAssignment_12_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_12_3_1_in_rule__PeriodicActivity__Group_12_3__1__Impl2497);
            rule__PeriodicActivity__ResAllocationAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_12_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PeriodicActivity__Group_13__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1283:1: rule__PeriodicActivity__Group_13__0 : rule__PeriodicActivity__Group_13__0__Impl rule__PeriodicActivity__Group_13__1 ;
    public final void rule__PeriodicActivity__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1287:1: ( rule__PeriodicActivity__Group_13__0__Impl rule__PeriodicActivity__Group_13__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1288:2: rule__PeriodicActivity__Group_13__0__Impl rule__PeriodicActivity__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__0__Impl_in_rule__PeriodicActivity__Group_13__02531);
            rule__PeriodicActivity__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__1_in_rule__PeriodicActivity__Group_13__02534);
            rule__PeriodicActivity__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_13__0"


    // $ANTLR start "rule__PeriodicActivity__Group_13__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1295:1: rule__PeriodicActivity__Group_13__0__Impl : ( 'rules' ) ;
    public final void rule__PeriodicActivity__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1299:1: ( ( 'rules' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1300:1: ( 'rules' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1300:1: ( 'rules' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1301:1: 'rules'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRulesKeyword_13_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__PeriodicActivity__Group_13__0__Impl2562); 
             after(grammarAccess.getPeriodicActivityAccess().getRulesKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_13__0__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_13__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1314:1: rule__PeriodicActivity__Group_13__1 : rule__PeriodicActivity__Group_13__1__Impl rule__PeriodicActivity__Group_13__2 ;
    public final void rule__PeriodicActivity__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1318:1: ( rule__PeriodicActivity__Group_13__1__Impl rule__PeriodicActivity__Group_13__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1319:2: rule__PeriodicActivity__Group_13__1__Impl rule__PeriodicActivity__Group_13__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__1__Impl_in_rule__PeriodicActivity__Group_13__12593);
            rule__PeriodicActivity__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__2_in_rule__PeriodicActivity__Group_13__12596);
            rule__PeriodicActivity__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_13__1"


    // $ANTLR start "rule__PeriodicActivity__Group_13__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1326:1: rule__PeriodicActivity__Group_13__1__Impl : ( '{' ) ;
    public final void rule__PeriodicActivity__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1330:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1331:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1331:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1332:1: '{'
            {
             before(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PeriodicActivity__Group_13__1__Impl2624); 
             after(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_13__1__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_13__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1345:1: rule__PeriodicActivity__Group_13__2 : rule__PeriodicActivity__Group_13__2__Impl rule__PeriodicActivity__Group_13__3 ;
    public final void rule__PeriodicActivity__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1349:1: ( rule__PeriodicActivity__Group_13__2__Impl rule__PeriodicActivity__Group_13__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1350:2: rule__PeriodicActivity__Group_13__2__Impl rule__PeriodicActivity__Group_13__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__2__Impl_in_rule__PeriodicActivity__Group_13__22655);
            rule__PeriodicActivity__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__3_in_rule__PeriodicActivity__Group_13__22658);
            rule__PeriodicActivity__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_13__2"


    // $ANTLR start "rule__PeriodicActivity__Group_13__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1357:1: rule__PeriodicActivity__Group_13__2__Impl : ( ( rule__PeriodicActivity__RuleAssignment_13_2 ) ) ;
    public final void rule__PeriodicActivity__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1361:1: ( ( ( rule__PeriodicActivity__RuleAssignment_13_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1362:1: ( ( rule__PeriodicActivity__RuleAssignment_13_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1362:1: ( ( rule__PeriodicActivity__RuleAssignment_13_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1363:1: ( rule__PeriodicActivity__RuleAssignment_13_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleAssignment_13_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1364:1: ( rule__PeriodicActivity__RuleAssignment_13_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1364:2: rule__PeriodicActivity__RuleAssignment_13_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__RuleAssignment_13_2_in_rule__PeriodicActivity__Group_13__2__Impl2685);
            rule__PeriodicActivity__RuleAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getRuleAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_13__2__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_13__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1374:1: rule__PeriodicActivity__Group_13__3 : rule__PeriodicActivity__Group_13__3__Impl rule__PeriodicActivity__Group_13__4 ;
    public final void rule__PeriodicActivity__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1378:1: ( rule__PeriodicActivity__Group_13__3__Impl rule__PeriodicActivity__Group_13__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1379:2: rule__PeriodicActivity__Group_13__3__Impl rule__PeriodicActivity__Group_13__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__3__Impl_in_rule__PeriodicActivity__Group_13__32715);
            rule__PeriodicActivity__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__4_in_rule__PeriodicActivity__Group_13__32718);
            rule__PeriodicActivity__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_13__3"


    // $ANTLR start "rule__PeriodicActivity__Group_13__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1386:1: rule__PeriodicActivity__Group_13__3__Impl : ( ( rule__PeriodicActivity__Group_13_3__0 )* ) ;
    public final void rule__PeriodicActivity__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1390:1: ( ( ( rule__PeriodicActivity__Group_13_3__0 )* ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1391:1: ( ( rule__PeriodicActivity__Group_13_3__0 )* )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1391:1: ( ( rule__PeriodicActivity__Group_13_3__0 )* )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1392:1: ( rule__PeriodicActivity__Group_13_3__0 )*
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_13_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1393:1: ( rule__PeriodicActivity__Group_13_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1393:2: rule__PeriodicActivity__Group_13_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13_3__0_in_rule__PeriodicActivity__Group_13__3__Impl2745);
            	    rule__PeriodicActivity__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPeriodicActivityAccess().getGroup_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_13__3__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_13__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1403:1: rule__PeriodicActivity__Group_13__4 : rule__PeriodicActivity__Group_13__4__Impl ;
    public final void rule__PeriodicActivity__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1407:1: ( rule__PeriodicActivity__Group_13__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1408:2: rule__PeriodicActivity__Group_13__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__4__Impl_in_rule__PeriodicActivity__Group_13__42776);
            rule__PeriodicActivity__Group_13__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_13__4"


    // $ANTLR start "rule__PeriodicActivity__Group_13__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1414:1: rule__PeriodicActivity__Group_13__4__Impl : ( '}' ) ;
    public final void rule__PeriodicActivity__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1418:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1419:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1419:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1420:1: '}'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_13_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__PeriodicActivity__Group_13__4__Impl2804); 
             after(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_13__4__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_13_3__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1443:1: rule__PeriodicActivity__Group_13_3__0 : rule__PeriodicActivity__Group_13_3__0__Impl rule__PeriodicActivity__Group_13_3__1 ;
    public final void rule__PeriodicActivity__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1447:1: ( rule__PeriodicActivity__Group_13_3__0__Impl rule__PeriodicActivity__Group_13_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1448:2: rule__PeriodicActivity__Group_13_3__0__Impl rule__PeriodicActivity__Group_13_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13_3__0__Impl_in_rule__PeriodicActivity__Group_13_3__02845);
            rule__PeriodicActivity__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13_3__1_in_rule__PeriodicActivity__Group_13_3__02848);
            rule__PeriodicActivity__Group_13_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_13_3__0"


    // $ANTLR start "rule__PeriodicActivity__Group_13_3__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1455:1: rule__PeriodicActivity__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1459:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1460:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1460:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1461:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_13_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PeriodicActivity__Group_13_3__0__Impl2876); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_13_3__0__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_13_3__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1474:1: rule__PeriodicActivity__Group_13_3__1 : rule__PeriodicActivity__Group_13_3__1__Impl ;
    public final void rule__PeriodicActivity__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1478:1: ( rule__PeriodicActivity__Group_13_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1479:2: rule__PeriodicActivity__Group_13_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13_3__1__Impl_in_rule__PeriodicActivity__Group_13_3__12907);
            rule__PeriodicActivity__Group_13_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_13_3__1"


    // $ANTLR start "rule__PeriodicActivity__Group_13_3__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1485:1: rule__PeriodicActivity__Group_13_3__1__Impl : ( ( rule__PeriodicActivity__RuleAssignment_13_3_1 ) ) ;
    public final void rule__PeriodicActivity__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1489:1: ( ( ( rule__PeriodicActivity__RuleAssignment_13_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1490:1: ( ( rule__PeriodicActivity__RuleAssignment_13_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1490:1: ( ( rule__PeriodicActivity__RuleAssignment_13_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1491:1: ( rule__PeriodicActivity__RuleAssignment_13_3_1 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleAssignment_13_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1492:1: ( rule__PeriodicActivity__RuleAssignment_13_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1492:2: rule__PeriodicActivity__RuleAssignment_13_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__RuleAssignment_13_3_1_in_rule__PeriodicActivity__Group_13_3__1__Impl2934);
            rule__PeriodicActivity__RuleAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getRuleAssignment_13_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_13_3__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1506:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1510:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1511:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__02968);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1_in_rule__Date__Group__02971);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1518:1: rule__Date__Group__0__Impl : ( () ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1522:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1523:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1523:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1524:1: ()
            {
             before(grammarAccess.getDateAccess().getDateAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1525:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1527:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1537:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1541:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1542:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__13029);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2_in_rule__Date__Group__13032);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1549:1: rule__Date__Group__1__Impl : ( 'from' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1553:1: ( ( 'from' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1554:1: ( 'from' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1554:1: ( 'from' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1555:1: 'from'
            {
             before(grammarAccess.getDateAccess().getFromKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Date__Group__1__Impl3060); 
             after(grammarAccess.getDateAccess().getFromKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1568:1: rule__Date__Group__2 : rule__Date__Group__2__Impl ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1572:1: ( rule__Date__Group__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1573:2: rule__Date__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__23091);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1579:1: rule__Date__Group__2__Impl : ( ( rule__Date__DayAssignment_2 ) ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1583:1: ( ( ( rule__Date__DayAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1584:1: ( ( rule__Date__DayAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1584:1: ( ( rule__Date__DayAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1585:1: ( rule__Date__DayAssignment_2 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1586:1: ( rule__Date__DayAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1586:2: rule__Date__DayAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__DayAssignment_2_in_rule__Date__Group__2__Impl3118);
            rule__Date__DayAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getDayAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1602:1: rule__ResAllocation__Group__0 : rule__ResAllocation__Group__0__Impl rule__ResAllocation__Group__1 ;
    public final void rule__ResAllocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1606:1: ( rule__ResAllocation__Group__0__Impl rule__ResAllocation__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1607:2: rule__ResAllocation__Group__0__Impl rule__ResAllocation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__0__Impl_in_rule__ResAllocation__Group__03154);
            rule__ResAllocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__1_in_rule__ResAllocation__Group__03157);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1614:1: rule__ResAllocation__Group__0__Impl : ( () ) ;
    public final void rule__ResAllocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1618:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1619:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1619:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1620:1: ()
            {
             before(grammarAccess.getResAllocationAccess().getRessourceAllocationAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1621:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1623:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1633:1: rule__ResAllocation__Group__1 : rule__ResAllocation__Group__1__Impl rule__ResAllocation__Group__2 ;
    public final void rule__ResAllocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1637:1: ( rule__ResAllocation__Group__1__Impl rule__ResAllocation__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1638:2: rule__ResAllocation__Group__1__Impl rule__ResAllocation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__1__Impl_in_rule__ResAllocation__Group__13215);
            rule__ResAllocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__2_in_rule__ResAllocation__Group__13218);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1645:1: rule__ResAllocation__Group__1__Impl : ( 'reserve' ) ;
    public final void rule__ResAllocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1649:1: ( ( 'reserve' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1650:1: ( 'reserve' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1650:1: ( 'reserve' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1651:1: 'reserve'
            {
             before(grammarAccess.getResAllocationAccess().getReserveKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ResAllocation__Group__1__Impl3246); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1664:1: rule__ResAllocation__Group__2 : rule__ResAllocation__Group__2__Impl rule__ResAllocation__Group__3 ;
    public final void rule__ResAllocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1668:1: ( rule__ResAllocation__Group__2__Impl rule__ResAllocation__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1669:2: rule__ResAllocation__Group__2__Impl rule__ResAllocation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__2__Impl_in_rule__ResAllocation__Group__23277);
            rule__ResAllocation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__3_in_rule__ResAllocation__Group__23280);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1676:1: rule__ResAllocation__Group__2__Impl : ( ( rule__ResAllocation__RessourceAssignment_2 ) ) ;
    public final void rule__ResAllocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1680:1: ( ( ( rule__ResAllocation__RessourceAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1681:1: ( ( rule__ResAllocation__RessourceAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1681:1: ( ( rule__ResAllocation__RessourceAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1682:1: ( rule__ResAllocation__RessourceAssignment_2 )
            {
             before(grammarAccess.getResAllocationAccess().getRessourceAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1683:1: ( rule__ResAllocation__RessourceAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1683:2: rule__ResAllocation__RessourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__RessourceAssignment_2_in_rule__ResAllocation__Group__2__Impl3307);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1693:1: rule__ResAllocation__Group__3 : rule__ResAllocation__Group__3__Impl rule__ResAllocation__Group__4 ;
    public final void rule__ResAllocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1697:1: ( rule__ResAllocation__Group__3__Impl rule__ResAllocation__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1698:2: rule__ResAllocation__Group__3__Impl rule__ResAllocation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__3__Impl_in_rule__ResAllocation__Group__33337);
            rule__ResAllocation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__4_in_rule__ResAllocation__Group__33340);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1705:1: rule__ResAllocation__Group__3__Impl : ( 'for' ) ;
    public final void rule__ResAllocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1709:1: ( ( 'for' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1710:1: ( 'for' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1710:1: ( 'for' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1711:1: 'for'
            {
             before(grammarAccess.getResAllocationAccess().getForKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ResAllocation__Group__3__Impl3368); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1724:1: rule__ResAllocation__Group__4 : rule__ResAllocation__Group__4__Impl ;
    public final void rule__ResAllocation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1728:1: ( rule__ResAllocation__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1729:2: rule__ResAllocation__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__4__Impl_in_rule__ResAllocation__Group__43399);
            rule__ResAllocation__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1735:1: rule__ResAllocation__Group__4__Impl : ( ( rule__ResAllocation__DureeAssignment_4 ) ) ;
    public final void rule__ResAllocation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1739:1: ( ( ( rule__ResAllocation__DureeAssignment_4 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1740:1: ( ( rule__ResAllocation__DureeAssignment_4 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1740:1: ( ( rule__ResAllocation__DureeAssignment_4 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1741:1: ( rule__ResAllocation__DureeAssignment_4 )
            {
             before(grammarAccess.getResAllocationAccess().getDureeAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1742:1: ( rule__ResAllocation__DureeAssignment_4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1742:2: rule__ResAllocation__DureeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__DureeAssignment_4_in_rule__ResAllocation__Group__4__Impl3426);
            rule__ResAllocation__DureeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getResAllocationAccess().getDureeAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1762:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1766:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1767:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03466);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03469);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1774:1: rule__Rule__Group__0__Impl : ( () ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1778:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1779:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1779:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1780:1: ()
            {
             before(grammarAccess.getRuleAccess().getRuleAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1781:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1783:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1793:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1797:1: ( rule__Rule__Group__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1798:2: rule__Rule__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13527);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1804:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__Group_1__0 )* ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1808:1: ( ( ( rule__Rule__Group_1__0 )* ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1809:1: ( ( rule__Rule__Group_1__0 )* )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1809:1: ( ( rule__Rule__Group_1__0 )* )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1810:1: ( rule__Rule__Group_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1811:1: ( rule__Rule__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1811:2: rule__Rule__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1__0_in_rule__Rule__Group__1__Impl3554);
            	    rule__Rule__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1825:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1829:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1830:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1__0__Impl_in_rule__Rule__Group_1__03589);
            rule__Rule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1__1_in_rule__Rule__Group_1__03592);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1837:1: rule__Rule__Group_1__0__Impl : ( 'pre' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1841:1: ( ( 'pre' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1842:1: ( 'pre' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1842:1: ( 'pre' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1843:1: 'pre'
            {
             before(grammarAccess.getRuleAccess().getPreKeyword_1_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Rule__Group_1__0__Impl3620); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1856:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1860:1: ( rule__Rule__Group_1__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1861:2: rule__Rule__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1__1__Impl_in_rule__Rule__Group_1__13651);
            rule__Rule__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1867:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__PreAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1871:1: ( ( ( rule__Rule__PreAssignment_1_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1872:1: ( ( rule__Rule__PreAssignment_1_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1872:1: ( ( rule__Rule__PreAssignment_1_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1873:1: ( rule__Rule__PreAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getPreAssignment_1_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1874:1: ( rule__Rule__PreAssignment_1_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1874:2: rule__Rule__PreAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__PreAssignment_1_1_in_rule__Rule__Group_1__1__Impl3678);
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


    // $ANTLR start "rule__Atelier_Impl__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1888:1: rule__Atelier_Impl__Group__0 : rule__Atelier_Impl__Group__0__Impl rule__Atelier_Impl__Group__1 ;
    public final void rule__Atelier_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1892:1: ( rule__Atelier_Impl__Group__0__Impl rule__Atelier_Impl__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1893:2: rule__Atelier_Impl__Group__0__Impl rule__Atelier_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__0__Impl_in_rule__Atelier_Impl__Group__03712);
            rule__Atelier_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__1_in_rule__Atelier_Impl__Group__03715);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1900:1: rule__Atelier_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Atelier_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1904:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1905:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1905:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1906:1: ()
            {
             before(grammarAccess.getAtelier_ImplAccess().getAtelierAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1907:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1909:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1919:1: rule__Atelier_Impl__Group__1 : rule__Atelier_Impl__Group__1__Impl rule__Atelier_Impl__Group__2 ;
    public final void rule__Atelier_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1923:1: ( rule__Atelier_Impl__Group__1__Impl rule__Atelier_Impl__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1924:2: rule__Atelier_Impl__Group__1__Impl rule__Atelier_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__1__Impl_in_rule__Atelier_Impl__Group__13773);
            rule__Atelier_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__2_in_rule__Atelier_Impl__Group__13776);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1931:1: rule__Atelier_Impl__Group__1__Impl : ( 'Atelier' ) ;
    public final void rule__Atelier_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1935:1: ( ( 'Atelier' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1936:1: ( 'Atelier' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1936:1: ( 'Atelier' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1937:1: 'Atelier'
            {
             before(grammarAccess.getAtelier_ImplAccess().getAtelierKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Atelier_Impl__Group__1__Impl3804); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1950:1: rule__Atelier_Impl__Group__2 : rule__Atelier_Impl__Group__2__Impl rule__Atelier_Impl__Group__3 ;
    public final void rule__Atelier_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1954:1: ( rule__Atelier_Impl__Group__2__Impl rule__Atelier_Impl__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1955:2: rule__Atelier_Impl__Group__2__Impl rule__Atelier_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__2__Impl_in_rule__Atelier_Impl__Group__23835);
            rule__Atelier_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__3_in_rule__Atelier_Impl__Group__23838);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1962:1: rule__Atelier_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Atelier_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1966:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1967:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1967:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1968:1: '{'
            {
             before(grammarAccess.getAtelier_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Atelier_Impl__Group__2__Impl3866); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1981:1: rule__Atelier_Impl__Group__3 : rule__Atelier_Impl__Group__3__Impl rule__Atelier_Impl__Group__4 ;
    public final void rule__Atelier_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1985:1: ( rule__Atelier_Impl__Group__3__Impl rule__Atelier_Impl__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1986:2: rule__Atelier_Impl__Group__3__Impl rule__Atelier_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__3__Impl_in_rule__Atelier_Impl__Group__33897);
            rule__Atelier_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__4_in_rule__Atelier_Impl__Group__33900);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1993:1: rule__Atelier_Impl__Group__3__Impl : ( ( rule__Atelier_Impl__Group_3__0 )? ) ;
    public final void rule__Atelier_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1997:1: ( ( ( rule__Atelier_Impl__Group_3__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1998:1: ( ( rule__Atelier_Impl__Group_3__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1998:1: ( ( rule__Atelier_Impl__Group_3__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1999:1: ( rule__Atelier_Impl__Group_3__0 )?
            {
             before(grammarAccess.getAtelier_ImplAccess().getGroup_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2000:1: ( rule__Atelier_Impl__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2000:2: rule__Atelier_Impl__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__0_in_rule__Atelier_Impl__Group__3__Impl3927);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2010:1: rule__Atelier_Impl__Group__4 : rule__Atelier_Impl__Group__4__Impl ;
    public final void rule__Atelier_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2014:1: ( rule__Atelier_Impl__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2015:2: rule__Atelier_Impl__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__4__Impl_in_rule__Atelier_Impl__Group__43958);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2021:1: rule__Atelier_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__Atelier_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2025:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2026:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2026:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2027:1: '}'
            {
             before(grammarAccess.getAtelier_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Atelier_Impl__Group__4__Impl3986); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2050:1: rule__Atelier_Impl__Group_3__0 : rule__Atelier_Impl__Group_3__0__Impl rule__Atelier_Impl__Group_3__1 ;
    public final void rule__Atelier_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2054:1: ( rule__Atelier_Impl__Group_3__0__Impl rule__Atelier_Impl__Group_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2055:2: rule__Atelier_Impl__Group_3__0__Impl rule__Atelier_Impl__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__0__Impl_in_rule__Atelier_Impl__Group_3__04027);
            rule__Atelier_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__1_in_rule__Atelier_Impl__Group_3__04030);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2062:1: rule__Atelier_Impl__Group_3__0__Impl : ( 'activity' ) ;
    public final void rule__Atelier_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2066:1: ( ( 'activity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2067:1: ( 'activity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2067:1: ( 'activity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2068:1: 'activity'
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityKeyword_3_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Atelier_Impl__Group_3__0__Impl4058); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2081:1: rule__Atelier_Impl__Group_3__1 : rule__Atelier_Impl__Group_3__1__Impl ;
    public final void rule__Atelier_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2085:1: ( rule__Atelier_Impl__Group_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2086:2: rule__Atelier_Impl__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__1__Impl_in_rule__Atelier_Impl__Group_3__14089);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2092:1: rule__Atelier_Impl__Group_3__1__Impl : ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) ) ;
    public final void rule__Atelier_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2096:1: ( ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2097:1: ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2097:1: ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2098:1: ( rule__Atelier_Impl__ActivityAssignment_3_1 )
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityAssignment_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2099:1: ( rule__Atelier_Impl__ActivityAssignment_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2099:2: rule__Atelier_Impl__ActivityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__ActivityAssignment_3_1_in_rule__Atelier_Impl__Group_3__1__Impl4116);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2113:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2117:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2118:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04150);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04153);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2125:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2129:1: ( ( ( '-' )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2130:1: ( ( '-' )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2130:1: ( ( '-' )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2131:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2132:1: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2133:2: '-'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__EInt__Group__0__Impl4182); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2144:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2148:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2149:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14215);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2155:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2159:1: ( ( RULE_INT ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2160:1: ( RULE_INT )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2160:1: ( RULE_INT )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2161:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4242); 
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


    // $ANTLR start "rule__Elevage__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2177:1: rule__Elevage__Group__0 : rule__Elevage__Group__0__Impl rule__Elevage__Group__1 ;
    public final void rule__Elevage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2181:1: ( rule__Elevage__Group__0__Impl rule__Elevage__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2182:2: rule__Elevage__Group__0__Impl rule__Elevage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__0__Impl_in_rule__Elevage__Group__04276);
            rule__Elevage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__1_in_rule__Elevage__Group__04279);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2189:1: rule__Elevage__Group__0__Impl : ( () ) ;
    public final void rule__Elevage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2193:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2194:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2194:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2195:1: ()
            {
             before(grammarAccess.getElevageAccess().getElevageAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2196:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2198:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2208:1: rule__Elevage__Group__1 : rule__Elevage__Group__1__Impl rule__Elevage__Group__2 ;
    public final void rule__Elevage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2212:1: ( rule__Elevage__Group__1__Impl rule__Elevage__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2213:2: rule__Elevage__Group__1__Impl rule__Elevage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__1__Impl_in_rule__Elevage__Group__14337);
            rule__Elevage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__2_in_rule__Elevage__Group__14340);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2220:1: rule__Elevage__Group__1__Impl : ( 'Elevage' ) ;
    public final void rule__Elevage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2224:1: ( ( 'Elevage' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2225:1: ( 'Elevage' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2225:1: ( 'Elevage' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2226:1: 'Elevage'
            {
             before(grammarAccess.getElevageAccess().getElevageKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Elevage__Group__1__Impl4368); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2239:1: rule__Elevage__Group__2 : rule__Elevage__Group__2__Impl rule__Elevage__Group__3 ;
    public final void rule__Elevage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2243:1: ( rule__Elevage__Group__2__Impl rule__Elevage__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2244:2: rule__Elevage__Group__2__Impl rule__Elevage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__2__Impl_in_rule__Elevage__Group__24399);
            rule__Elevage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__3_in_rule__Elevage__Group__24402);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2251:1: rule__Elevage__Group__2__Impl : ( '{' ) ;
    public final void rule__Elevage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2255:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2256:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2256:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2257:1: '{'
            {
             before(grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Elevage__Group__2__Impl4430); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2270:1: rule__Elevage__Group__3 : rule__Elevage__Group__3__Impl rule__Elevage__Group__4 ;
    public final void rule__Elevage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2274:1: ( rule__Elevage__Group__3__Impl rule__Elevage__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2275:2: rule__Elevage__Group__3__Impl rule__Elevage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__3__Impl_in_rule__Elevage__Group__34461);
            rule__Elevage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__4_in_rule__Elevage__Group__34464);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2282:1: rule__Elevage__Group__3__Impl : ( ( rule__Elevage__Group_3__0 )? ) ;
    public final void rule__Elevage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2286:1: ( ( ( rule__Elevage__Group_3__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2287:1: ( ( rule__Elevage__Group_3__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2287:1: ( ( rule__Elevage__Group_3__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2288:1: ( rule__Elevage__Group_3__0 )?
            {
             before(grammarAccess.getElevageAccess().getGroup_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2289:1: ( rule__Elevage__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2289:2: rule__Elevage__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__0_in_rule__Elevage__Group__3__Impl4491);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2299:1: rule__Elevage__Group__4 : rule__Elevage__Group__4__Impl ;
    public final void rule__Elevage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2303:1: ( rule__Elevage__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2304:2: rule__Elevage__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__4__Impl_in_rule__Elevage__Group__44522);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2310:1: rule__Elevage__Group__4__Impl : ( '}' ) ;
    public final void rule__Elevage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2314:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2315:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2315:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2316:1: '}'
            {
             before(grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Elevage__Group__4__Impl4550); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2339:1: rule__Elevage__Group_3__0 : rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1 ;
    public final void rule__Elevage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2343:1: ( rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2344:2: rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__0__Impl_in_rule__Elevage__Group_3__04591);
            rule__Elevage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__1_in_rule__Elevage__Group_3__04594);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2351:1: rule__Elevage__Group_3__0__Impl : ( 'activity' ) ;
    public final void rule__Elevage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2355:1: ( ( 'activity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2356:1: ( 'activity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2356:1: ( 'activity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2357:1: 'activity'
            {
             before(grammarAccess.getElevageAccess().getActivityKeyword_3_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Elevage__Group_3__0__Impl4622); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2370:1: rule__Elevage__Group_3__1 : rule__Elevage__Group_3__1__Impl ;
    public final void rule__Elevage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2374:1: ( rule__Elevage__Group_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2375:2: rule__Elevage__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__1__Impl_in_rule__Elevage__Group_3__14653);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2381:1: rule__Elevage__Group_3__1__Impl : ( ( rule__Elevage__ActivityAssignment_3_1 ) ) ;
    public final void rule__Elevage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2385:1: ( ( ( rule__Elevage__ActivityAssignment_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2386:1: ( ( rule__Elevage__ActivityAssignment_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2386:1: ( ( rule__Elevage__ActivityAssignment_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2387:1: ( rule__Elevage__ActivityAssignment_3_1 )
            {
             before(grammarAccess.getElevageAccess().getActivityAssignment_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2388:1: ( rule__Elevage__ActivityAssignment_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2388:2: rule__Elevage__ActivityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__ActivityAssignment_3_1_in_rule__Elevage__Group_3__1__Impl4680);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2402:1: rule__Culture__Group__0 : rule__Culture__Group__0__Impl rule__Culture__Group__1 ;
    public final void rule__Culture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2406:1: ( rule__Culture__Group__0__Impl rule__Culture__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2407:2: rule__Culture__Group__0__Impl rule__Culture__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__04714);
            rule__Culture__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__04717);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2414:1: rule__Culture__Group__0__Impl : ( () ) ;
    public final void rule__Culture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2418:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2419:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2419:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2420:1: ()
            {
             before(grammarAccess.getCultureAccess().getCultureAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2421:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2423:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2433:1: rule__Culture__Group__1 : rule__Culture__Group__1__Impl rule__Culture__Group__2 ;
    public final void rule__Culture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2437:1: ( rule__Culture__Group__1__Impl rule__Culture__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2438:2: rule__Culture__Group__1__Impl rule__Culture__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__14775);
            rule__Culture__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__14778);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2445:1: rule__Culture__Group__1__Impl : ( 'Culture' ) ;
    public final void rule__Culture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2449:1: ( ( 'Culture' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2450:1: ( 'Culture' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2450:1: ( 'Culture' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2451:1: 'Culture'
            {
             before(grammarAccess.getCultureAccess().getCultureKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Culture__Group__1__Impl4806); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2464:1: rule__Culture__Group__2 : rule__Culture__Group__2__Impl rule__Culture__Group__3 ;
    public final void rule__Culture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2468:1: ( rule__Culture__Group__2__Impl rule__Culture__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2469:2: rule__Culture__Group__2__Impl rule__Culture__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__24837);
            rule__Culture__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__24840);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2476:1: rule__Culture__Group__2__Impl : ( '{' ) ;
    public final void rule__Culture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2480:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2481:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2481:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2482:1: '{'
            {
             before(grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Culture__Group__2__Impl4868); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2495:1: rule__Culture__Group__3 : rule__Culture__Group__3__Impl rule__Culture__Group__4 ;
    public final void rule__Culture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2499:1: ( rule__Culture__Group__3__Impl rule__Culture__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2500:2: rule__Culture__Group__3__Impl rule__Culture__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__34899);
            rule__Culture__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__34902);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2507:1: rule__Culture__Group__3__Impl : ( ( rule__Culture__Group_3__0 )? ) ;
    public final void rule__Culture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2511:1: ( ( ( rule__Culture__Group_3__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2512:1: ( ( rule__Culture__Group_3__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2512:1: ( ( rule__Culture__Group_3__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2513:1: ( rule__Culture__Group_3__0 )?
            {
             before(grammarAccess.getCultureAccess().getGroup_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2514:1: ( rule__Culture__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2514:2: rule__Culture__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__0_in_rule__Culture__Group__3__Impl4929);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2524:1: rule__Culture__Group__4 : rule__Culture__Group__4__Impl ;
    public final void rule__Culture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2528:1: ( rule__Culture__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2529:2: rule__Culture__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__44960);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2535:1: rule__Culture__Group__4__Impl : ( '}' ) ;
    public final void rule__Culture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2539:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2540:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2540:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2541:1: '}'
            {
             before(grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Culture__Group__4__Impl4988); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2564:1: rule__Culture__Group_3__0 : rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1 ;
    public final void rule__Culture__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2568:1: ( rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2569:2: rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__0__Impl_in_rule__Culture__Group_3__05029);
            rule__Culture__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__1_in_rule__Culture__Group_3__05032);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2576:1: rule__Culture__Group_3__0__Impl : ( 'activity' ) ;
    public final void rule__Culture__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2580:1: ( ( 'activity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2581:1: ( 'activity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2581:1: ( 'activity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2582:1: 'activity'
            {
             before(grammarAccess.getCultureAccess().getActivityKeyword_3_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Culture__Group_3__0__Impl5060); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2595:1: rule__Culture__Group_3__1 : rule__Culture__Group_3__1__Impl ;
    public final void rule__Culture__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2599:1: ( rule__Culture__Group_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2600:2: rule__Culture__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__1__Impl_in_rule__Culture__Group_3__15091);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2606:1: rule__Culture__Group_3__1__Impl : ( ( rule__Culture__ActivityAssignment_3_1 ) ) ;
    public final void rule__Culture__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2610:1: ( ( ( rule__Culture__ActivityAssignment_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2611:1: ( ( rule__Culture__ActivityAssignment_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2611:1: ( ( rule__Culture__ActivityAssignment_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2612:1: ( rule__Culture__ActivityAssignment_3_1 )
            {
             before(grammarAccess.getCultureAccess().getActivityAssignment_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2613:1: ( rule__Culture__ActivityAssignment_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2613:2: rule__Culture__ActivityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__ActivityAssignment_3_1_in_rule__Culture__Group_3__1__Impl5118);
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


    // $ANTLR start "rule__PeriodicActivity__NameAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2628:1: rule__PeriodicActivity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PeriodicActivity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2632:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2633:1: ( ruleEString )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2633:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2634:1: ruleEString
            {
             before(grammarAccess.getPeriodicActivityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeriodicActivity__NameAssignment_25157);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2643:1: rule__PeriodicActivity__AtelierAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__PeriodicActivity__AtelierAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2647:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2648:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2648:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2649:1: ( ruleEString )
            {
             before(grammarAccess.getPeriodicActivityAccess().getAtelierAtelierCrossReference_4_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2650:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2651:1: ruleEString
            {
             before(grammarAccess.getPeriodicActivityAccess().getAtelierAtelierEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeriodicActivity__AtelierAssignment_4_15192);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2662:1: rule__PeriodicActivity__StartAssignment_6 : ( ruleDate ) ;
    public final void rule__PeriodicActivity__StartAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2666:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2667:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2667:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2668:1: ruleDate
            {
             before(grammarAccess.getPeriodicActivityAccess().getStartDateParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__PeriodicActivity__StartAssignment_65227);
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


    // $ANTLR start "rule__PeriodicActivity__EndAssignment_9"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2677:1: rule__PeriodicActivity__EndAssignment_9 : ( ruleDate ) ;
    public final void rule__PeriodicActivity__EndAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2681:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2682:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2682:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2683:1: ruleDate
            {
             before(grammarAccess.getPeriodicActivityAccess().getEndDateParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__PeriodicActivity__EndAssignment_95258);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getEndDateParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__EndAssignment_9"


    // $ANTLR start "rule__PeriodicActivity__ResAllocationAssignment_12_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2692:1: rule__PeriodicActivity__ResAllocationAssignment_12_2 : ( ruleResAllocation ) ;
    public final void rule__PeriodicActivity__ResAllocationAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2696:1: ( ( ruleResAllocation ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2697:1: ( ruleResAllocation )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2697:1: ( ruleResAllocation )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2698:1: ruleResAllocation
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_12_25289);
            ruleResAllocation();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__ResAllocationAssignment_12_2"


    // $ANTLR start "rule__PeriodicActivity__ResAllocationAssignment_12_3_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2707:1: rule__PeriodicActivity__ResAllocationAssignment_12_3_1 : ( ruleResAllocation ) ;
    public final void rule__PeriodicActivity__ResAllocationAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2711:1: ( ( ruleResAllocation ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2712:1: ( ruleResAllocation )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2712:1: ( ruleResAllocation )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2713:1: ruleResAllocation
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_12_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_12_3_15320);
            ruleResAllocation();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__ResAllocationAssignment_12_3_1"


    // $ANTLR start "rule__PeriodicActivity__RuleAssignment_13_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2722:1: rule__PeriodicActivity__RuleAssignment_13_2 : ( ruleRule ) ;
    public final void rule__PeriodicActivity__RuleAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2726:1: ( ( ruleRule ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2727:1: ( ruleRule )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2727:1: ( ruleRule )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2728:1: ruleRule
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_13_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__PeriodicActivity__RuleAssignment_13_25351);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__RuleAssignment_13_2"


    // $ANTLR start "rule__PeriodicActivity__RuleAssignment_13_3_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2737:1: rule__PeriodicActivity__RuleAssignment_13_3_1 : ( ruleRule ) ;
    public final void rule__PeriodicActivity__RuleAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2741:1: ( ( ruleRule ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2742:1: ( ruleRule )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2742:1: ( ruleRule )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2743:1: ruleRule
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_13_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__PeriodicActivity__RuleAssignment_13_3_15382);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_13_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__RuleAssignment_13_3_1"


    // $ANTLR start "rule__Date__DayAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2752:1: rule__Date__DayAssignment_2 : ( ruleEInt ) ;
    public final void rule__Date__DayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2756:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2757:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2757:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2758:1: ruleEInt
            {
             before(grammarAccess.getDateAccess().getDayEIntParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Date__DayAssignment_25413);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDateAccess().getDayEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__DayAssignment_2"


    // $ANTLR start "rule__ResAllocation__RessourceAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2767:1: rule__ResAllocation__RessourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ResAllocation__RessourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2771:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2772:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2772:1: ( ( RULE_ID ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2773:1: ( RULE_ID )
            {
             before(grammarAccess.getResAllocationAccess().getRessourceRessourceCrossReference_2_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2774:1: ( RULE_ID )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2775:1: RULE_ID
            {
             before(grammarAccess.getResAllocationAccess().getRessourceRessourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ResAllocation__RessourceAssignment_25448); 
             after(grammarAccess.getResAllocationAccess().getRessourceRessourceIDTerminalRuleCall_2_0_1()); 

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


    // $ANTLR start "rule__ResAllocation__DureeAssignment_4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2786:1: rule__ResAllocation__DureeAssignment_4 : ( ruleEInt ) ;
    public final void rule__ResAllocation__DureeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2790:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2791:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2791:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2792:1: ruleEInt
            {
             before(grammarAccess.getResAllocationAccess().getDureeEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ResAllocation__DureeAssignment_45483);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getResAllocationAccess().getDureeEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResAllocation__DureeAssignment_4"


    // $ANTLR start "rule__Rule__PreAssignment_1_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2801:1: rule__Rule__PreAssignment_1_1 : ( rulePredicate ) ;
    public final void rule__Rule__PreAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2805:1: ( ( rulePredicate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2806:1: ( rulePredicate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2806:1: ( rulePredicate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2807:1: rulePredicate
            {
             before(grammarAccess.getRuleAccess().getPrePredicateParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_rule__Rule__PreAssignment_1_15514);
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


    // $ANTLR start "rule__Atelier_Impl__ActivityAssignment_3_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2816:1: rule__Atelier_Impl__ActivityAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Atelier_Impl__ActivityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2820:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2821:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2821:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2822:1: ( ruleEString )
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2823:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2824:1: ruleEString
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Atelier_Impl__ActivityAssignment_3_15549);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2836:1: rule__Elevage__ActivityAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Elevage__ActivityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2840:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2841:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2841:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2842:1: ( ruleEString )
            {
             before(grammarAccess.getElevageAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2843:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2844:1: ruleEString
            {
             before(grammarAccess.getElevageAccess().getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Elevage__ActivityAssignment_3_15589);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2855:1: rule__Culture__ActivityAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Culture__ActivityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2859:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2860:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2860:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2861:1: ( ruleEString )
            {
             before(grammarAccess.getCultureAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2862:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2863:1: ruleEString
            {
             before(grammarAccess.getCultureAccess().getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Culture__ActivityAssignment_3_15628);
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
        public static final BitSet FOLLOW_rulePeriodicActivity_in_entryRulePeriodicActivity61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePeriodicActivity68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__0_in_rulePeriodicActivity94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate123 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0_in_ruleDate156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_entryRuleResAllocation183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResAllocation190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__0_in_ruleResAllocation216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtelier_Impl370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__0_in_ruleAtelier_Impl396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicate492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElevage_in_entryRuleElevage546 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElevage553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__0_in_ruleElevage579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCulture_in_entryRuleCulture606 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCulture613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__0_in_ruleCulture639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__PeriodicActivity__Alternatives_11_1676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__PeriodicActivity__Alternatives_11_1696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__PeriodicActivity__Alternatives_11_1716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__PeriodicActivity__Alternatives_11_1736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__PeriodicActivity__Alternatives_11_1756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__0__Impl_in_rule__PeriodicActivity__Group__0838 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__1_in_rule__PeriodicActivity__Group__0841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__1__Impl_in_rule__PeriodicActivity__Group__1899 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__2_in_rule__PeriodicActivity__Group__1902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__PeriodicActivity__Group__1__Impl930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__2__Impl_in_rule__PeriodicActivity__Group__2961 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__3_in_rule__PeriodicActivity__Group__2964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__NameAssignment_2_in_rule__PeriodicActivity__Group__2__Impl991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__3__Impl_in_rule__PeriodicActivity__Group__31021 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__4_in_rule__PeriodicActivity__Group__31024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PeriodicActivity__Group__3__Impl1052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__4__Impl_in_rule__PeriodicActivity__Group__41083 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__5_in_rule__PeriodicActivity__Group__41086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__0_in_rule__PeriodicActivity__Group__4__Impl1113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__5__Impl_in_rule__PeriodicActivity__Group__51144 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__6_in_rule__PeriodicActivity__Group__51147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__PeriodicActivity__Group__5__Impl1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__6__Impl_in_rule__PeriodicActivity__Group__61206 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__7_in_rule__PeriodicActivity__Group__61209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__StartAssignment_6_in_rule__PeriodicActivity__Group__6__Impl1236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__7__Impl_in_rule__PeriodicActivity__Group__71266 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__8_in_rule__PeriodicActivity__Group__71269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PeriodicActivity__Group__7__Impl1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__8__Impl_in_rule__PeriodicActivity__Group__81328 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__9_in_rule__PeriodicActivity__Group__81331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__PeriodicActivity__Group__8__Impl1359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__9__Impl_in_rule__PeriodicActivity__Group__91390 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__10_in_rule__PeriodicActivity__Group__91393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__EndAssignment_9_in_rule__PeriodicActivity__Group__9__Impl1420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__10__Impl_in_rule__PeriodicActivity__Group__101450 = new BitSet(new long[]{0x0000000005A00000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__11_in_rule__PeriodicActivity__Group__101453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PeriodicActivity__Group__10__Impl1481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__11__Impl_in_rule__PeriodicActivity__Group__111512 = new BitSet(new long[]{0x0000000005A00000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__12_in_rule__PeriodicActivity__Group__111515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__0_in_rule__PeriodicActivity__Group__11__Impl1542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__12__Impl_in_rule__PeriodicActivity__Group__121573 = new BitSet(new long[]{0x0000000005A00000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__13_in_rule__PeriodicActivity__Group__121576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__0_in_rule__PeriodicActivity__Group__12__Impl1603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__13__Impl_in_rule__PeriodicActivity__Group__131634 = new BitSet(new long[]{0x0000000005A00000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__14_in_rule__PeriodicActivity__Group__131637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__0_in_rule__PeriodicActivity__Group__13__Impl1664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__14__Impl_in_rule__PeriodicActivity__Group__141695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__PeriodicActivity__Group__14__Impl1723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__0__Impl_in_rule__PeriodicActivity__Group_4__01784 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__1_in_rule__PeriodicActivity__Group_4__01787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__PeriodicActivity__Group_4__0__Impl1815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__1__Impl_in_rule__PeriodicActivity__Group_4__11846 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__2_in_rule__PeriodicActivity__Group_4__11849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__AtelierAssignment_4_1_in_rule__PeriodicActivity__Group_4__1__Impl1876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__2__Impl_in_rule__PeriodicActivity__Group_4__21906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PeriodicActivity__Group_4__2__Impl1934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__0__Impl_in_rule__PeriodicActivity__Group_11__01971 = new BitSet(new long[]{0x000000000000F800L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__1_in_rule__PeriodicActivity__Group_11__01974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__PeriodicActivity__Group_11__0__Impl2002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_11__1__Impl_in_rule__PeriodicActivity__Group_11__12033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Alternatives_11_1_in_rule__PeriodicActivity__Group_11__1__Impl2060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__0__Impl_in_rule__PeriodicActivity__Group_12__02094 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__1_in_rule__PeriodicActivity__Group_12__02097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__PeriodicActivity__Group_12__0__Impl2125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__1__Impl_in_rule__PeriodicActivity__Group_12__12156 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__2_in_rule__PeriodicActivity__Group_12__12159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PeriodicActivity__Group_12__1__Impl2187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__2__Impl_in_rule__PeriodicActivity__Group_12__22218 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__3_in_rule__PeriodicActivity__Group_12__22221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_12_2_in_rule__PeriodicActivity__Group_12__2__Impl2248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__3__Impl_in_rule__PeriodicActivity__Group_12__32278 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__4_in_rule__PeriodicActivity__Group_12__32281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12_3__0_in_rule__PeriodicActivity__Group_12__3__Impl2308 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__4__Impl_in_rule__PeriodicActivity__Group_12__42339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__PeriodicActivity__Group_12__4__Impl2367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12_3__0__Impl_in_rule__PeriodicActivity__Group_12_3__02408 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12_3__1_in_rule__PeriodicActivity__Group_12_3__02411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PeriodicActivity__Group_12_3__0__Impl2439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12_3__1__Impl_in_rule__PeriodicActivity__Group_12_3__12470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_12_3_1_in_rule__PeriodicActivity__Group_12_3__1__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__0__Impl_in_rule__PeriodicActivity__Group_13__02531 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__1_in_rule__PeriodicActivity__Group_13__02534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__PeriodicActivity__Group_13__0__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__1__Impl_in_rule__PeriodicActivity__Group_13__12593 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__2_in_rule__PeriodicActivity__Group_13__12596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PeriodicActivity__Group_13__1__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__2__Impl_in_rule__PeriodicActivity__Group_13__22655 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__3_in_rule__PeriodicActivity__Group_13__22658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__RuleAssignment_13_2_in_rule__PeriodicActivity__Group_13__2__Impl2685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__3__Impl_in_rule__PeriodicActivity__Group_13__32715 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__4_in_rule__PeriodicActivity__Group_13__32718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13_3__0_in_rule__PeriodicActivity__Group_13__3__Impl2745 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__4__Impl_in_rule__PeriodicActivity__Group_13__42776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__PeriodicActivity__Group_13__4__Impl2804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13_3__0__Impl_in_rule__PeriodicActivity__Group_13_3__02845 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13_3__1_in_rule__PeriodicActivity__Group_13_3__02848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PeriodicActivity__Group_13_3__0__Impl2876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13_3__1__Impl_in_rule__PeriodicActivity__Group_13_3__12907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__RuleAssignment_13_3_1_in_rule__PeriodicActivity__Group_13_3__1__Impl2934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__02968 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__02971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__13029 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_rule__Date__Group__2_in_rule__Date__Group__13032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Date__Group__1__Impl3060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__23091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__DayAssignment_2_in_rule__Date__Group__2__Impl3118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__0__Impl_in_rule__ResAllocation__Group__03154 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__1_in_rule__ResAllocation__Group__03157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__1__Impl_in_rule__ResAllocation__Group__13215 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__2_in_rule__ResAllocation__Group__13218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ResAllocation__Group__1__Impl3246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__2__Impl_in_rule__ResAllocation__Group__23277 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__3_in_rule__ResAllocation__Group__23280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__RessourceAssignment_2_in_rule__ResAllocation__Group__2__Impl3307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__3__Impl_in_rule__ResAllocation__Group__33337 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__4_in_rule__ResAllocation__Group__33340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ResAllocation__Group__3__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__4__Impl_in_rule__ResAllocation__Group__43399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__DureeAssignment_4_in_rule__ResAllocation__Group__4__Impl3426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03466 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_1__0_in_rule__Rule__Group__1__Impl3554 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_1__0__Impl_in_rule__Rule__Group_1__03589 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group_1__1_in_rule__Rule__Group_1__03592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Rule__Group_1__0__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_1__1__Impl_in_rule__Rule__Group_1__13651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__PreAssignment_1_1_in_rule__Rule__Group_1__1__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__0__Impl_in_rule__Atelier_Impl__Group__03712 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__1_in_rule__Atelier_Impl__Group__03715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__1__Impl_in_rule__Atelier_Impl__Group__13773 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__2_in_rule__Atelier_Impl__Group__13776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Atelier_Impl__Group__1__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__2__Impl_in_rule__Atelier_Impl__Group__23835 = new BitSet(new long[]{0x0000000100200000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__3_in_rule__Atelier_Impl__Group__23838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Atelier_Impl__Group__2__Impl3866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__3__Impl_in_rule__Atelier_Impl__Group__33897 = new BitSet(new long[]{0x0000000100200000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__4_in_rule__Atelier_Impl__Group__33900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__0_in_rule__Atelier_Impl__Group__3__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__4__Impl_in_rule__Atelier_Impl__Group__43958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Atelier_Impl__Group__4__Impl3986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__0__Impl_in_rule__Atelier_Impl__Group_3__04027 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__1_in_rule__Atelier_Impl__Group_3__04030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Atelier_Impl__Group_3__0__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__1__Impl_in_rule__Atelier_Impl__Group_3__14089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__ActivityAssignment_3_1_in_rule__Atelier_Impl__Group_3__1__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04150 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__EInt__Group__0__Impl4182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__0__Impl_in_rule__Elevage__Group__04276 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Elevage__Group__1_in_rule__Elevage__Group__04279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__1__Impl_in_rule__Elevage__Group__14337 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Elevage__Group__2_in_rule__Elevage__Group__14340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Elevage__Group__1__Impl4368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__2__Impl_in_rule__Elevage__Group__24399 = new BitSet(new long[]{0x0000000100200000L});
        public static final BitSet FOLLOW_rule__Elevage__Group__3_in_rule__Elevage__Group__24402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Elevage__Group__2__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__3__Impl_in_rule__Elevage__Group__34461 = new BitSet(new long[]{0x0000000100200000L});
        public static final BitSet FOLLOW_rule__Elevage__Group__4_in_rule__Elevage__Group__34464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__0_in_rule__Elevage__Group__3__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__4__Impl_in_rule__Elevage__Group__44522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Elevage__Group__4__Impl4550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__0__Impl_in_rule__Elevage__Group_3__04591 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__1_in_rule__Elevage__Group_3__04594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Elevage__Group_3__0__Impl4622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__1__Impl_in_rule__Elevage__Group_3__14653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__ActivityAssignment_3_1_in_rule__Elevage__Group_3__1__Impl4680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__04714 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__04717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__14775 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__14778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Culture__Group__1__Impl4806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__24837 = new BitSet(new long[]{0x0000000100200000L});
        public static final BitSet FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__24840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Culture__Group__2__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__34899 = new BitSet(new long[]{0x0000000100200000L});
        public static final BitSet FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__34902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__0_in_rule__Culture__Group__3__Impl4929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__44960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Culture__Group__4__Impl4988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__0__Impl_in_rule__Culture__Group_3__05029 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__1_in_rule__Culture__Group_3__05032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Culture__Group_3__0__Impl5060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__1__Impl_in_rule__Culture__Group_3__15091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__ActivityAssignment_3_1_in_rule__Culture__Group_3__1__Impl5118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeriodicActivity__NameAssignment_25157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeriodicActivity__AtelierAssignment_4_15192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__PeriodicActivity__StartAssignment_65227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__PeriodicActivity__EndAssignment_95258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_12_25289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_12_3_15320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__PeriodicActivity__RuleAssignment_13_25351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__PeriodicActivity__RuleAssignment_13_3_15382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Date__DayAssignment_25413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ResAllocation__RessourceAssignment_25448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ResAllocation__DureeAssignment_45483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_rule__Rule__PreAssignment_1_15514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Atelier_Impl__ActivityAssignment_3_15549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Elevage__ActivityAssignment_3_15589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Culture__ActivityAssignment_3_15628 = new BitSet(new long[]{0x0000000000000002L});
    }


}
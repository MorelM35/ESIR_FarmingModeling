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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'months'", "'days'", "'weeks'", "'years'", "'hours'", "'PeriodicActivity'", "'{'", "'start'", "'from'", "'to'", "'end'", "','", "'}'", "'atelier'", "'every'", "'allocate'", "'} ,'", "'rules'", "'reserve'", "'for'", "'pre'", "'Atelier'", "'activity'", "'-'", "'Elevage'", "'Culture'"
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
    public static final int T__36=36;
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


    // $ANTLR start "rulePeriodicity"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:347:1: rulePeriodicity : ( ( rule__Periodicity__Alternatives ) ) ;
    public final void rulePeriodicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:351:1: ( ( ( rule__Periodicity__Alternatives ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:352:1: ( ( rule__Periodicity__Alternatives ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:352:1: ( ( rule__Periodicity__Alternatives ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:353:1: ( rule__Periodicity__Alternatives )
            {
             before(grammarAccess.getPeriodicityAccess().getAlternatives()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:354:1: ( rule__Periodicity__Alternatives )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:354:2: rule__Periodicity__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Periodicity__Alternatives_in_rulePeriodicity676);
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


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:366:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:370:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:371:1: ( RULE_STRING )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:371:1: ( RULE_STRING )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:372:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives712); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:377:6: ( RULE_ID )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:377:6: ( RULE_ID )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:378:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives729); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:388:1: rule__Periodicity__Alternatives : ( ( ( 'months' ) ) | ( ( 'days' ) ) | ( ( 'weeks' ) ) | ( ( 'years' ) ) | ( ( 'hours' ) ) );
    public final void rule__Periodicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:392:1: ( ( ( 'months' ) ) | ( ( 'days' ) ) | ( ( 'weeks' ) ) | ( ( 'years' ) ) | ( ( 'hours' ) ) )
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
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:393:1: ( ( 'months' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:393:1: ( ( 'months' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:394:1: ( 'months' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getMonthsEnumLiteralDeclaration_0()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:395:1: ( 'months' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:395:3: 'months'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Periodicity__Alternatives762); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getMonthsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:400:6: ( ( 'days' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:400:6: ( ( 'days' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:401:1: ( 'days' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:402:1: ( 'days' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:402:3: 'days'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Periodicity__Alternatives783); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:407:6: ( ( 'weeks' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:407:6: ( ( 'weeks' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:408:1: ( 'weeks' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:409:1: ( 'weeks' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:409:3: 'weeks'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Periodicity__Alternatives804); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:414:6: ( ( 'years' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:414:6: ( ( 'years' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:415:1: ( 'years' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:416:1: ( 'years' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:416:3: 'years'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Periodicity__Alternatives825); 

                    }

                     after(grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:421:6: ( ( 'hours' ) )
                    {
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:421:6: ( ( 'hours' ) )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:422:1: ( 'hours' )
                    {
                     before(grammarAccess.getPeriodicityAccess().getHoursEnumLiteralDeclaration_4()); 
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:423:1: ( 'hours' )
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:423:3: 'hours'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Periodicity__Alternatives846); 

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


    // $ANTLR start "rule__PeriodicActivity__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:435:1: rule__PeriodicActivity__Group__0 : rule__PeriodicActivity__Group__0__Impl rule__PeriodicActivity__Group__1 ;
    public final void rule__PeriodicActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:439:1: ( rule__PeriodicActivity__Group__0__Impl rule__PeriodicActivity__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:440:2: rule__PeriodicActivity__Group__0__Impl rule__PeriodicActivity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__0__Impl_in_rule__PeriodicActivity__Group__0879);
            rule__PeriodicActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__1_in_rule__PeriodicActivity__Group__0882);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:447:1: rule__PeriodicActivity__Group__0__Impl : ( () ) ;
    public final void rule__PeriodicActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:451:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:452:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:452:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:453:1: ()
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicActivityAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:454:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:456:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:466:1: rule__PeriodicActivity__Group__1 : rule__PeriodicActivity__Group__1__Impl rule__PeriodicActivity__Group__2 ;
    public final void rule__PeriodicActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:470:1: ( rule__PeriodicActivity__Group__1__Impl rule__PeriodicActivity__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:471:2: rule__PeriodicActivity__Group__1__Impl rule__PeriodicActivity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__1__Impl_in_rule__PeriodicActivity__Group__1940);
            rule__PeriodicActivity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__2_in_rule__PeriodicActivity__Group__1943);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:478:1: rule__PeriodicActivity__Group__1__Impl : ( 'PeriodicActivity' ) ;
    public final void rule__PeriodicActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:482:1: ( ( 'PeriodicActivity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:483:1: ( 'PeriodicActivity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:483:1: ( 'PeriodicActivity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:484:1: 'PeriodicActivity'
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicActivityKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__PeriodicActivity__Group__1__Impl971); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:497:1: rule__PeriodicActivity__Group__2 : rule__PeriodicActivity__Group__2__Impl rule__PeriodicActivity__Group__3 ;
    public final void rule__PeriodicActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:501:1: ( rule__PeriodicActivity__Group__2__Impl rule__PeriodicActivity__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:502:2: rule__PeriodicActivity__Group__2__Impl rule__PeriodicActivity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__2__Impl_in_rule__PeriodicActivity__Group__21002);
            rule__PeriodicActivity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__3_in_rule__PeriodicActivity__Group__21005);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:509:1: rule__PeriodicActivity__Group__2__Impl : ( ( rule__PeriodicActivity__NameAssignment_2 ) ) ;
    public final void rule__PeriodicActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:513:1: ( ( ( rule__PeriodicActivity__NameAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:514:1: ( ( rule__PeriodicActivity__NameAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:514:1: ( ( rule__PeriodicActivity__NameAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:515:1: ( rule__PeriodicActivity__NameAssignment_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getNameAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:516:1: ( rule__PeriodicActivity__NameAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:516:2: rule__PeriodicActivity__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__NameAssignment_2_in_rule__PeriodicActivity__Group__2__Impl1032);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:526:1: rule__PeriodicActivity__Group__3 : rule__PeriodicActivity__Group__3__Impl rule__PeriodicActivity__Group__4 ;
    public final void rule__PeriodicActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:530:1: ( rule__PeriodicActivity__Group__3__Impl rule__PeriodicActivity__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:531:2: rule__PeriodicActivity__Group__3__Impl rule__PeriodicActivity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__3__Impl_in_rule__PeriodicActivity__Group__31062);
            rule__PeriodicActivity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__4_in_rule__PeriodicActivity__Group__31065);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:538:1: rule__PeriodicActivity__Group__3__Impl : ( '{' ) ;
    public final void rule__PeriodicActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:542:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:543:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:543:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:544:1: '{'
            {
             before(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PeriodicActivity__Group__3__Impl1093); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:557:1: rule__PeriodicActivity__Group__4 : rule__PeriodicActivity__Group__4__Impl rule__PeriodicActivity__Group__5 ;
    public final void rule__PeriodicActivity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:561:1: ( rule__PeriodicActivity__Group__4__Impl rule__PeriodicActivity__Group__5 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:562:2: rule__PeriodicActivity__Group__4__Impl rule__PeriodicActivity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__4__Impl_in_rule__PeriodicActivity__Group__41124);
            rule__PeriodicActivity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__5_in_rule__PeriodicActivity__Group__41127);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:569:1: rule__PeriodicActivity__Group__4__Impl : ( ( rule__PeriodicActivity__Group_4__0 )? ) ;
    public final void rule__PeriodicActivity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:573:1: ( ( ( rule__PeriodicActivity__Group_4__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:574:1: ( ( rule__PeriodicActivity__Group_4__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:574:1: ( ( rule__PeriodicActivity__Group_4__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:575:1: ( rule__PeriodicActivity__Group_4__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:576:1: ( rule__PeriodicActivity__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:576:2: rule__PeriodicActivity__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__0_in_rule__PeriodicActivity__Group__4__Impl1154);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:586:1: rule__PeriodicActivity__Group__5 : rule__PeriodicActivity__Group__5__Impl rule__PeriodicActivity__Group__6 ;
    public final void rule__PeriodicActivity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:590:1: ( rule__PeriodicActivity__Group__5__Impl rule__PeriodicActivity__Group__6 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:591:2: rule__PeriodicActivity__Group__5__Impl rule__PeriodicActivity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__5__Impl_in_rule__PeriodicActivity__Group__51185);
            rule__PeriodicActivity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__6_in_rule__PeriodicActivity__Group__51188);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:598:1: rule__PeriodicActivity__Group__5__Impl : ( 'start' ) ;
    public final void rule__PeriodicActivity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:602:1: ( ( 'start' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:603:1: ( 'start' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:603:1: ( 'start' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:604:1: 'start'
            {
             before(grammarAccess.getPeriodicActivityAccess().getStartKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__PeriodicActivity__Group__5__Impl1216); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:617:1: rule__PeriodicActivity__Group__6 : rule__PeriodicActivity__Group__6__Impl rule__PeriodicActivity__Group__7 ;
    public final void rule__PeriodicActivity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:621:1: ( rule__PeriodicActivity__Group__6__Impl rule__PeriodicActivity__Group__7 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:622:2: rule__PeriodicActivity__Group__6__Impl rule__PeriodicActivity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__6__Impl_in_rule__PeriodicActivity__Group__61247);
            rule__PeriodicActivity__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__7_in_rule__PeriodicActivity__Group__61250);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:629:1: rule__PeriodicActivity__Group__6__Impl : ( 'from' ) ;
    public final void rule__PeriodicActivity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:633:1: ( ( 'from' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:634:1: ( 'from' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:634:1: ( 'from' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:635:1: 'from'
            {
             before(grammarAccess.getPeriodicActivityAccess().getFromKeyword_6()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PeriodicActivity__Group__6__Impl1278); 
             after(grammarAccess.getPeriodicActivityAccess().getFromKeyword_6()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:648:1: rule__PeriodicActivity__Group__7 : rule__PeriodicActivity__Group__7__Impl rule__PeriodicActivity__Group__8 ;
    public final void rule__PeriodicActivity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:652:1: ( rule__PeriodicActivity__Group__7__Impl rule__PeriodicActivity__Group__8 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:653:2: rule__PeriodicActivity__Group__7__Impl rule__PeriodicActivity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__7__Impl_in_rule__PeriodicActivity__Group__71309);
            rule__PeriodicActivity__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__8_in_rule__PeriodicActivity__Group__71312);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:660:1: rule__PeriodicActivity__Group__7__Impl : ( ( rule__PeriodicActivity__StartAssignment_7 ) ) ;
    public final void rule__PeriodicActivity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:664:1: ( ( ( rule__PeriodicActivity__StartAssignment_7 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:665:1: ( ( rule__PeriodicActivity__StartAssignment_7 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:665:1: ( ( rule__PeriodicActivity__StartAssignment_7 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:666:1: ( rule__PeriodicActivity__StartAssignment_7 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getStartAssignment_7()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:667:1: ( rule__PeriodicActivity__StartAssignment_7 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:667:2: rule__PeriodicActivity__StartAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__StartAssignment_7_in_rule__PeriodicActivity__Group__7__Impl1339);
            rule__PeriodicActivity__StartAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getStartAssignment_7()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:677:1: rule__PeriodicActivity__Group__8 : rule__PeriodicActivity__Group__8__Impl rule__PeriodicActivity__Group__9 ;
    public final void rule__PeriodicActivity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:681:1: ( rule__PeriodicActivity__Group__8__Impl rule__PeriodicActivity__Group__9 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:682:2: rule__PeriodicActivity__Group__8__Impl rule__PeriodicActivity__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__8__Impl_in_rule__PeriodicActivity__Group__81369);
            rule__PeriodicActivity__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__9_in_rule__PeriodicActivity__Group__81372);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:689:1: rule__PeriodicActivity__Group__8__Impl : ( 'to' ) ;
    public final void rule__PeriodicActivity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:693:1: ( ( 'to' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:694:1: ( 'to' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:694:1: ( 'to' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:695:1: 'to'
            {
             before(grammarAccess.getPeriodicActivityAccess().getToKeyword_8()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__PeriodicActivity__Group__8__Impl1400); 
             after(grammarAccess.getPeriodicActivityAccess().getToKeyword_8()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:708:1: rule__PeriodicActivity__Group__9 : rule__PeriodicActivity__Group__9__Impl rule__PeriodicActivity__Group__10 ;
    public final void rule__PeriodicActivity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:712:1: ( rule__PeriodicActivity__Group__9__Impl rule__PeriodicActivity__Group__10 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:713:2: rule__PeriodicActivity__Group__9__Impl rule__PeriodicActivity__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__9__Impl_in_rule__PeriodicActivity__Group__91431);
            rule__PeriodicActivity__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__10_in_rule__PeriodicActivity__Group__91434);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:720:1: rule__PeriodicActivity__Group__9__Impl : ( 'end' ) ;
    public final void rule__PeriodicActivity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:724:1: ( ( 'end' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:725:1: ( 'end' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:725:1: ( 'end' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:726:1: 'end'
            {
             before(grammarAccess.getPeriodicActivityAccess().getEndKeyword_9()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__PeriodicActivity__Group__9__Impl1462); 
             after(grammarAccess.getPeriodicActivityAccess().getEndKeyword_9()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:739:1: rule__PeriodicActivity__Group__10 : rule__PeriodicActivity__Group__10__Impl rule__PeriodicActivity__Group__11 ;
    public final void rule__PeriodicActivity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:743:1: ( rule__PeriodicActivity__Group__10__Impl rule__PeriodicActivity__Group__11 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:744:2: rule__PeriodicActivity__Group__10__Impl rule__PeriodicActivity__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__10__Impl_in_rule__PeriodicActivity__Group__101493);
            rule__PeriodicActivity__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__11_in_rule__PeriodicActivity__Group__101496);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:751:1: rule__PeriodicActivity__Group__10__Impl : ( ( rule__PeriodicActivity__EndAssignment_10 ) ) ;
    public final void rule__PeriodicActivity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:755:1: ( ( ( rule__PeriodicActivity__EndAssignment_10 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:756:1: ( ( rule__PeriodicActivity__EndAssignment_10 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:756:1: ( ( rule__PeriodicActivity__EndAssignment_10 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:757:1: ( rule__PeriodicActivity__EndAssignment_10 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getEndAssignment_10()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:758:1: ( rule__PeriodicActivity__EndAssignment_10 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:758:2: rule__PeriodicActivity__EndAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__EndAssignment_10_in_rule__PeriodicActivity__Group__10__Impl1523);
            rule__PeriodicActivity__EndAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getEndAssignment_10()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:768:1: rule__PeriodicActivity__Group__11 : rule__PeriodicActivity__Group__11__Impl rule__PeriodicActivity__Group__12 ;
    public final void rule__PeriodicActivity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:772:1: ( rule__PeriodicActivity__Group__11__Impl rule__PeriodicActivity__Group__12 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:773:2: rule__PeriodicActivity__Group__11__Impl rule__PeriodicActivity__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__11__Impl_in_rule__PeriodicActivity__Group__111553);
            rule__PeriodicActivity__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__12_in_rule__PeriodicActivity__Group__111556);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:780:1: rule__PeriodicActivity__Group__11__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:784:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:785:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:785:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:786:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__PeriodicActivity__Group__11__Impl1584); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:799:1: rule__PeriodicActivity__Group__12 : rule__PeriodicActivity__Group__12__Impl rule__PeriodicActivity__Group__13 ;
    public final void rule__PeriodicActivity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:803:1: ( rule__PeriodicActivity__Group__12__Impl rule__PeriodicActivity__Group__13 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:804:2: rule__PeriodicActivity__Group__12__Impl rule__PeriodicActivity__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__12__Impl_in_rule__PeriodicActivity__Group__121615);
            rule__PeriodicActivity__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__13_in_rule__PeriodicActivity__Group__121618);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:811:1: rule__PeriodicActivity__Group__12__Impl : ( ( rule__PeriodicActivity__Group_12__0 )? ) ;
    public final void rule__PeriodicActivity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:815:1: ( ( ( rule__PeriodicActivity__Group_12__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:816:1: ( ( rule__PeriodicActivity__Group_12__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:816:1: ( ( rule__PeriodicActivity__Group_12__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:817:1: ( rule__PeriodicActivity__Group_12__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_12()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:818:1: ( rule__PeriodicActivity__Group_12__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:818:2: rule__PeriodicActivity__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__0_in_rule__PeriodicActivity__Group__12__Impl1645);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:828:1: rule__PeriodicActivity__Group__13 : rule__PeriodicActivity__Group__13__Impl rule__PeriodicActivity__Group__14 ;
    public final void rule__PeriodicActivity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:832:1: ( rule__PeriodicActivity__Group__13__Impl rule__PeriodicActivity__Group__14 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:833:2: rule__PeriodicActivity__Group__13__Impl rule__PeriodicActivity__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__13__Impl_in_rule__PeriodicActivity__Group__131676);
            rule__PeriodicActivity__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__14_in_rule__PeriodicActivity__Group__131679);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:840:1: rule__PeriodicActivity__Group__13__Impl : ( ( rule__PeriodicActivity__Group_13__0 )? ) ;
    public final void rule__PeriodicActivity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:844:1: ( ( ( rule__PeriodicActivity__Group_13__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:845:1: ( ( rule__PeriodicActivity__Group_13__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:845:1: ( ( rule__PeriodicActivity__Group_13__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:846:1: ( rule__PeriodicActivity__Group_13__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_13()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:847:1: ( rule__PeriodicActivity__Group_13__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:847:2: rule__PeriodicActivity__Group_13__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__0_in_rule__PeriodicActivity__Group__13__Impl1706);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:857:1: rule__PeriodicActivity__Group__14 : rule__PeriodicActivity__Group__14__Impl rule__PeriodicActivity__Group__15 ;
    public final void rule__PeriodicActivity__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:861:1: ( rule__PeriodicActivity__Group__14__Impl rule__PeriodicActivity__Group__15 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:862:2: rule__PeriodicActivity__Group__14__Impl rule__PeriodicActivity__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__14__Impl_in_rule__PeriodicActivity__Group__141737);
            rule__PeriodicActivity__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__15_in_rule__PeriodicActivity__Group__141740);
            rule__PeriodicActivity__Group__15();

            state._fsp--;


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:869:1: rule__PeriodicActivity__Group__14__Impl : ( ( rule__PeriodicActivity__Group_14__0 )? ) ;
    public final void rule__PeriodicActivity__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:873:1: ( ( ( rule__PeriodicActivity__Group_14__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:874:1: ( ( rule__PeriodicActivity__Group_14__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:874:1: ( ( rule__PeriodicActivity__Group_14__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:875:1: ( rule__PeriodicActivity__Group_14__0 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_14()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:876:1: ( rule__PeriodicActivity__Group_14__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:876:2: rule__PeriodicActivity__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_14__0_in_rule__PeriodicActivity__Group__14__Impl1767);
                    rule__PeriodicActivity__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPeriodicActivityAccess().getGroup_14()); 

            }


            }

        }
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


    // $ANTLR start "rule__PeriodicActivity__Group__15"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:886:1: rule__PeriodicActivity__Group__15 : rule__PeriodicActivity__Group__15__Impl ;
    public final void rule__PeriodicActivity__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:890:1: ( rule__PeriodicActivity__Group__15__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:891:2: rule__PeriodicActivity__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group__15__Impl_in_rule__PeriodicActivity__Group__151798);
            rule__PeriodicActivity__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group__15"


    // $ANTLR start "rule__PeriodicActivity__Group__15__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:897:1: rule__PeriodicActivity__Group__15__Impl : ( '}' ) ;
    public final void rule__PeriodicActivity__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:901:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:902:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:902:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:903:1: '}'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_15()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__PeriodicActivity__Group__15__Impl1826); 
             after(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group__15__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_4__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:948:1: rule__PeriodicActivity__Group_4__0 : rule__PeriodicActivity__Group_4__0__Impl rule__PeriodicActivity__Group_4__1 ;
    public final void rule__PeriodicActivity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:952:1: ( rule__PeriodicActivity__Group_4__0__Impl rule__PeriodicActivity__Group_4__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:953:2: rule__PeriodicActivity__Group_4__0__Impl rule__PeriodicActivity__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__0__Impl_in_rule__PeriodicActivity__Group_4__01889);
            rule__PeriodicActivity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__1_in_rule__PeriodicActivity__Group_4__01892);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:960:1: rule__PeriodicActivity__Group_4__0__Impl : ( 'atelier' ) ;
    public final void rule__PeriodicActivity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:964:1: ( ( 'atelier' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:965:1: ( 'atelier' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:965:1: ( 'atelier' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:966:1: 'atelier'
            {
             before(grammarAccess.getPeriodicActivityAccess().getAtelierKeyword_4_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__PeriodicActivity__Group_4__0__Impl1920); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:979:1: rule__PeriodicActivity__Group_4__1 : rule__PeriodicActivity__Group_4__1__Impl rule__PeriodicActivity__Group_4__2 ;
    public final void rule__PeriodicActivity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:983:1: ( rule__PeriodicActivity__Group_4__1__Impl rule__PeriodicActivity__Group_4__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:984:2: rule__PeriodicActivity__Group_4__1__Impl rule__PeriodicActivity__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__1__Impl_in_rule__PeriodicActivity__Group_4__11951);
            rule__PeriodicActivity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__2_in_rule__PeriodicActivity__Group_4__11954);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:991:1: rule__PeriodicActivity__Group_4__1__Impl : ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) ) ;
    public final void rule__PeriodicActivity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:995:1: ( ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:996:1: ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:996:1: ( ( rule__PeriodicActivity__AtelierAssignment_4_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:997:1: ( rule__PeriodicActivity__AtelierAssignment_4_1 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getAtelierAssignment_4_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:998:1: ( rule__PeriodicActivity__AtelierAssignment_4_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:998:2: rule__PeriodicActivity__AtelierAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__AtelierAssignment_4_1_in_rule__PeriodicActivity__Group_4__1__Impl1981);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1008:1: rule__PeriodicActivity__Group_4__2 : rule__PeriodicActivity__Group_4__2__Impl ;
    public final void rule__PeriodicActivity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1012:1: ( rule__PeriodicActivity__Group_4__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1013:2: rule__PeriodicActivity__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_4__2__Impl_in_rule__PeriodicActivity__Group_4__22011);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1019:1: rule__PeriodicActivity__Group_4__2__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1023:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1024:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1024:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1025:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_4_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__PeriodicActivity__Group_4__2__Impl2039); 
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


    // $ANTLR start "rule__PeriodicActivity__Group_12__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1044:1: rule__PeriodicActivity__Group_12__0 : rule__PeriodicActivity__Group_12__0__Impl rule__PeriodicActivity__Group_12__1 ;
    public final void rule__PeriodicActivity__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1048:1: ( rule__PeriodicActivity__Group_12__0__Impl rule__PeriodicActivity__Group_12__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1049:2: rule__PeriodicActivity__Group_12__0__Impl rule__PeriodicActivity__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__0__Impl_in_rule__PeriodicActivity__Group_12__02076);
            rule__PeriodicActivity__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__1_in_rule__PeriodicActivity__Group_12__02079);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1056:1: rule__PeriodicActivity__Group_12__0__Impl : ( 'every' ) ;
    public final void rule__PeriodicActivity__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1060:1: ( ( 'every' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1061:1: ( 'every' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1061:1: ( 'every' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1062:1: 'every'
            {
             before(grammarAccess.getPeriodicActivityAccess().getEveryKeyword_12_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__PeriodicActivity__Group_12__0__Impl2107); 
             after(grammarAccess.getPeriodicActivityAccess().getEveryKeyword_12_0()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1075:1: rule__PeriodicActivity__Group_12__1 : rule__PeriodicActivity__Group_12__1__Impl rule__PeriodicActivity__Group_12__2 ;
    public final void rule__PeriodicActivity__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1079:1: ( rule__PeriodicActivity__Group_12__1__Impl rule__PeriodicActivity__Group_12__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1080:2: rule__PeriodicActivity__Group_12__1__Impl rule__PeriodicActivity__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__1__Impl_in_rule__PeriodicActivity__Group_12__12138);
            rule__PeriodicActivity__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__2_in_rule__PeriodicActivity__Group_12__12141);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1087:1: rule__PeriodicActivity__Group_12__1__Impl : ( ( rule__PeriodicActivity__PeriodicityNumberAssignment_12_1 )? ) ;
    public final void rule__PeriodicActivity__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1091:1: ( ( ( rule__PeriodicActivity__PeriodicityNumberAssignment_12_1 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1092:1: ( ( rule__PeriodicActivity__PeriodicityNumberAssignment_12_1 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1092:1: ( ( rule__PeriodicActivity__PeriodicityNumberAssignment_12_1 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1093:1: ( rule__PeriodicActivity__PeriodicityNumberAssignment_12_1 )?
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicityNumberAssignment_12_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1094:1: ( rule__PeriodicActivity__PeriodicityNumberAssignment_12_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||LA7_0==34) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1094:2: rule__PeriodicActivity__PeriodicityNumberAssignment_12_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__PeriodicityNumberAssignment_12_1_in_rule__PeriodicActivity__Group_12__1__Impl2168);
                    rule__PeriodicActivity__PeriodicityNumberAssignment_12_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPeriodicActivityAccess().getPeriodicityNumberAssignment_12_1()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1104:1: rule__PeriodicActivity__Group_12__2 : rule__PeriodicActivity__Group_12__2__Impl ;
    public final void rule__PeriodicActivity__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1108:1: ( rule__PeriodicActivity__Group_12__2__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1109:2: rule__PeriodicActivity__Group_12__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_12__2__Impl_in_rule__PeriodicActivity__Group_12__22199);
            rule__PeriodicActivity__Group_12__2__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1115:1: rule__PeriodicActivity__Group_12__2__Impl : ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_12_2 ) ) ;
    public final void rule__PeriodicActivity__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1119:1: ( ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_12_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1120:1: ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_12_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1120:1: ( ( rule__PeriodicActivity__PeriodicityTypeAssignment_12_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1121:1: ( rule__PeriodicActivity__PeriodicityTypeAssignment_12_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypeAssignment_12_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1122:1: ( rule__PeriodicActivity__PeriodicityTypeAssignment_12_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1122:2: rule__PeriodicActivity__PeriodicityTypeAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__PeriodicityTypeAssignment_12_2_in_rule__PeriodicActivity__Group_12__2__Impl2226);
            rule__PeriodicActivity__PeriodicityTypeAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypeAssignment_12_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__PeriodicActivity__Group_13__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1138:1: rule__PeriodicActivity__Group_13__0 : rule__PeriodicActivity__Group_13__0__Impl rule__PeriodicActivity__Group_13__1 ;
    public final void rule__PeriodicActivity__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1142:1: ( rule__PeriodicActivity__Group_13__0__Impl rule__PeriodicActivity__Group_13__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1143:2: rule__PeriodicActivity__Group_13__0__Impl rule__PeriodicActivity__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__0__Impl_in_rule__PeriodicActivity__Group_13__02262);
            rule__PeriodicActivity__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__1_in_rule__PeriodicActivity__Group_13__02265);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1150:1: rule__PeriodicActivity__Group_13__0__Impl : ( 'allocate' ) ;
    public final void rule__PeriodicActivity__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1154:1: ( ( 'allocate' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1155:1: ( 'allocate' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1155:1: ( 'allocate' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1156:1: 'allocate'
            {
             before(grammarAccess.getPeriodicActivityAccess().getAllocateKeyword_13_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__PeriodicActivity__Group_13__0__Impl2293); 
             after(grammarAccess.getPeriodicActivityAccess().getAllocateKeyword_13_0()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1169:1: rule__PeriodicActivity__Group_13__1 : rule__PeriodicActivity__Group_13__1__Impl rule__PeriodicActivity__Group_13__2 ;
    public final void rule__PeriodicActivity__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1173:1: ( rule__PeriodicActivity__Group_13__1__Impl rule__PeriodicActivity__Group_13__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1174:2: rule__PeriodicActivity__Group_13__1__Impl rule__PeriodicActivity__Group_13__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__1__Impl_in_rule__PeriodicActivity__Group_13__12324);
            rule__PeriodicActivity__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__2_in_rule__PeriodicActivity__Group_13__12327);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1181:1: rule__PeriodicActivity__Group_13__1__Impl : ( '{' ) ;
    public final void rule__PeriodicActivity__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1185:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1186:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1186:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1187:1: '{'
            {
             before(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PeriodicActivity__Group_13__1__Impl2355); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1200:1: rule__PeriodicActivity__Group_13__2 : rule__PeriodicActivity__Group_13__2__Impl rule__PeriodicActivity__Group_13__3 ;
    public final void rule__PeriodicActivity__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1204:1: ( rule__PeriodicActivity__Group_13__2__Impl rule__PeriodicActivity__Group_13__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1205:2: rule__PeriodicActivity__Group_13__2__Impl rule__PeriodicActivity__Group_13__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__2__Impl_in_rule__PeriodicActivity__Group_13__22386);
            rule__PeriodicActivity__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__3_in_rule__PeriodicActivity__Group_13__22389);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1212:1: rule__PeriodicActivity__Group_13__2__Impl : ( ( rule__PeriodicActivity__ResAllocationAssignment_13_2 ) ) ;
    public final void rule__PeriodicActivity__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1216:1: ( ( ( rule__PeriodicActivity__ResAllocationAssignment_13_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1217:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_13_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1217:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_13_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1218:1: ( rule__PeriodicActivity__ResAllocationAssignment_13_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_13_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1219:1: ( rule__PeriodicActivity__ResAllocationAssignment_13_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1219:2: rule__PeriodicActivity__ResAllocationAssignment_13_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_13_2_in_rule__PeriodicActivity__Group_13__2__Impl2416);
            rule__PeriodicActivity__ResAllocationAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_13_2()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1229:1: rule__PeriodicActivity__Group_13__3 : rule__PeriodicActivity__Group_13__3__Impl rule__PeriodicActivity__Group_13__4 ;
    public final void rule__PeriodicActivity__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1233:1: ( rule__PeriodicActivity__Group_13__3__Impl rule__PeriodicActivity__Group_13__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1234:2: rule__PeriodicActivity__Group_13__3__Impl rule__PeriodicActivity__Group_13__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__3__Impl_in_rule__PeriodicActivity__Group_13__32446);
            rule__PeriodicActivity__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__4_in_rule__PeriodicActivity__Group_13__32449);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1241:1: rule__PeriodicActivity__Group_13__3__Impl : ( ( rule__PeriodicActivity__Group_13_3__0 )* ) ;
    public final void rule__PeriodicActivity__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1245:1: ( ( ( rule__PeriodicActivity__Group_13_3__0 )* ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1246:1: ( ( rule__PeriodicActivity__Group_13_3__0 )* )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1246:1: ( ( rule__PeriodicActivity__Group_13_3__0 )* )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1247:1: ( rule__PeriodicActivity__Group_13_3__0 )*
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_13_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1248:1: ( rule__PeriodicActivity__Group_13_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1248:2: rule__PeriodicActivity__Group_13_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13_3__0_in_rule__PeriodicActivity__Group_13__3__Impl2476);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1258:1: rule__PeriodicActivity__Group_13__4 : rule__PeriodicActivity__Group_13__4__Impl ;
    public final void rule__PeriodicActivity__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1262:1: ( rule__PeriodicActivity__Group_13__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1263:2: rule__PeriodicActivity__Group_13__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13__4__Impl_in_rule__PeriodicActivity__Group_13__42507);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1269:1: rule__PeriodicActivity__Group_13__4__Impl : ( '} ,' ) ;
    public final void rule__PeriodicActivity__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1273:1: ( ( '} ,' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1274:1: ( '} ,' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1274:1: ( '} ,' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1275:1: '} ,'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketSpaceCommaKeyword_13_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__PeriodicActivity__Group_13__4__Impl2535); 
             after(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketSpaceCommaKeyword_13_4()); 

            }


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1298:1: rule__PeriodicActivity__Group_13_3__0 : rule__PeriodicActivity__Group_13_3__0__Impl rule__PeriodicActivity__Group_13_3__1 ;
    public final void rule__PeriodicActivity__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1302:1: ( rule__PeriodicActivity__Group_13_3__0__Impl rule__PeriodicActivity__Group_13_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1303:2: rule__PeriodicActivity__Group_13_3__0__Impl rule__PeriodicActivity__Group_13_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13_3__0__Impl_in_rule__PeriodicActivity__Group_13_3__02576);
            rule__PeriodicActivity__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13_3__1_in_rule__PeriodicActivity__Group_13_3__02579);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1310:1: rule__PeriodicActivity__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1314:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1315:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1315:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1316:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_13_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__PeriodicActivity__Group_13_3__0__Impl2607); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1329:1: rule__PeriodicActivity__Group_13_3__1 : rule__PeriodicActivity__Group_13_3__1__Impl ;
    public final void rule__PeriodicActivity__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1333:1: ( rule__PeriodicActivity__Group_13_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1334:2: rule__PeriodicActivity__Group_13_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_13_3__1__Impl_in_rule__PeriodicActivity__Group_13_3__12638);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1340:1: rule__PeriodicActivity__Group_13_3__1__Impl : ( ( rule__PeriodicActivity__ResAllocationAssignment_13_3_1 ) ) ;
    public final void rule__PeriodicActivity__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1344:1: ( ( ( rule__PeriodicActivity__ResAllocationAssignment_13_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1345:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_13_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1345:1: ( ( rule__PeriodicActivity__ResAllocationAssignment_13_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1346:1: ( rule__PeriodicActivity__ResAllocationAssignment_13_3_1 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_13_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1347:1: ( rule__PeriodicActivity__ResAllocationAssignment_13_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1347:2: rule__PeriodicActivity__ResAllocationAssignment_13_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_13_3_1_in_rule__PeriodicActivity__Group_13_3__1__Impl2665);
            rule__PeriodicActivity__ResAllocationAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationAssignment_13_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PeriodicActivity__Group_14__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1361:1: rule__PeriodicActivity__Group_14__0 : rule__PeriodicActivity__Group_14__0__Impl rule__PeriodicActivity__Group_14__1 ;
    public final void rule__PeriodicActivity__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1365:1: ( rule__PeriodicActivity__Group_14__0__Impl rule__PeriodicActivity__Group_14__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1366:2: rule__PeriodicActivity__Group_14__0__Impl rule__PeriodicActivity__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_14__0__Impl_in_rule__PeriodicActivity__Group_14__02699);
            rule__PeriodicActivity__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_14__1_in_rule__PeriodicActivity__Group_14__02702);
            rule__PeriodicActivity__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_14__0"


    // $ANTLR start "rule__PeriodicActivity__Group_14__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1373:1: rule__PeriodicActivity__Group_14__0__Impl : ( 'rules' ) ;
    public final void rule__PeriodicActivity__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1377:1: ( ( 'rules' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1378:1: ( 'rules' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1378:1: ( 'rules' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1379:1: 'rules'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRulesKeyword_14_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__PeriodicActivity__Group_14__0__Impl2730); 
             after(grammarAccess.getPeriodicActivityAccess().getRulesKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_14__0__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_14__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1392:1: rule__PeriodicActivity__Group_14__1 : rule__PeriodicActivity__Group_14__1__Impl rule__PeriodicActivity__Group_14__2 ;
    public final void rule__PeriodicActivity__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1396:1: ( rule__PeriodicActivity__Group_14__1__Impl rule__PeriodicActivity__Group_14__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1397:2: rule__PeriodicActivity__Group_14__1__Impl rule__PeriodicActivity__Group_14__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_14__1__Impl_in_rule__PeriodicActivity__Group_14__12761);
            rule__PeriodicActivity__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_14__2_in_rule__PeriodicActivity__Group_14__12764);
            rule__PeriodicActivity__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_14__1"


    // $ANTLR start "rule__PeriodicActivity__Group_14__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1404:1: rule__PeriodicActivity__Group_14__1__Impl : ( '{' ) ;
    public final void rule__PeriodicActivity__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1408:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1409:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1409:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1410:1: '{'
            {
             before(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_14_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PeriodicActivity__Group_14__1__Impl2792); 
             after(grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_14__1__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_14__2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1423:1: rule__PeriodicActivity__Group_14__2 : rule__PeriodicActivity__Group_14__2__Impl rule__PeriodicActivity__Group_14__3 ;
    public final void rule__PeriodicActivity__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1427:1: ( rule__PeriodicActivity__Group_14__2__Impl rule__PeriodicActivity__Group_14__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1428:2: rule__PeriodicActivity__Group_14__2__Impl rule__PeriodicActivity__Group_14__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_14__2__Impl_in_rule__PeriodicActivity__Group_14__22823);
            rule__PeriodicActivity__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_14__3_in_rule__PeriodicActivity__Group_14__22826);
            rule__PeriodicActivity__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_14__2"


    // $ANTLR start "rule__PeriodicActivity__Group_14__2__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1435:1: rule__PeriodicActivity__Group_14__2__Impl : ( ( rule__PeriodicActivity__RuleAssignment_14_2 ) ) ;
    public final void rule__PeriodicActivity__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1439:1: ( ( ( rule__PeriodicActivity__RuleAssignment_14_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1440:1: ( ( rule__PeriodicActivity__RuleAssignment_14_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1440:1: ( ( rule__PeriodicActivity__RuleAssignment_14_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1441:1: ( rule__PeriodicActivity__RuleAssignment_14_2 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleAssignment_14_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1442:1: ( rule__PeriodicActivity__RuleAssignment_14_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1442:2: rule__PeriodicActivity__RuleAssignment_14_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__RuleAssignment_14_2_in_rule__PeriodicActivity__Group_14__2__Impl2853);
            rule__PeriodicActivity__RuleAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getRuleAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_14__2__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_14__3"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1452:1: rule__PeriodicActivity__Group_14__3 : rule__PeriodicActivity__Group_14__3__Impl rule__PeriodicActivity__Group_14__4 ;
    public final void rule__PeriodicActivity__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1456:1: ( rule__PeriodicActivity__Group_14__3__Impl rule__PeriodicActivity__Group_14__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1457:2: rule__PeriodicActivity__Group_14__3__Impl rule__PeriodicActivity__Group_14__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_14__3__Impl_in_rule__PeriodicActivity__Group_14__32883);
            rule__PeriodicActivity__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_14__4_in_rule__PeriodicActivity__Group_14__32886);
            rule__PeriodicActivity__Group_14__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_14__3"


    // $ANTLR start "rule__PeriodicActivity__Group_14__3__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1464:1: rule__PeriodicActivity__Group_14__3__Impl : ( ( rule__PeriodicActivity__Group_14_3__0 )* ) ;
    public final void rule__PeriodicActivity__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1468:1: ( ( ( rule__PeriodicActivity__Group_14_3__0 )* ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1469:1: ( ( rule__PeriodicActivity__Group_14_3__0 )* )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1469:1: ( ( rule__PeriodicActivity__Group_14_3__0 )* )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1470:1: ( rule__PeriodicActivity__Group_14_3__0 )*
            {
             before(grammarAccess.getPeriodicActivityAccess().getGroup_14_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1471:1: ( rule__PeriodicActivity__Group_14_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1471:2: rule__PeriodicActivity__Group_14_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_14_3__0_in_rule__PeriodicActivity__Group_14__3__Impl2913);
            	    rule__PeriodicActivity__Group_14_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPeriodicActivityAccess().getGroup_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_14__3__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_14__4"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1481:1: rule__PeriodicActivity__Group_14__4 : rule__PeriodicActivity__Group_14__4__Impl ;
    public final void rule__PeriodicActivity__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1485:1: ( rule__PeriodicActivity__Group_14__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1486:2: rule__PeriodicActivity__Group_14__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_14__4__Impl_in_rule__PeriodicActivity__Group_14__42944);
            rule__PeriodicActivity__Group_14__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_14__4"


    // $ANTLR start "rule__PeriodicActivity__Group_14__4__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1492:1: rule__PeriodicActivity__Group_14__4__Impl : ( '}' ) ;
    public final void rule__PeriodicActivity__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1496:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1497:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1497:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1498:1: '}'
            {
             before(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_14_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__PeriodicActivity__Group_14__4__Impl2972); 
             after(grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_14_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_14__4__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_14_3__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1521:1: rule__PeriodicActivity__Group_14_3__0 : rule__PeriodicActivity__Group_14_3__0__Impl rule__PeriodicActivity__Group_14_3__1 ;
    public final void rule__PeriodicActivity__Group_14_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1525:1: ( rule__PeriodicActivity__Group_14_3__0__Impl rule__PeriodicActivity__Group_14_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1526:2: rule__PeriodicActivity__Group_14_3__0__Impl rule__PeriodicActivity__Group_14_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_14_3__0__Impl_in_rule__PeriodicActivity__Group_14_3__03013);
            rule__PeriodicActivity__Group_14_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_14_3__1_in_rule__PeriodicActivity__Group_14_3__03016);
            rule__PeriodicActivity__Group_14_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_14_3__0"


    // $ANTLR start "rule__PeriodicActivity__Group_14_3__0__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1533:1: rule__PeriodicActivity__Group_14_3__0__Impl : ( ',' ) ;
    public final void rule__PeriodicActivity__Group_14_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1537:1: ( ( ',' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1538:1: ( ',' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1538:1: ( ',' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1539:1: ','
            {
             before(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_14_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__PeriodicActivity__Group_14_3__0__Impl3044); 
             after(grammarAccess.getPeriodicActivityAccess().getCommaKeyword_14_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_14_3__0__Impl"


    // $ANTLR start "rule__PeriodicActivity__Group_14_3__1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1552:1: rule__PeriodicActivity__Group_14_3__1 : rule__PeriodicActivity__Group_14_3__1__Impl ;
    public final void rule__PeriodicActivity__Group_14_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1556:1: ( rule__PeriodicActivity__Group_14_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1557:2: rule__PeriodicActivity__Group_14_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__Group_14_3__1__Impl_in_rule__PeriodicActivity__Group_14_3__13075);
            rule__PeriodicActivity__Group_14_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_14_3__1"


    // $ANTLR start "rule__PeriodicActivity__Group_14_3__1__Impl"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1563:1: rule__PeriodicActivity__Group_14_3__1__Impl : ( ( rule__PeriodicActivity__RuleAssignment_14_3_1 ) ) ;
    public final void rule__PeriodicActivity__Group_14_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1567:1: ( ( ( rule__PeriodicActivity__RuleAssignment_14_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1568:1: ( ( rule__PeriodicActivity__RuleAssignment_14_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1568:1: ( ( rule__PeriodicActivity__RuleAssignment_14_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1569:1: ( rule__PeriodicActivity__RuleAssignment_14_3_1 )
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleAssignment_14_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1570:1: ( rule__PeriodicActivity__RuleAssignment_14_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1570:2: rule__PeriodicActivity__RuleAssignment_14_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeriodicActivity__RuleAssignment_14_3_1_in_rule__PeriodicActivity__Group_14_3__1__Impl3102);
            rule__PeriodicActivity__RuleAssignment_14_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicActivityAccess().getRuleAssignment_14_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__Group_14_3__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1584:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1588:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1589:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__03136);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1_in_rule__Date__Group__03139);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1596:1: rule__Date__Group__0__Impl : ( () ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1600:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1601:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1601:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1602:1: ()
            {
             before(grammarAccess.getDateAccess().getDateAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1603:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1605:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1615:1: rule__Date__Group__1 : rule__Date__Group__1__Impl ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1619:1: ( rule__Date__Group__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1620:2: rule__Date__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__13197);
            rule__Date__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1626:1: rule__Date__Group__1__Impl : ( ( rule__Date__DayAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1630:1: ( ( ( rule__Date__DayAssignment_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1631:1: ( ( rule__Date__DayAssignment_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1631:1: ( ( rule__Date__DayAssignment_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1632:1: ( rule__Date__DayAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1633:1: ( rule__Date__DayAssignment_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1633:2: rule__Date__DayAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl3224);
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


    // $ANTLR start "rule__ResAllocation__Group__0"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1647:1: rule__ResAllocation__Group__0 : rule__ResAllocation__Group__0__Impl rule__ResAllocation__Group__1 ;
    public final void rule__ResAllocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1651:1: ( rule__ResAllocation__Group__0__Impl rule__ResAllocation__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1652:2: rule__ResAllocation__Group__0__Impl rule__ResAllocation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__0__Impl_in_rule__ResAllocation__Group__03258);
            rule__ResAllocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__1_in_rule__ResAllocation__Group__03261);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1659:1: rule__ResAllocation__Group__0__Impl : ( () ) ;
    public final void rule__ResAllocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1663:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1664:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1664:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1665:1: ()
            {
             before(grammarAccess.getResAllocationAccess().getRessourceAllocationAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1666:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1668:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1678:1: rule__ResAllocation__Group__1 : rule__ResAllocation__Group__1__Impl rule__ResAllocation__Group__2 ;
    public final void rule__ResAllocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1682:1: ( rule__ResAllocation__Group__1__Impl rule__ResAllocation__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1683:2: rule__ResAllocation__Group__1__Impl rule__ResAllocation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__1__Impl_in_rule__ResAllocation__Group__13319);
            rule__ResAllocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__2_in_rule__ResAllocation__Group__13322);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1690:1: rule__ResAllocation__Group__1__Impl : ( 'reserve' ) ;
    public final void rule__ResAllocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1694:1: ( ( 'reserve' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1695:1: ( 'reserve' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1695:1: ( 'reserve' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1696:1: 'reserve'
            {
             before(grammarAccess.getResAllocationAccess().getReserveKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ResAllocation__Group__1__Impl3350); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1709:1: rule__ResAllocation__Group__2 : rule__ResAllocation__Group__2__Impl rule__ResAllocation__Group__3 ;
    public final void rule__ResAllocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1713:1: ( rule__ResAllocation__Group__2__Impl rule__ResAllocation__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1714:2: rule__ResAllocation__Group__2__Impl rule__ResAllocation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__2__Impl_in_rule__ResAllocation__Group__23381);
            rule__ResAllocation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__3_in_rule__ResAllocation__Group__23384);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1721:1: rule__ResAllocation__Group__2__Impl : ( ( rule__ResAllocation__RessourceAssignment_2 ) ) ;
    public final void rule__ResAllocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1725:1: ( ( ( rule__ResAllocation__RessourceAssignment_2 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1726:1: ( ( rule__ResAllocation__RessourceAssignment_2 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1726:1: ( ( rule__ResAllocation__RessourceAssignment_2 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1727:1: ( rule__ResAllocation__RessourceAssignment_2 )
            {
             before(grammarAccess.getResAllocationAccess().getRessourceAssignment_2()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1728:1: ( rule__ResAllocation__RessourceAssignment_2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1728:2: rule__ResAllocation__RessourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__RessourceAssignment_2_in_rule__ResAllocation__Group__2__Impl3411);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1738:1: rule__ResAllocation__Group__3 : rule__ResAllocation__Group__3__Impl rule__ResAllocation__Group__4 ;
    public final void rule__ResAllocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1742:1: ( rule__ResAllocation__Group__3__Impl rule__ResAllocation__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1743:2: rule__ResAllocation__Group__3__Impl rule__ResAllocation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__3__Impl_in_rule__ResAllocation__Group__33441);
            rule__ResAllocation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__4_in_rule__ResAllocation__Group__33444);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1750:1: rule__ResAllocation__Group__3__Impl : ( 'for' ) ;
    public final void rule__ResAllocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1754:1: ( ( 'for' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1755:1: ( 'for' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1755:1: ( 'for' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1756:1: 'for'
            {
             before(grammarAccess.getResAllocationAccess().getForKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ResAllocation__Group__3__Impl3472); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1769:1: rule__ResAllocation__Group__4 : rule__ResAllocation__Group__4__Impl ;
    public final void rule__ResAllocation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1773:1: ( rule__ResAllocation__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1774:2: rule__ResAllocation__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__Group__4__Impl_in_rule__ResAllocation__Group__43503);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1780:1: rule__ResAllocation__Group__4__Impl : ( ( rule__ResAllocation__DureeAssignment_4 ) ) ;
    public final void rule__ResAllocation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1784:1: ( ( ( rule__ResAllocation__DureeAssignment_4 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1785:1: ( ( rule__ResAllocation__DureeAssignment_4 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1785:1: ( ( rule__ResAllocation__DureeAssignment_4 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1786:1: ( rule__ResAllocation__DureeAssignment_4 )
            {
             before(grammarAccess.getResAllocationAccess().getDureeAssignment_4()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1787:1: ( rule__ResAllocation__DureeAssignment_4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1787:2: rule__ResAllocation__DureeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResAllocation__DureeAssignment_4_in_rule__ResAllocation__Group__4__Impl3530);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1807:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1811:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1812:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03570);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03573);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1819:1: rule__Rule__Group__0__Impl : ( () ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1823:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1824:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1824:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1825:1: ()
            {
             before(grammarAccess.getRuleAccess().getRuleAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1826:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1828:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1838:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1842:1: ( rule__Rule__Group__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1843:2: rule__Rule__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13631);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1849:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__Group_1__0 )* ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1853:1: ( ( ( rule__Rule__Group_1__0 )* ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1854:1: ( ( rule__Rule__Group_1__0 )* )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1854:1: ( ( rule__Rule__Group_1__0 )* )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1855:1: ( rule__Rule__Group_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1856:1: ( rule__Rule__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1856:2: rule__Rule__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1__0_in_rule__Rule__Group__1__Impl3658);
            	    rule__Rule__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1870:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1874:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1875:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1__0__Impl_in_rule__Rule__Group_1__03693);
            rule__Rule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1__1_in_rule__Rule__Group_1__03696);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1882:1: rule__Rule__Group_1__0__Impl : ( 'pre' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1886:1: ( ( 'pre' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1887:1: ( 'pre' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1887:1: ( 'pre' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1888:1: 'pre'
            {
             before(grammarAccess.getRuleAccess().getPreKeyword_1_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Rule__Group_1__0__Impl3724); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1901:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1905:1: ( rule__Rule__Group_1__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1906:2: rule__Rule__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group_1__1__Impl_in_rule__Rule__Group_1__13755);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1912:1: rule__Rule__Group_1__1__Impl : ( ( rule__Rule__PreAssignment_1_1 ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1916:1: ( ( ( rule__Rule__PreAssignment_1_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1917:1: ( ( rule__Rule__PreAssignment_1_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1917:1: ( ( rule__Rule__PreAssignment_1_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1918:1: ( rule__Rule__PreAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getPreAssignment_1_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1919:1: ( rule__Rule__PreAssignment_1_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1919:2: rule__Rule__PreAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__PreAssignment_1_1_in_rule__Rule__Group_1__1__Impl3782);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1933:1: rule__Atelier_Impl__Group__0 : rule__Atelier_Impl__Group__0__Impl rule__Atelier_Impl__Group__1 ;
    public final void rule__Atelier_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1937:1: ( rule__Atelier_Impl__Group__0__Impl rule__Atelier_Impl__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1938:2: rule__Atelier_Impl__Group__0__Impl rule__Atelier_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__0__Impl_in_rule__Atelier_Impl__Group__03816);
            rule__Atelier_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__1_in_rule__Atelier_Impl__Group__03819);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1945:1: rule__Atelier_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Atelier_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1949:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1950:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1950:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1951:1: ()
            {
             before(grammarAccess.getAtelier_ImplAccess().getAtelierAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1952:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1954:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1964:1: rule__Atelier_Impl__Group__1 : rule__Atelier_Impl__Group__1__Impl rule__Atelier_Impl__Group__2 ;
    public final void rule__Atelier_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1968:1: ( rule__Atelier_Impl__Group__1__Impl rule__Atelier_Impl__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1969:2: rule__Atelier_Impl__Group__1__Impl rule__Atelier_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__1__Impl_in_rule__Atelier_Impl__Group__13877);
            rule__Atelier_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__2_in_rule__Atelier_Impl__Group__13880);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1976:1: rule__Atelier_Impl__Group__1__Impl : ( 'Atelier' ) ;
    public final void rule__Atelier_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1980:1: ( ( 'Atelier' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1981:1: ( 'Atelier' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1981:1: ( 'Atelier' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1982:1: 'Atelier'
            {
             before(grammarAccess.getAtelier_ImplAccess().getAtelierKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Atelier_Impl__Group__1__Impl3908); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1995:1: rule__Atelier_Impl__Group__2 : rule__Atelier_Impl__Group__2__Impl rule__Atelier_Impl__Group__3 ;
    public final void rule__Atelier_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:1999:1: ( rule__Atelier_Impl__Group__2__Impl rule__Atelier_Impl__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2000:2: rule__Atelier_Impl__Group__2__Impl rule__Atelier_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__2__Impl_in_rule__Atelier_Impl__Group__23939);
            rule__Atelier_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__3_in_rule__Atelier_Impl__Group__23942);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2007:1: rule__Atelier_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Atelier_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2011:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2012:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2012:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2013:1: '{'
            {
             before(grammarAccess.getAtelier_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Atelier_Impl__Group__2__Impl3970); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2026:1: rule__Atelier_Impl__Group__3 : rule__Atelier_Impl__Group__3__Impl rule__Atelier_Impl__Group__4 ;
    public final void rule__Atelier_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2030:1: ( rule__Atelier_Impl__Group__3__Impl rule__Atelier_Impl__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2031:2: rule__Atelier_Impl__Group__3__Impl rule__Atelier_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__3__Impl_in_rule__Atelier_Impl__Group__34001);
            rule__Atelier_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__4_in_rule__Atelier_Impl__Group__34004);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2038:1: rule__Atelier_Impl__Group__3__Impl : ( ( rule__Atelier_Impl__Group_3__0 )? ) ;
    public final void rule__Atelier_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2042:1: ( ( ( rule__Atelier_Impl__Group_3__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2043:1: ( ( rule__Atelier_Impl__Group_3__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2043:1: ( ( rule__Atelier_Impl__Group_3__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2044:1: ( rule__Atelier_Impl__Group_3__0 )?
            {
             before(grammarAccess.getAtelier_ImplAccess().getGroup_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2045:1: ( rule__Atelier_Impl__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2045:2: rule__Atelier_Impl__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__0_in_rule__Atelier_Impl__Group__3__Impl4031);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2055:1: rule__Atelier_Impl__Group__4 : rule__Atelier_Impl__Group__4__Impl ;
    public final void rule__Atelier_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2059:1: ( rule__Atelier_Impl__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2060:2: rule__Atelier_Impl__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group__4__Impl_in_rule__Atelier_Impl__Group__44062);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2066:1: rule__Atelier_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__Atelier_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2070:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2071:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2071:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2072:1: '}'
            {
             before(grammarAccess.getAtelier_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Atelier_Impl__Group__4__Impl4090); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2095:1: rule__Atelier_Impl__Group_3__0 : rule__Atelier_Impl__Group_3__0__Impl rule__Atelier_Impl__Group_3__1 ;
    public final void rule__Atelier_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2099:1: ( rule__Atelier_Impl__Group_3__0__Impl rule__Atelier_Impl__Group_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2100:2: rule__Atelier_Impl__Group_3__0__Impl rule__Atelier_Impl__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__0__Impl_in_rule__Atelier_Impl__Group_3__04131);
            rule__Atelier_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__1_in_rule__Atelier_Impl__Group_3__04134);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2107:1: rule__Atelier_Impl__Group_3__0__Impl : ( 'activity' ) ;
    public final void rule__Atelier_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2111:1: ( ( 'activity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2112:1: ( 'activity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2112:1: ( 'activity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2113:1: 'activity'
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityKeyword_3_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Atelier_Impl__Group_3__0__Impl4162); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2126:1: rule__Atelier_Impl__Group_3__1 : rule__Atelier_Impl__Group_3__1__Impl ;
    public final void rule__Atelier_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2130:1: ( rule__Atelier_Impl__Group_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2131:2: rule__Atelier_Impl__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__Group_3__1__Impl_in_rule__Atelier_Impl__Group_3__14193);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2137:1: rule__Atelier_Impl__Group_3__1__Impl : ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) ) ;
    public final void rule__Atelier_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2141:1: ( ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2142:1: ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2142:1: ( ( rule__Atelier_Impl__ActivityAssignment_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2143:1: ( rule__Atelier_Impl__ActivityAssignment_3_1 )
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityAssignment_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2144:1: ( rule__Atelier_Impl__ActivityAssignment_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2144:2: rule__Atelier_Impl__ActivityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Atelier_Impl__ActivityAssignment_3_1_in_rule__Atelier_Impl__Group_3__1__Impl4220);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2158:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2162:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2163:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04254);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04257);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2170:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2174:1: ( ( ( '-' )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2175:1: ( ( '-' )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2175:1: ( ( '-' )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2176:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2177:1: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2178:2: '-'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__EInt__Group__0__Impl4286); 

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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2189:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2193:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2194:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14319);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2200:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2204:1: ( ( RULE_INT ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2205:1: ( RULE_INT )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2205:1: ( RULE_INT )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2206:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4346); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2222:1: rule__Elevage__Group__0 : rule__Elevage__Group__0__Impl rule__Elevage__Group__1 ;
    public final void rule__Elevage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2226:1: ( rule__Elevage__Group__0__Impl rule__Elevage__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2227:2: rule__Elevage__Group__0__Impl rule__Elevage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__0__Impl_in_rule__Elevage__Group__04380);
            rule__Elevage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__1_in_rule__Elevage__Group__04383);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2234:1: rule__Elevage__Group__0__Impl : ( () ) ;
    public final void rule__Elevage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2238:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2239:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2239:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2240:1: ()
            {
             before(grammarAccess.getElevageAccess().getElevageAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2241:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2243:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2253:1: rule__Elevage__Group__1 : rule__Elevage__Group__1__Impl rule__Elevage__Group__2 ;
    public final void rule__Elevage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2257:1: ( rule__Elevage__Group__1__Impl rule__Elevage__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2258:2: rule__Elevage__Group__1__Impl rule__Elevage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__1__Impl_in_rule__Elevage__Group__14441);
            rule__Elevage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__2_in_rule__Elevage__Group__14444);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2265:1: rule__Elevage__Group__1__Impl : ( 'Elevage' ) ;
    public final void rule__Elevage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2269:1: ( ( 'Elevage' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2270:1: ( 'Elevage' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2270:1: ( 'Elevage' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2271:1: 'Elevage'
            {
             before(grammarAccess.getElevageAccess().getElevageKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Elevage__Group__1__Impl4472); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2284:1: rule__Elevage__Group__2 : rule__Elevage__Group__2__Impl rule__Elevage__Group__3 ;
    public final void rule__Elevage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2288:1: ( rule__Elevage__Group__2__Impl rule__Elevage__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2289:2: rule__Elevage__Group__2__Impl rule__Elevage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__2__Impl_in_rule__Elevage__Group__24503);
            rule__Elevage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__3_in_rule__Elevage__Group__24506);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2296:1: rule__Elevage__Group__2__Impl : ( '{' ) ;
    public final void rule__Elevage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2300:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2301:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2301:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2302:1: '{'
            {
             before(grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Elevage__Group__2__Impl4534); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2315:1: rule__Elevage__Group__3 : rule__Elevage__Group__3__Impl rule__Elevage__Group__4 ;
    public final void rule__Elevage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2319:1: ( rule__Elevage__Group__3__Impl rule__Elevage__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2320:2: rule__Elevage__Group__3__Impl rule__Elevage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__3__Impl_in_rule__Elevage__Group__34565);
            rule__Elevage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__4_in_rule__Elevage__Group__34568);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2327:1: rule__Elevage__Group__3__Impl : ( ( rule__Elevage__Group_3__0 )? ) ;
    public final void rule__Elevage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2331:1: ( ( ( rule__Elevage__Group_3__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2332:1: ( ( rule__Elevage__Group_3__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2332:1: ( ( rule__Elevage__Group_3__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2333:1: ( rule__Elevage__Group_3__0 )?
            {
             before(grammarAccess.getElevageAccess().getGroup_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2334:1: ( rule__Elevage__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2334:2: rule__Elevage__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__0_in_rule__Elevage__Group__3__Impl4595);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2344:1: rule__Elevage__Group__4 : rule__Elevage__Group__4__Impl ;
    public final void rule__Elevage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2348:1: ( rule__Elevage__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2349:2: rule__Elevage__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group__4__Impl_in_rule__Elevage__Group__44626);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2355:1: rule__Elevage__Group__4__Impl : ( '}' ) ;
    public final void rule__Elevage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2359:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2360:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2360:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2361:1: '}'
            {
             before(grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Elevage__Group__4__Impl4654); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2384:1: rule__Elevage__Group_3__0 : rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1 ;
    public final void rule__Elevage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2388:1: ( rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2389:2: rule__Elevage__Group_3__0__Impl rule__Elevage__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__0__Impl_in_rule__Elevage__Group_3__04695);
            rule__Elevage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__1_in_rule__Elevage__Group_3__04698);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2396:1: rule__Elevage__Group_3__0__Impl : ( 'activity' ) ;
    public final void rule__Elevage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2400:1: ( ( 'activity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2401:1: ( 'activity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2401:1: ( 'activity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2402:1: 'activity'
            {
             before(grammarAccess.getElevageAccess().getActivityKeyword_3_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Elevage__Group_3__0__Impl4726); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2415:1: rule__Elevage__Group_3__1 : rule__Elevage__Group_3__1__Impl ;
    public final void rule__Elevage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2419:1: ( rule__Elevage__Group_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2420:2: rule__Elevage__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__Group_3__1__Impl_in_rule__Elevage__Group_3__14757);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2426:1: rule__Elevage__Group_3__1__Impl : ( ( rule__Elevage__ActivityAssignment_3_1 ) ) ;
    public final void rule__Elevage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2430:1: ( ( ( rule__Elevage__ActivityAssignment_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2431:1: ( ( rule__Elevage__ActivityAssignment_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2431:1: ( ( rule__Elevage__ActivityAssignment_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2432:1: ( rule__Elevage__ActivityAssignment_3_1 )
            {
             before(grammarAccess.getElevageAccess().getActivityAssignment_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2433:1: ( rule__Elevage__ActivityAssignment_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2433:2: rule__Elevage__ActivityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Elevage__ActivityAssignment_3_1_in_rule__Elevage__Group_3__1__Impl4784);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2447:1: rule__Culture__Group__0 : rule__Culture__Group__0__Impl rule__Culture__Group__1 ;
    public final void rule__Culture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2451:1: ( rule__Culture__Group__0__Impl rule__Culture__Group__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2452:2: rule__Culture__Group__0__Impl rule__Culture__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__04818);
            rule__Culture__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__04821);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2459:1: rule__Culture__Group__0__Impl : ( () ) ;
    public final void rule__Culture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2463:1: ( ( () ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2464:1: ( () )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2464:1: ( () )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2465:1: ()
            {
             before(grammarAccess.getCultureAccess().getCultureAction_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2466:1: ()
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2468:1: 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2478:1: rule__Culture__Group__1 : rule__Culture__Group__1__Impl rule__Culture__Group__2 ;
    public final void rule__Culture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2482:1: ( rule__Culture__Group__1__Impl rule__Culture__Group__2 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2483:2: rule__Culture__Group__1__Impl rule__Culture__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__14879);
            rule__Culture__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__14882);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2490:1: rule__Culture__Group__1__Impl : ( 'Culture' ) ;
    public final void rule__Culture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2494:1: ( ( 'Culture' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2495:1: ( 'Culture' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2495:1: ( 'Culture' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2496:1: 'Culture'
            {
             before(grammarAccess.getCultureAccess().getCultureKeyword_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Culture__Group__1__Impl4910); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2509:1: rule__Culture__Group__2 : rule__Culture__Group__2__Impl rule__Culture__Group__3 ;
    public final void rule__Culture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2513:1: ( rule__Culture__Group__2__Impl rule__Culture__Group__3 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2514:2: rule__Culture__Group__2__Impl rule__Culture__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__24941);
            rule__Culture__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__24944);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2521:1: rule__Culture__Group__2__Impl : ( '{' ) ;
    public final void rule__Culture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2525:1: ( ( '{' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2526:1: ( '{' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2526:1: ( '{' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2527:1: '{'
            {
             before(grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Culture__Group__2__Impl4972); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2540:1: rule__Culture__Group__3 : rule__Culture__Group__3__Impl rule__Culture__Group__4 ;
    public final void rule__Culture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2544:1: ( rule__Culture__Group__3__Impl rule__Culture__Group__4 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2545:2: rule__Culture__Group__3__Impl rule__Culture__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__35003);
            rule__Culture__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__35006);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2552:1: rule__Culture__Group__3__Impl : ( ( rule__Culture__Group_3__0 )? ) ;
    public final void rule__Culture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2556:1: ( ( ( rule__Culture__Group_3__0 )? ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2557:1: ( ( rule__Culture__Group_3__0 )? )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2557:1: ( ( rule__Culture__Group_3__0 )? )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2558:1: ( rule__Culture__Group_3__0 )?
            {
             before(grammarAccess.getCultureAccess().getGroup_3()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2559:1: ( rule__Culture__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2559:2: rule__Culture__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__0_in_rule__Culture__Group__3__Impl5033);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2569:1: rule__Culture__Group__4 : rule__Culture__Group__4__Impl ;
    public final void rule__Culture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2573:1: ( rule__Culture__Group__4__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2574:2: rule__Culture__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__45064);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2580:1: rule__Culture__Group__4__Impl : ( '}' ) ;
    public final void rule__Culture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2584:1: ( ( '}' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2585:1: ( '}' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2585:1: ( '}' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2586:1: '}'
            {
             before(grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Culture__Group__4__Impl5092); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2609:1: rule__Culture__Group_3__0 : rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1 ;
    public final void rule__Culture__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2613:1: ( rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2614:2: rule__Culture__Group_3__0__Impl rule__Culture__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__0__Impl_in_rule__Culture__Group_3__05133);
            rule__Culture__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__1_in_rule__Culture__Group_3__05136);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2621:1: rule__Culture__Group_3__0__Impl : ( 'activity' ) ;
    public final void rule__Culture__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2625:1: ( ( 'activity' ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2626:1: ( 'activity' )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2626:1: ( 'activity' )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2627:1: 'activity'
            {
             before(grammarAccess.getCultureAccess().getActivityKeyword_3_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Culture__Group_3__0__Impl5164); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2640:1: rule__Culture__Group_3__1 : rule__Culture__Group_3__1__Impl ;
    public final void rule__Culture__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2644:1: ( rule__Culture__Group_3__1__Impl )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2645:2: rule__Culture__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__Group_3__1__Impl_in_rule__Culture__Group_3__15195);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2651:1: rule__Culture__Group_3__1__Impl : ( ( rule__Culture__ActivityAssignment_3_1 ) ) ;
    public final void rule__Culture__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2655:1: ( ( ( rule__Culture__ActivityAssignment_3_1 ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2656:1: ( ( rule__Culture__ActivityAssignment_3_1 ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2656:1: ( ( rule__Culture__ActivityAssignment_3_1 ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2657:1: ( rule__Culture__ActivityAssignment_3_1 )
            {
             before(grammarAccess.getCultureAccess().getActivityAssignment_3_1()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2658:1: ( rule__Culture__ActivityAssignment_3_1 )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2658:2: rule__Culture__ActivityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Culture__ActivityAssignment_3_1_in_rule__Culture__Group_3__1__Impl5222);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2673:1: rule__PeriodicActivity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PeriodicActivity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2677:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2678:1: ( ruleEString )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2678:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2679:1: ruleEString
            {
             before(grammarAccess.getPeriodicActivityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeriodicActivity__NameAssignment_25261);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2688:1: rule__PeriodicActivity__AtelierAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__PeriodicActivity__AtelierAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2692:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2693:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2693:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2694:1: ( ruleEString )
            {
             before(grammarAccess.getPeriodicActivityAccess().getAtelierAtelierCrossReference_4_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2695:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2696:1: ruleEString
            {
             before(grammarAccess.getPeriodicActivityAccess().getAtelierAtelierEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeriodicActivity__AtelierAssignment_4_15296);
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


    // $ANTLR start "rule__PeriodicActivity__StartAssignment_7"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2707:1: rule__PeriodicActivity__StartAssignment_7 : ( ruleDate ) ;
    public final void rule__PeriodicActivity__StartAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2711:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2712:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2712:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2713:1: ruleDate
            {
             before(grammarAccess.getPeriodicActivityAccess().getStartDateParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__PeriodicActivity__StartAssignment_75331);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getStartDateParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__StartAssignment_7"


    // $ANTLR start "rule__PeriodicActivity__EndAssignment_10"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2722:1: rule__PeriodicActivity__EndAssignment_10 : ( ruleDate ) ;
    public final void rule__PeriodicActivity__EndAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2726:1: ( ( ruleDate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2727:1: ( ruleDate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2727:1: ( ruleDate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2728:1: ruleDate
            {
             before(grammarAccess.getPeriodicActivityAccess().getEndDateParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__PeriodicActivity__EndAssignment_105362);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getEndDateParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__EndAssignment_10"


    // $ANTLR start "rule__PeriodicActivity__PeriodicityNumberAssignment_12_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2737:1: rule__PeriodicActivity__PeriodicityNumberAssignment_12_1 : ( ruleEInt ) ;
    public final void rule__PeriodicActivity__PeriodicityNumberAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2741:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2742:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2742:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2743:1: ruleEInt
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicityNumberEIntParserRuleCall_12_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__PeriodicActivity__PeriodicityNumberAssignment_12_15393);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getPeriodicityNumberEIntParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__PeriodicityNumberAssignment_12_1"


    // $ANTLR start "rule__PeriodicActivity__PeriodicityTypeAssignment_12_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2752:1: rule__PeriodicActivity__PeriodicityTypeAssignment_12_2 : ( rulePeriodicity ) ;
    public final void rule__PeriodicActivity__PeriodicityTypeAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2756:1: ( ( rulePeriodicity ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2757:1: ( rulePeriodicity )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2757:1: ( rulePeriodicity )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2758:1: rulePeriodicity
            {
             before(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_rule__PeriodicActivity__PeriodicityTypeAssignment_12_25424);
            rulePeriodicity();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__PeriodicityTypeAssignment_12_2"


    // $ANTLR start "rule__PeriodicActivity__ResAllocationAssignment_13_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2767:1: rule__PeriodicActivity__ResAllocationAssignment_13_2 : ( ruleResAllocation ) ;
    public final void rule__PeriodicActivity__ResAllocationAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2771:1: ( ( ruleResAllocation ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2772:1: ( ruleResAllocation )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2772:1: ( ruleResAllocation )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2773:1: ruleResAllocation
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_13_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_13_25455);
            ruleResAllocation();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__ResAllocationAssignment_13_2"


    // $ANTLR start "rule__PeriodicActivity__ResAllocationAssignment_13_3_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2782:1: rule__PeriodicActivity__ResAllocationAssignment_13_3_1 : ( ruleResAllocation ) ;
    public final void rule__PeriodicActivity__ResAllocationAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2786:1: ( ( ruleResAllocation ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2787:1: ( ruleResAllocation )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2787:1: ( ruleResAllocation )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2788:1: ruleResAllocation
            {
             before(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_13_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_13_3_15486);
            ruleResAllocation();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_13_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__ResAllocationAssignment_13_3_1"


    // $ANTLR start "rule__PeriodicActivity__RuleAssignment_14_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2797:1: rule__PeriodicActivity__RuleAssignment_14_2 : ( ruleRule ) ;
    public final void rule__PeriodicActivity__RuleAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2801:1: ( ( ruleRule ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2802:1: ( ruleRule )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2802:1: ( ruleRule )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2803:1: ruleRule
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_14_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__PeriodicActivity__RuleAssignment_14_25517);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__RuleAssignment_14_2"


    // $ANTLR start "rule__PeriodicActivity__RuleAssignment_14_3_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2812:1: rule__PeriodicActivity__RuleAssignment_14_3_1 : ( ruleRule ) ;
    public final void rule__PeriodicActivity__RuleAssignment_14_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2816:1: ( ( ruleRule ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2817:1: ( ruleRule )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2817:1: ( ruleRule )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2818:1: ruleRule
            {
             before(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_14_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__PeriodicActivity__RuleAssignment_14_3_15548);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_14_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicActivity__RuleAssignment_14_3_1"


    // $ANTLR start "rule__Date__DayAssignment_1"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2827:1: rule__Date__DayAssignment_1 : ( ruleEInt ) ;
    public final void rule__Date__DayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2831:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2832:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2832:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2833:1: ruleEInt
            {
             before(grammarAccess.getDateAccess().getDayEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Date__DayAssignment_15579);
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


    // $ANTLR start "rule__ResAllocation__RessourceAssignment_2"
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2842:1: rule__ResAllocation__RessourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ResAllocation__RessourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2846:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2847:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2847:1: ( ( RULE_ID ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2848:1: ( RULE_ID )
            {
             before(grammarAccess.getResAllocationAccess().getRessourceRessourceCrossReference_2_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2849:1: ( RULE_ID )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2850:1: RULE_ID
            {
             before(grammarAccess.getResAllocationAccess().getRessourceRessourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ResAllocation__RessourceAssignment_25614); 
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2861:1: rule__ResAllocation__DureeAssignment_4 : ( ruleEInt ) ;
    public final void rule__ResAllocation__DureeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2865:1: ( ( ruleEInt ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2866:1: ( ruleEInt )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2866:1: ( ruleEInt )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2867:1: ruleEInt
            {
             before(grammarAccess.getResAllocationAccess().getDureeEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ResAllocation__DureeAssignment_45649);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2876:1: rule__Rule__PreAssignment_1_1 : ( rulePredicate ) ;
    public final void rule__Rule__PreAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2880:1: ( ( rulePredicate ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2881:1: ( rulePredicate )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2881:1: ( rulePredicate )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2882:1: rulePredicate
            {
             before(grammarAccess.getRuleAccess().getPrePredicateParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_rule__Rule__PreAssignment_1_15680);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2891:1: rule__Atelier_Impl__ActivityAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Atelier_Impl__ActivityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2895:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2896:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2896:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2897:1: ( ruleEString )
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2898:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2899:1: ruleEString
            {
             before(grammarAccess.getAtelier_ImplAccess().getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Atelier_Impl__ActivityAssignment_3_15715);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2911:1: rule__Elevage__ActivityAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Elevage__ActivityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2915:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2916:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2916:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2917:1: ( ruleEString )
            {
             before(grammarAccess.getElevageAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2918:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2919:1: ruleEString
            {
             before(grammarAccess.getElevageAccess().getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Elevage__ActivityAssignment_3_15755);
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
    // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2930:1: rule__Culture__ActivityAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Culture__ActivityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2934:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2935:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2935:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2936:1: ( ruleEString )
            {
             before(grammarAccess.getCultureAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2937:1: ( ruleEString )
            // ../org.xtext.activity.act.ui/src-gen/org/xtext/activity/ui/contentassist/antlr/internal/InternalAct.g:2938:1: ruleEString
            {
             before(grammarAccess.getCultureAccess().getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Culture__ActivityAssignment_3_15794);
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
        public static final BitSet FOLLOW_rule__Periodicity__Alternatives_in_rulePeriodicity676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Periodicity__Alternatives762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Periodicity__Alternatives783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Periodicity__Alternatives804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Periodicity__Alternatives825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Periodicity__Alternatives846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__0__Impl_in_rule__PeriodicActivity__Group__0879 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__1_in_rule__PeriodicActivity__Group__0882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__1__Impl_in_rule__PeriodicActivity__Group__1940 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__2_in_rule__PeriodicActivity__Group__1943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__PeriodicActivity__Group__1__Impl971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__2__Impl_in_rule__PeriodicActivity__Group__21002 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__3_in_rule__PeriodicActivity__Group__21005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__NameAssignment_2_in_rule__PeriodicActivity__Group__2__Impl1032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__3__Impl_in_rule__PeriodicActivity__Group__31062 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__4_in_rule__PeriodicActivity__Group__31065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PeriodicActivity__Group__3__Impl1093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__4__Impl_in_rule__PeriodicActivity__Group__41124 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__5_in_rule__PeriodicActivity__Group__41127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__0_in_rule__PeriodicActivity__Group__4__Impl1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__5__Impl_in_rule__PeriodicActivity__Group__51185 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__6_in_rule__PeriodicActivity__Group__51188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__PeriodicActivity__Group__5__Impl1216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__6__Impl_in_rule__PeriodicActivity__Group__61247 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__7_in_rule__PeriodicActivity__Group__61250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PeriodicActivity__Group__6__Impl1278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__7__Impl_in_rule__PeriodicActivity__Group__71309 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__8_in_rule__PeriodicActivity__Group__71312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__StartAssignment_7_in_rule__PeriodicActivity__Group__7__Impl1339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__8__Impl_in_rule__PeriodicActivity__Group__81369 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__9_in_rule__PeriodicActivity__Group__81372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__PeriodicActivity__Group__8__Impl1400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__9__Impl_in_rule__PeriodicActivity__Group__91431 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__10_in_rule__PeriodicActivity__Group__91434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__PeriodicActivity__Group__9__Impl1462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__10__Impl_in_rule__PeriodicActivity__Group__101493 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__11_in_rule__PeriodicActivity__Group__101496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__EndAssignment_10_in_rule__PeriodicActivity__Group__10__Impl1523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__11__Impl_in_rule__PeriodicActivity__Group__111553 = new BitSet(new long[]{0x0000000016800000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__12_in_rule__PeriodicActivity__Group__111556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__PeriodicActivity__Group__11__Impl1584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__12__Impl_in_rule__PeriodicActivity__Group__121615 = new BitSet(new long[]{0x0000000016800000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__13_in_rule__PeriodicActivity__Group__121618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__0_in_rule__PeriodicActivity__Group__12__Impl1645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__13__Impl_in_rule__PeriodicActivity__Group__131676 = new BitSet(new long[]{0x0000000016800000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__14_in_rule__PeriodicActivity__Group__131679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__0_in_rule__PeriodicActivity__Group__13__Impl1706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__14__Impl_in_rule__PeriodicActivity__Group__141737 = new BitSet(new long[]{0x0000000016800000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__15_in_rule__PeriodicActivity__Group__141740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_14__0_in_rule__PeriodicActivity__Group__14__Impl1767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group__15__Impl_in_rule__PeriodicActivity__Group__151798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__PeriodicActivity__Group__15__Impl1826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__0__Impl_in_rule__PeriodicActivity__Group_4__01889 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__1_in_rule__PeriodicActivity__Group_4__01892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__PeriodicActivity__Group_4__0__Impl1920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__1__Impl_in_rule__PeriodicActivity__Group_4__11951 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__2_in_rule__PeriodicActivity__Group_4__11954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__AtelierAssignment_4_1_in_rule__PeriodicActivity__Group_4__1__Impl1981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_4__2__Impl_in_rule__PeriodicActivity__Group_4__22011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__PeriodicActivity__Group_4__2__Impl2039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__0__Impl_in_rule__PeriodicActivity__Group_12__02076 = new BitSet(new long[]{0x000000040000F840L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__1_in_rule__PeriodicActivity__Group_12__02079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__PeriodicActivity__Group_12__0__Impl2107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__1__Impl_in_rule__PeriodicActivity__Group_12__12138 = new BitSet(new long[]{0x000000040000F840L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__2_in_rule__PeriodicActivity__Group_12__12141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__PeriodicityNumberAssignment_12_1_in_rule__PeriodicActivity__Group_12__1__Impl2168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_12__2__Impl_in_rule__PeriodicActivity__Group_12__22199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__PeriodicityTypeAssignment_12_2_in_rule__PeriodicActivity__Group_12__2__Impl2226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__0__Impl_in_rule__PeriodicActivity__Group_13__02262 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__1_in_rule__PeriodicActivity__Group_13__02265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__PeriodicActivity__Group_13__0__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__1__Impl_in_rule__PeriodicActivity__Group_13__12324 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__2_in_rule__PeriodicActivity__Group_13__12327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PeriodicActivity__Group_13__1__Impl2355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__2__Impl_in_rule__PeriodicActivity__Group_13__22386 = new BitSet(new long[]{0x0000000008400000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__3_in_rule__PeriodicActivity__Group_13__22389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_13_2_in_rule__PeriodicActivity__Group_13__2__Impl2416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__3__Impl_in_rule__PeriodicActivity__Group_13__32446 = new BitSet(new long[]{0x0000000008400000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__4_in_rule__PeriodicActivity__Group_13__32449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13_3__0_in_rule__PeriodicActivity__Group_13__3__Impl2476 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13__4__Impl_in_rule__PeriodicActivity__Group_13__42507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__PeriodicActivity__Group_13__4__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13_3__0__Impl_in_rule__PeriodicActivity__Group_13_3__02576 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13_3__1_in_rule__PeriodicActivity__Group_13_3__02579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__PeriodicActivity__Group_13_3__0__Impl2607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_13_3__1__Impl_in_rule__PeriodicActivity__Group_13_3__12638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__ResAllocationAssignment_13_3_1_in_rule__PeriodicActivity__Group_13_3__1__Impl2665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_14__0__Impl_in_rule__PeriodicActivity__Group_14__02699 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_14__1_in_rule__PeriodicActivity__Group_14__02702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__PeriodicActivity__Group_14__0__Impl2730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_14__1__Impl_in_rule__PeriodicActivity__Group_14__12761 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_14__2_in_rule__PeriodicActivity__Group_14__12764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PeriodicActivity__Group_14__1__Impl2792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_14__2__Impl_in_rule__PeriodicActivity__Group_14__22823 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_14__3_in_rule__PeriodicActivity__Group_14__22826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__RuleAssignment_14_2_in_rule__PeriodicActivity__Group_14__2__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_14__3__Impl_in_rule__PeriodicActivity__Group_14__32883 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_14__4_in_rule__PeriodicActivity__Group_14__32886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_14_3__0_in_rule__PeriodicActivity__Group_14__3__Impl2913 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_14__4__Impl_in_rule__PeriodicActivity__Group_14__42944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__PeriodicActivity__Group_14__4__Impl2972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_14_3__0__Impl_in_rule__PeriodicActivity__Group_14_3__03013 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_14_3__1_in_rule__PeriodicActivity__Group_14_3__03016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__PeriodicActivity__Group_14_3__0__Impl3044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__Group_14_3__1__Impl_in_rule__PeriodicActivity__Group_14_3__13075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeriodicActivity__RuleAssignment_14_3_1_in_rule__PeriodicActivity__Group_14_3__1__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__03136 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__03139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__13197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl3224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__0__Impl_in_rule__ResAllocation__Group__03258 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__1_in_rule__ResAllocation__Group__03261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__1__Impl_in_rule__ResAllocation__Group__13319 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__2_in_rule__ResAllocation__Group__13322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ResAllocation__Group__1__Impl3350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__2__Impl_in_rule__ResAllocation__Group__23381 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__3_in_rule__ResAllocation__Group__23384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__RessourceAssignment_2_in_rule__ResAllocation__Group__2__Impl3411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__3__Impl_in_rule__ResAllocation__Group__33441 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__4_in_rule__ResAllocation__Group__33444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ResAllocation__Group__3__Impl3472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__Group__4__Impl_in_rule__ResAllocation__Group__43503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResAllocation__DureeAssignment_4_in_rule__ResAllocation__Group__4__Impl3530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03570 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_1__0_in_rule__Rule__Group__1__Impl3658 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_1__0__Impl_in_rule__Rule__Group_1__03693 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__Rule__Group_1__1_in_rule__Rule__Group_1__03696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Rule__Group_1__0__Impl3724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group_1__1__Impl_in_rule__Rule__Group_1__13755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__PreAssignment_1_1_in_rule__Rule__Group_1__1__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__0__Impl_in_rule__Atelier_Impl__Group__03816 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__1_in_rule__Atelier_Impl__Group__03819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__1__Impl_in_rule__Atelier_Impl__Group__13877 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__2_in_rule__Atelier_Impl__Group__13880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Atelier_Impl__Group__1__Impl3908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__2__Impl_in_rule__Atelier_Impl__Group__23939 = new BitSet(new long[]{0x0000000200800000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__3_in_rule__Atelier_Impl__Group__23942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Atelier_Impl__Group__2__Impl3970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__3__Impl_in_rule__Atelier_Impl__Group__34001 = new BitSet(new long[]{0x0000000200800000L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__4_in_rule__Atelier_Impl__Group__34004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__0_in_rule__Atelier_Impl__Group__3__Impl4031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group__4__Impl_in_rule__Atelier_Impl__Group__44062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Atelier_Impl__Group__4__Impl4090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__0__Impl_in_rule__Atelier_Impl__Group_3__04131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__1_in_rule__Atelier_Impl__Group_3__04134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Atelier_Impl__Group_3__0__Impl4162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__Group_3__1__Impl_in_rule__Atelier_Impl__Group_3__14193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Atelier_Impl__ActivityAssignment_3_1_in_rule__Atelier_Impl__Group_3__1__Impl4220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04254 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__EInt__Group__0__Impl4286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__0__Impl_in_rule__Elevage__Group__04380 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Elevage__Group__1_in_rule__Elevage__Group__04383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__1__Impl_in_rule__Elevage__Group__14441 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Elevage__Group__2_in_rule__Elevage__Group__14444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Elevage__Group__1__Impl4472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__2__Impl_in_rule__Elevage__Group__24503 = new BitSet(new long[]{0x0000000200800000L});
        public static final BitSet FOLLOW_rule__Elevage__Group__3_in_rule__Elevage__Group__24506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Elevage__Group__2__Impl4534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__3__Impl_in_rule__Elevage__Group__34565 = new BitSet(new long[]{0x0000000200800000L});
        public static final BitSet FOLLOW_rule__Elevage__Group__4_in_rule__Elevage__Group__34568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__0_in_rule__Elevage__Group__3__Impl4595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group__4__Impl_in_rule__Elevage__Group__44626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Elevage__Group__4__Impl4654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__0__Impl_in_rule__Elevage__Group_3__04695 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__1_in_rule__Elevage__Group_3__04698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Elevage__Group_3__0__Impl4726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__Group_3__1__Impl_in_rule__Elevage__Group_3__14757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Elevage__ActivityAssignment_3_1_in_rule__Elevage__Group_3__1__Impl4784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__0__Impl_in_rule__Culture__Group__04818 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Culture__Group__1_in_rule__Culture__Group__04821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__1__Impl_in_rule__Culture__Group__14879 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Culture__Group__2_in_rule__Culture__Group__14882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Culture__Group__1__Impl4910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__2__Impl_in_rule__Culture__Group__24941 = new BitSet(new long[]{0x0000000200800000L});
        public static final BitSet FOLLOW_rule__Culture__Group__3_in_rule__Culture__Group__24944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Culture__Group__2__Impl4972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__3__Impl_in_rule__Culture__Group__35003 = new BitSet(new long[]{0x0000000200800000L});
        public static final BitSet FOLLOW_rule__Culture__Group__4_in_rule__Culture__Group__35006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__0_in_rule__Culture__Group__3__Impl5033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group__4__Impl_in_rule__Culture__Group__45064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Culture__Group__4__Impl5092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__0__Impl_in_rule__Culture__Group_3__05133 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__1_in_rule__Culture__Group_3__05136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Culture__Group_3__0__Impl5164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__Group_3__1__Impl_in_rule__Culture__Group_3__15195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Culture__ActivityAssignment_3_1_in_rule__Culture__Group_3__1__Impl5222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeriodicActivity__NameAssignment_25261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeriodicActivity__AtelierAssignment_4_15296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__PeriodicActivity__StartAssignment_75331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__PeriodicActivity__EndAssignment_105362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__PeriodicActivity__PeriodicityNumberAssignment_12_15393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicity_in_rule__PeriodicActivity__PeriodicityTypeAssignment_12_25424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_13_25455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rule__PeriodicActivity__ResAllocationAssignment_13_3_15486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__PeriodicActivity__RuleAssignment_14_25517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__PeriodicActivity__RuleAssignment_14_3_15548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Date__DayAssignment_15579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ResAllocation__RessourceAssignment_25614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ResAllocation__DureeAssignment_45649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_rule__Rule__PreAssignment_1_15680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Atelier_Impl__ActivityAssignment_3_15715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Elevage__ActivityAssignment_3_15755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Culture__ActivityAssignment_3_15794 = new BitSet(new long[]{0x0000000000000002L});
    }


}
package org.xtext.activity.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.activity.services.ActGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'atelier'", "'{'", "'}'", "'PeriodicActivity'", "'from'", "'to'", "','", "'every'", "'allocate'", "'rules'", "':'", "'reserve'", "'for'", "'before'", "'('", "')'", "'tm'", "'temperature'", "'than'", "'rr'", "'precipitation'", "'par'", "'rayonnement'", "'etp'", "'evapotranspiration'", "'activity'", "'done'", "'ago'", "'noRain'", "'since'", "'grain'", "'is'", "'-'", "'.'", "'months'", "'days'", "'weeks'", "'years'", "'hours'", "'january'", "'february'", "'march'", "'april'", "'may'", "'june'", "'july'", "'august'", "'september'", "'october'", "'november'", "'december'", "'inferior'", "'inferiorOrEqual'", "'equal'", "'different'", "'superior'", "'superiorOrEqual'", "'AND'", "'OR'", "'XOR'", "'MATURE'", "'IMMATURE'", "'Tractor'", "'Worker'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g"; }



     	private ActGrammarAccess grammarAccess;
     	
        public InternalActParser(TokenStream input, ActGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ActGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:77:1: ruleModel returns [EObject current=null] : ( () ( (lv_atelier_1_0= ruleAtelierRef ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_atelier_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:80:28: ( ( () ( (lv_atelier_1_0= ruleAtelierRef ) )* ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:81:1: ( () ( (lv_atelier_1_0= ruleAtelierRef ) )* )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:81:1: ( () ( (lv_atelier_1_0= ruleAtelierRef ) )* )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:81:2: () ( (lv_atelier_1_0= ruleAtelierRef ) )*
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:81:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:87:2: ( (lv_atelier_1_0= ruleAtelierRef ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:88:1: (lv_atelier_1_0= ruleAtelierRef )
            	    {
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:88:1: (lv_atelier_1_0= ruleAtelierRef )
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:89:3: lv_atelier_1_0= ruleAtelierRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getAtelierAtelierRefParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAtelierRef_in_ruleModel140);
            	    lv_atelier_1_0=ruleAtelierRef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"atelier",
            	            		lv_atelier_1_0, 
            	            		"AtelierRef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAtelierRef"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:113:1: entryRuleAtelierRef returns [EObject current=null] : iv_ruleAtelierRef= ruleAtelierRef EOF ;
    public final EObject entryRuleAtelierRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtelierRef = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:114:2: (iv_ruleAtelierRef= ruleAtelierRef EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:115:2: iv_ruleAtelierRef= ruleAtelierRef EOF
            {
             newCompositeNode(grammarAccess.getAtelierRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtelierRef_in_entryRuleAtelierRef177);
            iv_ruleAtelierRef=ruleAtelierRef();

            state._fsp--;

             current =iv_ruleAtelierRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtelierRef187); 

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
    // $ANTLR end "entryRuleAtelierRef"


    // $ANTLR start "ruleAtelierRef"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:122:1: ruleAtelierRef returns [EObject current=null] : ( () otherlv_1= 'atelier' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_activity_4_0= rulePeriodicActivity ) )* otherlv_5= '}' ) ;
    public final EObject ruleAtelierRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        EObject lv_activity_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:125:28: ( ( () otherlv_1= 'atelier' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_activity_4_0= rulePeriodicActivity ) )* otherlv_5= '}' ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:126:1: ( () otherlv_1= 'atelier' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_activity_4_0= rulePeriodicActivity ) )* otherlv_5= '}' )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:126:1: ( () otherlv_1= 'atelier' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_activity_4_0= rulePeriodicActivity ) )* otherlv_5= '}' )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:126:2: () otherlv_1= 'atelier' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_activity_4_0= rulePeriodicActivity ) )* otherlv_5= '}'
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:126:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:127:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtelierRefAccess().getAtelierRefAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAtelierRef233); 

                	newLeafNode(otherlv_1, grammarAccess.getAtelierRefAccess().getAtelierKeyword_1());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:136:1: ( (lv_id_2_0= ruleEString ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:137:1: (lv_id_2_0= ruleEString )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:137:1: (lv_id_2_0= ruleEString )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:138:3: lv_id_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAtelierRefAccess().getIdEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAtelierRef254);
            lv_id_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtelierRefRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAtelierRef266); 

                	newLeafNode(otherlv_3, grammarAccess.getAtelierRefAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:158:1: ( (lv_activity_4_0= rulePeriodicActivity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:159:1: (lv_activity_4_0= rulePeriodicActivity )
            	    {
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:159:1: (lv_activity_4_0= rulePeriodicActivity )
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:160:3: lv_activity_4_0= rulePeriodicActivity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAtelierRefAccess().getActivityPeriodicActivityParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePeriodicActivity_in_ruleAtelierRef287);
            	    lv_activity_4_0=rulePeriodicActivity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAtelierRefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activity",
            	            		lv_activity_4_0, 
            	            		"PeriodicActivity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAtelierRef300); 

                	newLeafNode(otherlv_5, grammarAccess.getAtelierRefAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtelierRef"


    // $ANTLR start "entryRulePeriodicActivity"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:188:1: entryRulePeriodicActivity returns [EObject current=null] : iv_rulePeriodicActivity= rulePeriodicActivity EOF ;
    public final EObject entryRulePeriodicActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeriodicActivity = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:189:2: (iv_rulePeriodicActivity= rulePeriodicActivity EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:190:2: iv_rulePeriodicActivity= rulePeriodicActivity EOF
            {
             newCompositeNode(grammarAccess.getPeriodicActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicActivity_in_entryRulePeriodicActivity336);
            iv_rulePeriodicActivity=rulePeriodicActivity();

            state._fsp--;

             current =iv_rulePeriodicActivity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePeriodicActivity346); 

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
    // $ANTLR end "entryRulePeriodicActivity"


    // $ANTLR start "rulePeriodicActivity"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:197:1: rulePeriodicActivity returns [EObject current=null] : ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_start_5_0= ruleDate ) ) otherlv_6= 'to' ( (lv_end_7_0= ruleDate ) ) otherlv_8= ',' (otherlv_9= 'every' ( (lv_frequency_10_0= ruleEInt ) )? ( (lv_periodicityType_11_0= rulePeriodicity ) ) otherlv_12= ',' )? (otherlv_13= 'allocate' otherlv_14= '{' ( (lv_resAllocation_15_0= ruleResAllocation ) ) (otherlv_16= ',' ( (lv_resAllocation_17_0= ruleResAllocation ) ) )* otherlv_18= '}' otherlv_19= ',' )? (otherlv_20= 'rules' otherlv_21= ':' ( (lv_rule_22_0= ruleBinaryExppression ) ) otherlv_23= ',' )? otherlv_24= '}' ) ;
    public final EObject rulePeriodicActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_start_5_0 = null;

        EObject lv_end_7_0 = null;

        AntlrDatatypeRuleToken lv_frequency_10_0 = null;

        Enumerator lv_periodicityType_11_0 = null;

        EObject lv_resAllocation_15_0 = null;

        EObject lv_resAllocation_17_0 = null;

        EObject lv_rule_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:200:28: ( ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_start_5_0= ruleDate ) ) otherlv_6= 'to' ( (lv_end_7_0= ruleDate ) ) otherlv_8= ',' (otherlv_9= 'every' ( (lv_frequency_10_0= ruleEInt ) )? ( (lv_periodicityType_11_0= rulePeriodicity ) ) otherlv_12= ',' )? (otherlv_13= 'allocate' otherlv_14= '{' ( (lv_resAllocation_15_0= ruleResAllocation ) ) (otherlv_16= ',' ( (lv_resAllocation_17_0= ruleResAllocation ) ) )* otherlv_18= '}' otherlv_19= ',' )? (otherlv_20= 'rules' otherlv_21= ':' ( (lv_rule_22_0= ruleBinaryExppression ) ) otherlv_23= ',' )? otherlv_24= '}' ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:201:1: ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_start_5_0= ruleDate ) ) otherlv_6= 'to' ( (lv_end_7_0= ruleDate ) ) otherlv_8= ',' (otherlv_9= 'every' ( (lv_frequency_10_0= ruleEInt ) )? ( (lv_periodicityType_11_0= rulePeriodicity ) ) otherlv_12= ',' )? (otherlv_13= 'allocate' otherlv_14= '{' ( (lv_resAllocation_15_0= ruleResAllocation ) ) (otherlv_16= ',' ( (lv_resAllocation_17_0= ruleResAllocation ) ) )* otherlv_18= '}' otherlv_19= ',' )? (otherlv_20= 'rules' otherlv_21= ':' ( (lv_rule_22_0= ruleBinaryExppression ) ) otherlv_23= ',' )? otherlv_24= '}' )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:201:1: ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_start_5_0= ruleDate ) ) otherlv_6= 'to' ( (lv_end_7_0= ruleDate ) ) otherlv_8= ',' (otherlv_9= 'every' ( (lv_frequency_10_0= ruleEInt ) )? ( (lv_periodicityType_11_0= rulePeriodicity ) ) otherlv_12= ',' )? (otherlv_13= 'allocate' otherlv_14= '{' ( (lv_resAllocation_15_0= ruleResAllocation ) ) (otherlv_16= ',' ( (lv_resAllocation_17_0= ruleResAllocation ) ) )* otherlv_18= '}' otherlv_19= ',' )? (otherlv_20= 'rules' otherlv_21= ':' ( (lv_rule_22_0= ruleBinaryExppression ) ) otherlv_23= ',' )? otherlv_24= '}' )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:201:2: () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_start_5_0= ruleDate ) ) otherlv_6= 'to' ( (lv_end_7_0= ruleDate ) ) otherlv_8= ',' (otherlv_9= 'every' ( (lv_frequency_10_0= ruleEInt ) )? ( (lv_periodicityType_11_0= rulePeriodicity ) ) otherlv_12= ',' )? (otherlv_13= 'allocate' otherlv_14= '{' ( (lv_resAllocation_15_0= ruleResAllocation ) ) (otherlv_16= ',' ( (lv_resAllocation_17_0= ruleResAllocation ) ) )* otherlv_18= '}' otherlv_19= ',' )? (otherlv_20= 'rules' otherlv_21= ':' ( (lv_rule_22_0= ruleBinaryExppression ) ) otherlv_23= ',' )? otherlv_24= '}'
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:201:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:202:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPeriodicActivityAccess().getPeriodicActivityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePeriodicActivity392); 

                	newLeafNode(otherlv_1, grammarAccess.getPeriodicActivityAccess().getPeriodicActivityKeyword_1());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:211:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:212:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:212:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:213:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePeriodicActivity413);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePeriodicActivity425); 

                	newLeafNode(otherlv_3, grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePeriodicActivity437); 

                	newLeafNode(otherlv_4, grammarAccess.getPeriodicActivityAccess().getFromKeyword_4());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:237:1: ( (lv_start_5_0= ruleDate ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:238:1: (lv_start_5_0= ruleDate )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:238:1: (lv_start_5_0= ruleDate )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:239:3: lv_start_5_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getStartDateParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rulePeriodicActivity458);
            lv_start_5_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_5_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePeriodicActivity470); 

                	newLeafNode(otherlv_6, grammarAccess.getPeriodicActivityAccess().getToKeyword_6());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:259:1: ( (lv_end_7_0= ruleDate ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:260:1: (lv_end_7_0= ruleDate )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:260:1: (lv_end_7_0= ruleDate )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:261:3: lv_end_7_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getEndDateParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rulePeriodicActivity491);
            lv_end_7_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_7_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePeriodicActivity503); 

                	newLeafNode(otherlv_8, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_8());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:281:1: (otherlv_9= 'every' ( (lv_frequency_10_0= ruleEInt ) )? ( (lv_periodicityType_11_0= rulePeriodicity ) ) otherlv_12= ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:281:3: otherlv_9= 'every' ( (lv_frequency_10_0= ruleEInt ) )? ( (lv_periodicityType_11_0= rulePeriodicity ) ) otherlv_12= ','
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePeriodicActivity516); 

                        	newLeafNode(otherlv_9, grammarAccess.getPeriodicActivityAccess().getEveryKeyword_9_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:285:1: ( (lv_frequency_10_0= ruleEInt ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT||LA3_0==43) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:286:1: (lv_frequency_10_0= ruleEInt )
                            {
                            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:286:1: (lv_frequency_10_0= ruleEInt )
                            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:287:3: lv_frequency_10_0= ruleEInt
                            {
                             
                            	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getFrequencyEIntParserRuleCall_9_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePeriodicActivity537);
                            lv_frequency_10_0=ruleEInt();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"frequency",
                                    		lv_frequency_10_0, 
                                    		"EInt");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:303:3: ( (lv_periodicityType_11_0= rulePeriodicity ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:304:1: (lv_periodicityType_11_0= rulePeriodicity )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:304:1: (lv_periodicityType_11_0= rulePeriodicity )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:305:3: lv_periodicityType_11_0= rulePeriodicity
                    {
                     
                    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_rulePeriodicActivity559);
                    lv_periodicityType_11_0=rulePeriodicity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"periodicityType",
                            		lv_periodicityType_11_0, 
                            		"Periodicity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePeriodicActivity571); 

                        	newLeafNode(otherlv_12, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_9_3());
                        

                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:325:3: (otherlv_13= 'allocate' otherlv_14= '{' ( (lv_resAllocation_15_0= ruleResAllocation ) ) (otherlv_16= ',' ( (lv_resAllocation_17_0= ruleResAllocation ) ) )* otherlv_18= '}' otherlv_19= ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:325:5: otherlv_13= 'allocate' otherlv_14= '{' ( (lv_resAllocation_15_0= ruleResAllocation ) ) (otherlv_16= ',' ( (lv_resAllocation_17_0= ruleResAllocation ) ) )* otherlv_18= '}' otherlv_19= ','
                    {
                    otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePeriodicActivity586); 

                        	newLeafNode(otherlv_13, grammarAccess.getPeriodicActivityAccess().getAllocateKeyword_10_0());
                        
                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePeriodicActivity598); 

                        	newLeafNode(otherlv_14, grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:333:1: ( (lv_resAllocation_15_0= ruleResAllocation ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:334:1: (lv_resAllocation_15_0= ruleResAllocation )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:334:1: (lv_resAllocation_15_0= ruleResAllocation )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:335:3: lv_resAllocation_15_0= ruleResAllocation
                    {
                     
                    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rulePeriodicActivity619);
                    lv_resAllocation_15_0=ruleResAllocation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"resAllocation",
                            		lv_resAllocation_15_0, 
                            		"ResAllocation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:351:2: (otherlv_16= ',' ( (lv_resAllocation_17_0= ruleResAllocation ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:351:4: otherlv_16= ',' ( (lv_resAllocation_17_0= ruleResAllocation ) )
                    	    {
                    	    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePeriodicActivity632); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:355:1: ( (lv_resAllocation_17_0= ruleResAllocation ) )
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:356:1: (lv_resAllocation_17_0= ruleResAllocation )
                    	    {
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:356:1: (lv_resAllocation_17_0= ruleResAllocation )
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:357:3: lv_resAllocation_17_0= ruleResAllocation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rulePeriodicActivity653);
                    	    lv_resAllocation_17_0=ruleResAllocation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resAllocation",
                    	            		lv_resAllocation_17_0, 
                    	            		"ResAllocation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePeriodicActivity667); 

                        	newLeafNode(otherlv_18, grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_10_4());
                        
                    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePeriodicActivity679); 

                        	newLeafNode(otherlv_19, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_10_5());
                        

                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:381:3: (otherlv_20= 'rules' otherlv_21= ':' ( (lv_rule_22_0= ruleBinaryExppression ) ) otherlv_23= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:381:5: otherlv_20= 'rules' otherlv_21= ':' ( (lv_rule_22_0= ruleBinaryExppression ) ) otherlv_23= ','
                    {
                    otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePeriodicActivity694); 

                        	newLeafNode(otherlv_20, grammarAccess.getPeriodicActivityAccess().getRulesKeyword_11_0());
                        
                    otherlv_21=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePeriodicActivity706); 

                        	newLeafNode(otherlv_21, grammarAccess.getPeriodicActivityAccess().getColonKeyword_11_1());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:389:1: ( (lv_rule_22_0= ruleBinaryExppression ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:390:1: (lv_rule_22_0= ruleBinaryExppression )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:390:1: (lv_rule_22_0= ruleBinaryExppression )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:391:3: lv_rule_22_0= ruleBinaryExppression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getRuleBinaryExppressionParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_rulePeriodicActivity727);
                    lv_rule_22_0=ruleBinaryExppression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"rule",
                            		lv_rule_22_0, 
                            		"BinaryExppression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePeriodicActivity739); 

                        	newLeafNode(otherlv_23, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11_3());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePeriodicActivity753); 

                	newLeafNode(otherlv_24, grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePeriodicActivity"


    // $ANTLR start "entryRuleDate"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:423:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:424:2: (iv_ruleDate= ruleDate EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:425:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate789);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate799); 

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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:432:1: ruleDate returns [EObject current=null] : ( () ( (lv_day_1_0= ruleEInt ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= ruleEInt ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_day_1_0 = null;

        Enumerator lv_month_2_0 = null;

        AntlrDatatypeRuleToken lv_year_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:435:28: ( ( () ( (lv_day_1_0= ruleEInt ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= ruleEInt ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:436:1: ( () ( (lv_day_1_0= ruleEInt ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= ruleEInt ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:436:1: ( () ( (lv_day_1_0= ruleEInt ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= ruleEInt ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:436:2: () ( (lv_day_1_0= ruleEInt ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= ruleEInt ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:436:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:437:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:442:2: ( (lv_day_1_0= ruleEInt ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:443:1: (lv_day_1_0= ruleEInt )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:443:1: (lv_day_1_0= ruleEInt )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:444:3: lv_day_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getDateAccess().getDayEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDate854);
            lv_day_1_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDateRule());
            	        }
                   		set(
                   			current, 
                   			"day",
                    		lv_day_1_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:460:2: ( (lv_month_2_0= ruleMonth ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:461:1: (lv_month_2_0= ruleMonth )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:461:1: (lv_month_2_0= ruleMonth )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:462:3: lv_month_2_0= ruleMonth
            {
             
            	        newCompositeNode(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMonth_in_ruleDate875);
            lv_month_2_0=ruleMonth();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDateRule());
            	        }
                   		set(
                   			current, 
                   			"month",
                    		lv_month_2_0, 
                    		"Month");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:478:2: ( (lv_year_3_0= ruleEInt ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:479:1: (lv_year_3_0= ruleEInt )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:479:1: (lv_year_3_0= ruleEInt )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:480:3: lv_year_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getDateAccess().getYearEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDate896);
            lv_year_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDateRule());
            	        }
                   		set(
                   			current, 
                   			"year",
                    		lv_year_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleResAllocation"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:504:1: entryRuleResAllocation returns [EObject current=null] : iv_ruleResAllocation= ruleResAllocation EOF ;
    public final EObject entryRuleResAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResAllocation = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:505:2: (iv_ruleResAllocation= ruleResAllocation EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:506:2: iv_ruleResAllocation= ruleResAllocation EOF
            {
             newCompositeNode(grammarAccess.getResAllocationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_entryRuleResAllocation932);
            iv_ruleResAllocation=ruleResAllocation();

            state._fsp--;

             current =iv_ruleResAllocation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResAllocation942); 

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
    // $ANTLR end "entryRuleResAllocation"


    // $ANTLR start "ruleResAllocation"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:513:1: ruleResAllocation returns [EObject current=null] : ( () otherlv_1= 'reserve' ( (lv_ressourceType_2_0= ruleResourceType ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) ) ;
    public final EObject ruleResAllocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_ressourceType_2_0 = null;

        AntlrDatatypeRuleToken lv_duration_4_0 = null;

        Enumerator lv_periodicityType_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:516:28: ( ( () otherlv_1= 'reserve' ( (lv_ressourceType_2_0= ruleResourceType ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:517:1: ( () otherlv_1= 'reserve' ( (lv_ressourceType_2_0= ruleResourceType ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:517:1: ( () otherlv_1= 'reserve' ( (lv_ressourceType_2_0= ruleResourceType ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:517:2: () otherlv_1= 'reserve' ( (lv_ressourceType_2_0= ruleResourceType ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:517:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:518:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getResAllocationAccess().getRessourceAllocationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleResAllocation988); 

                	newLeafNode(otherlv_1, grammarAccess.getResAllocationAccess().getReserveKeyword_1());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:527:1: ( (lv_ressourceType_2_0= ruleResourceType ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:528:1: (lv_ressourceType_2_0= ruleResourceType )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:528:1: (lv_ressourceType_2_0= ruleResourceType )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:529:3: lv_ressourceType_2_0= ruleResourceType
            {
             
            	        newCompositeNode(grammarAccess.getResAllocationAccess().getRessourceTypeResourceTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleResourceType_in_ruleResAllocation1009);
            lv_ressourceType_2_0=ruleResourceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResAllocationRule());
            	        }
                   		set(
                   			current, 
                   			"ressourceType",
                    		lv_ressourceType_2_0, 
                    		"ResourceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleResAllocation1021); 

                	newLeafNode(otherlv_3, grammarAccess.getResAllocationAccess().getForKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:549:1: ( (lv_duration_4_0= ruleEInt ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:550:1: (lv_duration_4_0= ruleEInt )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:550:1: (lv_duration_4_0= ruleEInt )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:551:3: lv_duration_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getResAllocationAccess().getDurationEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleResAllocation1042);
            lv_duration_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResAllocationRule());
            	        }
                   		set(
                   			current, 
                   			"duration",
                    		lv_duration_4_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:567:2: ( (lv_periodicityType_5_0= rulePeriodicity ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:568:1: (lv_periodicityType_5_0= rulePeriodicity )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:568:1: (lv_periodicityType_5_0= rulePeriodicity )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:569:3: lv_periodicityType_5_0= rulePeriodicity
            {
             
            	        newCompositeNode(grammarAccess.getResAllocationAccess().getPeriodicityTypePeriodicityEnumRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_ruleResAllocation1063);
            lv_periodicityType_5_0=rulePeriodicity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResAllocationRule());
            	        }
                   		set(
                   			current, 
                   			"periodicityType",
                    		lv_periodicityType_5_0, 
                    		"Periodicity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResAllocation"


    // $ANTLR start "entryRulePredicate"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:593:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:594:2: (iv_rulePredicate= rulePredicate EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:595:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_entryRulePredicate1099);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicate1109); 

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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:602:1: rulePredicate returns [EObject current=null] : ( ( () (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) ) ) | this_CheckDoneActivity_3= ruleCheckDoneActivity | this_NoRain_4= ruleNoRain | this_Temperature_5= ruleTemperature | this_Precipitation_6= rulePrecipitation | this_Rayonnement_7= ruleRayonnement | this_Evapotranspiration_8= ruleEvapotranspiration | this_GrainState_9= ruleGrainState ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_date_2_0 = null;

        EObject this_CheckDoneActivity_3 = null;

        EObject this_NoRain_4 = null;

        EObject this_Temperature_5 = null;

        EObject this_Precipitation_6 = null;

        EObject this_Rayonnement_7 = null;

        EObject this_Evapotranspiration_8 = null;

        EObject this_GrainState_9 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:605:28: ( ( ( () (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) ) ) | this_CheckDoneActivity_3= ruleCheckDoneActivity | this_NoRain_4= ruleNoRain | this_Temperature_5= ruleTemperature | this_Precipitation_6= rulePrecipitation | this_Rayonnement_7= ruleRayonnement | this_Evapotranspiration_8= ruleEvapotranspiration | this_GrainState_9= ruleGrainState ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:606:1: ( ( () (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) ) ) | this_CheckDoneActivity_3= ruleCheckDoneActivity | this_NoRain_4= ruleNoRain | this_Temperature_5= ruleTemperature | this_Precipitation_6= rulePrecipitation | this_Rayonnement_7= ruleRayonnement | this_Evapotranspiration_8= ruleEvapotranspiration | this_GrainState_9= ruleGrainState )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:606:1: ( ( () (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) ) ) | this_CheckDoneActivity_3= ruleCheckDoneActivity | this_NoRain_4= ruleNoRain | this_Temperature_5= ruleTemperature | this_Precipitation_6= rulePrecipitation | this_Rayonnement_7= ruleRayonnement | this_Evapotranspiration_8= ruleEvapotranspiration | this_GrainState_9= ruleGrainState )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
            case 36:
            case 43:
                {
                alt8=2;
                }
                break;
            case 39:
                {
                alt8=3;
                }
                break;
            case 27:
            case 28:
                {
                alt8=4;
                }
                break;
            case 30:
            case 31:
                {
                alt8=5;
                }
                break;
            case 32:
            case 33:
                {
                alt8=6;
                }
                break;
            case 34:
            case 35:
                {
                alt8=7;
                }
                break;
            case 41:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:606:2: ( () (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:606:2: ( () (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:606:3: () (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:606:3: ()
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:607:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPredicateAccess().getPredicatAction_0_0(),
                                current);
                        

                    }

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:612:2: (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:612:4: otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) )
                    {
                    otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePredicate1157); 

                        	newLeafNode(otherlv_1, grammarAccess.getPredicateAccess().getBeforeKeyword_0_1_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:616:1: ( (lv_date_2_0= ruleDate ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:617:1: (lv_date_2_0= ruleDate )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:617:1: (lv_date_2_0= ruleDate )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:618:3: lv_date_2_0= ruleDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicateAccess().getDateDateParserRuleCall_0_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_rulePredicate1178);
                    lv_date_2_0=ruleDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPredicateRule());
                    	        }
                           		set(
                           			current, 
                           			"date",
                            		lv_date_2_0, 
                            		"Date");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:636:5: this_CheckDoneActivity_3= ruleCheckDoneActivity
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getCheckDoneActivityParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCheckDoneActivity_in_rulePredicate1208);
                    this_CheckDoneActivity_3=ruleCheckDoneActivity();

                    state._fsp--;

                     
                            current = this_CheckDoneActivity_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:646:5: this_NoRain_4= ruleNoRain
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getNoRainParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNoRain_in_rulePredicate1235);
                    this_NoRain_4=ruleNoRain();

                    state._fsp--;

                     
                            current = this_NoRain_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:656:5: this_Temperature_5= ruleTemperature
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getTemperatureParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemperature_in_rulePredicate1262);
                    this_Temperature_5=ruleTemperature();

                    state._fsp--;

                     
                            current = this_Temperature_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:666:5: this_Precipitation_6= rulePrecipitation
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getPrecipitationParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePrecipitation_in_rulePredicate1289);
                    this_Precipitation_6=rulePrecipitation();

                    state._fsp--;

                     
                            current = this_Precipitation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:676:5: this_Rayonnement_7= ruleRayonnement
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getRayonnementParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRayonnement_in_rulePredicate1316);
                    this_Rayonnement_7=ruleRayonnement();

                    state._fsp--;

                     
                            current = this_Rayonnement_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:686:5: this_Evapotranspiration_8= ruleEvapotranspiration
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getEvapotranspirationParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEvapotranspiration_in_rulePredicate1343);
                    this_Evapotranspiration_8=ruleEvapotranspiration();

                    state._fsp--;

                     
                            current = this_Evapotranspiration_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:696:5: this_GrainState_9= ruleGrainState
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getGrainStateParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGrainState_in_rulePredicate1370);
                    this_GrainState_9=ruleGrainState();

                    state._fsp--;

                     
                            current = this_GrainState_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleBinaryExppression"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:712:1: entryRuleBinaryExppression returns [EObject current=null] : iv_ruleBinaryExppression= ruleBinaryExppression EOF ;
    public final EObject entryRuleBinaryExppression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExppression = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:713:2: (iv_ruleBinaryExppression= ruleBinaryExppression EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:714:2: iv_ruleBinaryExppression= ruleBinaryExppression EOF
            {
             newCompositeNode(grammarAccess.getBinaryExppressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_entryRuleBinaryExppression1405);
            iv_ruleBinaryExppression=ruleBinaryExppression();

            state._fsp--;

             current =iv_ruleBinaryExppression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryExppression1415); 

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
    // $ANTLR end "entryRuleBinaryExppression"


    // $ANTLR start "ruleBinaryExppression"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:721:1: ruleBinaryExppression returns [EObject current=null] : ( () ( ( (lv_left_1_0= rulePredicate ) ) | (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' ) ) ( ( (lv_ope_5_0= ruleBinaryExppressionType ) ) ( (lv_right_6_0= ruleBinaryExppression ) ) )? ) ;
    public final EObject ruleBinaryExppression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_left_3_0 = null;

        Enumerator lv_ope_5_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:724:28: ( ( () ( ( (lv_left_1_0= rulePredicate ) ) | (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' ) ) ( ( (lv_ope_5_0= ruleBinaryExppressionType ) ) ( (lv_right_6_0= ruleBinaryExppression ) ) )? ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:725:1: ( () ( ( (lv_left_1_0= rulePredicate ) ) | (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' ) ) ( ( (lv_ope_5_0= ruleBinaryExppressionType ) ) ( (lv_right_6_0= ruleBinaryExppression ) ) )? )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:725:1: ( () ( ( (lv_left_1_0= rulePredicate ) ) | (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' ) ) ( ( (lv_ope_5_0= ruleBinaryExppressionType ) ) ( (lv_right_6_0= ruleBinaryExppression ) ) )? )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:725:2: () ( ( (lv_left_1_0= rulePredicate ) ) | (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' ) ) ( ( (lv_ope_5_0= ruleBinaryExppressionType ) ) ( (lv_right_6_0= ruleBinaryExppression ) ) )?
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:725:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:726:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBinaryExppressionAccess().getBinaryExpressionAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:731:2: ( ( (lv_left_1_0= rulePredicate ) ) | (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==24||(LA9_0>=27 && LA9_0<=28)||(LA9_0>=30 && LA9_0<=36)||LA9_0==39||LA9_0==41||LA9_0==43) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:731:3: ( (lv_left_1_0= rulePredicate ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:731:3: ( (lv_left_1_0= rulePredicate ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:732:1: (lv_left_1_0= rulePredicate )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:732:1: (lv_left_1_0= rulePredicate )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:733:3: lv_left_1_0= rulePredicate
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryExppressionAccess().getLeftPredicateParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePredicate_in_ruleBinaryExppression1471);
                    lv_left_1_0=rulePredicate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryExppressionRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_1_0, 
                            		"Predicate");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:750:6: (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:750:6: (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:750:8: otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBinaryExppression1490); 

                        	newLeafNode(otherlv_2, grammarAccess.getBinaryExppressionAccess().getLeftParenthesisKeyword_1_1_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:754:1: ( (lv_left_3_0= ruleBinaryExppression ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:755:1: (lv_left_3_0= ruleBinaryExppression )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:755:1: (lv_left_3_0= ruleBinaryExppression )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:756:3: lv_left_3_0= ruleBinaryExppression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryExppressionAccess().getLeftBinaryExppressionParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_ruleBinaryExppression1511);
                    lv_left_3_0=ruleBinaryExppression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryExppressionRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_3_0, 
                            		"BinaryExppression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBinaryExppression1523); 

                        	newLeafNode(otherlv_4, grammarAccess.getBinaryExppressionAccess().getRightParenthesisKeyword_1_1_2());
                        

                    }


                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:776:3: ( ( (lv_ope_5_0= ruleBinaryExppressionType ) ) ( (lv_right_6_0= ruleBinaryExppression ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=68 && LA10_0<=70)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:776:4: ( (lv_ope_5_0= ruleBinaryExppressionType ) ) ( (lv_right_6_0= ruleBinaryExppression ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:776:4: ( (lv_ope_5_0= ruleBinaryExppressionType ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:777:1: (lv_ope_5_0= ruleBinaryExppressionType )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:777:1: (lv_ope_5_0= ruleBinaryExppressionType )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:778:3: lv_ope_5_0= ruleBinaryExppressionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryExppressionAccess().getOpeBinaryExppressionTypeEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryExppressionType_in_ruleBinaryExppression1547);
                    lv_ope_5_0=ruleBinaryExppressionType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryExppressionRule());
                    	        }
                           		set(
                           			current, 
                           			"ope",
                            		lv_ope_5_0, 
                            		"BinaryExppressionType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:794:2: ( (lv_right_6_0= ruleBinaryExppression ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:795:1: (lv_right_6_0= ruleBinaryExppression )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:795:1: (lv_right_6_0= ruleBinaryExppression )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:796:3: lv_right_6_0= ruleBinaryExppression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryExppressionAccess().getRightBinaryExppressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_ruleBinaryExppression1568);
                    lv_right_6_0=ruleBinaryExppression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryExppressionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_6_0, 
                            		"BinaryExppression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryExppression"


    // $ANTLR start "entryRuleTemperature"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:820:1: entryRuleTemperature returns [EObject current=null] : iv_ruleTemperature= ruleTemperature EOF ;
    public final EObject entryRuleTemperature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemperature = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:821:2: (iv_ruleTemperature= ruleTemperature EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:822:2: iv_ruleTemperature= ruleTemperature EOF
            {
             newCompositeNode(grammarAccess.getTemperatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemperature_in_entryRuleTemperature1606);
            iv_ruleTemperature=ruleTemperature();

            state._fsp--;

             current =iv_ruleTemperature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemperature1616); 

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
    // $ANTLR end "entryRuleTemperature"


    // $ANTLR start "ruleTemperature"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:829:1: ruleTemperature returns [EObject current=null] : ( () (otherlv_1= 'tm' | otherlv_2= 'temperature' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) ) ;
    public final EObject ruleTemperature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_comparator_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:832:28: ( ( () (otherlv_1= 'tm' | otherlv_2= 'temperature' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:833:1: ( () (otherlv_1= 'tm' | otherlv_2= 'temperature' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:833:1: ( () (otherlv_1= 'tm' | otherlv_2= 'temperature' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:833:2: () (otherlv_1= 'tm' | otherlv_2= 'temperature' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:833:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:834:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTemperatureAccess().getTemperatureAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:839:2: (otherlv_1= 'tm' | otherlv_2= 'temperature' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:839:4: otherlv_1= 'tm'
                    {
                    otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTemperature1663); 

                        	newLeafNode(otherlv_1, grammarAccess.getTemperatureAccess().getTmKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:844:7: otherlv_2= 'temperature'
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTemperature1681); 

                        	newLeafNode(otherlv_2, grammarAccess.getTemperatureAccess().getTemperatureKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:848:2: ( (lv_comparator_3_0= ruleComparator ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:849:1: (lv_comparator_3_0= ruleComparator )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:849:1: (lv_comparator_3_0= ruleComparator )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:850:3: lv_comparator_3_0= ruleComparator
            {
             
            	        newCompositeNode(grammarAccess.getTemperatureAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_ruleTemperature1703);
            lv_comparator_3_0=ruleComparator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTemperatureRule());
            	        }
                   		set(
                   			current, 
                   			"comparator",
                    		lv_comparator_3_0, 
                    		"Comparator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTemperature1715); 

                	newLeafNode(otherlv_4, grammarAccess.getTemperatureAccess().getThanKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:870:1: ( (lv_value_5_0= ruleEFloat ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:871:1: (lv_value_5_0= ruleEFloat )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:871:1: (lv_value_5_0= ruleEFloat )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:872:3: lv_value_5_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getTemperatureAccess().getValueEFloatParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleTemperature1736);
            lv_value_5_0=ruleEFloat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTemperatureRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"EFloat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemperature"


    // $ANTLR start "entryRulePrecipitation"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:896:1: entryRulePrecipitation returns [EObject current=null] : iv_rulePrecipitation= rulePrecipitation EOF ;
    public final EObject entryRulePrecipitation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecipitation = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:897:2: (iv_rulePrecipitation= rulePrecipitation EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:898:2: iv_rulePrecipitation= rulePrecipitation EOF
            {
             newCompositeNode(grammarAccess.getPrecipitationRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrecipitation_in_entryRulePrecipitation1772);
            iv_rulePrecipitation=rulePrecipitation();

            state._fsp--;

             current =iv_rulePrecipitation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrecipitation1782); 

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
    // $ANTLR end "entryRulePrecipitation"


    // $ANTLR start "rulePrecipitation"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:905:1: rulePrecipitation returns [EObject current=null] : ( () (otherlv_1= 'rr' | otherlv_2= 'precipitation' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_height_5_0= ruleEFloat ) ) ) ;
    public final EObject rulePrecipitation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_comparator_3_0 = null;

        AntlrDatatypeRuleToken lv_height_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:908:28: ( ( () (otherlv_1= 'rr' | otherlv_2= 'precipitation' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_height_5_0= ruleEFloat ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:909:1: ( () (otherlv_1= 'rr' | otherlv_2= 'precipitation' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_height_5_0= ruleEFloat ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:909:1: ( () (otherlv_1= 'rr' | otherlv_2= 'precipitation' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_height_5_0= ruleEFloat ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:909:2: () (otherlv_1= 'rr' | otherlv_2= 'precipitation' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_height_5_0= ruleEFloat ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:909:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:910:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPrecipitationAccess().getPrecipitationAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:915:2: (otherlv_1= 'rr' | otherlv_2= 'precipitation' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:915:4: otherlv_1= 'rr'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePrecipitation1829); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrecipitationAccess().getRrKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:920:7: otherlv_2= 'precipitation'
                    {
                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulePrecipitation1847); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrecipitationAccess().getPrecipitationKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:924:2: ( (lv_comparator_3_0= ruleComparator ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:925:1: (lv_comparator_3_0= ruleComparator )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:925:1: (lv_comparator_3_0= ruleComparator )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:926:3: lv_comparator_3_0= ruleComparator
            {
             
            	        newCompositeNode(grammarAccess.getPrecipitationAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_rulePrecipitation1869);
            lv_comparator_3_0=ruleComparator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrecipitationRule());
            	        }
                   		set(
                   			current, 
                   			"comparator",
                    		lv_comparator_3_0, 
                    		"Comparator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_rulePrecipitation1881); 

                	newLeafNode(otherlv_4, grammarAccess.getPrecipitationAccess().getThanKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:946:1: ( (lv_height_5_0= ruleEFloat ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:947:1: (lv_height_5_0= ruleEFloat )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:947:1: (lv_height_5_0= ruleEFloat )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:948:3: lv_height_5_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getPrecipitationAccess().getHeightEFloatParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rulePrecipitation1902);
            lv_height_5_0=ruleEFloat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrecipitationRule());
            	        }
                   		set(
                   			current, 
                   			"height",
                    		lv_height_5_0, 
                    		"EFloat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrecipitation"


    // $ANTLR start "entryRuleRayonnement"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:972:1: entryRuleRayonnement returns [EObject current=null] : iv_ruleRayonnement= ruleRayonnement EOF ;
    public final EObject entryRuleRayonnement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRayonnement = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:973:2: (iv_ruleRayonnement= ruleRayonnement EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:974:2: iv_ruleRayonnement= ruleRayonnement EOF
            {
             newCompositeNode(grammarAccess.getRayonnementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRayonnement_in_entryRuleRayonnement1938);
            iv_ruleRayonnement=ruleRayonnement();

            state._fsp--;

             current =iv_ruleRayonnement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRayonnement1948); 

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
    // $ANTLR end "entryRuleRayonnement"


    // $ANTLR start "ruleRayonnement"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:981:1: ruleRayonnement returns [EObject current=null] : ( () (otherlv_1= 'par' | otherlv_2= 'rayonnement' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) ) ;
    public final EObject ruleRayonnement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_comparator_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:984:28: ( ( () (otherlv_1= 'par' | otherlv_2= 'rayonnement' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:985:1: ( () (otherlv_1= 'par' | otherlv_2= 'rayonnement' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:985:1: ( () (otherlv_1= 'par' | otherlv_2= 'rayonnement' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:985:2: () (otherlv_1= 'par' | otherlv_2= 'rayonnement' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:985:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:986:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRayonnementAccess().getRayonnementAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:991:2: (otherlv_1= 'par' | otherlv_2= 'rayonnement' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            else if ( (LA13_0==33) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:991:4: otherlv_1= 'par'
                    {
                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRayonnement1995); 

                        	newLeafNode(otherlv_1, grammarAccess.getRayonnementAccess().getParKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:996:7: otherlv_2= 'rayonnement'
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRayonnement2013); 

                        	newLeafNode(otherlv_2, grammarAccess.getRayonnementAccess().getRayonnementKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1000:2: ( (lv_comparator_3_0= ruleComparator ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1001:1: (lv_comparator_3_0= ruleComparator )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1001:1: (lv_comparator_3_0= ruleComparator )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1002:3: lv_comparator_3_0= ruleComparator
            {
             
            	        newCompositeNode(grammarAccess.getRayonnementAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_ruleRayonnement2035);
            lv_comparator_3_0=ruleComparator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRayonnementRule());
            	        }
                   		set(
                   			current, 
                   			"comparator",
                    		lv_comparator_3_0, 
                    		"Comparator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRayonnement2047); 

                	newLeafNode(otherlv_4, grammarAccess.getRayonnementAccess().getThanKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1022:1: ( (lv_value_5_0= ruleEFloat ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1023:1: (lv_value_5_0= ruleEFloat )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1023:1: (lv_value_5_0= ruleEFloat )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1024:3: lv_value_5_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getRayonnementAccess().getValueEFloatParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleRayonnement2068);
            lv_value_5_0=ruleEFloat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRayonnementRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"EFloat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRayonnement"


    // $ANTLR start "entryRuleEvapotranspiration"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1048:1: entryRuleEvapotranspiration returns [EObject current=null] : iv_ruleEvapotranspiration= ruleEvapotranspiration EOF ;
    public final EObject entryRuleEvapotranspiration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvapotranspiration = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1049:2: (iv_ruleEvapotranspiration= ruleEvapotranspiration EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1050:2: iv_ruleEvapotranspiration= ruleEvapotranspiration EOF
            {
             newCompositeNode(grammarAccess.getEvapotranspirationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvapotranspiration_in_entryRuleEvapotranspiration2104);
            iv_ruleEvapotranspiration=ruleEvapotranspiration();

            state._fsp--;

             current =iv_ruleEvapotranspiration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvapotranspiration2114); 

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
    // $ANTLR end "entryRuleEvapotranspiration"


    // $ANTLR start "ruleEvapotranspiration"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1057:1: ruleEvapotranspiration returns [EObject current=null] : ( () (otherlv_1= 'etp' | otherlv_2= 'evapotranspiration' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) ) ;
    public final EObject ruleEvapotranspiration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_comparator_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1060:28: ( ( () (otherlv_1= 'etp' | otherlv_2= 'evapotranspiration' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1061:1: ( () (otherlv_1= 'etp' | otherlv_2= 'evapotranspiration' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1061:1: ( () (otherlv_1= 'etp' | otherlv_2= 'evapotranspiration' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1061:2: () (otherlv_1= 'etp' | otherlv_2= 'evapotranspiration' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1061:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1062:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEvapotranspirationAccess().getEvapoTranspirationAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1067:2: (otherlv_1= 'etp' | otherlv_2= 'evapotranspiration' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            else if ( (LA14_0==35) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1067:4: otherlv_1= 'etp'
                    {
                    otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEvapotranspiration2161); 

                        	newLeafNode(otherlv_1, grammarAccess.getEvapotranspirationAccess().getEtpKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1072:7: otherlv_2= 'evapotranspiration'
                    {
                    otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEvapotranspiration2179); 

                        	newLeafNode(otherlv_2, grammarAccess.getEvapotranspirationAccess().getEvapotranspirationKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1076:2: ( (lv_comparator_3_0= ruleComparator ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1077:1: (lv_comparator_3_0= ruleComparator )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1077:1: (lv_comparator_3_0= ruleComparator )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1078:3: lv_comparator_3_0= ruleComparator
            {
             
            	        newCompositeNode(grammarAccess.getEvapotranspirationAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_ruleEvapotranspiration2201);
            lv_comparator_3_0=ruleComparator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEvapotranspirationRule());
            	        }
                   		set(
                   			current, 
                   			"comparator",
                    		lv_comparator_3_0, 
                    		"Comparator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEvapotranspiration2213); 

                	newLeafNode(otherlv_4, grammarAccess.getEvapotranspirationAccess().getThanKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1098:1: ( (lv_value_5_0= ruleEFloat ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1099:1: (lv_value_5_0= ruleEFloat )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1099:1: (lv_value_5_0= ruleEFloat )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1100:3: lv_value_5_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getEvapotranspirationAccess().getValueEFloatParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleEvapotranspiration2234);
            lv_value_5_0=ruleEFloat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEvapotranspirationRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"EFloat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvapotranspiration"


    // $ANTLR start "entryRuleCheckDoneActivity"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1124:1: entryRuleCheckDoneActivity returns [EObject current=null] : iv_ruleCheckDoneActivity= ruleCheckDoneActivity EOF ;
    public final EObject entryRuleCheckDoneActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckDoneActivity = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1125:2: (iv_ruleCheckDoneActivity= ruleCheckDoneActivity EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1126:2: iv_ruleCheckDoneActivity= ruleCheckDoneActivity EOF
            {
             newCompositeNode(grammarAccess.getCheckDoneActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCheckDoneActivity_in_entryRuleCheckDoneActivity2270);
            iv_ruleCheckDoneActivity=ruleCheckDoneActivity();

            state._fsp--;

             current =iv_ruleCheckDoneActivity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCheckDoneActivity2280); 

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
    // $ANTLR end "entryRuleCheckDoneActivity"


    // $ANTLR start "ruleCheckDoneActivity"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1133:1: ruleCheckDoneActivity returns [EObject current=null] : ( ( () otherlv_1= 'activity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'done' ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' ) ) | ( (lv_date_7_0= ruleDate ) ) ) ;
    public final EObject ruleCheckDoneActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_elapsedTime_4_0 = null;

        Enumerator lv_periodicityType_5_0 = null;

        EObject lv_date_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1136:28: ( ( ( () otherlv_1= 'activity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'done' ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' ) ) | ( (lv_date_7_0= ruleDate ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1137:1: ( ( () otherlv_1= 'activity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'done' ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' ) ) | ( (lv_date_7_0= ruleDate ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1137:1: ( ( () otherlv_1= 'activity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'done' ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' ) ) | ( (lv_date_7_0= ruleDate ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_INT||LA15_0==43) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1137:2: ( () otherlv_1= 'activity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'done' ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1137:2: ( () otherlv_1= 'activity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'done' ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1137:3: () otherlv_1= 'activity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'done' ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1137:3: ()
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1138:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getCheckDoneActivityAccess().getCheckDoneActivityAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleCheckDoneActivity2327); 

                        	newLeafNode(otherlv_1, grammarAccess.getCheckDoneActivityAccess().getActivityKeyword_0_1());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1147:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1148:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1148:1: (otherlv_2= RULE_ID )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1149:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCheckDoneActivityRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCheckDoneActivity2347); 

                    		newLeafNode(otherlv_2, grammarAccess.getCheckDoneActivityAccess().getActivityToValidatePeriodicActivityCrossReference_0_2_0()); 
                    	

                    }


                    }

                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleCheckDoneActivity2359); 

                        	newLeafNode(otherlv_3, grammarAccess.getCheckDoneActivityAccess().getDoneKeyword_0_3());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1164:1: ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1164:2: ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago'
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1164:2: ( (lv_elapsedTime_4_0= ruleEInt ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1165:1: (lv_elapsedTime_4_0= ruleEInt )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1165:1: (lv_elapsedTime_4_0= ruleEInt )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1166:3: lv_elapsedTime_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckDoneActivityAccess().getElapsedTimeEIntParserRuleCall_0_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCheckDoneActivity2381);
                    lv_elapsedTime_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckDoneActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"elapsedTime",
                            		lv_elapsedTime_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1182:2: ( (lv_periodicityType_5_0= rulePeriodicity ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1183:1: (lv_periodicityType_5_0= rulePeriodicity )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1183:1: (lv_periodicityType_5_0= rulePeriodicity )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1184:3: lv_periodicityType_5_0= rulePeriodicity
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckDoneActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_0_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_ruleCheckDoneActivity2402);
                    lv_periodicityType_5_0=rulePeriodicity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckDoneActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"periodicityType",
                            		lv_periodicityType_5_0, 
                            		"Periodicity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCheckDoneActivity2414); 

                        	newLeafNode(otherlv_6, grammarAccess.getCheckDoneActivityAccess().getAgoKeyword_0_4_2());
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1205:6: ( (lv_date_7_0= ruleDate ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1205:6: ( (lv_date_7_0= ruleDate ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1206:1: (lv_date_7_0= ruleDate )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1206:1: (lv_date_7_0= ruleDate )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1207:3: lv_date_7_0= ruleDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckDoneActivityAccess().getDateDateParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleCheckDoneActivity2443);
                    lv_date_7_0=ruleDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckDoneActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"date",
                            		lv_date_7_0, 
                            		"Date");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckDoneActivity"


    // $ANTLR start "entryRuleNoRain"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1231:1: entryRuleNoRain returns [EObject current=null] : iv_ruleNoRain= ruleNoRain EOF ;
    public final EObject entryRuleNoRain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRain = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1232:2: (iv_ruleNoRain= ruleNoRain EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1233:2: iv_ruleNoRain= ruleNoRain EOF
            {
             newCompositeNode(grammarAccess.getNoRainRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRain_in_entryRuleNoRain2479);
            iv_ruleNoRain=ruleNoRain();

            state._fsp--;

             current =iv_ruleNoRain; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoRain2489); 

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
    // $ANTLR end "entryRuleNoRain"


    // $ANTLR start "ruleNoRain"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1240:1: ruleNoRain returns [EObject current=null] : ( () otherlv_1= 'noRain' ( (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) ) | (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) ) ) ) ;
    public final EObject ruleNoRain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_elapsedTime_3_0 = null;

        Enumerator lv_periodicityType_4_0 = null;

        EObject lv_date_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1243:28: ( ( () otherlv_1= 'noRain' ( (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) ) | (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1244:1: ( () otherlv_1= 'noRain' ( (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) ) | (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1244:1: ( () otherlv_1= 'noRain' ( (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) ) | (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1244:2: () otherlv_1= 'noRain' ( (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) ) | (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1244:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1245:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNoRainAccess().getNoRainAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleNoRain2535); 

                	newLeafNode(otherlv_1, grammarAccess.getNoRainAccess().getNoRainKeyword_1());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1254:1: ( (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) ) | (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            else if ( (LA16_0==40) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1254:2: (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1254:2: (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1254:4: otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) )
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNoRain2549); 

                        	newLeafNode(otherlv_2, grammarAccess.getNoRainAccess().getForKeyword_2_0_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1258:1: ( (lv_elapsedTime_3_0= ruleEInt ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1259:1: (lv_elapsedTime_3_0= ruleEInt )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1259:1: (lv_elapsedTime_3_0= ruleEInt )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1260:3: lv_elapsedTime_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNoRainAccess().getElapsedTimeEIntParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNoRain2570);
                    lv_elapsedTime_3_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNoRainRule());
                    	        }
                           		set(
                           			current, 
                           			"elapsedTime",
                            		lv_elapsedTime_3_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1276:2: ( (lv_periodicityType_4_0= rulePeriodicity ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1277:1: (lv_periodicityType_4_0= rulePeriodicity )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1277:1: (lv_periodicityType_4_0= rulePeriodicity )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1278:3: lv_periodicityType_4_0= rulePeriodicity
                    {
                     
                    	        newCompositeNode(grammarAccess.getNoRainAccess().getPeriodicityTypePeriodicityEnumRuleCall_2_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_ruleNoRain2591);
                    lv_periodicityType_4_0=rulePeriodicity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNoRainRule());
                    	        }
                           		set(
                           			current, 
                           			"periodicityType",
                            		lv_periodicityType_4_0, 
                            		"Periodicity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1295:6: (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1295:6: (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1295:8: otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) )
                    {
                    otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleNoRain2611); 

                        	newLeafNode(otherlv_5, grammarAccess.getNoRainAccess().getSinceKeyword_2_1_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1299:1: ( (lv_date_6_0= ruleDate ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1300:1: (lv_date_6_0= ruleDate )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1300:1: (lv_date_6_0= ruleDate )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1301:3: lv_date_6_0= ruleDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getNoRainAccess().getDateDateParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleNoRain2632);
                    lv_date_6_0=ruleDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNoRainRule());
                    	        }
                           		set(
                           			current, 
                           			"date",
                            		lv_date_6_0, 
                            		"Date");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoRain"


    // $ANTLR start "entryRuleGrainState"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1325:1: entryRuleGrainState returns [EObject current=null] : iv_ruleGrainState= ruleGrainState EOF ;
    public final EObject entryRuleGrainState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrainState = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1326:2: (iv_ruleGrainState= ruleGrainState EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1327:2: iv_ruleGrainState= ruleGrainState EOF
            {
             newCompositeNode(grammarAccess.getGrainStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrainState_in_entryRuleGrainState2670);
            iv_ruleGrainState=ruleGrainState();

            state._fsp--;

             current =iv_ruleGrainState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrainState2680); 

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
    // $ANTLR end "entryRuleGrainState"


    // $ANTLR start "ruleGrainState"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1334:1: ruleGrainState returns [EObject current=null] : ( () otherlv_1= 'grain' otherlv_2= 'is' ( (lv_state_3_0= ruleGrainStateEnum ) ) ) ;
    public final EObject ruleGrainState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_state_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1337:28: ( ( () otherlv_1= 'grain' otherlv_2= 'is' ( (lv_state_3_0= ruleGrainStateEnum ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1338:1: ( () otherlv_1= 'grain' otherlv_2= 'is' ( (lv_state_3_0= ruleGrainStateEnum ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1338:1: ( () otherlv_1= 'grain' otherlv_2= 'is' ( (lv_state_3_0= ruleGrainStateEnum ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1338:2: () otherlv_1= 'grain' otherlv_2= 'is' ( (lv_state_3_0= ruleGrainStateEnum ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1338:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1339:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGrainStateAccess().getGrainStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleGrainState2726); 

                	newLeafNode(otherlv_1, grammarAccess.getGrainStateAccess().getGrainKeyword_1());
                
            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleGrainState2738); 

                	newLeafNode(otherlv_2, grammarAccess.getGrainStateAccess().getIsKeyword_2());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1352:1: ( (lv_state_3_0= ruleGrainStateEnum ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1353:1: (lv_state_3_0= ruleGrainStateEnum )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1353:1: (lv_state_3_0= ruleGrainStateEnum )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1354:3: lv_state_3_0= ruleGrainStateEnum
            {
             
            	        newCompositeNode(grammarAccess.getGrainStateAccess().getStateGrainStateEnumEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGrainStateEnum_in_ruleGrainState2759);
            lv_state_3_0=ruleGrainStateEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGrainStateRule());
            	        }
                   		set(
                   			current, 
                   			"state",
                    		lv_state_3_0, 
                    		"GrainStateEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrainState"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1378:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1379:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1380:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2796);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2807); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1387:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1390:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1391:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1391:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1391:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2847); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1399:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2873); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1414:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1415:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1416:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2919);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2930); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1423:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1426:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1427:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1427:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1427:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1427:2: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1428:2: kw= '-'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEInt2969); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2986); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1448:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1449:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1450:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat3032);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat3043); 

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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1457:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1460:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1461:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1461:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1461:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3083); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEFloat3101); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3116); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "rulePeriodicity"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1489:1: rulePeriodicity returns [Enumerator current=null] : ( (enumLiteral_0= 'months' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) | (enumLiteral_4= 'hours' ) ) ;
    public final Enumerator rulePeriodicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1491:28: ( ( (enumLiteral_0= 'months' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) | (enumLiteral_4= 'hours' ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1492:1: ( (enumLiteral_0= 'months' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) | (enumLiteral_4= 'hours' ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1492:1: ( (enumLiteral_0= 'months' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) | (enumLiteral_4= 'hours' ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt19=1;
                }
                break;
            case 46:
                {
                alt19=2;
                }
                break;
            case 47:
                {
                alt19=3;
                }
                break;
            case 48:
                {
                alt19=4;
                }
                break;
            case 49:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1492:2: (enumLiteral_0= 'months' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1492:2: (enumLiteral_0= 'months' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1492:4: enumLiteral_0= 'months'
                    {
                    enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_rulePeriodicity3175); 

                            current = grammarAccess.getPeriodicityAccess().getMonthsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPeriodicityAccess().getMonthsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1498:6: (enumLiteral_1= 'days' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1498:6: (enumLiteral_1= 'days' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1498:8: enumLiteral_1= 'days'
                    {
                    enumLiteral_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_rulePeriodicity3192); 

                            current = grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1504:6: (enumLiteral_2= 'weeks' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1504:6: (enumLiteral_2= 'weeks' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1504:8: enumLiteral_2= 'weeks'
                    {
                    enumLiteral_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_rulePeriodicity3209); 

                            current = grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1510:6: (enumLiteral_3= 'years' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1510:6: (enumLiteral_3= 'years' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1510:8: enumLiteral_3= 'years'
                    {
                    enumLiteral_3=(Token)match(input,48,FollowSets000.FOLLOW_48_in_rulePeriodicity3226); 

                            current = grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1516:6: (enumLiteral_4= 'hours' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1516:6: (enumLiteral_4= 'hours' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1516:8: enumLiteral_4= 'hours'
                    {
                    enumLiteral_4=(Token)match(input,49,FollowSets000.FOLLOW_49_in_rulePeriodicity3243); 

                            current = grammarAccess.getPeriodicityAccess().getHoursEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPeriodicityAccess().getHoursEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePeriodicity"


    // $ANTLR start "ruleMonth"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1526:1: ruleMonth returns [Enumerator current=null] : ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) ) ;
    public final Enumerator ruleMonth() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;

         enterRule(); 
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1528:28: ( ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1529:1: ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1529:1: ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) )
            int alt20=12;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt20=1;
                }
                break;
            case 51:
                {
                alt20=2;
                }
                break;
            case 52:
                {
                alt20=3;
                }
                break;
            case 53:
                {
                alt20=4;
                }
                break;
            case 54:
                {
                alt20=5;
                }
                break;
            case 55:
                {
                alt20=6;
                }
                break;
            case 56:
                {
                alt20=7;
                }
                break;
            case 57:
                {
                alt20=8;
                }
                break;
            case 58:
                {
                alt20=9;
                }
                break;
            case 59:
                {
                alt20=10;
                }
                break;
            case 60:
                {
                alt20=11;
                }
                break;
            case 61:
                {
                alt20=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1529:2: (enumLiteral_0= 'january' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1529:2: (enumLiteral_0= 'january' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1529:4: enumLiteral_0= 'january'
                    {
                    enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleMonth3288); 

                            current = grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1535:6: (enumLiteral_1= 'february' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1535:6: (enumLiteral_1= 'february' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1535:8: enumLiteral_1= 'february'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleMonth3305); 

                            current = grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1541:6: (enumLiteral_2= 'march' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1541:6: (enumLiteral_2= 'march' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1541:8: enumLiteral_2= 'march'
                    {
                    enumLiteral_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleMonth3322); 

                            current = grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1547:6: (enumLiteral_3= 'april' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1547:6: (enumLiteral_3= 'april' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1547:8: enumLiteral_3= 'april'
                    {
                    enumLiteral_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleMonth3339); 

                            current = grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1553:6: (enumLiteral_4= 'may' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1553:6: (enumLiteral_4= 'may' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1553:8: enumLiteral_4= 'may'
                    {
                    enumLiteral_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleMonth3356); 

                            current = grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1559:6: (enumLiteral_5= 'june' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1559:6: (enumLiteral_5= 'june' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1559:8: enumLiteral_5= 'june'
                    {
                    enumLiteral_5=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleMonth3373); 

                            current = grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1565:6: (enumLiteral_6= 'july' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1565:6: (enumLiteral_6= 'july' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1565:8: enumLiteral_6= 'july'
                    {
                    enumLiteral_6=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleMonth3390); 

                            current = grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1571:6: (enumLiteral_7= 'august' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1571:6: (enumLiteral_7= 'august' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1571:8: enumLiteral_7= 'august'
                    {
                    enumLiteral_7=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleMonth3407); 

                            current = grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1577:6: (enumLiteral_8= 'september' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1577:6: (enumLiteral_8= 'september' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1577:8: enumLiteral_8= 'september'
                    {
                    enumLiteral_8=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleMonth3424); 

                            current = grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1583:6: (enumLiteral_9= 'october' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1583:6: (enumLiteral_9= 'october' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1583:8: enumLiteral_9= 'october'
                    {
                    enumLiteral_9=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleMonth3441); 

                            current = grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1589:6: (enumLiteral_10= 'november' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1589:6: (enumLiteral_10= 'november' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1589:8: enumLiteral_10= 'november'
                    {
                    enumLiteral_10=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleMonth3458); 

                            current = grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1595:6: (enumLiteral_11= 'december' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1595:6: (enumLiteral_11= 'december' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1595:8: enumLiteral_11= 'december'
                    {
                    enumLiteral_11=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleMonth3475); 

                            current = grammarAccess.getMonthAccess().getDecemberEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getMonthAccess().getDecemberEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonth"


    // $ANTLR start "ruleComparator"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1605:1: ruleComparator returns [Enumerator current=null] : ( (enumLiteral_0= 'inferior' ) | (enumLiteral_1= 'inferiorOrEqual' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'different' ) | (enumLiteral_4= 'superior' ) | (enumLiteral_5= 'superiorOrEqual' ) ) ;
    public final Enumerator ruleComparator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1607:28: ( ( (enumLiteral_0= 'inferior' ) | (enumLiteral_1= 'inferiorOrEqual' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'different' ) | (enumLiteral_4= 'superior' ) | (enumLiteral_5= 'superiorOrEqual' ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1608:1: ( (enumLiteral_0= 'inferior' ) | (enumLiteral_1= 'inferiorOrEqual' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'different' ) | (enumLiteral_4= 'superior' ) | (enumLiteral_5= 'superiorOrEqual' ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1608:1: ( (enumLiteral_0= 'inferior' ) | (enumLiteral_1= 'inferiorOrEqual' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'different' ) | (enumLiteral_4= 'superior' ) | (enumLiteral_5= 'superiorOrEqual' ) )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt21=1;
                }
                break;
            case 63:
                {
                alt21=2;
                }
                break;
            case 64:
                {
                alt21=3;
                }
                break;
            case 65:
                {
                alt21=4;
                }
                break;
            case 66:
                {
                alt21=5;
                }
                break;
            case 67:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1608:2: (enumLiteral_0= 'inferior' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1608:2: (enumLiteral_0= 'inferior' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1608:4: enumLiteral_0= 'inferior'
                    {
                    enumLiteral_0=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleComparator3520); 

                            current = grammarAccess.getComparatorAccess().getInferiorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparatorAccess().getInferiorEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1614:6: (enumLiteral_1= 'inferiorOrEqual' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1614:6: (enumLiteral_1= 'inferiorOrEqual' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1614:8: enumLiteral_1= 'inferiorOrEqual'
                    {
                    enumLiteral_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleComparator3537); 

                            current = grammarAccess.getComparatorAccess().getInferiorOrEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparatorAccess().getInferiorOrEqualEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1620:6: (enumLiteral_2= 'equal' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1620:6: (enumLiteral_2= 'equal' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1620:8: enumLiteral_2= 'equal'
                    {
                    enumLiteral_2=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleComparator3554); 

                            current = grammarAccess.getComparatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparatorAccess().getEqualEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1626:6: (enumLiteral_3= 'different' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1626:6: (enumLiteral_3= 'different' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1626:8: enumLiteral_3= 'different'
                    {
                    enumLiteral_3=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleComparator3571); 

                            current = grammarAccess.getComparatorAccess().getDifferentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparatorAccess().getDifferentEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1632:6: (enumLiteral_4= 'superior' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1632:6: (enumLiteral_4= 'superior' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1632:8: enumLiteral_4= 'superior'
                    {
                    enumLiteral_4=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleComparator3588); 

                            current = grammarAccess.getComparatorAccess().getSuperiorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparatorAccess().getSuperiorEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1638:6: (enumLiteral_5= 'superiorOrEqual' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1638:6: (enumLiteral_5= 'superiorOrEqual' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1638:8: enumLiteral_5= 'superiorOrEqual'
                    {
                    enumLiteral_5=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleComparator3605); 

                            current = grammarAccess.getComparatorAccess().getSuperiorOrEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getComparatorAccess().getSuperiorOrEqualEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparator"


    // $ANTLR start "ruleBinaryExppressionType"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1648:1: ruleBinaryExppressionType returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) ) ;
    public final Enumerator ruleBinaryExppressionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1650:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1651:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1651:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt22=1;
                }
                break;
            case 69:
                {
                alt22=2;
                }
                break;
            case 70:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1651:2: (enumLiteral_0= 'AND' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1651:2: (enumLiteral_0= 'AND' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1651:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleBinaryExppressionType3650); 

                            current = grammarAccess.getBinaryExppressionTypeAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryExppressionTypeAccess().getANDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1657:6: (enumLiteral_1= 'OR' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1657:6: (enumLiteral_1= 'OR' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1657:8: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleBinaryExppressionType3667); 

                            current = grammarAccess.getBinaryExppressionTypeAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryExppressionTypeAccess().getOREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1663:6: (enumLiteral_2= 'XOR' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1663:6: (enumLiteral_2= 'XOR' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1663:8: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleBinaryExppressionType3684); 

                            current = grammarAccess.getBinaryExppressionTypeAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBinaryExppressionTypeAccess().getXOREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryExppressionType"


    // $ANTLR start "ruleGrainStateEnum"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1673:1: ruleGrainStateEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'MATURE' ) | (enumLiteral_1= 'IMMATURE' ) ) ;
    public final Enumerator ruleGrainStateEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1675:28: ( ( (enumLiteral_0= 'MATURE' ) | (enumLiteral_1= 'IMMATURE' ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1676:1: ( (enumLiteral_0= 'MATURE' ) | (enumLiteral_1= 'IMMATURE' ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1676:1: ( (enumLiteral_0= 'MATURE' ) | (enumLiteral_1= 'IMMATURE' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==71) ) {
                alt23=1;
            }
            else if ( (LA23_0==72) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1676:2: (enumLiteral_0= 'MATURE' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1676:2: (enumLiteral_0= 'MATURE' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1676:4: enumLiteral_0= 'MATURE'
                    {
                    enumLiteral_0=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleGrainStateEnum3729); 

                            current = grammarAccess.getGrainStateEnumAccess().getMATUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGrainStateEnumAccess().getMATUREEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1682:6: (enumLiteral_1= 'IMMATURE' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1682:6: (enumLiteral_1= 'IMMATURE' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1682:8: enumLiteral_1= 'IMMATURE'
                    {
                    enumLiteral_1=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleGrainStateEnum3746); 

                            current = grammarAccess.getGrainStateEnumAccess().getIMMATUREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGrainStateEnumAccess().getIMMATUREEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrainStateEnum"


    // $ANTLR start "ruleResourceType"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1692:1: ruleResourceType returns [Enumerator current=null] : ( (enumLiteral_0= 'Tractor' ) | (enumLiteral_1= 'Worker' ) ) ;
    public final Enumerator ruleResourceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1694:28: ( ( (enumLiteral_0= 'Tractor' ) | (enumLiteral_1= 'Worker' ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1695:1: ( (enumLiteral_0= 'Tractor' ) | (enumLiteral_1= 'Worker' ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1695:1: ( (enumLiteral_0= 'Tractor' ) | (enumLiteral_1= 'Worker' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==73) ) {
                alt24=1;
            }
            else if ( (LA24_0==74) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1695:2: (enumLiteral_0= 'Tractor' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1695:2: (enumLiteral_0= 'Tractor' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1695:4: enumLiteral_0= 'Tractor'
                    {
                    enumLiteral_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleResourceType3791); 

                            current = grammarAccess.getResourceTypeAccess().getTractorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getResourceTypeAccess().getTractorEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1701:6: (enumLiteral_1= 'Worker' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1701:6: (enumLiteral_1= 'Worker' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1701:8: enumLiteral_1= 'Worker'
                    {
                    enumLiteral_1=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleResourceType3808); 

                            current = grammarAccess.getResourceTypeAccess().getWorkerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getResourceTypeAccess().getWorkerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResourceType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtelierRef_in_ruleModel140 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleAtelierRef_in_entryRuleAtelierRef177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtelierRef187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleAtelierRef233 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAtelierRef254 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAtelierRef266 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rulePeriodicActivity_in_ruleAtelierRef287 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleAtelierRef300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicActivity_in_entryRulePeriodicActivity336 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePeriodicActivity346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rulePeriodicActivity392 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePeriodicActivity413 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePeriodicActivity425 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePeriodicActivity437 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_ruleDate_in_rulePeriodicActivity458 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePeriodicActivity470 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_ruleDate_in_rulePeriodicActivity491 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePeriodicActivity503 = new BitSet(new long[]{0x00000000001C2000L});
        public static final BitSet FOLLOW_18_in_rulePeriodicActivity516 = new BitSet(new long[]{0x0003E80000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePeriodicActivity537 = new BitSet(new long[]{0x0003E80000000040L});
        public static final BitSet FOLLOW_rulePeriodicity_in_rulePeriodicActivity559 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePeriodicActivity571 = new BitSet(new long[]{0x0000000000182000L});
        public static final BitSet FOLLOW_19_in_rulePeriodicActivity586 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePeriodicActivity598 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rulePeriodicActivity619 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_17_in_rulePeriodicActivity632 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rulePeriodicActivity653 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_13_in_rulePeriodicActivity667 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePeriodicActivity679 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_20_in_rulePeriodicActivity694 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_rulePeriodicActivity706 = new BitSet(new long[]{0x00000A9FDB000040L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_rulePeriodicActivity727 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePeriodicActivity739 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePeriodicActivity753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate789 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDate854 = new BitSet(new long[]{0x3FFC000000000000L});
        public static final BitSet FOLLOW_ruleMonth_in_ruleDate875 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDate896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_entryRuleResAllocation932 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResAllocation942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleResAllocation988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_ruleResourceType_in_ruleResAllocation1009 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleResAllocation1021 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleResAllocation1042 = new BitSet(new long[]{0x0003E80000000040L});
        public static final BitSet FOLLOW_rulePeriodicity_in_ruleResAllocation1063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate1099 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicate1109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rulePredicate1157 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_ruleDate_in_rulePredicate1178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckDoneActivity_in_rulePredicate1208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRain_in_rulePredicate1235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperature_in_rulePredicate1262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrecipitation_in_rulePredicate1289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRayonnement_in_rulePredicate1316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvapotranspiration_in_rulePredicate1343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrainState_in_rulePredicate1370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_entryRuleBinaryExppression1405 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryExppression1415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_ruleBinaryExppression1471 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000070L});
        public static final BitSet FOLLOW_25_in_ruleBinaryExppression1490 = new BitSet(new long[]{0x00000A9FDB000040L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_ruleBinaryExppression1511 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleBinaryExppression1523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000070L});
        public static final BitSet FOLLOW_ruleBinaryExppressionType_in_ruleBinaryExppression1547 = new BitSet(new long[]{0x00000A9FDB000040L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_ruleBinaryExppression1568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperature_in_entryRuleTemperature1606 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemperature1616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleTemperature1663 = new BitSet(new long[]{0xC000000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_28_in_ruleTemperature1681 = new BitSet(new long[]{0xC000000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_ruleComparator_in_ruleTemperature1703 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleTemperature1715 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleTemperature1736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrecipitation_in_entryRulePrecipitation1772 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrecipitation1782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rulePrecipitation1829 = new BitSet(new long[]{0xC000000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_31_in_rulePrecipitation1847 = new BitSet(new long[]{0xC000000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_ruleComparator_in_rulePrecipitation1869 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_rulePrecipitation1881 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEFloat_in_rulePrecipitation1902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRayonnement_in_entryRuleRayonnement1938 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRayonnement1948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleRayonnement1995 = new BitSet(new long[]{0xC000000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_33_in_ruleRayonnement2013 = new BitSet(new long[]{0xC000000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_ruleComparator_in_ruleRayonnement2035 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleRayonnement2047 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleRayonnement2068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvapotranspiration_in_entryRuleEvapotranspiration2104 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvapotranspiration2114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEvapotranspiration2161 = new BitSet(new long[]{0xC000000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_35_in_ruleEvapotranspiration2179 = new BitSet(new long[]{0xC000000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_ruleComparator_in_ruleEvapotranspiration2201 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleEvapotranspiration2213 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleEvapotranspiration2234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckDoneActivity_in_entryRuleCheckDoneActivity2270 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCheckDoneActivity2280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleCheckDoneActivity2327 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCheckDoneActivity2347 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleCheckDoneActivity2359 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCheckDoneActivity2381 = new BitSet(new long[]{0x0003E80000000040L});
        public static final BitSet FOLLOW_rulePeriodicity_in_ruleCheckDoneActivity2402 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleCheckDoneActivity2414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleCheckDoneActivity2443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRain_in_entryRuleNoRain2479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoRain2489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleNoRain2535 = new BitSet(new long[]{0x0000010000800000L});
        public static final BitSet FOLLOW_23_in_ruleNoRain2549 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNoRain2570 = new BitSet(new long[]{0x0003E80000000040L});
        public static final BitSet FOLLOW_rulePeriodicity_in_ruleNoRain2591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleNoRain2611 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_ruleDate_in_ruleNoRain2632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrainState_in_entryRuleGrainState2670 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrainState2680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleGrainState2726 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleGrainState2738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
        public static final BitSet FOLLOW_ruleGrainStateEnum_in_ruleGrainState2759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2796 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2919 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEInt2969 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat3032 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat3043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3083 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleEFloat3101 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rulePeriodicity3175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rulePeriodicity3192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rulePeriodicity3209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rulePeriodicity3226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rulePeriodicity3243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleMonth3288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleMonth3305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleMonth3322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleMonth3339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleMonth3356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleMonth3373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleMonth3390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleMonth3407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleMonth3424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleMonth3441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleMonth3458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleMonth3475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleComparator3520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleComparator3537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleComparator3554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleComparator3571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleComparator3588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleComparator3605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleBinaryExppressionType3650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleBinaryExppressionType3667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleBinaryExppressionType3684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleGrainStateEnum3729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleGrainStateEnum3746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleResourceType3791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleResourceType3808 = new BitSet(new long[]{0x0000000000000002L});
    }


}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'culture'", "'{'", "'}'", "'PeriodicActivity'", "'workshop'", "','", "'from'", "'to'", "'every'", "'allocate'", "'rules'", "':'", "'reserve'", "'for'", "'before'", "'('", "')'", "'tm'", "'temperature'", "'than'", "'rr'", "'precipitation'", "'par'", "'rayonnement'", "'etp'", "'evapotranspiration'", "'activity'", "'done'", "'ago'", "'noRain'", "'since'", "'grain'", "'is'", "'Elevage'", "'Culture'", "'Atelier'", "'-'", "'.'", "'months'", "'days'", "'weeks'", "'years'", "'hours'", "'january'", "'february'", "'march'", "'april'", "'may'", "'june'", "'july'", "'august'", "'september'", "'october'", "'november'", "'december'", "'inferior'", "'inferiorOrEqual'", "'equal'", "'different'", "'superior'", "'superiorOrEqual'", "'AND'", "'OR'", "'XOR'", "'MATURE'", "'IMMATURE'"
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:77:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'culture' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_activity_4_0= rulePeriodicActivity ) )* otherlv_5= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_activity_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:80:28: ( ( () otherlv_1= 'culture' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_activity_4_0= rulePeriodicActivity ) )* otherlv_5= '}' ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:81:1: ( () otherlv_1= 'culture' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_activity_4_0= rulePeriodicActivity ) )* otherlv_5= '}' )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:81:1: ( () otherlv_1= 'culture' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_activity_4_0= rulePeriodicActivity ) )* otherlv_5= '}' )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:81:2: () otherlv_1= 'culture' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_activity_4_0= rulePeriodicActivity ) )* otherlv_5= '}'
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:81:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getCultureKeyword_1());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:92:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModel152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel164); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:113:1: ( (lv_activity_4_0= rulePeriodicActivity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:114:1: (lv_activity_4_0= rulePeriodicActivity )
            	    {
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:114:1: (lv_activity_4_0= rulePeriodicActivity )
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:115:3: lv_activity_4_0= rulePeriodicActivity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getActivityPeriodicActivityParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePeriodicActivity_in_ruleModel185);
            	    lv_activity_4_0=rulePeriodicActivity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
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
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel198); 

                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRulePeriodicActivity"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:143:1: entryRulePeriodicActivity returns [EObject current=null] : iv_rulePeriodicActivity= rulePeriodicActivity EOF ;
    public final EObject entryRulePeriodicActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeriodicActivity = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:144:2: (iv_rulePeriodicActivity= rulePeriodicActivity EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:145:2: iv_rulePeriodicActivity= rulePeriodicActivity EOF
            {
             newCompositeNode(grammarAccess.getPeriodicActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicActivity_in_entryRulePeriodicActivity234);
            iv_rulePeriodicActivity=rulePeriodicActivity();

            state._fsp--;

             current =iv_rulePeriodicActivity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePeriodicActivity244); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:152:1: rulePeriodicActivity returns [EObject current=null] : ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'workshop' ( ( ruleEString ) ) otherlv_6= ',' )? otherlv_7= 'from' ( (lv_start_8_0= ruleDate ) ) otherlv_9= 'to' ( (lv_end_10_0= ruleDate ) ) otherlv_11= ',' (otherlv_12= 'every' ( (lv_frequency_13_0= ruleEInt ) )? ( (lv_periodicityType_14_0= rulePeriodicity ) ) otherlv_15= ',' )? (otherlv_16= 'allocate' otherlv_17= '{' ( (lv_resAllocation_18_0= ruleResAllocation ) ) (otherlv_19= ',' ( (lv_resAllocation_20_0= ruleResAllocation ) ) )* otherlv_21= '}' otherlv_22= ',' )? (otherlv_23= 'rules' otherlv_24= ':' ( (lv_rule_25_0= ruleBinaryExppression ) ) otherlv_26= ',' )? otherlv_27= '}' ) ;
    public final EObject rulePeriodicActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_start_8_0 = null;

        EObject lv_end_10_0 = null;

        AntlrDatatypeRuleToken lv_frequency_13_0 = null;

        Enumerator lv_periodicityType_14_0 = null;

        EObject lv_resAllocation_18_0 = null;

        EObject lv_resAllocation_20_0 = null;

        EObject lv_rule_25_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:155:28: ( ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'workshop' ( ( ruleEString ) ) otherlv_6= ',' )? otherlv_7= 'from' ( (lv_start_8_0= ruleDate ) ) otherlv_9= 'to' ( (lv_end_10_0= ruleDate ) ) otherlv_11= ',' (otherlv_12= 'every' ( (lv_frequency_13_0= ruleEInt ) )? ( (lv_periodicityType_14_0= rulePeriodicity ) ) otherlv_15= ',' )? (otherlv_16= 'allocate' otherlv_17= '{' ( (lv_resAllocation_18_0= ruleResAllocation ) ) (otherlv_19= ',' ( (lv_resAllocation_20_0= ruleResAllocation ) ) )* otherlv_21= '}' otherlv_22= ',' )? (otherlv_23= 'rules' otherlv_24= ':' ( (lv_rule_25_0= ruleBinaryExppression ) ) otherlv_26= ',' )? otherlv_27= '}' ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:156:1: ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'workshop' ( ( ruleEString ) ) otherlv_6= ',' )? otherlv_7= 'from' ( (lv_start_8_0= ruleDate ) ) otherlv_9= 'to' ( (lv_end_10_0= ruleDate ) ) otherlv_11= ',' (otherlv_12= 'every' ( (lv_frequency_13_0= ruleEInt ) )? ( (lv_periodicityType_14_0= rulePeriodicity ) ) otherlv_15= ',' )? (otherlv_16= 'allocate' otherlv_17= '{' ( (lv_resAllocation_18_0= ruleResAllocation ) ) (otherlv_19= ',' ( (lv_resAllocation_20_0= ruleResAllocation ) ) )* otherlv_21= '}' otherlv_22= ',' )? (otherlv_23= 'rules' otherlv_24= ':' ( (lv_rule_25_0= ruleBinaryExppression ) ) otherlv_26= ',' )? otherlv_27= '}' )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:156:1: ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'workshop' ( ( ruleEString ) ) otherlv_6= ',' )? otherlv_7= 'from' ( (lv_start_8_0= ruleDate ) ) otherlv_9= 'to' ( (lv_end_10_0= ruleDate ) ) otherlv_11= ',' (otherlv_12= 'every' ( (lv_frequency_13_0= ruleEInt ) )? ( (lv_periodicityType_14_0= rulePeriodicity ) ) otherlv_15= ',' )? (otherlv_16= 'allocate' otherlv_17= '{' ( (lv_resAllocation_18_0= ruleResAllocation ) ) (otherlv_19= ',' ( (lv_resAllocation_20_0= ruleResAllocation ) ) )* otherlv_21= '}' otherlv_22= ',' )? (otherlv_23= 'rules' otherlv_24= ':' ( (lv_rule_25_0= ruleBinaryExppression ) ) otherlv_26= ',' )? otherlv_27= '}' )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:156:2: () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'workshop' ( ( ruleEString ) ) otherlv_6= ',' )? otherlv_7= 'from' ( (lv_start_8_0= ruleDate ) ) otherlv_9= 'to' ( (lv_end_10_0= ruleDate ) ) otherlv_11= ',' (otherlv_12= 'every' ( (lv_frequency_13_0= ruleEInt ) )? ( (lv_periodicityType_14_0= rulePeriodicity ) ) otherlv_15= ',' )? (otherlv_16= 'allocate' otherlv_17= '{' ( (lv_resAllocation_18_0= ruleResAllocation ) ) (otherlv_19= ',' ( (lv_resAllocation_20_0= ruleResAllocation ) ) )* otherlv_21= '}' otherlv_22= ',' )? (otherlv_23= 'rules' otherlv_24= ':' ( (lv_rule_25_0= ruleBinaryExppression ) ) otherlv_26= ',' )? otherlv_27= '}'
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:156:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:157:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPeriodicActivityAccess().getPeriodicActivityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePeriodicActivity290); 

                	newLeafNode(otherlv_1, grammarAccess.getPeriodicActivityAccess().getPeriodicActivityKeyword_1());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:166:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:167:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:167:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:168:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePeriodicActivity311);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePeriodicActivity323); 

                	newLeafNode(otherlv_3, grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:188:1: (otherlv_4= 'workshop' ( ( ruleEString ) ) otherlv_6= ',' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:188:3: otherlv_4= 'workshop' ( ( ruleEString ) ) otherlv_6= ','
                    {
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePeriodicActivity336); 

                        	newLeafNode(otherlv_4, grammarAccess.getPeriodicActivityAccess().getWorkshopKeyword_4_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:192:1: ( ( ruleEString ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:193:1: ( ruleEString )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:193:1: ( ruleEString )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:194:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPeriodicActivityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getAtelierAtelierCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePeriodicActivity359);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePeriodicActivity371); 

                        	newLeafNode(otherlv_6, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePeriodicActivity385); 

                	newLeafNode(otherlv_7, grammarAccess.getPeriodicActivityAccess().getFromKeyword_5());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:215:1: ( (lv_start_8_0= ruleDate ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:216:1: (lv_start_8_0= ruleDate )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:216:1: (lv_start_8_0= ruleDate )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:217:3: lv_start_8_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getStartDateParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rulePeriodicActivity406);
            lv_start_8_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_8_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePeriodicActivity418); 

                	newLeafNode(otherlv_9, grammarAccess.getPeriodicActivityAccess().getToKeyword_7());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:237:1: ( (lv_end_10_0= ruleDate ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:238:1: (lv_end_10_0= ruleDate )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:238:1: (lv_end_10_0= ruleDate )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:239:3: lv_end_10_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getEndDateParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rulePeriodicActivity439);
            lv_end_10_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_10_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePeriodicActivity451); 

                	newLeafNode(otherlv_11, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_9());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:259:1: (otherlv_12= 'every' ( (lv_frequency_13_0= ruleEInt ) )? ( (lv_periodicityType_14_0= rulePeriodicity ) ) otherlv_15= ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:259:3: otherlv_12= 'every' ( (lv_frequency_13_0= ruleEInt ) )? ( (lv_periodicityType_14_0= rulePeriodicity ) ) otherlv_15= ','
                    {
                    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePeriodicActivity464); 

                        	newLeafNode(otherlv_12, grammarAccess.getPeriodicActivityAccess().getEveryKeyword_10_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:263:1: ( (lv_frequency_13_0= ruleEInt ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT||LA3_0==47) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:264:1: (lv_frequency_13_0= ruleEInt )
                            {
                            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:264:1: (lv_frequency_13_0= ruleEInt )
                            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:265:3: lv_frequency_13_0= ruleEInt
                            {
                             
                            	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getFrequencyEIntParserRuleCall_10_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePeriodicActivity485);
                            lv_frequency_13_0=ruleEInt();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"frequency",
                                    		lv_frequency_13_0, 
                                    		"EInt");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:281:3: ( (lv_periodicityType_14_0= rulePeriodicity ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:282:1: (lv_periodicityType_14_0= rulePeriodicity )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:282:1: (lv_periodicityType_14_0= rulePeriodicity )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:283:3: lv_periodicityType_14_0= rulePeriodicity
                    {
                     
                    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_rulePeriodicActivity507);
                    lv_periodicityType_14_0=rulePeriodicity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"periodicityType",
                            		lv_periodicityType_14_0, 
                            		"Periodicity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePeriodicActivity519); 

                        	newLeafNode(otherlv_15, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_10_3());
                        

                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:303:3: (otherlv_16= 'allocate' otherlv_17= '{' ( (lv_resAllocation_18_0= ruleResAllocation ) ) (otherlv_19= ',' ( (lv_resAllocation_20_0= ruleResAllocation ) ) )* otherlv_21= '}' otherlv_22= ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:303:5: otherlv_16= 'allocate' otherlv_17= '{' ( (lv_resAllocation_18_0= ruleResAllocation ) ) (otherlv_19= ',' ( (lv_resAllocation_20_0= ruleResAllocation ) ) )* otherlv_21= '}' otherlv_22= ','
                    {
                    otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePeriodicActivity534); 

                        	newLeafNode(otherlv_16, grammarAccess.getPeriodicActivityAccess().getAllocateKeyword_11_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePeriodicActivity546); 

                        	newLeafNode(otherlv_17, grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:311:1: ( (lv_resAllocation_18_0= ruleResAllocation ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:312:1: (lv_resAllocation_18_0= ruleResAllocation )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:312:1: (lv_resAllocation_18_0= ruleResAllocation )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:313:3: lv_resAllocation_18_0= ruleResAllocation
                    {
                     
                    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rulePeriodicActivity567);
                    lv_resAllocation_18_0=ruleResAllocation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"resAllocation",
                            		lv_resAllocation_18_0, 
                            		"ResAllocation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:329:2: (otherlv_19= ',' ( (lv_resAllocation_20_0= ruleResAllocation ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:329:4: otherlv_19= ',' ( (lv_resAllocation_20_0= ruleResAllocation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePeriodicActivity580); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:333:1: ( (lv_resAllocation_20_0= ruleResAllocation ) )
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:334:1: (lv_resAllocation_20_0= ruleResAllocation )
                    	    {
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:334:1: (lv_resAllocation_20_0= ruleResAllocation )
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:335:3: lv_resAllocation_20_0= ruleResAllocation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rulePeriodicActivity601);
                    	    lv_resAllocation_20_0=ruleResAllocation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resAllocation",
                    	            		lv_resAllocation_20_0, 
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

                    otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePeriodicActivity615); 

                        	newLeafNode(otherlv_21, grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_11_4());
                        
                    otherlv_22=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePeriodicActivity627); 

                        	newLeafNode(otherlv_22, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11_5());
                        

                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:359:3: (otherlv_23= 'rules' otherlv_24= ':' ( (lv_rule_25_0= ruleBinaryExppression ) ) otherlv_26= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:359:5: otherlv_23= 'rules' otherlv_24= ':' ( (lv_rule_25_0= ruleBinaryExppression ) ) otherlv_26= ','
                    {
                    otherlv_23=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePeriodicActivity642); 

                        	newLeafNode(otherlv_23, grammarAccess.getPeriodicActivityAccess().getRulesKeyword_12_0());
                        
                    otherlv_24=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePeriodicActivity654); 

                        	newLeafNode(otherlv_24, grammarAccess.getPeriodicActivityAccess().getColonKeyword_12_1());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:367:1: ( (lv_rule_25_0= ruleBinaryExppression ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:368:1: (lv_rule_25_0= ruleBinaryExppression )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:368:1: (lv_rule_25_0= ruleBinaryExppression )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:369:3: lv_rule_25_0= ruleBinaryExppression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getRuleBinaryExppressionParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_rulePeriodicActivity675);
                    lv_rule_25_0=ruleBinaryExppression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"rule",
                            		lv_rule_25_0, 
                            		"BinaryExppression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_26=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePeriodicActivity687); 

                        	newLeafNode(otherlv_26, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_12_3());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePeriodicActivity701); 

                	newLeafNode(otherlv_27, grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:401:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:402:2: (iv_ruleDate= ruleDate EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:403:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate737);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate747); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:410:1: ruleDate returns [EObject current=null] : ( () ( (lv_day_1_0= ruleEInt ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= ruleEInt ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_day_1_0 = null;

        Enumerator lv_month_2_0 = null;

        AntlrDatatypeRuleToken lv_year_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:413:28: ( ( () ( (lv_day_1_0= ruleEInt ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= ruleEInt ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:414:1: ( () ( (lv_day_1_0= ruleEInt ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= ruleEInt ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:414:1: ( () ( (lv_day_1_0= ruleEInt ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= ruleEInt ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:414:2: () ( (lv_day_1_0= ruleEInt ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= ruleEInt ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:414:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:415:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:420:2: ( (lv_day_1_0= ruleEInt ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:421:1: (lv_day_1_0= ruleEInt )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:421:1: (lv_day_1_0= ruleEInt )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:422:3: lv_day_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getDateAccess().getDayEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDate802);
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

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:438:2: ( (lv_month_2_0= ruleMonth ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:439:1: (lv_month_2_0= ruleMonth )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:439:1: (lv_month_2_0= ruleMonth )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:440:3: lv_month_2_0= ruleMonth
            {
             
            	        newCompositeNode(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMonth_in_ruleDate823);
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

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:456:2: ( (lv_year_3_0= ruleEInt ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:457:1: (lv_year_3_0= ruleEInt )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:457:1: (lv_year_3_0= ruleEInt )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:458:3: lv_year_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getDateAccess().getYearEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDate844);
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:482:1: entryRuleResAllocation returns [EObject current=null] : iv_ruleResAllocation= ruleResAllocation EOF ;
    public final EObject entryRuleResAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResAllocation = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:483:2: (iv_ruleResAllocation= ruleResAllocation EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:484:2: iv_ruleResAllocation= ruleResAllocation EOF
            {
             newCompositeNode(grammarAccess.getResAllocationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_entryRuleResAllocation880);
            iv_ruleResAllocation=ruleResAllocation();

            state._fsp--;

             current =iv_ruleResAllocation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResAllocation890); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:491:1: ruleResAllocation returns [EObject current=null] : ( () otherlv_1= 'reserve' ( ( ruleEString ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) ) ;
    public final EObject ruleResAllocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_duration_4_0 = null;

        Enumerator lv_periodicityType_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:494:28: ( ( () otherlv_1= 'reserve' ( ( ruleEString ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:495:1: ( () otherlv_1= 'reserve' ( ( ruleEString ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:495:1: ( () otherlv_1= 'reserve' ( ( ruleEString ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:495:2: () otherlv_1= 'reserve' ( ( ruleEString ) ) otherlv_3= 'for' ( (lv_duration_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:495:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:496:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getResAllocationAccess().getRessourceAllocationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleResAllocation936); 

                	newLeafNode(otherlv_1, grammarAccess.getResAllocationAccess().getReserveKeyword_1());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:505:1: ( ( ruleEString ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:506:1: ( ruleEString )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:506:1: ( ruleEString )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:507:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResAllocationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getResAllocationAccess().getRessourceRessourceCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleResAllocation959);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleResAllocation971); 

                	newLeafNode(otherlv_3, grammarAccess.getResAllocationAccess().getForKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:524:1: ( (lv_duration_4_0= ruleEInt ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:525:1: (lv_duration_4_0= ruleEInt )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:525:1: (lv_duration_4_0= ruleEInt )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:526:3: lv_duration_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getResAllocationAccess().getDurationEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleResAllocation992);
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

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:542:2: ( (lv_periodicityType_5_0= rulePeriodicity ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:543:1: (lv_periodicityType_5_0= rulePeriodicity )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:543:1: (lv_periodicityType_5_0= rulePeriodicity )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:544:3: lv_periodicityType_5_0= rulePeriodicity
            {
             
            	        newCompositeNode(grammarAccess.getResAllocationAccess().getPeriodicityTypePeriodicityEnumRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_ruleResAllocation1013);
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:568:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:569:2: (iv_rulePredicate= rulePredicate EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:570:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_entryRulePredicate1049);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicate1059); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:577:1: rulePredicate returns [EObject current=null] : ( ( () (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) ) ) | this_CheckDoneActivity_3= ruleCheckDoneActivity | this_NoRain_4= ruleNoRain | this_Temperature_5= ruleTemperature | this_Precipitation_6= rulePrecipitation | this_Rayonnement_7= ruleRayonnement | this_Evapotranspiration_8= ruleEvapotranspiration | this_GrainState_9= ruleGrainState ) ;
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
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:580:28: ( ( ( () (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) ) ) | this_CheckDoneActivity_3= ruleCheckDoneActivity | this_NoRain_4= ruleNoRain | this_Temperature_5= ruleTemperature | this_Precipitation_6= rulePrecipitation | this_Rayonnement_7= ruleRayonnement | this_Evapotranspiration_8= ruleEvapotranspiration | this_GrainState_9= ruleGrainState ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:581:1: ( ( () (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) ) ) | this_CheckDoneActivity_3= ruleCheckDoneActivity | this_NoRain_4= ruleNoRain | this_Temperature_5= ruleTemperature | this_Precipitation_6= rulePrecipitation | this_Rayonnement_7= ruleRayonnement | this_Evapotranspiration_8= ruleEvapotranspiration | this_GrainState_9= ruleGrainState )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:581:1: ( ( () (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) ) ) | this_CheckDoneActivity_3= ruleCheckDoneActivity | this_NoRain_4= ruleNoRain | this_Temperature_5= ruleTemperature | this_Precipitation_6= rulePrecipitation | this_Rayonnement_7= ruleRayonnement | this_Evapotranspiration_8= ruleEvapotranspiration | this_GrainState_9= ruleGrainState )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
            case 37:
            case 47:
                {
                alt8=2;
                }
                break;
            case 40:
                {
                alt8=3;
                }
                break;
            case 28:
            case 29:
                {
                alt8=4;
                }
                break;
            case 31:
            case 32:
                {
                alt8=5;
                }
                break;
            case 33:
            case 34:
                {
                alt8=6;
                }
                break;
            case 35:
            case 36:
                {
                alt8=7;
                }
                break;
            case 42:
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
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:581:2: ( () (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:581:2: ( () (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:581:3: () (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:581:3: ()
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:582:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPredicateAccess().getPredicatAction_0_0(),
                                current);
                        

                    }

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:587:2: (otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:587:4: otherlv_1= 'before' ( (lv_date_2_0= ruleDate ) )
                    {
                    otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulePredicate1107); 

                        	newLeafNode(otherlv_1, grammarAccess.getPredicateAccess().getBeforeKeyword_0_1_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:591:1: ( (lv_date_2_0= ruleDate ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:592:1: (lv_date_2_0= ruleDate )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:592:1: (lv_date_2_0= ruleDate )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:593:3: lv_date_2_0= ruleDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicateAccess().getDateDateParserRuleCall_0_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_rulePredicate1128);
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
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:611:5: this_CheckDoneActivity_3= ruleCheckDoneActivity
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getCheckDoneActivityParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCheckDoneActivity_in_rulePredicate1158);
                    this_CheckDoneActivity_3=ruleCheckDoneActivity();

                    state._fsp--;

                     
                            current = this_CheckDoneActivity_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:621:5: this_NoRain_4= ruleNoRain
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getNoRainParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNoRain_in_rulePredicate1185);
                    this_NoRain_4=ruleNoRain();

                    state._fsp--;

                     
                            current = this_NoRain_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:631:5: this_Temperature_5= ruleTemperature
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getTemperatureParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemperature_in_rulePredicate1212);
                    this_Temperature_5=ruleTemperature();

                    state._fsp--;

                     
                            current = this_Temperature_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:641:5: this_Precipitation_6= rulePrecipitation
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getPrecipitationParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePrecipitation_in_rulePredicate1239);
                    this_Precipitation_6=rulePrecipitation();

                    state._fsp--;

                     
                            current = this_Precipitation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:651:5: this_Rayonnement_7= ruleRayonnement
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getRayonnementParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRayonnement_in_rulePredicate1266);
                    this_Rayonnement_7=ruleRayonnement();

                    state._fsp--;

                     
                            current = this_Rayonnement_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:661:5: this_Evapotranspiration_8= ruleEvapotranspiration
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getEvapotranspirationParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEvapotranspiration_in_rulePredicate1293);
                    this_Evapotranspiration_8=ruleEvapotranspiration();

                    state._fsp--;

                     
                            current = this_Evapotranspiration_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:671:5: this_GrainState_9= ruleGrainState
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateAccess().getGrainStateParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGrainState_in_rulePredicate1320);
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:687:1: entryRuleBinaryExppression returns [EObject current=null] : iv_ruleBinaryExppression= ruleBinaryExppression EOF ;
    public final EObject entryRuleBinaryExppression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExppression = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:688:2: (iv_ruleBinaryExppression= ruleBinaryExppression EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:689:2: iv_ruleBinaryExppression= ruleBinaryExppression EOF
            {
             newCompositeNode(grammarAccess.getBinaryExppressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_entryRuleBinaryExppression1355);
            iv_ruleBinaryExppression=ruleBinaryExppression();

            state._fsp--;

             current =iv_ruleBinaryExppression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryExppression1365); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:696:1: ruleBinaryExppression returns [EObject current=null] : ( () ( ( (lv_left_1_0= rulePredicate ) ) | (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' ) ) ( ( (lv_ope_5_0= ruleBinaryExppressionType ) ) ( (lv_right_6_0= ruleBinaryExppression ) ) )? ) ;
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
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:699:28: ( ( () ( ( (lv_left_1_0= rulePredicate ) ) | (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' ) ) ( ( (lv_ope_5_0= ruleBinaryExppressionType ) ) ( (lv_right_6_0= ruleBinaryExppression ) ) )? ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:700:1: ( () ( ( (lv_left_1_0= rulePredicate ) ) | (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' ) ) ( ( (lv_ope_5_0= ruleBinaryExppressionType ) ) ( (lv_right_6_0= ruleBinaryExppression ) ) )? )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:700:1: ( () ( ( (lv_left_1_0= rulePredicate ) ) | (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' ) ) ( ( (lv_ope_5_0= ruleBinaryExppressionType ) ) ( (lv_right_6_0= ruleBinaryExppression ) ) )? )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:700:2: () ( ( (lv_left_1_0= rulePredicate ) ) | (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' ) ) ( ( (lv_ope_5_0= ruleBinaryExppressionType ) ) ( (lv_right_6_0= ruleBinaryExppression ) ) )?
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:700:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:701:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBinaryExppressionAccess().getBinaryExpressionAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:706:2: ( ( (lv_left_1_0= rulePredicate ) ) | (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==25||(LA9_0>=28 && LA9_0<=29)||(LA9_0>=31 && LA9_0<=37)||LA9_0==40||LA9_0==42||LA9_0==47) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:706:3: ( (lv_left_1_0= rulePredicate ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:706:3: ( (lv_left_1_0= rulePredicate ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:707:1: (lv_left_1_0= rulePredicate )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:707:1: (lv_left_1_0= rulePredicate )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:708:3: lv_left_1_0= rulePredicate
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryExppressionAccess().getLeftPredicateParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePredicate_in_ruleBinaryExppression1421);
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
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:725:6: (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:725:6: (otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:725:8: otherlv_2= '(' ( (lv_left_3_0= ruleBinaryExppression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBinaryExppression1440); 

                        	newLeafNode(otherlv_2, grammarAccess.getBinaryExppressionAccess().getLeftParenthesisKeyword_1_1_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:729:1: ( (lv_left_3_0= ruleBinaryExppression ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:730:1: (lv_left_3_0= ruleBinaryExppression )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:730:1: (lv_left_3_0= ruleBinaryExppression )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:731:3: lv_left_3_0= ruleBinaryExppression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryExppressionAccess().getLeftBinaryExppressionParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_ruleBinaryExppression1461);
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

                    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBinaryExppression1473); 

                        	newLeafNode(otherlv_4, grammarAccess.getBinaryExppressionAccess().getRightParenthesisKeyword_1_1_2());
                        

                    }


                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:751:3: ( ( (lv_ope_5_0= ruleBinaryExppressionType ) ) ( (lv_right_6_0= ruleBinaryExppression ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=72 && LA10_0<=74)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:751:4: ( (lv_ope_5_0= ruleBinaryExppressionType ) ) ( (lv_right_6_0= ruleBinaryExppression ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:751:4: ( (lv_ope_5_0= ruleBinaryExppressionType ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:752:1: (lv_ope_5_0= ruleBinaryExppressionType )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:752:1: (lv_ope_5_0= ruleBinaryExppressionType )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:753:3: lv_ope_5_0= ruleBinaryExppressionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryExppressionAccess().getOpeBinaryExppressionTypeEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryExppressionType_in_ruleBinaryExppression1497);
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

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:769:2: ( (lv_right_6_0= ruleBinaryExppression ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:770:1: (lv_right_6_0= ruleBinaryExppression )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:770:1: (lv_right_6_0= ruleBinaryExppression )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:771:3: lv_right_6_0= ruleBinaryExppression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryExppressionAccess().getRightBinaryExppressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryExppression_in_ruleBinaryExppression1518);
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:795:1: entryRuleTemperature returns [EObject current=null] : iv_ruleTemperature= ruleTemperature EOF ;
    public final EObject entryRuleTemperature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemperature = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:796:2: (iv_ruleTemperature= ruleTemperature EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:797:2: iv_ruleTemperature= ruleTemperature EOF
            {
             newCompositeNode(grammarAccess.getTemperatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemperature_in_entryRuleTemperature1556);
            iv_ruleTemperature=ruleTemperature();

            state._fsp--;

             current =iv_ruleTemperature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemperature1566); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:804:1: ruleTemperature returns [EObject current=null] : ( () (otherlv_1= 'tm' | otherlv_2= 'temperature' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) ) ;
    public final EObject ruleTemperature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_comparator_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:807:28: ( ( () (otherlv_1= 'tm' | otherlv_2= 'temperature' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:808:1: ( () (otherlv_1= 'tm' | otherlv_2= 'temperature' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:808:1: ( () (otherlv_1= 'tm' | otherlv_2= 'temperature' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:808:2: () (otherlv_1= 'tm' | otherlv_2= 'temperature' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:808:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:809:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTemperatureAccess().getTemperatureAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:814:2: (otherlv_1= 'tm' | otherlv_2= 'temperature' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:814:4: otherlv_1= 'tm'
                    {
                    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTemperature1613); 

                        	newLeafNode(otherlv_1, grammarAccess.getTemperatureAccess().getTmKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:819:7: otherlv_2= 'temperature'
                    {
                    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTemperature1631); 

                        	newLeafNode(otherlv_2, grammarAccess.getTemperatureAccess().getTemperatureKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:823:2: ( (lv_comparator_3_0= ruleComparator ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:824:1: (lv_comparator_3_0= ruleComparator )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:824:1: (lv_comparator_3_0= ruleComparator )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:825:3: lv_comparator_3_0= ruleComparator
            {
             
            	        newCompositeNode(grammarAccess.getTemperatureAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_ruleTemperature1653);
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

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTemperature1665); 

                	newLeafNode(otherlv_4, grammarAccess.getTemperatureAccess().getThanKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:845:1: ( (lv_value_5_0= ruleEFloat ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:846:1: (lv_value_5_0= ruleEFloat )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:846:1: (lv_value_5_0= ruleEFloat )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:847:3: lv_value_5_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getTemperatureAccess().getValueEFloatParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleTemperature1686);
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:871:1: entryRulePrecipitation returns [EObject current=null] : iv_rulePrecipitation= rulePrecipitation EOF ;
    public final EObject entryRulePrecipitation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecipitation = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:872:2: (iv_rulePrecipitation= rulePrecipitation EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:873:2: iv_rulePrecipitation= rulePrecipitation EOF
            {
             newCompositeNode(grammarAccess.getPrecipitationRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrecipitation_in_entryRulePrecipitation1722);
            iv_rulePrecipitation=rulePrecipitation();

            state._fsp--;

             current =iv_rulePrecipitation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrecipitation1732); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:880:1: rulePrecipitation returns [EObject current=null] : ( () (otherlv_1= 'rr' | otherlv_2= 'precipitation' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_height_5_0= ruleEFloat ) ) ) ;
    public final EObject rulePrecipitation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_comparator_3_0 = null;

        AntlrDatatypeRuleToken lv_height_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:883:28: ( ( () (otherlv_1= 'rr' | otherlv_2= 'precipitation' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_height_5_0= ruleEFloat ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:884:1: ( () (otherlv_1= 'rr' | otherlv_2= 'precipitation' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_height_5_0= ruleEFloat ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:884:1: ( () (otherlv_1= 'rr' | otherlv_2= 'precipitation' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_height_5_0= ruleEFloat ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:884:2: () (otherlv_1= 'rr' | otherlv_2= 'precipitation' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_height_5_0= ruleEFloat ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:884:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:885:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPrecipitationAccess().getPrecipitationAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:890:2: (otherlv_1= 'rr' | otherlv_2= 'precipitation' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            else if ( (LA12_0==32) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:890:4: otherlv_1= 'rr'
                    {
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulePrecipitation1779); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrecipitationAccess().getRrKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:895:7: otherlv_2= 'precipitation'
                    {
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulePrecipitation1797); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrecipitationAccess().getPrecipitationKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:899:2: ( (lv_comparator_3_0= ruleComparator ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:900:1: (lv_comparator_3_0= ruleComparator )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:900:1: (lv_comparator_3_0= ruleComparator )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:901:3: lv_comparator_3_0= ruleComparator
            {
             
            	        newCompositeNode(grammarAccess.getPrecipitationAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_rulePrecipitation1819);
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

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePrecipitation1831); 

                	newLeafNode(otherlv_4, grammarAccess.getPrecipitationAccess().getThanKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:921:1: ( (lv_height_5_0= ruleEFloat ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:922:1: (lv_height_5_0= ruleEFloat )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:922:1: (lv_height_5_0= ruleEFloat )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:923:3: lv_height_5_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getPrecipitationAccess().getHeightEFloatParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rulePrecipitation1852);
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:947:1: entryRuleRayonnement returns [EObject current=null] : iv_ruleRayonnement= ruleRayonnement EOF ;
    public final EObject entryRuleRayonnement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRayonnement = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:948:2: (iv_ruleRayonnement= ruleRayonnement EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:949:2: iv_ruleRayonnement= ruleRayonnement EOF
            {
             newCompositeNode(grammarAccess.getRayonnementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRayonnement_in_entryRuleRayonnement1888);
            iv_ruleRayonnement=ruleRayonnement();

            state._fsp--;

             current =iv_ruleRayonnement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRayonnement1898); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:956:1: ruleRayonnement returns [EObject current=null] : ( () (otherlv_1= 'par' | otherlv_2= 'rayonnement' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) ) ;
    public final EObject ruleRayonnement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_comparator_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:959:28: ( ( () (otherlv_1= 'par' | otherlv_2= 'rayonnement' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:960:1: ( () (otherlv_1= 'par' | otherlv_2= 'rayonnement' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:960:1: ( () (otherlv_1= 'par' | otherlv_2= 'rayonnement' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:960:2: () (otherlv_1= 'par' | otherlv_2= 'rayonnement' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:960:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:961:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRayonnementAccess().getRayonnementAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:966:2: (otherlv_1= 'par' | otherlv_2= 'rayonnement' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            else if ( (LA13_0==34) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:966:4: otherlv_1= 'par'
                    {
                    otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRayonnement1945); 

                        	newLeafNode(otherlv_1, grammarAccess.getRayonnementAccess().getParKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:971:7: otherlv_2= 'rayonnement'
                    {
                    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRayonnement1963); 

                        	newLeafNode(otherlv_2, grammarAccess.getRayonnementAccess().getRayonnementKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:975:2: ( (lv_comparator_3_0= ruleComparator ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:976:1: (lv_comparator_3_0= ruleComparator )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:976:1: (lv_comparator_3_0= ruleComparator )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:977:3: lv_comparator_3_0= ruleComparator
            {
             
            	        newCompositeNode(grammarAccess.getRayonnementAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_ruleRayonnement1985);
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

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRayonnement1997); 

                	newLeafNode(otherlv_4, grammarAccess.getRayonnementAccess().getThanKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:997:1: ( (lv_value_5_0= ruleEFloat ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:998:1: (lv_value_5_0= ruleEFloat )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:998:1: (lv_value_5_0= ruleEFloat )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:999:3: lv_value_5_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getRayonnementAccess().getValueEFloatParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleRayonnement2018);
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1023:1: entryRuleEvapotranspiration returns [EObject current=null] : iv_ruleEvapotranspiration= ruleEvapotranspiration EOF ;
    public final EObject entryRuleEvapotranspiration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvapotranspiration = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1024:2: (iv_ruleEvapotranspiration= ruleEvapotranspiration EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1025:2: iv_ruleEvapotranspiration= ruleEvapotranspiration EOF
            {
             newCompositeNode(grammarAccess.getEvapotranspirationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvapotranspiration_in_entryRuleEvapotranspiration2054);
            iv_ruleEvapotranspiration=ruleEvapotranspiration();

            state._fsp--;

             current =iv_ruleEvapotranspiration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvapotranspiration2064); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1032:1: ruleEvapotranspiration returns [EObject current=null] : ( () (otherlv_1= 'etp' | otherlv_2= 'evapotranspiration' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) ) ;
    public final EObject ruleEvapotranspiration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_comparator_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1035:28: ( ( () (otherlv_1= 'etp' | otherlv_2= 'evapotranspiration' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1036:1: ( () (otherlv_1= 'etp' | otherlv_2= 'evapotranspiration' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1036:1: ( () (otherlv_1= 'etp' | otherlv_2= 'evapotranspiration' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1036:2: () (otherlv_1= 'etp' | otherlv_2= 'evapotranspiration' ) ( (lv_comparator_3_0= ruleComparator ) ) otherlv_4= 'than' ( (lv_value_5_0= ruleEFloat ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1036:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1037:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEvapotranspirationAccess().getEvapoTranspirationAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1042:2: (otherlv_1= 'etp' | otherlv_2= 'evapotranspiration' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            else if ( (LA14_0==36) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1042:4: otherlv_1= 'etp'
                    {
                    otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEvapotranspiration2111); 

                        	newLeafNode(otherlv_1, grammarAccess.getEvapotranspirationAccess().getEtpKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1047:7: otherlv_2= 'evapotranspiration'
                    {
                    otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEvapotranspiration2129); 

                        	newLeafNode(otherlv_2, grammarAccess.getEvapotranspirationAccess().getEvapotranspirationKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1051:2: ( (lv_comparator_3_0= ruleComparator ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1052:1: (lv_comparator_3_0= ruleComparator )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1052:1: (lv_comparator_3_0= ruleComparator )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1053:3: lv_comparator_3_0= ruleComparator
            {
             
            	        newCompositeNode(grammarAccess.getEvapotranspirationAccess().getComparatorComparatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComparator_in_ruleEvapotranspiration2151);
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

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEvapotranspiration2163); 

                	newLeafNode(otherlv_4, grammarAccess.getEvapotranspirationAccess().getThanKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1073:1: ( (lv_value_5_0= ruleEFloat ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1074:1: (lv_value_5_0= ruleEFloat )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1074:1: (lv_value_5_0= ruleEFloat )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1075:3: lv_value_5_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getEvapotranspirationAccess().getValueEFloatParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleEvapotranspiration2184);
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1099:1: entryRuleCheckDoneActivity returns [EObject current=null] : iv_ruleCheckDoneActivity= ruleCheckDoneActivity EOF ;
    public final EObject entryRuleCheckDoneActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckDoneActivity = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1100:2: (iv_ruleCheckDoneActivity= ruleCheckDoneActivity EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1101:2: iv_ruleCheckDoneActivity= ruleCheckDoneActivity EOF
            {
             newCompositeNode(grammarAccess.getCheckDoneActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCheckDoneActivity_in_entryRuleCheckDoneActivity2220);
            iv_ruleCheckDoneActivity=ruleCheckDoneActivity();

            state._fsp--;

             current =iv_ruleCheckDoneActivity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCheckDoneActivity2230); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1108:1: ruleCheckDoneActivity returns [EObject current=null] : ( ( () otherlv_1= 'activity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'done' ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' ) ) | ( (lv_date_7_0= ruleDate ) ) ) ;
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
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1111:28: ( ( ( () otherlv_1= 'activity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'done' ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' ) ) | ( (lv_date_7_0= ruleDate ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1112:1: ( ( () otherlv_1= 'activity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'done' ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' ) ) | ( (lv_date_7_0= ruleDate ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1112:1: ( ( () otherlv_1= 'activity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'done' ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' ) ) | ( (lv_date_7_0= ruleDate ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_INT||LA15_0==47) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1112:2: ( () otherlv_1= 'activity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'done' ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1112:2: ( () otherlv_1= 'activity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'done' ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1112:3: () otherlv_1= 'activity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'done' ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1112:3: ()
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1113:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getCheckDoneActivityAccess().getCheckDoneActivityAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleCheckDoneActivity2277); 

                        	newLeafNode(otherlv_1, grammarAccess.getCheckDoneActivityAccess().getActivityKeyword_0_1());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1122:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1123:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1123:1: (otherlv_2= RULE_ID )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1124:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCheckDoneActivityRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCheckDoneActivity2297); 

                    		newLeafNode(otherlv_2, grammarAccess.getCheckDoneActivityAccess().getActivityToValidatePeriodicActivityCrossReference_0_2_0()); 
                    	

                    }


                    }

                    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCheckDoneActivity2309); 

                        	newLeafNode(otherlv_3, grammarAccess.getCheckDoneActivityAccess().getDoneKeyword_0_3());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1139:1: ( ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1139:2: ( (lv_elapsedTime_4_0= ruleEInt ) ) ( (lv_periodicityType_5_0= rulePeriodicity ) ) otherlv_6= 'ago'
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1139:2: ( (lv_elapsedTime_4_0= ruleEInt ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1140:1: (lv_elapsedTime_4_0= ruleEInt )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1140:1: (lv_elapsedTime_4_0= ruleEInt )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1141:3: lv_elapsedTime_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckDoneActivityAccess().getElapsedTimeEIntParserRuleCall_0_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCheckDoneActivity2331);
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

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1157:2: ( (lv_periodicityType_5_0= rulePeriodicity ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1158:1: (lv_periodicityType_5_0= rulePeriodicity )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1158:1: (lv_periodicityType_5_0= rulePeriodicity )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1159:3: lv_periodicityType_5_0= rulePeriodicity
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckDoneActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_0_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_ruleCheckDoneActivity2352);
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

                    otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCheckDoneActivity2364); 

                        	newLeafNode(otherlv_6, grammarAccess.getCheckDoneActivityAccess().getAgoKeyword_0_4_2());
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1180:6: ( (lv_date_7_0= ruleDate ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1180:6: ( (lv_date_7_0= ruleDate ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1181:1: (lv_date_7_0= ruleDate )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1181:1: (lv_date_7_0= ruleDate )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1182:3: lv_date_7_0= ruleDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckDoneActivityAccess().getDateDateParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleCheckDoneActivity2393);
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1206:1: entryRuleNoRain returns [EObject current=null] : iv_ruleNoRain= ruleNoRain EOF ;
    public final EObject entryRuleNoRain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRain = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1207:2: (iv_ruleNoRain= ruleNoRain EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1208:2: iv_ruleNoRain= ruleNoRain EOF
            {
             newCompositeNode(grammarAccess.getNoRainRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRain_in_entryRuleNoRain2429);
            iv_ruleNoRain=ruleNoRain();

            state._fsp--;

             current =iv_ruleNoRain; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoRain2439); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1215:1: ruleNoRain returns [EObject current=null] : ( () otherlv_1= 'noRain' ( (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) ) | (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) ) ) ) ;
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
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1218:28: ( ( () otherlv_1= 'noRain' ( (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) ) | (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1219:1: ( () otherlv_1= 'noRain' ( (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) ) | (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1219:1: ( () otherlv_1= 'noRain' ( (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) ) | (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1219:2: () otherlv_1= 'noRain' ( (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) ) | (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1219:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1220:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNoRainAccess().getNoRainAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleNoRain2485); 

                	newLeafNode(otherlv_1, grammarAccess.getNoRainAccess().getNoRainKeyword_1());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1229:1: ( (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) ) | (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            else if ( (LA16_0==41) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1229:2: (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1229:2: (otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1229:4: otherlv_2= 'for' ( (lv_elapsedTime_3_0= ruleEInt ) ) ( (lv_periodicityType_4_0= rulePeriodicity ) )
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNoRain2499); 

                        	newLeafNode(otherlv_2, grammarAccess.getNoRainAccess().getForKeyword_2_0_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1233:1: ( (lv_elapsedTime_3_0= ruleEInt ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1234:1: (lv_elapsedTime_3_0= ruleEInt )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1234:1: (lv_elapsedTime_3_0= ruleEInt )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1235:3: lv_elapsedTime_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNoRainAccess().getElapsedTimeEIntParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNoRain2520);
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

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1251:2: ( (lv_periodicityType_4_0= rulePeriodicity ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1252:1: (lv_periodicityType_4_0= rulePeriodicity )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1252:1: (lv_periodicityType_4_0= rulePeriodicity )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1253:3: lv_periodicityType_4_0= rulePeriodicity
                    {
                     
                    	        newCompositeNode(grammarAccess.getNoRainAccess().getPeriodicityTypePeriodicityEnumRuleCall_2_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_ruleNoRain2541);
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
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1270:6: (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1270:6: (otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1270:8: otherlv_5= 'since' ( (lv_date_6_0= ruleDate ) )
                    {
                    otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNoRain2561); 

                        	newLeafNode(otherlv_5, grammarAccess.getNoRainAccess().getSinceKeyword_2_1_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1274:1: ( (lv_date_6_0= ruleDate ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1275:1: (lv_date_6_0= ruleDate )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1275:1: (lv_date_6_0= ruleDate )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1276:3: lv_date_6_0= ruleDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getNoRainAccess().getDateDateParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleNoRain2582);
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1300:1: entryRuleGrainState returns [EObject current=null] : iv_ruleGrainState= ruleGrainState EOF ;
    public final EObject entryRuleGrainState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrainState = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1301:2: (iv_ruleGrainState= ruleGrainState EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1302:2: iv_ruleGrainState= ruleGrainState EOF
            {
             newCompositeNode(grammarAccess.getGrainStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrainState_in_entryRuleGrainState2620);
            iv_ruleGrainState=ruleGrainState();

            state._fsp--;

             current =iv_ruleGrainState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrainState2630); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1309:1: ruleGrainState returns [EObject current=null] : ( () otherlv_1= 'grain' otherlv_2= 'is' ( (lv_state_3_0= ruleGrainStateEnum ) ) ) ;
    public final EObject ruleGrainState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_state_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1312:28: ( ( () otherlv_1= 'grain' otherlv_2= 'is' ( (lv_state_3_0= ruleGrainStateEnum ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1313:1: ( () otherlv_1= 'grain' otherlv_2= 'is' ( (lv_state_3_0= ruleGrainStateEnum ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1313:1: ( () otherlv_1= 'grain' otherlv_2= 'is' ( (lv_state_3_0= ruleGrainStateEnum ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1313:2: () otherlv_1= 'grain' otherlv_2= 'is' ( (lv_state_3_0= ruleGrainStateEnum ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1313:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1314:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGrainStateAccess().getGrainStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleGrainState2676); 

                	newLeafNode(otherlv_1, grammarAccess.getGrainStateAccess().getGrainKeyword_1());
                
            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleGrainState2688); 

                	newLeafNode(otherlv_2, grammarAccess.getGrainStateAccess().getIsKeyword_2());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1327:1: ( (lv_state_3_0= ruleGrainStateEnum ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1328:1: (lv_state_3_0= ruleGrainStateEnum )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1328:1: (lv_state_3_0= ruleGrainStateEnum )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1329:3: lv_state_3_0= ruleGrainStateEnum
            {
             
            	        newCompositeNode(grammarAccess.getGrainStateAccess().getStateGrainStateEnumEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGrainStateEnum_in_ruleGrainState2709);
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


    // $ANTLR start "entryRuleElevage"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1355:1: entryRuleElevage returns [EObject current=null] : iv_ruleElevage= ruleElevage EOF ;
    public final EObject entryRuleElevage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElevage = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1356:2: (iv_ruleElevage= ruleElevage EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1357:2: iv_ruleElevage= ruleElevage EOF
            {
             newCompositeNode(grammarAccess.getElevageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElevage_in_entryRuleElevage2747);
            iv_ruleElevage=ruleElevage();

            state._fsp--;

             current =iv_ruleElevage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElevage2757); 

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
    // $ANTLR end "entryRuleElevage"


    // $ANTLR start "ruleElevage"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1364:1: ruleElevage returns [EObject current=null] : ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleElevage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1367:28: ( ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1368:1: ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1368:1: ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1368:2: () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1368:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1369:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElevageAccess().getElevageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleElevage2803); 

                	newLeafNode(otherlv_1, grammarAccess.getElevageAccess().getElevageKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElevage2815); 

                	newLeafNode(otherlv_2, grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1382:1: (otherlv_3= 'activity' ( ( ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1382:3: otherlv_3= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleElevage2828); 

                        	newLeafNode(otherlv_3, grammarAccess.getElevageAccess().getActivityKeyword_3_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1386:1: ( ( ruleEString ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1387:1: ( ruleEString )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1387:1: ( ruleEString )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1388:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getElevageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getElevageAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleElevage2851);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleElevage2865); 

                	newLeafNode(otherlv_5, grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleElevage"


    // $ANTLR start "entryRuleCulture"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1413:1: entryRuleCulture returns [EObject current=null] : iv_ruleCulture= ruleCulture EOF ;
    public final EObject entryRuleCulture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCulture = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1414:2: (iv_ruleCulture= ruleCulture EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1415:2: iv_ruleCulture= ruleCulture EOF
            {
             newCompositeNode(grammarAccess.getCultureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCulture_in_entryRuleCulture2901);
            iv_ruleCulture=ruleCulture();

            state._fsp--;

             current =iv_ruleCulture; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCulture2911); 

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
    // $ANTLR end "entryRuleCulture"


    // $ANTLR start "ruleCulture"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1422:1: ruleCulture returns [EObject current=null] : ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleCulture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1425:28: ( ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1426:1: ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1426:1: ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1426:2: () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1426:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1427:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCultureAccess().getCultureAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleCulture2957); 

                	newLeafNode(otherlv_1, grammarAccess.getCultureAccess().getCultureKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCulture2969); 

                	newLeafNode(otherlv_2, grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1440:1: (otherlv_3= 'activity' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1440:3: otherlv_3= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleCulture2982); 

                        	newLeafNode(otherlv_3, grammarAccess.getCultureAccess().getActivityKeyword_3_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1444:1: ( ( ruleEString ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1445:1: ( ruleEString )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1445:1: ( ruleEString )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1446:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCultureRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCultureAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCulture3005);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCulture3019); 

                	newLeafNode(otherlv_5, grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleCulture"


    // $ANTLR start "entryRuleAtelier_Impl"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1473:1: entryRuleAtelier_Impl returns [EObject current=null] : iv_ruleAtelier_Impl= ruleAtelier_Impl EOF ;
    public final EObject entryRuleAtelier_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtelier_Impl = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1474:2: (iv_ruleAtelier_Impl= ruleAtelier_Impl EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1475:2: iv_ruleAtelier_Impl= ruleAtelier_Impl EOF
            {
             newCompositeNode(grammarAccess.getAtelier_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl3057);
            iv_ruleAtelier_Impl=ruleAtelier_Impl();

            state._fsp--;

             current =iv_ruleAtelier_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtelier_Impl3067); 

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
    // $ANTLR end "entryRuleAtelier_Impl"


    // $ANTLR start "ruleAtelier_Impl"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1482:1: ruleAtelier_Impl returns [EObject current=null] : ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleAtelier_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1485:28: ( ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1486:1: ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1486:1: ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1486:2: () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1486:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1487:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtelier_ImplAccess().getAtelierAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAtelier_Impl3113); 

                	newLeafNode(otherlv_1, grammarAccess.getAtelier_ImplAccess().getAtelierKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAtelier_Impl3125); 

                	newLeafNode(otherlv_2, grammarAccess.getAtelier_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1500:1: (otherlv_3= 'activity' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1500:3: otherlv_3= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAtelier_Impl3138); 

                        	newLeafNode(otherlv_3, grammarAccess.getAtelier_ImplAccess().getActivityKeyword_3_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1504:1: ( ( ruleEString ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1505:1: ( ruleEString )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1505:1: ( ruleEString )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1506:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtelier_ImplRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAtelier_ImplAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAtelier_Impl3161);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAtelier_Impl3175); 

                	newLeafNode(otherlv_5, grammarAccess.getAtelier_ImplAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleAtelier_Impl"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1531:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1532:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1533:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString3212);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString3223); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1540:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1543:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1544:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1544:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1544:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString3263); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1552:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString3289); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1567:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1568:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1569:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3335);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3346); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1576:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1579:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1580:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1580:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1580:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1580:2: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1581:2: kw= '-'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEInt3385); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3402); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1601:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1602:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1603:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat3448);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat3459); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1610:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1613:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1614:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1614:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1614:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3499); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEFloat3517); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3532); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1642:1: rulePeriodicity returns [Enumerator current=null] : ( (enumLiteral_0= 'months' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) | (enumLiteral_4= 'hours' ) ) ;
    public final Enumerator rulePeriodicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1644:28: ( ( (enumLiteral_0= 'months' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) | (enumLiteral_4= 'hours' ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1645:1: ( (enumLiteral_0= 'months' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) | (enumLiteral_4= 'hours' ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1645:1: ( (enumLiteral_0= 'months' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) | (enumLiteral_4= 'hours' ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt22=1;
                }
                break;
            case 50:
                {
                alt22=2;
                }
                break;
            case 51:
                {
                alt22=3;
                }
                break;
            case 52:
                {
                alt22=4;
                }
                break;
            case 53:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1645:2: (enumLiteral_0= 'months' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1645:2: (enumLiteral_0= 'months' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1645:4: enumLiteral_0= 'months'
                    {
                    enumLiteral_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_rulePeriodicity3591); 

                            current = grammarAccess.getPeriodicityAccess().getMonthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPeriodicityAccess().getMonthEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1651:6: (enumLiteral_1= 'days' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1651:6: (enumLiteral_1= 'days' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1651:8: enumLiteral_1= 'days'
                    {
                    enumLiteral_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_rulePeriodicity3608); 

                            current = grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1657:6: (enumLiteral_2= 'weeks' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1657:6: (enumLiteral_2= 'weeks' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1657:8: enumLiteral_2= 'weeks'
                    {
                    enumLiteral_2=(Token)match(input,51,FollowSets000.FOLLOW_51_in_rulePeriodicity3625); 

                            current = grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1663:6: (enumLiteral_3= 'years' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1663:6: (enumLiteral_3= 'years' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1663:8: enumLiteral_3= 'years'
                    {
                    enumLiteral_3=(Token)match(input,52,FollowSets000.FOLLOW_52_in_rulePeriodicity3642); 

                            current = grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1669:6: (enumLiteral_4= 'hours' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1669:6: (enumLiteral_4= 'hours' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1669:8: enumLiteral_4= 'hours'
                    {
                    enumLiteral_4=(Token)match(input,53,FollowSets000.FOLLOW_53_in_rulePeriodicity3659); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1679:1: ruleMonth returns [Enumerator current=null] : ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) ) ;
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
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1681:28: ( ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1682:1: ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1682:1: ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) )
            int alt23=12;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt23=1;
                }
                break;
            case 55:
                {
                alt23=2;
                }
                break;
            case 56:
                {
                alt23=3;
                }
                break;
            case 57:
                {
                alt23=4;
                }
                break;
            case 58:
                {
                alt23=5;
                }
                break;
            case 59:
                {
                alt23=6;
                }
                break;
            case 60:
                {
                alt23=7;
                }
                break;
            case 61:
                {
                alt23=8;
                }
                break;
            case 62:
                {
                alt23=9;
                }
                break;
            case 63:
                {
                alt23=10;
                }
                break;
            case 64:
                {
                alt23=11;
                }
                break;
            case 65:
                {
                alt23=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1682:2: (enumLiteral_0= 'january' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1682:2: (enumLiteral_0= 'january' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1682:4: enumLiteral_0= 'january'
                    {
                    enumLiteral_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleMonth3704); 

                            current = grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1688:6: (enumLiteral_1= 'february' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1688:6: (enumLiteral_1= 'february' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1688:8: enumLiteral_1= 'february'
                    {
                    enumLiteral_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleMonth3721); 

                            current = grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1694:6: (enumLiteral_2= 'march' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1694:6: (enumLiteral_2= 'march' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1694:8: enumLiteral_2= 'march'
                    {
                    enumLiteral_2=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleMonth3738); 

                            current = grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1700:6: (enumLiteral_3= 'april' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1700:6: (enumLiteral_3= 'april' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1700:8: enumLiteral_3= 'april'
                    {
                    enumLiteral_3=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleMonth3755); 

                            current = grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1706:6: (enumLiteral_4= 'may' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1706:6: (enumLiteral_4= 'may' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1706:8: enumLiteral_4= 'may'
                    {
                    enumLiteral_4=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleMonth3772); 

                            current = grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1712:6: (enumLiteral_5= 'june' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1712:6: (enumLiteral_5= 'june' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1712:8: enumLiteral_5= 'june'
                    {
                    enumLiteral_5=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleMonth3789); 

                            current = grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1718:6: (enumLiteral_6= 'july' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1718:6: (enumLiteral_6= 'july' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1718:8: enumLiteral_6= 'july'
                    {
                    enumLiteral_6=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleMonth3806); 

                            current = grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1724:6: (enumLiteral_7= 'august' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1724:6: (enumLiteral_7= 'august' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1724:8: enumLiteral_7= 'august'
                    {
                    enumLiteral_7=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleMonth3823); 

                            current = grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1730:6: (enumLiteral_8= 'september' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1730:6: (enumLiteral_8= 'september' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1730:8: enumLiteral_8= 'september'
                    {
                    enumLiteral_8=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleMonth3840); 

                            current = grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1736:6: (enumLiteral_9= 'october' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1736:6: (enumLiteral_9= 'october' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1736:8: enumLiteral_9= 'october'
                    {
                    enumLiteral_9=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleMonth3857); 

                            current = grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1742:6: (enumLiteral_10= 'november' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1742:6: (enumLiteral_10= 'november' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1742:8: enumLiteral_10= 'november'
                    {
                    enumLiteral_10=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleMonth3874); 

                            current = grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1748:6: (enumLiteral_11= 'december' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1748:6: (enumLiteral_11= 'december' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1748:8: enumLiteral_11= 'december'
                    {
                    enumLiteral_11=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleMonth3891); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1758:1: ruleComparator returns [Enumerator current=null] : ( (enumLiteral_0= 'inferior' ) | (enumLiteral_1= 'inferiorOrEqual' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'different' ) | (enumLiteral_4= 'superior' ) | (enumLiteral_5= 'superiorOrEqual' ) ) ;
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
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1760:28: ( ( (enumLiteral_0= 'inferior' ) | (enumLiteral_1= 'inferiorOrEqual' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'different' ) | (enumLiteral_4= 'superior' ) | (enumLiteral_5= 'superiorOrEqual' ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1761:1: ( (enumLiteral_0= 'inferior' ) | (enumLiteral_1= 'inferiorOrEqual' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'different' ) | (enumLiteral_4= 'superior' ) | (enumLiteral_5= 'superiorOrEqual' ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1761:1: ( (enumLiteral_0= 'inferior' ) | (enumLiteral_1= 'inferiorOrEqual' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'different' ) | (enumLiteral_4= 'superior' ) | (enumLiteral_5= 'superiorOrEqual' ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt24=1;
                }
                break;
            case 67:
                {
                alt24=2;
                }
                break;
            case 68:
                {
                alt24=3;
                }
                break;
            case 69:
                {
                alt24=4;
                }
                break;
            case 70:
                {
                alt24=5;
                }
                break;
            case 71:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1761:2: (enumLiteral_0= 'inferior' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1761:2: (enumLiteral_0= 'inferior' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1761:4: enumLiteral_0= 'inferior'
                    {
                    enumLiteral_0=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleComparator3936); 

                            current = grammarAccess.getComparatorAccess().getInferiorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparatorAccess().getInferiorEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1767:6: (enumLiteral_1= 'inferiorOrEqual' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1767:6: (enumLiteral_1= 'inferiorOrEqual' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1767:8: enumLiteral_1= 'inferiorOrEqual'
                    {
                    enumLiteral_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleComparator3953); 

                            current = grammarAccess.getComparatorAccess().getInferiorOrEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparatorAccess().getInferiorOrEqualEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1773:6: (enumLiteral_2= 'equal' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1773:6: (enumLiteral_2= 'equal' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1773:8: enumLiteral_2= 'equal'
                    {
                    enumLiteral_2=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleComparator3970); 

                            current = grammarAccess.getComparatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparatorAccess().getEqualEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1779:6: (enumLiteral_3= 'different' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1779:6: (enumLiteral_3= 'different' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1779:8: enumLiteral_3= 'different'
                    {
                    enumLiteral_3=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleComparator3987); 

                            current = grammarAccess.getComparatorAccess().getDifferentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparatorAccess().getDifferentEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1785:6: (enumLiteral_4= 'superior' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1785:6: (enumLiteral_4= 'superior' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1785:8: enumLiteral_4= 'superior'
                    {
                    enumLiteral_4=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleComparator4004); 

                            current = grammarAccess.getComparatorAccess().getSuperiorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparatorAccess().getSuperiorEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1791:6: (enumLiteral_5= 'superiorOrEqual' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1791:6: (enumLiteral_5= 'superiorOrEqual' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1791:8: enumLiteral_5= 'superiorOrEqual'
                    {
                    enumLiteral_5=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleComparator4021); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1801:1: ruleBinaryExppressionType returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) ) ;
    public final Enumerator ruleBinaryExppressionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1803:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1804:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1804:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'XOR' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt25=1;
                }
                break;
            case 73:
                {
                alt25=2;
                }
                break;
            case 74:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1804:2: (enumLiteral_0= 'AND' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1804:2: (enumLiteral_0= 'AND' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1804:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleBinaryExppressionType4066); 

                            current = grammarAccess.getBinaryExppressionTypeAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryExppressionTypeAccess().getANDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1810:6: (enumLiteral_1= 'OR' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1810:6: (enumLiteral_1= 'OR' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1810:8: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleBinaryExppressionType4083); 

                            current = grammarAccess.getBinaryExppressionTypeAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryExppressionTypeAccess().getOREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1816:6: (enumLiteral_2= 'XOR' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1816:6: (enumLiteral_2= 'XOR' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1816:8: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleBinaryExppressionType4100); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1826:1: ruleGrainStateEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'MATURE' ) | (enumLiteral_1= 'IMMATURE' ) ) ;
    public final Enumerator ruleGrainStateEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1828:28: ( ( (enumLiteral_0= 'MATURE' ) | (enumLiteral_1= 'IMMATURE' ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1829:1: ( (enumLiteral_0= 'MATURE' ) | (enumLiteral_1= 'IMMATURE' ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1829:1: ( (enumLiteral_0= 'MATURE' ) | (enumLiteral_1= 'IMMATURE' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==75) ) {
                alt26=1;
            }
            else if ( (LA26_0==76) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1829:2: (enumLiteral_0= 'MATURE' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1829:2: (enumLiteral_0= 'MATURE' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1829:4: enumLiteral_0= 'MATURE'
                    {
                    enumLiteral_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleGrainStateEnum4145); 

                            current = grammarAccess.getGrainStateEnumAccess().getMATUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGrainStateEnumAccess().getMATUREEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1835:6: (enumLiteral_1= 'IMMATURE' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1835:6: (enumLiteral_1= 'IMMATURE' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:1835:8: enumLiteral_1= 'IMMATURE'
                    {
                    enumLiteral_1=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleGrainStateEnum4162); 

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleModel131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModel152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel164 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rulePeriodicActivity_in_ruleModel185 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleModel198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeriodicActivity_in_entryRulePeriodicActivity234 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePeriodicActivity244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rulePeriodicActivity290 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePeriodicActivity311 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePeriodicActivity323 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_15_in_rulePeriodicActivity336 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePeriodicActivity359 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePeriodicActivity371 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePeriodicActivity385 = new BitSet(new long[]{0x0000800000000040L});
        public static final BitSet FOLLOW_ruleDate_in_rulePeriodicActivity406 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_rulePeriodicActivity418 = new BitSet(new long[]{0x0000800000000040L});
        public static final BitSet FOLLOW_ruleDate_in_rulePeriodicActivity439 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePeriodicActivity451 = new BitSet(new long[]{0x0000000000382000L});
        public static final BitSet FOLLOW_19_in_rulePeriodicActivity464 = new BitSet(new long[]{0x003E800000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePeriodicActivity485 = new BitSet(new long[]{0x003E800000000040L});
        public static final BitSet FOLLOW_rulePeriodicity_in_rulePeriodicActivity507 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePeriodicActivity519 = new BitSet(new long[]{0x0000000000302000L});
        public static final BitSet FOLLOW_20_in_rulePeriodicActivity534 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePeriodicActivity546 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rulePeriodicActivity567 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_rulePeriodicActivity580 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rulePeriodicActivity601 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_rulePeriodicActivity615 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePeriodicActivity627 = new BitSet(new long[]{0x0000000000202000L});
        public static final BitSet FOLLOW_21_in_rulePeriodicActivity642 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulePeriodicActivity654 = new BitSet(new long[]{0x0000853FB6000040L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_rulePeriodicActivity675 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePeriodicActivity687 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePeriodicActivity701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate737 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDate802 = new BitSet(new long[]{0xFFC0000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleMonth_in_ruleDate823 = new BitSet(new long[]{0x0000800000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDate844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_entryRuleResAllocation880 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResAllocation890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleResAllocation936 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleResAllocation959 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleResAllocation971 = new BitSet(new long[]{0x0000800000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleResAllocation992 = new BitSet(new long[]{0x003E800000000040L});
        public static final BitSet FOLLOW_rulePeriodicity_in_ruleResAllocation1013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate1049 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicate1059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rulePredicate1107 = new BitSet(new long[]{0x0000800000000040L});
        public static final BitSet FOLLOW_ruleDate_in_rulePredicate1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckDoneActivity_in_rulePredicate1158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRain_in_rulePredicate1185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperature_in_rulePredicate1212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrecipitation_in_rulePredicate1239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRayonnement_in_rulePredicate1266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvapotranspiration_in_rulePredicate1293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrainState_in_rulePredicate1320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_entryRuleBinaryExppression1355 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryExppression1365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_ruleBinaryExppression1421 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000700L});
        public static final BitSet FOLLOW_26_in_ruleBinaryExppression1440 = new BitSet(new long[]{0x0000853FB6000040L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_ruleBinaryExppression1461 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleBinaryExppression1473 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000700L});
        public static final BitSet FOLLOW_ruleBinaryExppressionType_in_ruleBinaryExppression1497 = new BitSet(new long[]{0x0000853FB6000040L});
        public static final BitSet FOLLOW_ruleBinaryExppression_in_ruleBinaryExppression1518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperature_in_entryRuleTemperature1556 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemperature1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleTemperature1613 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FCL});
        public static final BitSet FOLLOW_29_in_ruleTemperature1631 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FCL});
        public static final BitSet FOLLOW_ruleComparator_in_ruleTemperature1653 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleTemperature1665 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleTemperature1686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrecipitation_in_entryRulePrecipitation1722 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrecipitation1732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rulePrecipitation1779 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FCL});
        public static final BitSet FOLLOW_32_in_rulePrecipitation1797 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FCL});
        public static final BitSet FOLLOW_ruleComparator_in_rulePrecipitation1819 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulePrecipitation1831 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEFloat_in_rulePrecipitation1852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRayonnement_in_entryRuleRayonnement1888 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRayonnement1898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleRayonnement1945 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FCL});
        public static final BitSet FOLLOW_34_in_ruleRayonnement1963 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FCL});
        public static final BitSet FOLLOW_ruleComparator_in_ruleRayonnement1985 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleRayonnement1997 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleRayonnement2018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvapotranspiration_in_entryRuleEvapotranspiration2054 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvapotranspiration2064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEvapotranspiration2111 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FCL});
        public static final BitSet FOLLOW_36_in_ruleEvapotranspiration2129 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FCL});
        public static final BitSet FOLLOW_ruleComparator_in_ruleEvapotranspiration2151 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleEvapotranspiration2163 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleEvapotranspiration2184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCheckDoneActivity_in_entryRuleCheckDoneActivity2220 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCheckDoneActivity2230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleCheckDoneActivity2277 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCheckDoneActivity2297 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleCheckDoneActivity2309 = new BitSet(new long[]{0x0000800000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCheckDoneActivity2331 = new BitSet(new long[]{0x003E800000000040L});
        public static final BitSet FOLLOW_rulePeriodicity_in_ruleCheckDoneActivity2352 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleCheckDoneActivity2364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleCheckDoneActivity2393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRain_in_entryRuleNoRain2429 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoRain2439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleNoRain2485 = new BitSet(new long[]{0x0000020001000000L});
        public static final BitSet FOLLOW_24_in_ruleNoRain2499 = new BitSet(new long[]{0x0000800000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNoRain2520 = new BitSet(new long[]{0x003E800000000040L});
        public static final BitSet FOLLOW_rulePeriodicity_in_ruleNoRain2541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleNoRain2561 = new BitSet(new long[]{0x0000800000000040L});
        public static final BitSet FOLLOW_ruleDate_in_ruleNoRain2582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrainState_in_entryRuleGrainState2620 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrainState2630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleGrainState2676 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleGrainState2688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
        public static final BitSet FOLLOW_ruleGrainStateEnum_in_ruleGrainState2709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElevage_in_entryRuleElevage2747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElevage2757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleElevage2803 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElevage2815 = new BitSet(new long[]{0x0000002000002000L});
        public static final BitSet FOLLOW_37_in_ruleElevage2828 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleElevage2851 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleElevage2865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCulture_in_entryRuleCulture2901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCulture2911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleCulture2957 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCulture2969 = new BitSet(new long[]{0x0000002000002000L});
        public static final BitSet FOLLOW_37_in_ruleCulture2982 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCulture3005 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCulture3019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl3057 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtelier_Impl3067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleAtelier_Impl3113 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAtelier_Impl3125 = new BitSet(new long[]{0x0000002000002000L});
        public static final BitSet FOLLOW_37_in_ruleAtelier_Impl3138 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAtelier_Impl3161 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAtelier_Impl3175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString3212 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString3223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString3263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString3289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3335 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleEInt3385 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat3448 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat3459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3499 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleEFloat3517 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rulePeriodicity3591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rulePeriodicity3608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rulePeriodicity3625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulePeriodicity3642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rulePeriodicity3659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleMonth3704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleMonth3721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleMonth3738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleMonth3755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleMonth3772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleMonth3789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleMonth3806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleMonth3823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleMonth3840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleMonth3857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleMonth3874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleMonth3891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleComparator3936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleComparator3953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleComparator3970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleComparator3987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleComparator4004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleComparator4021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleBinaryExppressionType4066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleBinaryExppressionType4083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleBinaryExppressionType4100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleGrainStateEnum4145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleGrainStateEnum4162 = new BitSet(new long[]{0x0000000000000002L});
    }


}
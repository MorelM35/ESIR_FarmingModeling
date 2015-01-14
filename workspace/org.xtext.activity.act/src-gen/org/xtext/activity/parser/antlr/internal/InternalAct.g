/*
* generated by Xtext
*/
grammar InternalAct;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.activity.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModelAccess().getModelAction_0(),
            $current);
    }
)	otherlv_1='Categorie' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getCategorieKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getActivityPeriodicActivityParserRuleCall_4_0()); 
	    }
		lv_activity_4_0=rulePeriodicActivity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"activity",
        		lv_activity_4_0, 
        		"PeriodicActivity");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRulePeriodicActivity
entryRulePeriodicActivity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPeriodicActivityRule()); }
	 iv_rulePeriodicActivity=rulePeriodicActivity 
	 { $current=$iv_rulePeriodicActivity.current; } 
	 EOF 
;

// Rule PeriodicActivity
rulePeriodicActivity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPeriodicActivityAccess().getPeriodicActivityAction_0(),
            $current);
    }
)	otherlv_1='PeriodicActivity' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPeriodicActivityAccess().getPeriodicActivityKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='workshop' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPeriodicActivityAccess().getWorkshopKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPeriodicActivityRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getAtelierAtelierCrossReference_4_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_4_2());
    }
)?	otherlv_7='from' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getPeriodicActivityAccess().getFromKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getStartDateParserRuleCall_6_0()); 
	    }
		lv_start_8_0=ruleDate		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
	        }
       		set(
       			$current, 
       			"start",
        		lv_start_8_0, 
        		"Date");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_9='to' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getPeriodicActivityAccess().getToKeyword_7());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getEndDateParserRuleCall_8_0()); 
	    }
		lv_end_10_0=ruleDate		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
	        }
       		set(
       			$current, 
       			"end",
        		lv_end_10_0, 
        		"Date");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11=',' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_9());
    }
(	otherlv_12='every' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getPeriodicActivityAccess().getEveryKeyword_10_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getFrequencyEIntParserRuleCall_10_1_0()); 
	    }
		lv_frequency_13_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
	        }
       		set(
       			$current, 
       			"frequency",
        		lv_frequency_13_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_10_2_0()); 
	    }
		lv_periodicityType_14_0=rulePeriodicity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
	        }
       		set(
       			$current, 
       			"periodicityType",
        		lv_periodicityType_14_0, 
        		"Periodicity");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_15=',' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_10_3());
    }
)?(	otherlv_16='allocate' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getPeriodicActivityAccess().getAllocateKeyword_11_0());
    }
	otherlv_17='{' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_11_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_11_2_0()); 
	    }
		lv_resAllocation_18_0=ruleResAllocation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
	        }
       		add(
       			$current, 
       			"resAllocation",
        		lv_resAllocation_18_0, 
        		"ResAllocation");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_19=',' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_11_3_1_0()); 
	    }
		lv_resAllocation_20_0=ruleResAllocation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
	        }
       		add(
       			$current, 
       			"resAllocation",
        		lv_resAllocation_20_0, 
        		"ResAllocation");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_21='}' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_11_4());
    }
	otherlv_22=',' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11_5());
    }
)?(	otherlv_23='rules' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getPeriodicActivityAccess().getRulesKeyword_12_0());
    }
	otherlv_24='{' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_12_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_12_2_0()); 
	    }
		lv_rule_25_0=ruleRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
	        }
       		add(
       			$current, 
       			"rule",
        		lv_rule_25_0, 
        		"Rule");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_26=',' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_12_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_12_3_1_0()); 
	    }
		lv_rule_27_0=ruleRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
	        }
       		add(
       			$current, 
       			"rule",
        		lv_rule_27_0, 
        		"Rule");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_28='}' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_12_4());
    }
)?	otherlv_29='}' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_13());
    }
)
;







// Entry rule entryRuleDate
entryRuleDate returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDateRule()); }
	 iv_ruleDate=ruleDate 
	 { $current=$iv_ruleDate.current; } 
	 EOF 
;

// Rule Date
ruleDate returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDateAccess().getDateAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDateAccess().getDayEIntParserRuleCall_1_0()); 
	    }
		lv_day_1_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDateRule());
	        }
       		set(
       			$current, 
       			"day",
        		lv_day_1_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_2_0()); 
	    }
		lv_month_2_0=ruleMonth		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDateRule());
	        }
       		set(
       			$current, 
       			"month",
        		lv_month_2_0, 
        		"Month");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleResAllocation
entryRuleResAllocation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getResAllocationRule()); }
	 iv_ruleResAllocation=ruleResAllocation 
	 { $current=$iv_ruleResAllocation.current; } 
	 EOF 
;

// Rule ResAllocation
ruleResAllocation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getResAllocationAccess().getRessourceAllocationAction_0(),
            $current);
    }
)	otherlv_1='reserve' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getResAllocationAccess().getReserveKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getResAllocationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getResAllocationAccess().getRessourceRessourceCrossReference_2_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='for' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getResAllocationAccess().getForKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getResAllocationAccess().getDurationEIntParserRuleCall_4_0()); 
	    }
		lv_duration_4_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getResAllocationRule());
	        }
       		set(
       			$current, 
       			"duration",
        		lv_duration_4_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getResAllocationAccess().getPeriodicityTypePeriodicityEnumRuleCall_5_0()); 
	    }
		lv_periodicityType_5_0=rulePeriodicity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getResAllocationRule());
	        }
       		set(
       			$current, 
       			"periodicityType",
        		lv_periodicityType_5_0, 
        		"Periodicity");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	 iv_ruleRule=ruleRule 
	 { $current=$iv_ruleRule.current; } 
	 EOF 
;

// Rule Rule
ruleRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getRuleAccess().getRuleAction_0(),
            $current);
    }
)(	otherlv_1='pre' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getPreKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getPrePredicateParserRuleCall_1_1_0()); 
	    }
		lv_pre_2_0=rulePredicate		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		add(
       			$current, 
       			"pre",
        		lv_pre_2_0, 
        		"Predicate");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getCommaKeyword_1_2_0());
    }
	otherlv_4='pre' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getPreKeyword_1_2_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getPrePredicateParserRuleCall_1_2_2_0()); 
	    }
		lv_pre_5_0=rulePredicate		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		add(
       			$current, 
       			"pre",
        		lv_pre_5_0, 
        		"Predicate");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?)
;





// Entry rule entryRuleAtelier_Impl
entryRuleAtelier_Impl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtelier_ImplRule()); }
	 iv_ruleAtelier_Impl=ruleAtelier_Impl 
	 { $current=$iv_ruleAtelier_Impl.current; } 
	 EOF 
;

// Rule Atelier_Impl
ruleAtelier_Impl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtelier_ImplAccess().getAtelierAction_0(),
            $current);
    }
)	otherlv_1='Atelier' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAtelier_ImplAccess().getAtelierKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAtelier_ImplAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='activity' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAtelier_ImplAccess().getActivityKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtelier_ImplRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getAtelier_ImplAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAtelier_ImplAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEIntRule()); } 
	 iv_ruleEInt=ruleEInt 
	 { $current=$iv_ruleEInt.current.getText(); }  
	 EOF 
;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
    }
)
    ;







// Entry rule entryRulePredicate
entryRulePredicate returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPredicateRule()); }
	 iv_rulePredicate=rulePredicate 
	 { $current=$iv_rulePredicate.current; } 
	 EOF 
;

// Rule Predicate
rulePredicate returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPredicateAccess().getPredicatAction_0(),
            $current);
    }
)
    { 
        newCompositeNode(grammarAccess.getPredicateAccess().getEStringParserRuleCall_1()); 
    }
ruleEString
    { 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleElevage
entryRuleElevage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getElevageRule()); }
	 iv_ruleElevage=ruleElevage 
	 { $current=$iv_ruleElevage.current; } 
	 EOF 
;

// Rule Elevage
ruleElevage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getElevageAccess().getElevageAction_0(),
            $current);
    }
)	otherlv_1='Elevage' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getElevageAccess().getElevageKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='activity' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getElevageAccess().getActivityKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getElevageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getElevageAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleCulture
entryRuleCulture returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCultureRule()); }
	 iv_ruleCulture=ruleCulture 
	 { $current=$iv_ruleCulture.current; } 
	 EOF 
;

// Rule Culture
ruleCulture returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getCultureAccess().getCultureAction_0(),
            $current);
    }
)	otherlv_1='Culture' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCultureAccess().getCultureKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='activity' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getCultureAccess().getActivityKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getCultureRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getCultureAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Rule Periodicity
rulePeriodicity returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='months' 
	{
        $current = grammarAccess.getPeriodicityAccess().getMonthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getPeriodicityAccess().getMonthEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='days' 
	{
        $current = grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='weeks' 
	{
        $current = grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='years' 
	{
        $current = grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='hours' 
	{
        $current = grammarAccess.getPeriodicityAccess().getHoursEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getPeriodicityAccess().getHoursEnumLiteralDeclaration_4()); 
    }
));



// Rule Month
ruleMonth returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='january' 
	{
        $current = grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMonthAccess().getJanuaryEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='february' 
	{
        $current = grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getMonthAccess().getFebruaryEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='march' 
	{
        $current = grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getMonthAccess().getMarchEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='april' 
	{
        $current = grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getMonthAccess().getAprilEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='may' 
	{
        $current = grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getMonthAccess().getMayEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='june' 
	{
        $current = grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getMonthAccess().getJuneEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='july' 
	{
        $current = grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getMonthAccess().getJulyEnumLiteralDeclaration_6()); 
    }
)
    |(	enumLiteral_7='august' 
	{
        $current = grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_7, grammarAccess.getMonthAccess().getAugustEnumLiteralDeclaration_7()); 
    }
)
    |(	enumLiteral_8='september' 
	{
        $current = grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_8, grammarAccess.getMonthAccess().getSeptemberEnumLiteralDeclaration_8()); 
    }
)
    |(	enumLiteral_9='october' 
	{
        $current = grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_9, grammarAccess.getMonthAccess().getOctoberEnumLiteralDeclaration_9()); 
    }
)
    |(	enumLiteral_10='november' 
	{
        $current = grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_10, grammarAccess.getMonthAccess().getNovemberEnumLiteralDeclaration_10()); 
    }
)
    |(	enumLiteral_11='december' 
	{
        $current = grammarAccess.getMonthAccess().getDecemberEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_11, grammarAccess.getMonthAccess().getDecemberEnumLiteralDeclaration_11()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



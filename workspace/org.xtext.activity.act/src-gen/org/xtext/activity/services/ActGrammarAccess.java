/*
* generated by Xtext
*/
package org.xtext.activity.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ActGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class PeriodicActivityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PeriodicActivity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPeriodicActivityAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPeriodicActivityKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cAtelierKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cAtelierAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cAtelierAtelierCrossReference_4_1_0 = (CrossReference)cAtelierAssignment_4_1.eContents().get(0);
		private final RuleCall cAtelierAtelierEStringParserRuleCall_4_1_0_1 = (RuleCall)cAtelierAtelierCrossReference_4_1_0.eContents().get(1);
		private final Keyword cCommaKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Keyword cStartKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cFromKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cStartAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cStartDateParserRuleCall_7_0 = (RuleCall)cStartAssignment_7.eContents().get(0);
		private final Keyword cToKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cEndKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cEndAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cEndDateParserRuleCall_10_0 = (RuleCall)cEndAssignment_10.eContents().get(0);
		private final Keyword cCommaKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cEveryKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Assignment cPeriodicityNumberAssignment_12_1 = (Assignment)cGroup_12.eContents().get(1);
		private final RuleCall cPeriodicityNumberEIntParserRuleCall_12_1_0 = (RuleCall)cPeriodicityNumberAssignment_12_1.eContents().get(0);
		private final Assignment cPeriodicityTypeAssignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final RuleCall cPeriodicityTypePeriodicityEnumRuleCall_12_2_0 = (RuleCall)cPeriodicityTypeAssignment_12_2.eContents().get(0);
		private final Group cGroup_13 = (Group)cGroup.eContents().get(13);
		private final Keyword cAllocateKeyword_13_0 = (Keyword)cGroup_13.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_13_1 = (Keyword)cGroup_13.eContents().get(1);
		private final Assignment cResAllocationAssignment_13_2 = (Assignment)cGroup_13.eContents().get(2);
		private final RuleCall cResAllocationResAllocationParserRuleCall_13_2_0 = (RuleCall)cResAllocationAssignment_13_2.eContents().get(0);
		private final Group cGroup_13_3 = (Group)cGroup_13.eContents().get(3);
		private final Keyword cCommaKeyword_13_3_0 = (Keyword)cGroup_13_3.eContents().get(0);
		private final Assignment cResAllocationAssignment_13_3_1 = (Assignment)cGroup_13_3.eContents().get(1);
		private final RuleCall cResAllocationResAllocationParserRuleCall_13_3_1_0 = (RuleCall)cResAllocationAssignment_13_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketSpaceCommaKeyword_13_4 = (Keyword)cGroup_13.eContents().get(4);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cRulesKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cRuleAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cRuleRuleParserRuleCall_14_2_0 = (RuleCall)cRuleAssignment_14_2.eContents().get(0);
		private final Group cGroup_14_3 = (Group)cGroup_14.eContents().get(3);
		private final Keyword cCommaKeyword_14_3_0 = (Keyword)cGroup_14_3.eContents().get(0);
		private final Assignment cRuleAssignment_14_3_1 = (Assignment)cGroup_14_3.eContents().get(1);
		private final RuleCall cRuleRuleParserRuleCall_14_3_1_0 = (RuleCall)cRuleAssignment_14_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_14_4 = (Keyword)cGroup_14.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//PeriodicActivity:
		//	{PeriodicActivity} "PeriodicActivity" name=EString "{" ("atelier" atelier=[exploitation::Atelier|EString] ",")?
		//	"start" "from" start=Date "to" "end" end=Date "," ("every" periodicityNumber=EInt? periodicityType=Periodicity)?
		//	("allocate" "{" resAllocation+=ResAllocation ("," resAllocation+=ResAllocation)* "} ,")? ("rules" "{" rule+=Rule (","
		//	rule+=Rule)* "}")? "}";
		public ParserRule getRule() { return rule; }

		//{PeriodicActivity} "PeriodicActivity" name=EString "{" ("atelier" atelier=[exploitation::Atelier|EString] ",")? "start"
		//"from" start=Date "to" "end" end=Date "," ("every" periodicityNumber=EInt? periodicityType=Periodicity)? ("allocate"
		//"{" resAllocation+=ResAllocation ("," resAllocation+=ResAllocation)* "} ,")? ("rules" "{" rule+=Rule ("," rule+=Rule)*
		//"}")? "}"
		public Group getGroup() { return cGroup; }

		//{PeriodicActivity}
		public Action getPeriodicActivityAction_0() { return cPeriodicActivityAction_0; }

		//"PeriodicActivity"
		public Keyword getPeriodicActivityKeyword_1() { return cPeriodicActivityKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("atelier" atelier=[exploitation::Atelier|EString] ",")?
		public Group getGroup_4() { return cGroup_4; }

		//"atelier"
		public Keyword getAtelierKeyword_4_0() { return cAtelierKeyword_4_0; }

		//atelier=[exploitation::Atelier|EString]
		public Assignment getAtelierAssignment_4_1() { return cAtelierAssignment_4_1; }

		//[exploitation::Atelier|EString]
		public CrossReference getAtelierAtelierCrossReference_4_1_0() { return cAtelierAtelierCrossReference_4_1_0; }

		//EString
		public RuleCall getAtelierAtelierEStringParserRuleCall_4_1_0_1() { return cAtelierAtelierEStringParserRuleCall_4_1_0_1; }

		//","
		public Keyword getCommaKeyword_4_2() { return cCommaKeyword_4_2; }

		//"start"
		public Keyword getStartKeyword_5() { return cStartKeyword_5; }

		//"from"
		public Keyword getFromKeyword_6() { return cFromKeyword_6; }

		//start=Date
		public Assignment getStartAssignment_7() { return cStartAssignment_7; }

		//Date
		public RuleCall getStartDateParserRuleCall_7_0() { return cStartDateParserRuleCall_7_0; }

		//"to"
		public Keyword getToKeyword_8() { return cToKeyword_8; }

		//"end"
		public Keyword getEndKeyword_9() { return cEndKeyword_9; }

		//end=Date
		public Assignment getEndAssignment_10() { return cEndAssignment_10; }

		//Date
		public RuleCall getEndDateParserRuleCall_10_0() { return cEndDateParserRuleCall_10_0; }

		//","
		public Keyword getCommaKeyword_11() { return cCommaKeyword_11; }

		//("every" periodicityNumber=EInt? periodicityType=Periodicity)?
		public Group getGroup_12() { return cGroup_12; }

		//"every"
		public Keyword getEveryKeyword_12_0() { return cEveryKeyword_12_0; }

		//periodicityNumber=EInt?
		public Assignment getPeriodicityNumberAssignment_12_1() { return cPeriodicityNumberAssignment_12_1; }

		//EInt
		public RuleCall getPeriodicityNumberEIntParserRuleCall_12_1_0() { return cPeriodicityNumberEIntParserRuleCall_12_1_0; }

		//periodicityType=Periodicity
		public Assignment getPeriodicityTypeAssignment_12_2() { return cPeriodicityTypeAssignment_12_2; }

		//Periodicity
		public RuleCall getPeriodicityTypePeriodicityEnumRuleCall_12_2_0() { return cPeriodicityTypePeriodicityEnumRuleCall_12_2_0; }

		//("allocate" "{" resAllocation+=ResAllocation ("," resAllocation+=ResAllocation)* "} ,")?
		public Group getGroup_13() { return cGroup_13; }

		//"allocate"
		public Keyword getAllocateKeyword_13_0() { return cAllocateKeyword_13_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_13_1() { return cLeftCurlyBracketKeyword_13_1; }

		//resAllocation+=ResAllocation
		public Assignment getResAllocationAssignment_13_2() { return cResAllocationAssignment_13_2; }

		//ResAllocation
		public RuleCall getResAllocationResAllocationParserRuleCall_13_2_0() { return cResAllocationResAllocationParserRuleCall_13_2_0; }

		//("," resAllocation+=ResAllocation)*
		public Group getGroup_13_3() { return cGroup_13_3; }

		//","
		public Keyword getCommaKeyword_13_3_0() { return cCommaKeyword_13_3_0; }

		//resAllocation+=ResAllocation
		public Assignment getResAllocationAssignment_13_3_1() { return cResAllocationAssignment_13_3_1; }

		//ResAllocation
		public RuleCall getResAllocationResAllocationParserRuleCall_13_3_1_0() { return cResAllocationResAllocationParserRuleCall_13_3_1_0; }

		//"} ,"
		public Keyword getRightCurlyBracketSpaceCommaKeyword_13_4() { return cRightCurlyBracketSpaceCommaKeyword_13_4; }

		//("rules" "{" rule+=Rule ("," rule+=Rule)* "}")?
		public Group getGroup_14() { return cGroup_14; }

		//"rules"
		public Keyword getRulesKeyword_14_0() { return cRulesKeyword_14_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_14_1() { return cLeftCurlyBracketKeyword_14_1; }

		//rule+=Rule
		public Assignment getRuleAssignment_14_2() { return cRuleAssignment_14_2; }

		//Rule
		public RuleCall getRuleRuleParserRuleCall_14_2_0() { return cRuleRuleParserRuleCall_14_2_0; }

		//("," rule+=Rule)*
		public Group getGroup_14_3() { return cGroup_14_3; }

		//","
		public Keyword getCommaKeyword_14_3_0() { return cCommaKeyword_14_3_0; }

		//rule+=Rule
		public Assignment getRuleAssignment_14_3_1() { return cRuleAssignment_14_3_1; }

		//Rule
		public RuleCall getRuleRuleParserRuleCall_14_3_1_0() { return cRuleRuleParserRuleCall_14_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_14_4() { return cRightCurlyBracketKeyword_14_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
	}

	public class AtelierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Atelier");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAtelier_ImplParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cElevageParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCultureParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Atelier returns exploitation::Atelier:
		//	Atelier_Impl | Elevage | Culture;
		public ParserRule getRule() { return rule; }

		//Atelier_Impl | Elevage | Culture
		public Alternatives getAlternatives() { return cAlternatives; }

		//Atelier_Impl
		public RuleCall getAtelier_ImplParserRuleCall_0() { return cAtelier_ImplParserRuleCall_0; }

		//Elevage
		public RuleCall getElevageParserRuleCall_1() { return cElevageParserRuleCall_1; }

		//Culture
		public RuleCall getCultureParserRuleCall_2() { return cCultureParserRuleCall_2; }
	}

	public class DateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Date");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDateAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cDayAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDayEIntParserRuleCall_1_0 = (RuleCall)cDayAssignment_1.eContents().get(0);
		
		//Date:
		//	{Date} day=EInt;
		public ParserRule getRule() { return rule; }

		//{Date} day=EInt
		public Group getGroup() { return cGroup; }

		//{Date}
		public Action getDateAction_0() { return cDateAction_0; }

		//day=EInt
		public Assignment getDayAssignment_1() { return cDayAssignment_1; }

		//EInt
		public RuleCall getDayEIntParserRuleCall_1_0() { return cDayEIntParserRuleCall_1_0; }
	}

	public class ResAllocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ResAllocation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRessourceAllocationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReserveKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRessourceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cRessourceRessourceCrossReference_2_0 = (CrossReference)cRessourceAssignment_2.eContents().get(0);
		private final RuleCall cRessourceRessourceIDTerminalRuleCall_2_0_1 = (RuleCall)cRessourceRessourceCrossReference_2_0.eContents().get(1);
		private final Keyword cForKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDureeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDureeEIntParserRuleCall_4_0 = (RuleCall)cDureeAssignment_4.eContents().get(0);
		
		//ResAllocation returns RessourceAllocation:
		//	{RessourceAllocation} "reserve" ressource=[exploitation::Ressource] "for" duree=EInt;
		public ParserRule getRule() { return rule; }

		//{RessourceAllocation} "reserve" ressource=[exploitation::Ressource] "for" duree=EInt
		public Group getGroup() { return cGroup; }

		//{RessourceAllocation}
		public Action getRessourceAllocationAction_0() { return cRessourceAllocationAction_0; }

		//"reserve"
		public Keyword getReserveKeyword_1() { return cReserveKeyword_1; }

		//ressource=[exploitation::Ressource]
		public Assignment getRessourceAssignment_2() { return cRessourceAssignment_2; }

		//[exploitation::Ressource]
		public CrossReference getRessourceRessourceCrossReference_2_0() { return cRessourceRessourceCrossReference_2_0; }

		//ID
		public RuleCall getRessourceRessourceIDTerminalRuleCall_2_0_1() { return cRessourceRessourceIDTerminalRuleCall_2_0_1; }

		//"for"
		public Keyword getForKeyword_3() { return cForKeyword_3; }

		//duree=EInt
		public Assignment getDureeAssignment_4() { return cDureeAssignment_4; }

		//EInt
		public RuleCall getDureeEIntParserRuleCall_4_0() { return cDureeEIntParserRuleCall_4_0; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING | ID;
		public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRuleAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cPreKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cPreAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cPrePredicateParserRuleCall_1_1_0 = (RuleCall)cPreAssignment_1_1.eContents().get(0);
		
		//Rule:
		//	{Rule} ("pre" pre+=Predicate)*;
		public ParserRule getRule() { return rule; }

		//{Rule} ("pre" pre+=Predicate)*
		public Group getGroup() { return cGroup; }

		//{Rule}
		public Action getRuleAction_0() { return cRuleAction_0; }

		//("pre" pre+=Predicate)*
		public Group getGroup_1() { return cGroup_1; }

		//"pre"
		public Keyword getPreKeyword_1_0() { return cPreKeyword_1_0; }

		//pre+=Predicate
		public Assignment getPreAssignment_1_1() { return cPreAssignment_1_1; }

		//Predicate
		public RuleCall getPrePredicateParserRuleCall_1_1_0() { return cPrePredicateParserRuleCall_1_1_0; }
	}

	public class Atelier_ImplElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Atelier_Impl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAtelierAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAtelierKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cActivityKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cActivityAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cActivityPeriodicActivityCrossReference_3_1_0 = (CrossReference)cActivityAssignment_3_1.eContents().get(0);
		private final RuleCall cActivityPeriodicActivityEStringParserRuleCall_3_1_0_1 = (RuleCall)cActivityPeriodicActivityCrossReference_3_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Atelier_Impl returns exploitation::Atelier:
		//	{exploitation::Atelier} "Atelier" "{" ("activity" activity+=[PeriodicActivity|EString])? "}";
		public ParserRule getRule() { return rule; }

		//{exploitation::Atelier} "Atelier" "{" ("activity" activity+=[PeriodicActivity|EString])? "}"
		public Group getGroup() { return cGroup; }

		//{exploitation::Atelier}
		public Action getAtelierAction_0() { return cAtelierAction_0; }

		//"Atelier"
		public Keyword getAtelierKeyword_1() { return cAtelierKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("activity" activity+=[PeriodicActivity|EString])?
		public Group getGroup_3() { return cGroup_3; }

		//"activity"
		public Keyword getActivityKeyword_3_0() { return cActivityKeyword_3_0; }

		//activity+=[PeriodicActivity|EString]
		public Assignment getActivityAssignment_3_1() { return cActivityAssignment_3_1; }

		//[PeriodicActivity|EString]
		public CrossReference getActivityPeriodicActivityCrossReference_3_1_0() { return cActivityPeriodicActivityCrossReference_3_1_0; }

		//EString
		public RuleCall getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1() { return cActivityPeriodicActivityEStringParserRuleCall_3_1_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt returns ecore::EInt:
		//	"-"? INT;
		public ParserRule getRule() { return rule; }

		//"-"? INT
		public Group getGroup() { return cGroup; }

		//"-"?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}

	public class RessourceTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RessourceType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRessourceTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRessourceTypeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//RessourceType returns exploitation::RessourceType:
		//	{exploitation::RessourceType} "RessourceType" name=EString;
		public ParserRule getRule() { return rule; }

		//{exploitation::RessourceType} "RessourceType" name=EString
		public Group getGroup() { return cGroup; }

		//{exploitation::RessourceType}
		public Action getRessourceTypeAction_0() { return cRessourceTypeAction_0; }

		//"RessourceType"
		public Keyword getRessourceTypeKeyword_1() { return cRessourceTypeKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
	}

	public class PredicateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Predicate");
		private final Action cPredicatAction = (Action)rule.eContents().get(1);
		
		//Predicate returns Predicat:
		//	{Predicat};
		public ParserRule getRule() { return rule; }

		//{Predicat}
		public Action getPredicatAction() { return cPredicatAction; }
	}

	public class ElevageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Elevage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cElevageAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cElevageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cActivityKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cActivityAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cActivityPeriodicActivityCrossReference_3_1_0 = (CrossReference)cActivityAssignment_3_1.eContents().get(0);
		private final RuleCall cActivityPeriodicActivityEStringParserRuleCall_3_1_0_1 = (RuleCall)cActivityPeriodicActivityCrossReference_3_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Elevage returns exploitation::Elevage:
		//	{exploitation::Elevage} "Elevage" "{" ("activity" activity+=[PeriodicActivity|EString])? "}";
		public ParserRule getRule() { return rule; }

		//{exploitation::Elevage} "Elevage" "{" ("activity" activity+=[PeriodicActivity|EString])? "}"
		public Group getGroup() { return cGroup; }

		//{exploitation::Elevage}
		public Action getElevageAction_0() { return cElevageAction_0; }

		//"Elevage"
		public Keyword getElevageKeyword_1() { return cElevageKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("activity" activity+=[PeriodicActivity|EString])?
		public Group getGroup_3() { return cGroup_3; }

		//"activity"
		public Keyword getActivityKeyword_3_0() { return cActivityKeyword_3_0; }

		//activity+=[PeriodicActivity|EString]
		public Assignment getActivityAssignment_3_1() { return cActivityAssignment_3_1; }

		//[PeriodicActivity|EString]
		public CrossReference getActivityPeriodicActivityCrossReference_3_1_0() { return cActivityPeriodicActivityCrossReference_3_1_0; }

		//EString
		public RuleCall getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1() { return cActivityPeriodicActivityEStringParserRuleCall_3_1_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class CultureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Culture");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCultureAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCultureKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cActivityKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cActivityAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cActivityPeriodicActivityCrossReference_3_1_0 = (CrossReference)cActivityAssignment_3_1.eContents().get(0);
		private final RuleCall cActivityPeriodicActivityEStringParserRuleCall_3_1_0_1 = (RuleCall)cActivityPeriodicActivityCrossReference_3_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Culture returns exploitation::Culture:
		//	{exploitation::Culture} "Culture" "{" ("activity" activity+=[PeriodicActivity|EString])? "}";
		public ParserRule getRule() { return rule; }

		//{exploitation::Culture} "Culture" "{" ("activity" activity+=[PeriodicActivity|EString])? "}"
		public Group getGroup() { return cGroup; }

		//{exploitation::Culture}
		public Action getCultureAction_0() { return cCultureAction_0; }

		//"Culture"
		public Keyword getCultureKeyword_1() { return cCultureKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("activity" activity+=[PeriodicActivity|EString])?
		public Group getGroup_3() { return cGroup_3; }

		//"activity"
		public Keyword getActivityKeyword_3_0() { return cActivityKeyword_3_0; }

		//activity+=[PeriodicActivity|EString]
		public Assignment getActivityAssignment_3_1() { return cActivityAssignment_3_1; }

		//[PeriodicActivity|EString]
		public CrossReference getActivityPeriodicActivityCrossReference_3_1_0() { return cActivityPeriodicActivityCrossReference_3_1_0; }

		//EString
		public RuleCall getActivityPeriodicActivityEStringParserRuleCall_3_1_0_1() { return cActivityPeriodicActivityEStringParserRuleCall_3_1_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	
	public class PeriodicityElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Periodicity");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMonthsEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMonthsMonthsKeyword_0_0 = (Keyword)cMonthsEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDaysEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDaysDaysKeyword_1_0 = (Keyword)cDaysEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cWeeksEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cWeeksWeeksKeyword_2_0 = (Keyword)cWeeksEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cYearsEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cYearsYearsKeyword_3_0 = (Keyword)cYearsEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cHoursEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cHoursHoursKeyword_4_0 = (Keyword)cHoursEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum Periodicity returns periodicity:
		//	months | days | weeks | years | hours;
		public EnumRule getRule() { return rule; }

		//months | days | weeks | years | hours
		public Alternatives getAlternatives() { return cAlternatives; }

		//months
		public EnumLiteralDeclaration getMonthsEnumLiteralDeclaration_0() { return cMonthsEnumLiteralDeclaration_0; }

		//"months"
		public Keyword getMonthsMonthsKeyword_0_0() { return cMonthsMonthsKeyword_0_0; }

		//days
		public EnumLiteralDeclaration getDaysEnumLiteralDeclaration_1() { return cDaysEnumLiteralDeclaration_1; }

		//"days"
		public Keyword getDaysDaysKeyword_1_0() { return cDaysDaysKeyword_1_0; }

		//weeks
		public EnumLiteralDeclaration getWeeksEnumLiteralDeclaration_2() { return cWeeksEnumLiteralDeclaration_2; }

		//"weeks"
		public Keyword getWeeksWeeksKeyword_2_0() { return cWeeksWeeksKeyword_2_0; }

		//years
		public EnumLiteralDeclaration getYearsEnumLiteralDeclaration_3() { return cYearsEnumLiteralDeclaration_3; }

		//"years"
		public Keyword getYearsYearsKeyword_3_0() { return cYearsYearsKeyword_3_0; }

		//hours
		public EnumLiteralDeclaration getHoursEnumLiteralDeclaration_4() { return cHoursEnumLiteralDeclaration_4; }

		//"hours"
		public Keyword getHoursHoursKeyword_4_0() { return cHoursHoursKeyword_4_0; }
	}
	
	private PeriodicActivityElements pPeriodicActivity;
	private PeriodicityElements unknownRulePeriodicity;
	private AtelierElements pAtelier;
	private DateElements pDate;
	private ResAllocationElements pResAllocation;
	private EStringElements pEString;
	private RuleElements pRule;
	private Atelier_ImplElements pAtelier_Impl;
	private EIntElements pEInt;
	private RessourceTypeElements pRessourceType;
	private PredicateElements pPredicate;
	private ElevageElements pElevage;
	private CultureElements pCulture;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public ActGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.activity.Act".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//PeriodicActivity:
	//	{PeriodicActivity} "PeriodicActivity" name=EString "{" ("atelier" atelier=[exploitation::Atelier|EString] ",")?
	//	"start" "from" start=Date "to" "end" end=Date "," ("every" periodicityNumber=EInt? periodicityType=Periodicity)?
	//	("allocate" "{" resAllocation+=ResAllocation ("," resAllocation+=ResAllocation)* "} ,")? ("rules" "{" rule+=Rule (","
	//	rule+=Rule)* "}")? "}";
	public PeriodicActivityElements getPeriodicActivityAccess() {
		return (pPeriodicActivity != null) ? pPeriodicActivity : (pPeriodicActivity = new PeriodicActivityElements());
	}
	
	public ParserRule getPeriodicActivityRule() {
		return getPeriodicActivityAccess().getRule();
	}

	//enum Periodicity returns periodicity:
	//	months | days | weeks | years | hours;
	public PeriodicityElements getPeriodicityAccess() {
		return (unknownRulePeriodicity != null) ? unknownRulePeriodicity : (unknownRulePeriodicity = new PeriodicityElements());
	}
	
	public EnumRule getPeriodicityRule() {
		return getPeriodicityAccess().getRule();
	}

	//Atelier returns exploitation::Atelier:
	//	Atelier_Impl | Elevage | Culture;
	public AtelierElements getAtelierAccess() {
		return (pAtelier != null) ? pAtelier : (pAtelier = new AtelierElements());
	}
	
	public ParserRule getAtelierRule() {
		return getAtelierAccess().getRule();
	}

	//Date:
	//	{Date} day=EInt;
	public DateElements getDateAccess() {
		return (pDate != null) ? pDate : (pDate = new DateElements());
	}
	
	public ParserRule getDateRule() {
		return getDateAccess().getRule();
	}

	//ResAllocation returns RessourceAllocation:
	//	{RessourceAllocation} "reserve" ressource=[exploitation::Ressource] "for" duree=EInt;
	public ResAllocationElements getResAllocationAccess() {
		return (pResAllocation != null) ? pResAllocation : (pResAllocation = new ResAllocationElements());
	}
	
	public ParserRule getResAllocationRule() {
		return getResAllocationAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return (pEString != null) ? pEString : (pEString = new EStringElements());
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//Rule:
	//	{Rule} ("pre" pre+=Predicate)*;
	public RuleElements getRuleAccess() {
		return (pRule != null) ? pRule : (pRule = new RuleElements());
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}

	//Atelier_Impl returns exploitation::Atelier:
	//	{exploitation::Atelier} "Atelier" "{" ("activity" activity+=[PeriodicActivity|EString])? "}";
	public Atelier_ImplElements getAtelier_ImplAccess() {
		return (pAtelier_Impl != null) ? pAtelier_Impl : (pAtelier_Impl = new Atelier_ImplElements());
	}
	
	public ParserRule getAtelier_ImplRule() {
		return getAtelier_ImplAccess().getRule();
	}

	//EInt returns ecore::EInt:
	//	"-"? INT;
	public EIntElements getEIntAccess() {
		return (pEInt != null) ? pEInt : (pEInt = new EIntElements());
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}

	//RessourceType returns exploitation::RessourceType:
	//	{exploitation::RessourceType} "RessourceType" name=EString;
	public RessourceTypeElements getRessourceTypeAccess() {
		return (pRessourceType != null) ? pRessourceType : (pRessourceType = new RessourceTypeElements());
	}
	
	public ParserRule getRessourceTypeRule() {
		return getRessourceTypeAccess().getRule();
	}

	//Predicate returns Predicat:
	//	{Predicat};
	public PredicateElements getPredicateAccess() {
		return (pPredicate != null) ? pPredicate : (pPredicate = new PredicateElements());
	}
	
	public ParserRule getPredicateRule() {
		return getPredicateAccess().getRule();
	}

	//Elevage returns exploitation::Elevage:
	//	{exploitation::Elevage} "Elevage" "{" ("activity" activity+=[PeriodicActivity|EString])? "}";
	public ElevageElements getElevageAccess() {
		return (pElevage != null) ? pElevage : (pElevage = new ElevageElements());
	}
	
	public ParserRule getElevageRule() {
		return getElevageAccess().getRule();
	}

	//Culture returns exploitation::Culture:
	//	{exploitation::Culture} "Culture" "{" ("activity" activity+=[PeriodicActivity|EString])? "}";
	public CultureElements getCultureAccess() {
		return (pCulture != null) ? pCulture : (pCulture = new CultureElements());
	}
	
	public ParserRule getCultureRule() {
		return getCultureAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}

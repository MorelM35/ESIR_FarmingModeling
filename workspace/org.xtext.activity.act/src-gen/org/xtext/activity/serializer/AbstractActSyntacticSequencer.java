package org.xtext.activity.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.activity.services.ActGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractActSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ActGrammarAccess grammarAccess;
	protected AbstractElementAlias match_PeriodicActivity___EveryKeyword_11_0___DayKeyword_11_1_1_or_HourKeyword_11_1_0_or_MonthKeyword_11_1_3_or_WeekKeyword_11_1_2_or_YearKeyword_11_1_4____q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ActGrammarAccess) access;
		match_PeriodicActivity___EveryKeyword_11_0___DayKeyword_11_1_1_or_HourKeyword_11_1_0_or_MonthKeyword_11_1_3_or_WeekKeyword_11_1_2_or_YearKeyword_11_1_4____q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPeriodicActivityAccess().getEveryKeyword_11_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPeriodicActivityAccess().getDayKeyword_11_1_1()), new TokenAlias(false, false, grammarAccess.getPeriodicActivityAccess().getHourKeyword_11_1_0()), new TokenAlias(false, false, grammarAccess.getPeriodicActivityAccess().getMonthKeyword_11_1_3()), new TokenAlias(false, false, grammarAccess.getPeriodicActivityAccess().getWeekKeyword_11_1_2()), new TokenAlias(false, false, grammarAccess.getPeriodicActivityAccess().getYearKeyword_11_1_4())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_PeriodicActivity___EveryKeyword_11_0___DayKeyword_11_1_1_or_HourKeyword_11_1_0_or_MonthKeyword_11_1_3_or_WeekKeyword_11_1_2_or_YearKeyword_11_1_4____q.equals(syntax))
				emit_PeriodicActivity___EveryKeyword_11_0___DayKeyword_11_1_1_or_HourKeyword_11_1_0_or_MonthKeyword_11_1_3_or_WeekKeyword_11_1_2_or_YearKeyword_11_1_4____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('every' ('day' | 'week' | 'year' | 'month' | 'hour'))?
	 */
	protected void emit_PeriodicActivity___EveryKeyword_11_0___DayKeyword_11_1_1_or_HourKeyword_11_1_0_or_MonthKeyword_11_1_3_or_WeekKeyword_11_1_2_or_YearKeyword_11_1_4____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

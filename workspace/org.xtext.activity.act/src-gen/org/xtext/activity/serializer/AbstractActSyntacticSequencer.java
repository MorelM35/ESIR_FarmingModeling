package org.xtext.activity.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.activity.services.ActGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractActSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ActGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Evapotranspiration_EtpKeyword_1_0_or_EvapotranspirationKeyword_1_1;
	protected AbstractElementAlias match_Precipitation_PrecipitationKeyword_1_1_or_RrKeyword_1_0;
	protected AbstractElementAlias match_Rayonnement_ParKeyword_1_0_or_RayonnementKeyword_1_1;
	protected AbstractElementAlias match_Temperature_TemperatureKeyword_1_1_or_TmKeyword_1_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ActGrammarAccess) access;
		match_Evapotranspiration_EtpKeyword_1_0_or_EvapotranspirationKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getEvapotranspirationAccess().getEtpKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getEvapotranspirationAccess().getEvapotranspirationKeyword_1_1()));
		match_Precipitation_PrecipitationKeyword_1_1_or_RrKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPrecipitationAccess().getPrecipitationKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getPrecipitationAccess().getRrKeyword_1_0()));
		match_Rayonnement_ParKeyword_1_0_or_RayonnementKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRayonnementAccess().getParKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getRayonnementAccess().getRayonnementKeyword_1_1()));
		match_Temperature_TemperatureKeyword_1_1_or_TmKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTemperatureAccess().getTemperatureKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getTemperatureAccess().getTmKeyword_1_0()));
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
			if(match_Evapotranspiration_EtpKeyword_1_0_or_EvapotranspirationKeyword_1_1.equals(syntax))
				emit_Evapotranspiration_EtpKeyword_1_0_or_EvapotranspirationKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Precipitation_PrecipitationKeyword_1_1_or_RrKeyword_1_0.equals(syntax))
				emit_Precipitation_PrecipitationKeyword_1_1_or_RrKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rayonnement_ParKeyword_1_0_or_RayonnementKeyword_1_1.equals(syntax))
				emit_Rayonnement_ParKeyword_1_0_or_RayonnementKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Temperature_TemperatureKeyword_1_1_or_TmKeyword_1_0.equals(syntax))
				emit_Temperature_TemperatureKeyword_1_1_or_TmKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'evapotranspiration' | 'etp'
	 */
	protected void emit_Evapotranspiration_EtpKeyword_1_0_or_EvapotranspirationKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'rr' | 'precipitation'
	 */
	protected void emit_Precipitation_PrecipitationKeyword_1_1_or_RrKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'rayonnement' | 'par'
	 */
	protected void emit_Rayonnement_ParKeyword_1_0_or_RayonnementKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'temperature' | 'tm'
	 */
	protected void emit_Temperature_TemperatureKeyword_1_1_or_TmKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

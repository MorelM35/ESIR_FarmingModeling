package org.xtext.activity.serializer;

import activity.ActivityPackage;
import activity.Date;
import activity.PeriodicActivity;
import activity.Predicat;
import activity.RessourceAllocation;
import activity.Rule;
import com.google.inject.Inject;
import com.google.inject.Provider;
import exploitation.Atelier;
import exploitation.Culture;
import exploitation.Elevage;
import exploitation.ExploitationPackage;
import exploitation.RessourceType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.activity.services.ActGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractActSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ActGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ActivityPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ActivityPackage.DATE:
				if(context == grammarAccess.getDateRule()) {
					sequence_Date(context, (Date) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.PERIODIC_ACTIVITY:
				if(context == grammarAccess.getPeriodicActivityRule()) {
					sequence_PeriodicActivity(context, (PeriodicActivity) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.PREDICAT:
				if(context == grammarAccess.getPredicateRule()) {
					sequence_Predicate(context, (Predicat) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.RESSOURCE_ALLOCATION:
				if(context == grammarAccess.getResAllocationRule()) {
					sequence_ResAllocation(context, (RessourceAllocation) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.RULE:
				if(context == grammarAccess.getRuleRule()) {
					sequence_Rule(context, (Rule) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ExploitationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExploitationPackage.ATELIER:
				if(context == grammarAccess.getAtelierRule() ||
				   context == grammarAccess.getAtelier_ImplRule()) {
					sequence_Atelier_Impl(context, (Atelier) semanticObject); 
					return; 
				}
				else break;
			case ExploitationPackage.CULTURE:
				if(context == grammarAccess.getAtelierRule() ||
				   context == grammarAccess.getCultureRule()) {
					sequence_Culture(context, (Culture) semanticObject); 
					return; 
				}
				else break;
			case ExploitationPackage.ELEVAGE:
				if(context == grammarAccess.getAtelierRule() ||
				   context == grammarAccess.getElevageRule()) {
					sequence_Elevage(context, (Elevage) semanticObject); 
					return; 
				}
				else break;
			case ExploitationPackage.RESSOURCE_TYPE:
				if(context == grammarAccess.getRessourceTypeRule()) {
					sequence_RessourceType(context, (RessourceType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (activity+=[PeriodicActivity|EString]?)
	 */
	protected void sequence_Atelier_Impl(EObject context, Atelier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (activity+=[PeriodicActivity|EString]?)
	 */
	protected void sequence_Culture(EObject context, Culture semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     day=EInt
	 */
	protected void sequence_Date(EObject context, Date semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.DATE__DAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.DATE__DAY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDateAccess().getDayEIntParserRuleCall_2_0(), semanticObject.getDay());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (activity+=[PeriodicActivity|EString]?)
	 */
	protected void sequence_Elevage(EObject context, Elevage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         atelier=[Atelier|EString]? 
	 *         start=Date 
	 *         end=Date 
	 *         (resAllocation+=ResAllocation resAllocation+=ResAllocation*)? 
	 *         (rule+=Rule rule+=Rule*)?
	 *     )
	 */
	protected void sequence_PeriodicActivity(EObject context, PeriodicActivity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Predicat}
	 */
	protected void sequence_Predicate(EObject context, Predicat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ressource=[Ressource|ID] duree=EInt)
	 */
	protected void sequence_ResAllocation(EObject context, RessourceAllocation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.RESSOURCE_ALLOCATION__DUREE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.RESSOURCE_ALLOCATION__DUREE));
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.RESSOURCE_ALLOCATION__RESSOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.RESSOURCE_ALLOCATION__RESSOURCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResAllocationAccess().getRessourceRessourceIDTerminalRuleCall_2_0_1(), semanticObject.getRessource());
		feeder.accept(grammarAccess.getResAllocationAccess().getDureeEIntParserRuleCall_4_0(), semanticObject.getDuree());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_RessourceType(EObject context, RessourceType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExploitationPackage.Literals.RESSOURCE_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExploitationPackage.Literals.RESSOURCE_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRessourceTypeAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (pre+=Predicate*)
	 */
	protected void sequence_Rule(EObject context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

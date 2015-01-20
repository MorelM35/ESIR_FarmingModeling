package org.xtext.activity.serializer;

import activity.ActivityPackage;
import activity.BinaryExpression;
import activity.CheckDoneActivity;
import activity.Date;
import activity.EvapoTranspiration;
import activity.GrainState;
import activity.Model;
import activity.NoRain;
import activity.PeriodicActivity;
import activity.Precipitation;
import activity.Predicat;
import activity.Rayonnement;
import activity.RessourceAllocation;
import activity.Temperature;
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
			case ActivityPackage.BINARY_EXPRESSION:
				if(context == grammarAccess.getBinaryExppressionRule()) {
					sequence_BinaryExppression(context, (BinaryExpression) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.CHECK_DONE_ACTIVITY:
				if(context == grammarAccess.getCheckDoneActivityRule() ||
				   context == grammarAccess.getPredicateRule()) {
					sequence_CheckDoneActivity(context, (CheckDoneActivity) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.DATE:
				if(context == grammarAccess.getDateRule()) {
					sequence_Date(context, (Date) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.EVAPO_TRANSPIRATION:
				if(context == grammarAccess.getEvapotranspirationRule() ||
				   context == grammarAccess.getPredicateRule()) {
					sequence_Evapotranspiration(context, (EvapoTranspiration) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.GRAIN_STATE:
				if(context == grammarAccess.getGrainStateRule() ||
				   context == grammarAccess.getPredicateRule()) {
					sequence_GrainState(context, (GrainState) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.NO_RAIN:
				if(context == grammarAccess.getNoRainRule() ||
				   context == grammarAccess.getPredicateRule()) {
					sequence_NoRain(context, (NoRain) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.PERIODIC_ACTIVITY:
				if(context == grammarAccess.getPeriodicActivityRule()) {
					sequence_PeriodicActivity(context, (PeriodicActivity) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.PRECIPITATION:
				if(context == grammarAccess.getPrecipitationRule() ||
				   context == grammarAccess.getPredicateRule()) {
					sequence_Precipitation(context, (Precipitation) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.PREDICAT:
				if(context == grammarAccess.getPredicateRule()) {
					sequence_Predicate(context, (Predicat) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.RAYONNEMENT:
				if(context == grammarAccess.getPredicateRule() ||
				   context == grammarAccess.getRayonnementRule()) {
					sequence_Rayonnement(context, (Rayonnement) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.RESSOURCE_ALLOCATION:
				if(context == grammarAccess.getResAllocationRule()) {
					sequence_ResAllocation(context, (RessourceAllocation) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.TEMPERATURE:
				if(context == grammarAccess.getPredicateRule() ||
				   context == grammarAccess.getTemperatureRule()) {
					sequence_Temperature(context, (Temperature) semanticObject); 
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
	 *     ((left=Predicate | left=BinaryExppression) (ope=BinaryExppressionType right=BinaryExppression)?)
	 */
	protected void sequence_BinaryExppression(EObject context, BinaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (activityToValidate=[PeriodicActivity|ID] elapsedTime=EInt periodicityType=Periodicity)
	 */
	protected void sequence_CheckDoneActivity(EObject context, CheckDoneActivity semanticObject) {
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
	 *     (day=EInt month=Month)
	 */
	protected void sequence_Date(EObject context, Date semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.DATE__DAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.DATE__DAY));
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.DATE__MONTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.DATE__MONTH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDateAccess().getDayEIntParserRuleCall_1_0(), semanticObject.getDay());
		feeder.accept(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_2_0(), semanticObject.getMonth());
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
	 *     (comparator=Comparator value=EFloat)
	 */
	protected void sequence_Evapotranspiration(EObject context, EvapoTranspiration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     state=GrainStateEnum
	 */
	protected void sequence_GrainState(EObject context, GrainState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString activity+=PeriodicActivity*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((elapsedTime=EInt periodicityType=Periodicity) | date=Date)
	 */
	protected void sequence_NoRain(EObject context, NoRain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         atelier=[Atelier|EString]? 
	 *         start=Date 
	 *         end=Date 
	 *         (frequency=EInt? periodicityType=Periodicity)? 
	 *         (resAllocation+=ResAllocation resAllocation+=ResAllocation*)? 
	 *         rule+=BinaryExppression?
	 *     )
	 */
	protected void sequence_PeriodicActivity(EObject context, PeriodicActivity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comparator=Comparator height=EFloat)
	 */
	protected void sequence_Precipitation(EObject context, Precipitation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     date=Date
	 */
	protected void sequence_Predicate(EObject context, Predicat semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.PREDICAT__DATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.PREDICAT__DATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateAccess().getDateDateParserRuleCall_0_1_1_0(), semanticObject.getDate());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (comparator=Comparator value=EFloat)
	 */
	protected void sequence_Rayonnement(EObject context, Rayonnement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ressource=[Ressource|EString] duration=EInt periodicityType=Periodicity)
	 */
	protected void sequence_ResAllocation(EObject context, RessourceAllocation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.RESSOURCE_ALLOCATION__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.RESSOURCE_ALLOCATION__DURATION));
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.RESSOURCE_ALLOCATION__RESSOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.RESSOURCE_ALLOCATION__RESSOURCE));
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.RESSOURCE_ALLOCATION__PERIODICITY_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.RESSOURCE_ALLOCATION__PERIODICITY_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResAllocationAccess().getRessourceRessourceEStringParserRuleCall_2_0_1(), semanticObject.getRessource());
		feeder.accept(grammarAccess.getResAllocationAccess().getDurationEIntParserRuleCall_4_0(), semanticObject.getDuration());
		feeder.accept(grammarAccess.getResAllocationAccess().getPeriodicityTypePeriodicityEnumRuleCall_5_0(), semanticObject.getPeriodicityType());
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
	 *     (comparator=Comparator value=EFloat)
	 */
	protected void sequence_Temperature(EObject context, Temperature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

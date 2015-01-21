package org.xtext.launcher.serializer;

import activity.ActivityPackage;
import activity.Date;
import activity.Launcher;
import com.google.inject.Inject;
import com.google.inject.Provider;
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
import org.xtext.launcher.services.StartGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractStartSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StartGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ActivityPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ActivityPackage.DATE:
				if(context == grammarAccess.getDateRule()) {
					sequence_Date(context, (Date) semanticObject); 
					return; 
				}
				else break;
			case ActivityPackage.LAUNCHER:
				if(context == grammarAccess.getLauncherRule()) {
					sequence_Launcher(context, (Launcher) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (day=EInt month=Month year=EInt)
	 */
	protected void sequence_Date(EObject context, Date semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.DATE__DAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.DATE__DAY));
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.DATE__MONTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.DATE__MONTH));
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.DATE__YEAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.DATE__YEAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDateAccess().getDayEIntParserRuleCall_1_0(), semanticObject.getDay());
		feeder.accept(grammarAccess.getDateAccess().getMonthMonthEnumRuleCall_2_0(), semanticObject.getMonth());
		feeder.accept(grammarAccess.getDateAccess().getYearEIntParserRuleCall_3_0(), semanticObject.getYear());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (begin=Date end=Date qMax=EInt quantityOfWater=EInt)
	 */
	protected void sequence_Launcher(EObject context, Launcher semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.LAUNCHER__BEGIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.LAUNCHER__BEGIN));
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.LAUNCHER__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.LAUNCHER__END));
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.LAUNCHER__QMAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.LAUNCHER__QMAX));
			if(transientValues.isValueTransient(semanticObject, ActivityPackage.Literals.LAUNCHER__QUANTITY_OF_WATER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityPackage.Literals.LAUNCHER__QUANTITY_OF_WATER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLauncherAccess().getBeginDateParserRuleCall_3_0(), semanticObject.getBegin());
		feeder.accept(grammarAccess.getLauncherAccess().getEndDateParserRuleCall_5_0(), semanticObject.getEnd());
		feeder.accept(grammarAccess.getLauncherAccess().getQMaxEIntParserRuleCall_9_0(), semanticObject.getQMax());
		feeder.accept(grammarAccess.getLauncherAccess().getQuantityOfWaterEIntParserRuleCall_13_0(), semanticObject.getQuantityOfWater());
		feeder.finish();
	}
}

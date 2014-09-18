package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CommentedRule;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Conjunction;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Disjunction;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Expression;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Future;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Globally;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Implication;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Label;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Next;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Rules;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.State;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Until;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.services.PCTLGrammarAccess;
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

@SuppressWarnings("all")
public class PCTLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PCTLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PCTLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PCTLPackage.COMMENTED_RULE:
				if(context == grammarAccess.getCommentedRuleRule()) {
					sequence_CommentedRule(context, (CommentedRule) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.CONJUNCTION:
				if(context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0() ||
				   context == grammarAccess.getJunctionRule()) {
					sequence_Conjunction(context, (Conjunction) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.DISJUNCTION:
				if(context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0() ||
				   context == grammarAccess.getJunctionRule()) {
					sequence_Disjunction(context, (Disjunction) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.EXPRESSION:
				if(context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0() ||
				   context == grammarAccess.getJunctionRule() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getPctlRule() ||
				   context == grammarAccess.getStateFormulaRule() ||
				   context == grammarAccess.getSteadyStateRule()) {
					sequence_StateFormula(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.FUTURE:
				if(context == grammarAccess.getFutureRule() ||
				   context == grammarAccess.getPathFormulaRule() ||
				   context == grammarAccess.getPctlRule() ||
				   context == grammarAccess.getProbabilityRule() ||
				   context == grammarAccess.getQuantifiedProbabilityRule()) {
					sequence_Future(context, (Future) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.GLOBALLY:
				if(context == grammarAccess.getGloballyRule() ||
				   context == grammarAccess.getPathFormulaRule() ||
				   context == grammarAccess.getPctlRule() ||
				   context == grammarAccess.getProbabilityRule() ||
				   context == grammarAccess.getQuantifiedProbabilityRule()) {
					sequence_Globally(context, (Globally) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.IMPLICATION:
				if(context == grammarAccess.getImplicationRule()) {
					sequence_Implication(context, (Implication) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.LABEL:
				if(context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0() ||
				   context == grammarAccess.getJunctionRule() ||
				   context == grammarAccess.getLabelRule() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getPctlRule() ||
				   context == grammarAccess.getStateFormulaRule() ||
				   context == grammarAccess.getSteadyStateRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.NEXT:
				if(context == grammarAccess.getNextRule() ||
				   context == grammarAccess.getPathFormulaRule() ||
				   context == grammarAccess.getPctlRule() ||
				   context == grammarAccess.getProbabilityRule() ||
				   context == grammarAccess.getQuantifiedProbabilityRule()) {
					sequence_Next(context, (Next) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.RULES:
				if(context == grammarAccess.getRulesRule()) {
					sequence_Rules(context, (Rules) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.START:
				if(context == grammarAccess.getStartRule()) {
					sequence_Start(context, (Start) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.STATE:
				if(context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0() ||
				   context == grammarAccess.getJunctionRule() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getPctlRule() ||
				   context == grammarAccess.getStateRule() ||
				   context == grammarAccess.getStateFormulaRule() ||
				   context == grammarAccess.getSteadyStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.UNTIL:
				if(context == grammarAccess.getPathFormulaRule() ||
				   context == grammarAccess.getPctlRule() ||
				   context == grammarAccess.getProbabilityRule() ||
				   context == grammarAccess.getQuantifiedProbabilityRule() ||
				   context == grammarAccess.getUntilRule()) {
					sequence_Until(context, (Until) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (comment=SL_COMMENT? rule=Pctl)
	 */
	protected void sequence_CommentedRule(EObject context, CommentedRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Conjunction_Conjunction_2_0 right=StateFormula)
	 */
	protected void sequence_Conjunction(EObject context, Conjunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getConjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Disjunction_Disjunction_2_0 right=StateFormula)
	 */
	protected void sequence_Disjunction(EObject context, Disjunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDisjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     right=StateFormula
	 */
	protected void sequence_Future(EObject context, Future semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     right=StateFormula
	 */
	protected void sequence_Globally(EObject context, Globally semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     right=StateFormula
	 */
	protected void sequence_Implication(EObject context, Implication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.IMPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.IMPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImplicationAccess().getRightStateFormulaParserRuleCall_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     right=StateFormula
	 */
	protected void sequence_Next(EObject context, Next semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (rule+=CommentedRule rule+=Rules?)
	 */
	protected void sequence_Rules(EObject context, Rules semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     start=Rules?
	 */
	protected void sequence_Start(EObject context, Start semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=StateFormula (right=Junction | right=Implication)?) | left=Probability)
	 */
	protected void sequence_StateFormula(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=StateFormula right=StateFormula)
	 */
	protected void sequence_Until(EObject context, Until semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUntilAccess().getLeftStateFormulaParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUntilAccess().getRightStateFormulaParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
}

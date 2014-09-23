package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.BooleanRule;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Comment;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CompareProbability;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Conjunction;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Disjunction;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Future;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Globally;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Label;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Next;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Probability;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.QuantifiedProbability;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.RightStateExpression;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.State;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateFormula;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.SteadyState;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.TimeBound;
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
			case PCTLPackage.BOOLEAN:
				if(context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getBooleanRule()) {
					sequence_Boolean(context, (de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Boolean) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.BOOLEAN_RULE:
				if(context == grammarAccess.getBooleanRuleRule() ||
				   context == grammarAccess.getFragmentRule() ||
				   context == grammarAccess.getRuleRule()) {
					sequence_BooleanRule(context, (BooleanRule) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.COMMENT:
				if(context == grammarAccess.getCommentRule() ||
				   context == grammarAccess.getFragmentRule()) {
					sequence_Comment(context, (Comment) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.COMPARE_PROBABILITY:
				if(context == grammarAccess.getCompareProbabilityRule()) {
					sequence_CompareProbability(context, (CompareProbability) semanticObject); 
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
			case PCTLPackage.FUTURE:
				if(context == grammarAccess.getFutureRule() ||
				   context == grammarAccess.getPathFormulaRule()) {
					sequence_Future(context, (Future) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.GLOBALLY:
				if(context == grammarAccess.getGloballyRule() ||
				   context == grammarAccess.getPathFormulaRule()) {
					sequence_Globally(context, (Globally) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.LABEL:
				if(context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getLabelRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.NEXT:
				if(context == grammarAccess.getNextRule() ||
				   context == grammarAccess.getPathFormulaRule()) {
					sequence_Next(context, (Next) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.PROBABILITY:
				if(context == grammarAccess.getProbabilityRule()) {
					sequence_Probability(context, (Probability) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.QUANTIFIED_PROBABILITY:
				if(context == grammarAccess.getFragmentRule() ||
				   context == grammarAccess.getQuantifiedProbabilityRule() ||
				   context == grammarAccess.getRuleRule()) {
					sequence_QuantifiedProbability(context, (QuantifiedProbability) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.RIGHT_STATE_EXPRESSION:
				if(context == grammarAccess.getImplicationRule()) {
					sequence_Implication(context, (RightStateExpression) semanticObject); 
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
				   context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.STATE_FORMULA:
				if(context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0() ||
				   context == grammarAccess.getJunctionRule() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getStateFormulaRule()) {
					sequence_StateFormula(context, (StateFormula) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.STEADY_STATE:
				if(context == grammarAccess.getFragmentRule() ||
				   context == grammarAccess.getRuleRule() ||
				   context == grammarAccess.getSteadyStateRule()) {
					sequence_SteadyState(context, (SteadyState) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.TIME_BOUND:
				if(context == grammarAccess.getTimeBoundRule()) {
					sequence_TimeBound(context, (TimeBound) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.UNTIL:
				if(context == grammarAccess.getPathFormulaRule() ||
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
	 *     value=StateFormula
	 */
	protected void sequence_BooleanRule(EObject context, BooleanRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.BOOLEAN_RULE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.BOOLEAN_RULE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanRuleAccess().getValueStateFormulaParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOL
	 */
	protected void sequence_Boolean(EObject context, de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Boolean semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.BOOLEAN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.BOOLEAN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanAccess().getValueBOOLTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     comment=SL_COMMENT
	 */
	protected void sequence_Comment(EObject context, Comment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.COMMENT__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.COMMENT__COMMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommentAccess().getCommentSL_COMMENTTerminalRuleCall_0(), semanticObject.getComment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operator=COMPARATOR value=DOUBLE)
	 */
	protected void sequence_CompareProbability(EObject context, CompareProbability semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.COMPARE_PROBABILITY__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.COMPARE_PROBABILITY__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.COMPARE_PROBABILITY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.COMPARE_PROBABILITY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompareProbabilityAccess().getOperatorCOMPARATORTerminalRuleCall_0_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getCompareProbabilityAccess().getValueDOUBLETerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Conjunction_Conjunction_2_0 right=StateFormula)
	 */
	protected void sequence_Conjunction(EObject context, Conjunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.RIGHT_STATE_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.RIGHT_STATE_EXPRESSION__RIGHT));
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.CONJUNCTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.CONJUNCTION__LEFT));
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
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.RIGHT_STATE_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.RIGHT_STATE_EXPRESSION__RIGHT));
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.DISJUNCTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.DISJUNCTION__LEFT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDisjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (bound=TimeBound? value=StateFormula)
	 */
	protected void sequence_Future(EObject context, Future semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bound=TimeBound? value=StateFormula)
	 */
	protected void sequence_Globally(EObject context, Globally semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     right=StateFormula
	 */
	protected void sequence_Implication(EObject context, RightStateExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.RIGHT_STATE_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.RIGHT_STATE_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImplicationAccess().getRightStateFormulaParserRuleCall_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.LABEL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.LABEL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (bound=TimeBound? value=StateFormula)
	 */
	protected void sequence_Next(EObject context, Next semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comparator=CompareProbability path=PathFormula)
	 */
	protected void sequence_Probability(EObject context, Probability semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.PROBABILITY__COMPARATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.PROBABILITY__COMPARATOR));
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.PROBABILITY__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.PROBABILITY__PATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProbabilityAccess().getComparatorCompareProbabilityParserRuleCall_3_0(), semanticObject.getComparator());
		feeder.accept(grammarAccess.getProbabilityAccess().getPathPathFormulaParserRuleCall_6_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=PathFormula
	 */
	protected void sequence_QuantifiedProbability(EObject context, QuantifiedProbability semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.QUANTIFIED_PROBABILITY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.QUANTIFIED_PROBABILITY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQuantifiedProbabilityAccess().getValuePathFormulaParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     rule+=Fragment*
	 */
	protected void sequence_Start(EObject context, Start semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=StateFormula (right=Junction | right=Implication)?) | left=Negation | left=Atomic | left=Probability)
	 */
	protected void sequence_StateFormula(EObject context, StateFormula semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.STATE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.STATE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (bound=CompareProbability? value=StateFormula)
	 */
	protected void sequence_SteadyState(EObject context, SteadyState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((operator=COMPARATOR | operator='=') value=DOUBLE) | (from=DOUBLE operator=',' to=DOUBLE))
	 */
	protected void sequence_TimeBound(EObject context, TimeBound semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=StateFormula (type='U' | type='W' | type='R') bound=TimeBound? right=StateFormula)
	 */
	protected void sequence_Until(EObject context, Until semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.F;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.G;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Label;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.State;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.U;
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
			case PCTLPackage.F:
				if(context == grammarAccess.getFRule() ||
				   context == grammarAccess.getPRule() ||
				   context == grammarAccess.getP1Rule() ||
				   context == grammarAccess.getStartRule()) {
					sequence_F(context, (F) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.G:
				if(context == grammarAccess.getGRule() ||
				   context == grammarAccess.getPRule() ||
				   context == grammarAccess.getP1Rule() ||
				   context == grammarAccess.getStartRule()) {
					sequence_G(context, (G) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.LABEL:
				if(context == grammarAccess.getLabelRule() ||
				   context == grammarAccess.getPRule() ||
				   context == grammarAccess.getP1Rule() ||
				   context == grammarAccess.getSRule() ||
				   context == grammarAccess.getStartRule() ||
				   context == grammarAccess.getStateOrLabelRule()) {
					sequence_Label(context, (Label) semanticObject); 
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
				if(context == grammarAccess.getPRule() ||
				   context == grammarAccess.getP1Rule() ||
				   context == grammarAccess.getSRule() ||
				   context == grammarAccess.getStartRule() ||
				   context == grammarAccess.getStateRule() ||
				   context == grammarAccess.getStateOrLabelRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.U:
				if(context == grammarAccess.getPRule() ||
				   context == grammarAccess.getP1Rule() ||
				   context == grammarAccess.getStartRule() ||
				   context == grammarAccess.getURule()) {
					sequence_U(context, (U) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     RIGHT=StateOrLabel
	 */
	protected void sequence_F(EObject context, F semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (LEFT=StateOrLabel RIGHT=P)
	 */
	protected void sequence_G(EObject context, G semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID | name=ID)
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     start=S
	 */
	protected void sequence_Start(EObject context, Start semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PCTLPackage.Literals.START__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PCTLPackage.Literals.START__START));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStartAccess().getStartSParserRuleCall_0_0(), semanticObject.getStart());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID | name=ID)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (LEFT=StateOrLabel RIGHT=StateOrLabel)
	 */
	protected void sequence_U(EObject context, U semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

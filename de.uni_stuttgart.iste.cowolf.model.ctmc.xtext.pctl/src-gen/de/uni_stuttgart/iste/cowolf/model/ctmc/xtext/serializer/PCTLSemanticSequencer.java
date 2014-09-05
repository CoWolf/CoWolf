package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Label;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.P;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PG;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.State;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.services.PCTLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class PCTLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PCTLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PCTLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PCTLPackage.LABEL:
				if(context == grammarAccess.getLabelRule() ||
				   context == grammarAccess.getPRule() ||
				   context == grammarAccess.getSRule() ||
				   context == grammarAccess.getStartRule() ||
				   context == grammarAccess.getStateOrLabelRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.P:
				if(context == grammarAccess.getPRule() ||
				   context == grammarAccess.getStartRule()) {
					sequence_P(context, (P) semanticObject); 
					return; 
				}
				else break;
			case PCTLPackage.PG:
				if(context == grammarAccess.getPGRule() ||
				   context == grammarAccess.getStartRule()) {
					sequence_PG(context, (PG) semanticObject); 
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
				   context == grammarAccess.getSRule() ||
				   context == grammarAccess.getStartRule() ||
				   context == grammarAccess.getStateRule() ||
				   context == grammarAccess.getStateOrLabelRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
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
	 *     (LEFT=StateOrLabel RIGHT=StateOrLabel)
	 */
	protected void sequence_PG(EObject context, PG semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (LEFT=StateOrLabel RIGHT=StateOrLabel)
	 */
	protected void sequence_P(EObject context, P semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     start=S
	 */
	protected void sequence_Start(EObject context, Start semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID | name=ID)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

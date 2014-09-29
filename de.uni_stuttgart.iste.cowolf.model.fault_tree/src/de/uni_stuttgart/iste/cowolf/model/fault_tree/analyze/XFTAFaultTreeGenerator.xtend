package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze

import de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Event
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard
import de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent
import de.uni_stuttgart.iste.cowolf.model.fault_tree.UndevelopedEvent
import java.util.Map

class XFTAFaultTreeGenerator implements XFTAGenerator {

/*
 * XFTA only supports AND, OR, NOT and ATLEAST gates. So the meta-model gates must be horribly translated
 * or logically converted. Future work.
 */
private val gates = #{'and'->'and', 'or'->'or', 'inhibit'->'and', 'priorand'->'and', 'xor'->'or'};
	
	override CharSequence doGenerateXFTAFile(FaultTree root, Map<String, Object> parameters) {
		return '''«root.xFTAFaultTreeTemplate»'''
	}
	
	def xFTAFaultTreeTemplate(FaultTree r) '''
		<?xml version="1.0"?>
		<!DOCTYPE open-psa>
		<open-psa>
			  <define-fault-tree name="«r.hazard.id»">
			  «r.hazard.processHazard»
			  «FOR gate : r.gate.filter[g | g.id != r.hazard.inputGate.id]»
			  	«gate.processGateBasicDefinitions»
			  «ENDFOR»
			  «FOR event : r.event.filter[e | e instanceof IntermediateEvent && (e as IntermediateEvent).outEvent == null && (e as IntermediateEvent).inputGate != null ]»
			  	«(event as IntermediateEvent).processEventAsGate»
			  «ENDFOR»			  
			  «FOR event : r.event.filter(BasicEvent)»
			  	«(event as BasicEvent).processEventBasicDefinitions»
			  «ENDFOR»			  
			  </define-fault-tree>
		</open-psa>
	'''

	def processHazard(Hazard hazard) '''
		<define-gate name="«hazard.id»">
		«hazard.inputGate.fillGateContent»
		</define-gate>
	'''

	def processGateBasicDefinitions(Gate gate) '''
		<define-gate name="«gate.id»">
		«gate.fillGateContent»
		</define-gate>
	'''
	
	def processEventAsGate(IntermediateEvent e)'''
		<define-gate name="«e.id»">
		«e.inputGate.fillGateContent»
		</define-gate>
	'''
	
	def processEvent(Event e)'''
		«IF e instanceof BasicEvent»
		«e.processBasicEvent»
		«ELSEIF e instanceof IntermediateEvent»
		«processIntermediateEvent(e as IntermediateEvent)»
		«ELSEIF e instanceof UndevelopedEvent»
		«processUndevelopedEvent(e as UndevelopedEvent)»
		«ENDIF»
		
	'''
	
	def processGate(Gate gate) '''
		<gate name="«gate.id»"/>
	'''

	def processBasicEvent(Event event) '''
		<basic-event name="«event.id»"/>
	'''

	def processIntermediateEvent(IntermediateEvent event) '''
		«IF event.outEvent == null»
		<event name="«event.id»"/>
		«ENDIF»
	'''

	def processUndevelopedEvent(UndevelopedEvent event) '''
		<event name="«event.id»"/>
	'''

	def processEventBasicDefinitions(BasicEvent event) '''
		<define-basic-event name="«event.id»">
			<float value="«event.probability»" />			
		</define-basic-event>
	'''

	def fillGateContent(Gate gate)'''
		   	<«gate.class.interfaces.get(0).simpleName.toLowerCase.translateGate»>
		«FOR g : gate.inputGates»
			«processGate(g)»
		«ENDFOR»
		«FOR e : gate.inputEvents»
			«processEvent(e)»
		«ENDFOR»
		   	</«gate.class.interfaces.get(0).simpleName.toLowerCase.translateGate»>
	'''

	def translateGate(CharSequence s){
		return gates.get(s);
	}
}

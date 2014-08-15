package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze

import de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Event
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard
import de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent
import de.uni_stuttgart.iste.cowolf.model.fault_tree.UndevelopedEvent
import de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.RootImpl
import java.util.Map

class XFTAFaultTreeGenerator implements XFTAGenerator {

	override CharSequence doGenerateXFTAFile(RootImpl root, Map<String, Object> parameters) {
		return '''«root.xFTAFaultTreeTemplate»'''
	}

	def xFTAFaultTreeTemplate(RootImpl r) '''
		<?xml version="1.0"?>
		<!DOCTYPE open-psa>
		<open-psa>
			  <define-fault-tree name="«r.hazard.id»">
			  «processTopEvent(r.hazard)»
			  «FOR gate : r.gate»
			  	«processGateBasicDefinitions(gate)»
			  «ENDFOR»
			  «FOR event : r.event.filter(BasicEvent)»
			  	«processEventBasicDefinitions(event as BasicEvent)»
			  «ENDFOR»			  
			  </define-fault-tree>
		</open-psa>
				   
	'''

	def processTopEvent(Hazard hazard) '''
		<define-gate name="«hazard.id»">
		 		<«hazard.inputGate.class.interfaces.get(0).simpleName.toLowerCase»>
		 		«FOR g : hazard.inputGate.inputGates»
		 			«processGates(g)»
		 		«ENDFOR»
		 		«FOR e : hazard.inputGate.inputEvents»
		 			«processBasicEvents(e)»
		 		«ENDFOR»
		 		</«hazard.inputGate.class.interfaces.get(0).simpleName.toLowerCase»>
		</define-gate>
	'''

	def processGateBasicDefinitions(Gate gate) '''
		<define-gate name="«gate.id»">
		   <«gate.class.interfaces.get(0).simpleName.toLowerCase»>
		   	«FOR g : gate.inputGates»
			«processGates(g)»
		«ENDFOR»
		  	«FOR e : gate.inputEvents.filter[e|
			e instanceof BasicEvent || e instanceof IntermediateEvent || e instanceof UndevelopedEvent]»
			«processBasicEvents(e)»
		«ENDFOR»
		   </«gate.class.interfaces.get(0).simpleName.toLowerCase»>
		</define-gate>
	'''

	def processGates(Gate gate) '''
		<gate name="«gate.id»"/>
	'''

	def processBasicEvents(Event event) '''
		<basic-event name="«event.id»"/>
	'''

	def processEventBasicDefinitions(BasicEvent event) '''
		<define-basic-event name="«event.id»">
			<float value="«event.probability»" />			
		</define-basic-event>
	'''
}

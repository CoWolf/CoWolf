package de.uni_stuttgart.iste.cowolf.model.ctmc.analyze

import de.uni_stuttgart.iste.cowolf.model.ctmc.CTMC
import de.uni_stuttgart.iste.cowolf.model.ctmc.State
import java.util.List
import org.eclipse.emf.ecore.resource.Resource

class PRISMGenerator {

	var nameToIDMap = newHashMap()

	def CharSequence generateSM(Resource resource) {
		if (resource.contents.size > 0 && resource.contents.get(0) instanceof CTMC) {
			var e = resource.contents.get(0) as CTMC
			addStatesToMap(e)
			'''«e.compilePM»

«resource.generateLabels»'''
		} else {
			''''''
		}
	}

	def CharSequence generateCSL(Resource resource) {
		var result = "";
		if (resource.getContents().size() > 0
				&& resource.getContents().get(0) instanceof CTMC) {
			var e = resource.getContents().get(0) as CTMC;
			addStatesToMap(e);
			for (State state : e.states.filter[getOutgoing.size == 0]) {
				result += "P=? [ F s=" + getID(state) + " ]\n";
			}
		} else {
			return "";
		}
		
		return result;
	}
	
	def CharSequence generateLabels(Resource resource) {
		
		var e = resource.getContents().get(0) as CTMC;
		var labelMap = e.states.map(s | s.labels).flatten
		
		var labels = labelMap.fold(<String,List<State>>newHashMap())[m, l | if (!m.containsKey(l.name)) {
				m.put(l.name, newLinkedList())
			}
			m.get(l.name).add(l.state);
			m]
		return labels.entrySet.map[l | 'label "' + l.key + '" = ' + l.value.join('|')["s="+getID] + ";"].join('\n');
	
	}

	def addStatesToMap(CTMC e) '''
		«nameToIDMap = newHashMap()»
		«FOR i : 0 .. e.states.size - 1»  
			«nameToIDMap.put(e.states.get(i).name, i)»	
		«ENDFOR»
	'''

	def getID(State e) {
		if (nameToIDMap.containsKey(e.name)) '''«nameToIDMap.get(e.name)»''' else
			throw new Exception("Unknown state found.")
	}

	def getStart(CTMC e) {
		'''«getID(e.getInitialState)»'''
	}

	def compilePM(CTMC e) '''
ctmc 
module test

	s : [0..«e.states.size() - 1»] init «getStart(e)»;
		 
	«FOR f : e.states»
		«IF f.outgoing.size > 0»
		[] s=«getID(f)» -> «f.compilePM»
		«ENDIF»
	«ENDFOR»

endmodule
	'''

	def compilePM(State e) {

		if (e.outgoing.size > 1) {
			'''«FOR i : 0 .. e.outgoing.size - 2»«e.outgoing.get(i).rate» : (s'=«getID(e.outgoing.get(i).to)») + «ENDFOR»«e.
				outgoing.get(e.outgoing.size - 1).rate» : (s'=«getID(e.outgoing.get(e.outgoing.size - 1).to)»);'''
		} else {
			'''(s'=«getID(e.outgoing.get(0).to)»);'''
		}

	}

}

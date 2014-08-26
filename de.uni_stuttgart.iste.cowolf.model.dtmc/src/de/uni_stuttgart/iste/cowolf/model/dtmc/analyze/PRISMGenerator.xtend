package de.uni_stuttgart.iste.cowolf.model.dtmc.analyze

import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC
import de.uni_stuttgart.iste.cowolf.model.dtmc.State
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource

class PRISMGenerator {

	var idToIntMap = newHashMap()

	def CharSequence generatePM(Resource resource) {
		if (resource.contents.size > 0 && resource.contents.get(0) instanceof DTMC) {
			var e = resource.contents.get(0) as DTMC
			addStatesToMap(e)
			'''
// This model is automatically generated from a CoWolf DTMC model.
// Please use CoWolf to make any changes to the model.
«e.compilePM»

«resource.generateLabels»'''
		} else {
			''''''
		}
	}

	def CharSequence generatePCTL(Resource resource, Set<State> analyzeStates, Set<String> analyzeLabels) {
		var result = "";
		
		if (resource.getContents().size() > 0 && resource.getContents().get(0) instanceof DTMC) {
			var e = resource.getContents().get(0) as DTMC;
			
			addStatesToMap(e);

			for (State state : analyzeStates) {
				if (e.states.contains(state)) {
					result += "P=? [ F s=" + getIntState(state) + " ]\n";
				}
			}
			
			for (String label : analyzeLabels) {
				if (e.states.map(s | s.labels).flatten.exists[l | l.name.equals(label)]) {
					result += "P=? [ F \"" + label + "\" ]\n";
				}
			}
		} else {
			return "";
		}
		
		return result;
	}
	
	def CharSequence generateLabels(Resource resource) {
		
		var e = resource.getContents().get(0) as DTMC;
		var labelMap = e.states.map(s | s.labels).flatten
		
		var labels = labelMap.fold(<String,List<State>>newHashMap())[m, l | if (!m.containsKey(l.name)) {
				m.put(l.name, newLinkedList())
			}
			m.get(l.name).add(l.state);
			m]
		return labels.entrySet.map[l | 'label "' + l.key + '" = ' + l.value.join('|')["s="+getIntState] + ";"].join('\n');
	
	}

	def addStatesToMap(DTMC e) '''
		«idToIntMap = newHashMap()»
		«FOR i : 0 .. e.states.size - 1»  
			«idToIntMap.put(e.states.get(i).id, i)»	
		«ENDFOR»
	'''

	def getIntState(State e) {
		if (idToIntMap.containsKey(e.id)) '''«idToIntMap.get(e.id)»''' else
			throw new Exception("Unknown state found.")
	}

	def getStart(DTMC e) {
		'''«getIntState(e.getInitialState)»'''
	}

	def compilePM(DTMC e) '''
dtmc 
module «IF e.name.empty»Model«ELSE»«e.name»«ENDIF»

	// As PRISM does not support names for states, they are translated to numbers.
	// The mapping is as follows.
	«FOR f : e.states»
	// State "«if (f.name.empty) f.id else f.name»" => «getIntState(f)»
	«ENDFOR»
	
	«IF (e.states.size() <= 1)»s : [0 .. 1] init 0;«ELSE»s : [0..«e.states.size() - 1»] init «getStart(e)»;«ENDIF»
		
	«FOR f : e.states»		
		«IF f.outgoing.size > 0»
		// Transitions from state "«f.name»":
		[] s=«getIntState(f)» -> «f.compilePM»
		«ENDIF»
	«ENDFOR»

endmodule
	'''

	def compilePM(State e) {

		if (e.outgoing.size > 1) {
			'''«FOR i : 0 .. e.outgoing.size - 2»«e.outgoing.get(i).prob» : (s'=«getIntState(e.outgoing.get(i).to)») + «ENDFOR»«e.
				outgoing.get(e.outgoing.size - 1).prob» : (s'=«getIntState(e.outgoing.get(e.outgoing.size - 1).to)»);'''
		} else {
			'''(s'=«getIntState(e.outgoing.get(0).to)»);'''
		}

	}

}

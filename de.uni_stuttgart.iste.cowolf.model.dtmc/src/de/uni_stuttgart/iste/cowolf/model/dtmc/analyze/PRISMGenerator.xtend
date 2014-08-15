package de.uni_stuttgart.iste.cowolf.model.dtmc.analyze

import de.uni_stuttgart.iste.cowolf.model.dtmc.State
import org.eclipse.emf.ecore.resource.Resource
import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC

class PRISMGenerator {

	var nameToIDMap = newHashMap()

	def CharSequence generatePM(Resource resource) {
		if (resource.contents.size > 0 && resource.contents.get(0) instanceof DTMC) {
			var e = resource.contents.get(0) as DTMC
			addStatesToMap(e)
			'''«e.compilePM»'''
		} else {
			''''''
		}
	}

	def CharSequence generatePCTL(Resource resource) {
		var result = "";
		if (resource.getContents().size() > 0
				&& resource.getContents().get(0) instanceof DTMC) {
			var e = resource.getContents().get(0) as DTMC;
			addStatesToMap(e);
			for (State state : e.states.filter[getOutgoing.size == 0]) {
				result += "P=? [ F s=" + getID(state) + " ]\n";
			}
		} else {
			return "";
		}
		
		return result;
	}

	def addStatesToMap(DTMC e) '''
		«nameToIDMap = newHashMap()»
		«FOR i : 0 .. e.states.size - 1»  
			«nameToIDMap.put(e.states.get(i).name, i)»	
		«ENDFOR»
	'''

	def getID(State e) {
		if (nameToIDMap.containsKey(e.name)) '''«nameToIDMap.get(e.name)»''' else
			throw new Exception("Unknown state found.")
	}

	def getStart(DTMC e) {
		'''«getID(e.getInitialState)»'''
	}

	def compilePM(DTMC e) '''
dtmc 
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
			'''«FOR i : 0 .. e.outgoing.size - 2»«e.outgoing.get(i).prob» : (s'=«getID(e.outgoing.get(i).to)») + «ENDFOR»«e.
				outgoing.get(e.outgoing.size - 1).prob» : (s'=«getID(e.outgoing.get(e.outgoing.size - 1).to)»);'''
		} else {
			'''(s'=«getID(e.outgoing.get(0).to)»);'''
		}

	}

}

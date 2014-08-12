package de.uni_stuttgart.iste.cowolf.model.dtmc.analyze

import de.uni_stuttgart.iste.cowolf.model.dtmc.State
import de.uni_stuttgart.iste.cowolf.model.dtmc.impl.RootImpl
import org.eclipse.emf.ecore.resource.Resource

class PRISMGenerator {

	var nameToIDMap = newHashMap()

	def CharSequence generatePM(Resource resource) {
		if (resource.contents.size > 0 && resource.contents.get(0) instanceof RootImpl) {
			var e = resource.contents.get(0) as RootImpl
			addStatesToMap(e)
			'''«e.compilePM»'''
		} else {
			''''''
		}
	}

	def CharSequence generatePCTL(Resource resource) {
		var result = "";
		if (resource.getContents().size() > 0
				&& resource.getContents().get(0) instanceof RootImpl) {
			var e = resource.getContents().get(0) as RootImpl;
			addStatesToMap(e);
			for (State state : e.states.filter[isIsEnd]) {
				result += "P=? [ F s=" + getID(state) + " ]\n";
			}
		} else {
			return "";
		}
		
		return result;
	}

	def addStatesToMap(RootImpl e) '''
		«nameToIDMap = newHashMap()»
		«FOR i : 0 .. e.states.size - 1»  
			«nameToIDMap.put(e.states.get(i).name, i)»	
		«ENDFOR»
	'''

	def getID(State e) {
		if (nameToIDMap.containsKey(e.name)) '''«nameToIDMap.get(e.name)»''' else
			throw new Exception("Unknown state found.")
	}

	def getStart(RootImpl e) {
		'''«FOR s : e.states»«IF s.isStart»«getID(s)»«ENDIF»«ENDFOR»'''
	}

	def compilePM(RootImpl e) '''
dtmc 
module test

	s : [0..«e.states.size() - 1»] init «getStart(e)»;
		 
	«FOR f : e.states»
		«IF f.outGoing.size > 0»
		[] s=«getID(f)» -> «f.compilePM»
		«ENDIF»
	«ENDFOR»

endmodule
	'''

	def compilePM(State e) {

		if (e.outGoing.size > 1) {
			'''«FOR i : 0 .. e.outGoing.size - 2»«e.outGoing.get(i).transProb» : (s'=«getID(e.outGoing.get(i).to)») + «ENDFOR»«e.
				outGoing.get(e.outGoing.size - 1).transProb» : (s'=«getID(e.outGoing.get(e.outGoing.size - 1).to)»);'''
		} else {
			'''(s'=«getID(e.outGoing.get(0).to)»);'''
		}

	}

}

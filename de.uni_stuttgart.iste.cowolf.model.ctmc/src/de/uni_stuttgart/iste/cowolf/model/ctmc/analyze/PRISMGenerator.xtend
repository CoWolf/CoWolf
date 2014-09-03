package de.uni_stuttgart.iste.cowolf.model.ctmc.analyze

import de.uni_stuttgart.iste.cowolf.model.ctmc.CTMC
import de.uni_stuttgart.iste.cowolf.model.ctmc.State
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.resource.Resource

class PRISMGenerator {

	var idToIntMap = newHashMap()
	var nameToIntMap = newHashMap()

	def CharSequence generateSM(Resource resource) {
		if (resource.contents.size > 0 && resource.contents.get(0) instanceof CTMC) {
			var e = resource.contents.get(0) as CTMC
			addStatesToMap(e)
			'''
// This model is automatically generated from a CoWolf CTMC model.
// Please use CoWolf to make any changes to the model.
«e.compilePM»

«resource.generateLabels»'''
		} else {
			''''''
		}
	}

	def CharSequence generateCSL(Resource resource, ArrayList<String> analyzeProperties,
		boolean isValidation) {
		var result = "";

		if (resource.getContents().size() > 0 && resource.getContents().get(0) instanceof CTMC) {
			var e = resource.getContents().get(0) as CTMC;

			addStatesToMap(e);
			addStatesNamesToMap(e);
			
			for (String property : analyzeProperties) {
				var newString = replace(property);
				
				result += newString + "\n";
			}
		}

		return result;
	}
	
	def CharSequence generateCSL(Resource resource, ArrayList<String> analyzeProperties, ArrayList<String> analyzePropertyNames,
		boolean isValidation) {
		var result = "";

		if (resource.getContents().size() > 0 && resource.getContents().get(0) instanceof CTMC) {
			var e = resource.getContents().get(0) as CTMC;

			addStatesToMap(e);
			addStatesNamesToMap(e);
			
			for (var i = 0; i <analyzeProperties.size; i++) {
				var newString = replace(analyzeProperties.get(i));
				result += "// " + analyzePropertyNames.get(i) + "\n" + newString + "\n";
			}
		}

		return result;
	}

	def CharSequence generateLabels(Resource resource) {

		var e = resource.getContents().get(0) as CTMC;
		var labelMap = e.states.map(s|s.labels).flatten

		var labels = labelMap.fold(<String, List<State>>newHashMap())[m, l|
			if (!m.containsKey(l.name)) {
				m.put(l.name, newLinkedList())
			} m.get(l.name).add(l.state); m]
		return labels.entrySet.map[l|'label "' + l.key + '" = ' + l.value.join('|')["s=" + getIntState] + ";"].join('\n');

	}

	def addStatesToMap(CTMC e) '''
		«idToIntMap = newHashMap()»
		«FOR i : 0 .. e.states.size - 1»  
			«idToIntMap.put(e.states.get(i).id, i)»	
		«ENDFOR»
	'''
	
	def addStatesNamesToMap(CTMC e) '''
		«nameToIntMap = newHashMap()»
		«FOR i : 0 .. e.states.size - 1»  
			«nameToIntMap.put(e.states.get(i).name, i)»	
		«ENDFOR»
	'''
	
	def String replace (String s) {
		var result = s;
	
		for (entry : nameToIntMap.entrySet()) {     
			result = result.replace("State:"+entry.key, "s="+entry.value)
		} 
		
		return result;
	}
	
	def getIntState(State e) {
		if (idToIntMap.containsKey(e.id)) '''«idToIntMap.get(e.id)»''' else throw new Exception("Unknown state found.")
	}

	def getStart(CTMC e) {
		'''«getIntState(e.getInitialState)»'''
	}

	def compilePM(CTMC e) '''
ctmc 
module «IF e.name.empty»Model«ELSE»«e.name»«ENDIF»

	// As PRISM does not support names for states, they are translated to numbers.
	// The mapping is as follows.
	«FOR f : e.states»
	// State "«if(f.name == null || f.name.empty) f.id else f.name»" => «getIntState(f)»
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
			'''«FOR i : 0 .. e.outgoing.size - 2»«e.outgoing.get(i).rate» : (s'=«getIntState(e.outgoing.get(i).to)») + «ENDFOR»«e.
				outgoing.get(e.outgoing.size - 1).rate» : (s'=«getIntState(e.outgoing.get(e.outgoing.size - 1).to)»);'''
		} else {
			'''(s'=«getIntState(e.outgoing.get(0).to)»);'''
		}

	}

}

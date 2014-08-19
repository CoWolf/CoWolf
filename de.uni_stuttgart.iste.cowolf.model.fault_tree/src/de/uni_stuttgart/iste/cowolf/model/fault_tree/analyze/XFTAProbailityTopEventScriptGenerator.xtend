package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze

import java.util.Map
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree

class XFTAProbailityTopEventScriptGenerator implements XFTAGenerator {

	override CharSequence doGenerateXFTAFile(FaultTree root, Map<String, Object> parameters) {
		return '''«xFTAProbabiltyTopEventTemplate(root, parameters)»'''
	}

	def xFTAProbabiltyTopEventTemplate(FaultTree r, Map<String, Object> parameters) '''
	<?xml version="1.0"?>
	<!DOCTYPE xfta>
	<xfta>
	  <load>
	    <model input="«parameters.get("pathToInputXFTAFile")»" />
	  </load>
	  <build>
	    <minimal-cutsets top-event="«r.hazard.id»" handle="MCS" />
	  </build>
	  <compute>
	    <importance-factors top-event="«r.hazard.id»" handle="MCS" output="«parameters.get("pathToOutputXFTAFile")»" />
	  </compute>
	</xfta>
	'''
}

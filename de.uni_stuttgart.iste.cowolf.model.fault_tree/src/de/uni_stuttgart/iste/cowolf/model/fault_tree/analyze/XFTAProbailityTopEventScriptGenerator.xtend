package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze

import de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.RootImpl
import java.util.Map

class XFTAProbailityTopEventScriptGenerator implements XFTAGenerator {

	override CharSequence doGenerateXFTAFile(RootImpl root, Map<String, Object> parameters) {
		return '''«xFTAProbabiltyTopEventTemplate(root, parameters)»'''
	}

	def xFTAProbabiltyTopEventTemplate(RootImpl r, Map<String, Object> parameters) '''
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

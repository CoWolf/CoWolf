package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze

import de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.RootImpl
import java.util.Map

class XFTAFaultTreeGenerator implements XFTAGenerator {

	override CharSequence doGenerateXFTAFile(RootImpl root, Map<String, Object> parameters) {
		return '''«root.xFTAFaultTreeTemplate»'''
	}

	def xFTAFaultTreeTemplate(RootImpl r) '''
		<?xml version="1.0" ?>
		<!DOCTYPE open-psa>
		<open-psa>
			  <define-fault-tree name="«r.hazard.name»">
			  </define-fault-tree>
		</open-psa>
				   
	'''
}

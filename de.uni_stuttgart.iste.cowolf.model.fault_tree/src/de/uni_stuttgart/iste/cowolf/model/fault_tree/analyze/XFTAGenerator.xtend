package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze

import java.util.Map
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree

interface XFTAGenerator {

	def CharSequence doGenerateXFTAFile(FaultTree root, Map<String, Object> parameters);
}

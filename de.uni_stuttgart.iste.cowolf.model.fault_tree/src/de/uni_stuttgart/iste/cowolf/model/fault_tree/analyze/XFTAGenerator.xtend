package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze

import de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.RootImpl
import java.util.Map

interface XFTAGenerator {

	def CharSequence doGenerateXFTAFile(RootImpl root, Map<String, Object> parameters);
}

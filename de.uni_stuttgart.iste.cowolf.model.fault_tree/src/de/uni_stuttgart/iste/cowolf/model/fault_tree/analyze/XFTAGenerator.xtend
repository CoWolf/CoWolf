package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze

import de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.RootImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class XFTAGenerator implements IGenerator {

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		for (obj : input.allContents.toIterable.filter(RootImpl)) {
			fsa.generateFile("output.xml", xFTATemplate(obj))
		}
	}

	def xFTATemplate(RootImpl r) '''
		<?xml version="1.0" ?>
		<!DOCTYPE open-psa>
		<open-psa>
			  <define-fault-tree name="«r.hazard.name»">
			  </define-fault-tree>
		</open-psa>
				   
	'''
}

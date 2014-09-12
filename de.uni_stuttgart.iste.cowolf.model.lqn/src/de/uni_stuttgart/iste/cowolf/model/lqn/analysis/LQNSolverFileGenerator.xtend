package de.uni_stuttgart.iste.cowolf.model.lqn.analysis

import de.uni_stuttgart.iste.cowolf.model.LqnCore.DocumentRoot
import java.util.Map

interface LQNSolverFileGenerator {
	def CharSequence doGenerateLQNSolverFile(DocumentRoot root, Map<String, Object> parameters);
}
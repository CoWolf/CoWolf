package de.uni_stuttgart.iste.cowolf.model.statechart.sirius.editor.service;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import com.google.common.collect.Lists;
import de.uni_stuttgart.iste.cowolf.model.statechart.State;
import org.eclipse.ocl.*;




/**
 * Services for the statechart model
 * 
 * @author Johannes Wolf
 */
public class StateChartService{

	/**
	 * Get all states which are not composite states
	 * 
	 * @param state
	 *            
	 * @return states
	 */
	public List<State> getNormalStates(State state) {
		List<State> result = Lists.newArrayList();
		List<State> states = Lists.newArrayList(state.getState_container().getTop());
		
		IOclQueryHelper helper = new OclQueryHelper();

		Set results = helper.executeQueryUsingOclFilter(
			root,
			LibraryPackage.eINSTANCE.getWriter(),
			"self.books->collect(b : Book | b.category)->asSet()->size() > 2",
			new NullProgressMonitor());

		for (State aState : states) {
			if (TransitionKind.INTERNAL_LITERAL.equals(transition.getKind())) {
				result.add(transition);
			}
			if(aState.get)
		}
		return result;
	}
}

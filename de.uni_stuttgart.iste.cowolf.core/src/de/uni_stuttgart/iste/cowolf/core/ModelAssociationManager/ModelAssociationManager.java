package de.uni_stuttgart.iste.cowolf.core.ModelAssociationManager;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

public class ModelAssociationManager {

	ArrayList<Association> associations = new ArrayList<Association>();

	/**
	 * @param source
	 * @return all with several steps reachable associations
	 */
	public List<Resource> getReachableAssociations(Resource source) {

		List<Resource> foundMatches = new ArrayList<Resource>();

		// all first level reachable resources
		for (Association association : associations) {
			if (association.getSource().equals(source)) {
				foundMatches.add(association.getTarget());
				List<Resource> newMatches = new ArrayList<Resource>();

				// find reachable resources for the found matches
				newMatches = getReachableAssociations(association.getTarget());

				// and add them to the return list
				for (Resource r : newMatches) {
					foundMatches.add(r);
				}
			}
		}

		return foundMatches;
	}

	/**
	 * @param source
	 * @return the existing targets for the given source
	 */
	public List<Resource> getDirectModelAssociations(Resource source) {
		List<Resource> foundMatches = new ArrayList<Resource>();

		for (Association association : associations) {
			if (association.getSource().equals(source)) {
				foundMatches.add(association.getTarget());
			}
		}
		return foundMatches;
		// TODO
	}

	/**
	 * Creates an association between these two resources
	 * 
	 * @param source
	 * @param target
	 * @return false if association already exists
	 */
	public boolean add(Resource source, Resource target) {
		for (Association association : associations) {
			if (association.getSource().equals(source)
					&& association.getTarget().equals(target)) {
				// association exists already
				return false;
			}
		}
		Association newAssociation = new Association(source, target);
		associations.add(newAssociation);
		save();
		return true;

	}

	/**
	 * Deletes an association of the two resources
	 * 
	 * @param source
	 * @param target
	 * @return True if a match of these two resources was found and deleted.
	 *         False else
	 */
	public boolean remove(Resource source, Resource target) {
		boolean foundMatch = false;
		for (Association association : associations) {
			if (association.getSource().equals(source)
					&& association.getTarget().equals(target)) {
				associations.remove(association);
				foundMatch = true;
				save();
				break;
			}
		}

		return foundMatch;
	}

	private void save() {

	}

	public static void load() {
		System.out.print("test");
	}
}

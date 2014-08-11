package de.uni_stuttgart.iste.cowolf.model.dtmc.analyze;

import java.util.HashMap;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.dtmc.State;
import de.uni_stuttgart.iste.cowolf.model.dtmc.impl.RootImpl;

public class GeneratePRISM {

	static HashMap<String, Integer> nameToIDMap = new HashMap<String, Integer>();

	public static String generatePM(Resource resource) {
		if (resource.getContents().size() > 0
				&& resource.getContents().get(0) instanceof RootImpl) {
			RootImpl e = (RootImpl) resource.getContents().get(0);
			addStatesToMap(e);
			return compilePM(e);
		} else {
			return "";
		}
	}
	
	public static String generatePCTL(Resource resource) {
		String result = "";
		if (resource.getContents().size() > 0
				&& resource.getContents().get(0) instanceof RootImpl) {
			RootImpl e = (RootImpl) resource.getContents().get(0);
			addStatesToMap(e);
			for (State state : e.getStates()) {
				if (state.isIsEnd()) {
					result += "P=? [ F s=" + getID(state) + " ]\n";
				}
			}
		} else {
			return "";
		}
		
		return result;
	}

	public static void addStatesToMap(RootImpl e) {
		nameToIDMap = new HashMap<String, Integer>();
		for (int i = 0; i < e.getStates().size(); i++) {
			nameToIDMap.put(e.getStates().get(i).getName(), i);
		}
	}

	public static String getID(State e) {
		if (nameToIDMap.containsKey(e.getName()))
			return nameToIDMap.get(e.getName()).toString();
		else {
			System.out.println("Unknown state found.");
			return "";
		}
	}

	public static String getStart(RootImpl e) {
		for (State state : e.getStates()) {
			if (state.isIsStart()) {
				return getID(state);
			}
		}
		return "";
	}

	public static String compilePM(RootImpl e) {
		String result = "dtmc\nmodule test\n\n";
		result += "\ts : [0.." + (e.getStates().size() - 1) + "] init "
				+ getStart(e) + ";\n\n";

		for (State state : e.getStates()) {
			if (state.getOutGoing().size() > 0) {
				result += "\t[] s=" + getID(state) + " -> " + compilePM(state);
			}
		}
		return result + "\nendmodule";
	}

	public static String compilePM(State e) {
		String result = "";
		if (e.getOutGoing().size() > 1) {
			for (int i = 0; i < e.getOutGoing().size() - 1; i++) {
				result += e.getOutGoing().get(i).getTransProb() + " : (s'="
						+ getID(e.getOutGoing().get(i).getTo()) + ") + ";
			}
			result += e.getOutGoing().get(e.getOutGoing().size() - 1)
					.getTransProb()
					+ " : (s'="
					+ getID(e.getOutGoing().get(e.getOutGoing().size() - 1)
							.getTo()) + ");\n";
		} else {
			result += "(s'=" + getID(e.getOutGoing().get(0).getTo()) + ");\n";
		}
		return result;
	}

}

package de.uni_stuttgart.iste.cowolf.evolution;

import java.util.Map;

public class ModelOperation {
	private String operationName;
	private Map<String, Object> parameters;

	/**
	 * @return the operationName
	 */
	public String getOperationName() {
		return this.operationName;
	}

	/**
	 * @param operationName the operationName to set
	 */
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	/**
	 * @return the parameters
	 */
	public Map<String, Object> getParameters() {
		return this.parameters;
	}

	/**
	 * Adds the name and the value to the parameters.
	 * @param name name to add
	 * @param value value to add
	 * @return the previous value associated with name, or null if there was no mapping for name.
	 */
	public Object putParameter(String name, Object value) {
		return this.parameters.put(name, value);
	}

}

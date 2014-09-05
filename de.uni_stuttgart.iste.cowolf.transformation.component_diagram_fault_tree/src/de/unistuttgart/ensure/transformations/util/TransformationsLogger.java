package de.unistuttgart.ensure.transformations.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TransformationsLogger {
	
	// Log counter
	private static int executionCounter = 0;
	
	/**
	 * Global variable to enable/disable logging.
	 */
	public static boolean logging = true;
	
	/**
	 * Logs an simple String value and adds with a line break.
	 * 
	 * @param value
	 *            - String
	 */
	public static void log(String value) {
		log(value, true);
	}

	/**
	 * Logs an simple String value with optional line break.
	 * 
	 * @param value
	 *            - String
	 * @param lineBreak
	 *            - boolean
	 */
	public static void log(String value, boolean lineBreak) {
		if (logging) {
			if (lineBreak) {
				System.out.println(value);
			} else {
				System.out.print(value);
			}
		}
	}
	
	/**
	 * Logs the result of rule execution without parameters.
	 * 
	 * @param ruleName
	 *            - String
	 * @param result
	 *            - boolean
	 */
	public static void logRuleExecution(String ruleName, boolean result) {
		if (ruleName != null) {
			logRuleExecution(ruleName, new ArrayList<String>(), result);
		} else {
			//Don't throw an exception. Just do nothing.
		}
	}

	/**
	 * Logs the result of rule execution with one parameter.
	 * 
	 * @param ruleName
	 *            - String
	 * @param param
	 *            - String
	 * @param result
	 *            - boolean
	 */
	public static void logRuleExecution(String ruleName, String param, boolean result) {
		if (ruleName != null && param != null) {
			List<String> params = new ArrayList<String>();
			params.add(param);

			logRuleExecution(ruleName, params, result);
		} else {
			//Don't throw an exception. Just do nothing.
		}
	}

	/**
	 * Logs the result of rule execution with unspecific list of parameters.
	 * 
	 * @param ruleName
	 *            - String
	 * @param params
	 *            - List<String>
	 * @param result
	 *            - boolean
	 */
	public static void logRuleExecution(String ruleName, List<String> params, boolean result) {
		if (ruleName != null && params != null) {
			StringBuilder logMessage = new StringBuilder();
			logMessage.append("Executed step ");
			logMessage.append(++executionCounter + ": ");
			logMessage.append(ruleName + "(");
			if (!params.isEmpty()) {
				for (String param : params) {
					logMessage.append("\"" + param + "\"");
					if (params.indexOf(param) < params.size() - 1) {
						logMessage.append(", ");
					}
				}
			}
			logMessage.append(") -> " + result);

			log(logMessage.toString());
		} else {
			//Don't throw an exception. Just do nothing.
		}
	}
	
	/**
	 * Logs the result of rule matching without parameters.
	 * 
	 * @param ruleName
	 *            - String
	 * @param numberOfMatchings
	 *            - int
	 */
	public static void logRuleMatching(String ruleName, int numberOfMatchings) {
		if (ruleName != null) {
			logRuleMatching(ruleName, new ArrayList<String>(), numberOfMatchings);
		} else {
			//Don't throw an exception. Just do nothing.
		}
	}

	/**
	 * Logs the result of rule matching with one parameter.
	 * 
	 * @param ruleName
	 *            - String
	 * @param param
	 *            - String
	 * @param numberOfMatchings
	 *            - int
	 */
	public static void logRuleMatching(String ruleName, String param, int numberOfMatchings) {
		if (ruleName != null && param != null) {
			List<String> params = new ArrayList<String>();
			params.add(param);

			logRuleMatching(ruleName, params, numberOfMatchings);
		} else {
			//Don't throw an exception. Just do nothing.
		}
	}

	/**
	 * Logs the result of rule matching with unspecific list of parameters.
	 * 
	 * @param ruleName
	 *            - String
	 * @param params
	 *            - List<String>
	 * @param numberOfMatchings
	 *            - int
	 */
	public static void logRuleMatching(String ruleName, List<String> params, int numberOfMatchings) {
		if (ruleName != null && params != null) {
			StringBuilder logMessage = new StringBuilder();
			logMessage.append("Executed matching step ");
			logMessage.append(++executionCounter + ": ");
			logMessage.append(ruleName + "(");
			if (!params.isEmpty()) {
				for (String param : params) {
					logMessage.append("\"" + param + "\"");
					if (params.indexOf(param) < params.size() - 1) {
						logMessage.append(", ");
					}
				}
			}
			logMessage.append(") -> " + numberOfMatchings);

			log(logMessage.toString());
		} else {
			//Don't throw an exception. Just do nothing.
		}
	}

	/**
	 * Logs a list of String values.
	 * 
	 * @param list
	 *            - List<String>
	 */
	public static void log(List<String> list) {
		StringBuilder logMessage = new StringBuilder();
		if (list != null && list.size() > 0) {
			for (String element : list) {
				logMessage.append(element);
				if (list.indexOf(element) < list.size() - 1) {
					logMessage.append(", ");
				}
			}
		} else {
			logMessage.append("<NONE>");
		}
		log(logMessage.toString());
	}

	/**
	 * Logs a map of tuples <String, Integer>.
	 * 
	 * @param map
	 *            - HashMap<String, Integer>
	 */
	public static void log(HashMap<String, Integer> map) {
		StringBuilder logMessage = new StringBuilder();
		if (map != null && map.size() > 0) {
			for (String key : map.keySet()) {
				logMessage.append(key + " | " + map.get(key));
				logMessage.append("\n");
			}
		} else {
			logMessage.append("<NONE>");
		}
		log(logMessage.toString());
	}
}

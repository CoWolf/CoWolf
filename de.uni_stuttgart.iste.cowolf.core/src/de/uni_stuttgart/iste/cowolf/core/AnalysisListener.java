/**
 * 
 */
package de.uni_stuttgart.iste.cowolf.core;

import org.eclipse.emf.ecore.resource.Resource;

/**
 *
 */
public interface AnalysisListener {

	public void finished(Resource resource, String result);
}

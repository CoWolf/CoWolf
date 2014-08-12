/**
 *
 */
package de.uni_stuttgart.iste.cowolf.model;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;

/**
 *
 */
public interface IAnalysisListener {

	public void finished(Resource resource, IFile result);
}

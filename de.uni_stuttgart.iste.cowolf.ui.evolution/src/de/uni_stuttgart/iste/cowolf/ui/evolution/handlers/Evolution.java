package de.uni_stuttgart.iste.cowolf.ui.evolution.handlers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionException;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionRegistry;
import de.uni_stuttgart.iste.cowolf.ui.evolution.evolution.EvolutionView;

public class Evolution extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (!PlatformUI.getWorkbench().saveAllEditors(true)) {
    		return null;
    	}
    	
        // initialize variables

        final IWorkbenchWindow window = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow();

        IStructuredSelection selection = (IStructuredSelection) window
                .getSelectionService().getSelection();
        
        
        EvolutionRegistry extensionHandler = EvolutionRegistry
                .getInstance();
        final IFile iFile = (IFile) selection.getFirstElement();
        final Resource sourceResource = getResourceOfIFile(iFile); 
        final AbstractEvolutionManager evoManager = extensionHandler.getEvolutionManager(sourceResource);
        
        ModelAssociation ma = ModelAssociationFactory.eINSTANCE.getModelAssociation(iFile.getProject());
        final Model sourceModel = ma.getModel(sourceResource);
        
        Job job = new Job("Calculate Evolution of Model") {
        	
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				List<Object> versions = new ArrayList<Object> (sourceModel.getVersions());
				versions.add(sourceModel);
				
				monitor.beginTask("Calculate Evolution", versions.size());
				
				final LinkedHashMap<Object, Object> results = new LinkedHashMap<Object, Object>(versions.size()+1);
				
				if (versions.size() > 0) {
					results.put(versions.get(0), "Initial version");
					monitor.worked(1);
				}
				for (int i=1; i<versions.size()-1; i++) {
					Resource baseVersion = ((ModelVersion)versions.get(i-1)).getResource();
					Resource targetVersion = ((ModelVersion)versions.get(i)).getResource();
					results.put(versions.get(i), calculateDifference(baseVersion, targetVersion));
					monitor.worked(1);
				}
				
				if (versions.size() > 1) {
					Resource baseVersion = ((ModelVersion)versions.get(versions.size()-2)).getResource();
					Resource targetVersion = ((Model)versions.get(versions.size()-1)).getResource();
					results.put(versions.get(versions.size()-1), calculateDifference(baseVersion, targetVersion));
					monitor.worked(1);
				}
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						try {
							EvolutionView view = (EvolutionView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("de.uni_stuttgart.iste.cowolf.ui.evolution.evolutionview");
							view.setModel(results);
						} catch (PartInitException e) {
							e.printStackTrace();
						}
					}
				});
				return Status.OK_STATUS;
			}
			
			private SymmetricDifference calculateDifference(Resource baseVersion, Resource targetVersion) {
				try {
					return evoManager.evolve(baseVersion, targetVersion);
				} catch (EvolutionException e) {
					e.printStackTrace();
				}
				return null;
			}
			
		};
		job.setUser(true);
		job.schedule();
		return null;
	}

    private Resource getResourceOfIFile(IFile model) {
        URI uri = URI.createURI(model.getLocationURI().toString());
        ResourceSet resourceSet = new ResourceSetImpl();
        try {
            Resource modelResource = resourceSet.getResource(uri, true);
            return modelResource;
        } catch (Exception exc) {
        }

        return null;
    }
}

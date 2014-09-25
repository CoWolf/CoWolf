package de.uni_stuttgart.iste.cowolf.ui.evolution.evolution;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Tree;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionException;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionRegistry;

public class EvolutionViewer extends ContentViewer implements 
ITreeContentProvider,
INotifyChangedListener, ILabelProvider {

	/**
	 * The main control.
	 */
	Composite container;

	/**
	 * The tree viewer which displays the difference.
	 */
	private TreeViewer treeViewer;
	
	/**
	 * This is the one adapter factory used for providing views of the model.
	 */
	protected ComposedAdapterFactory adapterFactory;
	protected AdapterFactoryContentProvider contentAdapter;
	protected AdapterFactoryLabelProvider labelAdapter;
	public EvolutionViewer(ComposedAdapterFactory adapterFactory) {
		super();
		this.adapterFactory = adapterFactory;
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public Composite createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));

		// Set item and label provider:
		treeViewer = new TreeViewer(container);
		{
			labelAdapter = new AdapterFactoryLabelProvider(adapterFactory);
			contentAdapter = new AdapterFactoryContentProvider(adapterFactory);
			treeViewer.setContentProvider(this);
			treeViewer.setLabelProvider(this);
		}

		Tree tree = treeViewer.getTree();
		{
			tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			treeViewer.addDoubleClickListener(new IDoubleClickListener() {
				@Override
				public void doubleClick(DoubleClickEvent event) {
					TreeViewer viewer = (TreeViewer) event.getViewer();
					IStructuredSelection thisSelection = (IStructuredSelection) event.getSelection();
					Object selectedNode = thisSelection.getFirstElement();
					viewer.setExpandedState(selectedNode, !viewer.getExpandedState(selectedNode));
				}
			});
		}

		return container;
	}
	
	@Override
	public Control getControl() {
		return container;
	}

	@Override
	public ISelection getSelection() {
		return treeViewer.getSelection();
	}
	
	@Override
	public Object getInput() {
		return treeViewer.getInput();
	}

	@Override
	public void refresh() {
		treeViewer.refresh();
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		treeViewer.setSelection(selection, reveal);
	}
	
	@Override
	public void setInput(Object input) {
		treeViewer.setInput(input);
	}

	@Override
	public void dispose() {
	}

	HashMap<ModelVersion, SymmetricDifference> differenceCache = new HashMap<ModelVersion, SymmetricDifference> ();
	
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput == null) {
			return;
		}
		if (newInput.equals(oldInput)) {
			return;
		}
		differenceCache.clear();
	}

	@Override
	public void notifyChanged(Notification notification) {
	}
	
	private Model source;

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Object[]) {
			if (((Object[]) inputElement)[0] instanceof Model) {
				source = (Model) ((Object[]) inputElement)[0];
				return new Object[] {source};
			}
		}
		return contentAdapter.getElements(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof Model) {
			return ((Model)parentElement).getVersions().toArray();
		}
		if (parentElement instanceof ModelVersion) {
			SymmetricDifference diff = differenceCache.get(parentElement);
			if (diff == null) {
				diff = calculateDifferenceForVersion((ModelVersion)parentElement);
				if (diff == null) {
					return new Object[] {"Initial version"};
				}
			}
			return new Object[] {diff};
		}
		return contentAdapter.getChildren(parentElement);
	}

	private SymmetricDifference calculateDifferenceForVersion(
			ModelVersion currentVersion) {
		
		EList<ModelVersion> versions = currentVersion.getModel().getVersions();
		
		int index = versions.indexOf(currentVersion);
		if (index > 0) {
			try {
				return calculateDifference(versions.get(index-1), currentVersion);
			} catch (EvolutionException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	private SymmetricDifference calculateDifference(final ModelVersion baseVersion, final ModelVersion targetVersion) throws EvolutionException {
		AbstractEvolutionManager evoManager = EvolutionRegistry.getInstance().getEvolutionManager(baseVersion.getModel().getResource());
		SymmetricDifference symmetricDifference = evoManager.evolve(baseVersion.getResource(), targetVersion.getResource());
		return symmetricDifference;
	}

	@Override
	public Object getParent(Object element) {
		return contentAdapter.getParent(element);
	}
	
	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof Model) {
			return true;
		}
		if (element instanceof String) {
			return false;
		}
		if (element instanceof ModelVersion) {
			return true;
		}
		return contentAdapter.hasChildren(element);
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return true;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
	}

	@Override
	public Image getImage(Object element) {
		return labelAdapter.getImage(element);
	}

	@Override
	public String getText(Object element) {
		if (element instanceof Model) {
			return ((Model)element).getFile().getName();
		}
		if (element instanceof String) {
			return (String) element;
		}
		if (element instanceof ModelVersion) {
			ModelVersion version = (ModelVersion) element;
			Date date = new Date(version.getTimestamp());
			DateFormat df = DateFormat.getDateTimeInstance(
					DateFormat.SHORT, DateFormat.SHORT);
			String label = df.format(date);
			
			if (!version.getMessage().isEmpty()) {
				label += " (" + version.getMessage() + ")";
			}
			return label;
		}
		return labelAdapter.getText(element);
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
	}
}

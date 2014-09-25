package de.uni_stuttgart.iste.cowolf.ui.transformation.resultview;

import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Notification;
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
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;

public class ResultViewer extends ContentViewer implements 
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
	public ResultViewer(ComposedAdapterFactory adapterFactory) {
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

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
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
			}
			return new Object[] {((Object[]) inputElement)[1]};
		}
		if (inputElement instanceof Map<?, ?>) {
			return ((Map<?, ?>) inputElement).entrySet().toArray();
		}
		return contentAdapter.getElements(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof Map<?, ?>) {
			return ((Map<?, ?>)parentElement).entrySet().toArray();
		}
		if (parentElement instanceof Entry<?, ?>) {
			return new Object[] {((Entry<?, ?>) parentElement).getValue()};
		}
		return contentAdapter.getChildren(parentElement);
	}

	@Override
	public Object getParent(Object element) {
		return contentAdapter.getParent(element);
	}
	
	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof Map<?, ?>) {
			return true;
		}
		if (element instanceof Entry<?, ?>) {
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
		if (element instanceof Map<?, ?>) {
			return this.source.getFile().getName();
		}
		if (element instanceof Entry<?, ?>) {
			return ((Model)((Entry<?, ?>)element).getKey()).getFile().getName();
		}
		return labelAdapter.getText(element);
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
	}
}

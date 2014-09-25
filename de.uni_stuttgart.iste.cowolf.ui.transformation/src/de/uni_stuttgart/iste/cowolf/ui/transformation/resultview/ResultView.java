package de.uni_stuttgart.iste.cowolf.ui.transformation.resultview;

import java.util.HashMap;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.sidiff.difference.symmetric.SymmetricDifference;
import org.sidiff.difference.symmetric.provider.SymmetricItemProviderAdapterFactory;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;

import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

public class ResultView extends ViewPart {
	public ResultView() {
	}

	ResultViewer treeViewer;
	protected ComposedAdapterFactory adapterFactory;
	private Composite container;

	@Override
	public void createPartControl(Composite parent) {
		container = parent;
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new SymmetricItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		treeViewer = new ResultViewer(adapterFactory);
		treeViewer.createControl(parent);
		treeViewer.setInput(null);
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
	}

	@Override
	public void setFocus() {
		container.setFocus();
	}

	public void setResult(HashMap<Model, SymmetricDifference> results, Model sourceModel) {
		this.treeViewer.setInput(new Object[] {sourceModel, results});
		this.treeViewer.refresh();
	}
}

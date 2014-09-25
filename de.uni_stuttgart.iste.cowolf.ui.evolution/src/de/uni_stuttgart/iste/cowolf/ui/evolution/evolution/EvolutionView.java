package de.uni_stuttgart.iste.cowolf.ui.evolution.evolution;

import java.util.HashMap;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.sidiff.difference.symmetric.provider.SymmetricItemProviderAdapterFactory;

public class EvolutionView extends ViewPart {
	public EvolutionView() {
	}

	EvolutionViewer treeViewer;
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

		treeViewer = new EvolutionViewer(adapterFactory);
		treeViewer.createControl(parent);
		treeViewer.setInput(null);
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
	}

	@Override
	public void setFocus() {
		container.setFocus();
	}

	public void setModel(HashMap<Object, Object> results) {
		this.treeViewer.setInput(new Object[] {results});
		this.treeViewer.refresh();
	}
}

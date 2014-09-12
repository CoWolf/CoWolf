package de.uni_stuttgart.iste.cowolf.model.commonBase.editing;

import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.PasteFromClipboardCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

public class CustomAdapterFactoryEditingDomain extends AdapterFactoryEditingDomain {

	public CustomAdapterFactoryEditingDomain(AdapterFactory pAdapterFactory, CommandStack pCommandStack,
			Map<Resource, Boolean> pResourceToReadOnlyMap) {
		super(pAdapterFactory, pCommandStack, pResourceToReadOnlyMap);
	}

	@Override
	public Command createCommand(Class<? extends Command> pCommandClass, CommandParameter pCommandParameter) {
		if (pCommandClass.equals(PasteFromClipboardCommand.class)) {
			return new CustomPasteFromClipboardCommand(this, pCommandParameter.getOwner(), pCommandParameter.getFeature(),
					pCommandParameter.getIndex(), getOptimizeCopy());
		}
		return super.createCommand(pCommandClass, pCommandParameter);
	}
}

package de.uni_stuttgart.iste.cowolf.model.statechart.emf.presentation;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.PasteFromClipboardCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

public class CustomPasteFromClipboardCommand extends PasteFromClipboardCommand {

	public CustomPasteFromClipboardCommand(EditingDomain domain, Object owner, Object feature, int index, boolean optimize) {
		super(domain, owner, feature, index, optimize);
	}

	@Override
	public void doExecute() {

		// for each element in the clipboard
		for (Iterator<?> iterator = domain.getClipboard().iterator(); iterator.hasNext();) {

			EObject object = (EObject) iterator.next();

			
			// if element extends IDBase and thus has an id
			if (object instanceof IDBaseImpl) {
				
				// set a new ID
				((IDBaseImpl) object).setId(EcoreUtil.generateUUID());
				
			}

		}

		// paste into model
		super.doExecute();
	}

}

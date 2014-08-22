package de.uni_stuttgart.iste.cowolf.model.ctmc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.ctmc.impl.CTMCImpl;
import de.uni_stuttgart.iste.cowolf.model.ctmc.impl.CtmcFactoryImpl;
import de.uni_stuttgart.iste.cowolf.model.ctmc.impl.LabelImpl;
import de.uni_stuttgart.iste.cowolf.model.ctmc.impl.StateImpl;
import de.uni_stuttgart.iste.cowolf.model.ctmc.impl.TransitionImpl;

/**
 * 
 * @author Rene Trefft
 *
 */
public class CTMCModelManager extends AbstractQoSModelManager{

	@Override
	public ModelTypeInfo getModelTypeInfo() {
		
		List<Class<?>> properContents = new ArrayList<Class<?>>();

		// create the allowed EClasses
		properContents.add(CtmcFactoryImpl.class);
		properContents.add(CTMCImpl.class);
		properContents.add(LabelImpl.class);
		properContents.add(StateImpl.class);
		properContents.add(TransitionImpl.class);
		ModelTypeInfo mti = new ModelTypeInfo("CTMC", properContents, CtmcPackage.eNS_URI);
		
		return mti;
	}

	@Override
	public boolean isManaged(final Resource model) {
		if (model == null || model.getContents() == null
				|| model.getContents().size() == 0)
			return false;
		else
			return (model.getContents().get(0) instanceof CTMC);

	}

	@Override
	public String analyze(Resource model, Map<String, Object> parameters,
			IAnalysisListener listener) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

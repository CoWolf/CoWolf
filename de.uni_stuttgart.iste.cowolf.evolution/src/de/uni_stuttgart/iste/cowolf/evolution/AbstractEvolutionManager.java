package de.uni_stuttgart.iste.cowolf.evolution;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.resource.Resource;
import org.sidiff.common.emf.exceptions.InvalidModelException;
import org.sidiff.difference.lifting.facade.LiftingFacade;
import org.sidiff.difference.lifting.settings.LiftingSettings;
import org.sidiff.difference.lifting.settings.LiftingSettings.RecognitionEngineMode;
import org.sidiff.difference.matcher.IMatcher;
import org.sidiff.difference.symmetric.SymmetricDifference;
import org.silift.common.util.access.EMFModelAccessEx;
import org.silift.common.util.emf.Scope;
import org.silift.common.util.exceptions.NoCorrespondencesException;

/**
 * Abstract implementation of the manager that handles evolution of a single
 * model type. Has to be extended by the specific evolution plug-in for a model
 * type.
 *
 * @author Michael M�ller
 * @author Rene Trefft
 */
public abstract class AbstractEvolutionManager {

    /**
     * Default matcher key to use.
     */
    private static final String MATCHER_DEFAULT = EvolutionTypeInfo.MATCHER_NAMEDELEMENT;
    /**
     * Says whether the manager is able to handle a specific model.
     *
     * @param model
     * @return true if it is able to handle model.
     */
    public abstract boolean isManaged(Resource model);

    /**
     * This method handles the evolution between two models of the same class.
     * It returns the differences between two models.
     *
     * @param oldModel
     *            old model for comparison
     * @param newModel
     *            new model for comparison
     * @return differences between two models.
     * @throws EvolutionException
     */
    public SymmetricDifference evolve(Resource oldModel, Resource newModel)
            throws EvolutionException {
        if (!this.isManaged(oldModel) || !this.isManaged(newModel)) {
            // TODO: return value?
            Logger.getLogger("evolution").warning(
                    "Model can not be handled by evolution");
            return null;
        }
        // do required pre-computing work
        String documentType = this.getDocumentType(oldModel);
        LiftingSettings settings = this.getDefaultSettings(documentType,
                oldModel, newModel);
        try {
            return LiftingFacade.liftMeUp(oldModel, newModel, settings);
        } catch (NoCorrespondencesException e) {
            throw new EvolutionException("No correspondences found.", e);
        } catch (InvalidModelException e) {
            throw new EvolutionException("Invalid Model used for evolution.", e);
        }
    }

    public abstract EvolutionTypeInfo getEvolutionTypeInfo();

    /**
     * This method returns default settings for generating differences between
     * models. Can be overwritten by inheriting managers.
     *
     * @param documentType
     * @param modelA
     * @param modelB
     * @return settings object.
     */
    protected LiftingSettings getDefaultSettings(String documentType,
            Resource modelA, Resource modelB) {
        LiftingSettings settings = new LiftingSettings(documentType);
        settings.setRecognitionEngineMode(RecognitionEngineMode.LIFTING_AND_POST_PROCESSING);
        IMatcher matcher = this.getMatcher(this.getEvolutionTypeInfo()
                .getMatcher(), modelA, modelB);
        // use default matcher, if no corrosponding matcher is found.
        if (matcher == null) {
            matcher = this.getMatcher(AbstractEvolutionManager.MATCHER_DEFAULT,
                    modelA, modelB);
        }
        settings.setMatcher(matcher);
        settings.setScope(Scope.RESOURCE);
        return settings;
    }
    /**
     * Get matcher for two models by key.
     *
     * @param matcherKey
     *            Key to use.
     * @param modelA
     *            Resource for model A.
     * @param modelB
     *            Resource for model B.
     * @return
     */
    private IMatcher getMatcher(String matcherKey, Resource modelA,
            Resource modelB) {
        Set<IMatcher> matchers = LiftingFacade.getAvailableMatchers(modelA,
                modelB);
        Map<String, IMatcher> key2matcher = new HashMap<String, IMatcher>();
        for (IMatcher matcher : matchers) {
            key2matcher.put(matcher.getKey(), matcher);
        }

        return key2matcher.get(matcherKey);
    }

    /**
     * @param model
     * @return Document type of resource {@code model}.
     */
    private String getDocumentType(Resource model) {
        return EMFModelAccessEx.getCharacteristicDocumentType(model);
    }

    /**
     * 
     * Saves the differences {@code symmetricDifference} between the models as
     * file in the directory {@code savePath}.
     * 
     * @param symmetricDifference
     *            to save as file.
     * @param savePath
     *            - the directory where the differences should be saved as file.
     * @return the absolute path of the file that contains the differences.
     */
    public String saveEvolveResults(SymmetricDifference symmetricDifference,
            String savePath) {

        Resource modelA = symmetricDifference.getModelA();
        Resource modelB = symmetricDifference.getModelB();

        String documentType = this.getDocumentType(modelA);

        final String fileName = LiftingFacade.generateDifferenceFileName(
                modelA, modelB,
                this.getDefaultSettings(documentType, modelA, modelB));

        LiftingFacade.serializeDifference(symmetricDifference, savePath,
                fileName);

        return savePath + File.separator + fileName + "."
                + LiftingFacade.SYMMETRIC_DIFF_EXT;

    }

}

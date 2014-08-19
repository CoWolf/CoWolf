package de.uni_stuttgart.iste.cowolf.transformation.dtmc_statechart;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.framework.Bundle;

import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;
import de.uni_stuttgart.iste.cowolf.transformation.TransformationTypeInfo;

/**
 * @author Michael Zimmermann
 * @author Michael Müller
 * @TODO: How to get the right transformation rules (simple look up table?) and
 *        needed parameter.
 * @TODO: Decide where traces should be stored (source or target model file or
 *        separate trace file)
 * @TODO: Should the transformation be done in place or not?
 */
public class DTMCStatechartTransformationManager
        extends
            AbstractTransformationManager {
    /**
     * Key for extension point identification.
     */
    private final static String KEY = "dtmc_statechart";

    @Override
    public boolean isManaged(Resource source, Resource target) {
        if ((source == null) || (target == null)) {
            return false;
        }
        if ((source.getContents() == null) || source.getContents().isEmpty()
                || (target.getContents() == null)
                || target.getContents().isEmpty()) {
            return false;
        }

        return (((source.getContents().get(0) instanceof StateMachine) && (target
                .getContents().get(0) instanceof DTMC)) || ((target
                .getContents().get(0) instanceof StateMachine) && (source
                .getContents().get(0) instanceof DTMC)));

    }

    @Override
    public TransformationTypeInfo getTransformationTypeInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected String getKey() {
        return KEY;
    }

    @Override
    protected File getRuleDirectory() {
        Bundle root = Platform
                .getBundle("de.uni_stuttgart.iste.cowolf.transformation.dtmc_statechart.rules");
        URL url = FileLocator.find(root, new Path(File.separator + "rules"
                + File.separator), null);
        File ruleDirectory = null;
        try {
            url = FileLocator.toFileURL(url);
            ruleDirectory = new File(new java.net.URI(url.getProtocol(),
                    url.getPath(), null));

        } catch (IOException | URISyntaxException e1) {
            System.out.println(e1);
            return null;
        }

        return ruleDirectory;
    }

}

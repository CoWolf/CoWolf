package de.uni_stuttgart.iste.cowolf.transformation;

import org.sidiff.difference.symmetric.SemanticChangeSet;

import de.uni_stuttgart.iste.cowolf.transformation.model.Mapping;

/**
 * Helper model class used by {@link AbstractTransformationManager}. Used to
 * link mappings and {@link SemanticChangeSet} together. Implements
 * {@link Comparable} interface to allow sorting by priority.
 * 
 * @author michael
 *
 */
public class MappingSet implements Comparable<MappingSet> {

    private Mapping mapping;
    private SemanticChangeSet changeSet;
    /**
     * @return the mapping
     */
    public Mapping getMapping() {
        return mapping;
    }
    /**
     * @param mapping
     *            the mapping to set
     */
    public void setMapping(Mapping mapping) {
        this.mapping = mapping;
    }
    /**
     * @return the changeSet
     */
    public SemanticChangeSet getChangeSet() {
        return changeSet;
    }
    /**
     * @param changeSet
     *            the changeSet to set
     */
    public void setChangeSet(SemanticChangeSet changeSet) {
        this.changeSet = changeSet;
    }
    @Override
    public int compareTo(MappingSet o) {
        if (this.mapping.getPriority() > o.mapping.getPriority()) {
            return -1;
        } else if (this.mapping.getPriority() < o.mapping.getPriority()) {
            return 1;
        }
        return 0;
    }

}

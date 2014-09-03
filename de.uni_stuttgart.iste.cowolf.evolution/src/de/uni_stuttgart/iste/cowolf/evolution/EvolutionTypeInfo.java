package de.uni_stuttgart.iste.cowolf.evolution;

/**
 * 
 * @author michael
 *
 */
public class EvolutionTypeInfo {

    /**
     * Key for EMFCompare matcher.
     */
    public static final String MATCHER_EMFCOMPARE = "EMFCompare";

    /**
     * Key of the matcher to use for evolution.
     */
    private String matcher;

    /**
     * @return the matcher key
     */
    public String getMatcher() {
        return matcher;
    }

    /**
     * @param matcher
     *            the matcher to set
     */
    public void setMatcher(String matcher) {
        this.matcher = matcher;
    }

}

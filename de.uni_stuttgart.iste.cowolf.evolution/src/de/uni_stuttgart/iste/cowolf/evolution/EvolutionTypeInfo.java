package de.uni_stuttgart.iste.cowolf.evolution;

import org.sidiff.difference.matcher.namedelement.NamedElementMatcher;
import org.sidiff.difference.matcher.uri.URIFragmentMatcher;

/**
 * 
 * @author michael
 *
 */
public class EvolutionTypeInfo {

    /**
     * Key for named element matcher.
     */
    public static final String MATCHER_NAMEDELEMENT = NamedElementMatcher.KEY;
    /**
     * Key for ecore id matcher.
     */
    public static final String MATCHER_ECOREID = "EcoreIDMatcher";
    /**
     * Key for UUID matcher.
     */
    public static final String MATCHER_UUID = "UUIDMatcher";
    /**
     * Key for URI matcher.
     */
    public static final String MATCHER_URI = URIFragmentMatcher.KEY;
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

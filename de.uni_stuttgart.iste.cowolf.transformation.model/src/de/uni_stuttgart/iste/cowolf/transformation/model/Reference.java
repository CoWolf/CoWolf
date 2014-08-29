package de.uni_stuttgart.iste.cowolf.transformation.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Reference {
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "attribute", required = true)
    protected String attribute;
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the attribute
     */
    public String getAttribute() {
        return attribute;
    }
    /**
     * @param attribute
     *            the attribute to set
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

}

package de.uni_stuttgart.iste.cowolf.transformation;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import de.uni_stuttgart.iste.cowolf.transformation.mapping.xml.Mapping;

public class TransformationTypeInfo {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Mapping.class);
        Unmarshaller m = context.createUnmarshaller();
        Mapping map = (Mapping) m.unmarshal(new File("schema/Example.xml"));
        System.out.println(map.getDifference().size());
    }
}

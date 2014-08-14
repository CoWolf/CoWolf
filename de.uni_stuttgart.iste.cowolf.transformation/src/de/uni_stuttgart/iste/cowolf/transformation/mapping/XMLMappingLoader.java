package de.uni_stuttgart.iste.cowolf.transformation.mapping;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import de.uni_stuttgart.iste.cowolf.transformation.mapping.xml.Mapping;

public class XMLMappingLoader {

    private XMLMappingLoader() {

    }

    public static Mapping loadMapping(InputStream stream) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Mapping.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (Mapping) unmarshaller.unmarshal(stream);
    }
}

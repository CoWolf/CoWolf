package de.uni_stuttgart.iste.cowolf.transformation.mapping;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import de.uni_stuttgart.iste.cowolf.transformation.mapping.xml.Mappings;

public class XMLMappingLoader {

    private XMLMappingLoader() {

    }

    public static Mappings loadMapping(InputStream stream) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Mappings.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (Mappings) unmarshaller.unmarshal(stream);
    }
}

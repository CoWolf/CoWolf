package de.uni_stuttgart.iste.cowolf.transformation.model.util;

import java.io.File;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import de.uni_stuttgart.iste.cowolf.transformation.model.Mappings;

public class XMLMappingLoader {

	private XMLMappingLoader() {

	}

	/**
	 * 
	 * @return
	 * @throws JAXBException
	 */
	private static Unmarshaller createMappingsUnmarshaller()
			throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Mappings.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		return unmarshaller;
	}

	public static void storeMappings(Mappings mappings,
			File fileToStore) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Mappings.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.marshal(mappings, fileToStore);
	}

	/**
	 * 
	 * @param stream
	 * @return
	 * @throws JAXBException
	 */
	public static Mappings loadMapping(InputStream stream) throws JAXBException {
		return (Mappings) (createMappingsUnmarshaller().unmarshal(stream));
	}

	/**
	 * 
	 * @param file
	 * @return
	 * @throws JAXBException
	 */
	public static Mappings loadMapping(File file) throws JAXBException {
		return (Mappings) (createMappingsUnmarshaller().unmarshal(file));
	}

}

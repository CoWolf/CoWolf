package de.uni_stuttgart.iste.cowolf.model.lqn.analysis;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import de.uni_stuttgart.iste.cowolf.model.AnalysisResultUtil;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN;

public class LQNAnalyzeFilesWriter {
	
	private final static Logger LOGGER = LoggerFactory
			.getLogger(LQNAnalyzeFilesWriter.class);
	
	private final static Map<String,LQNSolverFileGenerator> lqnFilesGenerator;
	private static final String RESULTS_FILE_EXTENSION = "xml";
	private static final String CRLF = "\r\n";
	
	static{
		lqnFilesGenerator = new HashMap<String, LQNSolverFileGenerator>();
		lqnFilesGenerator.put("serviceTime", new LQNSolverFileStandardGenerator());
	}
	
	public static void writeTempFileFromGenerator(Resource model, String pathToOutputLQNFile, Map<String, Object> parameters)
			throws Exception {
		LQNSolverFileGenerator generator = lqnFilesGenerator.get((parameters.get("typeOfAnalysis")));
		OutputStreamWriter out = new FileWriter(pathToOutputLQNFile);
		out.write(generator.doGenerateLQNSolverFile(
				(LQN) model.getContents().get(0), parameters).toString());
		out.flush();
		out.close();
	}

	public static IFile writeToResultFile(Resource model, List<String> results) {
		IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(model.getURI().toPlatformString(true)));

		IFile resultFile = ResourcesPlugin
				.getWorkspace()
				.getRoot()
				.getFile(modelFile.getFullPath().addFileExtension(RESULTS_FILE_EXTENSION));
		OutputStreamWriter out = null;
		try {
			out = new FileWriter(resultFile.getLocation().toOSString());

			StringBuilder sb = new StringBuilder();

			for (String line : results) {
				sb.append(line).append(CRLF);
			}

			out.write(sb.toString());
			
			out.flush();
			out.close();
			
			return resultFile;

		} catch (FileNotFoundException e) {
			LOGGER.error("", e); 
		} catch (IOException e) {
			LOGGER.error("", e); 
		} finally {
			try {
				out.flush();
				out.close();
			} catch (Exception e2) {
				LOGGER.error("", e2); 
			}
		}
		return null;
	}
	
	public static IFile generateHTMLFile(Resource model, String resultOut) {
		ByteArrayOutputStream out = null;
		
		IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(model.getURI().toPlatformString(true)));
		IFile resultFile = ResourcesPlugin.getWorkspace().getRoot().getFile(modelFile.getFullPath().addFileExtension("analysis.html"));
		
		try {
			out = new ByteArrayOutputStream();
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			URL xsltURL = new URL("platform:/plugin/de.uni_stuttgart.iste.cowolf.model.lqn/res/out.xslt");
			
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			
			InputSource ss = new InputSource(new ByteArrayInputStream(resultOut.getBytes()));
			Document doc = builder.parse(ss);

            TransformerFactory tFactory = TransformerFactory.newInstance();
            StreamSource stylesource = new StreamSource(xsltURL.openConnection().getInputStream());
            Transformer transformer = tFactory.newTransformer(stylesource);

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(out);
            transformer.transform(source, result);
            
            out.flush();
            out.close();
		} catch (TransformerException e) {
			LOGGER.error("", e);
		} catch (SAXException e) {
			LOGGER.error("", e);
		} catch (IOException e) {
			LOGGER.error("", e);
		} catch (ParserConfigurationException e) {
			LOGGER.error("", e);
		}
			
        
			try {
        	String html = AnalysisResultUtil.encapsulateHTML(out.toString());
			
			ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes());

			if (resultFile.exists()) {
				resultFile.setContents(in, true, false, null);
			} else {
				resultFile.create(in, true, null);
			}

		} catch (CoreException e) {
			LOGGER.error("Error saving result to html. Is result html file from previous run still open?", e);
			return null;
		}
		
        return resultFile;
	}
}

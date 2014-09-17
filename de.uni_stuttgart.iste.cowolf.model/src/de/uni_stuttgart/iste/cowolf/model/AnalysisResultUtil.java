package de.uni_stuttgart.iste.cowolf.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class AnalysisResultUtil {

	public static String encapsulateHTML(String body) {
		StringBuilder sb = new StringBuilder();
		sb.append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n")
		  .append("<html lang=en>\n")
		  .append("<head>\n")
		  .append("    <meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\n\n");
		
		
		sb.append("    <style rel=\"stylesheet\">\n");
		try {
			URL url = new URL("platform:/plugin/de.uni_stuttgart.iste.cowolf.model/res/sortable-theme.css");
			
			InputStream inputStream = url.openConnection().getInputStream();
		    BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
		    String inputLine;
		 
		    while ((inputLine = in.readLine()) != null) {
		        sb.append("        ").append(inputLine);
		    }
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sb.append("    </style>\n");
		
		sb.append("    <script type=\"text/javascript\"> \n");
		try {
			URL url = new URL("platform:/plugin/de.uni_stuttgart.iste.cowolf.model/res/sortable.min.js");
			
			InputStream inputStream = url.openConnection().getInputStream();
		    BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
		    String inputLine;
		 
		    while ((inputLine = in.readLine()) != null) {
		        sb.append("        ").append(inputLine);
		    }
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sb.append("    </script>\n");
		
		sb.append("</head>\n")
		  .append("<body>\n");
		
		sb.append(body.replace("<table", "<table data-sortable "));
		
		sb.append("\n</body>\n")
		  .append("</html>");
		
		return sb.toString();
	}
}

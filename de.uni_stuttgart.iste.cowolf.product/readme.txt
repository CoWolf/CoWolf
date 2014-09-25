*** This only applies if you export the product with Eclipse ***

After exporting the product the bundles 

org.apache.batik.util_1.6.0.v201011041432.jar
org.apache.batik.util.gui_1.6.0.v201011041432.jar
org.apache.batik.css_1.6.0.v201011041432.jar

from the Eclipse plugins dir of your Eclipse installation must be copied 
to <export-dir>/plugins and the following lines added to the file
<export-dir>/configuration/org.eclipse.equinox.simpleconfigurator/bundles.info

org.apache.batik.util,1.6.0.v201011041432,plugins/org.apache.batik.util_1.6.0.v201011041432.jar,4,false
org.apache.batik.util.gui,1.6.0.v201011041432,plugins/org.apache.batik.util.gui_1.6.0.v201011041432.jar,4,false
org.apache.batik.css,1.6.0.v201011041432,plugins/org.apache.batik.css_1.6.0.v201011041432.jar,4,false

Note, there must be an empty line at the end.
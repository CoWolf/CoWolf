package de.uni_stuttgart.iste.cowolf.transformation.component_diagram_fault_tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.sidiff.difference.symmetric.AddObject;
import org.sidiff.difference.symmetric.AddReference;
import org.sidiff.difference.symmetric.Change;

public class ComponentDiagramFaultTreeTransformationHelper {

	public static class ChangesFiller {

		HashSet<String> newComponentTypes, newPortTypes, newComponentInstances,
				newPortInstances, newSubComponentInstances, newConnectors;

		private Map<String, Set<String>> changeSetRules;

		private Map<String, Set<String>> changeRules;

		public ChangesFiller(HashSet<String> newComponentTypes,
				HashSet<String> newPortTypes, HashSet<String> newComponentInstances,
				HashSet<String> newPortInstances,
				HashSet<String> newSubComponentInstances,
				HashSet<String> newConnectors) {
			super();
			this.newComponentTypes = newComponentTypes;
			this.newPortTypes = newPortTypes;
			this.newComponentInstances = newComponentInstances;
			this.newPortInstances = newPortInstances;
			this.newSubComponentInstances = newSubComponentInstances;
			this.newConnectors = newConnectors;

			init();

		}

		void init() {
			initChangeSetRules();
			initChangeRules();
		}

		private void initChangeSetRules() {
			changeSetRules = new HashMap<String, Set<String>>();

			// New component types
			changeSetRules.put("CREATE_SoftwareComponent_IN_Architecture_(component)",this.newComponentTypes);
			changeSetRules.put("CREATE_HardwareComponent_IN_Architecture_(component)",this.newComponentTypes);
			changeSetRules.put("CREATE_ElectronicDevice_IN_Architecture_(component)",this.newComponentTypes);
			changeSetRules.put("CREATE_MechanicalDevice_IN_Architecture_(component)",this.newComponentTypes);

			// New port types
			changeSetRules.put("CREATE_PortType_IN_Architecture_(port_type)",this.newPortTypes);

			// New component instances
			changeSetRules.put("CREATE_ComponentInstance_IN_Architecture_(instances)",this.newComponentInstances);

			// New port instances in component instance
			changeSetRules.put("CREATE_PortInstance_IN_ComponentInstance_(inPorts)",this.newPortInstances);
			changeSetRules.put("CREATE_PortInstance_IN_ComponentInstance_(outPorts)",this.newPortInstances);

			// New subcomponent instances
//			changeSetRules.put("CREATE_PortInstance_IN_ComponentInstance_(inPorts)",this.newPortInstances);

			// New connectors
			changeSetRules.put("CREATE_Connector_IN_Architecture_(connectors)",this.newConnectors);
		}

		private void initChangeRules() {
			changeRules = new HashMap<String, Set<String>>();

			/**
			 * New object changes
			 */
			
			// New component types
			changeRules.put("SoftwareComponenImplt",this.newComponentTypes);
			changeRules.put("HardwareComponentImpl",this.newComponentTypes);
			changeRules.put("ElectronicDeviceImpl",this.newComponentTypes);
			changeRules.put("MechanicalDeviceImpl",this.newComponentTypes);

			// New port types
			changeRules.put("PortTypeImpl",this.newPortTypes);

			// New component instances
			changeRules.put("ComponentInstanceImpl",this.newComponentInstances);

			// New port instances in component instance
			changeRules.put("PortInstanceImpl",this.newPortInstances);

			// New subcomponent instances
//			changeRules.put("CREATE_PortInstance_IN_ComponentInstance_(inPorts)",this.newPortInstances);

			// New connectors
			changeRules.put("ConnectorImpl",this.newConnectors);
			
			/**
			 * New references changes
			 */
			
			changeRules.put("connect", this.newPortInstances);
			changeRules.put("port", this.newConnectors);
			changeRules.put("connectors", this.newConnectors);
			
		}

		public void add(String changeName, Change change) {
			String objectName = getObjectName(change);
			if (objectName != null) {
				Set<String> list = changeSetRules.get(changeName);
				if (list != null) {
					list.add(objectName);
				} else {
					System.out.println(String.format(
							"ChangeSet %s not yet implemented", changeName));
				}
			}
		}

		public void add(Change change) {
			String objectName = getObjectName(change);
			if (objectName != null && !objectName.equals("")) {
				String objectType = getObjectType(change); 
				Set<String> list = changeRules.get(objectType);
				if (list != null) {
					list.add(objectName);
				} else {
					System.out.println(String.format(
							"Change for object type %s not yet implemented", objectType));
				}
			}
		}

		protected String getObjectName(Change change) {
			return ChangeHandlerFactory.getChangeHandler(change).getObjectName();
		}

		protected String getObjectType(Change change) {
			return ChangeHandlerFactory.getChangeHandler(change).getObjectType();
		}
	}

	public static class ChangeHandlerFactory {

		private static final String PCKG = "de.uni_stuttgart.iste.cowolf.transformation.component_diagram_fault_tree.ComponentDiagramFaultTreeTransformationHelper$ChangeHandlerFactory$";

		public static ChangeHandler getChangeHandler(Change change) {
			ChangeHandler changeHandler = null;
			String changeHandlerName = PCKG+change.eClass().getName() + "Handler";
			try {
				System.out.println(changeHandlerName);
				changeHandler = (ChangeHandler) Class.forName(changeHandlerName).getConstructors()[0].newInstance(null,change);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return changeHandler;
		}

		public abstract class ChangeHandler {
			
			protected Change change;
			
			public abstract String getObjectName();
			
			public abstract String getObjectType();
			
			public ChangeHandler(Change change){
				this.change = change;
			}
		}

		public class AddReferenceHandler extends ChangeHandler {

			public AddReferenceHandler(Change change) {
				super(change);
			}

			@Override
			public String getObjectName() {
				Object o = ((AddReference) change).getSrc();
				String name = "";
				for(java.lang.reflect.Method m:o.getClass().getMethods()){
					if (m.getName().equals("getName")) {
						try {
							name = (String) m.invoke(o, null);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
				return name;
			}

			@Override
			public String getObjectType() {
				return ((AddReference) change).getType().getName();
			}
		}

		public class RemoveReferenceHandler extends ChangeHandler {

			public RemoveReferenceHandler(Change change) {
				super(change);
			}

			@Override
			public String getObjectName() {
				return null;
			}

			@Override
			public String getObjectType() {
				// TODO Auto-generated method stub
				return null;
			}
		}

		public class AddObjectHandler extends ChangeHandler {

			public AddObjectHandler(Change change) {
				super(change);
			}

			@Override
			public String getObjectName() {
				try{
					return ((AddObject) change).getObj().eGet(((AddObject) change).getObj().eClass().getEStructuralFeature("name")).toString();
				}catch(Exception e){
					return "";
				}
			}

			@Override
			public String getObjectType() {
				return ((AddObject) change).getObj().getClass().getSimpleName();
			}
		}

		public class RemoveObjectHandler extends ChangeHandler {

			public RemoveObjectHandler(Change change) {
				super(change);
			}

			@Override
			public String getObjectName() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getObjectType() {
				// TODO Auto-generated method stub
				return null;
			}
		}
		public class AttributeValueChangeHandler extends ChangeHandler {

			public AttributeValueChangeHandler(Change change) {
				super(change);
			}

			@Override
			public String getObjectName() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getObjectType() {
				// TODO Auto-generated method stub
				return null;
			}
		}
	}
}
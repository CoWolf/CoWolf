package de.unistuttgart.ensure.transformations.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sidiff.difference.symmetric.AddObject;
import org.sidiff.difference.symmetric.Change;

public class ComponentDiagramFaultTreeTransformationHelper {

	public static class ChangesFiller {

		List<String> newComponentTypes, newPortTypes, newComponentInstances,
				newPortInstances, newSubComponentInstances, newConnectors;

		private Map<String, List<String>> changeSetRules;

		private Map<String, List<String>> changeRules;

		public ChangesFiller(List<String> newComponentTypes,
				List<String> newPortTypes, List<String> newComponentInstances,
				List<String> newPortInstances,
				List<String> newSubComponentInstances,
				List<String> newConnectors) {
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
			changeSetRules = new HashMap<String, List<String>>();

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
			changeRules = new HashMap<String, List<String>>();
			
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
		}

		public void add(String changeName, Change change) {
			String objectName = getObjectName(change);
			List<String> list = changeSetRules.get(changeName);
			if (list != null) {
				list.add(objectName);
			} else {
				System.out.println(String.format(
						"ChangeSet %s not yet implemented", changeName));
			}
		}

		public void add(Change change) {
			String objectName = getObjectName(change);
			String objectType = getObjectType(change); 
			List<String> list = changeRules.get(objectType);
			if (list != null) {
				list.add(objectName);
			} else {
				System.out.println(String.format(
						"Change for object type %s not yet implemented", objectType));
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

		private static final String PCKG = "de.unistuttgart.ensure.transformations.util.ComponentDiagramFaultTreeTransformationHelper$ChangeHandlerFactory$";

		public static ChangeHandler getChangeHandler(Change change) {
			ChangeHandler changeHandler = null;
			String changeHandlerName = PCKG+change.eClass().getName() + "Handler";
			try {
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
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getObjectType() {
				// TODO Auto-generated method stub
				return null;
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
				return ((AddObject) change).getObj().eGet(((AddObject) change).getObj().eClass().getEStructuralFeature("name")).toString();
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
	}
}
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
			//TODO Add single rules, which are not into the ChangeSets
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
			//TODO Implement
		}

		protected String getObjectName(Change change) {
			return ChangeNamerFactory.getChangeNamer(change).getName();
		}
	}

	public static class ChangeNamerFactory {

		private static Map<String, ChangeNamer> poolChangeNamers = new HashMap<String, ChangeNamer>();
		
		private static final String PCKG = "de.unistuttgart.ensure.transformations.util.ComponentDiagramFaultTreeTransformationHelper$ChangeNamerFactory$";

		public static ChangeNamer getChangeNamer(Change change) {
			ChangeNamer changeNamer = null;
			String changeNamerName = PCKG+change.eClass().getName() + "Namer";
			try {
				if (poolChangeNamers.get(changeNamerName) != null) {
					return poolChangeNamers.get(changeNamerName);
				}
				changeNamer = (ChangeNamer) Class.forName(changeNamerName).getConstructors()[0].newInstance(null,change);
				poolChangeNamers.put(changeNamerName, changeNamer);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return changeNamer;
		}

		public abstract class ChangeNamer {
			
			protected Change change;
			
			public abstract String getName();
			
			public ChangeNamer(Change change){
				this.change = change;
			}
		}

		public class AddReferenceNamer extends ChangeNamer {

			public AddReferenceNamer(Change change) {
				super(change);
			}

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
		}

		public class RemoveReferenceNamer extends ChangeNamer {

			public RemoveReferenceNamer(Change change) {
				super(change);
			}

			@Override
			public String getName() {
				return null;
			}
		}

		public class AddObjectNamer extends ChangeNamer {

			public AddObjectNamer(Change change) {
				super(change);
			}

			@Override
			public String getName() {
				return ((AddObject) change).getObj().eGet(((AddObject) change).getObj().eClass().getEStructuralFeature("name")).toString();
			}
		}

		public class RemoveObjectNamer extends ChangeNamer {

			public RemoveObjectNamer(Change change) {
				super(change);
			}

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
		}
	}
}
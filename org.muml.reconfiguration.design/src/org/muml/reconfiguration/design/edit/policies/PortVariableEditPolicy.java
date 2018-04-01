package org.muml.reconfiguration.design.edit.policies;
//
//import org.eclipse.emf.ecore.EObject;
//import org.muml.pim.common.edit.policies.ports.PortTypeEditPolicy;
//import org.muml.pim.component.Port;
//import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
//
//public class PortVariableEditPolicy extends PortTypeEditPolicy {
//	@Override
//	protected Port getPort() {
//		EObject element = getSemanticElement();
//		if (element != null) {
//			return (Port) element
//					.eGet(ComponentstorypatternPackage.Literals.PORT_VARIABLE__PORT_TYPE);
//		}
//		return null;
//	}
//
//}

package org.muml.pim.actionlanguage.xtext.naming;

import org.eclipse.xtext.naming.QualifiedName;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;
import org.muml.pim.valuetype.TimeValue;

public class CustomNameProvider extends DeclarativeSimpleNameProvider {
	
	public QualifiedName qualifiedName(TimeValue timeValue) {
		if (timeValue.eContainer() instanceof ConnectorQualityOfServiceAssumptions) {
			ConnectorQualityOfServiceAssumptions qos = (ConnectorQualityOfServiceAssumptions) timeValue.eContainer();
			if (qos.getMaxMessageDelay() == timeValue) {
				return QualifiedName.create("maxMsgDelay");
			}
		}
		return null;
	}

}

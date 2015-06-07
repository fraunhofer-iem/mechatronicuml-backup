package de.uni_paderborn.fujaba.muml.naming;

import org.eclipse.xtext.naming.QualifiedName;

import de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

public class CustomNameProvider extends DeclarativeSimpleNameProvider {
	
	public QualifiedName qualifiedName(TimeValue timeValue) {
		if (timeValue.eContainer() instanceof ConnectorQualityOfServiceAssumptions) {
			ConnectorQualityOfServiceAssumptions qos = (ConnectorQualityOfServiceAssumptions) timeValue.eContainer();
			if (qos.getMaxMessageDelay() == timeValue) {
				return QualifiedName.create("maxMessageDelay");
			} else if (qos.getMinMessageDelay() == timeValue) {
				return QualifiedName.create("minMessageDelay");
			}
		}
		return null;
	}

}

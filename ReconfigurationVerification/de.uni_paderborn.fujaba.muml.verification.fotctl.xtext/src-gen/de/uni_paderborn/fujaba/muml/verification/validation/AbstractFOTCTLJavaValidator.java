package de.uni_paderborn.fujaba.muml.verification.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractFOTCTLJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/verification/fotctl/0.1.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/verification/tctl/0.1.0"));
		return result;
	}

}
